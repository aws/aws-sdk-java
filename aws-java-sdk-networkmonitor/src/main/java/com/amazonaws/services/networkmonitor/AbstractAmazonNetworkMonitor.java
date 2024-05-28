/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmonitor;

import javax.annotation.Generated;

import com.amazonaws.services.networkmonitor.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonNetworkMonitor}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonNetworkMonitor implements AmazonNetworkMonitor {

    protected AbstractAmazonNetworkMonitor() {
    }

    @Override
    public CreateMonitorResult createMonitor(CreateMonitorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateProbeResult createProbe(CreateProbeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteMonitorResult deleteMonitor(DeleteMonitorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteProbeResult deleteProbe(DeleteProbeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetMonitorResult getMonitor(GetMonitorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetProbeResult getProbe(GetProbeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListMonitorsResult listMonitors(ListMonitorsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateMonitorResult updateMonitor(UpdateMonitorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateProbeResult updateProbe(UpdateProbeRequest request) {
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
