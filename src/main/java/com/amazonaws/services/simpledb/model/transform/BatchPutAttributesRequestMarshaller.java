/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonClientException;
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

        if (batchPutAttributesRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<BatchPutAttributesRequest> request = new DefaultRequest<BatchPutAttributesRequest>(batchPutAttributesRequest, "AmazonSimpleDB");
        request.addParameter("Action", "BatchPutAttributes");
        request.addParameter("Version", "2009-04-15");

        if (batchPutAttributesRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(batchPutAttributesRequest.getDomainName()));
        }

        java.util.List<ReplaceableItem> itemsList = batchPutAttributesRequest.getItems();
        int itemsListIndex = 1;

        for (ReplaceableItem itemsListValue : itemsList) {
            ReplaceableItem replaceableItemMember = itemsListValue;
            if (replaceableItemMember != null) {
                if (replaceableItemMember.getName() != null) {
                    request.addParameter("Item." + itemsListIndex + ".ItemName", StringUtils.fromString(replaceableItemMember.getName()));
                }

                java.util.List<ReplaceableAttribute> attributesList = replaceableItemMember.getAttributes();
                int attributesListIndex = 1;

                for (ReplaceableAttribute attributesListValue : attributesList) {
                    ReplaceableAttribute replaceableAttributeMember = attributesListValue;
                    if (replaceableAttributeMember != null) {
                        if (replaceableAttributeMember.getName() != null) {
                            request.addParameter("Item." + itemsListIndex + ".Attribute." + attributesListIndex + ".Name", StringUtils.fromString(replaceableAttributeMember.getName()));
                        }
                        if (replaceableAttributeMember.getValue() != null) {
                            request.addParameter("Item." + itemsListIndex + ".Attribute." + attributesListIndex + ".Value", StringUtils.fromString(replaceableAttributeMember.getValue()));
                        }
                        if (replaceableAttributeMember.isReplace() != null) {
                            request.addParameter("Item." + itemsListIndex + ".Attribute." + attributesListIndex + ".Replace", StringUtils.fromBoolean(replaceableAttributeMember.isReplace()));
                        }
                    }

                    attributesListIndex++;
                }
            }

            itemsListIndex++;
        }


        return request;
    }
}
