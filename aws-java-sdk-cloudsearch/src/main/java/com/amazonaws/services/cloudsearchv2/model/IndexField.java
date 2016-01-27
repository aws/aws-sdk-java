/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration information for a field in the index, including its
 * name, type, and options. The supported options depend on the <code>
 * IndexFieldType </code> .
 * </p>
 */
public class IndexField implements Serializable, Cloneable {

    /**
     * A string that represents the name of an index field. CloudSearch
     * supports regular index fields as well as dynamic fields. A dynamic
     * field's name defines a pattern that begins or ends with a wildcard.
     * Any document fields that don't map to a regular index field but do
     * match a dynamic field's pattern are configured with the dynamic
     * field's indexing options. <p>Regular field names begin with a letter
     * and can contain the following characters: a-z (lowercase), 0-9, and _
     * (underscore). Dynamic field names must begin or end with a wildcard
     * (*). The wildcard can also be the only character in a dynamic field
     * name. Multiple wildcards, and wildcards embedded within a string are
     * not supported. <p>The name <code>score</code> is reserved and cannot
     * be used as a field name. To reference a document's ID, you can use the
     * name <code>_id</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>([a-z][a-z0-9_]*\*?|\*[a-z0-9_]*)<br/>
     */
    private String indexFieldName;

    /**
     * The type of field. The valid options for a field depend on the field
     * type. For more information about the supported field types, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"
     * target="_blank">Configuring Index Fields</a> in the <i>Amazon
     * CloudSearch Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>int, double, literal, text, date, latlon, int-array, double-array, literal-array, text-array, date-array
     */
    private String indexFieldType;

    /**
     * Options for a 64-bit signed integer field. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>int</code>. All options are enabled by default.
     */
    private IntOptions intOptions;

    /**
     * Options for a double-precision 64-bit floating point field. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>double</code>. All options are enabled by default.
     */
    private DoubleOptions doubleOptions;

    /**
     * Options for literal field. Present if <code>IndexFieldType</code>
     * specifies the field is of type <code>literal</code>. All options are
     * enabled by default.
     */
    private LiteralOptions literalOptions;

    /**
     * Options for text field. Present if <code>IndexFieldType</code>
     * specifies the field is of type <code>text</code>. A <code>text</code>
     * field is always searchable. All options are enabled by default.
     */
    private TextOptions textOptions;

    /**
     * Options for a date field. Dates and times are specified in UTC
     * (Coordinated Universal Time) according to IETF RFC3339:
     * yyyy-mm-ddT00:00:00Z. Present if <code>IndexFieldType</code> specifies
     * the field is of type <code>date</code>. All options are enabled by
     * default.
     */
    private DateOptions dateOptions;

    /**
     * Options for a latlon field. A latlon field contains a location stored
     * as a latitude and longitude value pair. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>latlon</code>. All options are enabled by default.
     */
    private LatLonOptions latLonOptions;

    /**
     * Options for a field that contains an array of 64-bit signed integers.
     * Present if <code>IndexFieldType</code> specifies the field is of type
     * <code>int-array</code>. All options are enabled by default.
     */
    private IntArrayOptions intArrayOptions;

    /**
     * Options for a field that contains an array of double-precision 64-bit
     * floating point values. Present if <code>IndexFieldType</code>
     * specifies the field is of type <code>double-array</code>. All options
     * are enabled by default.
     */
    private DoubleArrayOptions doubleArrayOptions;

    /**
     * Options for a field that contains an array of literal strings. Present
     * if <code>IndexFieldType</code> specifies the field is of type
     * <code>literal-array</code>. All options are enabled by default.
     */
    private LiteralArrayOptions literalArrayOptions;

    /**
     * Options for a field that contains an array of text strings. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>text-array</code>. A <code>text-array</code> field is always
     * searchable. All options are enabled by default.
     */
    private TextArrayOptions textArrayOptions;

    /**
     * Options for a field that contains an array of dates. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>date-array</code>. All options are enabled by default.
     */
    private DateArrayOptions dateArrayOptions;

