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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format
 * in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose,
 * depending on which one offers the functionality you need. The other option is the native Hive / HCatalog JsonSerDe.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/OpenXJsonSerDe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenXJsonSerDe implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When set to <code>true</code>, specifies that the names of the keys include dots and that you want Kinesis Data
     * Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column
     * names. For example, if the JSON contains a key whose name is "a.b", you can define the column name to be "a_b"
     * when using this option.
     * </p>
     * <p>
     * The default is <code>false</code>.
     * </p>
     */
    private Boolean convertDotsInJsonKeysToUnderscores;
    /**
     * <p>
     * When set to <code>true</code>, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before
     * deserializing them.
     * </p>
     */
    private Boolean caseInsensitive;
    /**
     * <p>
     * Maps column names to JSON keys that aren't identical to the column names. This is useful when the JSON contains
     * keys that are Hive keywords. For example, <code>timestamp</code> is a Hive keyword. If you have a JSON key named
     * <code>timestamp</code>, set this parameter to <code>{"ts": "timestamp"}</code> to map this key to a column named
     * <code>ts</code>.
     * </p>
     */
    private java.util.Map<String, String> columnToJsonKeyMappings;

    /**
     * <p>
     * When set to <code>true</code>, specifies that the names of the keys include dots and that you want Kinesis Data
     * Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column
     * names. For example, if the JSON contains a key whose name is "a.b", you can define the column name to be "a_b"
     * when using this option.
     * </p>
     * <p>
     * The default is <code>false</code>.
     * </p>
     * 
     * @param convertDotsInJsonKeysToUnderscores
     *        When set to <code>true</code>, specifies that the names of the keys include dots and that you want Kinesis
     *        Data Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in
     *        column names. For example, if the JSON contains a key whose name is "a.b", you can define the column name
     *        to be "a_b" when using this option.</p>
     *        <p>
     *        The default is <code>false</code>.
     */

    public void setConvertDotsInJsonKeysToUnderscores(Boolean convertDotsInJsonKeysToUnderscores) {
        this.convertDotsInJsonKeysToUnderscores = convertDotsInJsonKeysToUnderscores;
    }

    /**
     * <p>
     * When set to <code>true</code>, specifies that the names of the keys include dots and that you want Kinesis Data
     * Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column
     * names. For example, if the JSON contains a key whose name is "a.b", you can define the column name to be "a_b"
     * when using this option.
     * </p>
     * <p>
     * The default is <code>false</code>.
     * </p>
     * 
     * @return When set to <code>true</code>, specifies that the names of the keys include dots and that you want
     *         Kinesis Data Firehose to replace them with underscores. This is useful because Apache Hive does not allow
     *         dots in column names. For example, if the JSON contains a key whose name is "a.b", you can define the
     *         column name to be "a_b" when using this option.</p>
     *         <p>
     *         The default is <code>false</code>.
     */

    public Boolean getConvertDotsInJsonKeysToUnderscores() {
        return this.convertDotsInJsonKeysToUnderscores;
    }

    /**
     * <p>
     * When set to <code>true</code>, specifies that the names of the keys include dots and that you want Kinesis Data
     * Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column
     * names. For example, if the JSON contains a key whose name is "a.b", you can define the column name to be "a_b"
     * when using this option.
     * </p>
     * <p>
     * The default is <code>false</code>.
     * </p>
     * 
     * @param convertDotsInJsonKeysToUnderscores
     *        When set to <code>true</code>, specifies that the names of the keys include dots and that you want Kinesis
     *        Data Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in
     *        column names. For example, if the JSON contains a key whose name is "a.b", you can define the column name
     *        to be "a_b" when using this option.</p>
     *        <p>
     *        The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenXJsonSerDe withConvertDotsInJsonKeysToUnderscores(Boolean convertDotsInJsonKeysToUnderscores) {
        setConvertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, specifies that the names of the keys include dots and that you want Kinesis Data
     * Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column
     * names. For example, if the JSON contains a key whose name is "a.b", you can define the column name to be "a_b"
     * when using this option.
     * </p>
     * <p>
     * The default is <code>false</code>.
     * </p>
     * 
     * @return When set to <code>true</code>, specifies that the names of the keys include dots and that you want
     *         Kinesis Data Firehose to replace them with underscores. This is useful because Apache Hive does not allow
     *         dots in column names. For example, if the JSON contains a key whose name is "a.b", you can define the
     *         column name to be "a_b" when using this option.</p>
     *         <p>
     *         The default is <code>false</code>.
     */

    public Boolean isConvertDotsInJsonKeysToUnderscores() {
        return this.convertDotsInJsonKeysToUnderscores;
    }

    /**
     * <p>
     * When set to <code>true</code>, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before
     * deserializing them.
     * </p>
     * 
     * @param caseInsensitive
     *        When set to <code>true</code>, which is the default, Kinesis Data Firehose converts JSON keys to lowercase
     *        before deserializing them.
     */

    public void setCaseInsensitive(Boolean caseInsensitive) {
        this.caseInsensitive = caseInsensitive;
    }

    /**
     * <p>
     * When set to <code>true</code>, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before
     * deserializing them.
     * </p>
     * 
     * @return When set to <code>true</code>, which is the default, Kinesis Data Firehose converts JSON keys to
     *         lowercase before deserializing them.
     */

    public Boolean getCaseInsensitive() {
        return this.caseInsensitive;
    }

    /**
     * <p>
     * When set to <code>true</code>, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before
     * deserializing them.
     * </p>
     * 
     * @param caseInsensitive
     *        When set to <code>true</code>, which is the default, Kinesis Data Firehose converts JSON keys to lowercase
     *        before deserializing them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenXJsonSerDe withCaseInsensitive(Boolean caseInsensitive) {
        setCaseInsensitive(caseInsensitive);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before
     * deserializing them.
     * </p>
     * 
     * @return When set to <code>true</code>, which is the default, Kinesis Data Firehose converts JSON keys to
     *         lowercase before deserializing them.
     */

    public Boolean isCaseInsensitive() {
        return this.caseInsensitive;
    }

    /**
     * <p>
     * Maps column names to JSON keys that aren't identical to the column names. This is useful when the JSON contains
     * keys that are Hive keywords. For example, <code>timestamp</code> is a Hive keyword. If you have a JSON key named
     * <code>timestamp</code>, set this parameter to <code>{"ts": "timestamp"}</code> to map this key to a column named
     * <code>ts</code>.
     * </p>
     * 
     * @return Maps column names to JSON keys that aren't identical to the column names. This is useful when the JSON
     *         contains keys that are Hive keywords. For example, <code>timestamp</code> is a Hive keyword. If you have
     *         a JSON key named <code>timestamp</code>, set this parameter to <code>{"ts": "timestamp"}</code> to map
     *         this key to a column named <code>ts</code>.
     */

    public java.util.Map<String, String> getColumnToJsonKeyMappings() {
        return columnToJsonKeyMappings;
    }

    /**
     * <p>
     * Maps column names to JSON keys that aren't identical to the column names. This is useful when the JSON contains
     * keys that are Hive keywords. For example, <code>timestamp</code> is a Hive keyword. If you have a JSON key named
     * <code>timestamp</code>, set this parameter to <code>{"ts": "timestamp"}</code> to map this key to a column named
     * <code>ts</code>.
     * </p>
     * 
     * @param columnToJsonKeyMappings
     *        Maps column names to JSON keys that aren't identical to the column names. This is useful when the JSON
     *        contains keys that are Hive keywords. For example, <code>timestamp</code> is a Hive keyword. If you have a
     *        JSON key named <code>timestamp</code>, set this parameter to <code>{"ts": "timestamp"}</code> to map this
     *        key to a column named <code>ts</code>.
     */

    public void setColumnToJsonKeyMappings(java.util.Map<String, String> columnToJsonKeyMappings) {
        this.columnToJsonKeyMappings = columnToJsonKeyMappings;
    }

    /**
     * <p>
     * Maps column names to JSON keys that aren't identical to the column names. This is useful when the JSON contains
     * keys that are Hive keywords. For example, <code>timestamp</code> is a Hive keyword. If you have a JSON key named
     * <code>timestamp</code>, set this parameter to <code>{"ts": "timestamp"}</code> to map this key to a column named
     * <code>ts</code>.
     * </p>
     * 
     * @param columnToJsonKeyMappings
     *        Maps column names to JSON keys that aren't identical to the column names. This is useful when the JSON
     *        contains keys that are Hive keywords. For example, <code>timestamp</code> is a Hive keyword. If you have a
     *        JSON key named <code>timestamp</code>, set this parameter to <code>{"ts": "timestamp"}</code> to map this
     *        key to a column named <code>ts</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenXJsonSerDe withColumnToJsonKeyMappings(java.util.Map<String, String> columnToJsonKeyMappings) {
        setColumnToJsonKeyMappings(columnToJsonKeyMappings);
        return this;
    }

    public OpenXJsonSerDe addColumnToJsonKeyMappingsEntry(String key, String value) {
        if (null == this.columnToJsonKeyMappings) {
            this.columnToJsonKeyMappings = new java.util.HashMap<String, String>();
        }
        if (this.columnToJsonKeyMappings.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.columnToJsonKeyMappings.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ColumnToJsonKeyMappings.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenXJsonSerDe clearColumnToJsonKeyMappingsEntries() {
        this.columnToJsonKeyMappings = null;
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
        if (getConvertDotsInJsonKeysToUnderscores() != null)
            sb.append("ConvertDotsInJsonKeysToUnderscores: ").append(getConvertDotsInJsonKeysToUnderscores()).append(",");
        if (getCaseInsensitive() != null)
            sb.append("CaseInsensitive: ").append(getCaseInsensitive()).append(",");
        if (getColumnToJsonKeyMappings() != null)
            sb.append("ColumnToJsonKeyMappings: ").append(getColumnToJsonKeyMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpenXJsonSerDe == false)
            return false;
        OpenXJsonSerDe other = (OpenXJsonSerDe) obj;
        if (other.getConvertDotsInJsonKeysToUnderscores() == null ^ this.getConvertDotsInJsonKeysToUnderscores() == null)
            return false;
        if (other.getConvertDotsInJsonKeysToUnderscores() != null
                && other.getConvertDotsInJsonKeysToUnderscores().equals(this.getConvertDotsInJsonKeysToUnderscores()) == false)
            return false;
        if (other.getCaseInsensitive() == null ^ this.getCaseInsensitive() == null)
            return false;
        if (other.getCaseInsensitive() != null && other.getCaseInsensitive().equals(this.getCaseInsensitive()) == false)
            return false;
        if (other.getColumnToJsonKeyMappings() == null ^ this.getColumnToJsonKeyMappings() == null)
            return false;
        if (other.getColumnToJsonKeyMappings() != null && other.getColumnToJsonKeyMappings().equals(this.getColumnToJsonKeyMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConvertDotsInJsonKeysToUnderscores() == null) ? 0 : getConvertDotsInJsonKeysToUnderscores().hashCode());
        hashCode = prime * hashCode + ((getCaseInsensitive() == null) ? 0 : getCaseInsensitive().hashCode());
        hashCode = prime * hashCode + ((getColumnToJsonKeyMappings() == null) ? 0 : getColumnToJsonKeyMappings().hashCode());
        return hashCode;
    }

    @Override
    public OpenXJsonSerDe clone() {
        try {
            return (OpenXJsonSerDe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.OpenXJsonSerDeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
