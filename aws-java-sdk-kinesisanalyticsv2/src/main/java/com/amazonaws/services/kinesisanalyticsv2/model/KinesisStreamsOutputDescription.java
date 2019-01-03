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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * For an SQL-based Amazon Kinesis Data Analytics application's output, describes the Kinesis data stream that is
 * configured as its destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/KinesisStreamsOutputDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisStreamsOutputDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * The ARN of the IAM role that Kinesis Data Analytics can assume to access the stream.
     * </p>
     * <note>
     * <p>
     * Provided for backward compatibility. Applications that are created with the current API version have an
     * application-level service execution role rather than a resource-level role.
     * </p>
     * </note>
     */
    private String roleARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream.
     * </p>
     * 
     * @param resourceARN
     *        The Amazon Resource Name (ARN) of the Kinesis data stream.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Kinesis data stream.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream.
     * </p>
     * 
     * @param resourceARN
     *        The Amazon Resource Name (ARN) of the Kinesis data stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamsOutputDescription withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that Kinesis Data Analytics can assume to access the stream.
     * </p>
     * <note>
     * <p>
     * Provided for backward compatibility. Applications that are created with the current API version have an
     * application-level service execution role rather than a resource-level role.
     * </p>
     * </note>
     * 
     * @param roleARN
     *        The ARN of the IAM role that Kinesis Data Analytics can assume to access the stream.</p> <note>
     *        <p>
     *        Provided for backward compatibility. Applications that are created with the current API version have an
     *        application-level service execution role rather than a resource-level role.
     *        </p>
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role that Kinesis Data Analytics can assume to access the stream.
     * </p>
     * <note>
     * <p>
     * Provided for backward compatibility. Applications that are created with the current API version have an
     * application-level service execution role rather than a resource-level role.
     * </p>
     * </note>
     * 
     * @return The ARN of the IAM role that Kinesis Data Analytics can assume to access the stream.</p> <note>
     *         <p>
     *         Provided for backward compatibility. Applications that are created with the current API version have an
     *         application-level service execution role rather than a resource-level role.
     *         </p>
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role that Kinesis Data Analytics can assume to access the stream.
     * </p>
     * <note>
     * <p>
     * Provided for backward compatibility. Applications that are created with the current API version have an
     * application-level service execution role rather than a resource-level role.
     * </p>
     * </note>
     * 
     * @param roleARN
     *        The ARN of the IAM role that Kinesis Data Analytics can assume to access the stream.</p> <note>
     *        <p>
     *        Provided for backward compatibility. Applications that are created with the current API version have an
     *        application-level service execution role rather than a resource-level role.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamsOutputDescription withRoleARN(String roleARN) {
        setRoleARN(roleARN);
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisStreamsOutputDescription == false)
            return false;
        KinesisStreamsOutputDescription other = (KinesisStreamsOutputDescription) obj;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        return hashCode;
    }

    @Override
    public KinesisStreamsOutputDescription clone() {
        try {
            return (KinesisStreamsOutputDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.KinesisStreamsOutputDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