    /**
     * A string that represents the name of an index field. CloudSearch
     * supports regular index fields as well as dynamic fields. A dynamic
     * field's name defines a pattern that begins or ends with a wildcard.
     * Any document fields that don't map to a regular index field but do
     * match a dynamic field's pattern are configured with the dynamic
     * field's indexing options. <p>Regular field names begin with a letter
     * and can contain the following characters: a-z (lowercase), 0-9, and _
     * (underscore). Dynamic field names must begin or end with a wildcard
     * (*). The wildcard can also be the only character in a dynamic field
     * name. Multiple wildcards, and wildcards embedded within a string are
     * not supported. <p>The name <code>score</code> is reserved and cannot
     * be used as a field name. To reference a document's ID, you can use the
     * name <code>_id</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>([a-z][a-z0-9_]*\*?|\*[a-z0-9_]*)<br/>
     *
     * @return A string that represents the name of an index field. CloudSearch
     *         supports regular index fields as well as dynamic fields. A dynamic
     *         field's name defines a pattern that begins or ends with a wildcard.
     *         Any document fields that don't map to a regular index field but do
     *         match a dynamic field's pattern are configured with the dynamic
     *         field's indexing options. <p>Regular field names begin with a letter
     *         and can contain the following characters: a-z (lowercase), 0-9, and _
     *         (underscore). Dynamic field names must begin or end with a wildcard
     *         (*). The wildcard can also be the only character in a dynamic field
     *         name. Multiple wildcards, and wildcards embedded within a string are
     *         not supported. <p>The name <code>score</code> is reserved and cannot
     *         be used as a field name. To reference a document's ID, you can use the
     *         name <code>_id</code>.
     */
    public String getIndexFieldName() {
        return indexFieldName;
    }
    
    /**
     * A string that represents the name of an index field. CloudSearch
     * supports regular index fields as well as dynamic fields. A dynamic
     * field's name defines a pattern that begins or ends with a wildcard.
     * Any document fields that don't map to a regular index field but do
     * match a dynamic field's pattern are configured with the dynamic
     * field's indexing options. <p>Regular field names begin with a letter
     * and can contain the following characters: a-z (lowercase), 0-9, and _
     * (underscore). Dynamic field names must begin or end with a wildcard
     * (*). The wildcard can also be the only character in a dynamic field
     * name. Multiple wildcards, and wildcards embedded within a string are
     * not supported. <p>The name <code>score</code> is reserved and cannot
     * be used as a field name. To reference a document's ID, you can use the
     * name <code>_id</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>([a-z][a-z0-9_]*\*?|\*[a-z0-9_]*)<br/>
     *
     * @param indexFieldName A string that represents the name of an index field. CloudSearch
     *         supports regular index fields as well as dynamic fields. A dynamic
     *         field's name defines a pattern that begins or ends with a wildcard.
     *         Any document fields that don't map to a regular index field but do
     *         match a dynamic field's pattern are configured with the dynamic
     *         field's indexing options. <p>Regular field names begin with a letter
     *         and can contain the following characters: a-z (lowercase), 0-9, and _
     *         (underscore). Dynamic field names must begin or end with a wildcard
     *         (*). The wildcard can also be the only character in a dynamic field
     *         name. Multiple wildcards, and wildcards embedded within a string are
     *         not supported. <p>The name <code>score</code> is reserved and cannot
     *         be used as a field name. To reference a document's ID, you can use the
     *         name <code>_id</code>.
     */
    public void setIndexFieldName(String indexFieldName) {
        this.indexFieldName = indexFieldName;
    }
    
