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
import com.amazonaws.services.ec2.model.transform.RegisterImageRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#registerImage(RegisterImageRequest) RegisterImage operation}.
 * <p>
 * The RegisterImage operation registers an AMI with Amazon EC2. Images must be registered before they can be launched. For more information, see
 * RunInstances.
 * </p>
 * <p>
 * Each AMI is associated with an unique ID which is provided by the Amazon EC2 service through the RegisterImage operation. During registration, Amazon
 * EC2 retrieves the specified image manifest from Amazon S3 and verifies that the image is owned by the user registering the image.
 * </p>
 * <p>
 * The image manifest is retrieved once and stored within the Amazon EC2. Any modifications to an image in Amazon S3 invalidates this registration. If
 * you make changes to an image, deregister the previous image and register the new image. For more information, see DeregisterImage.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#registerImage(RegisterImageRequest)
 */
public class RegisterImageRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<RegisterImageRequest> {

    /**
     * The full path to your AMI manifest in Amazon S3 storage.
     */
    private String imageLocation;

    /**
     * The name to give the new Amazon Machine Image. <p> Constraints: 3-128
     * alphanumeric characters, parenthesis (<code>()</code>), commas
     * (<code>,</code>), slashes (<code>/</code>), dashes (<code>-</code>),
     * or underscores(<code>_</code>)
     */
    private String name;

    /**
     * The description describing the new AMI.
     */
    private String description;

    /**
     * The architecture of the image. <p> Valid Values: <code>i386</code>,
     * <code>x86_64</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     */
    private String architecture;

    /**
     * The optional ID of a specific kernel to register with the new AMI.
     */
    private String kernelId;

    /**
     * The optional ID of a specific ramdisk to register with the new AMI.
     * <p> Some kernels require additional drivers at launch. Check the
     * kernel requirements for information on whether you need to specify a
     * RAM disk.
     */
    private String ramdiskId;

    /**
     * The root device name (e.g., <code>/dev/sda1</code>).
     */
    private String rootDeviceName;

    /**
     * The block device mappings for the new AMI, which specify how different
     * block devices (ex: EBS volumes and ephemeral drives) will be exposed
     * on instances launched from the new image.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappings;

    private String virtualizationType;

    private String sriovNetSupport;

    /**
     * Default constructor for a new RegisterImageRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RegisterImageRequest() {}
    
    /**
     * Constructs a new RegisterImageRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param imageLocation The full path to your AMI manifest in Amazon S3
     * storage.
     */
    public RegisterImageRequest(String imageLocation) {
        setImageLocation(imageLocation);
    }

    /**
     * The full path to your AMI manifest in Amazon S3 storage.
     *
     * @return The full path to your AMI manifest in Amazon S3 storage.
     */
    public String getImageLocation() {
        return imageLocation;
    }
    
