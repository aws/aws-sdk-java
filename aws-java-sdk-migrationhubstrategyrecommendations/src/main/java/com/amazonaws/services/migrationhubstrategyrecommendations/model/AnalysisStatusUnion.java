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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A combination of existing analysis statuses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/AnalysisStatusUnion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisStatusUnion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the analysis.
     * </p>
     */
    private String runtimeAnalysisStatus;
    /**
     * <p>
     * The status of the source code or database analysis.
     * </p>
     */
    private String srcCodeOrDbAnalysisStatus;

    /**
     * <p>
     * The status of the analysis.
     * </p>
     * 
     * @param runtimeAnalysisStatus
     *        The status of the analysis.
     * @see RuntimeAnalysisStatus
     */

    public void setRuntimeAnalysisStatus(String runtimeAnalysisStatus) {
        this.runtimeAnalysisStatus = runtimeAnalysisStatus;
    }

    /**
     * <p>
     * The status of the analysis.
     * </p>
     * 
     * @return The status of the analysis.
     * @see RuntimeAnalysisStatus
     */

    public String getRuntimeAnalysisStatus() {
        return this.runtimeAnalysisStatus;
    }

    /**
     * <p>
     * The status of the analysis.
     * </p>
     * 
     * @param runtimeAnalysisStatus
     *        The status of the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuntimeAnalysisStatus
     */

    public AnalysisStatusUnion withRuntimeAnalysisStatus(String runtimeAnalysisStatus) {
        setRuntimeAnalysisStatus(runtimeAnalysisStatus);
        return this;
    }

    /**
     * <p>
     * The status of the analysis.
     * </p>
     * 
     * @param runtimeAnalysisStatus
     *        The status of the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuntimeAnalysisStatus
     */

    public AnalysisStatusUnion withRuntimeAnalysisStatus(RuntimeAnalysisStatus runtimeAnalysisStatus) {
        this.runtimeAnalysisStatus = runtimeAnalysisStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status of the source code or database analysis.
     * </p>
     * 
     * @param srcCodeOrDbAnalysisStatus
     *        The status of the source code or database analysis.
     * @see SrcCodeOrDbAnalysisStatus
     */

    public void setSrcCodeOrDbAnalysisStatus(String srcCodeOrDbAnalysisStatus) {
        this.srcCodeOrDbAnalysisStatus = srcCodeOrDbAnalysisStatus;
    }

    /**
     * <p>
     * The status of the source code or database analysis.
     * </p>
     * 
     * @return The status of the source code or database analysis.
     * @see SrcCodeOrDbAnalysisStatus
     */

    public String getSrcCodeOrDbAnalysisStatus() {
        return this.srcCodeOrDbAnalysisStatus;
    }

    /**
     * <p>
     * The status of the source code or database analysis.
     * </p>
     * 
     * @param srcCodeOrDbAnalysisStatus
     *        The status of the source code or database analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SrcCodeOrDbAnalysisStatus
     */

    public AnalysisStatusUnion withSrcCodeOrDbAnalysisStatus(String srcCodeOrDbAnalysisStatus) {
        setSrcCodeOrDbAnalysisStatus(srcCodeOrDbAnalysisStatus);
        return this;
    }

    /**
     * <p>
     * The status of the source code or database analysis.
     * </p>
     * 
     * @param srcCodeOrDbAnalysisStatus
     *        The status of the source code or database analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SrcCodeOrDbAnalysisStatus
     */

    public AnalysisStatusUnion withSrcCodeOrDbAnalysisStatus(SrcCodeOrDbAnalysisStatus srcCodeOrDbAnalysisStatus) {
        this.srcCodeOrDbAnalysisStatus = srcCodeOrDbAnalysisStatus.toString();
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
        if (getRuntimeAnalysisStatus() != null)
            sb.append("RuntimeAnalysisStatus: ").append(getRuntimeAnalysisStatus()).append(",");
        if (getSrcCodeOrDbAnalysisStatus() != null)
            sb.append("SrcCodeOrDbAnalysisStatus: ").append(getSrcCodeOrDbAnalysisStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisStatusUnion == false)
            return false;
        AnalysisStatusUnion other = (AnalysisStatusUnion) obj;
        if (other.getRuntimeAnalysisStatus() == null ^ this.getRuntimeAnalysisStatus() == null)
            return false;
        if (other.getRuntimeAnalysisStatus() != null && other.getRuntimeAnalysisStatus().equals(this.getRuntimeAnalysisStatus()) == false)
            return false;
        if (other.getSrcCodeOrDbAnalysisStatus() == null ^ this.getSrcCodeOrDbAnalysisStatus() == null)
            return false;
        if (other.getSrcCodeOrDbAnalysisStatus() != null && other.getSrcCodeOrDbAnalysisStatus().equals(this.getSrcCodeOrDbAnalysisStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuntimeAnalysisStatus() == null) ? 0 : getRuntimeAnalysisStatus().hashCode());
        hashCode = prime * hashCode + ((getSrcCodeOrDbAnalysisStatus() == null) ? 0 : getSrcCodeOrDbAnalysisStatus().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisStatusUnion clone() {
        try {
            return (AnalysisStatusUnion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.AnalysisStatusUnionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
