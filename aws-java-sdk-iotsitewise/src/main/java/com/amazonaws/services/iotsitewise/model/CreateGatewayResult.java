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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGatewayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the gateway device. You can use this ID when you call other IoT SiteWise APIs.
     * </p>
     */
    private String gatewayId;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the gateway,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:gateway/${GatewayId}</code>
     * </p>
     */
    private String gatewayArn;

    /**
     * <p>
     * The ID of the gateway device. You can use this ID when you call other IoT SiteWise APIs.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the gateway device. You can use this ID when you call other IoT SiteWise APIs.
     */

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of the gateway device. You can use this ID when you call other IoT SiteWise APIs.
     * </p>
     * 
     * @return The ID of the gateway device. You can use this ID when you call other IoT SiteWise APIs.
     */

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * The ID of the gateway device. You can use this ID when you call other IoT SiteWise APIs.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the gateway device. You can use this ID when you call other IoT SiteWise APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayResult withGatewayId(String gatewayId) {
        setGatewayId(gatewayId);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the gateway,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:gateway/${GatewayId}</code>
     * </p>
     * 
     * @param gatewayArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        gateway, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:gateway/${GatewayId}</code>
     */

    public void setGatewayArn(String gatewayArn) {
        this.gatewayArn = gatewayArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the gateway,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:gateway/${GatewayId}</code>
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         gateway, which has the following format.</p>
     *         <p>
     *         <code>arn:${Partition}:iotsitewise:${Region}:${Account}:gateway/${GatewayId}</code>
     */

    public String getGatewayArn() {
        return this.gatewayArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the gateway,
     * which has the following format.
     * </p>
     * <p>
     * <code>arn:${Partition}:iotsitewise:${Region}:${Account}:gateway/${GatewayId}</code>
     * </p>
     * 
     * @param gatewayArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        gateway, which has the following format.</p>
     *        <p>
     *        <code>arn:${Partition}:iotsitewise:${Region}:${Account}:gateway/${GatewayId}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayResult withGatewayArn(String gatewayArn) {
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
        if (getGatewayId() != null)
            sb.append("GatewayId: ").append(getGatewayId()).append(",");
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

        if (obj instanceof CreateGatewayResult == false)
            return false;
        CreateGatewayResult other = (CreateGatewayResult) obj;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getGatewayArn() == null) ? 0 : getGatewayArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateGatewayResult clone() {
        try {
            return (CreateGatewayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
