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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UpdateParameterGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateParameterGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     */
    private String parameterGroupName;
    /**
     * <p>
     * An array of name-value pairs for the parameters in the group. Each element in the array represents a single
     * parameter.
     * </p>
     */
    private java.util.List<ParameterNameValue> parameterNameValues;

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group.
     */

    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     * 
     * @return The name of the parameter group.
     */

    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateParameterGroupRequest withParameterGroupName(String parameterGroupName) {
        setParameterGroupName(parameterGroupName);
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs for the parameters in the group. Each element in the array represents a single
     * parameter.
     * </p>
     * 
     * @return An array of name-value pairs for the parameters in the group. Each element in the array represents a
     *         single parameter.
     */

    public java.util.List<ParameterNameValue> getParameterNameValues() {
        return parameterNameValues;
    }

    /**
     * <p>
     * An array of name-value pairs for the parameters in the group. Each element in the array represents a single
     * parameter.
     * </p>
     * 
     * @param parameterNameValues
     *        An array of name-value pairs for the parameters in the group. Each element in the array represents a
     *        single parameter.
     */

    public void setParameterNameValues(java.util.Collection<ParameterNameValue> parameterNameValues) {
        if (parameterNameValues == null) {
            this.parameterNameValues = null;
            return;
        }

        this.parameterNameValues = new java.util.ArrayList<ParameterNameValue>(parameterNameValues);
    }

    /**
     * <p>
     * An array of name-value pairs for the parameters in the group. Each element in the array represents a single
     * parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterNameValues(java.util.Collection)} or {@link #withParameterNameValues(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param parameterNameValues
     *        An array of name-value pairs for the parameters in the group. Each element in the array represents a
     *        single parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateParameterGroupRequest withParameterNameValues(ParameterNameValue... parameterNameValues) {
        if (this.parameterNameValues == null) {
            setParameterNameValues(new java.util.ArrayList<ParameterNameValue>(parameterNameValues.length));
        }
        for (ParameterNameValue ele : parameterNameValues) {
            this.parameterNameValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs for the parameters in the group. Each element in the array represents a single
     * parameter.
     * </p>
     * 
     * @param parameterNameValues
     *        An array of name-value pairs for the parameters in the group. Each element in the array represents a
     *        single parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateParameterGroupRequest withParameterNameValues(java.util.Collection<ParameterNameValue> parameterNameValues) {
        setParameterNameValues(parameterNameValues);
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
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: ").append(getParameterGroupName()).append(",");
        if (getParameterNameValues() != null)
            sb.append("ParameterNameValues: ").append(getParameterNameValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateParameterGroupRequest == false)
            return false;
        UpdateParameterGroupRequest other = (UpdateParameterGroupRequest) obj;
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getParameterNameValues() == null ^ this.getParameterNameValues() == null)
            return false;
        if (other.getParameterNameValues() != null && other.getParameterNameValues().equals(this.getParameterNameValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getParameterNameValues() == null) ? 0 : getParameterNameValues().hashCode());
        return hashCode;
    }

    @Override
    public UpdateParameterGroupRequest clone() {
        return (UpdateParameterGroupRequest) super.clone();
    }

}
