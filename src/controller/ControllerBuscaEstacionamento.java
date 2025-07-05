package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaEstacionamento;

public class ControllerBuscaEstacionamento implements ActionListener {
    TelaBuscaEstacionamento telaBuscaEstacionamento;

    public ControllerBuscaEstacionamento(TelaBuscaEstacionamento telaBuscaEstacionamento) {
        this.telaBuscaEstacionamento = telaBuscaEstacionamento;
        this.telaBuscaEstacionamento.getjButtonCarregar().addActionListener(this);
        this.telaBuscaEstacionamento.getjButtonSair().addActionListener(this);
        this.telaBuscaEstacionamento.getjButtonBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.telaBuscaEstacionamento.getjButtonCarregar()){
            JOptionPane.showMessageDialog(null, "Botão carregar selecionado!");
            if (this.telaBuscaEstacionamento.getjTable1().getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "Erro!\nNão existem dados selecionados!");
            } else {
               JOptionPane.showMessageDialog(null, "Carregando dados!\nPor favor, aguarde!"); 
            }
        } else if (evento.getSource() == this.telaBuscaEstacionamento.getjButtonBuscar()){
            JOptionPane.showMessageDialog(null, "Botão filtrar selecionado!");
            
            if (this.telaBuscaEstacionamento.getjTextFieldValor().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Erro!\nNão há dados para serem filtrados!");
            } else {
                JOptionPane.showMessageDialog(null, "Filtrando...");
            }
        } else if (evento.getSource() == this.telaBuscaEstacionamento.getjButtonSair()){
            this.telaBuscaEstacionamento.dispose();
        }
    } 
    
}
