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
package com.amazonaws.services.cloudsearchv2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudsearchv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeIndexFieldsRequest Marshaller
 */

public class DescribeIndexFieldsRequestMarshaller implements Marshaller<Request<DescribeIndexFieldsRequest>, DescribeIndexFieldsRequest> {

    public Request<DescribeIndexFieldsRequest> marshall(DescribeIndexFieldsRequest describeIndexFieldsRequest) {

        if (describeIndexFieldsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeIndexFieldsRequest> request = new DefaultRequest<DescribeIndexFieldsRequest>(describeIndexFieldsRequest, "AmazonCloudSearchv2");
        request.addParameter("Action", "DescribeIndexFields");
        request.addParameter("Version", "2013-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeIndexFieldsRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(describeIndexFieldsRequest.getDomainName()));
        }

        com.amazonaws.internal.SdkInternalList<String> fieldNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeIndexFieldsRequest
                .getFieldNames();
        if (!fieldNamesList.isEmpty() || !fieldNamesList.isAutoConstruct()) {
            int fieldNamesListIndex = 1;

            for (String fieldNamesListValue : fieldNamesList) {
                if (fieldNamesListValue != null) {
                    request.addParameter("FieldNames.member." + fieldNamesListIndex, StringUtils.fromString(fieldNamesListValue));
                }
                fieldNamesListIndex++;
            }
        }

        if (describeIndexFieldsRequest.getDeployed() != null) {
            request.addParameter("Deployed", StringUtils.fromBoolean(describeIndexFieldsRequest.getDeployed()));
        }

        return request;
    }

}
