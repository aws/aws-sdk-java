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
 * The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it
 * from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers
 * you can choose, depending on which one offers the functionality you need. The other option is the OpenX SerDe.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/HiveJsonSerDe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HiveJsonSerDe implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates how you want Kinesis Data Firehose to parse the date and timestamps that may be present in your input
     * data JSON. To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat format
     * strings. For more information, see <a
     * href="https://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html">Class DateTimeFormat</a>.
     * You can also use the special value <code>millis</code> to parse timestamps in epoch milliseconds. If you don't
     * specify a format, Kinesis Data Firehose uses <code>java.sql.Timestamp::valueOf</code> by default.
     * </p>
     */
    private java.util.List<String> timestampFormats;

    /**
     * <p>
     * Indicates how you want Kinesis Data Firehose to parse the date and timestamps that may be present in your input
     * data JSON. To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat format
     * strings. For more information, see <a
     * href="https://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html">Class DateTimeFormat</a>.
     * You can also use the special value <code>millis</code> to parse timestamps in epoch milliseconds. If you don't
     * specify a format, Kinesis Data Firehose uses <code>java.sql.Timestamp::valueOf</code> by default.
     * </p>
     * 
     * @return Indicates how you want Kinesis Data Firehose to parse the date and timestamps that may be present in your
     *         input data JSON. To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat
     *         format strings. For more information, see <a
     *         href="https://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html">Class
     *         DateTimeFormat</a>. You can also use the special value <code>millis</code> to parse timestamps in epoch
     *         milliseconds. If you don't specify a format, Kinesis Data Firehose uses
     *         <code>java.sql.Timestamp::valueOf</code> by default.
     */

    public java.util.List<String> getTimestampFormats() {
        return timestampFormats;
    }

    /**
     * <p>
     * Indicates how you want Kinesis Data Firehose to parse the date and timestamps that may be present in your input
     * data JSON. To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat format
     * strings. For more information, see <a
     * href="https://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html">Class DateTimeFormat</a>.
     * You can also use the special value <code>millis</code> to parse timestamps in epoch milliseconds. If you don't
     * specify a format, Kinesis Data Firehose uses <code>java.sql.Timestamp::valueOf</code> by default.
     * </p>
     * 
     * @param timestampFormats
     *        Indicates how you want Kinesis Data Firehose to parse the date and timestamps that may be present in your
     *        input data JSON. To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat
     *        format strings. For more information, see <a
     *        href="https://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html">Class
     *        DateTimeFormat</a>. You can also use the special value <code>millis</code> to parse timestamps in epoch
     *        milliseconds. If you don't specify a format, Kinesis Data Firehose uses
     *        <code>java.sql.Timestamp::valueOf</code> by default.
     */

    public void setTimestampFormats(java.util.Collection<String> timestampFormats) {
        if (timestampFormats == null) {
            this.timestampFormats = null;
            return;
        }

        this.timestampFormats = new java.util.ArrayList<String>(timestampFormats);
    }

    /**
     * <p>
     * Indicates how you want Kinesis Data Firehose to parse the date and timestamps that may be present in your input
     * data JSON. To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat format
     * strings. For more information, see <a
     * href="https://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html">Class DateTimeFormat</a>.
     * You can also use the special value <code>millis</code> to parse timestamps in epoch milliseconds. If you don't
     * specify a format, Kinesis Data Firehose uses <code>java.sql.Timestamp::valueOf</code> by default.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimestampFormats(java.util.Collection)} or {@link #withTimestampFormats(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param timestampFormats
     *        Indicates how you want Kinesis Data Firehose to parse the date and timestamps that may be present in your
     *        input data JSON. To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat
     *        format strings. For more information, see <a
     *        href="https://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html">Class
     *        DateTimeFormat</a>. You can also use the special value <code>millis</code> to parse timestamps in epoch
     *        milliseconds. If you don't specify a format, Kinesis Data Firehose uses
     *        <code>java.sql.Timestamp::valueOf</code> by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HiveJsonSerDe withTimestampFormats(String... timestampFormats) {
        if (this.timestampFormats == null) {
            setTimestampFormats(new java.util.ArrayList<String>(timestampFormats.length));
        }
        for (String ele : timestampFormats) {
            this.timestampFormats.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates how you want Kinesis Data Firehose to parse the date and timestamps that may be present in your input
     * data JSON. To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat format
     * strings. For more information, see <a
     * href="https://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html">Class DateTimeFormat</a>.
     * You can also use the special value <code>millis</code> to parse timestamps in epoch milliseconds. If you don't
     * specify a format, Kinesis Data Firehose uses <code>java.sql.Timestamp::valueOf</code> by default.
     * </p>
     * 
     * @param timestampFormats
     *        Indicates how you want Kinesis Data Firehose to parse the date and timestamps that may be present in your
     *        input data JSON. To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat
     *        format strings. For more information, see <a
     *        href="https://www.joda.org/joda-time/apidocs/org/joda/time/format/DateTimeFormat.html">Class
     *        DateTimeFormat</a>. You can also use the special value <code>millis</code> to parse timestamps in epoch
     *        milliseconds. If you don't specify a format, Kinesis Data Firehose uses
     *        <code>java.sql.Timestamp::valueOf</code> by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HiveJsonSerDe withTimestampFormats(java.util.Collection<String> timestampFormats) {
        setTimestampFormats(timestampFormats);
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
        if (getTimestampFormats() != null)
            sb.append("TimestampFormats: ").append(getTimestampFormats());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HiveJsonSerDe == false)
            return false;
        HiveJsonSerDe other = (HiveJsonSerDe) obj;
        if (other.getTimestampFormats() == null ^ this.getTimestampFormats() == null)
            return false;
        if (other.getTimestampFormats() != null && other.getTimestampFormats().equals(this.getTimestampFormats()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestampFormats() == null) ? 0 : getTimestampFormats().hashCode());
        return hashCode;
    }

    @Override
    public HiveJsonSerDe clone() {
        try {
            return (HiveJsonSerDe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.HiveJsonSerDeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
