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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListApplicationAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of Application Associations for the Application.
     * </p>
     */
    private java.util.List<ApplicationAssociationSummary> applicationAssociations;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of Application Associations for the Application.
     * </p>
     * 
     * @return List of Application Associations for the Application.
     */

    public java.util.List<ApplicationAssociationSummary> getApplicationAssociations() {
        return applicationAssociations;
    }

    /**
     * <p>
     * List of Application Associations for the Application.
     * </p>
     * 
     * @param applicationAssociations
     *        List of Application Associations for the Application.
     */

    public void setApplicationAssociations(java.util.Collection<ApplicationAssociationSummary> applicationAssociations) {
        if (applicationAssociations == null) {
            this.applicationAssociations = null;
            return;
        }

        this.applicationAssociations = new java.util.ArrayList<ApplicationAssociationSummary>(applicationAssociations);
    }

    /**
     * <p>
     * List of Application Associations for the Application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationAssociations(java.util.Collection)} or
     * {@link #withApplicationAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param applicationAssociations
     *        List of Application Associations for the Application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationAssociationsResult withApplicationAssociations(ApplicationAssociationSummary... applicationAssociations) {
        if (this.applicationAssociations == null) {
            setApplicationAssociations(new java.util.ArrayList<ApplicationAssociationSummary>(applicationAssociations.length));
        }
        for (ApplicationAssociationSummary ele : applicationAssociations) {
            this.applicationAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of Application Associations for the Application.
     * </p>
     * 
     * @param applicationAssociations
     *        List of Application Associations for the Application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationAssociationsResult withApplicationAssociations(java.util.Collection<ApplicationAssociationSummary> applicationAssociations) {
        setApplicationAssociations(applicationAssociations);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationAssociationsResult withNextToken(String nextToken) {
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
        if (getApplicationAssociations() != null)
            sb.append("ApplicationAssociations: ").append(getApplicationAssociations()).append(",");
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

        if (obj instanceof ListApplicationAssociationsResult == false)
            return false;
        ListApplicationAssociationsResult other = (ListApplicationAssociationsResult) obj;
        if (other.getApplicationAssociations() == null ^ this.getApplicationAssociations() == null)
            return false;
        if (other.getApplicationAssociations() != null && other.getApplicationAssociations().equals(this.getApplicationAssociations()) == false)
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

        hashCode = prime * hashCode + ((getApplicationAssociations() == null) ? 0 : getApplicationAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationAssociationsResult clone() {
        try {
            return (ListApplicationAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
