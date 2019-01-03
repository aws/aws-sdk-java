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
 * RetrieveTapeArchiveInput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/RetrieveTapeArchive" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrieveTapeArchiveRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape you want to retrieve from the virtual tape shelf (VTS).
     * </p>
     */
    private String tapeARN;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway you want to retrieve the virtual tape to. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     * <p>
     * You retrieve archived virtual tapes to only one gateway and the gateway must be a tape gateway.
     * </p>
     */
    private String gatewayARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape you want to retrieve from the virtual tape shelf (VTS).
     * </p>
     * 
     * @param tapeARN
     *        The Amazon Resource Name (ARN) of the virtual tape you want to retrieve from the virtual tape shelf (VTS).
     */

    public void setTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape you want to retrieve from the virtual tape shelf (VTS).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the virtual tape you want to retrieve from the virtual tape shelf
     *         (VTS).
     */

    public String getTapeARN() {
        return this.tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual tape you want to retrieve from the virtual tape shelf (VTS).
     * </p>
     * 
     * @param tapeARN
     *        The Amazon Resource Name (ARN) of the virtual tape you want to retrieve from the virtual tape shelf (VTS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveTapeArchiveRequest withTapeARN(String tapeARN) {
        setTapeARN(tapeARN);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway you want to retrieve the virtual tape to. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     * <p>
     * You retrieve archived virtual tapes to only one gateway and the gateway must be a tape gateway.
     * </p>
     * 
     * @param gatewayARN
     *        The Amazon Resource Name (ARN) of the gateway you want to retrieve the virtual tape to. Use the
     *        <a>ListGateways</a> operation to return a list of gateways for your account and region.</p>
     *        <p>
     *        You retrieve archived virtual tapes to only one gateway and the gateway must be a tape gateway.
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway you want to retrieve the virtual tape to. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     * <p>
     * You retrieve archived virtual tapes to only one gateway and the gateway must be a tape gateway.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the gateway you want to retrieve the virtual tape to. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your account and region.</p>
     *         <p>
     *         You retrieve archived virtual tapes to only one gateway and the gateway must be a tape gateway.
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway you want to retrieve the virtual tape to. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your account and region.
     * </p>
     * <p>
     * You retrieve archived virtual tapes to only one gateway and the gateway must be a tape gateway.
     * </p>
     * 
     * @param gatewayARN
     *        The Amazon Resource Name (ARN) of the gateway you want to retrieve the virtual tape to. Use the
     *        <a>ListGateways</a> operation to return a list of gateways for your account and region.</p>
     *        <p>
     *        You retrieve archived virtual tapes to only one gateway and the gateway must be a tape gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveTapeArchiveRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
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
        if (getTapeARN() != null)
            sb.append("TapeARN: ").append(getTapeARN()).append(",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrieveTapeArchiveRequest == false)
            return false;
        RetrieveTapeArchiveRequest other = (RetrieveTapeArchiveRequest) obj;
        if (other.getTapeARN() == null ^ this.getTapeARN() == null)
            return false;
        if (other.getTapeARN() != null && other.getTapeARN().equals(this.getTapeARN()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeARN() == null) ? 0 : getTapeARN().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        return hashCode;
    }

    @Override
    public RetrieveTapeArchiveRequest clone() {
        return (RetrieveTapeArchiveRequest) super.clone();
    }

}
