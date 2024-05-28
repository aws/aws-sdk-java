/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>CreateScraper</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateScraper" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateScraperRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (optional) a name to associate with the scraper. This is for your use, and does not need to be unique.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * (Optional) A unique, case-sensitive identifier that you can provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The Amazon Managed Service for Prometheus workspace to send metrics to.
     * </p>
     */
    private Destination destination;
    /**
     * <p>
     * The configuration file to use in the new scraper. For more information, see <a
     * href="prometheus/latest/userguide/AMP-collector-how-to.html#AMP-collector-configuration">Scraper
     * configuration</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     * </p>
     */
    private ScrapeConfiguration scrapeConfiguration;
    /**
     * <p>
     * The Amazon EKS cluster from which the scraper will collect metrics.
     * </p>
     */
    private Source source;
    /**
     * <p>
     * (Optional) The list of tag keys and values to associate with the scraper.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * (optional) a name to associate with the scraper. This is for your use, and does not need to be unique.
     * </p>
     * 
     * @param alias
     *        (optional) a name to associate with the scraper. This is for your use, and does not need to be unique.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * (optional) a name to associate with the scraper. This is for your use, and does not need to be unique.
     * </p>
     * 
     * @return (optional) a name to associate with the scraper. This is for your use, and does not need to be unique.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * (optional) a name to associate with the scraper. This is for your use, and does not need to be unique.
     * </p>
     * 
     * @param alias
     *        (optional) a name to associate with the scraper. This is for your use, and does not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperRequest withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * (Optional) A unique, case-sensitive identifier that you can provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        (Optional) A unique, case-sensitive identifier that you can provide to ensure the idempotency of the
     *        request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * (Optional) A unique, case-sensitive identifier that you can provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return (Optional) A unique, case-sensitive identifier that you can provide to ensure the idempotency of the
     *         request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * (Optional) A unique, case-sensitive identifier that you can provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        (Optional) A unique, case-sensitive identifier that you can provide to ensure the idempotency of the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Managed Service for Prometheus workspace to send metrics to.
     * </p>
     * 
     * @param destination
     *        The Amazon Managed Service for Prometheus workspace to send metrics to.
     */

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The Amazon Managed Service for Prometheus workspace to send metrics to.
     * </p>
     * 
     * @return The Amazon Managed Service for Prometheus workspace to send metrics to.
     */

    public Destination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The Amazon Managed Service for Prometheus workspace to send metrics to.
     * </p>
     * 
     * @param destination
     *        The Amazon Managed Service for Prometheus workspace to send metrics to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperRequest withDestination(Destination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The configuration file to use in the new scraper. For more information, see <a
     * href="prometheus/latest/userguide/AMP-collector-how-to.html#AMP-collector-configuration">Scraper
     * configuration</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     * </p>
     * 
     * @param scrapeConfiguration
     *        The configuration file to use in the new scraper. For more information, see <a
     *        href="prometheus/latest/userguide/AMP-collector-how-to.html#AMP-collector-configuration">Scraper
     *        configuration</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     */

    public void setScrapeConfiguration(ScrapeConfiguration scrapeConfiguration) {
        this.scrapeConfiguration = scrapeConfiguration;
    }

    /**
     * <p>
     * The configuration file to use in the new scraper. For more information, see <a
     * href="prometheus/latest/userguide/AMP-collector-how-to.html#AMP-collector-configuration">Scraper
     * configuration</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     * </p>
     * 
     * @return The configuration file to use in the new scraper. For more information, see <a
     *         href="prometheus/latest/userguide/AMP-collector-how-to.html#AMP-collector-configuration">Scraper
     *         configuration</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     */

    public ScrapeConfiguration getScrapeConfiguration() {
        return this.scrapeConfiguration;
    }

    /**
     * <p>
     * The configuration file to use in the new scraper. For more information, see <a
     * href="prometheus/latest/userguide/AMP-collector-how-to.html#AMP-collector-configuration">Scraper
     * configuration</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     * </p>
     * 
     * @param scrapeConfiguration
     *        The configuration file to use in the new scraper. For more information, see <a
     *        href="prometheus/latest/userguide/AMP-collector-how-to.html#AMP-collector-configuration">Scraper
     *        configuration</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperRequest withScrapeConfiguration(ScrapeConfiguration scrapeConfiguration) {
        setScrapeConfiguration(scrapeConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon EKS cluster from which the scraper will collect metrics.
     * </p>
     * 
     * @param source
     *        The Amazon EKS cluster from which the scraper will collect metrics.
     */

    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * <p>
     * The Amazon EKS cluster from which the scraper will collect metrics.
     * </p>
     * 
     * @return The Amazon EKS cluster from which the scraper will collect metrics.
     */

    public Source getSource() {
        return this.source;
    }

    /**
     * <p>
     * The Amazon EKS cluster from which the scraper will collect metrics.
     * </p>
     * 
     * @param source
     *        The Amazon EKS cluster from which the scraper will collect metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperRequest withSource(Source source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * (Optional) The list of tag keys and values to associate with the scraper.
     * </p>
     * 
     * @return (Optional) The list of tag keys and values to associate with the scraper.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * (Optional) The list of tag keys and values to associate with the scraper.
     * </p>
     * 
     * @param tags
     *        (Optional) The list of tag keys and values to associate with the scraper.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * (Optional) The list of tag keys and values to associate with the scraper.
     * </p>
     * 
     * @param tags
     *        (Optional) The list of tag keys and values to associate with the scraper.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateScraperRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getScrapeConfiguration() != null)
            sb.append("ScrapeConfiguration: ").append(getScrapeConfiguration()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateScraperRequest == false)
            return false;
        CreateScraperRequest other = (CreateScraperRequest) obj;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getScrapeConfiguration() == null ^ this.getScrapeConfiguration() == null)
            return false;
        if (other.getScrapeConfiguration() != null && other.getScrapeConfiguration().equals(this.getScrapeConfiguration()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getScrapeConfiguration() == null) ? 0 : getScrapeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateScraperRequest clone() {
        return (CreateScraperRequest) super.clone();
    }

}
