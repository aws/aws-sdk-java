/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates an Amazon EBS-backed AMI from a "running" or "stopped" instance. AMIs that use an Amazon EBS root device boot faster than AMIs that use
 * instance stores. They can be up to 1 TiB in size, use storage that persists on instance failure, and can be stopped and started.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createImage(CreateImageRequest)
 */
public class CreateImageRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateImageRequest> {

    /**
     * The ID of the instance from which to create the new image.
     */
    private String instanceId;

    /**
     * The name for the new AMI being created.
     */
    private String name;

    /**
     * The description for the new AMI being created.
     */
    private String description;

    /**
     * By default this property is set to <code>false</code>, which means
     * Amazon EC2 attempts to cleanly shut down the instance before image
     * creation and reboots the instance afterwards. When set to true, Amazon
     * EC2 will not shut down the instance before creating the image. When
     * this option is used, file system integrity on the created image cannot
     * be guaranteed.
     */
    private Boolean noReboot;

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
     * @param instanceId The ID of the instance from which to create the new
     * image.
     * @param name The name for the new AMI being created.
     */
    public CreateImageRequest(String instanceId, String name) {
        setInstanceId(instanceId);
        setName(name);
    }

    /**
     * The ID of the instance from which to create the new image.
     *
     * @return The ID of the instance from which to create the new image.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance from which to create the new image.
     *
     * @param instanceId The ID of the instance from which to create the new image.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance from which to create the new image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance from which to create the new image.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateImageRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The name for the new AMI being created.
     *
     * @return The name for the new AMI being created.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name for the new AMI being created.
     *
     * @param name The name for the new AMI being created.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name for the new AMI being created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name for the new AMI being created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateImageRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The description for the new AMI being created.
     *
     * @return The description for the new AMI being created.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description for the new AMI being created.
     *
     * @param description The description for the new AMI being created.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description for the new AMI being created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description for the new AMI being created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateImageRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * By default this property is set to <code>false</code>, which means
     * Amazon EC2 attempts to cleanly shut down the instance before image
     * creation and reboots the instance afterwards. When set to true, Amazon
     * EC2 will not shut down the instance before creating the image. When
     * this option is used, file system integrity on the created image cannot
     * be guaranteed.
     *
     * @return By default this property is set to <code>false</code>, which means
     *         Amazon EC2 attempts to cleanly shut down the instance before image
     *         creation and reboots the instance afterwards. When set to true, Amazon
     *         EC2 will not shut down the instance before creating the image. When
     *         this option is used, file system integrity on the created image cannot
     *         be guaranteed.
     */
    public Boolean isNoReboot() {
        return noReboot;
    }
    
    /**
     * By default this property is set to <code>false</code>, which means
     * Amazon EC2 attempts to cleanly shut down the instance before image
     * creation and reboots the instance afterwards. When set to true, Amazon
     * EC2 will not shut down the instance before creating the image. When
     * this option is used, file system integrity on the created image cannot
     * be guaranteed.
     *
     * @param noReboot By default this property is set to <code>false</code>, which means
     *         Amazon EC2 attempts to cleanly shut down the instance before image
     *         creation and reboots the instance afterwards. When set to true, Amazon
     *         EC2 will not shut down the instance before creating the image. When
     *         this option is used, file system integrity on the created image cannot
     *         be guaranteed.
     */
    public void setNoReboot(Boolean noReboot) {
        this.noReboot = noReboot;
    }
    
    /**
     * By default this property is set to <code>false</code>, which means
     * Amazon EC2 attempts to cleanly shut down the instance before image
     * creation and reboots the instance afterwards. When set to true, Amazon
     * EC2 will not shut down the instance before creating the image. When
     * this option is used, file system integrity on the created image cannot
     * be guaranteed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param noReboot By default this property is set to <code>false</code>, which means
     *         Amazon EC2 attempts to cleanly shut down the instance before image
     *         creation and reboots the instance afterwards. When set to true, Amazon
     *         EC2 will not shut down the instance before creating the image. When
     *         this option is used, file system integrity on the created image cannot
     *         be guaranteed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateImageRequest withNoReboot(Boolean noReboot) {
        this.noReboot = noReboot;
        return this;
    }

    /**
     * By default this property is set to <code>false</code>, which means
     * Amazon EC2 attempts to cleanly shut down the instance before image
     * creation and reboots the instance afterwards. When set to true, Amazon
     * EC2 will not shut down the instance before creating the image. When
     * this option is used, file system integrity on the created image cannot
     * be guaranteed.
     *
     * @return By default this property is set to <code>false</code>, which means
     *         Amazon EC2 attempts to cleanly shut down the instance before image
     *         creation and reboots the instance afterwards. When set to true, Amazon
     *         EC2 will not shut down the instance before creating the image. When
     *         this option is used, file system integrity on the created image cannot
     *         be guaranteed.
     */
    public Boolean getNoReboot() {
        return noReboot;
    }

    /**
     * Returns the value of the BlockDeviceMappings property for this object.
     *
     * @return The value of the BlockDeviceMappings property for this object.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * Sets the value of the BlockDeviceMappings property for this object.
     *
     * @param blockDeviceMappings The new value for the BlockDeviceMappings property for this object.
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
     * Sets the value of the BlockDeviceMappings property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings The new value for the BlockDeviceMappings property for this object.
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
     * Sets the value of the BlockDeviceMappings property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings The new value for the BlockDeviceMappings property for this object.
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
    