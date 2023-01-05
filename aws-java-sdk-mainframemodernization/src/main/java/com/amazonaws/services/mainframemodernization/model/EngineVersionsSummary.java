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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A subset of information about the engine version for a specific application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/EngineVersionsSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EngineVersionsSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of target platform for the application.
     * </p>
     */
    private String engineType;
    /**
     * <p>
     * The version of the engine type used by the application.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The type of target platform for the application.
     * </p>
     * 
     * @param engineType
     *        The type of target platform for the application.
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * <p>
     * The type of target platform for the application.
     * </p>
     * 
     * @return The type of target platform for the application.
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * <p>
     * The type of target platform for the application.
     * </p>
     * 
     * @param engineType
     *        The type of target platform for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineVersionsSummary withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * <p>
     * The version of the engine type used by the application.
     * </p>
     * 
     * @param engineVersion
     *        The version of the engine type used by the application.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the engine type used by the application.
     * </p>
     * 
     * @return The version of the engine type used by the application.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the engine type used by the application.
     * </p>
     * 
     * @param engineVersion
     *        The version of the engine type used by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineVersionsSummary withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
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
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EngineVersionsSummary == false)
            return false;
        EngineVersionsSummary other = (EngineVersionsSummary) obj;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        return hashCode;
    }

    @Override
    public EngineVersionsSummary clone() {
        try {
            return (EngineVersionsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.EngineVersionsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
