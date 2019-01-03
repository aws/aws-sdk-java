/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonKinesisFirehose}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonKinesisFirehose implements AmazonKinesisFirehose {

    protected AbstractAmazonKinesisFirehose() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDeliveryStreamResult createDeliveryStream(CreateDeliveryStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDeliveryStreamResult deleteDeliveryStream(DeleteDeliveryStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDeliveryStreamResult describeDeliveryStream(DescribeDeliveryStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDeliveryStreamsResult listDeliveryStreams(ListDeliveryStreamsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForDeliveryStreamResult listTagsForDeliveryStream(ListTagsForDeliveryStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutRecordResult putRecord(PutRecordRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutRecordBatchResult putRecordBatch(PutRecordBatchRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartDeliveryStreamEncryptionResult startDeliveryStreamEncryption(StartDeliveryStreamEncryptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopDeliveryStreamEncryptionResult stopDeliveryStreamEncryption(StopDeliveryStreamEncryptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagDeliveryStreamResult tagDeliveryStream(TagDeliveryStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagDeliveryStreamResult untagDeliveryStream(UntagDeliveryStreamRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateDestinationResult updateDestination(UpdateDestinationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
