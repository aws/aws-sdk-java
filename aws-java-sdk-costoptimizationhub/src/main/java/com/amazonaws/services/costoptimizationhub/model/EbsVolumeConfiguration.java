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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Elastic Block Store volume configuration used for recommendations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/EbsVolumeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsVolumeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Elastic Block Store attachment state.
     * </p>
     */
    private String attachmentState;
    /**
     * <p>
     * The Amazon Elastic Block Store performance configuration.
     * </p>
     */
    private BlockStoragePerformanceConfiguration performance;
    /**
     * <p>
     * The disk storage of the Amazon Elastic Block Store volume.
     * </p>
     */
    private StorageConfiguration storage;

    /**
     * <p>
     * The Amazon Elastic Block Store attachment state.
     * </p>
     * 
     * @param attachmentState
     *        The Amazon Elastic Block Store attachment state.
     */

    public void setAttachmentState(String attachmentState) {
        this.attachmentState = attachmentState;
    }

    /**
     * <p>
     * The Amazon Elastic Block Store attachment state.
     * </p>
     * 
     * @return The Amazon Elastic Block Store attachment state.
     */

    public String getAttachmentState() {
        return this.attachmentState;
    }

    /**
     * <p>
     * The Amazon Elastic Block Store attachment state.
     * </p>
     * 
     * @param attachmentState
     *        The Amazon Elastic Block Store attachment state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsVolumeConfiguration withAttachmentState(String attachmentState) {
        setAttachmentState(attachmentState);
        return this;
    }

    /**
     * <p>
     * The Amazon Elastic Block Store performance configuration.
     * </p>
     * 
     * @param performance
     *        The Amazon Elastic Block Store performance configuration.
     */

    public void setPerformance(BlockStoragePerformanceConfiguration performance) {
        this.performance = performance;
    }

    /**
     * <p>
     * The Amazon Elastic Block Store performance configuration.
     * </p>
     * 
     * @return The Amazon Elastic Block Store performance configuration.
     */

    public BlockStoragePerformanceConfiguration getPerformance() {
        return this.performance;
    }

    /**
     * <p>
     * The Amazon Elastic Block Store performance configuration.
     * </p>
     * 
     * @param performance
     *        The Amazon Elastic Block Store performance configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsVolumeConfiguration withPerformance(BlockStoragePerformanceConfiguration performance) {
        setPerformance(performance);
        return this;
    }

    /**
     * <p>
     * The disk storage of the Amazon Elastic Block Store volume.
     * </p>
     * 
     * @param storage
     *        The disk storage of the Amazon Elastic Block Store volume.
     */

    public void setStorage(StorageConfiguration storage) {
        this.storage = storage;
    }

    /**
     * <p>
     * The disk storage of the Amazon Elastic Block Store volume.
     * </p>
     * 
     * @return The disk storage of the Amazon Elastic Block Store volume.
     */

    public StorageConfiguration getStorage() {
        return this.storage;
    }

    /**
     * <p>
     * The disk storage of the Amazon Elastic Block Store volume.
     * </p>
     * 
     * @param storage
     *        The disk storage of the Amazon Elastic Block Store volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsVolumeConfiguration withStorage(StorageConfiguration storage) {
        setStorage(storage);
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
        if (getAttachmentState() != null)
            sb.append("AttachmentState: ").append(getAttachmentState()).append(",");
        if (getPerformance() != null)
            sb.append("Performance: ").append(getPerformance()).append(",");
        if (getStorage() != null)
            sb.append("Storage: ").append(getStorage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsVolumeConfiguration == false)
            return false;
        EbsVolumeConfiguration other = (EbsVolumeConfiguration) obj;
        if (other.getAttachmentState() == null ^ this.getAttachmentState() == null)
            return false;
        if (other.getAttachmentState() != null && other.getAttachmentState().equals(this.getAttachmentState()) == false)
            return false;
        if (other.getPerformance() == null ^ this.getPerformance() == null)
            return false;
        if (other.getPerformance() != null && other.getPerformance().equals(this.getPerformance()) == false)
            return false;
        if (other.getStorage() == null ^ this.getStorage() == null)
            return false;
        if (other.getStorage() != null && other.getStorage().equals(this.getStorage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachmentState() == null) ? 0 : getAttachmentState().hashCode());
        hashCode = prime * hashCode + ((getPerformance() == null) ? 0 : getPerformance().hashCode());
        hashCode = prime * hashCode + ((getStorage() == null) ? 0 : getStorage().hashCode());
        return hashCode;
    }

    @Override
    public EbsVolumeConfiguration clone() {
        try {
            return (EbsVolumeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.EbsVolumeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
