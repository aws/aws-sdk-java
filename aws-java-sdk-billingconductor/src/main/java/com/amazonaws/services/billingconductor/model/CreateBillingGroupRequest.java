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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CreateBillingGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBillingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token that is needed to support idempotency. Idempotency isn't currently supported, but will be implemented
     * in a future update.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The billing group name. The names must be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The set of accounts that will be under the billing group. The set of accounts resemble the linked accounts in a
     * consolidated family.
     * </p>
     */
    private AccountGrouping accountGrouping;
    /**
     * <p>
     * The preferences and settings that will be used to compute the Amazon Web Services charges for a billing group.
     * </p>
     */
    private ComputationPreference computationPreference;
    /**
     * <p>
     * The account ID that serves as the main account in a billing group.
     * </p>
     */
    private String primaryAccountId;
    /**
     * <p>
     * The description of the billing group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a billing group. This feature isn't available
     * during the beta.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The token that is needed to support idempotency. Idempotency isn't currently supported, but will be implemented
     * in a future update.
     * </p>
     * 
     * @param clientToken
     *        The token that is needed to support idempotency. Idempotency isn't currently supported, but will be
     *        implemented in a future update.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The token that is needed to support idempotency. Idempotency isn't currently supported, but will be implemented
     * in a future update.
     * </p>
     * 
     * @return The token that is needed to support idempotency. Idempotency isn't currently supported, but will be
     *         implemented in a future update.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The token that is needed to support idempotency. Idempotency isn't currently supported, but will be implemented
     * in a future update.
     * </p>
     * 
     * @param clientToken
     *        The token that is needed to support idempotency. Idempotency isn't currently supported, but will be
     *        implemented in a future update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBillingGroupRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The billing group name. The names must be unique.
     * </p>
     * 
     * @param name
     *        The billing group name. The names must be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The billing group name. The names must be unique.
     * </p>
     * 
     * @return The billing group name. The names must be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The billing group name. The names must be unique.
     * </p>
     * 
     * @param name
     *        The billing group name. The names must be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBillingGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The set of accounts that will be under the billing group. The set of accounts resemble the linked accounts in a
     * consolidated family.
     * </p>
     * 
     * @param accountGrouping
     *        The set of accounts that will be under the billing group. The set of accounts resemble the linked accounts
     *        in a consolidated family.
     */

    public void setAccountGrouping(AccountGrouping accountGrouping) {
        this.accountGrouping = accountGrouping;
    }

    /**
     * <p>
     * The set of accounts that will be under the billing group. The set of accounts resemble the linked accounts in a
     * consolidated family.
     * </p>
     * 
     * @return The set of accounts that will be under the billing group. The set of accounts resemble the linked
     *         accounts in a consolidated family.
     */

    public AccountGrouping getAccountGrouping() {
        return this.accountGrouping;
    }

    /**
     * <p>
     * The set of accounts that will be under the billing group. The set of accounts resemble the linked accounts in a
     * consolidated family.
     * </p>
     * 
     * @param accountGrouping
     *        The set of accounts that will be under the billing group. The set of accounts resemble the linked accounts
     *        in a consolidated family.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBillingGroupRequest withAccountGrouping(AccountGrouping accountGrouping) {
        setAccountGrouping(accountGrouping);
        return this;
    }

    /**
     * <p>
     * The preferences and settings that will be used to compute the Amazon Web Services charges for a billing group.
     * </p>
     * 
     * @param computationPreference
     *        The preferences and settings that will be used to compute the Amazon Web Services charges for a billing
     *        group.
     */

    public void setComputationPreference(ComputationPreference computationPreference) {
        this.computationPreference = computationPreference;
    }

    /**
     * <p>
     * The preferences and settings that will be used to compute the Amazon Web Services charges for a billing group.
     * </p>
     * 
     * @return The preferences and settings that will be used to compute the Amazon Web Services charges for a billing
     *         group.
     */

    public ComputationPreference getComputationPreference() {
        return this.computationPreference;
    }

    /**
     * <p>
     * The preferences and settings that will be used to compute the Amazon Web Services charges for a billing group.
     * </p>
     * 
     * @param computationPreference
     *        The preferences and settings that will be used to compute the Amazon Web Services charges for a billing
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBillingGroupRequest withComputationPreference(ComputationPreference computationPreference) {
        setComputationPreference(computationPreference);
        return this;
    }

    /**
     * <p>
     * The account ID that serves as the main account in a billing group.
     * </p>
     * 
     * @param primaryAccountId
     *        The account ID that serves as the main account in a billing group.
     */

    public void setPrimaryAccountId(String primaryAccountId) {
        this.primaryAccountId = primaryAccountId;
    }

    /**
     * <p>
     * The account ID that serves as the main account in a billing group.
     * </p>
     * 
     * @return The account ID that serves as the main account in a billing group.
     */

    public String getPrimaryAccountId() {
        return this.primaryAccountId;
    }

    /**
     * <p>
     * The account ID that serves as the main account in a billing group.
     * </p>
     * 
     * @param primaryAccountId
     *        The account ID that serves as the main account in a billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBillingGroupRequest withPrimaryAccountId(String primaryAccountId) {
        setPrimaryAccountId(primaryAccountId);
        return this;
    }

    /**
     * <p>
     * The description of the billing group.
     * </p>
     * 
     * @param description
     *        The description of the billing group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the billing group.
     * </p>
     * 
     * @return The description of the billing group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the billing group.
     * </p>
     * 
     * @param description
     *        The description of the billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBillingGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a billing group. This feature isn't available
     * during the beta.
     * </p>
     * 
     * @return A map that contains tag keys and tag values that are attached to a billing group. This feature isn't
     *         available during the beta.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a billing group. This feature isn't available
     * during the beta.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to a billing group. This feature isn't
     *        available during the beta.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to a billing group. This feature isn't available
     * during the beta.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to a billing group. This feature isn't
     *        available during the beta.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBillingGroupRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateBillingGroupRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateBillingGroupRequest addTagsEntry(String key, String value) {
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

    public CreateBillingGroupRequest clearTagsEntries() {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getAccountGrouping() != null)
            sb.append("AccountGrouping: ").append(getAccountGrouping()).append(",");
        if (getComputationPreference() != null)
            sb.append("ComputationPreference: ").append(getComputationPreference()).append(",");
        if (getPrimaryAccountId() != null)
            sb.append("PrimaryAccountId: ").append(getPrimaryAccountId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof CreateBillingGroupRequest == false)
            return false;
        CreateBillingGroupRequest other = (CreateBillingGroupRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAccountGrouping() == null ^ this.getAccountGrouping() == null)
            return false;
        if (other.getAccountGrouping() != null && other.getAccountGrouping().equals(this.getAccountGrouping()) == false)
            return false;
        if (other.getComputationPreference() == null ^ this.getComputationPreference() == null)
            return false;
        if (other.getComputationPreference() != null && other.getComputationPreference().equals(this.getComputationPreference()) == false)
            return false;
        if (other.getPrimaryAccountId() == null ^ this.getPrimaryAccountId() == null)
            return false;
        if (other.getPrimaryAccountId() != null && other.getPrimaryAccountId().equals(this.getPrimaryAccountId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAccountGrouping() == null) ? 0 : getAccountGrouping().hashCode());
        hashCode = prime * hashCode + ((getComputationPreference() == null) ? 0 : getComputationPreference().hashCode());
        hashCode = prime * hashCode + ((getPrimaryAccountId() == null) ? 0 : getPrimaryAccountId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateBillingGroupRequest clone() {
        return (CreateBillingGroupRequest) super.clone();
    }

}
