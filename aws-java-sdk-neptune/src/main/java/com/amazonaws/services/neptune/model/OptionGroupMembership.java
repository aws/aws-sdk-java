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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Provides information on the option groups the DB instance is a member of.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/OptionGroupMembership" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptionGroupMembership implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the option group that the instance belongs to.
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * The status of the DB instance's option group membership. Valid values are: <code>in-sync</code>,
     * <code>pending-apply</code>, <code>pending-removal</code>, <code>pending-maintenance-apply</code>,
     * <code>pending-maintenance-removal</code>, <code>applying</code>, <code>removing</code>, and <code>failed</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the option group that the instance belongs to.
     * </p>
     * 
     * @param optionGroupName
     *        The name of the option group that the instance belongs to.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The name of the option group that the instance belongs to.
     * </p>
     * 
     * @return The name of the option group that the instance belongs to.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * The name of the option group that the instance belongs to.
     * </p>
     * 
     * @param optionGroupName
     *        The name of the option group that the instance belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupMembership withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * The status of the DB instance's option group membership. Valid values are: <code>in-sync</code>,
     * <code>pending-apply</code>, <code>pending-removal</code>, <code>pending-maintenance-apply</code>,
     * <code>pending-maintenance-removal</code>, <code>applying</code>, <code>removing</code>, and <code>failed</code>.
     * </p>
     * 
     * @param status
     *        The status of the DB instance's option group membership. Valid values are: <code>in-sync</code>,
     *        <code>pending-apply</code>, <code>pending-removal</code>, <code>pending-maintenance-apply</code>,
     *        <code>pending-maintenance-removal</code>, <code>applying</code>, <code>removing</code>, and
     *        <code>failed</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the DB instance's option group membership. Valid values are: <code>in-sync</code>,
     * <code>pending-apply</code>, <code>pending-removal</code>, <code>pending-maintenance-apply</code>,
     * <code>pending-maintenance-removal</code>, <code>applying</code>, <code>removing</code>, and <code>failed</code>.
     * </p>
     * 
     * @return The status of the DB instance's option group membership. Valid values are: <code>in-sync</code>,
     *         <code>pending-apply</code>, <code>pending-removal</code>, <code>pending-maintenance-apply</code>,
     *         <code>pending-maintenance-removal</code>, <code>applying</code>, <code>removing</code>, and
     *         <code>failed</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the DB instance's option group membership. Valid values are: <code>in-sync</code>,
     * <code>pending-apply</code>, <code>pending-removal</code>, <code>pending-maintenance-apply</code>,
     * <code>pending-maintenance-removal</code>, <code>applying</code>, <code>removing</code>, and <code>failed</code>.
     * </p>
     * 
     * @param status
     *        The status of the DB instance's option group membership. Valid values are: <code>in-sync</code>,
     *        <code>pending-apply</code>, <code>pending-removal</code>, <code>pending-maintenance-apply</code>,
     *        <code>pending-maintenance-removal</code>, <code>applying</code>, <code>removing</code>, and
     *        <code>failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionGroupMembership withStatus(String status) {
        setStatus(status);
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
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionGroupMembership == false)
            return false;
        OptionGroupMembership other = (OptionGroupMembership) obj;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public OptionGroupMembership clone() {
        try {
            return (OptionGroupMembership) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
