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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A time zone associated with a <a>DBInstance</a> or a <a>DBSnapshot</a>. This data type is an element in the response
 * to the <a>DescribeDBInstances</a>, the <a>DescribeDBSnapshots</a>, and the <a>DescribeDBEngineVersions</a> actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/Timezone" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Timezone implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the time zone.
     * </p>
     */
    private String timezoneName;

    /**
     * <p>
     * The name of the time zone.
     * </p>
     * 
     * @param timezoneName
     *        The name of the time zone.
     */

    public void setTimezoneName(String timezoneName) {
        this.timezoneName = timezoneName;
    }

    /**
     * <p>
     * The name of the time zone.
     * </p>
     * 
     * @return The name of the time zone.
     */

    public String getTimezoneName() {
        return this.timezoneName;
    }

    /**
     * <p>
     * The name of the time zone.
     * </p>
     * 
     * @param timezoneName
     *        The name of the time zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Timezone withTimezoneName(String timezoneName) {
        setTimezoneName(timezoneName);
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
        if (getTimezoneName() != null)
            sb.append("TimezoneName: ").append(getTimezoneName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Timezone == false)
            return false;
        Timezone other = (Timezone) obj;
        if (other.getTimezoneName() == null ^ this.getTimezoneName() == null)
            return false;
        if (other.getTimezoneName() != null && other.getTimezoneName().equals(this.getTimezoneName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimezoneName() == null) ? 0 : getTimezoneName().hashCode());
        return hashCode;
    }

    @Override
    public Timezone clone() {
        try {
            return (Timezone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
