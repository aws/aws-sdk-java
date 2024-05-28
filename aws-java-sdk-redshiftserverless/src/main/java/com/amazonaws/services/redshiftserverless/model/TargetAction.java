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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A JSON format string of the Amazon Redshift Serverless API operation with input parameters. The following is an
 * example of a target action.
 * </p>
 * <p>
 * <code>"{"CreateSnapshot": {"NamespaceName": "sampleNamespace","SnapshotName": "sampleSnapshot", "retentionPeriod": "1"}}"</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/TargetAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetAction implements Serializable, Cloneable, StructuredPojo {

    private CreateSnapshotScheduleActionParameters createSnapshot;

    /**
     * @param createSnapshot
     */

    public void setCreateSnapshot(CreateSnapshotScheduleActionParameters createSnapshot) {
        this.createSnapshot = createSnapshot;
    }

    /**
     * @return
     */

    public CreateSnapshotScheduleActionParameters getCreateSnapshot() {
        return this.createSnapshot;
    }

    /**
     * @param createSnapshot
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetAction withCreateSnapshot(CreateSnapshotScheduleActionParameters createSnapshot) {
        setCreateSnapshot(createSnapshot);
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
        if (getCreateSnapshot() != null)
            sb.append("CreateSnapshot: ").append(getCreateSnapshot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetAction == false)
            return false;
        TargetAction other = (TargetAction) obj;
        if (other.getCreateSnapshot() == null ^ this.getCreateSnapshot() == null)
            return false;
        if (other.getCreateSnapshot() != null && other.getCreateSnapshot().equals(this.getCreateSnapshot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateSnapshot() == null) ? 0 : getCreateSnapshot().hashCode());
        return hashCode;
    }

    @Override
    public TargetAction clone() {
        try {
            return (TargetAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.redshiftserverless.model.transform.TargetActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