    /**
     * The full path to your AMI manifest in Amazon S3 storage.
     *
     * @param imageLocation The full path to your AMI manifest in Amazon S3 storage.
     */
    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }
    
    /**
     * The full path to your AMI manifest in Amazon S3 storage.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageLocation The full path to your AMI manifest in Amazon S3 storage.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterImageRequest withImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
        return this;
    }

    /**
     * The name to give the new Amazon Machine Image. <p> Constraints: 3-128
     * alphanumeric characters, parenthesis (<code>()</code>), commas
     * (<code>,</code>), slashes (<code>/</code>), dashes (<code>-</code>),
     * or underscores(<code>_</code>)
     *
     * @return The name to give the new Amazon Machine Image. <p> Constraints: 3-128
     *         alphanumeric characters, parenthesis (<code>()</code>), commas
     *         (<code>,</code>), slashes (<code>/</code>), dashes (<code>-</code>),
     *         or underscores(<code>_</code>)
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name to give the new Amazon Machine Image. <p> Constraints: 3-128
     * alphanumeric characters, parenthesis (<code>()</code>), commas
     * (<code>,</code>), slashes (<code>/</code>), dashes (<code>-</code>),
     * or underscores(<code>_</code>)
     *
     * @param name The name to give the new Amazon Machine Image. <p> Constraints: 3-128
     *         alphanumeric characters, parenthesis (<code>()</code>), commas
     *         (<code>,</code>), slashes (<code>/</code>), dashes (<code>-</code>),
     *         or underscores(<code>_</code>)
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name to give the new Amazon Machine Image. <p> Constraints: 3-128
     * alphanumeric characters, parenthesis (<code>()</code>), commas
     * (<code>,</code>), slashes (<code>/</code>), dashes (<code>-</code>),
     * or underscores(<code>_</code>)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name to give the new Amazon Machine Image. <p> Constraints: 3-128
     *         alphanumeric characters, parenthesis (<code>()</code>), commas
     *         (<code>,</code>), slashes (<code>/</code>), dashes (<code>-</code>),
     *         or underscores(<code>_</code>)
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterImageRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The description describing the new AMI.
     *
     * @return The description describing the new AMI.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description describing the new AMI.
     *
     * @param description The description describing the new AMI.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description describing the new AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description describing the new AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterImageRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The architecture of the image. <p> Valid Values: <code>i386</code>,
     * <code>x86_64</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @return The architecture of the image. <p> Valid Values: <code>i386</code>,
     *         <code>x86_64</code>
     *
     * @see ArchitectureValues
     */
    public String getArchitecture() {
        return architecture;
    }
    
    /**
     * The architecture of the image. <p> Valid Values: <code>i386</code>,
     * <code>x86_64</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the image. <p> Valid Values: <code>i386</code>,
     *         <code>x86_64</code>
     *
     * @see ArchitectureValues
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }
    
    /**
     * The architecture of the image. <p> Valid Values: <code>i386</code>,
     * <code>x86_64</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the image. <p> Valid Values: <code>i386</code>,
     *         <code>x86_64</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ArchitectureValues
     */
    public RegisterImageRequest withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * The architecture of the image. <p> Valid Values: <code>i386</code>,
     * <code>x86_64</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the image. <p> Valid Values: <code>i386</code>,
     *         <code>x86_64</code>
     *
     * @see ArchitectureValues
     */
    public void setArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
    }
    
    /**
     * The architecture of the image. <p> Valid Values: <code>i386</code>,
     * <code>x86_64</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the image. <p> Valid Values: <code>i386</code>,
     *         <code>x86_64</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ArchitectureValues
     */
    public RegisterImageRequest withArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
        return this;
    }

    /**
     * The optional ID of a specific kernel to register with the new AMI.
     *
     * @return The optional ID of a specific kernel to register with the new AMI.
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * The optional ID of a specific kernel to register with the new AMI.
     *
     * @param kernelId The optional ID of a specific kernel to register with the new AMI.
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * The optional ID of a specific kernel to register with the new AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kernelId The optional ID of a specific kernel to register with the new AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterImageRequest withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * The optional ID of a specific ramdisk to register with the new AMI.
     * <p> Some kernels require additional drivers at launch. Check the
     * kernel requirements for information on whether you need to specify a
     * RAM disk.
     *
     * @return The optional ID of a specific ramdisk to register with the new AMI.
     *         <p> Some kernels require additional drivers at launch. Check the
     *         kernel requirements for information on whether you need to specify a
     *         RAM disk.
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * The optional ID of a specific ramdisk to register with the new AMI.
     * <p> Some kernels require additional drivers at launch. Check the
     * kernel requirements for information on whether you need to specify a
     * RAM disk.
     *
     * @param ramdiskId The optional ID of a specific ramdisk to register with the new AMI.
     *         <p> Some kernels require additional drivers at launch. Check the
     *         kernel requirements for information on whether you need to specify a
     *         RAM disk.
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * The optional ID of a specific ramdisk to register with the new AMI.
     * <p> Some kernels require additional drivers at launch. Check the
     * kernel requirements for information on whether you need to specify a
     * RAM disk.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ramdiskId The optional ID of a specific ramdisk to register with the new AMI.
     *         <p> Some kernels require additional drivers at launch. Check the
     *         kernel requirements for information on whether you need to specify a
     *         RAM disk.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterImageRequest withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * The root device name (e.g., <code>/dev/sda1</code>).
     *
     * @return The root device name (e.g., <code>/dev/sda1</code>).
     */
    public String getRootDeviceName() {
        return rootDeviceName;
    }
    
    /**
     * The root device name (e.g., <code>/dev/sda1</code>).
     *
     * @param rootDeviceName The root device name (e.g., <code>/dev/sda1</code>).
     */
    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }
    
    /**
     * The root device name (e.g., <code>/dev/sda1</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rootDeviceName The root device name (e.g., <code>/dev/sda1</code>).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterImageRequest withRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
        return this;
    }

    /**
     * The block device mappings for the new AMI, which specify how different
     * block devices (ex: EBS volumes and ephemeral drives) will be exposed
     * on instances launched from the new image.
     *
     * @return The block device mappings for the new AMI, which specify how different
     *         block devices (ex: EBS volumes and ephemeral drives) will be exposed
     *         on instances launched from the new image.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * The block device mappings for the new AMI, which specify how different
     * block devices (ex: EBS volumes and ephemeral drives) will be exposed
     * on instances launched from the new image.
     *
     * @param blockDeviceMappings The block device mappings for the new AMI, which specify how different
     *         block devices (ex: EBS volumes and ephemeral drives) will be exposed
     *         on instances launched from the new image.
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
     * The block device mappings for the new AMI, which specify how different
     * block devices (ex: EBS volumes and ephemeral drives) will be exposed
     * on instances launched from the new image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings The block device mappings for the new AMI, which specify how different
     *         block devices (ex: EBS volumes and ephemeral drives) will be exposed
     *         on instances launched from the new image.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterImageRequest withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings.length));
        for (BlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * The block device mappings for the new AMI, which specify how different
     * block devices (ex: EBS volumes and ephemeral drives) will be exposed
     * on instances launched from the new image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings The block device mappings for the new AMI, which specify how different
     *         block devices (ex: EBS volumes and ephemeral drives) will be exposed
     *         on instances launched from the new image.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterImageRequest withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
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
     * Returns the value of the VirtualizationType property for this object.
     *
     * @return The value of the VirtualizationType property for this object.
     */
    public String getVirtualizationType() {
        return virtualizationType;
    }
    
    /**
     * Sets the value of the VirtualizationType property for this object.
     *
     * @param virtualizationType The new value for the VirtualizationType property for this object.
     */
    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }
    
    /**
     * Sets the value of the VirtualizationType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualizationType The new value for the VirtualizationType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterImageRequest withVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
        return this;
    }

    /**
     * Returns the value of the SriovNetSupport property for this object.
     *
     * @return The value of the SriovNetSupport property for this object.
     */
    public String getSriovNetSupport() {
        return sriovNetSupport;
    }
    
    /**
     * Sets the value of the SriovNetSupport property for this object.
     *
     * @param sriovNetSupport The new value for the SriovNetSupport property for this object.
     */
    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }
    
    /**
     * Sets the value of the SriovNetSupport property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sriovNetSupport The new value for the SriovNetSupport property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterImageRequest withSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<RegisterImageRequest> getDryRunRequest() {
        Request<RegisterImageRequest> request = new RegisterImageRequestMarshaller().marshall(this);
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
        if (getImageLocation() != null) sb.append("ImageLocation: " + getImageLocation() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getArchitecture() != null) sb.append("Architecture: " + getArchitecture() + ",");
        if (getKernelId() != null) sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null) sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getRootDeviceName() != null) sb.append("RootDeviceName: " + getRootDeviceName() + ",");
        if (getBlockDeviceMappings() != null) sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getVirtualizationType() != null) sb.append("VirtualizationType: " + getVirtualizationType() + ",");
        if (getSriovNetSupport() != null) sb.append("SriovNetSupport: " + getSriovNetSupport() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImageLocation() == null) ? 0 : getImageLocation().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode()); 
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode()); 
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode()); 
        hashCode = prime * hashCode + ((getRootDeviceName() == null) ? 0 : getRootDeviceName().hashCode()); 
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode()); 
        hashCode = prime * hashCode + ((getVirtualizationType() == null) ? 0 : getVirtualizationType().hashCode()); 
        hashCode = prime * hashCode + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RegisterImageRequest == false) return false;
        RegisterImageRequest other = (RegisterImageRequest)obj;
        
        if (other.getImageLocation() == null ^ this.getImageLocation() == null) return false;
        if (other.getImageLocation() != null && other.getImageLocation().equals(this.getImageLocation()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getArchitecture() == null ^ this.getArchitecture() == null) return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false) return false; 
        if (other.getKernelId() == null ^ this.getKernelId() == null) return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false) return false; 
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null) return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false) return false; 
        if (other.getRootDeviceName() == null ^ this.getRootDeviceName() == null) return false;
        if (other.getRootDeviceName() != null && other.getRootDeviceName().equals(this.getRootDeviceName()) == false) return false; 
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null) return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false) return false; 
        if (other.getVirtualizationType() == null ^ this.getVirtualizationType() == null) return false;
        if (other.getVirtualizationType() != null && other.getVirtualizationType().equals(this.getVirtualizationType()) == false) return false; 
        if (other.getSriovNetSupport() == null ^ this.getSriovNetSupport() == null) return false;
        if (other.getSriovNetSupport() != null && other.getSriovNetSupport().equals(this.getSriovNetSupport()) == false) return false; 
        return true;
    }
    
}
    