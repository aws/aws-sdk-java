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
 * <p>
 * Contains information about an Inspector application.
 * </p>
 * <p>
 * This data type is used as the response element in the
 * <a>DescribeApplication</a> action.
 * </p>
 */
public class Application implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN specifying the Inspector application.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * The name of the Inspector application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The ARN specifying the resource group that is associated with the
     * application.
     * </p>
     */
    private String resourceGroupArn;

    /**
     * <p>
     * The ARN specifying the Inspector application.
     * </p>
     * 
     * @param applicationArn
     *        The ARN specifying the Inspector application.
     */
    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The ARN specifying the Inspector application.
     * </p>
     * 
     * @return The ARN specifying the Inspector application.
     */
    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The ARN specifying the Inspector application.
     * </p>
     * 
     * @param applicationArn
     *        The ARN specifying the Inspector application.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Application withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * The name of the Inspector application.
     * </p>
     * 
     * @param applicationName
     *        The name of the Inspector application.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the Inspector application.
     * </p>
     * 
     * @return The name of the Inspector application.
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the Inspector application.
     * </p>
     * 
     * @param applicationName
     *        The name of the Inspector application.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Application withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The ARN specifying the resource group that is associated with the
     * application.
     * </p>
     * 
     * @param resourceGroupArn
     *        The ARN specifying the resource group that is associated with the
     *        application.
     */
    public void setResourceGroupArn(String resourceGroupArn) {
        this.resourceGroupArn = resourceGroupArn;
    }

    /**
     * <p>
     * The ARN specifying the resource group that is associated with the
     * application.
     * </p>
     * 
     * @return The ARN specifying the resource group that is associated with the
     *         application.
     */
    public String getResourceGroupArn() {
        return this.resourceGroupArn;
    }

    /**
     * <p>
     * The ARN specifying the resource group that is associated with the
     * application.
     * </p>
     * 
     * @param resourceGroupArn
     *        The ARN specifying the resource group that is associated with the
     *        application.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Application withResourceGroupArn(String resourceGroupArn) {
        setResourceGroupArn(resourceGroupArn);
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
            sb.append("ApplicationArn: " + getApplicationArn() + ",");
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getResourceGroupArn() != null)
            sb.append("ResourceGroupArn: " + getResourceGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Application == false)
            return false;
        Application other = (Application) obj;
        if (other.getApplicationArn() == null
                ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null
                && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getApplicationName() == null
                ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getResourceGroupArn() == null
                ^ this.getResourceGroupArn() == null)
            return false;
        if (other.getResourceGroupArn() != null
                && other.getResourceGroupArn().equals(
                        this.getResourceGroupArn()) == false)
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
        hashCode = prime
                * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceGroupArn() == null) ? 0 : getResourceGroupArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public Application clone() {
        try {
            return (Application) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}