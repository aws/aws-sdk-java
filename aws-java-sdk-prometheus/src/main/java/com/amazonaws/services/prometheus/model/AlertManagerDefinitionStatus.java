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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the status of a definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/AlertManagerDefinitionStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlertManagerDefinitionStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Status code of this definition.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * The reason for failure if any.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * Status code of this definition.
     * </p>
     * 
     * @param statusCode
     *        Status code of this definition.
     * @see AlertManagerDefinitionStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * Status code of this definition.
     * </p>
     * 
     * @return Status code of this definition.
     * @see AlertManagerDefinitionStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * Status code of this definition.
     * </p>
     * 
     * @param statusCode
     *        Status code of this definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlertManagerDefinitionStatusCode
     */

    public AlertManagerDefinitionStatus withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * Status code of this definition.
     * </p>
     * 
     * @param statusCode
     *        Status code of this definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlertManagerDefinitionStatusCode
     */

    public AlertManagerDefinitionStatus withStatusCode(AlertManagerDefinitionStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * The reason for failure if any.
     * </p>
     * 
     * @param statusReason
     *        The reason for failure if any.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for failure if any.
     * </p>
     * 
     * @return The reason for failure if any.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for failure if any.
     * </p>
     * 
     * @param statusReason
     *        The reason for failure if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertManagerDefinitionStatus withStatusReason(String statusReason) {
        setStatusReason(statusReason);
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
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlertManagerDefinitionStatus == false)
            return false;
        AlertManagerDefinitionStatus other = (AlertManagerDefinitionStatus) obj;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public AlertManagerDefinitionStatus clone() {
        try {
            return (AlertManagerDefinitionStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.prometheus.model.transform.AlertManagerDefinitionStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
