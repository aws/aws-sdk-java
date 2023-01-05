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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a rule associated with a transit gateway policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayPolicyRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayPolicyRule implements Serializable, Cloneable {

    /**
     * <p>
     * The source CIDR block for the transit gateway policy rule.
     * </p>
     */
    private String sourceCidrBlock;
    /**
     * <p>
     * The port range for the transit gateway policy rule. Currently this is set to * (all).
     * </p>
     */
    private String sourcePortRange;
    /**
     * <p>
     * The destination CIDR block for the transit gateway policy rule.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * The port range for the transit gateway policy rule. Currently this is set to * (all).
     * </p>
     */
    private String destinationPortRange;
    /**
     * <p>
     * The protocol used by the transit gateway policy rule.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The meta data tags used for the transit gateway policy rule.
     * </p>
     */
    private TransitGatewayPolicyRuleMetaData metaData;

    /**
     * <p>
     * The source CIDR block for the transit gateway policy rule.
     * </p>
     * 
     * @param sourceCidrBlock
     *        The source CIDR block for the transit gateway policy rule.
     */

    public void setSourceCidrBlock(String sourceCidrBlock) {
        this.sourceCidrBlock = sourceCidrBlock;
    }

    /**
     * <p>
     * The source CIDR block for the transit gateway policy rule.
     * </p>
     * 
     * @return The source CIDR block for the transit gateway policy rule.
     */

    public String getSourceCidrBlock() {
        return this.sourceCidrBlock;
    }

    /**
     * <p>
     * The source CIDR block for the transit gateway policy rule.
     * </p>
     * 
     * @param sourceCidrBlock
     *        The source CIDR block for the transit gateway policy rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPolicyRule withSourceCidrBlock(String sourceCidrBlock) {
        setSourceCidrBlock(sourceCidrBlock);
        return this;
    }

    /**
     * <p>
     * The port range for the transit gateway policy rule. Currently this is set to * (all).
     * </p>
     * 
     * @param sourcePortRange
     *        The port range for the transit gateway policy rule. Currently this is set to * (all).
     */

    public void setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
    }

    /**
     * <p>
     * The port range for the transit gateway policy rule. Currently this is set to * (all).
     * </p>
     * 
     * @return The port range for the transit gateway policy rule. Currently this is set to * (all).
     */

    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * <p>
     * The port range for the transit gateway policy rule. Currently this is set to * (all).
     * </p>
     * 
     * @param sourcePortRange
     *        The port range for the transit gateway policy rule. Currently this is set to * (all).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPolicyRule withSourcePortRange(String sourcePortRange) {
        setSourcePortRange(sourcePortRange);
        return this;
    }

    /**
     * <p>
     * The destination CIDR block for the transit gateway policy rule.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The destination CIDR block for the transit gateway policy rule.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The destination CIDR block for the transit gateway policy rule.
     * </p>
     * 
     * @return The destination CIDR block for the transit gateway policy rule.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * The destination CIDR block for the transit gateway policy rule.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The destination CIDR block for the transit gateway policy rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPolicyRule withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * The port range for the transit gateway policy rule. Currently this is set to * (all).
     * </p>
     * 
     * @param destinationPortRange
     *        The port range for the transit gateway policy rule. Currently this is set to * (all).
     */

    public void setDestinationPortRange(String destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
    }

    /**
     * <p>
     * The port range for the transit gateway policy rule. Currently this is set to * (all).
     * </p>
     * 
     * @return The port range for the transit gateway policy rule. Currently this is set to * (all).
     */

    public String getDestinationPortRange() {
        return this.destinationPortRange;
    }

    /**
     * <p>
     * The port range for the transit gateway policy rule. Currently this is set to * (all).
     * </p>
     * 
     * @param destinationPortRange
     *        The port range for the transit gateway policy rule. Currently this is set to * (all).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPolicyRule withDestinationPortRange(String destinationPortRange) {
        setDestinationPortRange(destinationPortRange);
        return this;
    }

    /**
     * <p>
     * The protocol used by the transit gateway policy rule.
     * </p>
     * 
     * @param protocol
     *        The protocol used by the transit gateway policy rule.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol used by the transit gateway policy rule.
     * </p>
     * 
     * @return The protocol used by the transit gateway policy rule.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol used by the transit gateway policy rule.
     * </p>
     * 
     * @param protocol
     *        The protocol used by the transit gateway policy rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPolicyRule withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The meta data tags used for the transit gateway policy rule.
     * </p>
     * 
     * @param metaData
     *        The meta data tags used for the transit gateway policy rule.
     */

    public void setMetaData(TransitGatewayPolicyRuleMetaData metaData) {
        this.metaData = metaData;
    }

    /**
     * <p>
     * The meta data tags used for the transit gateway policy rule.
     * </p>
     * 
     * @return The meta data tags used for the transit gateway policy rule.
     */

    public TransitGatewayPolicyRuleMetaData getMetaData() {
        return this.metaData;
    }

    /**
     * <p>
     * The meta data tags used for the transit gateway policy rule.
     * </p>
     * 
     * @param metaData
     *        The meta data tags used for the transit gateway policy rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPolicyRule withMetaData(TransitGatewayPolicyRuleMetaData metaData) {
        setMetaData(metaData);
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
        if (getSourceCidrBlock() != null)
            sb.append("SourceCidrBlock: ").append(getSourceCidrBlock()).append(",");
        if (getSourcePortRange() != null)
            sb.append("SourcePortRange: ").append(getSourcePortRange()).append(",");
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: ").append(getDestinationCidrBlock()).append(",");
        if (getDestinationPortRange() != null)
            sb.append("DestinationPortRange: ").append(getDestinationPortRange()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getMetaData() != null)
            sb.append("MetaData: ").append(getMetaData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayPolicyRule == false)
            return false;
        TransitGatewayPolicyRule other = (TransitGatewayPolicyRule) obj;
        if (other.getSourceCidrBlock() == null ^ this.getSourceCidrBlock() == null)
            return false;
        if (other.getSourceCidrBlock() != null && other.getSourceCidrBlock().equals(this.getSourceCidrBlock()) == false)
            return false;
        if (other.getSourcePortRange() == null ^ this.getSourcePortRange() == null)
            return false;
        if (other.getSourcePortRange() != null && other.getSourcePortRange().equals(this.getSourcePortRange()) == false)
            return false;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getDestinationPortRange() == null ^ this.getDestinationPortRange() == null)
            return false;
        if (other.getDestinationPortRange() != null && other.getDestinationPortRange().equals(this.getDestinationPortRange()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getMetaData() == null ^ this.getMetaData() == null)
            return false;
        if (other.getMetaData() != null && other.getMetaData().equals(this.getMetaData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceCidrBlock() == null) ? 0 : getSourceCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getSourcePortRange() == null) ? 0 : getSourcePortRange().hashCode());
        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDestinationPortRange() == null) ? 0 : getDestinationPortRange().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getMetaData() == null) ? 0 : getMetaData().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayPolicyRule clone() {
        try {
            return (TransitGatewayPolicyRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
