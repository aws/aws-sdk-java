/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.RegisterImageRequestMarshaller;

/**
 * <p>
 * Contains the parameters for RegisterImage.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterImageRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<RegisterImageRequest> {

    /**
     * <p>
     * The full path to your AMI manifest in Amazon S3 storage.
     * </p>
     */
    private String imageLocation;
    /**
     * <p>
     * The architecture of the AMI.
     * </p>
     * <p>
     * Default: For Amazon EBS-backed AMIs, <code>i386</code>. For instance store-backed AMIs, the architecture
     * specified in the manifest file.
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * One or more block device mapping entries.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * A description for your AMI.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Set to <code>true</code> to enable enhanced networking with ENA for the AMI and any instances that you launch
     * from the AMI.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from
     * the AMI unreachable.
     * </p>
     */
    private Boolean enaSupport;
    /**
     * <p>
     * The ID of the kernel.
     * </p>
     */
    private String kernelId;
    /**
     * <p>
     * A name for your AMI.
     * </p>
     * <p>
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods (.),
     * slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
     * </p>
     */
    private String name;
    /**
     * <p>
     * The billing product codes. Your account must be authorized to specify billing product codes. Otherwise, you can
     * use the AWS Marketplace to bill for the use of an AMI.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> billingProducts;
    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     */
    private String ramdiskId;
    /**
     * <p>
     * The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * </p>
     */
    private String rootDeviceName;
    /**
     * <p>
     * Set to <code>simple</code> to enable enhanced networking with the Intel 82599 Virtual Function interface for the
     * AMI and any instances that you launch from the AMI.
     * </p>
     * <p>
     * There is no way to disable <code>sriovNetSupport</code> at this time.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from
     * the AMI unreachable.
     * </p>
     */
    private String sriovNetSupport;
    /**
     * <p>
     * The type of virtualization (<code>hvm</code> | <code>paravirtual</code>).
     * </p>
     * <p>
     * Default: <code>paravirtual</code>
     * </p>
     */
    private String virtualizationType;

    /**
     * Default constructor for RegisterImageRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public RegisterImageRequest() {
    }

    /**
     * Constructs a new RegisterImageRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param imageLocation
     *        The full path to your AMI manifest in Amazon S3 storage.
     */
    public RegisterImageRequest(String imageLocation) {
        setImageLocation(imageLocation);
    }

    /**
     * <p>
     * The full path to your AMI manifest in Amazon S3 storage.
     * </p>
     * 
     * @param imageLocation
     *        The full path to your AMI manifest in Amazon S3 storage.
     */

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    /**
     * <p>
     * The full path to your AMI manifest in Amazon S3 storage.
     * </p>
     * 
     * @return The full path to your AMI manifest in Amazon S3 storage.
     */

    public String getImageLocation() {
        return this.imageLocation;
    }

    /**
     * <p>
     * The full path to your AMI manifest in Amazon S3 storage.
     * </p>
     * 
     * @param imageLocation
     *        The full path to your AMI manifest in Amazon S3 storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterImageRequest withImageLocation(String imageLocation) {
        setImageLocation(imageLocation);
        return this;
    }

    /**
     * <p>
     * The architecture of the AMI.
     * </p>
     * <p>
     * Default: For Amazon EBS-backed AMIs, <code>i386</code>. For instance store-backed AMIs, the architecture
     * specified in the manifest file.
     * </p>
     * 
     * @param architecture
     *        The architecture of the AMI.</p>
     *        <p>
     *        Default: For Amazon EBS-backed AMIs, <code>i386</code>. For instance store-backed AMIs, the architecture
     *        specified in the manifest file.
     * @see ArchitectureValues
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture of the AMI.
     * </p>
     * <p>
     * Default: For Amazon EBS-backed AMIs, <code>i386</code>. For instance store-backed AMIs, the architecture
     * specified in the manifest file.
     * </p>
     * 
     * @return The architecture of the AMI.</p>
     *         <p>
     *         Default: For Amazon EBS-backed AMIs, <code>i386</code>. For instance store-backed AMIs, the architecture
     *         specified in the manifest file.
     * @see ArchitectureValues
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The architecture of the AMI.
     * </p>
     * <p>
     * Default: For Amazon EBS-backed AMIs, <code>i386</code>. For instance store-backed AMIs, the architecture
     * specified in the manifest file.
     * </p>
     * 
     * @param architecture
     *        The architecture of the AMI.</p>
     *        <p>
     *        Default: For Amazon EBS-backed AMIs, <code>i386</code>. For instance store-backed AMIs, the architecture
     *        specified in the manifest file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchitectureValues
     */

    public RegisterImageRequest withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The architecture of the AMI.
     * </p>
     * <p>
     * Default: For Amazon EBS-backed AMIs, <code>i386</code>. For instance store-backed AMIs, the architecture
     * specified in the manifest file.
     * </p>
     * 
     * @param architecture
     *        The architecture of the AMI.</p>
     *        <p>
     *        Default: For Amazon EBS-backed AMIs, <code>i386</code>. For instance store-backed AMIs, the architecture
     *        specified in the manifest file.
     * @see ArchitectureValues
     */

    public void setArchitecture(ArchitectureValues architecture) {
        withArchitecture(architecture);
    }

    /**
     * <p>
     * The architecture of the AMI.
     * </p>
     * <p>
     * Default: For Amazon EBS-backed AMIs, <code>i386</code>. For instance store-backed AMIs, the architecture
     * specified in the manifest file.
     * </p>
     * 
     * @param architecture
     *        The architecture of the AMI.</p>
     *        <p>
     *        Default: For Amazon EBS-backed AMIs, <code>i386</code>. For instance store-backed AMIs, the architecture
     *        specified in the manifest file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchitectureValues
     */

    public RegisterImageRequest withArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
        return this;
    }

    /**
     * <p>
     * One or more block device mapping entries.
     * </p>
     * 
     * @return One or more block device mapping entries.
     */

    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * One or more block device mapping entries.
     * </p>
     * 
     * @param blockDeviceMappings
     *        One or more block device mapping entries.
     */

    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>(blockDeviceMappings);
    }

    /**
     * <p>
     * One or more block device mapping entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        One or more block device mapping entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterImageRequest withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (this.blockDeviceMappings == null) {
            setBlockDeviceMappings(new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>(blockDeviceMappings.length));
        }
        for (BlockDeviceMapping ele : blockDeviceMappings) {
            this.blockDeviceMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more block device mapping entries.
     * </p>
     * 
     * @param blockDeviceMappings
     *        One or more block device mapping entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterImageRequest withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * A description for your AMI.
     * </p>
     * 
     * @param description
     *        A description for your AMI.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for your AMI.
     * </p>
     * 
     * @return A description for your AMI.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for your AMI.
     * </p>
     * 
     * @param description
     *        A description for your AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterImageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable enhanced networking with ENA for the AMI and any instances that you launch
     * from the AMI.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from
     * the AMI unreachable.
     * </p>
     * 
     * @param enaSupport
     *        Set to <code>true</code> to enable enhanced networking with ENA for the AMI and any instances that you
     *        launch from the AMI.</p>
     *        <p>
     *        This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances
     *        launched from the AMI unreachable.
     */

    public void setEnaSupport(Boolean enaSupport) {
        this.enaSupport = enaSupport;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable enhanced networking with ENA for the AMI and any instances that you launch
     * from the AMI.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from
     * the AMI unreachable.
     * </p>
     * 
     * @return Set to <code>true</code> to enable enhanced networking with ENA for the AMI and any instances that you
     *         launch from the AMI.</p>
     *         <p>
     *         This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances
     *         launched from the AMI unreachable.
     */

    public Boolean getEnaSupport() {
        return this.enaSupport;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable enhanced networking with ENA for the AMI and any instances that you launch
     * from the AMI.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from
     * the AMI unreachable.
     * </p>
     * 
     * @param enaSupport
     *        Set to <code>true</code> to enable enhanced networking with ENA for the AMI and any instances that you
     *        launch from the AMI.</p>
     *        <p>
     *        This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances
     *        launched from the AMI unreachable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterImageRequest withEnaSupport(Boolean enaSupport) {
        setEnaSupport(enaSupport);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable enhanced networking with ENA for the AMI and any instances that you launch
     * from the AMI.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from
     * the AMI unreachable.
     * </p>
     * 
     * @return Set to <code>true</code> to enable enhanced networking with ENA for the AMI and any instances that you
     *         launch from the AMI.</p>
     *         <p>
     *         This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances
     *         launched from the AMI unreachable.
     */

    public Boolean isEnaSupport() {
        return this.enaSupport;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * 
     * @param kernelId
     *        The ID of the kernel.
     */

    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * 
     * @return The ID of the kernel.
     */

    public String getKernelId() {
        return this.kernelId;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * 
     * @param kernelId
     *        The ID of the kernel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterImageRequest withKernelId(String kernelId) {
        setKernelId(kernelId);
        return this;
    }

    /**
     * <p>
     * A name for your AMI.
     * </p>
     * <p>
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods (.),
     * slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
     * </p>
     * 
     * @param name
     *        A name for your AMI.</p>
     *        <p>
     *        Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods
     *        (.), slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for your AMI.
     * </p>
     * <p>
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods (.),
     * slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
     * </p>
     * 
     * @return A name for your AMI.</p>
     *         <p>
     *         Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods
     *         (.), slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for your AMI.
     * </p>
     * <p>
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods (.),
     * slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
     * </p>
     * 
     * @param name
     *        A name for your AMI.</p>
     *        <p>
     *        Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods
     *        (.), slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterImageRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The billing product codes. Your account must be authorized to specify billing product codes. Otherwise, you can
     * use the AWS Marketplace to bill for the use of an AMI.
     * </p>
     * 
     * @return The billing product codes. Your account must be authorized to specify billing product codes. Otherwise,
     *         you can use the AWS Marketplace to bill for the use of an AMI.
     */

    public java.util.List<String> getBillingProducts() {
        if (billingProducts == null) {
            billingProducts = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return billingProducts;
    }

    /**
     * <p>
     * The billing product codes. Your account must be authorized to specify billing product codes. Otherwise, you can
     * use the AWS Marketplace to bill for the use of an AMI.
     * </p>
     * 
     * @param billingProducts
     *        The billing product codes. Your account must be authorized to specify billing product codes. Otherwise,
     *        you can use the AWS Marketplace to bill for the use of an AMI.
     */

    public void setBillingProducts(java.util.Collection<String> billingProducts) {
        if (billingProducts == null) {
            this.billingProducts = null;
            return;
        }

        this.billingProducts = new com.amazonaws.internal.SdkInternalList<String>(billingProducts);
    }

    /**
     * <p>
     * The billing product codes. Your account must be authorized to specify billing product codes. Otherwise, you can
     * use the AWS Marketplace to bill for the use of an AMI.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBillingProducts(java.util.Collection)} or {@link #withBillingProducts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param billingProducts
     *        The billing product codes. Your account must be authorized to specify billing product codes. Otherwise,
     *        you can use the AWS Marketplace to bill for the use of an AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterImageRequest withBillingProducts(String... billingProducts) {
        if (this.billingProducts == null) {
            setBillingProducts(new com.amazonaws.internal.SdkInternalList<String>(billingProducts.length));
        }
        for (String ele : billingProducts) {
            this.billingProducts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The billing product codes. Your account must be authorized to specify billing product codes. Otherwise, you can
     * use the AWS Marketplace to bill for the use of an AMI.
     * </p>
     * 
     * @param billingProducts
     *        The billing product codes. Your account must be authorized to specify billing product codes. Otherwise,
     *        you can use the AWS Marketplace to bill for the use of an AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterImageRequest withBillingProducts(java.util.Collection<String> billingProducts) {
        setBillingProducts(billingProducts);
        return this;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * 
     * @param ramdiskId
     *        The ID of the RAM disk.
     */

    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * 
     * @return The ID of the RAM disk.
     */

    public String getRamdiskId() {
        return this.ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * 
     * @param ramdiskId
     *        The ID of the RAM disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterImageRequest withRamdiskId(String ramdiskId) {
        setRamdiskId(ramdiskId);
        return this;
    }

    /**
     * <p>
     * The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * </p>
     * 
     * @param rootDeviceName
     *        The device name of the root device volume (for example, <code>/dev/sda1</code>).
     */

    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }

    /**
     * <p>
     * The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * </p>
     * 
     * @return The device name of the root device volume (for example, <code>/dev/sda1</code>).
     */

    public String getRootDeviceName() {
        return this.rootDeviceName;
    }

    /**
     * <p>
     * The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * </p>
     * 
     * @param rootDeviceName
     *        The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterImageRequest withRootDeviceName(String rootDeviceName) {
        setRootDeviceName(rootDeviceName);
        return this;
    }

    /**
     * <p>
     * Set to <code>simple</code> to enable enhanced networking with the Intel 82599 Virtual Function interface for the
     * AMI and any instances that you launch from the AMI.
     * </p>
     * <p>
     * There is no way to disable <code>sriovNetSupport</code> at this time.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from
     * the AMI unreachable.
     * </p>
     * 
     * @param sriovNetSupport
     *        Set to <code>simple</code> to enable enhanced networking with the Intel 82599 Virtual Function interface
     *        for the AMI and any instances that you launch from the AMI.</p>
     *        <p>
     *        There is no way to disable <code>sriovNetSupport</code> at this time.
     *        </p>
     *        <p>
     *        This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances
     *        launched from the AMI unreachable.
     */

    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }

    /**
     * <p>
     * Set to <code>simple</code> to enable enhanced networking with the Intel 82599 Virtual Function interface for the
     * AMI and any instances that you launch from the AMI.
     * </p>
     * <p>
     * There is no way to disable <code>sriovNetSupport</code> at this time.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from
     * the AMI unreachable.
     * </p>
     * 
     * @return Set to <code>simple</code> to enable enhanced networking with the Intel 82599 Virtual Function interface
     *         for the AMI and any instances that you launch from the AMI.</p>
     *         <p>
     *         There is no way to disable <code>sriovNetSupport</code> at this time.
     *         </p>
     *         <p>
     *         This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances
     *         launched from the AMI unreachable.
     */

    public String getSriovNetSupport() {
        return this.sriovNetSupport;
    }

    /**
     * <p>
     * Set to <code>simple</code> to enable enhanced networking with the Intel 82599 Virtual Function interface for the
     * AMI and any instances that you launch from the AMI.
     * </p>
     * <p>
     * There is no way to disable <code>sriovNetSupport</code> at this time.
     * </p>
     * <p>
     * This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from
     * the AMI unreachable.
     * </p>
     * 
     * @param sriovNetSupport
     *        Set to <code>simple</code> to enable enhanced networking with the Intel 82599 Virtual Function interface
     *        for the AMI and any instances that you launch from the AMI.</p>
     *        <p>
     *        There is no way to disable <code>sriovNetSupport</code> at this time.
     *        </p>
     *        <p>
     *        This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances
     *        launched from the AMI unreachable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterImageRequest withSriovNetSupport(String sriovNetSupport) {
        setSriovNetSupport(sriovNetSupport);
        return this;
    }

    /**
     * <p>
     * The type of virtualization (<code>hvm</code> | <code>paravirtual</code>).
     * </p>
     * <p>
     * Default: <code>paravirtual</code>
     * </p>
     * 
     * @param virtualizationType
     *        The type of virtualization (<code>hvm</code> | <code>paravirtual</code>).</p>
     *        <p>
     *        Default: <code>paravirtual</code>
     */

    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    /**
     * <p>
     * The type of virtualization (<code>hvm</code> | <code>paravirtual</code>).
     * </p>
     * <p>
     * Default: <code>paravirtual</code>
     * </p>
     * 
     * @return The type of virtualization (<code>hvm</code> | <code>paravirtual</code>).</p>
     *         <p>
     *         Default: <code>paravirtual</code>
     */

    public String getVirtualizationType() {
        return this.virtualizationType;
    }

    /**
     * <p>
     * The type of virtualization (<code>hvm</code> | <code>paravirtual</code>).
     * </p>
     * <p>
     * Default: <code>paravirtual</code>
     * </p>
     * 
     * @param virtualizationType
     *        The type of virtualization (<code>hvm</code> | <code>paravirtual</code>).</p>
     *        <p>
     *        Default: <code>paravirtual</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterImageRequest withVirtualizationType(String virtualizationType) {
        setVirtualizationType(virtualizationType);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<RegisterImageRequest> getDryRunRequest() {
        Request<RegisterImageRequest> request = new RegisterImageRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImageLocation() != null)
            sb.append("ImageLocation: ").append(getImageLocation()).append(",");
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: ").append(getBlockDeviceMappings()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEnaSupport() != null)
            sb.append("EnaSupport: ").append(getEnaSupport()).append(",");
        if (getKernelId() != null)
            sb.append("KernelId: ").append(getKernelId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getBillingProducts() != null)
            sb.append("BillingProducts: ").append(getBillingProducts()).append(",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: ").append(getRamdiskId()).append(",");
        if (getRootDeviceName() != null)
            sb.append("RootDeviceName: ").append(getRootDeviceName()).append(",");
        if (getSriovNetSupport() != null)
            sb.append("SriovNetSupport: ").append(getSriovNetSupport()).append(",");
        if (getVirtualizationType() != null)
            sb.append("VirtualizationType: ").append(getVirtualizationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterImageRequest == false)
            return false;
        RegisterImageRequest other = (RegisterImageRequest) obj;
        if (other.getImageLocation() == null ^ this.getImageLocation() == null)
            return false;
        if (other.getImageLocation() != null && other.getImageLocation().equals(this.getImageLocation()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnaSupport() == null ^ this.getEnaSupport() == null)
            return false;
        if (other.getEnaSupport() != null && other.getEnaSupport().equals(this.getEnaSupport()) == false)
            return false;
        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getBillingProducts() == null ^ this.getBillingProducts() == null)
            return false;
        if (other.getBillingProducts() != null && other.getBillingProducts().equals(this.getBillingProducts()) == false)
            return false;
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null)
            return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false)
            return false;
        if (other.getRootDeviceName() == null ^ this.getRootDeviceName() == null)
            return false;
        if (other.getRootDeviceName() != null && other.getRootDeviceName().equals(this.getRootDeviceName()) == false)
            return false;
        if (other.getSriovNetSupport() == null ^ this.getSriovNetSupport() == null)
            return false;
        if (other.getSriovNetSupport() != null && other.getSriovNetSupport().equals(this.getSriovNetSupport()) == false)
            return false;
        if (other.getVirtualizationType() == null ^ this.getVirtualizationType() == null)
            return false;
        if (other.getVirtualizationType() != null && other.getVirtualizationType().equals(this.getVirtualizationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageLocation() == null) ? 0 : getImageLocation().hashCode());
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnaSupport() == null) ? 0 : getEnaSupport().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getBillingProducts() == null) ? 0 : getBillingProducts().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode + ((getRootDeviceName() == null) ? 0 : getRootDeviceName().hashCode());
        hashCode = prime * hashCode + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport().hashCode());
        hashCode = prime * hashCode + ((getVirtualizationType() == null) ? 0 : getVirtualizationType().hashCode());
        return hashCode;
    }

    @Override
    public RegisterImageRequest clone() {
        return (RegisterImageRequest) super.clone();
    }
}
