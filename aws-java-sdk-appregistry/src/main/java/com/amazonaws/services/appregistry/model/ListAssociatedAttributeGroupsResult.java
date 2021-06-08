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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ListAssociatedAttributeGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssociatedAttributeGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of attribute group IDs.
     * </p>
     */
    private java.util.List<String> attributeGroups;
    /**
     * <p>
     * The token to use to get the next page of results after a previous API call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of attribute group IDs.
     * </p>
     * 
     * @return A list of attribute group IDs.
     */

    public java.util.List<String> getAttributeGroups() {
        return attributeGroups;
    }

    /**
     * <p>
     * A list of attribute group IDs.
     * </p>
     * 
     * @param attributeGroups
     *        A list of attribute group IDs.
     */

    public void setAttributeGroups(java.util.Collection<String> attributeGroups) {
        if (attributeGroups == null) {
            this.attributeGroups = null;
            return;
        }

        this.attributeGroups = new java.util.ArrayList<String>(attributeGroups);
    }

    /**
     * <p>
     * A list of attribute group IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeGroups(java.util.Collection)} or {@link #withAttributeGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attributeGroups
     *        A list of attribute group IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedAttributeGroupsResult withAttributeGroups(String... attributeGroups) {
        if (this.attributeGroups == null) {
            setAttributeGroups(new java.util.ArrayList<String>(attributeGroups.length));
        }
        for (String ele : attributeGroups) {
            this.attributeGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of attribute group IDs.
     * </p>
     * 
     * @param attributeGroups
     *        A list of attribute group IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedAttributeGroupsResult withAttributeGroups(java.util.Collection<String> attributeGroups) {
        setAttributeGroups(attributeGroups);
        return this;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next page of results after a previous API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call.
     * </p>
     * 
     * @return The token to use to get the next page of results after a previous API call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next page of results after a previous API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedAttributeGroupsResult withNextToken(String nextToken) {
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
        if (getAttributeGroups() != null)
            sb.append("AttributeGroups: ").append(getAttributeGroups()).append(",");
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

        if (obj instanceof ListAssociatedAttributeGroupsResult == false)
            return false;
        ListAssociatedAttributeGroupsResult other = (ListAssociatedAttributeGroupsResult) obj;
        if (other.getAttributeGroups() == null ^ this.getAttributeGroups() == null)
            return false;
        if (other.getAttributeGroups() != null && other.getAttributeGroups().equals(this.getAttributeGroups()) == false)
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

        hashCode = prime * hashCode + ((getAttributeGroups() == null) ? 0 : getAttributeGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssociatedAttributeGroupsResult clone() {
        try {
            return (ListAssociatedAttributeGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
