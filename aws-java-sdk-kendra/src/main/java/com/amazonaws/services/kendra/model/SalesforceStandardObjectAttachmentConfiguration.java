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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides configuration information for processing attachments to Salesforce standard objects.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SalesforceStandardObjectAttachmentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SalesforceStandardObjectAttachmentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the field used for the document title.
     * </p>
     */
    private String documentTitleFieldName;
    /**
     * <p>
     * One or more objects that map fields in attachments to Amazon Kendra index fields.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;

    /**
     * <p>
     * The name of the field used for the document title.
     * </p>
     * 
     * @param documentTitleFieldName
     *        The name of the field used for the document title.
     */

    public void setDocumentTitleFieldName(String documentTitleFieldName) {
        this.documentTitleFieldName = documentTitleFieldName;
    }

    /**
     * <p>
     * The name of the field used for the document title.
     * </p>
     * 
     * @return The name of the field used for the document title.
     */

    public String getDocumentTitleFieldName() {
        return this.documentTitleFieldName;
    }

    /**
     * <p>
     * The name of the field used for the document title.
     * </p>
     * 
     * @param documentTitleFieldName
     *        The name of the field used for the document title.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceStandardObjectAttachmentConfiguration withDocumentTitleFieldName(String documentTitleFieldName) {
        setDocumentTitleFieldName(documentTitleFieldName);
        return this;
    }

    /**
     * <p>
     * One or more objects that map fields in attachments to Amazon Kendra index fields.
     * </p>
     * 
     * @return One or more objects that map fields in attachments to Amazon Kendra index fields.
     */

    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * One or more objects that map fields in attachments to Amazon Kendra index fields.
     * </p>
     * 
     * @param fieldMappings
     *        One or more objects that map fields in attachments to Amazon Kendra index fields.
     */

    public void setFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        if (fieldMappings == null) {
            this.fieldMappings = null;
            return;
        }

        this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings);
    }

    /**
     * <p>
     * One or more objects that map fields in attachments to Amazon Kendra index fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldMappings(java.util.Collection)} or {@link #withFieldMappings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fieldMappings
     *        One or more objects that map fields in attachments to Amazon Kendra index fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceStandardObjectAttachmentConfiguration withFieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
        if (this.fieldMappings == null) {
            setFieldMappings(new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings.length));
        }
        for (DataSourceToIndexFieldMapping ele : fieldMappings) {
            this.fieldMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more objects that map fields in attachments to Amazon Kendra index fields.
     * </p>
     * 
     * @param fieldMappings
     *        One or more objects that map fields in attachments to Amazon Kendra index fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceStandardObjectAttachmentConfiguration withFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
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
        if (getDocumentTitleFieldName() != null)
            sb.append("DocumentTitleFieldName: ").append(getDocumentTitleFieldName()).append(",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: ").append(getFieldMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SalesforceStandardObjectAttachmentConfiguration == false)
            return false;
        SalesforceStandardObjectAttachmentConfiguration other = (SalesforceStandardObjectAttachmentConfiguration) obj;
        if (other.getDocumentTitleFieldName() == null ^ this.getDocumentTitleFieldName() == null)
            return false;
        if (other.getDocumentTitleFieldName() != null && other.getDocumentTitleFieldName().equals(this.getDocumentTitleFieldName()) == false)
            return false;
        if (other.getFieldMappings() == null ^ this.getFieldMappings() == null)
            return false;
        if (other.getFieldMappings() != null && other.getFieldMappings().equals(this.getFieldMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentTitleFieldName() == null) ? 0 : getDocumentTitleFieldName().hashCode());
        hashCode = prime * hashCode + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        return hashCode;
    }

    @Override
    public SalesforceStandardObjectAttachmentConfiguration clone() {
        try {
            return (SalesforceStandardObjectAttachmentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SalesforceStandardObjectAttachmentConfigurationMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
