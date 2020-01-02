/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rdsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The result of a SQL statement.
 * </p>
 * 
 * <pre>
 * <code> &lt;important&gt; &lt;p&gt;This data type is deprecated.&lt;/p&gt; &lt;/important&gt; </code>
 * </pre>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/SqlStatementResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqlStatementResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of records updated by a SQL statement.
     * </p>
     */
    private Long numberOfRecordsUpdated;
    /**
     * <p>
     * The result set of the SQL statement.
     * </p>
     */
    private ResultFrame resultFrame;

    /**
     * <p>
     * The number of records updated by a SQL statement.
     * </p>
     * 
     * @param numberOfRecordsUpdated
     *        The number of records updated by a SQL statement.
     */

    public void setNumberOfRecordsUpdated(Long numberOfRecordsUpdated) {
        this.numberOfRecordsUpdated = numberOfRecordsUpdated;
    }

    /**
     * <p>
     * The number of records updated by a SQL statement.
     * </p>
     * 
     * @return The number of records updated by a SQL statement.
     */

    public Long getNumberOfRecordsUpdated() {
        return this.numberOfRecordsUpdated;
    }

    /**
     * <p>
     * The number of records updated by a SQL statement.
     * </p>
     * 
     * @param numberOfRecordsUpdated
     *        The number of records updated by a SQL statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlStatementResult withNumberOfRecordsUpdated(Long numberOfRecordsUpdated) {
        setNumberOfRecordsUpdated(numberOfRecordsUpdated);
        return this;
    }

    /**
     * <p>
     * The result set of the SQL statement.
     * </p>
     * 
     * @param resultFrame
     *        The result set of the SQL statement.
     */

    public void setResultFrame(ResultFrame resultFrame) {
        this.resultFrame = resultFrame;
    }

    /**
     * <p>
     * The result set of the SQL statement.
     * </p>
     * 
     * @return The result set of the SQL statement.
     */

    public ResultFrame getResultFrame() {
        return this.resultFrame;
    }

    /**
     * <p>
     * The result set of the SQL statement.
     * </p>
     * 
     * @param resultFrame
     *        The result set of the SQL statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlStatementResult withResultFrame(ResultFrame resultFrame) {
        setResultFrame(resultFrame);
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
        if (getNumberOfRecordsUpdated() != null)
            sb.append("NumberOfRecordsUpdated: ").append(getNumberOfRecordsUpdated()).append(",");
        if (getResultFrame() != null)
            sb.append("ResultFrame: ").append(getResultFrame());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqlStatementResult == false)
            return false;
        SqlStatementResult other = (SqlStatementResult) obj;
        if (other.getNumberOfRecordsUpdated() == null ^ this.getNumberOfRecordsUpdated() == null)
            return false;
        if (other.getNumberOfRecordsUpdated() != null && other.getNumberOfRecordsUpdated().equals(this.getNumberOfRecordsUpdated()) == false)
            return false;
        if (other.getResultFrame() == null ^ this.getResultFrame() == null)
            return false;
        if (other.getResultFrame() != null && other.getResultFrame().equals(this.getResultFrame()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfRecordsUpdated() == null) ? 0 : getNumberOfRecordsUpdated().hashCode());
        hashCode = prime * hashCode + ((getResultFrame() == null) ? 0 : getResultFrame().hashCode());
        return hashCode;
    }

    @Override
    public SqlStatementResult clone() {
        try {
            return (SqlStatementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rdsdata.model.transform.SqlStatementResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
