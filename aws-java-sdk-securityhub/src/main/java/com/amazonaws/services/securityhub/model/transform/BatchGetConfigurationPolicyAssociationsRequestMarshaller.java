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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchGetConfigurationPolicyAssociationsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchGetConfigurationPolicyAssociationsRequestMarshaller {

    private static final MarshallingInfo<List> CONFIGURATIONPOLICYASSOCIATIONIDENTIFIERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationPolicyAssociationIdentifiers").build();

    private static final BatchGetConfigurationPolicyAssociationsRequestMarshaller instance = new BatchGetConfigurationPolicyAssociationsRequestMarshaller();

    public static BatchGetConfigurationPolicyAssociationsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchGetConfigurationPolicyAssociationsRequest batchGetConfigurationPolicyAssociationsRequest, ProtocolMarshaller protocolMarshaller) {

        if (batchGetConfigurationPolicyAssociationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchGetConfigurationPolicyAssociationsRequest.getConfigurationPolicyAssociationIdentifiers(),
                    CONFIGURATIONPOLICYASSOCIATIONIDENTIFIERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
