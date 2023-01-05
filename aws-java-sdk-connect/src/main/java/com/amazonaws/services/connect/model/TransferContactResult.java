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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TransferContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransferContactResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact.
     * </p>
     */
    private String contactArn;

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact in this instance of Amazon Connect.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @return The identifier of the contact in this instance of Amazon Connect.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The identifier of the contact in this instance of Amazon Connect.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact in this instance of Amazon Connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferContactResult withContactId(String contactId) {
        setContactId(contactId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact.
     * </p>
     * 
     * @param contactArn
     *        The Amazon Resource Name (ARN) of the contact.
     */

    public void setContactArn(String contactArn) {
        this.contactArn = contactArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the contact.
     */

    public String getContactArn() {
        return this.contactArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact.
     * </p>
     * 
     * @param contactArn
     *        The Amazon Resource Name (ARN) of the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferContactResult withContactArn(String contactArn) {
        setContactArn(contactArn);
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
        if (getContactId() != null)
            sb.append("ContactId: ").append(getContactId()).append(",");
        if (getContactArn() != null)
            sb.append("ContactArn: ").append(getContactArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransferContactResult == false)
            return false;
        TransferContactResult other = (TransferContactResult) obj;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getContactArn() == null ^ this.getContactArn() == null)
            return false;
        if (other.getContactArn() != null && other.getContactArn().equals(this.getContactArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getContactArn() == null) ? 0 : getContactArn().hashCode());
        return hashCode;
    }

    @Override
    public TransferContactResult clone() {
        try {
            return (TransferContactResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
