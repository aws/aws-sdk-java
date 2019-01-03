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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An Amazon S3 bucket where you want to store the results of this request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/InstanceAssociationOutputLocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceAssociationOutputLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon S3 bucket where you want to store the results of this request.
     * </p>
     */
    private S3OutputLocation s3Location;

    /**
     * <p>
     * An Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * 
     * @param s3Location
     *        An Amazon S3 bucket where you want to store the results of this request.
     */

    public void setS3Location(S3OutputLocation s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * An Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * 
     * @return An Amazon S3 bucket where you want to store the results of this request.
     */

    public S3OutputLocation getS3Location() {
        return this.s3Location;
    }

    /**
     * <p>
     * An Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * 
     * @param s3Location
     *        An Amazon S3 bucket where you want to store the results of this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAssociationOutputLocation withS3Location(S3OutputLocation s3Location) {
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

        if (obj instanceof InstanceAssociationOutputLocation == false)
            return false;
        InstanceAssociationOutputLocation other = (InstanceAssociationOutputLocation) obj;
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
    public InstanceAssociationOutputLocation clone() {
        try {
            return (InstanceAssociationOutputLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.InstanceAssociationOutputLocationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
