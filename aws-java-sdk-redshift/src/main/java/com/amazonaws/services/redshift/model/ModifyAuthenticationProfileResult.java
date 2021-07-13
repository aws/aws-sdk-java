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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyAuthenticationProfile"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyAuthenticationProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the authentication profile that was replaced.
     * </p>
     */
    private String authenticationProfileName;
    /**
     * <p>
     * The updated content of the authentication profile in JSON format.
     * </p>
     */
    private String authenticationProfileContent;

    /**
     * <p>
     * The name of the authentication profile that was replaced.
     * </p>
     * 
     * @param authenticationProfileName
     *        The name of the authentication profile that was replaced.
     */

    public void setAuthenticationProfileName(String authenticationProfileName) {
        this.authenticationProfileName = authenticationProfileName;
    }

    /**
     * <p>
     * The name of the authentication profile that was replaced.
     * </p>
     * 
     * @return The name of the authentication profile that was replaced.
     */

    public String getAuthenticationProfileName() {
        return this.authenticationProfileName;
    }

    /**
     * <p>
     * The name of the authentication profile that was replaced.
     * </p>
     * 
     * @param authenticationProfileName
     *        The name of the authentication profile that was replaced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyAuthenticationProfileResult withAuthenticationProfileName(String authenticationProfileName) {
        setAuthenticationProfileName(authenticationProfileName);
        return this;
    }

    /**
     * <p>
     * The updated content of the authentication profile in JSON format.
     * </p>
     * 
     * @param authenticationProfileContent
     *        The updated content of the authentication profile in JSON format.
     */

    public void setAuthenticationProfileContent(String authenticationProfileContent) {
        this.authenticationProfileContent = authenticationProfileContent;
    }

    /**
     * <p>
     * The updated content of the authentication profile in JSON format.
     * </p>
     * 
     * @return The updated content of the authentication profile in JSON format.
     */

    public String getAuthenticationProfileContent() {
        return this.authenticationProfileContent;
    }

    /**
     * <p>
     * The updated content of the authentication profile in JSON format.
     * </p>
     * 
     * @param authenticationProfileContent
     *        The updated content of the authentication profile in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyAuthenticationProfileResult withAuthenticationProfileContent(String authenticationProfileContent) {
        setAuthenticationProfileContent(authenticationProfileContent);
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
        if (getAuthenticationProfileName() != null)
            sb.append("AuthenticationProfileName: ").append(getAuthenticationProfileName()).append(",");
        if (getAuthenticationProfileContent() != null)
            sb.append("AuthenticationProfileContent: ").append(getAuthenticationProfileContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyAuthenticationProfileResult == false)
            return false;
        ModifyAuthenticationProfileResult other = (ModifyAuthenticationProfileResult) obj;
        if (other.getAuthenticationProfileName() == null ^ this.getAuthenticationProfileName() == null)
            return false;
        if (other.getAuthenticationProfileName() != null && other.getAuthenticationProfileName().equals(this.getAuthenticationProfileName()) == false)
            return false;
        if (other.getAuthenticationProfileContent() == null ^ this.getAuthenticationProfileContent() == null)
            return false;
        if (other.getAuthenticationProfileContent() != null && other.getAuthenticationProfileContent().equals(this.getAuthenticationProfileContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationProfileName() == null) ? 0 : getAuthenticationProfileName().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationProfileContent() == null) ? 0 : getAuthenticationProfileContent().hashCode());
        return hashCode;
    }

    @Override
    public ModifyAuthenticationProfileResult clone() {
        try {
            return (ModifyAuthenticationProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
