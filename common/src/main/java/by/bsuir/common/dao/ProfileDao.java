package by.bsuir.common.dao;

import by.bsuir.common.model.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileDao extends CrudRepository<Profile, Long> {
    Profile getProfileByAccountId(long accountId);
}
