package com.friendsmaven.repository;

import com.friendsmaven.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend, Long> {}
