package tech.phenom.online_banking_system.utils;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Getter
@Setter
@Slf4j
@MappedSuperclass
public abstract class BaseEntity {

    @Column(name = "created_at",nullable = false,updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    public void onCreate(){
    this.createdAt=LocalDateTime.now();
    this.updatedAt=LocalDateTime.now();
    log.info("Entity created at: {}", this.createdAt);

    }

    @PreUpdate
    public void onUpdate(){
        this.updatedAt=LocalDateTime.now();
        log.info("Entity created at: {}", this.updatedAt);

    }


}
