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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeUserStackAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUserStackAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The UserStackAssociation objects.
     * </p>
     */
    private java.util.List<UserStackAssociation> userStackAssociations;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The UserStackAssociation objects.
     * </p>
     * 
     * @return The UserStackAssociation objects.
     */

    public java.util.List<UserStackAssociation> getUserStackAssociations() {
        return userStackAssociations;
    }

    /**
     * <p>
     * The UserStackAssociation objects.
     * </p>
     * 
     * @param userStackAssociations
     *        The UserStackAssociation objects.
     */

    public void setUserStackAssociations(java.util.Collection<UserStackAssociation> userStackAssociations) {
        if (userStackAssociations == null) {
            this.userStackAssociations = null;
            return;
        }

        this.userStackAssociations = new java.util.ArrayList<UserStackAssociation>(userStackAssociations);
    }

    /**
     * <p>
     * The UserStackAssociation objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserStackAssociations(java.util.Collection)} or
     * {@link #withUserStackAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param userStackAssociations
     *        The UserStackAssociation objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserStackAssociationsResult withUserStackAssociations(UserStackAssociation... userStackAssociations) {
        if (this.userStackAssociations == null) {
            setUserStackAssociations(new java.util.ArrayList<UserStackAssociation>(userStackAssociations.length));
        }
        for (UserStackAssociation ele : userStackAssociations) {
            this.userStackAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The UserStackAssociation objects.
     * </p>
     * 
     * @param userStackAssociations
     *        The UserStackAssociation objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserStackAssociationsResult withUserStackAssociations(java.util.Collection<UserStackAssociation> userStackAssociations) {
        setUserStackAssociations(userStackAssociations);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserStackAssociationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getUserStackAssociations() != null)
            sb.append("UserStackAssociations: ").append(getUserStackAssociations()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUserStackAssociationsResult == false)
            return false;
        DescribeUserStackAssociationsResult other = (DescribeUserStackAssociationsResult) obj;
        if (other.getUserStackAssociations() == null ^ this.getUserStackAssociations() == null)
            return false;
        if (other.getUserStackAssociations() != null && other.getUserStackAssociations().equals(this.getUserStackAssociations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserStackAssociations() == null) ? 0 : getUserStackAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUserStackAssociationsResult clone() {
        try {
            return (DescribeUserStackAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
