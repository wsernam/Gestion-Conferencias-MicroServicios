/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notify.aplication;

import com.mycompany.notify.domain.Notify;
import com.mycompany.notify.domain.INotifyServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author William Andres
 */
@Service
public class NotifyServices {

    private final INotifyServices repositoryNotify;
    @Autowired
    public NotifyServices(INotifyServices repositoryNotify) {
        this.repositoryNotify = repositoryNotify;
    }
    
    public void saveNotify(Notify notify) {
        repositoryNotify.save(notify);
    }

    public List<Notify> getNotifyForUser(String userId) {
        return repositoryNotify.findByUsuarioId(userId);
    }
}
