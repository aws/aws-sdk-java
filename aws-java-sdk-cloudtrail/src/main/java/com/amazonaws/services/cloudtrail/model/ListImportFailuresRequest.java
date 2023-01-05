/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListImportFailures" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImportFailuresRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the import.
     * </p>
     */
    private String importId;
    /**
     * <p>
     * The maximum number of failures to display on a single page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token you can use to get the next page of import failures.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the import.
     * </p>
     * 
     * @param importId
     *        The ID of the import.
     */

    public void setImportId(String importId) {
        this.importId = importId;
    }

    /**
     * <p>
     * The ID of the import.
     * </p>
     * 
     * @return The ID of the import.
     */

    public String getImportId() {
        return this.importId;
    }

    /**
     * <p>
     * The ID of the import.
     * </p>
     * 
     * @param importId
     *        The ID of the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportFailuresRequest withImportId(String importId) {
        setImportId(importId);
        return this;
    }

    /**
     * <p>
     * The maximum number of failures to display on a single page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of failures to display on a single page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of failures to display on a single page.
     * </p>
     * 
     * @return The maximum number of failures to display on a single page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of failures to display on a single page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of failures to display on a single page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportFailuresRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token you can use to get the next page of import failures.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of import failures.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of import failures.
     * </p>
     * 
     * @return A token you can use to get the next page of import failures.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of import failures.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of import failures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportFailuresRequest withNextToken(String nextToken) {
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
        if (getImportId() != null)
            sb.append("ImportId: ").append(getImportId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListImportFailuresRequest == false)
            return false;
        ListImportFailuresRequest other = (ListImportFailuresRequest) obj;
        if (other.getImportId() == null ^ this.getImportId() == null)
            return false;
        if (other.getImportId() != null && other.getImportId().equals(this.getImportId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getImportId() == null) ? 0 : getImportId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListImportFailuresRequest clone() {
        return (ListImportFailuresRequest) super.clone();
    }

}
