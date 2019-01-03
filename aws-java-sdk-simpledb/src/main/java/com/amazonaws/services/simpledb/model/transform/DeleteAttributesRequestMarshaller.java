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
package com.amazonaws.services.simpledb.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpledb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DeleteAttributesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAttributesRequestMarshaller implements Marshaller<Request<DeleteAttributesRequest>, DeleteAttributesRequest> {

    public Request<DeleteAttributesRequest> marshall(DeleteAttributesRequest deleteAttributesRequest) {

        if (deleteAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteAttributesRequest> request = new DefaultRequest<DeleteAttributesRequest>(deleteAttributesRequest, "AmazonSimpleDB");
        request.addParameter("Action", "DeleteAttributes");
        request.addParameter("Version", "2009-04-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteAttributesRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(deleteAttributesRequest.getDomainName()));
        }

        if (deleteAttributesRequest.getItemName() != null) {
            request.addParameter("ItemName", StringUtils.fromString(deleteAttributesRequest.getItemName()));
        }

        if (!deleteAttributesRequest.getAttributes().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Attribute>) deleteAttributesRequest.getAttributes()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Attribute> attributesList = (com.amazonaws.internal.SdkInternalList<Attribute>) deleteAttributesRequest
                    .getAttributes();
            int attributesListIndex = 1;

            for (Attribute attributesListValue : attributesList) {

                if (attributesListValue.getName() != null) {
                    request.addParameter("Attribute." + attributesListIndex + ".Name", StringUtils.fromString(attributesListValue.getName()));
                }

                if (attributesListValue.getAlternateNameEncoding() != null) {
                    request.addParameter("Attribute." + attributesListIndex + ".AlternateNameEncoding",
                            StringUtils.fromString(attributesListValue.getAlternateNameEncoding()));
                }

                if (attributesListValue.getValue() != null) {
                    request.addParameter("Attribute." + attributesListIndex + ".Value", StringUtils.fromString(attributesListValue.getValue()));
                }

                if (attributesListValue.getAlternateValueEncoding() != null) {
                    request.addParameter("Attribute." + attributesListIndex + ".AlternateValueEncoding",
                            StringUtils.fromString(attributesListValue.getAlternateValueEncoding()));
                }
                attributesListIndex++;
            }
        }

        {
            UpdateCondition expected = deleteAttributesRequest.getExpected();
            if (expected != null) {

                if (expected.getName() != null) {
                    request.addParameter("Expected.Name", StringUtils.fromString(expected.getName()));
                }

                if (expected.getValue() != null) {
                    request.addParameter("Expected.Value", StringUtils.fromString(expected.getValue()));
                }

                if (expected.getExists() != null) {
                    request.addParameter("Expected.Exists", StringUtils.fromBoolean(expected.getExists()));
                }
            }
        }

        return request;
    }

}
