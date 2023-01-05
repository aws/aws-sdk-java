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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetThirdPartyFirewallAssociationStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetThirdPartyFirewallAssociationStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The current status for setting a Firewall Manager policy administrators account as an administrator of the
     * third-party firewall tenant.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONBOARDING</code> - The Firewall Manager policy administrator is being designated as a tenant
     * administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONBOARD_COMPLETE</code> - The Firewall Manager policy administrator is designated as a tenant
     * administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARDING</code> - The Firewall Manager policy administrator is being removed as a tenant administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARD_COMPLETE</code> - The Firewall Manager policy administrator has been removed as a tenant
     * administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_EXIST</code> - The Firewall Manager policy administrator doesn't exist as a tenant administrator.
     * </p>
     * </li>
     * </ul>
     */
    private String thirdPartyFirewallStatus;
    /**
     * <p>
     * The status for subscribing to the third-party firewall vendor in the Amazon Web Services Marketplace.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_SUBSCRIPTION</code> - The Firewall Manager policy administrator isn't subscribed to the third-party
     * firewall service in the Amazon Web Services Marketplace.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_COMPLETE</code> - The Firewall Manager policy administrator is in the process of subscribing to the
     * third-party firewall service in the Amazon Web Services Marketplace, but doesn't yet have an active subscription.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - The Firewall Manager policy administrator has an active subscription to the third-party
     * firewall service in the Amazon Web Services Marketplace.
     * </p>
     * </li>
     * </ul>
     */
    private String marketplaceOnboardingStatus;

    /**
     * <p>
     * The current status for setting a Firewall Manager policy administrators account as an administrator of the
     * third-party firewall tenant.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONBOARDING</code> - The Firewall Manager policy administrator is being designated as a tenant
     * administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONBOARD_COMPLETE</code> - The Firewall Manager policy administrator is designated as a tenant
     * administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARDING</code> - The Firewall Manager policy administrator is being removed as a tenant administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARD_COMPLETE</code> - The Firewall Manager policy administrator has been removed as a tenant
     * administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_EXIST</code> - The Firewall Manager policy administrator doesn't exist as a tenant administrator.
     * </p>
     * </li>
     * </ul>
     * 
     * @param thirdPartyFirewallStatus
     *        The current status for setting a Firewall Manager policy administrators account as an administrator of the
     *        third-party firewall tenant.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ONBOARDING</code> - The Firewall Manager policy administrator is being designated as a tenant
     *        administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ONBOARD_COMPLETE</code> - The Firewall Manager policy administrator is designated as a tenant
     *        administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFFBOARDING</code> - The Firewall Manager policy administrator is being removed as a tenant
     *        administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFFBOARD_COMPLETE</code> - The Firewall Manager policy administrator has been removed as a tenant
     *        administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_EXIST</code> - The Firewall Manager policy administrator doesn't exist as a tenant
     *        administrator.
     *        </p>
     *        </li>
     * @see ThirdPartyFirewallAssociationStatus
     */

    public void setThirdPartyFirewallStatus(String thirdPartyFirewallStatus) {
        this.thirdPartyFirewallStatus = thirdPartyFirewallStatus;
    }

    /**
     * <p>
     * The current status for setting a Firewall Manager policy administrators account as an administrator of the
     * third-party firewall tenant.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONBOARDING</code> - The Firewall Manager policy administrator is being designated as a tenant
     * administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONBOARD_COMPLETE</code> - The Firewall Manager policy administrator is designated as a tenant
     * administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARDING</code> - The Firewall Manager policy administrator is being removed as a tenant administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARD_COMPLETE</code> - The Firewall Manager policy administrator has been removed as a tenant
     * administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_EXIST</code> - The Firewall Manager policy administrator doesn't exist as a tenant administrator.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status for setting a Firewall Manager policy administrators account as an administrator of
     *         the third-party firewall tenant.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ONBOARDING</code> - The Firewall Manager policy administrator is being designated as a tenant
     *         administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ONBOARD_COMPLETE</code> - The Firewall Manager policy administrator is designated as a tenant
     *         administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OFFBOARDING</code> - The Firewall Manager policy administrator is being removed as a tenant
     *         administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OFFBOARD_COMPLETE</code> - The Firewall Manager policy administrator has been removed as a tenant
     *         administrator.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_EXIST</code> - The Firewall Manager policy administrator doesn't exist as a tenant
     *         administrator.
     *         </p>
     *         </li>
     * @see ThirdPartyFirewallAssociationStatus
     */

    public String getThirdPartyFirewallStatus() {
        return this.thirdPartyFirewallStatus;
    }

    /**
     * <p>
     * The current status for setting a Firewall Manager policy administrators account as an administrator of the
     * third-party firewall tenant.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONBOARDING</code> - The Firewall Manager policy administrator is being designated as a tenant
     * administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONBOARD_COMPLETE</code> - The Firewall Manager policy administrator is designated as a tenant
     * administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARDING</code> - The Firewall Manager policy administrator is being removed as a tenant administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARD_COMPLETE</code> - The Firewall Manager policy administrator has been removed as a tenant
     * administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_EXIST</code> - The Firewall Manager policy administrator doesn't exist as a tenant administrator.
     * </p>
     * </li>
     * </ul>
     * 
     * @param thirdPartyFirewallStatus
     *        The current status for setting a Firewall Manager policy administrators account as an administrator of the
     *        third-party firewall tenant.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ONBOARDING</code> - The Firewall Manager policy administrator is being designated as a tenant
     *        administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ONBOARD_COMPLETE</code> - The Firewall Manager policy administrator is designated as a tenant
     *        administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFFBOARDING</code> - The Firewall Manager policy administrator is being removed as a tenant
     *        administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFFBOARD_COMPLETE</code> - The Firewall Manager policy administrator has been removed as a tenant
     *        administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_EXIST</code> - The Firewall Manager policy administrator doesn't exist as a tenant
     *        administrator.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyFirewallAssociationStatus
     */

    public GetThirdPartyFirewallAssociationStatusResult withThirdPartyFirewallStatus(String thirdPartyFirewallStatus) {
        setThirdPartyFirewallStatus(thirdPartyFirewallStatus);
        return this;
    }

    /**
     * <p>
     * The current status for setting a Firewall Manager policy administrators account as an administrator of the
     * third-party firewall tenant.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ONBOARDING</code> - The Firewall Manager policy administrator is being designated as a tenant
     * administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ONBOARD_COMPLETE</code> - The Firewall Manager policy administrator is designated as a tenant
     * administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARDING</code> - The Firewall Manager policy administrator is being removed as a tenant administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OFFBOARD_COMPLETE</code> - The Firewall Manager policy administrator has been removed as a tenant
     * administrator.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_EXIST</code> - The Firewall Manager policy administrator doesn't exist as a tenant administrator.
     * </p>
     * </li>
     * </ul>
     * 
     * @param thirdPartyFirewallStatus
     *        The current status for setting a Firewall Manager policy administrators account as an administrator of the
     *        third-party firewall tenant.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ONBOARDING</code> - The Firewall Manager policy administrator is being designated as a tenant
     *        administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ONBOARD_COMPLETE</code> - The Firewall Manager policy administrator is designated as a tenant
     *        administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFFBOARDING</code> - The Firewall Manager policy administrator is being removed as a tenant
     *        administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OFFBOARD_COMPLETE</code> - The Firewall Manager policy administrator has been removed as a tenant
     *        administrator.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_EXIST</code> - The Firewall Manager policy administrator doesn't exist as a tenant
     *        administrator.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyFirewallAssociationStatus
     */

    public GetThirdPartyFirewallAssociationStatusResult withThirdPartyFirewallStatus(ThirdPartyFirewallAssociationStatus thirdPartyFirewallStatus) {
        this.thirdPartyFirewallStatus = thirdPartyFirewallStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status for subscribing to the third-party firewall vendor in the Amazon Web Services Marketplace.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_SUBSCRIPTION</code> - The Firewall Manager policy administrator isn't subscribed to the third-party
     * firewall service in the Amazon Web Services Marketplace.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_COMPLETE</code> - The Firewall Manager policy administrator is in the process of subscribing to the
     * third-party firewall service in the Amazon Web Services Marketplace, but doesn't yet have an active subscription.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - The Firewall Manager policy administrator has an active subscription to the third-party
     * firewall service in the Amazon Web Services Marketplace.
     * </p>
     * </li>
     * </ul>
     * 
     * @param marketplaceOnboardingStatus
     *        The status for subscribing to the third-party firewall vendor in the Amazon Web Services Marketplace.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NO_SUBSCRIPTION</code> - The Firewall Manager policy administrator isn't subscribed to the
     *        third-party firewall service in the Amazon Web Services Marketplace.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_COMPLETE</code> - The Firewall Manager policy administrator is in the process of subscribing to
     *        the third-party firewall service in the Amazon Web Services Marketplace, but doesn't yet have an active
     *        subscription.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETE</code> - The Firewall Manager policy administrator has an active subscription to the
     *        third-party firewall service in the Amazon Web Services Marketplace.
     *        </p>
     *        </li>
     * @see MarketplaceSubscriptionOnboardingStatus
     */

    public void setMarketplaceOnboardingStatus(String marketplaceOnboardingStatus) {
        this.marketplaceOnboardingStatus = marketplaceOnboardingStatus;
    }

    /**
     * <p>
     * The status for subscribing to the third-party firewall vendor in the Amazon Web Services Marketplace.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_SUBSCRIPTION</code> - The Firewall Manager policy administrator isn't subscribed to the third-party
     * firewall service in the Amazon Web Services Marketplace.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_COMPLETE</code> - The Firewall Manager policy administrator is in the process of subscribing to the
     * third-party firewall service in the Amazon Web Services Marketplace, but doesn't yet have an active subscription.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - The Firewall Manager policy administrator has an active subscription to the third-party
     * firewall service in the Amazon Web Services Marketplace.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status for subscribing to the third-party firewall vendor in the Amazon Web Services Marketplace.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NO_SUBSCRIPTION</code> - The Firewall Manager policy administrator isn't subscribed to the
     *         third-party firewall service in the Amazon Web Services Marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_COMPLETE</code> - The Firewall Manager policy administrator is in the process of subscribing to
     *         the third-party firewall service in the Amazon Web Services Marketplace, but doesn't yet have an active
     *         subscription.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETE</code> - The Firewall Manager policy administrator has an active subscription to the
     *         third-party firewall service in the Amazon Web Services Marketplace.
     *         </p>
     *         </li>
     * @see MarketplaceSubscriptionOnboardingStatus
     */

    public String getMarketplaceOnboardingStatus() {
        return this.marketplaceOnboardingStatus;
    }

    /**
     * <p>
     * The status for subscribing to the third-party firewall vendor in the Amazon Web Services Marketplace.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_SUBSCRIPTION</code> - The Firewall Manager policy administrator isn't subscribed to the third-party
     * firewall service in the Amazon Web Services Marketplace.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_COMPLETE</code> - The Firewall Manager policy administrator is in the process of subscribing to the
     * third-party firewall service in the Amazon Web Services Marketplace, but doesn't yet have an active subscription.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - The Firewall Manager policy administrator has an active subscription to the third-party
     * firewall service in the Amazon Web Services Marketplace.
     * </p>
     * </li>
     * </ul>
     * 
     * @param marketplaceOnboardingStatus
     *        The status for subscribing to the third-party firewall vendor in the Amazon Web Services Marketplace.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NO_SUBSCRIPTION</code> - The Firewall Manager policy administrator isn't subscribed to the
     *        third-party firewall service in the Amazon Web Services Marketplace.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_COMPLETE</code> - The Firewall Manager policy administrator is in the process of subscribing to
     *        the third-party firewall service in the Amazon Web Services Marketplace, but doesn't yet have an active
     *        subscription.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETE</code> - The Firewall Manager policy administrator has an active subscription to the
     *        third-party firewall service in the Amazon Web Services Marketplace.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketplaceSubscriptionOnboardingStatus
     */

    public GetThirdPartyFirewallAssociationStatusResult withMarketplaceOnboardingStatus(String marketplaceOnboardingStatus) {
        setMarketplaceOnboardingStatus(marketplaceOnboardingStatus);
        return this;
    }

    /**
     * <p>
     * The status for subscribing to the third-party firewall vendor in the Amazon Web Services Marketplace.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_SUBSCRIPTION</code> - The Firewall Manager policy administrator isn't subscribed to the third-party
     * firewall service in the Amazon Web Services Marketplace.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_COMPLETE</code> - The Firewall Manager policy administrator is in the process of subscribing to the
     * third-party firewall service in the Amazon Web Services Marketplace, but doesn't yet have an active subscription.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - The Firewall Manager policy administrator has an active subscription to the third-party
     * firewall service in the Amazon Web Services Marketplace.
     * </p>
     * </li>
     * </ul>
     * 
     * @param marketplaceOnboardingStatus
     *        The status for subscribing to the third-party firewall vendor in the Amazon Web Services Marketplace.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NO_SUBSCRIPTION</code> - The Firewall Manager policy administrator isn't subscribed to the
     *        third-party firewall service in the Amazon Web Services Marketplace.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_COMPLETE</code> - The Firewall Manager policy administrator is in the process of subscribing to
     *        the third-party firewall service in the Amazon Web Services Marketplace, but doesn't yet have an active
     *        subscription.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETE</code> - The Firewall Manager policy administrator has an active subscription to the
     *        third-party firewall service in the Amazon Web Services Marketplace.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketplaceSubscriptionOnboardingStatus
     */

    public GetThirdPartyFirewallAssociationStatusResult withMarketplaceOnboardingStatus(MarketplaceSubscriptionOnboardingStatus marketplaceOnboardingStatus) {
        this.marketplaceOnboardingStatus = marketplaceOnboardingStatus.toString();
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
        if (getThirdPartyFirewallStatus() != null)
            sb.append("ThirdPartyFirewallStatus: ").append(getThirdPartyFirewallStatus()).append(",");
        if (getMarketplaceOnboardingStatus() != null)
            sb.append("MarketplaceOnboardingStatus: ").append(getMarketplaceOnboardingStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetThirdPartyFirewallAssociationStatusResult == false)
            return false;
        GetThirdPartyFirewallAssociationStatusResult other = (GetThirdPartyFirewallAssociationStatusResult) obj;
        if (other.getThirdPartyFirewallStatus() == null ^ this.getThirdPartyFirewallStatus() == null)
            return false;
        if (other.getThirdPartyFirewallStatus() != null && other.getThirdPartyFirewallStatus().equals(this.getThirdPartyFirewallStatus()) == false)
            return false;
        if (other.getMarketplaceOnboardingStatus() == null ^ this.getMarketplaceOnboardingStatus() == null)
            return false;
        if (other.getMarketplaceOnboardingStatus() != null && other.getMarketplaceOnboardingStatus().equals(this.getMarketplaceOnboardingStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThirdPartyFirewallStatus() == null) ? 0 : getThirdPartyFirewallStatus().hashCode());
        hashCode = prime * hashCode + ((getMarketplaceOnboardingStatus() == null) ? 0 : getMarketplaceOnboardingStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetThirdPartyFirewallAssociationStatusResult clone() {
        try {
            return (GetThirdPartyFirewallAssociationStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
