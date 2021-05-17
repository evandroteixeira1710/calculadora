package br.senai.sc.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String primeiroNumero = "";
    private String segundoNumero = "";
    private String operacao = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Minha Calculadora");
        display = findViewById(R.id.tv_display);
    }

    private void atualizaDdisplay(String texto){
        String textoDisplay = display.getText().toString();
        textoDisplay = textoDisplay + texto;
        display.setText(textoDisplay);
    }

//    public void onClickBotao1(View v) {
//        TextView display = findViewById(R.id.tv_display);
//        String textoDisplay = display.getText().toString();
//        textoDisplay = textoDisplay + "1";
//        display.setText(textoDisplay);

    public void onClickLimpar(View v){
        display.setText("");
        //atualizaDdisplay("");
    }
    public void onClickPonto(View v){
        atualizaDdisplay(".");
    }
    public void onClickBotao0(View v) {
        atualizarNumeroDigitado("0");
        atualizaDdisplay("0");
    }
    public void onClickBotao1(View v) {
        atualizarNumeroDigitado("1");
        atualizaDdisplay( "1");
    }
    public void onClickBotao2(View v) {
        atualizarNumeroDigitado("2");
        atualizaDdisplay("2");
    }
    public void onClickBotao3(View v) {
        atualizarNumeroDigitado("3");
        atualizaDdisplay("3");
    }
    public void onClickBotao4(View v) {
        atualizarNumeroDigitado("4");
        atualizaDdisplay("4");
    }
    public void onClickBotao5(View v) {
        atualizarNumeroDigitado("5");
        atualizaDdisplay("5");
    }
    public void onClickBotao6(View v) {
        atualizarNumeroDigitado("6");
        atualizaDdisplay("6");
    }
    public void onClickBotao7(View v) {
        atualizarNumeroDigitado("7");
        atualizaDdisplay("7");
    }
    public void onClickBotao8(View v) {
        atualizarNumeroDigitado("8");
        atualizaDdisplay("8");
    }
    public void onClickBotao9(View v) {
        atualizarNumeroDigitado("9");
        atualizaDdisplay("9");
    }

    public void onClickAdicao(View v){
        operacao = "+";
        atualizaDdisplay("+");
    }
    public void onClickSubtracao(View v){
        operacao = "-";
        atualizaDdisplay("-");
    }
    public void onClickMultplicacao(View v){
        operacao = "*";
        atualizaDdisplay("*");
    }
    public void onClickDivisao(View v){
        operacao = "/";
        atualizaDdisplay("/");
    }

    public void onClickIgual(View v) {
        if (!primeiroNumero.isEmpty() && !segundoNumero.isEmpty()) {
            int numero1 = Integer.parseInt(primeiroNumero);
            int numero2 = Integer.parseInt(segundoNumero);
            if (operacao.equals("+")) {
                int resultado = numero1 + numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("-")) {
                int resultado = numero1 - numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("*")) {
                int resultado = numero1 * numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("/")) {
                if(numero2!=0){
                int resultado = numero1 / numero2;
                display.setText(String.valueOf(resultado));
            } else{
                    Toast.makeText(MainActivity.this, "Numero precisa ser diferente de 0", Toast.LENGTH_LONG).show();
                    }
            }
        } else {
                Toast.makeText(MainActivity.this, "Nenhuma operação foi solicitada", Toast.LENGTH_LONG).show();
            }
        }

        private void atualizarNumeroDigitado(String numero){
            if (operacao.isEmpty()){
                primeiroNumero = primeiroNumero + numero;
            }else{
                segundoNumero = segundoNumero + numero;
            }
        }

    }