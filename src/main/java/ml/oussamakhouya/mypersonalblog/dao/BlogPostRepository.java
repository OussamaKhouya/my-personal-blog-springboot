package ml.oussamakhouya.mypersonalblog.dao;

import ml.oussamakhouya.mypersonalblog.entity.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}
