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
package com.amazonaws.services.appfabric.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appfabric.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AppAuthorizationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AppAuthorizationSummaryMarshaller {

    private static final MarshallingInfo<String> APPAUTHORIZATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("appAuthorizationArn").build();
    private static final MarshallingInfo<String> APPBUNDLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("appBundleArn").build();
    private static final MarshallingInfo<String> APP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("app").build();
    private static final MarshallingInfo<StructuredPojo> TENANT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tenant").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("iso8601").build();

    private static final AppAuthorizationSummaryMarshaller instance = new AppAuthorizationSummaryMarshaller();

    public static AppAuthorizationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AppAuthorizationSummary appAuthorizationSummary, ProtocolMarshaller protocolMarshaller) {

        if (appAuthorizationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(appAuthorizationSummary.getAppAuthorizationArn(), APPAUTHORIZATIONARN_BINDING);
            protocolMarshaller.marshall(appAuthorizationSummary.getAppBundleArn(), APPBUNDLEARN_BINDING);
            protocolMarshaller.marshall(appAuthorizationSummary.getApp(), APP_BINDING);
            protocolMarshaller.marshall(appAuthorizationSummary.getTenant(), TENANT_BINDING);
            protocolMarshaller.marshall(appAuthorizationSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(appAuthorizationSummary.getUpdatedAt(), UPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
