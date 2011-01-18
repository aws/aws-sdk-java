/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * An error or warning for a desired configuration option value.
 * </p>
 */
public class ValidationMessage {

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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String namespace;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
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
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return 
     */
    public String getNamespace() {
        return namespace;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return 
     */
    public String getOptionName() {
        return optionName;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
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
        sb.append("Message: " + message + ", ");
        sb.append("Severity: " + severity + ", ");
        sb.append("Namespace: " + namespace + ", ");
        sb.append("OptionName: " + optionName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    