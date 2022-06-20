package com.shop.repository;

import com.shop.entity.ItemImg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemImgRepository extends JpaRepository<ItemImg, Long> {

    //테스트 코드 작성을 위한 코드
    List<ItemImg> findByItemIdOrderByIdAsc(Long itemId);
}

