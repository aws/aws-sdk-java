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
 * CreateServerlessCacheRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServerlessCacheRequestMarshaller implements Marshaller<Request<CreateServerlessCacheRequest>, CreateServerlessCacheRequest> {

    public Request<CreateServerlessCacheRequest> marshall(CreateServerlessCacheRequest createServerlessCacheRequest) {

        if (createServerlessCacheRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateServerlessCacheRequest> request = new DefaultRequest<CreateServerlessCacheRequest>(createServerlessCacheRequest, "AmazonElastiCache");
        request.addParameter("Action", "CreateServerlessCache");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (createServerlessCacheRequest.getServerlessCacheName() != null) {
            request.addParameter("ServerlessCacheName", StringUtils.fromString(createServerlessCacheRequest.getServerlessCacheName()));
        }

        if (createServerlessCacheRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createServerlessCacheRequest.getDescription()));
        }

        if (createServerlessCacheRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(createServerlessCacheRequest.getEngine()));
        }

        if (createServerlessCacheRequest.getMajorEngineVersion() != null) {
            request.addParameter("MajorEngineVersion", StringUtils.fromString(createServerlessCacheRequest.getMajorEngineVersion()));
        }

        {
            CacheUsageLimits cacheUsageLimits = createServerlessCacheRequest.getCacheUsageLimits();
            if (cacheUsageLimits != null) {

                {
                    DataStorage dataStorage = cacheUsageLimits.getDataStorage();
                    if (dataStorage != null) {

                        if (dataStorage.getMaximum() != null) {
                            request.addParameter("CacheUsageLimits.DataStorage.Maximum", StringUtils.fromInteger(dataStorage.getMaximum()));
                        }

                        if (dataStorage.getMinimum() != null) {
                            request.addParameter("CacheUsageLimits.DataStorage.Minimum", StringUtils.fromInteger(dataStorage.getMinimum()));
                        }

                        if (dataStorage.getUnit() != null) {
                            request.addParameter("CacheUsageLimits.DataStorage.Unit", StringUtils.fromString(dataStorage.getUnit()));
                        }
                    }
                }

                {
                    ECPUPerSecond eCPUPerSecond = cacheUsageLimits.getECPUPerSecond();
                    if (eCPUPerSecond != null) {

                        if (eCPUPerSecond.getMaximum() != null) {
                            request.addParameter("CacheUsageLimits.ECPUPerSecond.Maximum", StringUtils.fromInteger(eCPUPerSecond.getMaximum()));
                        }

                        if (eCPUPerSecond.getMinimum() != null) {
                            request.addParameter("CacheUsageLimits.ECPUPerSecond.Minimum", StringUtils.fromInteger(eCPUPerSecond.getMinimum()));
                        }
                    }
                }
            }
        }

        if (createServerlessCacheRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(createServerlessCacheRequest.getKmsKeyId()));
        }

        if (!createServerlessCacheRequest.getSecurityGroupIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createServerlessCacheRequest.getSecurityGroupIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> securityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) createServerlessCacheRequest
                    .getSecurityGroupIds();
            int securityGroupIdsListIndex = 1;

            for (String securityGroupIdsListValue : securityGroupIdsList) {
                if (securityGroupIdsListValue != null) {
                    request.addParameter("SecurityGroupIds.SecurityGroupId." + securityGroupIdsListIndex, StringUtils.fromString(securityGroupIdsListValue));
                }
                securityGroupIdsListIndex++;
            }
        }

        if (!createServerlessCacheRequest.getSnapshotArnsToRestore().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createServerlessCacheRequest.getSnapshotArnsToRestore()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> snapshotArnsToRestoreList = (com.amazonaws.internal.SdkInternalList<String>) createServerlessCacheRequest
                    .getSnapshotArnsToRestore();
            int snapshotArnsToRestoreListIndex = 1;

            for (String snapshotArnsToRestoreListValue : snapshotArnsToRestoreList) {
                if (snapshotArnsToRestoreListValue != null) {
                    request.addParameter("SnapshotArnsToRestore.SnapshotArn." + snapshotArnsToRestoreListIndex,
                            StringUtils.fromString(snapshotArnsToRestoreListValue));
                }
                snapshotArnsToRestoreListIndex++;
            }
        }

        if (!createServerlessCacheRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createServerlessCacheRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createServerlessCacheRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {
                if (tagsListValue != null) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                }
                tagsListIndex++;
            }
        }

        if (createServerlessCacheRequest.getUserGroupId() != null) {
            request.addParameter("UserGroupId", StringUtils.fromString(createServerlessCacheRequest.getUserGroupId()));
        }

        if (!createServerlessCacheRequest.getSubnetIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createServerlessCacheRequest.getSubnetIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> subnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) createServerlessCacheRequest
                    .getSubnetIds();
            int subnetIdsListIndex = 1;

            for (String subnetIdsListValue : subnetIdsList) {
                if (subnetIdsListValue != null) {
                    request.addParameter("SubnetIds.SubnetId." + subnetIdsListIndex, StringUtils.fromString(subnetIdsListValue));
                }
                subnetIdsListIndex++;
            }
        }

        if (createServerlessCacheRequest.getSnapshotRetentionLimit() != null) {
            request.addParameter("SnapshotRetentionLimit", StringUtils.fromInteger(createServerlessCacheRequest.getSnapshotRetentionLimit()));
        }

        if (createServerlessCacheRequest.getDailySnapshotTime() != null) {
            request.addParameter("DailySnapshotTime", StringUtils.fromString(createServerlessCacheRequest.getDailySnapshotTime()));
        }

        return request;
    }

}
