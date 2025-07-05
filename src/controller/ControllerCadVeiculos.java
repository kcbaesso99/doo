package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaBuscaVeiculos;
import view.TelaCadastroVeiculos;


public class ControllerCadVeiculos implements ActionListener {
    TelaCadastroVeiculos telaCadastroVeiculos;
    
    public ControllerCadVeiculos (TelaCadastroVeiculos telaCadastroVeiculos){
        this.telaCadastroVeiculos = telaCadastroVeiculos;
        
        this.telaCadastroVeiculos.getjButtonNovo().addActionListener(this);
        this.telaCadastroVeiculos.getjButtonCancelar().addActionListener(this);
        this.telaCadastroVeiculos.getjButtonGravar().addActionListener(this);
        this.telaCadastroVeiculos.getjButtonBuscar().addActionListener(this);
        this.telaCadastroVeiculos.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(this.telaCadastroVeiculos.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadastroVeiculos.getjPanelDados(), false);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.telaCadastroVeiculos.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(this.telaCadastroVeiculos.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadastroVeiculos.getjPanelDados(), true);
        } else if (evento.getSource() == this.telaCadastroVeiculos.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(this.telaCadastroVeiculos.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroVeiculos.getjPanelDados(), false);
        } else if (evento.getSource() == this.telaCadastroVeiculos.getjButtonGravar()) {
            utilities.Utilities.ativaDesativa(this.telaCadastroVeiculos.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroVeiculos.getjPanelDados(), false);
        } else if (evento.getSource() == this.telaCadastroVeiculos.getjButtonBuscar()) {
            TelaBuscaVeiculos telaBuscaVeiculos = new TelaBuscaVeiculos(null, true);
            ControllerBuscaVeiculos controllerBuscaVeiculos = new ControllerBuscaVeiculos(telaBuscaVeiculos);
            telaBuscaVeiculos.setVisible(true);
        } else if (evento.getSource() == this.telaCadastroVeiculos.getjButtonSair()) {
            this.telaCadastroVeiculos.dispose();
       }
    }
}
