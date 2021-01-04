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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A ProfileObjectTypeTemplate in a list of ProfileObjectTypeTemplates.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListProfileObjectTypeTemplateItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProfileObjectTypeTemplateItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the object template.
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * The name of the source of the object template.
     * </p>
     */
    private String sourceName;
    /**
     * <p>
     * The source of the object template.
     * </p>
     */
    private String sourceObject;

    /**
     * <p>
     * A unique identifier for the object template.
     * </p>
     * 
     * @param templateId
     *        A unique identifier for the object template.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * A unique identifier for the object template.
     * </p>
     * 
     * @return A unique identifier for the object template.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * A unique identifier for the object template.
     * </p>
     * 
     * @param templateId
     *        A unique identifier for the object template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileObjectTypeTemplateItem withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * The name of the source of the object template.
     * </p>
     * 
     * @param sourceName
     *        The name of the source of the object template.
     */

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * <p>
     * The name of the source of the object template.
     * </p>
     * 
     * @return The name of the source of the object template.
     */

    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * <p>
     * The name of the source of the object template.
     * </p>
     * 
     * @param sourceName
     *        The name of the source of the object template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileObjectTypeTemplateItem withSourceName(String sourceName) {
        setSourceName(sourceName);
        return this;
    }

    /**
     * <p>
     * The source of the object template.
     * </p>
     * 
     * @param sourceObject
     *        The source of the object template.
     */

    public void setSourceObject(String sourceObject) {
        this.sourceObject = sourceObject;
    }

    /**
     * <p>
     * The source of the object template.
     * </p>
     * 
     * @return The source of the object template.
     */

    public String getSourceObject() {
        return this.sourceObject;
    }

    /**
     * <p>
     * The source of the object template.
     * </p>
     * 
     * @param sourceObject
     *        The source of the object template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfileObjectTypeTemplateItem withSourceObject(String sourceObject) {
        setSourceObject(sourceObject);
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
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
        if (getSourceName() != null)
            sb.append("SourceName: ").append(getSourceName()).append(",");
        if (getSourceObject() != null)
            sb.append("SourceObject: ").append(getSourceObject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProfileObjectTypeTemplateItem == false)
            return false;
        ListProfileObjectTypeTemplateItem other = (ListProfileObjectTypeTemplateItem) obj;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getSourceName() == null ^ this.getSourceName() == null)
            return false;
        if (other.getSourceName() != null && other.getSourceName().equals(this.getSourceName()) == false)
            return false;
        if (other.getSourceObject() == null ^ this.getSourceObject() == null)
            return false;
        if (other.getSourceObject() != null && other.getSourceObject().equals(this.getSourceObject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getSourceName() == null) ? 0 : getSourceName().hashCode());
        hashCode = prime * hashCode + ((getSourceObject() == null) ? 0 : getSourceObject().hashCode());
        return hashCode;
    }

    @Override
    public ListProfileObjectTypeTemplateItem clone() {
        try {
            return (ListProfileObjectTypeTemplateItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.ListProfileObjectTypeTemplateItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
