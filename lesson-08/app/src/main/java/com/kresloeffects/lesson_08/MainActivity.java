package com.kresloeffects.lesson_08;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnMultip;
    private Button btnDevide;
    private Button btnEqally;
    private Button btnCancel;

    private TextView resultView;
    private TextView dataView;

    private String error;

    private String firstNmb = "";
    private String lastNmb = "";
    private String resultNmb;
    private int operation=0;
    private String data = "";

    private static final String KEY_RESULT= "result";
    private static final String KEY_DATA = "data";
    private static final String KEY_FIRST_NMB = "first";
    private static final String KEY_LAST_NMB = "last";
    private static final String KEY_OPERATION = "operation";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.butt_1);
        btn2 = (Button)findViewById(R.id.butt_2);
        btn3 = (Button)findViewById(R.id.butt_3);
        btn4 = (Button)findViewById(R.id.butt_4);
        btn5 = (Button)findViewById(R.id.butt_5);
        btn6 = (Button)findViewById(R.id.butt_6);
        btn7 = (Button)findViewById(R.id.butt_7);
        btn8 = (Button)findViewById(R.id.butt_8);
        btn9 = (Button)findViewById(R.id.butt_9);
        btn0 = (Button)findViewById(R.id.butt_0);
        btnPlus = (Button)findViewById(R.id.butt_plus);
        btnMinus = (Button)findViewById(R.id.butt_minus);
        btnMultip = (Button)findViewById(R.id.butt_multip);
        btnDevide = (Button)findViewById(R.id.butt_devide);
        btnEqally = (Button)findViewById(R.id.butt_eqally);
        btnCancel = (Button)findViewById(R.id.butt_cancel);

        resultView = (TextView)findViewById(R.id.result);
        dataView = (TextView)findViewById(R.id.data);

        error = getString(R.string.error);

        View.OnClickListener onClickListenerCansel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNmb="";
                lastNmb="";
                operation=0;
                data="";
                dataView.setText("");
                resultView.setText("");
            }
        };
        btnCancel.setOnClickListener(onClickListenerCansel);

        View.OnClickListener onClickListenerBtn1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultView.getText().equals(error)){
                    btnCancel.callOnClick();
                }
                if(operation==0){
                    firstNmb+=1;
                    data+=1;
                }
                else{
                    lastNmb+=1;
                    data+=1;
                }
                dataView.setText(data);
            }
        };
        btn1.setOnClickListener(onClickListenerBtn1);

        View.OnClickListener onClickListenerBtn2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultView.getText().equals(error)){
                    btnCancel.callOnClick();
                }
                if(operation==0){
                    firstNmb+=2;
                    data+=2;
                }
                else{
                    lastNmb+=2;
                    data+=2;
                }
                dataView.setText(data);
            }
        };
        btn2.setOnClickListener(onClickListenerBtn2);

        View.OnClickListener onClickListenerBtn3 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultView.getText().equals(error)){
                    btnCancel.callOnClick();
                }
                if(operation==0){
                    firstNmb+=3;
                    data+=3;
                }
                else{
                    lastNmb+=3;
                    data+=3;
                }
                dataView.setText(data);
            }
        };
        btn3.setOnClickListener(onClickListenerBtn3);

        View.OnClickListener onClickListenerBtn4 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultView.getText().equals(error)){
                    btnCancel.callOnClick();
                }
                if(operation==0){
                    firstNmb+=4;
                    data+=4;
                }
                else{
                    lastNmb+=4;
                    data+=4;
                }
                dataView.setText(data);
            }
        };
        btn4.setOnClickListener(onClickListenerBtn4);

        View.OnClickListener onClickListenerBtn5 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultView.getText().equals(error)){
                    btnCancel.callOnClick();
                }
                if(operation==0){
                    firstNmb+=5;
                    data+=5;
                }
                else{
                    lastNmb+=5;
                    data+=5;
                }
                dataView.setText(data);
            }
        };
        btn5.setOnClickListener(onClickListenerBtn5);

        View.OnClickListener onClickListenerBtn6 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultView.getText().equals(error)){
                    btnCancel.callOnClick();
                }
                if(operation==0){
                    firstNmb+=6;
                    data+=6;
                }
                else{
                    lastNmb+=6;
                    data+=6;
                }
                dataView.setText(data);
            }
        };
        btn6.setOnClickListener(onClickListenerBtn6);

        View.OnClickListener onClickListenerBtn7 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultView.getText().equals(error)){
                    btnCancel.callOnClick();
                }
                if(operation==0){
                    firstNmb+=7;
                    data+=7;
                }
                else{
                    lastNmb+=7;
                    data+=7;
                }
                dataView.setText(data);
            }
        };
        btn7.setOnClickListener(onClickListenerBtn7);

        View.OnClickListener onClickListenerBtn8 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultView.getText().equals(error)){
                    btnCancel.callOnClick();
                }
                if(operation==0){
                    firstNmb+=8;
                    data+=8;
                }
                else{
                    lastNmb+=8;
                    data+=8;
                }
                dataView.setText(data);
            }
        };
        btn8.setOnClickListener(onClickListenerBtn8);

        View.OnClickListener onClickListenerBtn9 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultView.getText().equals(error)){
                    btnCancel.callOnClick();
                }
                if(operation==0){
                    firstNmb+=9;
                    data+=9;
                }
                else{
                    lastNmb+=9;
                    data+=9;
                }
                dataView.setText(data);
            }
        };
        btn9.setOnClickListener(onClickListenerBtn9);

        View.OnClickListener onClickListenerBtn0 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultView.getText().equals(error)){
                    btnCancel.callOnClick();
                }
                if(operation==0){
                    firstNmb+=0;
                    data+=0;
                }
                else{
                    lastNmb+=0;
                    data+=0;
                }
                dataView.setText(data);
            }
        };
        btn0.setOnClickListener(onClickListenerBtn0);

        View.OnClickListener onClickListenerPlus = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data.charAt(data.length()-1)=='+'||data.charAt(data.length()-1)=='-'||data.charAt(data.length()-1)=='*'||data.charAt(data.length()-1)=='/'){
                    return;
                }
                if(operation == 0){
                    operation = 1;
                    data+="+";
                }
                else{
                    firstNmb = String.valueOf(Calculate(operation));
                    resultView.setText(resultNmb);
                    lastNmb = "";
                    operation =1;
                    data+="+";
                }
                dataView.setText(data);
            }
        };
        btnPlus.setOnClickListener(onClickListenerPlus);

        View.OnClickListener onClickListenerMinus = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data.charAt(data.length()-1)=='+'||data.charAt(data.length()-1)=='-'||data.charAt(data.length()-1)=='*'||data.charAt(data.length()-1)=='/'){
                    return;
                }
                if(operation == 0){
                    operation = 2;
                    data+="-";
                }
                else{
                    firstNmb = String.valueOf(Calculate(operation));
                    resultView.setText(resultNmb);
                    lastNmb = "";
                    operation = 2;
                    data+="-";
                }
                dataView.setText(data);
            }
        };
        btnMinus.setOnClickListener(onClickListenerMinus);

        View.OnClickListener onClickListenerMultip = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data.charAt(data.length()-1)=='+'||data.charAt(data.length()-1)=='-'||data.charAt(data.length()-1)=='*'||data.charAt(data.length()-1)=='/'){
                    return;
                }
                if(operation == 0){
                    operation = 3;
                    data+="*";
                }
                else{
                    firstNmb = String.valueOf(Calculate(operation));
                    resultView.setText(resultNmb);
                    lastNmb = "";
                    operation =3;
                    data+="*";
                }
                dataView.setText(data);
            }
        };
        btnMultip.setOnClickListener(onClickListenerMultip);

        View.OnClickListener onClickListenerDevide = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data.charAt(data.length()-1)=='+'||data.charAt(data.length()-1)=='-'||data.charAt(data.length()-1)=='*'||data.charAt(data.length()-1)=='/'){
                    return;
                }
                if(operation == 0){
                    operation = 4;
                    data+="/";
                }
                else{
                    firstNmb = String.valueOf(Calculate(operation));
                    resultView.setText(resultNmb);
                    lastNmb = "";
                    operation =4;
                    data+="/";
                }
                dataView.setText(data);
            }
        };
        btnDevide.setOnClickListener(onClickListenerDevide);

        View.OnClickListener onClickListenerEqally = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data.charAt(data.length()-1)=='+'||data.charAt(data.length()-1)=='-'||data.charAt(data.length()-1)=='*'||data.charAt(data.length()-1)=='/'){
                    return;
                }
                if(firstNmb.equals("")||lastNmb.equals("")){
                    return;
                }
                if(operation!=0) {
                    resultView.setText(String.valueOf(Calculate(operation)));
                    firstNmb = "";
                    lastNmb = "";
                    operation = 0;
                    data = "";
                    dataView.setText("");
                }
            }
        };
        btnEqally.setOnClickListener(onClickListenerEqally);

    }
    private String Calculate(int typeOperation){
        if(typeOperation == 0){

        }
        if(typeOperation == 1){
            resultNmb = String.valueOf(Integer.valueOf(firstNmb)+Integer.valueOf(lastNmb));
        }
        if(typeOperation == 2){
            resultNmb = String.valueOf(Integer.valueOf(firstNmb)-Integer.valueOf(lastNmb));
        }
        if(typeOperation == 3){
            resultNmb = String.valueOf(Integer.valueOf(firstNmb)*Integer.valueOf(lastNmb));
        }
        if(typeOperation == 4){
            if(Integer.valueOf(lastNmb) == 0){
                return error;
            }
            else{
                resultNmb = String.valueOf(Integer.valueOf(firstNmb)/Integer.valueOf(lastNmb));
            }
        }
        return resultNmb;
    }

    @Override
    protected void onSaveInstanceState(Bundle outInstanceState) {
        super.onSaveInstanceState(outInstanceState);

        outInstanceState.putString(KEY_RESULT, resultNmb);
        outInstanceState.putString(KEY_DATA, data);
        outInstanceState.putString(KEY_FIRST_NMB, firstNmb);
        outInstanceState.putString(KEY_LAST_NMB, lastNmb);
        outInstanceState.putInt(KEY_OPERATION, operation);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        resultNmb = savedInstanceState.getString(KEY_RESULT);
        data = savedInstanceState.getString(KEY_DATA);
        firstNmb = savedInstanceState.getString(KEY_FIRST_NMB);
        lastNmb = savedInstanceState.getString(KEY_LAST_NMB);
        operation = savedInstanceState.getInt(KEY_OPERATION);

        resultView.setText(String.valueOf(savedInstanceState.getInt(KEY_RESULT)));
        dataView.setText(savedInstanceState.getString(KEY_DATA));
    }
}
