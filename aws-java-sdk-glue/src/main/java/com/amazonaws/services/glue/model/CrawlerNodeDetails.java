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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a Crawler node present in the workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CrawlerNodeDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrawlerNodeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of crawls represented by the crawl node.
     * </p>
     */
    private java.util.List<Crawl> crawls;

    /**
     * <p>
     * A list of crawls represented by the crawl node.
     * </p>
     * 
     * @return A list of crawls represented by the crawl node.
     */

    public java.util.List<Crawl> getCrawls() {
        return crawls;
    }

    /**
     * <p>
     * A list of crawls represented by the crawl node.
     * </p>
     * 
     * @param crawls
     *        A list of crawls represented by the crawl node.
     */

    public void setCrawls(java.util.Collection<Crawl> crawls) {
        if (crawls == null) {
            this.crawls = null;
            return;
        }

        this.crawls = new java.util.ArrayList<Crawl>(crawls);
    }

    /**
     * <p>
     * A list of crawls represented by the crawl node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCrawls(java.util.Collection)} or {@link #withCrawls(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param crawls
     *        A list of crawls represented by the crawl node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerNodeDetails withCrawls(Crawl... crawls) {
        if (this.crawls == null) {
            setCrawls(new java.util.ArrayList<Crawl>(crawls.length));
        }
        for (Crawl ele : crawls) {
            this.crawls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of crawls represented by the crawl node.
     * </p>
     * 
     * @param crawls
     *        A list of crawls represented by the crawl node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlerNodeDetails withCrawls(java.util.Collection<Crawl> crawls) {
        setCrawls(crawls);
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
        if (getCrawls() != null)
            sb.append("Crawls: ").append(getCrawls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrawlerNodeDetails == false)
            return false;
        CrawlerNodeDetails other = (CrawlerNodeDetails) obj;
        if (other.getCrawls() == null ^ this.getCrawls() == null)
            return false;
        if (other.getCrawls() != null && other.getCrawls().equals(this.getCrawls()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawls() == null) ? 0 : getCrawls().hashCode());
        return hashCode;
    }

    @Override
    public CrawlerNodeDetails clone() {
        try {
            return (CrawlerNodeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CrawlerNodeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
