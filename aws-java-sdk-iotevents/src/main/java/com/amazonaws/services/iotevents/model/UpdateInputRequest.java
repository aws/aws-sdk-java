/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/UpdateInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the input you want to update.
     * </p>
     */
    private String inputName;
    /**
     * <p>
     * A brief description of the input.
     * </p>
     */
    private String inputDescription;
    /**
     * <p>
     * The definition of the input.
     * </p>
     */
    private InputDefinition inputDefinition;

    /**
     * <p>
     * The name of the input you want to update.
     * </p>
     * 
     * @param inputName
     *        The name of the input you want to update.
     */

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * <p>
     * The name of the input you want to update.
     * </p>
     * 
     * @return The name of the input you want to update.
     */

    public String getInputName() {
        return this.inputName;
    }

    /**
     * <p>
     * The name of the input you want to update.
     * </p>
     * 
     * @param inputName
     *        The name of the input you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInputRequest withInputName(String inputName) {
        setInputName(inputName);
        return this;
    }

    /**
     * <p>
     * A brief description of the input.
     * </p>
     * 
     * @param inputDescription
     *        A brief description of the input.
     */

    public void setInputDescription(String inputDescription) {
        this.inputDescription = inputDescription;
    }

    /**
     * <p>
     * A brief description of the input.
     * </p>
     * 
     * @return A brief description of the input.
     */

    public String getInputDescription() {
        return this.inputDescription;
    }

    /**
     * <p>
     * A brief description of the input.
     * </p>
     * 
     * @param inputDescription
     *        A brief description of the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInputRequest withInputDescription(String inputDescription) {
        setInputDescription(inputDescription);
        return this;
    }

    /**
     * <p>
     * The definition of the input.
     * </p>
     * 
     * @param inputDefinition
     *        The definition of the input.
     */

    public void setInputDefinition(InputDefinition inputDefinition) {
        this.inputDefinition = inputDefinition;
    }

    /**
     * <p>
     * The definition of the input.
     * </p>
     * 
     * @return The definition of the input.
     */

    public InputDefinition getInputDefinition() {
        return this.inputDefinition;
    }

    /**
     * <p>
     * The definition of the input.
     * </p>
     * 
     * @param inputDefinition
     *        The definition of the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInputRequest withInputDefinition(InputDefinition inputDefinition) {
        setInputDefinition(inputDefinition);
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
        if (getInputName() != null)
            sb.append("InputName: ").append(getInputName()).append(",");
        if (getInputDescription() != null)
            sb.append("InputDescription: ").append(getInputDescription()).append(",");
        if (getInputDefinition() != null)
            sb.append("InputDefinition: ").append(getInputDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInputRequest == false)
            return false;
        UpdateInputRequest other = (UpdateInputRequest) obj;
        if (other.getInputName() == null ^ this.getInputName() == null)
            return false;
        if (other.getInputName() != null && other.getInputName().equals(this.getInputName()) == false)
            return false;
        if (other.getInputDescription() == null ^ this.getInputDescription() == null)
            return false;
        if (other.getInputDescription() != null && other.getInputDescription().equals(this.getInputDescription()) == false)
            return false;
        if (other.getInputDefinition() == null ^ this.getInputDefinition() == null)
            return false;
        if (other.getInputDefinition() != null && other.getInputDefinition().equals(this.getInputDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputName() == null) ? 0 : getInputName().hashCode());
        hashCode = prime * hashCode + ((getInputDescription() == null) ? 0 : getInputDescription().hashCode());
        hashCode = prime * hashCode + ((getInputDefinition() == null) ? 0 : getInputDefinition().hashCode());
        return hashCode;
    }

    @Override
    public UpdateInputRequest clone() {
        return (UpdateInputRequest) super.clone();
    }

}
