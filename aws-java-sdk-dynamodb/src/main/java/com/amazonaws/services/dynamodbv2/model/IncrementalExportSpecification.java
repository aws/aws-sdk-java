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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Optional object containing the parameters specific to an incremental export.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/IncrementalExportSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IncrementalExportSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Time in the past which provides the inclusive start range for the export table's data, counted in seconds from
     * the start of the Unix epoch. The incremental export will reflect the table's state including and after this point
     * in time.
     * </p>
     */
    private java.util.Date exportFromTime;
    /**
     * <p>
     * Time in the past which provides the exclusive end range for the export table's data, counted in seconds from the
     * start of the Unix epoch. The incremental export will reflect the table's state just prior to this point in time.
     * If this is not provided, the latest time with data available will be used.
     * </p>
     */
    private java.util.Date exportToTime;
    /**
     * <p>
     * The view type that was chosen for the export. Valid values are <code>NEW_AND_OLD_IMAGES</code> and
     * <code>NEW_IMAGES</code>. The default value is <code>NEW_AND_OLD_IMAGES</code>.
     * </p>
     */
    private String exportViewType;

    /**
     * <p>
     * Time in the past which provides the inclusive start range for the export table's data, counted in seconds from
     * the start of the Unix epoch. The incremental export will reflect the table's state including and after this point
     * in time.
     * </p>
     * 
     * @param exportFromTime
     *        Time in the past which provides the inclusive start range for the export table's data, counted in seconds
     *        from the start of the Unix epoch. The incremental export will reflect the table's state including and
     *        after this point in time.
     */

    public void setExportFromTime(java.util.Date exportFromTime) {
        this.exportFromTime = exportFromTime;
    }

    /**
     * <p>
     * Time in the past which provides the inclusive start range for the export table's data, counted in seconds from
     * the start of the Unix epoch. The incremental export will reflect the table's state including and after this point
     * in time.
     * </p>
     * 
     * @return Time in the past which provides the inclusive start range for the export table's data, counted in seconds
     *         from the start of the Unix epoch. The incremental export will reflect the table's state including and
     *         after this point in time.
     */

    public java.util.Date getExportFromTime() {
        return this.exportFromTime;
    }

    /**
     * <p>
     * Time in the past which provides the inclusive start range for the export table's data, counted in seconds from
     * the start of the Unix epoch. The incremental export will reflect the table's state including and after this point
     * in time.
     * </p>
     * 
     * @param exportFromTime
     *        Time in the past which provides the inclusive start range for the export table's data, counted in seconds
     *        from the start of the Unix epoch. The incremental export will reflect the table's state including and
     *        after this point in time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncrementalExportSpecification withExportFromTime(java.util.Date exportFromTime) {
        setExportFromTime(exportFromTime);
        return this;
    }

    /**
     * <p>
     * Time in the past which provides the exclusive end range for the export table's data, counted in seconds from the
     * start of the Unix epoch. The incremental export will reflect the table's state just prior to this point in time.
     * If this is not provided, the latest time with data available will be used.
     * </p>
     * 
     * @param exportToTime
     *        Time in the past which provides the exclusive end range for the export table's data, counted in seconds
     *        from the start of the Unix epoch. The incremental export will reflect the table's state just prior to this
     *        point in time. If this is not provided, the latest time with data available will be used.
     */

    public void setExportToTime(java.util.Date exportToTime) {
        this.exportToTime = exportToTime;
    }

    /**
     * <p>
     * Time in the past which provides the exclusive end range for the export table's data, counted in seconds from the
     * start of the Unix epoch. The incremental export will reflect the table's state just prior to this point in time.
     * If this is not provided, the latest time with data available will be used.
     * </p>
     * 
     * @return Time in the past which provides the exclusive end range for the export table's data, counted in seconds
     *         from the start of the Unix epoch. The incremental export will reflect the table's state just prior to
     *         this point in time. If this is not provided, the latest time with data available will be used.
     */

    public java.util.Date getExportToTime() {
        return this.exportToTime;
    }

    /**
     * <p>
     * Time in the past which provides the exclusive end range for the export table's data, counted in seconds from the
     * start of the Unix epoch. The incremental export will reflect the table's state just prior to this point in time.
     * If this is not provided, the latest time with data available will be used.
     * </p>
     * 
     * @param exportToTime
     *        Time in the past which provides the exclusive end range for the export table's data, counted in seconds
     *        from the start of the Unix epoch. The incremental export will reflect the table's state just prior to this
     *        point in time. If this is not provided, the latest time with data available will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncrementalExportSpecification withExportToTime(java.util.Date exportToTime) {
        setExportToTime(exportToTime);
        return this;
    }

    /**
     * <p>
     * The view type that was chosen for the export. Valid values are <code>NEW_AND_OLD_IMAGES</code> and
     * <code>NEW_IMAGES</code>. The default value is <code>NEW_AND_OLD_IMAGES</code>.
     * </p>
     * 
     * @param exportViewType
     *        The view type that was chosen for the export. Valid values are <code>NEW_AND_OLD_IMAGES</code> and
     *        <code>NEW_IMAGES</code>. The default value is <code>NEW_AND_OLD_IMAGES</code>.
     * @see ExportViewType
     */

    public void setExportViewType(String exportViewType) {
        this.exportViewType = exportViewType;
    }

    /**
     * <p>
     * The view type that was chosen for the export. Valid values are <code>NEW_AND_OLD_IMAGES</code> and
     * <code>NEW_IMAGES</code>. The default value is <code>NEW_AND_OLD_IMAGES</code>.
     * </p>
     * 
     * @return The view type that was chosen for the export. Valid values are <code>NEW_AND_OLD_IMAGES</code> and
     *         <code>NEW_IMAGES</code>. The default value is <code>NEW_AND_OLD_IMAGES</code>.
     * @see ExportViewType
     */

    public String getExportViewType() {
        return this.exportViewType;
    }

    /**
     * <p>
     * The view type that was chosen for the export. Valid values are <code>NEW_AND_OLD_IMAGES</code> and
     * <code>NEW_IMAGES</code>. The default value is <code>NEW_AND_OLD_IMAGES</code>.
     * </p>
     * 
     * @param exportViewType
     *        The view type that was chosen for the export. Valid values are <code>NEW_AND_OLD_IMAGES</code> and
     *        <code>NEW_IMAGES</code>. The default value is <code>NEW_AND_OLD_IMAGES</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportViewType
     */

    public IncrementalExportSpecification withExportViewType(String exportViewType) {
        setExportViewType(exportViewType);
        return this;
    }

    /**
     * <p>
     * The view type that was chosen for the export. Valid values are <code>NEW_AND_OLD_IMAGES</code> and
     * <code>NEW_IMAGES</code>. The default value is <code>NEW_AND_OLD_IMAGES</code>.
     * </p>
     * 
     * @param exportViewType
     *        The view type that was chosen for the export. Valid values are <code>NEW_AND_OLD_IMAGES</code> and
     *        <code>NEW_IMAGES</code>. The default value is <code>NEW_AND_OLD_IMAGES</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportViewType
     */

    public IncrementalExportSpecification withExportViewType(ExportViewType exportViewType) {
        this.exportViewType = exportViewType.toString();
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
        if (getExportFromTime() != null)
            sb.append("ExportFromTime: ").append(getExportFromTime()).append(",");
        if (getExportToTime() != null)
            sb.append("ExportToTime: ").append(getExportToTime()).append(",");
        if (getExportViewType() != null)
            sb.append("ExportViewType: ").append(getExportViewType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IncrementalExportSpecification == false)
            return false;
        IncrementalExportSpecification other = (IncrementalExportSpecification) obj;
        if (other.getExportFromTime() == null ^ this.getExportFromTime() == null)
            return false;
        if (other.getExportFromTime() != null && other.getExportFromTime().equals(this.getExportFromTime()) == false)
            return false;
        if (other.getExportToTime() == null ^ this.getExportToTime() == null)
            return false;
        if (other.getExportToTime() != null && other.getExportToTime().equals(this.getExportToTime()) == false)
            return false;
        if (other.getExportViewType() == null ^ this.getExportViewType() == null)
            return false;
        if (other.getExportViewType() != null && other.getExportViewType().equals(this.getExportViewType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportFromTime() == null) ? 0 : getExportFromTime().hashCode());
        hashCode = prime * hashCode + ((getExportToTime() == null) ? 0 : getExportToTime().hashCode());
        hashCode = prime * hashCode + ((getExportViewType() == null) ? 0 : getExportViewType().hashCode());
        return hashCode;
    }

    @Override
    public IncrementalExportSpecification clone() {
        try {
            return (IncrementalExportSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.IncrementalExportSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
