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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListAttachments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAttachmentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of a core network.
     * </p>
     */
    private String coreNetworkId;
    /**
     * <p>
     * The type of attachment.
     * </p>
     */
    private String attachmentType;
    /**
     * <p>
     * The Region where the edge is located.
     * </p>
     */
    private String edgeLocation;
    /**
     * <p>
     * The state of the attachment.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     */

    public void setCoreNetworkId(String coreNetworkId) {
        this.coreNetworkId = coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @return The ID of a core network.
     */

    public String getCoreNetworkId() {
        return this.coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachmentsRequest withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
        return this;
    }

    /**
     * <p>
     * The type of attachment.
     * </p>
     * 
     * @param attachmentType
     *        The type of attachment.
     * @see AttachmentType
     */

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    /**
     * <p>
     * The type of attachment.
     * </p>
     * 
     * @return The type of attachment.
     * @see AttachmentType
     */

    public String getAttachmentType() {
        return this.attachmentType;
    }

    /**
     * <p>
     * The type of attachment.
     * </p>
     * 
     * @param attachmentType
     *        The type of attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentType
     */

    public ListAttachmentsRequest withAttachmentType(String attachmentType) {
        setAttachmentType(attachmentType);
        return this;
    }

    /**
     * <p>
     * The type of attachment.
     * </p>
     * 
     * @param attachmentType
     *        The type of attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentType
     */

    public ListAttachmentsRequest withAttachmentType(AttachmentType attachmentType) {
        this.attachmentType = attachmentType.toString();
        return this;
    }

    /**
     * <p>
     * The Region where the edge is located.
     * </p>
     * 
     * @param edgeLocation
     *        The Region where the edge is located.
     */

    public void setEdgeLocation(String edgeLocation) {
        this.edgeLocation = edgeLocation;
    }

    /**
     * <p>
     * The Region where the edge is located.
     * </p>
     * 
     * @return The Region where the edge is located.
     */

    public String getEdgeLocation() {
        return this.edgeLocation;
    }

    /**
     * <p>
     * The Region where the edge is located.
     * </p>
     * 
     * @param edgeLocation
     *        The Region where the edge is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachmentsRequest withEdgeLocation(String edgeLocation) {
        setEdgeLocation(edgeLocation);
        return this;
    }

    /**
     * <p>
     * The state of the attachment.
     * </p>
     * 
     * @param state
     *        The state of the attachment.
     * @see AttachmentState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the attachment.
     * </p>
     * 
     * @return The state of the attachment.
     * @see AttachmentState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the attachment.
     * </p>
     * 
     * @param state
     *        The state of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentState
     */

    public ListAttachmentsRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the attachment.
     * </p>
     * 
     * @param state
     *        The state of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentState
     */

    public ListAttachmentsRequest withState(AttachmentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachmentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachmentsRequest withNextToken(String nextToken) {
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
        if (getCoreNetworkId() != null)
            sb.append("CoreNetworkId: ").append(getCoreNetworkId()).append(",");
        if (getAttachmentType() != null)
            sb.append("AttachmentType: ").append(getAttachmentType()).append(",");
        if (getEdgeLocation() != null)
            sb.append("EdgeLocation: ").append(getEdgeLocation()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof ListAttachmentsRequest == false)
            return false;
        ListAttachmentsRequest other = (ListAttachmentsRequest) obj;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
            return false;
        if (other.getAttachmentType() == null ^ this.getAttachmentType() == null)
            return false;
        if (other.getAttachmentType() != null && other.getAttachmentType().equals(this.getAttachmentType()) == false)
            return false;
        if (other.getEdgeLocation() == null ^ this.getEdgeLocation() == null)
            return false;
        if (other.getEdgeLocation() != null && other.getEdgeLocation().equals(this.getEdgeLocation()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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

        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getAttachmentType() == null) ? 0 : getAttachmentType().hashCode());
        hashCode = prime * hashCode + ((getEdgeLocation() == null) ? 0 : getEdgeLocation().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAttachmentsRequest clone() {
        return (ListAttachmentsRequest) super.clone();
    }

}
