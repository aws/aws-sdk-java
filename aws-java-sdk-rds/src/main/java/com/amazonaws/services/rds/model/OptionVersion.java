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
 * The version for an option. Option group option versions are returned by the <a>DescribeOptionGroupOptions</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/OptionVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptionVersion implements Serializable, Cloneable {

    /**
     * <p>
     * The version of the option.
     * </p>
     */
    private String version;
    /**
     * <p>
     * True if the version is the default version of the option, and otherwise false.
     * </p>
     */
    private Boolean isDefault;

    /**
     * <p>
     * The version of the option.
     * </p>
     * 
     * @param version
     *        The version of the option.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the option.
     * </p>
     * 
     * @return The version of the option.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the option.
     * </p>
     * 
     * @param version
     *        The version of the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionVersion withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * True if the version is the default version of the option, and otherwise false.
     * </p>
     * 
     * @param isDefault
     *        True if the version is the default version of the option, and otherwise false.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * True if the version is the default version of the option, and otherwise false.
     * </p>
     * 
     * @return True if the version is the default version of the option, and otherwise false.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * True if the version is the default version of the option, and otherwise false.
     * </p>
     * 
     * @param isDefault
     *        True if the version is the default version of the option, and otherwise false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionVersion withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * True if the version is the default version of the option, and otherwise false.
     * </p>
     * 
     * @return True if the version is the default version of the option, and otherwise false.
     */

    public Boolean isDefault() {
        return this.isDefault;
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionVersion == false)
            return false;
        OptionVersion other = (OptionVersion) obj;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        return hashCode;
    }

    @Override
    public OptionVersion clone() {
        try {
            return (OptionVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
