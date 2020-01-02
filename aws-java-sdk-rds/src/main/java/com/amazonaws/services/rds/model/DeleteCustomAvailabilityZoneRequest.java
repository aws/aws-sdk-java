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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteCustomAvailabilityZone" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCustomAvailabilityZoneRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The custom AZ identifier.
     * </p>
     */
    private String customAvailabilityZoneId;

    /**
     * <p>
     * The custom AZ identifier.
     * </p>
     * 
     * @param customAvailabilityZoneId
     *        The custom AZ identifier.
     */

    public void setCustomAvailabilityZoneId(String customAvailabilityZoneId) {
        this.customAvailabilityZoneId = customAvailabilityZoneId;
    }

    /**
     * <p>
     * The custom AZ identifier.
     * </p>
     * 
     * @return The custom AZ identifier.
     */

    public String getCustomAvailabilityZoneId() {
        return this.customAvailabilityZoneId;
    }

    /**
     * <p>
     * The custom AZ identifier.
     * </p>
     * 
     * @param customAvailabilityZoneId
     *        The custom AZ identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomAvailabilityZoneRequest withCustomAvailabilityZoneId(String customAvailabilityZoneId) {
        setCustomAvailabilityZoneId(customAvailabilityZoneId);
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
        if (getCustomAvailabilityZoneId() != null)
            sb.append("CustomAvailabilityZoneId: ").append(getCustomAvailabilityZoneId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCustomAvailabilityZoneRequest == false)
            return false;
        DeleteCustomAvailabilityZoneRequest other = (DeleteCustomAvailabilityZoneRequest) obj;
        if (other.getCustomAvailabilityZoneId() == null ^ this.getCustomAvailabilityZoneId() == null)
            return false;
        if (other.getCustomAvailabilityZoneId() != null && other.getCustomAvailabilityZoneId().equals(this.getCustomAvailabilityZoneId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomAvailabilityZoneId() == null) ? 0 : getCustomAvailabilityZoneId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCustomAvailabilityZoneRequest clone() {
        return (DeleteCustomAvailabilityZoneRequest) super.clone();
    }

}
