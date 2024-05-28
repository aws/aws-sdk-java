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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The settings for client-side encryption for cryptographic computing.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DataEncryptionMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataEncryptionMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether encrypted tables can contain cleartext data (<code>TRUE</code>) or are to cryptographically
     * process every column (<code>FALSE</code>).
     * </p>
     */
    private Boolean allowCleartext;
    /**
     * <p>
     * Indicates whether Fingerprint columns can contain duplicate entries (<code>TRUE</code>) or are to contain only
     * non-repeated values (<code>FALSE</code>).
     * </p>
     */
    private Boolean allowDuplicates;
    /**
     * <p>
     * Indicates whether Fingerprint columns can be joined on any other Fingerprint column with a different name (
     * <code>TRUE</code>) or can only be joined on Fingerprint columns of the same name (<code>FALSE</code>).
     * </p>
     */
    private Boolean allowJoinsOnColumnsWithDifferentNames;
    /**
     * <p>
     * Indicates whether NULL values are to be copied as NULL to encrypted tables (<code>TRUE</code>) or
     * cryptographically processed (<code>FALSE</code>).
     * </p>
     */
    private Boolean preserveNulls;

    /**
     * <p>
     * Indicates whether encrypted tables can contain cleartext data (<code>TRUE</code>) or are to cryptographically
     * process every column (<code>FALSE</code>).
     * </p>
     * 
     * @param allowCleartext
     *        Indicates whether encrypted tables can contain cleartext data (<code>TRUE</code>) or are to
     *        cryptographically process every column (<code>FALSE</code>).
     */

    public void setAllowCleartext(Boolean allowCleartext) {
        this.allowCleartext = allowCleartext;
    }

    /**
     * <p>
     * Indicates whether encrypted tables can contain cleartext data (<code>TRUE</code>) or are to cryptographically
     * process every column (<code>FALSE</code>).
     * </p>
     * 
     * @return Indicates whether encrypted tables can contain cleartext data (<code>TRUE</code>) or are to
     *         cryptographically process every column (<code>FALSE</code>).
     */

    public Boolean getAllowCleartext() {
        return this.allowCleartext;
    }

    /**
     * <p>
     * Indicates whether encrypted tables can contain cleartext data (<code>TRUE</code>) or are to cryptographically
     * process every column (<code>FALSE</code>).
     * </p>
     * 
     * @param allowCleartext
     *        Indicates whether encrypted tables can contain cleartext data (<code>TRUE</code>) or are to
     *        cryptographically process every column (<code>FALSE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataEncryptionMetadata withAllowCleartext(Boolean allowCleartext) {
        setAllowCleartext(allowCleartext);
        return this;
    }

    /**
     * <p>
     * Indicates whether encrypted tables can contain cleartext data (<code>TRUE</code>) or are to cryptographically
     * process every column (<code>FALSE</code>).
     * </p>
     * 
     * @return Indicates whether encrypted tables can contain cleartext data (<code>TRUE</code>) or are to
     *         cryptographically process every column (<code>FALSE</code>).
     */

    public Boolean isAllowCleartext() {
        return this.allowCleartext;
    }

    /**
     * <p>
     * Indicates whether Fingerprint columns can contain duplicate entries (<code>TRUE</code>) or are to contain only
     * non-repeated values (<code>FALSE</code>).
     * </p>
     * 
     * @param allowDuplicates
     *        Indicates whether Fingerprint columns can contain duplicate entries (<code>TRUE</code>) or are to contain
     *        only non-repeated values (<code>FALSE</code>).
     */

    public void setAllowDuplicates(Boolean allowDuplicates) {
        this.allowDuplicates = allowDuplicates;
    }

    /**
     * <p>
     * Indicates whether Fingerprint columns can contain duplicate entries (<code>TRUE</code>) or are to contain only
     * non-repeated values (<code>FALSE</code>).
     * </p>
     * 
     * @return Indicates whether Fingerprint columns can contain duplicate entries (<code>TRUE</code>) or are to contain
     *         only non-repeated values (<code>FALSE</code>).
     */

    public Boolean getAllowDuplicates() {
        return this.allowDuplicates;
    }

    /**
     * <p>
     * Indicates whether Fingerprint columns can contain duplicate entries (<code>TRUE</code>) or are to contain only
     * non-repeated values (<code>FALSE</code>).
     * </p>
     * 
     * @param allowDuplicates
     *        Indicates whether Fingerprint columns can contain duplicate entries (<code>TRUE</code>) or are to contain
     *        only non-repeated values (<code>FALSE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataEncryptionMetadata withAllowDuplicates(Boolean allowDuplicates) {
        setAllowDuplicates(allowDuplicates);
        return this;
    }

    /**
     * <p>
     * Indicates whether Fingerprint columns can contain duplicate entries (<code>TRUE</code>) or are to contain only
     * non-repeated values (<code>FALSE</code>).
     * </p>
     * 
     * @return Indicates whether Fingerprint columns can contain duplicate entries (<code>TRUE</code>) or are to contain
     *         only non-repeated values (<code>FALSE</code>).
     */

    public Boolean isAllowDuplicates() {
        return this.allowDuplicates;
    }

    /**
     * <p>
     * Indicates whether Fingerprint columns can be joined on any other Fingerprint column with a different name (
     * <code>TRUE</code>) or can only be joined on Fingerprint columns of the same name (<code>FALSE</code>).
     * </p>
     * 
     * @param allowJoinsOnColumnsWithDifferentNames
     *        Indicates whether Fingerprint columns can be joined on any other Fingerprint column with a different name
     *        (<code>TRUE</code>) or can only be joined on Fingerprint columns of the same name (<code>FALSE</code>).
     */

    public void setAllowJoinsOnColumnsWithDifferentNames(Boolean allowJoinsOnColumnsWithDifferentNames) {
        this.allowJoinsOnColumnsWithDifferentNames = allowJoinsOnColumnsWithDifferentNames;
    }

    /**
     * <p>
     * Indicates whether Fingerprint columns can be joined on any other Fingerprint column with a different name (
     * <code>TRUE</code>) or can only be joined on Fingerprint columns of the same name (<code>FALSE</code>).
     * </p>
     * 
     * @return Indicates whether Fingerprint columns can be joined on any other Fingerprint column with a different name
     *         (<code>TRUE</code>) or can only be joined on Fingerprint columns of the same name (<code>FALSE</code>).
     */

    public Boolean getAllowJoinsOnColumnsWithDifferentNames() {
        return this.allowJoinsOnColumnsWithDifferentNames;
    }

    /**
     * <p>
     * Indicates whether Fingerprint columns can be joined on any other Fingerprint column with a different name (
     * <code>TRUE</code>) or can only be joined on Fingerprint columns of the same name (<code>FALSE</code>).
     * </p>
     * 
     * @param allowJoinsOnColumnsWithDifferentNames
     *        Indicates whether Fingerprint columns can be joined on any other Fingerprint column with a different name
     *        (<code>TRUE</code>) or can only be joined on Fingerprint columns of the same name (<code>FALSE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataEncryptionMetadata withAllowJoinsOnColumnsWithDifferentNames(Boolean allowJoinsOnColumnsWithDifferentNames) {
        setAllowJoinsOnColumnsWithDifferentNames(allowJoinsOnColumnsWithDifferentNames);
        return this;
    }

    /**
     * <p>
     * Indicates whether Fingerprint columns can be joined on any other Fingerprint column with a different name (
     * <code>TRUE</code>) or can only be joined on Fingerprint columns of the same name (<code>FALSE</code>).
     * </p>
     * 
     * @return Indicates whether Fingerprint columns can be joined on any other Fingerprint column with a different name
     *         (<code>TRUE</code>) or can only be joined on Fingerprint columns of the same name (<code>FALSE</code>).
     */

    public Boolean isAllowJoinsOnColumnsWithDifferentNames() {
        return this.allowJoinsOnColumnsWithDifferentNames;
    }

    /**
     * <p>
     * Indicates whether NULL values are to be copied as NULL to encrypted tables (<code>TRUE</code>) or
     * cryptographically processed (<code>FALSE</code>).
     * </p>
     * 
     * @param preserveNulls
     *        Indicates whether NULL values are to be copied as NULL to encrypted tables (<code>TRUE</code>) or
     *        cryptographically processed (<code>FALSE</code>).
     */

    public void setPreserveNulls(Boolean preserveNulls) {
        this.preserveNulls = preserveNulls;
    }

    /**
     * <p>
     * Indicates whether NULL values are to be copied as NULL to encrypted tables (<code>TRUE</code>) or
     * cryptographically processed (<code>FALSE</code>).
     * </p>
     * 
     * @return Indicates whether NULL values are to be copied as NULL to encrypted tables (<code>TRUE</code>) or
     *         cryptographically processed (<code>FALSE</code>).
     */

    public Boolean getPreserveNulls() {
        return this.preserveNulls;
    }

    /**
     * <p>
     * Indicates whether NULL values are to be copied as NULL to encrypted tables (<code>TRUE</code>) or
     * cryptographically processed (<code>FALSE</code>).
     * </p>
     * 
     * @param preserveNulls
     *        Indicates whether NULL values are to be copied as NULL to encrypted tables (<code>TRUE</code>) or
     *        cryptographically processed (<code>FALSE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataEncryptionMetadata withPreserveNulls(Boolean preserveNulls) {
        setPreserveNulls(preserveNulls);
        return this;
    }

    /**
     * <p>
     * Indicates whether NULL values are to be copied as NULL to encrypted tables (<code>TRUE</code>) or
     * cryptographically processed (<code>FALSE</code>).
     * </p>
     * 
     * @return Indicates whether NULL values are to be copied as NULL to encrypted tables (<code>TRUE</code>) or
     *         cryptographically processed (<code>FALSE</code>).
     */

    public Boolean isPreserveNulls() {
        return this.preserveNulls;
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
        if (getAllowCleartext() != null)
            sb.append("AllowCleartext: ").append(getAllowCleartext()).append(",");
        if (getAllowDuplicates() != null)
            sb.append("AllowDuplicates: ").append(getAllowDuplicates()).append(",");
        if (getAllowJoinsOnColumnsWithDifferentNames() != null)
            sb.append("AllowJoinsOnColumnsWithDifferentNames: ").append(getAllowJoinsOnColumnsWithDifferentNames()).append(",");
        if (getPreserveNulls() != null)
            sb.append("PreserveNulls: ").append(getPreserveNulls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataEncryptionMetadata == false)
            return false;
        DataEncryptionMetadata other = (DataEncryptionMetadata) obj;
        if (other.getAllowCleartext() == null ^ this.getAllowCleartext() == null)
            return false;
        if (other.getAllowCleartext() != null && other.getAllowCleartext().equals(this.getAllowCleartext()) == false)
            return false;
        if (other.getAllowDuplicates() == null ^ this.getAllowDuplicates() == null)
            return false;
        if (other.getAllowDuplicates() != null && other.getAllowDuplicates().equals(this.getAllowDuplicates()) == false)
            return false;
        if (other.getAllowJoinsOnColumnsWithDifferentNames() == null ^ this.getAllowJoinsOnColumnsWithDifferentNames() == null)
            return false;
        if (other.getAllowJoinsOnColumnsWithDifferentNames() != null
                && other.getAllowJoinsOnColumnsWithDifferentNames().equals(this.getAllowJoinsOnColumnsWithDifferentNames()) == false)
            return false;
        if (other.getPreserveNulls() == null ^ this.getPreserveNulls() == null)
            return false;
        if (other.getPreserveNulls() != null && other.getPreserveNulls().equals(this.getPreserveNulls()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowCleartext() == null) ? 0 : getAllowCleartext().hashCode());
        hashCode = prime * hashCode + ((getAllowDuplicates() == null) ? 0 : getAllowDuplicates().hashCode());
        hashCode = prime * hashCode + ((getAllowJoinsOnColumnsWithDifferentNames() == null) ? 0 : getAllowJoinsOnColumnsWithDifferentNames().hashCode());
        hashCode = prime * hashCode + ((getPreserveNulls() == null) ? 0 : getPreserveNulls().hashCode());
        return hashCode;
    }

    @Override
    public DataEncryptionMetadata clone() {
        try {
            return (DataEncryptionMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.DataEncryptionMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
