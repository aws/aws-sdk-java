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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeDatastore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatastoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the data store
     * </p>
     */
    private String datastoreName;
    /**
     * <p>
     * If true, additional statistical information about the datastore is included in the response.
     * </p>
     */
    private Boolean includeStatistics;

    /**
     * <p>
     * The name of the data store
     * </p>
     * 
     * @param datastoreName
     *        The name of the data store
     */

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    /**
     * <p>
     * The name of the data store
     * </p>
     * 
     * @return The name of the data store
     */

    public String getDatastoreName() {
        return this.datastoreName;
    }

    /**
     * <p>
     * The name of the data store
     * </p>
     * 
     * @param datastoreName
     *        The name of the data store
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatastoreRequest withDatastoreName(String datastoreName) {
        setDatastoreName(datastoreName);
        return this;
    }

    /**
     * <p>
     * If true, additional statistical information about the datastore is included in the response.
     * </p>
     * 
     * @param includeStatistics
     *        If true, additional statistical information about the datastore is included in the response.
     */

    public void setIncludeStatistics(Boolean includeStatistics) {
        this.includeStatistics = includeStatistics;
    }

    /**
     * <p>
     * If true, additional statistical information about the datastore is included in the response.
     * </p>
     * 
     * @return If true, additional statistical information about the datastore is included in the response.
     */

    public Boolean getIncludeStatistics() {
        return this.includeStatistics;
    }

    /**
     * <p>
     * If true, additional statistical information about the datastore is included in the response.
     * </p>
     * 
     * @param includeStatistics
     *        If true, additional statistical information about the datastore is included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatastoreRequest withIncludeStatistics(Boolean includeStatistics) {
        setIncludeStatistics(includeStatistics);
        return this;
    }

    /**
     * <p>
     * If true, additional statistical information about the datastore is included in the response.
     * </p>
     * 
     * @return If true, additional statistical information about the datastore is included in the response.
     */

    public Boolean isIncludeStatistics() {
        return this.includeStatistics;
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
        if (getDatastoreName() != null)
            sb.append("DatastoreName: ").append(getDatastoreName()).append(",");
        if (getIncludeStatistics() != null)
            sb.append("IncludeStatistics: ").append(getIncludeStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatastoreRequest == false)
            return false;
        DescribeDatastoreRequest other = (DescribeDatastoreRequest) obj;
        if (other.getDatastoreName() == null ^ this.getDatastoreName() == null)
            return false;
        if (other.getDatastoreName() != null && other.getDatastoreName().equals(this.getDatastoreName()) == false)
            return false;
        if (other.getIncludeStatistics() == null ^ this.getIncludeStatistics() == null)
            return false;
        if (other.getIncludeStatistics() != null && other.getIncludeStatistics().equals(this.getIncludeStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreName() == null) ? 0 : getDatastoreName().hashCode());
        hashCode = prime * hashCode + ((getIncludeStatistics() == null) ? 0 : getIncludeStatistics().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDatastoreRequest clone() {
        return (DescribeDatastoreRequest) super.clone();
    }

}
