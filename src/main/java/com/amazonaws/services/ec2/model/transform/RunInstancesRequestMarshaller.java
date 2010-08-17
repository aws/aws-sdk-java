/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Run Instances Request Marshaller
 */
public class RunInstancesRequestMarshaller implements Marshaller<Request<RunInstancesRequest>, RunInstancesRequest> {

    public Request<RunInstancesRequest> marshall(RunInstancesRequest runInstancesRequest) {
        Request<RunInstancesRequest> request = new DefaultRequest<RunInstancesRequest>(runInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "RunInstances");
        request.addParameter("Version", "2010-06-15");
        if (runInstancesRequest != null) {
            if (runInstancesRequest.getImageId() != null) {
                request.addParameter("ImageId", StringUtils.fromString(runInstancesRequest.getImageId()));
            }
        }
        if (runInstancesRequest != null) {
            if (runInstancesRequest.getMinCount() != null) {
                request.addParameter("MinCount", StringUtils.fromInteger(runInstancesRequest.getMinCount()));
            }
        }
        if (runInstancesRequest != null) {
            if (runInstancesRequest.getMaxCount() != null) {
                request.addParameter("MaxCount", StringUtils.fromInteger(runInstancesRequest.getMaxCount()));
            }
        }
        if (runInstancesRequest != null) {
            if (runInstancesRequest.getKeyName() != null) {
                request.addParameter("KeyName", StringUtils.fromString(runInstancesRequest.getKeyName()));
            }
        }
        if (runInstancesRequest != null) {
            java.util.List<String> securityGroupsList = runInstancesRequest.getSecurityGroups();
            int securityGroupsListIndex = 1;
            for (String securityGroupsListValue : securityGroupsList) {
                if (securityGroupsListValue != null) {
                    request.addParameter("SecurityGroup." + securityGroupsListIndex, StringUtils.fromString(securityGroupsListValue));
                }
                securityGroupsListIndex++;
            }
        }
        if (runInstancesRequest != null) {
            if (runInstancesRequest.getUserData() != null) {
                request.addParameter("UserData", StringUtils.fromString(runInstancesRequest.getUserData()));
            }
        }
        if (runInstancesRequest != null) {
            if (runInstancesRequest.getInstanceType() != null) {
                request.addParameter("InstanceType", StringUtils.fromString(runInstancesRequest.getInstanceType()));
            }
        }
        if (runInstancesRequest != null) {
            Placement placement = runInstancesRequest.getPlacement();
            if (placement != null) {
                if (placement.getAvailabilityZone() != null) {
                    request.addParameter("Placement.AvailabilityZone", StringUtils.fromString(placement.getAvailabilityZone()));
                }
            }
            if (placement != null) {
                if (placement.getGroupName() != null) {
                    request.addParameter("Placement.GroupName", StringUtils.fromString(placement.getGroupName()));
                }
            }
        }
        if (runInstancesRequest != null) {
            if (runInstancesRequest.getKernelId() != null) {
                request.addParameter("KernelId", StringUtils.fromString(runInstancesRequest.getKernelId()));
            }
        }
        if (runInstancesRequest != null) {
            if (runInstancesRequest.getRamdiskId() != null) {
                request.addParameter("RamdiskId", StringUtils.fromString(runInstancesRequest.getRamdiskId()));
            }
        }

        if (runInstancesRequest != null) {
            java.util.List<BlockDeviceMapping> blockDeviceMappingsList = runInstancesRequest.getBlockDeviceMappings();
            int blockDeviceMappingsListIndex = 1;
            for (BlockDeviceMapping blockDeviceMappingsListValue : blockDeviceMappingsList) {
                if (blockDeviceMappingsListValue != null) {
                    if (blockDeviceMappingsListValue.getVirtualName() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName", StringUtils.fromString(blockDeviceMappingsListValue.getVirtualName()));
                    }
                }
                if (blockDeviceMappingsListValue != null) {
                    if (blockDeviceMappingsListValue.getDeviceName() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName", StringUtils.fromString(blockDeviceMappingsListValue.getDeviceName()));
                    }
                }
                if (blockDeviceMappingsListValue != null) {
                    EbsBlockDevice ebs = blockDeviceMappingsListValue.getEbs();
                    if (ebs != null) {
                        if (ebs.getSnapshotId() != null) {
                            request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId", StringUtils.fromString(ebs.getSnapshotId()));
                        }
                    }
                    if (ebs != null) {
                        if (ebs.getVolumeSize() != null) {
                            request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize", StringUtils.fromInteger(ebs.getVolumeSize()));
                        }
                    }
                    if (ebs != null) {
                        if (ebs.isDeleteOnTermination() != null) {
                            request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination", StringUtils.fromBoolean(ebs.isDeleteOnTermination()));
                        }
                    }
                }
                if (blockDeviceMappingsListValue != null) {
                    if (blockDeviceMappingsListValue.getNoDevice() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice", StringUtils.fromString(blockDeviceMappingsListValue.getNoDevice()));
                    }
                }

                blockDeviceMappingsListIndex++;
            }
        }
        if (runInstancesRequest != null) {
            if (runInstancesRequest.isMonitoring() != null) {
                request.addParameter("Monitoring.Enabled", StringUtils.fromBoolean(runInstancesRequest.isMonitoring()));
            }
        }
        if (runInstancesRequest != null) {
            if (runInstancesRequest.getSubnetId() != null) {
                request.addParameter("SubnetId", StringUtils.fromString(runInstancesRequest.getSubnetId()));
            }
        }
        if (runInstancesRequest != null) {
            if (runInstancesRequest.isDisableApiTermination() != null) {
                request.addParameter("DisableApiTermination", StringUtils.fromBoolean(runInstancesRequest.isDisableApiTermination()));
            }
        }
        if (runInstancesRequest != null) {
            if (runInstancesRequest.getInstanceInitiatedShutdownBehavior() != null) {
                request.addParameter("InstanceInitiatedShutdownBehavior", StringUtils.fromString(runInstancesRequest.getInstanceInitiatedShutdownBehavior()));
            }
        }
        if (runInstancesRequest != null) {
            InstanceLicenseSpecification license = runInstancesRequest.getLicense();
            if (license != null) {
                if (license.getPool() != null) {
                    request.addParameter("License.Pool", StringUtils.fromString(license.getPool()));
                }
            }
        }
        if (runInstancesRequest != null) {
            if (runInstancesRequest.getPrivateIpAddress() != null) {
                request.addParameter("PrivateIpAddress", StringUtils.fromString(runInstancesRequest.getPrivateIpAddress()));
            }
        }


        return request;
    }
}
