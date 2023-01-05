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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListEntitledApplications" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEntitledApplicationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The entitled applications.
     * </p>
     */
    private java.util.List<EntitledApplication> entitledApplications;
    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The entitled applications.
     * </p>
     * 
     * @return The entitled applications.
     */

    public java.util.List<EntitledApplication> getEntitledApplications() {
        return entitledApplications;
    }

    /**
     * <p>
     * The entitled applications.
     * </p>
     * 
     * @param entitledApplications
     *        The entitled applications.
     */

    public void setEntitledApplications(java.util.Collection<EntitledApplication> entitledApplications) {
        if (entitledApplications == null) {
            this.entitledApplications = null;
            return;
        }

        this.entitledApplications = new java.util.ArrayList<EntitledApplication>(entitledApplications);
    }

    /**
     * <p>
     * The entitled applications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntitledApplications(java.util.Collection)} or {@link #withEntitledApplications(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param entitledApplications
     *        The entitled applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitledApplicationsResult withEntitledApplications(EntitledApplication... entitledApplications) {
        if (this.entitledApplications == null) {
            setEntitledApplications(new java.util.ArrayList<EntitledApplication>(entitledApplications.length));
        }
        for (EntitledApplication ele : entitledApplications) {
            this.entitledApplications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The entitled applications.
     * </p>
     * 
     * @param entitledApplications
     *        The entitled applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitledApplicationsResult withEntitledApplications(java.util.Collection<EntitledApplication> entitledApplications) {
        setEntitledApplications(entitledApplications);
        return this;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @return The pagination token used to retrieve the next page of results for this operation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitledApplicationsResult withNextToken(String nextToken) {
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
        if (getEntitledApplications() != null)
            sb.append("EntitledApplications: ").append(getEntitledApplications()).append(",");
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

        if (obj instanceof ListEntitledApplicationsResult == false)
            return false;
        ListEntitledApplicationsResult other = (ListEntitledApplicationsResult) obj;
        if (other.getEntitledApplications() == null ^ this.getEntitledApplications() == null)
            return false;
        if (other.getEntitledApplications() != null && other.getEntitledApplications().equals(this.getEntitledApplications()) == false)
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

        hashCode = prime * hashCode + ((getEntitledApplications() == null) ? 0 : getEntitledApplications().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEntitledApplicationsResult clone() {
        try {
            return (ListEntitledApplicationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
