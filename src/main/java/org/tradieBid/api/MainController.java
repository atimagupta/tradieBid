package org.tradieBid.api;

import org.tradieBid.domain.Bid;
import org.tradieBid.services.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private DomainService domainService;

    @GetMapping("/winnerBid")
    public Bid getWinnerBid(@RequestParam String projectId) {
        return domainService.getWinningBid(Long.valueOf(projectId));
    }

    
    @PostMapping("/bid")
    public ResponseEntity<Bid> createBid(@RequestBody Bid bid){
       Bid savedBid =  domainService.saveBid(bid);
        return ResponseEntity.ok(savedBid);
    }
}
