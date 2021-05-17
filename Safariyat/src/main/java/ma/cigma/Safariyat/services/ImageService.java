package ma.cigma.Safariyat.services;

import ma.cigma.Safariyat.models.Image;

public interface ImageService {

	Image save(Image i);

	Image findImage(Long id);

	Iterable<Image> findAll();

	void deleteImage(Long id);
}
