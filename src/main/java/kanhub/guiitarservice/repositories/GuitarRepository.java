package kanhub.guiitarservice.repositories;

import kanhub.guiitarservice.domain.Guitar;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface GuitarRepository  extends PagingAndSortingRepository<Guitar, UUID> {
}
