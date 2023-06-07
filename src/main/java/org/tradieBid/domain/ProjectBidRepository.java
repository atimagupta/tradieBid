package org.tradieBid.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectBidRepository extends JpaRepository<Bid, Integer> {

   Bid findByProjectIdOrderByBidAmountAsc(Long id);
}

