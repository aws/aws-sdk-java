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
 * CreateDhcpOptionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDhcpOptionsRequestMarshaller implements Marshaller<Request<CreateDhcpOptionsRequest>, CreateDhcpOptionsRequest> {

    public Request<CreateDhcpOptionsRequest> marshall(CreateDhcpOptionsRequest createDhcpOptionsRequest) {

        if (createDhcpOptionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDhcpOptionsRequest> request = new DefaultRequest<CreateDhcpOptionsRequest>(createDhcpOptionsRequest, "AmazonEC2");
        request.addParameter("Action", "CreateDhcpOptions");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<DhcpConfiguration> createDhcpOptionsRequestDhcpConfigurationsList = (com.amazonaws.internal.SdkInternalList<DhcpConfiguration>) createDhcpOptionsRequest
                .getDhcpConfigurations();
        if (!createDhcpOptionsRequestDhcpConfigurationsList.isEmpty() || !createDhcpOptionsRequestDhcpConfigurationsList.isAutoConstruct()) {
            int dhcpConfigurationsListIndex = 1;

            for (DhcpConfiguration createDhcpOptionsRequestDhcpConfigurationsListValue : createDhcpOptionsRequestDhcpConfigurationsList) {

                if (createDhcpOptionsRequestDhcpConfigurationsListValue.getKey() != null) {
                    request.addParameter("DhcpConfiguration." + dhcpConfigurationsListIndex + ".Key",
                            StringUtils.fromString(createDhcpOptionsRequestDhcpConfigurationsListValue.getKey()));
                }

                com.amazonaws.internal.SdkInternalList<String> dhcpConfigurationValuesList = (com.amazonaws.internal.SdkInternalList<String>) createDhcpOptionsRequestDhcpConfigurationsListValue
                        .getValues();
                if (!dhcpConfigurationValuesList.isEmpty() || !dhcpConfigurationValuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String dhcpConfigurationValuesListValue : dhcpConfigurationValuesList) {
                        if (dhcpConfigurationValuesListValue != null) {
                            request.addParameter("DhcpConfiguration." + dhcpConfigurationsListIndex + ".Value." + valuesListIndex,
                                    StringUtils.fromString(dhcpConfigurationValuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                dhcpConfigurationsListIndex++;
            }
        }

        return request;
    }

}
