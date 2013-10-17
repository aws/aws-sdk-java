/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;


/**
 * <p>
 * An error or warning for a desired configuration option value.
 * </p>
 */
public class ValidationMessage implements Serializable {

    /**
     * A message describing the error or warning.
     */
    private String message;

    /**
     * An indication of the severity of this message: <enumValues> <value
     * name="error"> <p> error: This message indicates that this is not a
     * valid setting for an option. </value> <value name="warning"> <p>
     * warning: This message is providing information you should take into
     * account. </value> </enumValues> <ul> <li> error: This message
     * indicates that this is not a valid setting for an option. </li> <li>
     * warning: This message is providing information you should take into
     * account. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, warning
     */
    private String severity;

    /**
     * 
     */
    private String namespace;

    /**
     * 
     */
    private String optionName;

    /**
     * Default constructor for a new ValidationMessage object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ValidationMessage() {}
    
    /**
     * A message describing the error or warning.
     *
     * @return A message describing the error or warning.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * A message describing the error or warning.
     *
     * @param message A message describing the error or warning.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * A message describing the error or warning.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message A message describing the error or warning.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ValidationMessage withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * An indication of the severity of this message: <enumValues> <value
     * name="error"> <p> error: This message indicates that this is not a
     * valid setting for an option. </value> <value name="warning"> <p>
     * warning: This message is providing information you should take into
     * account. </value> </enumValues> <ul> <li> error: This message
     * indicates that this is not a valid setting for an option. </li> <li>
     * warning: This message is providing information you should take into
     * account. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, warning
     *
     * @return An indication of the severity of this message: <enumValues> <value
     *         name="error"> <p> error: This message indicates that this is not a
     *         valid setting for an option. </value> <value name="warning"> <p>
     *         warning: This message is providing information you should take into
     *         account. </value> </enumValues> <ul> <li> error: This message
     *         indicates that this is not a valid setting for an option. </li> <li>
     *         warning: This message is providing information you should take into
     *         account. </li> </ul>
     *
     * @see ValidationSeverity
     */
    public String getSeverity() {
        return severity;
    }
    
    /**
     * An indication of the severity of this message: <enumValues> <value
     * name="error"> <p> error: This message indicates that this is not a
     * valid setting for an option. </value> <value name="warning"> <p>
     * warning: This message is providing information you should take into
     * account. </value> </enumValues> <ul> <li> error: This message
     * indicates that this is not a valid setting for an option. </li> <li>
     * warning: This message is providing information you should take into
     * account. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, warning
     *
     * @param severity An indication of the severity of this message: <enumValues> <value
     *         name="error"> <p> error: This message indicates that this is not a
     *         valid setting for an option. </value> <value name="warning"> <p>
     *         warning: This message is providing information you should take into
     *         account. </value> </enumValues> <ul> <li> error: This message
     *         indicates that this is not a valid setting for an option. </li> <li>
     *         warning: This message is providing information you should take into
     *         account. </li> </ul>
     *
     * @see ValidationSeverity
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }
    
    /**
     * An indication of the severity of this message: <enumValues> <value
     * name="error"> <p> error: This message indicates that this is not a
     * valid setting for an option. </value> <value name="warning"> <p>
     * warning: This message is providing information you should take into
     * account. </value> </enumValues> <ul> <li> error: This message
     * indicates that this is not a valid setting for an option. </li> <li>
     * warning: This message is providing information you should take into
     * account. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, warning
     *
     * @param severity An indication of the severity of this message: <enumValues> <value
     *         name="error"> <p> error: This message indicates that this is not a
     *         valid setting for an option. </value> <value name="warning"> <p>
     *         warning: This message is providing information you should take into
     *         account. </value> </enumValues> <ul> <li> error: This message
     *         indicates that this is not a valid setting for an option. </li> <li>
     *         warning: This message is providing information you should take into
     *         account. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ValidationSeverity
     */
    public ValidationMessage withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * An indication of the severity of this message: <enumValues> <value
     * name="error"> <p> error: This message indicates that this is not a
     * valid setting for an option. </value> <value name="warning"> <p>
     * warning: This message is providing information you should take into
     * account. </value> </enumValues> <ul> <li> error: This message
     * indicates that this is not a valid setting for an option. </li> <li>
     * warning: This message is providing information you should take into
     * account. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, warning
     *
     * @param severity An indication of the severity of this message: <enumValues> <value
     *         name="error"> <p> error: This message indicates that this is not a
     *         valid setting for an option. </value> <value name="warning"> <p>
     *         warning: This message is providing information you should take into
     *         account. </value> </enumValues> <ul> <li> error: This message
     *         indicates that this is not a valid setting for an option. </li> <li>
     *         warning: This message is providing information you should take into
     *         account. </li> </ul>
     *
     * @see ValidationSeverity
     */
    public void setSeverity(ValidationSeverity severity) {
        this.severity = severity.toString();
    }
    
    /**
     * An indication of the severity of this message: <enumValues> <value
     * name="error"> <p> error: This message indicates that this is not a
     * valid setting for an option. </value> <value name="warning"> <p>
     * warning: This message is providing information you should take into
     * account. </value> </enumValues> <ul> <li> error: This message
     * indicates that this is not a valid setting for an option. </li> <li>
     * warning: This message is providing information you should take into
     * account. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, warning
     *
     * @param severity An indication of the severity of this message: <enumValues> <value
     *         name="error"> <p> error: This message indicates that this is not a
     *         valid setting for an option. </value> <value name="warning"> <p>
     *         warning: This message is providing information you should take into
     *         account. </value> </enumValues> <ul> <li> error: This message
     *         indicates that this is not a valid setting for an option. </li> <li>
     *         warning: This message is providing information you should take into
     *         account. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ValidationSeverity
     */
    public ValidationMessage withSeverity(ValidationSeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * 
     *
     * @return 
     */
    public String getNamespace() {
        return namespace;
    }
    
    /**
     * 
     *
     * @param namespace 
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param namespace 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ValidationMessage withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 
     *
     * @return 
     */
    public String getOptionName() {
        return optionName;
    }
    
    /**
     * 
     *
     * @param optionName 
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionName 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ValidationMessage withOptionName(String optionName) {
        this.optionName = optionName;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMessage() != null) sb.append("Message: " + getMessage() + ",");
        if (getSeverity() != null) sb.append("Severity: " + getSeverity() + ",");
        if (getNamespace() != null) sb.append("Namespace: " + getNamespace() + ",");
        if (getOptionName() != null) sb.append("OptionName: " + getOptionName() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ValidationMessage == false) return false;
        ValidationMessage other = (ValidationMessage)obj;
        
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        if (other.getSeverity() == null ^ this.getSeverity() == null) return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false) return false; 
        if (other.getNamespace() == null ^ this.getNamespace() == null) return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false) return false; 
        if (other.getOptionName() == null ^ this.getOptionName() == null) return false;
        if (other.getOptionName() != null && other.getOptionName().equals(this.getOptionName()) == false) return false; 
        return true;
    }
    
}
    