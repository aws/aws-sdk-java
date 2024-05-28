/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backup.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RestoreTestingSelectionForListMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RestoreTestingSelectionForListMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRoleArn").build();
    private static final MarshallingInfo<String> PROTECTEDRESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProtectedResourceType").build();
    private static final MarshallingInfo<String> RESTORETESTINGPLANNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestoreTestingPlanName").build();
    private static final MarshallingInfo<String> RESTORETESTINGSELECTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestoreTestingSelectionName").build();
    private static final MarshallingInfo<Integer> VALIDATIONWINDOWHOURS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationWindowHours").build();

    private static final RestoreTestingSelectionForListMarshaller instance = new RestoreTestingSelectionForListMarshaller();

    public static RestoreTestingSelectionForListMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RestoreTestingSelectionForList restoreTestingSelectionForList, ProtocolMarshaller protocolMarshaller) {

        if (restoreTestingSelectionForList == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(restoreTestingSelectionForList.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(restoreTestingSelectionForList.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(restoreTestingSelectionForList.getProtectedResourceType(), PROTECTEDRESOURCETYPE_BINDING);
            protocolMarshaller.marshall(restoreTestingSelectionForList.getRestoreTestingPlanName(), RESTORETESTINGPLANNAME_BINDING);
            protocolMarshaller.marshall(restoreTestingSelectionForList.getRestoreTestingSelectionName(), RESTORETESTINGSELECTIONNAME_BINDING);
            protocolMarshaller.marshall(restoreTestingSelectionForList.getValidationWindowHours(), VALIDATIONWINDOWHOURS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
