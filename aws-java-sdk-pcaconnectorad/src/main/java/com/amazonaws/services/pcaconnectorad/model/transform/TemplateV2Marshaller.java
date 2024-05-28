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
package com.amazonaws.services.pcaconnectorad.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pcaconnectorad.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TemplateV2Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TemplateV2Marshaller {

    private static final MarshallingInfo<StructuredPojo> CERTIFICATEVALIDITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateValidity").build();
    private static final MarshallingInfo<StructuredPojo> ENROLLMENTFLAGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnrollmentFlags").build();
    private static final MarshallingInfo<StructuredPojo> EXTENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Extensions").build();
    private static final MarshallingInfo<StructuredPojo> GENERALFLAGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GeneralFlags").build();
    private static final MarshallingInfo<StructuredPojo> PRIVATEKEYATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivateKeyAttributes").build();
    private static final MarshallingInfo<StructuredPojo> PRIVATEKEYFLAGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivateKeyFlags").build();
    private static final MarshallingInfo<StructuredPojo> SUBJECTNAMEFLAGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubjectNameFlags").build();
    private static final MarshallingInfo<List> SUPERSEDEDTEMPLATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupersededTemplates").build();

    private static final TemplateV2Marshaller instance = new TemplateV2Marshaller();

    public static TemplateV2Marshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TemplateV2 templateV2, ProtocolMarshaller protocolMarshaller) {

        if (templateV2 == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(templateV2.getCertificateValidity(), CERTIFICATEVALIDITY_BINDING);
            protocolMarshaller.marshall(templateV2.getEnrollmentFlags(), ENROLLMENTFLAGS_BINDING);
            protocolMarshaller.marshall(templateV2.getExtensions(), EXTENSIONS_BINDING);
            protocolMarshaller.marshall(templateV2.getGeneralFlags(), GENERALFLAGS_BINDING);
            protocolMarshaller.marshall(templateV2.getPrivateKeyAttributes(), PRIVATEKEYATTRIBUTES_BINDING);
            protocolMarshaller.marshall(templateV2.getPrivateKeyFlags(), PRIVATEKEYFLAGS_BINDING);
            protocolMarshaller.marshall(templateV2.getSubjectNameFlags(), SUBJECTNAMEFLAGS_BINDING);
            protocolMarshaller.marshall(templateV2.getSupersededTemplates(), SUPERSEDEDTEMPLATES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
