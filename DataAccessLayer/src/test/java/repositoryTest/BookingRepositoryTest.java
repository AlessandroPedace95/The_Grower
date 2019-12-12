package repositoryTest;

import configuration.TestConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

@DataJpaTest
@ContextConfiguration(classes = TestConfiguration.class)
public class BookingRepositoryTest {
}
