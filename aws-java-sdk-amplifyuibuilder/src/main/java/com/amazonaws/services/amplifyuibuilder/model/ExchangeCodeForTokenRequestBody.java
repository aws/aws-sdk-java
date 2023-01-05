/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration of a request to exchange an access code for a token.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ExchangeCodeForTokenRequestBody"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExchangeCodeForTokenRequestBody implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The access code to send in the request.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The location of the application that will receive the access code.
     * </p>
     */
    private String redirectUri;

    /**
     * <p>
     * The access code to send in the request.
     * </p>
     * 
     * @param code
     *        The access code to send in the request.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The access code to send in the request.
     * </p>
     * 
     * @return The access code to send in the request.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The access code to send in the request.
     * </p>
     * 
     * @param code
     *        The access code to send in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExchangeCodeForTokenRequestBody withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The location of the application that will receive the access code.
     * </p>
     * 
     * @param redirectUri
     *        The location of the application that will receive the access code.
     */

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    /**
     * <p>
     * The location of the application that will receive the access code.
     * </p>
     * 
     * @return The location of the application that will receive the access code.
     */

    public String getRedirectUri() {
        return this.redirectUri;
    }

    /**
     * <p>
     * The location of the application that will receive the access code.
     * </p>
     * 
     * @param redirectUri
     *        The location of the application that will receive the access code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExchangeCodeForTokenRequestBody withRedirectUri(String redirectUri) {
        setRedirectUri(redirectUri);
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
        if (getCode() != null)
            sb.append("Code: ").append("***Sensitive Data Redacted***").append(",");
        if (getRedirectUri() != null)
            sb.append("RedirectUri: ").append(getRedirectUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExchangeCodeForTokenRequestBody == false)
            return false;
        ExchangeCodeForTokenRequestBody other = (ExchangeCodeForTokenRequestBody) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getRedirectUri() == null ^ this.getRedirectUri() == null)
            return false;
        if (other.getRedirectUri() != null && other.getRedirectUri().equals(this.getRedirectUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getRedirectUri() == null) ? 0 : getRedirectUri().hashCode());
        return hashCode;
    }

    @Override
    public ExchangeCodeForTokenRequestBody clone() {
        try {
            return (ExchangeCodeForTokenRequestBody) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.ExchangeCodeForTokenRequestBodyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
