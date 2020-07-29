package com.logaggregator.elk.commentservice.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Comment {
    private final Long id;
    private final Long postId;
    private final String content;
}
