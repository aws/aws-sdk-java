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
package com.amazonaws.services.paymentcryptography.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/DeleteKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>KeyARN</code> of the key that is scheduled for deletion.
     * </p>
     */
    private String keyIdentifier;
    /**
     * <p>
     * The waiting period for key deletion. The default value is seven days.
     * </p>
     */
    private Integer deleteKeyInDays;

    /**
     * <p>
     * The <code>KeyARN</code> of the key that is scheduled for deletion.
     * </p>
     * 
     * @param keyIdentifier
     *        The <code>KeyARN</code> of the key that is scheduled for deletion.
     */

    public void setKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the key that is scheduled for deletion.
     * </p>
     * 
     * @return The <code>KeyARN</code> of the key that is scheduled for deletion.
     */

    public String getKeyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the key that is scheduled for deletion.
     * </p>
     * 
     * @param keyIdentifier
     *        The <code>KeyARN</code> of the key that is scheduled for deletion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteKeyRequest withKeyIdentifier(String keyIdentifier) {
        setKeyIdentifier(keyIdentifier);
        return this;
    }

    /**
     * <p>
     * The waiting period for key deletion. The default value is seven days.
     * </p>
     * 
     * @param deleteKeyInDays
     *        The waiting period for key deletion. The default value is seven days.
     */

    public void setDeleteKeyInDays(Integer deleteKeyInDays) {
        this.deleteKeyInDays = deleteKeyInDays;
    }

    /**
     * <p>
     * The waiting period for key deletion. The default value is seven days.
     * </p>
     * 
     * @return The waiting period for key deletion. The default value is seven days.
     */

    public Integer getDeleteKeyInDays() {
        return this.deleteKeyInDays;
    }

    /**
     * <p>
     * The waiting period for key deletion. The default value is seven days.
     * </p>
     * 
     * @param deleteKeyInDays
     *        The waiting period for key deletion. The default value is seven days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteKeyRequest withDeleteKeyInDays(Integer deleteKeyInDays) {
        setDeleteKeyInDays(deleteKeyInDays);
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
        if (getKeyIdentifier() != null)
            sb.append("KeyIdentifier: ").append(getKeyIdentifier()).append(",");
        if (getDeleteKeyInDays() != null)
            sb.append("DeleteKeyInDays: ").append(getDeleteKeyInDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteKeyRequest == false)
            return false;
        DeleteKeyRequest other = (DeleteKeyRequest) obj;
        if (other.getKeyIdentifier() == null ^ this.getKeyIdentifier() == null)
            return false;
        if (other.getKeyIdentifier() != null && other.getKeyIdentifier().equals(this.getKeyIdentifier()) == false)
            return false;
        if (other.getDeleteKeyInDays() == null ^ this.getDeleteKeyInDays() == null)
            return false;
        if (other.getDeleteKeyInDays() != null && other.getDeleteKeyInDays().equals(this.getDeleteKeyInDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyIdentifier() == null) ? 0 : getKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDeleteKeyInDays() == null) ? 0 : getDeleteKeyInDays().hashCode());
        return hashCode;
    }

    @Override
    public DeleteKeyRequest clone() {
        return (DeleteKeyRequest) super.clone();
    }

}
