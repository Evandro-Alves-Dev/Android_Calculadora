package br.com.ProjetoEvandro;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.camera2.params.MandatoryStreamCombination;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;




import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    private TextView tela;
    private String primeiroNumero = "";
    private String segundoNumero = "";
    private String operacao = "";
    private double resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tela = findViewById(R.id.et_display);
    }

    private void atualizaDisplay(String texto) {
        String textoClick = tela.getText().toString();
        textoClick = textoClick + texto;
        tela.setText(textoClick);
    }

    public void onClickAdicao(View v) {
        operacao = "+";
        atualizaDisplay("+");
    }

    public void onClickSubtracao(View v) {
        operacao = "-";
        atualizaDisplay("-");
    }

    public void onClickMultiplicacao(View v) {
        operacao = "*";
        atualizaDisplay("*");
    }

    public void onClickDivisao(View v) {
        operacao = "/";
        atualizaDisplay("/");
    }

    public void onClickIgual(View v) {
        double numero1 = Integer.parseInt(primeiroNumero);
        double numero2 = Integer.parseInt(segundoNumero);
        if (operacao.equals("+")) {
            resultado = numero1 + numero2;
            tela.setText(String.valueOf(resultado));
        } else if (operacao.equals("-")) {
            resultado = numero1 - numero2;
            tela.setText(String.valueOf(resultado));
        }else if (operacao.equals("*")) {
            resultado = numero1 * numero2;
            tela.setText(String.valueOf(resultado));
        }else {
            if (numero1 == 0) {
                Toast.makeText(MainActivity.this, "0 não é divisivel", LENGTH_LONG).show();
            }else {
                resultado = numero1 / numero2;
                tela.setText(String.valueOf(resultado));
            }
        }
    }

    private void atualizaNumero(String numero) {
        if (operacao.isEmpty()){
            primeiroNumero = primeiroNumero + numero;
        }else {
            segundoNumero = segundoNumero + numero;
        }
    }

    public void onClickBotao0(View v) {
        atualizaNumero("0");
        atualizaDisplay("0");
    }

    public void onClickBotao1(View v) {
        atualizaNumero("1");
        atualizaDisplay("1");
    }

    public void onClickBotao2(View v) {
        atualizaNumero("2");
        atualizaDisplay("2");
    }
    public void onClickBotao3(View v) {
        atualizaNumero("3");
        atualizaDisplay("3");
    }
    public void onClickBotao4(View v) {
        atualizaNumero("4");
        atualizaDisplay("4");
    }
    public void onClickBotao5(View v) {
        atualizaNumero("5");
        atualizaDisplay("5");
    }
    public void onClickBotao6(View v) {
        atualizaNumero("6");
        atualizaDisplay("6");
    }
    public void onClickBotao7(View v) {
        atualizaNumero("7");
        atualizaDisplay("7");
    }
    public void onClickBotao8(View v) {
        atualizaNumero("8");
        atualizaDisplay("8");
    }
    public void onClickBotao9(View v) {
        atualizaNumero("9");
        atualizaDisplay("9");
    }

    public void onClickLimpar(View v) {
        tela.setText("");
        primeiroNumero = "";
        segundoNumero = "";
        operacao = "";
        resultado = 0;

    }

}