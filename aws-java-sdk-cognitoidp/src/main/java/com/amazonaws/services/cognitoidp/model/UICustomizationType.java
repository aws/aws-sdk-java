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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A container for the UI customization information for a user pool's built-in app UI.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UICustomizationType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UICustomizationType implements Serializable, Cloneable, StructuredPojo {

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
     * The logo image for the UI customization.
     * </p>
     */
    private String imageUrl;
    /**
     * <p>
     * The CSS values in the UI customization.
     * </p>
     */
    private String cSS;
    /**
     * <p>
     * The CSS version number.
     * </p>
     */
    private String cSSVersion;
    /**
     * <p>
     * The last-modified date for the UI customization.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The creation date for the UI customization.
     * </p>
     */
    private java.util.Date creationDate;

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

    public UICustomizationType withUserPoolId(String userPoolId) {
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

    public UICustomizationType withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The logo image for the UI customization.
     * </p>
     * 
     * @param imageUrl
     *        The logo image for the UI customization.
     */

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * <p>
     * The logo image for the UI customization.
     * </p>
     * 
     * @return The logo image for the UI customization.
     */

    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * <p>
     * The logo image for the UI customization.
     * </p>
     * 
     * @param imageUrl
     *        The logo image for the UI customization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UICustomizationType withImageUrl(String imageUrl) {
        setImageUrl(imageUrl);
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

    public UICustomizationType withCSS(String cSS) {
        setCSS(cSS);
        return this;
    }

    /**
     * <p>
     * The CSS version number.
     * </p>
     * 
     * @param cSSVersion
     *        The CSS version number.
     */

    public void setCSSVersion(String cSSVersion) {
        this.cSSVersion = cSSVersion;
    }

    /**
     * <p>
     * The CSS version number.
     * </p>
     * 
     * @return The CSS version number.
     */

    public String getCSSVersion() {
        return this.cSSVersion;
    }

    /**
     * <p>
     * The CSS version number.
     * </p>
     * 
     * @param cSSVersion
     *        The CSS version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UICustomizationType withCSSVersion(String cSSVersion) {
        setCSSVersion(cSSVersion);
        return this;
    }

    /**
     * <p>
     * The last-modified date for the UI customization.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last-modified date for the UI customization.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The last-modified date for the UI customization.
     * </p>
     * 
     * @return The last-modified date for the UI customization.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The last-modified date for the UI customization.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last-modified date for the UI customization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UICustomizationType withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The creation date for the UI customization.
     * </p>
     * 
     * @param creationDate
     *        The creation date for the UI customization.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date for the UI customization.
     * </p>
     * 
     * @return The creation date for the UI customization.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date for the UI customization.
     * </p>
     * 
     * @param creationDate
     *        The creation date for the UI customization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UICustomizationType withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getImageUrl() != null)
            sb.append("ImageUrl: ").append(getImageUrl()).append(",");
        if (getCSS() != null)
            sb.append("CSS: ").append(getCSS()).append(",");
        if (getCSSVersion() != null)
            sb.append("CSSVersion: ").append(getCSSVersion()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UICustomizationType == false)
            return false;
        UICustomizationType other = (UICustomizationType) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getImageUrl() == null ^ this.getImageUrl() == null)
            return false;
        if (other.getImageUrl() != null && other.getImageUrl().equals(this.getImageUrl()) == false)
            return false;
        if (other.getCSS() == null ^ this.getCSS() == null)
            return false;
        if (other.getCSS() != null && other.getCSS().equals(this.getCSS()) == false)
            return false;
        if (other.getCSSVersion() == null ^ this.getCSSVersion() == null)
            return false;
        if (other.getCSSVersion() != null && other.getCSSVersion().equals(this.getCSSVersion()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        hashCode = prime * hashCode + ((getCSS() == null) ? 0 : getCSS().hashCode());
        hashCode = prime * hashCode + ((getCSSVersion() == null) ? 0 : getCSSVersion().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public UICustomizationType clone() {
        try {
            return (UICustomizationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.UICustomizationTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
