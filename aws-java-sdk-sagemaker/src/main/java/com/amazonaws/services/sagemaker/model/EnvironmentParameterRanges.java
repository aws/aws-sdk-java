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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the range of environment parameters
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EnvironmentParameterRanges"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentParameterRanges implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specified a list of parameters for each category.
     * </p>
     */
    private java.util.List<CategoricalParameter> categoricalParameterRanges;

    /**
     * <p>
     * Specified a list of parameters for each category.
     * </p>
     * 
     * @return Specified a list of parameters for each category.
     */

    public java.util.List<CategoricalParameter> getCategoricalParameterRanges() {
        return categoricalParameterRanges;
    }

    /**
     * <p>
     * Specified a list of parameters for each category.
     * </p>
     * 
     * @param categoricalParameterRanges
     *        Specified a list of parameters for each category.
     */

    public void setCategoricalParameterRanges(java.util.Collection<CategoricalParameter> categoricalParameterRanges) {
        if (categoricalParameterRanges == null) {
            this.categoricalParameterRanges = null;
            return;
        }

        this.categoricalParameterRanges = new java.util.ArrayList<CategoricalParameter>(categoricalParameterRanges);
    }

    /**
     * <p>
     * Specified a list of parameters for each category.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategoricalParameterRanges(java.util.Collection)} or
     * {@link #withCategoricalParameterRanges(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param categoricalParameterRanges
     *        Specified a list of parameters for each category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentParameterRanges withCategoricalParameterRanges(CategoricalParameter... categoricalParameterRanges) {
        if (this.categoricalParameterRanges == null) {
            setCategoricalParameterRanges(new java.util.ArrayList<CategoricalParameter>(categoricalParameterRanges.length));
        }
        for (CategoricalParameter ele : categoricalParameterRanges) {
            this.categoricalParameterRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specified a list of parameters for each category.
     * </p>
     * 
     * @param categoricalParameterRanges
     *        Specified a list of parameters for each category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentParameterRanges withCategoricalParameterRanges(java.util.Collection<CategoricalParameter> categoricalParameterRanges) {
        setCategoricalParameterRanges(categoricalParameterRanges);
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
        if (getCategoricalParameterRanges() != null)
            sb.append("CategoricalParameterRanges: ").append(getCategoricalParameterRanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentParameterRanges == false)
            return false;
        EnvironmentParameterRanges other = (EnvironmentParameterRanges) obj;
        if (other.getCategoricalParameterRanges() == null ^ this.getCategoricalParameterRanges() == null)
            return false;
        if (other.getCategoricalParameterRanges() != null && other.getCategoricalParameterRanges().equals(this.getCategoricalParameterRanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategoricalParameterRanges() == null) ? 0 : getCategoricalParameterRanges().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentParameterRanges clone() {
        try {
            return (EnvironmentParameterRanges) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EnvironmentParameterRangesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
