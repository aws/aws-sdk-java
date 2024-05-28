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
 * Represents the output of a <code>DeleteScraper</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteScraper" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteScraperResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the scraper to delete.
     * </p>
     */
    private String scraperId;
    /**
     * <p>
     * The current status of the scraper.
     * </p>
     */
    private ScraperStatus status;

    /**
     * <p>
     * The ID of the scraper to delete.
     * </p>
     * 
     * @param scraperId
     *        The ID of the scraper to delete.
     */

    public void setScraperId(String scraperId) {
        this.scraperId = scraperId;
    }

    /**
     * <p>
     * The ID of the scraper to delete.
     * </p>
     * 
     * @return The ID of the scraper to delete.
     */

    public String getScraperId() {
        return this.scraperId;
    }

    /**
     * <p>
     * The ID of the scraper to delete.
     * </p>
     * 
     * @param scraperId
     *        The ID of the scraper to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteScraperResult withScraperId(String scraperId) {
        setScraperId(scraperId);
        return this;
    }

    /**
     * <p>
     * The current status of the scraper.
     * </p>
     * 
     * @param status
     *        The current status of the scraper.
     */

    public void setStatus(ScraperStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the scraper.
     * </p>
     * 
     * @return The current status of the scraper.
     */

    public ScraperStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the scraper.
     * </p>
     * 
     * @param status
     *        The current status of the scraper.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteScraperResult withStatus(ScraperStatus status) {
        setStatus(status);
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
        if (getScraperId() != null)
            sb.append("ScraperId: ").append(getScraperId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteScraperResult == false)
            return false;
        DeleteScraperResult other = (DeleteScraperResult) obj;
        if (other.getScraperId() == null ^ this.getScraperId() == null)
            return false;
        if (other.getScraperId() != null && other.getScraperId().equals(this.getScraperId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScraperId() == null) ? 0 : getScraperId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteScraperResult clone() {
        try {
            return (DeleteScraperResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
