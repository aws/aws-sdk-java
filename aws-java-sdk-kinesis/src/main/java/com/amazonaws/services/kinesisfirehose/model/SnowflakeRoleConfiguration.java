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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Optionally configure a Snowflake role. Otherwise the default user role will be used.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/SnowflakeRoleConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnowflakeRoleConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enable Snowflake role
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The Snowflake role you wish to configure
     * </p>
     */
    private String snowflakeRole;

    /**
     * <p>
     * Enable Snowflake role
     * </p>
     * 
     * @param enabled
     *        Enable Snowflake role
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Enable Snowflake role
     * </p>
     * 
     * @return Enable Snowflake role
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Enable Snowflake role
     * </p>
     * 
     * @param enabled
     *        Enable Snowflake role
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeRoleConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Enable Snowflake role
     * </p>
     * 
     * @return Enable Snowflake role
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The Snowflake role you wish to configure
     * </p>
     * 
     * @param snowflakeRole
     *        The Snowflake role you wish to configure
     */

    public void setSnowflakeRole(String snowflakeRole) {
        this.snowflakeRole = snowflakeRole;
    }

    /**
     * <p>
     * The Snowflake role you wish to configure
     * </p>
     * 
     * @return The Snowflake role you wish to configure
     */

    public String getSnowflakeRole() {
        return this.snowflakeRole;
    }

    /**
     * <p>
     * The Snowflake role you wish to configure
     * </p>
     * 
     * @param snowflakeRole
     *        The Snowflake role you wish to configure
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeRoleConfiguration withSnowflakeRole(String snowflakeRole) {
        setSnowflakeRole(snowflakeRole);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getSnowflakeRole() != null)
            sb.append("SnowflakeRole: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnowflakeRoleConfiguration == false)
            return false;
        SnowflakeRoleConfiguration other = (SnowflakeRoleConfiguration) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getSnowflakeRole() == null ^ this.getSnowflakeRole() == null)
            return false;
        if (other.getSnowflakeRole() != null && other.getSnowflakeRole().equals(this.getSnowflakeRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getSnowflakeRole() == null) ? 0 : getSnowflakeRole().hashCode());
        return hashCode;
    }

    @Override
    public SnowflakeRoleConfiguration clone() {
        try {
            return (SnowflakeRoleConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.SnowflakeRoleConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
