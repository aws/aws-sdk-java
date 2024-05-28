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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * In a model evaluation job that uses human workers you must define the name of the metric, and how you want that
 * metric rated <code>ratingMethod</code>, and an optional description of the metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/HumanEvaluationCustomMetric"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HumanEvaluationCustomMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the metric. Your human evaluators will see this name in the evaluation UI.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional description of the metric. Use this parameter to provide more details about the metric.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Choose how you want your human workers to evaluation your model. Valid values for rating methods are
     * <code>ThumbsUpDown</code>, <code>IndividualLikertScale</code>,<code>ComparisonLikertScale</code>,
     * <code>ComparisonChoice</code>, and <code>ComparisonRank</code>
     * </p>
     */
    private String ratingMethod;

    /**
     * <p>
     * The name of the metric. Your human evaluators will see this name in the evaluation UI.
     * </p>
     * 
     * @param name
     *        The name of the metric. Your human evaluators will see this name in the evaluation UI.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the metric. Your human evaluators will see this name in the evaluation UI.
     * </p>
     * 
     * @return The name of the metric. Your human evaluators will see this name in the evaluation UI.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the metric. Your human evaluators will see this name in the evaluation UI.
     * </p>
     * 
     * @param name
     *        The name of the metric. Your human evaluators will see this name in the evaluation UI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanEvaluationCustomMetric withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional description of the metric. Use this parameter to provide more details about the metric.
     * </p>
     * 
     * @param description
     *        An optional description of the metric. Use this parameter to provide more details about the metric.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of the metric. Use this parameter to provide more details about the metric.
     * </p>
     * 
     * @return An optional description of the metric. Use this parameter to provide more details about the metric.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description of the metric. Use this parameter to provide more details about the metric.
     * </p>
     * 
     * @param description
     *        An optional description of the metric. Use this parameter to provide more details about the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanEvaluationCustomMetric withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Choose how you want your human workers to evaluation your model. Valid values for rating methods are
     * <code>ThumbsUpDown</code>, <code>IndividualLikertScale</code>,<code>ComparisonLikertScale</code>,
     * <code>ComparisonChoice</code>, and <code>ComparisonRank</code>
     * </p>
     * 
     * @param ratingMethod
     *        Choose how you want your human workers to evaluation your model. Valid values for rating methods are
     *        <code>ThumbsUpDown</code>, <code>IndividualLikertScale</code>,<code>ComparisonLikertScale</code>,
     *        <code>ComparisonChoice</code>, and <code>ComparisonRank</code>
     */

    public void setRatingMethod(String ratingMethod) {
        this.ratingMethod = ratingMethod;
    }

    /**
     * <p>
     * Choose how you want your human workers to evaluation your model. Valid values for rating methods are
     * <code>ThumbsUpDown</code>, <code>IndividualLikertScale</code>,<code>ComparisonLikertScale</code>,
     * <code>ComparisonChoice</code>, and <code>ComparisonRank</code>
     * </p>
     * 
     * @return Choose how you want your human workers to evaluation your model. Valid values for rating methods are
     *         <code>ThumbsUpDown</code>, <code>IndividualLikertScale</code>,<code>ComparisonLikertScale</code>,
     *         <code>ComparisonChoice</code>, and <code>ComparisonRank</code>
     */

    public String getRatingMethod() {
        return this.ratingMethod;
    }

    /**
     * <p>
     * Choose how you want your human workers to evaluation your model. Valid values for rating methods are
     * <code>ThumbsUpDown</code>, <code>IndividualLikertScale</code>,<code>ComparisonLikertScale</code>,
     * <code>ComparisonChoice</code>, and <code>ComparisonRank</code>
     * </p>
     * 
     * @param ratingMethod
     *        Choose how you want your human workers to evaluation your model. Valid values for rating methods are
     *        <code>ThumbsUpDown</code>, <code>IndividualLikertScale</code>,<code>ComparisonLikertScale</code>,
     *        <code>ComparisonChoice</code>, and <code>ComparisonRank</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanEvaluationCustomMetric withRatingMethod(String ratingMethod) {
        setRatingMethod(ratingMethod);
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
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getRatingMethod() != null)
            sb.append("RatingMethod: ").append(getRatingMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanEvaluationCustomMetric == false)
            return false;
        HumanEvaluationCustomMetric other = (HumanEvaluationCustomMetric) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRatingMethod() == null ^ this.getRatingMethod() == null)
            return false;
        if (other.getRatingMethod() != null && other.getRatingMethod().equals(this.getRatingMethod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRatingMethod() == null) ? 0 : getRatingMethod().hashCode());
        return hashCode;
    }

    @Override
    public HumanEvaluationCustomMetric clone() {
        try {
            return (HumanEvaluationCustomMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.HumanEvaluationCustomMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
