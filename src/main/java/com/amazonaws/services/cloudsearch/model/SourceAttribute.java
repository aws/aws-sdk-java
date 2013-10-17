/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudsearch.model;

import java.io.Serializable;


/**
 * <p>
 * Identifies the source data for an index field. An optional data transformation can be applied to the source data when populating the index field. By
 * default, the value of the source attribute is copied to the index field.
 * </p>
 */
public class SourceAttribute implements Serializable {

    /**
     * Identifies the transformation to apply when copying data from a source
     * attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Copy, TrimTitle, Map
     */
    private String sourceDataFunction;

    /**
     * Copies data from a source document attribute to an
     * <code>IndexField</code>.
     */
    private SourceData sourceDataCopy;

    /**
     * Trims common title words from a source document attribute when
     * populating an <code>IndexField</code>. This can be used to create an
     * <code>IndexField</code> you can use for sorting.
     */
    private SourceDataTrimTitle sourceDataTrimTitle;

    /**
     * Maps source document attribute values to new values when populating
     * the <code>IndexField</code>.
     */
    private SourceDataMap sourceDataMap;

    /**
     * Identifies the transformation to apply when copying data from a source
     * attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Copy, TrimTitle, Map
     *
     * @return Identifies the transformation to apply when copying data from a source
     *         attribute.
     *
     * @see SourceDataFunction
     */
    public String getSourceDataFunction() {
        return sourceDataFunction;
    }
    
    /**
     * Identifies the transformation to apply when copying data from a source
     * attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Copy, TrimTitle, Map
     *
     * @param sourceDataFunction Identifies the transformation to apply when copying data from a source
     *         attribute.
     *
     * @see SourceDataFunction
     */
    public void setSourceDataFunction(String sourceDataFunction) {
        this.sourceDataFunction = sourceDataFunction;
    }
    
    /**
     * Identifies the transformation to apply when copying data from a source
     * attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Copy, TrimTitle, Map
     *
     * @param sourceDataFunction Identifies the transformation to apply when copying data from a source
     *         attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SourceDataFunction
     */
    public SourceAttribute withSourceDataFunction(String sourceDataFunction) {
        this.sourceDataFunction = sourceDataFunction;
        return this;
    }

    /**
     * Identifies the transformation to apply when copying data from a source
     * attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Copy, TrimTitle, Map
     *
     * @param sourceDataFunction Identifies the transformation to apply when copying data from a source
     *         attribute.
     *
     * @see SourceDataFunction
     */
    public void setSourceDataFunction(SourceDataFunction sourceDataFunction) {
        this.sourceDataFunction = sourceDataFunction.toString();
    }
    
    /**
     * Identifies the transformation to apply when copying data from a source
     * attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Copy, TrimTitle, Map
     *
     * @param sourceDataFunction Identifies the transformation to apply when copying data from a source
     *         attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SourceDataFunction
     */
    public SourceAttribute withSourceDataFunction(SourceDataFunction sourceDataFunction) {
        this.sourceDataFunction = sourceDataFunction.toString();
        return this;
    }

    /**
     * Copies data from a source document attribute to an
     * <code>IndexField</code>.
     *
     * @return Copies data from a source document attribute to an
     *         <code>IndexField</code>.
     */
    public SourceData getSourceDataCopy() {
        return sourceDataCopy;
    }
    
    /**
     * Copies data from a source document attribute to an
     * <code>IndexField</code>.
     *
     * @param sourceDataCopy Copies data from a source document attribute to an
     *         <code>IndexField</code>.
     */
    public void setSourceDataCopy(SourceData sourceDataCopy) {
        this.sourceDataCopy = sourceDataCopy;
    }
    
    /**
     * Copies data from a source document attribute to an
     * <code>IndexField</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDataCopy Copies data from a source document attribute to an
     *         <code>IndexField</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SourceAttribute withSourceDataCopy(SourceData sourceDataCopy) {
        this.sourceDataCopy = sourceDataCopy;
        return this;
    }

    /**
     * Trims common title words from a source document attribute when
     * populating an <code>IndexField</code>. This can be used to create an
     * <code>IndexField</code> you can use for sorting.
     *
     * @return Trims common title words from a source document attribute when
     *         populating an <code>IndexField</code>. This can be used to create an
     *         <code>IndexField</code> you can use for sorting.
     */
    public SourceDataTrimTitle getSourceDataTrimTitle() {
        return sourceDataTrimTitle;
    }
    
