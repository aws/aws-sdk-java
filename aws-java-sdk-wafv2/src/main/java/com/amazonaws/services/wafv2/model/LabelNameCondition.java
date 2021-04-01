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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single label name condition for a <a>Condition</a> in a logging filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/LabelNameCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelNameCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The label name that a log record must contain in order to meet the condition. This must be a fully qualified
     * label name. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the
     * rule group or web ACL context of the rule that added the label.
     * </p>
     */
    private String labelName;

    /**
     * <p>
     * The label name that a log record must contain in order to meet the condition. This must be a fully qualified
     * label name. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the
     * rule group or web ACL context of the rule that added the label.
     * </p>
     * 
     * @param labelName
     *        The label name that a log record must contain in order to meet the condition. This must be a fully
     *        qualified label name. Fully qualified labels have a prefix, optional namespaces, and label name. The
     *        prefix identifies the rule group or web ACL context of the rule that added the label.
     */

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    /**
     * <p>
     * The label name that a log record must contain in order to meet the condition. This must be a fully qualified
     * label name. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the
     * rule group or web ACL context of the rule that added the label.
     * </p>
     * 
     * @return The label name that a log record must contain in order to meet the condition. This must be a fully
     *         qualified label name. Fully qualified labels have a prefix, optional namespaces, and label name. The
     *         prefix identifies the rule group or web ACL context of the rule that added the label.
     */

    public String getLabelName() {
        return this.labelName;
    }

    /**
     * <p>
     * The label name that a log record must contain in order to meet the condition. This must be a fully qualified
     * label name. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the
     * rule group or web ACL context of the rule that added the label.
     * </p>
     * 
     * @param labelName
     *        The label name that a log record must contain in order to meet the condition. This must be a fully
     *        qualified label name. Fully qualified labels have a prefix, optional namespaces, and label name. The
     *        prefix identifies the rule group or web ACL context of the rule that added the label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelNameCondition withLabelName(String labelName) {
        setLabelName(labelName);
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
        if (getLabelName() != null)
            sb.append("LabelName: ").append(getLabelName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelNameCondition == false)
            return false;
        LabelNameCondition other = (LabelNameCondition) obj;
        if (other.getLabelName() == null ^ this.getLabelName() == null)
            return false;
        if (other.getLabelName() != null && other.getLabelName().equals(this.getLabelName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabelName() == null) ? 0 : getLabelName().hashCode());
        return hashCode;
    }

    @Override
    public LabelNameCondition clone() {
        try {
            return (LabelNameCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.LabelNameConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
