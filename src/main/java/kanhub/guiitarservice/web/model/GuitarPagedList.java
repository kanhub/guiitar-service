package kanhub.guiitarservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class GuitarPagedList extends PageImpl<GuitarDto> {
    public GuitarPagedList(List<GuitarDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public GuitarPagedList(List<GuitarDto> content) {
        super(content);
    }
}
