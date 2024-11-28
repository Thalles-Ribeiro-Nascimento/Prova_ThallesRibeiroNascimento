package com.senac.ThallesNascimentoEmissorMS.repositories;

import com.senac.ThallesNascimentoEmissorMS.models.VooModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VooRepository extends JpaRepository<VooModel, Long> {
}
