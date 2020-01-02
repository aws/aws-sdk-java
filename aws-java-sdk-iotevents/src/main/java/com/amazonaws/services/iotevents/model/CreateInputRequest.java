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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/CreateInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name you want to give to the input.
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
     * Metadata that can be used to manage the input.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name you want to give to the input.
     * </p>
     * 
     * @param inputName
     *        The name you want to give to the input.
     */

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * <p>
     * The name you want to give to the input.
     * </p>
     * 
     * @return The name you want to give to the input.
     */

    public String getInputName() {
        return this.inputName;
    }

    /**
     * <p>
     * The name you want to give to the input.
     * </p>
     * 
     * @param inputName
     *        The name you want to give to the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withInputName(String inputName) {
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

    public CreateInputRequest withInputDescription(String inputDescription) {
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

    public CreateInputRequest withInputDefinition(InputDefinition inputDefinition) {
        setInputDefinition(inputDefinition);
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the input.
     * </p>
     * 
     * @return Metadata that can be used to manage the input.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the input.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the input.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata that can be used to manage the input.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the input.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInputRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
            sb.append("InputDefinition: ").append(getInputDefinition()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInputRequest == false)
            return false;
        CreateInputRequest other = (CreateInputRequest) obj;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateInputRequest clone() {
        return (CreateInputRequest) super.clone();
    }

}
