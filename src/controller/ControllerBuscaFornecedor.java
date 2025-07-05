package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaFornecedor;

public class ControllerBuscaFornecedor implements ActionListener {
    TelaBuscaFornecedor telaBuscaFornecedor;

    public ControllerBuscaFornecedor(TelaBuscaFornecedor telaBuscaFornecedor) {
        this.telaBuscaFornecedor = telaBuscaFornecedor;
        this.telaBuscaFornecedor.getjButtonCarregar().addActionListener(this);
        this.telaBuscaFornecedor.getjButtonSair().addActionListener(this);
        this.telaBuscaFornecedor.getjButtonBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.telaBuscaFornecedor.getjButtonCarregar()){
            JOptionPane.showMessageDialog(null, "Botão carregar selecionado!");
            if (this.telaBuscaFornecedor.getjTable1().getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "Erro!\nNão existem dados selecionados!");
            } else {
               JOptionPane.showMessageDialog(null, "Carregando dados!\nPor favor, aguarde!"); 
            }
        } else if (evento.getSource() == this.telaBuscaFornecedor.getjButtonBuscar()){
            JOptionPane.showMessageDialog(null, "Botão filtrar selecionado!");
            
            if (this.telaBuscaFornecedor.getjTextFieldValor().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Erro!\nNão há dados para serem filtrados!");
            } else {
                JOptionPane.showMessageDialog(null, "Filtrando...");
            }
        } else if (evento.getSource() == this.telaBuscaFornecedor.getjButtonSair()){
            this.telaBuscaFornecedor.dispose();
        }
    } 
    
}
