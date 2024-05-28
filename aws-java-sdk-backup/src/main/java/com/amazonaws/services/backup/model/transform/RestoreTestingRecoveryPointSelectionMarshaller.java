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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RestoreTestingRecoveryPointSelectionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RestoreTestingRecoveryPointSelectionMarshaller {

    private static final MarshallingInfo<String> ALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Algorithm").build();
    private static final MarshallingInfo<List> EXCLUDEVAULTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ExcludeVaults").build();
    private static final MarshallingInfo<List> INCLUDEVAULTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IncludeVaults").build();
    private static final MarshallingInfo<List> RECOVERYPOINTTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecoveryPointTypes").build();
    private static final MarshallingInfo<Integer> SELECTIONWINDOWDAYS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectionWindowDays").build();

    private static final RestoreTestingRecoveryPointSelectionMarshaller instance = new RestoreTestingRecoveryPointSelectionMarshaller();

    public static RestoreTestingRecoveryPointSelectionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RestoreTestingRecoveryPointSelection restoreTestingRecoveryPointSelection, ProtocolMarshaller protocolMarshaller) {

        if (restoreTestingRecoveryPointSelection == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(restoreTestingRecoveryPointSelection.getAlgorithm(), ALGORITHM_BINDING);
            protocolMarshaller.marshall(restoreTestingRecoveryPointSelection.getExcludeVaults(), EXCLUDEVAULTS_BINDING);
            protocolMarshaller.marshall(restoreTestingRecoveryPointSelection.getIncludeVaults(), INCLUDEVAULTS_BINDING);
            protocolMarshaller.marshall(restoreTestingRecoveryPointSelection.getRecoveryPointTypes(), RECOVERYPOINTTYPES_BINDING);
            protocolMarshaller.marshall(restoreTestingRecoveryPointSelection.getSelectionWindowDays(), SELECTIONWINDOWDAYS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
