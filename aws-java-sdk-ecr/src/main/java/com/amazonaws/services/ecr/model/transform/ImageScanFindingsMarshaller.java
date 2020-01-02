/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecr.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImageScanFindingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImageScanFindingsMarshaller {

    private static final MarshallingInfo<java.util.Date> IMAGESCANCOMPLETEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageScanCompletedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> VULNERABILITYSOURCEUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vulnerabilitySourceUpdatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> FINDINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("findings").build();
    private static final MarshallingInfo<Map> FINDINGSEVERITYCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("findingSeverityCounts").build();

    private static final ImageScanFindingsMarshaller instance = new ImageScanFindingsMarshaller();

    public static ImageScanFindingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImageScanFindings imageScanFindings, ProtocolMarshaller protocolMarshaller) {

        if (imageScanFindings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(imageScanFindings.getImageScanCompletedAt(), IMAGESCANCOMPLETEDAT_BINDING);
            protocolMarshaller.marshall(imageScanFindings.getVulnerabilitySourceUpdatedAt(), VULNERABILITYSOURCEUPDATEDAT_BINDING);
            protocolMarshaller.marshall(imageScanFindings.getFindings(), FINDINGS_BINDING);
            protocolMarshaller.marshall(imageScanFindings.getFindingSeverityCounts(), FINDINGSEVERITYCOUNTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
