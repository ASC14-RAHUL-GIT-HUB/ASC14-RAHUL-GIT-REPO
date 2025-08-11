package com.friendsmaven.service;

import com.friendsmaven.entity.Friend;
import com.friendsmaven.repository.FriendRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FriendService {
    private final FriendRepository repo;
    public FriendService(FriendRepository repo) { this.repo = repo; }

    public List<Friend> findAll() { return repo.findAll(); }
    public Optional<Friend> findById(Long id) { return repo.findById(id); }
    public Friend save(Friend f) { return repo.save(f); }
    public void deleteById(Long id) { repo.deleteById(id); }
}
