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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateFleetAdvisorCollectorRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateFleetAdvisorCollectorRequestMarshaller {

    private static final MarshallingInfo<String> COLLECTORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CollectorName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> SERVICEACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceAccessRoleArn").build();
    private static final MarshallingInfo<String> S3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BucketName").build();

    private static final CreateFleetAdvisorCollectorRequestMarshaller instance = new CreateFleetAdvisorCollectorRequestMarshaller();

    public static CreateFleetAdvisorCollectorRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateFleetAdvisorCollectorRequest createFleetAdvisorCollectorRequest, ProtocolMarshaller protocolMarshaller) {

        if (createFleetAdvisorCollectorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createFleetAdvisorCollectorRequest.getCollectorName(), COLLECTORNAME_BINDING);
            protocolMarshaller.marshall(createFleetAdvisorCollectorRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createFleetAdvisorCollectorRequest.getServiceAccessRoleArn(), SERVICEACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(createFleetAdvisorCollectorRequest.getS3BucketName(), S3BUCKETNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
