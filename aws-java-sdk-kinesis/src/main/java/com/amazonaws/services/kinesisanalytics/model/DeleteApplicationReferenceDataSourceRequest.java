/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeleteApplicationReferenceDataSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of an existing application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Version of the application. You can use the <a>DescribeApplication</a> operation to get the current application
     * version. If the version specified is not the current version, the <code>ConcurrentModificationException</code> is
     * returned.
     * </p>
     */
    private Long currentApplicationVersionId;
    /**
     * <p>
     * ID of the reference data source. When you add a reference data source to your application using the
     * <a>AddApplicationReferenceDataSource</a>, Amazon Kinesis Analytics assigns an ID. You can use the
     * <a>DescribeApplication</a> operation to get the reference ID.
     * </p>
     */
    private String referenceId;

    /**
     * <p>
     * Name of an existing application.
     * </p>
     * 
     * @param applicationName
     *        Name of an existing application.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * Name of an existing application.
     * </p>
     * 
     * @return Name of an existing application.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * Name of an existing application.
     * </p>
     * 
     * @param applicationName
     *        Name of an existing application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationReferenceDataSourceRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Version of the application. You can use the <a>DescribeApplication</a> operation to get the current application
     * version. If the version specified is not the current version, the <code>ConcurrentModificationException</code> is
     * returned.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        Version of the application. You can use the <a>DescribeApplication</a> operation to get the current
     *        application version. If the version specified is not the current version, the
     *        <code>ConcurrentModificationException</code> is returned.
     */

    public void setCurrentApplicationVersionId(Long currentApplicationVersionId) {
        this.currentApplicationVersionId = currentApplicationVersionId;
    }

    /**
     * <p>
     * Version of the application. You can use the <a>DescribeApplication</a> operation to get the current application
     * version. If the version specified is not the current version, the <code>ConcurrentModificationException</code> is
     * returned.
     * </p>
     * 
     * @return Version of the application. You can use the <a>DescribeApplication</a> operation to get the current
     *         application version. If the version specified is not the current version, the
     *         <code>ConcurrentModificationException</code> is returned.
     */

    public Long getCurrentApplicationVersionId() {
        return this.currentApplicationVersionId;
    }

    /**
     * <p>
     * Version of the application. You can use the <a>DescribeApplication</a> operation to get the current application
     * version. If the version specified is not the current version, the <code>ConcurrentModificationException</code> is
     * returned.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        Version of the application. You can use the <a>DescribeApplication</a> operation to get the current
     *        application version. If the version specified is not the current version, the
     *        <code>ConcurrentModificationException</code> is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationReferenceDataSourceRequest withCurrentApplicationVersionId(Long currentApplicationVersionId) {
        setCurrentApplicationVersionId(currentApplicationVersionId);
        return this;
    }

    /**
     * <p>
     * ID of the reference data source. When you add a reference data source to your application using the
     * <a>AddApplicationReferenceDataSource</a>, Amazon Kinesis Analytics assigns an ID. You can use the
     * <a>DescribeApplication</a> operation to get the reference ID.
     * </p>
     * 
     * @param referenceId
     *        ID of the reference data source. When you add a reference data source to your application using the
     *        <a>AddApplicationReferenceDataSource</a>, Amazon Kinesis Analytics assigns an ID. You can use the
     *        <a>DescribeApplication</a> operation to get the reference ID.
     */

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * ID of the reference data source. When you add a reference data source to your application using the
     * <a>AddApplicationReferenceDataSource</a>, Amazon Kinesis Analytics assigns an ID. You can use the
     * <a>DescribeApplication</a> operation to get the reference ID.
     * </p>
     * 
     * @return ID of the reference data source. When you add a reference data source to your application using the
     *         <a>AddApplicationReferenceDataSource</a>, Amazon Kinesis Analytics assigns an ID. You can use the
     *         <a>DescribeApplication</a> operation to get the reference ID.
     */

    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * <p>
     * ID of the reference data source. When you add a reference data source to your application using the
     * <a>AddApplicationReferenceDataSource</a>, Amazon Kinesis Analytics assigns an ID. You can use the
     * <a>DescribeApplication</a> operation to get the reference ID.
     * </p>
     * 
     * @param referenceId
     *        ID of the reference data source. When you add a reference data source to your application using the
     *        <a>AddApplicationReferenceDataSource</a>, Amazon Kinesis Analytics assigns an ID. You can use the
     *        <a>DescribeApplication</a> operation to get the reference ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationReferenceDataSourceRequest withReferenceId(String referenceId) {
        setReferenceId(referenceId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getCurrentApplicationVersionId() != null)
            sb.append("CurrentApplicationVersionId: " + getCurrentApplicationVersionId() + ",");
        if (getReferenceId() != null)
            sb.append("ReferenceId: " + getReferenceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApplicationReferenceDataSourceRequest == false)
            return false;
        DeleteApplicationReferenceDataSourceRequest other = (DeleteApplicationReferenceDataSourceRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getCurrentApplicationVersionId() == null ^ this.getCurrentApplicationVersionId() == null)
            return false;
        if (other.getCurrentApplicationVersionId() != null && other.getCurrentApplicationVersionId().equals(this.getCurrentApplicationVersionId()) == false)
            return false;
        if (other.getReferenceId() == null ^ this.getReferenceId() == null)
            return false;
        if (other.getReferenceId() != null && other.getReferenceId().equals(this.getReferenceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getCurrentApplicationVersionId() == null) ? 0 : getCurrentApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getReferenceId() == null) ? 0 : getReferenceId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteApplicationReferenceDataSourceRequest clone() {
        return (DeleteApplicationReferenceDataSourceRequest) super.clone();
    }
}
