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
public class UpdateDimensionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the dimension.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN)of the created dimension.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type of the dimension.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The value or list of values used to scope the dimension. For example, for topic filters, this is the pattern used
     * to match the MQTT topic name.
     * </p>
     */
    private java.util.List<String> stringValues;
    /**
     * <p>
     * The date and time, in milliseconds since epoch, when the dimension was initially created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date and time, in milliseconds since epoch, when the dimension was most recently updated.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * A unique identifier for the dimension.
     * </p>
     * 
     * @param name
     *        A unique identifier for the dimension.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique identifier for the dimension.
     * </p>
     * 
     * @return A unique identifier for the dimension.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique identifier for the dimension.
     * </p>
     * 
     * @param name
     *        A unique identifier for the dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDimensionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN)of the created dimension.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN)of the created dimension.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN)of the created dimension.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN)of the created dimension.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN)of the created dimension.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN)of the created dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDimensionResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The type of the dimension.
     * </p>
     * 
     * @param type
     *        The type of the dimension.
     * @see DimensionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the dimension.
     * </p>
     * 
     * @return The type of the dimension.
     * @see DimensionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the dimension.
     * </p>
     * 
     * @param type
     *        The type of the dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DimensionType
     */

    public UpdateDimensionResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the dimension.
     * </p>
     * 
     * @param type
     *        The type of the dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DimensionType
     */

    public UpdateDimensionResult withType(DimensionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The value or list of values used to scope the dimension. For example, for topic filters, this is the pattern used
     * to match the MQTT topic name.
     * </p>
     * 
     * @return The value or list of values used to scope the dimension. For example, for topic filters, this is the
     *         pattern used to match the MQTT topic name.
     */

    public java.util.List<String> getStringValues() {
        return stringValues;
    }

    /**
     * <p>
     * The value or list of values used to scope the dimension. For example, for topic filters, this is the pattern used
     * to match the MQTT topic name.
     * </p>
     * 
     * @param stringValues
     *        The value or list of values used to scope the dimension. For example, for topic filters, this is the
     *        pattern used to match the MQTT topic name.
     */

    public void setStringValues(java.util.Collection<String> stringValues) {
        if (stringValues == null) {
            this.stringValues = null;
            return;
        }

        this.stringValues = new java.util.ArrayList<String>(stringValues);
    }

    /**
     * <p>
     * The value or list of values used to scope the dimension. For example, for topic filters, this is the pattern used
     * to match the MQTT topic name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringValues(java.util.Collection)} or {@link #withStringValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stringValues
     *        The value or list of values used to scope the dimension. For example, for topic filters, this is the
     *        pattern used to match the MQTT topic name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDimensionResult withStringValues(String... stringValues) {
        if (this.stringValues == null) {
            setStringValues(new java.util.ArrayList<String>(stringValues.length));
        }
        for (String ele : stringValues) {
            this.stringValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value or list of values used to scope the dimension. For example, for topic filters, this is the pattern used
     * to match the MQTT topic name.
     * </p>
     * 
     * @param stringValues
     *        The value or list of values used to scope the dimension. For example, for topic filters, this is the
     *        pattern used to match the MQTT topic name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDimensionResult withStringValues(java.util.Collection<String> stringValues) {
        setStringValues(stringValues);
        return this;
    }

    /**
     * <p>
     * The date and time, in milliseconds since epoch, when the dimension was initially created.
     * </p>
     * 
     * @param creationDate
     *        The date and time, in milliseconds since epoch, when the dimension was initially created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time, in milliseconds since epoch, when the dimension was initially created.
     * </p>
     * 
     * @return The date and time, in milliseconds since epoch, when the dimension was initially created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time, in milliseconds since epoch, when the dimension was initially created.
     * </p>
     * 
     * @param creationDate
     *        The date and time, in milliseconds since epoch, when the dimension was initially created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDimensionResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date and time, in milliseconds since epoch, when the dimension was most recently updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time, in milliseconds since epoch, when the dimension was most recently updated.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time, in milliseconds since epoch, when the dimension was most recently updated.
     * </p>
     * 
     * @return The date and time, in milliseconds since epoch, when the dimension was most recently updated.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time, in milliseconds since epoch, when the dimension was most recently updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time, in milliseconds since epoch, when the dimension was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDimensionResult withLastModifiedDate(java.util.Date lastModifiedDate) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStringValues() != null)
            sb.append("StringValues: ").append(getStringValues()).append(",");
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

        if (obj instanceof UpdateDimensionResult == false)
            return false;
        UpdateDimensionResult other = (UpdateDimensionResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStringValues() == null ^ this.getStringValues() == null)
            return false;
        if (other.getStringValues() != null && other.getStringValues().equals(this.getStringValues()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStringValues() == null) ? 0 : getStringValues().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDimensionResult clone() {
        try {
            return (UpdateDimensionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
