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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetColumnStatisticsTaskRun" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetColumnStatisticsTaskRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>ColumnStatisticsTaskRun</code> object representing the details of the column stats run.
     * </p>
     */
    private ColumnStatisticsTaskRun columnStatisticsTaskRun;

    /**
     * <p>
     * A <code>ColumnStatisticsTaskRun</code> object representing the details of the column stats run.
     * </p>
     * 
     * @param columnStatisticsTaskRun
     *        A <code>ColumnStatisticsTaskRun</code> object representing the details of the column stats run.
     */

    public void setColumnStatisticsTaskRun(ColumnStatisticsTaskRun columnStatisticsTaskRun) {
        this.columnStatisticsTaskRun = columnStatisticsTaskRun;
    }

    /**
     * <p>
     * A <code>ColumnStatisticsTaskRun</code> object representing the details of the column stats run.
     * </p>
     * 
     * @return A <code>ColumnStatisticsTaskRun</code> object representing the details of the column stats run.
     */

    public ColumnStatisticsTaskRun getColumnStatisticsTaskRun() {
        return this.columnStatisticsTaskRun;
    }

    /**
     * <p>
     * A <code>ColumnStatisticsTaskRun</code> object representing the details of the column stats run.
     * </p>
     * 
     * @param columnStatisticsTaskRun
     *        A <code>ColumnStatisticsTaskRun</code> object representing the details of the column stats run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetColumnStatisticsTaskRunResult withColumnStatisticsTaskRun(ColumnStatisticsTaskRun columnStatisticsTaskRun) {
        setColumnStatisticsTaskRun(columnStatisticsTaskRun);
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
        if (getColumnStatisticsTaskRun() != null)
            sb.append("ColumnStatisticsTaskRun: ").append(getColumnStatisticsTaskRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetColumnStatisticsTaskRunResult == false)
            return false;
        GetColumnStatisticsTaskRunResult other = (GetColumnStatisticsTaskRunResult) obj;
        if (other.getColumnStatisticsTaskRun() == null ^ this.getColumnStatisticsTaskRun() == null)
            return false;
        if (other.getColumnStatisticsTaskRun() != null && other.getColumnStatisticsTaskRun().equals(this.getColumnStatisticsTaskRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnStatisticsTaskRun() == null) ? 0 : getColumnStatisticsTaskRun().hashCode());
        return hashCode;
    }

    @Override
    public GetColumnStatisticsTaskRunResult clone() {
        try {
            return (GetColumnStatisticsTaskRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
