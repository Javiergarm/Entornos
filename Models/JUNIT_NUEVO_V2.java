package Models;

import java.util.Scanner;

/**
 * @author alumnot
 * @version 1.0
 * @since 19/04/2022
 */
public class JUNIT_NUEVO_V2 {

    private static final int FACTOR_MULTIPLICACION=10;
    private static Scanner entrada = new Scanner(System.in);
    private static String participantes;
    private static boolean boleano = false;
    private static int puntua = 0;
    private static int TiempoFinal = 0;
    private static int Tiempo = 0;
    private static double puntuacion = 0;

    public static void main(String[] args) throws Exception {

        do {
            System.out.println("--Carrera Cervantina de 100 kilometros--");
            System.out.println("El participantes es:\n1.-Ciclista\n2.-Corredor");
            setParticipantes(getEntrada().nextLine());
            Exception Exception = null;

            opcionParticipante(getParticipantes(),Exception);
            /*if (participantes.equalsIgnoreCase("Ciclista")) {
                        boleano = true;
                        puntua = 20;
                    } else if (participantes.equalsIgnoreCase("Corredor")) {
                        boleano = true;
                        puntua = 10;
                    }
             */
        } while (!isBoleano());

        setBoleano(false);

        iteracionPuntos();

        setPuntuacion(getTiempoFinal() * getPuntua());

        compruebaCondiciones(getTiempoFinal(), getPuntuacion(), ". . .");

        System.out.println("puntuacion -->" + getPuntuacion()+compruebaCondiciones(TiempoFinal, puntuacion, participantes));

    }

    /**
     * Metodo los calcula el tiempo Final del participante de la carrera
     * @param 
     */
    private static void iteracionPuntos() {
        for (int kmActual = 0; kmActual <= 80; kmActual += 20) {
            System.out.println("Cuanto ha tardado en llegar del kilometro " + kmActual + " al kilometro " + (kmActual + 20));
            setTiempo(getEntrada().nextInt());
            if (getTiempo() == 0 ) {
                setBoleano(true);
            }
            setTiempoFinal(getTiempoFinal() + getTiempo());

        }
    }

    /**
     * Metodo nos da el resultado final de la carrera
     * @param TiempoFinal variable que nos muestra el tiempo final de la carrera
     * @param puntuacion variable que nos muestra los puntos totales conseguidos durante la carrera
     * @param cadena variable que nos muestra el resultado final
     * @return String cadena
     */
    public static String compruebaCondiciones(int TiempoFinal, double puntuacion, String cadena) {


        if (TiempoFinal == 0) {

            cadena = "El participante no ha participado";

        } else if (TiempoFinal != 0 && isBoleano() == true) {

            cadena = "El participante abandono la carrera y sus puntos son " + puntuacion;
        } else {

            cadena = "El participante ha terminado consiguindo asi " + puntuacion + " puntos";
        }
        return cadena;

    }

    /**
     * Este metodo nos dice si el participante es Ciclista o Corredor
     * @param opcion esta variable nos da el resultado de getParticipantes que devuelve una String
     * @param Excepcion esta variable tipo Exception no lamza una exception si la puntuacion es menor a 0
     * @return bollean isBoleano
     * @exception Exception
     * @throws Exception lanza una 
     */
    public static boolean opcionParticipante(String opcion,Exception Excepcion ) throws Exception {

        if (getParticipantes().equalsIgnoreCase("Ciclista")) {
            setBoleano(true);
            setPuntua(20+FACTOR_MULTIPLICACION);
        } else if (getParticipantes().equalsIgnoreCase("Corredor")) {
            setBoleano(true);
            setPuntua(10+FACTOR_MULTIPLICACION);
        } else {
            setBoleano(false);
        }
        if(puntuacion<0){
            throw Excepcion;
        }
        return isBoleano();
    }

    /**
     * Metodo que obtiene la entrada
     * @return the entrada
     */
    public static Scanner getEntrada() {
        return entrada;
    }

    /**
     * Metodo que define la entrada
     * @param aEntrada the entrada to set
     */
    public static void setEntrada(Scanner aEntrada) {
        entrada = aEntrada;
    }

    /**
     * Metodo que obtiene los participantes
     * @return the participantes
     */
    public static String getParticipantes() {
        return participantes;
    }

    /**
     * Metodo que define los participantes
     * @param aParticipantes the participantes to set
     */
    public static void setParticipantes(String aParticipantes) {
        participantes = aParticipantes;
    }

    /**
     * Metodo que obtiene un bollean
     * @return the boleano
     */
    public static boolean isBoleano() {
        return boleano;
    }

    /**
     * Metodo que define un bollean
     * @param aBoleano the boleano to set
     */
    public static void setBoleano(boolean aBoleano) {
        boleano = aBoleano;
    }

    /**
     * Metodo que obtiene los puntos
     * @return the puntua
     */
    public static int getPuntua() {
        return puntua;
    }

    /**
     * Metodo que define los puntos
     * @param aPuntua the puntua to set
     */
    public static void setPuntua(int aPuntua) {
        puntua = aPuntua;
    }

    /**
     * Metodo que obtiene el tiempo final
     * @return the TiempoFinal
     */
    public static int getTiempoFinal() {
        return TiempoFinal;
    }

    /**
     * Metodo que define el tiempo final
     * @param aTiempoFinal the TiempoFinal to set
     */
    public static void setTiempoFinal(int aTiempoFinal) {
        TiempoFinal = aTiempoFinal;
    }

    /**
     * Metodo que obtiene el tiempo
     * @return the Tiempo
     */
    public static int getTiempo() {
        return Tiempo;
    }

    /**
     * Metodo que define el tiempo
     * @param aTiempo the Tiempo to set
     */
    public static void setTiempo(int aTiempo) {
        Tiempo = aTiempo;
    }

    /**
     * Metodo que obtiene la puntuacion
     * @return the puntuacion
     */
    public static double getPuntuacion() {
        return puntuacion;
    }

    /**
     * Metodo que define la puntuacion
     * @param aPuntuacion the puntuacion to set
     */
    public static void setPuntuacion(double aPuntuacion) {
        puntuacion = aPuntuacion;
    }
}