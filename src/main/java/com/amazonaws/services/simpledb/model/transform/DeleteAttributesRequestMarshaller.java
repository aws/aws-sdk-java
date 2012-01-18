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
 * Delete Attributes Request Marshaller
 */
public class DeleteAttributesRequestMarshaller implements Marshaller<Request<DeleteAttributesRequest>, DeleteAttributesRequest> {

    public Request<DeleteAttributesRequest> marshall(DeleteAttributesRequest deleteAttributesRequest) {

        if (deleteAttributesRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DeleteAttributesRequest> request = new DefaultRequest<DeleteAttributesRequest>(deleteAttributesRequest, "AmazonSimpleDB");
        request.addParameter("Action", "DeleteAttributes");
        request.addParameter("Version", "2009-04-15");

        if (deleteAttributesRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(deleteAttributesRequest.getDomainName()));
        }
        if (deleteAttributesRequest.getItemName() != null) {
            request.addParameter("ItemName", StringUtils.fromString(deleteAttributesRequest.getItemName()));
        }

        java.util.List<Attribute> attributesList = deleteAttributesRequest.getAttributes();
        int attributesListIndex = 1;

        for (Attribute attributesListValue : attributesList) {
            Attribute attributeMember = attributesListValue;
            if (attributeMember != null) {
                if (attributeMember.getName() != null) {
                    request.addParameter("Attribute." + attributesListIndex + ".Name", StringUtils.fromString(attributeMember.getName()));
                }
                if (attributeMember.getAlternateNameEncoding() != null) {
                    request.addParameter("Attribute." + attributesListIndex + ".AlternateNameEncoding", StringUtils.fromString(attributeMember.getAlternateNameEncoding()));
                }
                if (attributeMember.getValue() != null) {
                    request.addParameter("Attribute." + attributesListIndex + ".Value", StringUtils.fromString(attributeMember.getValue()));
                }
                if (attributeMember.getAlternateValueEncoding() != null) {
                    request.addParameter("Attribute." + attributesListIndex + ".AlternateValueEncoding", StringUtils.fromString(attributeMember.getAlternateValueEncoding()));
                }
            }

            attributesListIndex++;
        }
        UpdateCondition updateConditionExpected = deleteAttributesRequest.getExpected();
        if (updateConditionExpected != null) {
            if (updateConditionExpected.getName() != null) {
                request.addParameter("Expected.Name", StringUtils.fromString(updateConditionExpected.getName()));
            }
            if (updateConditionExpected.getValue() != null) {
                request.addParameter("Expected.Value", StringUtils.fromString(updateConditionExpected.getValue()));
            }
            if (updateConditionExpected.isExists() != null) {
                request.addParameter("Expected.Exists", StringUtils.fromBoolean(updateConditionExpected.isExists()));
            }
        }


        return request;
    }
}
