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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that describes the details for a specified dimension.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DimensionKeyDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DimensionKeyDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the dimension detail data. Depending on the return status, this value is either the full or
     * truncated SQL query for the following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.query.statement</code> (Amazon DocumentDB)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sql.statement</code> (Amazon RDS and Aurora)
     * </p>
     * </li>
     * </ul>
     */
    private String value;
    /**
     * <p>
     * The full name of the dimension. The full name includes the group name and key name. The following values are
     * valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.query.statement</code> (Amazon DocumentDB)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sql.statement</code> (Amazon RDS and Aurora)
     * </p>
     * </li>
     * </ul>
     */
    private String dimension;
    /**
     * <p>
     * The status of the dimension detail data. Possible values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The dimension detail data is ready to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROCESSING</code> - The dimension detail data isn't ready to be retrieved because more processing time is
     * required. If the requested detail data has the status <code>PROCESSING</code>, Performance Insights returns the
     * truncated query.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAVAILABLE</code> - The dimension detail data could not be collected successfully.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The value of the dimension detail data. Depending on the return status, this value is either the full or
     * truncated SQL query for the following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.query.statement</code> (Amazon DocumentDB)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sql.statement</code> (Amazon RDS and Aurora)
     * </p>
     * </li>
     * </ul>
     * 
     * @param value
     *        The value of the dimension detail data. Depending on the return status, this value is either the full or
     *        truncated SQL query for the following dimensions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db.query.statement</code> (Amazon DocumentDB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.sql.statement</code> (Amazon RDS and Aurora)
     *        </p>
     *        </li>
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the dimension detail data. Depending on the return status, this value is either the full or
     * truncated SQL query for the following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.query.statement</code> (Amazon DocumentDB)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sql.statement</code> (Amazon RDS and Aurora)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The value of the dimension detail data. Depending on the return status, this value is either the full or
     *         truncated SQL query for the following dimensions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>db.query.statement</code> (Amazon DocumentDB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db.sql.statement</code> (Amazon RDS and Aurora)
     *         </p>
     *         </li>
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the dimension detail data. Depending on the return status, this value is either the full or
     * truncated SQL query for the following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.query.statement</code> (Amazon DocumentDB)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sql.statement</code> (Amazon RDS and Aurora)
     * </p>
     * </li>
     * </ul>
     * 
     * @param value
     *        The value of the dimension detail data. Depending on the return status, this value is either the full or
     *        truncated SQL query for the following dimensions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db.query.statement</code> (Amazon DocumentDB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.sql.statement</code> (Amazon RDS and Aurora)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionKeyDetail withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The full name of the dimension. The full name includes the group name and key name. The following values are
     * valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.query.statement</code> (Amazon DocumentDB)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sql.statement</code> (Amazon RDS and Aurora)
     * </p>
     * </li>
     * </ul>
     * 
     * @param dimension
     *        The full name of the dimension. The full name includes the group name and key name. The following values
     *        are valid:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db.query.statement</code> (Amazon DocumentDB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.sql.statement</code> (Amazon RDS and Aurora)
     *        </p>
     *        </li>
     */

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * <p>
     * The full name of the dimension. The full name includes the group name and key name. The following values are
     * valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.query.statement</code> (Amazon DocumentDB)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sql.statement</code> (Amazon RDS and Aurora)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The full name of the dimension. The full name includes the group name and key name. The following values
     *         are valid:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>db.query.statement</code> (Amazon DocumentDB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db.sql.statement</code> (Amazon RDS and Aurora)
     *         </p>
     *         </li>
     */

    public String getDimension() {
        return this.dimension;
    }

    /**
     * <p>
     * The full name of the dimension. The full name includes the group name and key name. The following values are
     * valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.query.statement</code> (Amazon DocumentDB)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sql.statement</code> (Amazon RDS and Aurora)
     * </p>
     * </li>
     * </ul>
     * 
     * @param dimension
     *        The full name of the dimension. The full name includes the group name and key name. The following values
     *        are valid:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db.query.statement</code> (Amazon DocumentDB)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.sql.statement</code> (Amazon RDS and Aurora)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionKeyDetail withDimension(String dimension) {
        setDimension(dimension);
        return this;
    }

    /**
     * <p>
     * The status of the dimension detail data. Possible values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The dimension detail data is ready to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROCESSING</code> - The dimension detail data isn't ready to be retrieved because more processing time is
     * required. If the requested detail data has the status <code>PROCESSING</code>, Performance Insights returns the
     * truncated query.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAVAILABLE</code> - The dimension detail data could not be collected successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the dimension detail data. Possible values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The dimension detail data is ready to be retrieved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROCESSING</code> - The dimension detail data isn't ready to be retrieved because more processing
     *        time is required. If the requested detail data has the status <code>PROCESSING</code>, Performance
     *        Insights returns the truncated query.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNAVAILABLE</code> - The dimension detail data could not be collected successfully.
     *        </p>
     *        </li>
     * @see DetailStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the dimension detail data. Possible values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The dimension detail data is ready to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROCESSING</code> - The dimension detail data isn't ready to be retrieved because more processing time is
     * required. If the requested detail data has the status <code>PROCESSING</code>, Performance Insights returns the
     * truncated query.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAVAILABLE</code> - The dimension detail data could not be collected successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the dimension detail data. Possible values include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AVAILABLE</code> - The dimension detail data is ready to be retrieved.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PROCESSING</code> - The dimension detail data isn't ready to be retrieved because more processing
     *         time is required. If the requested detail data has the status <code>PROCESSING</code>, Performance
     *         Insights returns the truncated query.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNAVAILABLE</code> - The dimension detail data could not be collected successfully.
     *         </p>
     *         </li>
     * @see DetailStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the dimension detail data. Possible values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The dimension detail data is ready to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROCESSING</code> - The dimension detail data isn't ready to be retrieved because more processing time is
     * required. If the requested detail data has the status <code>PROCESSING</code>, Performance Insights returns the
     * truncated query.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAVAILABLE</code> - The dimension detail data could not be collected successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the dimension detail data. Possible values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The dimension detail data is ready to be retrieved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROCESSING</code> - The dimension detail data isn't ready to be retrieved because more processing
     *        time is required. If the requested detail data has the status <code>PROCESSING</code>, Performance
     *        Insights returns the truncated query.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNAVAILABLE</code> - The dimension detail data could not be collected successfully.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetailStatus
     */

    public DimensionKeyDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the dimension detail data. Possible values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The dimension detail data is ready to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROCESSING</code> - The dimension detail data isn't ready to be retrieved because more processing time is
     * required. If the requested detail data has the status <code>PROCESSING</code>, Performance Insights returns the
     * truncated query.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAVAILABLE</code> - The dimension detail data could not be collected successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the dimension detail data. Possible values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The dimension detail data is ready to be retrieved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROCESSING</code> - The dimension detail data isn't ready to be retrieved because more processing
     *        time is required. If the requested detail data has the status <code>PROCESSING</code>, Performance
     *        Insights returns the truncated query.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNAVAILABLE</code> - The dimension detail data could not be collected successfully.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetailStatus
     */

    public DimensionKeyDetail withStatus(DetailStatus status) {
        this.status = status.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getDimension() != null)
            sb.append("Dimension: ").append(getDimension()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DimensionKeyDetail == false)
            return false;
        DimensionKeyDetail other = (DimensionKeyDetail) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getDimension() == null ^ this.getDimension() == null)
            return false;
        if (other.getDimension() != null && other.getDimension().equals(this.getDimension()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getDimension() == null) ? 0 : getDimension().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DimensionKeyDetail clone() {
        try {
            return (DimensionKeyDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.DimensionKeyDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
