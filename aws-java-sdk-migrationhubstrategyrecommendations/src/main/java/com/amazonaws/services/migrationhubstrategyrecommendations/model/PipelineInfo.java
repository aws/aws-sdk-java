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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed information of the pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/PipelineInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when the pipeline info was configured.
     * </p>
     */
    private String pipelineConfigurationTimeStamp;
    /**
     * <p>
     * The type of pipeline.
     * </p>
     */
    private String pipelineType;

    /**
     * <p>
     * The time when the pipeline info was configured.
     * </p>
     * 
     * @param pipelineConfigurationTimeStamp
     *        The time when the pipeline info was configured.
     */

    public void setPipelineConfigurationTimeStamp(String pipelineConfigurationTimeStamp) {
        this.pipelineConfigurationTimeStamp = pipelineConfigurationTimeStamp;
    }

    /**
     * <p>
     * The time when the pipeline info was configured.
     * </p>
     * 
     * @return The time when the pipeline info was configured.
     */

    public String getPipelineConfigurationTimeStamp() {
        return this.pipelineConfigurationTimeStamp;
    }

    /**
     * <p>
     * The time when the pipeline info was configured.
     * </p>
     * 
     * @param pipelineConfigurationTimeStamp
     *        The time when the pipeline info was configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineInfo withPipelineConfigurationTimeStamp(String pipelineConfigurationTimeStamp) {
        setPipelineConfigurationTimeStamp(pipelineConfigurationTimeStamp);
        return this;
    }

    /**
     * <p>
     * The type of pipeline.
     * </p>
     * 
     * @param pipelineType
     *        The type of pipeline.
     * @see PipelineType
     */

    public void setPipelineType(String pipelineType) {
        this.pipelineType = pipelineType;
    }

    /**
     * <p>
     * The type of pipeline.
     * </p>
     * 
     * @return The type of pipeline.
     * @see PipelineType
     */

    public String getPipelineType() {
        return this.pipelineType;
    }

    /**
     * <p>
     * The type of pipeline.
     * </p>
     * 
     * @param pipelineType
     *        The type of pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineType
     */

    public PipelineInfo withPipelineType(String pipelineType) {
        setPipelineType(pipelineType);
        return this;
    }

    /**
     * <p>
     * The type of pipeline.
     * </p>
     * 
     * @param pipelineType
     *        The type of pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineType
     */

    public PipelineInfo withPipelineType(PipelineType pipelineType) {
        this.pipelineType = pipelineType.toString();
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
        if (getPipelineConfigurationTimeStamp() != null)
            sb.append("PipelineConfigurationTimeStamp: ").append(getPipelineConfigurationTimeStamp()).append(",");
        if (getPipelineType() != null)
            sb.append("PipelineType: ").append(getPipelineType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineInfo == false)
            return false;
        PipelineInfo other = (PipelineInfo) obj;
        if (other.getPipelineConfigurationTimeStamp() == null ^ this.getPipelineConfigurationTimeStamp() == null)
            return false;
        if (other.getPipelineConfigurationTimeStamp() != null
                && other.getPipelineConfigurationTimeStamp().equals(this.getPipelineConfigurationTimeStamp()) == false)
            return false;
        if (other.getPipelineType() == null ^ this.getPipelineType() == null)
            return false;
        if (other.getPipelineType() != null && other.getPipelineType().equals(this.getPipelineType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineConfigurationTimeStamp() == null) ? 0 : getPipelineConfigurationTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getPipelineType() == null) ? 0 : getPipelineType().hashCode());
        return hashCode;
    }

    @Override
    public PipelineInfo clone() {
        try {
            return (PipelineInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.PipelineInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
