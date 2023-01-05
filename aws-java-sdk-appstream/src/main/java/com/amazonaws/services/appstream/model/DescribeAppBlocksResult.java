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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeAppBlocks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAppBlocksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The app blocks in the list.
     * </p>
     */
    private java.util.List<AppBlock> appBlocks;
    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The app blocks in the list.
     * </p>
     * 
     * @return The app blocks in the list.
     */

    public java.util.List<AppBlock> getAppBlocks() {
        return appBlocks;
    }

    /**
     * <p>
     * The app blocks in the list.
     * </p>
     * 
     * @param appBlocks
     *        The app blocks in the list.
     */

    public void setAppBlocks(java.util.Collection<AppBlock> appBlocks) {
        if (appBlocks == null) {
            this.appBlocks = null;
            return;
        }

        this.appBlocks = new java.util.ArrayList<AppBlock>(appBlocks);
    }

    /**
     * <p>
     * The app blocks in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppBlocks(java.util.Collection)} or {@link #withAppBlocks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param appBlocks
     *        The app blocks in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppBlocksResult withAppBlocks(AppBlock... appBlocks) {
        if (this.appBlocks == null) {
            setAppBlocks(new java.util.ArrayList<AppBlock>(appBlocks.length));
        }
        for (AppBlock ele : appBlocks) {
            this.appBlocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The app blocks in the list.
     * </p>
     * 
     * @param appBlocks
     *        The app blocks in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppBlocksResult withAppBlocks(java.util.Collection<AppBlock> appBlocks) {
        setAppBlocks(appBlocks);
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

    public DescribeAppBlocksResult withNextToken(String nextToken) {
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
        if (getAppBlocks() != null)
            sb.append("AppBlocks: ").append(getAppBlocks()).append(",");
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

        if (obj instanceof DescribeAppBlocksResult == false)
            return false;
        DescribeAppBlocksResult other = (DescribeAppBlocksResult) obj;
        if (other.getAppBlocks() == null ^ this.getAppBlocks() == null)
            return false;
        if (other.getAppBlocks() != null && other.getAppBlocks().equals(this.getAppBlocks()) == false)
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

        hashCode = prime * hashCode + ((getAppBlocks() == null) ? 0 : getAppBlocks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAppBlocksResult clone() {
        try {
            return (DescribeAppBlocksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
