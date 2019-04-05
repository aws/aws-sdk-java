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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyInstanceCreditSpecificationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyInstanceCreditSpecificationRequestMarshaller implements
        Marshaller<Request<ModifyInstanceCreditSpecificationRequest>, ModifyInstanceCreditSpecificationRequest> {

    public Request<ModifyInstanceCreditSpecificationRequest> marshall(ModifyInstanceCreditSpecificationRequest modifyInstanceCreditSpecificationRequest) {

        if (modifyInstanceCreditSpecificationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyInstanceCreditSpecificationRequest> request = new DefaultRequest<ModifyInstanceCreditSpecificationRequest>(
                modifyInstanceCreditSpecificationRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyInstanceCreditSpecification");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyInstanceCreditSpecificationRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(modifyInstanceCreditSpecificationRequest.getClientToken()));
        }

        com.amazonaws.internal.SdkInternalList<InstanceCreditSpecificationRequest> modifyInstanceCreditSpecificationRequestInstanceCreditSpecificationsList = (com.amazonaws.internal.SdkInternalList<InstanceCreditSpecificationRequest>) modifyInstanceCreditSpecificationRequest
                .getInstanceCreditSpecifications();
        if (!modifyInstanceCreditSpecificationRequestInstanceCreditSpecificationsList.isEmpty()
                || !modifyInstanceCreditSpecificationRequestInstanceCreditSpecificationsList.isAutoConstruct()) {
            int instanceCreditSpecificationsListIndex = 1;

            for (InstanceCreditSpecificationRequest modifyInstanceCreditSpecificationRequestInstanceCreditSpecificationsListValue : modifyInstanceCreditSpecificationRequestInstanceCreditSpecificationsList) {

                if (modifyInstanceCreditSpecificationRequestInstanceCreditSpecificationsListValue.getInstanceId() != null) {
                    request.addParameter("InstanceCreditSpecification." + instanceCreditSpecificationsListIndex + ".InstanceId",
                            StringUtils.fromString(modifyInstanceCreditSpecificationRequestInstanceCreditSpecificationsListValue.getInstanceId()));
                }

                if (modifyInstanceCreditSpecificationRequestInstanceCreditSpecificationsListValue.getCpuCredits() != null) {
                    request.addParameter("InstanceCreditSpecification." + instanceCreditSpecificationsListIndex + ".CpuCredits",
                            StringUtils.fromString(modifyInstanceCreditSpecificationRequestInstanceCreditSpecificationsListValue.getCpuCredits()));
                }
                instanceCreditSpecificationsListIndex++;
            }
        }

        return request;
    }

}
