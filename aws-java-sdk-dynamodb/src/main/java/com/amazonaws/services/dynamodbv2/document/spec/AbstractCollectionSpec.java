/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.document.spec;

import com.amazonaws.AmazonWebServiceRequest;


/**
 * Abstract implementation class for parameter specification that involves
 * collection of results.
 *
 * @param <T> request type
 */
abstract class AbstractCollectionSpec<T extends AmazonWebServiceRequest>
        extends AbstractSpec<T> {

    private Integer maxPageSize;
    /**
     * The maximum number of resources to be retrieved; or null if there is no
     * limit.
     */
    private Integer maxResultSize;

    
    AbstractCollectionSpec(T req) {
        super(req);
    }

    public AbstractCollectionSpec<T> withMaxResultSize(
            Integer maxResultSize) {
        this.maxResultSize = maxResultSize;
        return this;
    }

    public AbstractCollectionSpec<T> withMaxResultSize(
            int maxResultSize) {
        this.maxResultSize = maxResultSize;
        return this;
    }

    public AbstractCollectionSpec<T> withMaxPageSize(Integer maxPageSize) {
        this.maxPageSize = maxPageSize;
        return this;
    }

    public AbstractCollectionSpec<T> withMaxPageSize(int maxPageSize) {
        this.maxPageSize = maxPageSize;
        return this;
    }

    /**
     * The maximum number of resources to be retrieved in this query, including
     * all the resources in all pages to be retrieved. 
     */
    public Integer getMaxResultSize() {
        return maxResultSize;
    }

    public void setMaxResultSize(Integer maxResultSize) {
        this.maxResultSize = maxResultSize;
    }

    public void setMaxResultSize(int maxResultSize) {
        this.maxResultSize = maxResultSize;
    }

    /**
     * The maximum number of resources to be retrieved in a single page; used
     * for pagination purposes.
     */
    public Integer getMaxPageSize() {
        return maxPageSize;
    }

    public void setMaxPageSize(Integer value) {
        maxPageSize = value;
    }
}
