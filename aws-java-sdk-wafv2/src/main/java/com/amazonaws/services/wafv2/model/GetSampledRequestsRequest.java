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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetSampledRequests" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSampledRequestsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon resource name (ARN) of the <code>WebACL</code> for which you want a sample of requests.
     * </p>
     */
    private String webAclArn;
    /**
     * <p>
     * The metric name assigned to the <code>Rule</code> or <code>RuleGroup</code> for which you want a sample of
     * requests.
     * </p>
     */
    private String ruleMetricName;
    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB) or an API Gateway stage.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     */
    private String scope;
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
     * The Amazon resource name (ARN) of the <code>WebACL</code> for which you want a sample of requests.
     * </p>
     * 
     * @param webAclArn
     *        The Amazon resource name (ARN) of the <code>WebACL</code> for which you want a sample of requests.
     */

    public void setWebAclArn(String webAclArn) {
        this.webAclArn = webAclArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the <code>WebACL</code> for which you want a sample of requests.
     * </p>
     * 
     * @return The Amazon resource name (ARN) of the <code>WebACL</code> for which you want a sample of requests.
     */

    public String getWebAclArn() {
        return this.webAclArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the <code>WebACL</code> for which you want a sample of requests.
     * </p>
     * 
     * @param webAclArn
     *        The Amazon resource name (ARN) of the <code>WebACL</code> for which you want a sample of requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSampledRequestsRequest withWebAclArn(String webAclArn) {
        setWebAclArn(webAclArn);
        return this;
    }

    /**
     * <p>
     * The metric name assigned to the <code>Rule</code> or <code>RuleGroup</code> for which you want a sample of
     * requests.
     * </p>
     * 
     * @param ruleMetricName
     *        The metric name assigned to the <code>Rule</code> or <code>RuleGroup</code> for which you want a sample of
     *        requests.
     */

    public void setRuleMetricName(String ruleMetricName) {
        this.ruleMetricName = ruleMetricName;
    }

    /**
     * <p>
     * The metric name assigned to the <code>Rule</code> or <code>RuleGroup</code> for which you want a sample of
     * requests.
     * </p>
     * 
     * @return The metric name assigned to the <code>Rule</code> or <code>RuleGroup</code> for which you want a sample
     *         of requests.
     */

    public String getRuleMetricName() {
        return this.ruleMetricName;
    }

    /**
     * <p>
     * The metric name assigned to the <code>Rule</code> or <code>RuleGroup</code> for which you want a sample of
     * requests.
     * </p>
     * 
     * @param ruleMetricName
     *        The metric name assigned to the <code>Rule</code> or <code>RuleGroup</code> for which you want a sample of
     *        requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSampledRequestsRequest withRuleMetricName(String ruleMetricName) {
        setRuleMetricName(ruleMetricName);
        return this;
    }

    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB) or an API Gateway stage.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB) or an API Gateway stage. </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the region when you use the CloudFront scope:
     *        <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        API and SDKs - For all calls, use the Region endpoint us-east-1.
     *        </p>
     *        </li>
     * @see Scope
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB) or an API Gateway stage.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     *         application can be an Application Load Balancer (ALB) or an API Gateway stage. </p>
     *         <p>
     *         To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CLI - Specify the region when you use the CloudFront scope:
     *         <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         API and SDKs - For all calls, use the Region endpoint us-east-1.
     *         </p>
     *         </li>
     * @see Scope
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB) or an API Gateway stage.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB) or an API Gateway stage. </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the region when you use the CloudFront scope:
     *        <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        API and SDKs - For all calls, use the Region endpoint us-east-1.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public GetSampledRequestsRequest withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB) or an API Gateway stage.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB) or an API Gateway stage. </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the region when you use the CloudFront scope:
     *        <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        API and SDKs - For all calls, use the Region endpoint us-east-1.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public GetSampledRequestsRequest withScope(Scope scope) {
        this.scope = scope.toString();
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
        if (getWebAclArn() != null)
            sb.append("WebAclArn: ").append(getWebAclArn()).append(",");
        if (getRuleMetricName() != null)
            sb.append("RuleMetricName: ").append(getRuleMetricName()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
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
        if (other.getWebAclArn() == null ^ this.getWebAclArn() == null)
            return false;
        if (other.getWebAclArn() != null && other.getWebAclArn().equals(this.getWebAclArn()) == false)
            return false;
        if (other.getRuleMetricName() == null ^ this.getRuleMetricName() == null)
            return false;
        if (other.getRuleMetricName() != null && other.getRuleMetricName().equals(this.getRuleMetricName()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
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

        hashCode = prime * hashCode + ((getWebAclArn() == null) ? 0 : getWebAclArn().hashCode());
        hashCode = prime * hashCode + ((getRuleMetricName() == null) ? 0 : getRuleMetricName().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getTimeWindow() == null) ? 0 : getTimeWindow().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public GetSampledRequestsRequest clone() {
        return (GetSampledRequestsRequest) super.clone();
    }

}
