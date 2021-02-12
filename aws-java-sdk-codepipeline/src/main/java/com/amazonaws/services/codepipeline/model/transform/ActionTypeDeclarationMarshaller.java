/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codepipeline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActionTypeDeclarationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActionTypeDeclarationMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<StructuredPojo> EXECUTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executor").build();
    private static final MarshallingInfo<StructuredPojo> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("id").build();
    private static final MarshallingInfo<StructuredPojo> INPUTARTIFACTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputArtifactDetails").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTARTIFACTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputArtifactDetails").build();
    private static final MarshallingInfo<StructuredPojo> PERMISSIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("permissions").build();
    private static final MarshallingInfo<List> PROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("properties").build();
    private static final MarshallingInfo<StructuredPojo> URLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("urls").build();

    private static final ActionTypeDeclarationMarshaller instance = new ActionTypeDeclarationMarshaller();

    public static ActionTypeDeclarationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActionTypeDeclaration actionTypeDeclaration, ProtocolMarshaller protocolMarshaller) {

        if (actionTypeDeclaration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(actionTypeDeclaration.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(actionTypeDeclaration.getExecutor(), EXECUTOR_BINDING);
            protocolMarshaller.marshall(actionTypeDeclaration.getId(), ID_BINDING);
            protocolMarshaller.marshall(actionTypeDeclaration.getInputArtifactDetails(), INPUTARTIFACTDETAILS_BINDING);
            protocolMarshaller.marshall(actionTypeDeclaration.getOutputArtifactDetails(), OUTPUTARTIFACTDETAILS_BINDING);
            protocolMarshaller.marshall(actionTypeDeclaration.getPermissions(), PERMISSIONS_BINDING);
            protocolMarshaller.marshall(actionTypeDeclaration.getProperties(), PROPERTIES_BINDING);
            protocolMarshaller.marshall(actionTypeDeclaration.getUrls(), URLS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
