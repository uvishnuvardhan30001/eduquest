package com.klef.jfsd.sdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.klef.jfsd.sdp.model.ContentCreator;
import com.klef.jfsd.sdp.model.Student;

import jakarta.transaction.Transactional;
@Repository
public interface ContentCreatorRepository extends JpaRepository<ContentCreator, Integer>
{
	@Query("select cc from ContentCreator cc where cc.email=?1 and cc.password=?2") 
	 public ContentCreator checkContentCreatorLogin(String email, String password);
	@Query("update ContentCreator cc set cc.status=?1 where cc.id=?2 ")
	  @Modifying
	  @Transactional
	   public int updateccstatus(String status,int ccid);
}