    /**
     * A string that represents the name of an index field. CloudSearch
     * supports regular index fields as well as dynamic fields. A dynamic
     * field's name defines a pattern that begins or ends with a wildcard.
     * Any document fields that don't map to a regular index field but do
     * match a dynamic field's pattern are configured with the dynamic
     * field's indexing options. <p>Regular field names begin with a letter
     * and can contain the following characters: a-z (lowercase), 0-9, and _
     * (underscore). Dynamic field names must begin or end with a wildcard
     * (*). The wildcard can also be the only character in a dynamic field
     * name. Multiple wildcards, and wildcards embedded within a string are
     * not supported. <p>The name <code>score</code> is reserved and cannot
     * be used as a field name. To reference a document's ID, you can use the
     * name <code>_id</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>([a-z][a-z0-9_]*\*?|\*[a-z0-9_]*)<br/>
     *
     * @param indexFieldName A string that represents the name of an index field. CloudSearch
     *         supports regular index fields as well as dynamic fields. A dynamic
     *         field's name defines a pattern that begins or ends with a wildcard.
     *         Any document fields that don't map to a regular index field but do
     *         match a dynamic field's pattern are configured with the dynamic
     *         field's indexing options. <p>Regular field names begin with a letter
     *         and can contain the following characters: a-z (lowercase), 0-9, and _
     *         (underscore). Dynamic field names must begin or end with a wildcard
     *         (*). The wildcard can also be the only character in a dynamic field
     *         name. Multiple wildcards, and wildcards embedded within a string are
     *         not supported. <p>The name <code>score</code> is reserved and cannot
     *         be used as a field name. To reference a document's ID, you can use the
     *         name <code>_id</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IndexField withIndexFieldName(String indexFieldName) {
        this.indexFieldName = indexFieldName;
        return this;
    }

    /**
     * The type of field. The valid options for a field depend on the field
     * type. For more information about the supported field types, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"
     * target="_blank">Configuring Index Fields</a> in the <i>Amazon
     * CloudSearch Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>int, double, literal, text, date, latlon, int-array, double-array, literal-array, text-array, date-array
     *
     * @return The type of field. The valid options for a field depend on the field
     *         type. For more information about the supported field types, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"
     *         target="_blank">Configuring Index Fields</a> in the <i>Amazon
     *         CloudSearch Developer Guide</i>.
     *
     * @see IndexFieldType
     */
    public String getIndexFieldType() {
        return indexFieldType;
    }
    
    /**
     * The type of field. The valid options for a field depend on the field
     * type. For more information about the supported field types, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"
     * target="_blank">Configuring Index Fields</a> in the <i>Amazon
     * CloudSearch Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>int, double, literal, text, date, latlon, int-array, double-array, literal-array, text-array, date-array
     *
     * @param indexFieldType The type of field. The valid options for a field depend on the field
     *         type. For more information about the supported field types, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"
     *         target="_blank">Configuring Index Fields</a> in the <i>Amazon
     *         CloudSearch Developer Guide</i>.
     *
     * @see IndexFieldType
     */
    public void setIndexFieldType(String indexFieldType) {
        this.indexFieldType = indexFieldType;
    }
    
    /**
     * The type of field. The valid options for a field depend on the field
     * type. For more information about the supported field types, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"
     * target="_blank">Configuring Index Fields</a> in the <i>Amazon
     * CloudSearch Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>int, double, literal, text, date, latlon, int-array, double-array, literal-array, text-array, date-array
     *
     * @param indexFieldType The type of field. The valid options for a field depend on the field
     *         type. For more information about the supported field types, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"
     *         target="_blank">Configuring Index Fields</a> in the <i>Amazon
     *         CloudSearch Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see IndexFieldType
     */
    public IndexField withIndexFieldType(String indexFieldType) {
        this.indexFieldType = indexFieldType;
        return this;
    }

    /**
     * The type of field. The valid options for a field depend on the field
     * type. For more information about the supported field types, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"
     * target="_blank">Configuring Index Fields</a> in the <i>Amazon
     * CloudSearch Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>int, double, literal, text, date, latlon, int-array, double-array, literal-array, text-array, date-array
     *
     * @param indexFieldType The type of field. The valid options for a field depend on the field
     *         type. For more information about the supported field types, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"
     *         target="_blank">Configuring Index Fields</a> in the <i>Amazon
     *         CloudSearch Developer Guide</i>.
     *
     * @see IndexFieldType
     */
    public void setIndexFieldType(IndexFieldType indexFieldType) {
        this.indexFieldType = indexFieldType.toString();
    }
    
    /**
     * The type of field. The valid options for a field depend on the field
     * type. For more information about the supported field types, see <a
     * href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"
     * target="_blank">Configuring Index Fields</a> in the <i>Amazon
     * CloudSearch Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>int, double, literal, text, date, latlon, int-array, double-array, literal-array, text-array, date-array
     *
     * @param indexFieldType The type of field. The valid options for a field depend on the field
     *         type. For more information about the supported field types, see <a
     *         href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"
     *         target="_blank">Configuring Index Fields</a> in the <i>Amazon
     *         CloudSearch Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see IndexFieldType
     */
    public IndexField withIndexFieldType(IndexFieldType indexFieldType) {
        this.indexFieldType = indexFieldType.toString();
        return this;
    }