    /**
     * Trims common title words from a source document attribute when
     * populating an <code>IndexField</code>. This can be used to create an
     * <code>IndexField</code> you can use for sorting.
     *
     * @param sourceDataTrimTitle Trims common title words from a source document attribute when
     *         populating an <code>IndexField</code>. This can be used to create an
     *         <code>IndexField</code> you can use for sorting.
     */
    public void setSourceDataTrimTitle(SourceDataTrimTitle sourceDataTrimTitle) {
        this.sourceDataTrimTitle = sourceDataTrimTitle;
    }
    
    /**
     * Trims common title words from a source document attribute when
     * populating an <code>IndexField</code>. This can be used to create an
     * <code>IndexField</code> you can use for sorting.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDataTrimTitle Trims common title words from a source document attribute when
     *         populating an <code>IndexField</code>. This can be used to create an
     *         <code>IndexField</code> you can use for sorting.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SourceAttribute withSourceDataTrimTitle(SourceDataTrimTitle sourceDataTrimTitle) {
        this.sourceDataTrimTitle = sourceDataTrimTitle;
        return this;
    }

    /**
     * Maps source document attribute values to new values when populating
     * the <code>IndexField</code>.
     *
     * @return Maps source document attribute values to new values when populating
     *         the <code>IndexField</code>.
     */
    public SourceDataMap getSourceDataMap() {
        return sourceDataMap;
    }
    
    /**
     * Maps source document attribute values to new values when populating
     * the <code>IndexField</code>.
     *
     * @param sourceDataMap Maps source document attribute values to new values when populating
     *         the <code>IndexField</code>.
     */
    public void setSourceDataMap(SourceDataMap sourceDataMap) {
        this.sourceDataMap = sourceDataMap;
    }
    
    /**
     * Maps source document attribute values to new values when populating
     * the <code>IndexField</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDataMap Maps source document attribute values to new values when populating
     *         the <code>IndexField</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SourceAttribute withSourceDataMap(SourceDataMap sourceDataMap) {
        this.sourceDataMap = sourceDataMap;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSourceDataFunction() != null) sb.append("SourceDataFunction: " + getSourceDataFunction() + ",");
        if (getSourceDataCopy() != null) sb.append("SourceDataCopy: " + getSourceDataCopy() + ",");
        if (getSourceDataTrimTitle() != null) sb.append("SourceDataTrimTitle: " + getSourceDataTrimTitle() + ",");
        if (getSourceDataMap() != null) sb.append("SourceDataMap: " + getSourceDataMap() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceDataFunction() == null) ? 0 : getSourceDataFunction().hashCode()); 
        hashCode = prime * hashCode + ((getSourceDataCopy() == null) ? 0 : getSourceDataCopy().hashCode()); 
        hashCode = prime * hashCode + ((getSourceDataTrimTitle() == null) ? 0 : getSourceDataTrimTitle().hashCode()); 
        hashCode = prime * hashCode + ((getSourceDataMap() == null) ? 0 : getSourceDataMap().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SourceAttribute == false) return false;
        SourceAttribute other = (SourceAttribute)obj;
        
        if (other.getSourceDataFunction() == null ^ this.getSourceDataFunction() == null) return false;
        if (other.getSourceDataFunction() != null && other.getSourceDataFunction().equals(this.getSourceDataFunction()) == false) return false; 
        if (other.getSourceDataCopy() == null ^ this.getSourceDataCopy() == null) return false;
        if (other.getSourceDataCopy() != null && other.getSourceDataCopy().equals(this.getSourceDataCopy()) == false) return false; 
        if (other.getSourceDataTrimTitle() == null ^ this.getSourceDataTrimTitle() == null) return false;
        if (other.getSourceDataTrimTitle() != null && other.getSourceDataTrimTitle().equals(this.getSourceDataTrimTitle()) == false) return false; 
        if (other.getSourceDataMap() == null ^ this.getSourceDataMap() == null) return false;
        if (other.getSourceDataMap() != null && other.getSourceDataMap().equals(this.getSourceDataMap()) == false) return false; 
        return true;
    }
    
}
    