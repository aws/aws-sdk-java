/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about why a property is not valid.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/PropertyValidationExceptionProperty"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PropertyValidationExceptionProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The full property path.
     * </p>
     */
    private String propertyPath;
    /**
     * <p>
     * Why the property is not valid.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * A message describing why the property is not valid.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The full property path.
     * </p>
     * 
     * @param propertyPath
     *        The full property path.
     */

    public void setPropertyPath(String propertyPath) {
        this.propertyPath = propertyPath;
    }

    /**
     * <p>
     * The full property path.
     * </p>
     * 
     * @return The full property path.
     */

    public String getPropertyPath() {
        return this.propertyPath;
    }

    /**
     * <p>
     * The full property path.
     * </p>
     * 
     * @param propertyPath
     *        The full property path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyValidationExceptionProperty withPropertyPath(String propertyPath) {
        setPropertyPath(propertyPath);
        return this;
    }

    /**
     * <p>
     * Why the property is not valid.
     * </p>
     * 
     * @param reason
     *        Why the property is not valid.
     * @see PropertyValidationExceptionReason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * Why the property is not valid.
     * </p>
     * 
     * @return Why the property is not valid.
     * @see PropertyValidationExceptionReason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * Why the property is not valid.
     * </p>
     * 
     * @param reason
     *        Why the property is not valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyValidationExceptionReason
     */

    public PropertyValidationExceptionProperty withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * Why the property is not valid.
     * </p>
     * 
     * @param reason
     *        Why the property is not valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyValidationExceptionReason
     */

    public PropertyValidationExceptionProperty withReason(PropertyValidationExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * <p>
     * A message describing why the property is not valid.
     * </p>
     * 
     * @param message
     *        A message describing why the property is not valid.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message describing why the property is not valid.
     * </p>
     * 
     * @return A message describing why the property is not valid.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message describing why the property is not valid.
     * </p>
     * 
     * @param message
     *        A message describing why the property is not valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PropertyValidationExceptionProperty withMessage(String message) {
        setMessage(message);
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
        if (getPropertyPath() != null)
            sb.append("PropertyPath: ").append(getPropertyPath()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyValidationExceptionProperty == false)
            return false;
        PropertyValidationExceptionProperty other = (PropertyValidationExceptionProperty) obj;
        if (other.getPropertyPath() == null ^ this.getPropertyPath() == null)
            return false;
        if (other.getPropertyPath() != null && other.getPropertyPath().equals(this.getPropertyPath()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPropertyPath() == null) ? 0 : getPropertyPath().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public PropertyValidationExceptionProperty clone() {
        try {
            return (PropertyValidationExceptionProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.PropertyValidationExceptionPropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
