// === 1. DATOS MAESTROS (Tus 6 secciones exactas) ===
const categorias = [
    { id: 'bebidas', nombre: 'BEBIDAS' },
    { id: 'menus', nombre: 'MENÚS' },
    { id: 'complementos', nombre: 'COMPLEMENTOS' },
    { id: 'king_junior', nombre: 'KING JUNIOR' },
    { id: 'postres', nombre: 'POSTRES' },
    { id: 'salsas', nombre: 'SALSAS' }
];

// === 2. GENERAR MENÚ LATERAL (Automático) ===
function generarMenuLateral() {
    const lista = document.getElementById('lista-menu-lateral');
    if (lista) {
        lista.innerHTML = ''; 
        categorias.forEach(cat => {
            const li = document.createElement('li');
            // Al hacer click, cargamos la sección y cerramos el menú
            li.innerHTML = `<a href="#" onclick="menuClick('${cat.id}')">${cat.nombre}</a>`;
            lista.appendChild(li);
        });
    }
}

// === 3. CONTROL DE NAVEGACIÓN ===
function menuClick(idCategoria) {
    cargarSeccion(idCategoria);
    cerrarMenu();
}

async function cargarHeader() {
    try {
        const respuesta = await fetch('componentes/header.html');
        if (respuesta.ok) {
            const html = await respuesta.text();
            document.getElementById('header-container').innerHTML = html;
            activarBotonMenu(); 
        }
    } catch (error) {
        console.error("Error cargando header:", error);
    }
}

// === 4. ACTIVAR BOTONES DEL HEADER ===
function activarBotonMenu() {
    const btnMenu = document.getElementById('menu-toggle');
    const sidebar = document.getElementById('sidebar-menu');
    const overlay = document.getElementById('overlay');
    const btnCerrar = document.getElementById('close-menu');

    // Función abrir
    if (btnMenu) {
        btnMenu.addEventListener('click', () => {
            sidebar.classList.add('active');
            if (overlay) overlay.classList.add('active');
        });
    }

    // Función cerrar
    const cerrar = () => {
        if (sidebar) sidebar.classList.remove('active');
        if (overlay) overlay.classList.remove('active');
    };

    if (btnCerrar) btnCerrar.addEventListener('click', cerrar);
    if (overlay) overlay.addEventListener('click', cerrar);
}

function cerrarMenu() {
    const sidebar = document.getElementById('sidebar-menu');
    const overlay = document.getElementById('overlay');
    if (sidebar) sidebar.classList.remove('active');
    if (overlay) overlay.classList.remove('active');
}

// === 5. CARGAR SECCIONES (Rutas actualizadas) ===
async function cargarSeccion(categoria) {
    // Mapa exacto según tu captura de pantalla de VS Code
    const archivos = {
        'bebidas': 'secciones/bebidas/bebidas.html',
        'menus': 'secciones/menus/menus.html',           // <--- CORREGIDO AQUÍ
        'complementos': 'secciones/complementos/complementos.html',
        'king_junior': 'secciones/kingJunior/kingJunior.html', // <--- OJO a la mayúscula 'J'
        'postres': 'secciones/postres/postres.html',
        'salsas': 'secciones/salsas/salsas.html'
    };

    const archivo = archivos[categoria];

    if (archivo) {
        try {
            const resp = await fetch(archivo);
            if (resp.ok) {
                const html = await resp.text();
                
                // Ocultar menú principal
                const grid = document.querySelector('.grid-categorias');
                const titulo = document.querySelector('.titulo-seccion');
                if(grid) grid.style.display = 'none';
                if(titulo) titulo.style.display = 'none';

                // Mostrar detalle
                const detalle = document.getElementById('detalle-productos');
                detalle.innerHTML = html;
                
                // Añadir botón volver al final
                detalle.innerHTML += `
                    <div style="text-align:center; margin: 40px 0;">
                        <button onclick="location.reload()" class="btn-register" style="padding: 12px 24px; font-size: 1rem;">
                            ⬅ Volver al Menú Principal
                        </button>
                    </div>`;
                
                detalle.style.display = 'block';
            } else {
                console.error("Archivo no encontrado:", archivo);
                alert("No encuentro el archivo: " + archivo);
            }
        } catch (e) { console.error(e); }
    }
}

// INICIAR
document.addEventListener('DOMContentLoaded', () => {
    cargarHeader();
    generarMenuLateral();
});