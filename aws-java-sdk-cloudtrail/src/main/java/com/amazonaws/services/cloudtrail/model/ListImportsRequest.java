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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListImports" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImportsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of imports to display on a single page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The ARN of the destination event data store.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The status of the import.
     * </p>
     */
    private String importStatus;
    /**
     * <p>
     * A token you can use to get the next page of import results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of imports to display on a single page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of imports to display on a single page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of imports to display on a single page.
     * </p>
     * 
     * @return The maximum number of imports to display on a single page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of imports to display on a single page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of imports to display on a single page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The ARN of the destination event data store.
     * </p>
     * 
     * @param destination
     *        The ARN of the destination event data store.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The ARN of the destination event data store.
     * </p>
     * 
     * @return The ARN of the destination event data store.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The ARN of the destination event data store.
     * </p>
     * 
     * @param destination
     *        The ARN of the destination event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsRequest withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The status of the import.
     * </p>
     * 
     * @param importStatus
     *        The status of the import.
     * @see ImportStatus
     */

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    /**
     * <p>
     * The status of the import.
     * </p>
     * 
     * @return The status of the import.
     * @see ImportStatus
     */

    public String getImportStatus() {
        return this.importStatus;
    }

    /**
     * <p>
     * The status of the import.
     * </p>
     * 
     * @param importStatus
     *        The status of the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public ListImportsRequest withImportStatus(String importStatus) {
        setImportStatus(importStatus);
        return this;
    }

    /**
     * <p>
     * The status of the import.
     * </p>
     * 
     * @param importStatus
     *        The status of the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public ListImportsRequest withImportStatus(ImportStatus importStatus) {
        this.importStatus = importStatus.toString();
        return this;
    }

    /**
     * <p>
     * A token you can use to get the next page of import results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of import results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of import results.
     * </p>
     * 
     * @return A token you can use to get the next page of import results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of import results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of import results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsRequest withNextToken(String nextToken) {
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getImportStatus() != null)
            sb.append("ImportStatus: ").append(getImportStatus()).append(",");
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

        if (obj instanceof ListImportsRequest == false)
            return false;
        ListImportsRequest other = (ListImportsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getImportStatus() == null ^ this.getImportStatus() == null)
            return false;
        if (other.getImportStatus() != null && other.getImportStatus().equals(this.getImportStatus()) == false)
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getImportStatus() == null) ? 0 : getImportStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListImportsRequest clone() {
        return (ListImportsRequest) super.clone();
    }

}
