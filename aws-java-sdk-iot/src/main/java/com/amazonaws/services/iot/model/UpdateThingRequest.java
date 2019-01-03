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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the UpdateThing operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateThingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the thing to update.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The name of the thing type.
     * </p>
     */
    private String thingTypeName;
    /**
     * <p>
     * A list of thing attributes, a JSON string containing name-value pairs. For example:
     * </p>
     * <p>
     * <code>{\"attributes\":{\"name1\":\"value2\"}}</code>
     * </p>
     * <p>
     * This data is used to add new attributes or update existing attributes.
     * </p>
     */
    private AttributePayload attributePayload;
    /**
     * <p>
     * The expected version of the thing record in the registry. If the version of the record in the registry does not
     * match the expected version specified in the request, the <code>UpdateThing</code> request is rejected with a
     * <code>VersionConflictException</code>.
     * </p>
     */
    private Long expectedVersion;
    /**
     * <p>
     * Remove a thing type association. If <b>true</b>, the association is removed.
     * </p>
     */
    private Boolean removeThingType;

    /**
     * <p>
     * The name of the thing to update.
     * </p>
     * 
     * @param thingName
     *        The name of the thing to update.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing to update.
     * </p>
     * 
     * @return The name of the thing to update.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing to update.
     * </p>
     * 
     * @param thingName
     *        The name of the thing to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThingRequest withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

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

    public UpdateThingRequest withThingTypeName(String thingTypeName) {
        setThingTypeName(thingTypeName);
        return this;
    }

    /**
     * <p>
     * A list of thing attributes, a JSON string containing name-value pairs. For example:
     * </p>
     * <p>
     * <code>{\"attributes\":{\"name1\":\"value2\"}}</code>
     * </p>
     * <p>
     * This data is used to add new attributes or update existing attributes.
     * </p>
     * 
     * @param attributePayload
     *        A list of thing attributes, a JSON string containing name-value pairs. For example:</p>
     *        <p>
     *        <code>{\"attributes\":{\"name1\":\"value2\"}}</code>
     *        </p>
     *        <p>
     *        This data is used to add new attributes or update existing attributes.
     */

    public void setAttributePayload(AttributePayload attributePayload) {
        this.attributePayload = attributePayload;
    }

    /**
     * <p>
     * A list of thing attributes, a JSON string containing name-value pairs. For example:
     * </p>
     * <p>
     * <code>{\"attributes\":{\"name1\":\"value2\"}}</code>
     * </p>
     * <p>
     * This data is used to add new attributes or update existing attributes.
     * </p>
     * 
     * @return A list of thing attributes, a JSON string containing name-value pairs. For example:</p>
     *         <p>
     *         <code>{\"attributes\":{\"name1\":\"value2\"}}</code>
     *         </p>
     *         <p>
     *         This data is used to add new attributes or update existing attributes.
     */

    public AttributePayload getAttributePayload() {
        return this.attributePayload;
    }

    /**
     * <p>
     * A list of thing attributes, a JSON string containing name-value pairs. For example:
     * </p>
     * <p>
     * <code>{\"attributes\":{\"name1\":\"value2\"}}</code>
     * </p>
     * <p>
     * This data is used to add new attributes or update existing attributes.
     * </p>
     * 
     * @param attributePayload
     *        A list of thing attributes, a JSON string containing name-value pairs. For example:</p>
     *        <p>
     *        <code>{\"attributes\":{\"name1\":\"value2\"}}</code>
     *        </p>
     *        <p>
     *        This data is used to add new attributes or update existing attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThingRequest withAttributePayload(AttributePayload attributePayload) {
        setAttributePayload(attributePayload);
        return this;
    }

    /**
     * <p>
     * The expected version of the thing record in the registry. If the version of the record in the registry does not
     * match the expected version specified in the request, the <code>UpdateThing</code> request is rejected with a
     * <code>VersionConflictException</code>.
     * </p>
     * 
     * @param expectedVersion
     *        The expected version of the thing record in the registry. If the version of the record in the registry
     *        does not match the expected version specified in the request, the <code>UpdateThing</code> request is
     *        rejected with a <code>VersionConflictException</code>.
     */

    public void setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
    }

    /**
     * <p>
     * The expected version of the thing record in the registry. If the version of the record in the registry does not
     * match the expected version specified in the request, the <code>UpdateThing</code> request is rejected with a
     * <code>VersionConflictException</code>.
     * </p>
     * 
     * @return The expected version of the thing record in the registry. If the version of the record in the registry
     *         does not match the expected version specified in the request, the <code>UpdateThing</code> request is
     *         rejected with a <code>VersionConflictException</code>.
     */

    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    /**
     * <p>
     * The expected version of the thing record in the registry. If the version of the record in the registry does not
     * match the expected version specified in the request, the <code>UpdateThing</code> request is rejected with a
     * <code>VersionConflictException</code>.
     * </p>
     * 
     * @param expectedVersion
     *        The expected version of the thing record in the registry. If the version of the record in the registry
     *        does not match the expected version specified in the request, the <code>UpdateThing</code> request is
     *        rejected with a <code>VersionConflictException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThingRequest withExpectedVersion(Long expectedVersion) {
        setExpectedVersion(expectedVersion);
        return this;
    }

    /**
     * <p>
     * Remove a thing type association. If <b>true</b>, the association is removed.
     * </p>
     * 
     * @param removeThingType
     *        Remove a thing type association. If <b>true</b>, the association is removed.
     */

    public void setRemoveThingType(Boolean removeThingType) {
        this.removeThingType = removeThingType;
    }

    /**
     * <p>
     * Remove a thing type association. If <b>true</b>, the association is removed.
     * </p>
     * 
     * @return Remove a thing type association. If <b>true</b>, the association is removed.
     */

    public Boolean getRemoveThingType() {
        return this.removeThingType;
    }

    /**
     * <p>
     * Remove a thing type association. If <b>true</b>, the association is removed.
     * </p>
     * 
     * @param removeThingType
     *        Remove a thing type association. If <b>true</b>, the association is removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThingRequest withRemoveThingType(Boolean removeThingType) {
        setRemoveThingType(removeThingType);
        return this;
    }

    /**
     * <p>
     * Remove a thing type association. If <b>true</b>, the association is removed.
     * </p>
     * 
     * @return Remove a thing type association. If <b>true</b>, the association is removed.
     */

    public Boolean isRemoveThingType() {
        return this.removeThingType;
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
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getThingTypeName() != null)
            sb.append("ThingTypeName: ").append(getThingTypeName()).append(",");
        if (getAttributePayload() != null)
            sb.append("AttributePayload: ").append(getAttributePayload()).append(",");
        if (getExpectedVersion() != null)
            sb.append("ExpectedVersion: ").append(getExpectedVersion()).append(",");
        if (getRemoveThingType() != null)
            sb.append("RemoveThingType: ").append(getRemoveThingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateThingRequest == false)
            return false;
        UpdateThingRequest other = (UpdateThingRequest) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getAttributePayload() == null ^ this.getAttributePayload() == null)
            return false;
        if (other.getAttributePayload() != null && other.getAttributePayload().equals(this.getAttributePayload()) == false)
            return false;
        if (other.getExpectedVersion() == null ^ this.getExpectedVersion() == null)
            return false;
        if (other.getExpectedVersion() != null && other.getExpectedVersion().equals(this.getExpectedVersion()) == false)
            return false;
        if (other.getRemoveThingType() == null ^ this.getRemoveThingType() == null)
            return false;
        if (other.getRemoveThingType() != null && other.getRemoveThingType().equals(this.getRemoveThingType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode + ((getAttributePayload() == null) ? 0 : getAttributePayload().hashCode());
        hashCode = prime * hashCode + ((getExpectedVersion() == null) ? 0 : getExpectedVersion().hashCode());
        hashCode = prime * hashCode + ((getRemoveThingType() == null) ? 0 : getRemoveThingType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateThingRequest clone() {
        return (UpdateThingRequest) super.clone();
    }

}
