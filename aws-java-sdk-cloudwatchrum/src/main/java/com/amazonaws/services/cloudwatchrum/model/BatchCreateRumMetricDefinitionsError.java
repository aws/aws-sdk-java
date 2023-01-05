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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that defines one error caused by a <a
 * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_BatchCreateRumMetricsDefinitions.html"
 * >BatchCreateRumMetricsDefinitions</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/BatchCreateRumMetricDefinitionsError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateRumMetricDefinitionsError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error code.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message for this metric definition.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The metric definition that caused this error.
     * </p>
     */
    private MetricDefinitionRequest metricDefinition;

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @return The error code.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateRumMetricDefinitionsError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error message for this metric definition.
     * </p>
     * 
     * @param errorMessage
     *        The error message for this metric definition.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message for this metric definition.
     * </p>
     * 
     * @return The error message for this metric definition.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message for this metric definition.
     * </p>
     * 
     * @param errorMessage
     *        The error message for this metric definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateRumMetricDefinitionsError withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The metric definition that caused this error.
     * </p>
     * 
     * @param metricDefinition
     *        The metric definition that caused this error.
     */

    public void setMetricDefinition(MetricDefinitionRequest metricDefinition) {
        this.metricDefinition = metricDefinition;
    }

    /**
     * <p>
     * The metric definition that caused this error.
     * </p>
     * 
     * @return The metric definition that caused this error.
     */

    public MetricDefinitionRequest getMetricDefinition() {
        return this.metricDefinition;
    }

    /**
     * <p>
     * The metric definition that caused this error.
     * </p>
     * 
     * @param metricDefinition
     *        The metric definition that caused this error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateRumMetricDefinitionsError withMetricDefinition(MetricDefinitionRequest metricDefinition) {
        setMetricDefinition(metricDefinition);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getMetricDefinition() != null)
            sb.append("MetricDefinition: ").append(getMetricDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreateRumMetricDefinitionsError == false)
            return false;
        BatchCreateRumMetricDefinitionsError other = (BatchCreateRumMetricDefinitionsError) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getMetricDefinition() == null ^ this.getMetricDefinition() == null)
            return false;
        if (other.getMetricDefinition() != null && other.getMetricDefinition().equals(this.getMetricDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getMetricDefinition() == null) ? 0 : getMetricDefinition().hashCode());
        return hashCode;
    }

    @Override
    public BatchCreateRumMetricDefinitionsError clone() {
        try {
            return (BatchCreateRumMetricDefinitionsError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchrum.model.transform.BatchCreateRumMetricDefinitionsErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
