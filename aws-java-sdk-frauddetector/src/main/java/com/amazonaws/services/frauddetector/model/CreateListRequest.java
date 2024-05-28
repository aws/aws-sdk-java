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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateListRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the list.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The names of the elements, if providing. You can also create an empty list and add elements later using the <a
     * href="https://docs.aws.amazon.com/frauddetector/latest/api/API_Updatelist.html">UpdateList</a> API.
     * </p>
     */
    private java.util.List<String> elements;
    /**
     * <p>
     * The variable type of the list. You can only assign the variable type with String data type. For more information,
     * see <a href="https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types">Variable
     * types</a>.
     * </p>
     */
    private String variableType;
    /**
     * <p>
     * The description of the list.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A collection of the key and value pairs.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the list.
     * </p>
     * 
     * @param name
     *        The name of the list.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the list.
     * </p>
     * 
     * @return The name of the list.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the list.
     * </p>
     * 
     * @param name
     *        The name of the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The names of the elements, if providing. You can also create an empty list and add elements later using the <a
     * href="https://docs.aws.amazon.com/frauddetector/latest/api/API_Updatelist.html">UpdateList</a> API.
     * </p>
     * 
     * @return The names of the elements, if providing. You can also create an empty list and add elements later using
     *         the <a href="https://docs.aws.amazon.com/frauddetector/latest/api/API_Updatelist.html">UpdateList</a>
     *         API.
     */

    public java.util.List<String> getElements() {
        return elements;
    }

    /**
     * <p>
     * The names of the elements, if providing. You can also create an empty list and add elements later using the <a
     * href="https://docs.aws.amazon.com/frauddetector/latest/api/API_Updatelist.html">UpdateList</a> API.
     * </p>
     * 
     * @param elements
     *        The names of the elements, if providing. You can also create an empty list and add elements later using
     *        the <a href="https://docs.aws.amazon.com/frauddetector/latest/api/API_Updatelist.html">UpdateList</a> API.
     */

    public void setElements(java.util.Collection<String> elements) {
        if (elements == null) {
            this.elements = null;
            return;
        }

        this.elements = new java.util.ArrayList<String>(elements);
    }

    /**
     * <p>
     * The names of the elements, if providing. You can also create an empty list and add elements later using the <a
     * href="https://docs.aws.amazon.com/frauddetector/latest/api/API_Updatelist.html">UpdateList</a> API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElements(java.util.Collection)} or {@link #withElements(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param elements
     *        The names of the elements, if providing. You can also create an empty list and add elements later using
     *        the <a href="https://docs.aws.amazon.com/frauddetector/latest/api/API_Updatelist.html">UpdateList</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListRequest withElements(String... elements) {
        if (this.elements == null) {
            setElements(new java.util.ArrayList<String>(elements.length));
        }
        for (String ele : elements) {
            this.elements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the elements, if providing. You can also create an empty list and add elements later using the <a
     * href="https://docs.aws.amazon.com/frauddetector/latest/api/API_Updatelist.html">UpdateList</a> API.
     * </p>
     * 
     * @param elements
     *        The names of the elements, if providing. You can also create an empty list and add elements later using
     *        the <a href="https://docs.aws.amazon.com/frauddetector/latest/api/API_Updatelist.html">UpdateList</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListRequest withElements(java.util.Collection<String> elements) {
        setElements(elements);
        return this;
    }

    /**
     * <p>
     * The variable type of the list. You can only assign the variable type with String data type. For more information,
     * see <a href="https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types">Variable
     * types</a>.
     * </p>
     * 
     * @param variableType
     *        The variable type of the list. You can only assign the variable type with String data type. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types">Variable
     *        types</a>.
     */

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    /**
     * <p>
     * The variable type of the list. You can only assign the variable type with String data type. For more information,
     * see <a href="https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types">Variable
     * types</a>.
     * </p>
     * 
     * @return The variable type of the list. You can only assign the variable type with String data type. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types">Variable
     *         types</a>.
     */

    public String getVariableType() {
        return this.variableType;
    }

    /**
     * <p>
     * The variable type of the list. You can only assign the variable type with String data type. For more information,
     * see <a href="https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types">Variable
     * types</a>.
     * </p>
     * 
     * @param variableType
     *        The variable type of the list. You can only assign the variable type with String data type. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types">Variable
     *        types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListRequest withVariableType(String variableType) {
        setVariableType(variableType);
        return this;
    }

    /**
     * <p>
     * The description of the list.
     * </p>
     * 
     * @param description
     *        The description of the list.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the list.
     * </p>
     * 
     * @return The description of the list.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the list.
     * </p>
     * 
     * @param description
     *        The description of the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A collection of the key and value pairs.
     * </p>
     * 
     * @return A collection of the key and value pairs.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of the key and value pairs.
     * </p>
     * 
     * @param tags
     *        A collection of the key and value pairs.
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
     * A collection of the key and value pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A collection of the key and value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListRequest withTags(Tag... tags) {
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
     * A collection of the key and value pairs.
     * </p>
     * 
     * @param tags
     *        A collection of the key and value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getElements() != null)
            sb.append("Elements: ").append("***Sensitive Data Redacted***").append(",");
        if (getVariableType() != null)
            sb.append("VariableType: ").append(getVariableType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CreateListRequest == false)
            return false;
        CreateListRequest other = (CreateListRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getElements() == null ^ this.getElements() == null)
            return false;
        if (other.getElements() != null && other.getElements().equals(this.getElements()) == false)
            return false;
        if (other.getVariableType() == null ^ this.getVariableType() == null)
            return false;
        if (other.getVariableType() != null && other.getVariableType().equals(this.getVariableType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getElements() == null) ? 0 : getElements().hashCode());
        hashCode = prime * hashCode + ((getVariableType() == null) ? 0 : getVariableType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateListRequest clone() {
        return (CreateListRequest) super.clone();
    }

}
