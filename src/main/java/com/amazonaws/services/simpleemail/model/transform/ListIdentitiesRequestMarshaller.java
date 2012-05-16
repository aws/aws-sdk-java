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
package com.amazonaws.services.simpleemail.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * List Identities Request Marshaller
 */
public class ListIdentitiesRequestMarshaller implements Marshaller<Request<ListIdentitiesRequest>, ListIdentitiesRequest> {

    public Request<ListIdentitiesRequest> marshall(ListIdentitiesRequest listIdentitiesRequest) {

        if (listIdentitiesRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ListIdentitiesRequest> request = new DefaultRequest<ListIdentitiesRequest>(listIdentitiesRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "ListIdentities");
        request.addParameter("Version", "2010-12-01");

        if (listIdentitiesRequest.getIdentityType() != null) {
            request.addParameter("IdentityType", StringUtils.fromString(listIdentitiesRequest.getIdentityType()));
        }
        if (listIdentitiesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listIdentitiesRequest.getNextToken()));
        }
        if (listIdentitiesRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils.fromInteger(listIdentitiesRequest.getMaxItems()));
        }


        return request;
    }
}
