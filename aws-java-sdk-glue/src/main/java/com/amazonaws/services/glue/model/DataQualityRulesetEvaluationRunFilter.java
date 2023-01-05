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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The filter criteria.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DataQualityRulesetEvaluationRunFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQualityRulesetEvaluationRunFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filter based on a data source (an Glue table) associated with the run.
     * </p>
     */
    private DataSource dataSource;
    /**
     * <p>
     * Filter results by runs that started before this time.
     * </p>
     */
    private java.util.Date startedBefore;
    /**
     * <p>
     * Filter results by runs that started after this time.
     * </p>
     */
    private java.util.Date startedAfter;

    /**
     * <p>
     * Filter based on a data source (an Glue table) associated with the run.
     * </p>
     * 
     * @param dataSource
     *        Filter based on a data source (an Glue table) associated with the run.
     */

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * Filter based on a data source (an Glue table) associated with the run.
     * </p>
     * 
     * @return Filter based on a data source (an Glue table) associated with the run.
     */

    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * Filter based on a data source (an Glue table) associated with the run.
     * </p>
     * 
     * @param dataSource
     *        Filter based on a data source (an Glue table) associated with the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRulesetEvaluationRunFilter withDataSource(DataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * Filter results by runs that started before this time.
     * </p>
     * 
     * @param startedBefore
     *        Filter results by runs that started before this time.
     */

    public void setStartedBefore(java.util.Date startedBefore) {
        this.startedBefore = startedBefore;
    }

    /**
     * <p>
     * Filter results by runs that started before this time.
     * </p>
     * 
     * @return Filter results by runs that started before this time.
     */

    public java.util.Date getStartedBefore() {
        return this.startedBefore;
    }

    /**
     * <p>
     * Filter results by runs that started before this time.
     * </p>
     * 
     * @param startedBefore
     *        Filter results by runs that started before this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRulesetEvaluationRunFilter withStartedBefore(java.util.Date startedBefore) {
        setStartedBefore(startedBefore);
        return this;
    }

    /**
     * <p>
     * Filter results by runs that started after this time.
     * </p>
     * 
     * @param startedAfter
     *        Filter results by runs that started after this time.
     */

    public void setStartedAfter(java.util.Date startedAfter) {
        this.startedAfter = startedAfter;
    }

    /**
     * <p>
     * Filter results by runs that started after this time.
     * </p>
     * 
     * @return Filter results by runs that started after this time.
     */

    public java.util.Date getStartedAfter() {
        return this.startedAfter;
    }

    /**
     * <p>
     * Filter results by runs that started after this time.
     * </p>
     * 
     * @param startedAfter
     *        Filter results by runs that started after this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRulesetEvaluationRunFilter withStartedAfter(java.util.Date startedAfter) {
        setStartedAfter(startedAfter);
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
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getStartedBefore() != null)
            sb.append("StartedBefore: ").append(getStartedBefore()).append(",");
        if (getStartedAfter() != null)
            sb.append("StartedAfter: ").append(getStartedAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataQualityRulesetEvaluationRunFilter == false)
            return false;
        DataQualityRulesetEvaluationRunFilter other = (DataQualityRulesetEvaluationRunFilter) obj;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getStartedBefore() == null ^ this.getStartedBefore() == null)
            return false;
        if (other.getStartedBefore() != null && other.getStartedBefore().equals(this.getStartedBefore()) == false)
            return false;
        if (other.getStartedAfter() == null ^ this.getStartedAfter() == null)
            return false;
        if (other.getStartedAfter() != null && other.getStartedAfter().equals(this.getStartedAfter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getStartedBefore() == null) ? 0 : getStartedBefore().hashCode());
        hashCode = prime * hashCode + ((getStartedAfter() == null) ? 0 : getStartedAfter().hashCode());
        return hashCode;
    }

    @Override
    public DataQualityRulesetEvaluationRunFilter clone() {
        try {
            return (DataQualityRulesetEvaluationRunFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DataQualityRulesetEvaluationRunFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
