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
package com.amazonaws.services.mgn.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mgn.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PostLaunchActionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostLaunchActionsMarshaller {

    private static final MarshallingInfo<String> CLOUDWATCHLOGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cloudWatchLogGroupName").build();
    private static final MarshallingInfo<String> DEPLOYMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deployment").build();
    private static final MarshallingInfo<String> S3LOGBUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3LogBucket").build();
    private static final MarshallingInfo<String> S3OUTPUTKEYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3OutputKeyPrefix").build();
    private static final MarshallingInfo<List> SSMDOCUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ssmDocuments").build();

    private static final PostLaunchActionsMarshaller instance = new PostLaunchActionsMarshaller();

    public static PostLaunchActionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostLaunchActions postLaunchActions, ProtocolMarshaller protocolMarshaller) {

        if (postLaunchActions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(postLaunchActions.getCloudWatchLogGroupName(), CLOUDWATCHLOGGROUPNAME_BINDING);
            protocolMarshaller.marshall(postLaunchActions.getDeployment(), DEPLOYMENT_BINDING);
            protocolMarshaller.marshall(postLaunchActions.getS3LogBucket(), S3LOGBUCKET_BINDING);
            protocolMarshaller.marshall(postLaunchActions.getS3OutputKeyPrefix(), S3OUTPUTKEYPREFIX_BINDING);
            protocolMarshaller.marshall(postLaunchActions.getSsmDocuments(), SSMDOCUMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
