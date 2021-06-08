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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filters he operation status list based on the passed attribute value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/OperationStatusFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OperationStatusFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filters the list operations result based on the status attribute.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Filters the list operations result based on the status attribute.
     * </p>
     * 
     * @param status
     *        Filters the list operations result based on the status attribute.
     * @see StatusValues
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Filters the list operations result based on the status attribute.
     * </p>
     * 
     * @return Filters the list operations result based on the status attribute.
     * @see StatusValues
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Filters the list operations result based on the status attribute.
     * </p>
     * 
     * @param status
     *        Filters the list operations result based on the status attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusValues
     */

    public OperationStatusFilter withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Filters the list operations result based on the status attribute.
     * </p>
     * 
     * @param status
     *        Filters the list operations result based on the status attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusValues
     */

    public OperationStatusFilter withStatus(StatusValues status) {
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

        if (obj instanceof OperationStatusFilter == false)
            return false;
        OperationStatusFilter other = (OperationStatusFilter) obj;
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

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public OperationStatusFilter clone() {
        try {
            return (OperationStatusFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.OperationStatusFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
