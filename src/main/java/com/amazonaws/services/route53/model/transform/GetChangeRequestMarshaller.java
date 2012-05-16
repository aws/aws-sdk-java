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
package com.amazonaws.services.route53.model.transform;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.XMLWriter;

/**
 * Get Change Request Marshaller
 */
public class GetChangeRequestMarshaller implements Marshaller<Request<GetChangeRequest>, GetChangeRequest> {

    public Request<GetChangeRequest> marshall(GetChangeRequest getChangeRequest) {
        if (getChangeRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetChangeRequest> request = new DefaultRequest<GetChangeRequest>(getChangeRequest, "AmazonRoute53");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2012-02-29/change/{Id}"; 
        uriResourcePath = uriResourcePath.replace("{Id}", getString(getChangeRequest.getId())); 

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    request.addParameter(nameValuePair[0], nameValuePair[1]);
                } else {
                    request.addParameter(s, null);
                }
            }
        }

        request.setResourcePath(uriResourcePath);

        

        return request;
    }

    private String getString(String s) {
        if (s == null) return "";
        return s;
    }
}
