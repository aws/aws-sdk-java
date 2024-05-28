/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details on the configuration of a table optimizer. You pass this configuration when creating or updating a
 * table optimizer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/TableOptimizerConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableOptimizerConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A role passed by the caller which gives the service permission to update the resources associated with the
     * optimizer on the caller's behalf.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Whether table optimization is enabled.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * A role passed by the caller which gives the service permission to update the resources associated with the
     * optimizer on the caller's behalf.
     * </p>
     * 
     * @param roleArn
     *        A role passed by the caller which gives the service permission to update the resources associated with the
     *        optimizer on the caller's behalf.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * A role passed by the caller which gives the service permission to update the resources associated with the
     * optimizer on the caller's behalf.
     * </p>
     * 
     * @return A role passed by the caller which gives the service permission to update the resources associated with
     *         the optimizer on the caller's behalf.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * A role passed by the caller which gives the service permission to update the resources associated with the
     * optimizer on the caller's behalf.
     * </p>
     * 
     * @param roleArn
     *        A role passed by the caller which gives the service permission to update the resources associated with the
     *        optimizer on the caller's behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableOptimizerConfiguration withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Whether table optimization is enabled.
     * </p>
     * 
     * @param enabled
     *        Whether table optimization is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether table optimization is enabled.
     * </p>
     * 
     * @return Whether table optimization is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether table optimization is enabled.
     * </p>
     * 
     * @param enabled
     *        Whether table optimization is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableOptimizerConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether table optimization is enabled.
     * </p>
     * 
     * @return Whether table optimization is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableOptimizerConfiguration == false)
            return false;
        TableOptimizerConfiguration other = (TableOptimizerConfiguration) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public TableOptimizerConfiguration clone() {
        try {
            return (TableOptimizerConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.TableOptimizerConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
