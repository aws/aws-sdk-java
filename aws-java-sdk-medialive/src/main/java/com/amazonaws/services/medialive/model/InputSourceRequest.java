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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for for a PULL type input.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputSourceRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputSourceRequest implements Serializable, Cloneable, StructuredPojo {

    /** The key used to extract the password from EC2 Parameter store. */
    private String passwordParam;
    /**
     * This represents the customer's source URL where stream is pulled from.
     */
    private String url;
    /** The username for the input source. */
    private String username;

    /**
     * The key used to extract the password from EC2 Parameter store.
     * 
     * @param passwordParam
     *        The key used to extract the password from EC2 Parameter store.
     */

    public void setPasswordParam(String passwordParam) {
        this.passwordParam = passwordParam;
    }

    /**
     * The key used to extract the password from EC2 Parameter store.
     * 
     * @return The key used to extract the password from EC2 Parameter store.
     */

    public String getPasswordParam() {
        return this.passwordParam;
    }

    /**
     * The key used to extract the password from EC2 Parameter store.
     * 
     * @param passwordParam
     *        The key used to extract the password from EC2 Parameter store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSourceRequest withPasswordParam(String passwordParam) {
        setPasswordParam(passwordParam);
        return this;
    }

    /**
     * This represents the customer's source URL where stream is pulled from.
     * 
     * @param url
     *        This represents the customer's source URL where stream is pulled from.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This represents the customer's source URL where stream is pulled from.
     * 
     * @return This represents the customer's source URL where stream is pulled from.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * This represents the customer's source URL where stream is pulled from.
     * 
     * @param url
     *        This represents the customer's source URL where stream is pulled from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSourceRequest withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * The username for the input source.
     * 
     * @param username
     *        The username for the input source.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * The username for the input source.
     * 
     * @return The username for the input source.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * The username for the input source.
     * 
     * @param username
     *        The username for the input source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSourceRequest withUsername(String username) {
        setUsername(username);
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
        if (getPasswordParam() != null)
            sb.append("PasswordParam: ").append(getPasswordParam()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputSourceRequest == false)
            return false;
        InputSourceRequest other = (InputSourceRequest) obj;
        if (other.getPasswordParam() == null ^ this.getPasswordParam() == null)
            return false;
        if (other.getPasswordParam() != null && other.getPasswordParam().equals(this.getPasswordParam()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPasswordParam() == null) ? 0 : getPasswordParam().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public InputSourceRequest clone() {
        try {
            return (InputSourceRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputSourceRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
