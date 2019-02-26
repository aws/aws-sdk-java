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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRateBasedRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRateBasedRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A friendly name or description of the <a>RateBasedRule</a>. You can't change the name of a
     * <code>RateBasedRule</code> after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A friendly name or description for the metrics for this <code>RateBasedRule</code>. The name can contain only
     * alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the
     * metric after you create the <code>RateBasedRule</code>.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving from a single source and thus subject to
     * rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>. <code>IP</code> indicates that
     * requests that arrive from the same IP address are subject to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     */
    private String rateKey;
    /**
     * <p>
     * The maximum number of requests, which have an identical value in the field that is specified by
     * <code>RateKey</code>, allowed in a five-minute period. If the number of requests exceeds the
     * <code>RateLimit</code> and the other predicates specified in the rule are also met, AWS WAF triggers the action
     * that is specified for this rule.
     * </p>
     */
    private Long rateLimit;
    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the <code>CreateRateBasedRule</code> request. You can also
     * use this value to query the status of the request. For more information, see <a>GetChangeTokenStatus</a>.
     * </p>
     */
    private String changeToken;

    /**
     * <p>
     * A friendly name or description of the <a>RateBasedRule</a>. You can't change the name of a
     * <code>RateBasedRule</code> after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>RateBasedRule</a>. You can't change the name of a
     *        <code>RateBasedRule</code> after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>RateBasedRule</a>. You can't change the name of a
     * <code>RateBasedRule</code> after you create it.
     * </p>
     * 
     * @return A friendly name or description of the <a>RateBasedRule</a>. You can't change the name of a
     *         <code>RateBasedRule</code> after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>RateBasedRule</a>. You can't change the name of a
     * <code>RateBasedRule</code> after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>RateBasedRule</a>. You can't change the name of a
     *        <code>RateBasedRule</code> after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRateBasedRuleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this <code>RateBasedRule</code>. The name can contain only
     * alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the
     * metric after you create the <code>RateBasedRule</code>.
     * </p>
     * 
     * @param metricName
     *        A friendly name or description for the metrics for this <code>RateBasedRule</code>. The name can contain
     *        only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name
     *        of the metric after you create the <code>RateBasedRule</code>.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this <code>RateBasedRule</code>. The name can contain only
     * alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the
     * metric after you create the <code>RateBasedRule</code>.
     * </p>
     * 
     * @return A friendly name or description for the metrics for this <code>RateBasedRule</code>. The name can contain
     *         only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the
     *         name of the metric after you create the <code>RateBasedRule</code>.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this <code>RateBasedRule</code>. The name can contain only
     * alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the
     * metric after you create the <code>RateBasedRule</code>.
     * </p>
     * 
     * @param metricName
     *        A friendly name or description for the metrics for this <code>RateBasedRule</code>. The name can contain
     *        only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name
     *        of the metric after you create the <code>RateBasedRule</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRateBasedRuleRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving from a single source and thus subject to
     * rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>. <code>IP</code> indicates that
     * requests that arrive from the same IP address are subject to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * 
     * @param rateKey
     *        The field that AWS WAF uses to determine if requests are likely arriving from a single source and thus
     *        subject to rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>.
     *        <code>IP</code> indicates that requests that arrive from the same IP address are subject to the
     *        <code>RateLimit</code> that is specified in the <code>RateBasedRule</code>.
     * @see RateKey
     */

    public void setRateKey(String rateKey) {
        this.rateKey = rateKey;
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving from a single source and thus subject to
     * rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>. <code>IP</code> indicates that
     * requests that arrive from the same IP address are subject to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * 
     * @return The field that AWS WAF uses to determine if requests are likely arriving from a single source and thus
     *         subject to rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>.
     *         <code>IP</code> indicates that requests that arrive from the same IP address are subject to the
     *         <code>RateLimit</code> that is specified in the <code>RateBasedRule</code>.
     * @see RateKey
     */

    public String getRateKey() {
        return this.rateKey;
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving from a single source and thus subject to
     * rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>. <code>IP</code> indicates that
     * requests that arrive from the same IP address are subject to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * 
     * @param rateKey
     *        The field that AWS WAF uses to determine if requests are likely arriving from a single source and thus
     *        subject to rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>.
     *        <code>IP</code> indicates that requests that arrive from the same IP address are subject to the
     *        <code>RateLimit</code> that is specified in the <code>RateBasedRule</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RateKey
     */

    public CreateRateBasedRuleRequest withRateKey(String rateKey) {
        setRateKey(rateKey);
        return this;
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving from a single source and thus subject to
     * rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>. <code>IP</code> indicates that
     * requests that arrive from the same IP address are subject to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * 
     * @param rateKey
     *        The field that AWS WAF uses to determine if requests are likely arriving from a single source and thus
     *        subject to rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>.
     *        <code>IP</code> indicates that requests that arrive from the same IP address are subject to the
     *        <code>RateLimit</code> that is specified in the <code>RateBasedRule</code>.
     * @see RateKey
     */

    public void setRateKey(RateKey rateKey) {
        withRateKey(rateKey);
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving from a single source and thus subject to
     * rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>. <code>IP</code> indicates that
     * requests that arrive from the same IP address are subject to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * 
     * @param rateKey
     *        The field that AWS WAF uses to determine if requests are likely arriving from a single source and thus
     *        subject to rate monitoring. The only valid value for <code>RateKey</code> is <code>IP</code>.
     *        <code>IP</code> indicates that requests that arrive from the same IP address are subject to the
     *        <code>RateLimit</code> that is specified in the <code>RateBasedRule</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RateKey
     */

    public CreateRateBasedRuleRequest withRateKey(RateKey rateKey) {
        this.rateKey = rateKey.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of requests, which have an identical value in the field that is specified by
     * <code>RateKey</code>, allowed in a five-minute period. If the number of requests exceeds the
     * <code>RateLimit</code> and the other predicates specified in the rule are also met, AWS WAF triggers the action
     * that is specified for this rule.
     * </p>
     * 
     * @param rateLimit
     *        The maximum number of requests, which have an identical value in the field that is specified by
     *        <code>RateKey</code>, allowed in a five-minute period. If the number of requests exceeds the
     *        <code>RateLimit</code> and the other predicates specified in the rule are also met, AWS WAF triggers the
     *        action that is specified for this rule.
     */

    public void setRateLimit(Long rateLimit) {
        this.rateLimit = rateLimit;
    }

    /**
     * <p>
     * The maximum number of requests, which have an identical value in the field that is specified by
     * <code>RateKey</code>, allowed in a five-minute period. If the number of requests exceeds the
     * <code>RateLimit</code> and the other predicates specified in the rule are also met, AWS WAF triggers the action
     * that is specified for this rule.
     * </p>
     * 
     * @return The maximum number of requests, which have an identical value in the field that is specified by
     *         <code>RateKey</code>, allowed in a five-minute period. If the number of requests exceeds the
     *         <code>RateLimit</code> and the other predicates specified in the rule are also met, AWS WAF triggers the
     *         action that is specified for this rule.
     */

    public Long getRateLimit() {
        return this.rateLimit;
    }

    /**
     * <p>
     * The maximum number of requests, which have an identical value in the field that is specified by
     * <code>RateKey</code>, allowed in a five-minute period. If the number of requests exceeds the
     * <code>RateLimit</code> and the other predicates specified in the rule are also met, AWS WAF triggers the action
     * that is specified for this rule.
     * </p>
     * 
     * @param rateLimit
     *        The maximum number of requests, which have an identical value in the field that is specified by
     *        <code>RateKey</code>, allowed in a five-minute period. If the number of requests exceeds the
     *        <code>RateLimit</code> and the other predicates specified in the rule are also met, AWS WAF triggers the
     *        action that is specified for this rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRateBasedRuleRequest withRateLimit(Long rateLimit) {
        setRateLimit(rateLimit);
        return this;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the <code>CreateRateBasedRule</code> request. You can also
     * use this value to query the status of the request. For more information, see <a>GetChangeTokenStatus</a>.
     * </p>
     * 
     * @param changeToken
     *        The <code>ChangeToken</code> that you used to submit the <code>CreateRateBasedRule</code> request. You can
     *        also use this value to query the status of the request. For more information, see
     *        <a>GetChangeTokenStatus</a>.
     */

    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the <code>CreateRateBasedRule</code> request. You can also
     * use this value to query the status of the request. For more information, see <a>GetChangeTokenStatus</a>.
     * </p>
     * 
     * @return The <code>ChangeToken</code> that you used to submit the <code>CreateRateBasedRule</code> request. You
     *         can also use this value to query the status of the request. For more information, see
     *         <a>GetChangeTokenStatus</a>.
     */

    public String getChangeToken() {
        return this.changeToken;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the <code>CreateRateBasedRule</code> request. You can also
     * use this value to query the status of the request. For more information, see <a>GetChangeTokenStatus</a>.
     * </p>
     * 
     * @param changeToken
     *        The <code>ChangeToken</code> that you used to submit the <code>CreateRateBasedRule</code> request. You can
     *        also use this value to query the status of the request. For more information, see
     *        <a>GetChangeTokenStatus</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRateBasedRuleRequest withChangeToken(String changeToken) {
        setChangeToken(changeToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getRateKey() != null)
            sb.append("RateKey: ").append(getRateKey()).append(",");
        if (getRateLimit() != null)
            sb.append("RateLimit: ").append(getRateLimit()).append(",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: ").append(getChangeToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRateBasedRuleRequest == false)
            return false;
        CreateRateBasedRuleRequest other = (CreateRateBasedRuleRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getRateKey() == null ^ this.getRateKey() == null)
            return false;
        if (other.getRateKey() != null && other.getRateKey().equals(this.getRateKey()) == false)
            return false;
        if (other.getRateLimit() == null ^ this.getRateLimit() == null)
            return false;
        if (other.getRateLimit() != null && other.getRateLimit().equals(this.getRateLimit()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getRateKey() == null) ? 0 : getRateKey().hashCode());
        hashCode = prime * hashCode + ((getRateLimit() == null) ? 0 : getRateLimit().hashCode());
        hashCode = prime * hashCode + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateRateBasedRuleRequest clone() {
        return (CreateRateBasedRuleRequest) super.clone();
    }

}
