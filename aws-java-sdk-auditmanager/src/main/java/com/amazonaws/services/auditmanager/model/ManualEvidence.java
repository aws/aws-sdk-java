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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Evidence that is uploaded to AWS Audit Manager manually.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ManualEvidence" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManualEvidence implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 URL that points to a manual evidence object.
     * </p>
     */
    private String s3ResourcePath;

    /**
     * <p>
     * The Amazon S3 URL that points to a manual evidence object.
     * </p>
     * 
     * @param s3ResourcePath
     *        The Amazon S3 URL that points to a manual evidence object.
     */

    public void setS3ResourcePath(String s3ResourcePath) {
        this.s3ResourcePath = s3ResourcePath;
    }

    /**
     * <p>
     * The Amazon S3 URL that points to a manual evidence object.
     * </p>
     * 
     * @return The Amazon S3 URL that points to a manual evidence object.
     */

    public String getS3ResourcePath() {
        return this.s3ResourcePath;
    }

    /**
     * <p>
     * The Amazon S3 URL that points to a manual evidence object.
     * </p>
     * 
     * @param s3ResourcePath
     *        The Amazon S3 URL that points to a manual evidence object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManualEvidence withS3ResourcePath(String s3ResourcePath) {
        setS3ResourcePath(s3ResourcePath);
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
        if (getS3ResourcePath() != null)
            sb.append("S3ResourcePath: ").append(getS3ResourcePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManualEvidence == false)
            return false;
        ManualEvidence other = (ManualEvidence) obj;
        if (other.getS3ResourcePath() == null ^ this.getS3ResourcePath() == null)
            return false;
        if (other.getS3ResourcePath() != null && other.getS3ResourcePath().equals(this.getS3ResourcePath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3ResourcePath() == null) ? 0 : getS3ResourcePath().hashCode());
        return hashCode;
    }

    @Override
    public ManualEvidence clone() {
        try {
            return (ManualEvidence) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.ManualEvidenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
