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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyTrafficMirrorFilterRuleRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTrafficMirrorFilterRuleRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyTrafficMirrorFilterRuleRequest> {

    /**
     * <p>
     * The ID of the Traffic Mirror rule.
     * </p>
     */
    private String trafficMirrorFilterRuleId;
    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>) to assign to the rule.
     * </p>
     */
    private String trafficDirection;
    /**
     * <p>
     * The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given
     * direction. The rules are processed in ascending order by rule number.
     * </p>
     */
    private Integer ruleNumber;
    /**
     * <p>
     * The action to assign to the rule.
     * </p>
     */
    private String ruleAction;
    /**
     * <p>
     * The destination ports that are associated with the Traffic Mirror rule.
     * </p>
     */
    private TrafficMirrorPortRangeRequest destinationPortRange;
    /**
     * <p>
     * The port range to assign to the Traffic Mirror rule.
     * </p>
     */
    private TrafficMirrorPortRangeRequest sourcePortRange;
    /**
     * <p>
     * The protocol, for example TCP, to assign to the Traffic Mirror rule.
     * </p>
     */
    private Integer protocol;
    /**
     * <p>
     * The destination CIDR block to assign to the Traffic Mirror rule.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * The source CIDR block to assign to the Traffic Mirror rule.
     * </p>
     */
    private String sourceCidrBlock;
    /**
     * <p>
     * The description to assign to the Traffic Mirror rule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror filter rule.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror filter rule, the property is set to the default.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> removeFields;

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

    public ModifyTrafficMirrorFilterRuleRequest withTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
        setTrafficMirrorFilterRuleId(trafficMirrorFilterRuleId);
        return this;
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>) to assign to the rule.
     * </p>
     * 
     * @param trafficDirection
     *        The type of traffic (<code>ingress</code> | <code>egress</code>) to assign to the rule.
     * @see TrafficDirection
     */

    public void setTrafficDirection(String trafficDirection) {
        this.trafficDirection = trafficDirection;
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>) to assign to the rule.
     * </p>
     * 
     * @return The type of traffic (<code>ingress</code> | <code>egress</code>) to assign to the rule.
     * @see TrafficDirection
     */

    public String getTrafficDirection() {
        return this.trafficDirection;
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>) to assign to the rule.
     * </p>
     * 
     * @param trafficDirection
     *        The type of traffic (<code>ingress</code> | <code>egress</code>) to assign to the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficDirection
     */

    public ModifyTrafficMirrorFilterRuleRequest withTrafficDirection(String trafficDirection) {
        setTrafficDirection(trafficDirection);
        return this;
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>) to assign to the rule.
     * </p>
     * 
     * @param trafficDirection
     *        The type of traffic (<code>ingress</code> | <code>egress</code>) to assign to the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficDirection
     */

    public ModifyTrafficMirrorFilterRuleRequest withTrafficDirection(TrafficDirection trafficDirection) {
        this.trafficDirection = trafficDirection.toString();
        return this;
    }

    /**
     * <p>
     * The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given
     * direction. The rules are processed in ascending order by rule number.
     * </p>
     * 
     * @param ruleNumber
     *        The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given
     *        direction. The rules are processed in ascending order by rule number.
     */

    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    /**
     * <p>
     * The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given
     * direction. The rules are processed in ascending order by rule number.
     * </p>
     * 
     * @return The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given
     *         direction. The rules are processed in ascending order by rule number.
     */

    public Integer getRuleNumber() {
        return this.ruleNumber;
    }

    /**
     * <p>
     * The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given
     * direction. The rules are processed in ascending order by rule number.
     * </p>
     * 
     * @param ruleNumber
     *        The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given
     *        direction. The rules are processed in ascending order by rule number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrafficMirrorFilterRuleRequest withRuleNumber(Integer ruleNumber) {
        setRuleNumber(ruleNumber);
        return this;
    }

    /**
     * <p>
     * The action to assign to the rule.
     * </p>
     * 
     * @param ruleAction
     *        The action to assign to the rule.
     * @see TrafficMirrorRuleAction
     */

    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    /**
     * <p>
     * The action to assign to the rule.
     * </p>
     * 
     * @return The action to assign to the rule.
     * @see TrafficMirrorRuleAction
     */

    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * <p>
     * The action to assign to the rule.
     * </p>
     * 
     * @param ruleAction
     *        The action to assign to the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorRuleAction
     */

    public ModifyTrafficMirrorFilterRuleRequest withRuleAction(String ruleAction) {
        setRuleAction(ruleAction);
        return this;
    }

    /**
     * <p>
     * The action to assign to the rule.
     * </p>
     * 
     * @param ruleAction
     *        The action to assign to the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorRuleAction
     */

    public ModifyTrafficMirrorFilterRuleRequest withRuleAction(TrafficMirrorRuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
        return this;
    }

    /**
     * <p>
     * The destination ports that are associated with the Traffic Mirror rule.
     * </p>
     * 
     * @param destinationPortRange
     *        The destination ports that are associated with the Traffic Mirror rule.
     */

    public void setDestinationPortRange(TrafficMirrorPortRangeRequest destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
    }

    /**
     * <p>
     * The destination ports that are associated with the Traffic Mirror rule.
     * </p>
     * 
     * @return The destination ports that are associated with the Traffic Mirror rule.
     */

    public TrafficMirrorPortRangeRequest getDestinationPortRange() {
        return this.destinationPortRange;
    }

    /**
     * <p>
     * The destination ports that are associated with the Traffic Mirror rule.
     * </p>
     * 
     * @param destinationPortRange
     *        The destination ports that are associated with the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrafficMirrorFilterRuleRequest withDestinationPortRange(TrafficMirrorPortRangeRequest destinationPortRange) {
        setDestinationPortRange(destinationPortRange);
        return this;
    }

    /**
     * <p>
     * The port range to assign to the Traffic Mirror rule.
     * </p>
     * 
     * @param sourcePortRange
     *        The port range to assign to the Traffic Mirror rule.
     */

    public void setSourcePortRange(TrafficMirrorPortRangeRequest sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
    }

    /**
     * <p>
     * The port range to assign to the Traffic Mirror rule.
     * </p>
     * 
     * @return The port range to assign to the Traffic Mirror rule.
     */

    public TrafficMirrorPortRangeRequest getSourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * <p>
     * The port range to assign to the Traffic Mirror rule.
     * </p>
     * 
     * @param sourcePortRange
     *        The port range to assign to the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrafficMirrorFilterRuleRequest withSourcePortRange(TrafficMirrorPortRangeRequest sourcePortRange) {
        setSourcePortRange(sourcePortRange);
        return this;
    }

    /**
     * <p>
     * The protocol, for example TCP, to assign to the Traffic Mirror rule.
     * </p>
     * 
     * @param protocol
     *        The protocol, for example TCP, to assign to the Traffic Mirror rule.
     */

    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol, for example TCP, to assign to the Traffic Mirror rule.
     * </p>
     * 
     * @return The protocol, for example TCP, to assign to the Traffic Mirror rule.
     */

    public Integer getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol, for example TCP, to assign to the Traffic Mirror rule.
     * </p>
     * 
     * @param protocol
     *        The protocol, for example TCP, to assign to the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrafficMirrorFilterRuleRequest withProtocol(Integer protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The destination CIDR block to assign to the Traffic Mirror rule.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The destination CIDR block to assign to the Traffic Mirror rule.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The destination CIDR block to assign to the Traffic Mirror rule.
     * </p>
     * 
     * @return The destination CIDR block to assign to the Traffic Mirror rule.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * The destination CIDR block to assign to the Traffic Mirror rule.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The destination CIDR block to assign to the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrafficMirrorFilterRuleRequest withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * The source CIDR block to assign to the Traffic Mirror rule.
     * </p>
     * 
     * @param sourceCidrBlock
     *        The source CIDR block to assign to the Traffic Mirror rule.
     */

    public void setSourceCidrBlock(String sourceCidrBlock) {
        this.sourceCidrBlock = sourceCidrBlock;
    }

    /**
     * <p>
     * The source CIDR block to assign to the Traffic Mirror rule.
     * </p>
     * 
     * @return The source CIDR block to assign to the Traffic Mirror rule.
     */

    public String getSourceCidrBlock() {
        return this.sourceCidrBlock;
    }

    /**
     * <p>
     * The source CIDR block to assign to the Traffic Mirror rule.
     * </p>
     * 
     * @param sourceCidrBlock
     *        The source CIDR block to assign to the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrafficMirrorFilterRuleRequest withSourceCidrBlock(String sourceCidrBlock) {
        setSourceCidrBlock(sourceCidrBlock);
        return this;
    }

    /**
     * <p>
     * The description to assign to the Traffic Mirror rule.
     * </p>
     * 
     * @param description
     *        The description to assign to the Traffic Mirror rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description to assign to the Traffic Mirror rule.
     * </p>
     * 
     * @return The description to assign to the Traffic Mirror rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description to assign to the Traffic Mirror rule.
     * </p>
     * 
     * @param description
     *        The description to assign to the Traffic Mirror rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrafficMirrorFilterRuleRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror filter rule.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror filter rule, the property is set to the default.
     * </p>
     * 
     * @return The properties that you want to remove from the Traffic Mirror filter rule.</p>
     *         <p>
     *         When you remove a property from a Traffic Mirror filter rule, the property is set to the default.
     * @see TrafficMirrorFilterRuleField
     */

    public java.util.List<String> getRemoveFields() {
        if (removeFields == null) {
            removeFields = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return removeFields;
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror filter rule.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror filter rule, the property is set to the default.
     * </p>
     * 
     * @param removeFields
     *        The properties that you want to remove from the Traffic Mirror filter rule.</p>
     *        <p>
     *        When you remove a property from a Traffic Mirror filter rule, the property is set to the default.
     * @see TrafficMirrorFilterRuleField
     */

    public void setRemoveFields(java.util.Collection<String> removeFields) {
        if (removeFields == null) {
            this.removeFields = null;
            return;
        }

        this.removeFields = new com.amazonaws.internal.SdkInternalList<String>(removeFields);
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror filter rule.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror filter rule, the property is set to the default.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveFields(java.util.Collection)} or {@link #withRemoveFields(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param removeFields
     *        The properties that you want to remove from the Traffic Mirror filter rule.</p>
     *        <p>
     *        When you remove a property from a Traffic Mirror filter rule, the property is set to the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorFilterRuleField
     */

    public ModifyTrafficMirrorFilterRuleRequest withRemoveFields(String... removeFields) {
        if (this.removeFields == null) {
            setRemoveFields(new com.amazonaws.internal.SdkInternalList<String>(removeFields.length));
        }
        for (String ele : removeFields) {
            this.removeFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror filter rule.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror filter rule, the property is set to the default.
     * </p>
     * 
     * @param removeFields
     *        The properties that you want to remove from the Traffic Mirror filter rule.</p>
     *        <p>
     *        When you remove a property from a Traffic Mirror filter rule, the property is set to the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorFilterRuleField
     */

    public ModifyTrafficMirrorFilterRuleRequest withRemoveFields(java.util.Collection<String> removeFields) {
        setRemoveFields(removeFields);
        return this;
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror filter rule.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror filter rule, the property is set to the default.
     * </p>
     * 
     * @param removeFields
     *        The properties that you want to remove from the Traffic Mirror filter rule.</p>
     *        <p>
     *        When you remove a property from a Traffic Mirror filter rule, the property is set to the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorFilterRuleField
     */

    public ModifyTrafficMirrorFilterRuleRequest withRemoveFields(TrafficMirrorFilterRuleField... removeFields) {
        com.amazonaws.internal.SdkInternalList<String> removeFieldsCopy = new com.amazonaws.internal.SdkInternalList<String>(removeFields.length);
        for (TrafficMirrorFilterRuleField value : removeFields) {
            removeFieldsCopy.add(value.toString());
        }
        if (getRemoveFields() == null) {
            setRemoveFields(removeFieldsCopy);
        } else {
            getRemoveFields().addAll(removeFieldsCopy);
        }
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyTrafficMirrorFilterRuleRequest> getDryRunRequest() {
        Request<ModifyTrafficMirrorFilterRuleRequest> request = new ModifyTrafficMirrorFilterRuleRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getTrafficDirection() != null)
            sb.append("TrafficDirection: ").append(getTrafficDirection()).append(",");
        if (getRuleNumber() != null)
            sb.append("RuleNumber: ").append(getRuleNumber()).append(",");
        if (getRuleAction() != null)
            sb.append("RuleAction: ").append(getRuleAction()).append(",");
        if (getDestinationPortRange() != null)
            sb.append("DestinationPortRange: ").append(getDestinationPortRange()).append(",");
        if (getSourcePortRange() != null)
            sb.append("SourcePortRange: ").append(getSourcePortRange()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: ").append(getDestinationCidrBlock()).append(",");
        if (getSourceCidrBlock() != null)
            sb.append("SourceCidrBlock: ").append(getSourceCidrBlock()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRemoveFields() != null)
            sb.append("RemoveFields: ").append(getRemoveFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyTrafficMirrorFilterRuleRequest == false)
            return false;
        ModifyTrafficMirrorFilterRuleRequest other = (ModifyTrafficMirrorFilterRuleRequest) obj;
        if (other.getTrafficMirrorFilterRuleId() == null ^ this.getTrafficMirrorFilterRuleId() == null)
            return false;
        if (other.getTrafficMirrorFilterRuleId() != null && other.getTrafficMirrorFilterRuleId().equals(this.getTrafficMirrorFilterRuleId()) == false)
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
        if (other.getDestinationPortRange() == null ^ this.getDestinationPortRange() == null)
            return false;
        if (other.getDestinationPortRange() != null && other.getDestinationPortRange().equals(this.getDestinationPortRange()) == false)
            return false;
        if (other.getSourcePortRange() == null ^ this.getSourcePortRange() == null)
            return false;
        if (other.getSourcePortRange() != null && other.getSourcePortRange().equals(this.getSourcePortRange()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
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
        if (other.getRemoveFields() == null ^ this.getRemoveFields() == null)
            return false;
        if (other.getRemoveFields() != null && other.getRemoveFields().equals(this.getRemoveFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficMirrorFilterRuleId() == null) ? 0 : getTrafficMirrorFilterRuleId().hashCode());
        hashCode = prime * hashCode + ((getTrafficDirection() == null) ? 0 : getTrafficDirection().hashCode());
        hashCode = prime * hashCode + ((getRuleNumber() == null) ? 0 : getRuleNumber().hashCode());
        hashCode = prime * hashCode + ((getRuleAction() == null) ? 0 : getRuleAction().hashCode());
        hashCode = prime * hashCode + ((getDestinationPortRange() == null) ? 0 : getDestinationPortRange().hashCode());
        hashCode = prime * hashCode + ((getSourcePortRange() == null) ? 0 : getSourcePortRange().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getSourceCidrBlock() == null) ? 0 : getSourceCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRemoveFields() == null) ? 0 : getRemoveFields().hashCode());
        return hashCode;
    }

    @Override
    public ModifyTrafficMirrorFilterRuleRequest clone() {
        return (ModifyTrafficMirrorFilterRuleRequest) super.clone();
    }
}
