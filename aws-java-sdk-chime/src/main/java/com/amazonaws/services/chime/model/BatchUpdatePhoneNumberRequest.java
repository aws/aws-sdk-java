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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchUpdatePhoneNumber" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdatePhoneNumberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The request containing the phone number IDs and product types to update.
     * </p>
     */
    private java.util.List<UpdatePhoneNumberRequestItem> updatePhoneNumberRequestItems;

    /**
     * <p>
     * The request containing the phone number IDs and product types to update.
     * </p>
     * 
     * @return The request containing the phone number IDs and product types to update.
     */

    public java.util.List<UpdatePhoneNumberRequestItem> getUpdatePhoneNumberRequestItems() {
        return updatePhoneNumberRequestItems;
    }

    /**
     * <p>
     * The request containing the phone number IDs and product types to update.
     * </p>
     * 
     * @param updatePhoneNumberRequestItems
     *        The request containing the phone number IDs and product types to update.
     */

    public void setUpdatePhoneNumberRequestItems(java.util.Collection<UpdatePhoneNumberRequestItem> updatePhoneNumberRequestItems) {
        if (updatePhoneNumberRequestItems == null) {
            this.updatePhoneNumberRequestItems = null;
            return;
        }

        this.updatePhoneNumberRequestItems = new java.util.ArrayList<UpdatePhoneNumberRequestItem>(updatePhoneNumberRequestItems);
    }

    /**
     * <p>
     * The request containing the phone number IDs and product types to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdatePhoneNumberRequestItems(java.util.Collection)} or
     * {@link #withUpdatePhoneNumberRequestItems(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param updatePhoneNumberRequestItems
     *        The request containing the phone number IDs and product types to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdatePhoneNumberRequest withUpdatePhoneNumberRequestItems(UpdatePhoneNumberRequestItem... updatePhoneNumberRequestItems) {
        if (this.updatePhoneNumberRequestItems == null) {
            setUpdatePhoneNumberRequestItems(new java.util.ArrayList<UpdatePhoneNumberRequestItem>(updatePhoneNumberRequestItems.length));
        }
        for (UpdatePhoneNumberRequestItem ele : updatePhoneNumberRequestItems) {
            this.updatePhoneNumberRequestItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The request containing the phone number IDs and product types to update.
     * </p>
     * 
     * @param updatePhoneNumberRequestItems
     *        The request containing the phone number IDs and product types to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdatePhoneNumberRequest withUpdatePhoneNumberRequestItems(java.util.Collection<UpdatePhoneNumberRequestItem> updatePhoneNumberRequestItems) {
        setUpdatePhoneNumberRequestItems(updatePhoneNumberRequestItems);
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
        if (getUpdatePhoneNumberRequestItems() != null)
            sb.append("UpdatePhoneNumberRequestItems: ").append(getUpdatePhoneNumberRequestItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdatePhoneNumberRequest == false)
            return false;
        BatchUpdatePhoneNumberRequest other = (BatchUpdatePhoneNumberRequest) obj;
        if (other.getUpdatePhoneNumberRequestItems() == null ^ this.getUpdatePhoneNumberRequestItems() == null)
            return false;
        if (other.getUpdatePhoneNumberRequestItems() != null
                && other.getUpdatePhoneNumberRequestItems().equals(this.getUpdatePhoneNumberRequestItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdatePhoneNumberRequestItems() == null) ? 0 : getUpdatePhoneNumberRequestItems().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdatePhoneNumberRequest clone() {
        return (BatchUpdatePhoneNumberRequest) super.clone();
    }

}
