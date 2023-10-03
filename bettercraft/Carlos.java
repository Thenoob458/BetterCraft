/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bettercraft;

import jade.core.*;

import jade.core.behaviours.*;

import jade.lang.acl.ACLMessage;

/**
 *
 * @author 6430554
 */
public class Carlos extends Agent {
    protected void setup() {
        // Lógica de inicialização do agente
        System.out.println("Agente " + getLocalName() + " criado.");
    }

    protected void takeDown() {
        // Lógica de encerramento do agente
        System.out.println("Agente " + getLocalName() + " encerrado.");
    }
}
