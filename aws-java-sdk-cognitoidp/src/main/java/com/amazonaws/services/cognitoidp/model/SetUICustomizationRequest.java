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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUICustomization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetUICustomizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The client ID for the client app.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The CSS values in the UI customization.
     * </p>
     */
    private String cSS;
    /**
     * <p>
     * The uploaded logo image for the UI customization.
     * </p>
     */
    private java.nio.ByteBuffer imageFile;

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * 
     * @return The user pool ID for the user pool.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetUICustomizationRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The client ID for the client app.
     * </p>
     * 
     * @param clientId
     *        The client ID for the client app.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The client ID for the client app.
     * </p>
     * 
     * @return The client ID for the client app.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The client ID for the client app.
     * </p>
     * 
     * @param clientId
     *        The client ID for the client app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetUICustomizationRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The CSS values in the UI customization.
     * </p>
     * 
     * @param cSS
     *        The CSS values in the UI customization.
     */

    public void setCSS(String cSS) {
        this.cSS = cSS;
    }

    /**
     * <p>
     * The CSS values in the UI customization.
     * </p>
     * 
     * @return The CSS values in the UI customization.
     */

    public String getCSS() {
        return this.cSS;
    }

    /**
     * <p>
     * The CSS values in the UI customization.
     * </p>
     * 
     * @param cSS
     *        The CSS values in the UI customization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetUICustomizationRequest withCSS(String cSS) {
        setCSS(cSS);
        return this;
    }

    /**
     * <p>
     * The uploaded logo image for the UI customization.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param imageFile
     *        The uploaded logo image for the UI customization.
     */

    public void setImageFile(java.nio.ByteBuffer imageFile) {
        this.imageFile = imageFile;
    }

    /**
     * <p>
     * The uploaded logo image for the UI customization.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The uploaded logo image for the UI customization.
     */

    public java.nio.ByteBuffer getImageFile() {
        return this.imageFile;
    }

    /**
     * <p>
     * The uploaded logo image for the UI customization.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param imageFile
     *        The uploaded logo image for the UI customization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetUICustomizationRequest withImageFile(java.nio.ByteBuffer imageFile) {
        setImageFile(imageFile);
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
        if (getClientId() != null)
            sb.append("ClientId: ").append("***Sensitive Data Redacted***").append(",");
        if (getCSS() != null)
            sb.append("CSS: ").append(getCSS()).append(",");
        if (getImageFile() != null)
            sb.append("ImageFile: ").append(getImageFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetUICustomizationRequest == false)
            return false;
        SetUICustomizationRequest other = (SetUICustomizationRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getCSS() == null ^ this.getCSS() == null)
            return false;
        if (other.getCSS() != null && other.getCSS().equals(this.getCSS()) == false)
            return false;
        if (other.getImageFile() == null ^ this.getImageFile() == null)
            return false;
        if (other.getImageFile() != null && other.getImageFile().equals(this.getImageFile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getCSS() == null) ? 0 : getCSS().hashCode());
        hashCode = prime * hashCode + ((getImageFile() == null) ? 0 : getImageFile().hashCode());
        return hashCode;
    }

    @Override
    public SetUICustomizationRequest clone() {
        return (SetUICustomizationRequest) super.clone();
    }

}
