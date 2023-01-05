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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A representation of a resource association error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/AssociateResourceError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateResourceError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The reason why the resource association failed.
     * </p>
     */
    private String message;
    /**
     * <p>
     * A static error code that's used to classify the type of failure.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The reason why the resource association failed.
     * </p>
     * 
     * @param message
     *        The reason why the resource association failed.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The reason why the resource association failed.
     * </p>
     * 
     * @return The reason why the resource association failed.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The reason why the resource association failed.
     * </p>
     * 
     * @param message
     *        The reason why the resource association failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceError withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * A static error code that's used to classify the type of failure.
     * </p>
     * 
     * @param reason
     *        A static error code that's used to classify the type of failure.
     * @see AssociateResourceErrorReason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A static error code that's used to classify the type of failure.
     * </p>
     * 
     * @return A static error code that's used to classify the type of failure.
     * @see AssociateResourceErrorReason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A static error code that's used to classify the type of failure.
     * </p>
     * 
     * @param reason
     *        A static error code that's used to classify the type of failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociateResourceErrorReason
     */

    public AssociateResourceError withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * A static error code that's used to classify the type of failure.
     * </p>
     * 
     * @param reason
     *        A static error code that's used to classify the type of failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociateResourceErrorReason
     */

    public AssociateResourceError withReason(AssociateResourceErrorReason reason) {
        this.reason = reason.toString();
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
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

        if (obj instanceof AssociateResourceError == false)
            return false;
        AssociateResourceError other = (AssociateResourceError) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
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

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public AssociateResourceError clone() {
        try {
            return (AssociateResourceError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.AssociateResourceErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
