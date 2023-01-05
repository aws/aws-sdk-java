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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * If this canary performs visual monitoring by comparing screenshots, this structure contains the ID of the canary run
 * that is used as the baseline for screenshots, and the coordinates of any parts of those screenshots that are ignored
 * during visual monitoring comparison.
 * </p>
 * <p>
 * Visual monitoring is supported only on canaries running the <b>syn-puppeteer-node-3.2</b> runtime or later.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/VisualReferenceOutput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VisualReferenceOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of screenshots that are used as the baseline for comparisons during visual monitoring.
     * </p>
     */
    private java.util.List<BaseScreenshot> baseScreenshots;
    /**
     * <p>
     * The ID of the canary run that produced the baseline screenshots that are used for visual monitoring comparisons
     * by this canary.
     * </p>
     */
    private String baseCanaryRunId;

    /**
     * <p>
     * An array of screenshots that are used as the baseline for comparisons during visual monitoring.
     * </p>
     * 
     * @return An array of screenshots that are used as the baseline for comparisons during visual monitoring.
     */

    public java.util.List<BaseScreenshot> getBaseScreenshots() {
        return baseScreenshots;
    }

    /**
     * <p>
     * An array of screenshots that are used as the baseline for comparisons during visual monitoring.
     * </p>
     * 
     * @param baseScreenshots
     *        An array of screenshots that are used as the baseline for comparisons during visual monitoring.
     */

    public void setBaseScreenshots(java.util.Collection<BaseScreenshot> baseScreenshots) {
        if (baseScreenshots == null) {
            this.baseScreenshots = null;
            return;
        }

        this.baseScreenshots = new java.util.ArrayList<BaseScreenshot>(baseScreenshots);
    }

    /**
     * <p>
     * An array of screenshots that are used as the baseline for comparisons during visual monitoring.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBaseScreenshots(java.util.Collection)} or {@link #withBaseScreenshots(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param baseScreenshots
     *        An array of screenshots that are used as the baseline for comparisons during visual monitoring.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualReferenceOutput withBaseScreenshots(BaseScreenshot... baseScreenshots) {
        if (this.baseScreenshots == null) {
            setBaseScreenshots(new java.util.ArrayList<BaseScreenshot>(baseScreenshots.length));
        }
        for (BaseScreenshot ele : baseScreenshots) {
            this.baseScreenshots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of screenshots that are used as the baseline for comparisons during visual monitoring.
     * </p>
     * 
     * @param baseScreenshots
     *        An array of screenshots that are used as the baseline for comparisons during visual monitoring.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualReferenceOutput withBaseScreenshots(java.util.Collection<BaseScreenshot> baseScreenshots) {
        setBaseScreenshots(baseScreenshots);
        return this;
    }

    /**
     * <p>
     * The ID of the canary run that produced the baseline screenshots that are used for visual monitoring comparisons
     * by this canary.
     * </p>
     * 
     * @param baseCanaryRunId
     *        The ID of the canary run that produced the baseline screenshots that are used for visual monitoring
     *        comparisons by this canary.
     */

    public void setBaseCanaryRunId(String baseCanaryRunId) {
        this.baseCanaryRunId = baseCanaryRunId;
    }

    /**
     * <p>
     * The ID of the canary run that produced the baseline screenshots that are used for visual monitoring comparisons
     * by this canary.
     * </p>
     * 
     * @return The ID of the canary run that produced the baseline screenshots that are used for visual monitoring
     *         comparisons by this canary.
     */

    public String getBaseCanaryRunId() {
        return this.baseCanaryRunId;
    }

    /**
     * <p>
     * The ID of the canary run that produced the baseline screenshots that are used for visual monitoring comparisons
     * by this canary.
     * </p>
     * 
     * @param baseCanaryRunId
     *        The ID of the canary run that produced the baseline screenshots that are used for visual monitoring
     *        comparisons by this canary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualReferenceOutput withBaseCanaryRunId(String baseCanaryRunId) {
        setBaseCanaryRunId(baseCanaryRunId);
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
        if (getBaseScreenshots() != null)
            sb.append("BaseScreenshots: ").append(getBaseScreenshots()).append(",");
        if (getBaseCanaryRunId() != null)
            sb.append("BaseCanaryRunId: ").append(getBaseCanaryRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VisualReferenceOutput == false)
            return false;
        VisualReferenceOutput other = (VisualReferenceOutput) obj;
        if (other.getBaseScreenshots() == null ^ this.getBaseScreenshots() == null)
            return false;
        if (other.getBaseScreenshots() != null && other.getBaseScreenshots().equals(this.getBaseScreenshots()) == false)
            return false;
        if (other.getBaseCanaryRunId() == null ^ this.getBaseCanaryRunId() == null)
            return false;
        if (other.getBaseCanaryRunId() != null && other.getBaseCanaryRunId().equals(this.getBaseCanaryRunId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseScreenshots() == null) ? 0 : getBaseScreenshots().hashCode());
        hashCode = prime * hashCode + ((getBaseCanaryRunId() == null) ? 0 : getBaseCanaryRunId().hashCode());
        return hashCode;
    }

    @Override
    public VisualReferenceOutput clone() {
        try {
            return (VisualReferenceOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.VisualReferenceOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
