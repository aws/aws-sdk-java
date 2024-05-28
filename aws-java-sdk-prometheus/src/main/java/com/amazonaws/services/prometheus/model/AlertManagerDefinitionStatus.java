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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of the alert manager.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/AlertManagerDefinitionStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlertManagerDefinitionStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current status of the alert manager.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * If there is a failure, the reason for the failure.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * The current status of the alert manager.
     * </p>
     * 
     * @param statusCode
     *        The current status of the alert manager.
     * @see AlertManagerDefinitionStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The current status of the alert manager.
     * </p>
     * 
     * @return The current status of the alert manager.
     * @see AlertManagerDefinitionStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The current status of the alert manager.
     * </p>
     * 
     * @param statusCode
     *        The current status of the alert manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlertManagerDefinitionStatusCode
     */

    public AlertManagerDefinitionStatus withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The current status of the alert manager.
     * </p>
     * 
     * @param statusCode
     *        The current status of the alert manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlertManagerDefinitionStatusCode
     */

    public AlertManagerDefinitionStatus withStatusCode(AlertManagerDefinitionStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * If there is a failure, the reason for the failure.
     * </p>
     * 
     * @param statusReason
     *        If there is a failure, the reason for the failure.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * If there is a failure, the reason for the failure.
     * </p>
     * 
     * @return If there is a failure, the reason for the failure.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * If there is a failure, the reason for the failure.
     * </p>
     * 
     * @param statusReason
     *        If there is a failure, the reason for the failure.
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
