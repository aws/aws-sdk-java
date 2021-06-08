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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateGeofenceCollection" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGeofenceCollectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a resource
     * across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     * </p>
     * </li>
     * </ul>
     */
    private String collectionArn;
    /**
     * <p>
     * The name for the geofence collection.
     * </p>
     */
    private String collectionName;
    /**
     * <p>
     * The timestamp for when the geofence collection was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a resource
     * across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param collectionArn
     *        The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a
     *        resource across all AWS. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     *        </p>
     *        </li>
     */

    public void setCollectionArn(String collectionArn) {
        this.collectionArn = collectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a resource
     * across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a
     *         resource across all AWS. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     *         </p>
     *         </li>
     */

    public String getCollectionArn() {
        return this.collectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a resource
     * across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param collectionArn
     *        The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a
     *        resource across all AWS. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGeofenceCollectionResult withCollectionArn(String collectionArn) {
        setCollectionArn(collectionArn);
        return this;
    }

    /**
     * <p>
     * The name for the geofence collection.
     * </p>
     * 
     * @param collectionName
     *        The name for the geofence collection.
     */

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The name for the geofence collection.
     * </p>
     * 
     * @return The name for the geofence collection.
     */

    public String getCollectionName() {
        return this.collectionName;
    }

    /**
     * <p>
     * The name for the geofence collection.
     * </p>
     * 
     * @param collectionName
     *        The name for the geofence collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGeofenceCollectionResult withCollectionName(String collectionName) {
        setCollectionName(collectionName);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @param createTime
     *        The timestamp for when the geofence collection was created in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @return The timestamp for when the geofence collection was created in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @param createTime
     *        The timestamp for when the geofence collection was created in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGeofenceCollectionResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
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
        if (getCollectionArn() != null)
            sb.append("CollectionArn: ").append(getCollectionArn()).append(",");
        if (getCollectionName() != null)
            sb.append("CollectionName: ").append(getCollectionName()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGeofenceCollectionResult == false)
            return false;
        CreateGeofenceCollectionResult other = (CreateGeofenceCollectionResult) obj;
        if (other.getCollectionArn() == null ^ this.getCollectionArn() == null)
            return false;
        if (other.getCollectionArn() != null && other.getCollectionArn().equals(this.getCollectionArn()) == false)
            return false;
        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionArn() == null) ? 0 : getCollectionArn().hashCode());
        hashCode = prime * hashCode + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return hashCode;
    }

    @Override
    public CreateGeofenceCollectionResult clone() {
        try {
            return (CreateGeofenceCollectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
