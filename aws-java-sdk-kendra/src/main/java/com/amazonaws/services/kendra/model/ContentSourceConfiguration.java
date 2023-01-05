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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information for your content sources, such as data sources, FAQs, and content indexed
 * directly via <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchPutDocument.html">BatchPutDocument</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ContentSourceConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContentSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the data sources you want to use for your Amazon Kendra experience.
     * </p>
     */
    private java.util.List<String> dataSourceIds;
    /**
     * <p>
     * The identifier of the FAQs that you want to use for your Amazon Kendra experience.
     * </p>
     */
    private java.util.List<String> faqIds;
    /**
     * <p>
     * <code>TRUE</code> to use documents you indexed directly using the <code>BatchPutDocument</code> API.
     * </p>
     */
    private Boolean directPutContent;

    /**
     * <p>
     * The identifier of the data sources you want to use for your Amazon Kendra experience.
     * </p>
     * 
     * @return The identifier of the data sources you want to use for your Amazon Kendra experience.
     */

    public java.util.List<String> getDataSourceIds() {
        return dataSourceIds;
    }

    /**
     * <p>
     * The identifier of the data sources you want to use for your Amazon Kendra experience.
     * </p>
     * 
     * @param dataSourceIds
     *        The identifier of the data sources you want to use for your Amazon Kendra experience.
     */

    public void setDataSourceIds(java.util.Collection<String> dataSourceIds) {
        if (dataSourceIds == null) {
            this.dataSourceIds = null;
            return;
        }

        this.dataSourceIds = new java.util.ArrayList<String>(dataSourceIds);
    }

    /**
     * <p>
     * The identifier of the data sources you want to use for your Amazon Kendra experience.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSourceIds(java.util.Collection)} or {@link #withDataSourceIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dataSourceIds
     *        The identifier of the data sources you want to use for your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentSourceConfiguration withDataSourceIds(String... dataSourceIds) {
        if (this.dataSourceIds == null) {
            setDataSourceIds(new java.util.ArrayList<String>(dataSourceIds.length));
        }
        for (String ele : dataSourceIds) {
            this.dataSourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifier of the data sources you want to use for your Amazon Kendra experience.
     * </p>
     * 
     * @param dataSourceIds
     *        The identifier of the data sources you want to use for your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentSourceConfiguration withDataSourceIds(java.util.Collection<String> dataSourceIds) {
        setDataSourceIds(dataSourceIds);
        return this;
    }

    /**
     * <p>
     * The identifier of the FAQs that you want to use for your Amazon Kendra experience.
     * </p>
     * 
     * @return The identifier of the FAQs that you want to use for your Amazon Kendra experience.
     */

    public java.util.List<String> getFaqIds() {
        return faqIds;
    }

    /**
     * <p>
     * The identifier of the FAQs that you want to use for your Amazon Kendra experience.
     * </p>
     * 
     * @param faqIds
     *        The identifier of the FAQs that you want to use for your Amazon Kendra experience.
     */

    public void setFaqIds(java.util.Collection<String> faqIds) {
        if (faqIds == null) {
            this.faqIds = null;
            return;
        }

        this.faqIds = new java.util.ArrayList<String>(faqIds);
    }

    /**
     * <p>
     * The identifier of the FAQs that you want to use for your Amazon Kendra experience.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFaqIds(java.util.Collection)} or {@link #withFaqIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param faqIds
     *        The identifier of the FAQs that you want to use for your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentSourceConfiguration withFaqIds(String... faqIds) {
        if (this.faqIds == null) {
            setFaqIds(new java.util.ArrayList<String>(faqIds.length));
        }
        for (String ele : faqIds) {
            this.faqIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifier of the FAQs that you want to use for your Amazon Kendra experience.
     * </p>
     * 
     * @param faqIds
     *        The identifier of the FAQs that you want to use for your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentSourceConfiguration withFaqIds(java.util.Collection<String> faqIds) {
        setFaqIds(faqIds);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to use documents you indexed directly using the <code>BatchPutDocument</code> API.
     * </p>
     * 
     * @param directPutContent
     *        <code>TRUE</code> to use documents you indexed directly using the <code>BatchPutDocument</code> API.
     */

    public void setDirectPutContent(Boolean directPutContent) {
        this.directPutContent = directPutContent;
    }

    /**
     * <p>
     * <code>TRUE</code> to use documents you indexed directly using the <code>BatchPutDocument</code> API.
     * </p>
     * 
     * @return <code>TRUE</code> to use documents you indexed directly using the <code>BatchPutDocument</code> API.
     */

    public Boolean getDirectPutContent() {
        return this.directPutContent;
    }

    /**
     * <p>
     * <code>TRUE</code> to use documents you indexed directly using the <code>BatchPutDocument</code> API.
     * </p>
     * 
     * @param directPutContent
     *        <code>TRUE</code> to use documents you indexed directly using the <code>BatchPutDocument</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentSourceConfiguration withDirectPutContent(Boolean directPutContent) {
        setDirectPutContent(directPutContent);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to use documents you indexed directly using the <code>BatchPutDocument</code> API.
     * </p>
     * 
     * @return <code>TRUE</code> to use documents you indexed directly using the <code>BatchPutDocument</code> API.
     */

    public Boolean isDirectPutContent() {
        return this.directPutContent;
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
        if (getDataSourceIds() != null)
            sb.append("DataSourceIds: ").append(getDataSourceIds()).append(",");
        if (getFaqIds() != null)
            sb.append("FaqIds: ").append(getFaqIds()).append(",");
        if (getDirectPutContent() != null)
            sb.append("DirectPutContent: ").append(getDirectPutContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContentSourceConfiguration == false)
            return false;
        ContentSourceConfiguration other = (ContentSourceConfiguration) obj;
        if (other.getDataSourceIds() == null ^ this.getDataSourceIds() == null)
            return false;
        if (other.getDataSourceIds() != null && other.getDataSourceIds().equals(this.getDataSourceIds()) == false)
            return false;
        if (other.getFaqIds() == null ^ this.getFaqIds() == null)
            return false;
        if (other.getFaqIds() != null && other.getFaqIds().equals(this.getFaqIds()) == false)
            return false;
        if (other.getDirectPutContent() == null ^ this.getDirectPutContent() == null)
            return false;
        if (other.getDirectPutContent() != null && other.getDirectPutContent().equals(this.getDirectPutContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceIds() == null) ? 0 : getDataSourceIds().hashCode());
        hashCode = prime * hashCode + ((getFaqIds() == null) ? 0 : getFaqIds().hashCode());
        hashCode = prime * hashCode + ((getDirectPutContent() == null) ? 0 : getDirectPutContent().hashCode());
        return hashCode;
    }

    @Override
    public ContentSourceConfiguration clone() {
        try {
            return (ContentSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ContentSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
