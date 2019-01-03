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
package com.amazonaws.services.elasticache.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyCacheParameterGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyCacheParameterGroupRequestMarshaller implements Marshaller<Request<ModifyCacheParameterGroupRequest>, ModifyCacheParameterGroupRequest> {

    public Request<ModifyCacheParameterGroupRequest> marshall(ModifyCacheParameterGroupRequest modifyCacheParameterGroupRequest) {

        if (modifyCacheParameterGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyCacheParameterGroupRequest> request = new DefaultRequest<ModifyCacheParameterGroupRequest>(modifyCacheParameterGroupRequest,
                "AmazonElastiCache");
        request.addParameter("Action", "ModifyCacheParameterGroup");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyCacheParameterGroupRequest.getCacheParameterGroupName() != null) {
            request.addParameter("CacheParameterGroupName", StringUtils.fromString(modifyCacheParameterGroupRequest.getCacheParameterGroupName()));
        }

        if (!modifyCacheParameterGroupRequest.getParameterNameValues().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ParameterNameValue>) modifyCacheParameterGroupRequest.getParameterNameValues()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ParameterNameValue> parameterNameValuesList = (com.amazonaws.internal.SdkInternalList<ParameterNameValue>) modifyCacheParameterGroupRequest
                    .getParameterNameValues();
            int parameterNameValuesListIndex = 1;

            for (ParameterNameValue parameterNameValuesListValue : parameterNameValuesList) {

                if (parameterNameValuesListValue.getParameterName() != null) {
                    request.addParameter("ParameterNameValues.ParameterNameValue." + parameterNameValuesListIndex + ".ParameterName",
                            StringUtils.fromString(parameterNameValuesListValue.getParameterName()));
                }

                if (parameterNameValuesListValue.getParameterValue() != null) {
                    request.addParameter("ParameterNameValues.ParameterNameValue." + parameterNameValuesListIndex + ".ParameterValue",
                            StringUtils.fromString(parameterNameValuesListValue.getParameterValue()));
                }
                parameterNameValuesListIndex++;
            }
        }

        return request;
    }

}
