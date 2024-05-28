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
 * Used to specify the name of a built-in prompt dataset and optionally, the Amazon S3 bucket where a custom prompt
 * dataset is saved.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/EvaluationDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationDataset implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Used to specify supported built-in prompt datasets. Valid values are <code>Builtin.Bold</code>,
     * <code>Builtin.BoolQ</code>, <code>Builtin.NaturalQuestions</code>, <code>Builtin.Gigaword</code>,
     * <code>Builtin.RealToxicityPrompts</code>, <code>Builtin.TriviaQa</code>, <code>Builtin.T-Rex</code>,
     * <code>Builtin.WomensEcommerceClothingReviews</code> and <code>Builtin.Wikitext2</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * For custom prompt datasets, you must specify the location in Amazon S3 where the prompt dataset is saved.
     * </p>
     */
    private EvaluationDatasetLocation datasetLocation;

    /**
     * <p>
     * Used to specify supported built-in prompt datasets. Valid values are <code>Builtin.Bold</code>,
     * <code>Builtin.BoolQ</code>, <code>Builtin.NaturalQuestions</code>, <code>Builtin.Gigaword</code>,
     * <code>Builtin.RealToxicityPrompts</code>, <code>Builtin.TriviaQa</code>, <code>Builtin.T-Rex</code>,
     * <code>Builtin.WomensEcommerceClothingReviews</code> and <code>Builtin.Wikitext2</code>.
     * </p>
     * 
     * @param name
     *        Used to specify supported built-in prompt datasets. Valid values are <code>Builtin.Bold</code>,
     *        <code>Builtin.BoolQ</code>, <code>Builtin.NaturalQuestions</code>, <code>Builtin.Gigaword</code>,
     *        <code>Builtin.RealToxicityPrompts</code>, <code>Builtin.TriviaQa</code>, <code>Builtin.T-Rex</code>,
     *        <code>Builtin.WomensEcommerceClothingReviews</code> and <code>Builtin.Wikitext2</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Used to specify supported built-in prompt datasets. Valid values are <code>Builtin.Bold</code>,
     * <code>Builtin.BoolQ</code>, <code>Builtin.NaturalQuestions</code>, <code>Builtin.Gigaword</code>,
     * <code>Builtin.RealToxicityPrompts</code>, <code>Builtin.TriviaQa</code>, <code>Builtin.T-Rex</code>,
     * <code>Builtin.WomensEcommerceClothingReviews</code> and <code>Builtin.Wikitext2</code>.
     * </p>
     * 
     * @return Used to specify supported built-in prompt datasets. Valid values are <code>Builtin.Bold</code>,
     *         <code>Builtin.BoolQ</code>, <code>Builtin.NaturalQuestions</code>, <code>Builtin.Gigaword</code>,
     *         <code>Builtin.RealToxicityPrompts</code>, <code>Builtin.TriviaQa</code>, <code>Builtin.T-Rex</code>,
     *         <code>Builtin.WomensEcommerceClothingReviews</code> and <code>Builtin.Wikitext2</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Used to specify supported built-in prompt datasets. Valid values are <code>Builtin.Bold</code>,
     * <code>Builtin.BoolQ</code>, <code>Builtin.NaturalQuestions</code>, <code>Builtin.Gigaword</code>,
     * <code>Builtin.RealToxicityPrompts</code>, <code>Builtin.TriviaQa</code>, <code>Builtin.T-Rex</code>,
     * <code>Builtin.WomensEcommerceClothingReviews</code> and <code>Builtin.Wikitext2</code>.
     * </p>
     * 
     * @param name
     *        Used to specify supported built-in prompt datasets. Valid values are <code>Builtin.Bold</code>,
     *        <code>Builtin.BoolQ</code>, <code>Builtin.NaturalQuestions</code>, <code>Builtin.Gigaword</code>,
     *        <code>Builtin.RealToxicityPrompts</code>, <code>Builtin.TriviaQa</code>, <code>Builtin.T-Rex</code>,
     *        <code>Builtin.WomensEcommerceClothingReviews</code> and <code>Builtin.Wikitext2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationDataset withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * For custom prompt datasets, you must specify the location in Amazon S3 where the prompt dataset is saved.
     * </p>
     * 
     * @param datasetLocation
     *        For custom prompt datasets, you must specify the location in Amazon S3 where the prompt dataset is saved.
     */

    public void setDatasetLocation(EvaluationDatasetLocation datasetLocation) {
        this.datasetLocation = datasetLocation;
    }

    /**
     * <p>
     * For custom prompt datasets, you must specify the location in Amazon S3 where the prompt dataset is saved.
     * </p>
     * 
     * @return For custom prompt datasets, you must specify the location in Amazon S3 where the prompt dataset is saved.
     */

    public EvaluationDatasetLocation getDatasetLocation() {
        return this.datasetLocation;
    }

    /**
     * <p>
     * For custom prompt datasets, you must specify the location in Amazon S3 where the prompt dataset is saved.
     * </p>
     * 
     * @param datasetLocation
     *        For custom prompt datasets, you must specify the location in Amazon S3 where the prompt dataset is saved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationDataset withDatasetLocation(EvaluationDatasetLocation datasetLocation) {
        setDatasetLocation(datasetLocation);
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
        if (getDatasetLocation() != null)
            sb.append("DatasetLocation: ").append(getDatasetLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationDataset == false)
            return false;
        EvaluationDataset other = (EvaluationDataset) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDatasetLocation() == null ^ this.getDatasetLocation() == null)
            return false;
        if (other.getDatasetLocation() != null && other.getDatasetLocation().equals(this.getDatasetLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDatasetLocation() == null) ? 0 : getDatasetLocation().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationDataset clone() {
        try {
            return (EvaluationDataset) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.EvaluationDatasetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
