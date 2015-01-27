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
 * Update Job Request Marshaller
 */
public class UpdateJobRequestMarshaller implements Marshaller<Request<UpdateJobRequest>, UpdateJobRequest> {

    public Request<UpdateJobRequest> marshall(UpdateJobRequest updateJobRequest) {

        if (updateJobRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateJobRequest> request = new DefaultRequest<UpdateJobRequest>(updateJobRequest, "AmazonImportExport");
        request.addParameter("Action", "UpdateJob");
        request.addParameter("Version", "2010-06-01");

        if (updateJobRequest.getJobId() != null) {
            request.addParameter("JobId", StringUtils.fromString(updateJobRequest.getJobId()));
        }
        if (updateJobRequest.getManifest() != null) {
            request.addParameter("Manifest", StringUtils.fromString(updateJobRequest.getManifest()));
        }
        if (updateJobRequest.getJobType() != null) {
            request.addParameter("JobType", StringUtils.fromString(updateJobRequest.getJobType()));
        }
        if (updateJobRequest.isValidateOnly() != null) {
            request.addParameter("ValidateOnly", StringUtils.fromBoolean(updateJobRequest.isValidateOnly()));
        }
        if (updateJobRequest.getAPIVersion() != null) {
            request.addParameter("APIVersion", StringUtils.fromString(updateJobRequest.getAPIVersion()));
        }

        return request;
    }
}
