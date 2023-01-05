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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/PutBandwidthRateLimitSchedule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutBandwidthRateLimitScheduleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BGW_ListGateways.html">
     * <code>ListGateways</code> </a> operation to return a list of gateways for your account and Amazon Web Services
     * Region.
     * </p>
     */
    private String gatewayArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BGW_ListGateways.html">
     * <code>ListGateways</code> </a> operation to return a list of gateways for your account and Amazon Web Services
     * Region.
     * </p>
     * 
     * @param gatewayArn
     *        The Amazon Resource Name (ARN) of the gateway. Use the <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BGW_ListGateways.html">
     *        <code>ListGateways</code> </a> operation to return a list of gateways for your account and Amazon Web
     *        Services Region.
     */

    public void setGatewayArn(String gatewayArn) {
        this.gatewayArn = gatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BGW_ListGateways.html">
     * <code>ListGateways</code> </a> operation to return a list of gateways for your account and Amazon Web Services
     * Region.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the gateway. Use the <a
     *         href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BGW_ListGateways.html">
     *         <code>ListGateways</code> </a> operation to return a list of gateways for your account and Amazon Web
     *         Services Region.
     */

    public String getGatewayArn() {
        return this.gatewayArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <a
     * href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BGW_ListGateways.html">
     * <code>ListGateways</code> </a> operation to return a list of gateways for your account and Amazon Web Services
     * Region.
     * </p>
     * 
     * @param gatewayArn
     *        The Amazon Resource Name (ARN) of the gateway. Use the <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BGW_ListGateways.html">
     *        <code>ListGateways</code> </a> operation to return a list of gateways for your account and Amazon Web
     *        Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBandwidthRateLimitScheduleResult withGatewayArn(String gatewayArn) {
        setGatewayArn(gatewayArn);
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
            sb.append("GatewayArn: ").append(getGatewayArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBandwidthRateLimitScheduleResult == false)
            return false;
        PutBandwidthRateLimitScheduleResult other = (PutBandwidthRateLimitScheduleResult) obj;
        if (other.getGatewayArn() == null ^ this.getGatewayArn() == null)
            return false;
        if (other.getGatewayArn() != null && other.getGatewayArn().equals(this.getGatewayArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayArn() == null) ? 0 : getGatewayArn().hashCode());
        return hashCode;
    }

    @Override
    public PutBandwidthRateLimitScheduleResult clone() {
        try {
            return (PutBandwidthRateLimitScheduleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
