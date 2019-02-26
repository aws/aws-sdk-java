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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribePrincipalIdFormatRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePrincipalIdFormatRequestMarshaller implements Marshaller<Request<DescribePrincipalIdFormatRequest>, DescribePrincipalIdFormatRequest> {

    public Request<DescribePrincipalIdFormatRequest> marshall(DescribePrincipalIdFormatRequest describePrincipalIdFormatRequest) {

        if (describePrincipalIdFormatRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribePrincipalIdFormatRequest> request = new DefaultRequest<DescribePrincipalIdFormatRequest>(describePrincipalIdFormatRequest, "AmazonEC2");
        request.addParameter("Action", "DescribePrincipalIdFormat");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describePrincipalIdFormatRequestResourcesList = (com.amazonaws.internal.SdkInternalList<String>) describePrincipalIdFormatRequest
                .getResources();
        if (!describePrincipalIdFormatRequestResourcesList.isEmpty() || !describePrincipalIdFormatRequestResourcesList.isAutoConstruct()) {
            int resourcesListIndex = 1;

            for (String describePrincipalIdFormatRequestResourcesListValue : describePrincipalIdFormatRequestResourcesList) {
                if (describePrincipalIdFormatRequestResourcesListValue != null) {
                    request.addParameter("Resource." + resourcesListIndex, StringUtils.fromString(describePrincipalIdFormatRequestResourcesListValue));
                }
                resourcesListIndex++;
            }
        }

        if (describePrincipalIdFormatRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describePrincipalIdFormatRequest.getMaxResults()));
        }

        if (describePrincipalIdFormatRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describePrincipalIdFormatRequest.getNextToken()));
        }

        return request;
    }

}
