package life.majiang.community.community.controller;

import life.majiang.community.community.Provider.GithubProvider;
import life.majiang.community.community.dto.AccessTokenDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;
    @GetMapping("/callback")
    public String callback(@RequestParam(name="code") String code,
                           @RequestParam(name="state") String state)
    {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri("http://localhost:8887/callback");
        accessTokenDTO.setClient_id("1af546511dca27a9b8d8");
        accessTokenDTO.setClient_secret("a7b3f6b4039742687f2f730cc0acffef1e979130");
        accessTokenDTO.setState(state);
        githubProvider.getAccessToken(accessTokenDTO);
            return "index";
    }
}
