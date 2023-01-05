/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * TagHealthMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TagHealthMarshaller {

    private static final MarshallingInfo<String> APPBOUNDARYKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AppBoundaryKey").build();
    private static final MarshallingInfo<String> TAGVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TagValue").build();
    private static final MarshallingInfo<StructuredPojo> INSIGHT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Insight").build();
    private static final MarshallingInfo<Long> ANALYZEDRESOURCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnalyzedResourceCount").build();

    private static final TagHealthMarshaller instance = new TagHealthMarshaller();

    public static TagHealthMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TagHealth tagHealth, ProtocolMarshaller protocolMarshaller) {

        if (tagHealth == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tagHealth.getAppBoundaryKey(), APPBOUNDARYKEY_BINDING);
            protocolMarshaller.marshall(tagHealth.getTagValue(), TAGVALUE_BINDING);
            protocolMarshaller.marshall(tagHealth.getInsight(), INSIGHT_BINDING);
            protocolMarshaller.marshall(tagHealth.getAnalyzedResourceCount(), ANALYZEDRESOURCECOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
