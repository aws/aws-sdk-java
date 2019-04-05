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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PendingMaintenanceActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PendingMaintenanceActionMarshaller {

    private static final MarshallingInfo<String> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Action").build();
    private static final MarshallingInfo<java.util.Date> AUTOAPPLIEDAFTERDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoAppliedAfterDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> FORCEDAPPLYDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForcedApplyDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> OPTINSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OptInStatus").build();
    private static final MarshallingInfo<java.util.Date> CURRENTAPPLYDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentApplyDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();

    private static final PendingMaintenanceActionMarshaller instance = new PendingMaintenanceActionMarshaller();

    public static PendingMaintenanceActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PendingMaintenanceAction pendingMaintenanceAction, ProtocolMarshaller protocolMarshaller) {

        if (pendingMaintenanceAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pendingMaintenanceAction.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(pendingMaintenanceAction.getAutoAppliedAfterDate(), AUTOAPPLIEDAFTERDATE_BINDING);
            protocolMarshaller.marshall(pendingMaintenanceAction.getForcedApplyDate(), FORCEDAPPLYDATE_BINDING);
            protocolMarshaller.marshall(pendingMaintenanceAction.getOptInStatus(), OPTINSTATUS_BINDING);
            protocolMarshaller.marshall(pendingMaintenanceAction.getCurrentApplyDate(), CURRENTAPPLYDATE_BINDING);
            protocolMarshaller.marshall(pendingMaintenanceAction.getDescription(), DESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
