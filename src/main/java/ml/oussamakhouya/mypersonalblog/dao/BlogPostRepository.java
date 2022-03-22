package ml.oussamakhouya.mypersonalblog.dao;

import ml.oussamakhouya.mypersonalblog.entity.BlogPost;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
    Page<BlogPost> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);
    Page<BlogPost> findByTitleContaining(@RequestParam("title") String title, Pageable pageable);
}
