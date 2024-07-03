package org.example;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class SistemaClima {
    private Temperatura temperatura;
    private Lluvia lluvia;
    private Viento viento;
    private Humedad humedad;
    private Presion presion;

    public SistemaClima(Temperatura temperatura, Lluvia lluvia, Viento viento, Humedad humedad, Presion presion) {
        this.temperatura = temperatura;
        this.lluvia = lluvia;
        this.viento = viento;
        this.humedad = humedad;
        this.presion = presion;
    }

    public List<Evento> DefinirEventos(){
        List<Evento> eventos = new ArrayList<>();

        if(lluvia.isFar()){
            eventos.add(new Alertas("Lluvia intensa"));
        }
        if(viento.isFar()){
            eventos.add(new Alertas("Viento fuerte intensa"));
        }
        if(temperatura.isFar()&& humedad.isFar()){
            eventos.add(new Automatico("Activar Sistema de riego"));
        }
        if(viento.isFar() || temperatura.isFar()) {
            eventos.add(new Automatico("Cerrar Persianas"));
        }
        if(presion.isnotEnough()){
            eventos.add(new Notificaciones("poca presion en la zona"));
        }

        return eventos;
    }

    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura(35);
        Lluvia lluvia = new Lluvia(25);
        Viento viento = new Viento(55);
        Humedad humedad = new Humedad(0);
        Presion presion = new Presion(0);

        SistemaClima sistemaClima = new SistemaClima(temperatura, lluvia, viento, humedad, presion);
        List<Evento> eventos = sistemaClima.DefinirEventos();

        System.out.println("Eventos generados:");
        for (Evento evento : eventos) {
            System.out.println(evento.getMensaje());
        }
    }

}
