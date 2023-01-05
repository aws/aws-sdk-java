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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UpdateGatewayInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGatewayInformationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway to update.
     * </p>
     */
    private String gatewayArn;
    /**
     * <p>
     * The updated display name of the gateway.
     * </p>
     */
    private String gatewayDisplayName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway to update.
     * </p>
     * 
     * @param gatewayArn
     *        The Amazon Resource Name (ARN) of the gateway to update.
     */

    public void setGatewayArn(String gatewayArn) {
        this.gatewayArn = gatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the gateway to update.
     */

    public String getGatewayArn() {
        return this.gatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway to update.
     * </p>
     * 
     * @param gatewayArn
     *        The Amazon Resource Name (ARN) of the gateway to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGatewayInformationRequest withGatewayArn(String gatewayArn) {
        setGatewayArn(gatewayArn);
        return this;
    }

    /**
     * <p>
     * The updated display name of the gateway.
     * </p>
     * 
     * @param gatewayDisplayName
     *        The updated display name of the gateway.
     */

    public void setGatewayDisplayName(String gatewayDisplayName) {
        this.gatewayDisplayName = gatewayDisplayName;
    }

    /**
     * <p>
     * The updated display name of the gateway.
     * </p>
     * 
     * @return The updated display name of the gateway.
     */

    public String getGatewayDisplayName() {
        return this.gatewayDisplayName;
    }

    /**
     * <p>
     * The updated display name of the gateway.
     * </p>
     * 
     * @param gatewayDisplayName
     *        The updated display name of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGatewayInformationRequest withGatewayDisplayName(String gatewayDisplayName) {
        setGatewayDisplayName(gatewayDisplayName);
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
        if (getGatewayArn() != null)
            sb.append("GatewayArn: ").append(getGatewayArn()).append(",");
        if (getGatewayDisplayName() != null)
            sb.append("GatewayDisplayName: ").append(getGatewayDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGatewayInformationRequest == false)
            return false;
        UpdateGatewayInformationRequest other = (UpdateGatewayInformationRequest) obj;
        if (other.getGatewayArn() == null ^ this.getGatewayArn() == null)
            return false;
        if (other.getGatewayArn() != null && other.getGatewayArn().equals(this.getGatewayArn()) == false)
            return false;
        if (other.getGatewayDisplayName() == null ^ this.getGatewayDisplayName() == null)
            return false;
        if (other.getGatewayDisplayName() != null && other.getGatewayDisplayName().equals(this.getGatewayDisplayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayArn() == null) ? 0 : getGatewayArn().hashCode());
        hashCode = prime * hashCode + ((getGatewayDisplayName() == null) ? 0 : getGatewayDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGatewayInformationRequest clone() {
        return (UpdateGatewayInformationRequest) super.clone();
    }

}
