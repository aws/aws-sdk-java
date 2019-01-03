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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An origin in an origin group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/OriginGroupMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginGroupMember implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for an origin in an origin group.
     * </p>
     */
    private String originId;

    /**
     * <p>
     * The ID for an origin in an origin group.
     * </p>
     * 
     * @param originId
     *        The ID for an origin in an origin group.
     */

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    /**
     * <p>
     * The ID for an origin in an origin group.
     * </p>
     * 
     * @return The ID for an origin in an origin group.
     */

    public String getOriginId() {
        return this.originId;
    }

    /**
     * <p>
     * The ID for an origin in an origin group.
     * </p>
     * 
     * @param originId
     *        The ID for an origin in an origin group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginGroupMember withOriginId(String originId) {
        setOriginId(originId);
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
        if (getOriginId() != null)
            sb.append("OriginId: ").append(getOriginId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginGroupMember == false)
            return false;
        OriginGroupMember other = (OriginGroupMember) obj;
        if (other.getOriginId() == null ^ this.getOriginId() == null)
            return false;
        if (other.getOriginId() != null && other.getOriginId().equals(this.getOriginId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginId() == null) ? 0 : getOriginId().hashCode());
        return hashCode;
    }

    @Override
    public OriginGroupMember clone() {
        try {
            return (OriginGroupMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
