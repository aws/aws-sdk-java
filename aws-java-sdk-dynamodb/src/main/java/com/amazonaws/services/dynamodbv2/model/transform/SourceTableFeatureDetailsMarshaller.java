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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SourceTableFeatureDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SourceTableFeatureDetailsMarshaller {

    private static final MarshallingInfo<List> LOCALSECONDARYINDEXES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocalSecondaryIndexes").build();
    private static final MarshallingInfo<List> GLOBALSECONDARYINDEXES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalSecondaryIndexes").build();
    private static final MarshallingInfo<StructuredPojo> STREAMDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamDescription").build();
    private static final MarshallingInfo<StructuredPojo> TIMETOLIVEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeToLiveDescription").build();
    private static final MarshallingInfo<StructuredPojo> SSEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SSEDescription").build();

    private static final SourceTableFeatureDetailsMarshaller instance = new SourceTableFeatureDetailsMarshaller();

    public static SourceTableFeatureDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SourceTableFeatureDetails sourceTableFeatureDetails, ProtocolMarshaller protocolMarshaller) {

        if (sourceTableFeatureDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sourceTableFeatureDetails.getLocalSecondaryIndexes(), LOCALSECONDARYINDEXES_BINDING);
            protocolMarshaller.marshall(sourceTableFeatureDetails.getGlobalSecondaryIndexes(), GLOBALSECONDARYINDEXES_BINDING);
            protocolMarshaller.marshall(sourceTableFeatureDetails.getStreamDescription(), STREAMDESCRIPTION_BINDING);
            protocolMarshaller.marshall(sourceTableFeatureDetails.getTimeToLiveDescription(), TIMETOLIVEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(sourceTableFeatureDetails.getSSEDescription(), SSEDESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
