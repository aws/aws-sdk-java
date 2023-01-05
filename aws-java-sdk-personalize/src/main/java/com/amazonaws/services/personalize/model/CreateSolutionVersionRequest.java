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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateSolutionVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSolutionVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the solution version.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution containing the training configuration information.
     * </p>
     */
    private String solutionArn;
    /**
     * <p>
     * The scope of training to be performed when creating the solution version. The <code>FULL</code> option trains the
     * solution version based on the entirety of the input solution's training data, while the <code>UPDATE</code>
     * option processes only the data that has changed in comparison to the input solution. Choose <code>UPDATE</code>
     * when you want to incrementally update your solution version instead of creating an entirely new one.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used when you already have an active solution version created from the
     * input solution using the <code>FULL</code> option and the input solution was trained with the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     * >User-Personalization</a> recipe or the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-hrnn-coldstart.html">HRNN-Coldstart</a>
     * recipe.
     * </p>
     * </important>
     */
    private String trainingMode;
    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the solution version.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the solution version.
     * </p>
     * 
     * @param name
     *        The name of the solution version.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the solution version.
     * </p>
     * 
     * @return The name of the solution version.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the solution version.
     * </p>
     * 
     * @param name
     *        The name of the solution version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolutionVersionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution containing the training configuration information.
     * </p>
     * 
     * @param solutionArn
     *        The Amazon Resource Name (ARN) of the solution containing the training configuration information.
     */

    public void setSolutionArn(String solutionArn) {
        this.solutionArn = solutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution containing the training configuration information.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the solution containing the training configuration information.
     */

    public String getSolutionArn() {
        return this.solutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution containing the training configuration information.
     * </p>
     * 
     * @param solutionArn
     *        The Amazon Resource Name (ARN) of the solution containing the training configuration information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolutionVersionRequest withSolutionArn(String solutionArn) {
        setSolutionArn(solutionArn);
        return this;
    }

    /**
     * <p>
     * The scope of training to be performed when creating the solution version. The <code>FULL</code> option trains the
     * solution version based on the entirety of the input solution's training data, while the <code>UPDATE</code>
     * option processes only the data that has changed in comparison to the input solution. Choose <code>UPDATE</code>
     * when you want to incrementally update your solution version instead of creating an entirely new one.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used when you already have an active solution version created from the
     * input solution using the <code>FULL</code> option and the input solution was trained with the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     * >User-Personalization</a> recipe or the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-hrnn-coldstart.html">HRNN-Coldstart</a>
     * recipe.
     * </p>
     * </important>
     * 
     * @param trainingMode
     *        The scope of training to be performed when creating the solution version. The <code>FULL</code> option
     *        trains the solution version based on the entirety of the input solution's training data, while the
     *        <code>UPDATE</code> option processes only the data that has changed in comparison to the input solution.
     *        Choose <code>UPDATE</code> when you want to incrementally update your solution version instead of creating
     *        an entirely new one.</p> <important>
     *        <p>
     *        The <code>UPDATE</code> option can only be used when you already have an active solution version created
     *        from the input solution using the <code>FULL</code> option and the input solution was trained with the <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html">
     *        User-Personalization</a> recipe or the <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-hrnn-coldstart.html"
     *        >HRNN-Coldstart</a> recipe.
     *        </p>
     * @see TrainingMode
     */

    public void setTrainingMode(String trainingMode) {
        this.trainingMode = trainingMode;
    }

    /**
     * <p>
     * The scope of training to be performed when creating the solution version. The <code>FULL</code> option trains the
     * solution version based on the entirety of the input solution's training data, while the <code>UPDATE</code>
     * option processes only the data that has changed in comparison to the input solution. Choose <code>UPDATE</code>
     * when you want to incrementally update your solution version instead of creating an entirely new one.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used when you already have an active solution version created from the
     * input solution using the <code>FULL</code> option and the input solution was trained with the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     * >User-Personalization</a> recipe or the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-hrnn-coldstart.html">HRNN-Coldstart</a>
     * recipe.
     * </p>
     * </important>
     * 
     * @return The scope of training to be performed when creating the solution version. The <code>FULL</code> option
     *         trains the solution version based on the entirety of the input solution's training data, while the
     *         <code>UPDATE</code> option processes only the data that has changed in comparison to the input solution.
     *         Choose <code>UPDATE</code> when you want to incrementally update your solution version instead of
     *         creating an entirely new one.</p> <important>
     *         <p>
     *         The <code>UPDATE</code> option can only be used when you already have an active solution version created
     *         from the input solution using the <code>FULL</code> option and the input solution was trained with the <a
     *         href
     *         ="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html">
     *         User-Personalization</a> recipe or the <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-hrnn-coldstart.html"
     *         >HRNN-Coldstart</a> recipe.
     *         </p>
     * @see TrainingMode
     */

    public String getTrainingMode() {
        return this.trainingMode;
    }

    /**
     * <p>
     * The scope of training to be performed when creating the solution version. The <code>FULL</code> option trains the
     * solution version based on the entirety of the input solution's training data, while the <code>UPDATE</code>
     * option processes only the data that has changed in comparison to the input solution. Choose <code>UPDATE</code>
     * when you want to incrementally update your solution version instead of creating an entirely new one.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used when you already have an active solution version created from the
     * input solution using the <code>FULL</code> option and the input solution was trained with the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     * >User-Personalization</a> recipe or the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-hrnn-coldstart.html">HRNN-Coldstart</a>
     * recipe.
     * </p>
     * </important>
     * 
     * @param trainingMode
     *        The scope of training to be performed when creating the solution version. The <code>FULL</code> option
     *        trains the solution version based on the entirety of the input solution's training data, while the
     *        <code>UPDATE</code> option processes only the data that has changed in comparison to the input solution.
     *        Choose <code>UPDATE</code> when you want to incrementally update your solution version instead of creating
     *        an entirely new one.</p> <important>
     *        <p>
     *        The <code>UPDATE</code> option can only be used when you already have an active solution version created
     *        from the input solution using the <code>FULL</code> option and the input solution was trained with the <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html">
     *        User-Personalization</a> recipe or the <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-hrnn-coldstart.html"
     *        >HRNN-Coldstart</a> recipe.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingMode
     */

    public CreateSolutionVersionRequest withTrainingMode(String trainingMode) {
        setTrainingMode(trainingMode);
        return this;
    }

    /**
     * <p>
     * The scope of training to be performed when creating the solution version. The <code>FULL</code> option trains the
     * solution version based on the entirety of the input solution's training data, while the <code>UPDATE</code>
     * option processes only the data that has changed in comparison to the input solution. Choose <code>UPDATE</code>
     * when you want to incrementally update your solution version instead of creating an entirely new one.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used when you already have an active solution version created from the
     * input solution using the <code>FULL</code> option and the input solution was trained with the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html"
     * >User-Personalization</a> recipe or the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-hrnn-coldstart.html">HRNN-Coldstart</a>
     * recipe.
     * </p>
     * </important>
     * 
     * @param trainingMode
     *        The scope of training to be performed when creating the solution version. The <code>FULL</code> option
     *        trains the solution version based on the entirety of the input solution's training data, while the
     *        <code>UPDATE</code> option processes only the data that has changed in comparison to the input solution.
     *        Choose <code>UPDATE</code> when you want to incrementally update your solution version instead of creating
     *        an entirely new one.</p> <important>
     *        <p>
     *        The <code>UPDATE</code> option can only be used when you already have an active solution version created
     *        from the input solution using the <code>FULL</code> option and the input solution was trained with the <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-new-item-USER_PERSONALIZATION.html">
     *        User-Personalization</a> recipe or the <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/native-recipe-hrnn-coldstart.html"
     *        >HRNN-Coldstart</a> recipe.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingMode
     */

    public CreateSolutionVersionRequest withTrainingMode(TrainingMode trainingMode) {
        this.trainingMode = trainingMode.toString();
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the solution version.
     * </p>
     * 
     * @return A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *         apply to the solution version.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the solution version.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *        apply to the solution version.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the solution version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *        apply to the solution version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolutionVersionRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the solution version.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *        apply to the solution version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolutionVersionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getSolutionArn() != null)
            sb.append("SolutionArn: ").append(getSolutionArn()).append(",");
        if (getTrainingMode() != null)
            sb.append("TrainingMode: ").append(getTrainingMode()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSolutionVersionRequest == false)
            return false;
        CreateSolutionVersionRequest other = (CreateSolutionVersionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSolutionArn() == null ^ this.getSolutionArn() == null)
            return false;
        if (other.getSolutionArn() != null && other.getSolutionArn().equals(this.getSolutionArn()) == false)
            return false;
        if (other.getTrainingMode() == null ^ this.getTrainingMode() == null)
            return false;
        if (other.getTrainingMode() != null && other.getTrainingMode().equals(this.getTrainingMode()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSolutionArn() == null) ? 0 : getSolutionArn().hashCode());
        hashCode = prime * hashCode + ((getTrainingMode() == null) ? 0 : getTrainingMode().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSolutionVersionRequest clone() {
        return (CreateSolutionVersionRequest) super.clone();
    }

}
