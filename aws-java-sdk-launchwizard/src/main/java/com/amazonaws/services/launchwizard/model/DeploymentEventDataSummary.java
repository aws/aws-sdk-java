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
package com.amazonaws.services.launchwizard.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the deployment event data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/DeploymentEventDataSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentEventDataSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of the deployment event.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the deployment event.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the deployment event.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason of the deployment event status.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The timestamp of the deployment event.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The description of the deployment event.
     * </p>
     * 
     * @param description
     *        The description of the deployment event.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the deployment event.
     * </p>
     * 
     * @return The description of the deployment event.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the deployment event.
     * </p>
     * 
     * @param description
     *        The description of the deployment event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentEventDataSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the deployment event.
     * </p>
     * 
     * @param name
     *        The name of the deployment event.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the deployment event.
     * </p>
     * 
     * @return The name of the deployment event.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the deployment event.
     * </p>
     * 
     * @param name
     *        The name of the deployment event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentEventDataSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the deployment event.
     * </p>
     * 
     * @param status
     *        The status of the deployment event.
     * @see EventStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the deployment event.
     * </p>
     * 
     * @return The status of the deployment event.
     * @see EventStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the deployment event.
     * </p>
     * 
     * @param status
     *        The status of the deployment event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventStatus
     */

    public DeploymentEventDataSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the deployment event.
     * </p>
     * 
     * @param status
     *        The status of the deployment event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventStatus
     */

    public DeploymentEventDataSummary withStatus(EventStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason of the deployment event status.
     * </p>
     * 
     * @param statusReason
     *        The reason of the deployment event status.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason of the deployment event status.
     * </p>
     * 
     * @return The reason of the deployment event status.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason of the deployment event status.
     * </p>
     * 
     * @param statusReason
     *        The reason of the deployment event status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentEventDataSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The timestamp of the deployment event.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the deployment event.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp of the deployment event.
     * </p>
     * 
     * @return The timestamp of the deployment event.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamp of the deployment event.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the deployment event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentEventDataSummary withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentEventDataSummary == false)
            return false;
        DeploymentEventDataSummary other = (DeploymentEventDataSummary) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentEventDataSummary clone() {
        try {
            return (DeploymentEventDataSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.launchwizard.model.transform.DeploymentEventDataSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
