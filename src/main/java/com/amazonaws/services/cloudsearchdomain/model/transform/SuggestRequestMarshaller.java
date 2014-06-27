/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchdomain.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudsearchdomain.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Suggest Request Marshaller
 */
public class SuggestRequestMarshaller implements Marshaller<Request<SuggestRequest>, SuggestRequest> {

    public Request<SuggestRequest> marshall(SuggestRequest suggestRequest) {
    if (suggestRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<SuggestRequest> request = new DefaultRequest<SuggestRequest>(suggestRequest, "AmazonCloudSearchDomain");
        String target = "AmazonCloudSearch2013.Suggest";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.GET);
        String uriResourcePath = "/2013-01-01/suggest?format=sdk&pretty=true&q={Query}&suggester={Suggester}&size={Size}"; 
        uriResourcePath = uriResourcePath.replace("{Query}", (suggestRequest.getQuery() == null) ? "" : StringUtils.fromString(suggestRequest.getQuery())); 
        uriResourcePath = uriResourcePath.replace("{Suggester}", (suggestRequest.getSuggester() == null) ? "" : StringUtils.fromString(suggestRequest.getSuggester())); 
        uriResourcePath = uriResourcePath.replace("{Size}", (suggestRequest.getSize() == null) ? "" : StringUtils.fromLong(suggestRequest.getSize())); 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    if(!(nameValuePair[1].isEmpty()))
                        request.addParameter(nameValuePair[0], nameValuePair[1]);
                }
            }
        }
        request.setResourcePath(uriResourcePath);
        
        request.setContent(new ByteArrayInputStream(new byte[0]));

        return request;
    }
}
