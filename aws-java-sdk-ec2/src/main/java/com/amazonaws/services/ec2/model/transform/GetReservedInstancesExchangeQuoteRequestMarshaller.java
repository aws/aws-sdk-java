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
 * GetReservedInstancesExchangeQuoteRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReservedInstancesExchangeQuoteRequestMarshaller implements
        Marshaller<Request<GetReservedInstancesExchangeQuoteRequest>, GetReservedInstancesExchangeQuoteRequest> {

    public Request<GetReservedInstancesExchangeQuoteRequest> marshall(GetReservedInstancesExchangeQuoteRequest getReservedInstancesExchangeQuoteRequest) {

        if (getReservedInstancesExchangeQuoteRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetReservedInstancesExchangeQuoteRequest> request = new DefaultRequest<GetReservedInstancesExchangeQuoteRequest>(
                getReservedInstancesExchangeQuoteRequest, "AmazonEC2");
        request.addParameter("Action", "GetReservedInstancesExchangeQuote");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> getReservedInstancesExchangeQuoteRequestReservedInstanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) getReservedInstancesExchangeQuoteRequest
                .getReservedInstanceIds();
        if (!getReservedInstancesExchangeQuoteRequestReservedInstanceIdsList.isEmpty()
                || !getReservedInstancesExchangeQuoteRequestReservedInstanceIdsList.isAutoConstruct()) {
            int reservedInstanceIdsListIndex = 1;

            for (String getReservedInstancesExchangeQuoteRequestReservedInstanceIdsListValue : getReservedInstancesExchangeQuoteRequestReservedInstanceIdsList) {
                if (getReservedInstancesExchangeQuoteRequestReservedInstanceIdsListValue != null) {
                    request.addParameter("ReservedInstanceId." + reservedInstanceIdsListIndex,
                            StringUtils.fromString(getReservedInstancesExchangeQuoteRequestReservedInstanceIdsListValue));
                }
                reservedInstanceIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<TargetConfigurationRequest> getReservedInstancesExchangeQuoteRequestTargetConfigurationsList = (com.amazonaws.internal.SdkInternalList<TargetConfigurationRequest>) getReservedInstancesExchangeQuoteRequest
                .getTargetConfigurations();
        if (!getReservedInstancesExchangeQuoteRequestTargetConfigurationsList.isEmpty()
                || !getReservedInstancesExchangeQuoteRequestTargetConfigurationsList.isAutoConstruct()) {
            int targetConfigurationsListIndex = 1;

            for (TargetConfigurationRequest getReservedInstancesExchangeQuoteRequestTargetConfigurationsListValue : getReservedInstancesExchangeQuoteRequestTargetConfigurationsList) {

                if (getReservedInstancesExchangeQuoteRequestTargetConfigurationsListValue.getInstanceCount() != null) {
                    request.addParameter("TargetConfiguration." + targetConfigurationsListIndex + ".InstanceCount",
                            StringUtils.fromInteger(getReservedInstancesExchangeQuoteRequestTargetConfigurationsListValue.getInstanceCount()));
                }

                if (getReservedInstancesExchangeQuoteRequestTargetConfigurationsListValue.getOfferingId() != null) {
                    request.addParameter("TargetConfiguration." + targetConfigurationsListIndex + ".OfferingId",
                            StringUtils.fromString(getReservedInstancesExchangeQuoteRequestTargetConfigurationsListValue.getOfferingId()));
                }
                targetConfigurationsListIndex++;
            }
        }

        return request;
    }

}
