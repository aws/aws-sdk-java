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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/LabelParameterVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelParameterVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The label does not meet the requirements. For information about parameter label requirements, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling
     * Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> invalidLabels;

    /**
     * <p>
     * The label does not meet the requirements. For information about parameter label requirements, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling
     * Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return The label does not meet the requirements. For information about parameter label requirements, see <a
     *         href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling
     *         Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public java.util.List<String> getInvalidLabels() {
        if (invalidLabels == null) {
            invalidLabels = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return invalidLabels;
    }

    /**
     * <p>
     * The label does not meet the requirements. For information about parameter label requirements, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling
     * Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param invalidLabels
     *        The label does not meet the requirements. For information about parameter label requirements, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling
     *        Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     */

    public void setInvalidLabels(java.util.Collection<String> invalidLabels) {
        if (invalidLabels == null) {
            this.invalidLabels = null;
            return;
        }

        this.invalidLabels = new com.amazonaws.internal.SdkInternalList<String>(invalidLabels);
    }

    /**
     * <p>
     * The label does not meet the requirements. For information about parameter label requirements, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling
     * Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvalidLabels(java.util.Collection)} or {@link #withInvalidLabels(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param invalidLabels
     *        The label does not meet the requirements. For information about parameter label requirements, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling
     *        Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelParameterVersionResult withInvalidLabels(String... invalidLabels) {
        if (this.invalidLabels == null) {
            setInvalidLabels(new com.amazonaws.internal.SdkInternalList<String>(invalidLabels.length));
        }
        for (String ele : invalidLabels) {
            this.invalidLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The label does not meet the requirements. For information about parameter label requirements, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling
     * Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param invalidLabels
     *        The label does not meet the requirements. For information about parameter label requirements, see <a
     *        href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html">Labeling
     *        Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelParameterVersionResult withInvalidLabels(java.util.Collection<String> invalidLabels) {
        setInvalidLabels(invalidLabels);
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
        if (getInvalidLabels() != null)
            sb.append("InvalidLabels: ").append(getInvalidLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelParameterVersionResult == false)
            return false;
        LabelParameterVersionResult other = (LabelParameterVersionResult) obj;
        if (other.getInvalidLabels() == null ^ this.getInvalidLabels() == null)
            return false;
        if (other.getInvalidLabels() != null && other.getInvalidLabels().equals(this.getInvalidLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvalidLabels() == null) ? 0 : getInvalidLabels().hashCode());
        return hashCode;
    }

    @Override
    public LabelParameterVersionResult clone() {
        try {
            return (LabelParameterVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
