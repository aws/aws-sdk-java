/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyScheduledActionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyScheduledActionRequestMarshaller implements Marshaller<Request<ModifyScheduledActionRequest>, ModifyScheduledActionRequest> {

    public Request<ModifyScheduledActionRequest> marshall(ModifyScheduledActionRequest modifyScheduledActionRequest) {

        if (modifyScheduledActionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyScheduledActionRequest> request = new DefaultRequest<ModifyScheduledActionRequest>(modifyScheduledActionRequest, "AmazonRedshift");
        request.addParameter("Action", "ModifyScheduledAction");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyScheduledActionRequest.getScheduledActionName() != null) {
            request.addParameter("ScheduledActionName", StringUtils.fromString(modifyScheduledActionRequest.getScheduledActionName()));
        }

        {
            ScheduledActionType targetAction = modifyScheduledActionRequest.getTargetAction();
            if (targetAction != null) {

                {
                    ResizeClusterMessage resizeCluster = targetAction.getResizeCluster();
                    if (resizeCluster != null) {

                        if (resizeCluster.getClusterIdentifier() != null) {
                            request.addParameter("TargetAction.ResizeCluster.ClusterIdentifier", StringUtils.fromString(resizeCluster.getClusterIdentifier()));
                        }

                        if (resizeCluster.getClusterType() != null) {
                            request.addParameter("TargetAction.ResizeCluster.ClusterType", StringUtils.fromString(resizeCluster.getClusterType()));
                        }

                        if (resizeCluster.getNodeType() != null) {
                            request.addParameter("TargetAction.ResizeCluster.NodeType", StringUtils.fromString(resizeCluster.getNodeType()));
                        }

                        if (resizeCluster.getNumberOfNodes() != null) {
                            request.addParameter("TargetAction.ResizeCluster.NumberOfNodes", StringUtils.fromInteger(resizeCluster.getNumberOfNodes()));
                        }

                        if (resizeCluster.getClassic() != null) {
                            request.addParameter("TargetAction.ResizeCluster.Classic", StringUtils.fromBoolean(resizeCluster.getClassic()));
                        }
                    }
                }
            }
        }

        if (modifyScheduledActionRequest.getSchedule() != null) {
            request.addParameter("Schedule", StringUtils.fromString(modifyScheduledActionRequest.getSchedule()));
        }

        if (modifyScheduledActionRequest.getIamRole() != null) {
            request.addParameter("IamRole", StringUtils.fromString(modifyScheduledActionRequest.getIamRole()));
        }

        if (modifyScheduledActionRequest.getScheduledActionDescription() != null) {
            request.addParameter("ScheduledActionDescription", StringUtils.fromString(modifyScheduledActionRequest.getScheduledActionDescription()));
        }

        if (modifyScheduledActionRequest.getStartTime() != null) {
            request.addParameter("StartTime", StringUtils.fromDate(modifyScheduledActionRequest.getStartTime()));
        }

        if (modifyScheduledActionRequest.getEndTime() != null) {
            request.addParameter("EndTime", StringUtils.fromDate(modifyScheduledActionRequest.getEndTime()));
        }

        if (modifyScheduledActionRequest.getEnable() != null) {
            request.addParameter("Enable", StringUtils.fromBoolean(modifyScheduledActionRequest.getEnable()));
        }

        return request;
    }

}
