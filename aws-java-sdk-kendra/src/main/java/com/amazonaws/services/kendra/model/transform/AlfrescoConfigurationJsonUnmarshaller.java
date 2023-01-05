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
package com.amazonaws.services.kendra.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AlfrescoConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlfrescoConfigurationJsonUnmarshaller implements Unmarshaller<AlfrescoConfiguration, JsonUnmarshallerContext> {

    public AlfrescoConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AlfrescoConfiguration alfrescoConfiguration = new AlfrescoConfiguration();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("SiteUrl", targetDepth)) {
                    context.nextToken();
                    alfrescoConfiguration.setSiteUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SiteId", targetDepth)) {
                    context.nextToken();
                    alfrescoConfiguration.setSiteId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretArn", targetDepth)) {
                    context.nextToken();
                    alfrescoConfiguration.setSecretArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SslCertificateS3Path", targetDepth)) {
                    context.nextToken();
                    alfrescoConfiguration.setSslCertificateS3Path(S3PathJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CrawlSystemFolders", targetDepth)) {
                    context.nextToken();
                    alfrescoConfiguration.setCrawlSystemFolders(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CrawlComments", targetDepth)) {
                    context.nextToken();
                    alfrescoConfiguration.setCrawlComments(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EntityFilter", targetDepth)) {
                    context.nextToken();
                    alfrescoConfiguration.setEntityFilter(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DocumentLibraryFieldMappings", targetDepth)) {
                    context.nextToken();
                    alfrescoConfiguration.setDocumentLibraryFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                            DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("BlogFieldMappings", targetDepth)) {
                    context.nextToken();
                    alfrescoConfiguration.setBlogFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                            DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("WikiFieldMappings", targetDepth)) {
                    context.nextToken();
                    alfrescoConfiguration.setWikiFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                            DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("InclusionPatterns", targetDepth)) {
                    context.nextToken();
                    alfrescoConfiguration.setInclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ExclusionPatterns", targetDepth)) {
                    context.nextToken();
                    alfrescoConfiguration.setExclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("VpcConfiguration", targetDepth)) {
                    context.nextToken();
                    alfrescoConfiguration.setVpcConfiguration(DataSourceVpcConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return alfrescoConfiguration;
    }

    private static AlfrescoConfigurationJsonUnmarshaller instance;

    public static AlfrescoConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AlfrescoConfigurationJsonUnmarshaller();
        return instance;
    }
}
