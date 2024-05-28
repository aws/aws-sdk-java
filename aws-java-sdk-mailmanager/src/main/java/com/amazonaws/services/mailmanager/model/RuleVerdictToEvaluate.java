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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The verdict to evaluate in a verdict condition expression.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/RuleVerdictToEvaluate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleVerdictToEvaluate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Add On ARN and its returned value to evaluate in a verdict condition expression.
     * </p>
     */
    private Analysis analysis;
    /**
     * <p>
     * The email verdict attribute to evaluate in a string verdict expression.
     * </p>
     */
    private String attribute;

    /**
     * <p>
     * The Add On ARN and its returned value to evaluate in a verdict condition expression.
     * </p>
     * 
     * @param analysis
     *        The Add On ARN and its returned value to evaluate in a verdict condition expression.
     */

    public void setAnalysis(Analysis analysis) {
        this.analysis = analysis;
    }

    /**
     * <p>
     * The Add On ARN and its returned value to evaluate in a verdict condition expression.
     * </p>
     * 
     * @return The Add On ARN and its returned value to evaluate in a verdict condition expression.
     */

    public Analysis getAnalysis() {
        return this.analysis;
    }

    /**
     * <p>
     * The Add On ARN and its returned value to evaluate in a verdict condition expression.
     * </p>
     * 
     * @param analysis
     *        The Add On ARN and its returned value to evaluate in a verdict condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleVerdictToEvaluate withAnalysis(Analysis analysis) {
        setAnalysis(analysis);
        return this;
    }

    /**
     * <p>
     * The email verdict attribute to evaluate in a string verdict expression.
     * </p>
     * 
     * @param attribute
     *        The email verdict attribute to evaluate in a string verdict expression.
     * @see RuleVerdictAttribute
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The email verdict attribute to evaluate in a string verdict expression.
     * </p>
     * 
     * @return The email verdict attribute to evaluate in a string verdict expression.
     * @see RuleVerdictAttribute
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The email verdict attribute to evaluate in a string verdict expression.
     * </p>
     * 
     * @param attribute
     *        The email verdict attribute to evaluate in a string verdict expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleVerdictAttribute
     */

    public RuleVerdictToEvaluate withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The email verdict attribute to evaluate in a string verdict expression.
     * </p>
     * 
     * @param attribute
     *        The email verdict attribute to evaluate in a string verdict expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleVerdictAttribute
     */

    public RuleVerdictToEvaluate withAttribute(RuleVerdictAttribute attribute) {
        this.attribute = attribute.toString();
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
        if (getAnalysis() != null)
            sb.append("Analysis: ").append(getAnalysis()).append(",");
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleVerdictToEvaluate == false)
            return false;
        RuleVerdictToEvaluate other = (RuleVerdictToEvaluate) obj;
        if (other.getAnalysis() == null ^ this.getAnalysis() == null)
            return false;
        if (other.getAnalysis() != null && other.getAnalysis().equals(this.getAnalysis()) == false)
            return false;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalysis() == null) ? 0 : getAnalysis().hashCode());
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        return hashCode;
    }

    @Override
    public RuleVerdictToEvaluate clone() {
        try {
            return (RuleVerdictToEvaluate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.RuleVerdictToEvaluateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
