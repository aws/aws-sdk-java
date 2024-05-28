/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A request made by Amazon Q Business to a third paty authentication server to authenticate a custom plugin user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/AuthChallengeRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthChallengeRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL sent by Amazon Q Business to the third party authentication server to authenticate a custom plugin user
     * through an OAuth protocol.
     * </p>
     */
    private String authorizationUrl;

    /**
     * <p>
     * The URL sent by Amazon Q Business to the third party authentication server to authenticate a custom plugin user
     * through an OAuth protocol.
     * </p>
     * 
     * @param authorizationUrl
     *        The URL sent by Amazon Q Business to the third party authentication server to authenticate a custom plugin
     *        user through an OAuth protocol.
     */

    public void setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
    }

    /**
     * <p>
     * The URL sent by Amazon Q Business to the third party authentication server to authenticate a custom plugin user
     * through an OAuth protocol.
     * </p>
     * 
     * @return The URL sent by Amazon Q Business to the third party authentication server to authenticate a custom
     *         plugin user through an OAuth protocol.
     */

    public String getAuthorizationUrl() {
        return this.authorizationUrl;
    }

    /**
     * <p>
     * The URL sent by Amazon Q Business to the third party authentication server to authenticate a custom plugin user
     * through an OAuth protocol.
     * </p>
     * 
     * @param authorizationUrl
     *        The URL sent by Amazon Q Business to the third party authentication server to authenticate a custom plugin
     *        user through an OAuth protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthChallengeRequest withAuthorizationUrl(String authorizationUrl) {
        setAuthorizationUrl(authorizationUrl);
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
        if (getAuthorizationUrl() != null)
            sb.append("AuthorizationUrl: ").append(getAuthorizationUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthChallengeRequest == false)
            return false;
        AuthChallengeRequest other = (AuthChallengeRequest) obj;
        if (other.getAuthorizationUrl() == null ^ this.getAuthorizationUrl() == null)
            return false;
        if (other.getAuthorizationUrl() != null && other.getAuthorizationUrl().equals(this.getAuthorizationUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizationUrl() == null) ? 0 : getAuthorizationUrl().hashCode());
        return hashCode;
    }

    @Override
    public AuthChallengeRequest clone() {
        try {
            return (AuthChallengeRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.AuthChallengeRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
