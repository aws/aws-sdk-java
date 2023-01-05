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
package com.amazonaws.services.lexmodelsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FulfillmentUpdatesSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FulfillmentUpdatesSpecificationMarshaller {

    private static final MarshallingInfo<Boolean> ACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("active").build();
    private static final MarshallingInfo<StructuredPojo> STARTRESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startResponse").build();
    private static final MarshallingInfo<StructuredPojo> UPDATERESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateResponse").build();
    private static final MarshallingInfo<Integer> TIMEOUTINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeoutInSeconds").build();

    private static final FulfillmentUpdatesSpecificationMarshaller instance = new FulfillmentUpdatesSpecificationMarshaller();

    public static FulfillmentUpdatesSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FulfillmentUpdatesSpecification fulfillmentUpdatesSpecification, ProtocolMarshaller protocolMarshaller) {

        if (fulfillmentUpdatesSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fulfillmentUpdatesSpecification.getActive(), ACTIVE_BINDING);
            protocolMarshaller.marshall(fulfillmentUpdatesSpecification.getStartResponse(), STARTRESPONSE_BINDING);
            protocolMarshaller.marshall(fulfillmentUpdatesSpecification.getUpdateResponse(), UPDATERESPONSE_BINDING);
            protocolMarshaller.marshall(fulfillmentUpdatesSpecification.getTimeoutInSeconds(), TIMEOUTINSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
