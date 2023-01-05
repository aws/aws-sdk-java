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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the version control configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/VersionControlInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VersionControlInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when the version control system was last configured.
     * </p>
     */
    private String versionControlConfigurationTimeStamp;
    /**
     * <p>
     * The type of version control.
     * </p>
     */
    private String versionControlType;

    /**
     * <p>
     * The time when the version control system was last configured.
     * </p>
     * 
     * @param versionControlConfigurationTimeStamp
     *        The time when the version control system was last configured.
     */

    public void setVersionControlConfigurationTimeStamp(String versionControlConfigurationTimeStamp) {
        this.versionControlConfigurationTimeStamp = versionControlConfigurationTimeStamp;
    }

    /**
     * <p>
     * The time when the version control system was last configured.
     * </p>
     * 
     * @return The time when the version control system was last configured.
     */

    public String getVersionControlConfigurationTimeStamp() {
        return this.versionControlConfigurationTimeStamp;
    }

    /**
     * <p>
     * The time when the version control system was last configured.
     * </p>
     * 
     * @param versionControlConfigurationTimeStamp
     *        The time when the version control system was last configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionControlInfo withVersionControlConfigurationTimeStamp(String versionControlConfigurationTimeStamp) {
        setVersionControlConfigurationTimeStamp(versionControlConfigurationTimeStamp);
        return this;
    }

    /**
     * <p>
     * The type of version control.
     * </p>
     * 
     * @param versionControlType
     *        The type of version control.
     * @see VersionControlType
     */

    public void setVersionControlType(String versionControlType) {
        this.versionControlType = versionControlType;
    }

    /**
     * <p>
     * The type of version control.
     * </p>
     * 
     * @return The type of version control.
     * @see VersionControlType
     */

    public String getVersionControlType() {
        return this.versionControlType;
    }

    /**
     * <p>
     * The type of version control.
     * </p>
     * 
     * @param versionControlType
     *        The type of version control.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VersionControlType
     */

    public VersionControlInfo withVersionControlType(String versionControlType) {
        setVersionControlType(versionControlType);
        return this;
    }

    /**
     * <p>
     * The type of version control.
     * </p>
     * 
     * @param versionControlType
     *        The type of version control.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VersionControlType
     */

    public VersionControlInfo withVersionControlType(VersionControlType versionControlType) {
        this.versionControlType = versionControlType.toString();
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
        if (getVersionControlConfigurationTimeStamp() != null)
            sb.append("VersionControlConfigurationTimeStamp: ").append(getVersionControlConfigurationTimeStamp()).append(",");
        if (getVersionControlType() != null)
            sb.append("VersionControlType: ").append(getVersionControlType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VersionControlInfo == false)
            return false;
        VersionControlInfo other = (VersionControlInfo) obj;
        if (other.getVersionControlConfigurationTimeStamp() == null ^ this.getVersionControlConfigurationTimeStamp() == null)
            return false;
        if (other.getVersionControlConfigurationTimeStamp() != null
                && other.getVersionControlConfigurationTimeStamp().equals(this.getVersionControlConfigurationTimeStamp()) == false)
            return false;
        if (other.getVersionControlType() == null ^ this.getVersionControlType() == null)
            return false;
        if (other.getVersionControlType() != null && other.getVersionControlType().equals(this.getVersionControlType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersionControlConfigurationTimeStamp() == null) ? 0 : getVersionControlConfigurationTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getVersionControlType() == null) ? 0 : getVersionControlType().hashCode());
        return hashCode;
    }

    @Override
    public VersionControlInfo clone() {
        try {
            return (VersionControlInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.VersionControlInfoMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
