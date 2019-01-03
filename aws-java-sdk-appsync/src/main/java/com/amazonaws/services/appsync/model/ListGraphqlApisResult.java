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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListGraphqlApis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGraphqlApisResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>GraphqlApi</code> objects.
     * </p>
     */
    private java.util.List<GraphqlApi> graphqlApis;
    /**
     * <p>
     * An identifier to be passed in the next request to this operation to return the next set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The <code>GraphqlApi</code> objects.
     * </p>
     * 
     * @return The <code>GraphqlApi</code> objects.
     */

    public java.util.List<GraphqlApi> getGraphqlApis() {
        return graphqlApis;
    }

    /**
     * <p>
     * The <code>GraphqlApi</code> objects.
     * </p>
     * 
     * @param graphqlApis
     *        The <code>GraphqlApi</code> objects.
     */

    public void setGraphqlApis(java.util.Collection<GraphqlApi> graphqlApis) {
        if (graphqlApis == null) {
            this.graphqlApis = null;
            return;
        }

        this.graphqlApis = new java.util.ArrayList<GraphqlApi>(graphqlApis);
    }

    /**
     * <p>
     * The <code>GraphqlApi</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGraphqlApis(java.util.Collection)} or {@link #withGraphqlApis(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param graphqlApis
     *        The <code>GraphqlApi</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGraphqlApisResult withGraphqlApis(GraphqlApi... graphqlApis) {
        if (this.graphqlApis == null) {
            setGraphqlApis(new java.util.ArrayList<GraphqlApi>(graphqlApis.length));
        }
        for (GraphqlApi ele : graphqlApis) {
            this.graphqlApis.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>GraphqlApi</code> objects.
     * </p>
     * 
     * @param graphqlApis
     *        The <code>GraphqlApi</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGraphqlApisResult withGraphqlApis(java.util.Collection<GraphqlApi> graphqlApis) {
        setGraphqlApis(graphqlApis);
        return this;
    }

    /**
     * <p>
     * An identifier to be passed in the next request to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier to be passed in the next request to this operation to return the next set of items in the
     *        list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier to be passed in the next request to this operation to return the next set of items in the list.
     * </p>
     * 
     * @return An identifier to be passed in the next request to this operation to return the next set of items in the
     *         list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier to be passed in the next request to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier to be passed in the next request to this operation to return the next set of items in the
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGraphqlApisResult withNextToken(String nextToken) {
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
        if (getGraphqlApis() != null)
            sb.append("GraphqlApis: ").append(getGraphqlApis()).append(",");
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

        if (obj instanceof ListGraphqlApisResult == false)
            return false;
        ListGraphqlApisResult other = (ListGraphqlApisResult) obj;
        if (other.getGraphqlApis() == null ^ this.getGraphqlApis() == null)
            return false;
        if (other.getGraphqlApis() != null && other.getGraphqlApis().equals(this.getGraphqlApis()) == false)
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

        hashCode = prime * hashCode + ((getGraphqlApis() == null) ? 0 : getGraphqlApis().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGraphqlApisResult clone() {
        try {
            return (ListGraphqlApisResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
