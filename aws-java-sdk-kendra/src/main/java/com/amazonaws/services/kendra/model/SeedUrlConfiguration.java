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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information of the seed or starting point URLs to crawl.
 * </p>
 * <p>
 * <i>When selecting websites to index, you must adhere to the <a href="https://aws.amazon.com/aup/">Amazon Acceptable
 * Use Policy</a> and all other Amazon terms. Remember that you must only use the Amazon Kendra web crawler to index
 * your own webpages, or webpages that you have authorization to index.</i>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SeedUrlConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SeedUrlConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of seed or starting point URLs of the websites you want to crawl.
     * </p>
     * <p>
     * The list can include a maximum of 100 seed URLs.
     * </p>
     */
    private java.util.List<String> seedUrls;
    /**
     * <p>
     * You can choose one of the following modes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST_ONLY</code> – crawl only the website host names. For example, if the seed URL is "abc.example.com",
     * then only URLs with host name "abc.example.com" are crawled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBDOMAINS</code> – crawl the website host names with subdomains. For example, if the seed URL is
     * "abc.example.com", then "a.abc.example.com" and "b.abc.example.com" are also crawled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EVERYTHING</code> – crawl the website host names with subdomains and other domains that the webpages link
     * to.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default mode is set to <code>HOST_ONLY</code>.
     * </p>
     */
    private String webCrawlerMode;

    /**
     * <p>
     * The list of seed or starting point URLs of the websites you want to crawl.
     * </p>
     * <p>
     * The list can include a maximum of 100 seed URLs.
     * </p>
     * 
     * @return The list of seed or starting point URLs of the websites you want to crawl.</p>
     *         <p>
     *         The list can include a maximum of 100 seed URLs.
     */

    public java.util.List<String> getSeedUrls() {
        return seedUrls;
    }

    /**
     * <p>
     * The list of seed or starting point URLs of the websites you want to crawl.
     * </p>
     * <p>
     * The list can include a maximum of 100 seed URLs.
     * </p>
     * 
     * @param seedUrls
     *        The list of seed or starting point URLs of the websites you want to crawl.</p>
     *        <p>
     *        The list can include a maximum of 100 seed URLs.
     */

    public void setSeedUrls(java.util.Collection<String> seedUrls) {
        if (seedUrls == null) {
            this.seedUrls = null;
            return;
        }

        this.seedUrls = new java.util.ArrayList<String>(seedUrls);
    }

    /**
     * <p>
     * The list of seed or starting point URLs of the websites you want to crawl.
     * </p>
     * <p>
     * The list can include a maximum of 100 seed URLs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSeedUrls(java.util.Collection)} or {@link #withSeedUrls(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param seedUrls
     *        The list of seed or starting point URLs of the websites you want to crawl.</p>
     *        <p>
     *        The list can include a maximum of 100 seed URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeedUrlConfiguration withSeedUrls(String... seedUrls) {
        if (this.seedUrls == null) {
            setSeedUrls(new java.util.ArrayList<String>(seedUrls.length));
        }
        for (String ele : seedUrls) {
            this.seedUrls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of seed or starting point URLs of the websites you want to crawl.
     * </p>
     * <p>
     * The list can include a maximum of 100 seed URLs.
     * </p>
     * 
     * @param seedUrls
     *        The list of seed or starting point URLs of the websites you want to crawl.</p>
     *        <p>
     *        The list can include a maximum of 100 seed URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SeedUrlConfiguration withSeedUrls(java.util.Collection<String> seedUrls) {
        setSeedUrls(seedUrls);
        return this;
    }

    /**
     * <p>
     * You can choose one of the following modes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST_ONLY</code> – crawl only the website host names. For example, if the seed URL is "abc.example.com",
     * then only URLs with host name "abc.example.com" are crawled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBDOMAINS</code> – crawl the website host names with subdomains. For example, if the seed URL is
     * "abc.example.com", then "a.abc.example.com" and "b.abc.example.com" are also crawled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EVERYTHING</code> – crawl the website host names with subdomains and other domains that the webpages link
     * to.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default mode is set to <code>HOST_ONLY</code>.
     * </p>
     * 
     * @param webCrawlerMode
     *        You can choose one of the following modes:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HOST_ONLY</code> – crawl only the website host names. For example, if the seed URL is
     *        "abc.example.com", then only URLs with host name "abc.example.com" are crawled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBDOMAINS</code> – crawl the website host names with subdomains. For example, if the seed URL is
     *        "abc.example.com", then "a.abc.example.com" and "b.abc.example.com" are also crawled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EVERYTHING</code> – crawl the website host names with subdomains and other domains that the webpages
     *        link to.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default mode is set to <code>HOST_ONLY</code>.
     * @see WebCrawlerMode
     */

    public void setWebCrawlerMode(String webCrawlerMode) {
        this.webCrawlerMode = webCrawlerMode;
    }

    /**
     * <p>
     * You can choose one of the following modes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST_ONLY</code> – crawl only the website host names. For example, if the seed URL is "abc.example.com",
     * then only URLs with host name "abc.example.com" are crawled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBDOMAINS</code> – crawl the website host names with subdomains. For example, if the seed URL is
     * "abc.example.com", then "a.abc.example.com" and "b.abc.example.com" are also crawled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EVERYTHING</code> – crawl the website host names with subdomains and other domains that the webpages link
     * to.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default mode is set to <code>HOST_ONLY</code>.
     * </p>
     * 
     * @return You can choose one of the following modes:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HOST_ONLY</code> – crawl only the website host names. For example, if the seed URL is
     *         "abc.example.com", then only URLs with host name "abc.example.com" are crawled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUBDOMAINS</code> – crawl the website host names with subdomains. For example, if the seed URL is
     *         "abc.example.com", then "a.abc.example.com" and "b.abc.example.com" are also crawled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EVERYTHING</code> – crawl the website host names with subdomains and other domains that the
     *         webpages link to.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default mode is set to <code>HOST_ONLY</code>.
     * @see WebCrawlerMode
     */

    public String getWebCrawlerMode() {
        return this.webCrawlerMode;
    }

    /**
     * <p>
     * You can choose one of the following modes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST_ONLY</code> – crawl only the website host names. For example, if the seed URL is "abc.example.com",
     * then only URLs with host name "abc.example.com" are crawled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBDOMAINS</code> – crawl the website host names with subdomains. For example, if the seed URL is
     * "abc.example.com", then "a.abc.example.com" and "b.abc.example.com" are also crawled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EVERYTHING</code> – crawl the website host names with subdomains and other domains that the webpages link
     * to.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default mode is set to <code>HOST_ONLY</code>.
     * </p>
     * 
     * @param webCrawlerMode
     *        You can choose one of the following modes:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HOST_ONLY</code> – crawl only the website host names. For example, if the seed URL is
     *        "abc.example.com", then only URLs with host name "abc.example.com" are crawled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBDOMAINS</code> – crawl the website host names with subdomains. For example, if the seed URL is
     *        "abc.example.com", then "a.abc.example.com" and "b.abc.example.com" are also crawled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EVERYTHING</code> – crawl the website host names with subdomains and other domains that the webpages
     *        link to.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default mode is set to <code>HOST_ONLY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebCrawlerMode
     */

    public SeedUrlConfiguration withWebCrawlerMode(String webCrawlerMode) {
        setWebCrawlerMode(webCrawlerMode);
        return this;
    }

    /**
     * <p>
     * You can choose one of the following modes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HOST_ONLY</code> – crawl only the website host names. For example, if the seed URL is "abc.example.com",
     * then only URLs with host name "abc.example.com" are crawled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBDOMAINS</code> – crawl the website host names with subdomains. For example, if the seed URL is
     * "abc.example.com", then "a.abc.example.com" and "b.abc.example.com" are also crawled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EVERYTHING</code> – crawl the website host names with subdomains and other domains that the webpages link
     * to.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default mode is set to <code>HOST_ONLY</code>.
     * </p>
     * 
     * @param webCrawlerMode
     *        You can choose one of the following modes:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HOST_ONLY</code> – crawl only the website host names. For example, if the seed URL is
     *        "abc.example.com", then only URLs with host name "abc.example.com" are crawled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBDOMAINS</code> – crawl the website host names with subdomains. For example, if the seed URL is
     *        "abc.example.com", then "a.abc.example.com" and "b.abc.example.com" are also crawled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EVERYTHING</code> – crawl the website host names with subdomains and other domains that the webpages
     *        link to.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default mode is set to <code>HOST_ONLY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebCrawlerMode
     */

    public SeedUrlConfiguration withWebCrawlerMode(WebCrawlerMode webCrawlerMode) {
        this.webCrawlerMode = webCrawlerMode.toString();
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
        if (getSeedUrls() != null)
            sb.append("SeedUrls: ").append(getSeedUrls()).append(",");
        if (getWebCrawlerMode() != null)
            sb.append("WebCrawlerMode: ").append(getWebCrawlerMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SeedUrlConfiguration == false)
            return false;
        SeedUrlConfiguration other = (SeedUrlConfiguration) obj;
        if (other.getSeedUrls() == null ^ this.getSeedUrls() == null)
            return false;
        if (other.getSeedUrls() != null && other.getSeedUrls().equals(this.getSeedUrls()) == false)
            return false;
        if (other.getWebCrawlerMode() == null ^ this.getWebCrawlerMode() == null)
            return false;
        if (other.getWebCrawlerMode() != null && other.getWebCrawlerMode().equals(this.getWebCrawlerMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSeedUrls() == null) ? 0 : getSeedUrls().hashCode());
        hashCode = prime * hashCode + ((getWebCrawlerMode() == null) ? 0 : getWebCrawlerMode().hashCode());
        return hashCode;
    }

    @Override
    public SeedUrlConfiguration clone() {
        try {
            return (SeedUrlConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SeedUrlConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
