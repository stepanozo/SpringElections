/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elections.NewExceptions;

import lombok.Getter;

/**
 *
 * @author чтепоноза
 */
public class InvalidUserDeleteException extends Exception {
   
    @Getter
    private final String login;
    
    public InvalidUserDeleteException(String message, String login){
        super(message);
        this.login = login;
    }
}
