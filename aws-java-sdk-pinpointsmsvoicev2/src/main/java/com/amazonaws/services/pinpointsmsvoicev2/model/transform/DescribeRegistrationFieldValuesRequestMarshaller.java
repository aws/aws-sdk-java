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
package com.amazonaws.services.pinpointsmsvoicev2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointsmsvoicev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeRegistrationFieldValuesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeRegistrationFieldValuesRequestMarshaller {

    private static final MarshallingInfo<String> REGISTRATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistrationId").build();
    private static final MarshallingInfo<Long> VERSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VersionNumber").build();
    private static final MarshallingInfo<String> SECTIONPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SectionPath").build();
    private static final MarshallingInfo<List> FIELDPATHS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FieldPaths").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();

    private static final DescribeRegistrationFieldValuesRequestMarshaller instance = new DescribeRegistrationFieldValuesRequestMarshaller();

    public static DescribeRegistrationFieldValuesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeRegistrationFieldValuesRequest describeRegistrationFieldValuesRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeRegistrationFieldValuesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeRegistrationFieldValuesRequest.getRegistrationId(), REGISTRATIONID_BINDING);
            protocolMarshaller.marshall(describeRegistrationFieldValuesRequest.getVersionNumber(), VERSIONNUMBER_BINDING);
            protocolMarshaller.marshall(describeRegistrationFieldValuesRequest.getSectionPath(), SECTIONPATH_BINDING);
            protocolMarshaller.marshall(describeRegistrationFieldValuesRequest.getFieldPaths(), FIELDPATHS_BINDING);
            protocolMarshaller.marshall(describeRegistrationFieldValuesRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(describeRegistrationFieldValuesRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
