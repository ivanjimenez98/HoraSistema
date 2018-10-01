/* 
 * Copyright 2018 Iván Jiménez González.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author CicloM
 */
public class Main {

    public static void main(String[] arg) {
        GregorianCalendar gc = new GregorianCalendar();
        int hora = gc.get(Calendar.HOUR_OF_DAY);
        int minuto = gc.get(Calendar.MINUTE);
        int segundo = gc.get(Calendar.SECOND);
        System.out.printf("Hora del sistema... : %02d:%02d:%02d%n", hora, minuto, segundo);
        //comment
    }
}
