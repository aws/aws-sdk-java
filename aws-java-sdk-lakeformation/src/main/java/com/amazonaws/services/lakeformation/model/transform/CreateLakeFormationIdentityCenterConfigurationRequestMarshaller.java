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
package com.amazonaws.services.lakeformation.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lakeformation.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateLakeFormationIdentityCenterConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateLakeFormationIdentityCenterConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> CATALOGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CatalogId").build();
    private static final MarshallingInfo<String> INSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceArn").build();
    private static final MarshallingInfo<StructuredPojo> EXTERNALFILTERING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExternalFiltering").build();
    private static final MarshallingInfo<List> SHARERECIPIENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShareRecipients").build();

    private static final CreateLakeFormationIdentityCenterConfigurationRequestMarshaller instance = new CreateLakeFormationIdentityCenterConfigurationRequestMarshaller();

    public static CreateLakeFormationIdentityCenterConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateLakeFormationIdentityCenterConfigurationRequest createLakeFormationIdentityCenterConfigurationRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (createLakeFormationIdentityCenterConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createLakeFormationIdentityCenterConfigurationRequest.getCatalogId(), CATALOGID_BINDING);
            protocolMarshaller.marshall(createLakeFormationIdentityCenterConfigurationRequest.getInstanceArn(), INSTANCEARN_BINDING);
            protocolMarshaller.marshall(createLakeFormationIdentityCenterConfigurationRequest.getExternalFiltering(), EXTERNALFILTERING_BINDING);
            protocolMarshaller.marshall(createLakeFormationIdentityCenterConfigurationRequest.getShareRecipients(), SHARERECIPIENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
