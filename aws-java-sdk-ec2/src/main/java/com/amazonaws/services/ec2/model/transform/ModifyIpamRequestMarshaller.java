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
 * ModifyIpamRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyIpamRequestMarshaller implements Marshaller<Request<ModifyIpamRequest>, ModifyIpamRequest> {

    public Request<ModifyIpamRequest> marshall(ModifyIpamRequest modifyIpamRequest) {

        if (modifyIpamRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyIpamRequest> request = new DefaultRequest<ModifyIpamRequest>(modifyIpamRequest, "AmazonEC2");
        request.addParameter("Action", "ModifyIpam");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyIpamRequest.getIpamId() != null) {
            request.addParameter("IpamId", StringUtils.fromString(modifyIpamRequest.getIpamId()));
        }

        if (modifyIpamRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(modifyIpamRequest.getDescription()));
        }

        com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion> modifyIpamRequestAddOperatingRegionsList = (com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion>) modifyIpamRequest
                .getAddOperatingRegions();
        if (!modifyIpamRequestAddOperatingRegionsList.isEmpty() || !modifyIpamRequestAddOperatingRegionsList.isAutoConstruct()) {
            int addOperatingRegionsListIndex = 1;

            for (AddIpamOperatingRegion modifyIpamRequestAddOperatingRegionsListValue : modifyIpamRequestAddOperatingRegionsList) {

                if (modifyIpamRequestAddOperatingRegionsListValue.getRegionName() != null) {
                    request.addParameter("AddOperatingRegion." + addOperatingRegionsListIndex + ".RegionName",
                            StringUtils.fromString(modifyIpamRequestAddOperatingRegionsListValue.getRegionName()));
                }
                addOperatingRegionsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<RemoveIpamOperatingRegion> modifyIpamRequestRemoveOperatingRegionsList = (com.amazonaws.internal.SdkInternalList<RemoveIpamOperatingRegion>) modifyIpamRequest
                .getRemoveOperatingRegions();
        if (!modifyIpamRequestRemoveOperatingRegionsList.isEmpty() || !modifyIpamRequestRemoveOperatingRegionsList.isAutoConstruct()) {
            int removeOperatingRegionsListIndex = 1;

            for (RemoveIpamOperatingRegion modifyIpamRequestRemoveOperatingRegionsListValue : modifyIpamRequestRemoveOperatingRegionsList) {

                if (modifyIpamRequestRemoveOperatingRegionsListValue.getRegionName() != null) {
                    request.addParameter("RemoveOperatingRegion." + removeOperatingRegionsListIndex + ".RegionName",
                            StringUtils.fromString(modifyIpamRequestRemoveOperatingRegionsListValue.getRegionName()));
                }
                removeOperatingRegionsListIndex++;
            }
        }

        return request;
    }

}
