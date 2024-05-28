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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DataProductSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataProductSummary implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private java.util.Date createdAt;
    /** <p/> */
    private String createdBy;
    /** <p/> */
    private java.util.List<DataProductItem> dataProductItems;
    /** <p/> */
    private String description;
    /** <p/> */
    private String domainId;
    /** <p/> */
    private java.util.List<String> glossaryTerms;
    /** <p/> */
    private String id;
    /** <p/> */
    private String name;
    /** <p/> */
    private String owningProjectId;
    /** <p/> */
    private java.util.Date updatedAt;
    /** <p/> */
    private String updatedBy;

    /**
     * <p/>
     * 
     * @param createdAt
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p/>
     * 
     * @param createdAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p/>
     * 
     * @param createdBy
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p/>
     * 
     * @param createdBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductSummary withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<DataProductItem> getDataProductItems() {
        return dataProductItems;
    }

    /**
     * <p/>
     * 
     * @param dataProductItems
     */

    public void setDataProductItems(java.util.Collection<DataProductItem> dataProductItems) {
        if (dataProductItems == null) {
            this.dataProductItems = null;
            return;
        }

        this.dataProductItems = new java.util.ArrayList<DataProductItem>(dataProductItems);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataProductItems(java.util.Collection)} or {@link #withDataProductItems(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dataProductItems
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductSummary withDataProductItems(DataProductItem... dataProductItems) {
        if (this.dataProductItems == null) {
            setDataProductItems(new java.util.ArrayList<DataProductItem>(dataProductItems.length));
        }
        for (DataProductItem ele : dataProductItems) {
            this.dataProductItems.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param dataProductItems
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductSummary withDataProductItems(java.util.Collection<DataProductItem> dataProductItems) {
        setDataProductItems(dataProductItems);
        return this;
    }

    /**
     * <p/>
     * 
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p/>
     * 
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p/>
     * 
     * @param domainId
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p/>
     * 
     * @param domainId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductSummary withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<String> getGlossaryTerms() {
        return glossaryTerms;
    }

    /**
     * <p/>
     * 
     * @param glossaryTerms
     */

    public void setGlossaryTerms(java.util.Collection<String> glossaryTerms) {
        if (glossaryTerms == null) {
            this.glossaryTerms = null;
            return;
        }

        this.glossaryTerms = new java.util.ArrayList<String>(glossaryTerms);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlossaryTerms(java.util.Collection)} or {@link #withGlossaryTerms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param glossaryTerms
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductSummary withGlossaryTerms(String... glossaryTerms) {
        if (this.glossaryTerms == null) {
            setGlossaryTerms(new java.util.ArrayList<String>(glossaryTerms.length));
        }
        for (String ele : glossaryTerms) {
            this.glossaryTerms.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param glossaryTerms
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductSummary withGlossaryTerms(java.util.Collection<String> glossaryTerms) {
        setGlossaryTerms(glossaryTerms);
        return this;
    }

    /**
     * <p/>
     * 
     * @param id
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p/>
     * 
     * @param id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p/>
     * 
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p/>
     * 
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p/>
     * 
     * @param owningProjectId
     */

    public void setOwningProjectId(String owningProjectId) {
        this.owningProjectId = owningProjectId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getOwningProjectId() {
        return this.owningProjectId;
    }

    /**
     * <p/>
     * 
     * @param owningProjectId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductSummary withOwningProjectId(String owningProjectId) {
        setOwningProjectId(owningProjectId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param updatedAt
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p/>
     * 
     * @param updatedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p/>
     * 
     * @param updatedBy
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p/>
     * 
     * @param updatedBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductSummary withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDataProductItems() != null)
            sb.append("DataProductItems: ").append(getDataProductItems()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getGlossaryTerms() != null)
            sb.append("GlossaryTerms: ").append(getGlossaryTerms()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getOwningProjectId() != null)
            sb.append("OwningProjectId: ").append(getOwningProjectId()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataProductSummary == false)
            return false;
        DataProductSummary other = (DataProductSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDataProductItems() == null ^ this.getDataProductItems() == null)
            return false;
        if (other.getDataProductItems() != null && other.getDataProductItems().equals(this.getDataProductItems()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getGlossaryTerms() == null ^ this.getGlossaryTerms() == null)
            return false;
        if (other.getGlossaryTerms() != null && other.getGlossaryTerms().equals(this.getGlossaryTerms()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwningProjectId() == null ^ this.getOwningProjectId() == null)
            return false;
        if (other.getOwningProjectId() != null && other.getOwningProjectId().equals(this.getOwningProjectId()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDataProductItems() == null) ? 0 : getDataProductItems().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getGlossaryTerms() == null) ? 0 : getGlossaryTerms().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwningProjectId() == null) ? 0 : getOwningProjectId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public DataProductSummary clone() {
        try {
            return (DataProductSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.DataProductSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
