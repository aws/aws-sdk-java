/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.glacier.transfer;

import com.amazonaws.services.glacier.AmazonGlacier;
import com.amazonaws.services.glacier.AmazonGlacierClientBuilder;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;

/**
 * Fluent builder for {@link ArchiveTransferManager}. Use of the builder is preferred over
 * constructors for {@link ArchiveTransferManager}.
 */
public final class ArchiveTransferManagerBuilder {
    private AmazonGlacier glacierClient;

    private AmazonSQS sqsClient;

    private AmazonSNS snsClient;

    /**
     * @return The client used for uploading and downloading data to and from Amazon Glacier.
     */
    public AmazonGlacier getGlacierClient() {
        return glacierClient;
    }

    /**
     * Set the client for uploading and downloading data to and from Amazon Glacier.
     *
     * @param glacierClient The Amazon Glacier client.
     */
    public void setGlacierClient(AmazonGlacier glacierClient) {
        this.glacierClient = glacierClient;
    }

    /**
     * Set the client for uploading and downloading data to and from Amazon Glacier.
     *
     * @param glacierClient The Amazon Glacier client.
     *
     * @return This object for chaining.
     */
    public ArchiveTransferManagerBuilder withGlacierClient(AmazonGlacier glacierClient) {
        setGlacierClient(glacierClient);
        return this;
    }

    /**
     * @return The client for working with Amazon SQS when polling for the archive retrieval job
     * status.
     */
    public AmazonSQS getSqsClient() {
        return sqsClient;
    }

    /**
     * Set the client for working with Amazon SQS when polling for the archive retrieval job status.
     *
     * @param sqsClient The SQS client.
     */
    public void setSqsClient(AmazonSQS sqsClient) {
        this.sqsClient = sqsClient;
    }

    /**
     * Set the SQS client for working with Amazon SQS when polling for the archive retrieval job
     * status.
     *
     * @param sqsClient The SQS client.
     *
     * @return This object for chaining.
     */
    public ArchiveTransferManagerBuilder withSqsClient(AmazonSQS sqsClient) {
        setSqsClient(sqsClient);
        return this;
    }

    /**
     * @return The client for working with Amazon SNS when polling for the archive retrieval job
     * status.
     */
    public AmazonSNS getSnsClient() {
        return snsClient;
    }

    /**
     * Set the client for working with Amazon SNS when polling for the archive retrieval job status.
     *
     * @param snsClient The SNS client.
     */
    public void setSnsClient(AmazonSNS snsClient) {
        this.snsClient = snsClient;
    }

    /**
     * Set the client for working with Amazon SNS when polling for the archive retrieval job status.
     *
     * @param snsClient The SNS client.
     *
     * @return This object for chaining.
     */
    public ArchiveTransferManagerBuilder withSnsClient(AmazonSNS snsClient) {
        setSnsClient(snsClient);
        return this;
    }

    private AmazonGlacier resolveGlacierClient() {
        return glacierClient == null ? AmazonGlacierClientBuilder.defaultClient() : glacierClient;
    }

    private AmazonSNS resolveSNSClient() {
        return snsClient == null ? AmazonSNSClientBuilder.defaultClient() : snsClient;
    }

    private AmazonSQS resolveSQSClient() {
        return sqsClient == null ? AmazonSQSClientBuilder.defaultClient() : sqsClient;
    }

    private ArchiveTransferManagerParams getParams() {
        return new ArchiveTransferManagerParams()
                .withAmazonGlacier(resolveGlacierClient())
                .withAmazonSQS(resolveSQSClient())
                .withAmazonSNS(resolveSNSClient());
    }

    /**
     * @return An instance of {@link ArchiveTransferManager} using the configured options.
     */
    public ArchiveTransferManager build() {
        return new ArchiveTransferManager(getParams());
    }
}
