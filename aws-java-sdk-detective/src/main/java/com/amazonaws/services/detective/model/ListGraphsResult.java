/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListGraphs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGraphsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of behavior graphs that the account is a master for.
     * </p>
     */
    private java.util.List<Graph> graphList;
    /**
     * <p>
     * If there are more behavior graphs remaining in the results, then this is the pagination token to use to request
     * the next page of behavior graphs.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of behavior graphs that the account is a master for.
     * </p>
     * 
     * @return A list of behavior graphs that the account is a master for.
     */

    public java.util.List<Graph> getGraphList() {
        return graphList;
    }

    /**
     * <p>
     * A list of behavior graphs that the account is a master for.
     * </p>
     * 
     * @param graphList
     *        A list of behavior graphs that the account is a master for.
     */

    public void setGraphList(java.util.Collection<Graph> graphList) {
        if (graphList == null) {
            this.graphList = null;
            return;
        }

        this.graphList = new java.util.ArrayList<Graph>(graphList);
    }

    /**
     * <p>
     * A list of behavior graphs that the account is a master for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGraphList(java.util.Collection)} or {@link #withGraphList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param graphList
     *        A list of behavior graphs that the account is a master for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGraphsResult withGraphList(Graph... graphList) {
        if (this.graphList == null) {
            setGraphList(new java.util.ArrayList<Graph>(graphList.length));
        }
        for (Graph ele : graphList) {
            this.graphList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of behavior graphs that the account is a master for.
     * </p>
     * 
     * @param graphList
     *        A list of behavior graphs that the account is a master for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGraphsResult withGraphList(java.util.Collection<Graph> graphList) {
        setGraphList(graphList);
        return this;
    }

    /**
     * <p>
     * If there are more behavior graphs remaining in the results, then this is the pagination token to use to request
     * the next page of behavior graphs.
     * </p>
     * 
     * @param nextToken
     *        If there are more behavior graphs remaining in the results, then this is the pagination token to use to
     *        request the next page of behavior graphs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more behavior graphs remaining in the results, then this is the pagination token to use to request
     * the next page of behavior graphs.
     * </p>
     * 
     * @return If there are more behavior graphs remaining in the results, then this is the pagination token to use to
     *         request the next page of behavior graphs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more behavior graphs remaining in the results, then this is the pagination token to use to request
     * the next page of behavior graphs.
     * </p>
     * 
     * @param nextToken
     *        If there are more behavior graphs remaining in the results, then this is the pagination token to use to
     *        request the next page of behavior graphs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGraphsResult withNextToken(String nextToken) {
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
        if (getGraphList() != null)
            sb.append("GraphList: ").append(getGraphList()).append(",");
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

        if (obj instanceof ListGraphsResult == false)
            return false;
        ListGraphsResult other = (ListGraphsResult) obj;
        if (other.getGraphList() == null ^ this.getGraphList() == null)
            return false;
        if (other.getGraphList() != null && other.getGraphList().equals(this.getGraphList()) == false)
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

        hashCode = prime * hashCode + ((getGraphList() == null) ? 0 : getGraphList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGraphsResult clone() {
        try {
            return (ListGraphsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
