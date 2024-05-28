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
package com.amazonaws.services.qconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DataDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about the content data.
     * </p>
     */
    private ContentDataDetails contentData;
    /**
     * <p>
     * Details about the generative data.
     * </p>
     */
    private GenerativeDataDetails generativeData;
    /**
     * <p>
     * Details about the content data.
     * </p>
     */
    private SourceContentDataDetails sourceContentData;

    /**
     * <p>
     * Details about the content data.
     * </p>
     * 
     * @param contentData
     *        Details about the content data.
     */

    public void setContentData(ContentDataDetails contentData) {
        this.contentData = contentData;
    }

    /**
     * <p>
     * Details about the content data.
     * </p>
     * 
     * @return Details about the content data.
     */

    public ContentDataDetails getContentData() {
        return this.contentData;
    }

    /**
     * <p>
     * Details about the content data.
     * </p>
     * 
     * @param contentData
     *        Details about the content data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataDetails withContentData(ContentDataDetails contentData) {
        setContentData(contentData);
        return this;
    }

    /**
     * <p>
     * Details about the generative data.
     * </p>
     * 
     * @param generativeData
     *        Details about the generative data.
     */

    public void setGenerativeData(GenerativeDataDetails generativeData) {
        this.generativeData = generativeData;
    }

    /**
     * <p>
     * Details about the generative data.
     * </p>
     * 
     * @return Details about the generative data.
     */

    public GenerativeDataDetails getGenerativeData() {
        return this.generativeData;
    }

    /**
     * <p>
     * Details about the generative data.
     * </p>
     * 
     * @param generativeData
     *        Details about the generative data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataDetails withGenerativeData(GenerativeDataDetails generativeData) {
        setGenerativeData(generativeData);
        return this;
    }

    /**
     * <p>
     * Details about the content data.
     * </p>
     * 
     * @param sourceContentData
     *        Details about the content data.
     */

    public void setSourceContentData(SourceContentDataDetails sourceContentData) {
        this.sourceContentData = sourceContentData;
    }

    /**
     * <p>
     * Details about the content data.
     * </p>
     * 
     * @return Details about the content data.
     */

    public SourceContentDataDetails getSourceContentData() {
        return this.sourceContentData;
    }

    /**
     * <p>
     * Details about the content data.
     * </p>
     * 
     * @param sourceContentData
     *        Details about the content data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataDetails withSourceContentData(SourceContentDataDetails sourceContentData) {
        setSourceContentData(sourceContentData);
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
        if (getContentData() != null)
            sb.append("ContentData: ").append(getContentData()).append(",");
        if (getGenerativeData() != null)
            sb.append("GenerativeData: ").append(getGenerativeData()).append(",");
        if (getSourceContentData() != null)
            sb.append("SourceContentData: ").append(getSourceContentData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataDetails == false)
            return false;
        DataDetails other = (DataDetails) obj;
        if (other.getContentData() == null ^ this.getContentData() == null)
            return false;
        if (other.getContentData() != null && other.getContentData().equals(this.getContentData()) == false)
            return false;
        if (other.getGenerativeData() == null ^ this.getGenerativeData() == null)
            return false;
        if (other.getGenerativeData() != null && other.getGenerativeData().equals(this.getGenerativeData()) == false)
            return false;
        if (other.getSourceContentData() == null ^ this.getSourceContentData() == null)
            return false;
        if (other.getSourceContentData() != null && other.getSourceContentData().equals(this.getSourceContentData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentData() == null) ? 0 : getContentData().hashCode());
        hashCode = prime * hashCode + ((getGenerativeData() == null) ? 0 : getGenerativeData().hashCode());
        hashCode = prime * hashCode + ((getSourceContentData() == null) ? 0 : getSourceContentData().hashCode());
        return hashCode;
    }

    @Override
    public DataDetails clone() {
        try {
            return (DataDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qconnect.model.transform.DataDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
