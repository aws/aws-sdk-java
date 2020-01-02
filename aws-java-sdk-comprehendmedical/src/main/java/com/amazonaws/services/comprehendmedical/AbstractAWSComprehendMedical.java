/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehendmedical;

import javax.annotation.Generated;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSComprehendMedical}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSComprehendMedical implements AWSComprehendMedical {

    protected AbstractAWSComprehendMedical() {
    }

    @Override
    public DescribeEntitiesDetectionV2JobResult describeEntitiesDetectionV2Job(DescribeEntitiesDetectionV2JobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribePHIDetectionJobResult describePHIDetectionJob(DescribePHIDetectionJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public DetectEntitiesResult detectEntities(DetectEntitiesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetectEntitiesV2Result detectEntitiesV2(DetectEntitiesV2Request request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DetectPHIResult detectPHI(DetectPHIRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public InferICD10CMResult inferICD10CM(InferICD10CMRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public InferRxNormResult inferRxNorm(InferRxNormRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListEntitiesDetectionV2JobsResult listEntitiesDetectionV2Jobs(ListEntitiesDetectionV2JobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPHIDetectionJobsResult listPHIDetectionJobs(ListPHIDetectionJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartEntitiesDetectionV2JobResult startEntitiesDetectionV2Job(StartEntitiesDetectionV2JobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartPHIDetectionJobResult startPHIDetectionJob(StartPHIDetectionJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopEntitiesDetectionV2JobResult stopEntitiesDetectionV2Job(StopEntitiesDetectionV2JobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopPHIDetectionJobResult stopPHIDetectionJob(StopPHIDetectionJobRequest request) {
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
