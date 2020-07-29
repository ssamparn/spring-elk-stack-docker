package com.logaggregator.elk.postservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    protected Long id;
    protected String title;
    protected String content;
    protected OffsetDateTime publishDateTime;
}
