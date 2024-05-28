/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The analysis result for Network Firewall's stateless rule group analyzer. Every time you call <a>CreateRuleGroup</a>,
 * <a>UpdateRuleGroup</a>, or <a>DescribeRuleGroup</a> on a stateless rule group, Network Firewall analyzes the
 * stateless rule groups in your account and identifies the rules that might adversely effect your firewall's
 * functionality. For example, if Network Firewall detects a rule that's routing traffic asymmetrically, which impacts
 * the service's ability to properly process traffic, the service includes the rule in a list of analysis results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/AnalysisResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The priority number of the stateless rules identified in the analysis.
     * </p>
     */
    private java.util.List<String> identifiedRuleIds;
    /**
     * <p>
     * The types of rule configurations that Network Firewall analyzes your rule groups for. Network Firewall analyzes
     * stateless rule groups for the following types of rule configurations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STATELESS_RULE_FORWARDING_ASYMMETRICALLY</code>
     * </p>
     * <p>
     * Cause: One or more stateless rules with the action <code>pass</code> or <code>forward</code> are forwarding
     * traffic asymmetrically. Specifically, the rule's set of source IP addresses or their associated port numbers,
     * don't match the set of destination IP addresses or their associated port numbers.
     * </p>
     * <p>
     * To mitigate: Make sure that there's an existing return path. For example, if the rule allows traffic from source
     * 10.1.0.0/24 to destination 20.1.0.0/24, you should allow return traffic from source 20.1.0.0/24 to destination
     * 10.1.0.0/24.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATELESS_RULE_CONTAINS_TCP_FLAGS</code>
     * </p>
     * <p>
     * Cause: At least one stateless rule with the action <code>pass</code> or<code>forward</code> contains TCP flags
     * that are inconsistent in the forward and return directions.
     * </p>
     * <p>
     * To mitigate: Prevent asymmetric routing issues caused by TCP flags by following these actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Remove unnecessary TCP flag inspections from the rules.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need to inspect TCP flags, check that the rules correctly account for changes in TCP flags throughout the
     * TCP connection cycle, for example <code>SYN</code> and <code>ACK</code> flags used in a 3-way TCP handshake.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String identifiedType;
    /**
     * <p>
     * Provides analysis details for the identified rule.
     * </p>
     */
    private String analysisDetail;

    /**
     * <p>
     * The priority number of the stateless rules identified in the analysis.
     * </p>
     * 
     * @return The priority number of the stateless rules identified in the analysis.
     */

    public java.util.List<String> getIdentifiedRuleIds() {
        return identifiedRuleIds;
    }

    /**
     * <p>
     * The priority number of the stateless rules identified in the analysis.
     * </p>
     * 
     * @param identifiedRuleIds
     *        The priority number of the stateless rules identified in the analysis.
     */

    public void setIdentifiedRuleIds(java.util.Collection<String> identifiedRuleIds) {
        if (identifiedRuleIds == null) {
            this.identifiedRuleIds = null;
            return;
        }

        this.identifiedRuleIds = new java.util.ArrayList<String>(identifiedRuleIds);
    }

    /**
     * <p>
     * The priority number of the stateless rules identified in the analysis.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentifiedRuleIds(java.util.Collection)} or {@link #withIdentifiedRuleIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param identifiedRuleIds
     *        The priority number of the stateless rules identified in the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisResult withIdentifiedRuleIds(String... identifiedRuleIds) {
        if (this.identifiedRuleIds == null) {
            setIdentifiedRuleIds(new java.util.ArrayList<String>(identifiedRuleIds.length));
        }
        for (String ele : identifiedRuleIds) {
            this.identifiedRuleIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The priority number of the stateless rules identified in the analysis.
     * </p>
     * 
     * @param identifiedRuleIds
     *        The priority number of the stateless rules identified in the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisResult withIdentifiedRuleIds(java.util.Collection<String> identifiedRuleIds) {
        setIdentifiedRuleIds(identifiedRuleIds);
        return this;
    }

    /**
     * <p>
     * The types of rule configurations that Network Firewall analyzes your rule groups for. Network Firewall analyzes
     * stateless rule groups for the following types of rule configurations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STATELESS_RULE_FORWARDING_ASYMMETRICALLY</code>
     * </p>
     * <p>
     * Cause: One or more stateless rules with the action <code>pass</code> or <code>forward</code> are forwarding
     * traffic asymmetrically. Specifically, the rule's set of source IP addresses or their associated port numbers,
     * don't match the set of destination IP addresses or their associated port numbers.
     * </p>
     * <p>
     * To mitigate: Make sure that there's an existing return path. For example, if the rule allows traffic from source
     * 10.1.0.0/24 to destination 20.1.0.0/24, you should allow return traffic from source 20.1.0.0/24 to destination
     * 10.1.0.0/24.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATELESS_RULE_CONTAINS_TCP_FLAGS</code>
     * </p>
     * <p>
     * Cause: At least one stateless rule with the action <code>pass</code> or<code>forward</code> contains TCP flags
     * that are inconsistent in the forward and return directions.
     * </p>
     * <p>
     * To mitigate: Prevent asymmetric routing issues caused by TCP flags by following these actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Remove unnecessary TCP flag inspections from the rules.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need to inspect TCP flags, check that the rules correctly account for changes in TCP flags throughout the
     * TCP connection cycle, for example <code>SYN</code> and <code>ACK</code> flags used in a 3-way TCP handshake.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param identifiedType
     *        The types of rule configurations that Network Firewall analyzes your rule groups for. Network Firewall
     *        analyzes stateless rule groups for the following types of rule configurations:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>STATELESS_RULE_FORWARDING_ASYMMETRICALLY</code>
     *        </p>
     *        <p>
     *        Cause: One or more stateless rules with the action <code>pass</code> or <code>forward</code> are
     *        forwarding traffic asymmetrically. Specifically, the rule's set of source IP addresses or their associated
     *        port numbers, don't match the set of destination IP addresses or their associated port numbers.
     *        </p>
     *        <p>
     *        To mitigate: Make sure that there's an existing return path. For example, if the rule allows traffic from
     *        source 10.1.0.0/24 to destination 20.1.0.0/24, you should allow return traffic from source 20.1.0.0/24 to
     *        destination 10.1.0.0/24.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STATELESS_RULE_CONTAINS_TCP_FLAGS</code>
     *        </p>
     *        <p>
     *        Cause: At least one stateless rule with the action <code>pass</code> or<code>forward</code> contains TCP
     *        flags that are inconsistent in the forward and return directions.
     *        </p>
     *        <p>
     *        To mitigate: Prevent asymmetric routing issues caused by TCP flags by following these actions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Remove unnecessary TCP flag inspections from the rules.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you need to inspect TCP flags, check that the rules correctly account for changes in TCP flags
     *        throughout the TCP connection cycle, for example <code>SYN</code> and <code>ACK</code> flags used in a
     *        3-way TCP handshake.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see IdentifiedType
     */

    public void setIdentifiedType(String identifiedType) {
        this.identifiedType = identifiedType;
    }

    /**
     * <p>
     * The types of rule configurations that Network Firewall analyzes your rule groups for. Network Firewall analyzes
     * stateless rule groups for the following types of rule configurations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STATELESS_RULE_FORWARDING_ASYMMETRICALLY</code>
     * </p>
     * <p>
     * Cause: One or more stateless rules with the action <code>pass</code> or <code>forward</code> are forwarding
     * traffic asymmetrically. Specifically, the rule's set of source IP addresses or their associated port numbers,
     * don't match the set of destination IP addresses or their associated port numbers.
     * </p>
     * <p>
     * To mitigate: Make sure that there's an existing return path. For example, if the rule allows traffic from source
     * 10.1.0.0/24 to destination 20.1.0.0/24, you should allow return traffic from source 20.1.0.0/24 to destination
     * 10.1.0.0/24.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATELESS_RULE_CONTAINS_TCP_FLAGS</code>
     * </p>
     * <p>
     * Cause: At least one stateless rule with the action <code>pass</code> or<code>forward</code> contains TCP flags
     * that are inconsistent in the forward and return directions.
     * </p>
     * <p>
     * To mitigate: Prevent asymmetric routing issues caused by TCP flags by following these actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Remove unnecessary TCP flag inspections from the rules.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need to inspect TCP flags, check that the rules correctly account for changes in TCP flags throughout the
     * TCP connection cycle, for example <code>SYN</code> and <code>ACK</code> flags used in a 3-way TCP handshake.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The types of rule configurations that Network Firewall analyzes your rule groups for. Network Firewall
     *         analyzes stateless rule groups for the following types of rule configurations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>STATELESS_RULE_FORWARDING_ASYMMETRICALLY</code>
     *         </p>
     *         <p>
     *         Cause: One or more stateless rules with the action <code>pass</code> or <code>forward</code> are
     *         forwarding traffic asymmetrically. Specifically, the rule's set of source IP addresses or their
     *         associated port numbers, don't match the set of destination IP addresses or their associated port
     *         numbers.
     *         </p>
     *         <p>
     *         To mitigate: Make sure that there's an existing return path. For example, if the rule allows traffic from
     *         source 10.1.0.0/24 to destination 20.1.0.0/24, you should allow return traffic from source 20.1.0.0/24 to
     *         destination 10.1.0.0/24.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STATELESS_RULE_CONTAINS_TCP_FLAGS</code>
     *         </p>
     *         <p>
     *         Cause: At least one stateless rule with the action <code>pass</code> or<code>forward</code> contains TCP
     *         flags that are inconsistent in the forward and return directions.
     *         </p>
     *         <p>
     *         To mitigate: Prevent asymmetric routing issues caused by TCP flags by following these actions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Remove unnecessary TCP flag inspections from the rules.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you need to inspect TCP flags, check that the rules correctly account for changes in TCP flags
     *         throughout the TCP connection cycle, for example <code>SYN</code> and <code>ACK</code> flags used in a
     *         3-way TCP handshake.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @see IdentifiedType
     */

    public String getIdentifiedType() {
        return this.identifiedType;
    }

    /**
     * <p>
     * The types of rule configurations that Network Firewall analyzes your rule groups for. Network Firewall analyzes
     * stateless rule groups for the following types of rule configurations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STATELESS_RULE_FORWARDING_ASYMMETRICALLY</code>
     * </p>
     * <p>
     * Cause: One or more stateless rules with the action <code>pass</code> or <code>forward</code> are forwarding
     * traffic asymmetrically. Specifically, the rule's set of source IP addresses or their associated port numbers,
     * don't match the set of destination IP addresses or their associated port numbers.
     * </p>
     * <p>
     * To mitigate: Make sure that there's an existing return path. For example, if the rule allows traffic from source
     * 10.1.0.0/24 to destination 20.1.0.0/24, you should allow return traffic from source 20.1.0.0/24 to destination
     * 10.1.0.0/24.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATELESS_RULE_CONTAINS_TCP_FLAGS</code>
     * </p>
     * <p>
     * Cause: At least one stateless rule with the action <code>pass</code> or<code>forward</code> contains TCP flags
     * that are inconsistent in the forward and return directions.
     * </p>
     * <p>
     * To mitigate: Prevent asymmetric routing issues caused by TCP flags by following these actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Remove unnecessary TCP flag inspections from the rules.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need to inspect TCP flags, check that the rules correctly account for changes in TCP flags throughout the
     * TCP connection cycle, for example <code>SYN</code> and <code>ACK</code> flags used in a 3-way TCP handshake.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param identifiedType
     *        The types of rule configurations that Network Firewall analyzes your rule groups for. Network Firewall
     *        analyzes stateless rule groups for the following types of rule configurations:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>STATELESS_RULE_FORWARDING_ASYMMETRICALLY</code>
     *        </p>
     *        <p>
     *        Cause: One or more stateless rules with the action <code>pass</code> or <code>forward</code> are
     *        forwarding traffic asymmetrically. Specifically, the rule's set of source IP addresses or their associated
     *        port numbers, don't match the set of destination IP addresses or their associated port numbers.
     *        </p>
     *        <p>
     *        To mitigate: Make sure that there's an existing return path. For example, if the rule allows traffic from
     *        source 10.1.0.0/24 to destination 20.1.0.0/24, you should allow return traffic from source 20.1.0.0/24 to
     *        destination 10.1.0.0/24.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STATELESS_RULE_CONTAINS_TCP_FLAGS</code>
     *        </p>
     *        <p>
     *        Cause: At least one stateless rule with the action <code>pass</code> or<code>forward</code> contains TCP
     *        flags that are inconsistent in the forward and return directions.
     *        </p>
     *        <p>
     *        To mitigate: Prevent asymmetric routing issues caused by TCP flags by following these actions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Remove unnecessary TCP flag inspections from the rules.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you need to inspect TCP flags, check that the rules correctly account for changes in TCP flags
     *        throughout the TCP connection cycle, for example <code>SYN</code> and <code>ACK</code> flags used in a
     *        3-way TCP handshake.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentifiedType
     */

    public AnalysisResult withIdentifiedType(String identifiedType) {
        setIdentifiedType(identifiedType);
        return this;
    }

    /**
     * <p>
     * The types of rule configurations that Network Firewall analyzes your rule groups for. Network Firewall analyzes
     * stateless rule groups for the following types of rule configurations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STATELESS_RULE_FORWARDING_ASYMMETRICALLY</code>
     * </p>
     * <p>
     * Cause: One or more stateless rules with the action <code>pass</code> or <code>forward</code> are forwarding
     * traffic asymmetrically. Specifically, the rule's set of source IP addresses or their associated port numbers,
     * don't match the set of destination IP addresses or their associated port numbers.
     * </p>
     * <p>
     * To mitigate: Make sure that there's an existing return path. For example, if the rule allows traffic from source
     * 10.1.0.0/24 to destination 20.1.0.0/24, you should allow return traffic from source 20.1.0.0/24 to destination
     * 10.1.0.0/24.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATELESS_RULE_CONTAINS_TCP_FLAGS</code>
     * </p>
     * <p>
     * Cause: At least one stateless rule with the action <code>pass</code> or<code>forward</code> contains TCP flags
     * that are inconsistent in the forward and return directions.
     * </p>
     * <p>
     * To mitigate: Prevent asymmetric routing issues caused by TCP flags by following these actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Remove unnecessary TCP flag inspections from the rules.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need to inspect TCP flags, check that the rules correctly account for changes in TCP flags throughout the
     * TCP connection cycle, for example <code>SYN</code> and <code>ACK</code> flags used in a 3-way TCP handshake.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param identifiedType
     *        The types of rule configurations that Network Firewall analyzes your rule groups for. Network Firewall
     *        analyzes stateless rule groups for the following types of rule configurations:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>STATELESS_RULE_FORWARDING_ASYMMETRICALLY</code>
     *        </p>
     *        <p>
     *        Cause: One or more stateless rules with the action <code>pass</code> or <code>forward</code> are
     *        forwarding traffic asymmetrically. Specifically, the rule's set of source IP addresses or their associated
     *        port numbers, don't match the set of destination IP addresses or their associated port numbers.
     *        </p>
     *        <p>
     *        To mitigate: Make sure that there's an existing return path. For example, if the rule allows traffic from
     *        source 10.1.0.0/24 to destination 20.1.0.0/24, you should allow return traffic from source 20.1.0.0/24 to
     *        destination 10.1.0.0/24.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STATELESS_RULE_CONTAINS_TCP_FLAGS</code>
     *        </p>
     *        <p>
     *        Cause: At least one stateless rule with the action <code>pass</code> or<code>forward</code> contains TCP
     *        flags that are inconsistent in the forward and return directions.
     *        </p>
     *        <p>
     *        To mitigate: Prevent asymmetric routing issues caused by TCP flags by following these actions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Remove unnecessary TCP flag inspections from the rules.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you need to inspect TCP flags, check that the rules correctly account for changes in TCP flags
     *        throughout the TCP connection cycle, for example <code>SYN</code> and <code>ACK</code> flags used in a
     *        3-way TCP handshake.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentifiedType
     */

    public AnalysisResult withIdentifiedType(IdentifiedType identifiedType) {
        this.identifiedType = identifiedType.toString();
        return this;
    }

    /**
     * <p>
     * Provides analysis details for the identified rule.
     * </p>
     * 
     * @param analysisDetail
     *        Provides analysis details for the identified rule.
     */

    public void setAnalysisDetail(String analysisDetail) {
        this.analysisDetail = analysisDetail;
    }

    /**
     * <p>
     * Provides analysis details for the identified rule.
     * </p>
     * 
     * @return Provides analysis details for the identified rule.
     */

    public String getAnalysisDetail() {
        return this.analysisDetail;
    }

    /**
     * <p>
     * Provides analysis details for the identified rule.
     * </p>
     * 
     * @param analysisDetail
     *        Provides analysis details for the identified rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisResult withAnalysisDetail(String analysisDetail) {
        setAnalysisDetail(analysisDetail);
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
        if (getIdentifiedRuleIds() != null)
            sb.append("IdentifiedRuleIds: ").append(getIdentifiedRuleIds()).append(",");
        if (getIdentifiedType() != null)
            sb.append("IdentifiedType: ").append(getIdentifiedType()).append(",");
        if (getAnalysisDetail() != null)
            sb.append("AnalysisDetail: ").append(getAnalysisDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisResult == false)
            return false;
        AnalysisResult other = (AnalysisResult) obj;
        if (other.getIdentifiedRuleIds() == null ^ this.getIdentifiedRuleIds() == null)
            return false;
        if (other.getIdentifiedRuleIds() != null && other.getIdentifiedRuleIds().equals(this.getIdentifiedRuleIds()) == false)
            return false;
        if (other.getIdentifiedType() == null ^ this.getIdentifiedType() == null)
            return false;
        if (other.getIdentifiedType() != null && other.getIdentifiedType().equals(this.getIdentifiedType()) == false)
            return false;
        if (other.getAnalysisDetail() == null ^ this.getAnalysisDetail() == null)
            return false;
        if (other.getAnalysisDetail() != null && other.getAnalysisDetail().equals(this.getAnalysisDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifiedRuleIds() == null) ? 0 : getIdentifiedRuleIds().hashCode());
        hashCode = prime * hashCode + ((getIdentifiedType() == null) ? 0 : getIdentifiedType().hashCode());
        hashCode = prime * hashCode + ((getAnalysisDetail() == null) ? 0 : getAnalysisDetail().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisResult clone() {
        try {
            return (AnalysisResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.AnalysisResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
