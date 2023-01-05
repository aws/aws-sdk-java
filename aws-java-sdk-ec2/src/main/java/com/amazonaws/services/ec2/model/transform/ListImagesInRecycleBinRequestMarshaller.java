/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ListImagesInRecycleBinRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImagesInRecycleBinRequestMarshaller implements Marshaller<Request<ListImagesInRecycleBinRequest>, ListImagesInRecycleBinRequest> {

    public Request<ListImagesInRecycleBinRequest> marshall(ListImagesInRecycleBinRequest listImagesInRecycleBinRequest) {

        if (listImagesInRecycleBinRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListImagesInRecycleBinRequest> request = new DefaultRequest<ListImagesInRecycleBinRequest>(listImagesInRecycleBinRequest, "AmazonEC2");
        request.addParameter("Action", "ListImagesInRecycleBin");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> listImagesInRecycleBinRequestImageIdsList = (com.amazonaws.internal.SdkInternalList<String>) listImagesInRecycleBinRequest
                .getImageIds();
        if (!listImagesInRecycleBinRequestImageIdsList.isEmpty() || !listImagesInRecycleBinRequestImageIdsList.isAutoConstruct()) {
            int imageIdsListIndex = 1;

            for (String listImagesInRecycleBinRequestImageIdsListValue : listImagesInRecycleBinRequestImageIdsList) {
                if (listImagesInRecycleBinRequestImageIdsListValue != null) {
                    request.addParameter("ImageId." + imageIdsListIndex, StringUtils.fromString(listImagesInRecycleBinRequestImageIdsListValue));
                }
                imageIdsListIndex++;
            }
        }

        if (listImagesInRecycleBinRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listImagesInRecycleBinRequest.getNextToken()));
        }

        if (listImagesInRecycleBinRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(listImagesInRecycleBinRequest.getMaxResults()));
        }

        return request;
    }

}
