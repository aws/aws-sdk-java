/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to associate a configuration set with an email identity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutEmailIdentityConfigurationSetAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEmailIdentityConfigurationSetAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The email address or domain that you want to associate with a configuration set.
     * </p>
     */
    private String emailIdentity;
    /**
     * <p>
     * The configuration set that you want to associate with an email identity.
     * </p>
     */
    private String configurationSetName;

    /**
     * <p>
     * The email address or domain that you want to associate with a configuration set.
     * </p>
     * 
     * @param emailIdentity
     *        The email address or domain that you want to associate with a configuration set.
     */

    public void setEmailIdentity(String emailIdentity) {
        this.emailIdentity = emailIdentity;
    }

    /**
     * <p>
     * The email address or domain that you want to associate with a configuration set.
     * </p>
     * 
     * @return The email address or domain that you want to associate with a configuration set.
     */

    public String getEmailIdentity() {
        return this.emailIdentity;
    }

    /**
     * <p>
     * The email address or domain that you want to associate with a configuration set.
     * </p>
     * 
     * @param emailIdentity
     *        The email address or domain that you want to associate with a configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEmailIdentityConfigurationSetAttributesRequest withEmailIdentity(String emailIdentity) {
        setEmailIdentity(emailIdentity);
        return this;
    }

    /**
     * <p>
     * The configuration set that you want to associate with an email identity.
     * </p>
     * 
     * @param configurationSetName
     *        The configuration set that you want to associate with an email identity.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The configuration set that you want to associate with an email identity.
     * </p>
     * 
     * @return The configuration set that you want to associate with an email identity.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The configuration set that you want to associate with an email identity.
     * </p>
     * 
     * @param configurationSetName
     *        The configuration set that you want to associate with an email identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEmailIdentityConfigurationSetAttributesRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
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
        if (getEmailIdentity() != null)
            sb.append("EmailIdentity: ").append(getEmailIdentity()).append(",");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEmailIdentityConfigurationSetAttributesRequest == false)
            return false;
        PutEmailIdentityConfigurationSetAttributesRequest other = (PutEmailIdentityConfigurationSetAttributesRequest) obj;
        if (other.getEmailIdentity() == null ^ this.getEmailIdentity() == null)
            return false;
        if (other.getEmailIdentity() != null && other.getEmailIdentity().equals(this.getEmailIdentity()) == false)
            return false;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailIdentity() == null) ? 0 : getEmailIdentity().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        return hashCode;
    }

    @Override
    public PutEmailIdentityConfigurationSetAttributesRequest clone() {
        return (PutEmailIdentityConfigurationSetAttributesRequest) super.clone();
    }

}
