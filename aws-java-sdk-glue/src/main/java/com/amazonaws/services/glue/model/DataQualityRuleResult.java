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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the result of the evaluation of a data quality rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DataQualityRuleResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQualityRuleResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data quality rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the data quality rule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An evaluation message.
     * </p>
     */
    private String evaluationMessage;
    /**
     * <p>
     * A pass or fail status for the rule.
     * </p>
     */
    private String result;

    /**
     * <p>
     * The name of the data quality rule.
     * </p>
     * 
     * @param name
     *        The name of the data quality rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data quality rule.
     * </p>
     * 
     * @return The name of the data quality rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data quality rule.
     * </p>
     * 
     * @param name
     *        The name of the data quality rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRuleResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the data quality rule.
     * </p>
     * 
     * @param description
     *        A description of the data quality rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the data quality rule.
     * </p>
     * 
     * @return A description of the data quality rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the data quality rule.
     * </p>
     * 
     * @param description
     *        A description of the data quality rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRuleResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An evaluation message.
     * </p>
     * 
     * @param evaluationMessage
     *        An evaluation message.
     */

    public void setEvaluationMessage(String evaluationMessage) {
        this.evaluationMessage = evaluationMessage;
    }

    /**
     * <p>
     * An evaluation message.
     * </p>
     * 
     * @return An evaluation message.
     */

    public String getEvaluationMessage() {
        return this.evaluationMessage;
    }

    /**
     * <p>
     * An evaluation message.
     * </p>
     * 
     * @param evaluationMessage
     *        An evaluation message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRuleResult withEvaluationMessage(String evaluationMessage) {
        setEvaluationMessage(evaluationMessage);
        return this;
    }

    /**
     * <p>
     * A pass or fail status for the rule.
     * </p>
     * 
     * @param result
     *        A pass or fail status for the rule.
     * @see DataQualityRuleResultStatus
     */

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * <p>
     * A pass or fail status for the rule.
     * </p>
     * 
     * @return A pass or fail status for the rule.
     * @see DataQualityRuleResultStatus
     */

    public String getResult() {
        return this.result;
    }

    /**
     * <p>
     * A pass or fail status for the rule.
     * </p>
     * 
     * @param result
     *        A pass or fail status for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataQualityRuleResultStatus
     */

    public DataQualityRuleResult withResult(String result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * A pass or fail status for the rule.
     * </p>
     * 
     * @param result
     *        A pass or fail status for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataQualityRuleResultStatus
     */

    public DataQualityRuleResult withResult(DataQualityRuleResultStatus result) {
        this.result = result.toString();
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEvaluationMessage() != null)
            sb.append("EvaluationMessage: ").append(getEvaluationMessage()).append(",");
        if (getResult() != null)
            sb.append("Result: ").append(getResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataQualityRuleResult == false)
            return false;
        DataQualityRuleResult other = (DataQualityRuleResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEvaluationMessage() == null ^ this.getEvaluationMessage() == null)
            return false;
        if (other.getEvaluationMessage() != null && other.getEvaluationMessage().equals(this.getEvaluationMessage()) == false)
            return false;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEvaluationMessage() == null) ? 0 : getEvaluationMessage().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        return hashCode;
    }

    @Override
    public DataQualityRuleResult clone() {
        try {
            return (DataQualityRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DataQualityRuleResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
