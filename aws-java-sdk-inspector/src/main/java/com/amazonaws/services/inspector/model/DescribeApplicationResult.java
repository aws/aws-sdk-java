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
public class DescribeApplicationResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the application.
     * </p>
     */
    private Application application;

    /**
     * <p>
     * Information about the application.
     * </p>
     * 
     * @param application
     *        Information about the application.
     */
    public void setApplication(Application application) {
        this.application = application;
    }

    /**
     * <p>
     * Information about the application.
     * </p>
     * 
     * @return Information about the application.
     */
    public Application getApplication() {
        return this.application;
    }

    /**
     * <p>
     * Information about the application.
     * </p>
     * 
     * @param application
     *        Information about the application.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribeApplicationResult withApplication(Application application) {
        setApplication(application);
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
        if (getApplication() != null)
            sb.append("Application: " + getApplication());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationResult == false)
            return false;
        DescribeApplicationResult other = (DescribeApplicationResult) obj;
        if (other.getApplication() == null ^ this.getApplication() == null)
            return false;
        if (other.getApplication() != null
                && other.getApplication().equals(this.getApplication()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApplication() == null) ? 0 : getApplication().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationResult clone() {
        try {
            return (DescribeApplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}