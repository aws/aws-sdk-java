/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.apigateway.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * AuthorizerMarshaller
 */
public class AuthorizerJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Authorizer authorizer, JSONWriter jsonWriter) {
        if (authorizer == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (authorizer.getId() != null) {
                jsonWriter.key("id").value(authorizer.getId());
            }
            if (authorizer.getName() != null) {
                jsonWriter.key("name").value(authorizer.getName());
            }
            if (authorizer.getType() != null) {
                jsonWriter.key("type").value(authorizer.getType());
            }
            if (authorizer.getAuthorizerUri() != null) {
                jsonWriter.key("authorizerUri").value(
                        authorizer.getAuthorizerUri());
            }
            if (authorizer.getAuthorizerCredentials() != null) {
                jsonWriter.key("authorizerCredentials").value(
                        authorizer.getAuthorizerCredentials());
            }
            if (authorizer.getIdentitySource() != null) {
                jsonWriter.key("identitySource").value(
                        authorizer.getIdentitySource());
            }
            if (authorizer.getIdentityValidationExpression() != null) {
                jsonWriter.key("identityValidationExpression").value(
                        authorizer.getIdentityValidationExpression());
            }
            if (authorizer.getAuthorizerResultTtlInSeconds() != null) {
                jsonWriter.key("authorizerResultTtlInSeconds").value(
                        authorizer.getAuthorizerResultTtlInSeconds());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AuthorizerJsonMarshaller instance;

    public static AuthorizerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuthorizerJsonMarshaller();
        return instance;
    }

}
