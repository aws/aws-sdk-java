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
package com.amazonaws.services.simpleworkflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CountClosedWorkflowExecutionsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CountClosedWorkflowExecutionsRequestMarshaller {

    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("domain").build();
    private static final MarshallingInfo<StructuredPojo> STARTTIMEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTimeFilter").build();
    private static final MarshallingInfo<StructuredPojo> CLOSETIMEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("closeTimeFilter").build();
    private static final MarshallingInfo<StructuredPojo> EXECUTIONFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionFilter").build();
    private static final MarshallingInfo<StructuredPojo> TYPEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("typeFilter").build();
    private static final MarshallingInfo<StructuredPojo> TAGFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tagFilter").build();
    private static final MarshallingInfo<StructuredPojo> CLOSESTATUSFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("closeStatusFilter").build();

    private static final CountClosedWorkflowExecutionsRequestMarshaller instance = new CountClosedWorkflowExecutionsRequestMarshaller();

    public static CountClosedWorkflowExecutionsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CountClosedWorkflowExecutionsRequest countClosedWorkflowExecutionsRequest, ProtocolMarshaller protocolMarshaller) {

        if (countClosedWorkflowExecutionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(countClosedWorkflowExecutionsRequest.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(countClosedWorkflowExecutionsRequest.getStartTimeFilter(), STARTTIMEFILTER_BINDING);
            protocolMarshaller.marshall(countClosedWorkflowExecutionsRequest.getCloseTimeFilter(), CLOSETIMEFILTER_BINDING);
            protocolMarshaller.marshall(countClosedWorkflowExecutionsRequest.getExecutionFilter(), EXECUTIONFILTER_BINDING);
            protocolMarshaller.marshall(countClosedWorkflowExecutionsRequest.getTypeFilter(), TYPEFILTER_BINDING);
            protocolMarshaller.marshall(countClosedWorkflowExecutionsRequest.getTagFilter(), TAGFILTER_BINDING);
            protocolMarshaller.marshall(countClosedWorkflowExecutionsRequest.getCloseStatusFilter(), CLOSESTATUSFILTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
