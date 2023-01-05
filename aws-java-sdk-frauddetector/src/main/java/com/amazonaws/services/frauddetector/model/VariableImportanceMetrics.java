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
 * The variable importance metrics details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/VariableImportanceMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VariableImportanceMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of variable metrics.
     * </p>
     */
    private java.util.List<LogOddsMetric> logOddsMetrics;

    /**
     * <p>
     * List of variable metrics.
     * </p>
     * 
     * @return List of variable metrics.
     */

    public java.util.List<LogOddsMetric> getLogOddsMetrics() {
        return logOddsMetrics;
    }

    /**
     * <p>
     * List of variable metrics.
     * </p>
     * 
     * @param logOddsMetrics
     *        List of variable metrics.
     */

    public void setLogOddsMetrics(java.util.Collection<LogOddsMetric> logOddsMetrics) {
        if (logOddsMetrics == null) {
            this.logOddsMetrics = null;
            return;
        }

        this.logOddsMetrics = new java.util.ArrayList<LogOddsMetric>(logOddsMetrics);
    }

    /**
     * <p>
     * List of variable metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogOddsMetrics(java.util.Collection)} or {@link #withLogOddsMetrics(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param logOddsMetrics
     *        List of variable metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VariableImportanceMetrics withLogOddsMetrics(LogOddsMetric... logOddsMetrics) {
        if (this.logOddsMetrics == null) {
            setLogOddsMetrics(new java.util.ArrayList<LogOddsMetric>(logOddsMetrics.length));
        }
        for (LogOddsMetric ele : logOddsMetrics) {
            this.logOddsMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of variable metrics.
     * </p>
     * 
     * @param logOddsMetrics
     *        List of variable metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VariableImportanceMetrics withLogOddsMetrics(java.util.Collection<LogOddsMetric> logOddsMetrics) {
        setLogOddsMetrics(logOddsMetrics);
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
        if (getLogOddsMetrics() != null)
            sb.append("LogOddsMetrics: ").append(getLogOddsMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VariableImportanceMetrics == false)
            return false;
        VariableImportanceMetrics other = (VariableImportanceMetrics) obj;
        if (other.getLogOddsMetrics() == null ^ this.getLogOddsMetrics() == null)
            return false;
        if (other.getLogOddsMetrics() != null && other.getLogOddsMetrics().equals(this.getLogOddsMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogOddsMetrics() == null) ? 0 : getLogOddsMetrics().hashCode());
        return hashCode;
    }

    @Override
    public VariableImportanceMetrics clone() {
        try {
            return (VariableImportanceMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.VariableImportanceMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
