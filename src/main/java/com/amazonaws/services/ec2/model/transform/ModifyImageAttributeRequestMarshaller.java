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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Modify Image Attribute Request Marshaller
 */
public class ModifyImageAttributeRequestMarshaller implements Marshaller<Request<ModifyImageAttributeRequest>, ModifyImageAttributeRequest> {

    public Request<ModifyImageAttributeRequest> marshall(ModifyImageAttributeRequest modifyImageAttributeRequest) {
        Request<ModifyImageAttributeRequest> request = new DefaultRequest<ModifyImageAttributeRequest>(modifyImageAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyImageAttribute");
        request.addParameter("Version", "2010-08-31");
        if (modifyImageAttributeRequest != null) {
            if (modifyImageAttributeRequest.getImageId() != null) {
                request.addParameter("ImageId", StringUtils.fromString(modifyImageAttributeRequest.getImageId()));
            }
        }
        if (modifyImageAttributeRequest != null) {
            if (modifyImageAttributeRequest.getAttribute() != null) {
                request.addParameter("Attribute", StringUtils.fromString(modifyImageAttributeRequest.getAttribute()));
            }
        }
        if (modifyImageAttributeRequest != null) {
            if (modifyImageAttributeRequest.getOperationType() != null) {
                request.addParameter("OperationType", StringUtils.fromString(modifyImageAttributeRequest.getOperationType()));
            }
        }
        if (modifyImageAttributeRequest != null) {
            java.util.List<String> userIdsList = modifyImageAttributeRequest.getUserIds();
            int userIdsListIndex = 1;
            for (String userIdsListValue : userIdsList) {
                if (userIdsListValue != null) {
                    request.addParameter("UserId." + userIdsListIndex, StringUtils.fromString(userIdsListValue));
                }
                userIdsListIndex++;
            }
        }
        if (modifyImageAttributeRequest != null) {
            java.util.List<String> userGroupsList = modifyImageAttributeRequest.getUserGroups();
            int userGroupsListIndex = 1;
            for (String userGroupsListValue : userGroupsList) {
                if (userGroupsListValue != null) {
                    request.addParameter("UserGroup." + userGroupsListIndex, StringUtils.fromString(userGroupsListValue));
                }
                userGroupsListIndex++;
            }
        }
        if (modifyImageAttributeRequest != null) {
            java.util.List<String> productCodesList = modifyImageAttributeRequest.getProductCodes();
            int productCodesListIndex = 1;
            for (String productCodesListValue : productCodesList) {
                if (productCodesListValue != null) {
                    request.addParameter("ProductCode." + productCodesListIndex, StringUtils.fromString(productCodesListValue));
                }
                productCodesListIndex++;
            }
        }
        if (modifyImageAttributeRequest != null) {
            if (modifyImageAttributeRequest.getValue() != null) {
                request.addParameter("Value", StringUtils.fromString(modifyImageAttributeRequest.getValue()));
            }
        }


        return request;
    }
}
