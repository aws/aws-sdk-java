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
package com.amazonaws.services.simpleemail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;

/**
 * ListReceiptFiltersRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReceiptFiltersRequestMarshaller implements Marshaller<Request<ListReceiptFiltersRequest>, ListReceiptFiltersRequest> {

    public Request<ListReceiptFiltersRequest> marshall(ListReceiptFiltersRequest listReceiptFiltersRequest) {

        if (listReceiptFiltersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListReceiptFiltersRequest> request = new DefaultRequest<ListReceiptFiltersRequest>(listReceiptFiltersRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "ListReceiptFilters");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        return request;
    }

}
