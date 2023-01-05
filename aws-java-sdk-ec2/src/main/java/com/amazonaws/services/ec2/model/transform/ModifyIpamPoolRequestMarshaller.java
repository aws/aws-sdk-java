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
 * ModifyIpamPoolRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyIpamPoolRequestMarshaller implements Marshaller<Request<ModifyIpamPoolRequest>, ModifyIpamPoolRequest> {

    public Request<ModifyIpamPoolRequest> marshall(ModifyIpamPoolRequest modifyIpamPoolRequest) {

        if (modifyIpamPoolRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyIpamPoolRequest> request = new DefaultRequest<ModifyIpamPoolRequest>(modifyIpamPoolRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyIpamPool");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyIpamPoolRequest.getIpamPoolId() != null) {
            request.addParameter("IpamPoolId", StringUtils.fromString(modifyIpamPoolRequest.getIpamPoolId()));
        }

        if (modifyIpamPoolRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(modifyIpamPoolRequest.getDescription()));
        }

        if (modifyIpamPoolRequest.getAutoImport() != null) {
            request.addParameter("AutoImport", StringUtils.fromBoolean(modifyIpamPoolRequest.getAutoImport()));
        }

        if (modifyIpamPoolRequest.getAllocationMinNetmaskLength() != null) {
            request.addParameter("AllocationMinNetmaskLength", StringUtils.fromInteger(modifyIpamPoolRequest.getAllocationMinNetmaskLength()));
        }

        if (modifyIpamPoolRequest.getAllocationMaxNetmaskLength() != null) {
            request.addParameter("AllocationMaxNetmaskLength", StringUtils.fromInteger(modifyIpamPoolRequest.getAllocationMaxNetmaskLength()));
        }

        if (modifyIpamPoolRequest.getAllocationDefaultNetmaskLength() != null) {
            request.addParameter("AllocationDefaultNetmaskLength", StringUtils.fromInteger(modifyIpamPoolRequest.getAllocationDefaultNetmaskLength()));
        }

        if (modifyIpamPoolRequest.getClearAllocationDefaultNetmaskLength() != null) {
            request.addParameter("ClearAllocationDefaultNetmaskLength", StringUtils.fromBoolean(modifyIpamPoolRequest.getClearAllocationDefaultNetmaskLength()));
        }

        com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag> modifyIpamPoolRequestAddAllocationResourceTagsList = (com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag>) modifyIpamPoolRequest
                .getAddAllocationResourceTags();
        if (!modifyIpamPoolRequestAddAllocationResourceTagsList.isEmpty() || !modifyIpamPoolRequestAddAllocationResourceTagsList.isAutoConstruct()) {
            int addAllocationResourceTagsListIndex = 1;

            for (RequestIpamResourceTag modifyIpamPoolRequestAddAllocationResourceTagsListValue : modifyIpamPoolRequestAddAllocationResourceTagsList) {

                if (modifyIpamPoolRequestAddAllocationResourceTagsListValue.getKey() != null) {
                    request.addParameter("AddAllocationResourceTag." + addAllocationResourceTagsListIndex + ".Key",
                            StringUtils.fromString(modifyIpamPoolRequestAddAllocationResourceTagsListValue.getKey()));
                }

                if (modifyIpamPoolRequestAddAllocationResourceTagsListValue.getValue() != null) {
                    request.addParameter("AddAllocationResourceTag." + addAllocationResourceTagsListIndex + ".Value",
                            StringUtils.fromString(modifyIpamPoolRequestAddAllocationResourceTagsListValue.getValue()));
                }
                addAllocationResourceTagsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag> modifyIpamPoolRequestRemoveAllocationResourceTagsList = (com.amazonaws.internal.SdkInternalList<RequestIpamResourceTag>) modifyIpamPoolRequest
                .getRemoveAllocationResourceTags();
        if (!modifyIpamPoolRequestRemoveAllocationResourceTagsList.isEmpty() || !modifyIpamPoolRequestRemoveAllocationResourceTagsList.isAutoConstruct()) {
            int removeAllocationResourceTagsListIndex = 1;

            for (RequestIpamResourceTag modifyIpamPoolRequestRemoveAllocationResourceTagsListValue : modifyIpamPoolRequestRemoveAllocationResourceTagsList) {

                if (modifyIpamPoolRequestRemoveAllocationResourceTagsListValue.getKey() != null) {
                    request.addParameter("RemoveAllocationResourceTag." + removeAllocationResourceTagsListIndex + ".Key",
                            StringUtils.fromString(modifyIpamPoolRequestRemoveAllocationResourceTagsListValue.getKey()));
                }

                if (modifyIpamPoolRequestRemoveAllocationResourceTagsListValue.getValue() != null) {
                    request.addParameter("RemoveAllocationResourceTag." + removeAllocationResourceTagsListIndex + ".Value",
                            StringUtils.fromString(modifyIpamPoolRequestRemoveAllocationResourceTagsListValue.getValue()));
                }
                removeAllocationResourceTagsListIndex++;
            }
        }

        return request;
    }

}
