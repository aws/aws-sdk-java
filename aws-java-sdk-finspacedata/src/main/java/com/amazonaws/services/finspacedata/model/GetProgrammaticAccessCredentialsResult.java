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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetProgrammaticAccessCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProgrammaticAccessCredentialsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Returns the programmatic credentials.
     * </p>
     */
    private Credentials credentials;
    /**
     * <p>
     * Returns the duration in which the credentials will remain valid.
     * </p>
     */
    private Long durationInMinutes;

    /**
     * <p>
     * Returns the programmatic credentials.
     * </p>
     * 
     * @param credentials
     *        Returns the programmatic credentials.
     */

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * Returns the programmatic credentials.
     * </p>
     * 
     * @return Returns the programmatic credentials.
     */

    public Credentials getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * Returns the programmatic credentials.
     * </p>
     * 
     * @param credentials
     *        Returns the programmatic credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProgrammaticAccessCredentialsResult withCredentials(Credentials credentials) {
        setCredentials(credentials);
        return this;
    }

    /**
     * <p>
     * Returns the duration in which the credentials will remain valid.
     * </p>
     * 
     * @param durationInMinutes
     *        Returns the duration in which the credentials will remain valid.
     */

    public void setDurationInMinutes(Long durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    /**
     * <p>
     * Returns the duration in which the credentials will remain valid.
     * </p>
     * 
     * @return Returns the duration in which the credentials will remain valid.
     */

    public Long getDurationInMinutes() {
        return this.durationInMinutes;
    }

    /**
     * <p>
     * Returns the duration in which the credentials will remain valid.
     * </p>
     * 
     * @param durationInMinutes
     *        Returns the duration in which the credentials will remain valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProgrammaticAccessCredentialsResult withDurationInMinutes(Long durationInMinutes) {
        setDurationInMinutes(durationInMinutes);
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
        if (getCredentials() != null)
            sb.append("Credentials: ").append(getCredentials()).append(",");
        if (getDurationInMinutes() != null)
            sb.append("DurationInMinutes: ").append(getDurationInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProgrammaticAccessCredentialsResult == false)
            return false;
        GetProgrammaticAccessCredentialsResult other = (GetProgrammaticAccessCredentialsResult) obj;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getDurationInMinutes() == null ^ this.getDurationInMinutes() == null)
            return false;
        if (other.getDurationInMinutes() != null && other.getDurationInMinutes().equals(this.getDurationInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getDurationInMinutes() == null) ? 0 : getDurationInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public GetProgrammaticAccessCredentialsResult clone() {
        try {
            return (GetProgrammaticAccessCredentialsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
