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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns a filtered list of Detective or Proactive Config rules. By default, if the filter is not defined, this API
 * returns an unfiltered list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigRulesFilters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigRulesFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The mode of an evaluation. The valid values are Detective or Proactive.
     * </p>
     */
    private String evaluationMode;

    /**
     * <p>
     * The mode of an evaluation. The valid values are Detective or Proactive.
     * </p>
     * 
     * @param evaluationMode
     *        The mode of an evaluation. The valid values are Detective or Proactive.
     * @see EvaluationMode
     */

    public void setEvaluationMode(String evaluationMode) {
        this.evaluationMode = evaluationMode;
    }

    /**
     * <p>
     * The mode of an evaluation. The valid values are Detective or Proactive.
     * </p>
     * 
     * @return The mode of an evaluation. The valid values are Detective or Proactive.
     * @see EvaluationMode
     */

    public String getEvaluationMode() {
        return this.evaluationMode;
    }

    /**
     * <p>
     * The mode of an evaluation. The valid values are Detective or Proactive.
     * </p>
     * 
     * @param evaluationMode
     *        The mode of an evaluation. The valid values are Detective or Proactive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationMode
     */

    public DescribeConfigRulesFilters withEvaluationMode(String evaluationMode) {
        setEvaluationMode(evaluationMode);
        return this;
    }

    /**
     * <p>
     * The mode of an evaluation. The valid values are Detective or Proactive.
     * </p>
     * 
     * @param evaluationMode
     *        The mode of an evaluation. The valid values are Detective or Proactive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationMode
     */

    public DescribeConfigRulesFilters withEvaluationMode(EvaluationMode evaluationMode) {
        this.evaluationMode = evaluationMode.toString();
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
        if (getEvaluationMode() != null)
            sb.append("EvaluationMode: ").append(getEvaluationMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigRulesFilters == false)
            return false;
        DescribeConfigRulesFilters other = (DescribeConfigRulesFilters) obj;
        if (other.getEvaluationMode() == null ^ this.getEvaluationMode() == null)
            return false;
        if (other.getEvaluationMode() != null && other.getEvaluationMode().equals(this.getEvaluationMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluationMode() == null) ? 0 : getEvaluationMode().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigRulesFilters clone() {
        try {
            return (DescribeConfigRulesFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.DescribeConfigRulesFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
