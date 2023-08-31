package com.jyujyu.dayonetest.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.*;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

import java.net.URI;
import java.util.List;

@Configuration
public class S3Config {
    @Value("${aws.endpoint}")
    String awsEndpoint;

    @Bean
    public AwsCredentialsProvider awsCredentialsProvider() {
        return AwsCredentialsProviderChain.builder()
                .reuseLastProviderEnabled(true)
                .credentialsProviders(List.of(
                        DefaultCredentialsProvider.create(),
                        StaticCredentialsProvider.create(AwsBasicCredentials.create("foo", "bar"))
                ))
                .build();
    }

    @Bean
    public S3Client s3Client() {
        return S3Client.builder()
                .credentialsProvider(awsCredentialsProvider())
                .region(Region.AP_NORTHEAST_2)
                .endpointOverride(URI.create(awsEndpoint))
                .build();
    }
}
