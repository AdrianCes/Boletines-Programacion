public class Garaje {

 private static int numCoches;
    private static final int PLAZAS = 5;
    private static final float PREZO_PRIMEIRAS_HORAS=1.5f, PREZO_NORMAL=0.2f;
    private static Coche[] coches = new Coche[PLAZAS];

    private static boolean aparcar(Coche coche){
        for (int i = 0; i < PLAZAS; i++) {
            if(coches[i]==null){
                coches[i]=coche;
                return true;
            }
        }
        return false;
    }

    private static int contarPlazas(){
        int cont=5;
        for (int i = 0; i < PLAZAS; i++) {
            if(coches[i]!=null){
                cont--;
            }
        }
        return cont;
    }
    public static void entradaCoche(Coche coche){
        if(aparcar(coche)){
            System.out.println("Plazas libres: "+contarPlazas());
            numCoches++;
        } else {
            System.out.println("Lleno");
        }
    }

    public static void salidaCoche(float tempo, float cartosRecibidos, Coche coche){
        boolean flag=false;
        float prezo;
        if(numCoches==0){
            System.out.println("Parking vacío");
        } else {
            for (int i = 0; i < PLAZAS; i++) {
                if(coches[i]!=null){
                    if(coches[i].matricula.compareTo(coche.matricula)==0){
                        coches[i]=null;
                        flag=true;
                    }
                }
            }
        }
        if(flag){
            if(tempo<=3){
                prezo=PREZO_PRIMEIRAS_HORAS;
            } else {
                prezo=1.5f+(tempo-3)*PREZO_NORMAL;
            }
            System.out.println("FACTURA\nMATRÍCULA COCHE:"+coche.matricula+"\nTEMPO:"+tempo+"\nPRECIO:"+prezo+"\nCARTOS RECIBIDOS:" +
                    cartosRecibidos+"\nDevolucion:"+(cartosRecibidos-prezo)+"\nGrazas");

        } else {
            System.out.println("ERROR: No esta el coche");
        }
    }
}
