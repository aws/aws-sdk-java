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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListCrawlers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCrawlersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The names of all crawlers in the account, or the crawlers with the specified tags.
     * </p>
     */
    private java.util.List<String> crawlerNames;
    /**
     * <p>
     * A continuation token, if the returned list does not contain the last metric available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of all crawlers in the account, or the crawlers with the specified tags.
     * </p>
     * 
     * @return The names of all crawlers in the account, or the crawlers with the specified tags.
     */

    public java.util.List<String> getCrawlerNames() {
        return crawlerNames;
    }

    /**
     * <p>
     * The names of all crawlers in the account, or the crawlers with the specified tags.
     * </p>
     * 
     * @param crawlerNames
     *        The names of all crawlers in the account, or the crawlers with the specified tags.
     */

    public void setCrawlerNames(java.util.Collection<String> crawlerNames) {
        if (crawlerNames == null) {
            this.crawlerNames = null;
            return;
        }

        this.crawlerNames = new java.util.ArrayList<String>(crawlerNames);
    }

    /**
     * <p>
     * The names of all crawlers in the account, or the crawlers with the specified tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCrawlerNames(java.util.Collection)} or {@link #withCrawlerNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param crawlerNames
     *        The names of all crawlers in the account, or the crawlers with the specified tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrawlersResult withCrawlerNames(String... crawlerNames) {
        if (this.crawlerNames == null) {
            setCrawlerNames(new java.util.ArrayList<String>(crawlerNames.length));
        }
        for (String ele : crawlerNames) {
            this.crawlerNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of all crawlers in the account, or the crawlers with the specified tags.
     * </p>
     * 
     * @param crawlerNames
     *        The names of all crawlers in the account, or the crawlers with the specified tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrawlersResult withCrawlerNames(java.util.Collection<String> crawlerNames) {
        setCrawlerNames(crawlerNames);
        return this;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last metric available.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if the returned list does not contain the last metric available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last metric available.
     * </p>
     * 
     * @return A continuation token, if the returned list does not contain the last metric available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last metric available.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if the returned list does not contain the last metric available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrawlersResult withNextToken(String nextToken) {
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
        if (getCrawlerNames() != null)
            sb.append("CrawlerNames: ").append(getCrawlerNames()).append(",");
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

        if (obj instanceof ListCrawlersResult == false)
            return false;
        ListCrawlersResult other = (ListCrawlersResult) obj;
        if (other.getCrawlerNames() == null ^ this.getCrawlerNames() == null)
            return false;
        if (other.getCrawlerNames() != null && other.getCrawlerNames().equals(this.getCrawlerNames()) == false)
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

        hashCode = prime * hashCode + ((getCrawlerNames() == null) ? 0 : getCrawlerNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCrawlersResult clone() {
        try {
            return (ListCrawlersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
