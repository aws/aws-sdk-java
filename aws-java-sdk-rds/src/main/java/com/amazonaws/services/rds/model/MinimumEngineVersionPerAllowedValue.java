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
 * The minimum DB engine version required for each corresponding allowed value for an option setting.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/MinimumEngineVersionPerAllowedValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MinimumEngineVersionPerAllowedValue implements Serializable, Cloneable {

    /**
     * <p>
     * The allowed value for an option setting.
     * </p>
     */
    private String allowedValue;
    /**
     * <p>
     * The minimum DB engine version required for the allowed value.
     * </p>
     */
    private String minimumEngineVersion;

    /**
     * <p>
     * The allowed value for an option setting.
     * </p>
     * 
     * @param allowedValue
     *        The allowed value for an option setting.
     */

    public void setAllowedValue(String allowedValue) {
        this.allowedValue = allowedValue;
    }

    /**
     * <p>
     * The allowed value for an option setting.
     * </p>
     * 
     * @return The allowed value for an option setting.
     */

    public String getAllowedValue() {
        return this.allowedValue;
    }

    /**
     * <p>
     * The allowed value for an option setting.
     * </p>
     * 
     * @param allowedValue
     *        The allowed value for an option setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MinimumEngineVersionPerAllowedValue withAllowedValue(String allowedValue) {
        setAllowedValue(allowedValue);
        return this;
    }

    /**
     * <p>
     * The minimum DB engine version required for the allowed value.
     * </p>
     * 
     * @param minimumEngineVersion
     *        The minimum DB engine version required for the allowed value.
     */

    public void setMinimumEngineVersion(String minimumEngineVersion) {
        this.minimumEngineVersion = minimumEngineVersion;
    }

    /**
     * <p>
     * The minimum DB engine version required for the allowed value.
     * </p>
     * 
     * @return The minimum DB engine version required for the allowed value.
     */

    public String getMinimumEngineVersion() {
        return this.minimumEngineVersion;
    }

    /**
     * <p>
     * The minimum DB engine version required for the allowed value.
     * </p>
     * 
     * @param minimumEngineVersion
     *        The minimum DB engine version required for the allowed value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MinimumEngineVersionPerAllowedValue withMinimumEngineVersion(String minimumEngineVersion) {
        setMinimumEngineVersion(minimumEngineVersion);
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
        if (getAllowedValue() != null)
            sb.append("AllowedValue: ").append(getAllowedValue()).append(",");
        if (getMinimumEngineVersion() != null)
            sb.append("MinimumEngineVersion: ").append(getMinimumEngineVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MinimumEngineVersionPerAllowedValue == false)
            return false;
        MinimumEngineVersionPerAllowedValue other = (MinimumEngineVersionPerAllowedValue) obj;
        if (other.getAllowedValue() == null ^ this.getAllowedValue() == null)
            return false;
        if (other.getAllowedValue() != null && other.getAllowedValue().equals(this.getAllowedValue()) == false)
            return false;
        if (other.getMinimumEngineVersion() == null ^ this.getMinimumEngineVersion() == null)
            return false;
        if (other.getMinimumEngineVersion() != null && other.getMinimumEngineVersion().equals(this.getMinimumEngineVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedValue() == null) ? 0 : getAllowedValue().hashCode());
        hashCode = prime * hashCode + ((getMinimumEngineVersion() == null) ? 0 : getMinimumEngineVersion().hashCode());
        return hashCode;
    }

    @Override
    public MinimumEngineVersionPerAllowedValue clone() {
        try {
            return (MinimumEngineVersionPerAllowedValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
