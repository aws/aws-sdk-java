/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateImageRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createImage(CreateImageRequest) CreateImage operation}.
 * <p>
 * Creates an Amazon EBS-backed AMI from an Amazon EBS-backed instance
 * that is either running or stopped.
 * </p>
 * <p>
 * If you customized your instance with instance store volumes or EBS
 * volumes in addition to the root device volume, the new AMI contains
 * block device mapping information for those volumes. When you launch an
 * instance from this new AMI, the instance automatically launches with
 * those additional volumes.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html"> Creating Amazon EBS-Backed Linux AMIs </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createImage(CreateImageRequest)
 */
public class CreateImageRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateImageRequest> {

    /**
     * The ID of the instance.
     */
    private String instanceId;

    /**
     * A name for the new image. <p>Constraints: 3-128 alphanumeric
     * characters, parenthesis (()), periods (.), slashes (/), dashes (-), or
     * underscores(_)
     */
    private String name;

    /**
     * A description for the new image.
     */
    private String description;

    /**
     * By default, this parameter is set to <code>false</code>, which means
     * Amazon EC2 attempts to shut down the instance cleanly before image
     * creation and then reboots the instance. When the parameter is set to
     * <code>true</code>, Amazon EC2 doesn't shut down the instance before
     * creating the image. When this option is used, file system integrity on
     * the created image can't be guaranteed.
     */
    private Boolean noReboot;

    /**
     * Information about one or more block device mappings.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappings;

    /**
     * Default constructor for a new CreateImageRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateImageRequest() {}
    
    /**
     * Constructs a new CreateImageRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceId The ID of the instance.
     * @param name A name for the new image. <p>Constraints: 3-128
     * alphanumeric characters, parenthesis (()), periods (.), slashes (/),
     * dashes (-), or underscores(_)
     */
    public CreateImageRequest(String instanceId, String name) {
        setInstanceId(instanceId);
        setName(name);
    }

    /**
     * The ID of the instance.
     *
     * @return The ID of the instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance.
     *
     * @param instanceId The ID of the instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateImageRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * A name for the new image. <p>Constraints: 3-128 alphanumeric
     * characters, parenthesis (()), periods (.), slashes (/), dashes (-), or
     * underscores(_)
     *
     * @return A name for the new image. <p>Constraints: 3-128 alphanumeric
     *         characters, parenthesis (()), periods (.), slashes (/), dashes (-), or
     *         underscores(_)
     */
    public String getName() {
        return name;
    }
    
    /**
     * A name for the new image. <p>Constraints: 3-128 alphanumeric
     * characters, parenthesis (()), periods (.), slashes (/), dashes (-), or
     * underscores(_)
     *
     * @param name A name for the new image. <p>Constraints: 3-128 alphanumeric
     *         characters, parenthesis (()), periods (.), slashes (/), dashes (-), or
     *         underscores(_)
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * A name for the new image. <p>Constraints: 3-128 alphanumeric
     * characters, parenthesis (()), periods (.), slashes (/), dashes (-), or
     * underscores(_)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name A name for the new image. <p>Constraints: 3-128 alphanumeric
     *         characters, parenthesis (()), periods (.), slashes (/), dashes (-), or
     *         underscores(_)
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateImageRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A description for the new image.
     *
     * @return A description for the new image.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description for the new image.
     *
     * @param description A description for the new image.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description for the new image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description for the new image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateImageRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * By default, this parameter is set to <code>false</code>, which means
     * Amazon EC2 attempts to shut down the instance cleanly before image
     * creation and then reboots the instance. When the parameter is set to
     * <code>true</code>, Amazon EC2 doesn't shut down the instance before
     * creating the image. When this option is used, file system integrity on
     * the created image can't be guaranteed.
     *
     * @return By default, this parameter is set to <code>false</code>, which means
     *         Amazon EC2 attempts to shut down the instance cleanly before image
     *         creation and then reboots the instance. When the parameter is set to
     *         <code>true</code>, Amazon EC2 doesn't shut down the instance before
     *         creating the image. When this option is used, file system integrity on
     *         the created image can't be guaranteed.
     */
    public Boolean isNoReboot() {
        return noReboot;
    }
    
