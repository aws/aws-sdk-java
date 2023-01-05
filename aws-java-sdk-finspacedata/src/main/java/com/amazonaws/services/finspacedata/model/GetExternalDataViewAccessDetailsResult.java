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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetExternalDataViewAccessDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExternalDataViewAccessDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The credentials required to access the external Dataview from the S3 location.
     * </p>
     */
    private AwsCredentials credentials;
    /**
     * <p>
     * The location where the external Dataview is stored.
     * </p>
     */
    private S3Location s3Location;

    /**
     * <p>
     * The credentials required to access the external Dataview from the S3 location.
     * </p>
     * 
     * @param credentials
     *        The credentials required to access the external Dataview from the S3 location.
     */

    public void setCredentials(AwsCredentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * The credentials required to access the external Dataview from the S3 location.
     * </p>
     * 
     * @return The credentials required to access the external Dataview from the S3 location.
     */

    public AwsCredentials getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * The credentials required to access the external Dataview from the S3 location.
     * </p>
     * 
     * @param credentials
     *        The credentials required to access the external Dataview from the S3 location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExternalDataViewAccessDetailsResult withCredentials(AwsCredentials credentials) {
        setCredentials(credentials);
        return this;
    }

    /**
     * <p>
     * The location where the external Dataview is stored.
     * </p>
     * 
     * @param s3Location
     *        The location where the external Dataview is stored.
     */

    public void setS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * The location where the external Dataview is stored.
     * </p>
     * 
     * @return The location where the external Dataview is stored.
     */

    public S3Location getS3Location() {
        return this.s3Location;
    }

    /**
     * <p>
     * The location where the external Dataview is stored.
     * </p>
     * 
     * @param s3Location
     *        The location where the external Dataview is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExternalDataViewAccessDetailsResult withS3Location(S3Location s3Location) {
        setS3Location(s3Location);
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
        if (getS3Location() != null)
            sb.append("S3Location: ").append(getS3Location());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExternalDataViewAccessDetailsResult == false)
            return false;
        GetExternalDataViewAccessDetailsResult other = (GetExternalDataViewAccessDetailsResult) obj;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        return hashCode;
    }

    @Override
    public GetExternalDataViewAccessDetailsResult clone() {
        try {
            return (GetExternalDataViewAccessDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
