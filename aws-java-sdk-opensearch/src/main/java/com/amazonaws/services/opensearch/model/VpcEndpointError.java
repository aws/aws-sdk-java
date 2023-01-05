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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Error information when attempting to describe an Amazon OpenSearch Service-managed VPC endpoint.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcEndpointError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the endpoint.
     * </p>
     */
    private String vpcEndpointId;
    /**
     * <p>
     * The code associated with the error.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * A message describing the error.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The unique identifier of the endpoint.
     * </p>
     * 
     * @param vpcEndpointId
     *        The unique identifier of the endpoint.
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The unique identifier of the endpoint.
     * </p>
     * 
     * @return The unique identifier of the endpoint.
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * The unique identifier of the endpoint.
     * </p>
     * 
     * @param vpcEndpointId
     *        The unique identifier of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointError withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
        return this;
    }

    /**
     * <p>
     * The code associated with the error.
     * </p>
     * 
     * @param errorCode
     *        The code associated with the error.
     * @see VpcEndpointErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The code associated with the error.
     * </p>
     * 
     * @return The code associated with the error.
     * @see VpcEndpointErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The code associated with the error.
     * </p>
     * 
     * @param errorCode
     *        The code associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcEndpointErrorCode
     */

    public VpcEndpointError withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The code associated with the error.
     * </p>
     * 
     * @param errorCode
     *        The code associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcEndpointErrorCode
     */

    public VpcEndpointError withErrorCode(VpcEndpointErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * A message describing the error.
     * </p>
     * 
     * @param errorMessage
     *        A message describing the error.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * A message describing the error.
     * </p>
     * 
     * @return A message describing the error.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * A message describing the error.
     * </p>
     * 
     * @param errorMessage
     *        A message describing the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointError withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcEndpointError == false)
            return false;
        VpcEndpointError other = (VpcEndpointError) obj;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public VpcEndpointError clone() {
        try {
            return (VpcEndpointError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.VpcEndpointErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
