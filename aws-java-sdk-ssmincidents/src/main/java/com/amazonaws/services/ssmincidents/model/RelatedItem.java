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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Resources that responders use to triage and mitigate the incident.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/RelatedItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelatedItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about the related item.
     * </p>
     */
    private ItemIdentifier identifier;
    /**
     * <p>
     * The title of the related item.
     * </p>
     */
    private String title;

    /**
     * <p>
     * Details about the related item.
     * </p>
     * 
     * @param identifier
     *        Details about the related item.
     */

    public void setIdentifier(ItemIdentifier identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * Details about the related item.
     * </p>
     * 
     * @return Details about the related item.
     */

    public ItemIdentifier getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * Details about the related item.
     * </p>
     * 
     * @param identifier
     *        Details about the related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedItem withIdentifier(ItemIdentifier identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The title of the related item.
     * </p>
     * 
     * @param title
     *        The title of the related item.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the related item.
     * </p>
     * 
     * @return The title of the related item.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the related item.
     * </p>
     * 
     * @param title
     *        The title of the related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedItem withTitle(String title) {
        setTitle(title);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelatedItem == false)
            return false;
        RelatedItem other = (RelatedItem) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public RelatedItem clone() {
        try {
            return (RelatedItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.RelatedItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
