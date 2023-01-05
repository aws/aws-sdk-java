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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CollectorHealthCheckMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CollectorHealthCheckMarshaller {

    private static final MarshallingInfo<String> COLLECTORSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CollectorStatus").build();
    private static final MarshallingInfo<Boolean> LOCALCOLLECTORS3ACCESS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocalCollectorS3Access").build();
    private static final MarshallingInfo<Boolean> WEBCOLLECTORS3ACCESS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WebCollectorS3Access").build();
    private static final MarshallingInfo<Boolean> WEBCOLLECTORGRANTEDROLEBASEDACCESS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WebCollectorGrantedRoleBasedAccess").build();

    private static final CollectorHealthCheckMarshaller instance = new CollectorHealthCheckMarshaller();

    public static CollectorHealthCheckMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CollectorHealthCheck collectorHealthCheck, ProtocolMarshaller protocolMarshaller) {

        if (collectorHealthCheck == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(collectorHealthCheck.getCollectorStatus(), COLLECTORSTATUS_BINDING);
            protocolMarshaller.marshall(collectorHealthCheck.getLocalCollectorS3Access(), LOCALCOLLECTORS3ACCESS_BINDING);
            protocolMarshaller.marshall(collectorHealthCheck.getWebCollectorS3Access(), WEBCOLLECTORS3ACCESS_BINDING);
            protocolMarshaller.marshall(collectorHealthCheck.getWebCollectorGrantedRoleBasedAccess(), WEBCOLLECTORGRANTEDROLEBASEDACCESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
