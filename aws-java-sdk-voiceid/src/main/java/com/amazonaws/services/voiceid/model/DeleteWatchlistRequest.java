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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DeleteWatchlist" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteWatchlistRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the domain that contains the watchlist.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The identifier of the watchlist to be deleted.
     * </p>
     */
    private String watchlistId;

    /**
     * <p>
     * The identifier of the domain that contains the watchlist.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain that contains the watchlist.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the domain that contains the watchlist.
     * </p>
     * 
     * @return The identifier of the domain that contains the watchlist.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the domain that contains the watchlist.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain that contains the watchlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteWatchlistRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The identifier of the watchlist to be deleted.
     * </p>
     * 
     * @param watchlistId
     *        The identifier of the watchlist to be deleted.
     */

    public void setWatchlistId(String watchlistId) {
        this.watchlistId = watchlistId;
    }

    /**
     * <p>
     * The identifier of the watchlist to be deleted.
     * </p>
     * 
     * @return The identifier of the watchlist to be deleted.
     */

    public String getWatchlistId() {
        return this.watchlistId;
    }

    /**
     * <p>
     * The identifier of the watchlist to be deleted.
     * </p>
     * 
     * @param watchlistId
     *        The identifier of the watchlist to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteWatchlistRequest withWatchlistId(String watchlistId) {
        setWatchlistId(watchlistId);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getWatchlistId() != null)
            sb.append("WatchlistId: ").append(getWatchlistId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteWatchlistRequest == false)
            return false;
        DeleteWatchlistRequest other = (DeleteWatchlistRequest) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getWatchlistId() == null ^ this.getWatchlistId() == null)
            return false;
        if (other.getWatchlistId() != null && other.getWatchlistId().equals(this.getWatchlistId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getWatchlistId() == null) ? 0 : getWatchlistId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteWatchlistRequest clone() {
        return (DeleteWatchlistRequest) super.clone();
    }

}
