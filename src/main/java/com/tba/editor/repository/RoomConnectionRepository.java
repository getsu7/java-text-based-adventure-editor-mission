package com.tba.editor.repository;

import com.tba.editor.entity.RoomConnection;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RoomConnectionRepository extends JpaRepository<RoomConnection, Integer> { }
