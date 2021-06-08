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
package com.amazonaws.services.s3control.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;

import com.amazonaws.util.XMLWriter;

/**
 * PutAccessPointConfigurationForObjectLambdaRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAccessPointConfigurationForObjectLambdaRequestMarshaller implements
        Marshaller<Request<PutAccessPointConfigurationForObjectLambdaRequest>, PutAccessPointConfigurationForObjectLambdaRequest> {

    public Request<PutAccessPointConfigurationForObjectLambdaRequest> marshall(
            PutAccessPointConfigurationForObjectLambdaRequest putAccessPointConfigurationForObjectLambdaRequest) {

        if (putAccessPointConfigurationForObjectLambdaRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutAccessPointConfigurationForObjectLambdaRequest> request = new DefaultRequest<PutAccessPointConfigurationForObjectLambdaRequest>(
                putAccessPointConfigurationForObjectLambdaRequest, "AWSS3Control");

        request.setHttpMethod(HttpMethodName.PUT);

        if (putAccessPointConfigurationForObjectLambdaRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(putAccessPointConfigurationForObjectLambdaRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/accesspointforobjectlambda/{name}/configuration";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "name",
                putAccessPointConfigurationForObjectLambdaRequest.getName());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://awss3control.amazonaws.com/doc/2018-08-20/");

            xmlWriter.startElement("PutAccessPointConfigurationForObjectLambdaRequest");
            if (putAccessPointConfigurationForObjectLambdaRequest != null) {

                {
                    ObjectLambdaConfiguration configuration = putAccessPointConfigurationForObjectLambdaRequest.getConfiguration();
                    if (configuration != null) {
                        xmlWriter.startElement("Configuration");

                        if (configuration.getSupportingAccessPoint() != null) {
                            xmlWriter.startElement("SupportingAccessPoint").value(configuration.getSupportingAccessPoint()).endElement();
                        }

                        if (configuration.getCloudWatchMetricsEnabled() != null) {
                            xmlWriter.startElement("CloudWatchMetricsEnabled").value(configuration.getCloudWatchMetricsEnabled()).endElement();
                        }

                        java.util.List<String> objectLambdaConfigurationAllowedFeaturesList = configuration.getAllowedFeatures();
                        if (objectLambdaConfigurationAllowedFeaturesList != null) {
                            xmlWriter.startElement("AllowedFeatures");

                            for (String objectLambdaConfigurationAllowedFeaturesListValue : objectLambdaConfigurationAllowedFeaturesList) {
                                xmlWriter.startElement("AllowedFeature");
                                xmlWriter.value(objectLambdaConfigurationAllowedFeaturesListValue);
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }

                        java.util.List<ObjectLambdaTransformationConfiguration> objectLambdaConfigurationTransformationConfigurationsList = configuration
                                .getTransformationConfigurations();
                        if (objectLambdaConfigurationTransformationConfigurationsList != null) {
                            xmlWriter.startElement("TransformationConfigurations");

                            for (ObjectLambdaTransformationConfiguration objectLambdaConfigurationTransformationConfigurationsListValue : objectLambdaConfigurationTransformationConfigurationsList) {
                                xmlWriter.startElement("TransformationConfiguration");

                                java.util.List<String> objectLambdaTransformationConfigurationActionsList = objectLambdaConfigurationTransformationConfigurationsListValue
                                        .getActions();
                                if (objectLambdaTransformationConfigurationActionsList != null) {
                                    xmlWriter.startElement("Actions");

                                    for (String objectLambdaTransformationConfigurationActionsListValue : objectLambdaTransformationConfigurationActionsList) {
                                        xmlWriter.startElement("Action");
                                        xmlWriter.value(objectLambdaTransformationConfigurationActionsListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }

                                {
                                    ObjectLambdaContentTransformation contentTransformation = objectLambdaConfigurationTransformationConfigurationsListValue
                                            .getContentTransformation();
                                    if (contentTransformation != null) {
                                        xmlWriter.startElement("ContentTransformation");

                                        {
                                            AwsLambdaTransformation awsLambda = contentTransformation.getAwsLambda();
                                            if (awsLambda != null) {
                                                xmlWriter.startElement("AwsLambda");

                                                if (awsLambda.getFunctionArn() != null) {
                                                    xmlWriter.startElement("FunctionArn").value(awsLambda.getFunctionArn()).endElement();
                                                }

                                                if (awsLambda.getFunctionPayload() != null) {
                                                    xmlWriter.startElement("FunctionPayload").value(awsLambda.getFunctionPayload()).endElement();
                                                }
                                                xmlWriter.endElement();
                                            }
                                        }
                                        xmlWriter.endElement();
                                    }
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }
                }
            }
            xmlWriter.endElement();

            request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
            request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes(UTF8).length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", "application/xml");
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to XML: " + t.getMessage(), t);
        }

        return request;
    }

}
