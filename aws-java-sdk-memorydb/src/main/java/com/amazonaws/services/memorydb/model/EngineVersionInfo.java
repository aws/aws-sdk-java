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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details of the Redis engine version
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/EngineVersionInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EngineVersionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The engine version
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The patched engine version
     * </p>
     */
    private String enginePatchVersion;
    /**
     * <p>
     * Specifies the name of the parameter group family to which the engine default parameters apply.
     * </p>
     */
    private String parameterGroupFamily;

    /**
     * <p>
     * The engine version
     * </p>
     * 
     * @param engineVersion
     *        The engine version
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version
     * </p>
     * 
     * @return The engine version
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version
     * </p>
     * 
     * @param engineVersion
     *        The engine version
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineVersionInfo withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The patched engine version
     * </p>
     * 
     * @param enginePatchVersion
     *        The patched engine version
     */

    public void setEnginePatchVersion(String enginePatchVersion) {
        this.enginePatchVersion = enginePatchVersion;
    }

    /**
     * <p>
     * The patched engine version
     * </p>
     * 
     * @return The patched engine version
     */

    public String getEnginePatchVersion() {
        return this.enginePatchVersion;
    }

    /**
     * <p>
     * The patched engine version
     * </p>
     * 
     * @param enginePatchVersion
     *        The patched engine version
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineVersionInfo withEnginePatchVersion(String enginePatchVersion) {
        setEnginePatchVersion(enginePatchVersion);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the parameter group family to which the engine default parameters apply.
     * </p>
     * 
     * @param parameterGroupFamily
     *        Specifies the name of the parameter group family to which the engine default parameters apply.
     */

    public void setParameterGroupFamily(String parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
    }

    /**
     * <p>
     * Specifies the name of the parameter group family to which the engine default parameters apply.
     * </p>
     * 
     * @return Specifies the name of the parameter group family to which the engine default parameters apply.
     */

    public String getParameterGroupFamily() {
        return this.parameterGroupFamily;
    }

    /**
     * <p>
     * Specifies the name of the parameter group family to which the engine default parameters apply.
     * </p>
     * 
     * @param parameterGroupFamily
     *        Specifies the name of the parameter group family to which the engine default parameters apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineVersionInfo withParameterGroupFamily(String parameterGroupFamily) {
        setParameterGroupFamily(parameterGroupFamily);
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
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getEnginePatchVersion() != null)
            sb.append("EnginePatchVersion: ").append(getEnginePatchVersion()).append(",");
        if (getParameterGroupFamily() != null)
            sb.append("ParameterGroupFamily: ").append(getParameterGroupFamily());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EngineVersionInfo == false)
            return false;
        EngineVersionInfo other = (EngineVersionInfo) obj;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getEnginePatchVersion() == null ^ this.getEnginePatchVersion() == null)
            return false;
        if (other.getEnginePatchVersion() != null && other.getEnginePatchVersion().equals(this.getEnginePatchVersion()) == false)
            return false;
        if (other.getParameterGroupFamily() == null ^ this.getParameterGroupFamily() == null)
            return false;
        if (other.getParameterGroupFamily() != null && other.getParameterGroupFamily().equals(this.getParameterGroupFamily()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getEnginePatchVersion() == null) ? 0 : getEnginePatchVersion().hashCode());
        hashCode = prime * hashCode + ((getParameterGroupFamily() == null) ? 0 : getParameterGroupFamily().hashCode());
        return hashCode;
    }

    @Override
    public EngineVersionInfo clone() {
        try {
            return (EngineVersionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.EngineVersionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
