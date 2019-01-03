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
package com.amazonaws.services.cloudsearchv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudsearchv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DefineExpressionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefineExpressionRequestMarshaller implements Marshaller<Request<DefineExpressionRequest>, DefineExpressionRequest> {

    public Request<DefineExpressionRequest> marshall(DefineExpressionRequest defineExpressionRequest) {

        if (defineExpressionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DefineExpressionRequest> request = new DefaultRequest<DefineExpressionRequest>(defineExpressionRequest, "AmazonCloudSearchv2");
        request.addParameter("Action", "DefineExpression");
        request.addParameter("Version", "2013-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (defineExpressionRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(defineExpressionRequest.getDomainName()));
        }

        {
            Expression expression = defineExpressionRequest.getExpression();
            if (expression != null) {

                if (expression.getExpressionName() != null) {
                    request.addParameter("Expression.ExpressionName", StringUtils.fromString(expression.getExpressionName()));
                }

                if (expression.getExpressionValue() != null) {
                    request.addParameter("Expression.ExpressionValue", StringUtils.fromString(expression.getExpressionValue()));
                }
            }
        }

        return request;
    }

}
