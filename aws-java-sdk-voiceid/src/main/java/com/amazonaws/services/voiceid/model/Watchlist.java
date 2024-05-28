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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains all the information about a watchlist.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/Watchlist" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Watchlist implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when the watchlist was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Whether the specified watchlist is the default watchlist of a domain.
     * </p>
     */
    private Boolean defaultWatchlist;
    /**
     * <p>
     * The description of the watchlist.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the domain that contains the watchlist.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The name for the watchlist.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The timestamp of when the watchlist was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The identifier of the watchlist.
     * </p>
     */
    private String watchlistId;

    /**
     * <p>
     * The timestamp of when the watchlist was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the watchlist was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the watchlist was created.
     * </p>
     * 
     * @return The timestamp of when the watchlist was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the watchlist was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the watchlist was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Watchlist withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Whether the specified watchlist is the default watchlist of a domain.
     * </p>
     * 
     * @param defaultWatchlist
     *        Whether the specified watchlist is the default watchlist of a domain.
     */

    public void setDefaultWatchlist(Boolean defaultWatchlist) {
        this.defaultWatchlist = defaultWatchlist;
    }

    /**
     * <p>
     * Whether the specified watchlist is the default watchlist of a domain.
     * </p>
     * 
     * @return Whether the specified watchlist is the default watchlist of a domain.
     */

    public Boolean getDefaultWatchlist() {
        return this.defaultWatchlist;
    }

    /**
     * <p>
     * Whether the specified watchlist is the default watchlist of a domain.
     * </p>
     * 
     * @param defaultWatchlist
     *        Whether the specified watchlist is the default watchlist of a domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Watchlist withDefaultWatchlist(Boolean defaultWatchlist) {
        setDefaultWatchlist(defaultWatchlist);
        return this;
    }

    /**
     * <p>
     * Whether the specified watchlist is the default watchlist of a domain.
     * </p>
     * 
     * @return Whether the specified watchlist is the default watchlist of a domain.
     */

    public Boolean isDefaultWatchlist() {
        return this.defaultWatchlist;
    }

    /**
     * <p>
     * The description of the watchlist.
     * </p>
     * 
     * @param description
     *        The description of the watchlist.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the watchlist.
     * </p>
     * 
     * @return The description of the watchlist.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the watchlist.
     * </p>
     * 
     * @param description
     *        The description of the watchlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Watchlist withDescription(String description) {
        setDescription(description);
        return this;
    }

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

    public Watchlist withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The name for the watchlist.
     * </p>
     * 
     * @param name
     *        The name for the watchlist.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the watchlist.
     * </p>
     * 
     * @return The name for the watchlist.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the watchlist.
     * </p>
     * 
     * @param name
     *        The name for the watchlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Watchlist withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the watchlist was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the watchlist was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the watchlist was updated.
     * </p>
     * 
     * @return The timestamp of when the watchlist was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the watchlist was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the watchlist was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Watchlist withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The identifier of the watchlist.
     * </p>
     * 
     * @param watchlistId
     *        The identifier of the watchlist.
     */

    public void setWatchlistId(String watchlistId) {
        this.watchlistId = watchlistId;
    }

    /**
     * <p>
     * The identifier of the watchlist.
     * </p>
     * 
     * @return The identifier of the watchlist.
     */

    public String getWatchlistId() {
        return this.watchlistId;
    }

    /**
     * <p>
     * The identifier of the watchlist.
     * </p>
     * 
     * @param watchlistId
     *        The identifier of the watchlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Watchlist withWatchlistId(String watchlistId) {
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDefaultWatchlist() != null)
            sb.append("DefaultWatchlist: ").append(getDefaultWatchlist()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
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

        if (obj instanceof Watchlist == false)
            return false;
        Watchlist other = (Watchlist) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDefaultWatchlist() == null ^ this.getDefaultWatchlist() == null)
            return false;
        if (other.getDefaultWatchlist() != null && other.getDefaultWatchlist().equals(this.getDefaultWatchlist()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
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

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDefaultWatchlist() == null) ? 0 : getDefaultWatchlist().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getWatchlistId() == null) ? 0 : getWatchlistId().hashCode());
        return hashCode;
    }

    @Override
    public Watchlist clone() {
        try {
            return (Watchlist) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.WatchlistMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
