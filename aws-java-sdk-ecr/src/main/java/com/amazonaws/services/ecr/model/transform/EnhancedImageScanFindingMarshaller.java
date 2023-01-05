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
package com.amazonaws.services.ecr.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecr.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EnhancedImageScanFindingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EnhancedImageScanFindingMarshaller {

    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsAccountId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> FINDINGARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("findingArn").build();
    private static final MarshallingInfo<java.util.Date> FIRSTOBSERVEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("firstObservedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTOBSERVEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastObservedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> PACKAGEVULNERABILITYDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("packageVulnerabilityDetails").build();
    private static final MarshallingInfo<StructuredPojo> REMEDIATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remediation").build();
    private static final MarshallingInfo<List> RESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("resources").build();
    private static final MarshallingInfo<Double> SCORE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("score").build();
    private static final MarshallingInfo<StructuredPojo> SCOREDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scoreDetails").build();
    private static final MarshallingInfo<String> SEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("severity").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("title").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("unixTimestamp").build();

    private static final EnhancedImageScanFindingMarshaller instance = new EnhancedImageScanFindingMarshaller();

    public static EnhancedImageScanFindingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EnhancedImageScanFinding enhancedImageScanFinding, ProtocolMarshaller protocolMarshaller) {

        if (enhancedImageScanFinding == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(enhancedImageScanFinding.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(enhancedImageScanFinding.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(enhancedImageScanFinding.getFindingArn(), FINDINGARN_BINDING);
            protocolMarshaller.marshall(enhancedImageScanFinding.getFirstObservedAt(), FIRSTOBSERVEDAT_BINDING);
            protocolMarshaller.marshall(enhancedImageScanFinding.getLastObservedAt(), LASTOBSERVEDAT_BINDING);
            protocolMarshaller.marshall(enhancedImageScanFinding.getPackageVulnerabilityDetails(), PACKAGEVULNERABILITYDETAILS_BINDING);
            protocolMarshaller.marshall(enhancedImageScanFinding.getRemediation(), REMEDIATION_BINDING);
            protocolMarshaller.marshall(enhancedImageScanFinding.getResources(), RESOURCES_BINDING);
            protocolMarshaller.marshall(enhancedImageScanFinding.getScore(), SCORE_BINDING);
            protocolMarshaller.marshall(enhancedImageScanFinding.getScoreDetails(), SCOREDETAILS_BINDING);
            protocolMarshaller.marshall(enhancedImageScanFinding.getSeverity(), SEVERITY_BINDING);
            protocolMarshaller.marshall(enhancedImageScanFinding.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(enhancedImageScanFinding.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(enhancedImageScanFinding.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(enhancedImageScanFinding.getUpdatedAt(), UPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
