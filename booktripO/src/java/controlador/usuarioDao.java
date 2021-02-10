/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.usuario;

public class usuarioDao {

    //consultar
    public usuario consultarUsuario(String email) {

        usuario user = null;

        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        try {
            Statement sentencia = newConexion.createStatement();

            String sql = "select idUsuario, idTipoDocumento,numDocu, idRol, nombre, apellido, direccion, telefono, fechaNacimiento, email, password "
                    + " FROM usuarios WHERE email = +'" + email + "'";
            //filas columnas
            ResultSet rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                user = new usuario();
                user.setIdUsuario(rs.getInt(1));
                user.setIdTipoDocumento(rs.getInt(2));
                user.setNumDocu(rs.getInt(3));
                user.setIdRol(rs.getInt(4));
                user.setNombre(rs.getString(5));
                user.setApellido(rs.getString(6));
                user.setDireccion(rs.getString(7));
                user.setTelefono(rs.getInt(8));
                user.setFechaNacimiento(rs.getString(9));
                user.setEmail(rs.getString(10));
                user.setPassword(rs.getString(11));

            }

            return user;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return user;
        }
    }

    public ArrayList<usuario> ListadoUsuarios(String criterio) {

        ArrayList<usuario> listadoUsuarios = new ArrayList<usuario>();
        usuario user;

        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        try {
            Statement sentencia = newConexion.createStatement();

            String sql = " SELECT idUsuario, idTipoDocumento, numDocu, idRol, nombre, apellido, direccion, telefono, fechaNacimiento, email, password "
                    + "FROM usuarios where nombre like '%" + criterio + "%' ORDER BY idUsuario;";

            ResultSet rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                user = new usuario();

                user.setIdUsuario(rs.getInt(1));
                user.setIdTipoDocumento(rs.getInt(2));
                user.setNumDocu(rs.getInt(3));
                user.setIdRol(rs.getInt(4));
                user.setNombre(rs.getString(5));
                user.setApellido(rs.getString(6));
                user.setDireccion(rs.getString(7));
                user.setTelefono(rs.getInt(8));
                user.setFechaNacimiento(rs.getString(9));
                user.setEmail(rs.getString(10));
                user.setPassword(rs.getString(11));
                listadoUsuarios.add(user);

            }

            return listadoUsuarios;

        } catch (Exception e) {
            System.out.println("Erro en el listado " + e.getMessage());
            return listadoUsuarios;

        }

    }

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();

    public List listar() {
        List<usuario> lista = new ArrayList<>();
        String sql = "select * from usuarios";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                usuario p = new usuario();
                p.setIdUsuario(rs.getInt(1));
                p.setIdTipoDocumento(rs.getInt(2));
                p.setNumDocu(rs.getInt(3));
                p.setIdRol(rs.getInt(4));
                p.setNombre(rs.getString(5));
                p.setApellido(rs.getString(6));
                p.setDireccion(rs.getString(7));
                p.setTelefono(rs.getInt(8));
                p.setFechaNacimiento(rs.getString(9));
                p.setEmail(rs.getString(10));
                p.setPassword(rs.getString(11));

                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public usuario listarId(int id) {
        String sql = "select * from usuarios where idUsuario=" + id;
        usuario pe = new usuario();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdUsuario(rs.getInt(1));
                pe.setIdTipoDocumento(rs.getInt(2));
                pe.setNumDocu(rs.getInt(3));
                pe.setIdRol(rs.getInt(4));
                pe.setNombre(rs.getString(5));
                pe.setApellido(rs.getString(6));
                pe.setDireccion(rs.getString(7));
                pe.setTelefono(rs.getInt(8));
                pe.setFechaNacimiento(rs.getString(9));
                pe.setEmail(rs.getString(10));
                pe.setPassword(rs.getString(11));
            }
        } catch (Exception e) {
        }
        return pe;
    }

    public void agregar(usuario p) {
        String sql = "insert into usuarios(idTipoDocumento, numDocu, idRol, nombre, apellido, direccion,"
                + " telefono, fechaNacimiento, email, password)values(?,?,?,?,?,?,?,?,?,?)";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getIdTipoDocumento());
            ps.setInt(2, p.getNumDocu());
            ps.setInt(3, p.getIdRol());
            ps.setString(4, p.getNombre());
            ps.setString(5, p.getApellido());
            ps.setString(6, p.getDireccion());
            ps.setInt(7, p.getTelefono());
            ps.setString(8, p.getFechaNacimiento());
            ps.setString(9, p.getEmail());
            ps.setString(10, p.getPassword());

            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void update(usuario p) {
        String sql = "update usuarios set idTipoDocumento=?,numDocu=?, idRol=?, "
                + "nombre=?,apellido=?,direccion=?,telefono=?, fechaNacimiento=?,"
                + " email=?, password=? where idUsuario=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);

            ps.setInt(1, p.getIdTipoDocumento());
            ps.setInt(2, p.getNumDocu());
            ps.setInt(3, p.getIdRol());
            ps.setString(4, p.getNombre());
            ps.setString(5, p.getApellido());
            ps.setString(6, p.getDireccion());
            ps.setInt(7, p.getTelefono());
            ps.setString(8, p.getFechaNacimiento());
            ps.setString(9, p.getEmail());
            ps.setString(10, p.getPassword());
            ps.setInt(11, p.getIdUsuario());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void delete(int id) {
        String sql = "delete from usuarios where idUsuario=" + id;
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

   
}
