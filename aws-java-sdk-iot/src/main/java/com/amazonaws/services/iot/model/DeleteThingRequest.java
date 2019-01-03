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
 * The input for the DeleteThing operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteThingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the thing to delete.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The expected version of the thing record in the registry. If the version of the record in the registry does not
     * match the expected version specified in the request, the <code>DeleteThing</code> request is rejected with a
     * <code>VersionConflictException</code>.
     * </p>
     */
    private Long expectedVersion;

    /**
     * <p>
     * The name of the thing to delete.
     * </p>
     * 
     * @param thingName
     *        The name of the thing to delete.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing to delete.
     * </p>
     * 
     * @return The name of the thing to delete.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing to delete.
     * </p>
     * 
     * @param thingName
     *        The name of the thing to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteThingRequest withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The expected version of the thing record in the registry. If the version of the record in the registry does not
     * match the expected version specified in the request, the <code>DeleteThing</code> request is rejected with a
     * <code>VersionConflictException</code>.
     * </p>
     * 
     * @param expectedVersion
     *        The expected version of the thing record in the registry. If the version of the record in the registry
     *        does not match the expected version specified in the request, the <code>DeleteThing</code> request is
     *        rejected with a <code>VersionConflictException</code>.
     */

    public void setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
    }

    /**
     * <p>
     * The expected version of the thing record in the registry. If the version of the record in the registry does not
     * match the expected version specified in the request, the <code>DeleteThing</code> request is rejected with a
     * <code>VersionConflictException</code>.
     * </p>
     * 
     * @return The expected version of the thing record in the registry. If the version of the record in the registry
     *         does not match the expected version specified in the request, the <code>DeleteThing</code> request is
     *         rejected with a <code>VersionConflictException</code>.
     */

    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    /**
     * <p>
     * The expected version of the thing record in the registry. If the version of the record in the registry does not
     * match the expected version specified in the request, the <code>DeleteThing</code> request is rejected with a
     * <code>VersionConflictException</code>.
     * </p>
     * 
     * @param expectedVersion
     *        The expected version of the thing record in the registry. If the version of the record in the registry
     *        does not match the expected version specified in the request, the <code>DeleteThing</code> request is
     *        rejected with a <code>VersionConflictException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteThingRequest withExpectedVersion(Long expectedVersion) {
        setExpectedVersion(expectedVersion);
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
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getExpectedVersion() != null)
            sb.append("ExpectedVersion: ").append(getExpectedVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteThingRequest == false)
            return false;
        DeleteThingRequest other = (DeleteThingRequest) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getExpectedVersion() == null ^ this.getExpectedVersion() == null)
            return false;
        if (other.getExpectedVersion() != null && other.getExpectedVersion().equals(this.getExpectedVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getExpectedVersion() == null) ? 0 : getExpectedVersion().hashCode());
        return hashCode;
    }

    @Override
    public DeleteThingRequest clone() {
        return (DeleteThingRequest) super.clone();
    }

}
