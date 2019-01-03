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
 * ListDomainsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDomainsRequestMarshaller implements Marshaller<Request<ListDomainsRequest>, ListDomainsRequest> {

    public Request<ListDomainsRequest> marshall(ListDomainsRequest listDomainsRequest) {

        if (listDomainsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListDomainsRequest> request = new DefaultRequest<ListDomainsRequest>(listDomainsRequest, "AmazonSimpleDB");
        request.addParameter("Action", "ListDomains");
        request.addParameter("Version", "2009-04-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (listDomainsRequest.getMaxNumberOfDomains() != null) {
            request.addParameter("MaxNumberOfDomains", StringUtils.fromInteger(listDomainsRequest.getMaxNumberOfDomains()));
        }

        if (listDomainsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listDomainsRequest.getNextToken()));
        }

        return request;
    }

}
