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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The function's <a href="https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html">SnapStart</a> setting.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/SnapStartResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapStartResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When set to <code>PublishedVersions</code>, Lambda creates a snapshot of the execution environment when you
     * publish a function version.
     * </p>
     */
    private String applyOn;
    /**
     * <p>
     * When you provide a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using"
     * >qualified Amazon Resource Name (ARN)</a>, this response element indicates whether SnapStart is activated for the
     * specified function version.
     * </p>
     */
    private String optimizationStatus;

    /**
     * <p>
     * When set to <code>PublishedVersions</code>, Lambda creates a snapshot of the execution environment when you
     * publish a function version.
     * </p>
     * 
     * @param applyOn
     *        When set to <code>PublishedVersions</code>, Lambda creates a snapshot of the execution environment when
     *        you publish a function version.
     * @see SnapStartApplyOn
     */

    public void setApplyOn(String applyOn) {
        this.applyOn = applyOn;
    }

    /**
     * <p>
     * When set to <code>PublishedVersions</code>, Lambda creates a snapshot of the execution environment when you
     * publish a function version.
     * </p>
     * 
     * @return When set to <code>PublishedVersions</code>, Lambda creates a snapshot of the execution environment when
     *         you publish a function version.
     * @see SnapStartApplyOn
     */

    public String getApplyOn() {
        return this.applyOn;
    }

    /**
     * <p>
     * When set to <code>PublishedVersions</code>, Lambda creates a snapshot of the execution environment when you
     * publish a function version.
     * </p>
     * 
     * @param applyOn
     *        When set to <code>PublishedVersions</code>, Lambda creates a snapshot of the execution environment when
     *        you publish a function version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapStartApplyOn
     */

    public SnapStartResponse withApplyOn(String applyOn) {
        setApplyOn(applyOn);
        return this;
    }

    /**
     * <p>
     * When set to <code>PublishedVersions</code>, Lambda creates a snapshot of the execution environment when you
     * publish a function version.
     * </p>
     * 
     * @param applyOn
     *        When set to <code>PublishedVersions</code>, Lambda creates a snapshot of the execution environment when
     *        you publish a function version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapStartApplyOn
     */

    public SnapStartResponse withApplyOn(SnapStartApplyOn applyOn) {
        this.applyOn = applyOn.toString();
        return this;
    }

    /**
     * <p>
     * When you provide a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using"
     * >qualified Amazon Resource Name (ARN)</a>, this response element indicates whether SnapStart is activated for the
     * specified function version.
     * </p>
     * 
     * @param optimizationStatus
     *        When you provide a <a href=
     *        "https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using"
     *        >qualified Amazon Resource Name (ARN)</a>, this response element indicates whether SnapStart is activated
     *        for the specified function version.
     * @see SnapStartOptimizationStatus
     */

    public void setOptimizationStatus(String optimizationStatus) {
        this.optimizationStatus = optimizationStatus;
    }

    /**
     * <p>
     * When you provide a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using"
     * >qualified Amazon Resource Name (ARN)</a>, this response element indicates whether SnapStart is activated for the
     * specified function version.
     * </p>
     * 
     * @return When you provide a <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using"
     *         >qualified Amazon Resource Name (ARN)</a>, this response element indicates whether SnapStart is activated
     *         for the specified function version.
     * @see SnapStartOptimizationStatus
     */

    public String getOptimizationStatus() {
        return this.optimizationStatus;
    }

    /**
     * <p>
     * When you provide a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using"
     * >qualified Amazon Resource Name (ARN)</a>, this response element indicates whether SnapStart is activated for the
     * specified function version.
     * </p>
     * 
     * @param optimizationStatus
     *        When you provide a <a href=
     *        "https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using"
     *        >qualified Amazon Resource Name (ARN)</a>, this response element indicates whether SnapStart is activated
     *        for the specified function version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapStartOptimizationStatus
     */

    public SnapStartResponse withOptimizationStatus(String optimizationStatus) {
        setOptimizationStatus(optimizationStatus);
        return this;
    }

    /**
     * <p>
     * When you provide a <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using"
     * >qualified Amazon Resource Name (ARN)</a>, this response element indicates whether SnapStart is activated for the
     * specified function version.
     * </p>
     * 
     * @param optimizationStatus
     *        When you provide a <a href=
     *        "https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html#versioning-versions-using"
     *        >qualified Amazon Resource Name (ARN)</a>, this response element indicates whether SnapStart is activated
     *        for the specified function version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapStartOptimizationStatus
     */

    public SnapStartResponse withOptimizationStatus(SnapStartOptimizationStatus optimizationStatus) {
        this.optimizationStatus = optimizationStatus.toString();
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
        if (getApplyOn() != null)
            sb.append("ApplyOn: ").append(getApplyOn()).append(",");
        if (getOptimizationStatus() != null)
            sb.append("OptimizationStatus: ").append(getOptimizationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapStartResponse == false)
            return false;
        SnapStartResponse other = (SnapStartResponse) obj;
        if (other.getApplyOn() == null ^ this.getApplyOn() == null)
            return false;
        if (other.getApplyOn() != null && other.getApplyOn().equals(this.getApplyOn()) == false)
            return false;
        if (other.getOptimizationStatus() == null ^ this.getOptimizationStatus() == null)
            return false;
        if (other.getOptimizationStatus() != null && other.getOptimizationStatus().equals(this.getOptimizationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplyOn() == null) ? 0 : getApplyOn().hashCode());
        hashCode = prime * hashCode + ((getOptimizationStatus() == null) ? 0 : getOptimizationStatus().hashCode());
        return hashCode;
    }

    @Override
    public SnapStartResponse clone() {
        try {
            return (SnapStartResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.SnapStartResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
