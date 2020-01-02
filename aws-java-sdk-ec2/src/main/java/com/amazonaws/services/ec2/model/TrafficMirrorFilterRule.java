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
 * Describes the Traffic Mirror rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TrafficMirrorFilterRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficMirrorFilterRule implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Traffic Mirror rule.
     * </p>
     */
    private String trafficMirrorFilterRuleId;
    /**
     * <p>
     * The ID of the Traffic Mirror filter that the rule is associated with.
     * </p>
     */
    private String trafficMirrorFilterId;
    /**
     * <p>
     * The traffic direction assigned to the Traffic Mirror rule.
     * </p>
     */
    private String trafficDirection;
    /**
     * <p>
     * The rule number of the Traffic Mirror rule.
     * </p>
     */
    private Integer ruleNumber;
    /**
     * <p>
     * The action assigned to the Traffic Mirror rule.
     * </p>
     */
    private String ruleAction;
    /**
     * <p>
     * The protocol assigned to the Traffic Mirror rule.
     * </p>
     */
    private Integer protocol;
    /**
     * <p>
     * The destination port range assigned to the Traffic Mirror rule.
     * </p>
     */
    private TrafficMirrorPortRange destinationPortRange;
    /**
     * <p>
     * The source port range assigned to the Traffic Mirror rule.
     * </p>
     */
    private TrafficMirrorPortRange sourcePortRange;
    /**
     * <p>
     * The destination CIDR block assigned to the Traffic Mirror rule.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * The source CIDR block assigned to the Traffic Mirror rule.
     * </p>
     */
    private String sourceCidrBlock;
    /**
     * <p>
     * The description of the Traffic Mirror rule.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the Traffic Mirror rule.
     * </p>
     * 
     * @param trafficMirrorFilterRuleId
     *        The ID of the Traffic Mirror rule.
     */

    public void setTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
        this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror rule.
     * </p>
     * 
     * @return The ID of the Traffic Mirror rule.
     */

    public String getTrafficMirrorFilterRuleId() {
        return this.trafficMirrorFilterRuleId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror rule.
     * </p>
     * 
     * @param trafficMirrorFilterRuleId
     *        The ID of the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorFilterRule withTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
        setTrafficMirrorFilterRuleId(trafficMirrorFilterRuleId);
        return this;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter that the rule is associated with.
     * </p>
     * 
     * @param trafficMirrorFilterId
     *        The ID of the Traffic Mirror filter that the rule is associated with.
     */

    public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter that the rule is associated with.
     * </p>
     * 
     * @return The ID of the Traffic Mirror filter that the rule is associated with.
     */

    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter that the rule is associated with.
     * </p>
     * 
     * @param trafficMirrorFilterId
     *        The ID of the Traffic Mirror filter that the rule is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorFilterRule withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        setTrafficMirrorFilterId(trafficMirrorFilterId);
        return this;
    }

    /**
     * <p>
     * The traffic direction assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @param trafficDirection
     *        The traffic direction assigned to the Traffic Mirror rule.
     * @see TrafficDirection
     */

    public void setTrafficDirection(String trafficDirection) {
        this.trafficDirection = trafficDirection;
    }

    /**
     * <p>
     * The traffic direction assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @return The traffic direction assigned to the Traffic Mirror rule.
     * @see TrafficDirection
     */

    public String getTrafficDirection() {
        return this.trafficDirection;
    }

    /**
     * <p>
     * The traffic direction assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @param trafficDirection
     *        The traffic direction assigned to the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficDirection
     */

    public TrafficMirrorFilterRule withTrafficDirection(String trafficDirection) {
        setTrafficDirection(trafficDirection);
        return this;
    }

    /**
     * <p>
     * The traffic direction assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @param trafficDirection
     *        The traffic direction assigned to the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficDirection
     */

    public TrafficMirrorFilterRule withTrafficDirection(TrafficDirection trafficDirection) {
        this.trafficDirection = trafficDirection.toString();
        return this;
    }

    /**
     * <p>
     * The rule number of the Traffic Mirror rule.
     * </p>
     * 
     * @param ruleNumber
     *        The rule number of the Traffic Mirror rule.
     */

    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    /**
     * <p>
     * The rule number of the Traffic Mirror rule.
     * </p>
     * 
     * @return The rule number of the Traffic Mirror rule.
     */

    public Integer getRuleNumber() {
        return this.ruleNumber;
    }

    /**
     * <p>
     * The rule number of the Traffic Mirror rule.
     * </p>
     * 
     * @param ruleNumber
     *        The rule number of the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorFilterRule withRuleNumber(Integer ruleNumber) {
        setRuleNumber(ruleNumber);
        return this;
    }

    /**
     * <p>
     * The action assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @param ruleAction
     *        The action assigned to the Traffic Mirror rule.
     * @see TrafficMirrorRuleAction
     */

    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    /**
     * <p>
     * The action assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @return The action assigned to the Traffic Mirror rule.
     * @see TrafficMirrorRuleAction
     */

    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * <p>
     * The action assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @param ruleAction
     *        The action assigned to the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorRuleAction
     */

    public TrafficMirrorFilterRule withRuleAction(String ruleAction) {
        setRuleAction(ruleAction);
        return this;
    }

    /**
     * <p>
     * The action assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @param ruleAction
     *        The action assigned to the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorRuleAction
     */

    public TrafficMirrorFilterRule withRuleAction(TrafficMirrorRuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
        return this;
    }

    /**
     * <p>
     * The protocol assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @param protocol
     *        The protocol assigned to the Traffic Mirror rule.
     */

    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @return The protocol assigned to the Traffic Mirror rule.
     */

    public Integer getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @param protocol
     *        The protocol assigned to the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorFilterRule withProtocol(Integer protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The destination port range assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @param destinationPortRange
     *        The destination port range assigned to the Traffic Mirror rule.
     */

    public void setDestinationPortRange(TrafficMirrorPortRange destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
    }

    /**
     * <p>
     * The destination port range assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @return The destination port range assigned to the Traffic Mirror rule.
     */

    public TrafficMirrorPortRange getDestinationPortRange() {
        return this.destinationPortRange;
    }

    /**
     * <p>
     * The destination port range assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @param destinationPortRange
     *        The destination port range assigned to the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorFilterRule withDestinationPortRange(TrafficMirrorPortRange destinationPortRange) {
        setDestinationPortRange(destinationPortRange);
        return this;
    }

    /**
     * <p>
     * The source port range assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @param sourcePortRange
     *        The source port range assigned to the Traffic Mirror rule.
     */

    public void setSourcePortRange(TrafficMirrorPortRange sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
    }

    /**
     * <p>
     * The source port range assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @return The source port range assigned to the Traffic Mirror rule.
     */

    public TrafficMirrorPortRange getSourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * <p>
     * The source port range assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @param sourcePortRange
     *        The source port range assigned to the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorFilterRule withSourcePortRange(TrafficMirrorPortRange sourcePortRange) {
        setSourcePortRange(sourcePortRange);
        return this;
    }

    /**
     * <p>
     * The destination CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The destination CIDR block assigned to the Traffic Mirror rule.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The destination CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @return The destination CIDR block assigned to the Traffic Mirror rule.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * The destination CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The destination CIDR block assigned to the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorFilterRule withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * The source CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @param sourceCidrBlock
     *        The source CIDR block assigned to the Traffic Mirror rule.
     */

    public void setSourceCidrBlock(String sourceCidrBlock) {
        this.sourceCidrBlock = sourceCidrBlock;
    }

    /**
     * <p>
     * The source CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @return The source CIDR block assigned to the Traffic Mirror rule.
     */

    public String getSourceCidrBlock() {
        return this.sourceCidrBlock;
    }

    /**
     * <p>
     * The source CIDR block assigned to the Traffic Mirror rule.
     * </p>
     * 
     * @param sourceCidrBlock
     *        The source CIDR block assigned to the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorFilterRule withSourceCidrBlock(String sourceCidrBlock) {
        setSourceCidrBlock(sourceCidrBlock);
        return this;
    }

    /**
     * <p>
     * The description of the Traffic Mirror rule.
     * </p>
     * 
     * @param description
     *        The description of the Traffic Mirror rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the Traffic Mirror rule.
     * </p>
     * 
     * @return The description of the Traffic Mirror rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the Traffic Mirror rule.
     * </p>
     * 
     * @param description
     *        The description of the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorFilterRule withDescription(String description) {
        setDescription(description);
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
        if (getTrafficMirrorFilterRuleId() != null)
            sb.append("TrafficMirrorFilterRuleId: ").append(getTrafficMirrorFilterRuleId()).append(",");
        if (getTrafficMirrorFilterId() != null)
            sb.append("TrafficMirrorFilterId: ").append(getTrafficMirrorFilterId()).append(",");
        if (getTrafficDirection() != null)
            sb.append("TrafficDirection: ").append(getTrafficDirection()).append(",");
        if (getRuleNumber() != null)
            sb.append("RuleNumber: ").append(getRuleNumber()).append(",");
        if (getRuleAction() != null)
            sb.append("RuleAction: ").append(getRuleAction()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getDestinationPortRange() != null)
            sb.append("DestinationPortRange: ").append(getDestinationPortRange()).append(",");
        if (getSourcePortRange() != null)
            sb.append("SourcePortRange: ").append(getSourcePortRange()).append(",");
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: ").append(getDestinationCidrBlock()).append(",");
        if (getSourceCidrBlock() != null)
            sb.append("SourceCidrBlock: ").append(getSourceCidrBlock()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficMirrorFilterRule == false)
            return false;
        TrafficMirrorFilterRule other = (TrafficMirrorFilterRule) obj;
        if (other.getTrafficMirrorFilterRuleId() == null ^ this.getTrafficMirrorFilterRuleId() == null)
            return false;
        if (other.getTrafficMirrorFilterRuleId() != null && other.getTrafficMirrorFilterRuleId().equals(this.getTrafficMirrorFilterRuleId()) == false)
            return false;
        if (other.getTrafficMirrorFilterId() == null ^ this.getTrafficMirrorFilterId() == null)
            return false;
        if (other.getTrafficMirrorFilterId() != null && other.getTrafficMirrorFilterId().equals(this.getTrafficMirrorFilterId()) == false)
            return false;
        if (other.getTrafficDirection() == null ^ this.getTrafficDirection() == null)
            return false;
        if (other.getTrafficDirection() != null && other.getTrafficDirection().equals(this.getTrafficDirection()) == false)
            return false;
        if (other.getRuleNumber() == null ^ this.getRuleNumber() == null)
            return false;
        if (other.getRuleNumber() != null && other.getRuleNumber().equals(this.getRuleNumber()) == false)
            return false;
        if (other.getRuleAction() == null ^ this.getRuleAction() == null)
            return false;
        if (other.getRuleAction() != null && other.getRuleAction().equals(this.getRuleAction()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getDestinationPortRange() == null ^ this.getDestinationPortRange() == null)
            return false;
        if (other.getDestinationPortRange() != null && other.getDestinationPortRange().equals(this.getDestinationPortRange()) == false)
            return false;
        if (other.getSourcePortRange() == null ^ this.getSourcePortRange() == null)
            return false;
        if (other.getSourcePortRange() != null && other.getSourcePortRange().equals(this.getSourcePortRange()) == false)
            return false;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getSourceCidrBlock() == null ^ this.getSourceCidrBlock() == null)
            return false;
        if (other.getSourceCidrBlock() != null && other.getSourceCidrBlock().equals(this.getSourceCidrBlock()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficMirrorFilterRuleId() == null) ? 0 : getTrafficMirrorFilterRuleId().hashCode());
        hashCode = prime * hashCode + ((getTrafficMirrorFilterId() == null) ? 0 : getTrafficMirrorFilterId().hashCode());
        hashCode = prime * hashCode + ((getTrafficDirection() == null) ? 0 : getTrafficDirection().hashCode());
        hashCode = prime * hashCode + ((getRuleNumber() == null) ? 0 : getRuleNumber().hashCode());
        hashCode = prime * hashCode + ((getRuleAction() == null) ? 0 : getRuleAction().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getDestinationPortRange() == null) ? 0 : getDestinationPortRange().hashCode());
        hashCode = prime * hashCode + ((getSourcePortRange() == null) ? 0 : getSourcePortRange().hashCode());
        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getSourceCidrBlock() == null) ? 0 : getSourceCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public TrafficMirrorFilterRule clone() {
        try {
            return (TrafficMirrorFilterRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
