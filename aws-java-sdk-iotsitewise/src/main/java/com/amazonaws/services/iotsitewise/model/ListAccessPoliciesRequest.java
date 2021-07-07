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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAccessPolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessPoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of identity (Amazon Web Services SSO user, Amazon Web Services SSO group, or IAM user). This parameter
     * is required if you specify <code>identityId</code>.
     * </p>
     */
    private String identityType;
    /**
     * <p>
     * The ID of the identity. This parameter is required if you specify <code>USER</code> or <code>GROUP</code> for
     * <code>identityType</code>.
     * </p>
     */
    private String identityId;
    /**
     * <p>
     * The type of resource (portal or project). This parameter is required if you specify <code>resourceId</code>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The ID of the resource. This parameter is required if you specify <code>resourceType</code>.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The ARN of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM ARNs</a> in the <i>IAM
     * User Guide</i>. This parameter is required if you specify <code>IAM</code> for <code>identityType</code>.
     * </p>
     */
    private String iamArn;
    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The type of identity (Amazon Web Services SSO user, Amazon Web Services SSO group, or IAM user). This parameter
     * is required if you specify <code>identityId</code>.
     * </p>
     * 
     * @param identityType
     *        The type of identity (Amazon Web Services SSO user, Amazon Web Services SSO group, or IAM user). This
     *        parameter is required if you specify <code>identityId</code>.
     * @see IdentityType
     */

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * <p>
     * The type of identity (Amazon Web Services SSO user, Amazon Web Services SSO group, or IAM user). This parameter
     * is required if you specify <code>identityId</code>.
     * </p>
     * 
     * @return The type of identity (Amazon Web Services SSO user, Amazon Web Services SSO group, or IAM user). This
     *         parameter is required if you specify <code>identityId</code>.
     * @see IdentityType
     */

    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * <p>
     * The type of identity (Amazon Web Services SSO user, Amazon Web Services SSO group, or IAM user). This parameter
     * is required if you specify <code>identityId</code>.
     * </p>
     * 
     * @param identityType
     *        The type of identity (Amazon Web Services SSO user, Amazon Web Services SSO group, or IAM user). This
     *        parameter is required if you specify <code>identityId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public ListAccessPoliciesRequest withIdentityType(String identityType) {
        setIdentityType(identityType);
        return this;
    }

    /**
     * <p>
     * The type of identity (Amazon Web Services SSO user, Amazon Web Services SSO group, or IAM user). This parameter
     * is required if you specify <code>identityId</code>.
     * </p>
     * 
     * @param identityType
     *        The type of identity (Amazon Web Services SSO user, Amazon Web Services SSO group, or IAM user). This
     *        parameter is required if you specify <code>identityId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public ListAccessPoliciesRequest withIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the identity. This parameter is required if you specify <code>USER</code> or <code>GROUP</code> for
     * <code>identityType</code>.
     * </p>
     * 
     * @param identityId
     *        The ID of the identity. This parameter is required if you specify <code>USER</code> or <code>GROUP</code>
     *        for <code>identityType</code>.
     */

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * <p>
     * The ID of the identity. This parameter is required if you specify <code>USER</code> or <code>GROUP</code> for
     * <code>identityType</code>.
     * </p>
     * 
     * @return The ID of the identity. This parameter is required if you specify <code>USER</code> or <code>GROUP</code>
     *         for <code>identityType</code>.
     */

    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * <p>
     * The ID of the identity. This parameter is required if you specify <code>USER</code> or <code>GROUP</code> for
     * <code>identityType</code>.
     * </p>
     * 
     * @param identityId
     *        The ID of the identity. This parameter is required if you specify <code>USER</code> or <code>GROUP</code>
     *        for <code>identityType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPoliciesRequest withIdentityId(String identityId) {
        setIdentityId(identityId);
        return this;
    }

    /**
     * <p>
     * The type of resource (portal or project). This parameter is required if you specify <code>resourceId</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource (portal or project). This parameter is required if you specify
     *        <code>resourceId</code>.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource (portal or project). This parameter is required if you specify <code>resourceId</code>.
     * </p>
     * 
     * @return The type of resource (portal or project). This parameter is required if you specify
     *         <code>resourceId</code>.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource (portal or project). This parameter is required if you specify <code>resourceId</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource (portal or project). This parameter is required if you specify
     *        <code>resourceId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ListAccessPoliciesRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource (portal or project). This parameter is required if you specify <code>resourceId</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource (portal or project). This parameter is required if you specify
     *        <code>resourceId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ListAccessPoliciesRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the resource. This parameter is required if you specify <code>resourceType</code>.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource. This parameter is required if you specify <code>resourceType</code>.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource. This parameter is required if you specify <code>resourceType</code>.
     * </p>
     * 
     * @return The ID of the resource. This parameter is required if you specify <code>resourceType</code>.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource. This parameter is required if you specify <code>resourceType</code>.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource. This parameter is required if you specify <code>resourceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPoliciesRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM ARNs</a> in the <i>IAM
     * User Guide</i>. This parameter is required if you specify <code>IAM</code> for <code>identityType</code>.
     * </p>
     * 
     * @param iamArn
     *        The ARN of the IAM user. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM ARNs</a> in the
     *        <i>IAM User Guide</i>. This parameter is required if you specify <code>IAM</code> for
     *        <code>identityType</code>.
     */

    public void setIamArn(String iamArn) {
        this.iamArn = iamArn;
    }

    /**
     * <p>
     * The ARN of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM ARNs</a> in the <i>IAM
     * User Guide</i>. This parameter is required if you specify <code>IAM</code> for <code>identityType</code>.
     * </p>
     * 
     * @return The ARN of the IAM user. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM ARNs</a> in the
     *         <i>IAM User Guide</i>. This parameter is required if you specify <code>IAM</code> for
     *         <code>identityType</code>.
     */

    public String getIamArn() {
        return this.iamArn;
    }

    /**
     * <p>
     * The ARN of the IAM user. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM ARNs</a> in the <i>IAM
     * User Guide</i>. This parameter is required if you specify <code>IAM</code> for <code>identityType</code>.
     * </p>
     * 
     * @param iamArn
     *        The ARN of the IAM user. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM ARNs</a> in the
     *        <i>IAM User Guide</i>. This parameter is required if you specify <code>IAM</code> for
     *        <code>identityType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPoliciesRequest withIamArn(String iamArn) {
        setIamArn(iamArn);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPoliciesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request.</p>
     *        <p>
     *        Default: 50
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * 
     * @return The maximum number of results to return for each paginated request.</p>
     *         <p>
     *         Default: 50
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request.</p>
     *        <p>
     *        Default: 50
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessPoliciesRequest withMaxResults(Integer maxResults) {
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
        if (getIdentityType() != null)
            sb.append("IdentityType: ").append(getIdentityType()).append(",");
        if (getIdentityId() != null)
            sb.append("IdentityId: ").append(getIdentityId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getIamArn() != null)
            sb.append("IamArn: ").append(getIamArn()).append(",");
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

        if (obj instanceof ListAccessPoliciesRequest == false)
            return false;
        ListAccessPoliciesRequest other = (ListAccessPoliciesRequest) obj;
        if (other.getIdentityType() == null ^ this.getIdentityType() == null)
            return false;
        if (other.getIdentityType() != null && other.getIdentityType().equals(this.getIdentityType()) == false)
            return false;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getIamArn() == null ^ this.getIamArn() == null)
            return false;
        if (other.getIamArn() != null && other.getIamArn().equals(this.getIamArn()) == false)
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

        hashCode = prime * hashCode + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode());
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getIamArn() == null) ? 0 : getIamArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAccessPoliciesRequest clone() {
        return (ListAccessPoliciesRequest) super.clone();
    }

}
