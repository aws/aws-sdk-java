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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Properties that describe the AWS principal that created the <code>BlockPublicAccessConfiguration</code> using the
 * <code>PutBlockPublicAccessConfiguration</code> action as well as the date and time that the configuration was
 * created. Each time a configuration for block public access is updated, Amazon EMR updates this metadata.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/BlockPublicAccessConfigurationMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlockPublicAccessConfigurationMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time that the configuration was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The Amazon Resource Name that created or last modified the configuration.
     * </p>
     */
    private String createdByArn;

    /**
     * <p>
     * The date and time that the configuration was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time that the configuration was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time that the configuration was created.
     * </p>
     * 
     * @return The date and time that the configuration was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time that the configuration was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time that the configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockPublicAccessConfigurationMetadata withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name that created or last modified the configuration.
     * </p>
     * 
     * @param createdByArn
     *        The Amazon Resource Name that created or last modified the configuration.
     */

    public void setCreatedByArn(String createdByArn) {
        this.createdByArn = createdByArn;
    }

    /**
     * <p>
     * The Amazon Resource Name that created or last modified the configuration.
     * </p>
     * 
     * @return The Amazon Resource Name that created or last modified the configuration.
     */

    public String getCreatedByArn() {
        return this.createdByArn;
    }

    /**
     * <p>
     * The Amazon Resource Name that created or last modified the configuration.
     * </p>
     * 
     * @param createdByArn
     *        The Amazon Resource Name that created or last modified the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockPublicAccessConfigurationMetadata withCreatedByArn(String createdByArn) {
        setCreatedByArn(createdByArn);
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
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getCreatedByArn() != null)
            sb.append("CreatedByArn: ").append(getCreatedByArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlockPublicAccessConfigurationMetadata == false)
            return false;
        BlockPublicAccessConfigurationMetadata other = (BlockPublicAccessConfigurationMetadata) obj;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getCreatedByArn() == null ^ this.getCreatedByArn() == null)
            return false;
        if (other.getCreatedByArn() != null && other.getCreatedByArn().equals(this.getCreatedByArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedByArn() == null) ? 0 : getCreatedByArn().hashCode());
        return hashCode;
    }

    @Override
    public BlockPublicAccessConfigurationMetadata clone() {
        try {
            return (BlockPublicAccessConfigurationMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.BlockPublicAccessConfigurationMetadataMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
