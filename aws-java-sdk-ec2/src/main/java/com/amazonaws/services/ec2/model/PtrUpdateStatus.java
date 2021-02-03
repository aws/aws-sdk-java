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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The status of an updated pointer (PTR) record for an Elastic IP address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PtrUpdateStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PtrUpdateStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The value for the PTR record update.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The status of the PTR record update.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason for the PTR record update.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The value for the PTR record update.
     * </p>
     * 
     * @param value
     *        The value for the PTR record update.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the PTR record update.
     * </p>
     * 
     * @return The value for the PTR record update.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value for the PTR record update.
     * </p>
     * 
     * @param value
     *        The value for the PTR record update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PtrUpdateStatus withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The status of the PTR record update.
     * </p>
     * 
     * @param status
     *        The status of the PTR record update.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the PTR record update.
     * </p>
     * 
     * @return The status of the PTR record update.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the PTR record update.
     * </p>
     * 
     * @param status
     *        The status of the PTR record update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PtrUpdateStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The reason for the PTR record update.
     * </p>
     * 
     * @param reason
     *        The reason for the PTR record update.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the PTR record update.
     * </p>
     * 
     * @return The reason for the PTR record update.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the PTR record update.
     * </p>
     * 
     * @param reason
     *        The reason for the PTR record update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PtrUpdateStatus withReason(String reason) {
        setReason(reason);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PtrUpdateStatus == false)
            return false;
        PtrUpdateStatus other = (PtrUpdateStatus) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public PtrUpdateStatus clone() {
        try {
            return (PtrUpdateStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
