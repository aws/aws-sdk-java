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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateLegalHold" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLegalHoldRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is the string title of the legal hold.
     * </p>
     */
    private String title;
    /**
     * <p>
     * This is the string description of the legal hold.
     * </p>
     */
    private String description;
    /**
     * <p>
     * This is a user-chosen string used to distinguish between otherwise identical calls. Retrying a successful request
     * with the same idempotency token results in a success message with no action taken.
     * </p>
     */
    private String idempotencyToken;
    /**
     * <p>
     * This specifies criteria to assign a set of resources, such as resource types or backup vaults.
     * </p>
     */
    private RecoveryPointSelection recoveryPointSelection;
    /**
     * <p>
     * Optional tags to include. A tag is a key-value pair you can use to manage, filter, and search for your resources.
     * Allowed characters include UTF-8 letters, numbers, spaces, and the following characters: + - = . _ : /.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * This is the string title of the legal hold.
     * </p>
     * 
     * @param title
     *        This is the string title of the legal hold.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * This is the string title of the legal hold.
     * </p>
     * 
     * @return This is the string title of the legal hold.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * This is the string title of the legal hold.
     * </p>
     * 
     * @param title
     *        This is the string title of the legal hold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLegalHoldRequest withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * This is the string description of the legal hold.
     * </p>
     * 
     * @param description
     *        This is the string description of the legal hold.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * This is the string description of the legal hold.
     * </p>
     * 
     * @return This is the string description of the legal hold.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * This is the string description of the legal hold.
     * </p>
     * 
     * @param description
     *        This is the string description of the legal hold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLegalHoldRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * This is a user-chosen string used to distinguish between otherwise identical calls. Retrying a successful request
     * with the same idempotency token results in a success message with no action taken.
     * </p>
     * 
     * @param idempotencyToken
     *        This is a user-chosen string used to distinguish between otherwise identical calls. Retrying a successful
     *        request with the same idempotency token results in a success message with no action taken.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * This is a user-chosen string used to distinguish between otherwise identical calls. Retrying a successful request
     * with the same idempotency token results in a success message with no action taken.
     * </p>
     * 
     * @return This is a user-chosen string used to distinguish between otherwise identical calls. Retrying a successful
     *         request with the same idempotency token results in a success message with no action taken.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * This is a user-chosen string used to distinguish between otherwise identical calls. Retrying a successful request
     * with the same idempotency token results in a success message with no action taken.
     * </p>
     * 
     * @param idempotencyToken
     *        This is a user-chosen string used to distinguish between otherwise identical calls. Retrying a successful
     *        request with the same idempotency token results in a success message with no action taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLegalHoldRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
        return this;
    }

    /**
     * <p>
     * This specifies criteria to assign a set of resources, such as resource types or backup vaults.
     * </p>
     * 
     * @param recoveryPointSelection
     *        This specifies criteria to assign a set of resources, such as resource types or backup vaults.
     */

    public void setRecoveryPointSelection(RecoveryPointSelection recoveryPointSelection) {
        this.recoveryPointSelection = recoveryPointSelection;
    }

    /**
     * <p>
     * This specifies criteria to assign a set of resources, such as resource types or backup vaults.
     * </p>
     * 
     * @return This specifies criteria to assign a set of resources, such as resource types or backup vaults.
     */

    public RecoveryPointSelection getRecoveryPointSelection() {
        return this.recoveryPointSelection;
    }

    /**
     * <p>
     * This specifies criteria to assign a set of resources, such as resource types or backup vaults.
     * </p>
     * 
     * @param recoveryPointSelection
     *        This specifies criteria to assign a set of resources, such as resource types or backup vaults.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLegalHoldRequest withRecoveryPointSelection(RecoveryPointSelection recoveryPointSelection) {
        setRecoveryPointSelection(recoveryPointSelection);
        return this;
    }

    /**
     * <p>
     * Optional tags to include. A tag is a key-value pair you can use to manage, filter, and search for your resources.
     * Allowed characters include UTF-8 letters, numbers, spaces, and the following characters: + - = . _ : /.
     * </p>
     * 
     * @return Optional tags to include. A tag is a key-value pair you can use to manage, filter, and search for your
     *         resources. Allowed characters include UTF-8 letters, numbers, spaces, and the following characters: + - =
     *         . _ : /.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional tags to include. A tag is a key-value pair you can use to manage, filter, and search for your resources.
     * Allowed characters include UTF-8 letters, numbers, spaces, and the following characters: + - = . _ : /.
     * </p>
     * 
     * @param tags
     *        Optional tags to include. A tag is a key-value pair you can use to manage, filter, and search for your
     *        resources. Allowed characters include UTF-8 letters, numbers, spaces, and the following characters: + - =
     *        . _ : /.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Optional tags to include. A tag is a key-value pair you can use to manage, filter, and search for your resources.
     * Allowed characters include UTF-8 letters, numbers, spaces, and the following characters: + - = . _ : /.
     * </p>
     * 
     * @param tags
     *        Optional tags to include. A tag is a key-value pair you can use to manage, filter, and search for your
     *        resources. Allowed characters include UTF-8 letters, numbers, spaces, and the following characters: + - =
     *        . _ : /.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLegalHoldRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateLegalHoldRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateLegalHoldRequest addTagsEntry(String key, String value) {
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

    public CreateLegalHoldRequest clearTagsEntries() {
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
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken()).append(",");
        if (getRecoveryPointSelection() != null)
            sb.append("RecoveryPointSelection: ").append(getRecoveryPointSelection()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLegalHoldRequest == false)
            return false;
        CreateLegalHoldRequest other = (CreateLegalHoldRequest) obj;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        if (other.getRecoveryPointSelection() == null ^ this.getRecoveryPointSelection() == null)
            return false;
        if (other.getRecoveryPointSelection() != null && other.getRecoveryPointSelection().equals(this.getRecoveryPointSelection()) == false)
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

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getRecoveryPointSelection() == null) ? 0 : getRecoveryPointSelection().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLegalHoldRequest clone() {
        return (CreateLegalHoldRequest) super.clone();
    }

}
