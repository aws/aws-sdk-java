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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The override parameters for a single analysis that is being imported.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleImportJobAnalysisOverrideParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobAnalysisOverrideParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the analysis that you ant to apply overrides to.
     * </p>
     */
    private String analysisId;
    /**
     * <p>
     * A new name for the analysis.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ID of the analysis that you ant to apply overrides to.
     * </p>
     * 
     * @param analysisId
     *        The ID of the analysis that you ant to apply overrides to.
     */

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    /**
     * <p>
     * The ID of the analysis that you ant to apply overrides to.
     * </p>
     * 
     * @return The ID of the analysis that you ant to apply overrides to.
     */

    public String getAnalysisId() {
        return this.analysisId;
    }

    /**
     * <p>
     * The ID of the analysis that you ant to apply overrides to.
     * </p>
     * 
     * @param analysisId
     *        The ID of the analysis that you ant to apply overrides to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobAnalysisOverrideParameters withAnalysisId(String analysisId) {
        setAnalysisId(analysisId);
        return this;
    }

    /**
     * <p>
     * A new name for the analysis.
     * </p>
     * 
     * @param name
     *        A new name for the analysis.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A new name for the analysis.
     * </p>
     * 
     * @return A new name for the analysis.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A new name for the analysis.
     * </p>
     * 
     * @param name
     *        A new name for the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobAnalysisOverrideParameters withName(String name) {
        setName(name);
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
        if (getAnalysisId() != null)
            sb.append("AnalysisId: ").append(getAnalysisId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetBundleImportJobAnalysisOverrideParameters == false)
            return false;
        AssetBundleImportJobAnalysisOverrideParameters other = (AssetBundleImportJobAnalysisOverrideParameters) obj;
        if (other.getAnalysisId() == null ^ this.getAnalysisId() == null)
            return false;
        if (other.getAnalysisId() != null && other.getAnalysisId().equals(this.getAnalysisId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalysisId() == null) ? 0 : getAnalysisId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleImportJobAnalysisOverrideParameters clone() {
        try {
            return (AssetBundleImportJobAnalysisOverrideParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleImportJobAnalysisOverrideParametersMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
