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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>CreateDataSourceFromRDS</code> operation, and is an acknowledgement that Amazon ML
 * received the request.
 * </p>
 * <p>
 * The <code>CreateDataSourceFromRDS</code>&gt; operation is asynchronous. You can poll for updates by using the
 * <code>GetBatchPrediction</code> operation and checking the <code>Status</code> parameter. You can inspect the
 * <code>Message</code> when <code>Status</code> shows up as <code>FAILED</code>. You can also check the progress of the
 * copy operation by going to the <code>DataPipeline</code> console and looking up the pipeline using the
 * <code>pipelineId </code> from the describe call.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataSourceFromRDSResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the datasource. This value should be identical to the value of the
     * <code>DataSourceID</code> in the request.
     * </p>
     */
    private String dataSourceId;

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the datasource. This value should be identical to the value of the
     * <code>DataSourceID</code> in the request.
     * </p>
     * 
     * @param dataSourceId
     *        A user-supplied ID that uniquely identifies the datasource. This value should be identical to the value of
     *        the <code>DataSourceID</code> in the request.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the datasource. This value should be identical to the value of the
     * <code>DataSourceID</code> in the request.
     * </p>
     * 
     * @return A user-supplied ID that uniquely identifies the datasource. This value should be identical to the value
     *         of the <code>DataSourceID</code> in the request.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the datasource. This value should be identical to the value of the
     * <code>DataSourceID</code> in the request.
     * </p>
     * 
     * @param dataSourceId
     *        A user-supplied ID that uniquely identifies the datasource. This value should be identical to the value of
     *        the <code>DataSourceID</code> in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceFromRDSResult withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
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
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataSourceFromRDSResult == false)
            return false;
        CreateDataSourceFromRDSResult other = (CreateDataSourceFromRDSResult) obj;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataSourceFromRDSResult clone() {
        try {
            return (CreateDataSourceFromRDSResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