    /**
     * Options for a 64-bit signed integer field. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>int</code>. All options are enabled by default.
     *
     * @return Options for a 64-bit signed integer field. Present if
     *         <code>IndexFieldType</code> specifies the field is of type
     *         <code>int</code>. All options are enabled by default.
     */
    public IntOptions getIntOptions() {
        return intOptions;
    }
    
    /**
     * Options for a 64-bit signed integer field. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>int</code>. All options are enabled by default.
     *
     * @param intOptions Options for a 64-bit signed integer field. Present if
     *         <code>IndexFieldType</code> specifies the field is of type
     *         <code>int</code>. All options are enabled by default.
     */
    public void setIntOptions(IntOptions intOptions) {
        this.intOptions = intOptions;
    }
    
    /**
     * Options for a 64-bit signed integer field. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>int</code>. All options are enabled by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param intOptions Options for a 64-bit signed integer field. Present if
     *         <code>IndexFieldType</code> specifies the field is of type
     *         <code>int</code>. All options are enabled by default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IndexField withIntOptions(IntOptions intOptions) {
        this.intOptions = intOptions;
        return this;
    }

    /**
     * Options for a double-precision 64-bit floating point field. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>double</code>. All options are enabled by default.
     *
     * @return Options for a double-precision 64-bit floating point field. Present if
     *         <code>IndexFieldType</code> specifies the field is of type
     *         <code>double</code>. All options are enabled by default.
     */
    public DoubleOptions getDoubleOptions() {
        return doubleOptions;
    }
    
    /**
     * Options for a double-precision 64-bit floating point field. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>double</code>. All options are enabled by default.
     *
     * @param doubleOptions Options for a double-precision 64-bit floating point field. Present if
     *         <code>IndexFieldType</code> specifies the field is of type
     *         <code>double</code>. All options are enabled by default.
     */
    public void setDoubleOptions(DoubleOptions doubleOptions) {
        this.doubleOptions = doubleOptions;
    }
    
    /**
     * Options for a double-precision 64-bit floating point field. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>double</code>. All options are enabled by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param doubleOptions Options for a double-precision 64-bit floating point field. Present if
     *         <code>IndexFieldType</code> specifies the field is of type
     *         <code>double</code>. All options are enabled by default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IndexField withDoubleOptions(DoubleOptions doubleOptions) {
        this.doubleOptions = doubleOptions;
        return this;
    }

    /**
     * Options for literal field. Present if <code>IndexFieldType</code>
     * specifies the field is of type <code>literal</code>. All options are
     * enabled by default.
     *
     * @return Options for literal field. Present if <code>IndexFieldType</code>
     *         specifies the field is of type <code>literal</code>. All options are
     *         enabled by default.
     */
    public LiteralOptions getLiteralOptions() {
        return literalOptions;
    }
    
    /**
     * Options for literal field. Present if <code>IndexFieldType</code>
     * specifies the field is of type <code>literal</code>. All options are
     * enabled by default.
     *
     * @param literalOptions Options for literal field. Present if <code>IndexFieldType</code>
     *         specifies the field is of type <code>literal</code>. All options are
     *         enabled by default.
     */
    public void setLiteralOptions(LiteralOptions literalOptions) {
        this.literalOptions = literalOptions;
    }
    
    /**
     * Options for literal field. Present if <code>IndexFieldType</code>
     * specifies the field is of type <code>literal</code>. All options are
     * enabled by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param literalOptions Options for literal field. Present if <code>IndexFieldType</code>
     *         specifies the field is of type <code>literal</code>. All options are
     *         enabled by default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IndexField withLiteralOptions(LiteralOptions literalOptions) {
        this.literalOptions = literalOptions;
        return this;
    }

    /**
     * Options for text field. Present if <code>IndexFieldType</code>
     * specifies the field is of type <code>text</code>. A <code>text</code>
     * field is always searchable. All options are enabled by default.
     *
     * @return Options for text field. Present if <code>IndexFieldType</code>
     *         specifies the field is of type <code>text</code>. A <code>text</code>
     *         field is always searchable. All options are enabled by default.
     */
    public TextOptions getTextOptions() {
        return textOptions;
    }
    
