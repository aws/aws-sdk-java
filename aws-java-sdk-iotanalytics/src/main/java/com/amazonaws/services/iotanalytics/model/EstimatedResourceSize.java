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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The estimated size of the resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/EstimatedResourceSize" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EstimatedResourceSize implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The estimated size of the resource in bytes.
     * </p>
     */
    private Double estimatedSizeInBytes;
    /**
     * <p>
     * The time when the estimate of the size of the resource was made.
     * </p>
     */
    private java.util.Date estimatedOn;

    /**
     * <p>
     * The estimated size of the resource in bytes.
     * </p>
     * 
     * @param estimatedSizeInBytes
     *        The estimated size of the resource in bytes.
     */

    public void setEstimatedSizeInBytes(Double estimatedSizeInBytes) {
        this.estimatedSizeInBytes = estimatedSizeInBytes;
    }

    /**
     * <p>
     * The estimated size of the resource in bytes.
     * </p>
     * 
     * @return The estimated size of the resource in bytes.
     */

    public Double getEstimatedSizeInBytes() {
        return this.estimatedSizeInBytes;
    }

    /**
     * <p>
     * The estimated size of the resource in bytes.
     * </p>
     * 
     * @param estimatedSizeInBytes
     *        The estimated size of the resource in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EstimatedResourceSize withEstimatedSizeInBytes(Double estimatedSizeInBytes) {
        setEstimatedSizeInBytes(estimatedSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The time when the estimate of the size of the resource was made.
     * </p>
     * 
     * @param estimatedOn
     *        The time when the estimate of the size of the resource was made.
     */

    public void setEstimatedOn(java.util.Date estimatedOn) {
        this.estimatedOn = estimatedOn;
    }

    /**
     * <p>
     * The time when the estimate of the size of the resource was made.
     * </p>
     * 
     * @return The time when the estimate of the size of the resource was made.
     */

    public java.util.Date getEstimatedOn() {
        return this.estimatedOn;
    }

    /**
     * <p>
     * The time when the estimate of the size of the resource was made.
     * </p>
     * 
     * @param estimatedOn
     *        The time when the estimate of the size of the resource was made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EstimatedResourceSize withEstimatedOn(java.util.Date estimatedOn) {
        setEstimatedOn(estimatedOn);
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
        if (getEstimatedSizeInBytes() != null)
            sb.append("EstimatedSizeInBytes: ").append(getEstimatedSizeInBytes()).append(",");
        if (getEstimatedOn() != null)
            sb.append("EstimatedOn: ").append(getEstimatedOn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EstimatedResourceSize == false)
            return false;
        EstimatedResourceSize other = (EstimatedResourceSize) obj;
        if (other.getEstimatedSizeInBytes() == null ^ this.getEstimatedSizeInBytes() == null)
            return false;
        if (other.getEstimatedSizeInBytes() != null && other.getEstimatedSizeInBytes().equals(this.getEstimatedSizeInBytes()) == false)
            return false;
        if (other.getEstimatedOn() == null ^ this.getEstimatedOn() == null)
            return false;
        if (other.getEstimatedOn() != null && other.getEstimatedOn().equals(this.getEstimatedOn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEstimatedSizeInBytes() == null) ? 0 : getEstimatedSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getEstimatedOn() == null) ? 0 : getEstimatedOn().hashCode());
        return hashCode;
    }

    @Override
    public EstimatedResourceSize clone() {
        try {
            return (EstimatedResourceSize) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.EstimatedResourceSizeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
