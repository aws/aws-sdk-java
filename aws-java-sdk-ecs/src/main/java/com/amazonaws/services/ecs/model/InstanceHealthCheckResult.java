/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the result of a container instance health status check.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/InstanceHealthCheckResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceHealthCheckResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of container instance health status that was verified.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The container instance health status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Unix timestamp for when the container instance health status was last updated.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * The Unix timestamp for when the container instance health status last changed.
     * </p>
     */
    private java.util.Date lastStatusChange;

    /**
     * <p>
     * The type of container instance health status that was verified.
     * </p>
     * 
     * @param type
     *        The type of container instance health status that was verified.
     * @see InstanceHealthCheckType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of container instance health status that was verified.
     * </p>
     * 
     * @return The type of container instance health status that was verified.
     * @see InstanceHealthCheckType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of container instance health status that was verified.
     * </p>
     * 
     * @param type
     *        The type of container instance health status that was verified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceHealthCheckType
     */

    public InstanceHealthCheckResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of container instance health status that was verified.
     * </p>
     * 
     * @param type
     *        The type of container instance health status that was verified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceHealthCheckType
     */

    public InstanceHealthCheckResult withType(InstanceHealthCheckType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The container instance health status.
     * </p>
     * 
     * @param status
     *        The container instance health status.
     * @see InstanceHealthCheckState
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The container instance health status.
     * </p>
     * 
     * @return The container instance health status.
     * @see InstanceHealthCheckState
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The container instance health status.
     * </p>
     * 
     * @param status
     *        The container instance health status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceHealthCheckState
     */

    public InstanceHealthCheckResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The container instance health status.
     * </p>
     * 
     * @param status
     *        The container instance health status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceHealthCheckState
     */

    public InstanceHealthCheckResult withStatus(InstanceHealthCheckState status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the container instance health status was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The Unix timestamp for when the container instance health status was last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The Unix timestamp for when the container instance health status was last updated.
     * </p>
     * 
     * @return The Unix timestamp for when the container instance health status was last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The Unix timestamp for when the container instance health status was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The Unix timestamp for when the container instance health status was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceHealthCheckResult withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the container instance health status last changed.
     * </p>
     * 
     * @param lastStatusChange
     *        The Unix timestamp for when the container instance health status last changed.
     */

    public void setLastStatusChange(java.util.Date lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
    }

    /**
     * <p>
     * The Unix timestamp for when the container instance health status last changed.
     * </p>
     * 
     * @return The Unix timestamp for when the container instance health status last changed.
     */

    public java.util.Date getLastStatusChange() {
        return this.lastStatusChange;
    }

    /**
     * <p>
     * The Unix timestamp for when the container instance health status last changed.
     * </p>
     * 
     * @param lastStatusChange
     *        The Unix timestamp for when the container instance health status last changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceHealthCheckResult withLastStatusChange(java.util.Date lastStatusChange) {
        setLastStatusChange(lastStatusChange);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getLastStatusChange() != null)
            sb.append("LastStatusChange: ").append(getLastStatusChange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceHealthCheckResult == false)
            return false;
        InstanceHealthCheckResult other = (InstanceHealthCheckResult) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getLastStatusChange() == null ^ this.getLastStatusChange() == null)
            return false;
        if (other.getLastStatusChange() != null && other.getLastStatusChange().equals(this.getLastStatusChange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getLastStatusChange() == null) ? 0 : getLastStatusChange().hashCode());
        return hashCode;
    }

    @Override
    public InstanceHealthCheckResult clone() {
        try {
            return (InstanceHealthCheckResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.InstanceHealthCheckResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
