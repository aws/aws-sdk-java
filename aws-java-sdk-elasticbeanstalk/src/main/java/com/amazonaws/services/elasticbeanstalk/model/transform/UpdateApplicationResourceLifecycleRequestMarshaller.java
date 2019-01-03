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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * UpdateApplicationResourceLifecycleRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationResourceLifecycleRequestMarshaller implements
        Marshaller<Request<UpdateApplicationResourceLifecycleRequest>, UpdateApplicationResourceLifecycleRequest> {

    public Request<UpdateApplicationResourceLifecycleRequest> marshall(UpdateApplicationResourceLifecycleRequest updateApplicationResourceLifecycleRequest) {

        if (updateApplicationResourceLifecycleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateApplicationResourceLifecycleRequest> request = new DefaultRequest<UpdateApplicationResourceLifecycleRequest>(
                updateApplicationResourceLifecycleRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "UpdateApplicationResourceLifecycle");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateApplicationResourceLifecycleRequest.getApplicationName() != null) {
            request.addParameter("ApplicationName", StringUtils.fromString(updateApplicationResourceLifecycleRequest.getApplicationName()));
        }

        {
            ApplicationResourceLifecycleConfig resourceLifecycleConfig = updateApplicationResourceLifecycleRequest.getResourceLifecycleConfig();
            if (resourceLifecycleConfig != null) {

                if (resourceLifecycleConfig.getServiceRole() != null) {
                    request.addParameter("ResourceLifecycleConfig.ServiceRole", StringUtils.fromString(resourceLifecycleConfig.getServiceRole()));
                }

                {
                    ApplicationVersionLifecycleConfig versionLifecycleConfig = resourceLifecycleConfig.getVersionLifecycleConfig();
                    if (versionLifecycleConfig != null) {

                        {
                            MaxCountRule maxCountRule = versionLifecycleConfig.getMaxCountRule();
                            if (maxCountRule != null) {

                                if (maxCountRule.getEnabled() != null) {
                                    request.addParameter("ResourceLifecycleConfig.VersionLifecycleConfig.MaxCountRule.Enabled",
                                            StringUtils.fromBoolean(maxCountRule.getEnabled()));
                                }

                                if (maxCountRule.getMaxCount() != null) {
                                    request.addParameter("ResourceLifecycleConfig.VersionLifecycleConfig.MaxCountRule.MaxCount",
                                            StringUtils.fromInteger(maxCountRule.getMaxCount()));
                                }

                                if (maxCountRule.getDeleteSourceFromS3() != null) {
                                    request.addParameter("ResourceLifecycleConfig.VersionLifecycleConfig.MaxCountRule.DeleteSourceFromS3",
                                            StringUtils.fromBoolean(maxCountRule.getDeleteSourceFromS3()));
                                }
                            }
                        }

                        {
                            MaxAgeRule maxAgeRule = versionLifecycleConfig.getMaxAgeRule();
                            if (maxAgeRule != null) {

                                if (maxAgeRule.getEnabled() != null) {
                                    request.addParameter("ResourceLifecycleConfig.VersionLifecycleConfig.MaxAgeRule.Enabled",
                                            StringUtils.fromBoolean(maxAgeRule.getEnabled()));
                                }

                                if (maxAgeRule.getMaxAgeInDays() != null) {
                                    request.addParameter("ResourceLifecycleConfig.VersionLifecycleConfig.MaxAgeRule.MaxAgeInDays",
                                            StringUtils.fromInteger(maxAgeRule.getMaxAgeInDays()));
                                }

                                if (maxAgeRule.getDeleteSourceFromS3() != null) {
                                    request.addParameter("ResourceLifecycleConfig.VersionLifecycleConfig.MaxAgeRule.DeleteSourceFromS3",
                                            StringUtils.fromBoolean(maxAgeRule.getDeleteSourceFromS3()));
                                }
                            }
                        }
                    }
                }
            }
        }

        return request;
    }

}
