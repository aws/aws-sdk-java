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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The username configuration type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UsernameConfigurationType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsernameConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether user name case sensitivity will be applied for all users in the user pool through Amazon
     * Cognito APIs.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <dl>
     * <dt>True</dt>
     * <dd>
     * <p>
     * Enables case sensitivity for all username input. When this option is set to <code>True</code>, users must sign in
     * using the exact capitalization of their given username, such as “UserName”. This is the default value.
     * </p>
     * </dd>
     * <dt>False</dt>
     * <dd>
     * <p>
     * Enables case insensitivity for all username input. For example, when this option is set to <code>False</code>,
     * users can sign in using either "username" or "Username". This option also enables both
     * <code>preferred_username</code> and <code>email</code> alias to be case insensitive, in addition to the
     * <code>username</code> attribute.
     * </p>
     * </dd>
     * </dl>
     */
    private Boolean caseSensitive;

    /**
     * <p>
     * Specifies whether user name case sensitivity will be applied for all users in the user pool through Amazon
     * Cognito APIs.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <dl>
     * <dt>True</dt>
     * <dd>
     * <p>
     * Enables case sensitivity for all username input. When this option is set to <code>True</code>, users must sign in
     * using the exact capitalization of their given username, such as “UserName”. This is the default value.
     * </p>
     * </dd>
     * <dt>False</dt>
     * <dd>
     * <p>
     * Enables case insensitivity for all username input. For example, when this option is set to <code>False</code>,
     * users can sign in using either "username" or "Username". This option also enables both
     * <code>preferred_username</code> and <code>email</code> alias to be case insensitive, in addition to the
     * <code>username</code> attribute.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param caseSensitive
     *        Specifies whether user name case sensitivity will be applied for all users in the user pool through Amazon
     *        Cognito APIs.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <dl>
     *        <dt>True</dt>
     *        <dd>
     *        <p>
     *        Enables case sensitivity for all username input. When this option is set to <code>True</code>, users must
     *        sign in using the exact capitalization of their given username, such as “UserName”. This is the default
     *        value.
     *        </p>
     *        </dd>
     *        <dt>False</dt>
     *        <dd>
     *        <p>
     *        Enables case insensitivity for all username input. For example, when this option is set to
     *        <code>False</code>, users can sign in using either "username" or "Username". This option also enables both
     *        <code>preferred_username</code> and <code>email</code> alias to be case insensitive, in addition to the
     *        <code>username</code> attribute.
     *        </p>
     *        </dd>
     */

    public void setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    /**
     * <p>
     * Specifies whether user name case sensitivity will be applied for all users in the user pool through Amazon
     * Cognito APIs.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <dl>
     * <dt>True</dt>
     * <dd>
     * <p>
     * Enables case sensitivity for all username input. When this option is set to <code>True</code>, users must sign in
     * using the exact capitalization of their given username, such as “UserName”. This is the default value.
     * </p>
     * </dd>
     * <dt>False</dt>
     * <dd>
     * <p>
     * Enables case insensitivity for all username input. For example, when this option is set to <code>False</code>,
     * users can sign in using either "username" or "Username". This option also enables both
     * <code>preferred_username</code> and <code>email</code> alias to be case insensitive, in addition to the
     * <code>username</code> attribute.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Specifies whether user name case sensitivity will be applied for all users in the user pool through
     *         Amazon Cognito APIs.</p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <dl>
     *         <dt>True</dt>
     *         <dd>
     *         <p>
     *         Enables case sensitivity for all username input. When this option is set to <code>True</code>, users must
     *         sign in using the exact capitalization of their given username, such as “UserName”. This is the default
     *         value.
     *         </p>
     *         </dd>
     *         <dt>False</dt>
     *         <dd>
     *         <p>
     *         Enables case insensitivity for all username input. For example, when this option is set to
     *         <code>False</code>, users can sign in using either "username" or "Username". This option also enables
     *         both <code>preferred_username</code> and <code>email</code> alias to be case insensitive, in addition to
     *         the <code>username</code> attribute.
     *         </p>
     *         </dd>
     */

    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    /**
     * <p>
     * Specifies whether user name case sensitivity will be applied for all users in the user pool through Amazon
     * Cognito APIs.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <dl>
     * <dt>True</dt>
     * <dd>
     * <p>
     * Enables case sensitivity for all username input. When this option is set to <code>True</code>, users must sign in
     * using the exact capitalization of their given username, such as “UserName”. This is the default value.
     * </p>
     * </dd>
     * <dt>False</dt>
     * <dd>
     * <p>
     * Enables case insensitivity for all username input. For example, when this option is set to <code>False</code>,
     * users can sign in using either "username" or "Username". This option also enables both
     * <code>preferred_username</code> and <code>email</code> alias to be case insensitive, in addition to the
     * <code>username</code> attribute.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param caseSensitive
     *        Specifies whether user name case sensitivity will be applied for all users in the user pool through Amazon
     *        Cognito APIs.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <dl>
     *        <dt>True</dt>
     *        <dd>
     *        <p>
     *        Enables case sensitivity for all username input. When this option is set to <code>True</code>, users must
     *        sign in using the exact capitalization of their given username, such as “UserName”. This is the default
     *        value.
     *        </p>
     *        </dd>
     *        <dt>False</dt>
     *        <dd>
     *        <p>
     *        Enables case insensitivity for all username input. For example, when this option is set to
     *        <code>False</code>, users can sign in using either "username" or "Username". This option also enables both
     *        <code>preferred_username</code> and <code>email</code> alias to be case insensitive, in addition to the
     *        <code>username</code> attribute.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsernameConfigurationType withCaseSensitive(Boolean caseSensitive) {
        setCaseSensitive(caseSensitive);
        return this;
    }

    /**
     * <p>
     * Specifies whether user name case sensitivity will be applied for all users in the user pool through Amazon
     * Cognito APIs.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <dl>
     * <dt>True</dt>
     * <dd>
     * <p>
     * Enables case sensitivity for all username input. When this option is set to <code>True</code>, users must sign in
     * using the exact capitalization of their given username, such as “UserName”. This is the default value.
     * </p>
     * </dd>
     * <dt>False</dt>
     * <dd>
     * <p>
     * Enables case insensitivity for all username input. For example, when this option is set to <code>False</code>,
     * users can sign in using either "username" or "Username". This option also enables both
     * <code>preferred_username</code> and <code>email</code> alias to be case insensitive, in addition to the
     * <code>username</code> attribute.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Specifies whether user name case sensitivity will be applied for all users in the user pool through
     *         Amazon Cognito APIs.</p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <dl>
     *         <dt>True</dt>
     *         <dd>
     *         <p>
     *         Enables case sensitivity for all username input. When this option is set to <code>True</code>, users must
     *         sign in using the exact capitalization of their given username, such as “UserName”. This is the default
     *         value.
     *         </p>
     *         </dd>
     *         <dt>False</dt>
     *         <dd>
     *         <p>
     *         Enables case insensitivity for all username input. For example, when this option is set to
     *         <code>False</code>, users can sign in using either "username" or "Username". This option also enables
     *         both <code>preferred_username</code> and <code>email</code> alias to be case insensitive, in addition to
     *         the <code>username</code> attribute.
     *         </p>
     *         </dd>
     */

    public Boolean isCaseSensitive() {
        return this.caseSensitive;
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
        if (getCaseSensitive() != null)
            sb.append("CaseSensitive: ").append(getCaseSensitive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsernameConfigurationType == false)
            return false;
        UsernameConfigurationType other = (UsernameConfigurationType) obj;
        if (other.getCaseSensitive() == null ^ this.getCaseSensitive() == null)
            return false;
        if (other.getCaseSensitive() != null && other.getCaseSensitive().equals(this.getCaseSensitive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaseSensitive() == null) ? 0 : getCaseSensitive().hashCode());
        return hashCode;
    }

    @Override
    public UsernameConfigurationType clone() {
        try {
            return (UsernameConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.UsernameConfigurationTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
