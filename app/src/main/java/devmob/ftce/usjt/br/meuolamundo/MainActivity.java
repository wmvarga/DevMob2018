/**
 * RA: 81612389
 * Nome: William Morone Varga
 */

package devmob.ftce.usjt.br.meuolamundo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

//constante static para identificar a mensagem
public final static String EXTRA_MESSAGE = "br.usjt.meuprimeiroapp.MESSAGE";

//sendMessage, método que será executado pelo botão Enviar
public void sendMessage(View view) {
    Intent intent = new Intent(this, DisplayMessageActivity.class);
    EditText editText = (EditText) findViewById(R.id.edit_message);
    String message = editText.getText().toString();
    intent.putExtra(EXTRA_MESSAGE, message);
    startActivity(intent);
}
