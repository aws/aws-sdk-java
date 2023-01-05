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
package com.amazonaws.services.panorama.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.panorama.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateNodeFromTemplateJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateNodeFromTemplateJobRequestMarshaller {

    private static final MarshallingInfo<List> JOBTAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobTags").build();
    private static final MarshallingInfo<String> NODEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NodeDescription").build();
    private static final MarshallingInfo<String> NODENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NodeName").build();
    private static final MarshallingInfo<String> OUTPUTPACKAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputPackageName").build();
    private static final MarshallingInfo<String> OUTPUTPACKAGEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputPackageVersion").build();
    private static final MarshallingInfo<Map> TEMPLATEPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateParameters").build();
    private static final MarshallingInfo<String> TEMPLATETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TemplateType").build();

    private static final CreateNodeFromTemplateJobRequestMarshaller instance = new CreateNodeFromTemplateJobRequestMarshaller();

    public static CreateNodeFromTemplateJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateNodeFromTemplateJobRequest createNodeFromTemplateJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createNodeFromTemplateJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createNodeFromTemplateJobRequest.getJobTags(), JOBTAGS_BINDING);
            protocolMarshaller.marshall(createNodeFromTemplateJobRequest.getNodeDescription(), NODEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createNodeFromTemplateJobRequest.getNodeName(), NODENAME_BINDING);
            protocolMarshaller.marshall(createNodeFromTemplateJobRequest.getOutputPackageName(), OUTPUTPACKAGENAME_BINDING);
            protocolMarshaller.marshall(createNodeFromTemplateJobRequest.getOutputPackageVersion(), OUTPUTPACKAGEVERSION_BINDING);
            protocolMarshaller.marshall(createNodeFromTemplateJobRequest.getTemplateParameters(), TEMPLATEPARAMETERS_BINDING);
            protocolMarshaller.marshall(createNodeFromTemplateJobRequest.getTemplateType(), TEMPLATETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
