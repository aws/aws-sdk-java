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
 * The metadata of the endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EndpointMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The name of the endpoint configuration.
     * </p>
     */
    private String endpointConfigName;
    /**
     * <p>
     * The status of the endpoint. For possible values of the status of an endpoint, see
     * <a>EndpointSummary$EndpointStatus</a>.
     * </p>
     */
    private String endpointStatus;
    /**
     * <p>
     * If the status of the endpoint is <code>Failed</code>, or the status is <code>InService</code> but update
     * operation fails, this provides the reason why it failed.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @return The name of the endpoint.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointMetadata withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The name of the endpoint configuration.
     * </p>
     * 
     * @param endpointConfigName
     *        The name of the endpoint configuration.
     */

    public void setEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration.
     * </p>
     * 
     * @return The name of the endpoint configuration.
     */

    public String getEndpointConfigName() {
        return this.endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration.
     * </p>
     * 
     * @param endpointConfigName
     *        The name of the endpoint configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointMetadata withEndpointConfigName(String endpointConfigName) {
        setEndpointConfigName(endpointConfigName);
        return this;
    }

    /**
     * <p>
     * The status of the endpoint. For possible values of the status of an endpoint, see
     * <a>EndpointSummary$EndpointStatus</a>.
     * </p>
     * 
     * @param endpointStatus
     *        The status of the endpoint. For possible values of the status of an endpoint, see
     *        <a>EndpointSummary$EndpointStatus</a>.
     * @see EndpointStatus
     */

    public void setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
    }

    /**
     * <p>
     * The status of the endpoint. For possible values of the status of an endpoint, see
     * <a>EndpointSummary$EndpointStatus</a>.
     * </p>
     * 
     * @return The status of the endpoint. For possible values of the status of an endpoint, see
     *         <a>EndpointSummary$EndpointStatus</a>.
     * @see EndpointStatus
     */

    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    /**
     * <p>
     * The status of the endpoint. For possible values of the status of an endpoint, see
     * <a>EndpointSummary$EndpointStatus</a>.
     * </p>
     * 
     * @param endpointStatus
     *        The status of the endpoint. For possible values of the status of an endpoint, see
     *        <a>EndpointSummary$EndpointStatus</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public EndpointMetadata withEndpointStatus(String endpointStatus) {
        setEndpointStatus(endpointStatus);
        return this;
    }

    /**
     * <p>
     * The status of the endpoint. For possible values of the status of an endpoint, see
     * <a>EndpointSummary$EndpointStatus</a>.
     * </p>
     * 
     * @param endpointStatus
     *        The status of the endpoint. For possible values of the status of an endpoint, see
     *        <a>EndpointSummary$EndpointStatus</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public EndpointMetadata withEndpointStatus(EndpointStatus endpointStatus) {
        this.endpointStatus = endpointStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the status of the endpoint is <code>Failed</code>, or the status is <code>InService</code> but update
     * operation fails, this provides the reason why it failed.
     * </p>
     * 
     * @param failureReason
     *        If the status of the endpoint is <code>Failed</code>, or the status is <code>InService</code> but update
     *        operation fails, this provides the reason why it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the status of the endpoint is <code>Failed</code>, or the status is <code>InService</code> but update
     * operation fails, this provides the reason why it failed.
     * </p>
     * 
     * @return If the status of the endpoint is <code>Failed</code>, or the status is <code>InService</code> but update
     *         operation fails, this provides the reason why it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the status of the endpoint is <code>Failed</code>, or the status is <code>InService</code> but update
     * operation fails, this provides the reason why it failed.
     * </p>
     * 
     * @param failureReason
     *        If the status of the endpoint is <code>Failed</code>, or the status is <code>InService</code> but update
     *        operation fails, this provides the reason why it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointMetadata withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getEndpointConfigName() != null)
            sb.append("EndpointConfigName: ").append(getEndpointConfigName()).append(",");
        if (getEndpointStatus() != null)
            sb.append("EndpointStatus: ").append(getEndpointStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointMetadata == false)
            return false;
        EndpointMetadata other = (EndpointMetadata) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getEndpointConfigName() == null ^ this.getEndpointConfigName() == null)
            return false;
        if (other.getEndpointConfigName() != null && other.getEndpointConfigName().equals(this.getEndpointConfigName()) == false)
            return false;
        if (other.getEndpointStatus() == null ^ this.getEndpointStatus() == null)
            return false;
        if (other.getEndpointStatus() != null && other.getEndpointStatus().equals(this.getEndpointStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getEndpointConfigName() == null) ? 0 : getEndpointConfigName().hashCode());
        hashCode = prime * hashCode + ((getEndpointStatus() == null) ? 0 : getEndpointStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public EndpointMetadata clone() {
        try {
            return (EndpointMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EndpointMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
