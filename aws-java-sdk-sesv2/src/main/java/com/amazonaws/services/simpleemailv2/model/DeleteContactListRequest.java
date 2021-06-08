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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteContactList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteContactListRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the contact list.
     * </p>
     */
    private String contactListName;

    /**
     * <p>
     * The name of the contact list.
     * </p>
     * 
     * @param contactListName
     *        The name of the contact list.
     */

    public void setContactListName(String contactListName) {
        this.contactListName = contactListName;
    }

    /**
     * <p>
     * The name of the contact list.
     * </p>
     * 
     * @return The name of the contact list.
     */

    public String getContactListName() {
        return this.contactListName;
    }

    /**
     * <p>
     * The name of the contact list.
     * </p>
     * 
     * @param contactListName
     *        The name of the contact list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteContactListRequest withContactListName(String contactListName) {
        setContactListName(contactListName);
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
        if (getContactListName() != null)
            sb.append("ContactListName: ").append(getContactListName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteContactListRequest == false)
            return false;
        DeleteContactListRequest other = (DeleteContactListRequest) obj;
        if (other.getContactListName() == null ^ this.getContactListName() == null)
            return false;
        if (other.getContactListName() != null && other.getContactListName().equals(this.getContactListName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactListName() == null) ? 0 : getContactListName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteContactListRequest clone() {
        return (DeleteContactListRequest) super.clone();
    }

}
