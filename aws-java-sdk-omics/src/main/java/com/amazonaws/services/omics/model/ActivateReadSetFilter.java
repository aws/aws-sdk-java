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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A read set activation job filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ActivateReadSetFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivateReadSetFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The filter's start date.
     * </p>
     */
    private java.util.Date createdAfter;
    /**
     * <p>
     * The filter's end date.
     * </p>
     */
    private java.util.Date createdBefore;
    /**
     * <p>
     * The filter's status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The filter's start date.
     * </p>
     * 
     * @param createdAfter
     *        The filter's start date.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * The filter's start date.
     * </p>
     * 
     * @return The filter's start date.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * The filter's start date.
     * </p>
     * 
     * @param createdAfter
     *        The filter's start date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateReadSetFilter withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
        return this;
    }

    /**
     * <p>
     * The filter's end date.
     * </p>
     * 
     * @param createdBefore
     *        The filter's end date.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * The filter's end date.
     * </p>
     * 
     * @return The filter's end date.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * The filter's end date.
     * </p>
     * 
     * @param createdBefore
     *        The filter's end date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivateReadSetFilter withCreatedBefore(java.util.Date createdBefore) {
        setCreatedBefore(createdBefore);
        return this;
    }

    /**
     * <p>
     * The filter's status.
     * </p>
     * 
     * @param status
     *        The filter's status.
     * @see ReadSetActivationJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The filter's status.
     * </p>
     * 
     * @return The filter's status.
     * @see ReadSetActivationJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The filter's status.
     * </p>
     * 
     * @param status
     *        The filter's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetActivationJobStatus
     */

    public ActivateReadSetFilter withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The filter's status.
     * </p>
     * 
     * @param status
     *        The filter's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetActivationJobStatus
     */

    public ActivateReadSetFilter withStatus(ReadSetActivationJobStatus status) {
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
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: ").append(getCreatedAfter()).append(",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: ").append(getCreatedBefore()).append(",");
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

        if (obj instanceof ActivateReadSetFilter == false)
            return false;
        ActivateReadSetFilter other = (ActivateReadSetFilter) obj;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
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

        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ActivateReadSetFilter clone() {
        try {
            return (ActivateReadSetFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.ActivateReadSetFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
