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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An EKS Anywhere subscription authorizing the customer to support for licensed clusters and access to EKS Anywhere
 * Curated Packages.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/EksAnywhereSubscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksAnywhereSubscription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * UUID identifying a subscription.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the subscription.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Unix timestamp in seconds for when the subscription was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp in seconds for when the subscription is effective.
     * </p>
     */
    private java.util.Date effectiveDate;
    /**
     * <p>
     * The Unix timestamp in seconds for when the subscription will expire or auto renew, depending on the auto renew
     * configuration of the subscription object.
     * </p>
     */
    private java.util.Date expirationDate;
    /**
     * <p>
     * The number of licenses included in a subscription. Valid values are between 1 and 100.
     * </p>
     */
    private Integer licenseQuantity;
    /**
     * <p>
     * The type of licenses included in the subscription. Valid value is CLUSTER. With the CLUSTER license type, each
     * license covers support for a single EKS Anywhere cluster.
     * </p>
     */
    private String licenseType;
    /**
     * <p>
     * An EksAnywhereSubscriptionTerm object.
     * </p>
     */
    private EksAnywhereSubscriptionTerm term;
    /**
     * <p>
     * The status of a subscription.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A boolean indicating whether or not a subscription will auto renew when it expires.
     * </p>
     */
    private Boolean autoRenew;
    /**
     * <p>
     * Amazon Web Services License Manager ARN associated with the subscription.
     * </p>
     */
    private java.util.List<String> licenseArns;
    /**
     * <p>
     * The metadata for a subscription to assist with categorization and organization. Each tag consists of a key and an
     * optional value. Subscription tags do not propagate to any other resources associated with the subscription.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * UUID identifying a subscription.
     * </p>
     * 
     * @param id
     *        UUID identifying a subscription.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * UUID identifying a subscription.
     * </p>
     * 
     * @return UUID identifying a subscription.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * UUID identifying a subscription.
     * </p>
     * 
     * @param id
     *        UUID identifying a subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAnywhereSubscription withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the subscription.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the subscription.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the subscription.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the subscription.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the subscription.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAnywhereSubscription withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp in seconds for when the subscription was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp in seconds for when the subscription was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp in seconds for when the subscription was created.
     * </p>
     * 
     * @return The Unix timestamp in seconds for when the subscription was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp in seconds for when the subscription was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp in seconds for when the subscription was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAnywhereSubscription withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp in seconds for when the subscription is effective.
     * </p>
     * 
     * @param effectiveDate
     *        The Unix timestamp in seconds for when the subscription is effective.
     */

    public void setEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * <p>
     * The Unix timestamp in seconds for when the subscription is effective.
     * </p>
     * 
     * @return The Unix timestamp in seconds for when the subscription is effective.
     */

    public java.util.Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * <p>
     * The Unix timestamp in seconds for when the subscription is effective.
     * </p>
     * 
     * @param effectiveDate
     *        The Unix timestamp in seconds for when the subscription is effective.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAnywhereSubscription withEffectiveDate(java.util.Date effectiveDate) {
        setEffectiveDate(effectiveDate);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp in seconds for when the subscription will expire or auto renew, depending on the auto renew
     * configuration of the subscription object.
     * </p>
     * 
     * @param expirationDate
     *        The Unix timestamp in seconds for when the subscription will expire or auto renew, depending on the auto
     *        renew configuration of the subscription object.
     */

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The Unix timestamp in seconds for when the subscription will expire or auto renew, depending on the auto renew
     * configuration of the subscription object.
     * </p>
     * 
     * @return The Unix timestamp in seconds for when the subscription will expire or auto renew, depending on the auto
     *         renew configuration of the subscription object.
     */

    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * <p>
     * The Unix timestamp in seconds for when the subscription will expire or auto renew, depending on the auto renew
     * configuration of the subscription object.
     * </p>
     * 
     * @param expirationDate
     *        The Unix timestamp in seconds for when the subscription will expire or auto renew, depending on the auto
     *        renew configuration of the subscription object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAnywhereSubscription withExpirationDate(java.util.Date expirationDate) {
        setExpirationDate(expirationDate);
        return this;
    }

    /**
     * <p>
     * The number of licenses included in a subscription. Valid values are between 1 and 100.
     * </p>
     * 
     * @param licenseQuantity
     *        The number of licenses included in a subscription. Valid values are between 1 and 100.
     */

    public void setLicenseQuantity(Integer licenseQuantity) {
        this.licenseQuantity = licenseQuantity;
    }

    /**
     * <p>
     * The number of licenses included in a subscription. Valid values are between 1 and 100.
     * </p>
     * 
     * @return The number of licenses included in a subscription. Valid values are between 1 and 100.
     */

    public Integer getLicenseQuantity() {
        return this.licenseQuantity;
    }

    /**
     * <p>
     * The number of licenses included in a subscription. Valid values are between 1 and 100.
     * </p>
     * 
     * @param licenseQuantity
     *        The number of licenses included in a subscription. Valid values are between 1 and 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAnywhereSubscription withLicenseQuantity(Integer licenseQuantity) {
        setLicenseQuantity(licenseQuantity);
        return this;
    }

    /**
     * <p>
     * The type of licenses included in the subscription. Valid value is CLUSTER. With the CLUSTER license type, each
     * license covers support for a single EKS Anywhere cluster.
     * </p>
     * 
     * @param licenseType
     *        The type of licenses included in the subscription. Valid value is CLUSTER. With the CLUSTER license type,
     *        each license covers support for a single EKS Anywhere cluster.
     * @see EksAnywhereSubscriptionLicenseType
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The type of licenses included in the subscription. Valid value is CLUSTER. With the CLUSTER license type, each
     * license covers support for a single EKS Anywhere cluster.
     * </p>
     * 
     * @return The type of licenses included in the subscription. Valid value is CLUSTER. With the CLUSTER license type,
     *         each license covers support for a single EKS Anywhere cluster.
     * @see EksAnywhereSubscriptionLicenseType
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * <p>
     * The type of licenses included in the subscription. Valid value is CLUSTER. With the CLUSTER license type, each
     * license covers support for a single EKS Anywhere cluster.
     * </p>
     * 
     * @param licenseType
     *        The type of licenses included in the subscription. Valid value is CLUSTER. With the CLUSTER license type,
     *        each license covers support for a single EKS Anywhere cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EksAnywhereSubscriptionLicenseType
     */

    public EksAnywhereSubscription withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * <p>
     * The type of licenses included in the subscription. Valid value is CLUSTER. With the CLUSTER license type, each
     * license covers support for a single EKS Anywhere cluster.
     * </p>
     * 
     * @param licenseType
     *        The type of licenses included in the subscription. Valid value is CLUSTER. With the CLUSTER license type,
     *        each license covers support for a single EKS Anywhere cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EksAnywhereSubscriptionLicenseType
     */

    public EksAnywhereSubscription withLicenseType(EksAnywhereSubscriptionLicenseType licenseType) {
        this.licenseType = licenseType.toString();
        return this;
    }

    /**
     * <p>
     * An EksAnywhereSubscriptionTerm object.
     * </p>
     * 
     * @param term
     *        An EksAnywhereSubscriptionTerm object.
     */

    public void setTerm(EksAnywhereSubscriptionTerm term) {
        this.term = term;
    }

    /**
     * <p>
     * An EksAnywhereSubscriptionTerm object.
     * </p>
     * 
     * @return An EksAnywhereSubscriptionTerm object.
     */

    public EksAnywhereSubscriptionTerm getTerm() {
        return this.term;
    }

    /**
     * <p>
     * An EksAnywhereSubscriptionTerm object.
     * </p>
     * 
     * @param term
     *        An EksAnywhereSubscriptionTerm object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAnywhereSubscription withTerm(EksAnywhereSubscriptionTerm term) {
        setTerm(term);
        return this;
    }

    /**
     * <p>
     * The status of a subscription.
     * </p>
     * 
     * @param status
     *        The status of a subscription.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a subscription.
     * </p>
     * 
     * @return The status of a subscription.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a subscription.
     * </p>
     * 
     * @param status
     *        The status of a subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAnywhereSubscription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether or not a subscription will auto renew when it expires.
     * </p>
     * 
     * @param autoRenew
     *        A boolean indicating whether or not a subscription will auto renew when it expires.
     */

    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * <p>
     * A boolean indicating whether or not a subscription will auto renew when it expires.
     * </p>
     * 
     * @return A boolean indicating whether or not a subscription will auto renew when it expires.
     */

    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * A boolean indicating whether or not a subscription will auto renew when it expires.
     * </p>
     * 
     * @param autoRenew
     *        A boolean indicating whether or not a subscription will auto renew when it expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAnywhereSubscription withAutoRenew(Boolean autoRenew) {
        setAutoRenew(autoRenew);
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether or not a subscription will auto renew when it expires.
     * </p>
     * 
     * @return A boolean indicating whether or not a subscription will auto renew when it expires.
     */

    public Boolean isAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * Amazon Web Services License Manager ARN associated with the subscription.
     * </p>
     * 
     * @return Amazon Web Services License Manager ARN associated with the subscription.
     */

    public java.util.List<String> getLicenseArns() {
        return licenseArns;
    }

    /**
     * <p>
     * Amazon Web Services License Manager ARN associated with the subscription.
     * </p>
     * 
     * @param licenseArns
     *        Amazon Web Services License Manager ARN associated with the subscription.
     */

    public void setLicenseArns(java.util.Collection<String> licenseArns) {
        if (licenseArns == null) {
            this.licenseArns = null;
            return;
        }

        this.licenseArns = new java.util.ArrayList<String>(licenseArns);
    }

    /**
     * <p>
     * Amazon Web Services License Manager ARN associated with the subscription.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseArns(java.util.Collection)} or {@link #withLicenseArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param licenseArns
     *        Amazon Web Services License Manager ARN associated with the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAnywhereSubscription withLicenseArns(String... licenseArns) {
        if (this.licenseArns == null) {
            setLicenseArns(new java.util.ArrayList<String>(licenseArns.length));
        }
        for (String ele : licenseArns) {
            this.licenseArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Amazon Web Services License Manager ARN associated with the subscription.
     * </p>
     * 
     * @param licenseArns
     *        Amazon Web Services License Manager ARN associated with the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAnywhereSubscription withLicenseArns(java.util.Collection<String> licenseArns) {
        setLicenseArns(licenseArns);
        return this;
    }

    /**
     * <p>
     * The metadata for a subscription to assist with categorization and organization. Each tag consists of a key and an
     * optional value. Subscription tags do not propagate to any other resources associated with the subscription.
     * </p>
     * 
     * @return The metadata for a subscription to assist with categorization and organization. Each tag consists of a
     *         key and an optional value. Subscription tags do not propagate to any other resources associated with the
     *         subscription.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata for a subscription to assist with categorization and organization. Each tag consists of a key and an
     * optional value. Subscription tags do not propagate to any other resources associated with the subscription.
     * </p>
     * 
     * @param tags
     *        The metadata for a subscription to assist with categorization and organization. Each tag consists of a key
     *        and an optional value. Subscription tags do not propagate to any other resources associated with the
     *        subscription.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The metadata for a subscription to assist with categorization and organization. Each tag consists of a key and an
     * optional value. Subscription tags do not propagate to any other resources associated with the subscription.
     * </p>
     * 
     * @param tags
     *        The metadata for a subscription to assist with categorization and organization. Each tag consists of a key
     *        and an optional value. Subscription tags do not propagate to any other resources associated with the
     *        subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAnywhereSubscription withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see EksAnywhereSubscription#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EksAnywhereSubscription addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksAnywhereSubscription clearTagsEntries() {
        this.tags = null;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getEffectiveDate() != null)
            sb.append("EffectiveDate: ").append(getEffectiveDate()).append(",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: ").append(getExpirationDate()).append(",");
        if (getLicenseQuantity() != null)
            sb.append("LicenseQuantity: ").append(getLicenseQuantity()).append(",");
        if (getLicenseType() != null)
            sb.append("LicenseType: ").append(getLicenseType()).append(",");
        if (getTerm() != null)
            sb.append("Term: ").append(getTerm()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAutoRenew() != null)
            sb.append("AutoRenew: ").append(getAutoRenew()).append(",");
        if (getLicenseArns() != null)
            sb.append("LicenseArns: ").append(getLicenseArns()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksAnywhereSubscription == false)
            return false;
        EksAnywhereSubscription other = (EksAnywhereSubscription) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getEffectiveDate() == null ^ this.getEffectiveDate() == null)
            return false;
        if (other.getEffectiveDate() != null && other.getEffectiveDate().equals(this.getEffectiveDate()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        if (other.getLicenseQuantity() == null ^ this.getLicenseQuantity() == null)
            return false;
        if (other.getLicenseQuantity() != null && other.getLicenseQuantity().equals(this.getLicenseQuantity()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getTerm() == null ^ this.getTerm() == null)
            return false;
        if (other.getTerm() != null && other.getTerm().equals(this.getTerm()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAutoRenew() == null ^ this.getAutoRenew() == null)
            return false;
        if (other.getAutoRenew() != null && other.getAutoRenew().equals(this.getAutoRenew()) == false)
            return false;
        if (other.getLicenseArns() == null ^ this.getLicenseArns() == null)
            return false;
        if (other.getLicenseArns() != null && other.getLicenseArns().equals(this.getLicenseArns()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getEffectiveDate() == null) ? 0 : getEffectiveDate().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        hashCode = prime * hashCode + ((getLicenseQuantity() == null) ? 0 : getLicenseQuantity().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getTerm() == null) ? 0 : getTerm().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAutoRenew() == null) ? 0 : getAutoRenew().hashCode());
        hashCode = prime * hashCode + ((getLicenseArns() == null) ? 0 : getLicenseArns().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public EksAnywhereSubscription clone() {
        try {
            return (EksAnywhereSubscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.EksAnywhereSubscriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
