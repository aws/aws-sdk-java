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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdateMap" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMapResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated map resource. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:map/ExampleMap</code>
     * </p>
     * </li>
     * </ul>
     */
    private String mapArn;
    /**
     * <p>
     * The name of the updated map resource.
     * </p>
     */
    private String mapName;
    /**
     * <p>
     * The timestamp for when the map resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated map resource. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:map/ExampleMap</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param mapArn
     *        The Amazon Resource Name (ARN) of the updated map resource. Used to specify a resource across AWS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:map/ExampleMap</code>
     *        </p>
     *        </li>
     */

    public void setMapArn(String mapArn) {
        this.mapArn = mapArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated map resource. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:map/ExampleMap</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the updated map resource. Used to specify a resource across AWS.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example: <code>arn:aws:geo:region:account-id:map/ExampleMap</code>
     *         </p>
     *         </li>
     */

    public String getMapArn() {
        return this.mapArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated map resource. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:map/ExampleMap</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param mapArn
     *        The Amazon Resource Name (ARN) of the updated map resource. Used to specify a resource across AWS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:map/ExampleMap</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMapResult withMapArn(String mapArn) {
        setMapArn(mapArn);
        return this;
    }

    /**
     * <p>
     * The name of the updated map resource.
     * </p>
     * 
     * @param mapName
     *        The name of the updated map resource.
     */

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    /**
     * <p>
     * The name of the updated map resource.
     * </p>
     * 
     * @return The name of the updated map resource.
     */

    public String getMapName() {
        return this.mapName;
    }

    /**
     * <p>
     * The name of the updated map resource.
     * </p>
     * 
     * @param mapName
     *        The name of the updated map resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMapResult withMapName(String mapName) {
        setMapName(mapName);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the map resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param updateTime
     *        The timestamp for when the map resource was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The timestamp for when the map resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @return The timestamp for when the map resource was last updated in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The timestamp for when the map resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param updateTime
     *        The timestamp for when the map resource was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMapResult withUpdateTime(java.util.Date updateTime) {
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
        if (getMapArn() != null)
            sb.append("MapArn: ").append(getMapArn()).append(",");
        if (getMapName() != null)
            sb.append("MapName: ").append(getMapName()).append(",");
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

        if (obj instanceof UpdateMapResult == false)
            return false;
        UpdateMapResult other = (UpdateMapResult) obj;
        if (other.getMapArn() == null ^ this.getMapArn() == null)
            return false;
        if (other.getMapArn() != null && other.getMapArn().equals(this.getMapArn()) == false)
            return false;
        if (other.getMapName() == null ^ this.getMapName() == null)
            return false;
        if (other.getMapName() != null && other.getMapName().equals(this.getMapName()) == false)
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

        hashCode = prime * hashCode + ((getMapArn() == null) ? 0 : getMapArn().hashCode());
        hashCode = prime * hashCode + ((getMapName() == null) ? 0 : getMapName().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMapResult clone() {
        try {
            return (UpdateMapResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
