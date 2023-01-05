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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateSiteAddress" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSiteAddressRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the site.
     * </p>
     */
    private String siteId;
    /**
     * <p>
     * The type of the address.
     * </p>
     */
    private String addressType;
    /**
     * <p>
     * The address for the site.
     * </p>
     */
    private Address address;

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the site.
     * </p>
     * 
     * @param siteId
     *        The ID or the Amazon Resource Name (ARN) of the site.
     */

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the site.
     * </p>
     * 
     * @return The ID or the Amazon Resource Name (ARN) of the site.
     */

    public String getSiteId() {
        return this.siteId;
    }

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the site.
     * </p>
     * 
     * @param siteId
     *        The ID or the Amazon Resource Name (ARN) of the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSiteAddressRequest withSiteId(String siteId) {
        setSiteId(siteId);
        return this;
    }

    /**
     * <p>
     * The type of the address.
     * </p>
     * 
     * @param addressType
     *        The type of the address.
     * @see AddressType
     */

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    /**
     * <p>
     * The type of the address.
     * </p>
     * 
     * @return The type of the address.
     * @see AddressType
     */

    public String getAddressType() {
        return this.addressType;
    }

    /**
     * <p>
     * The type of the address.
     * </p>
     * 
     * @param addressType
     *        The type of the address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressType
     */

    public UpdateSiteAddressRequest withAddressType(String addressType) {
        setAddressType(addressType);
        return this;
    }

    /**
     * <p>
     * The type of the address.
     * </p>
     * 
     * @param addressType
     *        The type of the address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressType
     */

    public UpdateSiteAddressRequest withAddressType(AddressType addressType) {
        this.addressType = addressType.toString();
        return this;
    }

    /**
     * <p>
     * The address for the site.
     * </p>
     * 
     * @param address
     *        The address for the site.
     */

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * <p>
     * The address for the site.
     * </p>
     * 
     * @return The address for the site.
     */

    public Address getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The address for the site.
     * </p>
     * 
     * @param address
     *        The address for the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSiteAddressRequest withAddress(Address address) {
        setAddress(address);
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
        if (getSiteId() != null)
            sb.append("SiteId: ").append(getSiteId()).append(",");
        if (getAddressType() != null)
            sb.append("AddressType: ").append(getAddressType()).append(",");
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSiteAddressRequest == false)
            return false;
        UpdateSiteAddressRequest other = (UpdateSiteAddressRequest) obj;
        if (other.getSiteId() == null ^ this.getSiteId() == null)
            return false;
        if (other.getSiteId() != null && other.getSiteId().equals(this.getSiteId()) == false)
            return false;
        if (other.getAddressType() == null ^ this.getAddressType() == null)
            return false;
        if (other.getAddressType() != null && other.getAddressType().equals(this.getAddressType()) == false)
            return false;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSiteId() == null) ? 0 : getSiteId().hashCode());
        hashCode = prime * hashCode + ((getAddressType() == null) ? 0 : getAddressType().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSiteAddressRequest clone() {
        return (UpdateSiteAddressRequest) super.clone();
    }

}
