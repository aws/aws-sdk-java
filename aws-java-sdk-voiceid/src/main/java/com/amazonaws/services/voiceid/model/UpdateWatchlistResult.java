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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/UpdateWatchlist" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWatchlistResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about the updated watchlist.
     * </p>
     */
    private Watchlist watchlist;

    /**
     * <p>
     * Details about the updated watchlist.
     * </p>
     * 
     * @param watchlist
     *        Details about the updated watchlist.
     */

    public void setWatchlist(Watchlist watchlist) {
        this.watchlist = watchlist;
    }

    /**
     * <p>
     * Details about the updated watchlist.
     * </p>
     * 
     * @return Details about the updated watchlist.
     */

    public Watchlist getWatchlist() {
        return this.watchlist;
    }

    /**
     * <p>
     * Details about the updated watchlist.
     * </p>
     * 
     * @param watchlist
     *        Details about the updated watchlist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWatchlistResult withWatchlist(Watchlist watchlist) {
        setWatchlist(watchlist);
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
        if (getWatchlist() != null)
            sb.append("Watchlist: ").append(getWatchlist());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWatchlistResult == false)
            return false;
        UpdateWatchlistResult other = (UpdateWatchlistResult) obj;
        if (other.getWatchlist() == null ^ this.getWatchlist() == null)
            return false;
        if (other.getWatchlist() != null && other.getWatchlist().equals(this.getWatchlist()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWatchlist() == null) ? 0 : getWatchlist().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWatchlistResult clone() {
        try {
            return (UpdateWatchlistResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
