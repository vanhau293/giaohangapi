package com.example.demo.respository;

import com.example.demo.Entity.NhomCanNang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhomCanNangRepository extends JpaRepository<NhomCanNang, Integer> {
}