/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a failed create simulation job request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/FailedCreateSimulationJobRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedCreateSimulationJobRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The simulation job request.
     * </p>
     */
    private SimulationJobRequest request;
    /**
     * <p>
     * The failure reason of the simulation job request.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The failure code.
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job batch failed.
     * </p>
     */
    private java.util.Date failedAt;

    /**
     * <p>
     * The simulation job request.
     * </p>
     * 
     * @param request
     *        The simulation job request.
     */

    public void setRequest(SimulationJobRequest request) {
        this.request = request;
    }

    /**
     * <p>
     * The simulation job request.
     * </p>
     * 
     * @return The simulation job request.
     */

    public SimulationJobRequest getRequest() {
        return this.request;
    }

    /**
     * <p>
     * The simulation job request.
     * </p>
     * 
     * @param request
     *        The simulation job request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedCreateSimulationJobRequest withRequest(SimulationJobRequest request) {
        setRequest(request);
        return this;
    }

    /**
     * <p>
     * The failure reason of the simulation job request.
     * </p>
     * 
     * @param failureReason
     *        The failure reason of the simulation job request.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The failure reason of the simulation job request.
     * </p>
     * 
     * @return The failure reason of the simulation job request.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The failure reason of the simulation job request.
     * </p>
     * 
     * @param failureReason
     *        The failure reason of the simulation job request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedCreateSimulationJobRequest withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @param failureCode
     *        The failure code.
     * @see SimulationJobErrorCode
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @return The failure code.
     * @see SimulationJobErrorCode
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @param failureCode
     *        The failure code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationJobErrorCode
     */

    public FailedCreateSimulationJobRequest withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @param failureCode
     *        The failure code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationJobErrorCode
     */

    public FailedCreateSimulationJobRequest withFailureCode(SimulationJobErrorCode failureCode) {
        this.failureCode = failureCode.toString();
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job batch failed.
     * </p>
     * 
     * @param failedAt
     *        The time, in milliseconds since the epoch, when the simulation job batch failed.
     */

    public void setFailedAt(java.util.Date failedAt) {
        this.failedAt = failedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job batch failed.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the simulation job batch failed.
     */

    public java.util.Date getFailedAt() {
        return this.failedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job batch failed.
     * </p>
     * 
     * @param failedAt
     *        The time, in milliseconds since the epoch, when the simulation job batch failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedCreateSimulationJobRequest withFailedAt(java.util.Date failedAt) {
        setFailedAt(failedAt);
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
        if (getRequest() != null)
            sb.append("Request: ").append(getRequest()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getFailedAt() != null)
            sb.append("FailedAt: ").append(getFailedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedCreateSimulationJobRequest == false)
            return false;
        FailedCreateSimulationJobRequest other = (FailedCreateSimulationJobRequest) obj;
        if (other.getRequest() == null ^ this.getRequest() == null)
            return false;
        if (other.getRequest() != null && other.getRequest().equals(this.getRequest()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getFailedAt() == null ^ this.getFailedAt() == null)
            return false;
        if (other.getFailedAt() != null && other.getFailedAt().equals(this.getFailedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequest() == null) ? 0 : getRequest().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getFailedAt() == null) ? 0 : getFailedAt().hashCode());
        return hashCode;
    }

    @Override
    public FailedCreateSimulationJobRequest clone() {
        try {
            return (FailedCreateSimulationJobRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.FailedCreateSimulationJobRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
