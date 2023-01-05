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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListProtections" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProtectionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * When you request a list of objects from Shield Advanced, if the response does not include all of the remaining
     * available objects, Shield Advanced includes a <code>NextToken</code> value in the response. You can retrieve the
     * next batch of objects by requesting the list again and providing the token that was returned by the prior call in
     * your request.
     * </p>
     * <p>
     * You can indicate the maximum number of objects that you want Shield Advanced to return for a single call with the
     * <code>MaxResults</code> setting. Shield Advanced will not return more than <code>MaxResults</code> objects, but
     * may return fewer, even if more objects are still available.
     * </p>
     * <p>
     * Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a
     * <code>NextToken</code> value.
     * </p>
     * <p>
     * On your first call to a list operation, leave this setting empty.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The greatest number of objects that you want Shield Advanced to return to the list request. Shield Advanced might
     * return fewer objects than you indicate in this setting, even if more objects are available. If there are more
     * objects remaining, Shield Advanced will always also return a <code>NextToken</code> value in the response.
     * </p>
     * <p>
     * The default setting is 20.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Narrows the set of protections that the call retrieves. You can retrieve a single protection by providing its
     * name or the ARN (Amazon Resource Name) of its protected resource. You can also retrieve all protections for a
     * specific resource type. You can provide up to one criteria per filter type. Shield Advanced returns protections
     * that exactly match all of the filter criteria that you provide.
     * </p>
     */
    private InclusionProtectionFilters inclusionFilters;

    /**
     * <p>
     * When you request a list of objects from Shield Advanced, if the response does not include all of the remaining
     * available objects, Shield Advanced includes a <code>NextToken</code> value in the response. You can retrieve the
     * next batch of objects by requesting the list again and providing the token that was returned by the prior call in
     * your request.
     * </p>
     * <p>
     * You can indicate the maximum number of objects that you want Shield Advanced to return for a single call with the
     * <code>MaxResults</code> setting. Shield Advanced will not return more than <code>MaxResults</code> objects, but
     * may return fewer, even if more objects are still available.
     * </p>
     * <p>
     * Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a
     * <code>NextToken</code> value.
     * </p>
     * <p>
     * On your first call to a list operation, leave this setting empty.
     * </p>
     * 
     * @param nextToken
     *        When you request a list of objects from Shield Advanced, if the response does not include all of the
     *        remaining available objects, Shield Advanced includes a <code>NextToken</code> value in the response. You
     *        can retrieve the next batch of objects by requesting the list again and providing the token that was
     *        returned by the prior call in your request. </p>
     *        <p>
     *        You can indicate the maximum number of objects that you want Shield Advanced to return for a single call
     *        with the <code>MaxResults</code> setting. Shield Advanced will not return more than
     *        <code>MaxResults</code> objects, but may return fewer, even if more objects are still available.
     *        </p>
     *        <p>
     *        Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a
     *        <code>NextToken</code> value.
     *        </p>
     *        <p>
     *        On your first call to a list operation, leave this setting empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you request a list of objects from Shield Advanced, if the response does not include all of the remaining
     * available objects, Shield Advanced includes a <code>NextToken</code> value in the response. You can retrieve the
     * next batch of objects by requesting the list again and providing the token that was returned by the prior call in
     * your request.
     * </p>
     * <p>
     * You can indicate the maximum number of objects that you want Shield Advanced to return for a single call with the
     * <code>MaxResults</code> setting. Shield Advanced will not return more than <code>MaxResults</code> objects, but
     * may return fewer, even if more objects are still available.
     * </p>
     * <p>
     * Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a
     * <code>NextToken</code> value.
     * </p>
     * <p>
     * On your first call to a list operation, leave this setting empty.
     * </p>
     * 
     * @return When you request a list of objects from Shield Advanced, if the response does not include all of the
     *         remaining available objects, Shield Advanced includes a <code>NextToken</code> value in the response. You
     *         can retrieve the next batch of objects by requesting the list again and providing the token that was
     *         returned by the prior call in your request. </p>
     *         <p>
     *         You can indicate the maximum number of objects that you want Shield Advanced to return for a single call
     *         with the <code>MaxResults</code> setting. Shield Advanced will not return more than
     *         <code>MaxResults</code> objects, but may return fewer, even if more objects are still available.
     *         </p>
     *         <p>
     *         Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include
     *         a <code>NextToken</code> value.
     *         </p>
     *         <p>
     *         On your first call to a list operation, leave this setting empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When you request a list of objects from Shield Advanced, if the response does not include all of the remaining
     * available objects, Shield Advanced includes a <code>NextToken</code> value in the response. You can retrieve the
     * next batch of objects by requesting the list again and providing the token that was returned by the prior call in
     * your request.
     * </p>
     * <p>
     * You can indicate the maximum number of objects that you want Shield Advanced to return for a single call with the
     * <code>MaxResults</code> setting. Shield Advanced will not return more than <code>MaxResults</code> objects, but
     * may return fewer, even if more objects are still available.
     * </p>
     * <p>
     * Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a
     * <code>NextToken</code> value.
     * </p>
     * <p>
     * On your first call to a list operation, leave this setting empty.
     * </p>
     * 
     * @param nextToken
     *        When you request a list of objects from Shield Advanced, if the response does not include all of the
     *        remaining available objects, Shield Advanced includes a <code>NextToken</code> value in the response. You
     *        can retrieve the next batch of objects by requesting the list again and providing the token that was
     *        returned by the prior call in your request. </p>
     *        <p>
     *        You can indicate the maximum number of objects that you want Shield Advanced to return for a single call
     *        with the <code>MaxResults</code> setting. Shield Advanced will not return more than
     *        <code>MaxResults</code> objects, but may return fewer, even if more objects are still available.
     *        </p>
     *        <p>
     *        Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a
     *        <code>NextToken</code> value.
     *        </p>
     *        <p>
     *        On your first call to a list operation, leave this setting empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The greatest number of objects that you want Shield Advanced to return to the list request. Shield Advanced might
     * return fewer objects than you indicate in this setting, even if more objects are available. If there are more
     * objects remaining, Shield Advanced will always also return a <code>NextToken</code> value in the response.
     * </p>
     * <p>
     * The default setting is 20.
     * </p>
     * 
     * @param maxResults
     *        The greatest number of objects that you want Shield Advanced to return to the list request. Shield
     *        Advanced might return fewer objects than you indicate in this setting, even if more objects are available.
     *        If there are more objects remaining, Shield Advanced will always also return a <code>NextToken</code>
     *        value in the response.</p>
     *        <p>
     *        The default setting is 20.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The greatest number of objects that you want Shield Advanced to return to the list request. Shield Advanced might
     * return fewer objects than you indicate in this setting, even if more objects are available. If there are more
     * objects remaining, Shield Advanced will always also return a <code>NextToken</code> value in the response.
     * </p>
     * <p>
     * The default setting is 20.
     * </p>
     * 
     * @return The greatest number of objects that you want Shield Advanced to return to the list request. Shield
     *         Advanced might return fewer objects than you indicate in this setting, even if more objects are
     *         available. If there are more objects remaining, Shield Advanced will always also return a
     *         <code>NextToken</code> value in the response.</p>
     *         <p>
     *         The default setting is 20.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The greatest number of objects that you want Shield Advanced to return to the list request. Shield Advanced might
     * return fewer objects than you indicate in this setting, even if more objects are available. If there are more
     * objects remaining, Shield Advanced will always also return a <code>NextToken</code> value in the response.
     * </p>
     * <p>
     * The default setting is 20.
     * </p>
     * 
     * @param maxResults
     *        The greatest number of objects that you want Shield Advanced to return to the list request. Shield
     *        Advanced might return fewer objects than you indicate in this setting, even if more objects are available.
     *        If there are more objects remaining, Shield Advanced will always also return a <code>NextToken</code>
     *        value in the response.</p>
     *        <p>
     *        The default setting is 20.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Narrows the set of protections that the call retrieves. You can retrieve a single protection by providing its
     * name or the ARN (Amazon Resource Name) of its protected resource. You can also retrieve all protections for a
     * specific resource type. You can provide up to one criteria per filter type. Shield Advanced returns protections
     * that exactly match all of the filter criteria that you provide.
     * </p>
     * 
     * @param inclusionFilters
     *        Narrows the set of protections that the call retrieves. You can retrieve a single protection by providing
     *        its name or the ARN (Amazon Resource Name) of its protected resource. You can also retrieve all
     *        protections for a specific resource type. You can provide up to one criteria per filter type. Shield
     *        Advanced returns protections that exactly match all of the filter criteria that you provide.
     */

    public void setInclusionFilters(InclusionProtectionFilters inclusionFilters) {
        this.inclusionFilters = inclusionFilters;
    }

    /**
     * <p>
     * Narrows the set of protections that the call retrieves. You can retrieve a single protection by providing its
     * name or the ARN (Amazon Resource Name) of its protected resource. You can also retrieve all protections for a
     * specific resource type. You can provide up to one criteria per filter type. Shield Advanced returns protections
     * that exactly match all of the filter criteria that you provide.
     * </p>
     * 
     * @return Narrows the set of protections that the call retrieves. You can retrieve a single protection by providing
     *         its name or the ARN (Amazon Resource Name) of its protected resource. You can also retrieve all
     *         protections for a specific resource type. You can provide up to one criteria per filter type. Shield
     *         Advanced returns protections that exactly match all of the filter criteria that you provide.
     */

    public InclusionProtectionFilters getInclusionFilters() {
        return this.inclusionFilters;
    }

    /**
     * <p>
     * Narrows the set of protections that the call retrieves. You can retrieve a single protection by providing its
     * name or the ARN (Amazon Resource Name) of its protected resource. You can also retrieve all protections for a
     * specific resource type. You can provide up to one criteria per filter type. Shield Advanced returns protections
     * that exactly match all of the filter criteria that you provide.
     * </p>
     * 
     * @param inclusionFilters
     *        Narrows the set of protections that the call retrieves. You can retrieve a single protection by providing
     *        its name or the ARN (Amazon Resource Name) of its protected resource. You can also retrieve all
     *        protections for a specific resource type. You can provide up to one criteria per filter type. Shield
     *        Advanced returns protections that exactly match all of the filter criteria that you provide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectionsRequest withInclusionFilters(InclusionProtectionFilters inclusionFilters) {
        setInclusionFilters(inclusionFilters);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getInclusionFilters() != null)
            sb.append("InclusionFilters: ").append(getInclusionFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProtectionsRequest == false)
            return false;
        ListProtectionsRequest other = (ListProtectionsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getInclusionFilters() == null ^ this.getInclusionFilters() == null)
            return false;
        if (other.getInclusionFilters() != null && other.getInclusionFilters().equals(this.getInclusionFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getInclusionFilters() == null) ? 0 : getInclusionFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListProtectionsRequest clone() {
        return (ListProtectionsRequest) super.clone();
    }

}
