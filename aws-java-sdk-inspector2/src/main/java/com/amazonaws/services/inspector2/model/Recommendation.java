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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the recommended course of action to remediate the finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Recommendation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Recommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL address to the CVE remediation recommendations.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The recommended course of action to remediate the finding.
     * </p>
     */
    private String text;

    /**
     * <p>
     * The URL address to the CVE remediation recommendations.
     * </p>
     * 
     * @param url
     *        The URL address to the CVE remediation recommendations.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL address to the CVE remediation recommendations.
     * </p>
     * 
     * @return The URL address to the CVE remediation recommendations.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL address to the CVE remediation recommendations.
     * </p>
     * 
     * @param url
     *        The URL address to the CVE remediation recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The recommended course of action to remediate the finding.
     * </p>
     * 
     * @param text
     *        The recommended course of action to remediate the finding.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The recommended course of action to remediate the finding.
     * </p>
     * 
     * @return The recommended course of action to remediate the finding.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The recommended course of action to remediate the finding.
     * </p>
     * 
     * @param text
     *        The recommended course of action to remediate the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withText(String text) {
        setText(text);
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
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Recommendation == false)
            return false;
        Recommendation other = (Recommendation) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public Recommendation clone() {
        try {
            return (Recommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.RecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
