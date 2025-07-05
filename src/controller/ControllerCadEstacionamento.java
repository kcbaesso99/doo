package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaBuscaEstacionamento;
import view.TelaCadastroEstacionamento;


public class ControllerCadEstacionamento implements ActionListener {
    TelaCadastroEstacionamento telaCadastroEstacionamento;
    
    public ControllerCadEstacionamento (TelaCadastroEstacionamento telaCadastroEstacionamento){
        this.telaCadastroEstacionamento = telaCadastroEstacionamento;
 
        this.telaCadastroEstacionamento.getjButtonNovo().addActionListener(this);
        this.telaCadastroEstacionamento.getjButtonCancelar().addActionListener(this);
        this.telaCadastroEstacionamento.getjButtonGravar().addActionListener(this);
        this.telaCadastroEstacionamento.getjButtonBuscar().addActionListener(this);
        this.telaCadastroEstacionamento.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(this.telaCadastroEstacionamento.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadastroEstacionamento.getjPanelDados(), false);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.telaCadastroEstacionamento.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(this.telaCadastroEstacionamento.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadastroEstacionamento.getjPanelDados(), true);
        } else if (evento.getSource() == this.telaCadastroEstacionamento.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(this.telaCadastroEstacionamento.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroEstacionamento.getjPanelDados(), false);
        } else if (evento.getSource() == this.telaCadastroEstacionamento.getjButtonGravar()) {
            utilities.Utilities.ativaDesativa(this.telaCadastroEstacionamento.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroEstacionamento.getjPanelDados(), false);
        } else if (evento.getSource() == this.telaCadastroEstacionamento.getjButtonBuscar()) {
            TelaBuscaEstacionamento telaBuscaEstacionamento = new TelaBuscaEstacionamento(null, true);
            ControllerBuscaEstacionamento controllerBuscaEstacionamento = new ControllerBuscaEstacionamento(telaBuscaEstacionamento);
            telaBuscaEstacionamento.setVisible(true);
        } else if (evento.getSource() == this.telaCadastroEstacionamento.getjButtonSair()) {
            this.telaCadastroEstacionamento.dispose();
       }
    }
}