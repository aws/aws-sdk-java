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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartAssetBundleExportJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartAssetBundleExportJobRequestMarshaller {

    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("AwsAccountId").build();
    private static final MarshallingInfo<String> ASSETBUNDLEEXPORTJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssetBundleExportJobId").build();
    private static final MarshallingInfo<List> RESOURCEARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ResourceArns").build();
    private static final MarshallingInfo<Boolean> INCLUDEALLDEPENDENCIES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeAllDependencies").build();
    private static final MarshallingInfo<String> EXPORTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportFormat").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDFORMATIONOVERRIDEPROPERTYCONFIGURATION_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudFormationOverridePropertyConfiguration")
            .build();
    private static final MarshallingInfo<Boolean> INCLUDEPERMISSIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludePermissions").build();
    private static final MarshallingInfo<Boolean> INCLUDETAGS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeTags").build();
    private static final MarshallingInfo<StructuredPojo> VALIDATIONSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationStrategy").build();

    private static final StartAssetBundleExportJobRequestMarshaller instance = new StartAssetBundleExportJobRequestMarshaller();

    public static StartAssetBundleExportJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartAssetBundleExportJobRequest startAssetBundleExportJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startAssetBundleExportJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startAssetBundleExportJobRequest.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(startAssetBundleExportJobRequest.getAssetBundleExportJobId(), ASSETBUNDLEEXPORTJOBID_BINDING);
            protocolMarshaller.marshall(startAssetBundleExportJobRequest.getResourceArns(), RESOURCEARNS_BINDING);
            protocolMarshaller.marshall(startAssetBundleExportJobRequest.getIncludeAllDependencies(), INCLUDEALLDEPENDENCIES_BINDING);
            protocolMarshaller.marshall(startAssetBundleExportJobRequest.getExportFormat(), EXPORTFORMAT_BINDING);
            protocolMarshaller.marshall(startAssetBundleExportJobRequest.getCloudFormationOverridePropertyConfiguration(),
                    CLOUDFORMATIONOVERRIDEPROPERTYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(startAssetBundleExportJobRequest.getIncludePermissions(), INCLUDEPERMISSIONS_BINDING);
            protocolMarshaller.marshall(startAssetBundleExportJobRequest.getIncludeTags(), INCLUDETAGS_BINDING);
            protocolMarshaller.marshall(startAssetBundleExportJobRequest.getValidationStrategy(), VALIDATIONSTRATEGY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
