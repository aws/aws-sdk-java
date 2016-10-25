/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpledb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * GetAttributesRequest Marshaller
 */

public class GetAttributesRequestMarshaller implements Marshaller<Request<GetAttributesRequest>, GetAttributesRequest> {

    public Request<GetAttributesRequest> marshall(GetAttributesRequest getAttributesRequest) {

        if (getAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetAttributesRequest> request = new DefaultRequest<GetAttributesRequest>(getAttributesRequest, "AmazonSimpleDB");
        request.addParameter("Action", "GetAttributes");
        request.addParameter("Version", "2009-04-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (getAttributesRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(getAttributesRequest.getDomainName()));
        }

        if (getAttributesRequest.getItemName() != null) {
            request.addParameter("ItemName", StringUtils.fromString(getAttributesRequest.getItemName()));
        }

        com.amazonaws.internal.SdkInternalList<String> attributeNamesList = (com.amazonaws.internal.SdkInternalList<String>) getAttributesRequest
                .getAttributeNames();
        if (!attributeNamesList.isEmpty() || !attributeNamesList.isAutoConstruct()) {
            int attributeNamesListIndex = 1;

            for (String attributeNamesListValue : attributeNamesList) {
                if (attributeNamesListValue != null) {
                    request.addParameter("AttributeName." + attributeNamesListIndex, StringUtils.fromString(attributeNamesListValue));
                }
                attributeNamesListIndex++;
            }
        }

        if (getAttributesRequest.getConsistentRead() != null) {
            request.addParameter("ConsistentRead", StringUtils.fromBoolean(getAttributesRequest.getConsistentRead()));
        }

        return request;
    }

}
