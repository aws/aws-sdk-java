/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about targets that resolved during the Automation execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ResolvedTargets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolvedTargets implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of parameter values sent to targets that resolved during the Automation execution.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> parameterValues;
    /**
     * <p>
     * A boolean value indicating whether the resolved target list is truncated.
     * </p>
     */
    private Boolean truncated;

    /**
     * <p>
     * A list of parameter values sent to targets that resolved during the Automation execution.
     * </p>
     * 
     * @return A list of parameter values sent to targets that resolved during the Automation execution.
     */

    public java.util.List<String> getParameterValues() {
        if (parameterValues == null) {
            parameterValues = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return parameterValues;
    }

    /**
     * <p>
     * A list of parameter values sent to targets that resolved during the Automation execution.
     * </p>
     * 
     * @param parameterValues
     *        A list of parameter values sent to targets that resolved during the Automation execution.
     */

    public void setParameterValues(java.util.Collection<String> parameterValues) {
        if (parameterValues == null) {
            this.parameterValues = null;
            return;
        }

        this.parameterValues = new com.amazonaws.internal.SdkInternalList<String>(parameterValues);
    }

    /**
     * <p>
     * A list of parameter values sent to targets that resolved during the Automation execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterValues(java.util.Collection)} or {@link #withParameterValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param parameterValues
     *        A list of parameter values sent to targets that resolved during the Automation execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolvedTargets withParameterValues(String... parameterValues) {
        if (this.parameterValues == null) {
            setParameterValues(new com.amazonaws.internal.SdkInternalList<String>(parameterValues.length));
        }
        for (String ele : parameterValues) {
            this.parameterValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of parameter values sent to targets that resolved during the Automation execution.
     * </p>
     * 
     * @param parameterValues
     *        A list of parameter values sent to targets that resolved during the Automation execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolvedTargets withParameterValues(java.util.Collection<String> parameterValues) {
        setParameterValues(parameterValues);
        return this;
    }

    /**
     * <p>
     * A boolean value indicating whether the resolved target list is truncated.
     * </p>
     * 
     * @param truncated
     *        A boolean value indicating whether the resolved target list is truncated.
     */

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * <p>
     * A boolean value indicating whether the resolved target list is truncated.
     * </p>
     * 
     * @return A boolean value indicating whether the resolved target list is truncated.
     */

    public Boolean getTruncated() {
        return this.truncated;
    }

    /**
     * <p>
     * A boolean value indicating whether the resolved target list is truncated.
     * </p>
     * 
     * @param truncated
     *        A boolean value indicating whether the resolved target list is truncated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolvedTargets withTruncated(Boolean truncated) {
        setTruncated(truncated);
        return this;
    }

    /**
     * <p>
     * A boolean value indicating whether the resolved target list is truncated.
     * </p>
     * 
     * @return A boolean value indicating whether the resolved target list is truncated.
     */

    public Boolean isTruncated() {
        return this.truncated;
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
        if (getParameterValues() != null)
            sb.append("ParameterValues: ").append(getParameterValues()).append(",");
        if (getTruncated() != null)
            sb.append("Truncated: ").append(getTruncated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolvedTargets == false)
            return false;
        ResolvedTargets other = (ResolvedTargets) obj;
        if (other.getParameterValues() == null ^ this.getParameterValues() == null)
            return false;
        if (other.getParameterValues() != null && other.getParameterValues().equals(this.getParameterValues()) == false)
            return false;
        if (other.getTruncated() == null ^ this.getTruncated() == null)
            return false;
        if (other.getTruncated() != null && other.getTruncated().equals(this.getTruncated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterValues() == null) ? 0 : getParameterValues().hashCode());
        hashCode = prime * hashCode + ((getTruncated() == null) ? 0 : getTruncated().hashCode());
        return hashCode;
    }

    @Override
    public ResolvedTargets clone() {
        try {
            return (ResolvedTargets) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ResolvedTargetsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
