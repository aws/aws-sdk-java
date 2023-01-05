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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The status that operation results are filtered by.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/OperationResultFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OperationResultFilter implements Serializable, Cloneable {

    /**
     * <p>
     * The type of filter to apply.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value to filter by.
     * </p>
     */
    private String values;

    /**
     * <p>
     * The type of filter to apply.
     * </p>
     * 
     * @param name
     *        The type of filter to apply.
     * @see OperationResultFilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The type of filter to apply.
     * </p>
     * 
     * @return The type of filter to apply.
     * @see OperationResultFilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The type of filter to apply.
     * </p>
     * 
     * @param name
     *        The type of filter to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationResultFilterName
     */

    public OperationResultFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of filter to apply.
     * </p>
     * 
     * @param name
     *        The type of filter to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationResultFilterName
     */

    public OperationResultFilter withName(OperationResultFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value to filter by.
     * </p>
     * 
     * @param values
     *        The value to filter by.
     */

    public void setValues(String values) {
        this.values = values;
    }

    /**
     * <p>
     * The value to filter by.
     * </p>
     * 
     * @return The value to filter by.
     */

    public String getValues() {
        return this.values;
    }

    /**
     * <p>
     * The value to filter by.
     * </p>
     * 
     * @param values
     *        The value to filter by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperationResultFilter withValues(String values) {
        setValues(values);
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
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OperationResultFilter == false)
            return false;
        OperationResultFilter other = (OperationResultFilter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public OperationResultFilter clone() {
        try {
            return (OperationResultFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
