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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCrawlers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCrawlersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of crawler metadata.
     * </p>
     */
    private java.util.List<Crawler> crawlers;
    /**
     * <p>
     * A continuation token, if the returned list has not reached the end of those defined in this customer account.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of crawler metadata.
     * </p>
     * 
     * @return A list of crawler metadata.
     */

    public java.util.List<Crawler> getCrawlers() {
        return crawlers;
    }

    /**
     * <p>
     * A list of crawler metadata.
     * </p>
     * 
     * @param crawlers
     *        A list of crawler metadata.
     */

    public void setCrawlers(java.util.Collection<Crawler> crawlers) {
        if (crawlers == null) {
            this.crawlers = null;
            return;
        }

        this.crawlers = new java.util.ArrayList<Crawler>(crawlers);
    }

    /**
     * <p>
     * A list of crawler metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCrawlers(java.util.Collection)} or {@link #withCrawlers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param crawlers
     *        A list of crawler metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCrawlersResult withCrawlers(Crawler... crawlers) {
        if (this.crawlers == null) {
            setCrawlers(new java.util.ArrayList<Crawler>(crawlers.length));
        }
        for (Crawler ele : crawlers) {
            this.crawlers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of crawler metadata.
     * </p>
     * 
     * @param crawlers
     *        A list of crawler metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCrawlersResult withCrawlers(java.util.Collection<Crawler> crawlers) {
        setCrawlers(crawlers);
        return this;
    }

    /**
     * <p>
     * A continuation token, if the returned list has not reached the end of those defined in this customer account.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if the returned list has not reached the end of those defined in this customer
     *        account.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list has not reached the end of those defined in this customer account.
     * </p>
     * 
     * @return A continuation token, if the returned list has not reached the end of those defined in this customer
     *         account.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list has not reached the end of those defined in this customer account.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if the returned list has not reached the end of those defined in this customer
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCrawlersResult withNextToken(String nextToken) {
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
        if (getCrawlers() != null)
            sb.append("Crawlers: ").append(getCrawlers()).append(",");
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

        if (obj instanceof GetCrawlersResult == false)
            return false;
        GetCrawlersResult other = (GetCrawlersResult) obj;
        if (other.getCrawlers() == null ^ this.getCrawlers() == null)
            return false;
        if (other.getCrawlers() != null && other.getCrawlers().equals(this.getCrawlers()) == false)
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

        hashCode = prime * hashCode + ((getCrawlers() == null) ? 0 : getCrawlers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetCrawlersResult clone() {
        try {
            return (GetCrawlersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
