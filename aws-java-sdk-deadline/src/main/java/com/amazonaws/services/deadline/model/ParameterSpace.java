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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a search for two or more step parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ParameterSpace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterSpace implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The combination expression to use in the search.
     * </p>
     */
    private String combination;
    /**
     * <p>
     * The parameters to search for.
     * </p>
     */
    private java.util.List<StepParameter> parameters;

    /**
     * <p>
     * The combination expression to use in the search.
     * </p>
     * 
     * @param combination
     *        The combination expression to use in the search.
     */

    public void setCombination(String combination) {
        this.combination = combination;
    }

    /**
     * <p>
     * The combination expression to use in the search.
     * </p>
     * 
     * @return The combination expression to use in the search.
     */

    public String getCombination() {
        return this.combination;
    }

    /**
     * <p>
     * The combination expression to use in the search.
     * </p>
     * 
     * @param combination
     *        The combination expression to use in the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterSpace withCombination(String combination) {
        setCombination(combination);
        return this;
    }

    /**
     * <p>
     * The parameters to search for.
     * </p>
     * 
     * @return The parameters to search for.
     */

    public java.util.List<StepParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters to search for.
     * </p>
     * 
     * @param parameters
     *        The parameters to search for.
     */

    public void setParameters(java.util.Collection<StepParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<StepParameter>(parameters);
    }

    /**
     * <p>
     * The parameters to search for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        The parameters to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterSpace withParameters(StepParameter... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<StepParameter>(parameters.length));
        }
        for (StepParameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The parameters to search for.
     * </p>
     * 
     * @param parameters
     *        The parameters to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterSpace withParameters(java.util.Collection<StepParameter> parameters) {
        setParameters(parameters);
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
        if (getCombination() != null)
            sb.append("Combination: ").append(getCombination()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterSpace == false)
            return false;
        ParameterSpace other = (ParameterSpace) obj;
        if (other.getCombination() == null ^ this.getCombination() == null)
            return false;
        if (other.getCombination() != null && other.getCombination().equals(this.getCombination()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCombination() == null) ? 0 : getCombination().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public ParameterSpace clone() {
        try {
            return (ParameterSpace) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.ParameterSpaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
