package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaHospede;

public class ControllerBuscaHospede implements ActionListener {
    TelaBuscaHospede telaBuscaHospede;

    public ControllerBuscaHospede(TelaBuscaHospede telaBuscaHospede) {
        this.telaBuscaHospede = telaBuscaHospede;
        this.telaBuscaHospede.getjButtonCarregar().addActionListener(this);
        this.telaBuscaHospede.getjButtonSair().addActionListener(this);
        this.telaBuscaHospede.getjButtonBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.telaBuscaHospede.getjButtonCarregar()){
            JOptionPane.showMessageDialog(null, "Botão carregar selecionado!");
            if (this.telaBuscaHospede.getjTable1().getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "Erro!\nNão existem dados selecionados!");
            } else {
               JOptionPane.showMessageDialog(null, "Carregando dados!\nPor favor, aguarde!"); 
            }
        } else if (evento.getSource() == this.telaBuscaHospede.getjButtonBuscar()){
            JOptionPane.showMessageDialog(null, "Botão filtrar selecionado!");
            
            if (this.telaBuscaHospede.getjTextFieldValor().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Erro!\nNão há dados para serem filtrados!");
            } else {
                JOptionPane.showMessageDialog(null, "Filtrando...");
            }
        } else if (evento.getSource() == this.telaBuscaHospede.getjButtonSair()){
            this.telaBuscaHospede.dispose();
        }
    }
    
    
}
