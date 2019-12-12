package repository;

import entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query("SELECT c FROM Client c WHERE c.balance > 10")
    Collection<Client> findRichClients();
}
