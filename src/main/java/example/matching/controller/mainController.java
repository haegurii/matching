package example.matching.controller;


import example.matching.entity.Matching;
import example.matching.dto.matchingDto;
import example.matching.repository.MatchingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

import example.matching.dto.qnaDto;
import example.matching.entity.Qna;
import example.matching.repository.QnaRepository;

import example.matching.dto.searchDto;
import example.matching.entity.Search;
import example.matching.repository.SearchRepository;

@Controller
@Slf4j
public class mainController {
    @Autowired
    private MatchingRepository matchRepository;

    @Autowired
    private QnaRepository qnaRepository;



    @GetMapping("/first")
    public String firstPage(Model model){

        return "page/first";
    }

    @GetMapping("/login")
    public String loginPage(){

        return "page/login";
    }

    @GetMapping("/qna")
    public String QnAPage(){
        return "page/qna";
    }


    @PostMapping("/qna/create")
    public String qnaCreate(qnaDto dto){


        Qna qna = dto.toEntity();
        log.info(qna.toString());

        Qna saved = qnaRepository.save(qna);


        return "page/first";
    }


    @GetMapping("/qna/qnaList")
    public String QnAListPage(Model model){
        List<Qna> qnaEntityList = qnaRepository.findAll();
        model.addAttribute("qnaList", qnaEntityList);
        return "page/admin_qnaList";
    }




    @GetMapping("/matchRegister")
    public String registerPage(){
        return "page/matchRegister";
    }

    @GetMapping("/matchList")
    public String listPage(searchDto dto, Model model){

        List<Matching> matchingEntityList = matchRepository.findAll();
        //log.info(matchingEntityList.toString());
        model.addAttribute("matchingList",matchingEntityList);

        Search search = dto.toEntity();
        System.out.println(search.toString());
        model.addAttribute("search",search);
        return "page/matchList";
    }

    @PostMapping("/matchRegister/create")
    public String matchCreate(matchingDto dto){



        Matching match = dto.toEntity();
        log.info(match.toString());

        Matching saved = matchRepository.save(match);


        return "redirect:/matchInfo/"+saved.getId();
    }

    @GetMapping("/matchInfo/stand/{id}")
    public String showMatch(@PathVariable Long id,Model model){

        Matching matchingEntity = matchRepository.findById(id).orElse(null);
        model.addAttribute("matching",matchingEntity);

        return "page/matchInfo";
    }

    @GetMapping("/matchInfo/{id}")
    public String show(@PathVariable Long id,Model model){

        Matching matchingEntity = matchRepository.findById(id).orElse(null);
        model.addAttribute("matching",matchingEntity);

        return "page/matchComplete";
    }

    @GetMapping("/join")
    public String join(){

        return "page/join";
    }




}
