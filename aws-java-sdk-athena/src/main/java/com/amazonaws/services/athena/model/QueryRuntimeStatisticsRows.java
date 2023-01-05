/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Statistics such as input rows and bytes read by the query, rows and bytes output by the query, and the number of rows
 * written by the query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/QueryRuntimeStatisticsRows" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryRuntimeStatisticsRows implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of rows read to execute the query.
     * </p>
     */
    private Long inputRows;
    /**
     * <p>
     * The number of bytes read to execute the query.
     * </p>
     */
    private Long inputBytes;
    /**
     * <p>
     * The number of bytes returned by the query.
     * </p>
     */
    private Long outputBytes;
    /**
     * <p>
     * The number of rows returned by the query.
     * </p>
     */
    private Long outputRows;

    /**
     * <p>
     * The number of rows read to execute the query.
     * </p>
     * 
     * @param inputRows
     *        The number of rows read to execute the query.
     */

    public void setInputRows(Long inputRows) {
        this.inputRows = inputRows;
    }

    /**
     * <p>
     * The number of rows read to execute the query.
     * </p>
     * 
     * @return The number of rows read to execute the query.
     */

    public Long getInputRows() {
        return this.inputRows;
    }

    /**
     * <p>
     * The number of rows read to execute the query.
     * </p>
     * 
     * @param inputRows
     *        The number of rows read to execute the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRuntimeStatisticsRows withInputRows(Long inputRows) {
        setInputRows(inputRows);
        return this;
    }

    /**
     * <p>
     * The number of bytes read to execute the query.
     * </p>
     * 
     * @param inputBytes
     *        The number of bytes read to execute the query.
     */

    public void setInputBytes(Long inputBytes) {
        this.inputBytes = inputBytes;
    }

    /**
     * <p>
     * The number of bytes read to execute the query.
     * </p>
     * 
     * @return The number of bytes read to execute the query.
     */

    public Long getInputBytes() {
        return this.inputBytes;
    }

    /**
     * <p>
     * The number of bytes read to execute the query.
     * </p>
     * 
     * @param inputBytes
     *        The number of bytes read to execute the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRuntimeStatisticsRows withInputBytes(Long inputBytes) {
        setInputBytes(inputBytes);
        return this;
    }

    /**
     * <p>
     * The number of bytes returned by the query.
     * </p>
     * 
     * @param outputBytes
     *        The number of bytes returned by the query.
     */

    public void setOutputBytes(Long outputBytes) {
        this.outputBytes = outputBytes;
    }

    /**
     * <p>
     * The number of bytes returned by the query.
     * </p>
     * 
     * @return The number of bytes returned by the query.
     */

    public Long getOutputBytes() {
        return this.outputBytes;
    }

    /**
     * <p>
     * The number of bytes returned by the query.
     * </p>
     * 
     * @param outputBytes
     *        The number of bytes returned by the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRuntimeStatisticsRows withOutputBytes(Long outputBytes) {
        setOutputBytes(outputBytes);
        return this;
    }

    /**
     * <p>
     * The number of rows returned by the query.
     * </p>
     * 
     * @param outputRows
     *        The number of rows returned by the query.
     */

    public void setOutputRows(Long outputRows) {
        this.outputRows = outputRows;
    }

    /**
     * <p>
     * The number of rows returned by the query.
     * </p>
     * 
     * @return The number of rows returned by the query.
     */

    public Long getOutputRows() {
        return this.outputRows;
    }

    /**
     * <p>
     * The number of rows returned by the query.
     * </p>
     * 
     * @param outputRows
     *        The number of rows returned by the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRuntimeStatisticsRows withOutputRows(Long outputRows) {
        setOutputRows(outputRows);
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
        if (getInputRows() != null)
            sb.append("InputRows: ").append(getInputRows()).append(",");
        if (getInputBytes() != null)
            sb.append("InputBytes: ").append(getInputBytes()).append(",");
        if (getOutputBytes() != null)
            sb.append("OutputBytes: ").append(getOutputBytes()).append(",");
        if (getOutputRows() != null)
            sb.append("OutputRows: ").append(getOutputRows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryRuntimeStatisticsRows == false)
            return false;
        QueryRuntimeStatisticsRows other = (QueryRuntimeStatisticsRows) obj;
        if (other.getInputRows() == null ^ this.getInputRows() == null)
            return false;
        if (other.getInputRows() != null && other.getInputRows().equals(this.getInputRows()) == false)
            return false;
        if (other.getInputBytes() == null ^ this.getInputBytes() == null)
            return false;
        if (other.getInputBytes() != null && other.getInputBytes().equals(this.getInputBytes()) == false)
            return false;
        if (other.getOutputBytes() == null ^ this.getOutputBytes() == null)
            return false;
        if (other.getOutputBytes() != null && other.getOutputBytes().equals(this.getOutputBytes()) == false)
            return false;
        if (other.getOutputRows() == null ^ this.getOutputRows() == null)
            return false;
        if (other.getOutputRows() != null && other.getOutputRows().equals(this.getOutputRows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputRows() == null) ? 0 : getInputRows().hashCode());
        hashCode = prime * hashCode + ((getInputBytes() == null) ? 0 : getInputBytes().hashCode());
        hashCode = prime * hashCode + ((getOutputBytes() == null) ? 0 : getOutputBytes().hashCode());
        hashCode = prime * hashCode + ((getOutputRows() == null) ? 0 : getOutputRows().hashCode());
        return hashCode;
    }

    @Override
    public QueryRuntimeStatisticsRows clone() {
        try {
            return (QueryRuntimeStatisticsRows) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.QueryRuntimeStatisticsRowsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
