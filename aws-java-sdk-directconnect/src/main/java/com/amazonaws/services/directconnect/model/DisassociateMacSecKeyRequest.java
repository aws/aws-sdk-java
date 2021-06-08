/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DisassociateMacSecKey"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateMacSecKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the dedicated connection (dxcon-xxxx), or the ID of the LAG (dxlag-xxxx).
     * </p>
     * <p>
     * You can use <a>DescribeConnections</a> or <a>DescribeLags</a> to retrieve connection ID.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key.
     * </p>
     * <p>
     * You can use <a>DescribeConnections</a> to retrieve the ARN of the MAC Security (MACsec) secret key.
     * </p>
     */
    private String secretARN;

    /**
     * <p>
     * The ID of the dedicated connection (dxcon-xxxx), or the ID of the LAG (dxlag-xxxx).
     * </p>
     * <p>
     * You can use <a>DescribeConnections</a> or <a>DescribeLags</a> to retrieve connection ID.
     * </p>
     * 
     * @param connectionId
     *        The ID of the dedicated connection (dxcon-xxxx), or the ID of the LAG (dxlag-xxxx).</p>
     *        <p>
     *        You can use <a>DescribeConnections</a> or <a>DescribeLags</a> to retrieve connection ID.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the dedicated connection (dxcon-xxxx), or the ID of the LAG (dxlag-xxxx).
     * </p>
     * <p>
     * You can use <a>DescribeConnections</a> or <a>DescribeLags</a> to retrieve connection ID.
     * </p>
     * 
     * @return The ID of the dedicated connection (dxcon-xxxx), or the ID of the LAG (dxlag-xxxx).</p>
     *         <p>
     *         You can use <a>DescribeConnections</a> or <a>DescribeLags</a> to retrieve connection ID.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the dedicated connection (dxcon-xxxx), or the ID of the LAG (dxlag-xxxx).
     * </p>
     * <p>
     * You can use <a>DescribeConnections</a> or <a>DescribeLags</a> to retrieve connection ID.
     * </p>
     * 
     * @param connectionId
     *        The ID of the dedicated connection (dxcon-xxxx), or the ID of the LAG (dxlag-xxxx).</p>
     *        <p>
     *        You can use <a>DescribeConnections</a> or <a>DescribeLags</a> to retrieve connection ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateMacSecKeyRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key.
     * </p>
     * <p>
     * You can use <a>DescribeConnections</a> to retrieve the ARN of the MAC Security (MACsec) secret key.
     * </p>
     * 
     * @param secretARN
     *        The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key.</p>
     *        <p>
     *        You can use <a>DescribeConnections</a> to retrieve the ARN of the MAC Security (MACsec) secret key.
     */

    public void setSecretARN(String secretARN) {
        this.secretARN = secretARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key.
     * </p>
     * <p>
     * You can use <a>DescribeConnections</a> to retrieve the ARN of the MAC Security (MACsec) secret key.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key.</p>
     *         <p>
     *         You can use <a>DescribeConnections</a> to retrieve the ARN of the MAC Security (MACsec) secret key.
     */

    public String getSecretARN() {
        return this.secretARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key.
     * </p>
     * <p>
     * You can use <a>DescribeConnections</a> to retrieve the ARN of the MAC Security (MACsec) secret key.
     * </p>
     * 
     * @param secretARN
     *        The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key.</p>
     *        <p>
     *        You can use <a>DescribeConnections</a> to retrieve the ARN of the MAC Security (MACsec) secret key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateMacSecKeyRequest withSecretARN(String secretARN) {
        setSecretARN(secretARN);
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
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getSecretARN() != null)
            sb.append("SecretARN: ").append(getSecretARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateMacSecKeyRequest == false)
            return false;
        DisassociateMacSecKeyRequest other = (DisassociateMacSecKeyRequest) obj;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getSecretARN() == null ^ this.getSecretARN() == null)
            return false;
        if (other.getSecretARN() != null && other.getSecretARN().equals(this.getSecretARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getSecretARN() == null) ? 0 : getSecretARN().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateMacSecKeyRequest clone() {
        return (DisassociateMacSecKeyRequest) super.clone();
    }

}
