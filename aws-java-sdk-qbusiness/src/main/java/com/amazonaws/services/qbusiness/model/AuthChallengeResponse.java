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
 * Contains details of the authentication information received from a third party authentication server in response to
 * an authentication challenge.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/AuthChallengeResponse" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthChallengeResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The mapping of key-value pairs in an authentication challenge response.
     * </p>
     */
    private java.util.Map<String, String> responseMap;

    /**
     * <p>
     * The mapping of key-value pairs in an authentication challenge response.
     * </p>
     * 
     * @return The mapping of key-value pairs in an authentication challenge response.
     */

    public java.util.Map<String, String> getResponseMap() {
        return responseMap;
    }

    /**
     * <p>
     * The mapping of key-value pairs in an authentication challenge response.
     * </p>
     * 
     * @param responseMap
     *        The mapping of key-value pairs in an authentication challenge response.
     */

    public void setResponseMap(java.util.Map<String, String> responseMap) {
        this.responseMap = responseMap;
    }

    /**
     * <p>
     * The mapping of key-value pairs in an authentication challenge response.
     * </p>
     * 
     * @param responseMap
     *        The mapping of key-value pairs in an authentication challenge response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthChallengeResponse withResponseMap(java.util.Map<String, String> responseMap) {
        setResponseMap(responseMap);
        return this;
    }

    /**
     * Add a single ResponseMap entry
     *
     * @see AuthChallengeResponse#withResponseMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AuthChallengeResponse addResponseMapEntry(String key, String value) {
        if (null == this.responseMap) {
            this.responseMap = new java.util.HashMap<String, String>();
        }
        if (this.responseMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.responseMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthChallengeResponse clearResponseMapEntries() {
        this.responseMap = null;
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
        if (getResponseMap() != null)
            sb.append("ResponseMap: ").append(getResponseMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthChallengeResponse == false)
            return false;
        AuthChallengeResponse other = (AuthChallengeResponse) obj;
        if (other.getResponseMap() == null ^ this.getResponseMap() == null)
            return false;
        if (other.getResponseMap() != null && other.getResponseMap().equals(this.getResponseMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResponseMap() == null) ? 0 : getResponseMap().hashCode());
        return hashCode;
    }

    @Override
    public AuthChallengeResponse clone() {
        try {
            return (AuthChallengeResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.AuthChallengeResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
