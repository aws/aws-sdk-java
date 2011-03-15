/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Request Spot Instances Request Marshaller
 */
public class RequestSpotInstancesRequestMarshaller implements Marshaller<Request<RequestSpotInstancesRequest>, RequestSpotInstancesRequest> {

    public Request<RequestSpotInstancesRequest> marshall(RequestSpotInstancesRequest requestSpotInstancesRequest) {
        Request<RequestSpotInstancesRequest> request = new DefaultRequest<RequestSpotInstancesRequest>(requestSpotInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "RequestSpotInstances");
        request.addParameter("Version", "2011-01-01");
        if (requestSpotInstancesRequest != null) {
            if (requestSpotInstancesRequest.getSpotPrice() != null) {
                request.addParameter("SpotPrice", StringUtils.fromString(requestSpotInstancesRequest.getSpotPrice()));
            }
        }
        if (requestSpotInstancesRequest != null) {
            if (requestSpotInstancesRequest.getInstanceCount() != null) {
                request.addParameter("InstanceCount", StringUtils.fromInteger(requestSpotInstancesRequest.getInstanceCount()));
            }
        }
        if (requestSpotInstancesRequest != null) {
            if (requestSpotInstancesRequest.getType() != null) {
                request.addParameter("Type", StringUtils.fromString(requestSpotInstancesRequest.getType()));
            }
        }
        if (requestSpotInstancesRequest != null) {
            if (requestSpotInstancesRequest.getValidFrom() != null) {
                request.addParameter("ValidFrom", StringUtils.fromDate(requestSpotInstancesRequest.getValidFrom()));
            }
        }
        if (requestSpotInstancesRequest != null) {
            if (requestSpotInstancesRequest.getValidUntil() != null) {
                request.addParameter("ValidUntil", StringUtils.fromDate(requestSpotInstancesRequest.getValidUntil()));
            }
        }
        if (requestSpotInstancesRequest != null) {
            if (requestSpotInstancesRequest.getLaunchGroup() != null) {
                request.addParameter("LaunchGroup", StringUtils.fromString(requestSpotInstancesRequest.getLaunchGroup()));
            }
        }
        if (requestSpotInstancesRequest != null) {
            if (requestSpotInstancesRequest.getAvailabilityZoneGroup() != null) {
                request.addParameter("AvailabilityZoneGroup", StringUtils.fromString(requestSpotInstancesRequest.getAvailabilityZoneGroup()));
            }
        }
        if (requestSpotInstancesRequest != null) {
            LaunchSpecification launchSpecification = requestSpotInstancesRequest.getLaunchSpecification();
            if (launchSpecification != null) {
                if (launchSpecification.getImageId() != null) {
                    request.addParameter("LaunchSpecification.ImageId", StringUtils.fromString(launchSpecification.getImageId()));
                }
            }
            if (launchSpecification != null) {
                if (launchSpecification.getKeyName() != null) {
                    request.addParameter("LaunchSpecification.KeyName", StringUtils.fromString(launchSpecification.getKeyName()));
                }
            }

            if (launchSpecification != null) {
                java.util.List<GroupIdentifier> allSecurityGroupsList = launchSpecification.getAllSecurityGroups();
                int allSecurityGroupsListIndex = 1;
                for (GroupIdentifier allSecurityGroupsListValue : allSecurityGroupsList) {
                    if (allSecurityGroupsListValue != null) {
                        if (allSecurityGroupsListValue.getGroupName() != null) {
                            request.addParameter("LaunchSpecification.GroupSet." + allSecurityGroupsListIndex + ".GroupName", StringUtils.fromString(allSecurityGroupsListValue.getGroupName()));
                        }
                    }
                    if (allSecurityGroupsListValue != null) {
                        if (allSecurityGroupsListValue.getGroupId() != null) {
                            request.addParameter("LaunchSpecification.GroupSet." + allSecurityGroupsListIndex + ".GroupId", StringUtils.fromString(allSecurityGroupsListValue.getGroupId()));
                        }
                    }

                    allSecurityGroupsListIndex++;
                }
            }
            if (launchSpecification != null) {
                java.util.List<String> securityGroupsList = launchSpecification.getSecurityGroups();
                int securityGroupsListIndex = 1;

                for (String securityGroupsListValue : securityGroupsList) {
                    if (securityGroupsListValue != null) {
                        request.addParameter("LaunchSpecification.SecurityGroup." + securityGroupsListIndex, StringUtils.fromString(securityGroupsListValue));
                    }
                    securityGroupsListIndex++;
                }
            }
            if (launchSpecification != null) {
                if (launchSpecification.getUserData() != null) {
                    request.addParameter("LaunchSpecification.UserData", StringUtils.fromString(launchSpecification.getUserData()));
                }
            }
            if (launchSpecification != null) {
                if (launchSpecification.getAddressingType() != null) {
                    request.addParameter("LaunchSpecification.AddressingType", StringUtils.fromString(launchSpecification.getAddressingType()));
                }
            }
            if (launchSpecification != null) {
                if (launchSpecification.getInstanceType() != null) {
                    request.addParameter("LaunchSpecification.InstanceType", StringUtils.fromString(launchSpecification.getInstanceType()));
                }
            }
            if (launchSpecification != null) {
                Placement placement = launchSpecification.getPlacement();
                if (placement != null) {
                    if (placement.getAvailabilityZone() != null) {
                        request.addParameter("LaunchSpecification.Placement.AvailabilityZone", StringUtils.fromString(placement.getAvailabilityZone()));
                    }
                }
                if (placement != null) {
                    if (placement.getGroupName() != null) {
                        request.addParameter("LaunchSpecification.Placement.GroupName", StringUtils.fromString(placement.getGroupName()));
                    }
                }
            }
            if (launchSpecification != null) {
                if (launchSpecification.getKernelId() != null) {
                    request.addParameter("LaunchSpecification.KernelId", StringUtils.fromString(launchSpecification.getKernelId()));
                }
            }
            if (launchSpecification != null) {
                if (launchSpecification.getRamdiskId() != null) {
                    request.addParameter("LaunchSpecification.RamdiskId", StringUtils.fromString(launchSpecification.getRamdiskId()));
                }
            }

            if (launchSpecification != null) {
                java.util.List<BlockDeviceMapping> blockDeviceMappingsList = launchSpecification.getBlockDeviceMappings();
                int blockDeviceMappingsListIndex = 1;
                for (BlockDeviceMapping blockDeviceMappingsListValue : blockDeviceMappingsList) {
                    if (blockDeviceMappingsListValue != null) {
                        if (blockDeviceMappingsListValue.getVirtualName() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName", StringUtils.fromString(blockDeviceMappingsListValue.getVirtualName()));
                        }
                    }
                    if (blockDeviceMappingsListValue != null) {
                        if (blockDeviceMappingsListValue.getDeviceName() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName", StringUtils.fromString(blockDeviceMappingsListValue.getDeviceName()));
                        }
                    }
                    if (blockDeviceMappingsListValue != null) {
                        EbsBlockDevice ebs = blockDeviceMappingsListValue.getEbs();
                        if (ebs != null) {
                            if (ebs.getSnapshotId() != null) {
                                request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId", StringUtils.fromString(ebs.getSnapshotId()));
                            }
                        }
                        if (ebs != null) {
                            if (ebs.getVolumeSize() != null) {
                                request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize", StringUtils.fromInteger(ebs.getVolumeSize()));
                            }
                        }
                        if (ebs != null) {
                            if (ebs.isDeleteOnTermination() != null) {
                                request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination", StringUtils.fromBoolean(ebs.isDeleteOnTermination()));
                            }
                        }
                    }
                    if (blockDeviceMappingsListValue != null) {
                        if (blockDeviceMappingsListValue.getNoDevice() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice", StringUtils.fromString(blockDeviceMappingsListValue.getNoDevice()));
                        }
                    }

                    blockDeviceMappingsListIndex++;
                }
            }
            if (launchSpecification != null) {
                if (launchSpecification.isMonitoringEnabled() != null) {
                    request.addParameter("LaunchSpecification.Monitoring.Enabled", StringUtils.fromBoolean(launchSpecification.isMonitoringEnabled()));
                }
            }
            if (launchSpecification != null) {
                if (launchSpecification.getSubnetId() != null) {
                    request.addParameter("LaunchSpecification.SubnetId", StringUtils.fromString(launchSpecification.getSubnetId()));
                }
            }
        }


        return request;
    }
}
