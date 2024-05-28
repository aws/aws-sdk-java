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
 * The details of an asset published in an Amazon DataZone catalog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AssetListingDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetListingDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of an asset published in an Amazon DataZone catalog.
     * </p>
     */
    private String listingId;
    /**
     * <p>
     * The status of an asset published in an Amazon DataZone catalog.
     * </p>
     */
    private String listingStatus;

    /**
     * <p>
     * The identifier of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param listingId
     *        The identifier of an asset published in an Amazon DataZone catalog.
     */

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    /**
     * <p>
     * The identifier of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @return The identifier of an asset published in an Amazon DataZone catalog.
     */

    public String getListingId() {
        return this.listingId;
    }

    /**
     * <p>
     * The identifier of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param listingId
     *        The identifier of an asset published in an Amazon DataZone catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingDetails withListingId(String listingId) {
        setListingId(listingId);
        return this;
    }

    /**
     * <p>
     * The status of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param listingStatus
     *        The status of an asset published in an Amazon DataZone catalog.
     * @see ListingStatus
     */

    public void setListingStatus(String listingStatus) {
        this.listingStatus = listingStatus;
    }

    /**
     * <p>
     * The status of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @return The status of an asset published in an Amazon DataZone catalog.
     * @see ListingStatus
     */

    public String getListingStatus() {
        return this.listingStatus;
    }

    /**
     * <p>
     * The status of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param listingStatus
     *        The status of an asset published in an Amazon DataZone catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListingStatus
     */

    public AssetListingDetails withListingStatus(String listingStatus) {
        setListingStatus(listingStatus);
        return this;
    }

    /**
     * <p>
     * The status of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param listingStatus
     *        The status of an asset published in an Amazon DataZone catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListingStatus
     */

    public AssetListingDetails withListingStatus(ListingStatus listingStatus) {
        this.listingStatus = listingStatus.toString();
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
        if (getListingId() != null)
            sb.append("ListingId: ").append(getListingId()).append(",");
        if (getListingStatus() != null)
            sb.append("ListingStatus: ").append(getListingStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetListingDetails == false)
            return false;
        AssetListingDetails other = (AssetListingDetails) obj;
        if (other.getListingId() == null ^ this.getListingId() == null)
            return false;
        if (other.getListingId() != null && other.getListingId().equals(this.getListingId()) == false)
            return false;
        if (other.getListingStatus() == null ^ this.getListingStatus() == null)
            return false;
        if (other.getListingStatus() != null && other.getListingStatus().equals(this.getListingStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListingId() == null) ? 0 : getListingId().hashCode());
        hashCode = prime * hashCode + ((getListingStatus() == null) ? 0 : getListingStatus().hashCode());
        return hashCode;
    }

    @Override
    public AssetListingDetails clone() {
        try {
            return (AssetListingDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.AssetListingDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
