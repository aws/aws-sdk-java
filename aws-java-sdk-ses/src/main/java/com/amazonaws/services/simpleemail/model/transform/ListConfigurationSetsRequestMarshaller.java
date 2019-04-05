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
package com.amazonaws.services.simpleemail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ListConfigurationSetsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConfigurationSetsRequestMarshaller implements Marshaller<Request<ListConfigurationSetsRequest>, ListConfigurationSetsRequest> {

    public Request<ListConfigurationSetsRequest> marshall(ListConfigurationSetsRequest listConfigurationSetsRequest) {

        if (listConfigurationSetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListConfigurationSetsRequest> request = new DefaultRequest<ListConfigurationSetsRequest>(listConfigurationSetsRequest,
                "AmazonSimpleEmailService");
        request.addParameter("Action", "ListConfigurationSets");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (listConfigurationSetsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listConfigurationSetsRequest.getNextToken()));
        }

        if (listConfigurationSetsRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils.fromInteger(listConfigurationSetsRequest.getMaxItems()));
        }

        return request;
    }

}
