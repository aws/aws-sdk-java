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
 * StartAssetBundleImportJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartAssetBundleImportJobRequestMarshaller {

    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("AwsAccountId").build();
    private static final MarshallingInfo<String> ASSETBUNDLEIMPORTJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssetBundleImportJobId").build();
    private static final MarshallingInfo<StructuredPojo> ASSETBUNDLEIMPORTSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssetBundleImportSource").build();
    private static final MarshallingInfo<StructuredPojo> OVERRIDEPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OverrideParameters").build();
    private static final MarshallingInfo<String> FAILUREACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureAction").build();
    private static final MarshallingInfo<StructuredPojo> OVERRIDEPERMISSIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OverridePermissions").build();
    private static final MarshallingInfo<StructuredPojo> OVERRIDETAGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OverrideTags").build();
    private static final MarshallingInfo<StructuredPojo> OVERRIDEVALIDATIONSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OverrideValidationStrategy").build();

    private static final StartAssetBundleImportJobRequestMarshaller instance = new StartAssetBundleImportJobRequestMarshaller();

    public static StartAssetBundleImportJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartAssetBundleImportJobRequest startAssetBundleImportJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startAssetBundleImportJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startAssetBundleImportJobRequest.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(startAssetBundleImportJobRequest.getAssetBundleImportJobId(), ASSETBUNDLEIMPORTJOBID_BINDING);
            protocolMarshaller.marshall(startAssetBundleImportJobRequest.getAssetBundleImportSource(), ASSETBUNDLEIMPORTSOURCE_BINDING);
            protocolMarshaller.marshall(startAssetBundleImportJobRequest.getOverrideParameters(), OVERRIDEPARAMETERS_BINDING);
            protocolMarshaller.marshall(startAssetBundleImportJobRequest.getFailureAction(), FAILUREACTION_BINDING);
            protocolMarshaller.marshall(startAssetBundleImportJobRequest.getOverridePermissions(), OVERRIDEPERMISSIONS_BINDING);
            protocolMarshaller.marshall(startAssetBundleImportJobRequest.getOverrideTags(), OVERRIDETAGS_BINDING);
            protocolMarshaller.marshall(startAssetBundleImportJobRequest.getOverrideValidationStrategy(), OVERRIDEVALIDATIONSTRATEGY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
