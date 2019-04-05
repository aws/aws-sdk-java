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
import com.amazonaws.util.StringUtils;

/**
 * UpdateConfigurationSetEventDestinationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfigurationSetEventDestinationRequestMarshaller implements
        Marshaller<Request<UpdateConfigurationSetEventDestinationRequest>, UpdateConfigurationSetEventDestinationRequest> {

    public Request<UpdateConfigurationSetEventDestinationRequest> marshall(
            UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest) {

        if (updateConfigurationSetEventDestinationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateConfigurationSetEventDestinationRequest> request = new DefaultRequest<UpdateConfigurationSetEventDestinationRequest>(
                updateConfigurationSetEventDestinationRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "UpdateConfigurationSetEventDestination");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateConfigurationSetEventDestinationRequest.getConfigurationSetName() != null) {
            request.addParameter("ConfigurationSetName", StringUtils.fromString(updateConfigurationSetEventDestinationRequest.getConfigurationSetName()));
        }

        {
            EventDestination eventDestination = updateConfigurationSetEventDestinationRequest.getEventDestination();
            if (eventDestination != null) {

                if (eventDestination.getName() != null) {
                    request.addParameter("EventDestination.Name", StringUtils.fromString(eventDestination.getName()));
                }

                if (eventDestination.getEnabled() != null) {
                    request.addParameter("EventDestination.Enabled", StringUtils.fromBoolean(eventDestination.getEnabled()));
                }

                if (!eventDestination.getMatchingEventTypes().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) eventDestination.getMatchingEventTypes()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> matchingEventTypesList = (com.amazonaws.internal.SdkInternalList<String>) eventDestination
                            .getMatchingEventTypes();
                    int matchingEventTypesListIndex = 1;

                    for (String matchingEventTypesListValue : matchingEventTypesList) {
                        if (matchingEventTypesListValue != null) {
                            request.addParameter("EventDestination.MatchingEventTypes.member." + matchingEventTypesListIndex,
                                    StringUtils.fromString(matchingEventTypesListValue));
                        }
                        matchingEventTypesListIndex++;
                    }
                }

                {
                    KinesisFirehoseDestination kinesisFirehoseDestination = eventDestination.getKinesisFirehoseDestination();
                    if (kinesisFirehoseDestination != null) {

                        if (kinesisFirehoseDestination.getIAMRoleARN() != null) {
                            request.addParameter("EventDestination.KinesisFirehoseDestination.IAMRoleARN",
                                    StringUtils.fromString(kinesisFirehoseDestination.getIAMRoleARN()));
                        }

                        if (kinesisFirehoseDestination.getDeliveryStreamARN() != null) {
                            request.addParameter("EventDestination.KinesisFirehoseDestination.DeliveryStreamARN",
                                    StringUtils.fromString(kinesisFirehoseDestination.getDeliveryStreamARN()));
                        }
                    }
                }

                {
                    CloudWatchDestination cloudWatchDestination = eventDestination.getCloudWatchDestination();
                    if (cloudWatchDestination != null) {

                        if (!cloudWatchDestination.getDimensionConfigurations().isEmpty()
                                || !((com.amazonaws.internal.SdkInternalList<CloudWatchDimensionConfiguration>) cloudWatchDestination
                                        .getDimensionConfigurations()).isAutoConstruct()) {
                            com.amazonaws.internal.SdkInternalList<CloudWatchDimensionConfiguration> dimensionConfigurationsList = (com.amazonaws.internal.SdkInternalList<CloudWatchDimensionConfiguration>) cloudWatchDestination
                                    .getDimensionConfigurations();
                            int dimensionConfigurationsListIndex = 1;

                            for (CloudWatchDimensionConfiguration dimensionConfigurationsListValue : dimensionConfigurationsList) {

                                if (dimensionConfigurationsListValue.getDimensionName() != null) {
                                    request.addParameter("EventDestination.CloudWatchDestination.DimensionConfigurations.member."
                                            + dimensionConfigurationsListIndex + ".DimensionName",
                                            StringUtils.fromString(dimensionConfigurationsListValue.getDimensionName()));
                                }

                                if (dimensionConfigurationsListValue.getDimensionValueSource() != null) {
                                    request.addParameter("EventDestination.CloudWatchDestination.DimensionConfigurations.member."
                                            + dimensionConfigurationsListIndex + ".DimensionValueSource",
                                            StringUtils.fromString(dimensionConfigurationsListValue.getDimensionValueSource()));
                                }

                                if (dimensionConfigurationsListValue.getDefaultDimensionValue() != null) {
                                    request.addParameter("EventDestination.CloudWatchDestination.DimensionConfigurations.member."
                                            + dimensionConfigurationsListIndex + ".DefaultDimensionValue",
                                            StringUtils.fromString(dimensionConfigurationsListValue.getDefaultDimensionValue()));
                                }
                                dimensionConfigurationsListIndex++;
                            }
                        }
                    }
                }

                {
                    SNSDestination sNSDestination = eventDestination.getSNSDestination();
                    if (sNSDestination != null) {

                        if (sNSDestination.getTopicARN() != null) {
                            request.addParameter("EventDestination.SNSDestination.TopicARN", StringUtils.fromString(sNSDestination.getTopicARN()));
                        }
                    }
                }
            }
        }

        return request;
    }

}
