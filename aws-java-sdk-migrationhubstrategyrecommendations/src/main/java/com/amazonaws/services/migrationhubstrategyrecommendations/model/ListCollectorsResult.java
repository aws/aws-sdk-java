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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListCollectors"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCollectorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of all the installed collectors.
     * </p>
     */
    private java.util.List<Collector> collectors;
    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of all the installed collectors.
     * </p>
     * 
     * @return The list of all the installed collectors.
     */

    public java.util.List<Collector> getCollectors() {
        return collectors;
    }

    /**
     * <p>
     * The list of all the installed collectors.
     * </p>
     * 
     * @param collectors
     *        The list of all the installed collectors.
     */

    public void setCollectors(java.util.Collection<Collector> collectors) {
        if (collectors == null) {
            this.collectors = null;
            return;
        }

        this.collectors = new java.util.ArrayList<Collector>(collectors);
    }

    /**
     * <p>
     * The list of all the installed collectors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCollectors(java.util.Collection)} or {@link #withCollectors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param collectors
     *        The list of all the installed collectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollectorsResult withCollectors(Collector... collectors) {
        if (this.collectors == null) {
            setCollectors(new java.util.ArrayList<Collector>(collectors.length));
        }
        for (Collector ele : collectors) {
            this.collectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of all the installed collectors.
     * </p>
     * 
     * @param collectors
     *        The list of all the installed collectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollectorsResult withCollectors(java.util.Collection<Collector> collectors) {
        setCollectors(collectors);
        return this;
    }

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token you use to retrieve the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token you use to retrieve the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token you use to retrieve the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollectorsResult withNextToken(String nextToken) {
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
        if (getCollectors() != null)
            sb.append("Collectors: ").append(getCollectors()).append(",");
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

        if (obj instanceof ListCollectorsResult == false)
            return false;
        ListCollectorsResult other = (ListCollectorsResult) obj;
        if (other.getCollectors() == null ^ this.getCollectors() == null)
            return false;
        if (other.getCollectors() != null && other.getCollectors().equals(this.getCollectors()) == false)
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

        hashCode = prime * hashCode + ((getCollectors() == null) ? 0 : getCollectors().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCollectorsResult clone() {
        try {
            return (ListCollectorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
