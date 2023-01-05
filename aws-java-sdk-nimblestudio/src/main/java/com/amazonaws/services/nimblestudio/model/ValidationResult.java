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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The launch profile validation result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ValidationResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The status code. This will contain the failure reason if the state is <code>VALIDATION_FAILED</code>.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * The status message for the validation result.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The type of the validation result.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @see LaunchProfileValidationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @return The current state.
     * @see LaunchProfileValidationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchProfileValidationState
     */

    public ValidationResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchProfileValidationState
     */

    public ValidationResult withState(LaunchProfileValidationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The status code. This will contain the failure reason if the state is <code>VALIDATION_FAILED</code>.
     * </p>
     * 
     * @param statusCode
     *        The status code. This will contain the failure reason if the state is <code>VALIDATION_FAILED</code>.
     * @see LaunchProfileValidationStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code. This will contain the failure reason if the state is <code>VALIDATION_FAILED</code>.
     * </p>
     * 
     * @return The status code. This will contain the failure reason if the state is <code>VALIDATION_FAILED</code>.
     * @see LaunchProfileValidationStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status code. This will contain the failure reason if the state is <code>VALIDATION_FAILED</code>.
     * </p>
     * 
     * @param statusCode
     *        The status code. This will contain the failure reason if the state is <code>VALIDATION_FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchProfileValidationStatusCode
     */

    public ValidationResult withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The status code. This will contain the failure reason if the state is <code>VALIDATION_FAILED</code>.
     * </p>
     * 
     * @param statusCode
     *        The status code. This will contain the failure reason if the state is <code>VALIDATION_FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchProfileValidationStatusCode
     */

    public ValidationResult withStatusCode(LaunchProfileValidationStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the validation result.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the validation result.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for the validation result.
     * </p>
     * 
     * @return The status message for the validation result.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for the validation result.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the validation result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The type of the validation result.
     * </p>
     * 
     * @param type
     *        The type of the validation result.
     * @see LaunchProfileValidationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the validation result.
     * </p>
     * 
     * @return The type of the validation result.
     * @see LaunchProfileValidationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the validation result.
     * </p>
     * 
     * @param type
     *        The type of the validation result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchProfileValidationType
     */

    public ValidationResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the validation result.
     * </p>
     * 
     * @param type
     *        The type of the validation result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchProfileValidationType
     */

    public ValidationResult withType(LaunchProfileValidationType type) {
        this.type = type.toString();
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidationResult == false)
            return false;
        ValidationResult other = (ValidationResult) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ValidationResult clone() {
        try {
            return (ValidationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.ValidationResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
