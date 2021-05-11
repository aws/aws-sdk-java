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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListEngagements" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEngagementsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of each engagement that occurred during the specified time range of an incident.
     * </p>
     */
    private java.util.List<Engagement> engagements;

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @return The pagination token to continue to the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEngagementsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of each engagement that occurred during the specified time range of an incident.
     * </p>
     * 
     * @return A list of each engagement that occurred during the specified time range of an incident.
     */

    public java.util.List<Engagement> getEngagements() {
        return engagements;
    }

    /**
     * <p>
     * A list of each engagement that occurred during the specified time range of an incident.
     * </p>
     * 
     * @param engagements
     *        A list of each engagement that occurred during the specified time range of an incident.
     */

    public void setEngagements(java.util.Collection<Engagement> engagements) {
        if (engagements == null) {
            this.engagements = null;
            return;
        }

        this.engagements = new java.util.ArrayList<Engagement>(engagements);
    }

    /**
     * <p>
     * A list of each engagement that occurred during the specified time range of an incident.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEngagements(java.util.Collection)} or {@link #withEngagements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param engagements
     *        A list of each engagement that occurred during the specified time range of an incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEngagementsResult withEngagements(Engagement... engagements) {
        if (this.engagements == null) {
            setEngagements(new java.util.ArrayList<Engagement>(engagements.length));
        }
        for (Engagement ele : engagements) {
            this.engagements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of each engagement that occurred during the specified time range of an incident.
     * </p>
     * 
     * @param engagements
     *        A list of each engagement that occurred during the specified time range of an incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEngagementsResult withEngagements(java.util.Collection<Engagement> engagements) {
        setEngagements(engagements);
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
        if (getEngagements() != null)
            sb.append("Engagements: ").append(getEngagements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEngagementsResult == false)
            return false;
        ListEngagementsResult other = (ListEngagementsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getEngagements() == null ^ this.getEngagements() == null)
            return false;
        if (other.getEngagements() != null && other.getEngagements().equals(this.getEngagements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getEngagements() == null) ? 0 : getEngagements().hashCode());
        return hashCode;
    }

    @Override
    public ListEngagementsResult clone() {
        try {
            return (ListEngagementsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
