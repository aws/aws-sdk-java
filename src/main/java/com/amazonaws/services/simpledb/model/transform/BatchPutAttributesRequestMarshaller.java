/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpledb.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.simpledb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Batch Put Attributes Request Marshaller
 */
public class BatchPutAttributesRequestMarshaller implements Marshaller<Request<BatchPutAttributesRequest>, BatchPutAttributesRequest> {

    public Request<BatchPutAttributesRequest> marshall(BatchPutAttributesRequest batchPutAttributesRequest) {
        Request<BatchPutAttributesRequest> request = new DefaultRequest<BatchPutAttributesRequest>(batchPutAttributesRequest, "AmazonSimpleDB");
        request.addParameter("Action", "BatchPutAttributes");
        request.addParameter("Version", "2009-04-15");
        if (batchPutAttributesRequest != null) {
            if (batchPutAttributesRequest.getDomainName() != null) {
                request.addParameter("DomainName", StringUtils.fromString(batchPutAttributesRequest.getDomainName()));
            }
        }

        if (batchPutAttributesRequest != null) {
            java.util.List<ReplaceableItem> itemsList = batchPutAttributesRequest.getItems();
            int itemsListIndex = 1;
            for (ReplaceableItem itemsListValue : itemsList) {
                if (itemsListValue != null) {
                    if (itemsListValue.getName() != null) {
                        request.addParameter("Item." + itemsListIndex + ".ItemName", StringUtils.fromString(itemsListValue.getName()));
                    }
                }

                if (itemsListValue != null) {
                    java.util.List<ReplaceableAttribute> attributesList = itemsListValue.getAttributes();
                    int attributesListIndex = 1;
                    for (ReplaceableAttribute attributesListValue : attributesList) {
                        if (attributesListValue != null) {
                            if (attributesListValue.getName() != null) {
                                request.addParameter("Item." + itemsListIndex + ".Attribute." + attributesListIndex + ".Name", StringUtils.fromString(attributesListValue.getName()));
                            }
                        }
                        if (attributesListValue != null) {
                            if (attributesListValue.getValue() != null) {
                                request.addParameter("Item." + itemsListIndex + ".Attribute." + attributesListIndex + ".Value", StringUtils.fromString(attributesListValue.getValue()));
                            }
                        }
                        if (attributesListValue != null) {
                            if (attributesListValue.isReplace() != null) {
                                request.addParameter("Item." + itemsListIndex + ".Attribute." + attributesListIndex + ".Replace", StringUtils.fromBoolean(attributesListValue.isReplace()));
                            }
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
