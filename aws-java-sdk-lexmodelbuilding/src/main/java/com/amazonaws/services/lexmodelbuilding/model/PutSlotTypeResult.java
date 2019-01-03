/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutSlotType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSlotTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the slot type.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the slot type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     * </p>
     */
    private java.util.List<EnumerationValue> enumerationValues;
    /**
     * <p>
     * The date that the slot type was updated. When you create a slot type, the creation date and last update date are
     * the same.
     * </p>
     */
    private java.util.Date lastUpdatedDate;
    /**
     * <p>
     * The date that the slot type was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The version of the slot type. For a new slot type, the version is always <code>$LATEST</code>.
     * </p>
     */
    private String version;
    /**
     * <p>
     * Checksum of the <code>$LATEST</code> version of the slot type.
     * </p>
     */
    private String checksum;
    /**
     * <p>
     * The slot resolution strategy that Amazon Lex uses to determine the value of the slot. For more information, see
     * <a>PutSlotType</a>.
     * </p>
     */
    private String valueSelectionStrategy;

    private Boolean createVersion;

    /**
     * <p>
     * The name of the slot type.
     * </p>
     * 
     * @param name
     *        The name of the slot type.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the slot type.
     * </p>
     * 
     * @return The name of the slot type.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the slot type.
     * </p>
     * 
     * @param name
     *        The name of the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSlotTypeResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the slot type.
     * </p>
     * 
     * @param description
     *        A description of the slot type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the slot type.
     * </p>
     * 
     * @return A description of the slot type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the slot type.
     * </p>
     * 
     * @param description
     *        A description of the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSlotTypeResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     * </p>
     * 
     * @return A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     */

    public java.util.List<EnumerationValue> getEnumerationValues() {
        return enumerationValues;
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     * </p>
     * 
     * @param enumerationValues
     *        A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     */

    public void setEnumerationValues(java.util.Collection<EnumerationValue> enumerationValues) {
        if (enumerationValues == null) {
            this.enumerationValues = null;
            return;
        }

        this.enumerationValues = new java.util.ArrayList<EnumerationValue>(enumerationValues);
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnumerationValues(java.util.Collection)} or {@link #withEnumerationValues(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param enumerationValues
     *        A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSlotTypeResult withEnumerationValues(EnumerationValue... enumerationValues) {
        if (this.enumerationValues == null) {
            setEnumerationValues(new java.util.ArrayList<EnumerationValue>(enumerationValues.length));
        }
        for (EnumerationValue ele : enumerationValues) {
            this.enumerationValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     * </p>
     * 
     * @param enumerationValues
     *        A list of <code>EnumerationValue</code> objects that defines the values that the slot type can take.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSlotTypeResult withEnumerationValues(java.util.Collection<EnumerationValue> enumerationValues) {
        setEnumerationValues(enumerationValues);
        return this;
    }

    /**
     * <p>
     * The date that the slot type was updated. When you create a slot type, the creation date and last update date are
     * the same.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date that the slot type was updated. When you create a slot type, the creation date and last update
     *        date are the same.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the slot type was updated. When you create a slot type, the creation date and last update date are
     * the same.
     * </p>
     * 
     * @return The date that the slot type was updated. When you create a slot type, the creation date and last update
     *         date are the same.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the slot type was updated. When you create a slot type, the creation date and last update date are
     * the same.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date that the slot type was updated. When you create a slot type, the creation date and last update
     *        date are the same.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSlotTypeResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
        return this;
    }

    /**
     * <p>
     * The date that the slot type was created.
     * </p>
     * 
     * @param createdDate
     *        The date that the slot type was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date that the slot type was created.
     * </p>
     * 
     * @return The date that the slot type was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date that the slot type was created.
     * </p>
     * 
     * @param createdDate
     *        The date that the slot type was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSlotTypeResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The version of the slot type. For a new slot type, the version is always <code>$LATEST</code>.
     * </p>
     * 
     * @param version
     *        The version of the slot type. For a new slot type, the version is always <code>$LATEST</code>.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the slot type. For a new slot type, the version is always <code>$LATEST</code>.
     * </p>
     * 
     * @return The version of the slot type. For a new slot type, the version is always <code>$LATEST</code>.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the slot type. For a new slot type, the version is always <code>$LATEST</code>.
     * </p>
     * 
     * @param version
     *        The version of the slot type. For a new slot type, the version is always <code>$LATEST</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSlotTypeResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Checksum of the <code>$LATEST</code> version of the slot type.
     * </p>
     * 
     * @param checksum
     *        Checksum of the <code>$LATEST</code> version of the slot type.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * Checksum of the <code>$LATEST</code> version of the slot type.
     * </p>
     * 
     * @return Checksum of the <code>$LATEST</code> version of the slot type.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * Checksum of the <code>$LATEST</code> version of the slot type.
     * </p>
     * 
     * @param checksum
     *        Checksum of the <code>$LATEST</code> version of the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSlotTypeResult withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * <p>
     * The slot resolution strategy that Amazon Lex uses to determine the value of the slot. For more information, see
     * <a>PutSlotType</a>.
     * </p>
     * 
     * @param valueSelectionStrategy
     *        The slot resolution strategy that Amazon Lex uses to determine the value of the slot. For more
     *        information, see <a>PutSlotType</a>.
     * @see SlotValueSelectionStrategy
     */

    public void setValueSelectionStrategy(String valueSelectionStrategy) {
        this.valueSelectionStrategy = valueSelectionStrategy;
    }

    /**
     * <p>
     * The slot resolution strategy that Amazon Lex uses to determine the value of the slot. For more information, see
     * <a>PutSlotType</a>.
     * </p>
     * 
     * @return The slot resolution strategy that Amazon Lex uses to determine the value of the slot. For more
     *         information, see <a>PutSlotType</a>.
     * @see SlotValueSelectionStrategy
     */

    public String getValueSelectionStrategy() {
        return this.valueSelectionStrategy;
    }

    /**
     * <p>
     * The slot resolution strategy that Amazon Lex uses to determine the value of the slot. For more information, see
     * <a>PutSlotType</a>.
     * </p>
     * 
     * @param valueSelectionStrategy
     *        The slot resolution strategy that Amazon Lex uses to determine the value of the slot. For more
     *        information, see <a>PutSlotType</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlotValueSelectionStrategy
     */

    public PutSlotTypeResult withValueSelectionStrategy(String valueSelectionStrategy) {
        setValueSelectionStrategy(valueSelectionStrategy);
        return this;
    }

    /**
     * <p>
     * The slot resolution strategy that Amazon Lex uses to determine the value of the slot. For more information, see
     * <a>PutSlotType</a>.
     * </p>
     * 
     * @param valueSelectionStrategy
     *        The slot resolution strategy that Amazon Lex uses to determine the value of the slot. For more
     *        information, see <a>PutSlotType</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlotValueSelectionStrategy
     */

    public PutSlotTypeResult withValueSelectionStrategy(SlotValueSelectionStrategy valueSelectionStrategy) {
        this.valueSelectionStrategy = valueSelectionStrategy.toString();
        return this;
    }

    /**
     * @param createVersion
     */

    public void setCreateVersion(Boolean createVersion) {
        this.createVersion = createVersion;
    }

    /**
     * @return
     */

    public Boolean getCreateVersion() {
        return this.createVersion;
    }

    /**
     * @param createVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSlotTypeResult withCreateVersion(Boolean createVersion) {
        setCreateVersion(createVersion);
        return this;
    }

    /**
     * @return
     */

    public Boolean isCreateVersion() {
        return this.createVersion;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEnumerationValues() != null)
            sb.append("EnumerationValues: ").append(getEnumerationValues()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getValueSelectionStrategy() != null)
            sb.append("ValueSelectionStrategy: ").append(getValueSelectionStrategy()).append(",");
        if (getCreateVersion() != null)
            sb.append("CreateVersion: ").append(getCreateVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSlotTypeResult == false)
            return false;
        PutSlotTypeResult other = (PutSlotTypeResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnumerationValues() == null ^ this.getEnumerationValues() == null)
            return false;
        if (other.getEnumerationValues() != null && other.getEnumerationValues().equals(this.getEnumerationValues()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getValueSelectionStrategy() == null ^ this.getValueSelectionStrategy() == null)
            return false;
        if (other.getValueSelectionStrategy() != null && other.getValueSelectionStrategy().equals(this.getValueSelectionStrategy()) == false)
            return false;
        if (other.getCreateVersion() == null ^ this.getCreateVersion() == null)
            return false;
        if (other.getCreateVersion() != null && other.getCreateVersion().equals(this.getCreateVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnumerationValues() == null) ? 0 : getEnumerationValues().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getValueSelectionStrategy() == null) ? 0 : getValueSelectionStrategy().hashCode());
        hashCode = prime * hashCode + ((getCreateVersion() == null) ? 0 : getCreateVersion().hashCode());
        return hashCode;
    }

    @Override
    public PutSlotTypeResult clone() {
        try {
            return (PutSlotTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
