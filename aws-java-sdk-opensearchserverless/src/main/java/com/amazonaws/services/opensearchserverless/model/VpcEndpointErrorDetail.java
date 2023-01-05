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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Error information for a failed <code>BatchGetVpcEndpoint</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/VpcEndpointErrorDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcEndpointErrorDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error code for the failed request.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * An error message describing the reason for the failure.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The unique identifier of the VPC endpoint.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The error code for the failed request.
     * </p>
     * 
     * @param errorCode
     *        The error code for the failed request.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code for the failed request.
     * </p>
     * 
     * @return The error code for the failed request.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code for the failed request.
     * </p>
     * 
     * @param errorCode
     *        The error code for the failed request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointErrorDetail withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * An error message describing the reason for the failure.
     * </p>
     * 
     * @param errorMessage
     *        An error message describing the reason for the failure.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error message describing the reason for the failure.
     * </p>
     * 
     * @return An error message describing the reason for the failure.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * An error message describing the reason for the failure.
     * </p>
     * 
     * @param errorMessage
     *        An error message describing the reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointErrorDetail withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the VPC endpoint.
     * </p>
     * 
     * @param id
     *        The unique identifier of the VPC endpoint.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the VPC endpoint.
     * </p>
     * 
     * @return The unique identifier of the VPC endpoint.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the VPC endpoint.
     * </p>
     * 
     * @param id
     *        The unique identifier of the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpointErrorDetail withId(String id) {
        setId(id);
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
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcEndpointErrorDetail == false)
            return false;
        VpcEndpointErrorDetail other = (VpcEndpointErrorDetail) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public VpcEndpointErrorDetail clone() {
        try {
            return (VpcEndpointErrorDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearchserverless.model.transform.VpcEndpointErrorDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
