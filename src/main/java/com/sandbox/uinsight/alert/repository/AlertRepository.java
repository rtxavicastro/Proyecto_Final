package com.sandbox.uinsight.alert.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sandbox.uinsight.alert.model.Alert;

public interface AlertRepository extends JpaRepository<Alert, Long> {
}