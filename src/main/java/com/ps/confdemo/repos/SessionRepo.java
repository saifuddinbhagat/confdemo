package com.ps.confdemo.repos;

import com.ps.confdemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepo extends JpaRepository<Session, Long> {
}
