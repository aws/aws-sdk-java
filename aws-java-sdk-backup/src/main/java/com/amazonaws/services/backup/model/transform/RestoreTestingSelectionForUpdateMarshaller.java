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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RestoreTestingSelectionForUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RestoreTestingSelectionForUpdateMarshaller {

    private static final MarshallingInfo<String> IAMROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamRoleArn").build();
    private static final MarshallingInfo<List> PROTECTEDRESOURCEARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProtectedResourceArns").build();
    private static final MarshallingInfo<StructuredPojo> PROTECTEDRESOURCECONDITIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProtectedResourceConditions").build();
    private static final MarshallingInfo<Map> RESTOREMETADATAOVERRIDES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestoreMetadataOverrides").build();
    private static final MarshallingInfo<Integer> VALIDATIONWINDOWHOURS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationWindowHours").build();

    private static final RestoreTestingSelectionForUpdateMarshaller instance = new RestoreTestingSelectionForUpdateMarshaller();

    public static RestoreTestingSelectionForUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RestoreTestingSelectionForUpdate restoreTestingSelectionForUpdate, ProtocolMarshaller protocolMarshaller) {

        if (restoreTestingSelectionForUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(restoreTestingSelectionForUpdate.getIamRoleArn(), IAMROLEARN_BINDING);
            protocolMarshaller.marshall(restoreTestingSelectionForUpdate.getProtectedResourceArns(), PROTECTEDRESOURCEARNS_BINDING);
            protocolMarshaller.marshall(restoreTestingSelectionForUpdate.getProtectedResourceConditions(), PROTECTEDRESOURCECONDITIONS_BINDING);
            protocolMarshaller.marshall(restoreTestingSelectionForUpdate.getRestoreMetadataOverrides(), RESTOREMETADATAOVERRIDES_BINDING);
            protocolMarshaller.marshall(restoreTestingSelectionForUpdate.getValidationWindowHours(), VALIDATIONWINDOWHOURS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
