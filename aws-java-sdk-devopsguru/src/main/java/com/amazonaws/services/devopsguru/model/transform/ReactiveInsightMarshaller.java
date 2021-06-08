/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devopsguru.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReactiveInsightMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReactiveInsightMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> SEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Severity").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> INSIGHTTIMERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InsightTimeRange").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCECOLLECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceCollection").build();
    private static final MarshallingInfo<String> SSMOPSITEMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SsmOpsItemId").build();

    private static final ReactiveInsightMarshaller instance = new ReactiveInsightMarshaller();

    public static ReactiveInsightMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReactiveInsight reactiveInsight, ProtocolMarshaller protocolMarshaller) {

        if (reactiveInsight == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reactiveInsight.getId(), ID_BINDING);
            protocolMarshaller.marshall(reactiveInsight.getName(), NAME_BINDING);
            protocolMarshaller.marshall(reactiveInsight.getSeverity(), SEVERITY_BINDING);
            protocolMarshaller.marshall(reactiveInsight.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(reactiveInsight.getInsightTimeRange(), INSIGHTTIMERANGE_BINDING);
            protocolMarshaller.marshall(reactiveInsight.getResourceCollection(), RESOURCECOLLECTION_BINDING);
            protocolMarshaller.marshall(reactiveInsight.getSsmOpsItemId(), SSMOPSITEMID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
