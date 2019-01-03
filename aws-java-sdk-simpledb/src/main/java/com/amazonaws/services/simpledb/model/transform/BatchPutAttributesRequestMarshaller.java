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
 * BatchPutAttributesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutAttributesRequestMarshaller implements Marshaller<Request<BatchPutAttributesRequest>, BatchPutAttributesRequest> {

    public Request<BatchPutAttributesRequest> marshall(BatchPutAttributesRequest batchPutAttributesRequest) {

        if (batchPutAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<BatchPutAttributesRequest> request = new DefaultRequest<BatchPutAttributesRequest>(batchPutAttributesRequest, "AmazonSimpleDB");
        request.addParameter("Action", "BatchPutAttributes");
        request.addParameter("Version", "2009-04-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (batchPutAttributesRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(batchPutAttributesRequest.getDomainName()));
        }

        if (!batchPutAttributesRequest.getItems().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ReplaceableItem>) batchPutAttributesRequest.getItems()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ReplaceableItem> itemsList = (com.amazonaws.internal.SdkInternalList<ReplaceableItem>) batchPutAttributesRequest
                    .getItems();
            int itemsListIndex = 1;

            for (ReplaceableItem itemsListValue : itemsList) {

                if (itemsListValue.getName() != null) {
                    request.addParameter("Item." + itemsListIndex + ".ItemName", StringUtils.fromString(itemsListValue.getName()));
                }

                if (!itemsListValue.getAttributes().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<ReplaceableAttribute>) itemsListValue.getAttributes()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<ReplaceableAttribute> attributesList = (com.amazonaws.internal.SdkInternalList<ReplaceableAttribute>) itemsListValue
                            .getAttributes();
                    int attributesListIndex = 1;

                    for (ReplaceableAttribute attributesListValue : attributesList) {

                        if (attributesListValue.getName() != null) {
                            request.addParameter("Item." + itemsListIndex + ".Attribute." + attributesListIndex + ".Name",
                                    StringUtils.fromString(attributesListValue.getName()));
                        }

                        if (attributesListValue.getValue() != null) {
                            request.addParameter("Item." + itemsListIndex + ".Attribute." + attributesListIndex + ".Value",
                                    StringUtils.fromString(attributesListValue.getValue()));
                        }

                        if (attributesListValue.getReplace() != null) {
                            request.addParameter("Item." + itemsListIndex + ".Attribute." + attributesListIndex + ".Replace",
                                    StringUtils.fromBoolean(attributesListValue.getReplace()));
                        }
                        attributesListIndex++;
                    }
                }
                itemsListIndex++;
            }
        }

        return request;
    }

}
