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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The options for managing connection authorization for new client connections.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ClientConnectResponseOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientConnectResponseOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether client connect options are enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function used for connection authorization.
     * </p>
     */
    private String lambdaFunctionArn;
    /**
     * <p>
     * The status of any updates to the client connect options.
     * </p>
     */
    private ClientVpnEndpointAttributeStatus status;

    /**
     * <p>
     * Indicates whether client connect options are enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether client connect options are enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether client connect options are enabled.
     * </p>
     * 
     * @return Indicates whether client connect options are enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether client connect options are enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether client connect options are enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientConnectResponseOptions withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether client connect options are enabled.
     * </p>
     * 
     * @return Indicates whether client connect options are enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function used for connection authorization.
     * </p>
     * 
     * @param lambdaFunctionArn
     *        The Amazon Resource Name (ARN) of the AWS Lambda function used for connection authorization.
     */

    public void setLambdaFunctionArn(String lambdaFunctionArn) {
        this.lambdaFunctionArn = lambdaFunctionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function used for connection authorization.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Lambda function used for connection authorization.
     */

    public String getLambdaFunctionArn() {
        return this.lambdaFunctionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function used for connection authorization.
     * </p>
     * 
     * @param lambdaFunctionArn
     *        The Amazon Resource Name (ARN) of the AWS Lambda function used for connection authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientConnectResponseOptions withLambdaFunctionArn(String lambdaFunctionArn) {
        setLambdaFunctionArn(lambdaFunctionArn);
        return this;
    }

    /**
     * <p>
     * The status of any updates to the client connect options.
     * </p>
     * 
     * @param status
     *        The status of any updates to the client connect options.
     */

    public void setStatus(ClientVpnEndpointAttributeStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of any updates to the client connect options.
     * </p>
     * 
     * @return The status of any updates to the client connect options.
     */

    public ClientVpnEndpointAttributeStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of any updates to the client connect options.
     * </p>
     * 
     * @param status
     *        The status of any updates to the client connect options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientConnectResponseOptions withStatus(ClientVpnEndpointAttributeStatus status) {
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getLambdaFunctionArn() != null)
            sb.append("LambdaFunctionArn: ").append(getLambdaFunctionArn()).append(",");
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

        if (obj instanceof ClientConnectResponseOptions == false)
            return false;
        ClientConnectResponseOptions other = (ClientConnectResponseOptions) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getLambdaFunctionArn() == null ^ this.getLambdaFunctionArn() == null)
            return false;
        if (other.getLambdaFunctionArn() != null && other.getLambdaFunctionArn().equals(this.getLambdaFunctionArn()) == false)
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

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionArn() == null) ? 0 : getLambdaFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ClientConnectResponseOptions clone() {
        try {
            return (ClientConnectResponseOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
