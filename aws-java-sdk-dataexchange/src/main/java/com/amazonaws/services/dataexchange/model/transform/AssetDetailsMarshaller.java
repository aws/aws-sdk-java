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
package com.amazonaws.services.dataexchange.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dataexchange.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssetDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssetDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> S3SNAPSHOTASSET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3SnapshotAsset").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFTDATASHAREASSET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedshiftDataShareAsset").build();
    private static final MarshallingInfo<StructuredPojo> APIGATEWAYAPIASSET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiGatewayApiAsset").build();
    private static final MarshallingInfo<StructuredPojo> S3DATAACCESSASSET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3DataAccessAsset").build();
    private static final MarshallingInfo<StructuredPojo> LAKEFORMATIONDATAPERMISSIONASSET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LakeFormationDataPermissionAsset").build();

    private static final AssetDetailsMarshaller instance = new AssetDetailsMarshaller();

    public static AssetDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssetDetails assetDetails, ProtocolMarshaller protocolMarshaller) {

        if (assetDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assetDetails.getS3SnapshotAsset(), S3SNAPSHOTASSET_BINDING);
            protocolMarshaller.marshall(assetDetails.getRedshiftDataShareAsset(), REDSHIFTDATASHAREASSET_BINDING);
            protocolMarshaller.marshall(assetDetails.getApiGatewayApiAsset(), APIGATEWAYAPIASSET_BINDING);
            protocolMarshaller.marshall(assetDetails.getS3DataAccessAsset(), S3DATAACCESSASSET_BINDING);
            protocolMarshaller.marshall(assetDetails.getLakeFormationDataPermissionAsset(), LAKEFORMATIONDATAPERMISSIONASSET_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
