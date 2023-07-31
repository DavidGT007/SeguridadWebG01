/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sysseguridadg01.appweb.utils;

/**
 *
 * @author Alumno
 */

import java.io.IOException;
import javax.servlet.ServletException;


/*
Essta interfaz la usaremos para usar una expresion lamda,
al momento de autorizar un usuario al servlet
*/

public interface IAuthorize {
    void authorize () throws ServletException, IOException;
}
