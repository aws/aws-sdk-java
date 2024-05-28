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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeAppBlockBuilders" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAppBlockBuildersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list that describes one or more app block builders.
     * </p>
     */
    private java.util.List<AppBlockBuilder> appBlockBuilders;
    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list that describes one or more app block builders.
     * </p>
     * 
     * @return The list that describes one or more app block builders.
     */

    public java.util.List<AppBlockBuilder> getAppBlockBuilders() {
        return appBlockBuilders;
    }

    /**
     * <p>
     * The list that describes one or more app block builders.
     * </p>
     * 
     * @param appBlockBuilders
     *        The list that describes one or more app block builders.
     */

    public void setAppBlockBuilders(java.util.Collection<AppBlockBuilder> appBlockBuilders) {
        if (appBlockBuilders == null) {
            this.appBlockBuilders = null;
            return;
        }

        this.appBlockBuilders = new java.util.ArrayList<AppBlockBuilder>(appBlockBuilders);
    }

    /**
     * <p>
     * The list that describes one or more app block builders.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppBlockBuilders(java.util.Collection)} or {@link #withAppBlockBuilders(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param appBlockBuilders
     *        The list that describes one or more app block builders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppBlockBuildersResult withAppBlockBuilders(AppBlockBuilder... appBlockBuilders) {
        if (this.appBlockBuilders == null) {
            setAppBlockBuilders(new java.util.ArrayList<AppBlockBuilder>(appBlockBuilders.length));
        }
        for (AppBlockBuilder ele : appBlockBuilders) {
            this.appBlockBuilders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list that describes one or more app block builders.
     * </p>
     * 
     * @param appBlockBuilders
     *        The list that describes one or more app block builders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppBlockBuildersResult withAppBlockBuilders(java.util.Collection<AppBlockBuilder> appBlockBuilders) {
        setAppBlockBuilders(appBlockBuilders);
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

    public DescribeAppBlockBuildersResult withNextToken(String nextToken) {
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
        if (getAppBlockBuilders() != null)
            sb.append("AppBlockBuilders: ").append(getAppBlockBuilders()).append(",");
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

        if (obj instanceof DescribeAppBlockBuildersResult == false)
            return false;
        DescribeAppBlockBuildersResult other = (DescribeAppBlockBuildersResult) obj;
        if (other.getAppBlockBuilders() == null ^ this.getAppBlockBuilders() == null)
            return false;
        if (other.getAppBlockBuilders() != null && other.getAppBlockBuilders().equals(this.getAppBlockBuilders()) == false)
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

        hashCode = prime * hashCode + ((getAppBlockBuilders() == null) ? 0 : getAppBlockBuilders().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAppBlockBuildersResult clone() {
        try {
            return (DescribeAppBlockBuildersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
