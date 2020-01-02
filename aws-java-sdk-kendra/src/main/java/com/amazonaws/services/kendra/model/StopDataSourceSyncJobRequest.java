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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/StopDataSourceSyncJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopDataSourceSyncJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the data source for which to stop the synchronization jobs.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identifier of the index that contains the data source.
     * </p>
     */
    private String indexId;

    /**
     * <p>
     * The identifier of the data source for which to stop the synchronization jobs.
     * </p>
     * 
     * @param id
     *        The identifier of the data source for which to stop the synchronization jobs.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the data source for which to stop the synchronization jobs.
     * </p>
     * 
     * @return The identifier of the data source for which to stop the synchronization jobs.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the data source for which to stop the synchronization jobs.
     * </p>
     * 
     * @param id
     *        The identifier of the data source for which to stop the synchronization jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDataSourceSyncJobRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifier of the index that contains the data source.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that contains the data source.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the data source.
     * </p>
     * 
     * @return The identifier of the index that contains the data source.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the data source.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that contains the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDataSourceSyncJobRequest withIndexId(String indexId) {
        setIndexId(indexId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDataSourceSyncJobRequest == false)
            return false;
        StopDataSourceSyncJobRequest other = (StopDataSourceSyncJobRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        return hashCode;
    }

    @Override
    public StopDataSourceSyncJobRequest clone() {
        return (StopDataSourceSyncJobRequest) super.clone();
    }

}
