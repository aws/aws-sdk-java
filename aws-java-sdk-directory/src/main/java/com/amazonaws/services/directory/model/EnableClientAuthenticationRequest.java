/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/EnableClientAuthentication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableClientAuthenticationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Enable client authentication in a specified directory for smart cards.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * Enable the type of client authentication request.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Enable client authentication in a specified directory for smart cards.
     * </p>
     * 
     * @param directoryId
     *        Enable client authentication in a specified directory for smart cards.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * Enable client authentication in a specified directory for smart cards.
     * </p>
     * 
     * @return Enable client authentication in a specified directory for smart cards.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * Enable client authentication in a specified directory for smart cards.
     * </p>
     * 
     * @param directoryId
     *        Enable client authentication in a specified directory for smart cards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableClientAuthenticationRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * Enable the type of client authentication request.
     * </p>
     * 
     * @param type
     *        Enable the type of client authentication request.
     * @see ClientAuthenticationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Enable the type of client authentication request.
     * </p>
     * 
     * @return Enable the type of client authentication request.
     * @see ClientAuthenticationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Enable the type of client authentication request.
     * </p>
     * 
     * @param type
     *        Enable the type of client authentication request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientAuthenticationType
     */

    public EnableClientAuthenticationRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Enable the type of client authentication request.
     * </p>
     * 
     * @param type
     *        Enable the type of client authentication request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientAuthenticationType
     */

    public EnableClientAuthenticationRequest withType(ClientAuthenticationType type) {
        this.type = type.toString();
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableClientAuthenticationRequest == false)
            return false;
        EnableClientAuthenticationRequest other = (EnableClientAuthenticationRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public EnableClientAuthenticationRequest clone() {
        return (EnableClientAuthenticationRequest) super.clone();
    }

}
