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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeDeviceFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeviceFleetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the fleet.
     * </p>
     */
    private String deviceFleetName;
    /**
     * <p>
     * The The Amazon Resource Name (ARN) of the fleet.
     * </p>
     */
    private String deviceFleetArn;
    /**
     * <p>
     * The output configuration for storing sampled data.
     * </p>
     */
    private EdgeOutputConfig outputConfig;
    /**
     * <p>
     * A description of the fleet.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Timestamp of when the device fleet was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Timestamp of when the device fleet was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that has access to Amazon Web Services Internet of Things (IoT).
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) alias created in Amazon Web Services Internet of Things (IoT).
     * </p>
     */
    private String iotRoleAlias;

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet.
     */

    public void setDeviceFleetName(String deviceFleetName) {
        this.deviceFleetName = deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @return The name of the fleet.
     */

    public String getDeviceFleetName() {
        return this.deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceFleetResult withDeviceFleetName(String deviceFleetName) {
        setDeviceFleetName(deviceFleetName);
        return this;
    }

    /**
     * <p>
     * The The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @param deviceFleetArn
     *        The The Amazon Resource Name (ARN) of the fleet.
     */

    public void setDeviceFleetArn(String deviceFleetArn) {
        this.deviceFleetArn = deviceFleetArn;
    }

    /**
     * <p>
     * The The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @return The The Amazon Resource Name (ARN) of the fleet.
     */

    public String getDeviceFleetArn() {
        return this.deviceFleetArn;
    }

    /**
     * <p>
     * The The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @param deviceFleetArn
     *        The The Amazon Resource Name (ARN) of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceFleetResult withDeviceFleetArn(String deviceFleetArn) {
        setDeviceFleetArn(deviceFleetArn);
        return this;
    }

    /**
     * <p>
     * The output configuration for storing sampled data.
     * </p>
     * 
     * @param outputConfig
     *        The output configuration for storing sampled data.
     */

    public void setOutputConfig(EdgeOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The output configuration for storing sampled data.
     * </p>
     * 
     * @return The output configuration for storing sampled data.
     */

    public EdgeOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The output configuration for storing sampled data.
     * </p>
     * 
     * @param outputConfig
     *        The output configuration for storing sampled data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceFleetResult withOutputConfig(EdgeOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * A description of the fleet.
     * </p>
     * 
     * @param description
     *        A description of the fleet.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the fleet.
     * </p>
     * 
     * @return A description of the fleet.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the fleet.
     * </p>
     * 
     * @param description
     *        A description of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceFleetResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Timestamp of when the device fleet was created.
     * </p>
     * 
     * @param creationTime
     *        Timestamp of when the device fleet was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Timestamp of when the device fleet was created.
     * </p>
     * 
     * @return Timestamp of when the device fleet was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Timestamp of when the device fleet was created.
     * </p>
     * 
     * @param creationTime
     *        Timestamp of when the device fleet was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceFleetResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Timestamp of when the device fleet was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        Timestamp of when the device fleet was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Timestamp of when the device fleet was last updated.
     * </p>
     * 
     * @return Timestamp of when the device fleet was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * Timestamp of when the device fleet was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        Timestamp of when the device fleet was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceFleetResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that has access to Amazon Web Services Internet of Things (IoT).
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) that has access to Amazon Web Services Internet of Things (IoT).
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that has access to Amazon Web Services Internet of Things (IoT).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that has access to Amazon Web Services Internet of Things (IoT).
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that has access to Amazon Web Services Internet of Things (IoT).
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) that has access to Amazon Web Services Internet of Things (IoT).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceFleetResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) alias created in Amazon Web Services Internet of Things (IoT).
     * </p>
     * 
     * @param iotRoleAlias
     *        The Amazon Resource Name (ARN) alias created in Amazon Web Services Internet of Things (IoT).
     */

    public void setIotRoleAlias(String iotRoleAlias) {
        this.iotRoleAlias = iotRoleAlias;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) alias created in Amazon Web Services Internet of Things (IoT).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) alias created in Amazon Web Services Internet of Things (IoT).
     */

    public String getIotRoleAlias() {
        return this.iotRoleAlias;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) alias created in Amazon Web Services Internet of Things (IoT).
     * </p>
     * 
     * @param iotRoleAlias
     *        The Amazon Resource Name (ARN) alias created in Amazon Web Services Internet of Things (IoT).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceFleetResult withIotRoleAlias(String iotRoleAlias) {
        setIotRoleAlias(iotRoleAlias);
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
        if (getDeviceFleetName() != null)
            sb.append("DeviceFleetName: ").append(getDeviceFleetName()).append(",");
        if (getDeviceFleetArn() != null)
            sb.append("DeviceFleetArn: ").append(getDeviceFleetArn()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getIotRoleAlias() != null)
            sb.append("IotRoleAlias: ").append(getIotRoleAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDeviceFleetResult == false)
            return false;
        DescribeDeviceFleetResult other = (DescribeDeviceFleetResult) obj;
        if (other.getDeviceFleetName() == null ^ this.getDeviceFleetName() == null)
            return false;
        if (other.getDeviceFleetName() != null && other.getDeviceFleetName().equals(this.getDeviceFleetName()) == false)
            return false;
        if (other.getDeviceFleetArn() == null ^ this.getDeviceFleetArn() == null)
            return false;
        if (other.getDeviceFleetArn() != null && other.getDeviceFleetArn().equals(this.getDeviceFleetArn()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getIotRoleAlias() == null ^ this.getIotRoleAlias() == null)
            return false;
        if (other.getIotRoleAlias() != null && other.getIotRoleAlias().equals(this.getIotRoleAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceFleetName() == null) ? 0 : getDeviceFleetName().hashCode());
        hashCode = prime * hashCode + ((getDeviceFleetArn() == null) ? 0 : getDeviceFleetArn().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getIotRoleAlias() == null) ? 0 : getIotRoleAlias().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDeviceFleetResult clone() {
        try {
            return (DescribeDeviceFleetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
