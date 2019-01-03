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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>GrantAccess</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/GrantAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrantAccessResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>TemporaryCredential</code> object that contains the data needed to log in to the instance by RDP clients,
     * such as the Microsoft Remote Desktop Connection.
     * </p>
     */
    private TemporaryCredential temporaryCredential;

    /**
     * <p>
     * A <code>TemporaryCredential</code> object that contains the data needed to log in to the instance by RDP clients,
     * such as the Microsoft Remote Desktop Connection.
     * </p>
     * 
     * @param temporaryCredential
     *        A <code>TemporaryCredential</code> object that contains the data needed to log in to the instance by RDP
     *        clients, such as the Microsoft Remote Desktop Connection.
     */

    public void setTemporaryCredential(TemporaryCredential temporaryCredential) {
        this.temporaryCredential = temporaryCredential;
    }

    /**
     * <p>
     * A <code>TemporaryCredential</code> object that contains the data needed to log in to the instance by RDP clients,
     * such as the Microsoft Remote Desktop Connection.
     * </p>
     * 
     * @return A <code>TemporaryCredential</code> object that contains the data needed to log in to the instance by RDP
     *         clients, such as the Microsoft Remote Desktop Connection.
     */

    public TemporaryCredential getTemporaryCredential() {
        return this.temporaryCredential;
    }

    /**
     * <p>
     * A <code>TemporaryCredential</code> object that contains the data needed to log in to the instance by RDP clients,
     * such as the Microsoft Remote Desktop Connection.
     * </p>
     * 
     * @param temporaryCredential
     *        A <code>TemporaryCredential</code> object that contains the data needed to log in to the instance by RDP
     *        clients, such as the Microsoft Remote Desktop Connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantAccessResult withTemporaryCredential(TemporaryCredential temporaryCredential) {
        setTemporaryCredential(temporaryCredential);
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
        if (getTemporaryCredential() != null)
            sb.append("TemporaryCredential: ").append(getTemporaryCredential());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GrantAccessResult == false)
            return false;
        GrantAccessResult other = (GrantAccessResult) obj;
        if (other.getTemporaryCredential() == null ^ this.getTemporaryCredential() == null)
            return false;
        if (other.getTemporaryCredential() != null && other.getTemporaryCredential().equals(this.getTemporaryCredential()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemporaryCredential() == null) ? 0 : getTemporaryCredential().hashCode());
        return hashCode;
    }

    @Override
    public GrantAccessResult clone() {
        try {
            return (GrantAccessResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
