/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCrossAccountAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCrossAccountAttachmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the cross-account attachment.
     * </p>
     */
    private Attachment crossAccountAttachment;

    /**
     * <p>
     * Information about the cross-account attachment.
     * </p>
     * 
     * @param crossAccountAttachment
     *        Information about the cross-account attachment.
     */

    public void setCrossAccountAttachment(Attachment crossAccountAttachment) {
        this.crossAccountAttachment = crossAccountAttachment;
    }

    /**
     * <p>
     * Information about the cross-account attachment.
     * </p>
     * 
     * @return Information about the cross-account attachment.
     */

    public Attachment getCrossAccountAttachment() {
        return this.crossAccountAttachment;
    }

    /**
     * <p>
     * Information about the cross-account attachment.
     * </p>
     * 
     * @param crossAccountAttachment
     *        Information about the cross-account attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrossAccountAttachmentResult withCrossAccountAttachment(Attachment crossAccountAttachment) {
        setCrossAccountAttachment(crossAccountAttachment);
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
        if (getCrossAccountAttachment() != null)
            sb.append("CrossAccountAttachment: ").append(getCrossAccountAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCrossAccountAttachmentResult == false)
            return false;
        CreateCrossAccountAttachmentResult other = (CreateCrossAccountAttachmentResult) obj;
        if (other.getCrossAccountAttachment() == null ^ this.getCrossAccountAttachment() == null)
            return false;
        if (other.getCrossAccountAttachment() != null && other.getCrossAccountAttachment().equals(this.getCrossAccountAttachment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrossAccountAttachment() == null) ? 0 : getCrossAccountAttachment().hashCode());
        return hashCode;
    }

    @Override
    public CreateCrossAccountAttachmentResult clone() {
        try {
            return (CreateCrossAccountAttachmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
