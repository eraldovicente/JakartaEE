package org.aguzman.cliente.ws;

import org.aguzman.webapp.jaxws.services.Curso;
import org.aguzman.webapp.jaxws.services.CursoServicioWs;
import org.aguzman.webapp.jaxws.services.CursoServicioWsImplService;

public class Main {
    public static void main(String[] args) {
        CursoServicioWs service = new CursoServicioWsImplService().getCursoServicioWsImplPort();

        Curso curso = new Curso();
        curso.setNombre("react");
        curso.setDescripcion("react js");
        curso.setDuraccion(50D);
        curso.setInstructor("Eraldo");

        Curso respuesta = service.guardar(curso);
        System.out.println("nuevo curso: " + curso.getId() + ", " + curso.getNombre());

        service.listar().forEach(c -> System.out.println(c.getNombre()));
    }
}
