package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaQuarto;

public class ControllerBuscaQuarto implements ActionListener {
    TelaBuscaQuarto telaBuscaQuarto;

    public ControllerBuscaQuarto(TelaBuscaQuarto telaBuscaQuarto) {
        this.telaBuscaQuarto = telaBuscaQuarto;
        this.telaBuscaQuarto.getjButtonCarregar().addActionListener(this);
        this.telaBuscaQuarto.getjButtonSair().addActionListener(this);
        this.telaBuscaQuarto.getjButtonBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.telaBuscaQuarto.getjButtonCarregar()){
            JOptionPane.showMessageDialog(null, "Botão carregar selecionado!");
            if (this.telaBuscaQuarto.getjTable1().getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "Erro!\nNão existem dados selecionados!");
            } else {
               JOptionPane.showMessageDialog(null, "Carregando dados!\nPor favor, aguarde!"); 
            }
        } else if (evento.getSource() == this.telaBuscaQuarto.getjButtonBuscar()){
            JOptionPane.showMessageDialog(null, "Botão filtrar selecionado!");
            
            if (this.telaBuscaQuarto.getjTextFieldValor().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Erro!\nNão há dados para serem filtrados!");
            } else {
                JOptionPane.showMessageDialog(null, "Filtrando...");
            }
        } else if (evento.getSource() == this.telaBuscaQuarto.getjButtonSair()){
            this.telaBuscaQuarto.dispose();
        }
    } 
    
}
