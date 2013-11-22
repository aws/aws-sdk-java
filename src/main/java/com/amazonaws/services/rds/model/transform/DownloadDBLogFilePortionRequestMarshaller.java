/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Download D B Log File Portion Request Marshaller
 */
public class DownloadDBLogFilePortionRequestMarshaller implements Marshaller<Request<DownloadDBLogFilePortionRequest>, DownloadDBLogFilePortionRequest> {

    public Request<DownloadDBLogFilePortionRequest> marshall(DownloadDBLogFilePortionRequest downloadDBLogFilePortionRequest) {

        if (downloadDBLogFilePortionRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DownloadDBLogFilePortionRequest> request = new DefaultRequest<DownloadDBLogFilePortionRequest>(downloadDBLogFilePortionRequest, "AmazonRDS");
        request.addParameter("Action", "DownloadDBLogFilePortion");
        request.addParameter("Version", "2013-09-09");

        if (downloadDBLogFilePortionRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(downloadDBLogFilePortionRequest.getDBInstanceIdentifier()));
        }
        if (downloadDBLogFilePortionRequest.getLogFileName() != null) {
            request.addParameter("LogFileName", StringUtils.fromString(downloadDBLogFilePortionRequest.getLogFileName()));
        }
        if (downloadDBLogFilePortionRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(downloadDBLogFilePortionRequest.getMarker()));
        }
        if (downloadDBLogFilePortionRequest.getNumberOfLines() != null) {
            request.addParameter("NumberOfLines", StringUtils.fromInteger(downloadDBLogFilePortionRequest.getNumberOfLines()));
        }


        return request;
    }
}
