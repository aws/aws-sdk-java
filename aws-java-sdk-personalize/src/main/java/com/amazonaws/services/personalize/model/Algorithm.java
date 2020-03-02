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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a custom algorithm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/Algorithm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Algorithm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the algorithm.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     */
    private String algorithmArn;
    /**
     * <p>
     * The URI of the Docker container for the algorithm image.
     * </p>
     */
    private AlgorithmImage algorithmImage;
    /**
     * <p>
     * Specifies the default hyperparameters.
     * </p>
     */
    private java.util.Map<String, String> defaultHyperParameters;
    /**
     * <p>
     * Specifies the default hyperparameters, their ranges, and whether they are tunable. A tunable hyperparameter can
     * have its value determined during hyperparameter optimization (HPO).
     * </p>
     */
    private DefaultHyperParameterRanges defaultHyperParameterRanges;
    /**
     * <p>
     * Specifies the default maximum number of training jobs and parallel training jobs.
     * </p>
     */
    private java.util.Map<String, String> defaultResourceConfig;
    /**
     * <p>
     * The training input mode.
     * </p>
     */
    private String trainingInputMode;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The date and time (in Unix time) that the algorithm was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time (in Unix time) that the algorithm was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The name of the algorithm.
     * </p>
     * 
     * @param name
     *        The name of the algorithm.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the algorithm.
     * </p>
     * 
     * @return The name of the algorithm.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the algorithm.
     * </p>
     * 
     * @param name
     *        The name of the algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Algorithm withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * 
     * @param algorithmArn
     *        The Amazon Resource Name (ARN) of the algorithm.
     */

    public void setAlgorithmArn(String algorithmArn) {
        this.algorithmArn = algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the algorithm.
     */

    public String getAlgorithmArn() {
        return this.algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * 
     * @param algorithmArn
     *        The Amazon Resource Name (ARN) of the algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Algorithm withAlgorithmArn(String algorithmArn) {
        setAlgorithmArn(algorithmArn);
        return this;
    }

    /**
     * <p>
     * The URI of the Docker container for the algorithm image.
     * </p>
     * 
     * @param algorithmImage
     *        The URI of the Docker container for the algorithm image.
     */

    public void setAlgorithmImage(AlgorithmImage algorithmImage) {
        this.algorithmImage = algorithmImage;
    }

    /**
     * <p>
     * The URI of the Docker container for the algorithm image.
     * </p>
     * 
     * @return The URI of the Docker container for the algorithm image.
     */

    public AlgorithmImage getAlgorithmImage() {
        return this.algorithmImage;
    }

    /**
     * <p>
     * The URI of the Docker container for the algorithm image.
     * </p>
     * 
     * @param algorithmImage
     *        The URI of the Docker container for the algorithm image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Algorithm withAlgorithmImage(AlgorithmImage algorithmImage) {
        setAlgorithmImage(algorithmImage);
        return this;
    }

    /**
     * <p>
     * Specifies the default hyperparameters.
     * </p>
     * 
     * @return Specifies the default hyperparameters.
     */

    public java.util.Map<String, String> getDefaultHyperParameters() {
        return defaultHyperParameters;
    }

    /**
     * <p>
     * Specifies the default hyperparameters.
     * </p>
     * 
     * @param defaultHyperParameters
     *        Specifies the default hyperparameters.
     */

    public void setDefaultHyperParameters(java.util.Map<String, String> defaultHyperParameters) {
        this.defaultHyperParameters = defaultHyperParameters;
    }

    /**
     * <p>
     * Specifies the default hyperparameters.
     * </p>
     * 
     * @param defaultHyperParameters
     *        Specifies the default hyperparameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Algorithm withDefaultHyperParameters(java.util.Map<String, String> defaultHyperParameters) {
        setDefaultHyperParameters(defaultHyperParameters);
        return this;
    }

    /**
     * Add a single DefaultHyperParameters entry
     *
     * @see Algorithm#withDefaultHyperParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Algorithm addDefaultHyperParametersEntry(String key, String value) {
        if (null == this.defaultHyperParameters) {
            this.defaultHyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.defaultHyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.defaultHyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DefaultHyperParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Algorithm clearDefaultHyperParametersEntries() {
        this.defaultHyperParameters = null;
        return this;
    }

    /**
     * <p>
     * Specifies the default hyperparameters, their ranges, and whether they are tunable. A tunable hyperparameter can
     * have its value determined during hyperparameter optimization (HPO).
     * </p>
     * 
     * @param defaultHyperParameterRanges
     *        Specifies the default hyperparameters, their ranges, and whether they are tunable. A tunable
     *        hyperparameter can have its value determined during hyperparameter optimization (HPO).
     */

    public void setDefaultHyperParameterRanges(DefaultHyperParameterRanges defaultHyperParameterRanges) {
        this.defaultHyperParameterRanges = defaultHyperParameterRanges;
    }

    /**
     * <p>
     * Specifies the default hyperparameters, their ranges, and whether they are tunable. A tunable hyperparameter can
     * have its value determined during hyperparameter optimization (HPO).
     * </p>
     * 
     * @return Specifies the default hyperparameters, their ranges, and whether they are tunable. A tunable
     *         hyperparameter can have its value determined during hyperparameter optimization (HPO).
     */

    public DefaultHyperParameterRanges getDefaultHyperParameterRanges() {
        return this.defaultHyperParameterRanges;
    }

    /**
     * <p>
     * Specifies the default hyperparameters, their ranges, and whether they are tunable. A tunable hyperparameter can
     * have its value determined during hyperparameter optimization (HPO).
     * </p>
     * 
     * @param defaultHyperParameterRanges
     *        Specifies the default hyperparameters, their ranges, and whether they are tunable. A tunable
     *        hyperparameter can have its value determined during hyperparameter optimization (HPO).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Algorithm withDefaultHyperParameterRanges(DefaultHyperParameterRanges defaultHyperParameterRanges) {
        setDefaultHyperParameterRanges(defaultHyperParameterRanges);
        return this;
    }

    /**
     * <p>
     * Specifies the default maximum number of training jobs and parallel training jobs.
     * </p>
     * 
     * @return Specifies the default maximum number of training jobs and parallel training jobs.
     */

    public java.util.Map<String, String> getDefaultResourceConfig() {
        return defaultResourceConfig;
    }

    /**
     * <p>
     * Specifies the default maximum number of training jobs and parallel training jobs.
     * </p>
     * 
     * @param defaultResourceConfig
     *        Specifies the default maximum number of training jobs and parallel training jobs.
     */

    public void setDefaultResourceConfig(java.util.Map<String, String> defaultResourceConfig) {
        this.defaultResourceConfig = defaultResourceConfig;
    }

    /**
     * <p>
     * Specifies the default maximum number of training jobs and parallel training jobs.
     * </p>
     * 
     * @param defaultResourceConfig
     *        Specifies the default maximum number of training jobs and parallel training jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Algorithm withDefaultResourceConfig(java.util.Map<String, String> defaultResourceConfig) {
        setDefaultResourceConfig(defaultResourceConfig);
        return this;
    }

    /**
     * Add a single DefaultResourceConfig entry
     *
     * @see Algorithm#withDefaultResourceConfig
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Algorithm addDefaultResourceConfigEntry(String key, String value) {
        if (null == this.defaultResourceConfig) {
            this.defaultResourceConfig = new java.util.HashMap<String, String>();
        }
        if (this.defaultResourceConfig.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.defaultResourceConfig.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DefaultResourceConfig.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Algorithm clearDefaultResourceConfigEntries() {
        this.defaultResourceConfig = null;
        return this;
    }

    /**
     * <p>
     * The training input mode.
     * </p>
     * 
     * @param trainingInputMode
     *        The training input mode.
     */

    public void setTrainingInputMode(String trainingInputMode) {
        this.trainingInputMode = trainingInputMode;
    }

    /**
     * <p>
     * The training input mode.
     * </p>
     * 
     * @return The training input mode.
     */

    public String getTrainingInputMode() {
        return this.trainingInputMode;
    }

    /**
     * <p>
     * The training input mode.
     * </p>
     * 
     * @param trainingInputMode
     *        The training input mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Algorithm withTrainingInputMode(String trainingInputMode) {
        setTrainingInputMode(trainingInputMode);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Algorithm withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the algorithm was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix time) that the algorithm was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the algorithm was created.
     * </p>
     * 
     * @return The date and time (in Unix time) that the algorithm was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the algorithm was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix time) that the algorithm was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Algorithm withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the algorithm was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) that the algorithm was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the algorithm was last updated.
     * </p>
     * 
     * @return The date and time (in Unix time) that the algorithm was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the algorithm was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) that the algorithm was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Algorithm withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getAlgorithmArn() != null)
            sb.append("AlgorithmArn: ").append(getAlgorithmArn()).append(",");
        if (getAlgorithmImage() != null)
            sb.append("AlgorithmImage: ").append(getAlgorithmImage()).append(",");
        if (getDefaultHyperParameters() != null)
            sb.append("DefaultHyperParameters: ").append(getDefaultHyperParameters()).append(",");
        if (getDefaultHyperParameterRanges() != null)
            sb.append("DefaultHyperParameterRanges: ").append(getDefaultHyperParameterRanges()).append(",");
        if (getDefaultResourceConfig() != null)
            sb.append("DefaultResourceConfig: ").append(getDefaultResourceConfig()).append(",");
        if (getTrainingInputMode() != null)
            sb.append("TrainingInputMode: ").append(getTrainingInputMode()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Algorithm == false)
            return false;
        Algorithm other = (Algorithm) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAlgorithmArn() == null ^ this.getAlgorithmArn() == null)
            return false;
        if (other.getAlgorithmArn() != null && other.getAlgorithmArn().equals(this.getAlgorithmArn()) == false)
            return false;
        if (other.getAlgorithmImage() == null ^ this.getAlgorithmImage() == null)
            return false;
        if (other.getAlgorithmImage() != null && other.getAlgorithmImage().equals(this.getAlgorithmImage()) == false)
            return false;
        if (other.getDefaultHyperParameters() == null ^ this.getDefaultHyperParameters() == null)
            return false;
        if (other.getDefaultHyperParameters() != null && other.getDefaultHyperParameters().equals(this.getDefaultHyperParameters()) == false)
            return false;
        if (other.getDefaultHyperParameterRanges() == null ^ this.getDefaultHyperParameterRanges() == null)
            return false;
        if (other.getDefaultHyperParameterRanges() != null && other.getDefaultHyperParameterRanges().equals(this.getDefaultHyperParameterRanges()) == false)
            return false;
        if (other.getDefaultResourceConfig() == null ^ this.getDefaultResourceConfig() == null)
            return false;
        if (other.getDefaultResourceConfig() != null && other.getDefaultResourceConfig().equals(this.getDefaultResourceConfig()) == false)
            return false;
        if (other.getTrainingInputMode() == null ^ this.getTrainingInputMode() == null)
            return false;
        if (other.getTrainingInputMode() != null && other.getTrainingInputMode().equals(this.getTrainingInputMode()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmArn() == null) ? 0 : getAlgorithmArn().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmImage() == null) ? 0 : getAlgorithmImage().hashCode());
        hashCode = prime * hashCode + ((getDefaultHyperParameters() == null) ? 0 : getDefaultHyperParameters().hashCode());
        hashCode = prime * hashCode + ((getDefaultHyperParameterRanges() == null) ? 0 : getDefaultHyperParameterRanges().hashCode());
        hashCode = prime * hashCode + ((getDefaultResourceConfig() == null) ? 0 : getDefaultResourceConfig().hashCode());
        hashCode = prime * hashCode + ((getTrainingInputMode() == null) ? 0 : getTrainingInputMode().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public Algorithm clone() {
        try {
            return (Algorithm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.AlgorithmMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
