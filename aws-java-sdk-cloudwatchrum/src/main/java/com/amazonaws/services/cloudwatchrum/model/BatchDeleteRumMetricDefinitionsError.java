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
 * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_BatchDeleteRumMetricsDefinitions.html"
 * >BatchCreateRumMetricsDefinitions</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/BatchDeleteRumMetricDefinitionsError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteRumMetricDefinitionsError implements Serializable, Cloneable, StructuredPojo {

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
     * The ID of the metric definition that caused this error.
     * </p>
     */
    private String metricDefinitionId;

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

    public BatchDeleteRumMetricDefinitionsError withErrorCode(String errorCode) {
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

    public BatchDeleteRumMetricDefinitionsError withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The ID of the metric definition that caused this error.
     * </p>
     * 
     * @param metricDefinitionId
     *        The ID of the metric definition that caused this error.
     */

    public void setMetricDefinitionId(String metricDefinitionId) {
        this.metricDefinitionId = metricDefinitionId;
    }

    /**
     * <p>
     * The ID of the metric definition that caused this error.
     * </p>
     * 
     * @return The ID of the metric definition that caused this error.
     */

    public String getMetricDefinitionId() {
        return this.metricDefinitionId;
    }

    /**
     * <p>
     * The ID of the metric definition that caused this error.
     * </p>
     * 
     * @param metricDefinitionId
     *        The ID of the metric definition that caused this error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRumMetricDefinitionsError withMetricDefinitionId(String metricDefinitionId) {
        setMetricDefinitionId(metricDefinitionId);
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
        if (getMetricDefinitionId() != null)
            sb.append("MetricDefinitionId: ").append(getMetricDefinitionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteRumMetricDefinitionsError == false)
            return false;
        BatchDeleteRumMetricDefinitionsError other = (BatchDeleteRumMetricDefinitionsError) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getMetricDefinitionId() == null ^ this.getMetricDefinitionId() == null)
            return false;
        if (other.getMetricDefinitionId() != null && other.getMetricDefinitionId().equals(this.getMetricDefinitionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getMetricDefinitionId() == null) ? 0 : getMetricDefinitionId().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteRumMetricDefinitionsError clone() {
        try {
            return (BatchDeleteRumMetricDefinitionsError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchrum.model.transform.BatchDeleteRumMetricDefinitionsErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
