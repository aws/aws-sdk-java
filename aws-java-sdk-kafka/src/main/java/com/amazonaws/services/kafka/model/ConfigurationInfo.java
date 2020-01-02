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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Specifies the configuration to use for the brokers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ConfigurationInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of the configuration to use.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The revision of the configuration to use.
     * </p>
     */
    private Long revision;

    /**
     * <p>
     * ARN of the configuration to use.
     * </p>
     * 
     * @param arn
     *        <p>
     *        ARN of the configuration to use.
     *        </p>
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * ARN of the configuration to use.
     * </p>
     * 
     * @return <p>
     *         ARN of the configuration to use.
     *         </p>
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * ARN of the configuration to use.
     * </p>
     * 
     * @param arn
     *        <p>
     *        ARN of the configuration to use.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationInfo withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The revision of the configuration to use.
     * </p>
     * 
     * @param revision
     *        <p>
     *        The revision of the configuration to use.
     *        </p>
     */

    public void setRevision(Long revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of the configuration to use.
     * </p>
     * 
     * @return <p>
     *         The revision of the configuration to use.
     *         </p>
     */

    public Long getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision of the configuration to use.
     * </p>
     * 
     * @param revision
     *        <p>
     *        The revision of the configuration to use.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationInfo withRevision(Long revision) {
        setRevision(revision);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationInfo == false)
            return false;
        ConfigurationInfo other = (ConfigurationInfo) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurationInfo clone() {
        try {
            return (ConfigurationInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ConfigurationInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
