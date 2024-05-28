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
package com.amazonaws.services.appfabric.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains authorization request information, which is required for Amazon Web Services AppFabric to get the OAuth2
 * access token for an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/AuthRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The redirect URL that is specified in the AuthURL and the application client.
     * </p>
     */
    private String redirectUri;
    /**
     * <p>
     * The authorization code returned by the application after permission is granted in the application OAuth page
     * (after clicking on the AuthURL).
     * </p>
     */
    private String code;

    /**
     * <p>
     * The redirect URL that is specified in the AuthURL and the application client.
     * </p>
     * 
     * @param redirectUri
     *        The redirect URL that is specified in the AuthURL and the application client.
     */

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    /**
     * <p>
     * The redirect URL that is specified in the AuthURL and the application client.
     * </p>
     * 
     * @return The redirect URL that is specified in the AuthURL and the application client.
     */

    public String getRedirectUri() {
        return this.redirectUri;
    }

    /**
     * <p>
     * The redirect URL that is specified in the AuthURL and the application client.
     * </p>
     * 
     * @param redirectUri
     *        The redirect URL that is specified in the AuthURL and the application client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthRequest withRedirectUri(String redirectUri) {
        setRedirectUri(redirectUri);
        return this;
    }

    /**
     * <p>
     * The authorization code returned by the application after permission is granted in the application OAuth page
     * (after clicking on the AuthURL).
     * </p>
     * 
     * @param code
     *        The authorization code returned by the application after permission is granted in the application OAuth
     *        page (after clicking on the AuthURL).
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The authorization code returned by the application after permission is granted in the application OAuth page
     * (after clicking on the AuthURL).
     * </p>
     * 
     * @return The authorization code returned by the application after permission is granted in the application OAuth
     *         page (after clicking on the AuthURL).
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The authorization code returned by the application after permission is granted in the application OAuth page
     * (after clicking on the AuthURL).
     * </p>
     * 
     * @param code
     *        The authorization code returned by the application after permission is granted in the application OAuth
     *        page (after clicking on the AuthURL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthRequest withCode(String code) {
        setCode(code);
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
        if (getRedirectUri() != null)
            sb.append("RedirectUri: ").append(getRedirectUri()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthRequest == false)
            return false;
        AuthRequest other = (AuthRequest) obj;
        if (other.getRedirectUri() == null ^ this.getRedirectUri() == null)
            return false;
        if (other.getRedirectUri() != null && other.getRedirectUri().equals(this.getRedirectUri()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRedirectUri() == null) ? 0 : getRedirectUri().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        return hashCode;
    }

    @Override
    public AuthRequest clone() {
        try {
            return (AuthRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appfabric.model.transform.AuthRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
