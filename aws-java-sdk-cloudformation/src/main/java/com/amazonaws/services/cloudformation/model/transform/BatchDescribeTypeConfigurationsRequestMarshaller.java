/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * BatchDescribeTypeConfigurationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDescribeTypeConfigurationsRequestMarshaller implements
        Marshaller<Request<BatchDescribeTypeConfigurationsRequest>, BatchDescribeTypeConfigurationsRequest> {

    public Request<BatchDescribeTypeConfigurationsRequest> marshall(BatchDescribeTypeConfigurationsRequest batchDescribeTypeConfigurationsRequest) {

        if (batchDescribeTypeConfigurationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<BatchDescribeTypeConfigurationsRequest> request = new DefaultRequest<BatchDescribeTypeConfigurationsRequest>(
                batchDescribeTypeConfigurationsRequest, "AmazonCloudFormation");
        request.addParameter("Action", "BatchDescribeTypeConfigurations");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (batchDescribeTypeConfigurationsRequest.getTypeConfigurationIdentifiers().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<TypeConfigurationIdentifier>) batchDescribeTypeConfigurationsRequest
                        .getTypeConfigurationIdentifiers()).isAutoConstruct()) {
            request.addParameter("TypeConfigurationIdentifiers", "");
        }
        if (!batchDescribeTypeConfigurationsRequest.getTypeConfigurationIdentifiers().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<TypeConfigurationIdentifier>) batchDescribeTypeConfigurationsRequest
                        .getTypeConfigurationIdentifiers()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<TypeConfigurationIdentifier> typeConfigurationIdentifiersList = (com.amazonaws.internal.SdkInternalList<TypeConfigurationIdentifier>) batchDescribeTypeConfigurationsRequest
                    .getTypeConfigurationIdentifiers();
            int typeConfigurationIdentifiersListIndex = 1;

            for (TypeConfigurationIdentifier typeConfigurationIdentifiersListValue : typeConfigurationIdentifiersList) {
                if (typeConfigurationIdentifiersListValue != null) {

                    if (typeConfigurationIdentifiersListValue.getTypeArn() != null) {
                        request.addParameter("TypeConfigurationIdentifiers.member." + typeConfigurationIdentifiersListIndex + ".TypeArn",
                                StringUtils.fromString(typeConfigurationIdentifiersListValue.getTypeArn()));
                    }

                    if (typeConfigurationIdentifiersListValue.getTypeConfigurationAlias() != null) {
                        request.addParameter("TypeConfigurationIdentifiers.member." + typeConfigurationIdentifiersListIndex + ".TypeConfigurationAlias",
                                StringUtils.fromString(typeConfigurationIdentifiersListValue.getTypeConfigurationAlias()));
                    }

                    if (typeConfigurationIdentifiersListValue.getTypeConfigurationArn() != null) {
                        request.addParameter("TypeConfigurationIdentifiers.member." + typeConfigurationIdentifiersListIndex + ".TypeConfigurationArn",
                                StringUtils.fromString(typeConfigurationIdentifiersListValue.getTypeConfigurationArn()));
                    }

                    if (typeConfigurationIdentifiersListValue.getType() != null) {
                        request.addParameter("TypeConfigurationIdentifiers.member." + typeConfigurationIdentifiersListIndex + ".Type",
                                StringUtils.fromString(typeConfigurationIdentifiersListValue.getType()));
                    }

                    if (typeConfigurationIdentifiersListValue.getTypeName() != null) {
                        request.addParameter("TypeConfigurationIdentifiers.member." + typeConfigurationIdentifiersListIndex + ".TypeName",
                                StringUtils.fromString(typeConfigurationIdentifiersListValue.getTypeName()));
                    }
                }
                typeConfigurationIdentifiersListIndex++;
            }
        }

        return request;
    }

}
