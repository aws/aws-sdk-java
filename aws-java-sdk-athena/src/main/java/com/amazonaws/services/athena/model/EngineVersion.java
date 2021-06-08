/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Athena engine version for running queries.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/EngineVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EngineVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The engine version requested by the user. Possible values are determined by the output of
     * <code>ListEngineVersions</code>, including Auto. The default is Auto.
     * </p>
     */
    private String selectedEngineVersion;
    /**
     * <p>
     * Read only. The engine version on which the query runs. If the user requests a valid engine version other than
     * Auto, the effective engine version is the same as the engine version that the user requested. If the user
     * requests Auto, the effective engine version is chosen by Athena. When a request to update the engine version is
     * made by a <code>CreateWorkGroup</code> or <code>UpdateWorkGroup</code> operation, the
     * <code>EffectiveEngineVersion</code> field is ignored.
     * </p>
     */
    private String effectiveEngineVersion;

    /**
     * <p>
     * The engine version requested by the user. Possible values are determined by the output of
     * <code>ListEngineVersions</code>, including Auto. The default is Auto.
     * </p>
     * 
     * @param selectedEngineVersion
     *        The engine version requested by the user. Possible values are determined by the output of
     *        <code>ListEngineVersions</code>, including Auto. The default is Auto.
     */

    public void setSelectedEngineVersion(String selectedEngineVersion) {
        this.selectedEngineVersion = selectedEngineVersion;
    }

    /**
     * <p>
     * The engine version requested by the user. Possible values are determined by the output of
     * <code>ListEngineVersions</code>, including Auto. The default is Auto.
     * </p>
     * 
     * @return The engine version requested by the user. Possible values are determined by the output of
     *         <code>ListEngineVersions</code>, including Auto. The default is Auto.
     */

    public String getSelectedEngineVersion() {
        return this.selectedEngineVersion;
    }

    /**
     * <p>
     * The engine version requested by the user. Possible values are determined by the output of
     * <code>ListEngineVersions</code>, including Auto. The default is Auto.
     * </p>
     * 
     * @param selectedEngineVersion
     *        The engine version requested by the user. Possible values are determined by the output of
     *        <code>ListEngineVersions</code>, including Auto. The default is Auto.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineVersion withSelectedEngineVersion(String selectedEngineVersion) {
        setSelectedEngineVersion(selectedEngineVersion);
        return this;
    }

    /**
     * <p>
     * Read only. The engine version on which the query runs. If the user requests a valid engine version other than
     * Auto, the effective engine version is the same as the engine version that the user requested. If the user
     * requests Auto, the effective engine version is chosen by Athena. When a request to update the engine version is
     * made by a <code>CreateWorkGroup</code> or <code>UpdateWorkGroup</code> operation, the
     * <code>EffectiveEngineVersion</code> field is ignored.
     * </p>
     * 
     * @param effectiveEngineVersion
     *        Read only. The engine version on which the query runs. If the user requests a valid engine version other
     *        than Auto, the effective engine version is the same as the engine version that the user requested. If the
     *        user requests Auto, the effective engine version is chosen by Athena. When a request to update the engine
     *        version is made by a <code>CreateWorkGroup</code> or <code>UpdateWorkGroup</code> operation, the
     *        <code>EffectiveEngineVersion</code> field is ignored.
     */

    public void setEffectiveEngineVersion(String effectiveEngineVersion) {
        this.effectiveEngineVersion = effectiveEngineVersion;
    }

    /**
     * <p>
     * Read only. The engine version on which the query runs. If the user requests a valid engine version other than
     * Auto, the effective engine version is the same as the engine version that the user requested. If the user
     * requests Auto, the effective engine version is chosen by Athena. When a request to update the engine version is
     * made by a <code>CreateWorkGroup</code> or <code>UpdateWorkGroup</code> operation, the
     * <code>EffectiveEngineVersion</code> field is ignored.
     * </p>
     * 
     * @return Read only. The engine version on which the query runs. If the user requests a valid engine version other
     *         than Auto, the effective engine version is the same as the engine version that the user requested. If the
     *         user requests Auto, the effective engine version is chosen by Athena. When a request to update the engine
     *         version is made by a <code>CreateWorkGroup</code> or <code>UpdateWorkGroup</code> operation, the
     *         <code>EffectiveEngineVersion</code> field is ignored.
     */

    public String getEffectiveEngineVersion() {
        return this.effectiveEngineVersion;
    }

    /**
     * <p>
     * Read only. The engine version on which the query runs. If the user requests a valid engine version other than
     * Auto, the effective engine version is the same as the engine version that the user requested. If the user
     * requests Auto, the effective engine version is chosen by Athena. When a request to update the engine version is
     * made by a <code>CreateWorkGroup</code> or <code>UpdateWorkGroup</code> operation, the
     * <code>EffectiveEngineVersion</code> field is ignored.
     * </p>
     * 
     * @param effectiveEngineVersion
     *        Read only. The engine version on which the query runs. If the user requests a valid engine version other
     *        than Auto, the effective engine version is the same as the engine version that the user requested. If the
     *        user requests Auto, the effective engine version is chosen by Athena. When a request to update the engine
     *        version is made by a <code>CreateWorkGroup</code> or <code>UpdateWorkGroup</code> operation, the
     *        <code>EffectiveEngineVersion</code> field is ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineVersion withEffectiveEngineVersion(String effectiveEngineVersion) {
        setEffectiveEngineVersion(effectiveEngineVersion);
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
        if (getSelectedEngineVersion() != null)
            sb.append("SelectedEngineVersion: ").append(getSelectedEngineVersion()).append(",");
        if (getEffectiveEngineVersion() != null)
            sb.append("EffectiveEngineVersion: ").append(getEffectiveEngineVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EngineVersion == false)
            return false;
        EngineVersion other = (EngineVersion) obj;
        if (other.getSelectedEngineVersion() == null ^ this.getSelectedEngineVersion() == null)
            return false;
        if (other.getSelectedEngineVersion() != null && other.getSelectedEngineVersion().equals(this.getSelectedEngineVersion()) == false)
            return false;
        if (other.getEffectiveEngineVersion() == null ^ this.getEffectiveEngineVersion() == null)
            return false;
        if (other.getEffectiveEngineVersion() != null && other.getEffectiveEngineVersion().equals(this.getEffectiveEngineVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelectedEngineVersion() == null) ? 0 : getSelectedEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getEffectiveEngineVersion() == null) ? 0 : getEffectiveEngineVersion().hashCode());
        return hashCode;
    }

    @Override
    public EngineVersion clone() {
        try {
            return (EngineVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.EngineVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
