package by.bsuir.client.controller;

import by.bsuir.common.model.Profile;
import by.bsuir.common.service.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @Autowired
    private IProfileService profileService;

    @RequestMapping(value = "/profile/{accountId}", method = RequestMethod.GET)
    public Profile getProfileByAccountId(@PathVariable("accountId") long accountId){
        return profileService.getProfileByAccountId(accountId);
    }

    @RequestMapping(value = "/update_profile", method = RequestMethod.PUT)
    public void updateProfile(Profile profile){
        profileService.updateProfile(profile);
    }
}
