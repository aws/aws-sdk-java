/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.importexport.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.importexport.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * List Jobs Request Marshaller
 */
public class ListJobsRequestMarshaller implements Marshaller<Request<ListJobsRequest>, ListJobsRequest> {

    public Request<ListJobsRequest> marshall(ListJobsRequest listJobsRequest) {

        if (listJobsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListJobsRequest> request = new DefaultRequest<ListJobsRequest>(listJobsRequest, "AmazonImportExport");
        request.addParameter("Action", "ListJobs");
        request.addParameter("Version", "2010-06-01");

        if (listJobsRequest.getMaxJobs() != null) {
            request.addParameter("MaxJobs", StringUtils.fromInteger(listJobsRequest.getMaxJobs()));
        }
        if (listJobsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(listJobsRequest.getMarker()));
        }
        if (listJobsRequest.getAPIVersion() != null) {
            request.addParameter("APIVersion", StringUtils.fromString(listJobsRequest.getAPIVersion()));
        }

        return request;
    }
}
