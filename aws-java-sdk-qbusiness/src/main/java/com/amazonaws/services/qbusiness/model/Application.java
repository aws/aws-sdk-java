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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information for an Amazon Q Business application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/Application" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Application implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon Q Business application.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The identifier for the Amazon Q Business application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The status of the Amazon Q Business application. The application is ready to use when the status is
     * <code>ACTIVE</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the Amazon Q Business application.
     * </p>
     * 
     * @param displayName
     *        The name of the Amazon Q Business application.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the Amazon Q Business application.
     * </p>
     * 
     * @return The name of the Amazon Q Business application.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the Amazon Q Business application.
     * </p>
     * 
     * @param displayName
     *        The name of the Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The identifier for the Amazon Q Business application.
     * </p>
     * 
     * @param applicationId
     *        The identifier for the Amazon Q Business application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier for the Amazon Q Business application.
     * </p>
     * 
     * @return The identifier for the Amazon Q Business application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier for the Amazon Q Business application.
     * </p>
     * 
     * @param applicationId
     *        The identifier for the Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the Amazon Q Business application was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was created.
     * </p>
     * 
     * @return The Unix timestamp when the Amazon Q Business application was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the Amazon Q Business application was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the Amazon Q Business application was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @return The Unix timestamp when the Amazon Q Business application was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the Amazon Q Business application was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Application withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon Q Business application. The application is ready to use when the status is
     * <code>ACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The status of the Amazon Q Business application. The application is ready to use when the status is
     *        <code>ACTIVE</code>.
     * @see ApplicationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Amazon Q Business application. The application is ready to use when the status is
     * <code>ACTIVE</code>.
     * </p>
     * 
     * @return The status of the Amazon Q Business application. The application is ready to use when the status is
     *         <code>ACTIVE</code>.
     * @see ApplicationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Amazon Q Business application. The application is ready to use when the status is
     * <code>ACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The status of the Amazon Q Business application. The application is ready to use when the status is
     *        <code>ACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public Application withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon Q Business application. The application is ready to use when the status is
     * <code>ACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The status of the Amazon Q Business application. The application is ready to use when the status is
     *        <code>ACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public Application withStatus(ApplicationStatus status) {
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
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

        if (obj instanceof Application == false)
            return false;
        Application other = (Application) obj;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
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

        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public Application clone() {
        try {
            return (Application) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.ApplicationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
