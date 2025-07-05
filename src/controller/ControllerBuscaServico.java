package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaServico;

public class ControllerBuscaServico implements ActionListener {
    TelaBuscaServico telaBuscaServico;

    public ControllerBuscaServico(TelaBuscaServico telaBuscaServico) {
        this.telaBuscaServico = telaBuscaServico;
        this.telaBuscaServico.getjButtonCarregar().addActionListener(this);
        this.telaBuscaServico.getjButtonSair().addActionListener(this);
        this.telaBuscaServico.getjButtonBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.telaBuscaServico.getjButtonCarregar()){
            JOptionPane.showMessageDialog(null, "Botão carregar selecionado!");
            if (this.telaBuscaServico.getjTable1().getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "Erro!\nNão existem dados selecionados!");
            } else {
               JOptionPane.showMessageDialog(null, "Carregando dados!\nPor favor, aguarde!"); 
            }
        } else if (evento.getSource() == this.telaBuscaServico.getjButtonBuscar()){
            JOptionPane.showMessageDialog(null, "Botão filtrar selecionado!");
            
            if (this.telaBuscaServico.getjTextFieldValor().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Erro!\nNão há dados para serem filtrados!");
            } else {
                JOptionPane.showMessageDialog(null, "Filtrando...");
            }
        } else if (evento.getSource() == this.telaBuscaServico.getjButtonSair()){
            this.telaBuscaServico.dispose();
        }
    } 
    
}
