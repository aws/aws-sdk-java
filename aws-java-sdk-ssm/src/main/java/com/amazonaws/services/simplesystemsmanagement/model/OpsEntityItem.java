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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The OpsItem summaries result item.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/OpsEntityItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpsEntityItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time OpsItem data was captured.
     * </p>
     */
    private String captureTime;
    /**
     * <p>
     * The detailed data content for an OpsItem summaries result item.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>> content;

    /**
     * <p>
     * The time OpsItem data was captured.
     * </p>
     * 
     * @param captureTime
     *        The time OpsItem data was captured.
     */

    public void setCaptureTime(String captureTime) {
        this.captureTime = captureTime;
    }

    /**
     * <p>
     * The time OpsItem data was captured.
     * </p>
     * 
     * @return The time OpsItem data was captured.
     */

    public String getCaptureTime() {
        return this.captureTime;
    }

    /**
     * <p>
     * The time OpsItem data was captured.
     * </p>
     * 
     * @param captureTime
     *        The time OpsItem data was captured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsEntityItem withCaptureTime(String captureTime) {
        setCaptureTime(captureTime);
        return this;
    }

    /**
     * <p>
     * The detailed data content for an OpsItem summaries result item.
     * </p>
     * 
     * @return The detailed data content for an OpsItem summaries result item.
     */

    public java.util.List<java.util.Map<String, String>> getContent() {
        if (content == null) {
            content = new com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>>();
        }
        return content;
    }

    /**
     * <p>
     * The detailed data content for an OpsItem summaries result item.
     * </p>
     * 
     * @param content
     *        The detailed data content for an OpsItem summaries result item.
     */

    public void setContent(java.util.Collection<java.util.Map<String, String>> content) {
        if (content == null) {
            this.content = null;
            return;
        }

        this.content = new com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>>(content);
    }

    /**
     * <p>
     * The detailed data content for an OpsItem summaries result item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContent(java.util.Collection)} or {@link #withContent(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param content
     *        The detailed data content for an OpsItem summaries result item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsEntityItem withContent(java.util.Map<String, String>... content) {
        if (this.content == null) {
            setContent(new com.amazonaws.internal.SdkInternalList<java.util.Map<String, String>>(content.length));
        }
        for (java.util.Map<String, String> ele : content) {
            this.content.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The detailed data content for an OpsItem summaries result item.
     * </p>
     * 
     * @param content
     *        The detailed data content for an OpsItem summaries result item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsEntityItem withContent(java.util.Collection<java.util.Map<String, String>> content) {
        setContent(content);
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
        if (getCaptureTime() != null)
            sb.append("CaptureTime: ").append(getCaptureTime()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpsEntityItem == false)
            return false;
        OpsEntityItem other = (OpsEntityItem) obj;
        if (other.getCaptureTime() == null ^ this.getCaptureTime() == null)
            return false;
        if (other.getCaptureTime() != null && other.getCaptureTime().equals(this.getCaptureTime()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaptureTime() == null) ? 0 : getCaptureTime().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public OpsEntityItem clone() {
        try {
            return (OpsEntityItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.OpsEntityItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
