package idat.edu.pe.servicioproducto.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsConsumer {
    @JmsListener(destination = "pedido.cambios.queue")
    public void recibirMensaje(String mensaje) {
        try {
            System.out.println("Mensaje JSON recibido: " + mensaje);

        } catch (Exception e) {
            System.err.println("Error al procesar el mensaje: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
