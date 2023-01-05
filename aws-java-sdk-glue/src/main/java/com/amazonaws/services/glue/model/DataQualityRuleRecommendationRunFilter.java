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
 * A filter for listing data quality recommendation runs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DataQualityRuleRecommendationRunFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQualityRuleRecommendationRunFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filter based on a specified data source (Glue table).
     * </p>
     */
    private DataSource dataSource;
    /**
     * <p>
     * Filter based on time for results started before provided time.
     * </p>
     */
    private java.util.Date startedBefore;
    /**
     * <p>
     * Filter based on time for results started after provided time.
     * </p>
     */
    private java.util.Date startedAfter;

    /**
     * <p>
     * Filter based on a specified data source (Glue table).
     * </p>
     * 
     * @param dataSource
     *        Filter based on a specified data source (Glue table).
     */

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * Filter based on a specified data source (Glue table).
     * </p>
     * 
     * @return Filter based on a specified data source (Glue table).
     */

    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * Filter based on a specified data source (Glue table).
     * </p>
     * 
     * @param dataSource
     *        Filter based on a specified data source (Glue table).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRuleRecommendationRunFilter withDataSource(DataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * Filter based on time for results started before provided time.
     * </p>
     * 
     * @param startedBefore
     *        Filter based on time for results started before provided time.
     */

    public void setStartedBefore(java.util.Date startedBefore) {
        this.startedBefore = startedBefore;
    }

    /**
     * <p>
     * Filter based on time for results started before provided time.
     * </p>
     * 
     * @return Filter based on time for results started before provided time.
     */

    public java.util.Date getStartedBefore() {
        return this.startedBefore;
    }

    /**
     * <p>
     * Filter based on time for results started before provided time.
     * </p>
     * 
     * @param startedBefore
     *        Filter based on time for results started before provided time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRuleRecommendationRunFilter withStartedBefore(java.util.Date startedBefore) {
        setStartedBefore(startedBefore);
        return this;
    }

    /**
     * <p>
     * Filter based on time for results started after provided time.
     * </p>
     * 
     * @param startedAfter
     *        Filter based on time for results started after provided time.
     */

    public void setStartedAfter(java.util.Date startedAfter) {
        this.startedAfter = startedAfter;
    }

    /**
     * <p>
     * Filter based on time for results started after provided time.
     * </p>
     * 
     * @return Filter based on time for results started after provided time.
     */

    public java.util.Date getStartedAfter() {
        return this.startedAfter;
    }

    /**
     * <p>
     * Filter based on time for results started after provided time.
     * </p>
     * 
     * @param startedAfter
     *        Filter based on time for results started after provided time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRuleRecommendationRunFilter withStartedAfter(java.util.Date startedAfter) {
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

        if (obj instanceof DataQualityRuleRecommendationRunFilter == false)
            return false;
        DataQualityRuleRecommendationRunFilter other = (DataQualityRuleRecommendationRunFilter) obj;
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
    public DataQualityRuleRecommendationRunFilter clone() {
        try {
            return (DataQualityRuleRecommendationRunFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DataQualityRuleRecommendationRunFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
