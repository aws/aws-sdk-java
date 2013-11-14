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
 * List Jobs Request Marshaller
 */
public class ListJobsRequestMarshaller implements Marshaller<Request<ListJobsRequest>, ListJobsRequest> {

    

    public Request<ListJobsRequest> marshall(ListJobsRequest listJobsRequest) {
    if (listJobsRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<ListJobsRequest> request = new DefaultRequest<ListJobsRequest>(listJobsRequest, "AmazonGlacier");
        String target = "Glacier.ListJobs";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.0");

        
        request.setHttpMethod(HttpMethodName.GET);


        String uriResourcePath = "/{accountId}/vaults/{vaultName}/jobs?marker={marker};limit={limit};completed={completed};statuscode={statuscode}"; 
        uriResourcePath = uriResourcePath.replace("{accountId}", (listJobsRequest.getAccountId() == null) ? "" : StringUtils.fromString(listJobsRequest.getAccountId())); 
        uriResourcePath = uriResourcePath.replace("{vaultName}", (listJobsRequest.getVaultName() == null) ? "" : StringUtils.fromString(listJobsRequest.getVaultName())); 
        uriResourcePath = uriResourcePath.replace("{limit}", (listJobsRequest.getLimit() == null) ? "" : StringUtils.fromString(listJobsRequest.getLimit())); 
        uriResourcePath = uriResourcePath.replace("{marker}", (listJobsRequest.getMarker() == null) ? "" : StringUtils.fromString(listJobsRequest.getMarker())); 
        uriResourcePath = uriResourcePath.replace("{statuscode}", (listJobsRequest.getStatuscode() == null) ? "" : StringUtils.fromString(listJobsRequest.getStatuscode())); 
        uriResourcePath = uriResourcePath.replace("{completed}", (listJobsRequest.getCompleted() == null) ? "" : StringUtils.fromString(listJobsRequest.getCompleted())); 

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
