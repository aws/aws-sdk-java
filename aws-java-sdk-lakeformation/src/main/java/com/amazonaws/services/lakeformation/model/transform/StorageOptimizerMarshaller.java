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
package com.amazonaws.services.lakeformation.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lakeformation.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StorageOptimizerMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StorageOptimizerMarshaller {

    private static final MarshallingInfo<String> STORAGEOPTIMIZERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageOptimizerType").build();
    private static final MarshallingInfo<Map> CONFIG_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Config").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorMessage").build();
    private static final MarshallingInfo<String> WARNINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Warnings").build();
    private static final MarshallingInfo<String> LASTRUNDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastRunDetails").build();

    private static final StorageOptimizerMarshaller instance = new StorageOptimizerMarshaller();

    public static StorageOptimizerMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StorageOptimizer storageOptimizer, ProtocolMarshaller protocolMarshaller) {

        if (storageOptimizer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(storageOptimizer.getStorageOptimizerType(), STORAGEOPTIMIZERTYPE_BINDING);
            protocolMarshaller.marshall(storageOptimizer.getConfig(), CONFIG_BINDING);
            protocolMarshaller.marshall(storageOptimizer.getErrorMessage(), ERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(storageOptimizer.getWarnings(), WARNINGS_BINDING);
            protocolMarshaller.marshall(storageOptimizer.getLastRunDetails(), LASTRUNDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
