/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetRecommendationPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecommendationPreferencesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The target resource type of the recommendation preference for which to return preferences.
     * </p>
     * <p>
     * The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto Scaling
     * groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an Auto Scaling
     * group.
     * </p>
     * <note>
     * <p>
     * The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     * </p>
     * </note>
     */
    private String resourceType;
    /**
     * <p>
     * An object that describes the scope of the recommendation preference to return.
     * </p>
     * <p>
     * You can return recommendation preferences that are created at the organization level (for management accounts of
     * an organization only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     */
    private Scope scope;
    /**
     * <p>
     * The token to advance to the next page of recommendation preferences.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of recommendation preferences to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The target resource type of the recommendation preference for which to return preferences.
     * </p>
     * <p>
     * The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto Scaling
     * groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an Auto Scaling
     * group.
     * </p>
     * <note>
     * <p>
     * The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     * </p>
     * </note>
     * 
     * @param resourceType
     *        The target resource type of the recommendation preference for which to return preferences.</p>
     *        <p>
     *        The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto
     *        Scaling groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an
     *        Auto Scaling group.
     *        </p>
     *        <note>
     *        <p>
     *        The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     *        </p>
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The target resource type of the recommendation preference for which to return preferences.
     * </p>
     * <p>
     * The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto Scaling
     * groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an Auto Scaling
     * group.
     * </p>
     * <note>
     * <p>
     * The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     * </p>
     * </note>
     * 
     * @return The target resource type of the recommendation preference for which to return preferences.</p>
     *         <p>
     *         The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto
     *         Scaling groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an
     *         Auto Scaling group.
     *         </p>
     *         <note>
     *         <p>
     *         The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     *         </p>
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The target resource type of the recommendation preference for which to return preferences.
     * </p>
     * <p>
     * The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto Scaling
     * groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an Auto Scaling
     * group.
     * </p>
     * <note>
     * <p>
     * The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     * </p>
     * </note>
     * 
     * @param resourceType
     *        The target resource type of the recommendation preference for which to return preferences.</p>
     *        <p>
     *        The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto
     *        Scaling groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an
     *        Auto Scaling group.
     *        </p>
     *        <note>
     *        <p>
     *        The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetRecommendationPreferencesRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The target resource type of the recommendation preference for which to return preferences.
     * </p>
     * <p>
     * The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto Scaling
     * groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an Auto Scaling
     * group.
     * </p>
     * <note>
     * <p>
     * The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     * </p>
     * </note>
     * 
     * @param resourceType
     *        The target resource type of the recommendation preference for which to return preferences.</p>
     *        <p>
     *        The <code>Ec2Instance</code> option encompasses standalone instances and instances that are part of Auto
     *        Scaling groups. The <code>AutoScalingGroup</code> option encompasses only instances that are part of an
     *        Auto Scaling group.
     *        </p>
     *        <note>
     *        <p>
     *        The valid values for this parameter are <code>Ec2Instance</code> and <code>AutoScalingGroup</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetRecommendationPreferencesRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * An object that describes the scope of the recommendation preference to return.
     * </p>
     * <p>
     * You can return recommendation preferences that are created at the organization level (for management accounts of
     * an organization only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param scope
     *        An object that describes the scope of the recommendation preference to return.</p>
     *        <p>
     *        You can return recommendation preferences that are created at the organization level (for management
     *        accounts of an organization only), account level, and resource level. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Activating enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     */

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * An object that describes the scope of the recommendation preference to return.
     * </p>
     * <p>
     * You can return recommendation preferences that are created at the organization level (for management accounts of
     * an organization only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @return An object that describes the scope of the recommendation preference to return.</p>
     *         <p>
     *         You can return recommendation preferences that are created at the organization level (for management
     *         accounts of an organization only), account level, and resource level. For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *         >Activating enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     */

    public Scope getScope() {
        return this.scope;
    }

    /**
     * <p>
     * An object that describes the scope of the recommendation preference to return.
     * </p>
     * <p>
     * You can return recommendation preferences that are created at the organization level (for management accounts of
     * an organization only), account level, and resource level. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param scope
     *        An object that describes the scope of the recommendation preference to return.</p>
     *        <p>
     *        You can return recommendation preferences that are created at the organization level (for management
     *        accounts of an organization only), account level, and resource level. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html"
     *        >Activating enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationPreferencesRequest withScope(Scope scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of recommendation preferences.
     * </p>
     * 
     * @param nextToken
     *        The token to advance to the next page of recommendation preferences.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to advance to the next page of recommendation preferences.
     * </p>
     * 
     * @return The token to advance to the next page of recommendation preferences.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to advance to the next page of recommendation preferences.
     * </p>
     * 
     * @param nextToken
     *        The token to advance to the next page of recommendation preferences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationPreferencesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of recommendation preferences to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of recommendation preferences to return with a single request.</p>
     *        <p>
     *        To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of recommendation preferences to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of recommendation preferences to return with a single request.</p>
     *         <p>
     *         To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of recommendation preferences to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of recommendation preferences to return with a single request.</p>
     *        <p>
     *        To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationPreferencesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecommendationPreferencesRequest == false)
            return false;
        GetRecommendationPreferencesRequest other = (GetRecommendationPreferencesRequest) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetRecommendationPreferencesRequest clone() {
        return (GetRecommendationPreferencesRequest) super.clone();
    }

}
