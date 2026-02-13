// === 1. DATOS MAESTROS (Tus 6 secciones exactas) ===
const categorias = [
    { id: 'bebidas', nombre: 'BEBIDAS' },
    { id: 'menus', nombre: 'MENÚS' },
    { id: 'complementos', nombre: 'COMPLEMENTOS' },
    { id: 'king_junior', nombre: 'KING JUNIOR' },
    { id: 'postres', nombre: 'POSTRES' },
    { id: 'salsas', nombre: 'SALSAS' }
];
// ==========================================
// 1. FUNCIONES GLOBALES (Tienen que estar fuera de todo)
// ==========================================

// --- Variables para el Modal ---
let precioBaseProducto = 0;
let nombreProducto = "";

function agregarProductoFijo(nombre, precio) {
    console.log("Añadiendo producto fijo:", nombre); // Chivato en consola
    alert(`✅ ¡Añadido al pedido! \n${nombre} - ${precio.toFixed(2)} €`);
}
// --- Función para abrir el modal ---
function abrirModal(nombre, precio, tipo = 'general') {
    console.log("Abriendo modal para:", nombre); 
    
    const modal = document.getElementById('modal-producto');
    if (!modal) return;

    // 1. Guardamos datos básicos
    nombreProducto = nombre;
    precioBaseProducto = precio;
    document.getElementById('modal-titulo').innerText = nombre;

    // 2. Reseteamos TODAS las opciones
    document.querySelectorAll('input[type="radio"]').forEach(r => r.checked = false);
    
    // 3. Marcamos las opciones por defecto (Tamaño, Cantidad, Patatas, unidades)
    const radioMediano = document.querySelector('input[name="tamano"][value="Mediano"]');
    if(radioMediano) radioMediano.checked = true;
    
    const radioCarne1 = document.querySelector('input[name="cantidad_carne"][value="1"]');
    if(radioCarne1) radioCarne1.checked = true;

    const radioClasicas = document.querySelector('input[name="patatas"][value="Clasicas"]');
    if(radioClasicas) radioClasicas.checked = true;

    const defUnidades = document.querySelector('input[name="unidades"][value="6"]');
    if(defUnidades) defUnidades.checked = true; // Por defecto 6 unidades

    const defSoloTamano = document.querySelector('input[name="solo_tamano"][value="Pequeño"]');
    if(defSoloTamano) defSoloTamano.checked = true;

    const defHelado = document.querySelector('input[name="sabor_helado"][value="Oreo"]');
    if(defHelado) defHelado.checked = true;

    const defSirope = document.querySelector('input[name="sabor_sirope"][value="Chocolate"]');
    if(defSirope) defSirope.checked = true;

    const defpostre = document.querySelector('input[name="postre-kj"][value="Actimel"]');
    if(defpostre) defpostre.checked = true;

    const defPrinJunior = document.querySelector('input[name="principal_junior"][value="Hamburguesa"]');
    if(defPrinJunior) defPrinJunior.checked = true;

    const defAcomJunior = document.querySelector('input[name="acompanante_junior"][value="Patatas"]');
    if(defAcomJunior) defAcomJunior.checked = true;

    if(document.getElementById('select-bebida')) {
        document.getElementById('select-bebida').selectedIndex = 0;
    }
    if(document.getElementById('select-bebida-junior')) document.getElementById('select-bebida-junior').selectedIndex = 0;
    if(document.getElementById('select-postre-junior')) document.getElementById('select-postre-junior').selectedIndex = 0;

    //Bloque helados
    const bSaboresFusion = document.getElementById('bloque-sabores-fusion');
    // Bloques Junior
    const bPrinJunior = document.getElementById('bloque-principal-junior');
    const bAcomJunior = document.getElementById('bloque-acompanante-junior');
    const bBebidaJunior = document.getElementById('bloque-bebida-junior');
    const bPostreJunior = document.getElementById('bloque-postre-junior');
    // Bloque tamaño
    const bSoloTamano = document.getElementById('bloque-solo-tamano');
    //Bloque unidades
    const bUnidades = document.getElementById('bloque-unidades');
    //bloque menu
    const bTamano = document.getElementById('bloque-tamano');
    const bTipoCarne = document.getElementById('bloque-tipo-carne');
    const bCantCarne = document.getElementById('bloque-cantidad-carne');
    const bPatatas = document.getElementById('bloque-patatas');
    const bBebida = document.getElementById('bloque-bebida');
    const bGeneral = document.getElementById('bloque-general');
    //bloque siropes
    const bSiropes = document.getElementById('bloque-siropes');

    // === LÓGICA DE VISIBILIDAD ===
            const radioPollo = document.querySelector('input[name="tipo_carne"][value="Pollo"]');
        const radioTernera = document.querySelector('input[name="tipo_carne"][value="Ternera"]');

        if (tipo === 'solo_pollo') {
            bTipoCarne.style.display = 'none';
            if(radioPollo) radioPollo.checked = true;
        } else {
            bTipoCarne.style.display = 'block';
            if(radioTernera) radioTernera.checked = true;
        }

    if (tipo === 'siropes') {
        bSiropes.style.display = 'block';

        bSaboresFusion.style.display = 'none';
        bSoloTamano.style.display = 'none';
        bTamano.style.display = 'none';         
        bTipoCarne.style.display = 'none';
        bCantCarne.style.display = 'none';
        bPatatas.style.display = 'none';
        bBebida.style.display = 'none';
        bPostreJunior.style.display = 'none';
    }

    if (tipo === 'king_fusion') {
        bSaboresFusion.style.display = 'block';

        bSoloTamano.style.display = 'none';
        bTamano.style.display = 'none';         
        bTipoCarne.style.display = 'none';
        bCantCarne.style.display = 'none';
        bPatatas.style.display = 'none';
        bBebida.style.display = 'none';
    }
    if (tipo === 'solo_tamano') {
        bSoloTamano.style.display = 'block';

        bUnidades.style.display = 'none';
        bTamano.style.display = 'none';         
        bTipoCarne.style.display = 'none';
        bCantCarne.style.display = 'none';
        bPatatas.style.display = 'none';
        bBebida.style.display = 'none';
    }
    if (tipo === 'complemento') {
        bUnidades.style.display = 'block';      
        
        bTamano.style.display = 'none';         
        bTipoCarne.style.display = 'none';
        bCantCarne.style.display = 'none';
        bPatatas.style.display = 'none';
        bBebida.style.display = 'none';
        bSoloTamano.style.display = 'none';
    
    } 
    if (tipo === 'general') {
        bUnidades.style.display = 'none'; 
        bSoloTamano.style.display = 'none';    

        bTamano.style.display = 'block';        
        bCantCarne.style.display = 'block';
        bPatatas.style.display = 'block';
        bBebida.style.display = 'block';
    }
                // Sub-caso: ¿Es pollo o ternera?

    
    if (tipo === 'postres') {
        bPostreJunior.style.display = 'block';

        bSiropes.style.display = 'none';
        bSaboresFusion.style.display = 'none';
        bSoloTamano.style.display = 'none';
        bTamano.style.display = 'none';         
        bTipoCarne.style.display = 'none';
        bCantCarne.style.display = 'none';
        bPatatas.style.display = 'none';
        bBebida.style.display = 'none';
        bPrinJunior.style.display = 'none';
        bAcomJunior.style.display = 'none';
        bBebidaJunior.style.display = 'none';

    }
    if (tipo === 'king_junior') {
        bPrinJunior.style.display = 'block';
        bAcomJunior.style.display = 'block';
        bBebidaJunior.style.display = 'block';
        bPostreJunior.style.display = 'block';
        bTamano.style.display = 'none';         
        bTipoCarne.style.display = 'none';
        bCantCarne.style.display = 'none';
        bPatatas.style.display = 'none';
        bBebida.style.display = 'none';
        bSoloTamano.style.display = 'none';
    } 

    calcularTotal();
    modal.classList.add('active');
}

