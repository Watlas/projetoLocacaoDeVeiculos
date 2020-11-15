package br.com.pi.dal;


import br.com.pi.model.ClienteModel;
import br.com.pi.util.Conexao;
import br.com.pi.util.ICRUD_GENERIC;

import java.sql.Connection;
import java.util.List;

public class ClienteDal implements ICRUD_GENERIC {

    private Connection conexao;
    ClienteModel usuario = new ClienteModel();

    public ClienteDal() throws Exception {
        this.conexao = Conexao.getInstance().getConnection();
    }

    @Override
    public void Add(Object objeto) throws Exception {

    }

    @Override
    public void Delete(int n) throws Exception {

    }

    @Override
    public void Update(Object objeto) throws Exception {

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
