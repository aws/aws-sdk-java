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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListProfileResourceAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProfileResourceAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * If more than <code>MaxResults</code> resource associations match the specified criteria, you can submit another
     * <code>ListProfileResourceAssociations</code> request to get the next group of results. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about the profile resource association that you specified in a
     * <code>GetProfileResourceAssociation</code> request.
     * </p>
     */
    private java.util.List<ProfileResourceAssociation> profileResourceAssociations;

    /**
     * <p>
     * If more than <code>MaxResults</code> resource associations match the specified criteria, you can submit another
     * <code>ListProfileResourceAssociations</code> request to get the next group of results. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> resource associations match the specified criteria, you can submit
     *        another <code>ListProfileResourceAssociations</code> request to get the next group of results. In the next
     *        request, specify the value of <code>NextToken</code> from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> resource associations match the specified criteria, you can submit another
     * <code>ListProfileResourceAssociations</code> request to get the next group of results. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @return If more than <code>MaxResults</code> resource associations match the specified criteria, you can submit
     *         another <code>ListProfileResourceAssociations</code> request to get the next group of results. In the
     *         next request, specify the value of <code>NextToken</code> from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> resource associations match the specified criteria, you can submit another
     * <code>ListProfileResourceAssociations</code> request to get the next group of results. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> resource associations match the specified criteria, you can submit
     *        another <code>ListProfileResourceAssociations</code> request to get the next group of results. In the next
     *        request, specify the value of <code>NextToken</code> from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileResourceAssociationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about the profile resource association that you specified in a
     * <code>GetProfileResourceAssociation</code> request.
     * </p>
     * 
     * @return Information about the profile resource association that you specified in a
     *         <code>GetProfileResourceAssociation</code> request.
     */

    public java.util.List<ProfileResourceAssociation> getProfileResourceAssociations() {
        return profileResourceAssociations;
    }

    /**
     * <p>
     * Information about the profile resource association that you specified in a
     * <code>GetProfileResourceAssociation</code> request.
     * </p>
     * 
     * @param profileResourceAssociations
     *        Information about the profile resource association that you specified in a
     *        <code>GetProfileResourceAssociation</code> request.
     */

    public void setProfileResourceAssociations(java.util.Collection<ProfileResourceAssociation> profileResourceAssociations) {
        if (profileResourceAssociations == null) {
            this.profileResourceAssociations = null;
            return;
        }

        this.profileResourceAssociations = new java.util.ArrayList<ProfileResourceAssociation>(profileResourceAssociations);
    }

    /**
     * <p>
     * Information about the profile resource association that you specified in a
     * <code>GetProfileResourceAssociation</code> request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfileResourceAssociations(java.util.Collection)} or
     * {@link #withProfileResourceAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param profileResourceAssociations
     *        Information about the profile resource association that you specified in a
     *        <code>GetProfileResourceAssociation</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileResourceAssociationsResult withProfileResourceAssociations(ProfileResourceAssociation... profileResourceAssociations) {
        if (this.profileResourceAssociations == null) {
            setProfileResourceAssociations(new java.util.ArrayList<ProfileResourceAssociation>(profileResourceAssociations.length));
        }
        for (ProfileResourceAssociation ele : profileResourceAssociations) {
            this.profileResourceAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the profile resource association that you specified in a
     * <code>GetProfileResourceAssociation</code> request.
     * </p>
     * 
     * @param profileResourceAssociations
     *        Information about the profile resource association that you specified in a
     *        <code>GetProfileResourceAssociation</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileResourceAssociationsResult withProfileResourceAssociations(java.util.Collection<ProfileResourceAssociation> profileResourceAssociations) {
        setProfileResourceAssociations(profileResourceAssociations);
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
        if (getProfileResourceAssociations() != null)
            sb.append("ProfileResourceAssociations: ").append(getProfileResourceAssociations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProfileResourceAssociationsResult == false)
            return false;
        ListProfileResourceAssociationsResult other = (ListProfileResourceAssociationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProfileResourceAssociations() == null ^ this.getProfileResourceAssociations() == null)
            return false;
        if (other.getProfileResourceAssociations() != null && other.getProfileResourceAssociations().equals(this.getProfileResourceAssociations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProfileResourceAssociations() == null) ? 0 : getProfileResourceAssociations().hashCode());
        return hashCode;
    }

    @Override
    public ListProfileResourceAssociationsResult clone() {
        try {
            return (ListProfileResourceAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
