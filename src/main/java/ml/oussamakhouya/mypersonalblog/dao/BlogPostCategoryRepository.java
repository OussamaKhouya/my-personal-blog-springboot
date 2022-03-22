package ml.oussamakhouya.mypersonalblog.dao;

import ml.oussamakhouya.mypersonalblog.entity.BlogPost;
import ml.oussamakhouya.mypersonalblog.entity.BlogPostCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "blogPostCategory", path = "blogPost-category")
public interface BlogPostCategoryRepository extends JpaRepository<BlogPostCategory, Long> {



}
