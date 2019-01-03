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
package com.amazonaws.services.lexruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * If you configure a response card when creating your bots, Amazon Lex substitutes the session attributes and slot
 * values that are available, and then returns it. The response card can also come from a Lambda function (
 * <code>dialogCodeHook</code> and <code>fulfillmentActivity</code> on an intent).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/ResponseCard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseCard implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of the response card format.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The content type of the response.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * An array of attachment objects representing options.
     * </p>
     */
    private java.util.List<GenericAttachment> genericAttachments;

    /**
     * <p>
     * The version of the response card format.
     * </p>
     * 
     * @param version
     *        The version of the response card format.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the response card format.
     * </p>
     * 
     * @return The version of the response card format.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the response card format.
     * </p>
     * 
     * @param version
     *        The version of the response card format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseCard withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The content type of the response.
     * </p>
     * 
     * @param contentType
     *        The content type of the response.
     * @see ContentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the response.
     * </p>
     * 
     * @return The content type of the response.
     * @see ContentType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type of the response.
     * </p>
     * 
     * @param contentType
     *        The content type of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public ResponseCard withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The content type of the response.
     * </p>
     * 
     * @param contentType
     *        The content type of the response.
     * @see ContentType
     */

    public void setContentType(ContentType contentType) {
        withContentType(contentType);
    }

    /**
     * <p>
     * The content type of the response.
     * </p>
     * 
     * @param contentType
     *        The content type of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public ResponseCard withContentType(ContentType contentType) {
        this.contentType = contentType.toString();
        return this;
    }

    /**
     * <p>
     * An array of attachment objects representing options.
     * </p>
     * 
     * @return An array of attachment objects representing options.
     */

    public java.util.List<GenericAttachment> getGenericAttachments() {
        return genericAttachments;
    }

    /**
     * <p>
     * An array of attachment objects representing options.
     * </p>
     * 
     * @param genericAttachments
     *        An array of attachment objects representing options.
     */

    public void setGenericAttachments(java.util.Collection<GenericAttachment> genericAttachments) {
        if (genericAttachments == null) {
            this.genericAttachments = null;
            return;
        }

        this.genericAttachments = new java.util.ArrayList<GenericAttachment>(genericAttachments);
    }

    /**
     * <p>
     * An array of attachment objects representing options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGenericAttachments(java.util.Collection)} or {@link #withGenericAttachments(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param genericAttachments
     *        An array of attachment objects representing options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseCard withGenericAttachments(GenericAttachment... genericAttachments) {
        if (this.genericAttachments == null) {
            setGenericAttachments(new java.util.ArrayList<GenericAttachment>(genericAttachments.length));
        }
        for (GenericAttachment ele : genericAttachments) {
            this.genericAttachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of attachment objects representing options.
     * </p>
     * 
     * @param genericAttachments
     *        An array of attachment objects representing options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseCard withGenericAttachments(java.util.Collection<GenericAttachment> genericAttachments) {
        setGenericAttachments(genericAttachments);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getGenericAttachments() != null)
            sb.append("GenericAttachments: ").append(getGenericAttachments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseCard == false)
            return false;
        ResponseCard other = (ResponseCard) obj;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getGenericAttachments() == null ^ this.getGenericAttachments() == null)
            return false;
        if (other.getGenericAttachments() != null && other.getGenericAttachments().equals(this.getGenericAttachments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getGenericAttachments() == null) ? 0 : getGenericAttachments().hashCode());
        return hashCode;
    }

    @Override
    public ResponseCard clone() {
        try {
            return (ResponseCard) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntime.model.transform.ResponseCardMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
