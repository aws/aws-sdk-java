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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateTrafficMirrorFilterRuleRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrafficMirrorFilterRuleRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateTrafficMirrorFilterRuleRequest> {

    /**
     * <p>
     * The ID of the filter that this rule is associated with.
     * </p>
     */
    private String trafficMirrorFilterId;
    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>).
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
     * The action to take (<code>accept</code> | <code>reject</code>) on the filtered traffic.
     * </p>
     */
    private String ruleAction;
    /**
     * <p>
     * The destination port range.
     * </p>
     */
    private TrafficMirrorPortRangeRequest destinationPortRange;
    /**
     * <p>
     * The source port range.
     * </p>
     */
    private TrafficMirrorPortRangeRequest sourcePortRange;
    /**
     * <p>
     * The protocol, for example UDP, to assign to the Traffic Mirror rule.
     * </p>
     * <p>
     * For information about the protocol value, see <a
     * href="https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a> on the
     * Internet Assigned Numbers Authority (IANA) website.
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
     * The description of the Traffic Mirror rule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the filter that this rule is associated with.
     * </p>
     * 
     * @param trafficMirrorFilterId
     *        The ID of the filter that this rule is associated with.
     */

    public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the filter that this rule is associated with.
     * </p>
     * 
     * @return The ID of the filter that this rule is associated with.
     */

    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the filter that this rule is associated with.
     * </p>
     * 
     * @param trafficMirrorFilterId
     *        The ID of the filter that this rule is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficMirrorFilterRuleRequest withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        setTrafficMirrorFilterId(trafficMirrorFilterId);
        return this;
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>).
     * </p>
     * 
     * @param trafficDirection
     *        The type of traffic (<code>ingress</code> | <code>egress</code>).
     * @see TrafficDirection
     */

    public void setTrafficDirection(String trafficDirection) {
        this.trafficDirection = trafficDirection;
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>).
     * </p>
     * 
     * @return The type of traffic (<code>ingress</code> | <code>egress</code>).
     * @see TrafficDirection
     */

    public String getTrafficDirection() {
        return this.trafficDirection;
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>).
     * </p>
     * 
     * @param trafficDirection
     *        The type of traffic (<code>ingress</code> | <code>egress</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficDirection
     */

    public CreateTrafficMirrorFilterRuleRequest withTrafficDirection(String trafficDirection) {
        setTrafficDirection(trafficDirection);
        return this;
    }

    /**
     * <p>
     * The type of traffic (<code>ingress</code> | <code>egress</code>).
     * </p>
     * 
     * @param trafficDirection
     *        The type of traffic (<code>ingress</code> | <code>egress</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficDirection
     */

    public CreateTrafficMirrorFilterRuleRequest withTrafficDirection(TrafficDirection trafficDirection) {
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

    public CreateTrafficMirrorFilterRuleRequest withRuleNumber(Integer ruleNumber) {
        setRuleNumber(ruleNumber);
        return this;
    }

    /**
     * <p>
     * The action to take (<code>accept</code> | <code>reject</code>) on the filtered traffic.
     * </p>
     * 
     * @param ruleAction
     *        The action to take (<code>accept</code> | <code>reject</code>) on the filtered traffic.
     * @see TrafficMirrorRuleAction
     */

    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    /**
     * <p>
     * The action to take (<code>accept</code> | <code>reject</code>) on the filtered traffic.
     * </p>
     * 
     * @return The action to take (<code>accept</code> | <code>reject</code>) on the filtered traffic.
     * @see TrafficMirrorRuleAction
     */

    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * <p>
     * The action to take (<code>accept</code> | <code>reject</code>) on the filtered traffic.
     * </p>
     * 
     * @param ruleAction
     *        The action to take (<code>accept</code> | <code>reject</code>) on the filtered traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorRuleAction
     */

    public CreateTrafficMirrorFilterRuleRequest withRuleAction(String ruleAction) {
        setRuleAction(ruleAction);
        return this;
    }

    /**
     * <p>
     * The action to take (<code>accept</code> | <code>reject</code>) on the filtered traffic.
     * </p>
     * 
     * @param ruleAction
     *        The action to take (<code>accept</code> | <code>reject</code>) on the filtered traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorRuleAction
     */

    public CreateTrafficMirrorFilterRuleRequest withRuleAction(TrafficMirrorRuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
        return this;
    }

    /**
     * <p>
     * The destination port range.
     * </p>
     * 
     * @param destinationPortRange
     *        The destination port range.
     */

    public void setDestinationPortRange(TrafficMirrorPortRangeRequest destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
    }

    /**
     * <p>
     * The destination port range.
     * </p>
     * 
     * @return The destination port range.
     */

    public TrafficMirrorPortRangeRequest getDestinationPortRange() {
        return this.destinationPortRange;
    }

    /**
     * <p>
     * The destination port range.
     * </p>
     * 
     * @param destinationPortRange
     *        The destination port range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficMirrorFilterRuleRequest withDestinationPortRange(TrafficMirrorPortRangeRequest destinationPortRange) {
        setDestinationPortRange(destinationPortRange);
        return this;
    }

    /**
     * <p>
     * The source port range.
     * </p>
     * 
     * @param sourcePortRange
     *        The source port range.
     */

    public void setSourcePortRange(TrafficMirrorPortRangeRequest sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
    }

    /**
     * <p>
     * The source port range.
     * </p>
     * 
     * @return The source port range.
     */

    public TrafficMirrorPortRangeRequest getSourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * <p>
     * The source port range.
     * </p>
     * 
     * @param sourcePortRange
     *        The source port range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficMirrorFilterRuleRequest withSourcePortRange(TrafficMirrorPortRangeRequest sourcePortRange) {
        setSourcePortRange(sourcePortRange);
        return this;
    }

    /**
     * <p>
     * The protocol, for example UDP, to assign to the Traffic Mirror rule.
     * </p>
     * <p>
     * For information about the protocol value, see <a
     * href="https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a> on the
     * Internet Assigned Numbers Authority (IANA) website.
     * </p>
     * 
     * @param protocol
     *        The protocol, for example UDP, to assign to the Traffic Mirror rule.</p>
     *        <p>
     *        For information about the protocol value, see <a
     *        href="https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a> on
     *        the Internet Assigned Numbers Authority (IANA) website.
     */

    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol, for example UDP, to assign to the Traffic Mirror rule.
     * </p>
     * <p>
     * For information about the protocol value, see <a
     * href="https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a> on the
     * Internet Assigned Numbers Authority (IANA) website.
     * </p>
     * 
     * @return The protocol, for example UDP, to assign to the Traffic Mirror rule.</p>
     *         <p>
     *         For information about the protocol value, see <a
     *         href="https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a> on
     *         the Internet Assigned Numbers Authority (IANA) website.
     */

    public Integer getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol, for example UDP, to assign to the Traffic Mirror rule.
     * </p>
     * <p>
     * For information about the protocol value, see <a
     * href="https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a> on the
     * Internet Assigned Numbers Authority (IANA) website.
     * </p>
     * 
     * @param protocol
     *        The protocol, for example UDP, to assign to the Traffic Mirror rule.</p>
     *        <p>
     *        For information about the protocol value, see <a
     *        href="https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers</a> on
     *        the Internet Assigned Numbers Authority (IANA) website.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficMirrorFilterRuleRequest withProtocol(Integer protocol) {
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

    public CreateTrafficMirrorFilterRuleRequest withDestinationCidrBlock(String destinationCidrBlock) {
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

    public CreateTrafficMirrorFilterRuleRequest withSourceCidrBlock(String sourceCidrBlock) {
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

    public CreateTrafficMirrorFilterRuleRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficMirrorFilterRuleRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateTrafficMirrorFilterRuleRequest> getDryRunRequest() {
        Request<CreateTrafficMirrorFilterRuleRequest> request = new CreateTrafficMirrorFilterRuleRequestMarshaller().marshall(this);
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
        if (getTrafficMirrorFilterId() != null)
            sb.append("TrafficMirrorFilterId: ").append(getTrafficMirrorFilterId()).append(",");
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrafficMirrorFilterRuleRequest == false)
            return false;
        CreateTrafficMirrorFilterRuleRequest other = (CreateTrafficMirrorFilterRuleRequest) obj;
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficMirrorFilterId() == null) ? 0 : getTrafficMirrorFilterId().hashCode());
        hashCode = prime * hashCode + ((getTrafficDirection() == null) ? 0 : getTrafficDirection().hashCode());
        hashCode = prime * hashCode + ((getRuleNumber() == null) ? 0 : getRuleNumber().hashCode());
        hashCode = prime * hashCode + ((getRuleAction() == null) ? 0 : getRuleAction().hashCode());
        hashCode = prime * hashCode + ((getDestinationPortRange() == null) ? 0 : getDestinationPortRange().hashCode());
        hashCode = prime * hashCode + ((getSourcePortRange() == null) ? 0 : getSourcePortRange().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getSourceCidrBlock() == null) ? 0 : getSourceCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrafficMirrorFilterRuleRequest clone() {
        return (CreateTrafficMirrorFilterRuleRequest) super.clone();
    }
}
