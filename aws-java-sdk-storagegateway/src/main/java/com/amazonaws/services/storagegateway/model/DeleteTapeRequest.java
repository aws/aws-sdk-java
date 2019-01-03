/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * DeleteTapeInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeleteTape" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTapeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the gateway that the virtual tape to delete is associated with. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     */
    private String gatewayARN;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape to delete.
     * </p>
     */
    private String tapeARN;

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the gateway that the virtual tape to delete is associated with. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     * 
     * @param gatewayARN
     *        The unique Amazon Resource Name (ARN) of the gateway that the virtual tape to delete is associated with.
     *        Use the <a>ListGateways</a> operation to return a list of gateways for your account and region.
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the gateway that the virtual tape to delete is associated with. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) of the gateway that the virtual tape to delete is associated with.
     *         Use the <a>ListGateways</a> operation to return a list of gateways for your account and region.
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the gateway that the virtual tape to delete is associated with. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     * 
     * @param gatewayARN
     *        The unique Amazon Resource Name (ARN) of the gateway that the virtual tape to delete is associated with.
     *        Use the <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTapeRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape to delete.
     * </p>
     * 
     * @param tapeARN
     *        The Amazon Resource Name (ARN) of the virtual tape to delete.
     */

    public void setTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape to delete.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the virtual tape to delete.
     */

    public String getTapeARN() {
        return this.tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape to delete.
     * </p>
     * 
     * @param tapeARN
     *        The Amazon Resource Name (ARN) of the virtual tape to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTapeRequest withTapeARN(String tapeARN) {
        setTapeARN(tapeARN);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getTapeARN() != null)
            sb.append("TapeARN: ").append(getTapeARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTapeRequest == false)
            return false;
        DeleteTapeRequest other = (DeleteTapeRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getTapeARN() == null ^ this.getTapeARN() == null)
            return false;
        if (other.getTapeARN() != null && other.getTapeARN().equals(this.getTapeARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getTapeARN() == null) ? 0 : getTapeARN().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTapeRequest clone() {
        return (DeleteTapeRequest) super.clone();
    }

}
