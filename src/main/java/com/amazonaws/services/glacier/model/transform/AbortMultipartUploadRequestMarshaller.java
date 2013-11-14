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
package com.amazonaws.services.glacier.model.transform;


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
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Abort Multipart Upload Request Marshaller
 */
public class AbortMultipartUploadRequestMarshaller implements Marshaller<Request<AbortMultipartUploadRequest>, AbortMultipartUploadRequest> {

    

    public Request<AbortMultipartUploadRequest> marshall(AbortMultipartUploadRequest abortMultipartUploadRequest) {
    if (abortMultipartUploadRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<AbortMultipartUploadRequest> request = new DefaultRequest<AbortMultipartUploadRequest>(abortMultipartUploadRequest, "AmazonGlacier");
        String target = "Glacier.AbortMultipartUpload";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.0");

        
        request.setHttpMethod(HttpMethodName.DELETE);


        String uriResourcePath = "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}"; 
        uriResourcePath = uriResourcePath.replace("{accountId}", (abortMultipartUploadRequest.getAccountId() == null) ? "" : StringUtils.fromString(abortMultipartUploadRequest.getAccountId())); 
        uriResourcePath = uriResourcePath.replace("{vaultName}", (abortMultipartUploadRequest.getVaultName() == null) ? "" : StringUtils.fromString(abortMultipartUploadRequest.getVaultName())); 
        uriResourcePath = uriResourcePath.replace("{uploadId}", (abortMultipartUploadRequest.getUploadId() == null) ? "" : StringUtils.fromString(abortMultipartUploadRequest.getUploadId())); 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    request.addParameter(nameValuePair[0], nameValuePair[1]);
                } else {
                    request.addParameter(s, null);
                }
            }
        }

        request.setResourcePath(uriResourcePath);


        
        request.setContent(new ByteArrayInputStream(new byte[0]));
        

        return request;
    }
}
