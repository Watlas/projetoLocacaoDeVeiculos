package br.com.pi.dal;


import br.com.pi.model.ClienteModel;
import br.com.pi.util.Conexao;
import br.com.pi.util.ICRUD_GENERIC;

import java.sql.Connection;
import java.util.List;

public class ClienteDal implements ICRUD_GENERIC {

    private Connection conexao;
    ClienteModel clienteModel = new ClienteModel();

    public ClienteDal() throws Exception {
        this.conexao = Conexao.getInstance().getConnection();
    }


    @Override
    public void add(Object objeto) throws Exception {
        clienteModel = (ClienteModel) objeto;
    }

    @Override
    public void delete(int n) throws Exception {

    }

    @Override
    public void update(Object objeto) throws Exception {

    }

    @Override
    public List getAll() throws Exception {
        return null;
    }

    @Override
    public Object getById(int n) throws Exception {
        return null;
    }

    @Override
    public Object getByNome(String nome) throws Exception {
        return null;
    }
}
