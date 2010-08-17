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
 * Put Attributes Request Marshaller
 */
public class PutAttributesRequestMarshaller implements Marshaller<Request<PutAttributesRequest>, PutAttributesRequest> {

    public Request<PutAttributesRequest> marshall(PutAttributesRequest putAttributesRequest) {
        Request<PutAttributesRequest> request = new DefaultRequest<PutAttributesRequest>(putAttributesRequest, "AmazonSimpleDB");
        request.addParameter("Action", "PutAttributes");
        request.addParameter("Version", "2009-04-15");
        if (putAttributesRequest != null) {
            if (putAttributesRequest.getDomainName() != null) {
                request.addParameter("DomainName", StringUtils.fromString(putAttributesRequest.getDomainName()));
            }
        }
        if (putAttributesRequest != null) {
            if (putAttributesRequest.getItemName() != null) {
                request.addParameter("ItemName", StringUtils.fromString(putAttributesRequest.getItemName()));
            }
        }

        if (putAttributesRequest != null) {
            java.util.List<ReplaceableAttribute> attributesList = putAttributesRequest.getAttributes();
            int attributesListIndex = 1;
            for (ReplaceableAttribute attributesListValue : attributesList) {
                if (attributesListValue != null) {
                    if (attributesListValue.getName() != null) {
                        request.addParameter("Attribute." + attributesListIndex + ".Name", StringUtils.fromString(attributesListValue.getName()));
                    }
                }
                if (attributesListValue != null) {
                    if (attributesListValue.getValue() != null) {
                        request.addParameter("Attribute." + attributesListIndex + ".Value", StringUtils.fromString(attributesListValue.getValue()));
                    }
                }
                if (attributesListValue != null) {
                    if (attributesListValue.isReplace() != null) {
                        request.addParameter("Attribute." + attributesListIndex + ".Replace", StringUtils.fromBoolean(attributesListValue.isReplace()));
                    }
                }

                attributesListIndex++;
            }
        }
        if (putAttributesRequest != null) {
            UpdateCondition expected = putAttributesRequest.getExpected();
            if (expected != null) {
                if (expected.getName() != null) {
                    request.addParameter("Expected.Name", StringUtils.fromString(expected.getName()));
                }
            }
            if (expected != null) {
                if (expected.getValue() != null) {
                    request.addParameter("Expected.Value", StringUtils.fromString(expected.getValue()));
                }
            }
            if (expected != null) {
                if (expected.isExists() != null) {
                    request.addParameter("Expected.Exists", StringUtils.fromBoolean(expected.isExists()));
                }
            }
        }


        return request;
    }
}
