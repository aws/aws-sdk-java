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
package com.amazonaws.services.codedeploy.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codedeploy.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RevisionLocationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RevisionLocationMarshaller {

    private static final MarshallingInfo<String> REVISIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("revisionType").build();
    private static final MarshallingInfo<StructuredPojo> S3LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3Location").build();
    private static final MarshallingInfo<StructuredPojo> GITHUBLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("gitHubLocation").build();
    private static final MarshallingInfo<StructuredPojo> STRING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("string").build();
    private static final MarshallingInfo<StructuredPojo> APPSPECCONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("appSpecContent").build();

    private static final RevisionLocationMarshaller instance = new RevisionLocationMarshaller();

    public static RevisionLocationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RevisionLocation revisionLocation, ProtocolMarshaller protocolMarshaller) {

        if (revisionLocation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(revisionLocation.getRevisionType(), REVISIONTYPE_BINDING);
            protocolMarshaller.marshall(revisionLocation.getS3Location(), S3LOCATION_BINDING);
            protocolMarshaller.marshall(revisionLocation.getGitHubLocation(), GITHUBLOCATION_BINDING);
            protocolMarshaller.marshall(revisionLocation.getString(), STRING_BINDING);
            protocolMarshaller.marshall(revisionLocation.getAppSpecContent(), APPSPECCONTENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
