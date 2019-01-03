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
 * The serializer that you want Kinesis Data Firehose to use to convert data to the target format before writing it to
 * Amazon S3. Kinesis Data Firehose supports two types of serializers: the <a
 * href="https://hive.apache.org/javadocs/r1.2.2/api/org/apache/hadoop/hive/ql/io/orc/OrcSerde.html">ORC SerDe</a> and
 * the <a
 * href="https://hive.apache.org/javadocs/r1.2.2/api/org/apache/hadoop/hive/ql/io/parquet/serde/ParquetHiveSerDe.html"
 * >Parquet SerDe</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/Serializer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Serializer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more
     * information, see <a href="https://parquet.apache.org/documentation/latest/">Apache Parquet</a>.
     * </p>
     */
    private ParquetSerDe parquetSerDe;
    /**
     * <p>
     * A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more information,
     * see <a href="https://orc.apache.org/docs/">Apache ORC</a>.
     * </p>
     */
    private OrcSerDe orcSerDe;

    /**
     * <p>
     * A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more
     * information, see <a href="https://parquet.apache.org/documentation/latest/">Apache Parquet</a>.
     * </p>
     * 
     * @param parquetSerDe
     *        A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more
     *        information, see <a href="https://parquet.apache.org/documentation/latest/">Apache Parquet</a>.
     */

    public void setParquetSerDe(ParquetSerDe parquetSerDe) {
        this.parquetSerDe = parquetSerDe;
    }

    /**
     * <p>
     * A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more
     * information, see <a href="https://parquet.apache.org/documentation/latest/">Apache Parquet</a>.
     * </p>
     * 
     * @return A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more
     *         information, see <a href="https://parquet.apache.org/documentation/latest/">Apache Parquet</a>.
     */

    public ParquetSerDe getParquetSerDe() {
        return this.parquetSerDe;
    }

    /**
     * <p>
     * A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more
     * information, see <a href="https://parquet.apache.org/documentation/latest/">Apache Parquet</a>.
     * </p>
     * 
     * @param parquetSerDe
     *        A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more
     *        information, see <a href="https://parquet.apache.org/documentation/latest/">Apache Parquet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Serializer withParquetSerDe(ParquetSerDe parquetSerDe) {
        setParquetSerDe(parquetSerDe);
        return this;
    }

    /**
     * <p>
     * A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more information,
     * see <a href="https://orc.apache.org/docs/">Apache ORC</a>.
     * </p>
     * 
     * @param orcSerDe
     *        A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more
     *        information, see <a href="https://orc.apache.org/docs/">Apache ORC</a>.
     */

    public void setOrcSerDe(OrcSerDe orcSerDe) {
        this.orcSerDe = orcSerDe;
    }

    /**
     * <p>
     * A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more information,
     * see <a href="https://orc.apache.org/docs/">Apache ORC</a>.
     * </p>
     * 
     * @return A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more
     *         information, see <a href="https://orc.apache.org/docs/">Apache ORC</a>.
     */

    public OrcSerDe getOrcSerDe() {
        return this.orcSerDe;
    }

    /**
     * <p>
     * A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more information,
     * see <a href="https://orc.apache.org/docs/">Apache ORC</a>.
     * </p>
     * 
     * @param orcSerDe
     *        A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more
     *        information, see <a href="https://orc.apache.org/docs/">Apache ORC</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Serializer withOrcSerDe(OrcSerDe orcSerDe) {
        setOrcSerDe(orcSerDe);
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
        if (getParquetSerDe() != null)
            sb.append("ParquetSerDe: ").append(getParquetSerDe()).append(",");
        if (getOrcSerDe() != null)
            sb.append("OrcSerDe: ").append(getOrcSerDe());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Serializer == false)
            return false;
        Serializer other = (Serializer) obj;
        if (other.getParquetSerDe() == null ^ this.getParquetSerDe() == null)
            return false;
        if (other.getParquetSerDe() != null && other.getParquetSerDe().equals(this.getParquetSerDe()) == false)
            return false;
        if (other.getOrcSerDe() == null ^ this.getOrcSerDe() == null)
            return false;
        if (other.getOrcSerDe() != null && other.getOrcSerDe().equals(this.getOrcSerDe()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParquetSerDe() == null) ? 0 : getParquetSerDe().hashCode());
        hashCode = prime * hashCode + ((getOrcSerDe() == null) ? 0 : getOrcSerDe().hashCode());
        return hashCode;
    }

    @Override
    public Serializer clone() {
        try {
            return (Serializer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.SerializerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
