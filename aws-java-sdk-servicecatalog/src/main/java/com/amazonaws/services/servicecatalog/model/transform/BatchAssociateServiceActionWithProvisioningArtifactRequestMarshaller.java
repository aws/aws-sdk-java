/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchAssociateServiceActionWithProvisioningArtifactRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchAssociateServiceActionWithProvisioningArtifactRequestMarshaller {

    private static final MarshallingInfo<List> SERVICEACTIONASSOCIATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceActionAssociations").build();
    private static final MarshallingInfo<String> ACCEPTLANGUAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceptLanguage").build();

    private static final BatchAssociateServiceActionWithProvisioningArtifactRequestMarshaller instance = new BatchAssociateServiceActionWithProvisioningArtifactRequestMarshaller();

    public static BatchAssociateServiceActionWithProvisioningArtifactRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchAssociateServiceActionWithProvisioningArtifactRequest batchAssociateServiceActionWithProvisioningArtifactRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (batchAssociateServiceActionWithProvisioningArtifactRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchAssociateServiceActionWithProvisioningArtifactRequest.getServiceActionAssociations(),
                    SERVICEACTIONASSOCIATIONS_BINDING);
            protocolMarshaller.marshall(batchAssociateServiceActionWithProvisioningArtifactRequest.getAcceptLanguage(), ACCEPTLANGUAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
