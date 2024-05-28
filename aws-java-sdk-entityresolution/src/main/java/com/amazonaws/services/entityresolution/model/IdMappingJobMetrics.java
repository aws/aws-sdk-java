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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing <code>InputRecords</code>, <code>TotalRecordsProcessed</code>, <code>MatchIDs</code>, and
 * <code>RecordsNotProcessed</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/IdMappingJobMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdMappingJobMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of input records.
     * </p>
     */
    private Integer inputRecords;
    /**
     * <p>
     * The total number of records that did not get processed.
     * </p>
     */
    private Integer recordsNotProcessed;
    /**
     * <p>
     * The total number of records processed.
     * </p>
     */
    private Integer totalRecordsProcessed;

    /**
     * <p>
     * The total number of input records.
     * </p>
     * 
     * @param inputRecords
     *        The total number of input records.
     */

    public void setInputRecords(Integer inputRecords) {
        this.inputRecords = inputRecords;
    }

    /**
     * <p>
     * The total number of input records.
     * </p>
     * 
     * @return The total number of input records.
     */

    public Integer getInputRecords() {
        return this.inputRecords;
    }

    /**
     * <p>
     * The total number of input records.
     * </p>
     * 
     * @param inputRecords
     *        The total number of input records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdMappingJobMetrics withInputRecords(Integer inputRecords) {
        setInputRecords(inputRecords);
        return this;
    }

    /**
     * <p>
     * The total number of records that did not get processed.
     * </p>
     * 
     * @param recordsNotProcessed
     *        The total number of records that did not get processed.
     */

    public void setRecordsNotProcessed(Integer recordsNotProcessed) {
        this.recordsNotProcessed = recordsNotProcessed;
    }

    /**
     * <p>
     * The total number of records that did not get processed.
     * </p>
     * 
     * @return The total number of records that did not get processed.
     */

    public Integer getRecordsNotProcessed() {
        return this.recordsNotProcessed;
    }

    /**
     * <p>
     * The total number of records that did not get processed.
     * </p>
     * 
     * @param recordsNotProcessed
     *        The total number of records that did not get processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdMappingJobMetrics withRecordsNotProcessed(Integer recordsNotProcessed) {
        setRecordsNotProcessed(recordsNotProcessed);
        return this;
    }

    /**
     * <p>
     * The total number of records processed.
     * </p>
     * 
     * @param totalRecordsProcessed
     *        The total number of records processed.
     */

    public void setTotalRecordsProcessed(Integer totalRecordsProcessed) {
        this.totalRecordsProcessed = totalRecordsProcessed;
    }

    /**
     * <p>
     * The total number of records processed.
     * </p>
     * 
     * @return The total number of records processed.
     */

    public Integer getTotalRecordsProcessed() {
        return this.totalRecordsProcessed;
    }

    /**
     * <p>
     * The total number of records processed.
     * </p>
     * 
     * @param totalRecordsProcessed
     *        The total number of records processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdMappingJobMetrics withTotalRecordsProcessed(Integer totalRecordsProcessed) {
        setTotalRecordsProcessed(totalRecordsProcessed);
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
        if (getInputRecords() != null)
            sb.append("InputRecords: ").append(getInputRecords()).append(",");
        if (getRecordsNotProcessed() != null)
            sb.append("RecordsNotProcessed: ").append(getRecordsNotProcessed()).append(",");
        if (getTotalRecordsProcessed() != null)
            sb.append("TotalRecordsProcessed: ").append(getTotalRecordsProcessed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdMappingJobMetrics == false)
            return false;
        IdMappingJobMetrics other = (IdMappingJobMetrics) obj;
        if (other.getInputRecords() == null ^ this.getInputRecords() == null)
            return false;
        if (other.getInputRecords() != null && other.getInputRecords().equals(this.getInputRecords()) == false)
            return false;
        if (other.getRecordsNotProcessed() == null ^ this.getRecordsNotProcessed() == null)
            return false;
        if (other.getRecordsNotProcessed() != null && other.getRecordsNotProcessed().equals(this.getRecordsNotProcessed()) == false)
            return false;
        if (other.getTotalRecordsProcessed() == null ^ this.getTotalRecordsProcessed() == null)
            return false;
        if (other.getTotalRecordsProcessed() != null && other.getTotalRecordsProcessed().equals(this.getTotalRecordsProcessed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputRecords() == null) ? 0 : getInputRecords().hashCode());
        hashCode = prime * hashCode + ((getRecordsNotProcessed() == null) ? 0 : getRecordsNotProcessed().hashCode());
        hashCode = prime * hashCode + ((getTotalRecordsProcessed() == null) ? 0 : getTotalRecordsProcessed().hashCode());
        return hashCode;
    }

    @Override
    public IdMappingJobMetrics clone() {
        try {
            return (IdMappingJobMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.IdMappingJobMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
