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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeleteAccountAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAccountAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the account alias to delete.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash, nor can
     * you have two dashes in a row.
     * </p>
     */
    private String accountAlias;

    /**
     * Default constructor for DeleteAccountAliasRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DeleteAccountAliasRequest() {
    }

    /**
     * Constructs a new DeleteAccountAliasRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param accountAlias
     *        The name of the account alias to delete.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash,
     *        nor can you have two dashes in a row.
     */
    public DeleteAccountAliasRequest(String accountAlias) {
        setAccountAlias(accountAlias);
    }

    /**
     * <p>
     * The name of the account alias to delete.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash, nor can
     * you have two dashes in a row.
     * </p>
     * 
     * @param accountAlias
     *        The name of the account alias to delete.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash,
     *        nor can you have two dashes in a row.
     */

    public void setAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
    }

    /**
     * <p>
     * The name of the account alias to delete.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash, nor can
     * you have two dashes in a row.
     * </p>
     * 
     * @return The name of the account alias to delete.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a
     *         dash, nor can you have two dashes in a row.
     */

    public String getAccountAlias() {
        return this.accountAlias;
    }

    /**
     * <p>
     * The name of the account alias to delete.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash, nor can
     * you have two dashes in a row.
     * </p>
     * 
     * @param accountAlias
     *        The name of the account alias to delete.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash,
     *        nor can you have two dashes in a row.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAccountAliasRequest withAccountAlias(String accountAlias) {
        setAccountAlias(accountAlias);
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
        if (getAccountAlias() != null)
            sb.append("AccountAlias: ").append(getAccountAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAccountAliasRequest == false)
            return false;
        DeleteAccountAliasRequest other = (DeleteAccountAliasRequest) obj;
        if (other.getAccountAlias() == null ^ this.getAccountAlias() == null)
            return false;
        if (other.getAccountAlias() != null && other.getAccountAlias().equals(this.getAccountAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountAlias() == null) ? 0 : getAccountAlias().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAccountAliasRequest clone() {
        return (DeleteAccountAliasRequest) super.clone();
    }

}
