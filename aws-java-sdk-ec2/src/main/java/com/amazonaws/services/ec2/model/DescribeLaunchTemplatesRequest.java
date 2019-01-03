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
import com.amazonaws.services.ec2.model.transform.DescribeLaunchTemplatesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLaunchTemplatesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeLaunchTemplatesRequest> {

    /**
     * <p>
     * One or more launch template IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> launchTemplateIds;
    /**
     * <p>
     * One or more launch template names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> launchTemplateNames;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The time the launch template was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-template-name</code> - The name of the launch template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 1 and 200.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more launch template IDs.
     * </p>
     * 
     * @return One or more launch template IDs.
     */

    public java.util.List<String> getLaunchTemplateIds() {
        if (launchTemplateIds == null) {
            launchTemplateIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return launchTemplateIds;
    }

    /**
     * <p>
     * One or more launch template IDs.
     * </p>
     * 
     * @param launchTemplateIds
     *        One or more launch template IDs.
     */

    public void setLaunchTemplateIds(java.util.Collection<String> launchTemplateIds) {
        if (launchTemplateIds == null) {
            this.launchTemplateIds = null;
            return;
        }

        this.launchTemplateIds = new com.amazonaws.internal.SdkInternalList<String>(launchTemplateIds);
    }

    /**
     * <p>
     * One or more launch template IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunchTemplateIds(java.util.Collection)} or {@link #withLaunchTemplateIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param launchTemplateIds
     *        One or more launch template IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplatesRequest withLaunchTemplateIds(String... launchTemplateIds) {
        if (this.launchTemplateIds == null) {
            setLaunchTemplateIds(new com.amazonaws.internal.SdkInternalList<String>(launchTemplateIds.length));
        }
        for (String ele : launchTemplateIds) {
            this.launchTemplateIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more launch template IDs.
     * </p>
     * 
     * @param launchTemplateIds
     *        One or more launch template IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplatesRequest withLaunchTemplateIds(java.util.Collection<String> launchTemplateIds) {
        setLaunchTemplateIds(launchTemplateIds);
        return this;
    }

    /**
     * <p>
     * One or more launch template names.
     * </p>
     * 
     * @return One or more launch template names.
     */

    public java.util.List<String> getLaunchTemplateNames() {
        if (launchTemplateNames == null) {
            launchTemplateNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return launchTemplateNames;
    }

    /**
     * <p>
     * One or more launch template names.
     * </p>
     * 
     * @param launchTemplateNames
     *        One or more launch template names.
     */

    public void setLaunchTemplateNames(java.util.Collection<String> launchTemplateNames) {
        if (launchTemplateNames == null) {
            this.launchTemplateNames = null;
            return;
        }

        this.launchTemplateNames = new com.amazonaws.internal.SdkInternalList<String>(launchTemplateNames);
    }

    /**
     * <p>
     * One or more launch template names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunchTemplateNames(java.util.Collection)} or {@link #withLaunchTemplateNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param launchTemplateNames
     *        One or more launch template names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplatesRequest withLaunchTemplateNames(String... launchTemplateNames) {
        if (this.launchTemplateNames == null) {
            setLaunchTemplateNames(new com.amazonaws.internal.SdkInternalList<String>(launchTemplateNames.length));
        }
        for (String ele : launchTemplateNames) {
            this.launchTemplateNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more launch template names.
     * </p>
     * 
     * @param launchTemplateNames
     *        One or more launch template names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplatesRequest withLaunchTemplateNames(java.util.Collection<String> launchTemplateNames) {
        setLaunchTemplateNames(launchTemplateNames);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The time the launch template was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-template-name</code> - The name of the launch template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>create-time</code> - The time the launch template was created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch-template-name</code> - The name of the launch template.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *         key in the filter name and the tag value as the filter value. For example, to find all resources that
     *         have a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify
     *         <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *         assigned a tag with a specific key, regardless of the tag value.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The time the launch template was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-template-name</code> - The name of the launch template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The time the launch template was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch-template-name</code> - The name of the launch template.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The time the launch template was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-template-name</code> - The name of the launch template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The time the launch template was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch-template-name</code> - The name of the launch template.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplatesRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The time the launch template was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-template-name</code> - The name of the launch template.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The time the launch template was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch-template-name</code> - The name of the launch template.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplatesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @return The token to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 1 and 200.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned <code>NextToken</code> value. This value can be between 1 and 200.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 1 and 200.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *         call with the returned <code>NextToken</code> value. This value can be between 1 and 200.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 1 and 200.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned <code>NextToken</code> value. This value can be between 1 and 200.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchTemplatesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeLaunchTemplatesRequest> getDryRunRequest() {
        Request<DescribeLaunchTemplatesRequest> request = new DescribeLaunchTemplatesRequestMarshaller().marshall(this);
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
        if (getLaunchTemplateIds() != null)
            sb.append("LaunchTemplateIds: ").append(getLaunchTemplateIds()).append(",");
        if (getLaunchTemplateNames() != null)
            sb.append("LaunchTemplateNames: ").append(getLaunchTemplateNames()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof DescribeLaunchTemplatesRequest == false)
            return false;
        DescribeLaunchTemplatesRequest other = (DescribeLaunchTemplatesRequest) obj;
        if (other.getLaunchTemplateIds() == null ^ this.getLaunchTemplateIds() == null)
            return false;
        if (other.getLaunchTemplateIds() != null && other.getLaunchTemplateIds().equals(this.getLaunchTemplateIds()) == false)
            return false;
        if (other.getLaunchTemplateNames() == null ^ this.getLaunchTemplateNames() == null)
            return false;
        if (other.getLaunchTemplateNames() != null && other.getLaunchTemplateNames().equals(this.getLaunchTemplateNames()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getLaunchTemplateIds() == null) ? 0 : getLaunchTemplateIds().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateNames() == null) ? 0 : getLaunchTemplateNames().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLaunchTemplatesRequest clone() {
        return (DescribeLaunchTemplatesRequest) super.clone();
    }
}
