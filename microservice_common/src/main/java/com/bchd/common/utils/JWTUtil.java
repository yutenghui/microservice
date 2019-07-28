package com.bchd.common.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import java.util.Date;
/**
 * @Author: yth
 * @Date: 2019-07-28 09:52
 * @Version 1.0
 * @Description
 */
@Data
public class JWTUtil {

    @Value("${jwt.config.key}")
    private String key ;

    @Value("${jwt.config.ttl}")
    private long ttl ;

    /**
     * 生成JWT
     *
     * @param id
     * @param subject
     * @return
     */
    public String createJWT(String id, String subject, String roles) {
        Date now = new Date(System.currentTimeMillis());
        JwtBuilder builder = Jwts.builder()
                        .setId(id)
                        .setSubject(subject)
                        .setIssuedAt(now)
                        .signWith(SignatureAlgorithm.HS256, key)
                        .claim("roles", roles);
        if (ttl > 0) {
            builder.setExpiration( new Date( System.currentTimeMillis() + ttl));
        }
        return builder.compact();
    }

    /**
     * 解析JWT
     * @param JWTStr
     * @return
     */
    public Claims parseJWT(String JWTStr){
        return  Jwts.parser()
                .setSigningKey(key)
                .parseClaimsJws(JWTStr)
                .getBody();
    }
}
