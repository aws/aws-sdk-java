/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryRequest;
import com.amazonaws.services.ec2.model.RequestSpotFleetRequest;

/**
 * A request handler that strips out millisecond precision from requests to
 * RequestSpotFleet and DescribeSpotFleetRequestHistory, which don't expect
 * timestamps to be so precise.
 */
public final class TimestampFormatRequestHandler extends RequestHandler2 {

    private static final Pattern PATTERN = Pattern.compile("\\.\\d\\d\\dZ");

    private static final String START_TIME = "StartTime";
    private static final String VALID_FROM = "SpotFleetRequestConfig.ValidFrom";
    private static final String VALID_UNTIL =
            "SpotFleetRequestConfig.ValidUntil";

    @Override
    public void beforeRequest(Request<?> request) {
        AmazonWebServiceRequest original = request.getOriginalRequest();
        if (original instanceof DescribeSpotFleetRequestHistoryRequest) {

            Map<String, List<String>> params = request.getParameters();
            List<String> startTime = params.get(START_TIME);

            if (startTime != null && !startTime.isEmpty()) {
                params.put(START_TIME,
                        Arrays.asList(sanitize(startTime.get(0))));
            }

        } else if (original instanceof RequestSpotFleetRequest) {

            Map<String, List<String>> params = request.getParameters();

            List<String> validFrom = params.get(VALID_FROM);
            List<String> validUntil = params.get(VALID_UNTIL);

            if (validFrom != null && !validFrom.isEmpty()) {
                params.put(VALID_FROM,
                        Arrays.asList(sanitize(validFrom.get(0))));
            }
            if (validUntil != null && !validUntil.isEmpty()) {
                params.put(VALID_UNTIL,
                        Arrays.asList(sanitize(validUntil.get(0))));
            }

        }
    }

    private String sanitize(String input) {
        return PATTERN.matcher(input).replaceFirst("Z");
    }

    @Override
    public void afterResponse(Request<?> request, Response<?> response) {
    }

    @Override
    public void afterError(
            Request<?> request,
            Response<?> response,
            Exception e) {
    }
}
