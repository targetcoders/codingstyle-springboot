package com.targetcoders.springbootcodingstyle.commandhistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandHistoryRepository extends JpaRepository<CommandHistory, Long> {

}
