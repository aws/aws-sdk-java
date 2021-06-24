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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a single sampled web request. The response from <a>GetSampledRequests</a> includes a
 * <code>SampledHTTPRequests</code> complex type that appears as <code>SampledRequests</code> in the response syntax.
 * <code>SampledHTTPRequests</code> contains an array of <code>SampledHTTPRequest</code> objects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/SampledHTTPRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SampledHTTPRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A complex type that contains detailed information about the request.
     * </p>
     */
    private HTTPRequest request;
    /**
     * <p>
     * A value that indicates how one result in the response relates proportionally to other results in the response.
     * For example, a result that has a weight of <code>2</code> represents roughly twice as many web requests as a
     * result that has a weight of <code>1</code>.
     * </p>
     */
    private Long weight;
    /**
     * <p>
     * The time at which WAF received the request from your Amazon Web Services resource, in Unix time format (in
     * seconds).
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The action for the <code>Rule</code> that the request matched: <code>ALLOW</code>, <code>BLOCK</code>, or
     * <code>COUNT</code>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The name of the <code>Rule</code> that the request matched. For managed rule groups, the format for this name is
     * <code>&lt;vendor name&gt;#&lt;managed rule group name&gt;#&lt;rule name&gt;</code>. For your own rule groups, the
     * format for this name is <code>&lt;rule group name&gt;#&lt;rule name&gt;</code>. If the rule is not in a rule
     * group, this field is absent.
     * </p>
     */
    private String ruleNameWithinRuleGroup;
    /**
     * <p>
     * Custom request headers inserted by WAF into the request, according to the custom request configuration for the
     * matching rule action.
     * </p>
     */
    private java.util.List<HTTPHeader> requestHeadersInserted;
    /**
     * <p>
     * The response code that was sent for the request.
     * </p>
     */
    private Integer responseCodeSent;
    /**
     * <p>
     * Labels applied to the web request by matching rules. WAF applies fully qualified labels to matching web requests.
     * A fully qualified label is the concatenation of a label namespace and a rule label. The rule's rule group or web
     * ACL defines the label namespace.
     * </p>
     * <p>
     * For example, <code>awswaf:111122223333:myRuleGroup:testRules:testNS1:testNS2:labelNameA</code> or
     * <code>awswaf:managed:aws:managed-rule-set:header:encoding:utf8</code>.
     * </p>
     */
    private java.util.List<Label> labels;

    /**
     * <p>
     * A complex type that contains detailed information about the request.
     * </p>
     * 
     * @param request
     *        A complex type that contains detailed information about the request.
     */

    public void setRequest(HTTPRequest request) {
        this.request = request;
    }

    /**
     * <p>
     * A complex type that contains detailed information about the request.
     * </p>
     * 
     * @return A complex type that contains detailed information about the request.
     */

    public HTTPRequest getRequest() {
        return this.request;
    }

    /**
     * <p>
     * A complex type that contains detailed information about the request.
     * </p>
     * 
     * @param request
     *        A complex type that contains detailed information about the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampledHTTPRequest withRequest(HTTPRequest request) {
        setRequest(request);
        return this;
    }

    /**
     * <p>
     * A value that indicates how one result in the response relates proportionally to other results in the response.
     * For example, a result that has a weight of <code>2</code> represents roughly twice as many web requests as a
     * result that has a weight of <code>1</code>.
     * </p>
     * 
     * @param weight
     *        A value that indicates how one result in the response relates proportionally to other results in the
     *        response. For example, a result that has a weight of <code>2</code> represents roughly twice as many web
     *        requests as a result that has a weight of <code>1</code>.
     */

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * A value that indicates how one result in the response relates proportionally to other results in the response.
     * For example, a result that has a weight of <code>2</code> represents roughly twice as many web requests as a
     * result that has a weight of <code>1</code>.
     * </p>
     * 
     * @return A value that indicates how one result in the response relates proportionally to other results in the
     *         response. For example, a result that has a weight of <code>2</code> represents roughly twice as many web
     *         requests as a result that has a weight of <code>1</code>.
     */

    public Long getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * A value that indicates how one result in the response relates proportionally to other results in the response.
     * For example, a result that has a weight of <code>2</code> represents roughly twice as many web requests as a
     * result that has a weight of <code>1</code>.
     * </p>
     * 
     * @param weight
     *        A value that indicates how one result in the response relates proportionally to other results in the
     *        response. For example, a result that has a weight of <code>2</code> represents roughly twice as many web
     *        requests as a result that has a weight of <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampledHTTPRequest withWeight(Long weight) {
        setWeight(weight);
        return this;
    }

    /**
     * <p>
     * The time at which WAF received the request from your Amazon Web Services resource, in Unix time format (in
     * seconds).
     * </p>
     * 
     * @param timestamp
     *        The time at which WAF received the request from your Amazon Web Services resource, in Unix time format (in
     *        seconds).
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time at which WAF received the request from your Amazon Web Services resource, in Unix time format (in
     * seconds).
     * </p>
     * 
     * @return The time at which WAF received the request from your Amazon Web Services resource, in Unix time format
     *         (in seconds).
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time at which WAF received the request from your Amazon Web Services resource, in Unix time format (in
     * seconds).
     * </p>
     * 
     * @param timestamp
     *        The time at which WAF received the request from your Amazon Web Services resource, in Unix time format (in
     *        seconds).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampledHTTPRequest withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The action for the <code>Rule</code> that the request matched: <code>ALLOW</code>, <code>BLOCK</code>, or
     * <code>COUNT</code>.
     * </p>
     * 
     * @param action
     *        The action for the <code>Rule</code> that the request matched: <code>ALLOW</code>, <code>BLOCK</code>, or
     *        <code>COUNT</code>.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action for the <code>Rule</code> that the request matched: <code>ALLOW</code>, <code>BLOCK</code>, or
     * <code>COUNT</code>.
     * </p>
     * 
     * @return The action for the <code>Rule</code> that the request matched: <code>ALLOW</code>, <code>BLOCK</code>, or
     *         <code>COUNT</code>.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action for the <code>Rule</code> that the request matched: <code>ALLOW</code>, <code>BLOCK</code>, or
     * <code>COUNT</code>.
     * </p>
     * 
     * @param action
     *        The action for the <code>Rule</code> that the request matched: <code>ALLOW</code>, <code>BLOCK</code>, or
     *        <code>COUNT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampledHTTPRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The name of the <code>Rule</code> that the request matched. For managed rule groups, the format for this name is
     * <code>&lt;vendor name&gt;#&lt;managed rule group name&gt;#&lt;rule name&gt;</code>. For your own rule groups, the
     * format for this name is <code>&lt;rule group name&gt;#&lt;rule name&gt;</code>. If the rule is not in a rule
     * group, this field is absent.
     * </p>
     * 
     * @param ruleNameWithinRuleGroup
     *        The name of the <code>Rule</code> that the request matched. For managed rule groups, the format for this
     *        name is <code>&lt;vendor name&gt;#&lt;managed rule group name&gt;#&lt;rule name&gt;</code>. For your own
     *        rule groups, the format for this name is <code>&lt;rule group name&gt;#&lt;rule name&gt;</code>. If the
     *        rule is not in a rule group, this field is absent.
     */

    public void setRuleNameWithinRuleGroup(String ruleNameWithinRuleGroup) {
        this.ruleNameWithinRuleGroup = ruleNameWithinRuleGroup;
    }

    /**
     * <p>
     * The name of the <code>Rule</code> that the request matched. For managed rule groups, the format for this name is
     * <code>&lt;vendor name&gt;#&lt;managed rule group name&gt;#&lt;rule name&gt;</code>. For your own rule groups, the
     * format for this name is <code>&lt;rule group name&gt;#&lt;rule name&gt;</code>. If the rule is not in a rule
     * group, this field is absent.
     * </p>
     * 
     * @return The name of the <code>Rule</code> that the request matched. For managed rule groups, the format for this
     *         name is <code>&lt;vendor name&gt;#&lt;managed rule group name&gt;#&lt;rule name&gt;</code>. For your own
     *         rule groups, the format for this name is <code>&lt;rule group name&gt;#&lt;rule name&gt;</code>. If the
     *         rule is not in a rule group, this field is absent.
     */

    public String getRuleNameWithinRuleGroup() {
        return this.ruleNameWithinRuleGroup;
    }

    /**
     * <p>
     * The name of the <code>Rule</code> that the request matched. For managed rule groups, the format for this name is
     * <code>&lt;vendor name&gt;#&lt;managed rule group name&gt;#&lt;rule name&gt;</code>. For your own rule groups, the
     * format for this name is <code>&lt;rule group name&gt;#&lt;rule name&gt;</code>. If the rule is not in a rule
     * group, this field is absent.
     * </p>
     * 
     * @param ruleNameWithinRuleGroup
     *        The name of the <code>Rule</code> that the request matched. For managed rule groups, the format for this
     *        name is <code>&lt;vendor name&gt;#&lt;managed rule group name&gt;#&lt;rule name&gt;</code>. For your own
     *        rule groups, the format for this name is <code>&lt;rule group name&gt;#&lt;rule name&gt;</code>. If the
     *        rule is not in a rule group, this field is absent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampledHTTPRequest withRuleNameWithinRuleGroup(String ruleNameWithinRuleGroup) {
        setRuleNameWithinRuleGroup(ruleNameWithinRuleGroup);
        return this;
    }

    /**
     * <p>
     * Custom request headers inserted by WAF into the request, according to the custom request configuration for the
     * matching rule action.
     * </p>
     * 
     * @return Custom request headers inserted by WAF into the request, according to the custom request configuration
     *         for the matching rule action.
     */

    public java.util.List<HTTPHeader> getRequestHeadersInserted() {
        return requestHeadersInserted;
    }

    /**
     * <p>
     * Custom request headers inserted by WAF into the request, according to the custom request configuration for the
     * matching rule action.
     * </p>
     * 
     * @param requestHeadersInserted
     *        Custom request headers inserted by WAF into the request, according to the custom request configuration for
     *        the matching rule action.
     */

    public void setRequestHeadersInserted(java.util.Collection<HTTPHeader> requestHeadersInserted) {
        if (requestHeadersInserted == null) {
            this.requestHeadersInserted = null;
            return;
        }

        this.requestHeadersInserted = new java.util.ArrayList<HTTPHeader>(requestHeadersInserted);
    }

    /**
     * <p>
     * Custom request headers inserted by WAF into the request, according to the custom request configuration for the
     * matching rule action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequestHeadersInserted(java.util.Collection)} or
     * {@link #withRequestHeadersInserted(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param requestHeadersInserted
     *        Custom request headers inserted by WAF into the request, according to the custom request configuration for
     *        the matching rule action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampledHTTPRequest withRequestHeadersInserted(HTTPHeader... requestHeadersInserted) {
        if (this.requestHeadersInserted == null) {
            setRequestHeadersInserted(new java.util.ArrayList<HTTPHeader>(requestHeadersInserted.length));
        }
        for (HTTPHeader ele : requestHeadersInserted) {
            this.requestHeadersInserted.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Custom request headers inserted by WAF into the request, according to the custom request configuration for the
     * matching rule action.
     * </p>
     * 
     * @param requestHeadersInserted
     *        Custom request headers inserted by WAF into the request, according to the custom request configuration for
     *        the matching rule action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampledHTTPRequest withRequestHeadersInserted(java.util.Collection<HTTPHeader> requestHeadersInserted) {
        setRequestHeadersInserted(requestHeadersInserted);
        return this;
    }

    /**
     * <p>
     * The response code that was sent for the request.
     * </p>
     * 
     * @param responseCodeSent
     *        The response code that was sent for the request.
     */

    public void setResponseCodeSent(Integer responseCodeSent) {
        this.responseCodeSent = responseCodeSent;
    }

    /**
     * <p>
     * The response code that was sent for the request.
     * </p>
     * 
     * @return The response code that was sent for the request.
     */

    public Integer getResponseCodeSent() {
        return this.responseCodeSent;
    }

    /**
     * <p>
     * The response code that was sent for the request.
     * </p>
     * 
     * @param responseCodeSent
     *        The response code that was sent for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampledHTTPRequest withResponseCodeSent(Integer responseCodeSent) {
        setResponseCodeSent(responseCodeSent);
        return this;
    }

    /**
     * <p>
     * Labels applied to the web request by matching rules. WAF applies fully qualified labels to matching web requests.
     * A fully qualified label is the concatenation of a label namespace and a rule label. The rule's rule group or web
     * ACL defines the label namespace.
     * </p>
     * <p>
     * For example, <code>awswaf:111122223333:myRuleGroup:testRules:testNS1:testNS2:labelNameA</code> or
     * <code>awswaf:managed:aws:managed-rule-set:header:encoding:utf8</code>.
     * </p>
     * 
     * @return Labels applied to the web request by matching rules. WAF applies fully qualified labels to matching web
     *         requests. A fully qualified label is the concatenation of a label namespace and a rule label. The rule's
     *         rule group or web ACL defines the label namespace. </p>
     *         <p>
     *         For example, <code>awswaf:111122223333:myRuleGroup:testRules:testNS1:testNS2:labelNameA</code> or
     *         <code>awswaf:managed:aws:managed-rule-set:header:encoding:utf8</code>.
     */

    public java.util.List<Label> getLabels() {
        return labels;
    }

    /**
     * <p>
     * Labels applied to the web request by matching rules. WAF applies fully qualified labels to matching web requests.
     * A fully qualified label is the concatenation of a label namespace and a rule label. The rule's rule group or web
     * ACL defines the label namespace.
     * </p>
     * <p>
     * For example, <code>awswaf:111122223333:myRuleGroup:testRules:testNS1:testNS2:labelNameA</code> or
     * <code>awswaf:managed:aws:managed-rule-set:header:encoding:utf8</code>.
     * </p>
     * 
     * @param labels
     *        Labels applied to the web request by matching rules. WAF applies fully qualified labels to matching web
     *        requests. A fully qualified label is the concatenation of a label namespace and a rule label. The rule's
     *        rule group or web ACL defines the label namespace. </p>
     *        <p>
     *        For example, <code>awswaf:111122223333:myRuleGroup:testRules:testNS1:testNS2:labelNameA</code> or
     *        <code>awswaf:managed:aws:managed-rule-set:header:encoding:utf8</code>.
     */

    public void setLabels(java.util.Collection<Label> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<Label>(labels);
    }

    /**
     * <p>
     * Labels applied to the web request by matching rules. WAF applies fully qualified labels to matching web requests.
     * A fully qualified label is the concatenation of a label namespace and a rule label. The rule's rule group or web
     * ACL defines the label namespace.
     * </p>
     * <p>
     * For example, <code>awswaf:111122223333:myRuleGroup:testRules:testNS1:testNS2:labelNameA</code> or
     * <code>awswaf:managed:aws:managed-rule-set:header:encoding:utf8</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        Labels applied to the web request by matching rules. WAF applies fully qualified labels to matching web
     *        requests. A fully qualified label is the concatenation of a label namespace and a rule label. The rule's
     *        rule group or web ACL defines the label namespace. </p>
     *        <p>
     *        For example, <code>awswaf:111122223333:myRuleGroup:testRules:testNS1:testNS2:labelNameA</code> or
     *        <code>awswaf:managed:aws:managed-rule-set:header:encoding:utf8</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampledHTTPRequest withLabels(Label... labels) {
        if (this.labels == null) {
            setLabels(new java.util.ArrayList<Label>(labels.length));
        }
        for (Label ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Labels applied to the web request by matching rules. WAF applies fully qualified labels to matching web requests.
     * A fully qualified label is the concatenation of a label namespace and a rule label. The rule's rule group or web
     * ACL defines the label namespace.
     * </p>
     * <p>
     * For example, <code>awswaf:111122223333:myRuleGroup:testRules:testNS1:testNS2:labelNameA</code> or
     * <code>awswaf:managed:aws:managed-rule-set:header:encoding:utf8</code>.
     * </p>
     * 
     * @param labels
     *        Labels applied to the web request by matching rules. WAF applies fully qualified labels to matching web
     *        requests. A fully qualified label is the concatenation of a label namespace and a rule label. The rule's
     *        rule group or web ACL defines the label namespace. </p>
     *        <p>
     *        For example, <code>awswaf:111122223333:myRuleGroup:testRules:testNS1:testNS2:labelNameA</code> or
     *        <code>awswaf:managed:aws:managed-rule-set:header:encoding:utf8</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampledHTTPRequest withLabels(java.util.Collection<Label> labels) {
        setLabels(labels);
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
        if (getRequest() != null)
            sb.append("Request: ").append(getRequest()).append(",");
        if (getWeight() != null)
            sb.append("Weight: ").append(getWeight()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getRuleNameWithinRuleGroup() != null)
            sb.append("RuleNameWithinRuleGroup: ").append(getRuleNameWithinRuleGroup()).append(",");
        if (getRequestHeadersInserted() != null)
            sb.append("RequestHeadersInserted: ").append(getRequestHeadersInserted()).append(",");
        if (getResponseCodeSent() != null)
            sb.append("ResponseCodeSent: ").append(getResponseCodeSent()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SampledHTTPRequest == false)
            return false;
        SampledHTTPRequest other = (SampledHTTPRequest) obj;
        if (other.getRequest() == null ^ this.getRequest() == null)
            return false;
        if (other.getRequest() != null && other.getRequest().equals(this.getRequest()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getRuleNameWithinRuleGroup() == null ^ this.getRuleNameWithinRuleGroup() == null)
            return false;
        if (other.getRuleNameWithinRuleGroup() != null && other.getRuleNameWithinRuleGroup().equals(this.getRuleNameWithinRuleGroup()) == false)
            return false;
        if (other.getRequestHeadersInserted() == null ^ this.getRequestHeadersInserted() == null)
            return false;
        if (other.getRequestHeadersInserted() != null && other.getRequestHeadersInserted().equals(this.getRequestHeadersInserted()) == false)
            return false;
        if (other.getResponseCodeSent() == null ^ this.getResponseCodeSent() == null)
            return false;
        if (other.getResponseCodeSent() != null && other.getResponseCodeSent().equals(this.getResponseCodeSent()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequest() == null) ? 0 : getRequest().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getRuleNameWithinRuleGroup() == null) ? 0 : getRuleNameWithinRuleGroup().hashCode());
        hashCode = prime * hashCode + ((getRequestHeadersInserted() == null) ? 0 : getRequestHeadersInserted().hashCode());
        hashCode = prime * hashCode + ((getResponseCodeSent() == null) ? 0 : getResponseCodeSent().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        return hashCode;
    }

    @Override
    public SampledHTTPRequest clone() {
        try {
            return (SampledHTTPRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.SampledHTTPRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
