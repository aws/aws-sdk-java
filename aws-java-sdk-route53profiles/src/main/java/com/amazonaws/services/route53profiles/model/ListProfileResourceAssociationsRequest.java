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
package com.amazonaws.services.route53profiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListProfileResourceAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProfileResourceAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of objects that you want to return for this request. If more objects are available, in the
     * response, a <code>NextToken</code> value, which you can use in a subsequent call to get the next batch of
     * objects, is provided.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, up to 100 objects are returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * For the first call to this list request, omit this value.
     * </p>
     * <p>
     * When you request a list of objects, at most the number of objects specified by <code>MaxResults</code> is
     * returned. If more objects are available for retrieval, a <code>NextToken</code> value is returned in the
     * response. To retrieve the next batch of objects, use the token that was returned for the prior request in your
     * next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID of the Profile.
     * </p>
     */
    private String profileId;
    /**
     * <p>
     * ID of a resource if you want information on only one type.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The maximum number of objects that you want to return for this request. If more objects are available, in the
     * response, a <code>NextToken</code> value, which you can use in a subsequent call to get the next batch of
     * objects, is provided.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, up to 100 objects are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects that you want to return for this request. If more objects are available, in
     *        the response, a <code>NextToken</code> value, which you can use in a subsequent call to get the next batch
     *        of objects, is provided.</p>
     *        <p>
     *        If you don't specify a value for <code>MaxResults</code>, up to 100 objects are returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects that you want to return for this request. If more objects are available, in the
     * response, a <code>NextToken</code> value, which you can use in a subsequent call to get the next batch of
     * objects, is provided.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, up to 100 objects are returned.
     * </p>
     * 
     * @return The maximum number of objects that you want to return for this request. If more objects are available, in
     *         the response, a <code>NextToken</code> value, which you can use in a subsequent call to get the next
     *         batch of objects, is provided.</p>
     *         <p>
     *         If you don't specify a value for <code>MaxResults</code>, up to 100 objects are returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of objects that you want to return for this request. If more objects are available, in the
     * response, a <code>NextToken</code> value, which you can use in a subsequent call to get the next batch of
     * objects, is provided.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, up to 100 objects are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects that you want to return for this request. If more objects are available, in
     *        the response, a <code>NextToken</code> value, which you can use in a subsequent call to get the next batch
     *        of objects, is provided.</p>
     *        <p>
     *        If you don't specify a value for <code>MaxResults</code>, up to 100 objects are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileResourceAssociationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * For the first call to this list request, omit this value.
     * </p>
     * <p>
     * When you request a list of objects, at most the number of objects specified by <code>MaxResults</code> is
     * returned. If more objects are available for retrieval, a <code>NextToken</code> value is returned in the
     * response. To retrieve the next batch of objects, use the token that was returned for the prior request in your
     * next request.
     * </p>
     * 
     * @param nextToken
     *        For the first call to this list request, omit this value. </p>
     *        <p>
     *        When you request a list of objects, at most the number of objects specified by <code>MaxResults</code> is
     *        returned. If more objects are available for retrieval, a <code>NextToken</code> value is returned in the
     *        response. To retrieve the next batch of objects, use the token that was returned for the prior request in
     *        your next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For the first call to this list request, omit this value.
     * </p>
     * <p>
     * When you request a list of objects, at most the number of objects specified by <code>MaxResults</code> is
     * returned. If more objects are available for retrieval, a <code>NextToken</code> value is returned in the
     * response. To retrieve the next batch of objects, use the token that was returned for the prior request in your
     * next request.
     * </p>
     * 
     * @return For the first call to this list request, omit this value. </p>
     *         <p>
     *         When you request a list of objects, at most the number of objects specified by <code>MaxResults</code> is
     *         returned. If more objects are available for retrieval, a <code>NextToken</code> value is returned in the
     *         response. To retrieve the next batch of objects, use the token that was returned for the prior request in
     *         your next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For the first call to this list request, omit this value.
     * </p>
     * <p>
     * When you request a list of objects, at most the number of objects specified by <code>MaxResults</code> is
     * returned. If more objects are available for retrieval, a <code>NextToken</code> value is returned in the
     * response. To retrieve the next batch of objects, use the token that was returned for the prior request in your
     * next request.
     * </p>
     * 
     * @param nextToken
     *        For the first call to this list request, omit this value. </p>
     *        <p>
     *        When you request a list of objects, at most the number of objects specified by <code>MaxResults</code> is
     *        returned. If more objects are available for retrieval, a <code>NextToken</code> value is returned in the
     *        response. To retrieve the next batch of objects, use the token that was returned for the prior request in
     *        your next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileResourceAssociationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the Profile.
     * </p>
     * 
     * @param profileId
     *        The ID of the Profile.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * The ID of the Profile.
     * </p>
     * 
     * @return The ID of the Profile.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * The ID of the Profile.
     * </p>
     * 
     * @param profileId
     *        The ID of the Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileResourceAssociationsRequest withProfileId(String profileId) {
        setProfileId(profileId);
        return this;
    }

    /**
     * <p>
     * ID of a resource if you want information on only one type.
     * </p>
     * 
     * @param resourceType
     *        ID of a resource if you want information on only one type.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * ID of a resource if you want information on only one type.
     * </p>
     * 
     * @return ID of a resource if you want information on only one type.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * ID of a resource if you want information on only one type.
     * </p>
     * 
     * @param resourceType
     *        ID of a resource if you want information on only one type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileResourceAssociationsRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProfileResourceAssociationsRequest == false)
            return false;
        ListProfileResourceAssociationsRequest other = (ListProfileResourceAssociationsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public ListProfileResourceAssociationsRequest clone() {
        return (ListProfileResourceAssociationsRequest) super.clone();
    }

}
