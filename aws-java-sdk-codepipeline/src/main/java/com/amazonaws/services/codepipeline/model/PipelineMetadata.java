/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PipelineMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline.
     * </p>
     */
    private String pipelineArn;
    /**
     * <p>
     * The date and time the pipeline was created, in timestamp format.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The date and time the pipeline was last updated, in timestamp format.
     * </p>
     */
    private java.util.Date updated;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline.
     * </p>
     * 
     * @param pipelineArn
     *        The Amazon Resource Name (ARN) of the pipeline.
     */

    public void setPipelineArn(String pipelineArn) {
        this.pipelineArn = pipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the pipeline.
     */

    public String getPipelineArn() {
        return this.pipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline.
     * </p>
     * 
     * @param pipelineArn
     *        The Amazon Resource Name (ARN) of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineMetadata withPipelineArn(String pipelineArn) {
        setPipelineArn(pipelineArn);
        return this;
    }

    /**
     * <p>
     * The date and time the pipeline was created, in timestamp format.
     * </p>
     * 
     * @param created
     *        The date and time the pipeline was created, in timestamp format.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The date and time the pipeline was created, in timestamp format.
     * </p>
     * 
     * @return The date and time the pipeline was created, in timestamp format.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The date and time the pipeline was created, in timestamp format.
     * </p>
     * 
     * @param created
     *        The date and time the pipeline was created, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineMetadata withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The date and time the pipeline was last updated, in timestamp format.
     * </p>
     * 
     * @param updated
     *        The date and time the pipeline was last updated, in timestamp format.
     */

    public void setUpdated(java.util.Date updated) {
        this.updated = updated;
    }

    /**
     * <p>
     * The date and time the pipeline was last updated, in timestamp format.
     * </p>
     * 
     * @return The date and time the pipeline was last updated, in timestamp format.
     */

    public java.util.Date getUpdated() {
        return this.updated;
    }

    /**
     * <p>
     * The date and time the pipeline was last updated, in timestamp format.
     * </p>
     * 
     * @param updated
     *        The date and time the pipeline was last updated, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineMetadata withUpdated(java.util.Date updated) {
        setUpdated(updated);
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
        if (getPipelineArn() != null)
            sb.append("PipelineArn: ").append(getPipelineArn()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getUpdated() != null)
            sb.append("Updated: ").append(getUpdated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineMetadata == false)
            return false;
        PipelineMetadata other = (PipelineMetadata) obj;
        if (other.getPipelineArn() == null ^ this.getPipelineArn() == null)
            return false;
        if (other.getPipelineArn() != null && other.getPipelineArn().equals(this.getPipelineArn()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getUpdated() == null ^ this.getUpdated() == null)
            return false;
        if (other.getUpdated() != null && other.getUpdated().equals(this.getUpdated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineArn() == null) ? 0 : getPipelineArn().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getUpdated() == null) ? 0 : getUpdated().hashCode());
        return hashCode;
    }

    @Override
    public PipelineMetadata clone() {
        try {
            return (PipelineMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.PipelineMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
