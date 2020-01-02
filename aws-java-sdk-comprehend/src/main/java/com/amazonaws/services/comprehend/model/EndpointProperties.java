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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies information about the specified endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/EndpointProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint.
     * </p>
     */
    private String endpointArn;
    /**
     * <p>
     * Specifies the status of the endpoint. Because the endpoint updates and creation are asynchronous, so customers
     * will need to wait for the endpoint to be <code>Ready</code> status before making inference requests.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies a reason for failure in cases of <code>Failed</code> status.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The desired number of inference units to be used by the model using this endpoint. Each inference unit represents
     * of a throughput of 100 characters per second.
     * </p>
     */
    private Integer desiredInferenceUnits;
    /**
     * <p>
     * The number of inference units currently used by the model using this endpoint.
     * </p>
     */
    private Integer currentInferenceUnits;
    /**
     * <p>
     * The creation date and time of the endpoint.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date and time that the endpoint was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Number (ARN) of the endpoint.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the endpoint.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Number (ARN) of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointProperties withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the endpoint. Because the endpoint updates and creation are asynchronous, so customers
     * will need to wait for the endpoint to be <code>Ready</code> status before making inference requests.
     * </p>
     * 
     * @param status
     *        Specifies the status of the endpoint. Because the endpoint updates and creation are asynchronous, so
     *        customers will need to wait for the endpoint to be <code>Ready</code> status before making inference
     *        requests.
     * @see EndpointStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of the endpoint. Because the endpoint updates and creation are asynchronous, so customers
     * will need to wait for the endpoint to be <code>Ready</code> status before making inference requests.
     * </p>
     * 
     * @return Specifies the status of the endpoint. Because the endpoint updates and creation are asynchronous, so
     *         customers will need to wait for the endpoint to be <code>Ready</code> status before making inference
     *         requests.
     * @see EndpointStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the status of the endpoint. Because the endpoint updates and creation are asynchronous, so customers
     * will need to wait for the endpoint to be <code>Ready</code> status before making inference requests.
     * </p>
     * 
     * @param status
     *        Specifies the status of the endpoint. Because the endpoint updates and creation are asynchronous, so
     *        customers will need to wait for the endpoint to be <code>Ready</code> status before making inference
     *        requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public EndpointProperties withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the endpoint. Because the endpoint updates and creation are asynchronous, so customers
     * will need to wait for the endpoint to be <code>Ready</code> status before making inference requests.
     * </p>
     * 
     * @param status
     *        Specifies the status of the endpoint. Because the endpoint updates and creation are asynchronous, so
     *        customers will need to wait for the endpoint to be <code>Ready</code> status before making inference
     *        requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public EndpointProperties withStatus(EndpointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a reason for failure in cases of <code>Failed</code> status.
     * </p>
     * 
     * @param message
     *        Specifies a reason for failure in cases of <code>Failed</code> status.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Specifies a reason for failure in cases of <code>Failed</code> status.
     * </p>
     * 
     * @return Specifies a reason for failure in cases of <code>Failed</code> status.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Specifies a reason for failure in cases of <code>Failed</code> status.
     * </p>
     * 
     * @param message
     *        Specifies a reason for failure in cases of <code>Failed</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointProperties withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointProperties withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The desired number of inference units to be used by the model using this endpoint. Each inference unit represents
     * of a throughput of 100 characters per second.
     * </p>
     * 
     * @param desiredInferenceUnits
     *        The desired number of inference units to be used by the model using this endpoint. Each inference unit
     *        represents of a throughput of 100 characters per second.
     */

    public void setDesiredInferenceUnits(Integer desiredInferenceUnits) {
        this.desiredInferenceUnits = desiredInferenceUnits;
    }

    /**
     * <p>
     * The desired number of inference units to be used by the model using this endpoint. Each inference unit represents
     * of a throughput of 100 characters per second.
     * </p>
     * 
     * @return The desired number of inference units to be used by the model using this endpoint. Each inference unit
     *         represents of a throughput of 100 characters per second.
     */

    public Integer getDesiredInferenceUnits() {
        return this.desiredInferenceUnits;
    }

    /**
     * <p>
     * The desired number of inference units to be used by the model using this endpoint. Each inference unit represents
     * of a throughput of 100 characters per second.
     * </p>
     * 
     * @param desiredInferenceUnits
     *        The desired number of inference units to be used by the model using this endpoint. Each inference unit
     *        represents of a throughput of 100 characters per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointProperties withDesiredInferenceUnits(Integer desiredInferenceUnits) {
        setDesiredInferenceUnits(desiredInferenceUnits);
        return this;
    }

    /**
     * <p>
     * The number of inference units currently used by the model using this endpoint.
     * </p>
     * 
     * @param currentInferenceUnits
     *        The number of inference units currently used by the model using this endpoint.
     */

    public void setCurrentInferenceUnits(Integer currentInferenceUnits) {
        this.currentInferenceUnits = currentInferenceUnits;
    }

    /**
     * <p>
     * The number of inference units currently used by the model using this endpoint.
     * </p>
     * 
     * @return The number of inference units currently used by the model using this endpoint.
     */

    public Integer getCurrentInferenceUnits() {
        return this.currentInferenceUnits;
    }

    /**
     * <p>
     * The number of inference units currently used by the model using this endpoint.
     * </p>
     * 
     * @param currentInferenceUnits
     *        The number of inference units currently used by the model using this endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointProperties withCurrentInferenceUnits(Integer currentInferenceUnits) {
        setCurrentInferenceUnits(currentInferenceUnits);
        return this;
    }

    /**
     * <p>
     * The creation date and time of the endpoint.
     * </p>
     * 
     * @param creationTime
     *        The creation date and time of the endpoint.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation date and time of the endpoint.
     * </p>
     * 
     * @return The creation date and time of the endpoint.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation date and time of the endpoint.
     * </p>
     * 
     * @param creationTime
     *        The creation date and time of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointProperties withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the endpoint was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the endpoint was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the endpoint was last modified.
     * </p>
     * 
     * @return The date and time that the endpoint was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the endpoint was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the endpoint was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointProperties withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getEndpointArn() != null)
            sb.append("EndpointArn: ").append(getEndpointArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getDesiredInferenceUnits() != null)
            sb.append("DesiredInferenceUnits: ").append(getDesiredInferenceUnits()).append(",");
        if (getCurrentInferenceUnits() != null)
            sb.append("CurrentInferenceUnits: ").append(getCurrentInferenceUnits()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointProperties == false)
            return false;
        EndpointProperties other = (EndpointProperties) obj;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getDesiredInferenceUnits() == null ^ this.getDesiredInferenceUnits() == null)
            return false;
        if (other.getDesiredInferenceUnits() != null && other.getDesiredInferenceUnits().equals(this.getDesiredInferenceUnits()) == false)
            return false;
        if (other.getCurrentInferenceUnits() == null ^ this.getCurrentInferenceUnits() == null)
            return false;
        if (other.getCurrentInferenceUnits() != null && other.getCurrentInferenceUnits().equals(this.getCurrentInferenceUnits()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getDesiredInferenceUnits() == null) ? 0 : getDesiredInferenceUnits().hashCode());
        hashCode = prime * hashCode + ((getCurrentInferenceUnits() == null) ? 0 : getCurrentInferenceUnits().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public EndpointProperties clone() {
        try {
            return (EndpointProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.EndpointPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
