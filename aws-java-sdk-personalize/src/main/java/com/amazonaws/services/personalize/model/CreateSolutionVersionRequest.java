/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * input solution using the <code>FULL</code> option and the input solution was trained with the
     * <a>native-recipe-hrnn-coldstart</a> recipe.
     * </p>
     * </important>
     */
    private String trainingMode;

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
     * input solution using the <code>FULL</code> option and the input solution was trained with the
     * <a>native-recipe-hrnn-coldstart</a> recipe.
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
     *        from the input solution using the <code>FULL</code> option and the input solution was trained with the
     *        <a>native-recipe-hrnn-coldstart</a> recipe.
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
     * input solution using the <code>FULL</code> option and the input solution was trained with the
     * <a>native-recipe-hrnn-coldstart</a> recipe.
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
     *         from the input solution using the <code>FULL</code> option and the input solution was trained with the
     *         <a>native-recipe-hrnn-coldstart</a> recipe.
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
     * input solution using the <code>FULL</code> option and the input solution was trained with the
     * <a>native-recipe-hrnn-coldstart</a> recipe.
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
     *        from the input solution using the <code>FULL</code> option and the input solution was trained with the
     *        <a>native-recipe-hrnn-coldstart</a> recipe.
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
     * input solution using the <code>FULL</code> option and the input solution was trained with the
     * <a>native-recipe-hrnn-coldstart</a> recipe.
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
     *        from the input solution using the <code>FULL</code> option and the input solution was trained with the
     *        <a>native-recipe-hrnn-coldstart</a> recipe.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingMode
     */

    public CreateSolutionVersionRequest withTrainingMode(TrainingMode trainingMode) {
        this.trainingMode = trainingMode.toString();
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
        if (getSolutionArn() != null)
            sb.append("SolutionArn: ").append(getSolutionArn()).append(",");
        if (getTrainingMode() != null)
            sb.append("TrainingMode: ").append(getTrainingMode());
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
        if (other.getSolutionArn() == null ^ this.getSolutionArn() == null)
            return false;
        if (other.getSolutionArn() != null && other.getSolutionArn().equals(this.getSolutionArn()) == false)
            return false;
        if (other.getTrainingMode() == null ^ this.getTrainingMode() == null)
            return false;
        if (other.getTrainingMode() != null && other.getTrainingMode().equals(this.getTrainingMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSolutionArn() == null) ? 0 : getSolutionArn().hashCode());
        hashCode = prime * hashCode + ((getTrainingMode() == null) ? 0 : getTrainingMode().hashCode());
        return hashCode;
    }

    @Override
    public CreateSolutionVersionRequest clone() {
        return (CreateSolutionVersionRequest) super.clone();
    }

}
