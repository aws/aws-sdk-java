/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ModifyIpamResourceDiscoveryRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyIpamResourceDiscoveryRequestMarshaller implements
        Marshaller<Request<ModifyIpamResourceDiscoveryRequest>, ModifyIpamResourceDiscoveryRequest> {

    public Request<ModifyIpamResourceDiscoveryRequest> marshall(ModifyIpamResourceDiscoveryRequest modifyIpamResourceDiscoveryRequest) {

        if (modifyIpamResourceDiscoveryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyIpamResourceDiscoveryRequest> request = new DefaultRequest<ModifyIpamResourceDiscoveryRequest>(modifyIpamResourceDiscoveryRequest,
                "AmazonEC2");
        request.addParameter("Action", "ModifyIpamResourceDiscovery");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyIpamResourceDiscoveryRequest.getIpamResourceDiscoveryId() != null) {
            request.addParameter("IpamResourceDiscoveryId", StringUtils.fromString(modifyIpamResourceDiscoveryRequest.getIpamResourceDiscoveryId()));
        }

        if (modifyIpamResourceDiscoveryRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(modifyIpamResourceDiscoveryRequest.getDescription()));
        }

        com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion> modifyIpamResourceDiscoveryRequestAddOperatingRegionsList = (com.amazonaws.internal.SdkInternalList<AddIpamOperatingRegion>) modifyIpamResourceDiscoveryRequest
                .getAddOperatingRegions();
        if (!modifyIpamResourceDiscoveryRequestAddOperatingRegionsList.isEmpty()
                || !modifyIpamResourceDiscoveryRequestAddOperatingRegionsList.isAutoConstruct()) {
            int addOperatingRegionsListIndex = 1;

            for (AddIpamOperatingRegion modifyIpamResourceDiscoveryRequestAddOperatingRegionsListValue : modifyIpamResourceDiscoveryRequestAddOperatingRegionsList) {

                if (modifyIpamResourceDiscoveryRequestAddOperatingRegionsListValue.getRegionName() != null) {
                    request.addParameter("AddOperatingRegion." + addOperatingRegionsListIndex + ".RegionName",
                            StringUtils.fromString(modifyIpamResourceDiscoveryRequestAddOperatingRegionsListValue.getRegionName()));
                }
                addOperatingRegionsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<RemoveIpamOperatingRegion> modifyIpamResourceDiscoveryRequestRemoveOperatingRegionsList = (com.amazonaws.internal.SdkInternalList<RemoveIpamOperatingRegion>) modifyIpamResourceDiscoveryRequest
                .getRemoveOperatingRegions();
        if (!modifyIpamResourceDiscoveryRequestRemoveOperatingRegionsList.isEmpty()
                || !modifyIpamResourceDiscoveryRequestRemoveOperatingRegionsList.isAutoConstruct()) {
            int removeOperatingRegionsListIndex = 1;

            for (RemoveIpamOperatingRegion modifyIpamResourceDiscoveryRequestRemoveOperatingRegionsListValue : modifyIpamResourceDiscoveryRequestRemoveOperatingRegionsList) {

                if (modifyIpamResourceDiscoveryRequestRemoveOperatingRegionsListValue.getRegionName() != null) {
                    request.addParameter("RemoveOperatingRegion." + removeOperatingRegionsListIndex + ".RegionName",
                            StringUtils.fromString(modifyIpamResourceDiscoveryRequestRemoveOperatingRegionsListValue.getRegionName()));
                }
                removeOperatingRegionsListIndex++;
            }
        }

        return request;
    }

}
