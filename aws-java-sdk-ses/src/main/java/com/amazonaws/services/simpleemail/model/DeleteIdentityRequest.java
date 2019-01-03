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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to delete one of your Amazon SES identities (an email address or domain).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeleteIdentity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteIdentityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identity to be removed from the list of identities for the AWS Account.
     * </p>
     */
    private String identity;

    /**
     * <p>
     * The identity to be removed from the list of identities for the AWS Account.
     * </p>
     * 
     * @param identity
     *        The identity to be removed from the list of identities for the AWS Account.
     */

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The identity to be removed from the list of identities for the AWS Account.
     * </p>
     * 
     * @return The identity to be removed from the list of identities for the AWS Account.
     */

    public String getIdentity() {
        return this.identity;
    }

    /**
     * <p>
     * The identity to be removed from the list of identities for the AWS Account.
     * </p>
     * 
     * @param identity
     *        The identity to be removed from the list of identities for the AWS Account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIdentityRequest withIdentity(String identity) {
        setIdentity(identity);
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
        if (getIdentity() != null)
            sb.append("Identity: ").append(getIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteIdentityRequest == false)
            return false;
        DeleteIdentityRequest other = (DeleteIdentityRequest) obj;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        return hashCode;
    }

    @Override
    public DeleteIdentityRequest clone() {
        return (DeleteIdentityRequest) super.clone();
    }

}
