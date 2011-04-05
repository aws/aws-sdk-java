/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describe Images Request Marshaller
 */
public class DescribeImagesRequestMarshaller implements Marshaller<Request<DescribeImagesRequest>, DescribeImagesRequest> {

    public Request<DescribeImagesRequest> marshall(DescribeImagesRequest describeImagesRequest) {
        Request<DescribeImagesRequest> request = new DefaultRequest<DescribeImagesRequest>(describeImagesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeImages");
        request.addParameter("Version", "2011-02-28");
        if (describeImagesRequest != null) {
            java.util.List<String> imageIdsList = describeImagesRequest.getImageIds();
            int imageIdsListIndex = 1;

            for (String imageIdsListValue : imageIdsList) {
                if (imageIdsListValue != null) {
                    request.addParameter("ImageId." + imageIdsListIndex, StringUtils.fromString(imageIdsListValue));
                }
                imageIdsListIndex++;
            }
        }
        if (describeImagesRequest != null) {
            java.util.List<String> ownersList = describeImagesRequest.getOwners();
            int ownersListIndex = 1;

            for (String ownersListValue : ownersList) {
                if (ownersListValue != null) {
                    request.addParameter("Owner." + ownersListIndex, StringUtils.fromString(ownersListValue));
                }
                ownersListIndex++;
            }
        }
        if (describeImagesRequest != null) {
            java.util.List<String> executableUsersList = describeImagesRequest.getExecutableUsers();
            int executableUsersListIndex = 1;

            for (String executableUsersListValue : executableUsersList) {
                if (executableUsersListValue != null) {
                    request.addParameter("ExecutableBy." + executableUsersListIndex, StringUtils.fromString(executableUsersListValue));
                }
                executableUsersListIndex++;
            }
        }

        if (describeImagesRequest != null) {
            java.util.List<Filter> filtersList = describeImagesRequest.getFilters();
            int filtersListIndex = 1;
            for (Filter filtersListValue : filtersList) {
                if (filtersListValue != null) {
                    if (filtersListValue.getName() != null) {
                        request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
                    }
                }
                if (filtersListValue != null) {
                    java.util.List<String> valuesList = filtersListValue.getValues();
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(valuesListValue));
                        }
                        valuesListIndex++;
                    }
                }

                filtersListIndex++;
            }
        }


        return request;
    }
}
