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
 * CreateApplicationVersionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationVersionRequestMarshaller implements Marshaller<Request<CreateApplicationVersionRequest>, CreateApplicationVersionRequest> {

    public Request<CreateApplicationVersionRequest> marshall(CreateApplicationVersionRequest createApplicationVersionRequest) {

        if (createApplicationVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateApplicationVersionRequest> request = new DefaultRequest<CreateApplicationVersionRequest>(createApplicationVersionRequest,
                "AWSElasticBeanstalk");
        request.addParameter("Action", "CreateApplicationVersion");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createApplicationVersionRequest.getApplicationName() != null) {
            request.addParameter("ApplicationName", StringUtils.fromString(createApplicationVersionRequest.getApplicationName()));
        }

        if (createApplicationVersionRequest.getVersionLabel() != null) {
            request.addParameter("VersionLabel", StringUtils.fromString(createApplicationVersionRequest.getVersionLabel()));
        }

        if (createApplicationVersionRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createApplicationVersionRequest.getDescription()));
        }

        {
            SourceBuildInformation sourceBuildInformation = createApplicationVersionRequest.getSourceBuildInformation();
            if (sourceBuildInformation != null) {

                if (sourceBuildInformation.getSourceType() != null) {
                    request.addParameter("SourceBuildInformation.SourceType", StringUtils.fromString(sourceBuildInformation.getSourceType()));
                }

                if (sourceBuildInformation.getSourceRepository() != null) {
                    request.addParameter("SourceBuildInformation.SourceRepository", StringUtils.fromString(sourceBuildInformation.getSourceRepository()));
                }

                if (sourceBuildInformation.getSourceLocation() != null) {
                    request.addParameter("SourceBuildInformation.SourceLocation", StringUtils.fromString(sourceBuildInformation.getSourceLocation()));
                }
            }
        }

        {
            S3Location sourceBundle = createApplicationVersionRequest.getSourceBundle();
            if (sourceBundle != null) {

                if (sourceBundle.getS3Bucket() != null) {
                    request.addParameter("SourceBundle.S3Bucket", StringUtils.fromString(sourceBundle.getS3Bucket()));
                }

                if (sourceBundle.getS3Key() != null) {
                    request.addParameter("SourceBundle.S3Key", StringUtils.fromString(sourceBundle.getS3Key()));
                }
            }
        }

        {
            BuildConfiguration buildConfiguration = createApplicationVersionRequest.getBuildConfiguration();
            if (buildConfiguration != null) {

                if (buildConfiguration.getArtifactName() != null) {
                    request.addParameter("BuildConfiguration.ArtifactName", StringUtils.fromString(buildConfiguration.getArtifactName()));
                }

                if (buildConfiguration.getCodeBuildServiceRole() != null) {
                    request.addParameter("BuildConfiguration.CodeBuildServiceRole", StringUtils.fromString(buildConfiguration.getCodeBuildServiceRole()));
                }

                if (buildConfiguration.getComputeType() != null) {
                    request.addParameter("BuildConfiguration.ComputeType", StringUtils.fromString(buildConfiguration.getComputeType()));
                }

                if (buildConfiguration.getImage() != null) {
                    request.addParameter("BuildConfiguration.Image", StringUtils.fromString(buildConfiguration.getImage()));
                }

                if (buildConfiguration.getTimeoutInMinutes() != null) {
                    request.addParameter("BuildConfiguration.TimeoutInMinutes", StringUtils.fromInteger(buildConfiguration.getTimeoutInMinutes()));
                }
            }
        }

        if (createApplicationVersionRequest.getAutoCreateApplication() != null) {
            request.addParameter("AutoCreateApplication", StringUtils.fromBoolean(createApplicationVersionRequest.getAutoCreateApplication()));
        }

        if (createApplicationVersionRequest.getProcess() != null) {
            request.addParameter("Process", StringUtils.fromBoolean(createApplicationVersionRequest.getProcess()));
        }

        if (!createApplicationVersionRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createApplicationVersionRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createApplicationVersionRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
