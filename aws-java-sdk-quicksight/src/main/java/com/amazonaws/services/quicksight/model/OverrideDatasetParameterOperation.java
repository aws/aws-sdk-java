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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A transform operation that overrides the dataset parameter values that are defined in another dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/OverrideDatasetParameterOperation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OverrideDatasetParameterOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the parameter to be overridden with different values.
     * </p>
     */
    private String parameterName;
    /**
     * <p>
     * The new name for the parameter.
     * </p>
     */
    private String newParameterName;
    /**
     * <p>
     * The new default values for the parameter.
     * </p>
     */
    private NewDefaultValues newDefaultValues;

    /**
     * <p>
     * The name of the parameter to be overridden with different values.
     * </p>
     * 
     * @param parameterName
     *        The name of the parameter to be overridden with different values.
     */

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p>
     * The name of the parameter to be overridden with different values.
     * </p>
     * 
     * @return The name of the parameter to be overridden with different values.
     */

    public String getParameterName() {
        return this.parameterName;
    }

    /**
     * <p>
     * The name of the parameter to be overridden with different values.
     * </p>
     * 
     * @param parameterName
     *        The name of the parameter to be overridden with different values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverrideDatasetParameterOperation withParameterName(String parameterName) {
        setParameterName(parameterName);
        return this;
    }

    /**
     * <p>
     * The new name for the parameter.
     * </p>
     * 
     * @param newParameterName
     *        The new name for the parameter.
     */

    public void setNewParameterName(String newParameterName) {
        this.newParameterName = newParameterName;
    }

    /**
     * <p>
     * The new name for the parameter.
     * </p>
     * 
     * @return The new name for the parameter.
     */

    public String getNewParameterName() {
        return this.newParameterName;
    }

    /**
     * <p>
     * The new name for the parameter.
     * </p>
     * 
     * @param newParameterName
     *        The new name for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverrideDatasetParameterOperation withNewParameterName(String newParameterName) {
        setNewParameterName(newParameterName);
        return this;
    }

    /**
     * <p>
     * The new default values for the parameter.
     * </p>
     * 
     * @param newDefaultValues
     *        The new default values for the parameter.
     */

    public void setNewDefaultValues(NewDefaultValues newDefaultValues) {
        this.newDefaultValues = newDefaultValues;
    }

    /**
     * <p>
     * The new default values for the parameter.
     * </p>
     * 
     * @return The new default values for the parameter.
     */

    public NewDefaultValues getNewDefaultValues() {
        return this.newDefaultValues;
    }

    /**
     * <p>
     * The new default values for the parameter.
     * </p>
     * 
     * @param newDefaultValues
     *        The new default values for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverrideDatasetParameterOperation withNewDefaultValues(NewDefaultValues newDefaultValues) {
        setNewDefaultValues(newDefaultValues);
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
        if (getParameterName() != null)
            sb.append("ParameterName: ").append(getParameterName()).append(",");
        if (getNewParameterName() != null)
            sb.append("NewParameterName: ").append(getNewParameterName()).append(",");
        if (getNewDefaultValues() != null)
            sb.append("NewDefaultValues: ").append(getNewDefaultValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OverrideDatasetParameterOperation == false)
            return false;
        OverrideDatasetParameterOperation other = (OverrideDatasetParameterOperation) obj;
        if (other.getParameterName() == null ^ this.getParameterName() == null)
            return false;
        if (other.getParameterName() != null && other.getParameterName().equals(this.getParameterName()) == false)
            return false;
        if (other.getNewParameterName() == null ^ this.getNewParameterName() == null)
            return false;
        if (other.getNewParameterName() != null && other.getNewParameterName().equals(this.getNewParameterName()) == false)
            return false;
        if (other.getNewDefaultValues() == null ^ this.getNewDefaultValues() == null)
            return false;
        if (other.getNewDefaultValues() != null && other.getNewDefaultValues().equals(this.getNewDefaultValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        hashCode = prime * hashCode + ((getNewParameterName() == null) ? 0 : getNewParameterName().hashCode());
        hashCode = prime * hashCode + ((getNewDefaultValues() == null) ? 0 : getNewDefaultValues().hashCode());
        return hashCode;
    }

    @Override
    public OverrideDatasetParameterOperation clone() {
        try {
            return (OverrideDatasetParameterOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.OverrideDatasetParameterOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
