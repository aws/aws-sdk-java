/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.importexport.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.importexport.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CancelJobRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelJobRequestMarshaller implements Marshaller<Request<CancelJobRequest>, CancelJobRequest> {

    public Request<CancelJobRequest> marshall(CancelJobRequest cancelJobRequest) {

        if (cancelJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CancelJobRequest> request = new DefaultRequest<CancelJobRequest>(cancelJobRequest, "AmazonImportExport");
        request.addParameter("Action", "CancelJob");
        request.addParameter("Version", "2010-06-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (cancelJobRequest.getJobId() != null) {
            request.addParameter("JobId", StringUtils.fromString(cancelJobRequest.getJobId()));
        }

        if (cancelJobRequest.getAPIVersion() != null) {
            request.addParameter("APIVersion", StringUtils.fromString(cancelJobRequest.getAPIVersion()));
        }

        return request;
    }

}