    /**
     * Options for text field. Present if <code>IndexFieldType</code>
     * specifies the field is of type <code>text</code>. A <code>text</code>
     * field is always searchable. All options are enabled by default.
     *
     * @param textOptions Options for text field. Present if <code>IndexFieldType</code>
     *         specifies the field is of type <code>text</code>. A <code>text</code>
     *         field is always searchable. All options are enabled by default.
     */
    public void setTextOptions(TextOptions textOptions) {
        this.textOptions = textOptions;
    }
    
    /**
     * Options for text field. Present if <code>IndexFieldType</code>
     * specifies the field is of type <code>text</code>. A <code>text</code>
     * field is always searchable. All options are enabled by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param textOptions Options for text field. Present if <code>IndexFieldType</code>
     *         specifies the field is of type <code>text</code>. A <code>text</code>
     *         field is always searchable. All options are enabled by default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IndexField withTextOptions(TextOptions textOptions) {
        this.textOptions = textOptions;
        return this;
    }

    /**
     * Options for a date field. Dates and times are specified in UTC
     * (Coordinated Universal Time) according to IETF RFC3339:
     * yyyy-mm-ddT00:00:00Z. Present if <code>IndexFieldType</code> specifies
     * the field is of type <code>date</code>. All options are enabled by
     * default.
     *
     * @return Options for a date field. Dates and times are specified in UTC
     *         (Coordinated Universal Time) according to IETF RFC3339:
     *         yyyy-mm-ddT00:00:00Z. Present if <code>IndexFieldType</code> specifies
     *         the field is of type <code>date</code>. All options are enabled by
     *         default.
     */
    public DateOptions getDateOptions() {
        return dateOptions;
    }
    
    /**
     * Options for a date field. Dates and times are specified in UTC
     * (Coordinated Universal Time) according to IETF RFC3339:
     * yyyy-mm-ddT00:00:00Z. Present if <code>IndexFieldType</code> specifies
     * the field is of type <code>date</code>. All options are enabled by
     * default.
     *
     * @param dateOptions Options for a date field. Dates and times are specified in UTC
     *         (Coordinated Universal Time) according to IETF RFC3339:
     *         yyyy-mm-ddT00:00:00Z. Present if <code>IndexFieldType</code> specifies
     *         the field is of type <code>date</code>. All options are enabled by
     *         default.
     */
    public void setDateOptions(DateOptions dateOptions) {
        this.dateOptions = dateOptions;
    }
    
    /**
     * Options for a date field. Dates and times are specified in UTC
     * (Coordinated Universal Time) according to IETF RFC3339:
     * yyyy-mm-ddT00:00:00Z. Present if <code>IndexFieldType</code> specifies
     * the field is of type <code>date</code>. All options are enabled by
     * default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dateOptions Options for a date field. Dates and times are specified in UTC
     *         (Coordinated Universal Time) according to IETF RFC3339:
     *         yyyy-mm-ddT00:00:00Z. Present if <code>IndexFieldType</code> specifies
     *         the field is of type <code>date</code>. All options are enabled by
     *         default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IndexField withDateOptions(DateOptions dateOptions) {
        this.dateOptions = dateOptions;
        return this;
    }

    /**
     * Options for a latlon field. A latlon field contains a location stored
     * as a latitude and longitude value pair. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>latlon</code>. All options are enabled by default.
     *
     * @return Options for a latlon field. A latlon field contains a location stored
     *         as a latitude and longitude value pair. Present if
     *         <code>IndexFieldType</code> specifies the field is of type
     *         <code>latlon</code>. All options are enabled by default.
     */
    public LatLonOptions getLatLonOptions() {
        return latLonOptions;
    }
    
    /**
     * Options for a latlon field. A latlon field contains a location stored
     * as a latitude and longitude value pair. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>latlon</code>. All options are enabled by default.
     *
     * @param latLonOptions Options for a latlon field. A latlon field contains a location stored
     *         as a latitude and longitude value pair. Present if
     *         <code>IndexFieldType</code> specifies the field is of type
     *         <code>latlon</code>. All options are enabled by default.
     */
    public void setLatLonOptions(LatLonOptions latLonOptions) {
        this.latLonOptions = latLonOptions;
    }
    
