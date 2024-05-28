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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains custom model transform parameters. See <a
 * href="https://docs.aws.amazon.com/neptune/latest/userguide/machine-learning-model-transform.html">Use a trained model
 * to generate new model artifacts</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CustomModelTransformParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomModelTransformParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path to the Amazon S3 location where the Python module implementing your model is located. This must point to
     * a valid existing Amazon S3 location that contains, at a minimum, a training script, a transform script, and a
     * <code>model-hpo-configuration.json</code> file.
     * </p>
     */
    private String sourceS3DirectoryPath;
    /**
     * <p>
     * The name of the entry point in your module of a script that should be run after the best model from the
     * hyperparameter search has been identified, to compute the model artifacts necessary for model deployment. It
     * should be able to run with no command-line arguments. The default is <code>transform.py</code>.
     * </p>
     */
    private String transformEntryPointScript;

    /**
     * <p>
     * The path to the Amazon S3 location where the Python module implementing your model is located. This must point to
     * a valid existing Amazon S3 location that contains, at a minimum, a training script, a transform script, and a
     * <code>model-hpo-configuration.json</code> file.
     * </p>
     * 
     * @param sourceS3DirectoryPath
     *        The path to the Amazon S3 location where the Python module implementing your model is located. This must
     *        point to a valid existing Amazon S3 location that contains, at a minimum, a training script, a transform
     *        script, and a <code>model-hpo-configuration.json</code> file.
     */

    public void setSourceS3DirectoryPath(String sourceS3DirectoryPath) {
        this.sourceS3DirectoryPath = sourceS3DirectoryPath;
    }

    /**
     * <p>
     * The path to the Amazon S3 location where the Python module implementing your model is located. This must point to
     * a valid existing Amazon S3 location that contains, at a minimum, a training script, a transform script, and a
     * <code>model-hpo-configuration.json</code> file.
     * </p>
     * 
     * @return The path to the Amazon S3 location where the Python module implementing your model is located. This must
     *         point to a valid existing Amazon S3 location that contains, at a minimum, a training script, a transform
     *         script, and a <code>model-hpo-configuration.json</code> file.
     */

    public String getSourceS3DirectoryPath() {
        return this.sourceS3DirectoryPath;
    }

    /**
     * <p>
     * The path to the Amazon S3 location where the Python module implementing your model is located. This must point to
     * a valid existing Amazon S3 location that contains, at a minimum, a training script, a transform script, and a
     * <code>model-hpo-configuration.json</code> file.
     * </p>
     * 
     * @param sourceS3DirectoryPath
     *        The path to the Amazon S3 location where the Python module implementing your model is located. This must
     *        point to a valid existing Amazon S3 location that contains, at a minimum, a training script, a transform
     *        script, and a <code>model-hpo-configuration.json</code> file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomModelTransformParameters withSourceS3DirectoryPath(String sourceS3DirectoryPath) {
        setSourceS3DirectoryPath(sourceS3DirectoryPath);
        return this;
    }

    /**
     * <p>
     * The name of the entry point in your module of a script that should be run after the best model from the
     * hyperparameter search has been identified, to compute the model artifacts necessary for model deployment. It
     * should be able to run with no command-line arguments. The default is <code>transform.py</code>.
     * </p>
     * 
     * @param transformEntryPointScript
     *        The name of the entry point in your module of a script that should be run after the best model from the
     *        hyperparameter search has been identified, to compute the model artifacts necessary for model deployment.
     *        It should be able to run with no command-line arguments. The default is <code>transform.py</code>.
     */

    public void setTransformEntryPointScript(String transformEntryPointScript) {
        this.transformEntryPointScript = transformEntryPointScript;
    }

    /**
     * <p>
     * The name of the entry point in your module of a script that should be run after the best model from the
     * hyperparameter search has been identified, to compute the model artifacts necessary for model deployment. It
     * should be able to run with no command-line arguments. The default is <code>transform.py</code>.
     * </p>
     * 
     * @return The name of the entry point in your module of a script that should be run after the best model from the
     *         hyperparameter search has been identified, to compute the model artifacts necessary for model deployment.
     *         It should be able to run with no command-line arguments. The default is <code>transform.py</code>.
     */

    public String getTransformEntryPointScript() {
        return this.transformEntryPointScript;
    }

    /**
     * <p>
     * The name of the entry point in your module of a script that should be run after the best model from the
     * hyperparameter search has been identified, to compute the model artifacts necessary for model deployment. It
     * should be able to run with no command-line arguments. The default is <code>transform.py</code>.
     * </p>
     * 
     * @param transformEntryPointScript
     *        The name of the entry point in your module of a script that should be run after the best model from the
     *        hyperparameter search has been identified, to compute the model artifacts necessary for model deployment.
     *        It should be able to run with no command-line arguments. The default is <code>transform.py</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomModelTransformParameters withTransformEntryPointScript(String transformEntryPointScript) {
        setTransformEntryPointScript(transformEntryPointScript);
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
        if (getSourceS3DirectoryPath() != null)
            sb.append("SourceS3DirectoryPath: ").append(getSourceS3DirectoryPath()).append(",");
        if (getTransformEntryPointScript() != null)
            sb.append("TransformEntryPointScript: ").append(getTransformEntryPointScript());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomModelTransformParameters == false)
            return false;
        CustomModelTransformParameters other = (CustomModelTransformParameters) obj;
        if (other.getSourceS3DirectoryPath() == null ^ this.getSourceS3DirectoryPath() == null)
            return false;
        if (other.getSourceS3DirectoryPath() != null && other.getSourceS3DirectoryPath().equals(this.getSourceS3DirectoryPath()) == false)
            return false;
        if (other.getTransformEntryPointScript() == null ^ this.getTransformEntryPointScript() == null)
            return false;
        if (other.getTransformEntryPointScript() != null && other.getTransformEntryPointScript().equals(this.getTransformEntryPointScript()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceS3DirectoryPath() == null) ? 0 : getSourceS3DirectoryPath().hashCode());
        hashCode = prime * hashCode + ((getTransformEntryPointScript() == null) ? 0 : getTransformEntryPointScript().hashCode());
        return hashCode;
    }

    @Override
    public CustomModelTransformParameters clone() {
        try {
            return (CustomModelTransformParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.CustomModelTransformParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
