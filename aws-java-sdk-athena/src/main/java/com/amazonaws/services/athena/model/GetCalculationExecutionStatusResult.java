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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetCalculationExecutionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCalculationExecutionStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Contains information about the calculation execution status.
     * </p>
     */
    private CalculationStatus status;
    /**
     * <p>
     * Contains information about the DPU execution time and progress.
     * </p>
     */
    private CalculationStatistics statistics;

    /**
     * <p>
     * Contains information about the calculation execution status.
     * </p>
     * 
     * @param status
     *        Contains information about the calculation execution status.
     */

    public void setStatus(CalculationStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * Contains information about the calculation execution status.
     * </p>
     * 
     * @return Contains information about the calculation execution status.
     */

    public CalculationStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Contains information about the calculation execution status.
     * </p>
     * 
     * @param status
     *        Contains information about the calculation execution status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculationExecutionStatusResult withStatus(CalculationStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Contains information about the DPU execution time and progress.
     * </p>
     * 
     * @param statistics
     *        Contains information about the DPU execution time and progress.
     */

    public void setStatistics(CalculationStatistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * Contains information about the DPU execution time and progress.
     * </p>
     * 
     * @return Contains information about the DPU execution time and progress.
     */

    public CalculationStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * Contains information about the DPU execution time and progress.
     * </p>
     * 
     * @param statistics
     *        Contains information about the DPU execution time and progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculationExecutionStatusResult withStatistics(CalculationStatistics statistics) {
        setStatistics(statistics);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCalculationExecutionStatusResult == false)
            return false;
        GetCalculationExecutionStatusResult other = (GetCalculationExecutionStatusResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        return hashCode;
    }

    @Override
    public GetCalculationExecutionStatusResult clone() {
        try {
            return (GetCalculationExecutionStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
