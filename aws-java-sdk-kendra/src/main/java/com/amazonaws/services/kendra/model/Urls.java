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
 * Provides the configuration information of the URLs to crawl.
 * </p>
 * <p>
 * <i>When selecting websites to index, you must adhere to the <a href="https://aws.amazon.com/aup/">Amazon Acceptable
 * Use Policy</a> and all other Amazon terms. Remember that you must only use the Amazon Kendra web crawler to index
 * your own webpages, or webpages that you have authorization to index.</i>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Urls" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Urls implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides the configuration of the seed or starting point URLs of the websites you want to crawl.
     * </p>
     * <p>
     * You can choose to crawl only the website host names, or the website host names with subdomains, or the website
     * host names with subdomains and other domains that the webpages link to.
     * </p>
     * <p>
     * You can list up to 100 seed URLs.
     * </p>
     */
    private SeedUrlConfiguration seedUrlConfiguration;
    /**
     * <p>
     * Provides the configuration of the sitemap URLs of the websites you want to crawl.
     * </p>
     * <p>
     * Only URLs belonging to the same website host names are crawled. You can list up to three sitemap URLs.
     * </p>
     */
    private SiteMapsConfiguration siteMapsConfiguration;

    /**
     * <p>
     * Provides the configuration of the seed or starting point URLs of the websites you want to crawl.
     * </p>
     * <p>
     * You can choose to crawl only the website host names, or the website host names with subdomains, or the website
     * host names with subdomains and other domains that the webpages link to.
     * </p>
     * <p>
     * You can list up to 100 seed URLs.
     * </p>
     * 
     * @param seedUrlConfiguration
     *        Provides the configuration of the seed or starting point URLs of the websites you want to crawl.</p>
     *        <p>
     *        You can choose to crawl only the website host names, or the website host names with subdomains, or the
     *        website host names with subdomains and other domains that the webpages link to.
     *        </p>
     *        <p>
     *        You can list up to 100 seed URLs.
     */

    public void setSeedUrlConfiguration(SeedUrlConfiguration seedUrlConfiguration) {
        this.seedUrlConfiguration = seedUrlConfiguration;
    }

    /**
     * <p>
     * Provides the configuration of the seed or starting point URLs of the websites you want to crawl.
     * </p>
     * <p>
     * You can choose to crawl only the website host names, or the website host names with subdomains, or the website
     * host names with subdomains and other domains that the webpages link to.
     * </p>
     * <p>
     * You can list up to 100 seed URLs.
     * </p>
     * 
     * @return Provides the configuration of the seed or starting point URLs of the websites you want to crawl.</p>
     *         <p>
     *         You can choose to crawl only the website host names, or the website host names with subdomains, or the
     *         website host names with subdomains and other domains that the webpages link to.
     *         </p>
     *         <p>
     *         You can list up to 100 seed URLs.
     */

    public SeedUrlConfiguration getSeedUrlConfiguration() {
        return this.seedUrlConfiguration;
    }

    /**
     * <p>
     * Provides the configuration of the seed or starting point URLs of the websites you want to crawl.
     * </p>
     * <p>
     * You can choose to crawl only the website host names, or the website host names with subdomains, or the website
     * host names with subdomains and other domains that the webpages link to.
     * </p>
     * <p>
     * You can list up to 100 seed URLs.
     * </p>
     * 
     * @param seedUrlConfiguration
     *        Provides the configuration of the seed or starting point URLs of the websites you want to crawl.</p>
     *        <p>
     *        You can choose to crawl only the website host names, or the website host names with subdomains, or the
     *        website host names with subdomains and other domains that the webpages link to.
     *        </p>
     *        <p>
     *        You can list up to 100 seed URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Urls withSeedUrlConfiguration(SeedUrlConfiguration seedUrlConfiguration) {
        setSeedUrlConfiguration(seedUrlConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides the configuration of the sitemap URLs of the websites you want to crawl.
     * </p>
     * <p>
     * Only URLs belonging to the same website host names are crawled. You can list up to three sitemap URLs.
     * </p>
     * 
     * @param siteMapsConfiguration
     *        Provides the configuration of the sitemap URLs of the websites you want to crawl.</p>
     *        <p>
     *        Only URLs belonging to the same website host names are crawled. You can list up to three sitemap URLs.
     */

    public void setSiteMapsConfiguration(SiteMapsConfiguration siteMapsConfiguration) {
        this.siteMapsConfiguration = siteMapsConfiguration;
    }

    /**
     * <p>
     * Provides the configuration of the sitemap URLs of the websites you want to crawl.
     * </p>
     * <p>
     * Only URLs belonging to the same website host names are crawled. You can list up to three sitemap URLs.
     * </p>
     * 
     * @return Provides the configuration of the sitemap URLs of the websites you want to crawl.</p>
     *         <p>
     *         Only URLs belonging to the same website host names are crawled. You can list up to three sitemap URLs.
     */

    public SiteMapsConfiguration getSiteMapsConfiguration() {
        return this.siteMapsConfiguration;
    }

    /**
     * <p>
     * Provides the configuration of the sitemap URLs of the websites you want to crawl.
     * </p>
     * <p>
     * Only URLs belonging to the same website host names are crawled. You can list up to three sitemap URLs.
     * </p>
     * 
     * @param siteMapsConfiguration
     *        Provides the configuration of the sitemap URLs of the websites you want to crawl.</p>
     *        <p>
     *        Only URLs belonging to the same website host names are crawled. You can list up to three sitemap URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Urls withSiteMapsConfiguration(SiteMapsConfiguration siteMapsConfiguration) {
        setSiteMapsConfiguration(siteMapsConfiguration);
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
        if (getSeedUrlConfiguration() != null)
            sb.append("SeedUrlConfiguration: ").append(getSeedUrlConfiguration()).append(",");
        if (getSiteMapsConfiguration() != null)
            sb.append("SiteMapsConfiguration: ").append(getSiteMapsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Urls == false)
            return false;
        Urls other = (Urls) obj;
        if (other.getSeedUrlConfiguration() == null ^ this.getSeedUrlConfiguration() == null)
            return false;
        if (other.getSeedUrlConfiguration() != null && other.getSeedUrlConfiguration().equals(this.getSeedUrlConfiguration()) == false)
            return false;
        if (other.getSiteMapsConfiguration() == null ^ this.getSiteMapsConfiguration() == null)
            return false;
        if (other.getSiteMapsConfiguration() != null && other.getSiteMapsConfiguration().equals(this.getSiteMapsConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSeedUrlConfiguration() == null) ? 0 : getSeedUrlConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSiteMapsConfiguration() == null) ? 0 : getSiteMapsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public Urls clone() {
        try {
            return (Urls) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.UrlsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
