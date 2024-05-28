/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The options for managing connection authorization for new client connections.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2ClientVpnEndpointClientConnectOptionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2ClientVpnEndpointClientConnectOptionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether client connect options are enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function used for connection authorization.
     * </p>
     */
    private String lambdaFunctionArn;
    /**
     * <p>
     * The status of any updates to the client connect options.
     * </p>
     */
    private AwsEc2ClientVpnEndpointClientConnectOptionsStatusDetails status;

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

    public AwsEc2ClientVpnEndpointClientConnectOptionsDetails withEnabled(Boolean enabled) {
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
     * The Amazon Resource Name (ARN) of the Lambda function used for connection authorization.
     * </p>
     * 
     * @param lambdaFunctionArn
     *        The Amazon Resource Name (ARN) of the Lambda function used for connection authorization.
     */

    public void setLambdaFunctionArn(String lambdaFunctionArn) {
        this.lambdaFunctionArn = lambdaFunctionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function used for connection authorization.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lambda function used for connection authorization.
     */

    public String getLambdaFunctionArn() {
        return this.lambdaFunctionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function used for connection authorization.
     * </p>
     * 
     * @param lambdaFunctionArn
     *        The Amazon Resource Name (ARN) of the Lambda function used for connection authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointClientConnectOptionsDetails withLambdaFunctionArn(String lambdaFunctionArn) {
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

    public void setStatus(AwsEc2ClientVpnEndpointClientConnectOptionsStatusDetails status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of any updates to the client connect options.
     * </p>
     * 
     * @return The status of any updates to the client connect options.
     */

    public AwsEc2ClientVpnEndpointClientConnectOptionsStatusDetails getStatus() {
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

    public AwsEc2ClientVpnEndpointClientConnectOptionsDetails withStatus(AwsEc2ClientVpnEndpointClientConnectOptionsStatusDetails status) {
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

        if (obj instanceof AwsEc2ClientVpnEndpointClientConnectOptionsDetails == false)
            return false;
        AwsEc2ClientVpnEndpointClientConnectOptionsDetails other = (AwsEc2ClientVpnEndpointClientConnectOptionsDetails) obj;
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
    public AwsEc2ClientVpnEndpointClientConnectOptionsDetails clone() {
        try {
            return (AwsEc2ClientVpnEndpointClientConnectOptionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2ClientVpnEndpointClientConnectOptionsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
