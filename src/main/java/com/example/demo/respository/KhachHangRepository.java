package com.example.demo.respository;

import com.example.demo.Entity.KhachHang;
import com.example.demo.Entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, Integer> {
}
