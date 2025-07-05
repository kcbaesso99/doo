package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaFuncionario;

public class ControllerBuscaFuncionario implements ActionListener {
    TelaBuscaFuncionario telaBuscaFuncionario;

    public ControllerBuscaFuncionario(TelaBuscaFuncionario telaBuscaFuncionario) {
        this.telaBuscaFuncionario = telaBuscaFuncionario;
        this.telaBuscaFuncionario.getjButtonCarregar().addActionListener(this);
        this.telaBuscaFuncionario.getjButtonSair().addActionListener(this);
        this.telaBuscaFuncionario.getjButtonBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.telaBuscaFuncionario.getjButtonCarregar()){
            JOptionPane.showMessageDialog(null, "Botão carregar selecionado!");
            if (this.telaBuscaFuncionario.getjTable1().getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "Erro!\nNão existem dados selecionados!");
            } else {
               JOptionPane.showMessageDialog(null, "Carregando dados!\nPor favor, aguarde!"); 
            }
        } else if (evento.getSource() == this.telaBuscaFuncionario.getjButtonBuscar()){
            JOptionPane.showMessageDialog(null, "Botão filtrar selecionado!");
            
            if (this.telaBuscaFuncionario.getjTextFieldValor().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Erro!\nNão há dados para serem filtrados!");
            } else {
                JOptionPane.showMessageDialog(null, "Filtrando...");
            }
        } else if (evento.getSource() == this.telaBuscaFuncionario.getjButtonSair()){
            this.telaBuscaFuncionario.dispose();
        }
    } 
    
}
