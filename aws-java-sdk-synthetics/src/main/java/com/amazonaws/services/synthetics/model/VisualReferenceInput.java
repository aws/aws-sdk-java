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
 * An object that specifies what screenshots to use as a baseline for visual monitoring by this canary. It can
 * optionally also specify parts of the screenshots to ignore during the visual monitoring comparison.
 * </p>
 * <p>
 * Visual monitoring is supported only on canaries running the <b>syn-puppeteer-node-3.2</b> runtime or later. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Library_SyntheticsLogger_VisualTesting.html"
 * > Visual monitoring</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Blueprints_VisualTesting.html"
 * > Visual monitoring blueprint</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/VisualReferenceInput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VisualReferenceInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of screenshots that will be used as the baseline for visual monitoring in future runs of this canary. If
     * there is a screenshot that you don't want to be used for visual monitoring, remove it from this array.
     * </p>
     */
    private java.util.List<BaseScreenshot> baseScreenshots;
    /**
     * <p>
     * Specifies which canary run to use the screenshots from as the baseline for future visual monitoring with this
     * canary. Valid values are <code>nextrun</code> to use the screenshots from the next run after this update is made,
     * <code>lastrun</code> to use the screenshots from the most recent run before this update was made, or the value of
     * <code>Id</code> in the <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CanaryRun.html"> CanaryRun</a> from
     * any past run of this canary.
     * </p>
     */
    private String baseCanaryRunId;

    /**
     * <p>
     * An array of screenshots that will be used as the baseline for visual monitoring in future runs of this canary. If
     * there is a screenshot that you don't want to be used for visual monitoring, remove it from this array.
     * </p>
     * 
     * @return An array of screenshots that will be used as the baseline for visual monitoring in future runs of this
     *         canary. If there is a screenshot that you don't want to be used for visual monitoring, remove it from
     *         this array.
     */

    public java.util.List<BaseScreenshot> getBaseScreenshots() {
        return baseScreenshots;
    }

    /**
     * <p>
     * An array of screenshots that will be used as the baseline for visual monitoring in future runs of this canary. If
     * there is a screenshot that you don't want to be used for visual monitoring, remove it from this array.
     * </p>
     * 
     * @param baseScreenshots
     *        An array of screenshots that will be used as the baseline for visual monitoring in future runs of this
     *        canary. If there is a screenshot that you don't want to be used for visual monitoring, remove it from this
     *        array.
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
     * An array of screenshots that will be used as the baseline for visual monitoring in future runs of this canary. If
     * there is a screenshot that you don't want to be used for visual monitoring, remove it from this array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBaseScreenshots(java.util.Collection)} or {@link #withBaseScreenshots(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param baseScreenshots
     *        An array of screenshots that will be used as the baseline for visual monitoring in future runs of this
     *        canary. If there is a screenshot that you don't want to be used for visual monitoring, remove it from this
     *        array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualReferenceInput withBaseScreenshots(BaseScreenshot... baseScreenshots) {
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
     * An array of screenshots that will be used as the baseline for visual monitoring in future runs of this canary. If
     * there is a screenshot that you don't want to be used for visual monitoring, remove it from this array.
     * </p>
     * 
     * @param baseScreenshots
     *        An array of screenshots that will be used as the baseline for visual monitoring in future runs of this
     *        canary. If there is a screenshot that you don't want to be used for visual monitoring, remove it from this
     *        array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualReferenceInput withBaseScreenshots(java.util.Collection<BaseScreenshot> baseScreenshots) {
        setBaseScreenshots(baseScreenshots);
        return this;
    }

    /**
     * <p>
     * Specifies which canary run to use the screenshots from as the baseline for future visual monitoring with this
     * canary. Valid values are <code>nextrun</code> to use the screenshots from the next run after this update is made,
     * <code>lastrun</code> to use the screenshots from the most recent run before this update was made, or the value of
     * <code>Id</code> in the <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CanaryRun.html"> CanaryRun</a> from
     * any past run of this canary.
     * </p>
     * 
     * @param baseCanaryRunId
     *        Specifies which canary run to use the screenshots from as the baseline for future visual monitoring with
     *        this canary. Valid values are <code>nextrun</code> to use the screenshots from the next run after this
     *        update is made, <code>lastrun</code> to use the screenshots from the most recent run before this update
     *        was made, or the value of <code>Id</code> in the <a
     *        href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CanaryRun.html"> CanaryRun</a>
     *        from any past run of this canary.
     */

    public void setBaseCanaryRunId(String baseCanaryRunId) {
        this.baseCanaryRunId = baseCanaryRunId;
    }

    /**
     * <p>
     * Specifies which canary run to use the screenshots from as the baseline for future visual monitoring with this
     * canary. Valid values are <code>nextrun</code> to use the screenshots from the next run after this update is made,
     * <code>lastrun</code> to use the screenshots from the most recent run before this update was made, or the value of
     * <code>Id</code> in the <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CanaryRun.html"> CanaryRun</a> from
     * any past run of this canary.
     * </p>
     * 
     * @return Specifies which canary run to use the screenshots from as the baseline for future visual monitoring with
     *         this canary. Valid values are <code>nextrun</code> to use the screenshots from the next run after this
     *         update is made, <code>lastrun</code> to use the screenshots from the most recent run before this update
     *         was made, or the value of <code>Id</code> in the <a
     *         href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CanaryRun.html"> CanaryRun</a>
     *         from any past run of this canary.
     */

    public String getBaseCanaryRunId() {
        return this.baseCanaryRunId;
    }

    /**
     * <p>
     * Specifies which canary run to use the screenshots from as the baseline for future visual monitoring with this
     * canary. Valid values are <code>nextrun</code> to use the screenshots from the next run after this update is made,
     * <code>lastrun</code> to use the screenshots from the most recent run before this update was made, or the value of
     * <code>Id</code> in the <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CanaryRun.html"> CanaryRun</a> from
     * any past run of this canary.
     * </p>
     * 
     * @param baseCanaryRunId
     *        Specifies which canary run to use the screenshots from as the baseline for future visual monitoring with
     *        this canary. Valid values are <code>nextrun</code> to use the screenshots from the next run after this
     *        update is made, <code>lastrun</code> to use the screenshots from the most recent run before this update
     *        was made, or the value of <code>Id</code> in the <a
     *        href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CanaryRun.html"> CanaryRun</a>
     *        from any past run of this canary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualReferenceInput withBaseCanaryRunId(String baseCanaryRunId) {
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

        if (obj instanceof VisualReferenceInput == false)
            return false;
        VisualReferenceInput other = (VisualReferenceInput) obj;
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
    public VisualReferenceInput clone() {
        try {
            return (VisualReferenceInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.VisualReferenceInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
