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
 * Represents the input of a <code>DescribeScraper</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeScraper" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScraperRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the scraper to describe.
     * </p>
     */
    private String scraperId;

    /**
     * <p>
     * The ID of the scraper to describe.
     * </p>
     * 
     * @param scraperId
     *        The ID of the scraper to describe.
     */

    public void setScraperId(String scraperId) {
        this.scraperId = scraperId;
    }

    /**
     * <p>
     * The ID of the scraper to describe.
     * </p>
     * 
     * @return The ID of the scraper to describe.
     */

    public String getScraperId() {
        return this.scraperId;
    }

    /**
     * <p>
     * The ID of the scraper to describe.
     * </p>
     * 
     * @param scraperId
     *        The ID of the scraper to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScraperRequest withScraperId(String scraperId) {
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

        if (obj instanceof DescribeScraperRequest == false)
            return false;
        DescribeScraperRequest other = (DescribeScraperRequest) obj;
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

        hashCode = prime * hashCode + ((getScraperId() == null) ? 0 : getScraperId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScraperRequest clone() {
        return (DescribeScraperRequest) super.clone();
    }

}
