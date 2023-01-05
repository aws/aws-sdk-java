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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information for the identifiers of your users.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UserIdentityConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserIdentityConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IAM Identity Center field name that contains the identifiers of your users, such as their emails. This is
     * used for <a href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">user context
     * filtering</a> and for granting access to your Amazon Kendra experience. You must set up IAM Identity Center with
     * Amazon Kendra. You must include your users and groups in your Access Control List when you ingest documents into
     * your index. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/getting-started-aws-sso.html">Getting started with an IAM
     * Identity Center identity source</a>.
     * </p>
     */
    private String identityAttributeName;

    /**
     * <p>
     * The IAM Identity Center field name that contains the identifiers of your users, such as their emails. This is
     * used for <a href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">user context
     * filtering</a> and for granting access to your Amazon Kendra experience. You must set up IAM Identity Center with
     * Amazon Kendra. You must include your users and groups in your Access Control List when you ingest documents into
     * your index. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/getting-started-aws-sso.html">Getting started with an IAM
     * Identity Center identity source</a>.
     * </p>
     * 
     * @param identityAttributeName
     *        The IAM Identity Center field name that contains the identifiers of your users, such as their emails. This
     *        is used for <a href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">user context
     *        filtering</a> and for granting access to your Amazon Kendra experience. You must set up IAM Identity
     *        Center with Amazon Kendra. You must include your users and groups in your Access Control List when you
     *        ingest documents into your index. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/getting-started-aws-sso.html">Getting started with an
     *        IAM Identity Center identity source</a>.
     */

    public void setIdentityAttributeName(String identityAttributeName) {
        this.identityAttributeName = identityAttributeName;
    }

    /**
     * <p>
     * The IAM Identity Center field name that contains the identifiers of your users, such as their emails. This is
     * used for <a href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">user context
     * filtering</a> and for granting access to your Amazon Kendra experience. You must set up IAM Identity Center with
     * Amazon Kendra. You must include your users and groups in your Access Control List when you ingest documents into
     * your index. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/getting-started-aws-sso.html">Getting started with an IAM
     * Identity Center identity source</a>.
     * </p>
     * 
     * @return The IAM Identity Center field name that contains the identifiers of your users, such as their emails.
     *         This is used for <a href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">user
     *         context filtering</a> and for granting access to your Amazon Kendra experience. You must set up IAM
     *         Identity Center with Amazon Kendra. You must include your users and groups in your Access Control List
     *         when you ingest documents into your index. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/getting-started-aws-sso.html">Getting started with an
     *         IAM Identity Center identity source</a>.
     */

    public String getIdentityAttributeName() {
        return this.identityAttributeName;
    }

    /**
     * <p>
     * The IAM Identity Center field name that contains the identifiers of your users, such as their emails. This is
     * used for <a href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">user context
     * filtering</a> and for granting access to your Amazon Kendra experience. You must set up IAM Identity Center with
     * Amazon Kendra. You must include your users and groups in your Access Control List when you ingest documents into
     * your index. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/getting-started-aws-sso.html">Getting started with an IAM
     * Identity Center identity source</a>.
     * </p>
     * 
     * @param identityAttributeName
     *        The IAM Identity Center field name that contains the identifiers of your users, such as their emails. This
     *        is used for <a href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">user context
     *        filtering</a> and for granting access to your Amazon Kendra experience. You must set up IAM Identity
     *        Center with Amazon Kendra. You must include your users and groups in your Access Control List when you
     *        ingest documents into your index. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/getting-started-aws-sso.html">Getting started with an
     *        IAM Identity Center identity source</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdentityConfiguration withIdentityAttributeName(String identityAttributeName) {
        setIdentityAttributeName(identityAttributeName);
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
        if (getIdentityAttributeName() != null)
            sb.append("IdentityAttributeName: ").append(getIdentityAttributeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserIdentityConfiguration == false)
            return false;
        UserIdentityConfiguration other = (UserIdentityConfiguration) obj;
        if (other.getIdentityAttributeName() == null ^ this.getIdentityAttributeName() == null)
            return false;
        if (other.getIdentityAttributeName() != null && other.getIdentityAttributeName().equals(this.getIdentityAttributeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityAttributeName() == null) ? 0 : getIdentityAttributeName().hashCode());
        return hashCode;
    }

    @Override
    public UserIdentityConfiguration clone() {
        try {
            return (UserIdentityConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.UserIdentityConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
