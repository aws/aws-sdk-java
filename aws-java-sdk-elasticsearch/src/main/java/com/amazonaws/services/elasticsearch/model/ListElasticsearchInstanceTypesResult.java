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
 * Container for the parameters returned by <code> <a>ListElasticsearchInstanceTypes</a> </code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListElasticsearchInstanceTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * List of instance types supported by Amazon Elasticsearch service for given
     * <code> <a>ElasticsearchVersion</a> </code>
     * </p>
     */
    private java.util.List<String> elasticsearchInstanceTypes;
    /**
     * <p>
     * In case if there are more results available NextToken would be present, make further request to the same API with
     * received NextToken to paginate remaining results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of instance types supported by Amazon Elasticsearch service for given
     * <code> <a>ElasticsearchVersion</a> </code>
     * </p>
     * 
     * @return List of instance types supported by Amazon Elasticsearch service for given
     *         <code> <a>ElasticsearchVersion</a> </code>
     * @see ESPartitionInstanceType
     */

    public java.util.List<String> getElasticsearchInstanceTypes() {
        return elasticsearchInstanceTypes;
    }

    /**
     * <p>
     * List of instance types supported by Amazon Elasticsearch service for given
     * <code> <a>ElasticsearchVersion</a> </code>
     * </p>
     * 
     * @param elasticsearchInstanceTypes
     *        List of instance types supported by Amazon Elasticsearch service for given
     *        <code> <a>ElasticsearchVersion</a> </code>
     * @see ESPartitionInstanceType
     */

    public void setElasticsearchInstanceTypes(java.util.Collection<String> elasticsearchInstanceTypes) {
        if (elasticsearchInstanceTypes == null) {
            this.elasticsearchInstanceTypes = null;
            return;
        }

        this.elasticsearchInstanceTypes = new java.util.ArrayList<String>(elasticsearchInstanceTypes);
    }

    /**
     * <p>
     * List of instance types supported by Amazon Elasticsearch service for given
     * <code> <a>ElasticsearchVersion</a> </code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElasticsearchInstanceTypes(java.util.Collection)} or
     * {@link #withElasticsearchInstanceTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param elasticsearchInstanceTypes
     *        List of instance types supported by Amazon Elasticsearch service for given
     *        <code> <a>ElasticsearchVersion</a> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ESPartitionInstanceType
     */

    public ListElasticsearchInstanceTypesResult withElasticsearchInstanceTypes(String... elasticsearchInstanceTypes) {
        if (this.elasticsearchInstanceTypes == null) {
            setElasticsearchInstanceTypes(new java.util.ArrayList<String>(elasticsearchInstanceTypes.length));
        }
        for (String ele : elasticsearchInstanceTypes) {
            this.elasticsearchInstanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of instance types supported by Amazon Elasticsearch service for given
     * <code> <a>ElasticsearchVersion</a> </code>
     * </p>
     * 
     * @param elasticsearchInstanceTypes
     *        List of instance types supported by Amazon Elasticsearch service for given
     *        <code> <a>ElasticsearchVersion</a> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ESPartitionInstanceType
     */

    public ListElasticsearchInstanceTypesResult withElasticsearchInstanceTypes(java.util.Collection<String> elasticsearchInstanceTypes) {
        setElasticsearchInstanceTypes(elasticsearchInstanceTypes);
        return this;
    }

    /**
     * <p>
     * List of instance types supported by Amazon Elasticsearch service for given
     * <code> <a>ElasticsearchVersion</a> </code>
     * </p>
     * 
     * @param elasticsearchInstanceTypes
     *        List of instance types supported by Amazon Elasticsearch service for given
     *        <code> <a>ElasticsearchVersion</a> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ESPartitionInstanceType
     */

    public ListElasticsearchInstanceTypesResult withElasticsearchInstanceTypes(ESPartitionInstanceType... elasticsearchInstanceTypes) {
        java.util.ArrayList<String> elasticsearchInstanceTypesCopy = new java.util.ArrayList<String>(elasticsearchInstanceTypes.length);
        for (ESPartitionInstanceType value : elasticsearchInstanceTypes) {
            elasticsearchInstanceTypesCopy.add(value.toString());
        }
        if (getElasticsearchInstanceTypes() == null) {
            setElasticsearchInstanceTypes(elasticsearchInstanceTypesCopy);
        } else {
            getElasticsearchInstanceTypes().addAll(elasticsearchInstanceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * In case if there are more results available NextToken would be present, make further request to the same API with
     * received NextToken to paginate remaining results.
     * </p>
     * 
     * @param nextToken
     *        In case if there are more results available NextToken would be present, make further request to the same
     *        API with received NextToken to paginate remaining results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * In case if there are more results available NextToken would be present, make further request to the same API with
     * received NextToken to paginate remaining results.
     * </p>
     * 
     * @return In case if there are more results available NextToken would be present, make further request to the same
     *         API with received NextToken to paginate remaining results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * In case if there are more results available NextToken would be present, make further request to the same API with
     * received NextToken to paginate remaining results.
     * </p>
     * 
     * @param nextToken
     *        In case if there are more results available NextToken would be present, make further request to the same
     *        API with received NextToken to paginate remaining results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListElasticsearchInstanceTypesResult withNextToken(String nextToken) {
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
        if (getElasticsearchInstanceTypes() != null)
            sb.append("ElasticsearchInstanceTypes: ").append(getElasticsearchInstanceTypes()).append(",");
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

        if (obj instanceof ListElasticsearchInstanceTypesResult == false)
            return false;
        ListElasticsearchInstanceTypesResult other = (ListElasticsearchInstanceTypesResult) obj;
        if (other.getElasticsearchInstanceTypes() == null ^ this.getElasticsearchInstanceTypes() == null)
            return false;
        if (other.getElasticsearchInstanceTypes() != null && other.getElasticsearchInstanceTypes().equals(this.getElasticsearchInstanceTypes()) == false)
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

        hashCode = prime * hashCode + ((getElasticsearchInstanceTypes() == null) ? 0 : getElasticsearchInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListElasticsearchInstanceTypesResult clone() {
        try {
            return (ListElasticsearchInstanceTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
