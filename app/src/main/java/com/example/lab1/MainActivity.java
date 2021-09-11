package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Программа описывающая функции выбора <b>минимального</b> и <b>максимального</b> элемента из трёх поданных элементов
 * @author Пещеров Вячеслав и Огорелков Артём
 * @version 1.0
 */

/**
 * Основной класс MainActivity
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Функция myMIN - выбирает минимальный элемент из трёх поданных
     * @param a - первое число
     * @param b - второе число
     * @param c - третье число
     * @return - минимальное число из трёх чисел
     */
    public int myMIN(int a,int b,int c){

        if(a<=b && a<=c){
            return a;
        }

        if(b<=a && b<=c) {
            return b;
        }

        if(c<=a && c<=b){
            return c;
        }

        return a;

    }

    /**
     * Функция myMAX - выбирает максимальный элемент их трёх поданных
     * @param a - первый элемент
     * @param b - второй элемент
     * @param c - третий элемент
     * @return - максимальный элемент из трёх
     */
    public int myMAX(int a,int b,int c){

        if(a>=b && a>=c){
            return a;
        }

        if(b>=a && b>=c) {
            return b;
        }

        if(c>=a && c>=b){
            return c;
        }

        return a;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}