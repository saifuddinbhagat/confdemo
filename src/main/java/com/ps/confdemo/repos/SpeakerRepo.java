package com.ps.confdemo.repos;

import com.ps.confdemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepo extends JpaRepository<Speaker, Long> {
}
