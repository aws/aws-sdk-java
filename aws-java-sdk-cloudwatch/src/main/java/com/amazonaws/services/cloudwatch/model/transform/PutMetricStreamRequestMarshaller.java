/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * PutMetricStreamRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMetricStreamRequestMarshaller implements Marshaller<Request<PutMetricStreamRequest>, PutMetricStreamRequest> {

    public Request<PutMetricStreamRequest> marshall(PutMetricStreamRequest putMetricStreamRequest) {

        if (putMetricStreamRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutMetricStreamRequest> request = new DefaultRequest<PutMetricStreamRequest>(putMetricStreamRequest, "AmazonCloudWatch");
        request.addParameter("Action", "PutMetricStream");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (putMetricStreamRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(putMetricStreamRequest.getName()));
        }

        if (!putMetricStreamRequest.getIncludeFilters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<MetricStreamFilter>) putMetricStreamRequest.getIncludeFilters()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<MetricStreamFilter> includeFiltersList = (com.amazonaws.internal.SdkInternalList<MetricStreamFilter>) putMetricStreamRequest
                    .getIncludeFilters();
            int includeFiltersListIndex = 1;

            for (MetricStreamFilter includeFiltersListValue : includeFiltersList) {
                if (includeFiltersListValue != null) {

                    if (includeFiltersListValue.getNamespace() != null) {
                        request.addParameter("IncludeFilters.member." + includeFiltersListIndex + ".Namespace",
                                StringUtils.fromString(includeFiltersListValue.getNamespace()));
                    }
                }
                includeFiltersListIndex++;
            }
        }

        if (!putMetricStreamRequest.getExcludeFilters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<MetricStreamFilter>) putMetricStreamRequest.getExcludeFilters()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<MetricStreamFilter> excludeFiltersList = (com.amazonaws.internal.SdkInternalList<MetricStreamFilter>) putMetricStreamRequest
                    .getExcludeFilters();
            int excludeFiltersListIndex = 1;

            for (MetricStreamFilter excludeFiltersListValue : excludeFiltersList) {
                if (excludeFiltersListValue != null) {

                    if (excludeFiltersListValue.getNamespace() != null) {
                        request.addParameter("ExcludeFilters.member." + excludeFiltersListIndex + ".Namespace",
                                StringUtils.fromString(excludeFiltersListValue.getNamespace()));
                    }
                }
                excludeFiltersListIndex++;
            }
        }

        if (putMetricStreamRequest.getFirehoseArn() != null) {
            request.addParameter("FirehoseArn", StringUtils.fromString(putMetricStreamRequest.getFirehoseArn()));
        }

        if (putMetricStreamRequest.getRoleArn() != null) {
            request.addParameter("RoleArn", StringUtils.fromString(putMetricStreamRequest.getRoleArn()));
        }

        if (putMetricStreamRequest.getOutputFormat() != null) {
            request.addParameter("OutputFormat", StringUtils.fromString(putMetricStreamRequest.getOutputFormat()));
        }

        if (!putMetricStreamRequest.getTags().isEmpty() || !((com.amazonaws.internal.SdkInternalList<Tag>) putMetricStreamRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) putMetricStreamRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {
                if (tagsListValue != null) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
