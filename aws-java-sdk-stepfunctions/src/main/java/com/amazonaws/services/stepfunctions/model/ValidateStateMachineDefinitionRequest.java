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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ValidateStateMachineDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateStateMachineDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon States Language definition of the state machine. For more information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a> (ASL).
     * </p>
     */
    private String definition;
    /**
     * <p>
     * The target type of state machine for this definition. The default is <code>STANDARD</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The Amazon States Language definition of the state machine. For more information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a> (ASL).
     * </p>
     * 
     * @param definition
     *        The Amazon States Language definition of the state machine. For more information, see <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     *        States Language</a> (ASL).
     */

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine. For more information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a> (ASL).
     * </p>
     * 
     * @return The Amazon States Language definition of the state machine. For more information, see <a
     *         href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     *         States Language</a> (ASL).
     */

    public String getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine. For more information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a> (ASL).
     * </p>
     * 
     * @param definition
     *        The Amazon States Language definition of the state machine. For more information, see <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     *        States Language</a> (ASL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateStateMachineDefinitionRequest withDefinition(String definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The target type of state machine for this definition. The default is <code>STANDARD</code>.
     * </p>
     * 
     * @param type
     *        The target type of state machine for this definition. The default is <code>STANDARD</code>.
     * @see StateMachineType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The target type of state machine for this definition. The default is <code>STANDARD</code>.
     * </p>
     * 
     * @return The target type of state machine for this definition. The default is <code>STANDARD</code>.
     * @see StateMachineType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The target type of state machine for this definition. The default is <code>STANDARD</code>.
     * </p>
     * 
     * @param type
     *        The target type of state machine for this definition. The default is <code>STANDARD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateMachineType
     */

    public ValidateStateMachineDefinitionRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The target type of state machine for this definition. The default is <code>STANDARD</code>.
     * </p>
     * 
     * @param type
     *        The target type of state machine for this definition. The default is <code>STANDARD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateMachineType
     */

    public ValidateStateMachineDefinitionRequest withType(StateMachineType type) {
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
        if (getDefinition() != null)
            sb.append("Definition: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof ValidateStateMachineDefinitionRequest == false)
            return false;
        ValidateStateMachineDefinitionRequest other = (ValidateStateMachineDefinitionRequest) obj;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
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

        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ValidateStateMachineDefinitionRequest clone() {
        return (ValidateStateMachineDefinitionRequest) super.clone();
    }

}
