package br.com.fiap.api_rest.repository;

import br.com.fiap.api_rest.model.Cliente;
import ch.qos.logback.core.net.server.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // ID
    List<Cliente> findByIdStartWith (Long prefix);

    // Nome
    List<Cliente> findByNome (String nome);
    List<Cliente> findByNomels(String nome);
    List<Cliente> FindByNomeEquals(String nome);
    List<Cliente> findByNomeEqualsIgnoreCase(String nome);
    List<Cliente> findByNameNot(String none);
    List<Cliente> findByNomeIsNot(String nome);
    List<Cliente> findByNomeIsNotEquals(String nome);

    // IDADE
    List<Cliente> findTop3ByIdade(int idade);
    List<Cliente> findByEmailIsNull();
    List<Cliente> findByEmailIsNotNull();

    // EMAIL
    List<Cliente> findByEmail(String email);
    List<Cliente> findByEmailContains(String partialEmail);
    List<Cliente> findByEmailIgnoreCase(String email);
    List<Cliente> findByEmailNot(String email);

    // DATA NASCIMENTO
    List<Cliente> findByDataNascimento(Date DatNas);
    List<Cliente> findByDataNascimentoBefore(Date DatNas);
    List<Cliente> findByDataNascimentoAfter(Date DatNas);
    List<Cliente> findByDataNascimentoBetween(Date startDate, Date endDate);
    List<Cliente> findByDataNascimentoIsNull();
    List<Cliente> findTop3ByDataNascimento(Date DatNas);
    List<Cliente> findByDatNasEquals(Date DatNas);
    List<Cliente> findByDatNasNot(Date DatNas);

    // VIP
    List<Client> findByVipTrue();
    List<Client> findByVipFalse();

}
