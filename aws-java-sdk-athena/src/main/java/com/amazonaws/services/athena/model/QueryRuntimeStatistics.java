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
 * The query execution timeline, statistics on input and output rows and bytes, and the different query stages that form
 * the query execution plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/QueryRuntimeStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryRuntimeStatistics implements Serializable, Cloneable, StructuredPojo {

    private QueryRuntimeStatisticsTimeline timeline;

    private QueryRuntimeStatisticsRows rows;
    /**
     * <p>
     * Stage statistics such as input and output rows and bytes, execution time, and stage state. This information also
     * includes substages and the query stage plan.
     * </p>
     */
    private QueryStage outputStage;

    /**
     * @param timeline
     */

    public void setTimeline(QueryRuntimeStatisticsTimeline timeline) {
        this.timeline = timeline;
    }

    /**
     * @return
     */

    public QueryRuntimeStatisticsTimeline getTimeline() {
        return this.timeline;
    }

    /**
     * @param timeline
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRuntimeStatistics withTimeline(QueryRuntimeStatisticsTimeline timeline) {
        setTimeline(timeline);
        return this;
    }

    /**
     * @param rows
     */

    public void setRows(QueryRuntimeStatisticsRows rows) {
        this.rows = rows;
    }

    /**
     * @return
     */

    public QueryRuntimeStatisticsRows getRows() {
        return this.rows;
    }

    /**
     * @param rows
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRuntimeStatistics withRows(QueryRuntimeStatisticsRows rows) {
        setRows(rows);
        return this;
    }

    /**
     * <p>
     * Stage statistics such as input and output rows and bytes, execution time, and stage state. This information also
     * includes substages and the query stage plan.
     * </p>
     * 
     * @param outputStage
     *        Stage statistics such as input and output rows and bytes, execution time, and stage state. This
     *        information also includes substages and the query stage plan.
     */

    public void setOutputStage(QueryStage outputStage) {
        this.outputStage = outputStage;
    }

    /**
     * <p>
     * Stage statistics such as input and output rows and bytes, execution time, and stage state. This information also
     * includes substages and the query stage plan.
     * </p>
     * 
     * @return Stage statistics such as input and output rows and bytes, execution time, and stage state. This
     *         information also includes substages and the query stage plan.
     */

    public QueryStage getOutputStage() {
        return this.outputStage;
    }

    /**
     * <p>
     * Stage statistics such as input and output rows and bytes, execution time, and stage state. This information also
     * includes substages and the query stage plan.
     * </p>
     * 
     * @param outputStage
     *        Stage statistics such as input and output rows and bytes, execution time, and stage state. This
     *        information also includes substages and the query stage plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRuntimeStatistics withOutputStage(QueryStage outputStage) {
        setOutputStage(outputStage);
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
        if (getTimeline() != null)
            sb.append("Timeline: ").append(getTimeline()).append(",");
        if (getRows() != null)
            sb.append("Rows: ").append(getRows()).append(",");
        if (getOutputStage() != null)
            sb.append("OutputStage: ").append(getOutputStage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryRuntimeStatistics == false)
            return false;
        QueryRuntimeStatistics other = (QueryRuntimeStatistics) obj;
        if (other.getTimeline() == null ^ this.getTimeline() == null)
            return false;
        if (other.getTimeline() != null && other.getTimeline().equals(this.getTimeline()) == false)
            return false;
        if (other.getRows() == null ^ this.getRows() == null)
            return false;
        if (other.getRows() != null && other.getRows().equals(this.getRows()) == false)
            return false;
        if (other.getOutputStage() == null ^ this.getOutputStage() == null)
            return false;
        if (other.getOutputStage() != null && other.getOutputStage().equals(this.getOutputStage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeline() == null) ? 0 : getTimeline().hashCode());
        hashCode = prime * hashCode + ((getRows() == null) ? 0 : getRows().hashCode());
        hashCode = prime * hashCode + ((getOutputStage() == null) ? 0 : getOutputStage().hashCode());
        return hashCode;
    }

    @Override
    public QueryRuntimeStatistics clone() {
        try {
            return (QueryRuntimeStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.QueryRuntimeStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
