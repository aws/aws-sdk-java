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
 * GetRestoreTestingSelectionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetRestoreTestingSelectionRequestMarshaller {

    private static final MarshallingInfo<String> RESTORETESTINGPLANNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("RestoreTestingPlanName").build();
    private static final MarshallingInfo<String> RESTORETESTINGSELECTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("RestoreTestingSelectionName").build();

    private static final GetRestoreTestingSelectionRequestMarshaller instance = new GetRestoreTestingSelectionRequestMarshaller();

    public static GetRestoreTestingSelectionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetRestoreTestingSelectionRequest getRestoreTestingSelectionRequest, ProtocolMarshaller protocolMarshaller) {

        if (getRestoreTestingSelectionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getRestoreTestingSelectionRequest.getRestoreTestingPlanName(), RESTORETESTINGPLANNAME_BINDING);
            protocolMarshaller.marshall(getRestoreTestingSelectionRequest.getRestoreTestingSelectionName(), RESTORETESTINGSELECTIONNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
