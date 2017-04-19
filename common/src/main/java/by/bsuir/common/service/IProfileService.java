package by.bsuir.common.service;


import by.bsuir.common.model.Profile;

public interface IProfileService {
    Profile getProfileByAccountId(long accountId);
    void updateProfile(Profile profile);
}
