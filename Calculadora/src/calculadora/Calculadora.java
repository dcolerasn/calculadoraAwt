package calculadora;

import java.awt.*;
import java.awt.event.*;

public class Calculadora extends Frame{
    //Iniciamos variables necesarias
    Double valor1 = null;
    Double valor2 = null;  
    Boolean esSuma = false;
    Boolean esResta = false;  
    Boolean esMultiplicacion = false;
    Boolean result = false;
    String resultado = "";
     
    Calculadora(){
        //Iniciamos los componentes de frame y los colocamos
            Panel panelPrincipal = new Panel(new BorderLayout());
            this.add(panelPrincipal);

            TextField texto = new TextField("");
            texto.setEditable(true);
            panelPrincipal.add(texto, BorderLayout.NORTH);
           

            Panel teclado = new Panel(new GridLayout(4,4));
            panelPrincipal.add(teclado, BorderLayout.CENTER);          

            //Definimos las teclas del teclado
            Button[] teclas;
            teclas = new Button[]{
                new Button("1"),
                new Button("2"),
                new Button("3"),
                new Button("+"),
                new Button("4"),
                new Button("5"),
                new Button("6"),
                new Button("-"),
                new Button("7"),
                new Button("8"),
                new Button("9"),
                new Button("*"),
                new Button("."),
                new Button("0"),
                new Button("C"),
                new Button("="),
            };
        
        //Damos funcionalidad a las teclas.
        for(Button tecla : teclas){
            tecla.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String valorPulsado = tecla.getLabel();
                       
                        if(valorPulsado.equals("C")){
                            texto.setText("");
                            valor1=null;
                            valor2=null;
                        }
                        else if(valorPulsado.equals("1")){
                            if(result==true){
                                siguienteOperacion();
                                texto.setText("1");
                            }
                            else{
                            texto.setText(texto.getText()+"1");
                            }
                        }
                        else if(valorPulsado.equals("2")){
                            if(result==true){
                                siguienteOperacion();
                                texto.setText("2");
                            }
                            else{
                            texto.setText(texto.getText()+"2");
                            }
                        }
                        else if(valorPulsado.equals("3")){
                            if(result==true){
                                siguienteOperacion();
                                texto.setText("3");
                            }
                            else{
                            texto.setText(texto.getText()+"3");
                            };
                        }
                        else if(valorPulsado.equals("4")){
                            if(result==true){
                                siguienteOperacion();
                                texto.setText("4");
                            }
                            else{
                            texto.setText(texto.getText()+"4");
                            }
                        }
                        else if(valorPulsado.equals("5")){
                            if(result==true){
                                siguienteOperacion();
                                texto.setText("5");
                            }
                            else{
                            texto.setText(texto.getText()+"5");
                            }
                        }
                        else if(valorPulsado.equals("6")){
                            if(result==true){
                                siguienteOperacion();
                                texto.setText("6");
                            }
                            else{
                            texto.setText(texto.getText()+"6");
                            }
                        }
                        else if(valorPulsado.equals("7")){
                            if(result==true){
                                siguienteOperacion();
                                texto.setText("7");
                            }
                            else{
                            texto.setText(texto.getText()+"7");
                            }
                        } 
                        else if(valorPulsado.equals("8")){
                            if(result==true){
                                siguienteOperacion();
                                texto.setText("8");
                            }
                            else{
                            texto.setText(texto.getText()+"8");
                            }
                        }
                        else if(valorPulsado.equals("9")){
                            if(result==true){
                                siguienteOperacion();
                                texto.setText("9");
                            }
                            else{
                            texto.setText(texto.getText()+"9");
                            }
                        }
                        else if(valorPulsado.equals("0")){
                            if(result==true){
                                siguienteOperacion();
                                texto.setText("0");
                            }
                            else{
                            texto.setText(texto.getText()+"0");
                            }
                        }                                                
                        else if(valorPulsado.equals(".")){
                            texto.setText(texto.getText()+".");
                        }                     
                        else if(valorPulsado.equals("+")){
                            result=false;
                            valor1 = Double.parseDouble(texto.getText());
                            texto.setText("");
                            esSuma=true;
                        }  
                        else if(valorPulsado.equals("-")){
                            result=false;
                            valor1 = Double.parseDouble(texto.getText());
                            texto.setText("");
                            esResta=true;
                        }        
                        else if(valorPulsado.equals("*")){
                            result=false;
                            valor1 = Double.parseDouble(texto.getText());
                            texto.setText("");
                            esMultiplicacion=true;
                        }
                        else if(valorPulsado.equals("=")){
                            valor2 = Double.parseDouble(texto.getText());
                            if(esSuma==true){
                                resultado = (String.valueOf(valor1+valor2));
                                texto.setText(resultado);
                                result=true;
                            }    
                            else if(esResta==true){
                                resultado = (String.valueOf(valor1-valor2));
                                texto.setText(resultado);
                                result=true;
                            } 
                            else if(esMultiplicacion==true){
                                resultado = (String.valueOf(valor1*valor2));
                                texto.setText(resultado);
                                result=true;
                            }  
                            
                        }                    
                    }
        });
        teclado.add(tecla);//Añadimos las teclas al teclado
        }
    }
    private void siguienteOperacion(){
        valor1=null;
        valor2=null;
        result=false;
        esMultiplicacion=false;
        esSuma=false;
        esResta=false;
    }
//Iniciamos el método main dando visibilidad, tamaño y nombre
    
    public static void main(String[] args) {
        Calculadora app = new Calculadora();
        app.setSize(300,300);
        app.setTitle("Calculadora");
        app.setVisible(true);
        //Añadimos la funcionalidad de cerrar
        app.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
            System.exit(0);
            }
        });

        
    }
}
