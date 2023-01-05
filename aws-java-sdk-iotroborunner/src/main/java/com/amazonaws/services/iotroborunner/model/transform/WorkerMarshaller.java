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
package com.amazonaws.services.iotroborunner.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotroborunner.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WorkerMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkerMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> FLEET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fleet").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> SITE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("site").build();
    private static final MarshallingInfo<String> ADDITIONALTRANSIENTPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("additionalTransientProperties").build();
    private static final MarshallingInfo<String> ADDITIONALFIXEDPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("additionalFixedProperties").build();
    private static final MarshallingInfo<StructuredPojo> VENDORPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vendorProperties").build();
    private static final MarshallingInfo<StructuredPojo> POSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("position").build();
    private static final MarshallingInfo<StructuredPojo> ORIENTATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("orientation").build();

    private static final WorkerMarshaller instance = new WorkerMarshaller();

    public static WorkerMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Worker worker, ProtocolMarshaller protocolMarshaller) {

        if (worker == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(worker.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(worker.getId(), ID_BINDING);
            protocolMarshaller.marshall(worker.getFleet(), FLEET_BINDING);
            protocolMarshaller.marshall(worker.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(worker.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(worker.getName(), NAME_BINDING);
            protocolMarshaller.marshall(worker.getSite(), SITE_BINDING);
            protocolMarshaller.marshall(worker.getAdditionalTransientProperties(), ADDITIONALTRANSIENTPROPERTIES_BINDING);
            protocolMarshaller.marshall(worker.getAdditionalFixedProperties(), ADDITIONALFIXEDPROPERTIES_BINDING);
            protocolMarshaller.marshall(worker.getVendorProperties(), VENDORPROPERTIES_BINDING);
            protocolMarshaller.marshall(worker.getPosition(), POSITION_BINDING);
            protocolMarshaller.marshall(worker.getOrientation(), ORIENTATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
