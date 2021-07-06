/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMemberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the account to associate with the administrator account.
     * </p>
     */
    private AccountDetail account;
    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
     * </p>
     * <p>
     * An account can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum
     * length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The details of the account to associate with the administrator account.
     * </p>
     * 
     * @param account
     *        The details of the account to associate with the administrator account.
     */

    public void setAccount(AccountDetail account) {
        this.account = account;
    }

    /**
     * <p>
     * The details of the account to associate with the administrator account.
     * </p>
     * 
     * @return The details of the account to associate with the administrator account.
     */

    public AccountDetail getAccount() {
        return this.account;
    }

    /**
     * <p>
     * The details of the account to associate with the administrator account.
     * </p>
     * 
     * @param account
     *        The details of the account to associate with the administrator account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMemberRequest withAccount(AccountDetail account) {
        setAccount(account);
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
     * </p>
     * <p>
     * An account can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum
     * length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * </p>
     * 
     * @return A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.</p>
     *         <p>
     *         An account can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The
     *         maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
     * </p>
     * <p>
     * An account can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum
     * length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.</p>
     *        <p>
     *        An account can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The
     *        maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
     * </p>
     * <p>
     * An account can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum
     * length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.</p>
     *        <p>
     *        An account can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The
     *        maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMemberRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateMemberRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateMemberRequest addTagsEntry(String key, String value) {
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

    public CreateMemberRequest clearTagsEntries() {
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
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount()).append(",");
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

        if (obj instanceof CreateMemberRequest == false)
            return false;
        CreateMemberRequest other = (CreateMemberRequest) obj;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
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

        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateMemberRequest clone() {
        return (CreateMemberRequest) super.clone();
    }

}
