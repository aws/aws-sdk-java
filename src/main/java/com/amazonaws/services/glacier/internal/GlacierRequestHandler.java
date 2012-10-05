/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glacier.internal;

import java.util.Arrays;
import java.util.List;

import com.amazonaws.Request;
import com.amazonaws.handlers.AbstractRequestHandler;
import com.amazonaws.services.glacier.model.DescribeJobRequest;
import com.amazonaws.services.glacier.model.GetJobOutputRequest;
import com.amazonaws.services.glacier.model.UploadArchiveRequest;
import com.amazonaws.services.glacier.model.UploadMultipartPartRequest;

public class GlacierRequestHandler extends AbstractRequestHandler {
	
	private static final List<String> PARAMETERS = Arrays.asList(new String[] {"vaults"});
	
    @Override
    public void beforeRequest(Request<?> request) {

    	// Plug in the default account ID ('-') if none has been specified
    	
    	if (!startsWithUserId(request)) {
    		String resourcePath = request.getResourcePath();
    		request.setResourcePath(resourcePath.replaceFirst("/", "/-/"));
    	}
    	
        request.addHeader("x-amz-glacier-version", "2012-06-01");

        if (request.getOriginalRequest() instanceof UploadArchiveRequest) {
           String contentLength = request.getHeaders().remove("x-amz-content-length");
            if (contentLength != null) {
                request.getHeaders().put("Content-Length", contentLength);
            }
        } else if (request.getOriginalRequest() instanceof UploadMultipartPartRequest) {
            String range = request.getHeaders().get("Content-Range");

            if (range.startsWith("bytes=")) range = range.substring(6);
            if (range.startsWith("bytes ")) range = range.substring(6);

            if (range != null) {
                String start = range.substring(0, range.indexOf('-'));
                String end   = range.substring(range.indexOf('-') + 1);

                if (end.contains("/")) {
                    end = end.substring(0, end.indexOf("/"));
                }

                long contentLength = Long.parseLong(end) - Long.parseLong(start) + 1;
                request.getHeaders().put("Content-Length", Long.toString(contentLength));
            }
        } else if (request.getOriginalRequest() instanceof GetJobOutputRequest ||
                   request.getOriginalRequest() instanceof DescribeJobRequest) {
            String resourcePath = request.getResourcePath();
            if (resourcePath != null) {
                String newResourcePath = resourcePath.replace("{jobType}", "archive-retrievals");
                request.setResourcePath(newResourcePath);
            }
        }
    }
    
	private boolean startsWithUserId(Request<?> request) {
		for (String parameter : PARAMETERS)
			if (request.getResourcePath().startsWith("/" + parameter)) {
				return false;
			}
		return true;
	}
}