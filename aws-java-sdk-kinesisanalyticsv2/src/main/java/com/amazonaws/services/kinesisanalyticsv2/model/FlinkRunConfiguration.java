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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the starting parameters for an Apache Flink-based Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/FlinkRunConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlinkRunConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When restoring from a savepoint, specifies whether the runtime is allowed to skip a state that cannot be mapped
     * to the new program. This will happen if the program is updated between savepoints to remove stateful parameters,
     * and state data in the savepoint no longer corresponds to valid application data. For more information, see <a
     * href=
     * "https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/savepoints.html#allowing-non-restored-state"
     * > Allowing Non-Restored State</a> in the <a
     * href="https://ci.apache.org/projects/flink/flink-docs-release-1.8/">Apache Flink documentation</a>.
     * </p>
     */
    private Boolean allowNonRestoredState;

    /**
     * <p>
     * When restoring from a savepoint, specifies whether the runtime is allowed to skip a state that cannot be mapped
     * to the new program. This will happen if the program is updated between savepoints to remove stateful parameters,
     * and state data in the savepoint no longer corresponds to valid application data. For more information, see <a
     * href=
     * "https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/savepoints.html#allowing-non-restored-state"
     * > Allowing Non-Restored State</a> in the <a
     * href="https://ci.apache.org/projects/flink/flink-docs-release-1.8/">Apache Flink documentation</a>.
     * </p>
     * 
     * @param allowNonRestoredState
     *        When restoring from a savepoint, specifies whether the runtime is allowed to skip a state that cannot be
     *        mapped to the new program. This will happen if the program is updated between savepoints to remove
     *        stateful parameters, and state data in the savepoint no longer corresponds to valid application data. For
     *        more information, see <a href=
     *        "https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/savepoints.html#allowing-non-restored-state"
     *        > Allowing Non-Restored State</a> in the <a
     *        href="https://ci.apache.org/projects/flink/flink-docs-release-1.8/">Apache Flink documentation</a>.
     */

    public void setAllowNonRestoredState(Boolean allowNonRestoredState) {
        this.allowNonRestoredState = allowNonRestoredState;
    }

    /**
     * <p>
     * When restoring from a savepoint, specifies whether the runtime is allowed to skip a state that cannot be mapped
     * to the new program. This will happen if the program is updated between savepoints to remove stateful parameters,
     * and state data in the savepoint no longer corresponds to valid application data. For more information, see <a
     * href=
     * "https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/savepoints.html#allowing-non-restored-state"
     * > Allowing Non-Restored State</a> in the <a
     * href="https://ci.apache.org/projects/flink/flink-docs-release-1.8/">Apache Flink documentation</a>.
     * </p>
     * 
     * @return When restoring from a savepoint, specifies whether the runtime is allowed to skip a state that cannot be
     *         mapped to the new program. This will happen if the program is updated between savepoints to remove
     *         stateful parameters, and state data in the savepoint no longer corresponds to valid application data. For
     *         more information, see <a href=
     *         "https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/savepoints.html#allowing-non-restored-state"
     *         > Allowing Non-Restored State</a> in the <a
     *         href="https://ci.apache.org/projects/flink/flink-docs-release-1.8/">Apache Flink documentation</a>.
     */

    public Boolean getAllowNonRestoredState() {
        return this.allowNonRestoredState;
    }

    /**
     * <p>
     * When restoring from a savepoint, specifies whether the runtime is allowed to skip a state that cannot be mapped
     * to the new program. This will happen if the program is updated between savepoints to remove stateful parameters,
     * and state data in the savepoint no longer corresponds to valid application data. For more information, see <a
     * href=
     * "https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/savepoints.html#allowing-non-restored-state"
     * > Allowing Non-Restored State</a> in the <a
     * href="https://ci.apache.org/projects/flink/flink-docs-release-1.8/">Apache Flink documentation</a>.
     * </p>
     * 
     * @param allowNonRestoredState
     *        When restoring from a savepoint, specifies whether the runtime is allowed to skip a state that cannot be
     *        mapped to the new program. This will happen if the program is updated between savepoints to remove
     *        stateful parameters, and state data in the savepoint no longer corresponds to valid application data. For
     *        more information, see <a href=
     *        "https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/savepoints.html#allowing-non-restored-state"
     *        > Allowing Non-Restored State</a> in the <a
     *        href="https://ci.apache.org/projects/flink/flink-docs-release-1.8/">Apache Flink documentation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlinkRunConfiguration withAllowNonRestoredState(Boolean allowNonRestoredState) {
        setAllowNonRestoredState(allowNonRestoredState);
        return this;
    }

    /**
     * <p>
     * When restoring from a savepoint, specifies whether the runtime is allowed to skip a state that cannot be mapped
     * to the new program. This will happen if the program is updated between savepoints to remove stateful parameters,
     * and state data in the savepoint no longer corresponds to valid application data. For more information, see <a
     * href=
     * "https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/savepoints.html#allowing-non-restored-state"
     * > Allowing Non-Restored State</a> in the <a
     * href="https://ci.apache.org/projects/flink/flink-docs-release-1.8/">Apache Flink documentation</a>.
     * </p>
     * 
     * @return When restoring from a savepoint, specifies whether the runtime is allowed to skip a state that cannot be
     *         mapped to the new program. This will happen if the program is updated between savepoints to remove
     *         stateful parameters, and state data in the savepoint no longer corresponds to valid application data. For
     *         more information, see <a href=
     *         "https://ci.apache.org/projects/flink/flink-docs-release-1.8/ops/state/savepoints.html#allowing-non-restored-state"
     *         > Allowing Non-Restored State</a> in the <a
     *         href="https://ci.apache.org/projects/flink/flink-docs-release-1.8/">Apache Flink documentation</a>.
     */

    public Boolean isAllowNonRestoredState() {
        return this.allowNonRestoredState;
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
        if (getAllowNonRestoredState() != null)
            sb.append("AllowNonRestoredState: ").append(getAllowNonRestoredState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlinkRunConfiguration == false)
            return false;
        FlinkRunConfiguration other = (FlinkRunConfiguration) obj;
        if (other.getAllowNonRestoredState() == null ^ this.getAllowNonRestoredState() == null)
            return false;
        if (other.getAllowNonRestoredState() != null && other.getAllowNonRestoredState().equals(this.getAllowNonRestoredState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowNonRestoredState() == null) ? 0 : getAllowNonRestoredState().hashCode());
        return hashCode;
    }

    @Override
    public FlinkRunConfiguration clone() {
        try {
            return (FlinkRunConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.FlinkRunConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
