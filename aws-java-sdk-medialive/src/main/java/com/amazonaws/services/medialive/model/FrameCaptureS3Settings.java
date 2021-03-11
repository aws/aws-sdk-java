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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Frame Capture S3 Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/FrameCaptureS3Settings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FrameCaptureS3Settings implements Serializable, Cloneable, StructuredPojo {

    /** Specify the canned ACL to apply to each S3 request. Defaults to none. */
    private String cannedAcl;

    /**
     * Specify the canned ACL to apply to each S3 request. Defaults to none.
     * 
     * @param cannedAcl
     *        Specify the canned ACL to apply to each S3 request. Defaults to none.
     * @see S3CannedAcl
     */

    public void setCannedAcl(String cannedAcl) {
        this.cannedAcl = cannedAcl;
    }

    /**
     * Specify the canned ACL to apply to each S3 request. Defaults to none.
     * 
     * @return Specify the canned ACL to apply to each S3 request. Defaults to none.
     * @see S3CannedAcl
     */

    public String getCannedAcl() {
        return this.cannedAcl;
    }

    /**
     * Specify the canned ACL to apply to each S3 request. Defaults to none.
     * 
     * @param cannedAcl
     *        Specify the canned ACL to apply to each S3 request. Defaults to none.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3CannedAcl
     */

    public FrameCaptureS3Settings withCannedAcl(String cannedAcl) {
        setCannedAcl(cannedAcl);
        return this;
    }

    /**
     * Specify the canned ACL to apply to each S3 request. Defaults to none.
     * 
     * @param cannedAcl
     *        Specify the canned ACL to apply to each S3 request. Defaults to none.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3CannedAcl
     */

    public FrameCaptureS3Settings withCannedAcl(S3CannedAcl cannedAcl) {
        this.cannedAcl = cannedAcl.toString();
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
        if (getCannedAcl() != null)
            sb.append("CannedAcl: ").append(getCannedAcl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FrameCaptureS3Settings == false)
            return false;
        FrameCaptureS3Settings other = (FrameCaptureS3Settings) obj;
        if (other.getCannedAcl() == null ^ this.getCannedAcl() == null)
            return false;
        if (other.getCannedAcl() != null && other.getCannedAcl().equals(this.getCannedAcl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCannedAcl() == null) ? 0 : getCannedAcl().hashCode());
        return hashCode;
    }

    @Override
    public FrameCaptureS3Settings clone() {
        try {
            return (FrameCaptureS3Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.FrameCaptureS3SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
