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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed information about the bad request exception error when creating a hosted configuration version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/InvalidConfigurationDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidConfigurationDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The invalid or out-of-range validation constraint in your JSON schema that failed validation.
     * </p>
     */
    private String constraint;
    /**
     * <p>
     * Location of the validation constraint in the configuration JSON schema that failed validation.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The reason for an invalid configuration error.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The type of error for an invalid configuration.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Details about an error with Lambda when a synchronous extension experiences an error during an invocation.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The invalid or out-of-range validation constraint in your JSON schema that failed validation.
     * </p>
     * 
     * @param constraint
     *        The invalid or out-of-range validation constraint in your JSON schema that failed validation.
     */

    public void setConstraint(String constraint) {
        this.constraint = constraint;
    }

    /**
     * <p>
     * The invalid or out-of-range validation constraint in your JSON schema that failed validation.
     * </p>
     * 
     * @return The invalid or out-of-range validation constraint in your JSON schema that failed validation.
     */

    public String getConstraint() {
        return this.constraint;
    }

    /**
     * <p>
     * The invalid or out-of-range validation constraint in your JSON schema that failed validation.
     * </p>
     * 
     * @param constraint
     *        The invalid or out-of-range validation constraint in your JSON schema that failed validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidConfigurationDetail withConstraint(String constraint) {
        setConstraint(constraint);
        return this;
    }

    /**
     * <p>
     * Location of the validation constraint in the configuration JSON schema that failed validation.
     * </p>
     * 
     * @param location
     *        Location of the validation constraint in the configuration JSON schema that failed validation.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Location of the validation constraint in the configuration JSON schema that failed validation.
     * </p>
     * 
     * @return Location of the validation constraint in the configuration JSON schema that failed validation.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Location of the validation constraint in the configuration JSON schema that failed validation.
     * </p>
     * 
     * @param location
     *        Location of the validation constraint in the configuration JSON schema that failed validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidConfigurationDetail withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The reason for an invalid configuration error.
     * </p>
     * 
     * @param reason
     *        The reason for an invalid configuration error.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for an invalid configuration error.
     * </p>
     * 
     * @return The reason for an invalid configuration error.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for an invalid configuration error.
     * </p>
     * 
     * @param reason
     *        The reason for an invalid configuration error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidConfigurationDetail withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The type of error for an invalid configuration.
     * </p>
     * 
     * @param type
     *        The type of error for an invalid configuration.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of error for an invalid configuration.
     * </p>
     * 
     * @return The type of error for an invalid configuration.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of error for an invalid configuration.
     * </p>
     * 
     * @param type
     *        The type of error for an invalid configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidConfigurationDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Details about an error with Lambda when a synchronous extension experiences an error during an invocation.
     * </p>
     * 
     * @param value
     *        Details about an error with Lambda when a synchronous extension experiences an error during an invocation.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Details about an error with Lambda when a synchronous extension experiences an error during an invocation.
     * </p>
     * 
     * @return Details about an error with Lambda when a synchronous extension experiences an error during an
     *         invocation.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Details about an error with Lambda when a synchronous extension experiences an error during an invocation.
     * </p>
     * 
     * @param value
     *        Details about an error with Lambda when a synchronous extension experiences an error during an invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidConfigurationDetail withValue(String value) {
        setValue(value);
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
        if (getConstraint() != null)
            sb.append("Constraint: ").append(getConstraint()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvalidConfigurationDetail == false)
            return false;
        InvalidConfigurationDetail other = (InvalidConfigurationDetail) obj;
        if (other.getConstraint() == null ^ this.getConstraint() == null)
            return false;
        if (other.getConstraint() != null && other.getConstraint().equals(this.getConstraint()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConstraint() == null) ? 0 : getConstraint().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public InvalidConfigurationDetail clone() {
        try {
            return (InvalidConfigurationDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appconfig.model.transform.InvalidConfigurationDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
