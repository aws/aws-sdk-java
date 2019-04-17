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
import com.amazonaws.services.ec2.model.transform.CreateImageRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateImageRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateImageRequest> {

    /**
     * <p>
     * Tthe block device mappings. This parameter cannot be used to modify the encryption status of existing volumes or
     * snapshots. To create an AMI with encrypted snapshots, use the <a>CopyImage</a> action.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * A description for the new image.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * A name for the new image.
     * </p>
     * <p>
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods (.),
     * slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
     * </p>
     */
    private String name;
    /**
     * <p>
     * By default, Amazon EC2 attempts to shut down and reboot the instance before creating the image. If the 'No
     * Reboot' option is set, Amazon EC2 doesn't shut down the instance before creating the image. When this option is
     * used, file system integrity on the created image can't be guaranteed.
     * </p>
     */
    private Boolean noReboot;

    /**
     * Default constructor for CreateImageRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateImageRequest() {
    }

    /**
     * Constructs a new CreateImageRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceId
     *        The ID of the instance.
     * @param name
     *        A name for the new image.</p>
     *        <p>
     *        Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods
     *        (.), slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
     */
    public CreateImageRequest(String instanceId, String name) {
        setInstanceId(instanceId);
        setName(name);
    }

    /**
     * <p>
     * Tthe block device mappings. This parameter cannot be used to modify the encryption status of existing volumes or
     * snapshots. To create an AMI with encrypted snapshots, use the <a>CopyImage</a> action.
     * </p>
     * 
     * @return Tthe block device mappings. This parameter cannot be used to modify the encryption status of existing
     *         volumes or snapshots. To create an AMI with encrypted snapshots, use the <a>CopyImage</a> action.
     */

    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * Tthe block device mappings. This parameter cannot be used to modify the encryption status of existing volumes or
     * snapshots. To create an AMI with encrypted snapshots, use the <a>CopyImage</a> action.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Tthe block device mappings. This parameter cannot be used to modify the encryption status of existing
     *        volumes or snapshots. To create an AMI with encrypted snapshots, use the <a>CopyImage</a> action.
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
     * Tthe block device mappings. This parameter cannot be used to modify the encryption status of existing volumes or
     * snapshots. To create an AMI with encrypted snapshots, use the <a>CopyImage</a> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Tthe block device mappings. This parameter cannot be used to modify the encryption status of existing
     *        volumes or snapshots. To create an AMI with encrypted snapshots, use the <a>CopyImage</a> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
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
     * Tthe block device mappings. This parameter cannot be used to modify the encryption status of existing volumes or
     * snapshots. To create an AMI with encrypted snapshots, use the <a>CopyImage</a> action.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Tthe block device mappings. This parameter cannot be used to modify the encryption status of existing
     *        volumes or snapshots. To create an AMI with encrypted snapshots, use the <a>CopyImage</a> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * A description for the new image.
     * </p>
     * 
     * @param description
     *        A description for the new image.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the new image.
     * </p>
     * 
     * @return A description for the new image.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the new image.
     * </p>
     * 
     * @param description
     *        A description for the new image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * A name for the new image.
     * </p>
     * <p>
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods (.),
     * slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
     * </p>
     * 
     * @param name
     *        A name for the new image.</p>
     *        <p>
     *        Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods
     *        (.), slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the new image.
     * </p>
     * <p>
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods (.),
     * slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
     * </p>
     * 
     * @return A name for the new image.</p>
     *         <p>
     *         Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods
     *         (.), slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the new image.
     * </p>
     * <p>
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods (.),
     * slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
     * </p>
     * 
     * @param name
     *        A name for the new image.</p>
     *        <p>
     *        Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods
     *        (.), slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * By default, Amazon EC2 attempts to shut down and reboot the instance before creating the image. If the 'No
     * Reboot' option is set, Amazon EC2 doesn't shut down the instance before creating the image. When this option is
     * used, file system integrity on the created image can't be guaranteed.
     * </p>
     * 
     * @param noReboot
     *        By default, Amazon EC2 attempts to shut down and reboot the instance before creating the image. If the 'No
     *        Reboot' option is set, Amazon EC2 doesn't shut down the instance before creating the image. When this
     *        option is used, file system integrity on the created image can't be guaranteed.
     */

    public void setNoReboot(Boolean noReboot) {
        this.noReboot = noReboot;
    }

    /**
     * <p>
     * By default, Amazon EC2 attempts to shut down and reboot the instance before creating the image. If the 'No
     * Reboot' option is set, Amazon EC2 doesn't shut down the instance before creating the image. When this option is
     * used, file system integrity on the created image can't be guaranteed.
     * </p>
     * 
     * @return By default, Amazon EC2 attempts to shut down and reboot the instance before creating the image. If the
     *         'No Reboot' option is set, Amazon EC2 doesn't shut down the instance before creating the image. When this
     *         option is used, file system integrity on the created image can't be guaranteed.
     */

    public Boolean getNoReboot() {
        return this.noReboot;
    }

    /**
     * <p>
     * By default, Amazon EC2 attempts to shut down and reboot the instance before creating the image. If the 'No
     * Reboot' option is set, Amazon EC2 doesn't shut down the instance before creating the image. When this option is
     * used, file system integrity on the created image can't be guaranteed.
     * </p>
     * 
     * @param noReboot
     *        By default, Amazon EC2 attempts to shut down and reboot the instance before creating the image. If the 'No
     *        Reboot' option is set, Amazon EC2 doesn't shut down the instance before creating the image. When this
     *        option is used, file system integrity on the created image can't be guaranteed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageRequest withNoReboot(Boolean noReboot) {
        setNoReboot(noReboot);
        return this;
    }

    /**
     * <p>
     * By default, Amazon EC2 attempts to shut down and reboot the instance before creating the image. If the 'No
     * Reboot' option is set, Amazon EC2 doesn't shut down the instance before creating the image. When this option is
     * used, file system integrity on the created image can't be guaranteed.
     * </p>
     * 
     * @return By default, Amazon EC2 attempts to shut down and reboot the instance before creating the image. If the
     *         'No Reboot' option is set, Amazon EC2 doesn't shut down the instance before creating the image. When this
     *         option is used, file system integrity on the created image can't be guaranteed.
     */

    public Boolean isNoReboot() {
        return this.noReboot;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateImageRequest> getDryRunRequest() {
        Request<CreateImageRequest> request = new CreateImageRequestMarshaller().marshall(this);
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
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: ").append(getBlockDeviceMappings()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNoReboot() != null)
            sb.append("NoReboot: ").append(getNoReboot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateImageRequest == false)
            return false;
        CreateImageRequest other = (CreateImageRequest) obj;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNoReboot() == null ^ this.getNoReboot() == null)
            return false;
        if (other.getNoReboot() != null && other.getNoReboot().equals(this.getNoReboot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNoReboot() == null) ? 0 : getNoReboot().hashCode());
        return hashCode;
    }

    @Override
    public CreateImageRequest clone() {
        return (CreateImageRequest) super.clone();
    }
}
