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
 * MonitoredResourceIdentifierMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MonitoredResourceIdentifierMarshaller {

    private static final MarshallingInfo<String> MONITOREDRESOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoredResourceName").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> RESOURCEPERMISSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourcePermission").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdated").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCECOLLECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceCollection").build();

    private static final MonitoredResourceIdentifierMarshaller instance = new MonitoredResourceIdentifierMarshaller();

    public static MonitoredResourceIdentifierMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MonitoredResourceIdentifier monitoredResourceIdentifier, ProtocolMarshaller protocolMarshaller) {

        if (monitoredResourceIdentifier == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(monitoredResourceIdentifier.getMonitoredResourceName(), MONITOREDRESOURCENAME_BINDING);
            protocolMarshaller.marshall(monitoredResourceIdentifier.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(monitoredResourceIdentifier.getResourcePermission(), RESOURCEPERMISSION_BINDING);
            protocolMarshaller.marshall(monitoredResourceIdentifier.getLastUpdated(), LASTUPDATED_BINDING);
            protocolMarshaller.marshall(monitoredResourceIdentifier.getResourceCollection(), RESOURCECOLLECTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
