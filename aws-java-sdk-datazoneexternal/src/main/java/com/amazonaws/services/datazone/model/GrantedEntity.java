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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a listing for which a subscription is granted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GrantedEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrantedEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The listing for which a subscription is granted.
     * </p>
     */
    private ListingRevision listing;

    /**
     * <p>
     * The listing for which a subscription is granted.
     * </p>
     * 
     * @param listing
     *        The listing for which a subscription is granted.
     */

    public void setListing(ListingRevision listing) {
        this.listing = listing;
    }

    /**
     * <p>
     * The listing for which a subscription is granted.
     * </p>
     * 
     * @return The listing for which a subscription is granted.
     */

    public ListingRevision getListing() {
        return this.listing;
    }

    /**
     * <p>
     * The listing for which a subscription is granted.
     * </p>
     * 
     * @param listing
     *        The listing for which a subscription is granted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantedEntity withListing(ListingRevision listing) {
        setListing(listing);
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
        if (getListing() != null)
            sb.append("Listing: ").append(getListing());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GrantedEntity == false)
            return false;
        GrantedEntity other = (GrantedEntity) obj;
        if (other.getListing() == null ^ this.getListing() == null)
            return false;
        if (other.getListing() != null && other.getListing().equals(this.getListing()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListing() == null) ? 0 : getListing().hashCode());
        return hashCode;
    }

    @Override
    public GrantedEntity clone() {
        try {
            return (GrantedEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.GrantedEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
