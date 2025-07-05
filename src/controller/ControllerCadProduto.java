package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaBuscaCadastroProduto;
import view.TelaCadastroProduto;


public class ControllerCadProduto implements ActionListener {
    TelaCadastroProduto telaCadastroProduto;
    
    public ControllerCadProduto (TelaCadastroProduto telaCadastroProduto){
        this.telaCadastroProduto = telaCadastroProduto;
        
        this.telaCadastroProduto.getjButtonNovo().addActionListener(this);
        this.telaCadastroProduto.getjButtonCancelar().addActionListener(this);
        this.telaCadastroProduto.getjButtonGravar().addActionListener(this);
        this.telaCadastroProduto.getjButtonBuscar().addActionListener(this);
        this.telaCadastroProduto.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(this.telaCadastroProduto.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadastroProduto.getjPanelDados(), false);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.telaCadastroProduto.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(this.telaCadastroProduto.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadastroProduto.getjPanelDados(), true);
        } else if (evento.getSource() == this.telaCadastroProduto.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(this.telaCadastroProduto.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroProduto.getjPanelDados(), false);
        } else if (evento.getSource() == this.telaCadastroProduto.getjButtonGravar()) {
            utilities.Utilities.ativaDesativa(this.telaCadastroProduto.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroProduto.getjPanelDados(), false);
        } else if (evento.getSource() == this.telaCadastroProduto.getjButtonBuscar()) {
            TelaBuscaCadastroProduto telaBuscaCadastroProduto = new TelaBuscaCadastroProduto(null, true);
            ControllerBuscaProduto controllerBuscaProduto = new ControllerBuscaProduto(telaBuscaCadastroProduto);
            telaBuscaCadastroProduto.setVisible(true);
        } else if (evento.getSource() == this.telaCadastroProduto.getjButtonSair()) {
            this.telaCadastroProduto.dispose();
       }
    }
}
