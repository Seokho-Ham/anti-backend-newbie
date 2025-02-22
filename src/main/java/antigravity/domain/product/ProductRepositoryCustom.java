package antigravity.domain.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductRepositoryCustom {

    Page<Product> findProductsByStatus(Long memberId, LikeStatus liked, Pageable pageable);

}
