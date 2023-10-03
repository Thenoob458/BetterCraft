/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bettercraft;


import jade.core.Runtime;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
/**
 *
 * @author 6430554
 */
public class BetterCraft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Inicialize a plataforma JADE
        Runtime rt = Runtime.instance();
        Profile p = new ProfileImpl();
        p.setParameter(Profile.MAIN_HOST, "localhost");
        p.setParameter(Profile.GUI, "true"); // Ative a GUI JADE

        ContainerController container = rt.createMainContainer(p);

        try {
            // Crie e adicione agentes ao contêiner
            AgentController agente = container.createNewAgent("Carlos, o homem que vai mudar o mundo", Carlos.class.getName(), null);
            agente.start();

            // Espere até que os agentes terminem suas atividades
            Thread.sleep(5000);

            // Encerre a plataforma JADE
            rt.shutDown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
