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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties of a managed product, such as an Amazon Web Services Managed Rules rule group or an Amazon Web
 * Services Marketplace managed rule group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ManagedProductDescriptor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedProductDescriptor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the managed rule group vendor. You use this, along with the rule group name, to identify a rule
     * group.
     * </p>
     */
    private String vendorName;
    /**
     * <p>
     * The name of the managed rule group. For example, <code>AWSManagedRulesAnonymousIpList</code> or
     * <code>AWSManagedRulesATPRuleSet</code>.
     * </p>
     */
    private String managedRuleSetName;
    /**
     * <p>
     * A unique identifier for the rule group. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * For Amazon Web Services Marketplace managed rule groups only, the link to the rule group product page.
     * </p>
     */
    private String productLink;
    /**
     * <p>
     * The display name for the managed rule group. For example, <code>Anonymous IP list</code> or
     * <code>Account takeover prevention</code>.
     * </p>
     */
    private String productTitle;
    /**
     * <p>
     * A short description of the managed rule group.
     * </p>
     */
    private String productDescription;
    /**
     * <p>
     * The Amazon resource name (ARN) of the Amazon Simple Notification Service SNS topic that's used to provide
     * notification of changes to the managed rule group. You can subscribe to the SNS topic to receive notifications
     * when the managed rule group is modified, such as for new versions and for version expiration. For more
     * information, see the <a href="https://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon Simple Notification
     * Service Developer Guide</a>.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * Indicates whether the rule group is versioned.
     * </p>
     */
    private Boolean isVersioningSupported;
    /**
     * <p>
     * Indicates whether the rule group provides an advanced set of protections, such as the the Amazon Web Services
     * Managed Rules rule groups that are used for WAF intelligent threat mitigation.
     * </p>
     */
    private Boolean isAdvancedManagedRuleSet;

    /**
     * <p>
     * The name of the managed rule group vendor. You use this, along with the rule group name, to identify a rule
     * group.
     * </p>
     * 
     * @param vendorName
     *        The name of the managed rule group vendor. You use this, along with the rule group name, to identify a
     *        rule group.
     */

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    /**
     * <p>
     * The name of the managed rule group vendor. You use this, along with the rule group name, to identify a rule
     * group.
     * </p>
     * 
     * @return The name of the managed rule group vendor. You use this, along with the rule group name, to identify a
     *         rule group.
     */

    public String getVendorName() {
        return this.vendorName;
    }

    /**
     * <p>
     * The name of the managed rule group vendor. You use this, along with the rule group name, to identify a rule
     * group.
     * </p>
     * 
     * @param vendorName
     *        The name of the managed rule group vendor. You use this, along with the rule group name, to identify a
     *        rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedProductDescriptor withVendorName(String vendorName) {
        setVendorName(vendorName);
        return this;
    }

    /**
     * <p>
     * The name of the managed rule group. For example, <code>AWSManagedRulesAnonymousIpList</code> or
     * <code>AWSManagedRulesATPRuleSet</code>.
     * </p>
     * 
     * @param managedRuleSetName
     *        The name of the managed rule group. For example, <code>AWSManagedRulesAnonymousIpList</code> or
     *        <code>AWSManagedRulesATPRuleSet</code>.
     */

    public void setManagedRuleSetName(String managedRuleSetName) {
        this.managedRuleSetName = managedRuleSetName;
    }

    /**
     * <p>
     * The name of the managed rule group. For example, <code>AWSManagedRulesAnonymousIpList</code> or
     * <code>AWSManagedRulesATPRuleSet</code>.
     * </p>
     * 
     * @return The name of the managed rule group. For example, <code>AWSManagedRulesAnonymousIpList</code> or
     *         <code>AWSManagedRulesATPRuleSet</code>.
     */

    public String getManagedRuleSetName() {
        return this.managedRuleSetName;
    }

    /**
     * <p>
     * The name of the managed rule group. For example, <code>AWSManagedRulesAnonymousIpList</code> or
     * <code>AWSManagedRulesATPRuleSet</code>.
     * </p>
     * 
     * @param managedRuleSetName
     *        The name of the managed rule group. For example, <code>AWSManagedRulesAnonymousIpList</code> or
     *        <code>AWSManagedRulesATPRuleSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedProductDescriptor withManagedRuleSetName(String managedRuleSetName) {
        setManagedRuleSetName(managedRuleSetName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the rule group. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @param productId
     *        A unique identifier for the rule group. This ID is returned in the responses to create and list commands.
     *        You provide it to operations like update and delete.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * A unique identifier for the rule group. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @return A unique identifier for the rule group. This ID is returned in the responses to create and list commands.
     *         You provide it to operations like update and delete.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * A unique identifier for the rule group. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @param productId
     *        A unique identifier for the rule group. This ID is returned in the responses to create and list commands.
     *        You provide it to operations like update and delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedProductDescriptor withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * For Amazon Web Services Marketplace managed rule groups only, the link to the rule group product page.
     * </p>
     * 
     * @param productLink
     *        For Amazon Web Services Marketplace managed rule groups only, the link to the rule group product page.
     */

    public void setProductLink(String productLink) {
        this.productLink = productLink;
    }

    /**
     * <p>
     * For Amazon Web Services Marketplace managed rule groups only, the link to the rule group product page.
     * </p>
     * 
     * @return For Amazon Web Services Marketplace managed rule groups only, the link to the rule group product page.
     */

    public String getProductLink() {
        return this.productLink;
    }

    /**
     * <p>
     * For Amazon Web Services Marketplace managed rule groups only, the link to the rule group product page.
     * </p>
     * 
     * @param productLink
     *        For Amazon Web Services Marketplace managed rule groups only, the link to the rule group product page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedProductDescriptor withProductLink(String productLink) {
        setProductLink(productLink);
        return this;
    }

    /**
     * <p>
     * The display name for the managed rule group. For example, <code>Anonymous IP list</code> or
     * <code>Account takeover prevention</code>.
     * </p>
     * 
     * @param productTitle
     *        The display name for the managed rule group. For example, <code>Anonymous IP list</code> or
     *        <code>Account takeover prevention</code>.
     */

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    /**
     * <p>
     * The display name for the managed rule group. For example, <code>Anonymous IP list</code> or
     * <code>Account takeover prevention</code>.
     * </p>
     * 
     * @return The display name for the managed rule group. For example, <code>Anonymous IP list</code> or
     *         <code>Account takeover prevention</code>.
     */

    public String getProductTitle() {
        return this.productTitle;
    }

    /**
     * <p>
     * The display name for the managed rule group. For example, <code>Anonymous IP list</code> or
     * <code>Account takeover prevention</code>.
     * </p>
     * 
     * @param productTitle
     *        The display name for the managed rule group. For example, <code>Anonymous IP list</code> or
     *        <code>Account takeover prevention</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedProductDescriptor withProductTitle(String productTitle) {
        setProductTitle(productTitle);
        return this;
    }

    /**
     * <p>
     * A short description of the managed rule group.
     * </p>
     * 
     * @param productDescription
     *        A short description of the managed rule group.
     */

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * A short description of the managed rule group.
     * </p>
     * 
     * @return A short description of the managed rule group.
     */

    public String getProductDescription() {
        return this.productDescription;
    }

    /**
     * <p>
     * A short description of the managed rule group.
     * </p>
     * 
     * @param productDescription
     *        A short description of the managed rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedProductDescriptor withProductDescription(String productDescription) {
        setProductDescription(productDescription);
        return this;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the Amazon Simple Notification Service SNS topic that's used to provide
     * notification of changes to the managed rule group. You can subscribe to the SNS topic to receive notifications
     * when the managed rule group is modified, such as for new versions and for version expiration. For more
     * information, see the <a href="https://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon Simple Notification
     * Service Developer Guide</a>.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon resource name (ARN) of the Amazon Simple Notification Service SNS topic that's used to provide
     *        notification of changes to the managed rule group. You can subscribe to the SNS topic to receive
     *        notifications when the managed rule group is modified, such as for new versions and for version
     *        expiration. For more information, see the <a
     *        href="https://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon Simple Notification Service Developer
     *        Guide</a>.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the Amazon Simple Notification Service SNS topic that's used to provide
     * notification of changes to the managed rule group. You can subscribe to the SNS topic to receive notifications
     * when the managed rule group is modified, such as for new versions and for version expiration. For more
     * information, see the <a href="https://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon Simple Notification
     * Service Developer Guide</a>.
     * </p>
     * 
     * @return The Amazon resource name (ARN) of the Amazon Simple Notification Service SNS topic that's used to provide
     *         notification of changes to the managed rule group. You can subscribe to the SNS topic to receive
     *         notifications when the managed rule group is modified, such as for new versions and for version
     *         expiration. For more information, see the <a
     *         href="https://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon Simple Notification Service
     *         Developer Guide</a>.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the Amazon Simple Notification Service SNS topic that's used to provide
     * notification of changes to the managed rule group. You can subscribe to the SNS topic to receive notifications
     * when the managed rule group is modified, such as for new versions and for version expiration. For more
     * information, see the <a href="https://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon Simple Notification
     * Service Developer Guide</a>.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon resource name (ARN) of the Amazon Simple Notification Service SNS topic that's used to provide
     *        notification of changes to the managed rule group. You can subscribe to the SNS topic to receive
     *        notifications when the managed rule group is modified, such as for new versions and for version
     *        expiration. For more information, see the <a
     *        href="https://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon Simple Notification Service Developer
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedProductDescriptor withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule group is versioned.
     * </p>
     * 
     * @param isVersioningSupported
     *        Indicates whether the rule group is versioned.
     */

    public void setIsVersioningSupported(Boolean isVersioningSupported) {
        this.isVersioningSupported = isVersioningSupported;
    }

    /**
     * <p>
     * Indicates whether the rule group is versioned.
     * </p>
     * 
     * @return Indicates whether the rule group is versioned.
     */

    public Boolean getIsVersioningSupported() {
        return this.isVersioningSupported;
    }

    /**
     * <p>
     * Indicates whether the rule group is versioned.
     * </p>
     * 
     * @param isVersioningSupported
     *        Indicates whether the rule group is versioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedProductDescriptor withIsVersioningSupported(Boolean isVersioningSupported) {
        setIsVersioningSupported(isVersioningSupported);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule group is versioned.
     * </p>
     * 
     * @return Indicates whether the rule group is versioned.
     */

    public Boolean isVersioningSupported() {
        return this.isVersioningSupported;
    }

    /**
     * <p>
     * Indicates whether the rule group provides an advanced set of protections, such as the the Amazon Web Services
     * Managed Rules rule groups that are used for WAF intelligent threat mitigation.
     * </p>
     * 
     * @param isAdvancedManagedRuleSet
     *        Indicates whether the rule group provides an advanced set of protections, such as the the Amazon Web
     *        Services Managed Rules rule groups that are used for WAF intelligent threat mitigation.
     */

    public void setIsAdvancedManagedRuleSet(Boolean isAdvancedManagedRuleSet) {
        this.isAdvancedManagedRuleSet = isAdvancedManagedRuleSet;
    }

    /**
     * <p>
     * Indicates whether the rule group provides an advanced set of protections, such as the the Amazon Web Services
     * Managed Rules rule groups that are used for WAF intelligent threat mitigation.
     * </p>
     * 
     * @return Indicates whether the rule group provides an advanced set of protections, such as the the Amazon Web
     *         Services Managed Rules rule groups that are used for WAF intelligent threat mitigation.
     */

    public Boolean getIsAdvancedManagedRuleSet() {
        return this.isAdvancedManagedRuleSet;
    }

    /**
     * <p>
     * Indicates whether the rule group provides an advanced set of protections, such as the the Amazon Web Services
     * Managed Rules rule groups that are used for WAF intelligent threat mitigation.
     * </p>
     * 
     * @param isAdvancedManagedRuleSet
     *        Indicates whether the rule group provides an advanced set of protections, such as the the Amazon Web
     *        Services Managed Rules rule groups that are used for WAF intelligent threat mitigation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedProductDescriptor withIsAdvancedManagedRuleSet(Boolean isAdvancedManagedRuleSet) {
        setIsAdvancedManagedRuleSet(isAdvancedManagedRuleSet);
        return this;
    }

    /**
     * <p>
     * Indicates whether the rule group provides an advanced set of protections, such as the the Amazon Web Services
     * Managed Rules rule groups that are used for WAF intelligent threat mitigation.
     * </p>
     * 
     * @return Indicates whether the rule group provides an advanced set of protections, such as the the Amazon Web
     *         Services Managed Rules rule groups that are used for WAF intelligent threat mitigation.
     */

    public Boolean isAdvancedManagedRuleSet() {
        return this.isAdvancedManagedRuleSet;
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
        if (getVendorName() != null)
            sb.append("VendorName: ").append(getVendorName()).append(",");
        if (getManagedRuleSetName() != null)
            sb.append("ManagedRuleSetName: ").append(getManagedRuleSetName()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getProductLink() != null)
            sb.append("ProductLink: ").append(getProductLink()).append(",");
        if (getProductTitle() != null)
            sb.append("ProductTitle: ").append(getProductTitle()).append(",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: ").append(getProductDescription()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getIsVersioningSupported() != null)
            sb.append("IsVersioningSupported: ").append(getIsVersioningSupported()).append(",");
        if (getIsAdvancedManagedRuleSet() != null)
            sb.append("IsAdvancedManagedRuleSet: ").append(getIsAdvancedManagedRuleSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedProductDescriptor == false)
            return false;
        ManagedProductDescriptor other = (ManagedProductDescriptor) obj;
        if (other.getVendorName() == null ^ this.getVendorName() == null)
            return false;
        if (other.getVendorName() != null && other.getVendorName().equals(this.getVendorName()) == false)
            return false;
        if (other.getManagedRuleSetName() == null ^ this.getManagedRuleSetName() == null)
            return false;
        if (other.getManagedRuleSetName() != null && other.getManagedRuleSetName().equals(this.getManagedRuleSetName()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProductLink() == null ^ this.getProductLink() == null)
            return false;
        if (other.getProductLink() != null && other.getProductLink().equals(this.getProductLink()) == false)
            return false;
        if (other.getProductTitle() == null ^ this.getProductTitle() == null)
            return false;
        if (other.getProductTitle() != null && other.getProductTitle().equals(this.getProductTitle()) == false)
            return false;
        if (other.getProductDescription() == null ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getIsVersioningSupported() == null ^ this.getIsVersioningSupported() == null)
            return false;
        if (other.getIsVersioningSupported() != null && other.getIsVersioningSupported().equals(this.getIsVersioningSupported()) == false)
            return false;
        if (other.getIsAdvancedManagedRuleSet() == null ^ this.getIsAdvancedManagedRuleSet() == null)
            return false;
        if (other.getIsAdvancedManagedRuleSet() != null && other.getIsAdvancedManagedRuleSet().equals(this.getIsAdvancedManagedRuleSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVendorName() == null) ? 0 : getVendorName().hashCode());
        hashCode = prime * hashCode + ((getManagedRuleSetName() == null) ? 0 : getManagedRuleSetName().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getProductLink() == null) ? 0 : getProductLink().hashCode());
        hashCode = prime * hashCode + ((getProductTitle() == null) ? 0 : getProductTitle().hashCode());
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getIsVersioningSupported() == null) ? 0 : getIsVersioningSupported().hashCode());
        hashCode = prime * hashCode + ((getIsAdvancedManagedRuleSet() == null) ? 0 : getIsAdvancedManagedRuleSet().hashCode());
        return hashCode;
    }

    @Override
    public ManagedProductDescriptor clone() {
        try {
            return (ManagedProductDescriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ManagedProductDescriptorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
