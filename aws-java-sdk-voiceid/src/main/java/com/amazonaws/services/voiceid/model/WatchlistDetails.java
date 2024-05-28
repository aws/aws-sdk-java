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
 * Details of the watchlists in a domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/WatchlistDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WatchlistDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the default watchlist.
     * </p>
     */
    private String defaultWatchlistId;

    /**
     * <p>
     * The identifier of the default watchlist.
     * </p>
     * 
     * @param defaultWatchlistId
     *        The identifier of the default watchlist.
     */

    public void setDefaultWatchlistId(String defaultWatchlistId) {
        this.defaultWatchlistId = defaultWatchlistId;
    }

    /**
     * <p>
     * The identifier of the default watchlist.
     * </p>
     * 
     * @return The identifier of the default watchlist.
     */

    public String getDefaultWatchlistId() {
        return this.defaultWatchlistId;
    }

    /**
     * <p>
     * The identifier of the default watchlist.
     * </p>
     * 
     * @param defaultWatchlistId
     *        The identifier of the default watchlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WatchlistDetails withDefaultWatchlistId(String defaultWatchlistId) {
        setDefaultWatchlistId(defaultWatchlistId);
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
        if (getDefaultWatchlistId() != null)
            sb.append("DefaultWatchlistId: ").append(getDefaultWatchlistId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WatchlistDetails == false)
            return false;
        WatchlistDetails other = (WatchlistDetails) obj;
        if (other.getDefaultWatchlistId() == null ^ this.getDefaultWatchlistId() == null)
            return false;
        if (other.getDefaultWatchlistId() != null && other.getDefaultWatchlistId().equals(this.getDefaultWatchlistId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultWatchlistId() == null) ? 0 : getDefaultWatchlistId().hashCode());
        return hashCode;
    }

    @Override
    public WatchlistDetails clone() {
        try {
            return (WatchlistDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.WatchlistDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
