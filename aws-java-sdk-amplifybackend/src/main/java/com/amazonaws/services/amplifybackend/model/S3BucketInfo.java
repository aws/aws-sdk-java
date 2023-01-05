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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the metadata of the S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/S3BucketInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3BucketInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The creation date of the S3 bucket.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The creation date of the S3 bucket.
     * </p>
     * 
     * @param creationDate
     *        The creation date of the S3 bucket.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date of the S3 bucket.
     * </p>
     * 
     * @return The creation date of the S3 bucket.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date of the S3 bucket.
     * </p>
     * 
     * @param creationDate
     *        The creation date of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketInfo withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param name
     *        The name of the S3 bucket.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @return The name of the S3 bucket.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param name
     *        The name of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketInfo withName(String name) {
        setName(name);
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
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3BucketInfo == false)
            return false;
        S3BucketInfo other = (S3BucketInfo) obj;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public S3BucketInfo clone() {
        try {
            return (S3BucketInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.S3BucketInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
