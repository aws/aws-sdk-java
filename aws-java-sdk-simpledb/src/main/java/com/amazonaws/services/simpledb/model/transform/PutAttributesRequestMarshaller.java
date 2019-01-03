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
 * PutAttributesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAttributesRequestMarshaller implements Marshaller<Request<PutAttributesRequest>, PutAttributesRequest> {

    public Request<PutAttributesRequest> marshall(PutAttributesRequest putAttributesRequest) {

        if (putAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutAttributesRequest> request = new DefaultRequest<PutAttributesRequest>(putAttributesRequest, "AmazonSimpleDB");
        request.addParameter("Action", "PutAttributes");
        request.addParameter("Version", "2009-04-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (putAttributesRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(putAttributesRequest.getDomainName()));
        }

        if (putAttributesRequest.getItemName() != null) {
            request.addParameter("ItemName", StringUtils.fromString(putAttributesRequest.getItemName()));
        }

        if (!putAttributesRequest.getAttributes().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ReplaceableAttribute>) putAttributesRequest.getAttributes()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ReplaceableAttribute> attributesList = (com.amazonaws.internal.SdkInternalList<ReplaceableAttribute>) putAttributesRequest
                    .getAttributes();
            int attributesListIndex = 1;

            for (ReplaceableAttribute attributesListValue : attributesList) {

                if (attributesListValue.getName() != null) {
                    request.addParameter("Attribute." + attributesListIndex + ".Name", StringUtils.fromString(attributesListValue.getName()));
                }

                if (attributesListValue.getValue() != null) {
                    request.addParameter("Attribute." + attributesListIndex + ".Value", StringUtils.fromString(attributesListValue.getValue()));
                }

                if (attributesListValue.getReplace() != null) {
                    request.addParameter("Attribute." + attributesListIndex + ".Replace", StringUtils.fromBoolean(attributesListValue.getReplace()));
                }
                attributesListIndex++;
            }
        }

        {
            UpdateCondition expected = putAttributesRequest.getExpected();
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