    /**
     * Options for a latlon field. A latlon field contains a location stored
     * as a latitude and longitude value pair. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>latlon</code>. All options are enabled by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latLonOptions Options for a latlon field. A latlon field contains a location stored
     *         as a latitude and longitude value pair. Present if
     *         <code>IndexFieldType</code> specifies the field is of type
     *         <code>latlon</code>. All options are enabled by default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IndexField withLatLonOptions(LatLonOptions latLonOptions) {
        this.latLonOptions = latLonOptions;
        return this;
    }

    /**
     * Options for a field that contains an array of 64-bit signed integers.
     * Present if <code>IndexFieldType</code> specifies the field is of type
     * <code>int-array</code>. All options are enabled by default.
     *
     * @return Options for a field that contains an array of 64-bit signed integers.
     *         Present if <code>IndexFieldType</code> specifies the field is of type
     *         <code>int-array</code>. All options are enabled by default.
     */
    public IntArrayOptions getIntArrayOptions() {
        return intArrayOptions;
    }
    
    /**
     * Options for a field that contains an array of 64-bit signed integers.
     * Present if <code>IndexFieldType</code> specifies the field is of type
     * <code>int-array</code>. All options are enabled by default.
     *
     * @param intArrayOptions Options for a field that contains an array of 64-bit signed integers.
     *         Present if <code>IndexFieldType</code> specifies the field is of type
     *         <code>int-array</code>. All options are enabled by default.
     */
    public void setIntArrayOptions(IntArrayOptions intArrayOptions) {
        this.intArrayOptions = intArrayOptions;
    }
    
    /**
     * Options for a field that contains an array of 64-bit signed integers.
     * Present if <code>IndexFieldType</code> specifies the field is of type
     * <code>int-array</code>. All options are enabled by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param intArrayOptions Options for a field that contains an array of 64-bit signed integers.
     *         Present if <code>IndexFieldType</code> specifies the field is of type
     *         <code>int-array</code>. All options are enabled by default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IndexField withIntArrayOptions(IntArrayOptions intArrayOptions) {
        this.intArrayOptions = intArrayOptions;
        return this;
    }

    /**
     * Options for a field that contains an array of double-precision 64-bit
     * floating point values. Present if <code>IndexFieldType</code>
     * specifies the field is of type <code>double-array</code>. All options
     * are enabled by default.
     *
     * @return Options for a field that contains an array of double-precision 64-bit
     *         floating point values. Present if <code>IndexFieldType</code>
     *         specifies the field is of type <code>double-array</code>. All options
     *         are enabled by default.
     */
    public DoubleArrayOptions getDoubleArrayOptions() {
        return doubleArrayOptions;
    }
    
    /**
     * Options for a field that contains an array of double-precision 64-bit
     * floating point values. Present if <code>IndexFieldType</code>
     * specifies the field is of type <code>double-array</code>. All options
     * are enabled by default.
     *
     * @param doubleArrayOptions Options for a field that contains an array of double-precision 64-bit
     *         floating point values. Present if <code>IndexFieldType</code>
     *         specifies the field is of type <code>double-array</code>. All options
     *         are enabled by default.
     */
    public void setDoubleArrayOptions(DoubleArrayOptions doubleArrayOptions) {
        this.doubleArrayOptions = doubleArrayOptions;
    }
    
    /**
     * Options for a field that contains an array of double-precision 64-bit
     * floating point values. Present if <code>IndexFieldType</code>
     * specifies the field is of type <code>double-array</code>. All options
     * are enabled by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param doubleArrayOptions Options for a field that contains an array of double-precision 64-bit
     *         floating point values. Present if <code>IndexFieldType</code>
     *         specifies the field is of type <code>double-array</code>. All options
     *         are enabled by default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IndexField withDoubleArrayOptions(DoubleArrayOptions doubleArrayOptions) {
        this.doubleArrayOptions = doubleArrayOptions;
        return this;
    }

    /**
     * Options for a field that contains an array of literal strings. Present
     * if <code>IndexFieldType</code> specifies the field is of type
     * <code>literal-array</code>. All options are enabled by default.
     *
     * @return Options for a field that contains an array of literal strings. Present
     *         if <code>IndexFieldType</code> specifies the field is of type
     *         <code>literal-array</code>. All options are enabled by default.
     */
    public LiteralArrayOptions getLiteralArrayOptions() {
        return literalArrayOptions;
    }
    