    /**
     * By default, this parameter is set to <code>false</code>, which means
     * Amazon EC2 attempts to shut down the instance cleanly before image
     * creation and then reboots the instance. When the parameter is set to
     * <code>true</code>, Amazon EC2 doesn't shut down the instance before
     * creating the image. When this option is used, file system integrity on
     * the created image can't be guaranteed.
     *
     * @param noReboot By default, this parameter is set to <code>false</code>, which means
     *         Amazon EC2 attempts to shut down the instance cleanly before image
     *         creation and then reboots the instance. When the parameter is set to
     *         <code>true</code>, Amazon EC2 doesn't shut down the instance before
     *         creating the image. When this option is used, file system integrity on
     *         the created image can't be guaranteed.
     */
    public void setNoReboot(Boolean noReboot) {
        this.noReboot = noReboot;
    }
    
    /**
     * By default, this parameter is set to <code>false</code>, which means
     * Amazon EC2 attempts to shut down the instance cleanly before image
     * creation and then reboots the instance. When the parameter is set to
     * <code>true</code>, Amazon EC2 doesn't shut down the instance before
     * creating the image. When this option is used, file system integrity on
     * the created image can't be guaranteed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param noReboot By default, this parameter is set to <code>false</code>, which means
     *         Amazon EC2 attempts to shut down the instance cleanly before image
     *         creation and then reboots the instance. When the parameter is set to
     *         <code>true</code>, Amazon EC2 doesn't shut down the instance before
     *         creating the image. When this option is used, file system integrity on
     *         the created image can't be guaranteed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateImageRequest withNoReboot(Boolean noReboot) {
        this.noReboot = noReboot;
        return this;
    }

    /**
     * By default, this parameter is set to <code>false</code>, which means
     * Amazon EC2 attempts to shut down the instance cleanly before image
     * creation and then reboots the instance. When the parameter is set to
     * <code>true</code>, Amazon EC2 doesn't shut down the instance before
     * creating the image. When this option is used, file system integrity on
     * the created image can't be guaranteed.
     *
     * @return By default, this parameter is set to <code>false</code>, which means
     *         Amazon EC2 attempts to shut down the instance cleanly before image
     *         creation and then reboots the instance. When the parameter is set to
     *         <code>true</code>, Amazon EC2 doesn't shut down the instance before
     *         creating the image. When this option is used, file system integrity on
     *         the created image can't be guaranteed.
     */
    public Boolean getNoReboot() {
        return noReboot;
    }

    /**
     * Information about one or more block device mappings.
     *
     * @return Information about one or more block device mappings.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * Information about one or more block device mappings.
     *
     * @param blockDeviceMappings Information about one or more block device mappings.
     */
    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>(blockDeviceMappings.size());
        blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        this.blockDeviceMappings = blockDeviceMappingsCopy;
    }
    
    /**
     * Information about one or more block device mappings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Information about one or more block device mappings.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateImageRequest withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings.length));
        for (BlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * Information about one or more block device mappings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Information about one or more block device mappings.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateImageRequest withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>(blockDeviceMappings.size());
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
            this.blockDeviceMappings = blockDeviceMappingsCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateImageRequest> getDryRunRequest() {
        Request<CreateImageRequest> request = new CreateImageRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (isNoReboot() != null) sb.append("NoReboot: " + isNoReboot() + ",");
        if (getBlockDeviceMappings() != null) sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((isNoReboot() == null) ? 0 : isNoReboot().hashCode()); 
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateImageRequest == false) return false;
        CreateImageRequest other = (CreateImageRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.isNoReboot() == null ^ this.isNoReboot() == null) return false;
        if (other.isNoReboot() != null && other.isNoReboot().equals(this.isNoReboot()) == false) return false; 
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null) return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false) return false; 
        return true;
    }
    
}
    