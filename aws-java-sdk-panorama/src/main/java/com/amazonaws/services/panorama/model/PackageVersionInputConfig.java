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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A package version input configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/PackageVersionInputConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageVersionInputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A location in Amazon S3.
     * </p>
     */
    private S3Location s3Location;

    /**
     * <p>
     * A location in Amazon S3.
     * </p>
     * 
     * @param s3Location
     *        A location in Amazon S3.
     */

    public void setS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * A location in Amazon S3.
     * </p>
     * 
     * @return A location in Amazon S3.
     */

    public S3Location getS3Location() {
        return this.s3Location;
    }

    /**
     * <p>
     * A location in Amazon S3.
     * </p>
     * 
     * @param s3Location
     *        A location in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionInputConfig withS3Location(S3Location s3Location) {
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

        if (obj instanceof PackageVersionInputConfig == false)
            return false;
        PackageVersionInputConfig other = (PackageVersionInputConfig) obj;
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

        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        return hashCode;
    }

    @Override
    public PackageVersionInputConfig clone() {
        try {
            return (PackageVersionInputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.PackageVersionInputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
