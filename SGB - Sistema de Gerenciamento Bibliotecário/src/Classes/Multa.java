/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author gabri
 */
public class Multa {

    private static final double MULTA_POR_DIA = 0.90;

    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Multa(Date dataEmprestimo, Date dataDevolucao) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public int calcularDiasAtraso() {
        long diferencaEmMillis = dataDevolucao.getTime() - dataEmprestimo.getTime();
        int diasAtraso = (int) (diferencaEmMillis / (1000 * 60 * 60 * 24));
        if (diasAtraso < 0) {
            diasAtraso = 0;
        }
        return diasAtraso;
    }

    public double calcularMulta() {
        return calcularDiasAtraso() * MULTA_POR_DIA;
    }

    public void exibir() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data de empréstimo: " + sdf.format(dataEmprestimo));
        System.out.println("Data de devolução: " + sdf.format(dataDevolucao));
        System.out.println("Dias de atraso: " + calcularDiasAtraso());
        System.out.println("Valor da multa: R$ " + calcularMulta());
    }

}
