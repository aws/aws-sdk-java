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
 * Provides the details of a group's status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GroupStatusDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupStatusDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of a group.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The details of an error associated a group status.
     * </p>
     */
    private ErrorDetail errorDetail;

    /**
     * <p>
     * The status of a group.
     * </p>
     * 
     * @param status
     *        The status of a group.
     * @see GroupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a group.
     * </p>
     * 
     * @return The status of a group.
     * @see GroupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a group.
     * </p>
     * 
     * @param status
     *        The status of a group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupStatus
     */

    public GroupStatusDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a group.
     * </p>
     * 
     * @param status
     *        The status of a group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupStatus
     */

    public GroupStatusDetail withStatus(GroupStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The Unix timestamp when the Amazon Q Business application was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @return The Unix timestamp when the Amazon Q Business application was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The Unix timestamp when the Amazon Q Business application was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupStatusDetail withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The details of an error associated a group status.
     * </p>
     * 
     * @param errorDetail
     *        The details of an error associated a group status.
     */

    public void setErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
    }

    /**
     * <p>
     * The details of an error associated a group status.
     * </p>
     * 
     * @return The details of an error associated a group status.
     */

    public ErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * <p>
     * The details of an error associated a group status.
     * </p>
     * 
     * @param errorDetail
     *        The details of an error associated a group status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupStatusDetail withErrorDetail(ErrorDetail errorDetail) {
        setErrorDetail(errorDetail);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getErrorDetail() != null)
            sb.append("ErrorDetail: ").append(getErrorDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupStatusDetail == false)
            return false;
        GroupStatusDetail other = (GroupStatusDetail) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getErrorDetail() == null ^ this.getErrorDetail() == null)
            return false;
        if (other.getErrorDetail() != null && other.getErrorDetail().equals(this.getErrorDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getErrorDetail() == null) ? 0 : getErrorDetail().hashCode());
        return hashCode;
    }

    @Override
    public GroupStatusDetail clone() {
        try {
            return (GroupStatusDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.GroupStatusDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
