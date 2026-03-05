document.addEventListener('DOMContentLoaded', function() {
    const botonSalir = document.querySelector('main > a');
    
    if (botonSalir) {
        // Evento para cuando el ratón entra en el área del botón
        botonSalir.addEventListener('mouseenter', function(e) {
            // Obtener dimensiones de la ventana
            const windowWidth = window.innerWidth;
            const windowHeight = window.innerHeight;
            
            // Obtener dimensiones del botón
            const botonRect = botonSalir.getBoundingClientRect();
            const botonWidth = botonRect.width;
            const botonHeight = botonRect.height;
            
            // Calcular límites seguros para que el botón no desaparezca
            const maxX = (windowWidth - botonWidth) / 2;
            const maxY = (windowHeight - botonHeight) / 2;
            
            // Generar posiciones aleatorias dentro de los límites
            const randomX = (Math.random() - 0.5) * maxX;
            const randomY = (Math.random() - 0.5) * maxY;
            
            // Aplica la transformación
            botonSalir.style.transform = `translate(${randomX}px, ${randomY}px)`;
        });
    }
});
