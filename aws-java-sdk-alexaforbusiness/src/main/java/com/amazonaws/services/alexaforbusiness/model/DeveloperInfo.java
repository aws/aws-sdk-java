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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details about the developer that published the skill.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeveloperInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeveloperInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the developer.
     * </p>
     */
    private String developerName;
    /**
     * <p>
     * The URL of the privacy policy.
     * </p>
     */
    private String privacyPolicy;
    /**
     * <p>
     * The email of the developer.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The website of the developer.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The name of the developer.
     * </p>
     * 
     * @param developerName
     *        The name of the developer.
     */

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    /**
     * <p>
     * The name of the developer.
     * </p>
     * 
     * @return The name of the developer.
     */

    public String getDeveloperName() {
        return this.developerName;
    }

    /**
     * <p>
     * The name of the developer.
     * </p>
     * 
     * @param developerName
     *        The name of the developer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeveloperInfo withDeveloperName(String developerName) {
        setDeveloperName(developerName);
        return this;
    }

    /**
     * <p>
     * The URL of the privacy policy.
     * </p>
     * 
     * @param privacyPolicy
     *        The URL of the privacy policy.
     */

    public void setPrivacyPolicy(String privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
    }

    /**
     * <p>
     * The URL of the privacy policy.
     * </p>
     * 
     * @return The URL of the privacy policy.
     */

    public String getPrivacyPolicy() {
        return this.privacyPolicy;
    }

    /**
     * <p>
     * The URL of the privacy policy.
     * </p>
     * 
     * @param privacyPolicy
     *        The URL of the privacy policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeveloperInfo withPrivacyPolicy(String privacyPolicy) {
        setPrivacyPolicy(privacyPolicy);
        return this;
    }

    /**
     * <p>
     * The email of the developer.
     * </p>
     * 
     * @param email
     *        The email of the developer.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email of the developer.
     * </p>
     * 
     * @return The email of the developer.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email of the developer.
     * </p>
     * 
     * @param email
     *        The email of the developer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeveloperInfo withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The website of the developer.
     * </p>
     * 
     * @param url
     *        The website of the developer.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The website of the developer.
     * </p>
     * 
     * @return The website of the developer.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The website of the developer.
     * </p>
     * 
     * @param url
     *        The website of the developer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeveloperInfo withUrl(String url) {
        setUrl(url);
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
        if (getDeveloperName() != null)
            sb.append("DeveloperName: ").append(getDeveloperName()).append(",");
        if (getPrivacyPolicy() != null)
            sb.append("PrivacyPolicy: ").append(getPrivacyPolicy()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeveloperInfo == false)
            return false;
        DeveloperInfo other = (DeveloperInfo) obj;
        if (other.getDeveloperName() == null ^ this.getDeveloperName() == null)
            return false;
        if (other.getDeveloperName() != null && other.getDeveloperName().equals(this.getDeveloperName()) == false)
            return false;
        if (other.getPrivacyPolicy() == null ^ this.getPrivacyPolicy() == null)
            return false;
        if (other.getPrivacyPolicy() != null && other.getPrivacyPolicy().equals(this.getPrivacyPolicy()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeveloperName() == null) ? 0 : getDeveloperName().hashCode());
        hashCode = prime * hashCode + ((getPrivacyPolicy() == null) ? 0 : getPrivacyPolicy().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public DeveloperInfo clone() {
        try {
            return (DeveloperInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.DeveloperInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
