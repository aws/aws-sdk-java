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
 * ApiGatewayApiAssetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApiGatewayApiAssetMarshaller {

    private static final MarshallingInfo<String> APIDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiDescription").build();
    private static final MarshallingInfo<String> APIENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiEndpoint").build();
    private static final MarshallingInfo<String> APIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ApiId").build();
    private static final MarshallingInfo<String> APIKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ApiKey").build();
    private static final MarshallingInfo<String> APINAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ApiName").build();
    private static final MarshallingInfo<String> APISPECIFICATIONDOWNLOADURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiSpecificationDownloadUrl").build();
    private static final MarshallingInfo<java.util.Date> APISPECIFICATIONDOWNLOADURLEXPIRESAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiSpecificationDownloadUrlExpiresAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> PROTOCOLTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProtocolType").build();
    private static final MarshallingInfo<String> STAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Stage").build();

    private static final ApiGatewayApiAssetMarshaller instance = new ApiGatewayApiAssetMarshaller();

    public static ApiGatewayApiAssetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApiGatewayApiAsset apiGatewayApiAsset, ProtocolMarshaller protocolMarshaller) {

        if (apiGatewayApiAsset == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(apiGatewayApiAsset.getApiDescription(), APIDESCRIPTION_BINDING);
            protocolMarshaller.marshall(apiGatewayApiAsset.getApiEndpoint(), APIENDPOINT_BINDING);
            protocolMarshaller.marshall(apiGatewayApiAsset.getApiId(), APIID_BINDING);
            protocolMarshaller.marshall(apiGatewayApiAsset.getApiKey(), APIKEY_BINDING);
            protocolMarshaller.marshall(apiGatewayApiAsset.getApiName(), APINAME_BINDING);
            protocolMarshaller.marshall(apiGatewayApiAsset.getApiSpecificationDownloadUrl(), APISPECIFICATIONDOWNLOADURL_BINDING);
            protocolMarshaller.marshall(apiGatewayApiAsset.getApiSpecificationDownloadUrlExpiresAt(), APISPECIFICATIONDOWNLOADURLEXPIRESAT_BINDING);
            protocolMarshaller.marshall(apiGatewayApiAsset.getProtocolType(), PROTOCOLTYPE_BINDING);
            protocolMarshaller.marshall(apiGatewayApiAsset.getStage(), STAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
