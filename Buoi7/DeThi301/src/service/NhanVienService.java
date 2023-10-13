/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import model.NhanVien;

/**
 *
 * @author nctuan
 */
public class NhanVienService {

    public List<NhanVien> getAll() {
        String query = "SELECT Id, Ma, Ho, TenDem, Ten, GioiTinh, DiaChi, NgaySinh FROM NhanVien;";

        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<NhanVien> lists = new ArrayList<>();
            while (rs.next()) {
                NhanVien nhanVien
                        = new NhanVien(rs.getString(1),
                                rs.getString(2), rs.getString(3),
                                rs.getString(4), rs.getString(5), rs.getString(6),
                                rs.getString(7), rs.getDate(8));
                lists.add(nhanVien);
            }
            return lists;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(NhanVien nhanVien) {
        int check = 0;
        String query = """
                   INSERT INTO NhanVien
                                (Id, Ma, Ho, TenDem, Ten, GioiTinh, DiaChi, NgaySinh)
                                VALUES(?,?,?,?,?,?,?,?);
                     """;
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            String uniqueID = UUID.randomUUID().toString();
            ps.setObject(1, uniqueID);
            ps.setObject(2, nhanVien.getMa());
            ps.setObject(3, nhanVien.getHo());
            ps.setObject(4, nhanVien.getTenDem());
            ps.setObject(5, nhanVien.getTen());
            ps.setObject(6, nhanVien.getGioiTinh());
            ps.setObject(7, nhanVien.getDiaChi());
            ps.setObject(8, nhanVien.getNgaySinh());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String id) {
        int check = 0;
        String query = """
                        DELETE FROM NhanVien              
                        WHERE Id = ?
                     """;
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(NhanVien nhanVien, String id) {
     int check = 0;
        String query = """
                   UPDATE NhanVien
                       SET 
                           Ma=?, Ho=?, TenDem=?, Ten=?, GioiTinh=?, DiaChi= ?, NgaySinh=?
                       WHERE
                           Id=?
                     """;
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, nhanVien.getMa());
            ps.setObject(2, nhanVien.getHo());
            ps.setObject(3, nhanVien.getTenDem());
            ps.setObject(4, nhanVien.getTen());
            ps.setObject(5, nhanVien.getGioiTinh());
            ps.setObject(6, nhanVien.getDiaChi());
            ps.setObject(7, nhanVien.getNgaySinh());
            ps.setObject(8, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

}
