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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for the parameters for response received from <code> <a>ListElasticsearchVersions</a> </code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListElasticsearchVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<String> elasticsearchVersions;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<String> getElasticsearchVersions() {
        return elasticsearchVersions;
    }

    /**
     * @param elasticsearchVersions
     */

    public void setElasticsearchVersions(java.util.Collection<String> elasticsearchVersions) {
        if (elasticsearchVersions == null) {
            this.elasticsearchVersions = null;
            return;
        }

        this.elasticsearchVersions = new java.util.ArrayList<String>(elasticsearchVersions);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElasticsearchVersions(java.util.Collection)} or
     * {@link #withElasticsearchVersions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param elasticsearchVersions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListElasticsearchVersionsResult withElasticsearchVersions(String... elasticsearchVersions) {
        if (this.elasticsearchVersions == null) {
            setElasticsearchVersions(new java.util.ArrayList<String>(elasticsearchVersions.length));
        }
        for (String ele : elasticsearchVersions) {
            this.elasticsearchVersions.add(ele);
        }
        return this;
    }

    /**
     * @param elasticsearchVersions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListElasticsearchVersionsResult withElasticsearchVersions(java.util.Collection<String> elasticsearchVersions) {
        setElasticsearchVersions(elasticsearchVersions);
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

    public ListElasticsearchVersionsResult withNextToken(String nextToken) {
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
        if (getElasticsearchVersions() != null)
            sb.append("ElasticsearchVersions: ").append(getElasticsearchVersions()).append(",");
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

        if (obj instanceof ListElasticsearchVersionsResult == false)
            return false;
        ListElasticsearchVersionsResult other = (ListElasticsearchVersionsResult) obj;
        if (other.getElasticsearchVersions() == null ^ this.getElasticsearchVersions() == null)
            return false;
        if (other.getElasticsearchVersions() != null && other.getElasticsearchVersions().equals(this.getElasticsearchVersions()) == false)
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

        hashCode = prime * hashCode + ((getElasticsearchVersions() == null) ? 0 : getElasticsearchVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListElasticsearchVersionsResult clone() {
        try {
            return (ListElasticsearchVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
