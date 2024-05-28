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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an error found during validation. Validation errors found in the definition return in the response as
 * <b>diagnostic elements</b>, rather than raise an exception.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ValidateStateMachineDefinitionDiagnostic"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateStateMachineDefinitionDiagnostic implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A value of <code>ERROR</code> means that you cannot create or update a state machine with this definition.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * Identifying code for the diagnostic.
     * </p>
     */
    private String code;
    /**
     * <p>
     * Message describing the diagnostic condition.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Location of the issue in the state machine, if available.
     * </p>
     * <p>
     * For errors specific to a field, the location could be in the format:
     * <code>/States/&lt;StateName&gt;/&lt;FieldName&gt;</code>, for example: <code>/States/FailState/ErrorPath</code>.
     * </p>
     */
    private String location;

    /**
     * <p>
     * A value of <code>ERROR</code> means that you cannot create or update a state machine with this definition.
     * </p>
     * 
     * @param severity
     *        A value of <code>ERROR</code> means that you cannot create or update a state machine with this definition.
     * @see ValidateStateMachineDefinitionSeverity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * A value of <code>ERROR</code> means that you cannot create or update a state machine with this definition.
     * </p>
     * 
     * @return A value of <code>ERROR</code> means that you cannot create or update a state machine with this
     *         definition.
     * @see ValidateStateMachineDefinitionSeverity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * A value of <code>ERROR</code> means that you cannot create or update a state machine with this definition.
     * </p>
     * 
     * @param severity
     *        A value of <code>ERROR</code> means that you cannot create or update a state machine with this definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidateStateMachineDefinitionSeverity
     */

    public ValidateStateMachineDefinitionDiagnostic withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * A value of <code>ERROR</code> means that you cannot create or update a state machine with this definition.
     * </p>
     * 
     * @param severity
     *        A value of <code>ERROR</code> means that you cannot create or update a state machine with this definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidateStateMachineDefinitionSeverity
     */

    public ValidateStateMachineDefinitionDiagnostic withSeverity(ValidateStateMachineDefinitionSeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * Identifying code for the diagnostic.
     * </p>
     * 
     * @param code
     *        Identifying code for the diagnostic.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * Identifying code for the diagnostic.
     * </p>
     * 
     * @return Identifying code for the diagnostic.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * Identifying code for the diagnostic.
     * </p>
     * 
     * @param code
     *        Identifying code for the diagnostic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateStateMachineDefinitionDiagnostic withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * Message describing the diagnostic condition.
     * </p>
     * 
     * @param message
     *        Message describing the diagnostic condition.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Message describing the diagnostic condition.
     * </p>
     * 
     * @return Message describing the diagnostic condition.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Message describing the diagnostic condition.
     * </p>
     * 
     * @param message
     *        Message describing the diagnostic condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateStateMachineDefinitionDiagnostic withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Location of the issue in the state machine, if available.
     * </p>
     * <p>
     * For errors specific to a field, the location could be in the format:
     * <code>/States/&lt;StateName&gt;/&lt;FieldName&gt;</code>, for example: <code>/States/FailState/ErrorPath</code>.
     * </p>
     * 
     * @param location
     *        Location of the issue in the state machine, if available.</p>
     *        <p>
     *        For errors specific to a field, the location could be in the format:
     *        <code>/States/&lt;StateName&gt;/&lt;FieldName&gt;</code>, for example:
     *        <code>/States/FailState/ErrorPath</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Location of the issue in the state machine, if available.
     * </p>
     * <p>
     * For errors specific to a field, the location could be in the format:
     * <code>/States/&lt;StateName&gt;/&lt;FieldName&gt;</code>, for example: <code>/States/FailState/ErrorPath</code>.
     * </p>
     * 
     * @return Location of the issue in the state machine, if available.</p>
     *         <p>
     *         For errors specific to a field, the location could be in the format:
     *         <code>/States/&lt;StateName&gt;/&lt;FieldName&gt;</code>, for example:
     *         <code>/States/FailState/ErrorPath</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Location of the issue in the state machine, if available.
     * </p>
     * <p>
     * For errors specific to a field, the location could be in the format:
     * <code>/States/&lt;StateName&gt;/&lt;FieldName&gt;</code>, for example: <code>/States/FailState/ErrorPath</code>.
     * </p>
     * 
     * @param location
     *        Location of the issue in the state machine, if available.</p>
     *        <p>
     *        For errors specific to a field, the location could be in the format:
     *        <code>/States/&lt;StateName&gt;/&lt;FieldName&gt;</code>, for example:
     *        <code>/States/FailState/ErrorPath</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateStateMachineDefinitionDiagnostic withLocation(String location) {
        setLocation(location);
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
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateStateMachineDefinitionDiagnostic == false)
            return false;
        ValidateStateMachineDefinitionDiagnostic other = (ValidateStateMachineDefinitionDiagnostic) obj;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public ValidateStateMachineDefinitionDiagnostic clone() {
        try {
            return (ValidateStateMachineDefinitionDiagnostic) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.ValidateStateMachineDefinitionDiagnosticMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
