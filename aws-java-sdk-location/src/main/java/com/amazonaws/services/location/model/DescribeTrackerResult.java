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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeTracker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrackerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp for when the tracker resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The optional description for the tracker resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the tracker resource. Used when you need to specify a resource across all AWS.
     * </p>
     */
    private String trackerArn;
    /**
     * <p>
     * The name of the tracker resource.
     * </p>
     */
    private String trackerName;
    /**
     * <p>
     * The timestamp for when the tracker resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The timestamp for when the tracker resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param createTime
     *        The timestamp for when the tracker resource was created in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp for when the tracker resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @return The timestamp for when the tracker resource was created in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The timestamp for when the tracker resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param createTime
     *        The timestamp for when the tracker resource was created in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrackerResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The optional description for the tracker resource.
     * </p>
     * 
     * @param description
     *        The optional description for the tracker resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description for the tracker resource.
     * </p>
     * 
     * @return The optional description for the tracker resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The optional description for the tracker resource.
     * </p>
     * 
     * @param description
     *        The optional description for the tracker resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrackerResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the tracker resource. Used when you need to specify a resource across all AWS.
     * </p>
     * 
     * @param trackerArn
     *        The Amazon Resource Name (ARN) for the tracker resource. Used when you need to specify a resource across
     *        all AWS.
     */

    public void setTrackerArn(String trackerArn) {
        this.trackerArn = trackerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the tracker resource. Used when you need to specify a resource across all AWS.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the tracker resource. Used when you need to specify a resource across
     *         all AWS.
     */

    public String getTrackerArn() {
        return this.trackerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the tracker resource. Used when you need to specify a resource across all AWS.
     * </p>
     * 
     * @param trackerArn
     *        The Amazon Resource Name (ARN) for the tracker resource. Used when you need to specify a resource across
     *        all AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrackerResult withTrackerArn(String trackerArn) {
        setTrackerArn(trackerArn);
        return this;
    }

    /**
     * <p>
     * The name of the tracker resource.
     * </p>
     * 
     * @param trackerName
     *        The name of the tracker resource.
     */

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource.
     * </p>
     * 
     * @return The name of the tracker resource.
     */

    public String getTrackerName() {
        return this.trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource.
     * </p>
     * 
     * @param trackerName
     *        The name of the tracker resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrackerResult withTrackerName(String trackerName) {
        setTrackerName(trackerName);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the tracker resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param updateTime
     *        The timestamp for when the tracker resource was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The timestamp for when the tracker resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @return The timestamp for when the tracker resource was last updated in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The timestamp for when the tracker resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param updateTime
     *        The timestamp for when the tracker resource was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrackerResult withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTrackerArn() != null)
            sb.append("TrackerArn: ").append(getTrackerArn()).append(",");
        if (getTrackerName() != null)
            sb.append("TrackerName: ").append(getTrackerName()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrackerResult == false)
            return false;
        DescribeTrackerResult other = (DescribeTrackerResult) obj;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTrackerArn() == null ^ this.getTrackerArn() == null)
            return false;
        if (other.getTrackerArn() != null && other.getTrackerArn().equals(this.getTrackerArn()) == false)
            return false;
        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTrackerArn() == null) ? 0 : getTrackerArn().hashCode());
        hashCode = prime * hashCode + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrackerResult clone() {
        try {
            return (DescribeTrackerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
