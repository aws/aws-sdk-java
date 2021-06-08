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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeQueryDefinitions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeQueryDefinitionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of query definitions that match your request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<QueryDefinition> queryDefinitions;

    private String nextToken;

    /**
     * <p>
     * The list of query definitions that match your request.
     * </p>
     * 
     * @return The list of query definitions that match your request.
     */

    public java.util.List<QueryDefinition> getQueryDefinitions() {
        if (queryDefinitions == null) {
            queryDefinitions = new com.amazonaws.internal.SdkInternalList<QueryDefinition>();
        }
        return queryDefinitions;
    }

    /**
     * <p>
     * The list of query definitions that match your request.
     * </p>
     * 
     * @param queryDefinitions
     *        The list of query definitions that match your request.
     */

    public void setQueryDefinitions(java.util.Collection<QueryDefinition> queryDefinitions) {
        if (queryDefinitions == null) {
            this.queryDefinitions = null;
            return;
        }

        this.queryDefinitions = new com.amazonaws.internal.SdkInternalList<QueryDefinition>(queryDefinitions);
    }

    /**
     * <p>
     * The list of query definitions that match your request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueryDefinitions(java.util.Collection)} or {@link #withQueryDefinitions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param queryDefinitions
     *        The list of query definitions that match your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQueryDefinitionsResult withQueryDefinitions(QueryDefinition... queryDefinitions) {
        if (this.queryDefinitions == null) {
            setQueryDefinitions(new com.amazonaws.internal.SdkInternalList<QueryDefinition>(queryDefinitions.length));
        }
        for (QueryDefinition ele : queryDefinitions) {
            this.queryDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of query definitions that match your request.
     * </p>
     * 
     * @param queryDefinitions
     *        The list of query definitions that match your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQueryDefinitionsResult withQueryDefinitions(java.util.Collection<QueryDefinition> queryDefinitions) {
        setQueryDefinitions(queryDefinitions);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQueryDefinitionsResult withNextToken(String nextToken) {
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
        if (getQueryDefinitions() != null)
            sb.append("QueryDefinitions: ").append(getQueryDefinitions()).append(",");
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

        if (obj instanceof DescribeQueryDefinitionsResult == false)
            return false;
        DescribeQueryDefinitionsResult other = (DescribeQueryDefinitionsResult) obj;
        if (other.getQueryDefinitions() == null ^ this.getQueryDefinitions() == null)
            return false;
        if (other.getQueryDefinitions() != null && other.getQueryDefinitions().equals(this.getQueryDefinitions()) == false)
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

        hashCode = prime * hashCode + ((getQueryDefinitions() == null) ? 0 : getQueryDefinitions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeQueryDefinitionsResult clone() {
        try {
            return (DescribeQueryDefinitionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
