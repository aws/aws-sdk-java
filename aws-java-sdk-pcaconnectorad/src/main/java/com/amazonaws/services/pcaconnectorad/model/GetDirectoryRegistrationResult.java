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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetDirectoryRegistration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDirectoryRegistrationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The directory registration represents the authorization of the connector service with a directory.
     * </p>
     */
    private DirectoryRegistration directoryRegistration;

    /**
     * <p>
     * The directory registration represents the authorization of the connector service with a directory.
     * </p>
     * 
     * @param directoryRegistration
     *        The directory registration represents the authorization of the connector service with a directory.
     */

    public void setDirectoryRegistration(DirectoryRegistration directoryRegistration) {
        this.directoryRegistration = directoryRegistration;
    }

    /**
     * <p>
     * The directory registration represents the authorization of the connector service with a directory.
     * </p>
     * 
     * @return The directory registration represents the authorization of the connector service with a directory.
     */

    public DirectoryRegistration getDirectoryRegistration() {
        return this.directoryRegistration;
    }

    /**
     * <p>
     * The directory registration represents the authorization of the connector service with a directory.
     * </p>
     * 
     * @param directoryRegistration
     *        The directory registration represents the authorization of the connector service with a directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDirectoryRegistrationResult withDirectoryRegistration(DirectoryRegistration directoryRegistration) {
        setDirectoryRegistration(directoryRegistration);
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
        if (getDirectoryRegistration() != null)
            sb.append("DirectoryRegistration: ").append(getDirectoryRegistration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDirectoryRegistrationResult == false)
            return false;
        GetDirectoryRegistrationResult other = (GetDirectoryRegistrationResult) obj;
        if (other.getDirectoryRegistration() == null ^ this.getDirectoryRegistration() == null)
            return false;
        if (other.getDirectoryRegistration() != null && other.getDirectoryRegistration().equals(this.getDirectoryRegistration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryRegistration() == null) ? 0 : getDirectoryRegistration().hashCode());
        return hashCode;
    }

    @Override
    public GetDirectoryRegistrationResult clone() {
        try {
            return (GetDirectoryRegistrationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
