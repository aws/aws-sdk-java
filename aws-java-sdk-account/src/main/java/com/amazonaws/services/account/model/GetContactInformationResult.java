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
package com.amazonaws.services.account.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/GetContactInformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContactInformationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the details of the primary contact information associated with an Amazon Web Services account.
     * </p>
     */
    private ContactInformation contactInformation;

    /**
     * <p>
     * Contains the details of the primary contact information associated with an Amazon Web Services account.
     * </p>
     * 
     * @param contactInformation
     *        Contains the details of the primary contact information associated with an Amazon Web Services account.
     */

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }

    /**
     * <p>
     * Contains the details of the primary contact information associated with an Amazon Web Services account.
     * </p>
     * 
     * @return Contains the details of the primary contact information associated with an Amazon Web Services account.
     */

    public ContactInformation getContactInformation() {
        return this.contactInformation;
    }

    /**
     * <p>
     * Contains the details of the primary contact information associated with an Amazon Web Services account.
     * </p>
     * 
     * @param contactInformation
     *        Contains the details of the primary contact information associated with an Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactInformationResult withContactInformation(ContactInformation contactInformation) {
        setContactInformation(contactInformation);
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
        if (getContactInformation() != null)
            sb.append("ContactInformation: ").append(getContactInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContactInformationResult == false)
            return false;
        GetContactInformationResult other = (GetContactInformationResult) obj;
        if (other.getContactInformation() == null ^ this.getContactInformation() == null)
            return false;
        if (other.getContactInformation() != null && other.getContactInformation().equals(this.getContactInformation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactInformation() == null) ? 0 : getContactInformation().hashCode());
        return hashCode;
    }

    @Override
    public GetContactInformationResult clone() {
        try {
            return (GetContactInformationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
