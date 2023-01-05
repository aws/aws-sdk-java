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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeApplicationFleetAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationFleetAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The application fleet associations in the list.
     * </p>
     */
    private java.util.List<ApplicationFleetAssociation> applicationFleetAssociations;
    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The application fleet associations in the list.
     * </p>
     * 
     * @return The application fleet associations in the list.
     */

    public java.util.List<ApplicationFleetAssociation> getApplicationFleetAssociations() {
        return applicationFleetAssociations;
    }

    /**
     * <p>
     * The application fleet associations in the list.
     * </p>
     * 
     * @param applicationFleetAssociations
     *        The application fleet associations in the list.
     */

    public void setApplicationFleetAssociations(java.util.Collection<ApplicationFleetAssociation> applicationFleetAssociations) {
        if (applicationFleetAssociations == null) {
            this.applicationFleetAssociations = null;
            return;
        }

        this.applicationFleetAssociations = new java.util.ArrayList<ApplicationFleetAssociation>(applicationFleetAssociations);
    }

    /**
     * <p>
     * The application fleet associations in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationFleetAssociations(java.util.Collection)} or
     * {@link #withApplicationFleetAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param applicationFleetAssociations
     *        The application fleet associations in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationFleetAssociationsResult withApplicationFleetAssociations(ApplicationFleetAssociation... applicationFleetAssociations) {
        if (this.applicationFleetAssociations == null) {
            setApplicationFleetAssociations(new java.util.ArrayList<ApplicationFleetAssociation>(applicationFleetAssociations.length));
        }
        for (ApplicationFleetAssociation ele : applicationFleetAssociations) {
            this.applicationFleetAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The application fleet associations in the list.
     * </p>
     * 
     * @param applicationFleetAssociations
     *        The application fleet associations in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationFleetAssociationsResult withApplicationFleetAssociations(
            java.util.Collection<ApplicationFleetAssociation> applicationFleetAssociations) {
        setApplicationFleetAssociations(applicationFleetAssociations);
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

    public DescribeApplicationFleetAssociationsResult withNextToken(String nextToken) {
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
        if (getApplicationFleetAssociations() != null)
            sb.append("ApplicationFleetAssociations: ").append(getApplicationFleetAssociations()).append(",");
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

        if (obj instanceof DescribeApplicationFleetAssociationsResult == false)
            return false;
        DescribeApplicationFleetAssociationsResult other = (DescribeApplicationFleetAssociationsResult) obj;
        if (other.getApplicationFleetAssociations() == null ^ this.getApplicationFleetAssociations() == null)
            return false;
        if (other.getApplicationFleetAssociations() != null && other.getApplicationFleetAssociations().equals(this.getApplicationFleetAssociations()) == false)
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

        hashCode = prime * hashCode + ((getApplicationFleetAssociations() == null) ? 0 : getApplicationFleetAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationFleetAssociationsResult clone() {
        try {
            return (DescribeApplicationFleetAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
