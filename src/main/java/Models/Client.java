/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author hfyh
 */
public class Client extends User{
    private Subscription subscription;

     public Client(int id_user, String name, String username, String phone, int user_type, Sucursal sucursal, String email, Subscription subscription) {
        // Llama al constructor de la clase padre (User)
        super(id_user, name, username, phone, user_type, sucursal, email);
        
        // Inicializa el atributo específico de Client
        this.subscription = subscription;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }
    
    
    
}
