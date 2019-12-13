package repository;

import entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.UUID;


@Repository
public interface ClientRepository extends JpaRepository<Client, UUID> {
    @Query("SELECT c FROM Client c WHERE c.balance >= 10 ")
    Collection<Client> findRichClients();

    @Query("select b.client  from Booking b where  b.land.company.companyName = 'NTT'")
    Collection<Client> findNTTClients();


}