    /**
     * Options for a field that contains an array of literal strings. Present
     * if <code>IndexFieldType</code> specifies the field is of type
     * <code>literal-array</code>. All options are enabled by default.
     *
     * @param literalArrayOptions Options for a field that contains an array of literal strings. Present
     *         if <code>IndexFieldType</code> specifies the field is of type
     *         <code>literal-array</code>. All options are enabled by default.
     */
    public void setLiteralArrayOptions(LiteralArrayOptions literalArrayOptions) {
        this.literalArrayOptions = literalArrayOptions;
    }
    
    /**
     * Options for a field that contains an array of literal strings. Present
     * if <code>IndexFieldType</code> specifies the field is of type
     * <code>literal-array</code>. All options are enabled by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param literalArrayOptions Options for a field that contains an array of literal strings. Present
     *         if <code>IndexFieldType</code> specifies the field is of type
     *         <code>literal-array</code>. All options are enabled by default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IndexField withLiteralArrayOptions(LiteralArrayOptions literalArrayOptions) {
        this.literalArrayOptions = literalArrayOptions;
        return this;
    }

    /**
     * Options for a field that contains an array of text strings. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>text-array</code>. A <code>text-array</code> field is always
     * searchable. All options are enabled by default.
     *
     * @return Options for a field that contains an array of text strings. Present if
     *         <code>IndexFieldType</code> specifies the field is of type
     *         <code>text-array</code>. A <code>text-array</code> field is always
     *         searchable. All options are enabled by default.
     */
    public TextArrayOptions getTextArrayOptions() {
        return textArrayOptions;
    }
    
    /**
     * Options for a field that contains an array of text strings. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>text-array</code>. A <code>text-array</code> field is always
     * searchable. All options are enabled by default.
     *
     * @param textArrayOptions Options for a field that contains an array of text strings. Present if
     *         <code>IndexFieldType</code> specifies the field is of type
     *         <code>text-array</code>. A <code>text-array</code> field is always
     *         searchable. All options are enabled by default.
     */
    public void setTextArrayOptions(TextArrayOptions textArrayOptions) {
        this.textArrayOptions = textArrayOptions;
    }
    
    /**
     * Options for a field that contains an array of text strings. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>text-array</code>. A <code>text-array</code> field is always
     * searchable. All options are enabled by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param textArrayOptions Options for a field that contains an array of text strings. Present if
     *         <code>IndexFieldType</code> specifies the field is of type
     *         <code>text-array</code>. A <code>text-array</code> field is always
     *         searchable. All options are enabled by default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IndexField withTextArrayOptions(TextArrayOptions textArrayOptions) {
        this.textArrayOptions = textArrayOptions;
        return this;
    }

    /**
     * Options for a field that contains an array of dates. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>date-array</code>. All options are enabled by default.
     *
     * @return Options for a field that contains an array of dates. Present if
     *         <code>IndexFieldType</code> specifies the field is of type
     *         <code>date-array</code>. All options are enabled by default.
     */
    public DateArrayOptions getDateArrayOptions() {
        return dateArrayOptions;
    }
    
    /**
     * Options for a field that contains an array of dates. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>date-array</code>. All options are enabled by default.
     *
     * @param dateArrayOptions Options for a field that contains an array of dates. Present if
     *         <code>IndexFieldType</code> specifies the field is of type
     *         <code>date-array</code>. All options are enabled by default.
     */
    public void setDateArrayOptions(DateArrayOptions dateArrayOptions) {
        this.dateArrayOptions = dateArrayOptions;
    }
    
