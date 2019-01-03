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
 * UpdateGlobalTableSettingsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateGlobalTableSettingsRequestMarshaller {

    private static final MarshallingInfo<String> GLOBALTABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalTableName").build();
    private static final MarshallingInfo<String> GLOBALTABLEBILLINGMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalTableBillingMode").build();
    private static final MarshallingInfo<Long> GLOBALTABLEPROVISIONEDWRITECAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalTableProvisionedWriteCapacityUnits").build();
    private static final MarshallingInfo<StructuredPojo> GLOBALTABLEPROVISIONEDWRITECAPACITYAUTOSCALINGSETTINGSUPDATE_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate").build();
    private static final MarshallingInfo<List> GLOBALTABLEGLOBALSECONDARYINDEXSETTINGSUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalTableGlobalSecondaryIndexSettingsUpdate").build();
    private static final MarshallingInfo<List> REPLICASETTINGSUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicaSettingsUpdate").build();

    private static final UpdateGlobalTableSettingsRequestMarshaller instance = new UpdateGlobalTableSettingsRequestMarshaller();

    public static UpdateGlobalTableSettingsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateGlobalTableSettingsRequest updateGlobalTableSettingsRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateGlobalTableSettingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateGlobalTableSettingsRequest.getGlobalTableName(), GLOBALTABLENAME_BINDING);
            protocolMarshaller.marshall(updateGlobalTableSettingsRequest.getGlobalTableBillingMode(), GLOBALTABLEBILLINGMODE_BINDING);
            protocolMarshaller.marshall(updateGlobalTableSettingsRequest.getGlobalTableProvisionedWriteCapacityUnits(),
                    GLOBALTABLEPROVISIONEDWRITECAPACITYUNITS_BINDING);
            protocolMarshaller.marshall(updateGlobalTableSettingsRequest.getGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(),
                    GLOBALTABLEPROVISIONEDWRITECAPACITYAUTOSCALINGSETTINGSUPDATE_BINDING);
            protocolMarshaller.marshall(updateGlobalTableSettingsRequest.getGlobalTableGlobalSecondaryIndexSettingsUpdate(),
                    GLOBALTABLEGLOBALSECONDARYINDEXSETTINGSUPDATE_BINDING);
            protocolMarshaller.marshall(updateGlobalTableSettingsRequest.getReplicaSettingsUpdate(), REPLICASETTINGSUPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
