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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Container for user interface template information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UiTemplateInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UiTemplateInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL for the user interface template.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The SHA 256 hash that you used to create the request signature.
     * </p>
     */
    private String contentSha256;

    /**
     * <p>
     * The URL for the user interface template.
     * </p>
     * 
     * @param url
     *        The URL for the user interface template.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL for the user interface template.
     * </p>
     * 
     * @return The URL for the user interface template.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL for the user interface template.
     * </p>
     * 
     * @param url
     *        The URL for the user interface template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UiTemplateInfo withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The SHA 256 hash that you used to create the request signature.
     * </p>
     * 
     * @param contentSha256
     *        The SHA 256 hash that you used to create the request signature.
     */

    public void setContentSha256(String contentSha256) {
        this.contentSha256 = contentSha256;
    }

    /**
     * <p>
     * The SHA 256 hash that you used to create the request signature.
     * </p>
     * 
     * @return The SHA 256 hash that you used to create the request signature.
     */

    public String getContentSha256() {
        return this.contentSha256;
    }

    /**
     * <p>
     * The SHA 256 hash that you used to create the request signature.
     * </p>
     * 
     * @param contentSha256
     *        The SHA 256 hash that you used to create the request signature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UiTemplateInfo withContentSha256(String contentSha256) {
        setContentSha256(contentSha256);
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
        if (getContentSha256() != null)
            sb.append("ContentSha256: ").append(getContentSha256());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UiTemplateInfo == false)
            return false;
        UiTemplateInfo other = (UiTemplateInfo) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getContentSha256() == null ^ this.getContentSha256() == null)
            return false;
        if (other.getContentSha256() != null && other.getContentSha256().equals(this.getContentSha256()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getContentSha256() == null) ? 0 : getContentSha256().hashCode());
        return hashCode;
    }

    @Override
    public UiTemplateInfo clone() {
        try {
            return (UiTemplateInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.UiTemplateInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
