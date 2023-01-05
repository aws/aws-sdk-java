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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/UpdateEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint being updated.
     * </p>
     */
    private String endpointArn;
    /**
     * <p>
     * The ARN of the new model to use when updating an existing endpoint.
     * </p>
     */
    private String desiredModelArn;
    /**
     * <p>
     * The desired number of inference units to be used by the model using this endpoint. Each inference unit represents
     * of a throughput of 100 characters per second.
     * </p>
     */
    private Integer desiredInferenceUnits;
    /**
     * <p>
     * Data access role ARN to use in case the new model is encrypted with a customer CMK.
     * </p>
     */
    private String desiredDataAccessRoleArn;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint being updated.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Number (ARN) of the endpoint being updated.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint being updated.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the endpoint being updated.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint being updated.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Number (ARN) of the endpoint being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointRequest withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the new model to use when updating an existing endpoint.
     * </p>
     * 
     * @param desiredModelArn
     *        The ARN of the new model to use when updating an existing endpoint.
     */

    public void setDesiredModelArn(String desiredModelArn) {
        this.desiredModelArn = desiredModelArn;
    }

    /**
     * <p>
     * The ARN of the new model to use when updating an existing endpoint.
     * </p>
     * 
     * @return The ARN of the new model to use when updating an existing endpoint.
     */

    public String getDesiredModelArn() {
        return this.desiredModelArn;
    }

    /**
     * <p>
     * The ARN of the new model to use when updating an existing endpoint.
     * </p>
     * 
     * @param desiredModelArn
     *        The ARN of the new model to use when updating an existing endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointRequest withDesiredModelArn(String desiredModelArn) {
        setDesiredModelArn(desiredModelArn);
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

    public UpdateEndpointRequest withDesiredInferenceUnits(Integer desiredInferenceUnits) {
        setDesiredInferenceUnits(desiredInferenceUnits);
        return this;
    }

    /**
     * <p>
     * Data access role ARN to use in case the new model is encrypted with a customer CMK.
     * </p>
     * 
     * @param desiredDataAccessRoleArn
     *        Data access role ARN to use in case the new model is encrypted with a customer CMK.
     */

    public void setDesiredDataAccessRoleArn(String desiredDataAccessRoleArn) {
        this.desiredDataAccessRoleArn = desiredDataAccessRoleArn;
    }

    /**
     * <p>
     * Data access role ARN to use in case the new model is encrypted with a customer CMK.
     * </p>
     * 
     * @return Data access role ARN to use in case the new model is encrypted with a customer CMK.
     */

    public String getDesiredDataAccessRoleArn() {
        return this.desiredDataAccessRoleArn;
    }

    /**
     * <p>
     * Data access role ARN to use in case the new model is encrypted with a customer CMK.
     * </p>
     * 
     * @param desiredDataAccessRoleArn
     *        Data access role ARN to use in case the new model is encrypted with a customer CMK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointRequest withDesiredDataAccessRoleArn(String desiredDataAccessRoleArn) {
        setDesiredDataAccessRoleArn(desiredDataAccessRoleArn);
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
        if (getDesiredModelArn() != null)
            sb.append("DesiredModelArn: ").append(getDesiredModelArn()).append(",");
        if (getDesiredInferenceUnits() != null)
            sb.append("DesiredInferenceUnits: ").append(getDesiredInferenceUnits()).append(",");
        if (getDesiredDataAccessRoleArn() != null)
            sb.append("DesiredDataAccessRoleArn: ").append(getDesiredDataAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEndpointRequest == false)
            return false;
        UpdateEndpointRequest other = (UpdateEndpointRequest) obj;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getDesiredModelArn() == null ^ this.getDesiredModelArn() == null)
            return false;
        if (other.getDesiredModelArn() != null && other.getDesiredModelArn().equals(this.getDesiredModelArn()) == false)
            return false;
        if (other.getDesiredInferenceUnits() == null ^ this.getDesiredInferenceUnits() == null)
            return false;
        if (other.getDesiredInferenceUnits() != null && other.getDesiredInferenceUnits().equals(this.getDesiredInferenceUnits()) == false)
            return false;
        if (other.getDesiredDataAccessRoleArn() == null ^ this.getDesiredDataAccessRoleArn() == null)
            return false;
        if (other.getDesiredDataAccessRoleArn() != null && other.getDesiredDataAccessRoleArn().equals(this.getDesiredDataAccessRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getDesiredModelArn() == null) ? 0 : getDesiredModelArn().hashCode());
        hashCode = prime * hashCode + ((getDesiredInferenceUnits() == null) ? 0 : getDesiredInferenceUnits().hashCode());
        hashCode = prime * hashCode + ((getDesiredDataAccessRoleArn() == null) ? 0 : getDesiredDataAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEndpointRequest clone() {
        return (UpdateEndpointRequest) super.clone();
    }

}
