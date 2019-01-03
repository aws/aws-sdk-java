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
package com.amazonaws.services.neptune.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.neptune.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ResetDBClusterParameterGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResetDBClusterParameterGroupRequestMarshaller implements
        Marshaller<Request<ResetDBClusterParameterGroupRequest>, ResetDBClusterParameterGroupRequest> {

    public Request<ResetDBClusterParameterGroupRequest> marshall(ResetDBClusterParameterGroupRequest resetDBClusterParameterGroupRequest) {

        if (resetDBClusterParameterGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ResetDBClusterParameterGroupRequest> request = new DefaultRequest<ResetDBClusterParameterGroupRequest>(resetDBClusterParameterGroupRequest,
                "AmazonNeptune");
        request.addParameter("Action", "ResetDBClusterParameterGroup");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (resetDBClusterParameterGroupRequest.getDBClusterParameterGroupName() != null) {
            request.addParameter("DBClusterParameterGroupName", StringUtils.fromString(resetDBClusterParameterGroupRequest.getDBClusterParameterGroupName()));
        }

        if (resetDBClusterParameterGroupRequest.getResetAllParameters() != null) {
            request.addParameter("ResetAllParameters", StringUtils.fromBoolean(resetDBClusterParameterGroupRequest.getResetAllParameters()));
        }

        if (resetDBClusterParameterGroupRequest.getParameters() != null) {
            java.util.List<Parameter> parametersList = resetDBClusterParameterGroupRequest.getParameters();
            if (parametersList.isEmpty()) {
                request.addParameter("Parameters", "");
            } else {
                int parametersListIndex = 1;

                for (Parameter parametersListValue : parametersList) {

                    if (parametersListValue.getParameterName() != null) {
                        request.addParameter("Parameters.Parameter." + parametersListIndex + ".ParameterName",
                                StringUtils.fromString(parametersListValue.getParameterName()));
                    }

                    if (parametersListValue.getParameterValue() != null) {
                        request.addParameter("Parameters.Parameter." + parametersListIndex + ".ParameterValue",
                                StringUtils.fromString(parametersListValue.getParameterValue()));
                    }

                    if (parametersListValue.getDescription() != null) {
                        request.addParameter("Parameters.Parameter." + parametersListIndex + ".Description",
                                StringUtils.fromString(parametersListValue.getDescription()));
                    }

                    if (parametersListValue.getSource() != null) {
                        request.addParameter("Parameters.Parameter." + parametersListIndex + ".Source", StringUtils.fromString(parametersListValue.getSource()));
                    }

                    if (parametersListValue.getApplyType() != null) {
                        request.addParameter("Parameters.Parameter." + parametersListIndex + ".ApplyType",
                                StringUtils.fromString(parametersListValue.getApplyType()));
                    }

                    if (parametersListValue.getDataType() != null) {
                        request.addParameter("Parameters.Parameter." + parametersListIndex + ".DataType",
                                StringUtils.fromString(parametersListValue.getDataType()));
                    }

                    if (parametersListValue.getAllowedValues() != null) {
                        request.addParameter("Parameters.Parameter." + parametersListIndex + ".AllowedValues",
                                StringUtils.fromString(parametersListValue.getAllowedValues()));
                    }

                    if (parametersListValue.getIsModifiable() != null) {
                        request.addParameter("Parameters.Parameter." + parametersListIndex + ".IsModifiable",
                                StringUtils.fromBoolean(parametersListValue.getIsModifiable()));
                    }

                    if (parametersListValue.getMinimumEngineVersion() != null) {
                        request.addParameter("Parameters.Parameter." + parametersListIndex + ".MinimumEngineVersion",
                                StringUtils.fromString(parametersListValue.getMinimumEngineVersion()));
                    }

                    if (parametersListValue.getApplyMethod() != null) {
                        request.addParameter("Parameters.Parameter." + parametersListIndex + ".ApplyMethod",
                                StringUtils.fromString(parametersListValue.getApplyMethod()));
                    }
                    parametersListIndex++;
                }
            }
        }

        return request;
    }

}
