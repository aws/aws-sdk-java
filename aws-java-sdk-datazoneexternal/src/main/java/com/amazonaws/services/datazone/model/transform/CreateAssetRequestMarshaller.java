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
package com.amazonaws.services.datazone.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datazone.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateAssetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateAssetRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> DOMAINIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("domainIdentifier").build();
    private static final MarshallingInfo<String> EXTERNALIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalIdentifier").build();
    private static final MarshallingInfo<List> FORMSINPUT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("formsInput").build();
    private static final MarshallingInfo<List> GLOSSARYTERMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("glossaryTerms").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> OWNINGPROJECTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("owningProjectIdentifier").build();
    private static final MarshallingInfo<StructuredPojo> PREDICTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("predictionConfiguration").build();
    private static final MarshallingInfo<String> TYPEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("typeIdentifier").build();
    private static final MarshallingInfo<String> TYPEREVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("typeRevision").build();

    private static final CreateAssetRequestMarshaller instance = new CreateAssetRequestMarshaller();

    public static CreateAssetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateAssetRequest createAssetRequest, ProtocolMarshaller protocolMarshaller) {

        if (createAssetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createAssetRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createAssetRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createAssetRequest.getDomainIdentifier(), DOMAINIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createAssetRequest.getExternalIdentifier(), EXTERNALIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createAssetRequest.getFormsInput(), FORMSINPUT_BINDING);
            protocolMarshaller.marshall(createAssetRequest.getGlossaryTerms(), GLOSSARYTERMS_BINDING);
            protocolMarshaller.marshall(createAssetRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createAssetRequest.getOwningProjectIdentifier(), OWNINGPROJECTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createAssetRequest.getPredictionConfiguration(), PREDICTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createAssetRequest.getTypeIdentifier(), TYPEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createAssetRequest.getTypeRevision(), TYPEREVISION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
