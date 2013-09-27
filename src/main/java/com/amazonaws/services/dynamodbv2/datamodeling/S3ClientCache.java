/*
 * Copyright 2011-2013 Amazon Technologies, Inc.
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
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Region;
import com.amazonaws.services.s3.transfer.TransferManager;

/**
 * A smart Map for {@link AmazonS3Client} objects. {@link S3ClientCache} keeps the
 * clients organized by region, and if provided {@link AWSCredentials} will
 * create clients on the fly. Otherwise it just return clients given to it with
 * {@link #useClient(AmazonS3Client)}.
 */
public class S3ClientCache {
    private final ConcurrentMap<Region, AmazonS3Client> clientsByRegion = new ConcurrentHashMap<Region, AmazonS3Client>();
    private final Map<Region, TransferManager> transferManagersByRegion = new EnumMap<Region, TransferManager>(Region.class);

    private final AWSCredentials credentials;

    /**
     * Create a client cache with a set of credentials. If
     * {@link #getClient(Regions)} or {@link #getTransferManager(Regions)} is
     * called and a client has not been provided for the region, the cache will
     * instantiate one from the provided {@link AWSCredentials}.
     *
     * @param credentials
     *            The credentials to use when creating new
     *            {@link AmazonS3Client}.
     */
    S3ClientCache(AWSCredentials credentials) {
        this.credentials = credentials;
    }

    /**
     * Force the client cache to provide a certain client for the region which
     * that client is configured. This can be useful to provide clients with
     * different {@link com.amazonaws.services.s3.S3ClientOptions} or use a
     * {@link com.amazonaws.services.s3.AmazonS3EncryptionClient} in place of a
     * regular client.
     *
     * Using a new client will also forcibly shut down any
     * {@link TransferManager} that has been instantiated with that client, with
     * the {@link TransferManager#shutdownNow()} method.
     *
     * @param client
     *            An {@link AmazonS3Client} to use in the cache. Its region will
     *            be detected automatically.
     */
    public void useClient(AmazonS3Client client) {
        Region s3region = client.getRegion();

        synchronized (transferManagersByRegion) {
            TransferManager tm = transferManagersByRegion.remove(s3region);
            if (tm != null) {
                tm.shutdownNow();
            }
            clientsByRegion.put(s3region, client);
        }
    }

    /**
     * Returns a client for the requested region, or throws an exception when
     * unable.
     *
     * @param s3region
     *            The region the returned {@link AmazonS3Client} will be
     *            configured to use.
     * @return A client for the given region from the cache, either instantiated
     *         automatically from the provided {@link AWSCredentials} or
     *         provided with {@link #useClient(AmazonS3Client)}.
     * @throws IllegalArgumentException
     *             When a region is requested that has not been provided to the
     *             cache with {@link #useClient(AmazonS3Client)}, and the cache
     *             has no {@link AWSCredentials} with which a client may be
     *             instantiated.
     */
    public AmazonS3Client getClient(Region s3region) {
        if ( s3region == null ) {
            throw new IllegalArgumentException("S3 region must be specified");
        }
        AmazonS3Client client = clientsByRegion.get(s3region);
        if (client != null) {
            return client;
        }
        if (credentials == null) {
            throw new IllegalArgumentException("No client provided for S3 region: " + s3region);
        }
        client = new AmazonS3Client(credentials);
        client.setRegion(s3region.toAWSRegion());
        AmazonS3Client prev = clientsByRegion.putIfAbsent(s3region, client);
        return prev == null ? client : prev;
    }

    /**
     * Returns a {@link TransferManager} for the given region, or throws an
     * exception when unable. The returned {@link TransferManager} will always
     * be instantiated from whatever {@link AmazonS3Client} is in the cache,
     * whether provided with {@link #useClient(AmazonS3Client)} or instantiated
     * automatically from {@link AWSCredentials}.
     *
     * Any {@link TransferManager} returned could be shut down if a new
     * underlying {@link AmazonS3Client} is provided with
     * {@link #useClient(AmazonS3Client)}.
     *
     * @param region
     *            The region the returned {@link TransferManager} will be
     *            configured to use.
     * @return A transfer manager for the given region from the cache, or one
     *         instantiated automatically from any existing
     *         {@link AmazonS3Client},
     */
    public TransferManager getTransferManager(Region region) {
        synchronized (transferManagersByRegion) {
            TransferManager tm = transferManagersByRegion.get(region);
            if (tm == null) {
                tm = new TransferManager(getClient(region));
                transferManagersByRegion.put(region, tm);
            }
            return tm;
        }
    }
}
