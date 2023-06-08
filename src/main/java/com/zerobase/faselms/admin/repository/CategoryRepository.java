package com.zerobase.faselms.admin.repository;


import com.zerobase.faselms.admin.entity.Category;
import com.zerobase.faselms.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
