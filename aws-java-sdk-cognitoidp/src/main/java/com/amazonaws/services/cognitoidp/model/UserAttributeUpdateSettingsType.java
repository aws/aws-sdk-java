/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The settings for updates to user attributes. These settings include the property
 * <code>AttributesRequireVerificationBeforeUpdate</code>, a user-pool setting that tells Amazon Cognito how to handle
 * changes to the value of your users' email address and phone number attributes. For more information, see <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates"
 * > Verifying updates to email addresses and phone numbers</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UserAttributeUpdateSettingsType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserAttributeUpdateSettingsType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Requires that your user verifies their email address, phone number, or both before Amazon Cognito updates the
     * value of that attribute. When you update a user attribute that has this option activated, Amazon Cognito sends a
     * verification message to the new phone number or email address. Amazon Cognito doesn’t change the value of the
     * attribute until your user responds to the verification message and confirms the new value.
     * </p>
     * <p>
     * You can verify an updated email address or phone number with a <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     * >VerifyUserAttribute</a> API request. You can also call the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateUserAttributes.html"
     * >UpdateUserAttributes</a> or <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     * >AdminUpdateUserAttributes</a> API and set <code>email_verified</code> or <code>phone_number_verified</code> to
     * true.
     * </p>
     * <p>
     * When <code>AttributesRequireVerificationBeforeUpdate</code> is false, your user pool doesn't require that your
     * users verify attribute changes before Amazon Cognito updates them. In a user pool where
     * <code>AttributesRequireVerificationBeforeUpdate</code> is false, API operations that change attribute values can
     * immediately update a user’s <code>email</code> or <code>phone_number</code> attribute.
     * </p>
     */
    private java.util.List<String> attributesRequireVerificationBeforeUpdate;

    /**
     * <p>
     * Requires that your user verifies their email address, phone number, or both before Amazon Cognito updates the
     * value of that attribute. When you update a user attribute that has this option activated, Amazon Cognito sends a
     * verification message to the new phone number or email address. Amazon Cognito doesn’t change the value of the
     * attribute until your user responds to the verification message and confirms the new value.
     * </p>
     * <p>
     * You can verify an updated email address or phone number with a <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     * >VerifyUserAttribute</a> API request. You can also call the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateUserAttributes.html"
     * >UpdateUserAttributes</a> or <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     * >AdminUpdateUserAttributes</a> API and set <code>email_verified</code> or <code>phone_number_verified</code> to
     * true.
     * </p>
     * <p>
     * When <code>AttributesRequireVerificationBeforeUpdate</code> is false, your user pool doesn't require that your
     * users verify attribute changes before Amazon Cognito updates them. In a user pool where
     * <code>AttributesRequireVerificationBeforeUpdate</code> is false, API operations that change attribute values can
     * immediately update a user’s <code>email</code> or <code>phone_number</code> attribute.
     * </p>
     * 
     * @return Requires that your user verifies their email address, phone number, or both before Amazon Cognito updates
     *         the value of that attribute. When you update a user attribute that has this option activated, Amazon
     *         Cognito sends a verification message to the new phone number or email address. Amazon Cognito doesn’t
     *         change the value of the attribute until your user responds to the verification message and confirms the
     *         new value.</p>
     *         <p>
     *         You can verify an updated email address or phone number with a <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     *         >VerifyUserAttribute</a> API request. You can also call the <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateUserAttributes.html"
     *         >UpdateUserAttributes</a> or <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     *         >AdminUpdateUserAttributes</a> API and set <code>email_verified</code> or
     *         <code>phone_number_verified</code> to true.
     *         </p>
     *         <p>
     *         When <code>AttributesRequireVerificationBeforeUpdate</code> is false, your user pool doesn't require that
     *         your users verify attribute changes before Amazon Cognito updates them. In a user pool where
     *         <code>AttributesRequireVerificationBeforeUpdate</code> is false, API operations that change attribute
     *         values can immediately update a user’s <code>email</code> or <code>phone_number</code> attribute.
     * @see VerifiedAttributeType
     */

    public java.util.List<String> getAttributesRequireVerificationBeforeUpdate() {
        return attributesRequireVerificationBeforeUpdate;
    }

    /**
     * <p>
     * Requires that your user verifies their email address, phone number, or both before Amazon Cognito updates the
     * value of that attribute. When you update a user attribute that has this option activated, Amazon Cognito sends a
     * verification message to the new phone number or email address. Amazon Cognito doesn’t change the value of the
     * attribute until your user responds to the verification message and confirms the new value.
     * </p>
     * <p>
     * You can verify an updated email address or phone number with a <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     * >VerifyUserAttribute</a> API request. You can also call the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateUserAttributes.html"
     * >UpdateUserAttributes</a> or <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     * >AdminUpdateUserAttributes</a> API and set <code>email_verified</code> or <code>phone_number_verified</code> to
     * true.
     * </p>
     * <p>
     * When <code>AttributesRequireVerificationBeforeUpdate</code> is false, your user pool doesn't require that your
     * users verify attribute changes before Amazon Cognito updates them. In a user pool where
     * <code>AttributesRequireVerificationBeforeUpdate</code> is false, API operations that change attribute values can
     * immediately update a user’s <code>email</code> or <code>phone_number</code> attribute.
     * </p>
     * 
     * @param attributesRequireVerificationBeforeUpdate
     *        Requires that your user verifies their email address, phone number, or both before Amazon Cognito updates
     *        the value of that attribute. When you update a user attribute that has this option activated, Amazon
     *        Cognito sends a verification message to the new phone number or email address. Amazon Cognito doesn’t
     *        change the value of the attribute until your user responds to the verification message and confirms the
     *        new value.</p>
     *        <p>
     *        You can verify an updated email address or phone number with a <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     *        >VerifyUserAttribute</a> API request. You can also call the <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateUserAttributes.html"
     *        >UpdateUserAttributes</a> or <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     *        >AdminUpdateUserAttributes</a> API and set <code>email_verified</code> or
     *        <code>phone_number_verified</code> to true.
     *        </p>
     *        <p>
     *        When <code>AttributesRequireVerificationBeforeUpdate</code> is false, your user pool doesn't require that
     *        your users verify attribute changes before Amazon Cognito updates them. In a user pool where
     *        <code>AttributesRequireVerificationBeforeUpdate</code> is false, API operations that change attribute
     *        values can immediately update a user’s <code>email</code> or <code>phone_number</code> attribute.
     * @see VerifiedAttributeType
     */

    public void setAttributesRequireVerificationBeforeUpdate(java.util.Collection<String> attributesRequireVerificationBeforeUpdate) {
        if (attributesRequireVerificationBeforeUpdate == null) {
            this.attributesRequireVerificationBeforeUpdate = null;
            return;
        }

        this.attributesRequireVerificationBeforeUpdate = new java.util.ArrayList<String>(attributesRequireVerificationBeforeUpdate);
    }

    /**
     * <p>
     * Requires that your user verifies their email address, phone number, or both before Amazon Cognito updates the
     * value of that attribute. When you update a user attribute that has this option activated, Amazon Cognito sends a
     * verification message to the new phone number or email address. Amazon Cognito doesn’t change the value of the
     * attribute until your user responds to the verification message and confirms the new value.
     * </p>
     * <p>
     * You can verify an updated email address or phone number with a <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     * >VerifyUserAttribute</a> API request. You can also call the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateUserAttributes.html"
     * >UpdateUserAttributes</a> or <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     * >AdminUpdateUserAttributes</a> API and set <code>email_verified</code> or <code>phone_number_verified</code> to
     * true.
     * </p>
     * <p>
     * When <code>AttributesRequireVerificationBeforeUpdate</code> is false, your user pool doesn't require that your
     * users verify attribute changes before Amazon Cognito updates them. In a user pool where
     * <code>AttributesRequireVerificationBeforeUpdate</code> is false, API operations that change attribute values can
     * immediately update a user’s <code>email</code> or <code>phone_number</code> attribute.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributesRequireVerificationBeforeUpdate(java.util.Collection)} or
     * {@link #withAttributesRequireVerificationBeforeUpdate(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param attributesRequireVerificationBeforeUpdate
     *        Requires that your user verifies their email address, phone number, or both before Amazon Cognito updates
     *        the value of that attribute. When you update a user attribute that has this option activated, Amazon
     *        Cognito sends a verification message to the new phone number or email address. Amazon Cognito doesn’t
     *        change the value of the attribute until your user responds to the verification message and confirms the
     *        new value.</p>
     *        <p>
     *        You can verify an updated email address or phone number with a <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     *        >VerifyUserAttribute</a> API request. You can also call the <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateUserAttributes.html"
     *        >UpdateUserAttributes</a> or <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     *        >AdminUpdateUserAttributes</a> API and set <code>email_verified</code> or
     *        <code>phone_number_verified</code> to true.
     *        </p>
     *        <p>
     *        When <code>AttributesRequireVerificationBeforeUpdate</code> is false, your user pool doesn't require that
     *        your users verify attribute changes before Amazon Cognito updates them. In a user pool where
     *        <code>AttributesRequireVerificationBeforeUpdate</code> is false, API operations that change attribute
     *        values can immediately update a user’s <code>email</code> or <code>phone_number</code> attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAttributeType
     */

    public UserAttributeUpdateSettingsType withAttributesRequireVerificationBeforeUpdate(String... attributesRequireVerificationBeforeUpdate) {
        if (this.attributesRequireVerificationBeforeUpdate == null) {
            setAttributesRequireVerificationBeforeUpdate(new java.util.ArrayList<String>(attributesRequireVerificationBeforeUpdate.length));
        }
        for (String ele : attributesRequireVerificationBeforeUpdate) {
            this.attributesRequireVerificationBeforeUpdate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Requires that your user verifies their email address, phone number, or both before Amazon Cognito updates the
     * value of that attribute. When you update a user attribute that has this option activated, Amazon Cognito sends a
     * verification message to the new phone number or email address. Amazon Cognito doesn’t change the value of the
     * attribute until your user responds to the verification message and confirms the new value.
     * </p>
     * <p>
     * You can verify an updated email address or phone number with a <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     * >VerifyUserAttribute</a> API request. You can also call the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateUserAttributes.html"
     * >UpdateUserAttributes</a> or <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     * >AdminUpdateUserAttributes</a> API and set <code>email_verified</code> or <code>phone_number_verified</code> to
     * true.
     * </p>
     * <p>
     * When <code>AttributesRequireVerificationBeforeUpdate</code> is false, your user pool doesn't require that your
     * users verify attribute changes before Amazon Cognito updates them. In a user pool where
     * <code>AttributesRequireVerificationBeforeUpdate</code> is false, API operations that change attribute values can
     * immediately update a user’s <code>email</code> or <code>phone_number</code> attribute.
     * </p>
     * 
     * @param attributesRequireVerificationBeforeUpdate
     *        Requires that your user verifies their email address, phone number, or both before Amazon Cognito updates
     *        the value of that attribute. When you update a user attribute that has this option activated, Amazon
     *        Cognito sends a verification message to the new phone number or email address. Amazon Cognito doesn’t
     *        change the value of the attribute until your user responds to the verification message and confirms the
     *        new value.</p>
     *        <p>
     *        You can verify an updated email address or phone number with a <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     *        >VerifyUserAttribute</a> API request. You can also call the <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateUserAttributes.html"
     *        >UpdateUserAttributes</a> or <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     *        >AdminUpdateUserAttributes</a> API and set <code>email_verified</code> or
     *        <code>phone_number_verified</code> to true.
     *        </p>
     *        <p>
     *        When <code>AttributesRequireVerificationBeforeUpdate</code> is false, your user pool doesn't require that
     *        your users verify attribute changes before Amazon Cognito updates them. In a user pool where
     *        <code>AttributesRequireVerificationBeforeUpdate</code> is false, API operations that change attribute
     *        values can immediately update a user’s <code>email</code> or <code>phone_number</code> attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAttributeType
     */

    public UserAttributeUpdateSettingsType withAttributesRequireVerificationBeforeUpdate(java.util.Collection<String> attributesRequireVerificationBeforeUpdate) {
        setAttributesRequireVerificationBeforeUpdate(attributesRequireVerificationBeforeUpdate);
        return this;
    }

    /**
     * <p>
     * Requires that your user verifies their email address, phone number, or both before Amazon Cognito updates the
     * value of that attribute. When you update a user attribute that has this option activated, Amazon Cognito sends a
     * verification message to the new phone number or email address. Amazon Cognito doesn’t change the value of the
     * attribute until your user responds to the verification message and confirms the new value.
     * </p>
     * <p>
     * You can verify an updated email address or phone number with a <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     * >VerifyUserAttribute</a> API request. You can also call the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateUserAttributes.html"
     * >UpdateUserAttributes</a> or <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     * >AdminUpdateUserAttributes</a> API and set <code>email_verified</code> or <code>phone_number_verified</code> to
     * true.
     * </p>
     * <p>
     * When <code>AttributesRequireVerificationBeforeUpdate</code> is false, your user pool doesn't require that your
     * users verify attribute changes before Amazon Cognito updates them. In a user pool where
     * <code>AttributesRequireVerificationBeforeUpdate</code> is false, API operations that change attribute values can
     * immediately update a user’s <code>email</code> or <code>phone_number</code> attribute.
     * </p>
     * 
     * @param attributesRequireVerificationBeforeUpdate
     *        Requires that your user verifies their email address, phone number, or both before Amazon Cognito updates
     *        the value of that attribute. When you update a user attribute that has this option activated, Amazon
     *        Cognito sends a verification message to the new phone number or email address. Amazon Cognito doesn’t
     *        change the value of the attribute until your user responds to the verification message and confirms the
     *        new value.</p>
     *        <p>
     *        You can verify an updated email address or phone number with a <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html"
     *        >VerifyUserAttribute</a> API request. You can also call the <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateUserAttributes.html"
     *        >UpdateUserAttributes</a> or <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html"
     *        >AdminUpdateUserAttributes</a> API and set <code>email_verified</code> or
     *        <code>phone_number_verified</code> to true.
     *        </p>
     *        <p>
     *        When <code>AttributesRequireVerificationBeforeUpdate</code> is false, your user pool doesn't require that
     *        your users verify attribute changes before Amazon Cognito updates them. In a user pool where
     *        <code>AttributesRequireVerificationBeforeUpdate</code> is false, API operations that change attribute
     *        values can immediately update a user’s <code>email</code> or <code>phone_number</code> attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAttributeType
     */

    public UserAttributeUpdateSettingsType withAttributesRequireVerificationBeforeUpdate(VerifiedAttributeType... attributesRequireVerificationBeforeUpdate) {
        java.util.ArrayList<String> attributesRequireVerificationBeforeUpdateCopy = new java.util.ArrayList<String>(
                attributesRequireVerificationBeforeUpdate.length);
        for (VerifiedAttributeType value : attributesRequireVerificationBeforeUpdate) {
            attributesRequireVerificationBeforeUpdateCopy.add(value.toString());
        }
        if (getAttributesRequireVerificationBeforeUpdate() == null) {
            setAttributesRequireVerificationBeforeUpdate(attributesRequireVerificationBeforeUpdateCopy);
        } else {
            getAttributesRequireVerificationBeforeUpdate().addAll(attributesRequireVerificationBeforeUpdateCopy);
        }
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
        if (getAttributesRequireVerificationBeforeUpdate() != null)
            sb.append("AttributesRequireVerificationBeforeUpdate: ").append(getAttributesRequireVerificationBeforeUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserAttributeUpdateSettingsType == false)
            return false;
        UserAttributeUpdateSettingsType other = (UserAttributeUpdateSettingsType) obj;
        if (other.getAttributesRequireVerificationBeforeUpdate() == null ^ this.getAttributesRequireVerificationBeforeUpdate() == null)
            return false;
        if (other.getAttributesRequireVerificationBeforeUpdate() != null
                && other.getAttributesRequireVerificationBeforeUpdate().equals(this.getAttributesRequireVerificationBeforeUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttributesRequireVerificationBeforeUpdate() == null) ? 0 : getAttributesRequireVerificationBeforeUpdate().hashCode());
        return hashCode;
    }

    @Override
    public UserAttributeUpdateSettingsType clone() {
        try {
            return (UserAttributeUpdateSettingsType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.UserAttributeUpdateSettingsTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
