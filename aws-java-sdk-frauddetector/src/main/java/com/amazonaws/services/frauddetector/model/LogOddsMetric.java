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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The log odds metric details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/LogOddsMetric" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogOddsMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the variable.
     * </p>
     */
    private String variableName;
    /**
     * <p>
     * The type of variable.
     * </p>
     */
    private String variableType;
    /**
     * <p>
     * The relative importance of the variable. For more information, see <a
     * href="https://docs.aws.amazon.com/frauddetector/latest/ug/model-variable-importance.html">Model variable
     * importance</a>.
     * </p>
     */
    private Float variableImportance;

    /**
     * <p>
     * The name of the variable.
     * </p>
     * 
     * @param variableName
     *        The name of the variable.
     */

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    /**
     * <p>
     * The name of the variable.
     * </p>
     * 
     * @return The name of the variable.
     */

    public String getVariableName() {
        return this.variableName;
    }

    /**
     * <p>
     * The name of the variable.
     * </p>
     * 
     * @param variableName
     *        The name of the variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogOddsMetric withVariableName(String variableName) {
        setVariableName(variableName);
        return this;
    }

    /**
     * <p>
     * The type of variable.
     * </p>
     * 
     * @param variableType
     *        The type of variable.
     */

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    /**
     * <p>
     * The type of variable.
     * </p>
     * 
     * @return The type of variable.
     */

    public String getVariableType() {
        return this.variableType;
    }

    /**
     * <p>
     * The type of variable.
     * </p>
     * 
     * @param variableType
     *        The type of variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogOddsMetric withVariableType(String variableType) {
        setVariableType(variableType);
        return this;
    }

    /**
     * <p>
     * The relative importance of the variable. For more information, see <a
     * href="https://docs.aws.amazon.com/frauddetector/latest/ug/model-variable-importance.html">Model variable
     * importance</a>.
     * </p>
     * 
     * @param variableImportance
     *        The relative importance of the variable. For more information, see <a
     *        href="https://docs.aws.amazon.com/frauddetector/latest/ug/model-variable-importance.html">Model variable
     *        importance</a>.
     */

    public void setVariableImportance(Float variableImportance) {
        this.variableImportance = variableImportance;
    }

    /**
     * <p>
     * The relative importance of the variable. For more information, see <a
     * href="https://docs.aws.amazon.com/frauddetector/latest/ug/model-variable-importance.html">Model variable
     * importance</a>.
     * </p>
     * 
     * @return The relative importance of the variable. For more information, see <a
     *         href="https://docs.aws.amazon.com/frauddetector/latest/ug/model-variable-importance.html">Model variable
     *         importance</a>.
     */

    public Float getVariableImportance() {
        return this.variableImportance;
    }

    /**
     * <p>
     * The relative importance of the variable. For more information, see <a
     * href="https://docs.aws.amazon.com/frauddetector/latest/ug/model-variable-importance.html">Model variable
     * importance</a>.
     * </p>
     * 
     * @param variableImportance
     *        The relative importance of the variable. For more information, see <a
     *        href="https://docs.aws.amazon.com/frauddetector/latest/ug/model-variable-importance.html">Model variable
     *        importance</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogOddsMetric withVariableImportance(Float variableImportance) {
        setVariableImportance(variableImportance);
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
        if (getVariableName() != null)
            sb.append("VariableName: ").append(getVariableName()).append(",");
        if (getVariableType() != null)
            sb.append("VariableType: ").append(getVariableType()).append(",");
        if (getVariableImportance() != null)
            sb.append("VariableImportance: ").append(getVariableImportance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogOddsMetric == false)
            return false;
        LogOddsMetric other = (LogOddsMetric) obj;
        if (other.getVariableName() == null ^ this.getVariableName() == null)
            return false;
        if (other.getVariableName() != null && other.getVariableName().equals(this.getVariableName()) == false)
            return false;
        if (other.getVariableType() == null ^ this.getVariableType() == null)
            return false;
        if (other.getVariableType() != null && other.getVariableType().equals(this.getVariableType()) == false)
            return false;
        if (other.getVariableImportance() == null ^ this.getVariableImportance() == null)
            return false;
        if (other.getVariableImportance() != null && other.getVariableImportance().equals(this.getVariableImportance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVariableName() == null) ? 0 : getVariableName().hashCode());
        hashCode = prime * hashCode + ((getVariableType() == null) ? 0 : getVariableType().hashCode());
        hashCode = prime * hashCode + ((getVariableImportance() == null) ? 0 : getVariableImportance().hashCode());
        return hashCode;
    }

    @Override
    public LogOddsMetric clone() {
        try {
            return (LogOddsMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.LogOddsMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
