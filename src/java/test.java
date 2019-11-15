
import BEANS.personaBean;
import BEANS.redBean;
import java.util.ArrayList;
import java.util.List;
import logic.personaImp;
import logic.redImp;

public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        personaImp prof = new personaImp();
        redImp r = new redImp();
        
//        int dia = 8;
//        int mes = 12;
//        int año = 1998;
//
//        String fechaIni = año + "-" + mes + "-" + dia;

//        
//
//        Object obj[] = new Object[8];
//
//        obj[0] = "jeffrey";
//        obj[1] = "jibaja";
//        obj[2] = "garcia";
//        obj[3] = "71066130";
//        obj[4] = "952226284";
//        obj[5] = fechaIni;
//        obj[6] = "M";
//        obj[7] = "jeffrey@gmail.com";

//        System.out.println(prof.insert(obj));
//       personaBean bp = new personaBean();
//   
//       ArrayList<Object> list = prof.listar();
//     
//        for (int i = 0; i <list.size(); i++) {
//            System.out.println(((personaBean)list.get(i)).getNombre());
//        }

//    redBean  red = new redBean();
    
    ArrayList<Object> list = r.listar();
    
        for (int i = 0; i < list.size(); i++) {
             System.out.println(((redBean)list.get(i)).getCodRed());
        }
//
    }

}
