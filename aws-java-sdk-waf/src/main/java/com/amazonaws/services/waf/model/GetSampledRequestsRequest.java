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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSampledRequests" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSampledRequestsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>WebACLId</code> of the <code>WebACL</code> for which you want <code>GetSampledRequests</code> to return
     * a sample of requests.
     * </p>
     */
    private String webAclId;
    /**
     * <p>
     * <code>RuleId</code> is one of three values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>RuleId</code> of the <code>Rule</code> or the <code>RuleGroupId</code> of the <code>RuleGroup</code>
     * for which you want <code>GetSampledRequests</code> to return a sample of requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Default_Action</code>, which causes <code>GetSampledRequests</code> to return a sample of the requests that
     * didn't match any of the rules in the specified <code>WebACL</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String ruleId;
    /**
     * <p>
     * The start date and time and the end date and time of the range for which you want <code>GetSampledRequests</code>
     * to return a sample of requests. Specify the date and time in the following format:
     * <code>"2016-09-27T14:50Z"</code>. You can specify any time range in the previous three hours.
     * </p>
     */
    private TimeWindow timeWindow;
    /**
     * <p>
     * The number of requests that you want AWS WAF to return from among the first 5,000 requests that your AWS resource
     * received during the time range. If your resource received fewer requests than the value of <code>MaxItems</code>,
     * <code>GetSampledRequests</code> returns information about all of them.
     * </p>
     */
    private Long maxItems;

    /**
     * <p>
     * The <code>WebACLId</code> of the <code>WebACL</code> for which you want <code>GetSampledRequests</code> to return
     * a sample of requests.
     * </p>
     * 
     * @param webAclId
     *        The <code>WebACLId</code> of the <code>WebACL</code> for which you want <code>GetSampledRequests</code> to
     *        return a sample of requests.
     */

    public void setWebAclId(String webAclId) {
        this.webAclId = webAclId;
    }

    /**
     * <p>
     * The <code>WebACLId</code> of the <code>WebACL</code> for which you want <code>GetSampledRequests</code> to return
     * a sample of requests.
     * </p>
     * 
     * @return The <code>WebACLId</code> of the <code>WebACL</code> for which you want <code>GetSampledRequests</code>
     *         to return a sample of requests.
     */

    public String getWebAclId() {
        return this.webAclId;
    }

    /**
     * <p>
     * The <code>WebACLId</code> of the <code>WebACL</code> for which you want <code>GetSampledRequests</code> to return
     * a sample of requests.
     * </p>
     * 
     * @param webAclId
     *        The <code>WebACLId</code> of the <code>WebACL</code> for which you want <code>GetSampledRequests</code> to
     *        return a sample of requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSampledRequestsRequest withWebAclId(String webAclId) {
        setWebAclId(webAclId);
        return this;
    }

    /**
     * <p>
     * <code>RuleId</code> is one of three values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>RuleId</code> of the <code>Rule</code> or the <code>RuleGroupId</code> of the <code>RuleGroup</code>
     * for which you want <code>GetSampledRequests</code> to return a sample of requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Default_Action</code>, which causes <code>GetSampledRequests</code> to return a sample of the requests that
     * didn't match any of the rules in the specified <code>WebACL</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param ruleId
     *        <code>RuleId</code> is one of three values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>RuleId</code> of the <code>Rule</code> or the <code>RuleGroupId</code> of the
     *        <code>RuleGroup</code> for which you want <code>GetSampledRequests</code> to return a sample of requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Default_Action</code>, which causes <code>GetSampledRequests</code> to return a sample of the
     *        requests that didn't match any of the rules in the specified <code>WebACL</code>.
     *        </p>
     *        </li>
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * <code>RuleId</code> is one of three values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>RuleId</code> of the <code>Rule</code> or the <code>RuleGroupId</code> of the <code>RuleGroup</code>
     * for which you want <code>GetSampledRequests</code> to return a sample of requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Default_Action</code>, which causes <code>GetSampledRequests</code> to return a sample of the requests that
     * didn't match any of the rules in the specified <code>WebACL</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <code>RuleId</code> is one of three values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>RuleId</code> of the <code>Rule</code> or the <code>RuleGroupId</code> of the
     *         <code>RuleGroup</code> for which you want <code>GetSampledRequests</code> to return a sample of requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Default_Action</code>, which causes <code>GetSampledRequests</code> to return a sample of the
     *         requests that didn't match any of the rules in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * <code>RuleId</code> is one of three values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>RuleId</code> of the <code>Rule</code> or the <code>RuleGroupId</code> of the <code>RuleGroup</code>
     * for which you want <code>GetSampledRequests</code> to return a sample of requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Default_Action</code>, which causes <code>GetSampledRequests</code> to return a sample of the requests that
     * didn't match any of the rules in the specified <code>WebACL</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param ruleId
     *        <code>RuleId</code> is one of three values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>RuleId</code> of the <code>Rule</code> or the <code>RuleGroupId</code> of the
     *        <code>RuleGroup</code> for which you want <code>GetSampledRequests</code> to return a sample of requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Default_Action</code>, which causes <code>GetSampledRequests</code> to return a sample of the
     *        requests that didn't match any of the rules in the specified <code>WebACL</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSampledRequestsRequest withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * The start date and time and the end date and time of the range for which you want <code>GetSampledRequests</code>
     * to return a sample of requests. Specify the date and time in the following format:
     * <code>"2016-09-27T14:50Z"</code>. You can specify any time range in the previous three hours.
     * </p>
     * 
     * @param timeWindow
     *        The start date and time and the end date and time of the range for which you want
     *        <code>GetSampledRequests</code> to return a sample of requests. Specify the date and time in the following
     *        format: <code>"2016-09-27T14:50Z"</code>. You can specify any time range in the previous three hours.
     */

    public void setTimeWindow(TimeWindow timeWindow) {
        this.timeWindow = timeWindow;
    }

    /**
     * <p>
     * The start date and time and the end date and time of the range for which you want <code>GetSampledRequests</code>
     * to return a sample of requests. Specify the date and time in the following format:
     * <code>"2016-09-27T14:50Z"</code>. You can specify any time range in the previous three hours.
     * </p>
     * 
     * @return The start date and time and the end date and time of the range for which you want
     *         <code>GetSampledRequests</code> to return a sample of requests. Specify the date and time in the
     *         following format: <code>"2016-09-27T14:50Z"</code>. You can specify any time range in the previous three
     *         hours.
     */

    public TimeWindow getTimeWindow() {
        return this.timeWindow;
    }

    /**
     * <p>
     * The start date and time and the end date and time of the range for which you want <code>GetSampledRequests</code>
     * to return a sample of requests. Specify the date and time in the following format:
     * <code>"2016-09-27T14:50Z"</code>. You can specify any time range in the previous three hours.
     * </p>
     * 
     * @param timeWindow
     *        The start date and time and the end date and time of the range for which you want
     *        <code>GetSampledRequests</code> to return a sample of requests. Specify the date and time in the following
     *        format: <code>"2016-09-27T14:50Z"</code>. You can specify any time range in the previous three hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSampledRequestsRequest withTimeWindow(TimeWindow timeWindow) {
        setTimeWindow(timeWindow);
        return this;
    }

    /**
     * <p>
     * The number of requests that you want AWS WAF to return from among the first 5,000 requests that your AWS resource
     * received during the time range. If your resource received fewer requests than the value of <code>MaxItems</code>,
     * <code>GetSampledRequests</code> returns information about all of them.
     * </p>
     * 
     * @param maxItems
     *        The number of requests that you want AWS WAF to return from among the first 5,000 requests that your AWS
     *        resource received during the time range. If your resource received fewer requests than the value of
     *        <code>MaxItems</code>, <code>GetSampledRequests</code> returns information about all of them.
     */

    public void setMaxItems(Long maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The number of requests that you want AWS WAF to return from among the first 5,000 requests that your AWS resource
     * received during the time range. If your resource received fewer requests than the value of <code>MaxItems</code>,
     * <code>GetSampledRequests</code> returns information about all of them.
     * </p>
     * 
     * @return The number of requests that you want AWS WAF to return from among the first 5,000 requests that your AWS
     *         resource received during the time range. If your resource received fewer requests than the value of
     *         <code>MaxItems</code>, <code>GetSampledRequests</code> returns information about all of them.
     */

    public Long getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The number of requests that you want AWS WAF to return from among the first 5,000 requests that your AWS resource
     * received during the time range. If your resource received fewer requests than the value of <code>MaxItems</code>,
     * <code>GetSampledRequests</code> returns information about all of them.
     * </p>
     * 
     * @param maxItems
     *        The number of requests that you want AWS WAF to return from among the first 5,000 requests that your AWS
     *        resource received during the time range. If your resource received fewer requests than the value of
     *        <code>MaxItems</code>, <code>GetSampledRequests</code> returns information about all of them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSampledRequestsRequest withMaxItems(Long maxItems) {
        setMaxItems(maxItems);
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
        if (getWebAclId() != null)
            sb.append("WebAclId: ").append(getWebAclId()).append(",");
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId()).append(",");
        if (getTimeWindow() != null)
            sb.append("TimeWindow: ").append(getTimeWindow()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSampledRequestsRequest == false)
            return false;
        GetSampledRequestsRequest other = (GetSampledRequestsRequest) obj;
        if (other.getWebAclId() == null ^ this.getWebAclId() == null)
            return false;
        if (other.getWebAclId() != null && other.getWebAclId().equals(this.getWebAclId()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getTimeWindow() == null ^ this.getTimeWindow() == null)
            return false;
        if (other.getTimeWindow() != null && other.getTimeWindow().equals(this.getTimeWindow()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebAclId() == null) ? 0 : getWebAclId().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getTimeWindow() == null) ? 0 : getTimeWindow().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public GetSampledRequestsRequest clone() {
        return (GetSampledRequestsRequest) super.clone();
    }

}
