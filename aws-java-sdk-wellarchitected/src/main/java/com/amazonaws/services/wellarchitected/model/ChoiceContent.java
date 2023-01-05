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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The choice content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ChoiceContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChoiceContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The display text for the choice content.
     * </p>
     */
    private String displayText;
    /**
     * <p>
     * The URL for the choice content.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The display text for the choice content.
     * </p>
     * 
     * @param displayText
     *        The display text for the choice content.
     */

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    /**
     * <p>
     * The display text for the choice content.
     * </p>
     * 
     * @return The display text for the choice content.
     */

    public String getDisplayText() {
        return this.displayText;
    }

    /**
     * <p>
     * The display text for the choice content.
     * </p>
     * 
     * @param displayText
     *        The display text for the choice content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChoiceContent withDisplayText(String displayText) {
        setDisplayText(displayText);
        return this;
    }

    /**
     * <p>
     * The URL for the choice content.
     * </p>
     * 
     * @param url
     *        The URL for the choice content.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL for the choice content.
     * </p>
     * 
     * @return The URL for the choice content.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL for the choice content.
     * </p>
     * 
     * @param url
     *        The URL for the choice content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChoiceContent withUrl(String url) {
        setUrl(url);
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
        if (getDisplayText() != null)
            sb.append("DisplayText: ").append(getDisplayText()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChoiceContent == false)
            return false;
        ChoiceContent other = (ChoiceContent) obj;
        if (other.getDisplayText() == null ^ this.getDisplayText() == null)
            return false;
        if (other.getDisplayText() != null && other.getDisplayText().equals(this.getDisplayText()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayText() == null) ? 0 : getDisplayText().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public ChoiceContent clone() {
        try {
            return (ChoiceContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.ChoiceContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
