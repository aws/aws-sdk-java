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
 * Contains a summary of information about a fraudster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/FraudsterSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FraudsterSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when the fraudster summary was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The identifier of the domain that contains the fraudster summary.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The service-generated identifier for the fraudster.
     * </p>
     */
    private String generatedFraudsterId;
    /**
     * <p>
     * The identifier of the watchlists the fraudster is a part of.
     * </p>
     */
    private java.util.List<String> watchlistIds;

    /**
     * <p>
     * The timestamp of when the fraudster summary was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the fraudster summary was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the fraudster summary was created.
     * </p>
     * 
     * @return The timestamp of when the fraudster summary was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the fraudster summary was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the fraudster summary was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FraudsterSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The identifier of the domain that contains the fraudster summary.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain that contains the fraudster summary.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the domain that contains the fraudster summary.
     * </p>
     * 
     * @return The identifier of the domain that contains the fraudster summary.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the domain that contains the fraudster summary.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain that contains the fraudster summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FraudsterSummary withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The service-generated identifier for the fraudster.
     * </p>
     * 
     * @param generatedFraudsterId
     *        The service-generated identifier for the fraudster.
     */

    public void setGeneratedFraudsterId(String generatedFraudsterId) {
        this.generatedFraudsterId = generatedFraudsterId;
    }

    /**
     * <p>
     * The service-generated identifier for the fraudster.
     * </p>
     * 
     * @return The service-generated identifier for the fraudster.
     */

    public String getGeneratedFraudsterId() {
        return this.generatedFraudsterId;
    }

    /**
     * <p>
     * The service-generated identifier for the fraudster.
     * </p>
     * 
     * @param generatedFraudsterId
     *        The service-generated identifier for the fraudster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FraudsterSummary withGeneratedFraudsterId(String generatedFraudsterId) {
        setGeneratedFraudsterId(generatedFraudsterId);
        return this;
    }

    /**
     * <p>
     * The identifier of the watchlists the fraudster is a part of.
     * </p>
     * 
     * @return The identifier of the watchlists the fraudster is a part of.
     */

    public java.util.List<String> getWatchlistIds() {
        return watchlistIds;
    }

    /**
     * <p>
     * The identifier of the watchlists the fraudster is a part of.
     * </p>
     * 
     * @param watchlistIds
     *        The identifier of the watchlists the fraudster is a part of.
     */

    public void setWatchlistIds(java.util.Collection<String> watchlistIds) {
        if (watchlistIds == null) {
            this.watchlistIds = null;
            return;
        }

        this.watchlistIds = new java.util.ArrayList<String>(watchlistIds);
    }

    /**
     * <p>
     * The identifier of the watchlists the fraudster is a part of.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWatchlistIds(java.util.Collection)} or {@link #withWatchlistIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param watchlistIds
     *        The identifier of the watchlists the fraudster is a part of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FraudsterSummary withWatchlistIds(String... watchlistIds) {
        if (this.watchlistIds == null) {
            setWatchlistIds(new java.util.ArrayList<String>(watchlistIds.length));
        }
        for (String ele : watchlistIds) {
            this.watchlistIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifier of the watchlists the fraudster is a part of.
     * </p>
     * 
     * @param watchlistIds
     *        The identifier of the watchlists the fraudster is a part of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FraudsterSummary withWatchlistIds(java.util.Collection<String> watchlistIds) {
        setWatchlistIds(watchlistIds);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getGeneratedFraudsterId() != null)
            sb.append("GeneratedFraudsterId: ").append(getGeneratedFraudsterId()).append(",");
        if (getWatchlistIds() != null)
            sb.append("WatchlistIds: ").append(getWatchlistIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FraudsterSummary == false)
            return false;
        FraudsterSummary other = (FraudsterSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getGeneratedFraudsterId() == null ^ this.getGeneratedFraudsterId() == null)
            return false;
        if (other.getGeneratedFraudsterId() != null && other.getGeneratedFraudsterId().equals(this.getGeneratedFraudsterId()) == false)
            return false;
        if (other.getWatchlistIds() == null ^ this.getWatchlistIds() == null)
            return false;
        if (other.getWatchlistIds() != null && other.getWatchlistIds().equals(this.getWatchlistIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getGeneratedFraudsterId() == null) ? 0 : getGeneratedFraudsterId().hashCode());
        hashCode = prime * hashCode + ((getWatchlistIds() == null) ? 0 : getWatchlistIds().hashCode());
        return hashCode;
    }

    @Override
    public FraudsterSummary clone() {
        try {
            return (FraudsterSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.FraudsterSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
