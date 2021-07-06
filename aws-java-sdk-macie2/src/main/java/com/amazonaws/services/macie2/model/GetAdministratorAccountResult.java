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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetAdministratorAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAdministratorAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID for the administrator account. If the accounts are associated by a Macie
     * membership invitation, this object also provides details about the invitation that was sent to establish the
     * relationship between the accounts.
     * </p>
     */
    private Invitation administrator;

    /**
     * <p>
     * The Amazon Web Services account ID for the administrator account. If the accounts are associated by a Macie
     * membership invitation, this object also provides details about the invitation that was sent to establish the
     * relationship between the accounts.
     * </p>
     * 
     * @param administrator
     *        The Amazon Web Services account ID for the administrator account. If the accounts are associated by a
     *        Macie membership invitation, this object also provides details about the invitation that was sent to
     *        establish the relationship between the accounts.
     */

    public void setAdministrator(Invitation administrator) {
        this.administrator = administrator;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the administrator account. If the accounts are associated by a Macie
     * membership invitation, this object also provides details about the invitation that was sent to establish the
     * relationship between the accounts.
     * </p>
     * 
     * @return The Amazon Web Services account ID for the administrator account. If the accounts are associated by a
     *         Macie membership invitation, this object also provides details about the invitation that was sent to
     *         establish the relationship between the accounts.
     */

    public Invitation getAdministrator() {
        return this.administrator;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the administrator account. If the accounts are associated by a Macie
     * membership invitation, this object also provides details about the invitation that was sent to establish the
     * relationship between the accounts.
     * </p>
     * 
     * @param administrator
     *        The Amazon Web Services account ID for the administrator account. If the accounts are associated by a
     *        Macie membership invitation, this object also provides details about the invitation that was sent to
     *        establish the relationship between the accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdministratorAccountResult withAdministrator(Invitation administrator) {
        setAdministrator(administrator);
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
        if (getAdministrator() != null)
            sb.append("Administrator: ").append(getAdministrator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAdministratorAccountResult == false)
            return false;
        GetAdministratorAccountResult other = (GetAdministratorAccountResult) obj;
        if (other.getAdministrator() == null ^ this.getAdministrator() == null)
            return false;
        if (other.getAdministrator() != null && other.getAdministrator().equals(this.getAdministrator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdministrator() == null) ? 0 : getAdministrator().hashCode());
        return hashCode;
    }

    @Override
    public GetAdministratorAccountResult clone() {
        try {
            return (GetAdministratorAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
