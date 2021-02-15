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
package com.amazonaws.services.workmailmessageflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the MIME content of the updated email message as an S3 object. All MIME content must meet the following
 * criteria:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Each part of a multipart MIME message must be formatted properly.
 * </p>
 * </li>
 * <li>
 * <p>
 * Attachments must be of a content type that Amazon SES supports. For more information, see <a
 * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types-appendix.html">Unsupported Attachment
 * Types</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * If any of the MIME parts in a message contain content that is outside of the 7-bit ASCII character range, we
 * recommend encoding that content.
 * </p>
 * </li>
 * <li>
 * <p>
 * Per <a href="https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6">RFC 5321</a>, the maximum length of each line of
 * text, including the &lt;CRLF&gt;, must not exceed 1,000 characters.
 * </p>
 * </li>
 * <li>
 * <p>
 * The message must contain all the required header fields. Check the returned error message for more information.
 * </p>
 * </li>
 * <li>
 * <p>
 * The value of immutable headers must remain unchanged. Check the returned error message for more information.
 * </p>
 * </li>
 * <li>
 * <p>
 * Certain unique headers can only appear once. Check the returned error message for more information.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmailmessageflow-2019-05-01/RawMessageContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RawMessageContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 reference of an email message.
     * </p>
     */
    private S3Reference s3Reference;

    /**
     * <p>
     * The S3 reference of an email message.
     * </p>
     * 
     * @param s3Reference
     *        The S3 reference of an email message.
     */

    public void setS3Reference(S3Reference s3Reference) {
        this.s3Reference = s3Reference;
    }

    /**
     * <p>
     * The S3 reference of an email message.
     * </p>
     * 
     * @return The S3 reference of an email message.
     */

    public S3Reference getS3Reference() {
        return this.s3Reference;
    }

    /**
     * <p>
     * The S3 reference of an email message.
     * </p>
     * 
     * @param s3Reference
     *        The S3 reference of an email message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RawMessageContent withS3Reference(S3Reference s3Reference) {
        setS3Reference(s3Reference);
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
        if (getS3Reference() != null)
            sb.append("S3Reference: ").append(getS3Reference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RawMessageContent == false)
            return false;
        RawMessageContent other = (RawMessageContent) obj;
        if (other.getS3Reference() == null ^ this.getS3Reference() == null)
            return false;
        if (other.getS3Reference() != null && other.getS3Reference().equals(this.getS3Reference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Reference() == null) ? 0 : getS3Reference().hashCode());
        return hashCode;
    }

    @Override
    public RawMessageContent clone() {
        try {
            return (RawMessageContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmailmessageflow.model.transform.RawMessageContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
