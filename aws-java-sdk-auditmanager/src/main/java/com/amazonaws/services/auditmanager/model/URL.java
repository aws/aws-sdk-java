/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A uniform resource locator, used as a unique identifier to locate a resource on the internet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/URL" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class URL implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name or word used as a hyperlink to the URL.
     * </p>
     */
    private String hyperlinkName;
    /**
     * <p>
     * The unique identifier for the internet resource.
     * </p>
     */
    private String link;

    /**
     * <p>
     * The name or word used as a hyperlink to the URL.
     * </p>
     * 
     * @param hyperlinkName
     *        The name or word used as a hyperlink to the URL.
     */

    public void setHyperlinkName(String hyperlinkName) {
        this.hyperlinkName = hyperlinkName;
    }

    /**
     * <p>
     * The name or word used as a hyperlink to the URL.
     * </p>
     * 
     * @return The name or word used as a hyperlink to the URL.
     */

    public String getHyperlinkName() {
        return this.hyperlinkName;
    }

    /**
     * <p>
     * The name or word used as a hyperlink to the URL.
     * </p>
     * 
     * @param hyperlinkName
     *        The name or word used as a hyperlink to the URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public URL withHyperlinkName(String hyperlinkName) {
        setHyperlinkName(hyperlinkName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the internet resource.
     * </p>
     * 
     * @param link
     *        The unique identifier for the internet resource.
     */

    public void setLink(String link) {
        this.link = link;
    }

    /**
     * <p>
     * The unique identifier for the internet resource.
     * </p>
     * 
     * @return The unique identifier for the internet resource.
     */

    public String getLink() {
        return this.link;
    }

    /**
     * <p>
     * The unique identifier for the internet resource.
     * </p>
     * 
     * @param link
     *        The unique identifier for the internet resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public URL withLink(String link) {
        setLink(link);
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
        if (getHyperlinkName() != null)
            sb.append("HyperlinkName: ").append(getHyperlinkName()).append(",");
        if (getLink() != null)
            sb.append("Link: ").append(getLink());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof URL == false)
            return false;
        URL other = (URL) obj;
        if (other.getHyperlinkName() == null ^ this.getHyperlinkName() == null)
            return false;
        if (other.getHyperlinkName() != null && other.getHyperlinkName().equals(this.getHyperlinkName()) == false)
            return false;
        if (other.getLink() == null ^ this.getLink() == null)
            return false;
        if (other.getLink() != null && other.getLink().equals(this.getLink()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHyperlinkName() == null) ? 0 : getHyperlinkName().hashCode());
        hashCode = prime * hashCode + ((getLink() == null) ? 0 : getLink().hashCode());
        return hashCode;
    }

    @Override
    public URL clone() {
        try {
            return (URL) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.URLMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
