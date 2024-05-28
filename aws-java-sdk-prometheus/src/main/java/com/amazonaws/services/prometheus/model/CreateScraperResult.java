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

/**
 * <p>
 * Represents the output of a <code>CreateScraper</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateScraper" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateScraperResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new scraper.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the new scraper.
     * </p>
     */
    private String scraperId;
    /**
     * <p>
     * A structure that displays the current status of the scraper.
     * </p>
     */
    private ScraperStatus status;
    /**
     * <p>
     * The list of tag keys and values that are associated with the scraper.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new scraper.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the new scraper.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new scraper.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the new scraper.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new scraper.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the new scraper.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the new scraper.
     * </p>
     * 
     * @param scraperId
     *        The ID of the new scraper.
     */

    public void setScraperId(String scraperId) {
        this.scraperId = scraperId;
    }

    /**
     * <p>
     * The ID of the new scraper.
     * </p>
     * 
     * @return The ID of the new scraper.
     */

    public String getScraperId() {
        return this.scraperId;
    }

    /**
     * <p>
     * The ID of the new scraper.
     * </p>
     * 
     * @param scraperId
     *        The ID of the new scraper.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperResult withScraperId(String scraperId) {
        setScraperId(scraperId);
        return this;
    }

    /**
     * <p>
     * A structure that displays the current status of the scraper.
     * </p>
     * 
     * @param status
     *        A structure that displays the current status of the scraper.
     */

    public void setStatus(ScraperStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * A structure that displays the current status of the scraper.
     * </p>
     * 
     * @return A structure that displays the current status of the scraper.
     */

    public ScraperStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A structure that displays the current status of the scraper.
     * </p>
     * 
     * @param status
     *        A structure that displays the current status of the scraper.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperResult withStatus(ScraperStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The list of tag keys and values that are associated with the scraper.
     * </p>
     * 
     * @return The list of tag keys and values that are associated with the scraper.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tag keys and values that are associated with the scraper.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values that are associated with the scraper.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of tag keys and values that are associated with the scraper.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values that are associated with the scraper.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateScraperResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateScraperResult addTagsEntry(String key, String value) {
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

    public CreateScraperResult clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getScraperId() != null)
            sb.append("ScraperId: ").append(getScraperId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof CreateScraperResult == false)
            return false;
        CreateScraperResult other = (CreateScraperResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getScraperId() == null ^ this.getScraperId() == null)
            return false;
        if (other.getScraperId() != null && other.getScraperId().equals(this.getScraperId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getScraperId() == null) ? 0 : getScraperId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateScraperResult clone() {
        try {
            return (CreateScraperResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
