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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/ListProfileAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProfileAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If more than <code>MaxResults</code> profile associations match the specified criteria, you can submit another
     * <code>ListProfileAssociations</code> request to get the next group of results. In the next request, specify the
     * value of <code>NextToken</code> from the previous response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A complex type that containts settings information about the profile's VPC associations.
     * </p>
     */
    private java.util.List<ProfileAssociation> profileAssociations;

    /**
     * <p>
     * If more than <code>MaxResults</code> profile associations match the specified criteria, you can submit another
     * <code>ListProfileAssociations</code> request to get the next group of results. In the next request, specify the
     * value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> profile associations match the specified criteria, you can submit
     *        another <code>ListProfileAssociations</code> request to get the next group of results. In the next
     *        request, specify the value of <code>NextToken</code> from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> profile associations match the specified criteria, you can submit another
     * <code>ListProfileAssociations</code> request to get the next group of results. In the next request, specify the
     * value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @return If more than <code>MaxResults</code> profile associations match the specified criteria, you can submit
     *         another <code>ListProfileAssociations</code> request to get the next group of results. In the next
     *         request, specify the value of <code>NextToken</code> from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> profile associations match the specified criteria, you can submit another
     * <code>ListProfileAssociations</code> request to get the next group of results. In the next request, specify the
     * value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> profile associations match the specified criteria, you can submit
     *        another <code>ListProfileAssociations</code> request to get the next group of results. In the next
     *        request, specify the value of <code>NextToken</code> from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileAssociationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A complex type that containts settings information about the profile's VPC associations.
     * </p>
     * 
     * @return A complex type that containts settings information about the profile's VPC associations.
     */

    public java.util.List<ProfileAssociation> getProfileAssociations() {
        return profileAssociations;
    }

    /**
     * <p>
     * A complex type that containts settings information about the profile's VPC associations.
     * </p>
     * 
     * @param profileAssociations
     *        A complex type that containts settings information about the profile's VPC associations.
     */

    public void setProfileAssociations(java.util.Collection<ProfileAssociation> profileAssociations) {
        if (profileAssociations == null) {
            this.profileAssociations = null;
            return;
        }

        this.profileAssociations = new java.util.ArrayList<ProfileAssociation>(profileAssociations);
    }

    /**
     * <p>
     * A complex type that containts settings information about the profile's VPC associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfileAssociations(java.util.Collection)} or {@link #withProfileAssociations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param profileAssociations
     *        A complex type that containts settings information about the profile's VPC associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileAssociationsResult withProfileAssociations(ProfileAssociation... profileAssociations) {
        if (this.profileAssociations == null) {
            setProfileAssociations(new java.util.ArrayList<ProfileAssociation>(profileAssociations.length));
        }
        for (ProfileAssociation ele : profileAssociations) {
            this.profileAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that containts settings information about the profile's VPC associations.
     * </p>
     * 
     * @param profileAssociations
     *        A complex type that containts settings information about the profile's VPC associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileAssociationsResult withProfileAssociations(java.util.Collection<ProfileAssociation> profileAssociations) {
        setProfileAssociations(profileAssociations);
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
        if (getProfileAssociations() != null)
            sb.append("ProfileAssociations: ").append(getProfileAssociations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProfileAssociationsResult == false)
            return false;
        ListProfileAssociationsResult other = (ListProfileAssociationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProfileAssociations() == null ^ this.getProfileAssociations() == null)
            return false;
        if (other.getProfileAssociations() != null && other.getProfileAssociations().equals(this.getProfileAssociations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProfileAssociations() == null) ? 0 : getProfileAssociations().hashCode());
        return hashCode;
    }

    @Override
    public ListProfileAssociationsResult clone() {
        try {
            return (ListProfileAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
