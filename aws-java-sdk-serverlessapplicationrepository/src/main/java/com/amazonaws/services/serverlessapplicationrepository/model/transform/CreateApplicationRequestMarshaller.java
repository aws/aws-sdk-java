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
package com.amazonaws.services.serverlessapplicationrepository.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.serverlessapplicationrepository.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateApplicationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateApplicationRequestMarshaller {

    private static final MarshallingInfo<String> AUTHOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("author").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> HOMEPAGEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("homePageUrl").build();
    private static final MarshallingInfo<List> LABELS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("labels").build();
    private static final MarshallingInfo<String> LICENSEBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseBody").build();
    private static final MarshallingInfo<String> LICENSEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseUrl").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> READMEBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("readmeBody").build();
    private static final MarshallingInfo<String> READMEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("readmeUrl").build();
    private static final MarshallingInfo<String> SEMANTICVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("semanticVersion").build();
    private static final MarshallingInfo<String> SOURCECODEARCHIVEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceCodeArchiveUrl").build();
    private static final MarshallingInfo<String> SOURCECODEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceCodeUrl").build();
    private static final MarshallingInfo<String> SPDXLICENSEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("spdxLicenseId").build();
    private static final MarshallingInfo<String> TEMPLATEBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateBody").build();
    private static final MarshallingInfo<String> TEMPLATEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateUrl").build();

    private static final CreateApplicationRequestMarshaller instance = new CreateApplicationRequestMarshaller();

    public static CreateApplicationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateApplicationRequest createApplicationRequest, ProtocolMarshaller protocolMarshaller) {

        if (createApplicationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createApplicationRequest.getAuthor(), AUTHOR_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getHomePageUrl(), HOMEPAGEURL_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getLabels(), LABELS_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getLicenseBody(), LICENSEBODY_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getLicenseUrl(), LICENSEURL_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getReadmeBody(), READMEBODY_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getReadmeUrl(), READMEURL_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getSemanticVersion(), SEMANTICVERSION_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getSourceCodeArchiveUrl(), SOURCECODEARCHIVEURL_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getSourceCodeUrl(), SOURCECODEURL_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getSpdxLicenseId(), SPDXLICENSEID_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getTemplateBody(), TEMPLATEBODY_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getTemplateUrl(), TEMPLATEURL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
