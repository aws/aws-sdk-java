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
 * Represents the input of a <code>DeleteScraper</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteScraper" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteScraperRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) A unique, case-sensitive identifier that you can provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ID of the scraper to delete.
     * </p>
     */
    private String scraperId;

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

    public DeleteScraperRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

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

    public DeleteScraperRequest withScraperId(String scraperId) {
        setScraperId(scraperId);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getScraperId() != null)
            sb.append("ScraperId: ").append(getScraperId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteScraperRequest == false)
            return false;
        DeleteScraperRequest other = (DeleteScraperRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getScraperId() == null ^ this.getScraperId() == null)
            return false;
        if (other.getScraperId() != null && other.getScraperId().equals(this.getScraperId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getScraperId() == null) ? 0 : getScraperId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteScraperRequest clone() {
        return (DeleteScraperRequest) super.clone();
    }

}
