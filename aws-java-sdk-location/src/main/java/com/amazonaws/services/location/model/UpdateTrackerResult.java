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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdateTracker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTrackerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated tracker resource. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:tracker/ExampleTracker</code>
     * </p>
     * </li>
     * </ul>
     */
    private String trackerArn;
    /**
     * <p>
     * The name of the updated tracker resource.
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
     * The Amazon Resource Name (ARN) of the updated tracker resource. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:tracker/ExampleTracker</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param trackerArn
     *        The Amazon Resource Name (ARN) of the updated tracker resource. Used to specify a resource across AWS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:tracker/ExampleTracker</code>
     *        </p>
     *        </li>
     */

    public void setTrackerArn(String trackerArn) {
        this.trackerArn = trackerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated tracker resource. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:tracker/ExampleTracker</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the updated tracker resource. Used to specify a resource across
     *         AWS.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example: <code>arn:aws:geo:region:account-id:tracker/ExampleTracker</code>
     *         </p>
     *         </li>
     */

    public String getTrackerArn() {
        return this.trackerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated tracker resource. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:tracker/ExampleTracker</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param trackerArn
     *        The Amazon Resource Name (ARN) of the updated tracker resource. Used to specify a resource across AWS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:tracker/ExampleTracker</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrackerResult withTrackerArn(String trackerArn) {
        setTrackerArn(trackerArn);
        return this;
    }

    /**
     * <p>
     * The name of the updated tracker resource.
     * </p>
     * 
     * @param trackerName
     *        The name of the updated tracker resource.
     */

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The name of the updated tracker resource.
     * </p>
     * 
     * @return The name of the updated tracker resource.
     */

    public String getTrackerName() {
        return this.trackerName;
    }

    /**
     * <p>
     * The name of the updated tracker resource.
     * </p>
     * 
     * @param trackerName
     *        The name of the updated tracker resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrackerResult withTrackerName(String trackerName) {
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

    public UpdateTrackerResult withUpdateTime(java.util.Date updateTime) {
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

        if (obj instanceof UpdateTrackerResult == false)
            return false;
        UpdateTrackerResult other = (UpdateTrackerResult) obj;
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

        hashCode = prime * hashCode + ((getTrackerArn() == null) ? 0 : getTrackerArn().hashCode());
        hashCode = prime * hashCode + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTrackerResult clone() {
        try {
            return (UpdateTrackerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
