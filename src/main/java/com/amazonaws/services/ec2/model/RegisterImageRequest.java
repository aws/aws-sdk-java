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
import com.amazonaws.services.ec2.model.transform.RegisterImageRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#registerImage(RegisterImageRequest) RegisterImage operation}.
 * <p>
 * Registers an AMI. When you're creating an AMI, this is the final step
 * you must complete before you can launch an instance from the AMI. For
 * more information about creating AMIs, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami.html"> Creating Your Own AMIs </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 * <p>
 * <b>NOTE:</b> For Amazon EBS-backed instances, CreateImage creates and
 * registers the AMI in a single request, so you don't have to register
 * the AMI yourself.
 * </p>
 * <p>
 * You can also use <code>RegisterImage</code> to create an Amazon
 * EBS-backed AMI from a snapshot of a root device volume. For more
 * information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_LaunchingInstanceFromSnapshot.html"> Launching an Instance from a Snapshot </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 * <p>
 * If needed, you can deregister an AMI at any time. Any modifications
 * you make to an AMI backed by an instance store volume invalidates its
 * registration. If you make changes to an image, deregister the previous
 * image and register the new image.
 * </p>
 * <p>
 * <b>NOTE:</b> You can't register an image where a secondary (non-root)
 * snapshot has AWS Marketplace product codes.
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
     * A name for your AMI. <p>Constraints: 3-128 alphanumeric characters,
     * parenthesis (()), commas (,), slashes (/), dashes (-), or underscores
     * (_)
     */
    private String name;

    /**
     * A description for your AMI.
     */
    private String description;

    /**
     * The architecture of the AMI. <p>Default: For Amazon EBS-backed AMIs,
     * <code>i386</code>. For instance store-backed AMIs, the architecture
     * specified in the manifest file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     */
    private String architecture;

    /**
     * The ID of the kernel.
     */
    private String kernelId;

    /**
     * The ID of the RAM disk.
     */
    private String ramdiskId;

    /**
     * The name of the root device (for example, <code>/dev/sda1</code>, or
     * <code>xvda</code>).
     */
    private String rootDeviceName;

    /**
     * One or more block device mapping entries.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappings;

    /**
     * The type of virtualization. <p>Default: <code>paravirtual</code>
     */
    private String virtualizationType;

    /**
     * Set to <code>simple</code> to enable enhanced networking for the AMI
     * and any instances that you launch from the AMI. <p>There is no way to
     * disable enhanced networking at this time. <p>This option is supported
     * only for HVM AMIs. Specifying this option with a PV AMI can make
     * instances launched from the AMI unreachable.
     */
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
     * A name for your AMI. <p>Constraints: 3-128 alphanumeric characters,
     * parenthesis (()), commas (,), slashes (/), dashes (-), or underscores
     * (_)
     *
     * @return A name for your AMI. <p>Constraints: 3-128 alphanumeric characters,
     *         parenthesis (()), commas (,), slashes (/), dashes (-), or underscores
     *         (_)
     */
    public String getName() {
        return name;
    }
    
    /**
     * A name for your AMI. <p>Constraints: 3-128 alphanumeric characters,
     * parenthesis (()), commas (,), slashes (/), dashes (-), or underscores
     * (_)
     *
     * @param name A name for your AMI. <p>Constraints: 3-128 alphanumeric characters,
     *         parenthesis (()), commas (,), slashes (/), dashes (-), or underscores
     *         (_)
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * A name for your AMI. <p>Constraints: 3-128 alphanumeric characters,
     * parenthesis (()), commas (,), slashes (/), dashes (-), or underscores
     * (_)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name A name for your AMI. <p>Constraints: 3-128 alphanumeric characters,
     *         parenthesis (()), commas (,), slashes (/), dashes (-), or underscores
     *         (_)
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterImageRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A description for your AMI.
     *
     * @return A description for your AMI.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description for your AMI.
     *
     * @param description A description for your AMI.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description for your AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description for your AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterImageRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The architecture of the AMI. <p>Default: For Amazon EBS-backed AMIs,
     * <code>i386</code>. For instance store-backed AMIs, the architecture
     * specified in the manifest file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @return The architecture of the AMI. <p>Default: For Amazon EBS-backed AMIs,
     *         <code>i386</code>. For instance store-backed AMIs, the architecture
     *         specified in the manifest file.
     *
     * @see ArchitectureValues
     */
    public String getArchitecture() {
        return architecture;
    }
    
    /**
     * The architecture of the AMI. <p>Default: For Amazon EBS-backed AMIs,
     * <code>i386</code>. For instance store-backed AMIs, the architecture
     * specified in the manifest file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the AMI. <p>Default: For Amazon EBS-backed AMIs,
     *         <code>i386</code>. For instance store-backed AMIs, the architecture
     *         specified in the manifest file.
     *
     * @see ArchitectureValues
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }
    
    /**
     * The architecture of the AMI. <p>Default: For Amazon EBS-backed AMIs,
     * <code>i386</code>. For instance store-backed AMIs, the architecture
     * specified in the manifest file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the AMI. <p>Default: For Amazon EBS-backed AMIs,
     *         <code>i386</code>. For instance store-backed AMIs, the architecture
     *         specified in the manifest file.
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
     * The architecture of the AMI. <p>Default: For Amazon EBS-backed AMIs,
     * <code>i386</code>. For instance store-backed AMIs, the architecture
     * specified in the manifest file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the AMI. <p>Default: For Amazon EBS-backed AMIs,
     *         <code>i386</code>. For instance store-backed AMIs, the architecture
     *         specified in the manifest file.
     *
     * @see ArchitectureValues
     */
    public void setArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
    }
    
    /**
     * The architecture of the AMI. <p>Default: For Amazon EBS-backed AMIs,
     * <code>i386</code>. For instance store-backed AMIs, the architecture
     * specified in the manifest file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the AMI. <p>Default: For Amazon EBS-backed AMIs,
     *         <code>i386</code>. For instance store-backed AMIs, the architecture
     *         specified in the manifest file.
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
     * The ID of the kernel.
     *
     * @return The ID of the kernel.
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * The ID of the kernel.
     *
     * @param kernelId The ID of the kernel.
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * The ID of the kernel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kernelId The ID of the kernel.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterImageRequest withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * The ID of the RAM disk.
     *
     * @return The ID of the RAM disk.
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * The ID of the RAM disk.
     *
     * @param ramdiskId The ID of the RAM disk.
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * The ID of the RAM disk.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ramdiskId The ID of the RAM disk.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterImageRequest withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * The name of the root device (for example, <code>/dev/sda1</code>, or
     * <code>xvda</code>).
     *
     * @return The name of the root device (for example, <code>/dev/sda1</code>, or
     *         <code>xvda</code>).
     */
    public String getRootDeviceName() {
        return rootDeviceName;
    }
    
    /**
     * The name of the root device (for example, <code>/dev/sda1</code>, or
     * <code>xvda</code>).
     *
     * @param rootDeviceName The name of the root device (for example, <code>/dev/sda1</code>, or
     *         <code>xvda</code>).
     */
    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }
    
    /**
     * The name of the root device (for example, <code>/dev/sda1</code>, or
     * <code>xvda</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rootDeviceName The name of the root device (for example, <code>/dev/sda1</code>, or
     *         <code>xvda</code>).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterImageRequest withRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
        return this;
    }

    /**
     * One or more block device mapping entries.
     *
     * @return One or more block device mapping entries.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * One or more block device mapping entries.
     *
     * @param blockDeviceMappings One or more block device mapping entries.
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
     * One or more block device mapping entries.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings One or more block device mapping entries.
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
     * One or more block device mapping entries.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings One or more block device mapping entries.
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
     * The type of virtualization. <p>Default: <code>paravirtual</code>
     *
     * @return The type of virtualization. <p>Default: <code>paravirtual</code>
     */
    public String getVirtualizationType() {
        return virtualizationType;
    }
    
    /**
     * The type of virtualization. <p>Default: <code>paravirtual</code>
     *
     * @param virtualizationType The type of virtualization. <p>Default: <code>paravirtual</code>
     */
    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }
    
    /**
     * The type of virtualization. <p>Default: <code>paravirtual</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualizationType The type of virtualization. <p>Default: <code>paravirtual</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterImageRequest withVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
        return this;
    }

    /**
     * Set to <code>simple</code> to enable enhanced networking for the AMI
     * and any instances that you launch from the AMI. <p>There is no way to
     * disable enhanced networking at this time. <p>This option is supported
     * only for HVM AMIs. Specifying this option with a PV AMI can make
     * instances launched from the AMI unreachable.
     *
     * @return Set to <code>simple</code> to enable enhanced networking for the AMI
     *         and any instances that you launch from the AMI. <p>There is no way to
     *         disable enhanced networking at this time. <p>This option is supported
     *         only for HVM AMIs. Specifying this option with a PV AMI can make
     *         instances launched from the AMI unreachable.
     */
    public String getSriovNetSupport() {
        return sriovNetSupport;
    }
    
    /**
     * Set to <code>simple</code> to enable enhanced networking for the AMI
     * and any instances that you launch from the AMI. <p>There is no way to
     * disable enhanced networking at this time. <p>This option is supported
     * only for HVM AMIs. Specifying this option with a PV AMI can make
     * instances launched from the AMI unreachable.
     *
     * @param sriovNetSupport Set to <code>simple</code> to enable enhanced networking for the AMI
     *         and any instances that you launch from the AMI. <p>There is no way to
     *         disable enhanced networking at this time. <p>This option is supported
     *         only for HVM AMIs. Specifying this option with a PV AMI can make
     *         instances launched from the AMI unreachable.
     */
    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }
    
    /**
     * Set to <code>simple</code> to enable enhanced networking for the AMI
     * and any instances that you launch from the AMI. <p>There is no way to
     * disable enhanced networking at this time. <p>This option is supported
     * only for HVM AMIs. Specifying this option with a PV AMI can make
     * instances launched from the AMI unreachable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sriovNetSupport Set to <code>simple</code> to enable enhanced networking for the AMI
     *         and any instances that you launch from the AMI. <p>There is no way to
     *         disable enhanced networking at this time. <p>This option is supported
     *         only for HVM AMIs. Specifying this option with a PV AMI can make
     *         instances launched from the AMI unreachable.
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
    