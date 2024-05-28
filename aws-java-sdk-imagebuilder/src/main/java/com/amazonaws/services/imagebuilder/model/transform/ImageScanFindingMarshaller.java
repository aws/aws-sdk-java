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
package com.amazonaws.services.imagebuilder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.imagebuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImageScanFindingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImageScanFindingMarshaller {

    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsAccountId").build();
    private static final MarshallingInfo<String> IMAGEBUILDVERSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageBuildVersionArn").build();
    private static final MarshallingInfo<String> IMAGEPIPELINEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imagePipelineArn").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("title").build();
    private static final MarshallingInfo<StructuredPojo> REMEDIATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remediation").build();
    private static final MarshallingInfo<String> SEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("severity").build();
    private static final MarshallingInfo<java.util.Date> FIRSTOBSERVEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("firstObservedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Double> INSPECTORSCORE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inspectorScore").build();
    private static final MarshallingInfo<StructuredPojo> INSPECTORSCOREDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inspectorScoreDetails").build();
    private static final MarshallingInfo<StructuredPojo> PACKAGEVULNERABILITYDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("packageVulnerabilityDetails").build();
    private static final MarshallingInfo<String> FIXAVAILABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fixAvailable").build();

    private static final ImageScanFindingMarshaller instance = new ImageScanFindingMarshaller();

    public static ImageScanFindingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImageScanFinding imageScanFinding, ProtocolMarshaller protocolMarshaller) {

        if (imageScanFinding == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(imageScanFinding.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(imageScanFinding.getImageBuildVersionArn(), IMAGEBUILDVERSIONARN_BINDING);
            protocolMarshaller.marshall(imageScanFinding.getImagePipelineArn(), IMAGEPIPELINEARN_BINDING);
            protocolMarshaller.marshall(imageScanFinding.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(imageScanFinding.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(imageScanFinding.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(imageScanFinding.getRemediation(), REMEDIATION_BINDING);
            protocolMarshaller.marshall(imageScanFinding.getSeverity(), SEVERITY_BINDING);
            protocolMarshaller.marshall(imageScanFinding.getFirstObservedAt(), FIRSTOBSERVEDAT_BINDING);
            protocolMarshaller.marshall(imageScanFinding.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(imageScanFinding.getInspectorScore(), INSPECTORSCORE_BINDING);
            protocolMarshaller.marshall(imageScanFinding.getInspectorScoreDetails(), INSPECTORSCOREDETAILS_BINDING);
            protocolMarshaller.marshall(imageScanFinding.getPackageVulnerabilityDetails(), PACKAGEVULNERABILITYDETAILS_BINDING);
            protocolMarshaller.marshall(imageScanFinding.getFixAvailable(), FIXAVAILABLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
