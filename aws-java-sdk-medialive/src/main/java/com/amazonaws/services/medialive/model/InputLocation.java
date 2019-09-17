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
 * Input Location
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputLocation implements Serializable, Cloneable, StructuredPojo {

    /** key used to extract the password from EC2 Parameter store */
    private String passwordParam;
    /**
     * Uniform Resource Identifier - This should be a path to a file accessible to the Live system (eg. a http:// URI)
     * depending on the output type. For example, a RTMP destination should have a uri simliar to:
     * "rtmp://fmsserver/live".
     */
    private String uri;
    /** Documentation update needed */
    private String username;

    /**
     * key used to extract the password from EC2 Parameter store
     * 
     * @param passwordParam
     *        key used to extract the password from EC2 Parameter store
     */

    public void setPasswordParam(String passwordParam) {
        this.passwordParam = passwordParam;
    }

    /**
     * key used to extract the password from EC2 Parameter store
     * 
     * @return key used to extract the password from EC2 Parameter store
     */

    public String getPasswordParam() {
        return this.passwordParam;
    }

    /**
     * key used to extract the password from EC2 Parameter store
     * 
     * @param passwordParam
     *        key used to extract the password from EC2 Parameter store
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputLocation withPasswordParam(String passwordParam) {
        setPasswordParam(passwordParam);
        return this;
    }

    /**
     * Uniform Resource Identifier - This should be a path to a file accessible to the Live system (eg. a http:// URI)
     * depending on the output type. For example, a RTMP destination should have a uri simliar to:
     * "rtmp://fmsserver/live".
     * 
     * @param uri
     *        Uniform Resource Identifier - This should be a path to a file accessible to the Live system (eg. a http://
     *        URI) depending on the output type. For example, a RTMP destination should have a uri simliar to:
     *        "rtmp://fmsserver/live".
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Uniform Resource Identifier - This should be a path to a file accessible to the Live system (eg. a http:// URI)
     * depending on the output type. For example, a RTMP destination should have a uri simliar to:
     * "rtmp://fmsserver/live".
     * 
     * @return Uniform Resource Identifier - This should be a path to a file accessible to the Live system (eg. a
     *         http:// URI) depending on the output type. For example, a RTMP destination should have a uri simliar to:
     *         "rtmp://fmsserver/live".
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * Uniform Resource Identifier - This should be a path to a file accessible to the Live system (eg. a http:// URI)
     * depending on the output type. For example, a RTMP destination should have a uri simliar to:
     * "rtmp://fmsserver/live".
     * 
     * @param uri
     *        Uniform Resource Identifier - This should be a path to a file accessible to the Live system (eg. a http://
     *        URI) depending on the output type. For example, a RTMP destination should have a uri simliar to:
     *        "rtmp://fmsserver/live".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputLocation withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * Documentation update needed
     * 
     * @param username
     *        Documentation update needed
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Documentation update needed
     * 
     * @return Documentation update needed
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * Documentation update needed
     * 
     * @param username
     *        Documentation update needed
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputLocation withUsername(String username) {
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
        if (getUri() != null)
            sb.append("Uri: ").append(getUri()).append(",");
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

        if (obj instanceof InputLocation == false)
            return false;
        InputLocation other = (InputLocation) obj;
        if (other.getPasswordParam() == null ^ this.getPasswordParam() == null)
            return false;
        if (other.getPasswordParam() != null && other.getPasswordParam().equals(this.getPasswordParam()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
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
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public InputLocation clone() {
        try {
            return (InputLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
