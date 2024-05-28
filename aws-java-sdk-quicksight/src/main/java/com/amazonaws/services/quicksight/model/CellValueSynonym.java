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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that represents the cell value synonym.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CellValueSynonym" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CellValueSynonym implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The cell value.
     * </p>
     */
    private String cellValue;
    /**
     * <p>
     * Other names or aliases for the cell value.
     * </p>
     */
    private java.util.List<String> synonyms;

    /**
     * <p>
     * The cell value.
     * </p>
     * 
     * @param cellValue
     *        The cell value.
     */

    public void setCellValue(String cellValue) {
        this.cellValue = cellValue;
    }

    /**
     * <p>
     * The cell value.
     * </p>
     * 
     * @return The cell value.
     */

    public String getCellValue() {
        return this.cellValue;
    }

    /**
     * <p>
     * The cell value.
     * </p>
     * 
     * @param cellValue
     *        The cell value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellValueSynonym withCellValue(String cellValue) {
        setCellValue(cellValue);
        return this;
    }

    /**
     * <p>
     * Other names or aliases for the cell value.
     * </p>
     * 
     * @return Other names or aliases for the cell value.
     */

    public java.util.List<String> getSynonyms() {
        return synonyms;
    }

    /**
     * <p>
     * Other names or aliases for the cell value.
     * </p>
     * 
     * @param synonyms
     *        Other names or aliases for the cell value.
     */

    public void setSynonyms(java.util.Collection<String> synonyms) {
        if (synonyms == null) {
            this.synonyms = null;
            return;
        }

        this.synonyms = new java.util.ArrayList<String>(synonyms);
    }

    /**
     * <p>
     * Other names or aliases for the cell value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSynonyms(java.util.Collection)} or {@link #withSynonyms(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param synonyms
     *        Other names or aliases for the cell value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellValueSynonym withSynonyms(String... synonyms) {
        if (this.synonyms == null) {
            setSynonyms(new java.util.ArrayList<String>(synonyms.length));
        }
        for (String ele : synonyms) {
            this.synonyms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Other names or aliases for the cell value.
     * </p>
     * 
     * @param synonyms
     *        Other names or aliases for the cell value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellValueSynonym withSynonyms(java.util.Collection<String> synonyms) {
        setSynonyms(synonyms);
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
        if (getCellValue() != null)
            sb.append("CellValue: ").append(getCellValue()).append(",");
        if (getSynonyms() != null)
            sb.append("Synonyms: ").append(getSynonyms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CellValueSynonym == false)
            return false;
        CellValueSynonym other = (CellValueSynonym) obj;
        if (other.getCellValue() == null ^ this.getCellValue() == null)
            return false;
        if (other.getCellValue() != null && other.getCellValue().equals(this.getCellValue()) == false)
            return false;
        if (other.getSynonyms() == null ^ this.getSynonyms() == null)
            return false;
        if (other.getSynonyms() != null && other.getSynonyms().equals(this.getSynonyms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCellValue() == null) ? 0 : getCellValue().hashCode());
        hashCode = prime * hashCode + ((getSynonyms() == null) ? 0 : getSynonyms().hashCode());
        return hashCode;
    }

    @Override
    public CellValueSynonym clone() {
        try {
            return (CellValueSynonym) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CellValueSynonymMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
