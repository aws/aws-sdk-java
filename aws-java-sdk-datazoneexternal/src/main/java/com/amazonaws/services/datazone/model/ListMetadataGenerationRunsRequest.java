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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListMetadataGenerationRuns"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMetadataGenerationRunsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon DataZone domain where you want to list metadata generation runs.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The maximum number of metadata generation runs to return in a single call to ListMetadataGenerationRuns. When the
     * number of metadata generation runs to be listed is greater than the value of MaxResults, the response contains a
     * NextToken value that you can use in a subsequent call to ListMetadataGenerationRuns to list the next set of
     * revisions.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When the number of metadata generation runs is greater than the default value for the MaxResults parameter, or if
     * you explicitly specify a value for MaxResults that is less than the number of metadata generation runs, the
     * response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call
     * to ListMetadataGenerationRuns to list the next set of revisions.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The status of the metadata generation runs.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of the metadata generation runs.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The ID of the Amazon DataZone domain where you want to list metadata generation runs.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain where you want to list metadata generation runs.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain where you want to list metadata generation runs.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain where you want to list metadata generation runs.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain where you want to list metadata generation runs.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain where you want to list metadata generation runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetadataGenerationRunsRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of metadata generation runs to return in a single call to ListMetadataGenerationRuns. When the
     * number of metadata generation runs to be listed is greater than the value of MaxResults, the response contains a
     * NextToken value that you can use in a subsequent call to ListMetadataGenerationRuns to list the next set of
     * revisions.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of metadata generation runs to return in a single call to ListMetadataGenerationRuns.
     *        When the number of metadata generation runs to be listed is greater than the value of MaxResults, the
     *        response contains a NextToken value that you can use in a subsequent call to ListMetadataGenerationRuns to
     *        list the next set of revisions.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of metadata generation runs to return in a single call to ListMetadataGenerationRuns. When the
     * number of metadata generation runs to be listed is greater than the value of MaxResults, the response contains a
     * NextToken value that you can use in a subsequent call to ListMetadataGenerationRuns to list the next set of
     * revisions.
     * </p>
     * 
     * @return The maximum number of metadata generation runs to return in a single call to ListMetadataGenerationRuns.
     *         When the number of metadata generation runs to be listed is greater than the value of MaxResults, the
     *         response contains a NextToken value that you can use in a subsequent call to ListMetadataGenerationRuns
     *         to list the next set of revisions.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of metadata generation runs to return in a single call to ListMetadataGenerationRuns. When the
     * number of metadata generation runs to be listed is greater than the value of MaxResults, the response contains a
     * NextToken value that you can use in a subsequent call to ListMetadataGenerationRuns to list the next set of
     * revisions.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of metadata generation runs to return in a single call to ListMetadataGenerationRuns.
     *        When the number of metadata generation runs to be listed is greater than the value of MaxResults, the
     *        response contains a NextToken value that you can use in a subsequent call to ListMetadataGenerationRuns to
     *        list the next set of revisions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetadataGenerationRunsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When the number of metadata generation runs is greater than the default value for the MaxResults parameter, or if
     * you explicitly specify a value for MaxResults that is less than the number of metadata generation runs, the
     * response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call
     * to ListMetadataGenerationRuns to list the next set of revisions.
     * </p>
     * 
     * @param nextToken
     *        When the number of metadata generation runs is greater than the default value for the MaxResults
     *        parameter, or if you explicitly specify a value for MaxResults that is less than the number of metadata
     *        generation runs, the response includes a pagination token named NextToken. You can specify this NextToken
     *        value in a subsequent call to ListMetadataGenerationRuns to list the next set of revisions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of metadata generation runs is greater than the default value for the MaxResults parameter, or if
     * you explicitly specify a value for MaxResults that is less than the number of metadata generation runs, the
     * response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call
     * to ListMetadataGenerationRuns to list the next set of revisions.
     * </p>
     * 
     * @return When the number of metadata generation runs is greater than the default value for the MaxResults
     *         parameter, or if you explicitly specify a value for MaxResults that is less than the number of metadata
     *         generation runs, the response includes a pagination token named NextToken. You can specify this NextToken
     *         value in a subsequent call to ListMetadataGenerationRuns to list the next set of revisions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of metadata generation runs is greater than the default value for the MaxResults parameter, or if
     * you explicitly specify a value for MaxResults that is less than the number of metadata generation runs, the
     * response includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call
     * to ListMetadataGenerationRuns to list the next set of revisions.
     * </p>
     * 
     * @param nextToken
     *        When the number of metadata generation runs is greater than the default value for the MaxResults
     *        parameter, or if you explicitly specify a value for MaxResults that is less than the number of metadata
     *        generation runs, the response includes a pagination token named NextToken. You can specify this NextToken
     *        value in a subsequent call to ListMetadataGenerationRuns to list the next set of revisions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetadataGenerationRunsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The status of the metadata generation runs.
     * </p>
     * 
     * @param status
     *        The status of the metadata generation runs.
     * @see MetadataGenerationRunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the metadata generation runs.
     * </p>
     * 
     * @return The status of the metadata generation runs.
     * @see MetadataGenerationRunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the metadata generation runs.
     * </p>
     * 
     * @param status
     *        The status of the metadata generation runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataGenerationRunStatus
     */

    public ListMetadataGenerationRunsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the metadata generation runs.
     * </p>
     * 
     * @param status
     *        The status of the metadata generation runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataGenerationRunStatus
     */

    public ListMetadataGenerationRunsRequest withStatus(MetadataGenerationRunStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of the metadata generation runs.
     * </p>
     * 
     * @param type
     *        The type of the metadata generation runs.
     * @see MetadataGenerationRunType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the metadata generation runs.
     * </p>
     * 
     * @return The type of the metadata generation runs.
     * @see MetadataGenerationRunType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the metadata generation runs.
     * </p>
     * 
     * @param type
     *        The type of the metadata generation runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataGenerationRunType
     */

    public ListMetadataGenerationRunsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the metadata generation runs.
     * </p>
     * 
     * @param type
     *        The type of the metadata generation runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataGenerationRunType
     */

    public ListMetadataGenerationRunsRequest withType(MetadataGenerationRunType type) {
        this.type = type.toString();
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMetadataGenerationRunsRequest == false)
            return false;
        ListMetadataGenerationRunsRequest other = (ListMetadataGenerationRunsRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ListMetadataGenerationRunsRequest clone() {
        return (ListMetadataGenerationRunsRequest) super.clone();
    }

}
