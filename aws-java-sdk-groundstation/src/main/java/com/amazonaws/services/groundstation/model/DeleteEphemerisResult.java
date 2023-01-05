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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DeleteEphemeris" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEphemerisResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS Ground Station ephemeris ID.
     * </p>
     */
    private String ephemerisId;

    /**
     * <p>
     * The AWS Ground Station ephemeris ID.
     * </p>
     * 
     * @param ephemerisId
     *        The AWS Ground Station ephemeris ID.
     */

    public void setEphemerisId(String ephemerisId) {
        this.ephemerisId = ephemerisId;
    }

    /**
     * <p>
     * The AWS Ground Station ephemeris ID.
     * </p>
     * 
     * @return The AWS Ground Station ephemeris ID.
     */

    public String getEphemerisId() {
        return this.ephemerisId;
    }

    /**
     * <p>
     * The AWS Ground Station ephemeris ID.
     * </p>
     * 
     * @param ephemerisId
     *        The AWS Ground Station ephemeris ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEphemerisResult withEphemerisId(String ephemerisId) {
        setEphemerisId(ephemerisId);
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
        if (getEphemerisId() != null)
            sb.append("EphemerisId: ").append(getEphemerisId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEphemerisResult == false)
            return false;
        DeleteEphemerisResult other = (DeleteEphemerisResult) obj;
        if (other.getEphemerisId() == null ^ this.getEphemerisId() == null)
            return false;
        if (other.getEphemerisId() != null && other.getEphemerisId().equals(this.getEphemerisId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEphemerisId() == null) ? 0 : getEphemerisId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEphemerisResult clone() {
        try {
            return (DeleteEphemerisResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
