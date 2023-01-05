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
package com.amazonaws.services.memorydb.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.memorydb.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServiceUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServiceUpdateMarshaller {

    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterName").build();
    private static final MarshallingInfo<String> SERVICEUPDATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceUpdateName").build();
    private static final MarshallingInfo<java.util.Date> RELEASEDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReleaseDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> NODESUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NodesUpdated").build();
    private static final MarshallingInfo<java.util.Date> AUTOUPDATESTARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoUpdateStartDate").timestampFormat("unixTimestamp").build();

    private static final ServiceUpdateMarshaller instance = new ServiceUpdateMarshaller();

    public static ServiceUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServiceUpdate serviceUpdate, ProtocolMarshaller protocolMarshaller) {

        if (serviceUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serviceUpdate.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(serviceUpdate.getServiceUpdateName(), SERVICEUPDATENAME_BINDING);
            protocolMarshaller.marshall(serviceUpdate.getReleaseDate(), RELEASEDATE_BINDING);
            protocolMarshaller.marshall(serviceUpdate.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(serviceUpdate.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(serviceUpdate.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(serviceUpdate.getNodesUpdated(), NODESUPDATED_BINDING);
            protocolMarshaller.marshall(serviceUpdate.getAutoUpdateStartDate(), AUTOUPDATESTARTDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
