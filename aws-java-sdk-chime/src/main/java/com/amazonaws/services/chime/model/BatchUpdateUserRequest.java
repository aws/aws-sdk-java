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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchUpdateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The request containing the user IDs and details to update.
     * </p>
     */
    private java.util.List<UpdateUserRequestItem> updateUserRequestItems;

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @return The Amazon Chime account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateUserRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The request containing the user IDs and details to update.
     * </p>
     * 
     * @return The request containing the user IDs and details to update.
     */

    public java.util.List<UpdateUserRequestItem> getUpdateUserRequestItems() {
        return updateUserRequestItems;
    }

    /**
     * <p>
     * The request containing the user IDs and details to update.
     * </p>
     * 
     * @param updateUserRequestItems
     *        The request containing the user IDs and details to update.
     */

    public void setUpdateUserRequestItems(java.util.Collection<UpdateUserRequestItem> updateUserRequestItems) {
        if (updateUserRequestItems == null) {
            this.updateUserRequestItems = null;
            return;
        }

        this.updateUserRequestItems = new java.util.ArrayList<UpdateUserRequestItem>(updateUserRequestItems);
    }

    /**
     * <p>
     * The request containing the user IDs and details to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdateUserRequestItems(java.util.Collection)} or
     * {@link #withUpdateUserRequestItems(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param updateUserRequestItems
     *        The request containing the user IDs and details to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateUserRequest withUpdateUserRequestItems(UpdateUserRequestItem... updateUserRequestItems) {
        if (this.updateUserRequestItems == null) {
            setUpdateUserRequestItems(new java.util.ArrayList<UpdateUserRequestItem>(updateUserRequestItems.length));
        }
        for (UpdateUserRequestItem ele : updateUserRequestItems) {
            this.updateUserRequestItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The request containing the user IDs and details to update.
     * </p>
     * 
     * @param updateUserRequestItems
     *        The request containing the user IDs and details to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateUserRequest withUpdateUserRequestItems(java.util.Collection<UpdateUserRequestItem> updateUserRequestItems) {
        setUpdateUserRequestItems(updateUserRequestItems);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getUpdateUserRequestItems() != null)
            sb.append("UpdateUserRequestItems: ").append(getUpdateUserRequestItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateUserRequest == false)
            return false;
        BatchUpdateUserRequest other = (BatchUpdateUserRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getUpdateUserRequestItems() == null ^ this.getUpdateUserRequestItems() == null)
            return false;
        if (other.getUpdateUserRequestItems() != null && other.getUpdateUserRequestItems().equals(this.getUpdateUserRequestItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getUpdateUserRequestItems() == null) ? 0 : getUpdateUserRequestItems().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateUserRequest clone() {
        return (BatchUpdateUserRequest) super.clone();
    }

}
