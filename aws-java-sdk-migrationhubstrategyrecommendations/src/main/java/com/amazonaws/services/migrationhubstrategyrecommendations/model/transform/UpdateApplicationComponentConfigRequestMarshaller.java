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
package com.amazonaws.services.migrationhubstrategyrecommendations.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateApplicationComponentConfigRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateApplicationComponentConfigRequestMarshaller {

    private static final MarshallingInfo<String> APPTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appType").build();
    private static final MarshallingInfo<String> APPLICATIONCOMPONENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationComponentId").build();
    private static final MarshallingInfo<Boolean> CONFIGUREONLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configureOnly").build();
    private static final MarshallingInfo<String> INCLUSIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inclusionStatus").build();
    private static final MarshallingInfo<String> SECRETSMANAGERKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("secretsManagerKey").build();
    private static final MarshallingInfo<List> SOURCECODELIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceCodeList").build();
    private static final MarshallingInfo<StructuredPojo> STRATEGYOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("strategyOption").build();

    private static final UpdateApplicationComponentConfigRequestMarshaller instance = new UpdateApplicationComponentConfigRequestMarshaller();

    public static UpdateApplicationComponentConfigRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateApplicationComponentConfigRequest updateApplicationComponentConfigRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateApplicationComponentConfigRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateApplicationComponentConfigRequest.getAppType(), APPTYPE_BINDING);
            protocolMarshaller.marshall(updateApplicationComponentConfigRequest.getApplicationComponentId(), APPLICATIONCOMPONENTID_BINDING);
            protocolMarshaller.marshall(updateApplicationComponentConfigRequest.getConfigureOnly(), CONFIGUREONLY_BINDING);
            protocolMarshaller.marshall(updateApplicationComponentConfigRequest.getInclusionStatus(), INCLUSIONSTATUS_BINDING);
            protocolMarshaller.marshall(updateApplicationComponentConfigRequest.getSecretsManagerKey(), SECRETSMANAGERKEY_BINDING);
            protocolMarshaller.marshall(updateApplicationComponentConfigRequest.getSourceCodeList(), SOURCECODELIST_BINDING);
            protocolMarshaller.marshall(updateApplicationComponentConfigRequest.getStrategyOption(), STRATEGYOPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
