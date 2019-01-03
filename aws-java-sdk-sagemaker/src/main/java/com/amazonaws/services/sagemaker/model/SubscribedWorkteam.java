/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a work team of a vendor that does the a labelling job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SubscribedWorkteam" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscribedWorkteam implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vendor that you have subscribed.
     * </p>
     */
    private String workteamArn;
    /**
     * <p>
     * The title of the service provided by the vendor in the Amazon Marketplace.
     * </p>
     */
    private String marketplaceTitle;
    /**
     * <p>
     * The name of the vendor in the Amazon Marketplace.
     * </p>
     */
    private String sellerName;
    /**
     * <p>
     * The description of the vendor from the Amazon Marketplace.
     * </p>
     */
    private String marketplaceDescription;
    /** <p/> */
    private String listingId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vendor that you have subscribed.
     * </p>
     * 
     * @param workteamArn
     *        The Amazon Resource Name (ARN) of the vendor that you have subscribed.
     */

    public void setWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vendor that you have subscribed.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the vendor that you have subscribed.
     */

    public String getWorkteamArn() {
        return this.workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vendor that you have subscribed.
     * </p>
     * 
     * @param workteamArn
     *        The Amazon Resource Name (ARN) of the vendor that you have subscribed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedWorkteam withWorkteamArn(String workteamArn) {
        setWorkteamArn(workteamArn);
        return this;
    }

    /**
     * <p>
     * The title of the service provided by the vendor in the Amazon Marketplace.
     * </p>
     * 
     * @param marketplaceTitle
     *        The title of the service provided by the vendor in the Amazon Marketplace.
     */

    public void setMarketplaceTitle(String marketplaceTitle) {
        this.marketplaceTitle = marketplaceTitle;
    }

    /**
     * <p>
     * The title of the service provided by the vendor in the Amazon Marketplace.
     * </p>
     * 
     * @return The title of the service provided by the vendor in the Amazon Marketplace.
     */

    public String getMarketplaceTitle() {
        return this.marketplaceTitle;
    }

    /**
     * <p>
     * The title of the service provided by the vendor in the Amazon Marketplace.
     * </p>
     * 
     * @param marketplaceTitle
     *        The title of the service provided by the vendor in the Amazon Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedWorkteam withMarketplaceTitle(String marketplaceTitle) {
        setMarketplaceTitle(marketplaceTitle);
        return this;
    }

    /**
     * <p>
     * The name of the vendor in the Amazon Marketplace.
     * </p>
     * 
     * @param sellerName
     *        The name of the vendor in the Amazon Marketplace.
     */

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    /**
     * <p>
     * The name of the vendor in the Amazon Marketplace.
     * </p>
     * 
     * @return The name of the vendor in the Amazon Marketplace.
     */

    public String getSellerName() {
        return this.sellerName;
    }

    /**
     * <p>
     * The name of the vendor in the Amazon Marketplace.
     * </p>
     * 
     * @param sellerName
     *        The name of the vendor in the Amazon Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedWorkteam withSellerName(String sellerName) {
        setSellerName(sellerName);
        return this;
    }

    /**
     * <p>
     * The description of the vendor from the Amazon Marketplace.
     * </p>
     * 
     * @param marketplaceDescription
     *        The description of the vendor from the Amazon Marketplace.
     */

    public void setMarketplaceDescription(String marketplaceDescription) {
        this.marketplaceDescription = marketplaceDescription;
    }

    /**
     * <p>
     * The description of the vendor from the Amazon Marketplace.
     * </p>
     * 
     * @return The description of the vendor from the Amazon Marketplace.
     */

    public String getMarketplaceDescription() {
        return this.marketplaceDescription;
    }

    /**
     * <p>
     * The description of the vendor from the Amazon Marketplace.
     * </p>
     * 
     * @param marketplaceDescription
     *        The description of the vendor from the Amazon Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedWorkteam withMarketplaceDescription(String marketplaceDescription) {
        setMarketplaceDescription(marketplaceDescription);
        return this;
    }

    /**
     * <p/>
     * 
     * @param listingId
     */

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getListingId() {
        return this.listingId;
    }

    /**
     * <p/>
     * 
     * @param listingId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedWorkteam withListingId(String listingId) {
        setListingId(listingId);
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
        if (getWorkteamArn() != null)
            sb.append("WorkteamArn: ").append(getWorkteamArn()).append(",");
        if (getMarketplaceTitle() != null)
            sb.append("MarketplaceTitle: ").append(getMarketplaceTitle()).append(",");
        if (getSellerName() != null)
            sb.append("SellerName: ").append(getSellerName()).append(",");
        if (getMarketplaceDescription() != null)
            sb.append("MarketplaceDescription: ").append(getMarketplaceDescription()).append(",");
        if (getListingId() != null)
            sb.append("ListingId: ").append(getListingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscribedWorkteam == false)
            return false;
        SubscribedWorkteam other = (SubscribedWorkteam) obj;
        if (other.getWorkteamArn() == null ^ this.getWorkteamArn() == null)
            return false;
        if (other.getWorkteamArn() != null && other.getWorkteamArn().equals(this.getWorkteamArn()) == false)
            return false;
        if (other.getMarketplaceTitle() == null ^ this.getMarketplaceTitle() == null)
            return false;
        if (other.getMarketplaceTitle() != null && other.getMarketplaceTitle().equals(this.getMarketplaceTitle()) == false)
            return false;
        if (other.getSellerName() == null ^ this.getSellerName() == null)
            return false;
        if (other.getSellerName() != null && other.getSellerName().equals(this.getSellerName()) == false)
            return false;
        if (other.getMarketplaceDescription() == null ^ this.getMarketplaceDescription() == null)
            return false;
        if (other.getMarketplaceDescription() != null && other.getMarketplaceDescription().equals(this.getMarketplaceDescription()) == false)
            return false;
        if (other.getListingId() == null ^ this.getListingId() == null)
            return false;
        if (other.getListingId() != null && other.getListingId().equals(this.getListingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkteamArn() == null) ? 0 : getWorkteamArn().hashCode());
        hashCode = prime * hashCode + ((getMarketplaceTitle() == null) ? 0 : getMarketplaceTitle().hashCode());
        hashCode = prime * hashCode + ((getSellerName() == null) ? 0 : getSellerName().hashCode());
        hashCode = prime * hashCode + ((getMarketplaceDescription() == null) ? 0 : getMarketplaceDescription().hashCode());
        hashCode = prime * hashCode + ((getListingId() == null) ? 0 : getListingId().hashCode());
        return hashCode;
    }

    @Override
    public SubscribedWorkteam clone() {
        try {
            return (SubscribedWorkteam) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.SubscribedWorkteamMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
