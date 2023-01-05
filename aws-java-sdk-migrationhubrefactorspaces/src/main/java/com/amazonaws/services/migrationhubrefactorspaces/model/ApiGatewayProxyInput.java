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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A wrapper object holding the Amazon API Gateway endpoint input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ApiGatewayProxyInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApiGatewayProxyInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of endpoint to use for the API Gateway proxy. If no value is specified in the request, the value is set
     * to <code>REGIONAL</code> by default.
     * </p>
     * <p>
     * If the value is set to <code>PRIVATE</code> in the request, this creates a private API endpoint that is isolated
     * from the public internet. The private endpoint can only be accessed by using Amazon Virtual Private Cloud (Amazon
     * VPC) endpoints for Amazon API Gateway that have been granted access.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The name of the API Gateway stage. The name defaults to <code>prod</code>.
     * </p>
     */
    private String stageName;

    /**
     * <p>
     * The type of endpoint to use for the API Gateway proxy. If no value is specified in the request, the value is set
     * to <code>REGIONAL</code> by default.
     * </p>
     * <p>
     * If the value is set to <code>PRIVATE</code> in the request, this creates a private API endpoint that is isolated
     * from the public internet. The private endpoint can only be accessed by using Amazon Virtual Private Cloud (Amazon
     * VPC) endpoints for Amazon API Gateway that have been granted access.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint to use for the API Gateway proxy. If no value is specified in the request, the value
     *        is set to <code>REGIONAL</code> by default.</p>
     *        <p>
     *        If the value is set to <code>PRIVATE</code> in the request, this creates a private API endpoint that is
     *        isolated from the public internet. The private endpoint can only be accessed by using Amazon Virtual
     *        Private Cloud (Amazon VPC) endpoints for Amazon API Gateway that have been granted access.
     * @see ApiGatewayEndpointType
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of endpoint to use for the API Gateway proxy. If no value is specified in the request, the value is set
     * to <code>REGIONAL</code> by default.
     * </p>
     * <p>
     * If the value is set to <code>PRIVATE</code> in the request, this creates a private API endpoint that is isolated
     * from the public internet. The private endpoint can only be accessed by using Amazon Virtual Private Cloud (Amazon
     * VPC) endpoints for Amazon API Gateway that have been granted access.
     * </p>
     * 
     * @return The type of endpoint to use for the API Gateway proxy. If no value is specified in the request, the value
     *         is set to <code>REGIONAL</code> by default.</p>
     *         <p>
     *         If the value is set to <code>PRIVATE</code> in the request, this creates a private API endpoint that is
     *         isolated from the public internet. The private endpoint can only be accessed by using Amazon Virtual
     *         Private Cloud (Amazon VPC) endpoints for Amazon API Gateway that have been granted access.
     * @see ApiGatewayEndpointType
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of endpoint to use for the API Gateway proxy. If no value is specified in the request, the value is set
     * to <code>REGIONAL</code> by default.
     * </p>
     * <p>
     * If the value is set to <code>PRIVATE</code> in the request, this creates a private API endpoint that is isolated
     * from the public internet. The private endpoint can only be accessed by using Amazon Virtual Private Cloud (Amazon
     * VPC) endpoints for Amazon API Gateway that have been granted access.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint to use for the API Gateway proxy. If no value is specified in the request, the value
     *        is set to <code>REGIONAL</code> by default.</p>
     *        <p>
     *        If the value is set to <code>PRIVATE</code> in the request, this creates a private API endpoint that is
     *        isolated from the public internet. The private endpoint can only be accessed by using Amazon Virtual
     *        Private Cloud (Amazon VPC) endpoints for Amazon API Gateway that have been granted access.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiGatewayEndpointType
     */

    public ApiGatewayProxyInput withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of endpoint to use for the API Gateway proxy. If no value is specified in the request, the value is set
     * to <code>REGIONAL</code> by default.
     * </p>
     * <p>
     * If the value is set to <code>PRIVATE</code> in the request, this creates a private API endpoint that is isolated
     * from the public internet. The private endpoint can only be accessed by using Amazon Virtual Private Cloud (Amazon
     * VPC) endpoints for Amazon API Gateway that have been granted access.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint to use for the API Gateway proxy. If no value is specified in the request, the value
     *        is set to <code>REGIONAL</code> by default.</p>
     *        <p>
     *        If the value is set to <code>PRIVATE</code> in the request, this creates a private API endpoint that is
     *        isolated from the public internet. The private endpoint can only be accessed by using Amazon Virtual
     *        Private Cloud (Amazon VPC) endpoints for Amazon API Gateway that have been granted access.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiGatewayEndpointType
     */

    public ApiGatewayProxyInput withEndpointType(ApiGatewayEndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the API Gateway stage. The name defaults to <code>prod</code>.
     * </p>
     * 
     * @param stageName
     *        The name of the API Gateway stage. The name defaults to <code>prod</code>.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the API Gateway stage. The name defaults to <code>prod</code>.
     * </p>
     * 
     * @return The name of the API Gateway stage. The name defaults to <code>prod</code>.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the API Gateway stage. The name defaults to <code>prod</code>.
     * </p>
     * 
     * @param stageName
     *        The name of the API Gateway stage. The name defaults to <code>prod</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiGatewayProxyInput withStageName(String stageName) {
        setStageName(stageName);
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
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApiGatewayProxyInput == false)
            return false;
        ApiGatewayProxyInput other = (ApiGatewayProxyInput) obj;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        return hashCode;
    }

    @Override
    public ApiGatewayProxyInput clone() {
        try {
            return (ApiGatewayProxyInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubrefactorspaces.model.transform.ApiGatewayProxyInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
