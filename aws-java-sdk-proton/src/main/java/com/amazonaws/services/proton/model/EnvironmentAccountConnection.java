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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The environment account connection detail data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/EnvironmentAccountConnection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentAccountConnection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment account connection.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The environment account that's connected to the environment account connection.
     * </p>
     */
    private String environmentAccountId;
    /**
     * <p>
     * The name of the environment that's associated with the environment account connection.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The ID of the environment account connection.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The time when the environment account connection was last modified.
     * </p>
     */
    private java.util.Date lastModifiedAt;
    /**
     * <p>
     * The ID of the management account that's connected to the environment account connection.
     * </p>
     */
    private String managementAccountId;
    /**
     * <p>
     * The time when the environment account connection request was made.
     * </p>
     */
    private java.util.Date requestedAt;
    /**
     * <p>
     * The IAM service role that's associated with the environment account connection.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The status of the environment account connection.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment account connection.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the environment account connection.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment account connection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the environment account connection.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment account connection.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the environment account connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentAccountConnection withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The environment account that's connected to the environment account connection.
     * </p>
     * 
     * @param environmentAccountId
     *        The environment account that's connected to the environment account connection.
     */

    public void setEnvironmentAccountId(String environmentAccountId) {
        this.environmentAccountId = environmentAccountId;
    }

    /**
     * <p>
     * The environment account that's connected to the environment account connection.
     * </p>
     * 
     * @return The environment account that's connected to the environment account connection.
     */

    public String getEnvironmentAccountId() {
        return this.environmentAccountId;
    }

    /**
     * <p>
     * The environment account that's connected to the environment account connection.
     * </p>
     * 
     * @param environmentAccountId
     *        The environment account that's connected to the environment account connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentAccountConnection withEnvironmentAccountId(String environmentAccountId) {
        setEnvironmentAccountId(environmentAccountId);
        return this;
    }

    /**
     * <p>
     * The name of the environment that's associated with the environment account connection.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment that's associated with the environment account connection.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment that's associated with the environment account connection.
     * </p>
     * 
     * @return The name of the environment that's associated with the environment account connection.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the environment that's associated with the environment account connection.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment that's associated with the environment account connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentAccountConnection withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The ID of the environment account connection.
     * </p>
     * 
     * @param id
     *        The ID of the environment account connection.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the environment account connection.
     * </p>
     * 
     * @return The ID of the environment account connection.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the environment account connection.
     * </p>
     * 
     * @param id
     *        The ID of the environment account connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentAccountConnection withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The time when the environment account connection was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        The time when the environment account connection was last modified.
     */

    public void setLastModifiedAt(java.util.Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * <p>
     * The time when the environment account connection was last modified.
     * </p>
     * 
     * @return The time when the environment account connection was last modified.
     */

    public java.util.Date getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * <p>
     * The time when the environment account connection was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        The time when the environment account connection was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentAccountConnection withLastModifiedAt(java.util.Date lastModifiedAt) {
        setLastModifiedAt(lastModifiedAt);
        return this;
    }

    /**
     * <p>
     * The ID of the management account that's connected to the environment account connection.
     * </p>
     * 
     * @param managementAccountId
     *        The ID of the management account that's connected to the environment account connection.
     */

    public void setManagementAccountId(String managementAccountId) {
        this.managementAccountId = managementAccountId;
    }

    /**
     * <p>
     * The ID of the management account that's connected to the environment account connection.
     * </p>
     * 
     * @return The ID of the management account that's connected to the environment account connection.
     */

    public String getManagementAccountId() {
        return this.managementAccountId;
    }

    /**
     * <p>
     * The ID of the management account that's connected to the environment account connection.
     * </p>
     * 
     * @param managementAccountId
     *        The ID of the management account that's connected to the environment account connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentAccountConnection withManagementAccountId(String managementAccountId) {
        setManagementAccountId(managementAccountId);
        return this;
    }

    /**
     * <p>
     * The time when the environment account connection request was made.
     * </p>
     * 
     * @param requestedAt
     *        The time when the environment account connection request was made.
     */

    public void setRequestedAt(java.util.Date requestedAt) {
        this.requestedAt = requestedAt;
    }

    /**
     * <p>
     * The time when the environment account connection request was made.
     * </p>
     * 
     * @return The time when the environment account connection request was made.
     */

    public java.util.Date getRequestedAt() {
        return this.requestedAt;
    }

    /**
     * <p>
     * The time when the environment account connection request was made.
     * </p>
     * 
     * @param requestedAt
     *        The time when the environment account connection request was made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentAccountConnection withRequestedAt(java.util.Date requestedAt) {
        setRequestedAt(requestedAt);
        return this;
    }

    /**
     * <p>
     * The IAM service role that's associated with the environment account connection.
     * </p>
     * 
     * @param roleArn
     *        The IAM service role that's associated with the environment account connection.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM service role that's associated with the environment account connection.
     * </p>
     * 
     * @return The IAM service role that's associated with the environment account connection.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM service role that's associated with the environment account connection.
     * </p>
     * 
     * @param roleArn
     *        The IAM service role that's associated with the environment account connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentAccountConnection withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The status of the environment account connection.
     * </p>
     * 
     * @param status
     *        The status of the environment account connection.
     * @see EnvironmentAccountConnectionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the environment account connection.
     * </p>
     * 
     * @return The status of the environment account connection.
     * @see EnvironmentAccountConnectionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the environment account connection.
     * </p>
     * 
     * @param status
     *        The status of the environment account connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentAccountConnectionStatus
     */

    public EnvironmentAccountConnection withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the environment account connection.
     * </p>
     * 
     * @param status
     *        The status of the environment account connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentAccountConnectionStatus
     */

    public EnvironmentAccountConnection withStatus(EnvironmentAccountConnectionStatus status) {
        this.status = status.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getEnvironmentAccountId() != null)
            sb.append("EnvironmentAccountId: ").append(getEnvironmentAccountId()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastModifiedAt() != null)
            sb.append("LastModifiedAt: ").append(getLastModifiedAt()).append(",");
        if (getManagementAccountId() != null)
            sb.append("ManagementAccountId: ").append(getManagementAccountId()).append(",");
        if (getRequestedAt() != null)
            sb.append("RequestedAt: ").append(getRequestedAt()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentAccountConnection == false)
            return false;
        EnvironmentAccountConnection other = (EnvironmentAccountConnection) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getEnvironmentAccountId() == null ^ this.getEnvironmentAccountId() == null)
            return false;
        if (other.getEnvironmentAccountId() != null && other.getEnvironmentAccountId().equals(this.getEnvironmentAccountId()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModifiedAt() == null ^ this.getLastModifiedAt() == null)
            return false;
        if (other.getLastModifiedAt() != null && other.getLastModifiedAt().equals(this.getLastModifiedAt()) == false)
            return false;
        if (other.getManagementAccountId() == null ^ this.getManagementAccountId() == null)
            return false;
        if (other.getManagementAccountId() != null && other.getManagementAccountId().equals(this.getManagementAccountId()) == false)
            return false;
        if (other.getRequestedAt() == null ^ this.getRequestedAt() == null)
            return false;
        if (other.getRequestedAt() != null && other.getRequestedAt().equals(this.getRequestedAt()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentAccountId() == null) ? 0 : getEnvironmentAccountId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedAt() == null) ? 0 : getLastModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getManagementAccountId() == null) ? 0 : getManagementAccountId().hashCode());
        hashCode = prime * hashCode + ((getRequestedAt() == null) ? 0 : getRequestedAt().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentAccountConnection clone() {
        try {
            return (EnvironmentAccountConnection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.EnvironmentAccountConnectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
