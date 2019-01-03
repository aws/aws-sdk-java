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
 * UpdateConfigurationSetTrackingOptionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfigurationSetTrackingOptionsRequestMarshaller implements
        Marshaller<Request<UpdateConfigurationSetTrackingOptionsRequest>, UpdateConfigurationSetTrackingOptionsRequest> {

    public Request<UpdateConfigurationSetTrackingOptionsRequest> marshall(
            UpdateConfigurationSetTrackingOptionsRequest updateConfigurationSetTrackingOptionsRequest) {

        if (updateConfigurationSetTrackingOptionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateConfigurationSetTrackingOptionsRequest> request = new DefaultRequest<UpdateConfigurationSetTrackingOptionsRequest>(
                updateConfigurationSetTrackingOptionsRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "UpdateConfigurationSetTrackingOptions");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateConfigurationSetTrackingOptionsRequest.getConfigurationSetName() != null) {
            request.addParameter("ConfigurationSetName", StringUtils.fromString(updateConfigurationSetTrackingOptionsRequest.getConfigurationSetName()));
        }

        {
            TrackingOptions trackingOptions = updateConfigurationSetTrackingOptionsRequest.getTrackingOptions();
            if (trackingOptions != null) {

                if (trackingOptions.getCustomRedirectDomain() != null) {
                    request.addParameter("TrackingOptions.CustomRedirectDomain", StringUtils.fromString(trackingOptions.getCustomRedirectDomain()));
                }
            }
        }

        return request;
    }

}
