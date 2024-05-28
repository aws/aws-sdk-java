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
 * AssetBundleExportJobSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssetBundleExportJobSummaryMarshaller {

    private static final MarshallingInfo<String> JOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobStatus").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ASSETBUNDLEEXPORTJOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssetBundleExportJobId").build();
    private static final MarshallingInfo<Boolean> INCLUDEALLDEPENDENCIES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeAllDependencies").build();
    private static final MarshallingInfo<String> EXPORTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportFormat").build();
    private static final MarshallingInfo<Boolean> INCLUDEPERMISSIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludePermissions").build();
    private static final MarshallingInfo<Boolean> INCLUDETAGS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeTags").build();

    private static final AssetBundleExportJobSummaryMarshaller instance = new AssetBundleExportJobSummaryMarshaller();

    public static AssetBundleExportJobSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssetBundleExportJobSummary assetBundleExportJobSummary, ProtocolMarshaller protocolMarshaller) {

        if (assetBundleExportJobSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assetBundleExportJobSummary.getJobStatus(), JOBSTATUS_BINDING);
            protocolMarshaller.marshall(assetBundleExportJobSummary.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(assetBundleExportJobSummary.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(assetBundleExportJobSummary.getAssetBundleExportJobId(), ASSETBUNDLEEXPORTJOBID_BINDING);
            protocolMarshaller.marshall(assetBundleExportJobSummary.getIncludeAllDependencies(), INCLUDEALLDEPENDENCIES_BINDING);
            protocolMarshaller.marshall(assetBundleExportJobSummary.getExportFormat(), EXPORTFORMAT_BINDING);
            protocolMarshaller.marshall(assetBundleExportJobSummary.getIncludePermissions(), INCLUDEPERMISSIONS_BINDING);
            protocolMarshaller.marshall(assetBundleExportJobSummary.getIncludeTags(), INCLUDETAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
