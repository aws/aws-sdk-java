/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.ModifyVolumeRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVolumeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifyVolumeRequest> {

    /**
     * <p>
     * The ID of the volume.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * The target size of the volume, in GiB. The target volume size must be greater than or equal to the existing size
     * of the volume.
     * </p>
     * <p>
     * The following are the supported volumes sizes for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code> and <code>gp3</code>: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> and <code>io2</code>: 4-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code> and <code>sc1</code>: 125-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>standard</code>: 1-1,024
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: If no size is specified, the existing size is retained.
     * </p>
     */
    private Integer size;
    /**
     * <p>
     * The target EBS volume type of the volume. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * The target IOPS rate of the volume. This parameter is valid only for <code>gp3</code>, <code>io1</code>, and
     * <code>io2</code> volumes.
     * </p>
     * <p>
     * The following are the supported values for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp3</code>: 3,000-16,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io2</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: If no IOPS value is specified, the existing value is retained.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The target throughput of the volume, in MiB/s. This parameter is valid only for <code>gp3</code> volumes. The
     * maximum value is 1,000.
     * </p>
     * <p>
     * Default: If no throughput value is specified, the existing value is retained.
     * </p>
     * <p>
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     * </p>
     */
    private Integer throughput;
    /**
     * <p>
     * Specifies whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume to up
     * to 16 <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">
     * Nitro-based instances</a> in the same Availability Zone. This parameter is supported with <code>io1</code> and
     * <code>io2</code> volumes only. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS Multi-Attach</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private Boolean multiAttachEnabled;

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @return The ID of the volume.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVolumeRequest withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * The target size of the volume, in GiB. The target volume size must be greater than or equal to the existing size
     * of the volume.
     * </p>
     * <p>
     * The following are the supported volumes sizes for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code> and <code>gp3</code>: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> and <code>io2</code>: 4-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code> and <code>sc1</code>: 125-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>standard</code>: 1-1,024
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: If no size is specified, the existing size is retained.
     * </p>
     * 
     * @param size
     *        The target size of the volume, in GiB. The target volume size must be greater than or equal to the
     *        existing size of the volume.</p>
     *        <p>
     *        The following are the supported volumes sizes for each volume type:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp2</code> and <code>gp3</code>: 1-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code> and <code>io2</code>: 4-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>st1</code> and <code>sc1</code>: 125-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>standard</code>: 1-1,024
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: If no size is specified, the existing size is retained.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The target size of the volume, in GiB. The target volume size must be greater than or equal to the existing size
     * of the volume.
     * </p>
     * <p>
     * The following are the supported volumes sizes for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code> and <code>gp3</code>: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> and <code>io2</code>: 4-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code> and <code>sc1</code>: 125-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>standard</code>: 1-1,024
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: If no size is specified, the existing size is retained.
     * </p>
     * 
     * @return The target size of the volume, in GiB. The target volume size must be greater than or equal to the
     *         existing size of the volume.</p>
     *         <p>
     *         The following are the supported volumes sizes for each volume type:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>gp2</code> and <code>gp3</code>: 1-16,384
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>io1</code> and <code>io2</code>: 4-16,384
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>st1</code> and <code>sc1</code>: 125-16,384
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>standard</code>: 1-1,024
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: If no size is specified, the existing size is retained.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The target size of the volume, in GiB. The target volume size must be greater than or equal to the existing size
     * of the volume.
     * </p>
     * <p>
     * The following are the supported volumes sizes for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp2</code> and <code>gp3</code>: 1-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> and <code>io2</code>: 4-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code> and <code>sc1</code>: 125-16,384
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>standard</code>: 1-1,024
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: If no size is specified, the existing size is retained.
     * </p>
     * 
     * @param size
     *        The target size of the volume, in GiB. The target volume size must be greater than or equal to the
     *        existing size of the volume.</p>
     *        <p>
     *        The following are the supported volumes sizes for each volume type:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp2</code> and <code>gp3</code>: 1-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code> and <code>io2</code>: 4-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>st1</code> and <code>sc1</code>: 125-16,384
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>standard</code>: 1-1,024
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: If no size is specified, the existing size is retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVolumeRequest withSize(Integer size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The target EBS volume type of the volume. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     * 
     * @param volumeType
     *        The target EBS volume type of the volume. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a>
     *        in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: If no type is specified, the existing type is retained.
     * @see VolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The target EBS volume type of the volume. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     * 
     * @return The target EBS volume type of the volume. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume
     *         types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *         <p>
     *         Default: If no type is specified, the existing type is retained.
     * @see VolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The target EBS volume type of the volume. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     * 
     * @param volumeType
     *        The target EBS volume type of the volume. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a>
     *        in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: If no type is specified, the existing type is retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public ModifyVolumeRequest withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The target EBS volume type of the volume. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     * 
     * @param volumeType
     *        The target EBS volume type of the volume. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a>
     *        in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: If no type is specified, the existing type is retained.
     * @see VolumeType
     */

    public void setVolumeType(VolumeType volumeType) {
        withVolumeType(volumeType);
    }

    /**
     * <p>
     * The target EBS volume type of the volume. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     * 
     * @param volumeType
     *        The target EBS volume type of the volume. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types</a>
     *        in the <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: If no type is specified, the existing type is retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public ModifyVolumeRequest withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * The target IOPS rate of the volume. This parameter is valid only for <code>gp3</code>, <code>io1</code>, and
     * <code>io2</code> volumes.
     * </p>
     * <p>
     * The following are the supported values for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp3</code>: 3,000-16,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io2</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: If no IOPS value is specified, the existing value is retained.
     * </p>
     * 
     * @param iops
     *        The target IOPS rate of the volume. This parameter is valid only for <code>gp3</code>, <code>io1</code>,
     *        and <code>io2</code> volumes.</p>
     *        <p>
     *        The following are the supported values for each volume type:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp3</code>: 3,000-16,000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code>: 100-64,000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io2</code>: 100-64,000 IOPS
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: If no IOPS value is specified, the existing value is retained.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The target IOPS rate of the volume. This parameter is valid only for <code>gp3</code>, <code>io1</code>, and
     * <code>io2</code> volumes.
     * </p>
     * <p>
     * The following are the supported values for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp3</code>: 3,000-16,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io2</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: If no IOPS value is specified, the existing value is retained.
     * </p>
     * 
     * @return The target IOPS rate of the volume. This parameter is valid only for <code>gp3</code>, <code>io1</code>,
     *         and <code>io2</code> volumes.</p>
     *         <p>
     *         The following are the supported values for each volume type:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>gp3</code>: 3,000-16,000 IOPS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>io1</code>: 100-64,000 IOPS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>io2</code>: 100-64,000 IOPS
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: If no IOPS value is specified, the existing value is retained.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The target IOPS rate of the volume. This parameter is valid only for <code>gp3</code>, <code>io1</code>, and
     * <code>io2</code> volumes.
     * </p>
     * <p>
     * The following are the supported values for each volume type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>gp3</code>: 3,000-16,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io2</code>: 100-64,000 IOPS
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: If no IOPS value is specified, the existing value is retained.
     * </p>
     * 
     * @param iops
     *        The target IOPS rate of the volume. This parameter is valid only for <code>gp3</code>, <code>io1</code>,
     *        and <code>io2</code> volumes.</p>
     *        <p>
     *        The following are the supported values for each volume type:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>gp3</code>: 3,000-16,000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code>: 100-64,000 IOPS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io2</code>: 100-64,000 IOPS
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: If no IOPS value is specified, the existing value is retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVolumeRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The target throughput of the volume, in MiB/s. This parameter is valid only for <code>gp3</code> volumes. The
     * maximum value is 1,000.
     * </p>
     * <p>
     * Default: If no throughput value is specified, the existing value is retained.
     * </p>
     * <p>
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     * </p>
     * 
     * @param throughput
     *        The target throughput of the volume, in MiB/s. This parameter is valid only for <code>gp3</code> volumes.
     *        The maximum value is 1,000.</p>
     *        <p>
     *        Default: If no throughput value is specified, the existing value is retained.
     *        </p>
     *        <p>
     *        Valid Range: Minimum value of 125. Maximum value of 1000.
     */

    public void setThroughput(Integer throughput) {
        this.throughput = throughput;
    }

    /**
     * <p>
     * The target throughput of the volume, in MiB/s. This parameter is valid only for <code>gp3</code> volumes. The
     * maximum value is 1,000.
     * </p>
     * <p>
     * Default: If no throughput value is specified, the existing value is retained.
     * </p>
     * <p>
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     * </p>
     * 
     * @return The target throughput of the volume, in MiB/s. This parameter is valid only for <code>gp3</code> volumes.
     *         The maximum value is 1,000.</p>
     *         <p>
     *         Default: If no throughput value is specified, the existing value is retained.
     *         </p>
     *         <p>
     *         Valid Range: Minimum value of 125. Maximum value of 1000.
     */

    public Integer getThroughput() {
        return this.throughput;
    }

    /**
     * <p>
     * The target throughput of the volume, in MiB/s. This parameter is valid only for <code>gp3</code> volumes. The
     * maximum value is 1,000.
     * </p>
     * <p>
     * Default: If no throughput value is specified, the existing value is retained.
     * </p>
     * <p>
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     * </p>
     * 
     * @param throughput
     *        The target throughput of the volume, in MiB/s. This parameter is valid only for <code>gp3</code> volumes.
     *        The maximum value is 1,000.</p>
     *        <p>
     *        Default: If no throughput value is specified, the existing value is retained.
     *        </p>
     *        <p>
     *        Valid Range: Minimum value of 125. Maximum value of 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVolumeRequest withThroughput(Integer throughput) {
        setThroughput(throughput);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume to up
     * to 16 <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">
     * Nitro-based instances</a> in the same Availability Zone. This parameter is supported with <code>io1</code> and
     * <code>io2</code> volumes only. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS Multi-Attach</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param multiAttachEnabled
     *        Specifies whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume
     *        to up to 16 <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">
     *        Nitro-based instances</a> in the same Availability Zone. This parameter is supported with <code>io1</code>
     *        and <code>io2</code> volumes only. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS
     *        Multi-Attach</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setMultiAttachEnabled(Boolean multiAttachEnabled) {
        this.multiAttachEnabled = multiAttachEnabled;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume to up
     * to 16 <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">
     * Nitro-based instances</a> in the same Availability Zone. This parameter is supported with <code>io1</code> and
     * <code>io2</code> volumes only. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS Multi-Attach</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the
     *         volume to up to 16 <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">
     *         Nitro-based instances</a> in the same Availability Zone. This parameter is supported with
     *         <code>io1</code> and <code>io2</code> volumes only. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS
     *         Multi-Attach</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean getMultiAttachEnabled() {
        return this.multiAttachEnabled;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume to up
     * to 16 <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">
     * Nitro-based instances</a> in the same Availability Zone. This parameter is supported with <code>io1</code> and
     * <code>io2</code> volumes only. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS Multi-Attach</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param multiAttachEnabled
     *        Specifies whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume
     *        to up to 16 <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">
     *        Nitro-based instances</a> in the same Availability Zone. This parameter is supported with <code>io1</code>
     *        and <code>io2</code> volumes only. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS
     *        Multi-Attach</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVolumeRequest withMultiAttachEnabled(Boolean multiAttachEnabled) {
        setMultiAttachEnabled(multiAttachEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume to up
     * to 16 <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">
     * Nitro-based instances</a> in the same Availability Zone. This parameter is supported with <code>io1</code> and
     * <code>io2</code> volumes only. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS Multi-Attach</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the
     *         volume to up to 16 <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">
     *         Nitro-based instances</a> in the same Availability Zone. This parameter is supported with
     *         <code>io1</code> and <code>io2</code> volumes only. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html"> Amazon EBS
     *         Multi-Attach</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public Boolean isMultiAttachEnabled() {
        return this.multiAttachEnabled;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVolumeRequest> getDryRunRequest() {
        Request<ModifyVolumeRequest> request = new ModifyVolumeRequestMarshaller().marshall(this);
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
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getThroughput() != null)
            sb.append("Throughput: ").append(getThroughput()).append(",");
        if (getMultiAttachEnabled() != null)
            sb.append("MultiAttachEnabled: ").append(getMultiAttachEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVolumeRequest == false)
            return false;
        ModifyVolumeRequest other = (ModifyVolumeRequest) obj;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getThroughput() == null ^ this.getThroughput() == null)
            return false;
        if (other.getThroughput() != null && other.getThroughput().equals(this.getThroughput()) == false)
            return false;
        if (other.getMultiAttachEnabled() == null ^ this.getMultiAttachEnabled() == null)
            return false;
        if (other.getMultiAttachEnabled() != null && other.getMultiAttachEnabled().equals(this.getMultiAttachEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getThroughput() == null) ? 0 : getThroughput().hashCode());
        hashCode = prime * hashCode + ((getMultiAttachEnabled() == null) ? 0 : getMultiAttachEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVolumeRequest clone() {
        return (ModifyVolumeRequest) super.clone();
    }
}
