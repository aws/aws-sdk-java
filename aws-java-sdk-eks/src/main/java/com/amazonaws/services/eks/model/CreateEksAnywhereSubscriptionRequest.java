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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateEksAnywhereSubscription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEksAnywhereSubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name for your subscription. It must be unique in your Amazon Web Services account in the Amazon Web
     * Services Region you're creating the subscription in. The name can contain only alphanumeric characters
     * (case-sensitive), hyphens, and underscores. It must start with an alphabetic character and can't be longer than
     * 100 characters.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An object representing the term duration and term unit type of your subscription. This determines the term length
     * of your subscription. Valid values are MONTHS for term unit and 12 or 36 for term duration, indicating a 12 month
     * or 36 month subscription. This value cannot be changed after creating the subscription.
     * </p>
     */
    private EksAnywhereSubscriptionTerm term;
    /**
     * <p>
     * The number of licenses to purchase with the subscription. Valid values are between 1 and 100. This value can't be
     * changed after creating the subscription.
     * </p>
     */
    private Integer licenseQuantity;
    /**
     * <p>
     * The license type for all licenses in the subscription. Valid value is CLUSTER. With the CLUSTER license type,
     * each license covers support for a single EKS Anywhere cluster.
     * </p>
     */
    private String licenseType;
    /**
     * <p>
     * A boolean indicating whether the subscription auto renews at the end of the term.
     * </p>
     */
    private Boolean autoRenew;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The metadata for a subscription to assist with categorization and organization. Each tag consists of a key and an
     * optional value. Subscription tags don't propagate to any other resources associated with the subscription.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique name for your subscription. It must be unique in your Amazon Web Services account in the Amazon Web
     * Services Region you're creating the subscription in. The name can contain only alphanumeric characters
     * (case-sensitive), hyphens, and underscores. It must start with an alphabetic character and can't be longer than
     * 100 characters.
     * </p>
     * 
     * @param name
     *        The unique name for your subscription. It must be unique in your Amazon Web Services account in the Amazon
     *        Web Services Region you're creating the subscription in. The name can contain only alphanumeric characters
     *        (case-sensitive), hyphens, and underscores. It must start with an alphabetic character and can't be longer
     *        than 100 characters.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name for your subscription. It must be unique in your Amazon Web Services account in the Amazon Web
     * Services Region you're creating the subscription in. The name can contain only alphanumeric characters
     * (case-sensitive), hyphens, and underscores. It must start with an alphabetic character and can't be longer than
     * 100 characters.
     * </p>
     * 
     * @return The unique name for your subscription. It must be unique in your Amazon Web Services account in the
     *         Amazon Web Services Region you're creating the subscription in. The name can contain only alphanumeric
     *         characters (case-sensitive), hyphens, and underscores. It must start with an alphabetic character and
     *         can't be longer than 100 characters.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique name for your subscription. It must be unique in your Amazon Web Services account in the Amazon Web
     * Services Region you're creating the subscription in. The name can contain only alphanumeric characters
     * (case-sensitive), hyphens, and underscores. It must start with an alphabetic character and can't be longer than
     * 100 characters.
     * </p>
     * 
     * @param name
     *        The unique name for your subscription. It must be unique in your Amazon Web Services account in the Amazon
     *        Web Services Region you're creating the subscription in. The name can contain only alphanumeric characters
     *        (case-sensitive), hyphens, and underscores. It must start with an alphabetic character and can't be longer
     *        than 100 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEksAnywhereSubscriptionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An object representing the term duration and term unit type of your subscription. This determines the term length
     * of your subscription. Valid values are MONTHS for term unit and 12 or 36 for term duration, indicating a 12 month
     * or 36 month subscription. This value cannot be changed after creating the subscription.
     * </p>
     * 
     * @param term
     *        An object representing the term duration and term unit type of your subscription. This determines the term
     *        length of your subscription. Valid values are MONTHS for term unit and 12 or 36 for term duration,
     *        indicating a 12 month or 36 month subscription. This value cannot be changed after creating the
     *        subscription.
     */

    public void setTerm(EksAnywhereSubscriptionTerm term) {
        this.term = term;
    }

    /**
     * <p>
     * An object representing the term duration and term unit type of your subscription. This determines the term length
     * of your subscription. Valid values are MONTHS for term unit and 12 or 36 for term duration, indicating a 12 month
     * or 36 month subscription. This value cannot be changed after creating the subscription.
     * </p>
     * 
     * @return An object representing the term duration and term unit type of your subscription. This determines the
     *         term length of your subscription. Valid values are MONTHS for term unit and 12 or 36 for term duration,
     *         indicating a 12 month or 36 month subscription. This value cannot be changed after creating the
     *         subscription.
     */

    public EksAnywhereSubscriptionTerm getTerm() {
        return this.term;
    }

    /**
     * <p>
     * An object representing the term duration and term unit type of your subscription. This determines the term length
     * of your subscription. Valid values are MONTHS for term unit and 12 or 36 for term duration, indicating a 12 month
     * or 36 month subscription. This value cannot be changed after creating the subscription.
     * </p>
     * 
     * @param term
     *        An object representing the term duration and term unit type of your subscription. This determines the term
     *        length of your subscription. Valid values are MONTHS for term unit and 12 or 36 for term duration,
     *        indicating a 12 month or 36 month subscription. This value cannot be changed after creating the
     *        subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEksAnywhereSubscriptionRequest withTerm(EksAnywhereSubscriptionTerm term) {
        setTerm(term);
        return this;
    }

    /**
     * <p>
     * The number of licenses to purchase with the subscription. Valid values are between 1 and 100. This value can't be
     * changed after creating the subscription.
     * </p>
     * 
     * @param licenseQuantity
     *        The number of licenses to purchase with the subscription. Valid values are between 1 and 100. This value
     *        can't be changed after creating the subscription.
     */

    public void setLicenseQuantity(Integer licenseQuantity) {
        this.licenseQuantity = licenseQuantity;
    }

    /**
     * <p>
     * The number of licenses to purchase with the subscription. Valid values are between 1 and 100. This value can't be
     * changed after creating the subscription.
     * </p>
     * 
     * @return The number of licenses to purchase with the subscription. Valid values are between 1 and 100. This value
     *         can't be changed after creating the subscription.
     */

    public Integer getLicenseQuantity() {
        return this.licenseQuantity;
    }

    /**
     * <p>
     * The number of licenses to purchase with the subscription. Valid values are between 1 and 100. This value can't be
     * changed after creating the subscription.
     * </p>
     * 
     * @param licenseQuantity
     *        The number of licenses to purchase with the subscription. Valid values are between 1 and 100. This value
     *        can't be changed after creating the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEksAnywhereSubscriptionRequest withLicenseQuantity(Integer licenseQuantity) {
        setLicenseQuantity(licenseQuantity);
        return this;
    }

    /**
     * <p>
     * The license type for all licenses in the subscription. Valid value is CLUSTER. With the CLUSTER license type,
     * each license covers support for a single EKS Anywhere cluster.
     * </p>
     * 
     * @param licenseType
     *        The license type for all licenses in the subscription. Valid value is CLUSTER. With the CLUSTER license
     *        type, each license covers support for a single EKS Anywhere cluster.
     * @see EksAnywhereSubscriptionLicenseType
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The license type for all licenses in the subscription. Valid value is CLUSTER. With the CLUSTER license type,
     * each license covers support for a single EKS Anywhere cluster.
     * </p>
     * 
     * @return The license type for all licenses in the subscription. Valid value is CLUSTER. With the CLUSTER license
     *         type, each license covers support for a single EKS Anywhere cluster.
     * @see EksAnywhereSubscriptionLicenseType
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * <p>
     * The license type for all licenses in the subscription. Valid value is CLUSTER. With the CLUSTER license type,
     * each license covers support for a single EKS Anywhere cluster.
     * </p>
     * 
     * @param licenseType
     *        The license type for all licenses in the subscription. Valid value is CLUSTER. With the CLUSTER license
     *        type, each license covers support for a single EKS Anywhere cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EksAnywhereSubscriptionLicenseType
     */

    public CreateEksAnywhereSubscriptionRequest withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * <p>
     * The license type for all licenses in the subscription. Valid value is CLUSTER. With the CLUSTER license type,
     * each license covers support for a single EKS Anywhere cluster.
     * </p>
     * 
     * @param licenseType
     *        The license type for all licenses in the subscription. Valid value is CLUSTER. With the CLUSTER license
     *        type, each license covers support for a single EKS Anywhere cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EksAnywhereSubscriptionLicenseType
     */

    public CreateEksAnywhereSubscriptionRequest withLicenseType(EksAnywhereSubscriptionLicenseType licenseType) {
        this.licenseType = licenseType.toString();
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether the subscription auto renews at the end of the term.
     * </p>
     * 
     * @param autoRenew
     *        A boolean indicating whether the subscription auto renews at the end of the term.
     */

    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * <p>
     * A boolean indicating whether the subscription auto renews at the end of the term.
     * </p>
     * 
     * @return A boolean indicating whether the subscription auto renews at the end of the term.
     */

    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * A boolean indicating whether the subscription auto renews at the end of the term.
     * </p>
     * 
     * @param autoRenew
     *        A boolean indicating whether the subscription auto renews at the end of the term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEksAnywhereSubscriptionRequest withAutoRenew(Boolean autoRenew) {
        setAutoRenew(autoRenew);
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether the subscription auto renews at the end of the term.
     * </p>
     * 
     * @return A boolean indicating whether the subscription auto renews at the end of the term.
     */

    public Boolean isAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEksAnywhereSubscriptionRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The metadata for a subscription to assist with categorization and organization. Each tag consists of a key and an
     * optional value. Subscription tags don't propagate to any other resources associated with the subscription.
     * </p>
     * 
     * @return The metadata for a subscription to assist with categorization and organization. Each tag consists of a
     *         key and an optional value. Subscription tags don't propagate to any other resources associated with the
     *         subscription.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata for a subscription to assist with categorization and organization. Each tag consists of a key and an
     * optional value. Subscription tags don't propagate to any other resources associated with the subscription.
     * </p>
     * 
     * @param tags
     *        The metadata for a subscription to assist with categorization and organization. Each tag consists of a key
     *        and an optional value. Subscription tags don't propagate to any other resources associated with the
     *        subscription.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The metadata for a subscription to assist with categorization and organization. Each tag consists of a key and an
     * optional value. Subscription tags don't propagate to any other resources associated with the subscription.
     * </p>
     * 
     * @param tags
     *        The metadata for a subscription to assist with categorization and organization. Each tag consists of a key
     *        and an optional value. Subscription tags don't propagate to any other resources associated with the
     *        subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEksAnywhereSubscriptionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateEksAnywhereSubscriptionRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateEksAnywhereSubscriptionRequest addTagsEntry(String key, String value) {
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

    public CreateEksAnywhereSubscriptionRequest clearTagsEntries() {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTerm() != null)
            sb.append("Term: ").append(getTerm()).append(",");
        if (getLicenseQuantity() != null)
            sb.append("LicenseQuantity: ").append(getLicenseQuantity()).append(",");
        if (getLicenseType() != null)
            sb.append("LicenseType: ").append(getLicenseType()).append(",");
        if (getAutoRenew() != null)
            sb.append("AutoRenew: ").append(getAutoRenew()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
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

        if (obj instanceof CreateEksAnywhereSubscriptionRequest == false)
            return false;
        CreateEksAnywhereSubscriptionRequest other = (CreateEksAnywhereSubscriptionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTerm() == null ^ this.getTerm() == null)
            return false;
        if (other.getTerm() != null && other.getTerm().equals(this.getTerm()) == false)
            return false;
        if (other.getLicenseQuantity() == null ^ this.getLicenseQuantity() == null)
            return false;
        if (other.getLicenseQuantity() != null && other.getLicenseQuantity().equals(this.getLicenseQuantity()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getAutoRenew() == null ^ this.getAutoRenew() == null)
            return false;
        if (other.getAutoRenew() != null && other.getAutoRenew().equals(this.getAutoRenew()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTerm() == null) ? 0 : getTerm().hashCode());
        hashCode = prime * hashCode + ((getLicenseQuantity() == null) ? 0 : getLicenseQuantity().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getAutoRenew() == null) ? 0 : getAutoRenew().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEksAnywhereSubscriptionRequest clone() {
        return (CreateEksAnywhereSubscriptionRequest) super.clone();
    }

}
