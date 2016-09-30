/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * ImportVolumeRequest Marshaller
 */

public class ImportVolumeRequestMarshaller implements Marshaller<Request<ImportVolumeRequest>, ImportVolumeRequest> {

    public Request<ImportVolumeRequest> marshall(ImportVolumeRequest importVolumeRequest) {

        if (importVolumeRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ImportVolumeRequest> request = new DefaultRequest<ImportVolumeRequest>(importVolumeRequest, "AmazonEC2");
        request.addParameter("Action", "ImportVolume");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (importVolumeRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(importVolumeRequest.getAvailabilityZone()));
        }

        DiskImageDetail image = importVolumeRequest.getImage();
        if (image != null) {

            if (image.getFormat() != null) {
                request.addParameter("Image.Format", StringUtils.fromString(image.getFormat()));
            }

            if (image.getBytes() != null) {
                request.addParameter("Image.Bytes", StringUtils.fromLong(image.getBytes()));
            }

            if (image.getImportManifestUrl() != null) {
                request.addParameter("Image.ImportManifestUrl", StringUtils.fromString(image.getImportManifestUrl()));
            }
        }

        if (importVolumeRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(importVolumeRequest.getDescription()));
        }

        VolumeDetail volume = importVolumeRequest.getVolume();
        if (volume != null) {

            if (volume.getSize() != null) {
                request.addParameter("Volume.Size", StringUtils.fromLong(volume.getSize()));
            }
        }

        return request;
    }

}
