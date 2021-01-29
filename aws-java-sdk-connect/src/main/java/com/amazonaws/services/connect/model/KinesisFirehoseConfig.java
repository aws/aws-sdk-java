/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information of a Kinesis Data Firehose delivery stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/KinesisFirehoseConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisFirehoseConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delivery stream.
     * </p>
     */
    private String firehoseArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delivery stream.
     * </p>
     * 
     * @param firehoseArn
     *        The Amazon Resource Name (ARN) of the delivery stream.
     */

    public void setFirehoseArn(String firehoseArn) {
        this.firehoseArn = firehoseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delivery stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the delivery stream.
     */

    public String getFirehoseArn() {
        return this.firehoseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delivery stream.
     * </p>
     * 
     * @param firehoseArn
     *        The Amazon Resource Name (ARN) of the delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisFirehoseConfig withFirehoseArn(String firehoseArn) {
        setFirehoseArn(firehoseArn);
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
        if (getFirehoseArn() != null)
            sb.append("FirehoseArn: ").append(getFirehoseArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisFirehoseConfig == false)
            return false;
        KinesisFirehoseConfig other = (KinesisFirehoseConfig) obj;
        if (other.getFirehoseArn() == null ^ this.getFirehoseArn() == null)
            return false;
        if (other.getFirehoseArn() != null && other.getFirehoseArn().equals(this.getFirehoseArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirehoseArn() == null) ? 0 : getFirehoseArn().hashCode());
        return hashCode;
    }

    @Override
    public KinesisFirehoseConfig clone() {
        try {
            return (KinesisFirehoseConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.KinesisFirehoseConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