    /**
     * Options for a field that contains an array of dates. Present if
     * <code>IndexFieldType</code> specifies the field is of type
     * <code>date-array</code>. All options are enabled by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dateArrayOptions Options for a field that contains an array of dates. Present if
     *         <code>IndexFieldType</code> specifies the field is of type
     *         <code>date-array</code>. All options are enabled by default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IndexField withDateArrayOptions(DateArrayOptions dateArrayOptions) {
        this.dateArrayOptions = dateArrayOptions;
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
        if (getIndexFieldName() != null) sb.append("IndexFieldName: " + getIndexFieldName() + ",");
        if (getIndexFieldType() != null) sb.append("IndexFieldType: " + getIndexFieldType() + ",");
        if (getIntOptions() != null) sb.append("IntOptions: " + getIntOptions() + ",");
        if (getDoubleOptions() != null) sb.append("DoubleOptions: " + getDoubleOptions() + ",");
        if (getLiteralOptions() != null) sb.append("LiteralOptions: " + getLiteralOptions() + ",");
        if (getTextOptions() != null) sb.append("TextOptions: " + getTextOptions() + ",");
        if (getDateOptions() != null) sb.append("DateOptions: " + getDateOptions() + ",");
        if (getLatLonOptions() != null) sb.append("LatLonOptions: " + getLatLonOptions() + ",");
        if (getIntArrayOptions() != null) sb.append("IntArrayOptions: " + getIntArrayOptions() + ",");
        if (getDoubleArrayOptions() != null) sb.append("DoubleArrayOptions: " + getDoubleArrayOptions() + ",");
        if (getLiteralArrayOptions() != null) sb.append("LiteralArrayOptions: " + getLiteralArrayOptions() + ",");
        if (getTextArrayOptions() != null) sb.append("TextArrayOptions: " + getTextArrayOptions() + ",");
        if (getDateArrayOptions() != null) sb.append("DateArrayOptions: " + getDateArrayOptions() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof IndexField == false) return false;
        IndexField other = (IndexField)obj;
        
        if (other.getIndexFieldName() == null ^ this.getIndexFieldName() == null) return false;
        if (other.getIndexFieldName() != null && other.getIndexFieldName().equals(this.getIndexFieldName()) == false) return false; 
        if (other.getIndexFieldType() == null ^ this.getIndexFieldType() == null) return false;
        if (other.getIndexFieldType() != null && other.getIndexFieldType().equals(this.getIndexFieldType()) == false) return false; 
        if (other.getIntOptions() == null ^ this.getIntOptions() == null) return false;
        if (other.getIntOptions() != null && other.getIntOptions().equals(this.getIntOptions()) == false) return false; 
        if (other.getDoubleOptions() == null ^ this.getDoubleOptions() == null) return false;
        if (other.getDoubleOptions() != null && other.getDoubleOptions().equals(this.getDoubleOptions()) == false) return false; 
        if (other.getLiteralOptions() == null ^ this.getLiteralOptions() == null) return false;
        if (other.getLiteralOptions() != null && other.getLiteralOptions().equals(this.getLiteralOptions()) == false) return false; 
        if (other.getTextOptions() == null ^ this.getTextOptions() == null) return false;
        if (other.getTextOptions() != null && other.getTextOptions().equals(this.getTextOptions()) == false) return false; 
        if (other.getDateOptions() == null ^ this.getDateOptions() == null) return false;
        if (other.getDateOptions() != null && other.getDateOptions().equals(this.getDateOptions()) == false) return false; 
        if (other.getLatLonOptions() == null ^ this.getLatLonOptions() == null) return false;
        if (other.getLatLonOptions() != null && other.getLatLonOptions().equals(this.getLatLonOptions()) == false) return false; 
        if (other.getIntArrayOptions() == null ^ this.getIntArrayOptions() == null) return false;
        if (other.getIntArrayOptions() != null && other.getIntArrayOptions().equals(this.getIntArrayOptions()) == false) return false; 
        if (other.getDoubleArrayOptions() == null ^ this.getDoubleArrayOptions() == null) return false;
        if (other.getDoubleArrayOptions() != null && other.getDoubleArrayOptions().equals(this.getDoubleArrayOptions()) == false) return false; 
        if (other.getLiteralArrayOptions() == null ^ this.getLiteralArrayOptions() == null) return false;
        if (other.getLiteralArrayOptions() != null && other.getLiteralArrayOptions().equals(this.getLiteralArrayOptions()) == false) return false; 
        if (other.getTextArrayOptions() == null ^ this.getTextArrayOptions() == null) return false;
        if (other.getTextArrayOptions() != null && other.getTextArrayOptions().equals(this.getTextArrayOptions()) == false) return false; 
        if (other.getDateArrayOptions() == null ^ this.getDateArrayOptions() == null) return false;
        if (other.getDateArrayOptions() != null && other.getDateArrayOptions().equals(this.getDateArrayOptions()) == false) return false; 
        return true;
    }
    
    @Override
    public IndexField clone() {
        try {
            return (IndexField) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    