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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeThemeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeThemeRequestMarshaller {

    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("AwsAccountId").build();
    private static final MarshallingInfo<String> THEMEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("ThemeId").build();
    private static final MarshallingInfo<Long> VERSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("version-number").build();
    private static final MarshallingInfo<String> ALIASNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("alias-name").build();

    private static final DescribeThemeRequestMarshaller instance = new DescribeThemeRequestMarshaller();

    public static DescribeThemeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeThemeRequest describeThemeRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeThemeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeThemeRequest.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(describeThemeRequest.getThemeId(), THEMEID_BINDING);
            protocolMarshaller.marshall(describeThemeRequest.getVersionNumber(), VERSIONNUMBER_BINDING);
            protocolMarshaller.marshall(describeThemeRequest.getAliasName(), ALIASNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
