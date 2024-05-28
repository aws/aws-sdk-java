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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the <code>EnabledBaseline</code> resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnabledBaselineDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnabledBaselineDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the <code>EnabledBaseline</code> resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The specific <code>Baseline</code> enabled as part of the <code>EnabledBaseline</code> resource.
     * </p>
     */
    private String baselineIdentifier;
    /**
     * <p>
     * The enabled version of the <code>Baseline</code>.
     * </p>
     */
    private String baselineVersion;

    private EnablementStatusSummary statusSummary;
    /**
     * <p>
     * The target on which to enable the <code>Baseline</code>.
     * </p>
     */
    private String targetIdentifier;

    /**
     * <p>
     * The ARN of the <code>EnabledBaseline</code> resource.
     * </p>
     * 
     * @param arn
     *        The ARN of the <code>EnabledBaseline</code> resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the <code>EnabledBaseline</code> resource.
     * </p>
     * 
     * @return The ARN of the <code>EnabledBaseline</code> resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the <code>EnabledBaseline</code> resource.
     * </p>
     * 
     * @param arn
     *        The ARN of the <code>EnabledBaseline</code> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledBaselineDetails withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The specific <code>Baseline</code> enabled as part of the <code>EnabledBaseline</code> resource.
     * </p>
     * 
     * @param baselineIdentifier
     *        The specific <code>Baseline</code> enabled as part of the <code>EnabledBaseline</code> resource.
     */

    public void setBaselineIdentifier(String baselineIdentifier) {
        this.baselineIdentifier = baselineIdentifier;
    }

    /**
     * <p>
     * The specific <code>Baseline</code> enabled as part of the <code>EnabledBaseline</code> resource.
     * </p>
     * 
     * @return The specific <code>Baseline</code> enabled as part of the <code>EnabledBaseline</code> resource.
     */

    public String getBaselineIdentifier() {
        return this.baselineIdentifier;
    }

    /**
     * <p>
     * The specific <code>Baseline</code> enabled as part of the <code>EnabledBaseline</code> resource.
     * </p>
     * 
     * @param baselineIdentifier
     *        The specific <code>Baseline</code> enabled as part of the <code>EnabledBaseline</code> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledBaselineDetails withBaselineIdentifier(String baselineIdentifier) {
        setBaselineIdentifier(baselineIdentifier);
        return this;
    }

    /**
     * <p>
     * The enabled version of the <code>Baseline</code>.
     * </p>
     * 
     * @param baselineVersion
     *        The enabled version of the <code>Baseline</code>.
     */

    public void setBaselineVersion(String baselineVersion) {
        this.baselineVersion = baselineVersion;
    }

    /**
     * <p>
     * The enabled version of the <code>Baseline</code>.
     * </p>
     * 
     * @return The enabled version of the <code>Baseline</code>.
     */

    public String getBaselineVersion() {
        return this.baselineVersion;
    }

    /**
     * <p>
     * The enabled version of the <code>Baseline</code>.
     * </p>
     * 
     * @param baselineVersion
     *        The enabled version of the <code>Baseline</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledBaselineDetails withBaselineVersion(String baselineVersion) {
        setBaselineVersion(baselineVersion);
        return this;
    }

    /**
     * @param statusSummary
     */

    public void setStatusSummary(EnablementStatusSummary statusSummary) {
        this.statusSummary = statusSummary;
    }

    /**
     * @return
     */

    public EnablementStatusSummary getStatusSummary() {
        return this.statusSummary;
    }

    /**
     * @param statusSummary
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledBaselineDetails withStatusSummary(EnablementStatusSummary statusSummary) {
        setStatusSummary(statusSummary);
        return this;
    }

    /**
     * <p>
     * The target on which to enable the <code>Baseline</code>.
     * </p>
     * 
     * @param targetIdentifier
     *        The target on which to enable the <code>Baseline</code>.
     */

    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    /**
     * <p>
     * The target on which to enable the <code>Baseline</code>.
     * </p>
     * 
     * @return The target on which to enable the <code>Baseline</code>.
     */

    public String getTargetIdentifier() {
        return this.targetIdentifier;
    }

    /**
     * <p>
     * The target on which to enable the <code>Baseline</code>.
     * </p>
     * 
     * @param targetIdentifier
     *        The target on which to enable the <code>Baseline</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledBaselineDetails withTargetIdentifier(String targetIdentifier) {
        setTargetIdentifier(targetIdentifier);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getBaselineIdentifier() != null)
            sb.append("BaselineIdentifier: ").append(getBaselineIdentifier()).append(",");
        if (getBaselineVersion() != null)
            sb.append("BaselineVersion: ").append(getBaselineVersion()).append(",");
        if (getStatusSummary() != null)
            sb.append("StatusSummary: ").append(getStatusSummary()).append(",");
        if (getTargetIdentifier() != null)
            sb.append("TargetIdentifier: ").append(getTargetIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnabledBaselineDetails == false)
            return false;
        EnabledBaselineDetails other = (EnabledBaselineDetails) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getBaselineIdentifier() == null ^ this.getBaselineIdentifier() == null)
            return false;
        if (other.getBaselineIdentifier() != null && other.getBaselineIdentifier().equals(this.getBaselineIdentifier()) == false)
            return false;
        if (other.getBaselineVersion() == null ^ this.getBaselineVersion() == null)
            return false;
        if (other.getBaselineVersion() != null && other.getBaselineVersion().equals(this.getBaselineVersion()) == false)
            return false;
        if (other.getStatusSummary() == null ^ this.getStatusSummary() == null)
            return false;
        if (other.getStatusSummary() != null && other.getStatusSummary().equals(this.getStatusSummary()) == false)
            return false;
        if (other.getTargetIdentifier() == null ^ this.getTargetIdentifier() == null)
            return false;
        if (other.getTargetIdentifier() != null && other.getTargetIdentifier().equals(this.getTargetIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getBaselineIdentifier() == null) ? 0 : getBaselineIdentifier().hashCode());
        hashCode = prime * hashCode + ((getBaselineVersion() == null) ? 0 : getBaselineVersion().hashCode());
        hashCode = prime * hashCode + ((getStatusSummary() == null) ? 0 : getStatusSummary().hashCode());
        hashCode = prime * hashCode + ((getTargetIdentifier() == null) ? 0 : getTargetIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public EnabledBaselineDetails clone() {
        try {
            return (EnabledBaselineDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controltower.model.transform.EnabledBaselineDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
