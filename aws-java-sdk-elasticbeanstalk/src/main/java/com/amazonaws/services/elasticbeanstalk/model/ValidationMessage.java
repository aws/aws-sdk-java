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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An error or warning for a desired configuration option value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ValidationMessage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationMessage implements Serializable, Cloneable {

    /**
     * <p>
     * A message describing the error or warning.
     * </p>
     */
    private String message;
    /**
     * <p>
     * An indication of the severity of this message:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code>: This message indicates that this is not a valid setting for an option.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>warning</code>: This message is providing information you should take into account.
     * </p>
     * </li>
     * </ul>
     */
    private String severity;
    /**
     * <p>
     * The namespace to which the option belongs.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The name of the option.
     * </p>
     */
    private String optionName;

    /**
     * <p>
     * A message describing the error or warning.
     * </p>
     * 
     * @param message
     *        A message describing the error or warning.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message describing the error or warning.
     * </p>
     * 
     * @return A message describing the error or warning.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message describing the error or warning.
     * </p>
     * 
     * @param message
     *        A message describing the error or warning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationMessage withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * An indication of the severity of this message:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code>: This message indicates that this is not a valid setting for an option.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>warning</code>: This message is providing information you should take into account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param severity
     *        An indication of the severity of this message:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>error</code>: This message indicates that this is not a valid setting for an option.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>warning</code>: This message is providing information you should take into account.
     *        </p>
     *        </li>
     * @see ValidationSeverity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * An indication of the severity of this message:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code>: This message indicates that this is not a valid setting for an option.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>warning</code>: This message is providing information you should take into account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An indication of the severity of this message:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>error</code>: This message indicates that this is not a valid setting for an option.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>warning</code>: This message is providing information you should take into account.
     *         </p>
     *         </li>
     * @see ValidationSeverity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * An indication of the severity of this message:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code>: This message indicates that this is not a valid setting for an option.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>warning</code>: This message is providing information you should take into account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param severity
     *        An indication of the severity of this message:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>error</code>: This message indicates that this is not a valid setting for an option.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>warning</code>: This message is providing information you should take into account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationSeverity
     */

    public ValidationMessage withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * An indication of the severity of this message:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code>: This message indicates that this is not a valid setting for an option.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>warning</code>: This message is providing information you should take into account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param severity
     *        An indication of the severity of this message:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>error</code>: This message indicates that this is not a valid setting for an option.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>warning</code>: This message is providing information you should take into account.
     *        </p>
     *        </li>
     * @see ValidationSeverity
     */

    public void setSeverity(ValidationSeverity severity) {
        withSeverity(severity);
    }

    /**
     * <p>
     * An indication of the severity of this message:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>error</code>: This message indicates that this is not a valid setting for an option.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>warning</code>: This message is providing information you should take into account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param severity
     *        An indication of the severity of this message:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>error</code>: This message indicates that this is not a valid setting for an option.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>warning</code>: This message is providing information you should take into account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationSeverity
     */

    public ValidationMessage withSeverity(ValidationSeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * The namespace to which the option belongs.
     * </p>
     * 
     * @param namespace
     *        The namespace to which the option belongs.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace to which the option belongs.
     * </p>
     * 
     * @return The namespace to which the option belongs.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace to which the option belongs.
     * </p>
     * 
     * @param namespace
     *        The namespace to which the option belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationMessage withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the option.
     * </p>
     * 
     * @param optionName
     *        The name of the option.
     */

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    /**
     * <p>
     * The name of the option.
     * </p>
     * 
     * @return The name of the option.
     */

    public String getOptionName() {
        return this.optionName;
    }

    /**
     * <p>
     * The name of the option.
     * </p>
     * 
     * @param optionName
     *        The name of the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationMessage withOptionName(String optionName) {
        setOptionName(optionName);
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
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getOptionName() != null)
            sb.append("OptionName: ").append(getOptionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidationMessage == false)
            return false;
        ValidationMessage other = (ValidationMessage) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getOptionName() == null ^ this.getOptionName() == null)
            return false;
        if (other.getOptionName() != null && other.getOptionName().equals(this.getOptionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getOptionName() == null) ? 0 : getOptionName().hashCode());
        return hashCode;
    }

    @Override
    public ValidationMessage clone() {
        try {
            return (ValidationMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
