/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * 
 */
public class CreateApplicationResult implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN specifying the application that is created.
     * </p>
     */
    private String applicationArn;

    /**
     * <p>
     * The ARN specifying the application that is created.
     * </p>
     * 
     * @param applicationArn
     *        The ARN specifying the application that is created.
     */
    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The ARN specifying the application that is created.
     * </p>
     * 
     * @return The ARN specifying the application that is created.
     */
    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The ARN specifying the application that is created.
     * </p>
     * 
     * @param applicationArn
     *        The ARN specifying the application that is created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateApplicationResult withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: " + getApplicationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationResult == false)
            return false;
        CreateApplicationResult other = (CreateApplicationResult) obj;
        if (other.getApplicationArn() == null
                ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null
                && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApplicationArn() == null) ? 0 : getApplicationArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationResult clone() {
        try {
            return (CreateApplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}