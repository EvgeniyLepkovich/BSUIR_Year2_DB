package by.bsuir.common.service.impl;

import by.bsuir.common.dao.ProfileDao;
import by.bsuir.common.model.Profile;
import by.bsuir.common.service.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService implements IProfileService {
    @Autowired
    private ProfileDao profileDao;

    @Override
    public Profile getProfileByAccountId(long accountId) {
        return profileDao.getProfileByAccountId(accountId);
    }

    @Override
    public void updateProfile(Profile profile) {
        profileDao.save(profile);
    }
}
