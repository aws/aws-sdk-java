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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information for a notebook calculation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CalculationSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CalculationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The calculation execution UUID.
     * </p>
     */
    private String calculationExecutionId;
    /**
     * <p>
     * A description of the calculation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Contains information about the status of the calculation.
     * </p>
     */
    private CalculationStatus status;

    /**
     * <p>
     * The calculation execution UUID.
     * </p>
     * 
     * @param calculationExecutionId
     *        The calculation execution UUID.
     */

    public void setCalculationExecutionId(String calculationExecutionId) {
        this.calculationExecutionId = calculationExecutionId;
    }

    /**
     * <p>
     * The calculation execution UUID.
     * </p>
     * 
     * @return The calculation execution UUID.
     */

    public String getCalculationExecutionId() {
        return this.calculationExecutionId;
    }

    /**
     * <p>
     * The calculation execution UUID.
     * </p>
     * 
     * @param calculationExecutionId
     *        The calculation execution UUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculationSummary withCalculationExecutionId(String calculationExecutionId) {
        setCalculationExecutionId(calculationExecutionId);
        return this;
    }

    /**
     * <p>
     * A description of the calculation.
     * </p>
     * 
     * @param description
     *        A description of the calculation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the calculation.
     * </p>
     * 
     * @return A description of the calculation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the calculation.
     * </p>
     * 
     * @param description
     *        A description of the calculation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculationSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Contains information about the status of the calculation.
     * </p>
     * 
     * @param status
     *        Contains information about the status of the calculation.
     */

    public void setStatus(CalculationStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * Contains information about the status of the calculation.
     * </p>
     * 
     * @return Contains information about the status of the calculation.
     */

    public CalculationStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Contains information about the status of the calculation.
     * </p>
     * 
     * @param status
     *        Contains information about the status of the calculation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculationSummary withStatus(CalculationStatus status) {
        setStatus(status);
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
        if (getCalculationExecutionId() != null)
            sb.append("CalculationExecutionId: ").append(getCalculationExecutionId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculationSummary == false)
            return false;
        CalculationSummary other = (CalculationSummary) obj;
        if (other.getCalculationExecutionId() == null ^ this.getCalculationExecutionId() == null)
            return false;
        if (other.getCalculationExecutionId() != null && other.getCalculationExecutionId().equals(this.getCalculationExecutionId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCalculationExecutionId() == null) ? 0 : getCalculationExecutionId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CalculationSummary clone() {
        try {
            return (CalculationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.CalculationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
