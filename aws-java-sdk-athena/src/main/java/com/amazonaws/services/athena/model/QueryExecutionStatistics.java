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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The amount of data scanned during the query execution and the amount of time that it took to execute, and the type of
 * statement that was run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/QueryExecutionStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryExecutionStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of milliseconds that the query took to execute.
     * </p>
     */
    private Long engineExecutionTimeInMillis;
    /**
     * <p>
     * The number of bytes in the data that was queried.
     * </p>
     */
    private Long dataScannedInBytes;

    /**
     * <p>
     * The number of milliseconds that the query took to execute.
     * </p>
     * 
     * @param engineExecutionTimeInMillis
     *        The number of milliseconds that the query took to execute.
     */

    public void setEngineExecutionTimeInMillis(Long engineExecutionTimeInMillis) {
        this.engineExecutionTimeInMillis = engineExecutionTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that the query took to execute.
     * </p>
     * 
     * @return The number of milliseconds that the query took to execute.
     */

    public Long getEngineExecutionTimeInMillis() {
        return this.engineExecutionTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that the query took to execute.
     * </p>
     * 
     * @param engineExecutionTimeInMillis
     *        The number of milliseconds that the query took to execute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecutionStatistics withEngineExecutionTimeInMillis(Long engineExecutionTimeInMillis) {
        setEngineExecutionTimeInMillis(engineExecutionTimeInMillis);
        return this;
    }

    /**
     * <p>
     * The number of bytes in the data that was queried.
     * </p>
     * 
     * @param dataScannedInBytes
     *        The number of bytes in the data that was queried.
     */

    public void setDataScannedInBytes(Long dataScannedInBytes) {
        this.dataScannedInBytes = dataScannedInBytes;
    }

    /**
     * <p>
     * The number of bytes in the data that was queried.
     * </p>
     * 
     * @return The number of bytes in the data that was queried.
     */

    public Long getDataScannedInBytes() {
        return this.dataScannedInBytes;
    }

    /**
     * <p>
     * The number of bytes in the data that was queried.
     * </p>
     * 
     * @param dataScannedInBytes
     *        The number of bytes in the data that was queried.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecutionStatistics withDataScannedInBytes(Long dataScannedInBytes) {
        setDataScannedInBytes(dataScannedInBytes);
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
        if (getEngineExecutionTimeInMillis() != null)
            sb.append("EngineExecutionTimeInMillis: ").append(getEngineExecutionTimeInMillis()).append(",");
        if (getDataScannedInBytes() != null)
            sb.append("DataScannedInBytes: ").append(getDataScannedInBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryExecutionStatistics == false)
            return false;
        QueryExecutionStatistics other = (QueryExecutionStatistics) obj;
        if (other.getEngineExecutionTimeInMillis() == null ^ this.getEngineExecutionTimeInMillis() == null)
            return false;
        if (other.getEngineExecutionTimeInMillis() != null && other.getEngineExecutionTimeInMillis().equals(this.getEngineExecutionTimeInMillis()) == false)
            return false;
        if (other.getDataScannedInBytes() == null ^ this.getDataScannedInBytes() == null)
            return false;
        if (other.getDataScannedInBytes() != null && other.getDataScannedInBytes().equals(this.getDataScannedInBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineExecutionTimeInMillis() == null) ? 0 : getEngineExecutionTimeInMillis().hashCode());
        hashCode = prime * hashCode + ((getDataScannedInBytes() == null) ? 0 : getDataScannedInBytes().hashCode());
        return hashCode;
    }

    @Override
    public QueryExecutionStatistics clone() {
        try {
            return (QueryExecutionStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.QueryExecutionStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
