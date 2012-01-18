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
 * Batch Delete Attributes Request Marshaller
 */
public class BatchDeleteAttributesRequestMarshaller implements Marshaller<Request<BatchDeleteAttributesRequest>, BatchDeleteAttributesRequest> {

    public Request<BatchDeleteAttributesRequest> marshall(BatchDeleteAttributesRequest batchDeleteAttributesRequest) {

        if (batchDeleteAttributesRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<BatchDeleteAttributesRequest> request = new DefaultRequest<BatchDeleteAttributesRequest>(batchDeleteAttributesRequest, "AmazonSimpleDB");
        request.addParameter("Action", "BatchDeleteAttributes");
        request.addParameter("Version", "2009-04-15");

        if (batchDeleteAttributesRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(batchDeleteAttributesRequest.getDomainName()));
        }

        java.util.List<DeletableItem> itemsList = batchDeleteAttributesRequest.getItems();
        int itemsListIndex = 1;

        for (DeletableItem itemsListValue : itemsList) {
            DeletableItem deletableItemMember = itemsListValue;
            if (deletableItemMember != null) {
                if (deletableItemMember.getName() != null) {
                    request.addParameter("Item." + itemsListIndex + ".ItemName", StringUtils.fromString(deletableItemMember.getName()));
                }

                java.util.List<Attribute> attributesList = deletableItemMember.getAttributes();
                int attributesListIndex = 1;

                for (Attribute attributesListValue : attributesList) {
                    Attribute attributeMember = attributesListValue;
                    if (attributeMember != null) {
                        if (attributeMember.getName() != null) {
                            request.addParameter("Item." + itemsListIndex + ".Attribute." + attributesListIndex + ".Name", StringUtils.fromString(attributeMember.getName()));
                        }
                        if (attributeMember.getAlternateNameEncoding() != null) {
                            request.addParameter("Item." + itemsListIndex + ".Attribute." + attributesListIndex + ".AlternateNameEncoding", StringUtils.fromString(attributeMember.getAlternateNameEncoding()));
                        }
                        if (attributeMember.getValue() != null) {
                            request.addParameter("Item." + itemsListIndex + ".Attribute." + attributesListIndex + ".Value", StringUtils.fromString(attributeMember.getValue()));
                        }
                        if (attributeMember.getAlternateValueEncoding() != null) {
                            request.addParameter("Item." + itemsListIndex + ".Attribute." + attributesListIndex + ".AlternateValueEncoding", StringUtils.fromString(attributeMember.getAlternateValueEncoding()));
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
