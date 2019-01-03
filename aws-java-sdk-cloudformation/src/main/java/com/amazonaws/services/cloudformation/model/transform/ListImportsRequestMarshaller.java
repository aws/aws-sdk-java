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
package com.amazonaws.services.cloudformation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ListImportsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImportsRequestMarshaller implements Marshaller<Request<ListImportsRequest>, ListImportsRequest> {

    public Request<ListImportsRequest> marshall(ListImportsRequest listImportsRequest) {

        if (listImportsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListImportsRequest> request = new DefaultRequest<ListImportsRequest>(listImportsRequest, "AmazonCloudFormation");
        request.addParameter("Action", "ListImports");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (listImportsRequest.getExportName() != null) {
            request.addParameter("ExportName", StringUtils.fromString(listImportsRequest.getExportName()));
        }

        if (listImportsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listImportsRequest.getNextToken()));
        }

        return request;
    }

}
