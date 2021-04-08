package exemplo_thread;

public class Main {
		
	static int i = 0;
	static int voltas = 5;
	
    private static void contar(String name){
        i++;
        System.out.println("Contagem atual é: " + i + ",\tatualizado por " + name);
    }

    private static Runnable t1 = new Runnable() {
        public void run() {
            try{
                for(int i=0; i<voltas; i++){
                    contar("t1");
                }
            } catch (Exception e){
            	System.err.println(e.getMessage());
            }

        }
    };

    private static Runnable t2 = new Runnable() {
        public void run() {
            try{
                for(int i=0; i<voltas; i++){
                    contar("t2");
                }
            } catch (Exception e){
            	System.err.println(e.getMessage());
            }
       }
    };
    
    public static void main(String[] args) {
        new Thread(t1).start();
        new Thread(t2).start();
    }
    
}