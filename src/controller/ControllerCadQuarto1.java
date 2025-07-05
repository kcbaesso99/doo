package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaBuscaQuarto;
import view.TelaCadastroQuarto;


public class ControllerCadQuarto1 implements ActionListener {
    TelaCadastroQuarto telaCadastroQuarto;
    
    public ControllerCadQuarto1 (TelaCadastroQuarto telaCadastroQuarto){
        this.telaCadastroQuarto = telaCadastroQuarto;
        
        this.telaCadastroQuarto.getjButtonNovo().addActionListener(this);
        this.telaCadastroQuarto.getjButtonCancelar().addActionListener(this);
        this.telaCadastroQuarto.getjButtonGravar().addActionListener(this);
        this.telaCadastroQuarto.getjButtonBuscar().addActionListener(this);
        this.telaCadastroQuarto.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(this.telaCadastroQuarto.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadastroQuarto.getjPanelDados(), false);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.telaCadastroQuarto.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(this.telaCadastroQuarto.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadastroQuarto.getjPanelDados(), true);
        } else if (evento.getSource() == this.telaCadastroQuarto.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(this.telaCadastroQuarto.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroQuarto.getjPanelDados(), false);
        } else if (evento.getSource() == this.telaCadastroQuarto.getjButtonGravar()) {
            utilities.Utilities.ativaDesativa(this.telaCadastroQuarto.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroQuarto.getjPanelDados(), false);
        } else if (evento.getSource() == this.telaCadastroQuarto.getjButtonBuscar()) {
            TelaBuscaQuarto telaBuscaQuarto = new TelaBuscaQuarto(null, true);
            ControllerBuscaQuarto controllerBuscaQuarto = new ControllerBuscaQuarto(telaBuscaQuarto);
            telaBuscaQuarto.setVisible(true);
        } else if (evento.getSource() == this.telaCadastroQuarto.getjButtonSair()) {
            this.telaCadastroQuarto.dispose();
       }
    }
    
}