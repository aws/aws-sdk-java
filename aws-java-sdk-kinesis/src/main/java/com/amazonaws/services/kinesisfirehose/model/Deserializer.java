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
 * The deserializer you want Kinesis Data Firehose to use for converting the input data from JSON. Kinesis Data Firehose
 * then serializes the data to its final format using the <a>Serializer</a>. Kinesis Data Firehose supports two types of
 * deserializers: the <a
 * href="https://cwiki.apache.org/confluence/display/Hive/LanguageManual+DDL#LanguageManualDDL-JSON">Apache Hive JSON
 * SerDe</a> and the <a href="https://github.com/rcongiu/Hive-JSON-Serde">OpenX JSON SerDe</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/Deserializer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Deserializer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON
     * format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can
     * choose, depending on which one offers the functionality you need. The other option is the native Hive / HCatalog
     * JsonSerDe.
     * </p>
     */
    private OpenXJsonSerDe openXJsonSerDe;
    /**
     * <p>
     * The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for deserializing data, which means
     * converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of
     * two deserializers you can choose, depending on which one offers the functionality you need. The other option is
     * the OpenX SerDe.
     * </p>
     */
    private HiveJsonSerDe hiveJsonSerDe;

    /**
     * <p>
     * The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON
     * format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can
     * choose, depending on which one offers the functionality you need. The other option is the native Hive / HCatalog
     * JsonSerDe.
     * </p>
     * 
     * @param openXJsonSerDe
     *        The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the
     *        JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two
     *        deserializers you can choose, depending on which one offers the functionality you need. The other option
     *        is the native Hive / HCatalog JsonSerDe.
     */

    public void setOpenXJsonSerDe(OpenXJsonSerDe openXJsonSerDe) {
        this.openXJsonSerDe = openXJsonSerDe;
    }

    /**
     * <p>
     * The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON
     * format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can
     * choose, depending on which one offers the functionality you need. The other option is the native Hive / HCatalog
     * JsonSerDe.
     * </p>
     * 
     * @return The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the
     *         JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two
     *         deserializers you can choose, depending on which one offers the functionality you need. The other option
     *         is the native Hive / HCatalog JsonSerDe.
     */

    public OpenXJsonSerDe getOpenXJsonSerDe() {
        return this.openXJsonSerDe;
    }

    /**
     * <p>
     * The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON
     * format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can
     * choose, depending on which one offers the functionality you need. The other option is the native Hive / HCatalog
     * JsonSerDe.
     * </p>
     * 
     * @param openXJsonSerDe
     *        The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the
     *        JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two
     *        deserializers you can choose, depending on which one offers the functionality you need. The other option
     *        is the native Hive / HCatalog JsonSerDe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deserializer withOpenXJsonSerDe(OpenXJsonSerDe openXJsonSerDe) {
        setOpenXJsonSerDe(openXJsonSerDe);
        return this;
    }

    /**
     * <p>
     * The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for deserializing data, which means
     * converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of
     * two deserializers you can choose, depending on which one offers the functionality you need. The other option is
     * the OpenX SerDe.
     * </p>
     * 
     * @param hiveJsonSerDe
     *        The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for deserializing data, which means
     *        converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is
     *        one of two deserializers you can choose, depending on which one offers the functionality you need. The
     *        other option is the OpenX SerDe.
     */

    public void setHiveJsonSerDe(HiveJsonSerDe hiveJsonSerDe) {
        this.hiveJsonSerDe = hiveJsonSerDe;
    }

    /**
     * <p>
     * The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for deserializing data, which means
     * converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of
     * two deserializers you can choose, depending on which one offers the functionality you need. The other option is
     * the OpenX SerDe.
     * </p>
     * 
     * @return The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for deserializing data, which means
     *         converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This
     *         is one of two deserializers you can choose, depending on which one offers the functionality you need. The
     *         other option is the OpenX SerDe.
     */

    public HiveJsonSerDe getHiveJsonSerDe() {
        return this.hiveJsonSerDe;
    }

    /**
     * <p>
     * The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for deserializing data, which means
     * converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of
     * two deserializers you can choose, depending on which one offers the functionality you need. The other option is
     * the OpenX SerDe.
     * </p>
     * 
     * @param hiveJsonSerDe
     *        The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for deserializing data, which means
     *        converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is
     *        one of two deserializers you can choose, depending on which one offers the functionality you need. The
     *        other option is the OpenX SerDe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deserializer withHiveJsonSerDe(HiveJsonSerDe hiveJsonSerDe) {
        setHiveJsonSerDe(hiveJsonSerDe);
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
        if (getOpenXJsonSerDe() != null)
            sb.append("OpenXJsonSerDe: ").append(getOpenXJsonSerDe()).append(",");
        if (getHiveJsonSerDe() != null)
            sb.append("HiveJsonSerDe: ").append(getHiveJsonSerDe());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Deserializer == false)
            return false;
        Deserializer other = (Deserializer) obj;
        if (other.getOpenXJsonSerDe() == null ^ this.getOpenXJsonSerDe() == null)
            return false;
        if (other.getOpenXJsonSerDe() != null && other.getOpenXJsonSerDe().equals(this.getOpenXJsonSerDe()) == false)
            return false;
        if (other.getHiveJsonSerDe() == null ^ this.getHiveJsonSerDe() == null)
            return false;
        if (other.getHiveJsonSerDe() != null && other.getHiveJsonSerDe().equals(this.getHiveJsonSerDe()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpenXJsonSerDe() == null) ? 0 : getOpenXJsonSerDe().hashCode());
        hashCode = prime * hashCode + ((getHiveJsonSerDe() == null) ? 0 : getHiveJsonSerDe().hashCode());
        return hashCode;
    }

    @Override
    public Deserializer clone() {
        try {
            return (Deserializer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.DeserializerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
