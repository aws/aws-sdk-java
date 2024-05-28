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
package com.amazonaws.services.chatbot.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/GetAccountPreferences" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccountPreferencesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Preferences which apply for AWS Chatbot usage in the calling AWS account. */
    private AccountPreferences accountPreferences;

    /**
     * Preferences which apply for AWS Chatbot usage in the calling AWS account.
     * 
     * @param accountPreferences
     *        Preferences which apply for AWS Chatbot usage in the calling AWS account.
     */

    public void setAccountPreferences(AccountPreferences accountPreferences) {
        this.accountPreferences = accountPreferences;
    }

    /**
     * Preferences which apply for AWS Chatbot usage in the calling AWS account.
     * 
     * @return Preferences which apply for AWS Chatbot usage in the calling AWS account.
     */

    public AccountPreferences getAccountPreferences() {
        return this.accountPreferences;
    }

    /**
     * Preferences which apply for AWS Chatbot usage in the calling AWS account.
     * 
     * @param accountPreferences
     *        Preferences which apply for AWS Chatbot usage in the calling AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountPreferencesResult withAccountPreferences(AccountPreferences accountPreferences) {
        setAccountPreferences(accountPreferences);
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
        if (getAccountPreferences() != null)
            sb.append("AccountPreferences: ").append(getAccountPreferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccountPreferencesResult == false)
            return false;
        GetAccountPreferencesResult other = (GetAccountPreferencesResult) obj;
        if (other.getAccountPreferences() == null ^ this.getAccountPreferences() == null)
            return false;
        if (other.getAccountPreferences() != null && other.getAccountPreferences().equals(this.getAccountPreferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountPreferences() == null) ? 0 : getAccountPreferences().hashCode());
        return hashCode;
    }

    @Override
    public GetAccountPreferencesResult clone() {
        try {
            return (GetAccountPreferencesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
