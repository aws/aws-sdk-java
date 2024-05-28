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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/UpdateConfiguredAudienceModel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfiguredAudienceModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new audience model that you want to use.
     * </p>
     */
    private String audienceModelArn;
    /**
     * <p>
     * The new audience size configuration.
     * </p>
     */
    private AudienceSizeConfig audienceSizeConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that you want to update.
     * </p>
     */
    private String configuredAudienceModelArn;
    /**
     * <p>
     * The new description of the configured audience model.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The minimum number of users from the seed audience that must match with users in the training data of the
     * audience model.
     * </p>
     */
    private Integer minMatchingSeedSize;
    /**
     * <p>
     * The new output configuration.
     * </p>
     */
    private ConfiguredAudienceModelOutputConfig outputConfig;
    /**
     * <p>
     * The new value for whether to share audience metrics.
     * </p>
     */
    private java.util.List<String> sharedAudienceMetrics;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new audience model that you want to use.
     * </p>
     * 
     * @param audienceModelArn
     *        The Amazon Resource Name (ARN) of the new audience model that you want to use.
     */

    public void setAudienceModelArn(String audienceModelArn) {
        this.audienceModelArn = audienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new audience model that you want to use.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the new audience model that you want to use.
     */

    public String getAudienceModelArn() {
        return this.audienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new audience model that you want to use.
     * </p>
     * 
     * @param audienceModelArn
     *        The Amazon Resource Name (ARN) of the new audience model that you want to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredAudienceModelRequest withAudienceModelArn(String audienceModelArn) {
        setAudienceModelArn(audienceModelArn);
        return this;
    }

    /**
     * <p>
     * The new audience size configuration.
     * </p>
     * 
     * @param audienceSizeConfig
     *        The new audience size configuration.
     */

    public void setAudienceSizeConfig(AudienceSizeConfig audienceSizeConfig) {
        this.audienceSizeConfig = audienceSizeConfig;
    }

    /**
     * <p>
     * The new audience size configuration.
     * </p>
     * 
     * @return The new audience size configuration.
     */

    public AudienceSizeConfig getAudienceSizeConfig() {
        return this.audienceSizeConfig;
    }

    /**
     * <p>
     * The new audience size configuration.
     * </p>
     * 
     * @param audienceSizeConfig
     *        The new audience size configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredAudienceModelRequest withAudienceSizeConfig(AudienceSizeConfig audienceSizeConfig) {
        setAudienceSizeConfig(audienceSizeConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that you want to update.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model that you want to update.
     */

    public void setConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        this.configuredAudienceModelArn = configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that you want to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the configured audience model that you want to update.
     */

    public String getConfiguredAudienceModelArn() {
        return this.configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that you want to update.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredAudienceModelRequest withConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        setConfiguredAudienceModelArn(configuredAudienceModelArn);
        return this;
    }

    /**
     * <p>
     * The new description of the configured audience model.
     * </p>
     * 
     * @param description
     *        The new description of the configured audience model.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description of the configured audience model.
     * </p>
     * 
     * @return The new description of the configured audience model.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new description of the configured audience model.
     * </p>
     * 
     * @param description
     *        The new description of the configured audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredAudienceModelRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The minimum number of users from the seed audience that must match with users in the training data of the
     * audience model.
     * </p>
     * 
     * @param minMatchingSeedSize
     *        The minimum number of users from the seed audience that must match with users in the training data of the
     *        audience model.
     */

    public void setMinMatchingSeedSize(Integer minMatchingSeedSize) {
        this.minMatchingSeedSize = minMatchingSeedSize;
    }

    /**
     * <p>
     * The minimum number of users from the seed audience that must match with users in the training data of the
     * audience model.
     * </p>
     * 
     * @return The minimum number of users from the seed audience that must match with users in the training data of the
     *         audience model.
     */

    public Integer getMinMatchingSeedSize() {
        return this.minMatchingSeedSize;
    }

    /**
     * <p>
     * The minimum number of users from the seed audience that must match with users in the training data of the
     * audience model.
     * </p>
     * 
     * @param minMatchingSeedSize
     *        The minimum number of users from the seed audience that must match with users in the training data of the
     *        audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredAudienceModelRequest withMinMatchingSeedSize(Integer minMatchingSeedSize) {
        setMinMatchingSeedSize(minMatchingSeedSize);
        return this;
    }

    /**
     * <p>
     * The new output configuration.
     * </p>
     * 
     * @param outputConfig
     *        The new output configuration.
     */

    public void setOutputConfig(ConfiguredAudienceModelOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The new output configuration.
     * </p>
     * 
     * @return The new output configuration.
     */

    public ConfiguredAudienceModelOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The new output configuration.
     * </p>
     * 
     * @param outputConfig
     *        The new output configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredAudienceModelRequest withOutputConfig(ConfiguredAudienceModelOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * The new value for whether to share audience metrics.
     * </p>
     * 
     * @return The new value for whether to share audience metrics.
     * @see SharedAudienceMetrics
     */

    public java.util.List<String> getSharedAudienceMetrics() {
        return sharedAudienceMetrics;
    }

    /**
     * <p>
     * The new value for whether to share audience metrics.
     * </p>
     * 
     * @param sharedAudienceMetrics
     *        The new value for whether to share audience metrics.
     * @see SharedAudienceMetrics
     */

    public void setSharedAudienceMetrics(java.util.Collection<String> sharedAudienceMetrics) {
        if (sharedAudienceMetrics == null) {
            this.sharedAudienceMetrics = null;
            return;
        }

        this.sharedAudienceMetrics = new java.util.ArrayList<String>(sharedAudienceMetrics);
    }

    /**
     * <p>
     * The new value for whether to share audience metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSharedAudienceMetrics(java.util.Collection)} or
     * {@link #withSharedAudienceMetrics(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sharedAudienceMetrics
     *        The new value for whether to share audience metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharedAudienceMetrics
     */

    public UpdateConfiguredAudienceModelRequest withSharedAudienceMetrics(String... sharedAudienceMetrics) {
        if (this.sharedAudienceMetrics == null) {
            setSharedAudienceMetrics(new java.util.ArrayList<String>(sharedAudienceMetrics.length));
        }
        for (String ele : sharedAudienceMetrics) {
            this.sharedAudienceMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The new value for whether to share audience metrics.
     * </p>
     * 
     * @param sharedAudienceMetrics
     *        The new value for whether to share audience metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharedAudienceMetrics
     */

    public UpdateConfiguredAudienceModelRequest withSharedAudienceMetrics(java.util.Collection<String> sharedAudienceMetrics) {
        setSharedAudienceMetrics(sharedAudienceMetrics);
        return this;
    }

    /**
     * <p>
     * The new value for whether to share audience metrics.
     * </p>
     * 
     * @param sharedAudienceMetrics
     *        The new value for whether to share audience metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SharedAudienceMetrics
     */

    public UpdateConfiguredAudienceModelRequest withSharedAudienceMetrics(SharedAudienceMetrics... sharedAudienceMetrics) {
        java.util.ArrayList<String> sharedAudienceMetricsCopy = new java.util.ArrayList<String>(sharedAudienceMetrics.length);
        for (SharedAudienceMetrics value : sharedAudienceMetrics) {
            sharedAudienceMetricsCopy.add(value.toString());
        }
        if (getSharedAudienceMetrics() == null) {
            setSharedAudienceMetrics(sharedAudienceMetricsCopy);
        } else {
            getSharedAudienceMetrics().addAll(sharedAudienceMetricsCopy);
        }
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
        if (getAudienceModelArn() != null)
            sb.append("AudienceModelArn: ").append(getAudienceModelArn()).append(",");
        if (getAudienceSizeConfig() != null)
            sb.append("AudienceSizeConfig: ").append(getAudienceSizeConfig()).append(",");
        if (getConfiguredAudienceModelArn() != null)
            sb.append("ConfiguredAudienceModelArn: ").append(getConfiguredAudienceModelArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getMinMatchingSeedSize() != null)
            sb.append("MinMatchingSeedSize: ").append(getMinMatchingSeedSize()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getSharedAudienceMetrics() != null)
            sb.append("SharedAudienceMetrics: ").append(getSharedAudienceMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConfiguredAudienceModelRequest == false)
            return false;
        UpdateConfiguredAudienceModelRequest other = (UpdateConfiguredAudienceModelRequest) obj;
        if (other.getAudienceModelArn() == null ^ this.getAudienceModelArn() == null)
            return false;
        if (other.getAudienceModelArn() != null && other.getAudienceModelArn().equals(this.getAudienceModelArn()) == false)
            return false;
        if (other.getAudienceSizeConfig() == null ^ this.getAudienceSizeConfig() == null)
            return false;
        if (other.getAudienceSizeConfig() != null && other.getAudienceSizeConfig().equals(this.getAudienceSizeConfig()) == false)
            return false;
        if (other.getConfiguredAudienceModelArn() == null ^ this.getConfiguredAudienceModelArn() == null)
            return false;
        if (other.getConfiguredAudienceModelArn() != null && other.getConfiguredAudienceModelArn().equals(this.getConfiguredAudienceModelArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMinMatchingSeedSize() == null ^ this.getMinMatchingSeedSize() == null)
            return false;
        if (other.getMinMatchingSeedSize() != null && other.getMinMatchingSeedSize().equals(this.getMinMatchingSeedSize()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getSharedAudienceMetrics() == null ^ this.getSharedAudienceMetrics() == null)
            return false;
        if (other.getSharedAudienceMetrics() != null && other.getSharedAudienceMetrics().equals(this.getSharedAudienceMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudienceModelArn() == null) ? 0 : getAudienceModelArn().hashCode());
        hashCode = prime * hashCode + ((getAudienceSizeConfig() == null) ? 0 : getAudienceSizeConfig().hashCode());
        hashCode = prime * hashCode + ((getConfiguredAudienceModelArn() == null) ? 0 : getConfiguredAudienceModelArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMinMatchingSeedSize() == null) ? 0 : getMinMatchingSeedSize().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getSharedAudienceMetrics() == null) ? 0 : getSharedAudienceMetrics().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConfiguredAudienceModelRequest clone() {
        return (UpdateConfiguredAudienceModelRequest) super.clone();
    }

}
