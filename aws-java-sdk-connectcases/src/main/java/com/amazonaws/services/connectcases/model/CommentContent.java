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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the content of a <code>Comment</code> to be returned to agents.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CommentContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommentContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Text in the body of a <code>Comment</code> on a case.
     * </p>
     */
    private String body;
    /**
     * <p>
     * Type of the text in the box of a <code>Comment</code> on a case.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * Text in the body of a <code>Comment</code> on a case.
     * </p>
     * 
     * @param body
     *        Text in the body of a <code>Comment</code> on a case.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * Text in the body of a <code>Comment</code> on a case.
     * </p>
     * 
     * @return Text in the body of a <code>Comment</code> on a case.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * Text in the body of a <code>Comment</code> on a case.
     * </p>
     * 
     * @param body
     *        Text in the body of a <code>Comment</code> on a case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentContent withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * Type of the text in the box of a <code>Comment</code> on a case.
     * </p>
     * 
     * @param contentType
     *        Type of the text in the box of a <code>Comment</code> on a case.
     * @see CommentBodyTextType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Type of the text in the box of a <code>Comment</code> on a case.
     * </p>
     * 
     * @return Type of the text in the box of a <code>Comment</code> on a case.
     * @see CommentBodyTextType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * Type of the text in the box of a <code>Comment</code> on a case.
     * </p>
     * 
     * @param contentType
     *        Type of the text in the box of a <code>Comment</code> on a case.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommentBodyTextType
     */

    public CommentContent withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * Type of the text in the box of a <code>Comment</code> on a case.
     * </p>
     * 
     * @param contentType
     *        Type of the text in the box of a <code>Comment</code> on a case.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommentBodyTextType
     */

    public CommentContent withContentType(CommentBodyTextType contentType) {
        this.contentType = contentType.toString();
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
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommentContent == false)
            return false;
        CommentContent other = (CommentContent) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public CommentContent clone() {
        try {
            return (CommentContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.CommentContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
