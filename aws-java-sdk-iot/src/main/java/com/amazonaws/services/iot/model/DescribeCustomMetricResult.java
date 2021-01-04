/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCustomMetricResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the custom metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the custom metric.
     * </p>
     */
    private String metricArn;
    /**
     * <p>
     * The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     * <code>number-list</code>, and <code>number</code>.
     * </p>
     */
    private String metricType;
    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric; doesn't have to be unique. Don't use this
     * name as the metric identifier in the device metric report. Can be updated.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The creation date of the custom metric in milliseconds since epoch.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The time the custom metric was last modified in milliseconds since epoch.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The name of the custom metric.
     * </p>
     * 
     * @param metricName
     *        The name of the custom metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the custom metric.
     * </p>
     * 
     * @return The name of the custom metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the custom metric.
     * </p>
     * 
     * @param metricName
     *        The name of the custom metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomMetricResult withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the custom metric.
     * </p>
     * 
     * @param metricArn
     *        The Amazon Resource Number (ARN) of the custom metric.
     */

    public void setMetricArn(String metricArn) {
        this.metricArn = metricArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the custom metric.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the custom metric.
     */

    public String getMetricArn() {
        return this.metricArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the custom metric.
     * </p>
     * 
     * @param metricArn
     *        The Amazon Resource Number (ARN) of the custom metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomMetricResult withMetricArn(String metricArn) {
        setMetricArn(metricArn);
        return this;
    }

    /**
     * <p>
     * The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     * <code>number-list</code>, and <code>number</code>.
     * </p>
     * 
     * @param metricType
     *        The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     *        <code>number-list</code>, and <code>number</code>.
     * @see CustomMetricType
     */

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    /**
     * <p>
     * The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     * <code>number-list</code>, and <code>number</code>.
     * </p>
     * 
     * @return The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     *         <code>number-list</code>, and <code>number</code>.
     * @see CustomMetricType
     */

    public String getMetricType() {
        return this.metricType;
    }

    /**
     * <p>
     * The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     * <code>number-list</code>, and <code>number</code>.
     * </p>
     * 
     * @param metricType
     *        The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     *        <code>number-list</code>, and <code>number</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomMetricType
     */

    public DescribeCustomMetricResult withMetricType(String metricType) {
        setMetricType(metricType);
        return this;
    }

    /**
     * <p>
     * The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     * <code>number-list</code>, and <code>number</code>.
     * </p>
     * 
     * @param metricType
     *        The type of the custom metric. Types include <code>string-list</code>, <code>ip-address-list</code>,
     *        <code>number-list</code>, and <code>number</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomMetricType
     */

    public DescribeCustomMetricResult withMetricType(CustomMetricType metricType) {
        this.metricType = metricType.toString();
        return this;
    }

    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric; doesn't have to be unique. Don't use this
     * name as the metric identifier in the device metric report. Can be updated.
     * </p>
     * 
     * @param displayName
     *        Field represents a friendly name in the console for the custom metric; doesn't have to be unique. Don't
     *        use this name as the metric identifier in the device metric report. Can be updated.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric; doesn't have to be unique. Don't use this
     * name as the metric identifier in the device metric report. Can be updated.
     * </p>
     * 
     * @return Field represents a friendly name in the console for the custom metric; doesn't have to be unique. Don't
     *         use this name as the metric identifier in the device metric report. Can be updated.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric; doesn't have to be unique. Don't use this
     * name as the metric identifier in the device metric report. Can be updated.
     * </p>
     * 
     * @param displayName
     *        Field represents a friendly name in the console for the custom metric; doesn't have to be unique. Don't
     *        use this name as the metric identifier in the device metric report. Can be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomMetricResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The creation date of the custom metric in milliseconds since epoch.
     * </p>
     * 
     * @param creationDate
     *        The creation date of the custom metric in milliseconds since epoch.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date of the custom metric in milliseconds since epoch.
     * </p>
     * 
     * @return The creation date of the custom metric in milliseconds since epoch.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date of the custom metric in milliseconds since epoch.
     * </p>
     * 
     * @param creationDate
     *        The creation date of the custom metric in milliseconds since epoch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomMetricResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The time the custom metric was last modified in milliseconds since epoch.
     * </p>
     * 
     * @param lastModifiedDate
     *        The time the custom metric was last modified in milliseconds since epoch.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The time the custom metric was last modified in milliseconds since epoch.
     * </p>
     * 
     * @return The time the custom metric was last modified in milliseconds since epoch.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The time the custom metric was last modified in milliseconds since epoch.
     * </p>
     * 
     * @param lastModifiedDate
     *        The time the custom metric was last modified in milliseconds since epoch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomMetricResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getMetricArn() != null)
            sb.append("MetricArn: ").append(getMetricArn()).append(",");
        if (getMetricType() != null)
            sb.append("MetricType: ").append(getMetricType()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCustomMetricResult == false)
            return false;
        DescribeCustomMetricResult other = (DescribeCustomMetricResult) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricArn() == null ^ this.getMetricArn() == null)
            return false;
        if (other.getMetricArn() != null && other.getMetricArn().equals(this.getMetricArn()) == false)
            return false;
        if (other.getMetricType() == null ^ this.getMetricType() == null)
            return false;
        if (other.getMetricType() != null && other.getMetricType().equals(this.getMetricType()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getMetricArn() == null) ? 0 : getMetricArn().hashCode());
        hashCode = prime * hashCode + ((getMetricType() == null) ? 0 : getMetricType().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCustomMetricResult clone() {
        try {
            return (DescribeCustomMetricResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
