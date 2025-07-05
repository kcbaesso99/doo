package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaVeiculos;

public class ControllerBuscaVeiculos implements ActionListener {
    TelaBuscaVeiculos telaBuscaVeiculos;

    public ControllerBuscaVeiculos(TelaBuscaVeiculos telaBuscaVeiculos) {
        this.telaBuscaVeiculos = telaBuscaVeiculos;
        this.telaBuscaVeiculos.getjButtonCarregar().addActionListener(this);
        this.telaBuscaVeiculos.getjButtonSair().addActionListener(this);
        this.telaBuscaVeiculos.getjButtonBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.telaBuscaVeiculos.getjButtonCarregar()){
            JOptionPane.showMessageDialog(null, "Botão carregar selecionado!");
            if (this.telaBuscaVeiculos.getjTable1().getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "Erro!\nNão existem dados selecionados!");
            } else {
               JOptionPane.showMessageDialog(null, "Carregando dados!\nPor favor, aguarde!"); 
            }
        } else if (evento.getSource() == this.telaBuscaVeiculos.getjButtonBuscar()){
            JOptionPane.showMessageDialog(null, "Botão filtrar selecionado!");
            
            if (this.telaBuscaVeiculos.getjTextFieldValor().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Erro!\nNão há dados para serem filtrados!");
            } else {
                JOptionPane.showMessageDialog(null, "Filtrando...");
            }
        } else if (evento.getSource() == this.telaBuscaVeiculos.getjButtonSair()){
            this.telaBuscaVeiculos.dispose();
        }
    } 
    
}
