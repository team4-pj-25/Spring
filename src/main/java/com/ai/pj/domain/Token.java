package com.ai.pj.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;

import java.io.Serializable;
import java.util.UUID;

@RedisHash("Token")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Token implements Serializable {

    @Id
    private String id;

    private String refreshToken;

    @TimeToLive // TTL 설정 (초 단위)
    private Long expiration;
}
