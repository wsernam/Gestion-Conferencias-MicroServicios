package com.mycompany.notify.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
//esto implementa toda el crud
public interface INotifyServices  extends JpaRepository <Notify, Long>{
    List<Notify> findByUsuarioId(String userId);
}