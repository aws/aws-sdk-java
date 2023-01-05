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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdatePlaceIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePlaceIndexResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the upated place index resource. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:place- index/ExamplePlaceIndex</code>
     * </p>
     * </li>
     * </ul>
     */
    private String indexArn;
    /**
     * <p>
     * The name of the updated place index resource.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The timestamp for when the place index resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the upated place index resource. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:place- index/ExamplePlaceIndex</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexArn
     *        The Amazon Resource Name (ARN) of the upated place index resource. Used to specify a resource across
     *        AWS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:place- index/ExamplePlaceIndex</code>
     *        </p>
     *        </li>
     */

    public void setIndexArn(String indexArn) {
        this.indexArn = indexArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the upated place index resource. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:place- index/ExamplePlaceIndex</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the upated place index resource. Used to specify a resource across
     *         AWS.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example: <code>arn:aws:geo:region:account-id:place- index/ExamplePlaceIndex</code>
     *         </p>
     *         </li>
     */

    public String getIndexArn() {
        return this.indexArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the upated place index resource. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:place- index/ExamplePlaceIndex</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexArn
     *        The Amazon Resource Name (ARN) of the upated place index resource. Used to specify a resource across
     *        AWS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:place- index/ExamplePlaceIndex</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePlaceIndexResult withIndexArn(String indexArn) {
        setIndexArn(indexArn);
        return this;
    }

    /**
     * <p>
     * The name of the updated place index resource.
     * </p>
     * 
     * @param indexName
     *        The name of the updated place index resource.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the updated place index resource.
     * </p>
     * 
     * @return The name of the updated place index resource.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the updated place index resource.
     * </p>
     * 
     * @param indexName
     *        The name of the updated place index resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePlaceIndexResult withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the place index resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param updateTime
     *        The timestamp for when the place index resource was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The timestamp for when the place index resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @return The timestamp for when the place index resource was last updated in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The timestamp for when the place index resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param updateTime
     *        The timestamp for when the place index resource was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePlaceIndexResult withUpdateTime(java.util.Date updateTime) {
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
        if (getIndexArn() != null)
            sb.append("IndexArn: ").append(getIndexArn()).append(",");
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
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

        if (obj instanceof UpdatePlaceIndexResult == false)
            return false;
        UpdatePlaceIndexResult other = (UpdatePlaceIndexResult) obj;
        if (other.getIndexArn() == null ^ this.getIndexArn() == null)
            return false;
        if (other.getIndexArn() != null && other.getIndexArn().equals(this.getIndexArn()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
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

        hashCode = prime * hashCode + ((getIndexArn() == null) ? 0 : getIndexArn().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePlaceIndexResult clone() {
        try {
            return (UpdatePlaceIndexResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
