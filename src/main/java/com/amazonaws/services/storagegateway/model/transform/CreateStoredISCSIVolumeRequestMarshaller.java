/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model.transform;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

import static com.amazonaws.http.HttpMethodName.POST;

/**
 * Create Stored I S C S I Volume Request Marshaller
 */
public class CreateStoredISCSIVolumeRequestMarshaller implements Marshaller<Request<CreateStoredISCSIVolumeRequest>, CreateStoredISCSIVolumeRequest> {

    public Request<CreateStoredISCSIVolumeRequest> marshall(CreateStoredISCSIVolumeRequest createStoredISCSIVolumeRequest) {
		if (createStoredISCSIVolumeRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreateStoredISCSIVolumeRequest> request = new DefaultRequest<CreateStoredISCSIVolumeRequest>(createStoredISCSIVolumeRequest, "AWSStorageGateway");
        String target = "StorageGateway_20120430.CreateStorediSCSIVolume";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.1");
        request.setHttpMethod(POST);

        try {
        	StringWriter stringWriter = new StringWriter();
        	JSONWriter jsonWriter = new JSONWriter(stringWriter);
        	jsonWriter.object();
	        
            if (createStoredISCSIVolumeRequest.getGatewayARN() != null) {
                jsonWriter.key("GatewayARN").value(createStoredISCSIVolumeRequest.getGatewayARN());
            }
            if (createStoredISCSIVolumeRequest.getDiskId() != null) {
                jsonWriter.key("DiskId").value(createStoredISCSIVolumeRequest.getDiskId());
            }
            if (createStoredISCSIVolumeRequest.getSnapshotId() != null) {
                jsonWriter.key("SnapshotId").value(createStoredISCSIVolumeRequest.getSnapshotId());
            }
            if (createStoredISCSIVolumeRequest.isPreserveExistingData() != null) {
                jsonWriter.key("PreserveExistingData").value(createStoredISCSIVolumeRequest.isPreserveExistingData());
            }
            if (createStoredISCSIVolumeRequest.getTargetName() != null) {
                jsonWriter.key("TargetName").value(createStoredISCSIVolumeRequest.getTargetName());
            }
            if (createStoredISCSIVolumeRequest.getNetworkInterfaceId() != null) {
                jsonWriter.key("NetworkInterfaceId").value(createStoredISCSIVolumeRequest.getNetworkInterfaceId());
            }

    	    jsonWriter.endObject();

    	    String snippet = stringWriter.toString();
    	    byte[] content = snippet.getBytes("UTF-8");
        	request.setContent(new StringInputStream(snippet));
	        request.addHeader("Content-Length", Integer.toString(content.length));
            return request;
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }
}
