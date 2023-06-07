package org.tradieBid.services;


import org.tradieBid.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomainService {
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private ProjectBidRepository projectBidRepository;

    public Bid getWinningBid(Long projectId) {
        Bid bid = projectBidRepository.findByProjectIdOrderByBidAmountAsc(projectId);
        return bid;
    }

    public Bid saveBid(Bid bid) {
       return projectBidRepository.save(bid);
    }
}
