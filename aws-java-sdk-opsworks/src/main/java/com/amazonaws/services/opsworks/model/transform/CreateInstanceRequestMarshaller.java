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
package com.amazonaws.services.opsworks.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Create Instance Request Marshaller
 */
public class CreateInstanceRequestMarshaller implements Marshaller<Request<CreateInstanceRequest>, CreateInstanceRequest> {

    public Request<CreateInstanceRequest> marshall(CreateInstanceRequest createInstanceRequest) {
        if (createInstanceRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateInstanceRequest> request = new DefaultRequest<CreateInstanceRequest>(createInstanceRequest, "AWSOpsWorks");
        String target = "OpsWorks_20130218.CreateInstance";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (createInstanceRequest.getStackId() != null) {
                jsonWriter.key("StackId").value(createInstanceRequest.getStackId());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> layerIdsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(createInstanceRequest.getLayerIds());
            if (layerIdsList != null && !(layerIdsList.isAutoConstruct() && layerIdsList.isEmpty())) {

                jsonWriter.key("LayerIds");
                jsonWriter.array();

                for (String layerIdsListValue : layerIdsList) {
                    if (layerIdsListValue != null) {
                        jsonWriter.value(layerIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }
            if (createInstanceRequest.getInstanceType() != null) {
                jsonWriter.key("InstanceType").value(createInstanceRequest.getInstanceType());
            }
            if (createInstanceRequest.getAutoScalingType() != null) {
                jsonWriter.key("AutoScalingType").value(createInstanceRequest.getAutoScalingType());
            }
            if (createInstanceRequest.getHostname() != null) {
                jsonWriter.key("Hostname").value(createInstanceRequest.getHostname());
            }
            if (createInstanceRequest.getOs() != null) {
                jsonWriter.key("Os").value(createInstanceRequest.getOs());
            }
            if (createInstanceRequest.getAmiId() != null) {
                jsonWriter.key("AmiId").value(createInstanceRequest.getAmiId());
            }
            if (createInstanceRequest.getSshKeyName() != null) {
                jsonWriter.key("SshKeyName").value(createInstanceRequest.getSshKeyName());
            }
            if (createInstanceRequest.getAvailabilityZone() != null) {
                jsonWriter.key("AvailabilityZone").value(createInstanceRequest.getAvailabilityZone());
            }
            if (createInstanceRequest.getVirtualizationType() != null) {
                jsonWriter.key("VirtualizationType").value(createInstanceRequest.getVirtualizationType());
            }
            if (createInstanceRequest.getSubnetId() != null) {
                jsonWriter.key("SubnetId").value(createInstanceRequest.getSubnetId());
            }
            if (createInstanceRequest.getArchitecture() != null) {
                jsonWriter.key("Architecture").value(createInstanceRequest.getArchitecture());
            }
            if (createInstanceRequest.getRootDeviceType() != null) {
                jsonWriter.key("RootDeviceType").value(createInstanceRequest.getRootDeviceType());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappingsList = (com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>)(createInstanceRequest.getBlockDeviceMappings());
            if (blockDeviceMappingsList != null && !(blockDeviceMappingsList.isAutoConstruct() && blockDeviceMappingsList.isEmpty())) {

                jsonWriter.key("BlockDeviceMappings");
                jsonWriter.array();

                for (BlockDeviceMapping blockDeviceMappingsListValue : blockDeviceMappingsList) {
                    if (blockDeviceMappingsListValue != null) {
                        jsonWriter.object();
                        if (blockDeviceMappingsListValue.getDeviceName() != null) {
                            jsonWriter.key("DeviceName").value(blockDeviceMappingsListValue.getDeviceName());
                        }
                        if (blockDeviceMappingsListValue.getNoDevice() != null) {
                            jsonWriter.key("NoDevice").value(blockDeviceMappingsListValue.getNoDevice());
                        }
                        if (blockDeviceMappingsListValue.getVirtualName() != null) {
                            jsonWriter.key("VirtualName").value(blockDeviceMappingsListValue.getVirtualName());
                        }
                        EbsBlockDevice ebs = blockDeviceMappingsListValue.getEbs();
                        if (ebs != null) {

                            jsonWriter.key("Ebs");
                            jsonWriter.object();

                            if (ebs.getSnapshotId() != null) {
                                jsonWriter.key("SnapshotId").value(ebs.getSnapshotId());
                            }
                            if (ebs.getIops() != null) {
                                jsonWriter.key("Iops").value(ebs.getIops());
                            }
                            if (ebs.getVolumeSize() != null) {
                                jsonWriter.key("VolumeSize").value(ebs.getVolumeSize());
                            }
                            if (ebs.getVolumeType() != null) {
                                jsonWriter.key("VolumeType").value(ebs.getVolumeType());
                            }
                            if (ebs.isDeleteOnTermination() != null) {
                                jsonWriter.key("DeleteOnTermination").value(ebs.isDeleteOnTermination());
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }
            if (createInstanceRequest.isInstallUpdatesOnBoot() != null) {
                jsonWriter.key("InstallUpdatesOnBoot").value(createInstanceRequest.isInstallUpdatesOnBoot());
            }
            if (createInstanceRequest.isEbsOptimized() != null) {
                jsonWriter.key("EbsOptimized").value(createInstanceRequest.isEbsOptimized());
            }

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
