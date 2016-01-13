/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.directory.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Deletes the local side of an existing trust relationship between the
 * Microsoft AD in the AWS cloud and the external domain.
 */
public class DeleteTrustRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /** The Trust ID of the trust relationship to be deleted. */
    private String trustId;

    /**
     * The Trust ID of the trust relationship to be deleted.
     * 
     * @param trustId
     *        The Trust ID of the trust relationship to be deleted.
     */
    public void setTrustId(String trustId) {
        this.trustId = trustId;
    }

    /**
     * The Trust ID of the trust relationship to be deleted.
     * 
     * @return The Trust ID of the trust relationship to be deleted.
     */
    public String getTrustId() {
        return this.trustId;
    }

    /**
     * The Trust ID of the trust relationship to be deleted.
     * 
     * @param trustId
     *        The Trust ID of the trust relationship to be deleted.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DeleteTrustRequest withTrustId(String trustId) {
        setTrustId(trustId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTrustId() != null)
            sb.append("TrustId: " + getTrustId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTrustRequest == false)
            return false;
        DeleteTrustRequest other = (DeleteTrustRequest) obj;
        if (other.getTrustId() == null ^ this.getTrustId() == null)
            return false;
        if (other.getTrustId() != null
                && other.getTrustId().equals(this.getTrustId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTrustId() == null) ? 0 : getTrustId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTrustRequest clone() {
        return (DeleteTrustRequest) super.clone();
    }
}