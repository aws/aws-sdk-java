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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetCrawlers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetCrawlersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of crawler definitions.
     * </p>
     */
    private java.util.List<Crawler> crawlers;
    /**
     * <p>
     * A list of names of crawlers not found.
     * </p>
     */
    private java.util.List<String> crawlersNotFound;

    /**
     * <p>
     * A list of crawler definitions.
     * </p>
     * 
     * @return A list of crawler definitions.
     */

    public java.util.List<Crawler> getCrawlers() {
        return crawlers;
    }

    /**
     * <p>
     * A list of crawler definitions.
     * </p>
     * 
     * @param crawlers
     *        A list of crawler definitions.
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
     * A list of crawler definitions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCrawlers(java.util.Collection)} or {@link #withCrawlers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param crawlers
     *        A list of crawler definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCrawlersResult withCrawlers(Crawler... crawlers) {
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
     * A list of crawler definitions.
     * </p>
     * 
     * @param crawlers
     *        A list of crawler definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCrawlersResult withCrawlers(java.util.Collection<Crawler> crawlers) {
        setCrawlers(crawlers);
        return this;
    }

    /**
     * <p>
     * A list of names of crawlers not found.
     * </p>
     * 
     * @return A list of names of crawlers not found.
     */

    public java.util.List<String> getCrawlersNotFound() {
        return crawlersNotFound;
    }

    /**
     * <p>
     * A list of names of crawlers not found.
     * </p>
     * 
     * @param crawlersNotFound
     *        A list of names of crawlers not found.
     */

    public void setCrawlersNotFound(java.util.Collection<String> crawlersNotFound) {
        if (crawlersNotFound == null) {
            this.crawlersNotFound = null;
            return;
        }

        this.crawlersNotFound = new java.util.ArrayList<String>(crawlersNotFound);
    }

    /**
     * <p>
     * A list of names of crawlers not found.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCrawlersNotFound(java.util.Collection)} or {@link #withCrawlersNotFound(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param crawlersNotFound
     *        A list of names of crawlers not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCrawlersResult withCrawlersNotFound(String... crawlersNotFound) {
        if (this.crawlersNotFound == null) {
            setCrawlersNotFound(new java.util.ArrayList<String>(crawlersNotFound.length));
        }
        for (String ele : crawlersNotFound) {
            this.crawlersNotFound.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of crawlers not found.
     * </p>
     * 
     * @param crawlersNotFound
     *        A list of names of crawlers not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCrawlersResult withCrawlersNotFound(java.util.Collection<String> crawlersNotFound) {
        setCrawlersNotFound(crawlersNotFound);
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
        if (getCrawlersNotFound() != null)
            sb.append("CrawlersNotFound: ").append(getCrawlersNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetCrawlersResult == false)
            return false;
        BatchGetCrawlersResult other = (BatchGetCrawlersResult) obj;
        if (other.getCrawlers() == null ^ this.getCrawlers() == null)
            return false;
        if (other.getCrawlers() != null && other.getCrawlers().equals(this.getCrawlers()) == false)
            return false;
        if (other.getCrawlersNotFound() == null ^ this.getCrawlersNotFound() == null)
            return false;
        if (other.getCrawlersNotFound() != null && other.getCrawlersNotFound().equals(this.getCrawlersNotFound()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawlers() == null) ? 0 : getCrawlers().hashCode());
        hashCode = prime * hashCode + ((getCrawlersNotFound() == null) ? 0 : getCrawlersNotFound().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetCrawlersResult clone() {
        try {
            return (BatchGetCrawlersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
