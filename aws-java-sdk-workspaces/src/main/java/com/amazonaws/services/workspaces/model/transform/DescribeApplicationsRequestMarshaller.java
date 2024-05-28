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
package com.amazonaws.services.workspaces.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeApplicationsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeApplicationsRequestMarshaller {

    private static final MarshallingInfo<List> APPLICATIONIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationIds").build();
    private static final MarshallingInfo<List> COMPUTETYPENAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComputeTypeNames").build();
    private static final MarshallingInfo<String> LICENSETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseType").build();
    private static final MarshallingInfo<List> OPERATINGSYSTEMNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OperatingSystemNames").build();
    private static final MarshallingInfo<String> OWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Owner").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final DescribeApplicationsRequestMarshaller instance = new DescribeApplicationsRequestMarshaller();

    public static DescribeApplicationsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeApplicationsRequest describeApplicationsRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeApplicationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeApplicationsRequest.getApplicationIds(), APPLICATIONIDS_BINDING);
            protocolMarshaller.marshall(describeApplicationsRequest.getComputeTypeNames(), COMPUTETYPENAMES_BINDING);
            protocolMarshaller.marshall(describeApplicationsRequest.getLicenseType(), LICENSETYPE_BINDING);
            protocolMarshaller.marshall(describeApplicationsRequest.getOperatingSystemNames(), OPERATINGSYSTEMNAMES_BINDING);
            protocolMarshaller.marshall(describeApplicationsRequest.getOwner(), OWNER_BINDING);
            protocolMarshaller.marshall(describeApplicationsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(describeApplicationsRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
