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
package com.amazonaws.services.ecrpublic.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/GetAuthorizationToken" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAuthorizationTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An authorization token data object that corresponds to a public registry.
     * </p>
     */
    private AuthorizationData authorizationData;

    /**
     * <p>
     * An authorization token data object that corresponds to a public registry.
     * </p>
     * 
     * @param authorizationData
     *        An authorization token data object that corresponds to a public registry.
     */

    public void setAuthorizationData(AuthorizationData authorizationData) {
        this.authorizationData = authorizationData;
    }

    /**
     * <p>
     * An authorization token data object that corresponds to a public registry.
     * </p>
     * 
     * @return An authorization token data object that corresponds to a public registry.
     */

    public AuthorizationData getAuthorizationData() {
        return this.authorizationData;
    }

    /**
     * <p>
     * An authorization token data object that corresponds to a public registry.
     * </p>
     * 
     * @param authorizationData
     *        An authorization token data object that corresponds to a public registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizationTokenResult withAuthorizationData(AuthorizationData authorizationData) {
        setAuthorizationData(authorizationData);
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
        if (getAuthorizationData() != null)
            sb.append("AuthorizationData: ").append(getAuthorizationData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAuthorizationTokenResult == false)
            return false;
        GetAuthorizationTokenResult other = (GetAuthorizationTokenResult) obj;
        if (other.getAuthorizationData() == null ^ this.getAuthorizationData() == null)
            return false;
        if (other.getAuthorizationData() != null && other.getAuthorizationData().equals(this.getAuthorizationData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizationData() == null) ? 0 : getAuthorizationData().hashCode());
        return hashCode;
    }

    @Override
    public GetAuthorizationTokenResult clone() {
        try {
            return (GetAuthorizationTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
