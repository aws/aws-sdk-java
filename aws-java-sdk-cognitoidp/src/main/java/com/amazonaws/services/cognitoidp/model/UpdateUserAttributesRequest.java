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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to update user attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * <p>
     * If you have set an attribute to require verification before Amazon Cognito updates its value, this request
     * doesn’t immediately update the value of that attribute. After your user receives and responds to a verification
     * message to verify the new value, Amazon Cognito updates the attribute value. Your user can sign in and receive
     * messages with the original attribute value until they verify the new value.
     * </p>
     */
    private java.util.List<AttributeType> userAttributes;
    /**
     * <p>
     * A valid access token that Amazon Cognito issued to the user whose user attributes you want to update.
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     * initiates.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool triggers. When you use the
     * UpdateUserAttributes API action, Amazon Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which the function
     * receives as input. This payload contains a <code>clientMetadata</code> attribute, which provides the data that
     * you assigned to the ClientMetadata parameter in your UpdateUserAttributes request. In your function code in
     * Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a user pool
     * to support custom workflows. If your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private java.util.Map<String, String> clientMetadata;

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * <p>
     * If you have set an attribute to require verification before Amazon Cognito updates its value, this request
     * doesn’t immediately update the value of that attribute. After your user receives and responds to a verification
     * message to verify the new value, Amazon Cognito updates the attribute value. Your user can sign in and receive
     * messages with the original attribute value until they verify the new value.
     * </p>
     * 
     * @return An array of name-value pairs representing user attributes.</p>
     *         <p>
     *         For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     *         </p>
     *         <p>
     *         If you have set an attribute to require verification before Amazon Cognito updates its value, this
     *         request doesn’t immediately update the value of that attribute. After your user receives and responds to
     *         a verification message to verify the new value, Amazon Cognito updates the attribute value. Your user can
     *         sign in and receive messages with the original attribute value until they verify the new value.
     */

    public java.util.List<AttributeType> getUserAttributes() {
        return userAttributes;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * <p>
     * If you have set an attribute to require verification before Amazon Cognito updates its value, this request
     * doesn’t immediately update the value of that attribute. After your user receives and responds to a verification
     * message to verify the new value, Amazon Cognito updates the attribute value. Your user can sign in and receive
     * messages with the original attribute value until they verify the new value.
     * </p>
     * 
     * @param userAttributes
     *        An array of name-value pairs representing user attributes.</p>
     *        <p>
     *        For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     *        </p>
     *        <p>
     *        If you have set an attribute to require verification before Amazon Cognito updates its value, this request
     *        doesn’t immediately update the value of that attribute. After your user receives and responds to a
     *        verification message to verify the new value, Amazon Cognito updates the attribute value. Your user can
     *        sign in and receive messages with the original attribute value until they verify the new value.
     */

    public void setUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
            return;
        }

        this.userAttributes = new java.util.ArrayList<AttributeType>(userAttributes);
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * <p>
     * If you have set an attribute to require verification before Amazon Cognito updates its value, this request
     * doesn’t immediately update the value of that attribute. After your user receives and responds to a verification
     * message to verify the new value, Amazon Cognito updates the attribute value. Your user can sign in and receive
     * messages with the original attribute value until they verify the new value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAttributes(java.util.Collection)} or {@link #withUserAttributes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userAttributes
     *        An array of name-value pairs representing user attributes.</p>
     *        <p>
     *        For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     *        </p>
     *        <p>
     *        If you have set an attribute to require verification before Amazon Cognito updates its value, this request
     *        doesn’t immediately update the value of that attribute. After your user receives and responds to a
     *        verification message to verify the new value, Amazon Cognito updates the attribute value. Your user can
     *        sign in and receive messages with the original attribute value until they verify the new value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserAttributesRequest withUserAttributes(AttributeType... userAttributes) {
        if (this.userAttributes == null) {
            setUserAttributes(new java.util.ArrayList<AttributeType>(userAttributes.length));
        }
        for (AttributeType ele : userAttributes) {
            this.userAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * <p>
     * If you have set an attribute to require verification before Amazon Cognito updates its value, this request
     * doesn’t immediately update the value of that attribute. After your user receives and responds to a verification
     * message to verify the new value, Amazon Cognito updates the attribute value. Your user can sign in and receive
     * messages with the original attribute value until they verify the new value.
     * </p>
     * 
     * @param userAttributes
     *        An array of name-value pairs representing user attributes.</p>
     *        <p>
     *        For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     *        </p>
     *        <p>
     *        If you have set an attribute to require verification before Amazon Cognito updates its value, this request
     *        doesn’t immediately update the value of that attribute. After your user receives and responds to a
     *        verification message to verify the new value, Amazon Cognito updates the attribute value. Your user can
     *        sign in and receive messages with the original attribute value until they verify the new value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserAttributesRequest withUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        setUserAttributes(userAttributes);
        return this;
    }

    /**
     * <p>
     * A valid access token that Amazon Cognito issued to the user whose user attributes you want to update.
     * </p>
     * 
     * @param accessToken
     *        A valid access token that Amazon Cognito issued to the user whose user attributes you want to update.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * A valid access token that Amazon Cognito issued to the user whose user attributes you want to update.
     * </p>
     * 
     * @return A valid access token that Amazon Cognito issued to the user whose user attributes you want to update.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * A valid access token that Amazon Cognito issued to the user whose user attributes you want to update.
     * </p>
     * 
     * @param accessToken
     *        A valid access token that Amazon Cognito issued to the user whose user attributes you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserAttributesRequest withAccessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     * initiates.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool triggers. When you use the
     * UpdateUserAttributes API action, Amazon Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which the function
     * receives as input. This payload contains a <code>clientMetadata</code> attribute, which provides the data that
     * you assigned to the ClientMetadata parameter in your UpdateUserAttributes request. In your function code in
     * Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a user pool
     * to support custom workflows. If your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     *         initiates. </p>
     *         <p>
     *         You create custom workflows by assigning Lambda functions to user pool triggers. When you use the
     *         UpdateUserAttributes API action, Amazon Cognito invokes the function that is assigned to the <i>custom
     *         message</i> trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which the
     *         function receives as input. This payload contains a <code>clientMetadata</code> attribute, which provides
     *         the data that you assigned to the ClientMetadata parameter in your UpdateUserAttributes request. In your
     *         function code in Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow
     *         for your specific needs.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *         > Customizing user pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a
     *         user pool to support custom workflows. If your user pool configuration doesn't include triggers, the
     *         ClientMetadata parameter serves no purpose.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Validate the ClientMetadata value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.
     *         </p>
     *         </li>
     *         </ul>
     */

    public java.util.Map<String, String> getClientMetadata() {
        return clientMetadata;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     * initiates.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool triggers. When you use the
     * UpdateUserAttributes API action, Amazon Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which the function
     * receives as input. This payload contains a <code>clientMetadata</code> attribute, which provides the data that
     * you assigned to the ClientMetadata parameter in your UpdateUserAttributes request. In your function code in
     * Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a user pool
     * to support custom workflows. If your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param clientMetadata
     *        A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     *        initiates. </p>
     *        <p>
     *        You create custom workflows by assigning Lambda functions to user pool triggers. When you use the
     *        UpdateUserAttributes API action, Amazon Cognito invokes the function that is assigned to the <i>custom
     *        message</i> trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which the
     *        function receives as input. This payload contains a <code>clientMetadata</code> attribute, which provides
     *        the data that you assigned to the ClientMetadata parameter in your UpdateUserAttributes request. In your
     *        function code in Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow
     *        for your specific needs.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *        > Customizing user pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a user
     *        pool to support custom workflows. If your user pool configuration doesn't include triggers, the
     *        ClientMetadata parameter serves no purpose.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Validate the ClientMetadata value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setClientMetadata(java.util.Map<String, String> clientMetadata) {
        this.clientMetadata = clientMetadata;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     * initiates.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool triggers. When you use the
     * UpdateUserAttributes API action, Amazon Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which the function
     * receives as input. This payload contains a <code>clientMetadata</code> attribute, which provides the data that
     * you assigned to the ClientMetadata parameter in your UpdateUserAttributes request. In your function code in
     * Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a user pool
     * to support custom workflows. If your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param clientMetadata
     *        A map of custom key-value pairs that you can provide as input for any custom workflows that this action
     *        initiates. </p>
     *        <p>
     *        You create custom workflows by assigning Lambda functions to user pool triggers. When you use the
     *        UpdateUserAttributes API action, Amazon Cognito invokes the function that is assigned to the <i>custom
     *        message</i> trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which the
     *        function receives as input. This payload contains a <code>clientMetadata</code> attribute, which provides
     *        the data that you assigned to the ClientMetadata parameter in your UpdateUserAttributes request. In your
     *        function code in Lambda, you can process the <code>clientMetadata</code> value to enhance your workflow
     *        for your specific needs.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *        > Customizing user pool Workflows with Lambda Triggers</a> in the <i>Amazon Cognito Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a user
     *        pool to support custom workflows. If your user pool configuration doesn't include triggers, the
     *        ClientMetadata parameter serves no purpose.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Validate the ClientMetadata value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserAttributesRequest withClientMetadata(java.util.Map<String, String> clientMetadata) {
        setClientMetadata(clientMetadata);
        return this;
    }

    /**
     * Add a single ClientMetadata entry
     *
     * @see UpdateUserAttributesRequest#withClientMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserAttributesRequest addClientMetadataEntry(String key, String value) {
        if (null == this.clientMetadata) {
            this.clientMetadata = new java.util.HashMap<String, String>();
        }
        if (this.clientMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.clientMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ClientMetadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserAttributesRequest clearClientMetadataEntries() {
        this.clientMetadata = null;
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
        if (getUserAttributes() != null)
            sb.append("UserAttributes: ").append(getUserAttributes()).append(",");
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientMetadata() != null)
            sb.append("ClientMetadata: ").append(getClientMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserAttributesRequest == false)
            return false;
        UpdateUserAttributesRequest other = (UpdateUserAttributesRequest) obj;
        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null && other.getUserAttributes().equals(this.getUserAttributes()) == false)
            return false;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getClientMetadata() == null ^ this.getClientMetadata() == null)
            return false;
        if (other.getClientMetadata() != null && other.getClientMetadata().equals(this.getClientMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode());
        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getClientMetadata() == null) ? 0 : getClientMetadata().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserAttributesRequest clone() {
        return (UpdateUserAttributesRequest) super.clone();
    }

}
