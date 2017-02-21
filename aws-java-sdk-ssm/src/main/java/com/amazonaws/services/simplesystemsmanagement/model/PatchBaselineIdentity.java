/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the basic information about a patch baseline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PatchBaselineIdentity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatchBaselineIdentity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the patch baseline.
     * </p>
     */
    private String baselineId;
    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     */
    private String baselineName;
    /**
     * <p>
     * The description of the patch baseline.
     * </p>
     */
    private String baselineDescription;
    /**
     * <p>
     * Whether this is the default baseline.
     * </p>
     */
    private Boolean defaultBaseline;

    /**
     * <p>
     * The ID of the patch baseline.
     * </p>
     * 
     * @param baselineId
     *        The ID of the patch baseline.
     */

    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    /**
     * <p>
     * The ID of the patch baseline.
     * </p>
     * 
     * @return The ID of the patch baseline.
     */

    public String getBaselineId() {
        return this.baselineId;
    }

    /**
     * <p>
     * The ID of the patch baseline.
     * </p>
     * 
     * @param baselineId
     *        The ID of the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchBaselineIdentity withBaselineId(String baselineId) {
        setBaselineId(baselineId);
        return this;
    }

    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     * 
     * @param baselineName
     *        The name of the patch baseline.
     */

    public void setBaselineName(String baselineName) {
        this.baselineName = baselineName;
    }

    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     * 
     * @return The name of the patch baseline.
     */

    public String getBaselineName() {
        return this.baselineName;
    }

    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     * 
     * @param baselineName
     *        The name of the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchBaselineIdentity withBaselineName(String baselineName) {
        setBaselineName(baselineName);
        return this;
    }

    /**
     * <p>
     * The description of the patch baseline.
     * </p>
     * 
     * @param baselineDescription
     *        The description of the patch baseline.
     */

    public void setBaselineDescription(String baselineDescription) {
        this.baselineDescription = baselineDescription;
    }

    /**
     * <p>
     * The description of the patch baseline.
     * </p>
     * 
     * @return The description of the patch baseline.
     */

    public String getBaselineDescription() {
        return this.baselineDescription;
    }

    /**
     * <p>
     * The description of the patch baseline.
     * </p>
     * 
     * @param baselineDescription
     *        The description of the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchBaselineIdentity withBaselineDescription(String baselineDescription) {
        setBaselineDescription(baselineDescription);
        return this;
    }

    /**
     * <p>
     * Whether this is the default baseline.
     * </p>
     * 
     * @param defaultBaseline
     *        Whether this is the default baseline.
     */

    public void setDefaultBaseline(Boolean defaultBaseline) {
        this.defaultBaseline = defaultBaseline;
    }

    /**
     * <p>
     * Whether this is the default baseline.
     * </p>
     * 
     * @return Whether this is the default baseline.
     */

    public Boolean getDefaultBaseline() {
        return this.defaultBaseline;
    }

    /**
     * <p>
     * Whether this is the default baseline.
     * </p>
     * 
     * @param defaultBaseline
     *        Whether this is the default baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchBaselineIdentity withDefaultBaseline(Boolean defaultBaseline) {
        setDefaultBaseline(defaultBaseline);
        return this;
    }

    /**
     * <p>
     * Whether this is the default baseline.
     * </p>
     * 
     * @return Whether this is the default baseline.
     */

    public Boolean isDefaultBaseline() {
        return this.defaultBaseline;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBaselineId() != null)
            sb.append("BaselineId: ").append(getBaselineId()).append(",");
        if (getBaselineName() != null)
            sb.append("BaselineName: ").append(getBaselineName()).append(",");
        if (getBaselineDescription() != null)
            sb.append("BaselineDescription: ").append(getBaselineDescription()).append(",");
        if (getDefaultBaseline() != null)
            sb.append("DefaultBaseline: ").append(getDefaultBaseline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatchBaselineIdentity == false)
            return false;
        PatchBaselineIdentity other = (PatchBaselineIdentity) obj;
        if (other.getBaselineId() == null ^ this.getBaselineId() == null)
            return false;
        if (other.getBaselineId() != null && other.getBaselineId().equals(this.getBaselineId()) == false)
            return false;
        if (other.getBaselineName() == null ^ this.getBaselineName() == null)
            return false;
        if (other.getBaselineName() != null && other.getBaselineName().equals(this.getBaselineName()) == false)
            return false;
        if (other.getBaselineDescription() == null ^ this.getBaselineDescription() == null)
            return false;
        if (other.getBaselineDescription() != null && other.getBaselineDescription().equals(this.getBaselineDescription()) == false)
            return false;
        if (other.getDefaultBaseline() == null ^ this.getDefaultBaseline() == null)
            return false;
        if (other.getDefaultBaseline() != null && other.getDefaultBaseline().equals(this.getDefaultBaseline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineId() == null) ? 0 : getBaselineId().hashCode());
        hashCode = prime * hashCode + ((getBaselineName() == null) ? 0 : getBaselineName().hashCode());
        hashCode = prime * hashCode + ((getBaselineDescription() == null) ? 0 : getBaselineDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultBaseline() == null) ? 0 : getDefaultBaseline().hashCode());
        return hashCode;
    }

    @Override
    public PatchBaselineIdentity clone() {
        try {
            return (PatchBaselineIdentity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.PatchBaselineIdentityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
