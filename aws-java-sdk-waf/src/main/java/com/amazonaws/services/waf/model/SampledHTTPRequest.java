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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The response from a <a>GetSampledRequests</a> request includes a <code>SampledHTTPRequests</code> complex type that
 * appears as <code>SampledRequests</code> in the response syntax. <code>SampledHTTPRequests</code> contains one
 * <code>SampledHTTPRequest</code> object for each web request that is returned by <code>GetSampledRequests</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/SampledHTTPRequest" target="_top">AWS
 *      API Documentation</a>
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
     * A value that indicates how one result in the response relates proportionally to other results in the response. A
     * result that has a weight of <code>2</code> represents roughly twice as many CloudFront web requests as a result
     * that has a weight of <code>1</code>.
     * </p>
     */
    private Long weight;
    /**
     * <p>
     * The time at which AWS WAF received the request from your AWS resource, in Unix time format (in seconds).
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
     * This value is returned if the <code>GetSampledRequests</code> request specifies the ID of a
     * <code>RuleGroup</code> rather than the ID of an individual rule. <code>RuleWithinRuleGroup</code> is the rule
     * within the specified <code>RuleGroup</code> that matched the request listed in the response.
     * </p>
     */
    private String ruleWithinRuleGroup;

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
     * A value that indicates how one result in the response relates proportionally to other results in the response. A
     * result that has a weight of <code>2</code> represents roughly twice as many CloudFront web requests as a result
     * that has a weight of <code>1</code>.
     * </p>
     * 
     * @param weight
     *        A value that indicates how one result in the response relates proportionally to other results in the
     *        response. A result that has a weight of <code>2</code> represents roughly twice as many CloudFront web
     *        requests as a result that has a weight of <code>1</code>.
     */

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * A value that indicates how one result in the response relates proportionally to other results in the response. A
     * result that has a weight of <code>2</code> represents roughly twice as many CloudFront web requests as a result
     * that has a weight of <code>1</code>.
     * </p>
     * 
     * @return A value that indicates how one result in the response relates proportionally to other results in the
     *         response. A result that has a weight of <code>2</code> represents roughly twice as many CloudFront web
     *         requests as a result that has a weight of <code>1</code>.
     */

    public Long getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * A value that indicates how one result in the response relates proportionally to other results in the response. A
     * result that has a weight of <code>2</code> represents roughly twice as many CloudFront web requests as a result
     * that has a weight of <code>1</code>.
     * </p>
     * 
     * @param weight
     *        A value that indicates how one result in the response relates proportionally to other results in the
     *        response. A result that has a weight of <code>2</code> represents roughly twice as many CloudFront web
     *        requests as a result that has a weight of <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampledHTTPRequest withWeight(Long weight) {
        setWeight(weight);
        return this;
    }

    /**
     * <p>
     * The time at which AWS WAF received the request from your AWS resource, in Unix time format (in seconds).
     * </p>
     * 
     * @param timestamp
     *        The time at which AWS WAF received the request from your AWS resource, in Unix time format (in seconds).
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time at which AWS WAF received the request from your AWS resource, in Unix time format (in seconds).
     * </p>
     * 
     * @return The time at which AWS WAF received the request from your AWS resource, in Unix time format (in seconds).
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time at which AWS WAF received the request from your AWS resource, in Unix time format (in seconds).
     * </p>
     * 
     * @param timestamp
     *        The time at which AWS WAF received the request from your AWS resource, in Unix time format (in seconds).
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
     * This value is returned if the <code>GetSampledRequests</code> request specifies the ID of a
     * <code>RuleGroup</code> rather than the ID of an individual rule. <code>RuleWithinRuleGroup</code> is the rule
     * within the specified <code>RuleGroup</code> that matched the request listed in the response.
     * </p>
     * 
     * @param ruleWithinRuleGroup
     *        This value is returned if the <code>GetSampledRequests</code> request specifies the ID of a
     *        <code>RuleGroup</code> rather than the ID of an individual rule. <code>RuleWithinRuleGroup</code> is the
     *        rule within the specified <code>RuleGroup</code> that matched the request listed in the response.
     */

    public void setRuleWithinRuleGroup(String ruleWithinRuleGroup) {
        this.ruleWithinRuleGroup = ruleWithinRuleGroup;
    }

    /**
     * <p>
     * This value is returned if the <code>GetSampledRequests</code> request specifies the ID of a
     * <code>RuleGroup</code> rather than the ID of an individual rule. <code>RuleWithinRuleGroup</code> is the rule
     * within the specified <code>RuleGroup</code> that matched the request listed in the response.
     * </p>
     * 
     * @return This value is returned if the <code>GetSampledRequests</code> request specifies the ID of a
     *         <code>RuleGroup</code> rather than the ID of an individual rule. <code>RuleWithinRuleGroup</code> is the
     *         rule within the specified <code>RuleGroup</code> that matched the request listed in the response.
     */

    public String getRuleWithinRuleGroup() {
        return this.ruleWithinRuleGroup;
    }

    /**
     * <p>
     * This value is returned if the <code>GetSampledRequests</code> request specifies the ID of a
     * <code>RuleGroup</code> rather than the ID of an individual rule. <code>RuleWithinRuleGroup</code> is the rule
     * within the specified <code>RuleGroup</code> that matched the request listed in the response.
     * </p>
     * 
     * @param ruleWithinRuleGroup
     *        This value is returned if the <code>GetSampledRequests</code> request specifies the ID of a
     *        <code>RuleGroup</code> rather than the ID of an individual rule. <code>RuleWithinRuleGroup</code> is the
     *        rule within the specified <code>RuleGroup</code> that matched the request listed in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampledHTTPRequest withRuleWithinRuleGroup(String ruleWithinRuleGroup) {
        setRuleWithinRuleGroup(ruleWithinRuleGroup);
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
        if (getRuleWithinRuleGroup() != null)
            sb.append("RuleWithinRuleGroup: ").append(getRuleWithinRuleGroup());
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
        if (other.getRuleWithinRuleGroup() == null ^ this.getRuleWithinRuleGroup() == null)
            return false;
        if (other.getRuleWithinRuleGroup() != null && other.getRuleWithinRuleGroup().equals(this.getRuleWithinRuleGroup()) == false)
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
        hashCode = prime * hashCode + ((getRuleWithinRuleGroup() == null) ? 0 : getRuleWithinRuleGroup().hashCode());
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
        com.amazonaws.services.waf.model.waf_regional.transform.SampledHTTPRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
