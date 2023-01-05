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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of tags on a dataset to set row-level security.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RowLevelPermissionTagConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RowLevelPermissionTagConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of row-level security tags. If enabled, the status is <code>ENABLED</code>. If disabled, the status is
     * <code>DISABLED</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A set of rules associated with row-level security, such as the tag names and columns that they are assigned to.
     * </p>
     */
    private java.util.List<RowLevelPermissionTagRule> tagRules;

    /**
     * <p>
     * The status of row-level security tags. If enabled, the status is <code>ENABLED</code>. If disabled, the status is
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param status
     *        The status of row-level security tags. If enabled, the status is <code>ENABLED</code>. If disabled, the
     *        status is <code>DISABLED</code>.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of row-level security tags. If enabled, the status is <code>ENABLED</code>. If disabled, the status is
     * <code>DISABLED</code>.
     * </p>
     * 
     * @return The status of row-level security tags. If enabled, the status is <code>ENABLED</code>. If disabled, the
     *         status is <code>DISABLED</code>.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of row-level security tags. If enabled, the status is <code>ENABLED</code>. If disabled, the status is
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param status
     *        The status of row-level security tags. If enabled, the status is <code>ENABLED</code>. If disabled, the
     *        status is <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public RowLevelPermissionTagConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of row-level security tags. If enabled, the status is <code>ENABLED</code>. If disabled, the status is
     * <code>DISABLED</code>.
     * </p>
     * 
     * @param status
     *        The status of row-level security tags. If enabled, the status is <code>ENABLED</code>. If disabled, the
     *        status is <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public RowLevelPermissionTagConfiguration withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A set of rules associated with row-level security, such as the tag names and columns that they are assigned to.
     * </p>
     * 
     * @return A set of rules associated with row-level security, such as the tag names and columns that they are
     *         assigned to.
     */

    public java.util.List<RowLevelPermissionTagRule> getTagRules() {
        return tagRules;
    }

    /**
     * <p>
     * A set of rules associated with row-level security, such as the tag names and columns that they are assigned to.
     * </p>
     * 
     * @param tagRules
     *        A set of rules associated with row-level security, such as the tag names and columns that they are
     *        assigned to.
     */

    public void setTagRules(java.util.Collection<RowLevelPermissionTagRule> tagRules) {
        if (tagRules == null) {
            this.tagRules = null;
            return;
        }

        this.tagRules = new java.util.ArrayList<RowLevelPermissionTagRule>(tagRules);
    }

    /**
     * <p>
     * A set of rules associated with row-level security, such as the tag names and columns that they are assigned to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagRules(java.util.Collection)} or {@link #withTagRules(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagRules
     *        A set of rules associated with row-level security, such as the tag names and columns that they are
     *        assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowLevelPermissionTagConfiguration withTagRules(RowLevelPermissionTagRule... tagRules) {
        if (this.tagRules == null) {
            setTagRules(new java.util.ArrayList<RowLevelPermissionTagRule>(tagRules.length));
        }
        for (RowLevelPermissionTagRule ele : tagRules) {
            this.tagRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of rules associated with row-level security, such as the tag names and columns that they are assigned to.
     * </p>
     * 
     * @param tagRules
     *        A set of rules associated with row-level security, such as the tag names and columns that they are
     *        assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RowLevelPermissionTagConfiguration withTagRules(java.util.Collection<RowLevelPermissionTagRule> tagRules) {
        setTagRules(tagRules);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTagRules() != null)
            sb.append("TagRules: ").append(getTagRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RowLevelPermissionTagConfiguration == false)
            return false;
        RowLevelPermissionTagConfiguration other = (RowLevelPermissionTagConfiguration) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTagRules() == null ^ this.getTagRules() == null)
            return false;
        if (other.getTagRules() != null && other.getTagRules().equals(this.getTagRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTagRules() == null) ? 0 : getTagRules().hashCode());
        return hashCode;
    }

    @Override
    public RowLevelPermissionTagConfiguration clone() {
        try {
            return (RowLevelPermissionTagConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RowLevelPermissionTagConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
