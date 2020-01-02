/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/GetTranscript" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTranscriptRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The contactId from the current contact chain for which transcript is needed.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * The maximum number of results to return in the page. Default: 10.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token. Use the value returned previously in the next subsequent request to retrieve the next set
     * of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The direction from StartPosition from which to retrieve message. Default: BACKWARD when no StartPosition is
     * provided, FORWARD with StartPosition.
     * </p>
     */
    private String scanDirection;
    /**
     * <p>
     * The sort order for the records. Default: DESCENDING.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * A filtering option for where to start.
     * </p>
     */
    private StartPosition startPosition;
    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     */
    private String connectionToken;

    /**
     * <p>
     * The contactId from the current contact chain for which transcript is needed.
     * </p>
     * 
     * @param contactId
     *        The contactId from the current contact chain for which transcript is needed.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The contactId from the current contact chain for which transcript is needed.
     * </p>
     * 
     * @return The contactId from the current contact chain for which transcript is needed.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The contactId from the current contact chain for which transcript is needed.
     * </p>
     * 
     * @param contactId
     *        The contactId from the current contact chain for which transcript is needed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTranscriptRequest withContactId(String contactId) {
        setContactId(contactId);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the page. Default: 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the page. Default: 10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the page. Default: 10.
     * </p>
     * 
     * @return The maximum number of results to return in the page. Default: 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the page. Default: 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the page. Default: 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTranscriptRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token. Use the value returned previously in the next subsequent request to retrieve the next set
     * of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token. Use the value returned previously in the next subsequent request to retrieve the
     *        next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token. Use the value returned previously in the next subsequent request to retrieve the next set
     * of results.
     * </p>
     * 
     * @return The pagination token. Use the value returned previously in the next subsequent request to retrieve the
     *         next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token. Use the value returned previously in the next subsequent request to retrieve the next set
     * of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token. Use the value returned previously in the next subsequent request to retrieve the
     *        next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTranscriptRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The direction from StartPosition from which to retrieve message. Default: BACKWARD when no StartPosition is
     * provided, FORWARD with StartPosition.
     * </p>
     * 
     * @param scanDirection
     *        The direction from StartPosition from which to retrieve message. Default: BACKWARD when no StartPosition
     *        is provided, FORWARD with StartPosition.
     * @see ScanDirection
     */

    public void setScanDirection(String scanDirection) {
        this.scanDirection = scanDirection;
    }

    /**
     * <p>
     * The direction from StartPosition from which to retrieve message. Default: BACKWARD when no StartPosition is
     * provided, FORWARD with StartPosition.
     * </p>
     * 
     * @return The direction from StartPosition from which to retrieve message. Default: BACKWARD when no StartPosition
     *         is provided, FORWARD with StartPosition.
     * @see ScanDirection
     */

    public String getScanDirection() {
        return this.scanDirection;
    }

    /**
     * <p>
     * The direction from StartPosition from which to retrieve message. Default: BACKWARD when no StartPosition is
     * provided, FORWARD with StartPosition.
     * </p>
     * 
     * @param scanDirection
     *        The direction from StartPosition from which to retrieve message. Default: BACKWARD when no StartPosition
     *        is provided, FORWARD with StartPosition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanDirection
     */

    public GetTranscriptRequest withScanDirection(String scanDirection) {
        setScanDirection(scanDirection);
        return this;
    }

    /**
     * <p>
     * The direction from StartPosition from which to retrieve message. Default: BACKWARD when no StartPosition is
     * provided, FORWARD with StartPosition.
     * </p>
     * 
     * @param scanDirection
     *        The direction from StartPosition from which to retrieve message. Default: BACKWARD when no StartPosition
     *        is provided, FORWARD with StartPosition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanDirection
     */

    public GetTranscriptRequest withScanDirection(ScanDirection scanDirection) {
        this.scanDirection = scanDirection.toString();
        return this;
    }

    /**
     * <p>
     * The sort order for the records. Default: DESCENDING.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the records. Default: DESCENDING.
     * @see SortKey
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for the records. Default: DESCENDING.
     * </p>
     * 
     * @return The sort order for the records. Default: DESCENDING.
     * @see SortKey
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order for the records. Default: DESCENDING.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the records. Default: DESCENDING.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortKey
     */

    public GetTranscriptRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order for the records. Default: DESCENDING.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the records. Default: DESCENDING.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortKey
     */

    public GetTranscriptRequest withSortOrder(SortKey sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * A filtering option for where to start.
     * </p>
     * 
     * @param startPosition
     *        A filtering option for where to start.
     */

    public void setStartPosition(StartPosition startPosition) {
        this.startPosition = startPosition;
    }

    /**
     * <p>
     * A filtering option for where to start.
     * </p>
     * 
     * @return A filtering option for where to start.
     */

    public StartPosition getStartPosition() {
        return this.startPosition;
    }

    /**
     * <p>
     * A filtering option for where to start.
     * </p>
     * 
     * @param startPosition
     *        A filtering option for where to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTranscriptRequest withStartPosition(StartPosition startPosition) {
        setStartPosition(startPosition);
        return this;
    }

    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     * 
     * @param connectionToken
     *        The authentication token associated with the participant's connection.
     */

    public void setConnectionToken(String connectionToken) {
        this.connectionToken = connectionToken;
    }

    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     * 
     * @return The authentication token associated with the participant's connection.
     */

    public String getConnectionToken() {
        return this.connectionToken;
    }

    /**
     * <p>
     * The authentication token associated with the participant's connection.
     * </p>
     * 
     * @param connectionToken
     *        The authentication token associated with the participant's connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTranscriptRequest withConnectionToken(String connectionToken) {
        setConnectionToken(connectionToken);
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
        if (getContactId() != null)
            sb.append("ContactId: ").append(getContactId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getScanDirection() != null)
            sb.append("ScanDirection: ").append(getScanDirection()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getStartPosition() != null)
            sb.append("StartPosition: ").append(getStartPosition()).append(",");
        if (getConnectionToken() != null)
            sb.append("ConnectionToken: ").append(getConnectionToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTranscriptRequest == false)
            return false;
        GetTranscriptRequest other = (GetTranscriptRequest) obj;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getScanDirection() == null ^ this.getScanDirection() == null)
            return false;
        if (other.getScanDirection() != null && other.getScanDirection().equals(this.getScanDirection()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getStartPosition() == null ^ this.getStartPosition() == null)
            return false;
        if (other.getStartPosition() != null && other.getStartPosition().equals(this.getStartPosition()) == false)
            return false;
        if (other.getConnectionToken() == null ^ this.getConnectionToken() == null)
            return false;
        if (other.getConnectionToken() != null && other.getConnectionToken().equals(this.getConnectionToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getScanDirection() == null) ? 0 : getScanDirection().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getStartPosition() == null) ? 0 : getStartPosition().hashCode());
        hashCode = prime * hashCode + ((getConnectionToken() == null) ? 0 : getConnectionToken().hashCode());
        return hashCode;
    }

    @Override
    public GetTranscriptRequest clone() {
        return (GetTranscriptRequest) super.clone();
    }

}
