package one.digitalInovation.crud.salareuniao.salareuniao.repository;

import one.digitalInovation.crud.salareuniao.salareuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {


}