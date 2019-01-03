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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Configuration information for a field in the index, including its name, type, and options. The supported options
 * depend on the <code><a>IndexFieldType</a></code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IndexField implements Serializable, Cloneable {

    /**
     * <p>
     * A string that represents the name of an index field. CloudSearch supports regular index fields as well as dynamic
     * fields. A dynamic field's name defines a pattern that begins or ends with a wildcard. Any document fields that
     * don't map to a regular index field but do match a dynamic field's pattern are configured with the dynamic field's
     * indexing options.
     * </p>
     * <p>
     * Regular field names begin with a letter and can contain the following characters: a-z (lowercase), 0-9, and _
     * (underscore). Dynamic field names must begin or end with a wildcard (*). The wildcard can also be the only
     * character in a dynamic field name. Multiple wildcards, and wildcards embedded within a string are not supported.
     * </p>
     * <p>
     * The name <code>score</code> is reserved and cannot be used as a field name. To reference a document's ID, you can
     * use the name <code>_id</code>.
     * </p>
     */
    private String indexFieldName;

    private String indexFieldType;

    private IntOptions intOptions;

    private DoubleOptions doubleOptions;

    private LiteralOptions literalOptions;

    private TextOptions textOptions;

    private DateOptions dateOptions;

    private LatLonOptions latLonOptions;

    private IntArrayOptions intArrayOptions;

    private DoubleArrayOptions doubleArrayOptions;

    private LiteralArrayOptions literalArrayOptions;

    private TextArrayOptions textArrayOptions;

    private DateArrayOptions dateArrayOptions;

    /**
     * <p>
     * A string that represents the name of an index field. CloudSearch supports regular index fields as well as dynamic
     * fields. A dynamic field's name defines a pattern that begins or ends with a wildcard. Any document fields that
     * don't map to a regular index field but do match a dynamic field's pattern are configured with the dynamic field's
     * indexing options.
     * </p>
     * <p>
     * Regular field names begin with a letter and can contain the following characters: a-z (lowercase), 0-9, and _
     * (underscore). Dynamic field names must begin or end with a wildcard (*). The wildcard can also be the only
     * character in a dynamic field name. Multiple wildcards, and wildcards embedded within a string are not supported.
     * </p>
     * <p>
     * The name <code>score</code> is reserved and cannot be used as a field name. To reference a document's ID, you can
     * use the name <code>_id</code>.
     * </p>
     * 
     * @param indexFieldName
     *        A string that represents the name of an index field. CloudSearch supports regular index fields as well as
     *        dynamic fields. A dynamic field's name defines a pattern that begins or ends with a wildcard. Any document
     *        fields that don't map to a regular index field but do match a dynamic field's pattern are configured with
     *        the dynamic field's indexing options. </p>
     *        <p>
     *        Regular field names begin with a letter and can contain the following characters: a-z (lowercase), 0-9,
     *        and _ (underscore). Dynamic field names must begin or end with a wildcard (*). The wildcard can also be
     *        the only character in a dynamic field name. Multiple wildcards, and wildcards embedded within a string are
     *        not supported.
     *        </p>
     *        <p>
     *        The name <code>score</code> is reserved and cannot be used as a field name. To reference a document's ID,
     *        you can use the name <code>_id</code>.
     */

    public void setIndexFieldName(String indexFieldName) {
        this.indexFieldName = indexFieldName;
    }

    /**
     * <p>
     * A string that represents the name of an index field. CloudSearch supports regular index fields as well as dynamic
     * fields. A dynamic field's name defines a pattern that begins or ends with a wildcard. Any document fields that
     * don't map to a regular index field but do match a dynamic field's pattern are configured with the dynamic field's
     * indexing options.
     * </p>
     * <p>
     * Regular field names begin with a letter and can contain the following characters: a-z (lowercase), 0-9, and _
     * (underscore). Dynamic field names must begin or end with a wildcard (*). The wildcard can also be the only
     * character in a dynamic field name. Multiple wildcards, and wildcards embedded within a string are not supported.
     * </p>
     * <p>
     * The name <code>score</code> is reserved and cannot be used as a field name. To reference a document's ID, you can
     * use the name <code>_id</code>.
     * </p>
     * 
     * @return A string that represents the name of an index field. CloudSearch supports regular index fields as well as
     *         dynamic fields. A dynamic field's name defines a pattern that begins or ends with a wildcard. Any
     *         document fields that don't map to a regular index field but do match a dynamic field's pattern are
     *         configured with the dynamic field's indexing options. </p>
     *         <p>
     *         Regular field names begin with a letter and can contain the following characters: a-z (lowercase), 0-9,
     *         and _ (underscore). Dynamic field names must begin or end with a wildcard (*). The wildcard can also be
     *         the only character in a dynamic field name. Multiple wildcards, and wildcards embedded within a string
     *         are not supported.
     *         </p>
     *         <p>
     *         The name <code>score</code> is reserved and cannot be used as a field name. To reference a document's ID,
     *         you can use the name <code>_id</code>.
     */

    public String getIndexFieldName() {
        return this.indexFieldName;
    }

    /**
     * <p>
     * A string that represents the name of an index field. CloudSearch supports regular index fields as well as dynamic
     * fields. A dynamic field's name defines a pattern that begins or ends with a wildcard. Any document fields that
     * don't map to a regular index field but do match a dynamic field's pattern are configured with the dynamic field's
     * indexing options.
     * </p>
     * <p>
     * Regular field names begin with a letter and can contain the following characters: a-z (lowercase), 0-9, and _
     * (underscore). Dynamic field names must begin or end with a wildcard (*). The wildcard can also be the only
     * character in a dynamic field name. Multiple wildcards, and wildcards embedded within a string are not supported.
     * </p>
     * <p>
     * The name <code>score</code> is reserved and cannot be used as a field name. To reference a document's ID, you can
     * use the name <code>_id</code>.
     * </p>
     * 
     * @param indexFieldName
     *        A string that represents the name of an index field. CloudSearch supports regular index fields as well as
     *        dynamic fields. A dynamic field's name defines a pattern that begins or ends with a wildcard. Any document
     *        fields that don't map to a regular index field but do match a dynamic field's pattern are configured with
     *        the dynamic field's indexing options. </p>
     *        <p>
     *        Regular field names begin with a letter and can contain the following characters: a-z (lowercase), 0-9,
     *        and _ (underscore). Dynamic field names must begin or end with a wildcard (*). The wildcard can also be
     *        the only character in a dynamic field name. Multiple wildcards, and wildcards embedded within a string are
     *        not supported.
     *        </p>
     *        <p>
     *        The name <code>score</code> is reserved and cannot be used as a field name. To reference a document's ID,
     *        you can use the name <code>_id</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexField withIndexFieldName(String indexFieldName) {
        setIndexFieldName(indexFieldName);
        return this;
    }

    /**
     * @param indexFieldType
     * @see IndexFieldType
     */

    public void setIndexFieldType(String indexFieldType) {
        this.indexFieldType = indexFieldType;
    }

    /**
     * @return
     * @see IndexFieldType
     */

    public String getIndexFieldType() {
        return this.indexFieldType;
    }

    /**
     * @param indexFieldType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexFieldType
     */

    public IndexField withIndexFieldType(String indexFieldType) {
        setIndexFieldType(indexFieldType);
        return this;
    }

    /**
     * @param indexFieldType
     * @see IndexFieldType
     */

    public void setIndexFieldType(IndexFieldType indexFieldType) {
        withIndexFieldType(indexFieldType);
    }

    /**
     * @param indexFieldType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexFieldType
     */

    public IndexField withIndexFieldType(IndexFieldType indexFieldType) {
        this.indexFieldType = indexFieldType.toString();
        return this;
    }

    /**
     * @param intOptions
     */

    public void setIntOptions(IntOptions intOptions) {
        this.intOptions = intOptions;
    }

    /**
     * @return
     */

    public IntOptions getIntOptions() {
        return this.intOptions;
    }

    /**
     * @param intOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexField withIntOptions(IntOptions intOptions) {
        setIntOptions(intOptions);
        return this;
    }

    /**
     * @param doubleOptions
     */

    public void setDoubleOptions(DoubleOptions doubleOptions) {
        this.doubleOptions = doubleOptions;
    }

    /**
     * @return
     */

    public DoubleOptions getDoubleOptions() {
        return this.doubleOptions;
    }

    /**
     * @param doubleOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexField withDoubleOptions(DoubleOptions doubleOptions) {
        setDoubleOptions(doubleOptions);
        return this;
    }

    /**
     * @param literalOptions
     */

    public void setLiteralOptions(LiteralOptions literalOptions) {
        this.literalOptions = literalOptions;
    }

    /**
     * @return
     */

    public LiteralOptions getLiteralOptions() {
        return this.literalOptions;
    }

    /**
     * @param literalOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexField withLiteralOptions(LiteralOptions literalOptions) {
        setLiteralOptions(literalOptions);
        return this;
    }

    /**
     * @param textOptions
     */

    public void setTextOptions(TextOptions textOptions) {
        this.textOptions = textOptions;
    }

    /**
     * @return
     */

    public TextOptions getTextOptions() {
        return this.textOptions;
    }

    /**
     * @param textOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexField withTextOptions(TextOptions textOptions) {
        setTextOptions(textOptions);
        return this;
    }

    /**
     * @param dateOptions
     */

    public void setDateOptions(DateOptions dateOptions) {
        this.dateOptions = dateOptions;
    }

    /**
     * @return
     */

    public DateOptions getDateOptions() {
        return this.dateOptions;
    }

    /**
     * @param dateOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexField withDateOptions(DateOptions dateOptions) {
        setDateOptions(dateOptions);
        return this;
    }

    /**
     * @param latLonOptions
     */

    public void setLatLonOptions(LatLonOptions latLonOptions) {
        this.latLonOptions = latLonOptions;
    }

    /**
     * @return
     */

    public LatLonOptions getLatLonOptions() {
        return this.latLonOptions;
    }

    /**
     * @param latLonOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexField withLatLonOptions(LatLonOptions latLonOptions) {
        setLatLonOptions(latLonOptions);
        return this;
    }

    /**
     * @param intArrayOptions
     */

    public void setIntArrayOptions(IntArrayOptions intArrayOptions) {
        this.intArrayOptions = intArrayOptions;
    }

    /**
     * @return
     */

    public IntArrayOptions getIntArrayOptions() {
        return this.intArrayOptions;
    }

    /**
     * @param intArrayOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexField withIntArrayOptions(IntArrayOptions intArrayOptions) {
        setIntArrayOptions(intArrayOptions);
        return this;
    }

    /**
     * @param doubleArrayOptions
     */

    public void setDoubleArrayOptions(DoubleArrayOptions doubleArrayOptions) {
        this.doubleArrayOptions = doubleArrayOptions;
    }

    /**
     * @return
     */

    public DoubleArrayOptions getDoubleArrayOptions() {
        return this.doubleArrayOptions;
    }

    /**
     * @param doubleArrayOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexField withDoubleArrayOptions(DoubleArrayOptions doubleArrayOptions) {
        setDoubleArrayOptions(doubleArrayOptions);
        return this;
    }

    /**
     * @param literalArrayOptions
     */

    public void setLiteralArrayOptions(LiteralArrayOptions literalArrayOptions) {
        this.literalArrayOptions = literalArrayOptions;
    }

    /**
     * @return
     */

    public LiteralArrayOptions getLiteralArrayOptions() {
        return this.literalArrayOptions;
    }

    /**
     * @param literalArrayOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexField withLiteralArrayOptions(LiteralArrayOptions literalArrayOptions) {
        setLiteralArrayOptions(literalArrayOptions);
        return this;
    }

    /**
     * @param textArrayOptions
     */

    public void setTextArrayOptions(TextArrayOptions textArrayOptions) {
        this.textArrayOptions = textArrayOptions;
    }

    /**
     * @return
     */

    public TextArrayOptions getTextArrayOptions() {
        return this.textArrayOptions;
    }

    /**
     * @param textArrayOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexField withTextArrayOptions(TextArrayOptions textArrayOptions) {
        setTextArrayOptions(textArrayOptions);
        return this;
    }

    /**
     * @param dateArrayOptions
     */

    public void setDateArrayOptions(DateArrayOptions dateArrayOptions) {
        this.dateArrayOptions = dateArrayOptions;
    }

    /**
     * @return
     */

    public DateArrayOptions getDateArrayOptions() {
        return this.dateArrayOptions;
    }

    /**
     * @param dateArrayOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexField withDateArrayOptions(DateArrayOptions dateArrayOptions) {
        setDateArrayOptions(dateArrayOptions);
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
        if (getIndexFieldName() != null)
            sb.append("IndexFieldName: ").append(getIndexFieldName()).append(",");
        if (getIndexFieldType() != null)
            sb.append("IndexFieldType: ").append(getIndexFieldType()).append(",");
        if (getIntOptions() != null)
            sb.append("IntOptions: ").append(getIntOptions()).append(",");
        if (getDoubleOptions() != null)
            sb.append("DoubleOptions: ").append(getDoubleOptions()).append(",");
        if (getLiteralOptions() != null)
            sb.append("LiteralOptions: ").append(getLiteralOptions()).append(",");
        if (getTextOptions() != null)
            sb.append("TextOptions: ").append(getTextOptions()).append(",");
        if (getDateOptions() != null)
            sb.append("DateOptions: ").append(getDateOptions()).append(",");
        if (getLatLonOptions() != null)
            sb.append("LatLonOptions: ").append(getLatLonOptions()).append(",");
        if (getIntArrayOptions() != null)
            sb.append("IntArrayOptions: ").append(getIntArrayOptions()).append(",");
        if (getDoubleArrayOptions() != null)
            sb.append("DoubleArrayOptions: ").append(getDoubleArrayOptions()).append(",");
        if (getLiteralArrayOptions() != null)
            sb.append("LiteralArrayOptions: ").append(getLiteralArrayOptions()).append(",");
        if (getTextArrayOptions() != null)
            sb.append("TextArrayOptions: ").append(getTextArrayOptions()).append(",");
        if (getDateArrayOptions() != null)
            sb.append("DateArrayOptions: ").append(getDateArrayOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IndexField == false)
            return false;
        IndexField other = (IndexField) obj;
        if (other.getIndexFieldName() == null ^ this.getIndexFieldName() == null)
            return false;
        if (other.getIndexFieldName() != null && other.getIndexFieldName().equals(this.getIndexFieldName()) == false)
            return false;
        if (other.getIndexFieldType() == null ^ this.getIndexFieldType() == null)
            return false;
        if (other.getIndexFieldType() != null && other.getIndexFieldType().equals(this.getIndexFieldType()) == false)
            return false;
        if (other.getIntOptions() == null ^ this.getIntOptions() == null)
            return false;
        if (other.getIntOptions() != null && other.getIntOptions().equals(this.getIntOptions()) == false)
            return false;
        if (other.getDoubleOptions() == null ^ this.getDoubleOptions() == null)
            return false;
        if (other.getDoubleOptions() != null && other.getDoubleOptions().equals(this.getDoubleOptions()) == false)
            return false;
        if (other.getLiteralOptions() == null ^ this.getLiteralOptions() == null)
            return false;
        if (other.getLiteralOptions() != null && other.getLiteralOptions().equals(this.getLiteralOptions()) == false)
            return false;
        if (other.getTextOptions() == null ^ this.getTextOptions() == null)
            return false;
        if (other.getTextOptions() != null && other.getTextOptions().equals(this.getTextOptions()) == false)
            return false;
        if (other.getDateOptions() == null ^ this.getDateOptions() == null)
            return false;
        if (other.getDateOptions() != null && other.getDateOptions().equals(this.getDateOptions()) == false)
            return false;
        if (other.getLatLonOptions() == null ^ this.getLatLonOptions() == null)
            return false;
        if (other.getLatLonOptions() != null && other.getLatLonOptions().equals(this.getLatLonOptions()) == false)
            return false;
        if (other.getIntArrayOptions() == null ^ this.getIntArrayOptions() == null)
            return false;
        if (other.getIntArrayOptions() != null && other.getIntArrayOptions().equals(this.getIntArrayOptions()) == false)
            return false;
        if (other.getDoubleArrayOptions() == null ^ this.getDoubleArrayOptions() == null)
            return false;
        if (other.getDoubleArrayOptions() != null && other.getDoubleArrayOptions().equals(this.getDoubleArrayOptions()) == false)
            return false;
        if (other.getLiteralArrayOptions() == null ^ this.getLiteralArrayOptions() == null)
            return false;
        if (other.getLiteralArrayOptions() != null && other.getLiteralArrayOptions().equals(this.getLiteralArrayOptions()) == false)
            return false;
        if (other.getTextArrayOptions() == null ^ this.getTextArrayOptions() == null)
            return false;
        if (other.getTextArrayOptions() != null && other.getTextArrayOptions().equals(this.getTextArrayOptions()) == false)
            return false;
        if (other.getDateArrayOptions() == null ^ this.getDateArrayOptions() == null)
            return false;
        if (other.getDateArrayOptions() != null && other.getDateArrayOptions().equals(this.getDateArrayOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexFieldName() == null) ? 0 : getIndexFieldName().hashCode());
        hashCode = prime * hashCode + ((getIndexFieldType() == null) ? 0 : getIndexFieldType().hashCode());
        hashCode = prime * hashCode + ((getIntOptions() == null) ? 0 : getIntOptions().hashCode());
        hashCode = prime * hashCode + ((getDoubleOptions() == null) ? 0 : getDoubleOptions().hashCode());
        hashCode = prime * hashCode + ((getLiteralOptions() == null) ? 0 : getLiteralOptions().hashCode());
        hashCode = prime * hashCode + ((getTextOptions() == null) ? 0 : getTextOptions().hashCode());
        hashCode = prime * hashCode + ((getDateOptions() == null) ? 0 : getDateOptions().hashCode());
        hashCode = prime * hashCode + ((getLatLonOptions() == null) ? 0 : getLatLonOptions().hashCode());
        hashCode = prime * hashCode + ((getIntArrayOptions() == null) ? 0 : getIntArrayOptions().hashCode());
        hashCode = prime * hashCode + ((getDoubleArrayOptions() == null) ? 0 : getDoubleArrayOptions().hashCode());
        hashCode = prime * hashCode + ((getLiteralArrayOptions() == null) ? 0 : getLiteralArrayOptions().hashCode());
        hashCode = prime * hashCode + ((getTextArrayOptions() == null) ? 0 : getTextArrayOptions().hashCode());
        hashCode = prime * hashCode + ((getDateArrayOptions() == null) ? 0 : getDateArrayOptions().hashCode());
        return hashCode;
    }

    @Override
    public IndexField clone() {
        try {
            return (IndexField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
