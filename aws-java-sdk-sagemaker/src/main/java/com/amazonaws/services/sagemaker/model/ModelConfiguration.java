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
 * Defines the model configuration. Includes the specification name and environment parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The inference specification name in the model package version.
     * </p>
     */
    private String inferenceSpecificationName;
    /**
     * <p>
     * Defines the environment parameters that includes key, value types, and values.
     * </p>
     */
    private java.util.List<EnvironmentParameter> environmentParameters;

    /**
     * <p>
     * The inference specification name in the model package version.
     * </p>
     * 
     * @param inferenceSpecificationName
     *        The inference specification name in the model package version.
     */

    public void setInferenceSpecificationName(String inferenceSpecificationName) {
        this.inferenceSpecificationName = inferenceSpecificationName;
    }

    /**
     * <p>
     * The inference specification name in the model package version.
     * </p>
     * 
     * @return The inference specification name in the model package version.
     */

    public String getInferenceSpecificationName() {
        return this.inferenceSpecificationName;
    }

    /**
     * <p>
     * The inference specification name in the model package version.
     * </p>
     * 
     * @param inferenceSpecificationName
     *        The inference specification name in the model package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelConfiguration withInferenceSpecificationName(String inferenceSpecificationName) {
        setInferenceSpecificationName(inferenceSpecificationName);
        return this;
    }

    /**
     * <p>
     * Defines the environment parameters that includes key, value types, and values.
     * </p>
     * 
     * @return Defines the environment parameters that includes key, value types, and values.
     */

    public java.util.List<EnvironmentParameter> getEnvironmentParameters() {
        return environmentParameters;
    }

    /**
     * <p>
     * Defines the environment parameters that includes key, value types, and values.
     * </p>
     * 
     * @param environmentParameters
     *        Defines the environment parameters that includes key, value types, and values.
     */

    public void setEnvironmentParameters(java.util.Collection<EnvironmentParameter> environmentParameters) {
        if (environmentParameters == null) {
            this.environmentParameters = null;
            return;
        }

        this.environmentParameters = new java.util.ArrayList<EnvironmentParameter>(environmentParameters);
    }

    /**
     * <p>
     * Defines the environment parameters that includes key, value types, and values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironmentParameters(java.util.Collection)} or
     * {@link #withEnvironmentParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param environmentParameters
     *        Defines the environment parameters that includes key, value types, and values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelConfiguration withEnvironmentParameters(EnvironmentParameter... environmentParameters) {
        if (this.environmentParameters == null) {
            setEnvironmentParameters(new java.util.ArrayList<EnvironmentParameter>(environmentParameters.length));
        }
        for (EnvironmentParameter ele : environmentParameters) {
            this.environmentParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines the environment parameters that includes key, value types, and values.
     * </p>
     * 
     * @param environmentParameters
     *        Defines the environment parameters that includes key, value types, and values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelConfiguration withEnvironmentParameters(java.util.Collection<EnvironmentParameter> environmentParameters) {
        setEnvironmentParameters(environmentParameters);
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
        if (getInferenceSpecificationName() != null)
            sb.append("InferenceSpecificationName: ").append(getInferenceSpecificationName()).append(",");
        if (getEnvironmentParameters() != null)
            sb.append("EnvironmentParameters: ").append(getEnvironmentParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelConfiguration == false)
            return false;
        ModelConfiguration other = (ModelConfiguration) obj;
        if (other.getInferenceSpecificationName() == null ^ this.getInferenceSpecificationName() == null)
            return false;
        if (other.getInferenceSpecificationName() != null && other.getInferenceSpecificationName().equals(this.getInferenceSpecificationName()) == false)
            return false;
        if (other.getEnvironmentParameters() == null ^ this.getEnvironmentParameters() == null)
            return false;
        if (other.getEnvironmentParameters() != null && other.getEnvironmentParameters().equals(this.getEnvironmentParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInferenceSpecificationName() == null) ? 0 : getInferenceSpecificationName().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentParameters() == null) ? 0 : getEnvironmentParameters().hashCode());
        return hashCode;
    }

    @Override
    public ModelConfiguration clone() {
        try {
            return (ModelConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
