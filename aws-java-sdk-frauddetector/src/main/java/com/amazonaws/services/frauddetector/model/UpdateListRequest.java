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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateListRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the list to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * One or more list elements to add or replace. If you are providing the elements, make sure to specify the
     * <code>updateMode</code> to use.
     * </p>
     * <p>
     * If you are deleting all elements from the list, use <code>REPLACE</code> for the <code>updateMode</code> and
     * provide an empty list (0 elements).
     * </p>
     */
    private java.util.List<String> elements;
    /**
     * <p>
     * The new description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The update mode (type).
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>APPEND</code> if you are adding elements to the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>REPLACE</code> if you replacing existing elements in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>REMOVE</code> if you are removing elements from the list.
     * </p>
     * </li>
     * </ul>
     */
    private String updateMode;
    /**
     * <p>
     * The variable type you want to assign to the list.
     * </p>
     * <note>
     * <p>
     * You cannot update a variable type of a list that already has a variable type assigned to it. You can assign a
     * variable type to a list only if the list does not already have a variable type.
     * </p>
     * </note>
     */
    private String variableType;

    /**
     * <p>
     * The name of the list to update.
     * </p>
     * 
     * @param name
     *        The name of the list to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the list to update.
     * </p>
     * 
     * @return The name of the list to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the list to update.
     * </p>
     * 
     * @param name
     *        The name of the list to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateListRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * One or more list elements to add or replace. If you are providing the elements, make sure to specify the
     * <code>updateMode</code> to use.
     * </p>
     * <p>
     * If you are deleting all elements from the list, use <code>REPLACE</code> for the <code>updateMode</code> and
     * provide an empty list (0 elements).
     * </p>
     * 
     * @return One or more list elements to add or replace. If you are providing the elements, make sure to specify the
     *         <code>updateMode</code> to use. </p>
     *         <p>
     *         If you are deleting all elements from the list, use <code>REPLACE</code> for the <code>updateMode</code>
     *         and provide an empty list (0 elements).
     */

    public java.util.List<String> getElements() {
        return elements;
    }

    /**
     * <p>
     * One or more list elements to add or replace. If you are providing the elements, make sure to specify the
     * <code>updateMode</code> to use.
     * </p>
     * <p>
     * If you are deleting all elements from the list, use <code>REPLACE</code> for the <code>updateMode</code> and
     * provide an empty list (0 elements).
     * </p>
     * 
     * @param elements
     *        One or more list elements to add or replace. If you are providing the elements, make sure to specify the
     *        <code>updateMode</code> to use. </p>
     *        <p>
     *        If you are deleting all elements from the list, use <code>REPLACE</code> for the <code>updateMode</code>
     *        and provide an empty list (0 elements).
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
     * One or more list elements to add or replace. If you are providing the elements, make sure to specify the
     * <code>updateMode</code> to use.
     * </p>
     * <p>
     * If you are deleting all elements from the list, use <code>REPLACE</code> for the <code>updateMode</code> and
     * provide an empty list (0 elements).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElements(java.util.Collection)} or {@link #withElements(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param elements
     *        One or more list elements to add or replace. If you are providing the elements, make sure to specify the
     *        <code>updateMode</code> to use. </p>
     *        <p>
     *        If you are deleting all elements from the list, use <code>REPLACE</code> for the <code>updateMode</code>
     *        and provide an empty list (0 elements).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateListRequest withElements(String... elements) {
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
     * One or more list elements to add or replace. If you are providing the elements, make sure to specify the
     * <code>updateMode</code> to use.
     * </p>
     * <p>
     * If you are deleting all elements from the list, use <code>REPLACE</code> for the <code>updateMode</code> and
     * provide an empty list (0 elements).
     * </p>
     * 
     * @param elements
     *        One or more list elements to add or replace. If you are providing the elements, make sure to specify the
     *        <code>updateMode</code> to use. </p>
     *        <p>
     *        If you are deleting all elements from the list, use <code>REPLACE</code> for the <code>updateMode</code>
     *        and provide an empty list (0 elements).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateListRequest withElements(java.util.Collection<String> elements) {
        setElements(elements);
        return this;
    }

    /**
     * <p>
     * The new description.
     * </p>
     * 
     * @param description
     *        The new description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description.
     * </p>
     * 
     * @return The new description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new description.
     * </p>
     * 
     * @param description
     *        The new description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateListRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The update mode (type).
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>APPEND</code> if you are adding elements to the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>REPLACE</code> if you replacing existing elements in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>REMOVE</code> if you are removing elements from the list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateMode
     *        The update mode (type). </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use <code>APPEND</code> if you are adding elements to the list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>REPLACE</code> if you replacing existing elements in the list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>REMOVE</code> if you are removing elements from the list.
     *        </p>
     *        </li>
     * @see ListUpdateMode
     */

    public void setUpdateMode(String updateMode) {
        this.updateMode = updateMode;
    }

    /**
     * <p>
     * The update mode (type).
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>APPEND</code> if you are adding elements to the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>REPLACE</code> if you replacing existing elements in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>REMOVE</code> if you are removing elements from the list.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The update mode (type). </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Use <code>APPEND</code> if you are adding elements to the list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use <code>REPLACE</code> if you replacing existing elements in the list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use <code>REMOVE</code> if you are removing elements from the list.
     *         </p>
     *         </li>
     * @see ListUpdateMode
     */

    public String getUpdateMode() {
        return this.updateMode;
    }

    /**
     * <p>
     * The update mode (type).
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>APPEND</code> if you are adding elements to the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>REPLACE</code> if you replacing existing elements in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>REMOVE</code> if you are removing elements from the list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateMode
     *        The update mode (type). </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use <code>APPEND</code> if you are adding elements to the list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>REPLACE</code> if you replacing existing elements in the list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>REMOVE</code> if you are removing elements from the list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListUpdateMode
     */

    public UpdateListRequest withUpdateMode(String updateMode) {
        setUpdateMode(updateMode);
        return this;
    }

    /**
     * <p>
     * The update mode (type).
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>APPEND</code> if you are adding elements to the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>REPLACE</code> if you replacing existing elements in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>REMOVE</code> if you are removing elements from the list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateMode
     *        The update mode (type). </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use <code>APPEND</code> if you are adding elements to the list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>REPLACE</code> if you replacing existing elements in the list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>REMOVE</code> if you are removing elements from the list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListUpdateMode
     */

    public UpdateListRequest withUpdateMode(ListUpdateMode updateMode) {
        this.updateMode = updateMode.toString();
        return this;
    }

    /**
     * <p>
     * The variable type you want to assign to the list.
     * </p>
     * <note>
     * <p>
     * You cannot update a variable type of a list that already has a variable type assigned to it. You can assign a
     * variable type to a list only if the list does not already have a variable type.
     * </p>
     * </note>
     * 
     * @param variableType
     *        The variable type you want to assign to the list. </p> <note>
     *        <p>
     *        You cannot update a variable type of a list that already has a variable type assigned to it. You can
     *        assign a variable type to a list only if the list does not already have a variable type.
     *        </p>
     */

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    /**
     * <p>
     * The variable type you want to assign to the list.
     * </p>
     * <note>
     * <p>
     * You cannot update a variable type of a list that already has a variable type assigned to it. You can assign a
     * variable type to a list only if the list does not already have a variable type.
     * </p>
     * </note>
     * 
     * @return The variable type you want to assign to the list. </p> <note>
     *         <p>
     *         You cannot update a variable type of a list that already has a variable type assigned to it. You can
     *         assign a variable type to a list only if the list does not already have a variable type.
     *         </p>
     */

    public String getVariableType() {
        return this.variableType;
    }

    /**
     * <p>
     * The variable type you want to assign to the list.
     * </p>
     * <note>
     * <p>
     * You cannot update a variable type of a list that already has a variable type assigned to it. You can assign a
     * variable type to a list only if the list does not already have a variable type.
     * </p>
     * </note>
     * 
     * @param variableType
     *        The variable type you want to assign to the list. </p> <note>
     *        <p>
     *        You cannot update a variable type of a list that already has a variable type assigned to it. You can
     *        assign a variable type to a list only if the list does not already have a variable type.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateListRequest withVariableType(String variableType) {
        setVariableType(variableType);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getUpdateMode() != null)
            sb.append("UpdateMode: ").append(getUpdateMode()).append(",");
        if (getVariableType() != null)
            sb.append("VariableType: ").append(getVariableType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateListRequest == false)
            return false;
        UpdateListRequest other = (UpdateListRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getElements() == null ^ this.getElements() == null)
            return false;
        if (other.getElements() != null && other.getElements().equals(this.getElements()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUpdateMode() == null ^ this.getUpdateMode() == null)
            return false;
        if (other.getUpdateMode() != null && other.getUpdateMode().equals(this.getUpdateMode()) == false)
            return false;
        if (other.getVariableType() == null ^ this.getVariableType() == null)
            return false;
        if (other.getVariableType() != null && other.getVariableType().equals(this.getVariableType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getElements() == null) ? 0 : getElements().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUpdateMode() == null) ? 0 : getUpdateMode().hashCode());
        hashCode = prime * hashCode + ((getVariableType() == null) ? 0 : getVariableType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateListRequest clone() {
        return (UpdateListRequest) super.clone();
    }

}
