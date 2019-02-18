/*
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.auth.profile;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class ProfileCredentialsProviderHighConcurrencyTest {

    // For generating fake AWS keys.
    private static final String ALLCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final Random RANDOM = new Random();
    private static final int THREAD_COUNT = 10;

    private static final long DEFAULT_REFRESH_INTERVAL_NANOS = 0L;
    private static final long DEFAULT_FORCE_RELOAD_INTERVAL_NANOS = 2 * DEFAULT_REFRESH_INTERVAL_NANOS;

    private static final String EXPIRED_KEY = generateRandomString(20);
    private static final String REFRESHED_KEY = generateRandomString(20);

    private static final String EXPIRED_CREDS = generateAWSCreds(EXPIRED_KEY);
    private static final String REFRESHED_CREDS = generateAWSCreds(REFRESHED_KEY);

    private static final String PROFILE = "default";

    private volatile AtomicInteger staleKeys = new AtomicInteger(0);
    private volatile AtomicInteger refreshedKeys = new AtomicInteger(0);

    @Test
    public void loadingCredentialsInParallel_GetsLatestCredsInAgeMoreThanForcedRefreshInterval() throws Exception {
        File profilesFile = File.createTempFile("UpdatableProfile", ".tst");

        // Save the first key to disk.
        FileUtils.writeStringToFile(profilesFile, EXPIRED_CREDS);

        // Setup the provider.
        final ProfileCredentialsProvider provider = new ProfileCredentialsProvider(profilesFile.getPath(), PROFILE);
        provider.setRefreshIntervalNanos(DEFAULT_REFRESH_INTERVAL_NANOS);
        provider.setRefreshForceIntervalNanos(DEFAULT_FORCE_RELOAD_INTERVAL_NANOS);

        // Sleep until provider expires creds.
        Thread.sleep(1000);

        // Swap out the credential.
        FileUtils.writeStringToFile(profilesFile, REFRESHED_CREDS);

        final CyclicBarrier barrier = new CyclicBarrier(THREAD_COUNT);

        // Thread runnable will increment the count in the map for the key it got.
        final Runnable credentialGetter = new Runnable() {
            @Override
            public void run() {
                try {
                    barrier.await(1, TimeUnit.SECONDS);
                    final String accessKey = provider.getCredentials().getAWSAccessKeyId();
                    if (EXPIRED_KEY.equals(accessKey)) {
                        staleKeys.incrementAndGet();
                    } else {
                        refreshedKeys.incrementAndGet();
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);
        for (int i = 0; i < THREAD_COUNT; ++i) {
            executorService.execute(credentialGetter);
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.SECONDS);

        // Assert
        assertEquals(0, staleKeys.intValue());
        assertEquals(THREAD_COUNT, refreshedKeys.intValue());
    }

    private static String generateRandomString(final int length) {
        final StringBuilder output = new StringBuilder();
        while (output.length() < length) {
            output.append(ALLCHARS.charAt((int) (RANDOM.nextFloat() * ALLCHARS.length())));
        }
        return output.toString();
    }

    private static String generateAWSCreds(final String accessKey) {
        return "[default]\n" +
               "aws_access_key_id = " + accessKey +  "\n" +
               "aws_secret_access_key = " + generateRandomString(40) + "\n" +
               "aws_session_token = " + generateRandomString(200) + "\n" +
               "aws_source_config_hash = " + generateRandomString(64);
    }
}
