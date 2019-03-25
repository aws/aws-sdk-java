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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings associated with the destination. Will vary based on the type of destination
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DestinationSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationSettings implements Serializable, Cloneable, StructuredPojo {

    /** Settings associated with S3 destination */
    private S3DestinationSettings s3Settings;

    /**
     * Settings associated with S3 destination
     * 
     * @param s3Settings
     *        Settings associated with S3 destination
     */

    public void setS3Settings(S3DestinationSettings s3Settings) {
        this.s3Settings = s3Settings;
    }

    /**
     * Settings associated with S3 destination
     * 
     * @return Settings associated with S3 destination
     */

    public S3DestinationSettings getS3Settings() {
        return this.s3Settings;
    }

    /**
     * Settings associated with S3 destination
     * 
     * @param s3Settings
     *        Settings associated with S3 destination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationSettings withS3Settings(S3DestinationSettings s3Settings) {
        setS3Settings(s3Settings);
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
        if (getS3Settings() != null)
            sb.append("S3Settings: ").append(getS3Settings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationSettings == false)
            return false;
        DestinationSettings other = (DestinationSettings) obj;
        if (other.getS3Settings() == null ^ this.getS3Settings() == null)
            return false;
        if (other.getS3Settings() != null && other.getS3Settings().equals(this.getS3Settings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Settings() == null) ? 0 : getS3Settings().hashCode());
        return hashCode;
    }

    @Override
    public DestinationSettings clone() {
        try {
            return (DestinationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.DestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
