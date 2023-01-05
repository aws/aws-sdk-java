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
package com.amazonaws.services.inspector2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FindingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FindingMarshaller {

    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsAccountId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> EXPLOITAVAILABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exploitAvailable").build();
    private static final MarshallingInfo<StructuredPojo> EXPLOITABILITYDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exploitabilityDetails").build();
    private static final MarshallingInfo<String> FINDINGARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("findingArn").build();
    private static final MarshallingInfo<java.util.Date> FIRSTOBSERVEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("firstObservedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> FIXAVAILABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fixAvailable").build();
    private static final MarshallingInfo<Double> INSPECTORSCORE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inspectorScore").build();
    private static final MarshallingInfo<StructuredPojo> INSPECTORSCOREDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inspectorScoreDetails").build();
    private static final MarshallingInfo<java.util.Date> LASTOBSERVEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastObservedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKREACHABILITYDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkReachabilityDetails").build();
    private static final MarshallingInfo<StructuredPojo> PACKAGEVULNERABILITYDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("packageVulnerabilityDetails").build();
    private static final MarshallingInfo<StructuredPojo> REMEDIATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remediation").build();
    private static final MarshallingInfo<List> RESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("resources").build();
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

    private static final FindingMarshaller instance = new FindingMarshaller();

    public static FindingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Finding finding, ProtocolMarshaller protocolMarshaller) {

        if (finding == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(finding.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(finding.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(finding.getExploitAvailable(), EXPLOITAVAILABLE_BINDING);
            protocolMarshaller.marshall(finding.getExploitabilityDetails(), EXPLOITABILITYDETAILS_BINDING);
            protocolMarshaller.marshall(finding.getFindingArn(), FINDINGARN_BINDING);
            protocolMarshaller.marshall(finding.getFirstObservedAt(), FIRSTOBSERVEDAT_BINDING);
            protocolMarshaller.marshall(finding.getFixAvailable(), FIXAVAILABLE_BINDING);
            protocolMarshaller.marshall(finding.getInspectorScore(), INSPECTORSCORE_BINDING);
            protocolMarshaller.marshall(finding.getInspectorScoreDetails(), INSPECTORSCOREDETAILS_BINDING);
            protocolMarshaller.marshall(finding.getLastObservedAt(), LASTOBSERVEDAT_BINDING);
            protocolMarshaller.marshall(finding.getNetworkReachabilityDetails(), NETWORKREACHABILITYDETAILS_BINDING);
            protocolMarshaller.marshall(finding.getPackageVulnerabilityDetails(), PACKAGEVULNERABILITYDETAILS_BINDING);
            protocolMarshaller.marshall(finding.getRemediation(), REMEDIATION_BINDING);
            protocolMarshaller.marshall(finding.getResources(), RESOURCES_BINDING);
            protocolMarshaller.marshall(finding.getSeverity(), SEVERITY_BINDING);
            protocolMarshaller.marshall(finding.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(finding.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(finding.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(finding.getUpdatedAt(), UPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
