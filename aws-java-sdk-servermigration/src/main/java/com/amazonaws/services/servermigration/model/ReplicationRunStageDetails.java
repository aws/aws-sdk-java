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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the current stage of a replication run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ReplicationRunStageDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationRunStageDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * String describing the current stage of a replication run.
     * </p>
     */
    private String stage;
    /**
     * <p>
     * String describing the progress of the current stage of a replication run.
     * </p>
     */
    private String stageProgress;

    /**
     * <p>
     * String describing the current stage of a replication run.
     * </p>
     * 
     * @param stage
     *        String describing the current stage of a replication run.
     */

    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * String describing the current stage of a replication run.
     * </p>
     * 
     * @return String describing the current stage of a replication run.
     */

    public String getStage() {
        return this.stage;
    }

    /**
     * <p>
     * String describing the current stage of a replication run.
     * </p>
     * 
     * @param stage
     *        String describing the current stage of a replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRunStageDetails withStage(String stage) {
        setStage(stage);
        return this;
    }

    /**
     * <p>
     * String describing the progress of the current stage of a replication run.
     * </p>
     * 
     * @param stageProgress
     *        String describing the progress of the current stage of a replication run.
     */

    public void setStageProgress(String stageProgress) {
        this.stageProgress = stageProgress;
    }

    /**
     * <p>
     * String describing the progress of the current stage of a replication run.
     * </p>
     * 
     * @return String describing the progress of the current stage of a replication run.
     */

    public String getStageProgress() {
        return this.stageProgress;
    }

    /**
     * <p>
     * String describing the progress of the current stage of a replication run.
     * </p>
     * 
     * @param stageProgress
     *        String describing the progress of the current stage of a replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRunStageDetails withStageProgress(String stageProgress) {
        setStageProgress(stageProgress);
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
        if (getStage() != null)
            sb.append("Stage: ").append(getStage()).append(",");
        if (getStageProgress() != null)
            sb.append("StageProgress: ").append(getStageProgress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationRunStageDetails == false)
            return false;
        ReplicationRunStageDetails other = (ReplicationRunStageDetails) obj;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        if (other.getStageProgress() == null ^ this.getStageProgress() == null)
            return false;
        if (other.getStageProgress() != null && other.getStageProgress().equals(this.getStageProgress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        hashCode = prime * hashCode + ((getStageProgress() == null) ? 0 : getStageProgress().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationRunStageDetails clone() {
        try {
            return (ReplicationRunStageDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.ReplicationRunStageDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
