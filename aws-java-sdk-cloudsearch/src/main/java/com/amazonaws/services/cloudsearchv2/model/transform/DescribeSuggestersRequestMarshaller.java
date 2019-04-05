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
package com.amazonaws.services.cloudsearchv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudsearchv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeSuggestersRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSuggestersRequestMarshaller implements Marshaller<Request<DescribeSuggestersRequest>, DescribeSuggestersRequest> {

    public Request<DescribeSuggestersRequest> marshall(DescribeSuggestersRequest describeSuggestersRequest) {

        if (describeSuggestersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeSuggestersRequest> request = new DefaultRequest<DescribeSuggestersRequest>(describeSuggestersRequest, "AmazonCloudSearchv2");
        request.addParameter("Action", "DescribeSuggesters");
        request.addParameter("Version", "2013-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeSuggestersRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(describeSuggestersRequest.getDomainName()));
        }

        if (!describeSuggestersRequest.getSuggesterNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeSuggestersRequest.getSuggesterNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> suggesterNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeSuggestersRequest
                    .getSuggesterNames();
            int suggesterNamesListIndex = 1;

            for (String suggesterNamesListValue : suggesterNamesList) {
                if (suggesterNamesListValue != null) {
                    request.addParameter("SuggesterNames.member." + suggesterNamesListIndex, StringUtils.fromString(suggesterNamesListValue));
                }
                suggesterNamesListIndex++;
            }
        }

        if (describeSuggestersRequest.getDeployed() != null) {
            request.addParameter("Deployed", StringUtils.fromBoolean(describeSuggestersRequest.getDeployed()));
        }

        return request;
    }

}
