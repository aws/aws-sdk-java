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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the information about an evaluation rule for this feature, if it is used in a launch or
 * experiment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/EvaluationRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the experiment or launch.
     * </p>
     */
    private String name;
    /**
     * <p>
     * This value is <code>aws.evidently.splits</code> if this is an evaluation rule for a launch, and it is
     * <code>aws.evidently.onlineab</code> if this is an evaluation rule for an experiment.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of the experiment or launch.
     * </p>
     * 
     * @param name
     *        The name of the experiment or launch.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the experiment or launch.
     * </p>
     * 
     * @return The name of the experiment or launch.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the experiment or launch.
     * </p>
     * 
     * @param name
     *        The name of the experiment or launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * This value is <code>aws.evidently.splits</code> if this is an evaluation rule for a launch, and it is
     * <code>aws.evidently.onlineab</code> if this is an evaluation rule for an experiment.
     * </p>
     * 
     * @param type
     *        This value is <code>aws.evidently.splits</code> if this is an evaluation rule for a launch, and it is
     *        <code>aws.evidently.onlineab</code> if this is an evaluation rule for an experiment.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * This value is <code>aws.evidently.splits</code> if this is an evaluation rule for a launch, and it is
     * <code>aws.evidently.onlineab</code> if this is an evaluation rule for an experiment.
     * </p>
     * 
     * @return This value is <code>aws.evidently.splits</code> if this is an evaluation rule for a launch, and it is
     *         <code>aws.evidently.onlineab</code> if this is an evaluation rule for an experiment.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * This value is <code>aws.evidently.splits</code> if this is an evaluation rule for a launch, and it is
     * <code>aws.evidently.onlineab</code> if this is an evaluation rule for an experiment.
     * </p>
     * 
     * @param type
     *        This value is <code>aws.evidently.splits</code> if this is an evaluation rule for a launch, and it is
     *        <code>aws.evidently.onlineab</code> if this is an evaluation rule for an experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationRule withType(String type) {
        setType(type);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationRule == false)
            return false;
        EvaluationRule other = (EvaluationRule) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationRule clone() {
        try {
            return (EvaluationRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.EvaluationRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
