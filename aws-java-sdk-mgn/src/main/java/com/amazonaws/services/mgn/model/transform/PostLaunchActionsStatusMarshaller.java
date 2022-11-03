/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * PostLaunchActionsStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostLaunchActionsStatusMarshaller {

    private static final MarshallingInfo<List> POSTLAUNCHACTIONSLAUNCHSTATUSLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("postLaunchActionsLaunchStatusList").build();
    private static final MarshallingInfo<String> SSMAGENTDISCOVERYDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ssmAgentDiscoveryDatetime").build();

    private static final PostLaunchActionsStatusMarshaller instance = new PostLaunchActionsStatusMarshaller();

    public static PostLaunchActionsStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostLaunchActionsStatus postLaunchActionsStatus, ProtocolMarshaller protocolMarshaller) {

        if (postLaunchActionsStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(postLaunchActionsStatus.getPostLaunchActionsLaunchStatusList(), POSTLAUNCHACTIONSLAUNCHSTATUSLIST_BINDING);
            protocolMarshaller.marshall(postLaunchActionsStatus.getSsmAgentDiscoveryDatetime(), SSMAGENTDISCOVERYDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
