package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaCadastroProduto;

public class ControllerBuscaProduto implements ActionListener {
    TelaBuscaCadastroProduto telaBuscaProduto;

    public ControllerBuscaProduto(TelaBuscaCadastroProduto telaBuscaProduto) {
        this.telaBuscaProduto = telaBuscaProduto;
        this.telaBuscaProduto.getjButtonCarregar().addActionListener(this);
        this.telaBuscaProduto.getjButtonSair().addActionListener(this);
        this.telaBuscaProduto.getjButtonBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.telaBuscaProduto.getjButtonCarregar()){
            JOptionPane.showMessageDialog(null, "Botão carregar selecionado!");
            if (this.telaBuscaProduto.getjTable1().getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "Erro!\nNão existem dados selecionados!");
            } else {
               JOptionPane.showMessageDialog(null, "Carregando dados!\nPor favor, aguarde!"); 
            }
        } else if (evento.getSource() == this.telaBuscaProduto.getjButtonBuscar()){
            JOptionPane.showMessageDialog(null, "Botão filtrar selecionado!");
            
            if (this.telaBuscaProduto.getjTextFieldValor().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Erro!\nNão há dados para serem filtrados!");
            } else {
                JOptionPane.showMessageDialog(null, "Filtrando...");
            }
        } else if (evento.getSource() == this.telaBuscaProduto.getjButtonSair()){
            this.telaBuscaProduto.dispose();
        }
    } 
    
}
