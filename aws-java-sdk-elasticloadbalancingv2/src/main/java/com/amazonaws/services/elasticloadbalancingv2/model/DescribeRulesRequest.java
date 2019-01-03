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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     */
    private String listenerArn;
    /**
     * <p>
     * The Amazon Resource Names (ARN) of the rules.
     * </p>
     */
    private java.util.List<String> ruleArns;
    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call.)
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of results to return with this call.
     * </p>
     */
    private Integer pageSize;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener.
     */

    public void setListenerArn(String listenerArn) {
        this.listenerArn = listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the listener.
     */

    public String getListenerArn() {
        return this.listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRulesRequest withListenerArn(String listenerArn) {
        setListenerArn(listenerArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the rules.
     * </p>
     * 
     * @return The Amazon Resource Names (ARN) of the rules.
     */

    public java.util.List<String> getRuleArns() {
        return ruleArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the rules.
     * </p>
     * 
     * @param ruleArns
     *        The Amazon Resource Names (ARN) of the rules.
     */

    public void setRuleArns(java.util.Collection<String> ruleArns) {
        if (ruleArns == null) {
            this.ruleArns = null;
            return;
        }

        this.ruleArns = new java.util.ArrayList<String>(ruleArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleArns(java.util.Collection)} or {@link #withRuleArns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ruleArns
     *        The Amazon Resource Names (ARN) of the rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRulesRequest withRuleArns(String... ruleArns) {
        if (this.ruleArns == null) {
            setRuleArns(new java.util.ArrayList<String>(ruleArns.length));
        }
        for (String ele : ruleArns) {
            this.ruleArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the rules.
     * </p>
     * 
     * @param ruleArns
     *        The Amazon Resource Names (ARN) of the rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRulesRequest withRuleArns(java.util.Collection<String> ruleArns) {
        setRuleArns(ruleArns);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call.)
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results. (You received this marker from a previous call.)
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call.)
     * </p>
     * 
     * @return The marker for the next set of results. (You received this marker from a previous call.)
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker for the next set of results. (You received this marker from a previous call.)
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results. (You received this marker from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRulesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with this call.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of results to return with this call.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of results to return with this call.
     * </p>
     * 
     * @return The maximum number of results to return with this call.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The maximum number of results to return with this call.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of results to return with this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRulesRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
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
        if (getListenerArn() != null)
            sb.append("ListenerArn: ").append(getListenerArn()).append(",");
        if (getRuleArns() != null)
            sb.append("RuleArns: ").append(getRuleArns()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRulesRequest == false)
            return false;
        DescribeRulesRequest other = (DescribeRulesRequest) obj;
        if (other.getListenerArn() == null ^ this.getListenerArn() == null)
            return false;
        if (other.getListenerArn() != null && other.getListenerArn().equals(this.getListenerArn()) == false)
            return false;
        if (other.getRuleArns() == null ^ this.getRuleArns() == null)
            return false;
        if (other.getRuleArns() != null && other.getRuleArns().equals(this.getRuleArns()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListenerArn() == null) ? 0 : getListenerArn().hashCode());
        hashCode = prime * hashCode + ((getRuleArns() == null) ? 0 : getRuleArns().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRulesRequest clone() {
        return (DescribeRulesRequest) super.clone();
    }

}
