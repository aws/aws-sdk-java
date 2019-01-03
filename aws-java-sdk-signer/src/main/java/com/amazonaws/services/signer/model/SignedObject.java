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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Points to an <code>S3SignedObject</code> object that contains information about your signed code image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/SignedObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignedObject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>S3SignedObject</code>.
     * </p>
     */
    private S3SignedObject s3;

    /**
     * <p>
     * The <code>S3SignedObject</code>.
     * </p>
     * 
     * @param s3
     *        The <code>S3SignedObject</code>.
     */

    public void setS3(S3SignedObject s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * The <code>S3SignedObject</code>.
     * </p>
     * 
     * @return The <code>S3SignedObject</code>.
     */

    public S3SignedObject getS3() {
        return this.s3;
    }

    /**
     * <p>
     * The <code>S3SignedObject</code>.
     * </p>
     * 
     * @param s3
     *        The <code>S3SignedObject</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignedObject withS3(S3SignedObject s3) {
        setS3(s3);
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
        if (getS3() != null)
            sb.append("S3: ").append(getS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignedObject == false)
            return false;
        SignedObject other = (SignedObject) obj;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        return hashCode;
    }

    @Override
    public SignedObject clone() {
        try {
            return (SignedObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.signer.model.transform.SignedObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