// --- Función cerrar modal ---
function cerrarModal() {
    const modal = document.getElementById('modal-producto');
    if(modal) modal.classList.remove('active');
}

// --- Función calcular precio ---
function calcularTotal() {
    let precioFinal = precioBaseProducto;
    const bSoloTamano = document.getElementById('bloque-solo-tamano');
    const bUnidades = document.getElementById('bloque-unidades');

    if (bSoloTamano && bSoloTamano.style.display !== 'none') {
        const tamano = document.querySelector('input[name="solo_tamano"]:checked')?.value;
        // El precio base es el Pequeño
        if (tamano === 'Mediano') precioFinal += 0.50;
        if (tamano === 'Grande') precioFinal += 1.00;
        if (tamano === 'Gigante') precioFinal += 1.50;
    }
    // 1. EXTRA POR UNIDADES (Solo si el bloque es visible)
    const bloqueUnidades = document.getElementById('bloque-unidades');
    if (bloqueUnidades && bloqueUnidades.style.display !== 'none') {
        const unidades = document.querySelector('input[name="unidades"]:checked')?.value;
        if (unidades === '9') precioFinal += 1.50;
        if (unidades === '20') precioFinal += 4.00;
    }
    else{
    // Sumar extras (usamos ?. para que no falle si no encuentra el input)
    const tamano = document.querySelector('input[name="tamano"]:checked')?.value;
    if (tamano === 'Gigante') precioFinal += 0.60;

    const cantidad = document.querySelector('input[name="cantidad_carne"]:checked')?.value;
    if (cantidad === '2') precioFinal += 1.00;
    if (cantidad === '3') precioFinal += 2.00;

    const patatas = document.querySelector('input[name="patatas"]:checked')?.value;
    

    const bebida = document.getElementById('select-bebida')?.value;
    if (bebida && bebida.includes('Cerveza')) precioFinal += 1.00;
    }
    // Pintar precio
    const precioElemento = document.getElementById('precio-final');
    if(precioElemento) precioElemento.innerText = precioFinal.toFixed(2) + " €";
}

// --- Función añadir al carrito ---
function añadirAlCarrito() {
    alert("¡Producto añadido! (Aquí iría al carrito)");
    cerrarModal();
}


// ==========================================
// 2. CARGADORES DE ARCHIVOS (AJAX / FETCH)
// ==========================================

async function cargarModal() {
    try {
        const respuesta = await fetch('componentes/modal.html');
        if (respuesta.ok) {
            const html = await respuesta.text();
            document.getElementById('modal-container').innerHTML = html;
            console.log("Modal cargado correctamente");
        } else {
            console.error("No se encuentra el archivo componentes/modal.html");
        }
    } catch (error) {
        console.error("Error cargando modal:", error);
    }
}
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
    cargarModal();
});