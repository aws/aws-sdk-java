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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output for the DescribeThingType operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeThingTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the thing type.
     * </p>
     */
    private String thingTypeName;
    /**
     * <p>
     * The thing type ID.
     * </p>
     */
    private String thingTypeId;
    /**
     * <p>
     * The thing type ARN.
     * </p>
     */
    private String thingTypeArn;
    /**
     * <p>
     * The ThingTypeProperties contains information about the thing type including description, and a list of searchable
     * thing attribute names.
     * </p>
     */
    private ThingTypeProperties thingTypeProperties;
    /**
     * <p>
     * The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a
     * value indicating whether the thing type is deprecated, and a date and time when it was deprecated.
     * </p>
     */
    private ThingTypeMetadata thingTypeMetadata;

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * 
     * @param thingTypeName
     *        The name of the thing type.
     */

    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * 
     * @return The name of the thing type.
     */

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * 
     * @param thingTypeName
     *        The name of the thing type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingTypeResult withThingTypeName(String thingTypeName) {
        setThingTypeName(thingTypeName);
        return this;
    }

    /**
     * <p>
     * The thing type ID.
     * </p>
     * 
     * @param thingTypeId
     *        The thing type ID.
     */

    public void setThingTypeId(String thingTypeId) {
        this.thingTypeId = thingTypeId;
    }

    /**
     * <p>
     * The thing type ID.
     * </p>
     * 
     * @return The thing type ID.
     */

    public String getThingTypeId() {
        return this.thingTypeId;
    }

    /**
     * <p>
     * The thing type ID.
     * </p>
     * 
     * @param thingTypeId
     *        The thing type ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingTypeResult withThingTypeId(String thingTypeId) {
        setThingTypeId(thingTypeId);
        return this;
    }

    /**
     * <p>
     * The thing type ARN.
     * </p>
     * 
     * @param thingTypeArn
     *        The thing type ARN.
     */

    public void setThingTypeArn(String thingTypeArn) {
        this.thingTypeArn = thingTypeArn;
    }

    /**
     * <p>
     * The thing type ARN.
     * </p>
     * 
     * @return The thing type ARN.
     */

    public String getThingTypeArn() {
        return this.thingTypeArn;
    }

    /**
     * <p>
     * The thing type ARN.
     * </p>
     * 
     * @param thingTypeArn
     *        The thing type ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingTypeResult withThingTypeArn(String thingTypeArn) {
        setThingTypeArn(thingTypeArn);
        return this;
    }

    /**
     * <p>
     * The ThingTypeProperties contains information about the thing type including description, and a list of searchable
     * thing attribute names.
     * </p>
     * 
     * @param thingTypeProperties
     *        The ThingTypeProperties contains information about the thing type including description, and a list of
     *        searchable thing attribute names.
     */

    public void setThingTypeProperties(ThingTypeProperties thingTypeProperties) {
        this.thingTypeProperties = thingTypeProperties;
    }

    /**
     * <p>
     * The ThingTypeProperties contains information about the thing type including description, and a list of searchable
     * thing attribute names.
     * </p>
     * 
     * @return The ThingTypeProperties contains information about the thing type including description, and a list of
     *         searchable thing attribute names.
     */

    public ThingTypeProperties getThingTypeProperties() {
        return this.thingTypeProperties;
    }

    /**
     * <p>
     * The ThingTypeProperties contains information about the thing type including description, and a list of searchable
     * thing attribute names.
     * </p>
     * 
     * @param thingTypeProperties
     *        The ThingTypeProperties contains information about the thing type including description, and a list of
     *        searchable thing attribute names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingTypeResult withThingTypeProperties(ThingTypeProperties thingTypeProperties) {
        setThingTypeProperties(thingTypeProperties);
        return this;
    }

    /**
     * <p>
     * The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a
     * value indicating whether the thing type is deprecated, and a date and time when it was deprecated.
     * </p>
     * 
     * @param thingTypeMetadata
     *        The ThingTypeMetadata contains additional information about the thing type including: creation date and
     *        time, a value indicating whether the thing type is deprecated, and a date and time when it was deprecated.
     */

    public void setThingTypeMetadata(ThingTypeMetadata thingTypeMetadata) {
        this.thingTypeMetadata = thingTypeMetadata;
    }

    /**
     * <p>
     * The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a
     * value indicating whether the thing type is deprecated, and a date and time when it was deprecated.
     * </p>
     * 
     * @return The ThingTypeMetadata contains additional information about the thing type including: creation date and
     *         time, a value indicating whether the thing type is deprecated, and a date and time when it was
     *         deprecated.
     */

    public ThingTypeMetadata getThingTypeMetadata() {
        return this.thingTypeMetadata;
    }

    /**
     * <p>
     * The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a
     * value indicating whether the thing type is deprecated, and a date and time when it was deprecated.
     * </p>
     * 
     * @param thingTypeMetadata
     *        The ThingTypeMetadata contains additional information about the thing type including: creation date and
     *        time, a value indicating whether the thing type is deprecated, and a date and time when it was deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingTypeResult withThingTypeMetadata(ThingTypeMetadata thingTypeMetadata) {
        setThingTypeMetadata(thingTypeMetadata);
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
        if (getThingTypeName() != null)
            sb.append("ThingTypeName: ").append(getThingTypeName()).append(",");
        if (getThingTypeId() != null)
            sb.append("ThingTypeId: ").append(getThingTypeId()).append(",");
        if (getThingTypeArn() != null)
            sb.append("ThingTypeArn: ").append(getThingTypeArn()).append(",");
        if (getThingTypeProperties() != null)
            sb.append("ThingTypeProperties: ").append(getThingTypeProperties()).append(",");
        if (getThingTypeMetadata() != null)
            sb.append("ThingTypeMetadata: ").append(getThingTypeMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeThingTypeResult == false)
            return false;
        DescribeThingTypeResult other = (DescribeThingTypeResult) obj;
        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getThingTypeId() == null ^ this.getThingTypeId() == null)
            return false;
        if (other.getThingTypeId() != null && other.getThingTypeId().equals(this.getThingTypeId()) == false)
            return false;
        if (other.getThingTypeArn() == null ^ this.getThingTypeArn() == null)
            return false;
        if (other.getThingTypeArn() != null && other.getThingTypeArn().equals(this.getThingTypeArn()) == false)
            return false;
        if (other.getThingTypeProperties() == null ^ this.getThingTypeProperties() == null)
            return false;
        if (other.getThingTypeProperties() != null && other.getThingTypeProperties().equals(this.getThingTypeProperties()) == false)
            return false;
        if (other.getThingTypeMetadata() == null ^ this.getThingTypeMetadata() == null)
            return false;
        if (other.getThingTypeMetadata() != null && other.getThingTypeMetadata().equals(this.getThingTypeMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode + ((getThingTypeId() == null) ? 0 : getThingTypeId().hashCode());
        hashCode = prime * hashCode + ((getThingTypeArn() == null) ? 0 : getThingTypeArn().hashCode());
        hashCode = prime * hashCode + ((getThingTypeProperties() == null) ? 0 : getThingTypeProperties().hashCode());
        hashCode = prime * hashCode + ((getThingTypeMetadata() == null) ? 0 : getThingTypeMetadata().hashCode());
        return hashCode;
    }

    @Override
    public DescribeThingTypeResult clone() {
        try {
            return (DescribeThingTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
