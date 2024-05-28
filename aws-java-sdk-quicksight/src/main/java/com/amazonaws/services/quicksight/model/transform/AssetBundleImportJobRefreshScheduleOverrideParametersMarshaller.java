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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssetBundleImportJobRefreshScheduleOverrideParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssetBundleImportJobRefreshScheduleOverrideParametersMarshaller {

    private static final MarshallingInfo<String> DATASETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DataSetId").build();
    private static final MarshallingInfo<String> SCHEDULEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleId").build();
    private static final MarshallingInfo<java.util.Date> STARTAFTERDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartAfterDateTime").timestampFormat("unixTimestamp").build();

    private static final AssetBundleImportJobRefreshScheduleOverrideParametersMarshaller instance = new AssetBundleImportJobRefreshScheduleOverrideParametersMarshaller();

    public static AssetBundleImportJobRefreshScheduleOverrideParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssetBundleImportJobRefreshScheduleOverrideParameters assetBundleImportJobRefreshScheduleOverrideParameters,
            ProtocolMarshaller protocolMarshaller) {

        if (assetBundleImportJobRefreshScheduleOverrideParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assetBundleImportJobRefreshScheduleOverrideParameters.getDataSetId(), DATASETID_BINDING);
            protocolMarshaller.marshall(assetBundleImportJobRefreshScheduleOverrideParameters.getScheduleId(), SCHEDULEID_BINDING);
            protocolMarshaller.marshall(assetBundleImportJobRefreshScheduleOverrideParameters.getStartAfterDateTime(), STARTAFTERDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
