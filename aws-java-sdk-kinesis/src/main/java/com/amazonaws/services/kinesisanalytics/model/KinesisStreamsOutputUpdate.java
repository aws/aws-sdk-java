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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * When updating an output configuration using the <a>UpdateApplication</a> operation, provides information about an
 * Amazon Kinesis stream configured as the destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/KinesisStreamsOutputUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisStreamsOutputUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Amazon Kinesis stream where you want to write the output.
     * </p>
     */
    private String resourceARNUpdate;
    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to
     * grant the necessary permissions to this role.
     * </p>
     */
    private String roleARNUpdate;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Amazon Kinesis stream where you want to write the output.
     * </p>
     * 
     * @param resourceARNUpdate
     *        Amazon Resource Name (ARN) of the Amazon Kinesis stream where you want to write the output.
     */

    public void setResourceARNUpdate(String resourceARNUpdate) {
        this.resourceARNUpdate = resourceARNUpdate;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Amazon Kinesis stream where you want to write the output.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the Amazon Kinesis stream where you want to write the output.
     */

    public String getResourceARNUpdate() {
        return this.resourceARNUpdate;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Amazon Kinesis stream where you want to write the output.
     * </p>
     * 
     * @param resourceARNUpdate
     *        Amazon Resource Name (ARN) of the Amazon Kinesis stream where you want to write the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamsOutputUpdate withResourceARNUpdate(String resourceARNUpdate) {
        setResourceARNUpdate(resourceARNUpdate);
        return this;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to
     * grant the necessary permissions to this role.
     * </p>
     * 
     * @param roleARNUpdate
     *        ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need
     *        to grant the necessary permissions to this role.
     */

    public void setRoleARNUpdate(String roleARNUpdate) {
        this.roleARNUpdate = roleARNUpdate;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to
     * grant the necessary permissions to this role.
     * </p>
     * 
     * @return ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You
     *         need to grant the necessary permissions to this role.
     */

    public String getRoleARNUpdate() {
        return this.roleARNUpdate;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need to
     * grant the necessary permissions to this role.
     * </p>
     * 
     * @param roleARNUpdate
     *        ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf. You need
     *        to grant the necessary permissions to this role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamsOutputUpdate withRoleARNUpdate(String roleARNUpdate) {
        setRoleARNUpdate(roleARNUpdate);
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
        if (getResourceARNUpdate() != null)
            sb.append("ResourceARNUpdate: ").append(getResourceARNUpdate()).append(",");
        if (getRoleARNUpdate() != null)
            sb.append("RoleARNUpdate: ").append(getRoleARNUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisStreamsOutputUpdate == false)
            return false;
        KinesisStreamsOutputUpdate other = (KinesisStreamsOutputUpdate) obj;
        if (other.getResourceARNUpdate() == null ^ this.getResourceARNUpdate() == null)
            return false;
        if (other.getResourceARNUpdate() != null && other.getResourceARNUpdate().equals(this.getResourceARNUpdate()) == false)
            return false;
        if (other.getRoleARNUpdate() == null ^ this.getRoleARNUpdate() == null)
            return false;
        if (other.getRoleARNUpdate() != null && other.getRoleARNUpdate().equals(this.getRoleARNUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceARNUpdate() == null) ? 0 : getResourceARNUpdate().hashCode());
        hashCode = prime * hashCode + ((getRoleARNUpdate() == null) ? 0 : getRoleARNUpdate().hashCode());
        return hashCode;
    }

    @Override
    public KinesisStreamsOutputUpdate clone() {
        try {
            return (KinesisStreamsOutputUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalytics.model.transform.KinesisStreamsOutputUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
