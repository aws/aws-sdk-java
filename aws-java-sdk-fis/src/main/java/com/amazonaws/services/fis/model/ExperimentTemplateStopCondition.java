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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a stop condition for an experiment template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ExperimentTemplateStopCondition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperimentTemplateStopCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source for the stop condition.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch alarm, if applicable.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The source for the stop condition.
     * </p>
     * 
     * @param source
     *        The source for the stop condition.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source for the stop condition.
     * </p>
     * 
     * @return The source for the stop condition.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source for the stop condition.
     * </p>
     * 
     * @param source
     *        The source for the stop condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplateStopCondition withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch alarm, if applicable.
     * </p>
     * 
     * @param value
     *        The Amazon Resource Name (ARN) of the CloudWatch alarm, if applicable.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch alarm, if applicable.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the CloudWatch alarm, if applicable.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch alarm, if applicable.
     * </p>
     * 
     * @param value
     *        The Amazon Resource Name (ARN) of the CloudWatch alarm, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplateStopCondition withValue(String value) {
        setValue(value);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExperimentTemplateStopCondition == false)
            return false;
        ExperimentTemplateStopCondition other = (ExperimentTemplateStopCondition) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ExperimentTemplateStopCondition clone() {
        try {
            return (ExperimentTemplateStopCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.ExperimentTemplateStopConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
