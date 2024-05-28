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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information that defines an Amazon Timestream endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/TimestreamSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimestreamSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Database name for the endpoint.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Set this attribute to specify the length of time to store all of the tables in memory that are migrated into
     * Amazon Timestream from the source database. Time is measured in units of hours. When Timestream data comes in, it
     * first resides in memory for the specified duration, which allows quick access to it.
     * </p>
     */
    private Integer memoryDuration;
    /**
     * <p>
     * Set this attribute to specify the default magnetic duration applied to the Amazon Timestream tables in days. This
     * is the number of days that records remain in magnetic store before being discarded. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">Storage</a> in the <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/">Amazon Timestream Developer Guide</a>.
     * </p>
     */
    private Integer magneticDuration;
    /**
     * <p>
     * Set this attribute to <code>true</code> to specify that DMS only applies inserts and updates, and not deletes.
     * Amazon Timestream does not allow deleting records, so if this value is <code>false</code>, DMS nulls out the
     * corresponding record in the Timestream database rather than deleting it.
     * </p>
     */
    private Boolean cdcInsertsAndUpdates;
    /**
     * <p>
     * Set this attribute to <code>true</code> to enable memory store writes. When this value is <code>false</code>, DMS
     * does not write records that are older in days than the value specified in <code>MagneticDuration</code>, because
     * Amazon Timestream does not allow memory writes by default. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">Storage</a> in the <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/">Amazon Timestream Developer Guide</a>.
     * </p>
     */
    private Boolean enableMagneticStoreWrites;

    /**
     * <p>
     * Database name for the endpoint.
     * </p>
     * 
     * @param databaseName
     *        Database name for the endpoint.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * Database name for the endpoint.
     * </p>
     * 
     * @return Database name for the endpoint.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * Database name for the endpoint.
     * </p>
     * 
     * @param databaseName
     *        Database name for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamSettings withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Set this attribute to specify the length of time to store all of the tables in memory that are migrated into
     * Amazon Timestream from the source database. Time is measured in units of hours. When Timestream data comes in, it
     * first resides in memory for the specified duration, which allows quick access to it.
     * </p>
     * 
     * @param memoryDuration
     *        Set this attribute to specify the length of time to store all of the tables in memory that are migrated
     *        into Amazon Timestream from the source database. Time is measured in units of hours. When Timestream data
     *        comes in, it first resides in memory for the specified duration, which allows quick access to it.
     */

    public void setMemoryDuration(Integer memoryDuration) {
        this.memoryDuration = memoryDuration;
    }

    /**
     * <p>
     * Set this attribute to specify the length of time to store all of the tables in memory that are migrated into
     * Amazon Timestream from the source database. Time is measured in units of hours. When Timestream data comes in, it
     * first resides in memory for the specified duration, which allows quick access to it.
     * </p>
     * 
     * @return Set this attribute to specify the length of time to store all of the tables in memory that are migrated
     *         into Amazon Timestream from the source database. Time is measured in units of hours. When Timestream data
     *         comes in, it first resides in memory for the specified duration, which allows quick access to it.
     */

    public Integer getMemoryDuration() {
        return this.memoryDuration;
    }

    /**
     * <p>
     * Set this attribute to specify the length of time to store all of the tables in memory that are migrated into
     * Amazon Timestream from the source database. Time is measured in units of hours. When Timestream data comes in, it
     * first resides in memory for the specified duration, which allows quick access to it.
     * </p>
     * 
     * @param memoryDuration
     *        Set this attribute to specify the length of time to store all of the tables in memory that are migrated
     *        into Amazon Timestream from the source database. Time is measured in units of hours. When Timestream data
     *        comes in, it first resides in memory for the specified duration, which allows quick access to it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamSettings withMemoryDuration(Integer memoryDuration) {
        setMemoryDuration(memoryDuration);
        return this;
    }

    /**
     * <p>
     * Set this attribute to specify the default magnetic duration applied to the Amazon Timestream tables in days. This
     * is the number of days that records remain in magnetic store before being discarded. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">Storage</a> in the <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/">Amazon Timestream Developer Guide</a>.
     * </p>
     * 
     * @param magneticDuration
     *        Set this attribute to specify the default magnetic duration applied to the Amazon Timestream tables in
     *        days. This is the number of days that records remain in magnetic store before being discarded. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">Storage</a> in the <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/">Amazon Timestream Developer
     *        Guide</a>.
     */

    public void setMagneticDuration(Integer magneticDuration) {
        this.magneticDuration = magneticDuration;
    }

    /**
     * <p>
     * Set this attribute to specify the default magnetic duration applied to the Amazon Timestream tables in days. This
     * is the number of days that records remain in magnetic store before being discarded. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">Storage</a> in the <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/">Amazon Timestream Developer Guide</a>.
     * </p>
     * 
     * @return Set this attribute to specify the default magnetic duration applied to the Amazon Timestream tables in
     *         days. This is the number of days that records remain in magnetic store before being discarded. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">Storage</a> in the <a
     *         href="https://docs.aws.amazon.com/timestream/latest/developerguide/">Amazon Timestream Developer
     *         Guide</a>.
     */

    public Integer getMagneticDuration() {
        return this.magneticDuration;
    }

    /**
     * <p>
     * Set this attribute to specify the default magnetic duration applied to the Amazon Timestream tables in days. This
     * is the number of days that records remain in magnetic store before being discarded. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">Storage</a> in the <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/">Amazon Timestream Developer Guide</a>.
     * </p>
     * 
     * @param magneticDuration
     *        Set this attribute to specify the default magnetic duration applied to the Amazon Timestream tables in
     *        days. This is the number of days that records remain in magnetic store before being discarded. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">Storage</a> in the <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/">Amazon Timestream Developer
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamSettings withMagneticDuration(Integer magneticDuration) {
        setMagneticDuration(magneticDuration);
        return this;
    }

    /**
     * <p>
     * Set this attribute to <code>true</code> to specify that DMS only applies inserts and updates, and not deletes.
     * Amazon Timestream does not allow deleting records, so if this value is <code>false</code>, DMS nulls out the
     * corresponding record in the Timestream database rather than deleting it.
     * </p>
     * 
     * @param cdcInsertsAndUpdates
     *        Set this attribute to <code>true</code> to specify that DMS only applies inserts and updates, and not
     *        deletes. Amazon Timestream does not allow deleting records, so if this value is <code>false</code>, DMS
     *        nulls out the corresponding record in the Timestream database rather than deleting it.
     */

    public void setCdcInsertsAndUpdates(Boolean cdcInsertsAndUpdates) {
        this.cdcInsertsAndUpdates = cdcInsertsAndUpdates;
    }

    /**
     * <p>
     * Set this attribute to <code>true</code> to specify that DMS only applies inserts and updates, and not deletes.
     * Amazon Timestream does not allow deleting records, so if this value is <code>false</code>, DMS nulls out the
     * corresponding record in the Timestream database rather than deleting it.
     * </p>
     * 
     * @return Set this attribute to <code>true</code> to specify that DMS only applies inserts and updates, and not
     *         deletes. Amazon Timestream does not allow deleting records, so if this value is <code>false</code>, DMS
     *         nulls out the corresponding record in the Timestream database rather than deleting it.
     */

    public Boolean getCdcInsertsAndUpdates() {
        return this.cdcInsertsAndUpdates;
    }

    /**
     * <p>
     * Set this attribute to <code>true</code> to specify that DMS only applies inserts and updates, and not deletes.
     * Amazon Timestream does not allow deleting records, so if this value is <code>false</code>, DMS nulls out the
     * corresponding record in the Timestream database rather than deleting it.
     * </p>
     * 
     * @param cdcInsertsAndUpdates
     *        Set this attribute to <code>true</code> to specify that DMS only applies inserts and updates, and not
     *        deletes. Amazon Timestream does not allow deleting records, so if this value is <code>false</code>, DMS
     *        nulls out the corresponding record in the Timestream database rather than deleting it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamSettings withCdcInsertsAndUpdates(Boolean cdcInsertsAndUpdates) {
        setCdcInsertsAndUpdates(cdcInsertsAndUpdates);
        return this;
    }

    /**
     * <p>
     * Set this attribute to <code>true</code> to specify that DMS only applies inserts and updates, and not deletes.
     * Amazon Timestream does not allow deleting records, so if this value is <code>false</code>, DMS nulls out the
     * corresponding record in the Timestream database rather than deleting it.
     * </p>
     * 
     * @return Set this attribute to <code>true</code> to specify that DMS only applies inserts and updates, and not
     *         deletes. Amazon Timestream does not allow deleting records, so if this value is <code>false</code>, DMS
     *         nulls out the corresponding record in the Timestream database rather than deleting it.
     */

    public Boolean isCdcInsertsAndUpdates() {
        return this.cdcInsertsAndUpdates;
    }

    /**
     * <p>
     * Set this attribute to <code>true</code> to enable memory store writes. When this value is <code>false</code>, DMS
     * does not write records that are older in days than the value specified in <code>MagneticDuration</code>, because
     * Amazon Timestream does not allow memory writes by default. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">Storage</a> in the <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/">Amazon Timestream Developer Guide</a>.
     * </p>
     * 
     * @param enableMagneticStoreWrites
     *        Set this attribute to <code>true</code> to enable memory store writes. When this value is
     *        <code>false</code>, DMS does not write records that are older in days than the value specified in
     *        <code>MagneticDuration</code>, because Amazon Timestream does not allow memory writes by default. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">Storage</a> in the <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/">Amazon Timestream Developer
     *        Guide</a>.
     */

    public void setEnableMagneticStoreWrites(Boolean enableMagneticStoreWrites) {
        this.enableMagneticStoreWrites = enableMagneticStoreWrites;
    }

    /**
     * <p>
     * Set this attribute to <code>true</code> to enable memory store writes. When this value is <code>false</code>, DMS
     * does not write records that are older in days than the value specified in <code>MagneticDuration</code>, because
     * Amazon Timestream does not allow memory writes by default. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">Storage</a> in the <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/">Amazon Timestream Developer Guide</a>.
     * </p>
     * 
     * @return Set this attribute to <code>true</code> to enable memory store writes. When this value is
     *         <code>false</code>, DMS does not write records that are older in days than the value specified in
     *         <code>MagneticDuration</code>, because Amazon Timestream does not allow memory writes by default. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">Storage</a> in the <a
     *         href="https://docs.aws.amazon.com/timestream/latest/developerguide/">Amazon Timestream Developer
     *         Guide</a>.
     */

    public Boolean getEnableMagneticStoreWrites() {
        return this.enableMagneticStoreWrites;
    }

    /**
     * <p>
     * Set this attribute to <code>true</code> to enable memory store writes. When this value is <code>false</code>, DMS
     * does not write records that are older in days than the value specified in <code>MagneticDuration</code>, because
     * Amazon Timestream does not allow memory writes by default. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">Storage</a> in the <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/">Amazon Timestream Developer Guide</a>.
     * </p>
     * 
     * @param enableMagneticStoreWrites
     *        Set this attribute to <code>true</code> to enable memory store writes. When this value is
     *        <code>false</code>, DMS does not write records that are older in days than the value specified in
     *        <code>MagneticDuration</code>, because Amazon Timestream does not allow memory writes by default. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">Storage</a> in the <a
     *        href="https://docs.aws.amazon.com/timestream/latest/developerguide/">Amazon Timestream Developer
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamSettings withEnableMagneticStoreWrites(Boolean enableMagneticStoreWrites) {
        setEnableMagneticStoreWrites(enableMagneticStoreWrites);
        return this;
    }

    /**
     * <p>
     * Set this attribute to <code>true</code> to enable memory store writes. When this value is <code>false</code>, DMS
     * does not write records that are older in days than the value specified in <code>MagneticDuration</code>, because
     * Amazon Timestream does not allow memory writes by default. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">Storage</a> in the <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/">Amazon Timestream Developer Guide</a>.
     * </p>
     * 
     * @return Set this attribute to <code>true</code> to enable memory store writes. When this value is
     *         <code>false</code>, DMS does not write records that are older in days than the value specified in
     *         <code>MagneticDuration</code>, because Amazon Timestream does not allow memory writes by default. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/timestream/latest/developerguide/storage.html">Storage</a> in the <a
     *         href="https://docs.aws.amazon.com/timestream/latest/developerguide/">Amazon Timestream Developer
     *         Guide</a>.
     */

    public Boolean isEnableMagneticStoreWrites() {
        return this.enableMagneticStoreWrites;
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getMemoryDuration() != null)
            sb.append("MemoryDuration: ").append(getMemoryDuration()).append(",");
        if (getMagneticDuration() != null)
            sb.append("MagneticDuration: ").append(getMagneticDuration()).append(",");
        if (getCdcInsertsAndUpdates() != null)
            sb.append("CdcInsertsAndUpdates: ").append(getCdcInsertsAndUpdates()).append(",");
        if (getEnableMagneticStoreWrites() != null)
            sb.append("EnableMagneticStoreWrites: ").append(getEnableMagneticStoreWrites());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimestreamSettings == false)
            return false;
        TimestreamSettings other = (TimestreamSettings) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getMemoryDuration() == null ^ this.getMemoryDuration() == null)
            return false;
        if (other.getMemoryDuration() != null && other.getMemoryDuration().equals(this.getMemoryDuration()) == false)
            return false;
        if (other.getMagneticDuration() == null ^ this.getMagneticDuration() == null)
            return false;
        if (other.getMagneticDuration() != null && other.getMagneticDuration().equals(this.getMagneticDuration()) == false)
            return false;
        if (other.getCdcInsertsAndUpdates() == null ^ this.getCdcInsertsAndUpdates() == null)
            return false;
        if (other.getCdcInsertsAndUpdates() != null && other.getCdcInsertsAndUpdates().equals(this.getCdcInsertsAndUpdates()) == false)
            return false;
        if (other.getEnableMagneticStoreWrites() == null ^ this.getEnableMagneticStoreWrites() == null)
            return false;
        if (other.getEnableMagneticStoreWrites() != null && other.getEnableMagneticStoreWrites().equals(this.getEnableMagneticStoreWrites()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getMemoryDuration() == null) ? 0 : getMemoryDuration().hashCode());
        hashCode = prime * hashCode + ((getMagneticDuration() == null) ? 0 : getMagneticDuration().hashCode());
        hashCode = prime * hashCode + ((getCdcInsertsAndUpdates() == null) ? 0 : getCdcInsertsAndUpdates().hashCode());
        hashCode = prime * hashCode + ((getEnableMagneticStoreWrites() == null) ? 0 : getEnableMagneticStoreWrites().hashCode());
        return hashCode;
    }

    @Override
    public TimestreamSettings clone() {
        try {
            return (TimestreamSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.TimestreamSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
