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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeAppBlockBuilderAppBlockAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAppBlockBuilderAppBlockAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * This list of app block builders associated with app blocks.
     * </p>
     */
    private java.util.List<AppBlockBuilderAppBlockAssociation> appBlockBuilderAppBlockAssociations;
    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * This list of app block builders associated with app blocks.
     * </p>
     * 
     * @return This list of app block builders associated with app blocks.
     */

    public java.util.List<AppBlockBuilderAppBlockAssociation> getAppBlockBuilderAppBlockAssociations() {
        return appBlockBuilderAppBlockAssociations;
    }

    /**
     * <p>
     * This list of app block builders associated with app blocks.
     * </p>
     * 
     * @param appBlockBuilderAppBlockAssociations
     *        This list of app block builders associated with app blocks.
     */

    public void setAppBlockBuilderAppBlockAssociations(java.util.Collection<AppBlockBuilderAppBlockAssociation> appBlockBuilderAppBlockAssociations) {
        if (appBlockBuilderAppBlockAssociations == null) {
            this.appBlockBuilderAppBlockAssociations = null;
            return;
        }

        this.appBlockBuilderAppBlockAssociations = new java.util.ArrayList<AppBlockBuilderAppBlockAssociation>(appBlockBuilderAppBlockAssociations);
    }

    /**
     * <p>
     * This list of app block builders associated with app blocks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppBlockBuilderAppBlockAssociations(java.util.Collection)} or
     * {@link #withAppBlockBuilderAppBlockAssociations(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param appBlockBuilderAppBlockAssociations
     *        This list of app block builders associated with app blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppBlockBuilderAppBlockAssociationsResult withAppBlockBuilderAppBlockAssociations(
            AppBlockBuilderAppBlockAssociation... appBlockBuilderAppBlockAssociations) {
        if (this.appBlockBuilderAppBlockAssociations == null) {
            setAppBlockBuilderAppBlockAssociations(new java.util.ArrayList<AppBlockBuilderAppBlockAssociation>(appBlockBuilderAppBlockAssociations.length));
        }
        for (AppBlockBuilderAppBlockAssociation ele : appBlockBuilderAppBlockAssociations) {
            this.appBlockBuilderAppBlockAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This list of app block builders associated with app blocks.
     * </p>
     * 
     * @param appBlockBuilderAppBlockAssociations
     *        This list of app block builders associated with app blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppBlockBuilderAppBlockAssociationsResult withAppBlockBuilderAppBlockAssociations(
            java.util.Collection<AppBlockBuilderAppBlockAssociation> appBlockBuilderAppBlockAssociations) {
        setAppBlockBuilderAppBlockAssociations(appBlockBuilderAppBlockAssociations);
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

    public DescribeAppBlockBuilderAppBlockAssociationsResult withNextToken(String nextToken) {
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
        if (getAppBlockBuilderAppBlockAssociations() != null)
            sb.append("AppBlockBuilderAppBlockAssociations: ").append(getAppBlockBuilderAppBlockAssociations()).append(",");
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

        if (obj instanceof DescribeAppBlockBuilderAppBlockAssociationsResult == false)
            return false;
        DescribeAppBlockBuilderAppBlockAssociationsResult other = (DescribeAppBlockBuilderAppBlockAssociationsResult) obj;
        if (other.getAppBlockBuilderAppBlockAssociations() == null ^ this.getAppBlockBuilderAppBlockAssociations() == null)
            return false;
        if (other.getAppBlockBuilderAppBlockAssociations() != null
                && other.getAppBlockBuilderAppBlockAssociations().equals(this.getAppBlockBuilderAppBlockAssociations()) == false)
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

        hashCode = prime * hashCode + ((getAppBlockBuilderAppBlockAssociations() == null) ? 0 : getAppBlockBuilderAppBlockAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAppBlockBuilderAppBlockAssociationsResult clone() {
        try {
            return (DescribeAppBlockBuilderAppBlockAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
