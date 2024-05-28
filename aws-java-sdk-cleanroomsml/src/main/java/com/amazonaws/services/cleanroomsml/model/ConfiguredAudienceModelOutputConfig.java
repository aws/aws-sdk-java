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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information necessary for the configure audience model output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ConfiguredAudienceModelOutputConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfiguredAudienceModelOutputConfig implements Serializable, Cloneable, StructuredPojo {

    private AudienceDestination destination;
    /**
     * <p>
     * The ARN of the IAM role that can write the Amazon S3 bucket.
     * </p>
     */
    private String roleArn;

    /**
     * @param destination
     */

    public void setDestination(AudienceDestination destination) {
        this.destination = destination;
    }

    /**
     * @return
     */

    public AudienceDestination getDestination() {
        return this.destination;
    }

    /**
     * @param destination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredAudienceModelOutputConfig withDestination(AudienceDestination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that can write the Amazon S3 bucket.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that can write the Amazon S3 bucket.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that can write the Amazon S3 bucket.
     * </p>
     * 
     * @return The ARN of the IAM role that can write the Amazon S3 bucket.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that can write the Amazon S3 bucket.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that can write the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredAudienceModelOutputConfig withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfiguredAudienceModelOutputConfig == false)
            return false;
        ConfiguredAudienceModelOutputConfig other = (ConfiguredAudienceModelOutputConfig) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public ConfiguredAudienceModelOutputConfig clone() {
        try {
            return (ConfiguredAudienceModelOutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanroomsml.model.transform.ConfiguredAudienceModelOutputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
