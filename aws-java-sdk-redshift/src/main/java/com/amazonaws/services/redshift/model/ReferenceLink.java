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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A link to an Amazon Redshift Advisor reference for more information about a recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ReferenceLink" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceLink implements Serializable, Cloneable {

    /**
     * <p>
     * The hyperlink text that describes the link to more information.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The URL address to find more information.
     * </p>
     */
    private String link;

    /**
     * <p>
     * The hyperlink text that describes the link to more information.
     * </p>
     * 
     * @param text
     *        The hyperlink text that describes the link to more information.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The hyperlink text that describes the link to more information.
     * </p>
     * 
     * @return The hyperlink text that describes the link to more information.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The hyperlink text that describes the link to more information.
     * </p>
     * 
     * @param text
     *        The hyperlink text that describes the link to more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceLink withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The URL address to find more information.
     * </p>
     * 
     * @param link
     *        The URL address to find more information.
     */

    public void setLink(String link) {
        this.link = link;
    }

    /**
     * <p>
     * The URL address to find more information.
     * </p>
     * 
     * @return The URL address to find more information.
     */

    public String getLink() {
        return this.link;
    }

    /**
     * <p>
     * The URL address to find more information.
     * </p>
     * 
     * @param link
     *        The URL address to find more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceLink withLink(String link) {
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
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
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

        if (obj instanceof ReferenceLink == false)
            return false;
        ReferenceLink other = (ReferenceLink) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
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

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getLink() == null) ? 0 : getLink().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceLink clone() {
        try {
            return (ReferenceLink) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
