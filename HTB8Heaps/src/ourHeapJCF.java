/**
 * Clase ourHeapJavaCollectionsFramework
 * @author Jose Tejada 17584
 * @author David Soto 17551
 * @version 1.0
 */
import java.util.PriorityQueue;

public class ourHeapJCF<E>{
    protected PriorityQueue ourHeap;
    public ourHeapJCF(){
        ourHeap = new PriorityQueue<E>();
    }
    public ourHeapJCF(PriorityQueue<E> vector){
        ourHeap = new PriorityQueue<E>(vector.size());
        for(int i = 0; i<vector.size();i++){
            vector.poll();
        }
    }
    /**
     * Agrega pacientes nuevos
     * @param value paciente
     */
    public void agregar(E value){
        ourHeap.add(value);
    }
    /**
     * Revisa cual es el proximo paciente con mayor prioridad
     * @return El paciente con mayor prioridad si lo hay, y si no regresa un mensaje diciendo que no hay pacientes
     */
    public String revisar(){
        if(!ourHeap.isEmpty()){
            String paciente = ourHeap.peek().toString(); 
            return paciente;
        }else{
            String mensaje = "Ya no hay pacientes";
            return mensaje;
        }
    }
    /**
     * Llama al siguiente paciente y lo atiende sacandolo de la cola y mostrando su nombre para saber que fue atendido
     * @return nombre del paciente atendido
     */
    public String siguiente(){
       if(!ourHeap.isEmpty()){
            String paciente = ourHeap.poll().toString(); 
            return paciente;
        }else{
            String mensaje = "Ya no hay pacientes";
            return mensaje;
        } 
    }
    
}
