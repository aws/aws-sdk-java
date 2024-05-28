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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an image attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImageAttribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageAttribute implements Serializable, Cloneable {

    /**
     * <p>
     * The block device mapping entries.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * The ID of the AMI.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The launch permissions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchPermission> launchPermissions;
    /**
     * <p>
     * The product codes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProductCode> productCodes;
    /**
     * <p>
     * A description for the AMI.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The kernel ID.
     * </p>
     */
    private String kernelId;
    /**
     * <p>
     * The RAM disk ID.
     * </p>
     */
    private String ramdiskId;
    /**
     * <p>
     * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     * </p>
     */
    private String sriovNetSupport;
    /**
     * <p>
     * The boot mode.
     * </p>
     */
    private String bootMode;
    /**
     * <p>
     * If the image is configured for NitroTPM support, the value is <code>v2.0</code>.
     * </p>
     */
    private String tpmSupport;
    /**
     * <p>
     * Base64 representation of the non-volatile UEFI variable store. To retrieve the UEFI data, use the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceUefiData">GetInstanceUefiData</a>
     * command. You can inspect and modify the UEFI data by using the <a
     * href="https://github.com/awslabs/python-uefivars">python-uefivars tool</a> on GitHub. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/uefi-secure-boot.html">UEFI Secure Boot</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     */
    private String uefiData;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the AMI was
     * last used to launch an EC2 instance. When the AMI is used to launch an instance, there is a 24-hour delay before
     * that usage is reported.
     * </p>
     * <note>
     * <p>
     * <code>lastLaunchedTime</code> data is available starting April 2017.
     * </p>
     * </note>
     */
    private String lastLaunchedTime;
    /**
     * <p>
     * If <code>v2.0</code>, it indicates that IMDSv2 is specified in the AMI. Instances launched from this AMI will
     * have <code>HttpTokens</code> automatically set to <code>required</code> so that, by default, the instance
     * requires that IMDSv2 is used when requesting instance metadata. In addition, <code>HttpPutResponseHopLimit</code>
     * is set to <code>2</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-IMDS-new-instances.html#configure-IMDS-new-instances-ami-configuration"
     * >Configure the AMI</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     */
    private String imdsSupport;
    /**
     * <p>
     * Indicates whether deregistration protection is enabled for the AMI.
     * </p>
     */
    private String deregistrationProtection;

    /**
     * <p>
     * The block device mapping entries.
     * </p>
     * 
     * @return The block device mapping entries.
     */

    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * The block device mapping entries.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mapping entries.
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
     * The block device mapping entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mapping entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
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
     * The block device mapping entries.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mapping entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @return The ID of the AMI.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The launch permissions.
     * </p>
     * 
     * @return The launch permissions.
     */

    public java.util.List<LaunchPermission> getLaunchPermissions() {
        if (launchPermissions == null) {
            launchPermissions = new com.amazonaws.internal.SdkInternalList<LaunchPermission>();
        }
        return launchPermissions;
    }

    /**
     * <p>
     * The launch permissions.
     * </p>
     * 
     * @param launchPermissions
     *        The launch permissions.
     */

    public void setLaunchPermissions(java.util.Collection<LaunchPermission> launchPermissions) {
        if (launchPermissions == null) {
            this.launchPermissions = null;
            return;
        }

        this.launchPermissions = new com.amazonaws.internal.SdkInternalList<LaunchPermission>(launchPermissions);
    }

    /**
     * <p>
     * The launch permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunchPermissions(java.util.Collection)} or {@link #withLaunchPermissions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param launchPermissions
     *        The launch permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withLaunchPermissions(LaunchPermission... launchPermissions) {
        if (this.launchPermissions == null) {
            setLaunchPermissions(new com.amazonaws.internal.SdkInternalList<LaunchPermission>(launchPermissions.length));
        }
        for (LaunchPermission ele : launchPermissions) {
            this.launchPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The launch permissions.
     * </p>
     * 
     * @param launchPermissions
     *        The launch permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withLaunchPermissions(java.util.Collection<LaunchPermission> launchPermissions) {
        setLaunchPermissions(launchPermissions);
        return this;
    }

    /**
     * <p>
     * The product codes.
     * </p>
     * 
     * @return The product codes.
     */

    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
            productCodes = new com.amazonaws.internal.SdkInternalList<ProductCode>();
        }
        return productCodes;
    }

    /**
     * <p>
     * The product codes.
     * </p>
     * 
     * @param productCodes
     *        The product codes.
     */

    public void setProductCodes(java.util.Collection<ProductCode> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
            return;
        }

        this.productCodes = new com.amazonaws.internal.SdkInternalList<ProductCode>(productCodes);
    }

    /**
     * <p>
     * The product codes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductCodes(java.util.Collection)} or {@link #withProductCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param productCodes
     *        The product codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withProductCodes(ProductCode... productCodes) {
        if (this.productCodes == null) {
            setProductCodes(new com.amazonaws.internal.SdkInternalList<ProductCode>(productCodes.length));
        }
        for (ProductCode ele : productCodes) {
            this.productCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The product codes.
     * </p>
     * 
     * @param productCodes
     *        The product codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withProductCodes(java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * A description for the AMI.
     * </p>
     * 
     * @param description
     *        A description for the AMI.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the AMI.
     * </p>
     * 
     * @return A description for the AMI.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the AMI.
     * </p>
     * 
     * @param description
     *        A description for the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The kernel ID.
     * </p>
     * 
     * @param kernelId
     *        The kernel ID.
     */

    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The kernel ID.
     * </p>
     * 
     * @return The kernel ID.
     */

    public String getKernelId() {
        return this.kernelId;
    }

    /**
     * <p>
     * The kernel ID.
     * </p>
     * 
     * @param kernelId
     *        The kernel ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withKernelId(String kernelId) {
        setKernelId(kernelId);
        return this;
    }

    /**
     * <p>
     * The RAM disk ID.
     * </p>
     * 
     * @param ramdiskId
     *        The RAM disk ID.
     */

    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The RAM disk ID.
     * </p>
     * 
     * @return The RAM disk ID.
     */

    public String getRamdiskId() {
        return this.ramdiskId;
    }

    /**
     * <p>
     * The RAM disk ID.
     * </p>
     * 
     * @param ramdiskId
     *        The RAM disk ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withRamdiskId(String ramdiskId) {
        setRamdiskId(ramdiskId);
        return this;
    }

    /**
     * <p>
     * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     * </p>
     * 
     * @param sriovNetSupport
     *        Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     */

    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }

    /**
     * <p>
     * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     * </p>
     * 
     * @return Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     */

    public String getSriovNetSupport() {
        return this.sriovNetSupport;
    }

    /**
     * <p>
     * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     * </p>
     * 
     * @param sriovNetSupport
     *        Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withSriovNetSupport(String sriovNetSupport) {
        setSriovNetSupport(sriovNetSupport);
        return this;
    }

    /**
     * <p>
     * The boot mode.
     * </p>
     * 
     * @param bootMode
     *        The boot mode.
     */

    public void setBootMode(String bootMode) {
        this.bootMode = bootMode;
    }

    /**
     * <p>
     * The boot mode.
     * </p>
     * 
     * @return The boot mode.
     */

    public String getBootMode() {
        return this.bootMode;
    }

    /**
     * <p>
     * The boot mode.
     * </p>
     * 
     * @param bootMode
     *        The boot mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withBootMode(String bootMode) {
        setBootMode(bootMode);
        return this;
    }

    /**
     * <p>
     * If the image is configured for NitroTPM support, the value is <code>v2.0</code>.
     * </p>
     * 
     * @param tpmSupport
     *        If the image is configured for NitroTPM support, the value is <code>v2.0</code>.
     */

    public void setTpmSupport(String tpmSupport) {
        this.tpmSupport = tpmSupport;
    }

    /**
     * <p>
     * If the image is configured for NitroTPM support, the value is <code>v2.0</code>.
     * </p>
     * 
     * @return If the image is configured for NitroTPM support, the value is <code>v2.0</code>.
     */

    public String getTpmSupport() {
        return this.tpmSupport;
    }

    /**
     * <p>
     * If the image is configured for NitroTPM support, the value is <code>v2.0</code>.
     * </p>
     * 
     * @param tpmSupport
     *        If the image is configured for NitroTPM support, the value is <code>v2.0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withTpmSupport(String tpmSupport) {
        setTpmSupport(tpmSupport);
        return this;
    }

    /**
     * <p>
     * Base64 representation of the non-volatile UEFI variable store. To retrieve the UEFI data, use the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceUefiData">GetInstanceUefiData</a>
     * command. You can inspect and modify the UEFI data by using the <a
     * href="https://github.com/awslabs/python-uefivars">python-uefivars tool</a> on GitHub. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/uefi-secure-boot.html">UEFI Secure Boot</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param uefiData
     *        Base64 representation of the non-volatile UEFI variable store. To retrieve the UEFI data, use the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceUefiData"
     *        >GetInstanceUefiData</a> command. You can inspect and modify the UEFI data by using the <a
     *        href="https://github.com/awslabs/python-uefivars">python-uefivars tool</a> on GitHub. For more
     *        information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/uefi-secure-boot.html">UEFI
     *        Secure Boot</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public void setUefiData(String uefiData) {
        this.uefiData = uefiData;
    }

    /**
     * <p>
     * Base64 representation of the non-volatile UEFI variable store. To retrieve the UEFI data, use the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceUefiData">GetInstanceUefiData</a>
     * command. You can inspect and modify the UEFI data by using the <a
     * href="https://github.com/awslabs/python-uefivars">python-uefivars tool</a> on GitHub. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/uefi-secure-boot.html">UEFI Secure Boot</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @return Base64 representation of the non-volatile UEFI variable store. To retrieve the UEFI data, use the <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceUefiData">GetInstanceUefiData</a>
     *         command. You can inspect and modify the UEFI data by using the <a
     *         href="https://github.com/awslabs/python-uefivars">python-uefivars tool</a> on GitHub. For more
     *         information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/uefi-secure-boot.html">UEFI
     *         Secure Boot</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public String getUefiData() {
        return this.uefiData;
    }

    /**
     * <p>
     * Base64 representation of the non-volatile UEFI variable store. To retrieve the UEFI data, use the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceUefiData">GetInstanceUefiData</a>
     * command. You can inspect and modify the UEFI data by using the <a
     * href="https://github.com/awslabs/python-uefivars">python-uefivars tool</a> on GitHub. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/uefi-secure-boot.html">UEFI Secure Boot</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param uefiData
     *        Base64 representation of the non-volatile UEFI variable store. To retrieve the UEFI data, use the <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceUefiData"
     *        >GetInstanceUefiData</a> command. You can inspect and modify the UEFI data by using the <a
     *        href="https://github.com/awslabs/python-uefivars">python-uefivars tool</a> on GitHub. For more
     *        information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/uefi-secure-boot.html">UEFI
     *        Secure Boot</a> in the <i>Amazon EC2 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withUefiData(String uefiData) {
        setUefiData(uefiData);
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the AMI was
     * last used to launch an EC2 instance. When the AMI is used to launch an instance, there is a 24-hour delay before
     * that usage is reported.
     * </p>
     * <note>
     * <p>
     * <code>lastLaunchedTime</code> data is available starting April 2017.
     * </p>
     * </note>
     * 
     * @param lastLaunchedTime
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the AMI
     *        was last used to launch an EC2 instance. When the AMI is used to launch an instance, there is a 24-hour
     *        delay before that usage is reported.</p> <note>
     *        <p>
     *        <code>lastLaunchedTime</code> data is available starting April 2017.
     *        </p>
     */

    public void setLastLaunchedTime(String lastLaunchedTime) {
        this.lastLaunchedTime = lastLaunchedTime;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the AMI was
     * last used to launch an EC2 instance. When the AMI is used to launch an instance, there is a 24-hour delay before
     * that usage is reported.
     * </p>
     * <note>
     * <p>
     * <code>lastLaunchedTime</code> data is available starting April 2017.
     * </p>
     * </note>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *         AMI was last used to launch an EC2 instance. When the AMI is used to launch an instance, there is a
     *         24-hour delay before that usage is reported.</p> <note>
     *         <p>
     *         <code>lastLaunchedTime</code> data is available starting April 2017.
     *         </p>
     */

    public String getLastLaunchedTime() {
        return this.lastLaunchedTime;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the AMI was
     * last used to launch an EC2 instance. When the AMI is used to launch an instance, there is a 24-hour delay before
     * that usage is reported.
     * </p>
     * <note>
     * <p>
     * <code>lastLaunchedTime</code> data is available starting April 2017.
     * </p>
     * </note>
     * 
     * @param lastLaunchedTime
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the AMI
     *        was last used to launch an EC2 instance. When the AMI is used to launch an instance, there is a 24-hour
     *        delay before that usage is reported.</p> <note>
     *        <p>
     *        <code>lastLaunchedTime</code> data is available starting April 2017.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withLastLaunchedTime(String lastLaunchedTime) {
        setLastLaunchedTime(lastLaunchedTime);
        return this;
    }

    /**
     * <p>
     * If <code>v2.0</code>, it indicates that IMDSv2 is specified in the AMI. Instances launched from this AMI will
     * have <code>HttpTokens</code> automatically set to <code>required</code> so that, by default, the instance
     * requires that IMDSv2 is used when requesting instance metadata. In addition, <code>HttpPutResponseHopLimit</code>
     * is set to <code>2</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-IMDS-new-instances.html#configure-IMDS-new-instances-ami-configuration"
     * >Configure the AMI</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param imdsSupport
     *        If <code>v2.0</code>, it indicates that IMDSv2 is specified in the AMI. Instances launched from this AMI
     *        will have <code>HttpTokens</code> automatically set to <code>required</code> so that, by default, the
     *        instance requires that IMDSv2 is used when requesting instance metadata. In addition,
     *        <code>HttpPutResponseHopLimit</code> is set to <code>2</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-IMDS-new-instances.html#configure-IMDS-new-instances-ami-configuration"
     *        >Configure the AMI</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public void setImdsSupport(String imdsSupport) {
        this.imdsSupport = imdsSupport;
    }

    /**
     * <p>
     * If <code>v2.0</code>, it indicates that IMDSv2 is specified in the AMI. Instances launched from this AMI will
     * have <code>HttpTokens</code> automatically set to <code>required</code> so that, by default, the instance
     * requires that IMDSv2 is used when requesting instance metadata. In addition, <code>HttpPutResponseHopLimit</code>
     * is set to <code>2</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-IMDS-new-instances.html#configure-IMDS-new-instances-ami-configuration"
     * >Configure the AMI</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @return If <code>v2.0</code>, it indicates that IMDSv2 is specified in the AMI. Instances launched from this AMI
     *         will have <code>HttpTokens</code> automatically set to <code>required</code> so that, by default, the
     *         instance requires that IMDSv2 is used when requesting instance metadata. In addition,
     *         <code>HttpPutResponseHopLimit</code> is set to <code>2</code>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-IMDS-new-instances.html#configure-IMDS-new-instances-ami-configuration"
     *         >Configure the AMI</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public String getImdsSupport() {
        return this.imdsSupport;
    }

    /**
     * <p>
     * If <code>v2.0</code>, it indicates that IMDSv2 is specified in the AMI. Instances launched from this AMI will
     * have <code>HttpTokens</code> automatically set to <code>required</code> so that, by default, the instance
     * requires that IMDSv2 is used when requesting instance metadata. In addition, <code>HttpPutResponseHopLimit</code>
     * is set to <code>2</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-IMDS-new-instances.html#configure-IMDS-new-instances-ami-configuration"
     * >Configure the AMI</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param imdsSupport
     *        If <code>v2.0</code>, it indicates that IMDSv2 is specified in the AMI. Instances launched from this AMI
     *        will have <code>HttpTokens</code> automatically set to <code>required</code> so that, by default, the
     *        instance requires that IMDSv2 is used when requesting instance metadata. In addition,
     *        <code>HttpPutResponseHopLimit</code> is set to <code>2</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-IMDS-new-instances.html#configure-IMDS-new-instances-ami-configuration"
     *        >Configure the AMI</a> in the <i>Amazon EC2 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withImdsSupport(String imdsSupport) {
        setImdsSupport(imdsSupport);
        return this;
    }

    /**
     * <p>
     * Indicates whether deregistration protection is enabled for the AMI.
     * </p>
     * 
     * @param deregistrationProtection
     *        Indicates whether deregistration protection is enabled for the AMI.
     */

    public void setDeregistrationProtection(String deregistrationProtection) {
        this.deregistrationProtection = deregistrationProtection;
    }

    /**
     * <p>
     * Indicates whether deregistration protection is enabled for the AMI.
     * </p>
     * 
     * @return Indicates whether deregistration protection is enabled for the AMI.
     */

    public String getDeregistrationProtection() {
        return this.deregistrationProtection;
    }

    /**
     * <p>
     * Indicates whether deregistration protection is enabled for the AMI.
     * </p>
     * 
     * @param deregistrationProtection
     *        Indicates whether deregistration protection is enabled for the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withDeregistrationProtection(String deregistrationProtection) {
        setDeregistrationProtection(deregistrationProtection);
        return this;
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
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: ").append(getBlockDeviceMappings()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getLaunchPermissions() != null)
            sb.append("LaunchPermissions: ").append(getLaunchPermissions()).append(",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: ").append(getProductCodes()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKernelId() != null)
            sb.append("KernelId: ").append(getKernelId()).append(",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: ").append(getRamdiskId()).append(",");
        if (getSriovNetSupport() != null)
            sb.append("SriovNetSupport: ").append(getSriovNetSupport()).append(",");
        if (getBootMode() != null)
            sb.append("BootMode: ").append(getBootMode()).append(",");
        if (getTpmSupport() != null)
            sb.append("TpmSupport: ").append(getTpmSupport()).append(",");
        if (getUefiData() != null)
            sb.append("UefiData: ").append(getUefiData()).append(",");
        if (getLastLaunchedTime() != null)
            sb.append("LastLaunchedTime: ").append(getLastLaunchedTime()).append(",");
        if (getImdsSupport() != null)
            sb.append("ImdsSupport: ").append(getImdsSupport()).append(",");
        if (getDeregistrationProtection() != null)
            sb.append("DeregistrationProtection: ").append(getDeregistrationProtection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageAttribute == false)
            return false;
        ImageAttribute other = (ImageAttribute) obj;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getLaunchPermissions() == null ^ this.getLaunchPermissions() == null)
            return false;
        if (other.getLaunchPermissions() != null && other.getLaunchPermissions().equals(this.getLaunchPermissions()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null)
            return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false)
            return false;
        if (other.getSriovNetSupport() == null ^ this.getSriovNetSupport() == null)
            return false;
        if (other.getSriovNetSupport() != null && other.getSriovNetSupport().equals(this.getSriovNetSupport()) == false)
            return false;
        if (other.getBootMode() == null ^ this.getBootMode() == null)
            return false;
        if (other.getBootMode() != null && other.getBootMode().equals(this.getBootMode()) == false)
            return false;
        if (other.getTpmSupport() == null ^ this.getTpmSupport() == null)
            return false;
        if (other.getTpmSupport() != null && other.getTpmSupport().equals(this.getTpmSupport()) == false)
            return false;
        if (other.getUefiData() == null ^ this.getUefiData() == null)
            return false;
        if (other.getUefiData() != null && other.getUefiData().equals(this.getUefiData()) == false)
            return false;
        if (other.getLastLaunchedTime() == null ^ this.getLastLaunchedTime() == null)
            return false;
        if (other.getLastLaunchedTime() != null && other.getLastLaunchedTime().equals(this.getLastLaunchedTime()) == false)
            return false;
        if (other.getImdsSupport() == null ^ this.getImdsSupport() == null)
            return false;
        if (other.getImdsSupport() != null && other.getImdsSupport().equals(this.getImdsSupport()) == false)
            return false;
        if (other.getDeregistrationProtection() == null ^ this.getDeregistrationProtection() == null)
            return false;
        if (other.getDeregistrationProtection() != null && other.getDeregistrationProtection().equals(this.getDeregistrationProtection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getLaunchPermissions() == null) ? 0 : getLaunchPermissions().hashCode());
        hashCode = prime * hashCode + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport().hashCode());
        hashCode = prime * hashCode + ((getBootMode() == null) ? 0 : getBootMode().hashCode());
        hashCode = prime * hashCode + ((getTpmSupport() == null) ? 0 : getTpmSupport().hashCode());
        hashCode = prime * hashCode + ((getUefiData() == null) ? 0 : getUefiData().hashCode());
        hashCode = prime * hashCode + ((getLastLaunchedTime() == null) ? 0 : getLastLaunchedTime().hashCode());
        hashCode = prime * hashCode + ((getImdsSupport() == null) ? 0 : getImdsSupport().hashCode());
        hashCode = prime * hashCode + ((getDeregistrationProtection() == null) ? 0 : getDeregistrationProtection().hashCode());
        return hashCode;
    }

    @Override
    public ImageAttribute clone() {
        try {
            return (ImageAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
