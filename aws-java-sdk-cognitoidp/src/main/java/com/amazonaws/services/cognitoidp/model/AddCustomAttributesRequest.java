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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to add custom attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AddCustomAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddCustomAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool where you want to add custom attributes.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * An array of custom attributes, such as Mutable and Name.
     * </p>
     */
    private java.util.List<SchemaAttributeType> customAttributes;

    /**
     * <p>
     * The user pool ID for the user pool where you want to add custom attributes.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to add custom attributes.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to add custom attributes.
     * </p>
     * 
     * @return The user pool ID for the user pool where you want to add custom attributes.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to add custom attributes.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to add custom attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddCustomAttributesRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * An array of custom attributes, such as Mutable and Name.
     * </p>
     * 
     * @return An array of custom attributes, such as Mutable and Name.
     */

    public java.util.List<SchemaAttributeType> getCustomAttributes() {
        return customAttributes;
    }

    /**
     * <p>
     * An array of custom attributes, such as Mutable and Name.
     * </p>
     * 
     * @param customAttributes
     *        An array of custom attributes, such as Mutable and Name.
     */

    public void setCustomAttributes(java.util.Collection<SchemaAttributeType> customAttributes) {
        if (customAttributes == null) {
            this.customAttributes = null;
            return;
        }

        this.customAttributes = new java.util.ArrayList<SchemaAttributeType>(customAttributes);
    }

    /**
     * <p>
     * An array of custom attributes, such as Mutable and Name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomAttributes(java.util.Collection)} or {@link #withCustomAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param customAttributes
     *        An array of custom attributes, such as Mutable and Name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddCustomAttributesRequest withCustomAttributes(SchemaAttributeType... customAttributes) {
        if (this.customAttributes == null) {
            setCustomAttributes(new java.util.ArrayList<SchemaAttributeType>(customAttributes.length));
        }
        for (SchemaAttributeType ele : customAttributes) {
            this.customAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of custom attributes, such as Mutable and Name.
     * </p>
     * 
     * @param customAttributes
     *        An array of custom attributes, such as Mutable and Name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddCustomAttributesRequest withCustomAttributes(java.util.Collection<SchemaAttributeType> customAttributes) {
        setCustomAttributes(customAttributes);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getCustomAttributes() != null)
            sb.append("CustomAttributes: ").append(getCustomAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddCustomAttributesRequest == false)
            return false;
        AddCustomAttributesRequest other = (AddCustomAttributesRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getCustomAttributes() == null ^ this.getCustomAttributes() == null)
            return false;
        if (other.getCustomAttributes() != null && other.getCustomAttributes().equals(this.getCustomAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getCustomAttributes() == null) ? 0 : getCustomAttributes().hashCode());
        return hashCode;
    }

    @Override
    public AddCustomAttributesRequest clone() {
        return (AddCustomAttributesRequest) super.clone();
    }

}
