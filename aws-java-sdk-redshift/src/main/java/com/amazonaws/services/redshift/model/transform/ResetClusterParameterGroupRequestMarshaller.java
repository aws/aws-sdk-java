/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Reset Cluster Parameter Group Request Marshaller
 */
public class ResetClusterParameterGroupRequestMarshaller implements Marshaller<Request<ResetClusterParameterGroupRequest>, ResetClusterParameterGroupRequest> {

    public Request<ResetClusterParameterGroupRequest> marshall(ResetClusterParameterGroupRequest resetClusterParameterGroupRequest) {

        if (resetClusterParameterGroupRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ResetClusterParameterGroupRequest> request = new DefaultRequest<ResetClusterParameterGroupRequest>(resetClusterParameterGroupRequest, "AmazonRedshift");
        request.addParameter("Action", "ResetClusterParameterGroup");
        request.addParameter("Version", "2012-12-01");

        if (resetClusterParameterGroupRequest.getParameterGroupName() != null) {
            request.addParameter("ParameterGroupName", StringUtils.fromString(resetClusterParameterGroupRequest.getParameterGroupName()));
        }
        if (resetClusterParameterGroupRequest.isResetAllParameters() != null) {
            request.addParameter("ResetAllParameters", StringUtils.fromBoolean(resetClusterParameterGroupRequest.isResetAllParameters()));
        }

        java.util.List<Parameter> parametersList = resetClusterParameterGroupRequest.getParameters();
        int parametersListIndex = 1;

        for (Parameter parametersListValue : parametersList) {
            Parameter parameterMember = parametersListValue;
            if (parameterMember != null) {
                if (parameterMember.getParameterName() != null) {
                    request.addParameter("Parameters.Parameter." + parametersListIndex + ".ParameterName", StringUtils.fromString(parameterMember.getParameterName()));
                }
                if (parameterMember.getParameterValue() != null) {
                    request.addParameter("Parameters.Parameter." + parametersListIndex + ".ParameterValue", StringUtils.fromString(parameterMember.getParameterValue()));
                }
                if (parameterMember.getDescription() != null) {
                    request.addParameter("Parameters.Parameter." + parametersListIndex + ".Description", StringUtils.fromString(parameterMember.getDescription()));
                }
                if (parameterMember.getSource() != null) {
                    request.addParameter("Parameters.Parameter." + parametersListIndex + ".Source", StringUtils.fromString(parameterMember.getSource()));
                }
                if (parameterMember.getDataType() != null) {
                    request.addParameter("Parameters.Parameter." + parametersListIndex + ".DataType", StringUtils.fromString(parameterMember.getDataType()));
                }
                if (parameterMember.getAllowedValues() != null) {
                    request.addParameter("Parameters.Parameter." + parametersListIndex + ".AllowedValues", StringUtils.fromString(parameterMember.getAllowedValues()));
                }
                if (parameterMember.getApplyType() != null) {
                    request.addParameter("Parameters.Parameter." + parametersListIndex + ".ApplyType", StringUtils.fromString(parameterMember.getApplyType()));
                }
                if (parameterMember.isModifiable() != null) {
                    request.addParameter("Parameters.Parameter." + parametersListIndex + ".IsModifiable", StringUtils.fromBoolean(parameterMember.isModifiable()));
                }
                if (parameterMember.getMinimumEngineVersion() != null) {
                    request.addParameter("Parameters.Parameter." + parametersListIndex + ".MinimumEngineVersion", StringUtils.fromString(parameterMember.getMinimumEngineVersion()));
                }
            }

            parametersListIndex++;
        }

        return request;
    }
}
