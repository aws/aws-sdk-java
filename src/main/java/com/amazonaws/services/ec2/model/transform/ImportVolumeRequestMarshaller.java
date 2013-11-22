/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Import Volume Request Marshaller
 */
public class ImportVolumeRequestMarshaller implements Marshaller<Request<ImportVolumeRequest>, ImportVolumeRequest> {

    public Request<ImportVolumeRequest> marshall(ImportVolumeRequest importVolumeRequest) {

        if (importVolumeRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ImportVolumeRequest> request = new DefaultRequest<ImportVolumeRequest>(importVolumeRequest, "AmazonEC2");
        request.addParameter("Action", "ImportVolume");
        request.addParameter("Version", "2013-10-15");

        if (importVolumeRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(importVolumeRequest.getAvailabilityZone()));
        }
        DiskImageDetail diskImageDetailImage = importVolumeRequest.getImage();
        if (diskImageDetailImage != null) {
            if (diskImageDetailImage.getFormat() != null) {
                request.addParameter("Image.Format", StringUtils.fromString(diskImageDetailImage.getFormat()));
            }
            if (diskImageDetailImage.getBytes() != null) {
                request.addParameter("Image.Bytes", StringUtils.fromLong(diskImageDetailImage.getBytes()));
            }
            if (diskImageDetailImage.getImportManifestUrl() != null) {
                request.addParameter("Image.ImportManifestUrl", StringUtils.fromString(diskImageDetailImage.getImportManifestUrl()));
            }
        }
        if (importVolumeRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(importVolumeRequest.getDescription()));
        }
        VolumeDetail volumeDetailVolume = importVolumeRequest.getVolume();
        if (volumeDetailVolume != null) {
            if (volumeDetailVolume.getSize() != null) {
                request.addParameter("Volume.Size", StringUtils.fromLong(volumeDetailVolume.getSize()));
            }
        }


        return request;
    }
}
