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
public class DescribeDimensionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the dimension.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dimension.
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
     * The date the dimension was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date the dimension was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The unique identifier for the dimension.
     * </p>
     * 
     * @param name
     *        The unique identifier for the dimension.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique identifier for the dimension.
     * </p>
     * 
     * @return The unique identifier for the dimension.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique identifier for the dimension.
     * </p>
     * 
     * @param name
     *        The unique identifier for the dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDimensionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dimension.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the dimension.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dimension.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the dimension.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dimension.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDimensionResult withArn(String arn) {
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

    public DescribeDimensionResult withType(String type) {
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

    public DescribeDimensionResult withType(DimensionType type) {
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

    public DescribeDimensionResult withStringValues(String... stringValues) {
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

    public DescribeDimensionResult withStringValues(java.util.Collection<String> stringValues) {
        setStringValues(stringValues);
        return this;
    }

    /**
     * <p>
     * The date the dimension was created.
     * </p>
     * 
     * @param creationDate
     *        The date the dimension was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the dimension was created.
     * </p>
     * 
     * @return The date the dimension was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the dimension was created.
     * </p>
     * 
     * @param creationDate
     *        The date the dimension was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDimensionResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date the dimension was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the dimension was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the dimension was last modified.
     * </p>
     * 
     * @return The date the dimension was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date the dimension was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the dimension was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDimensionResult withLastModifiedDate(java.util.Date lastModifiedDate) {
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

        if (obj instanceof DescribeDimensionResult == false)
            return false;
        DescribeDimensionResult other = (DescribeDimensionResult) obj;
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
    public DescribeDimensionResult clone() {
        try {
            return (DescribeDimensionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
