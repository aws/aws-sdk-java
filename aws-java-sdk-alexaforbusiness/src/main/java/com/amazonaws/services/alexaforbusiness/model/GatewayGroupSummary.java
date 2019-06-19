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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of a gateway group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GatewayGroupSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayGroupSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the gateway group.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the gateway group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the gateway group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ARN of the gateway group.
     * </p>
     * 
     * @param arn
     *        The ARN of the gateway group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the gateway group.
     * </p>
     * 
     * @return The ARN of the gateway group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the gateway group.
     * </p>
     * 
     * @param arn
     *        The ARN of the gateway group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayGroupSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the gateway group.
     * </p>
     * 
     * @param name
     *        The name of the gateway group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the gateway group.
     * </p>
     * 
     * @return The name of the gateway group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the gateway group.
     * </p>
     * 
     * @param name
     *        The name of the gateway group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayGroupSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the gateway group.
     * </p>
     * 
     * @param description
     *        The description of the gateway group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the gateway group.
     * </p>
     * 
     * @return The description of the gateway group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the gateway group.
     * </p>
     * 
     * @param description
     *        The description of the gateway group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayGroupSummary withDescription(String description) {
        setDescription(description);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewayGroupSummary == false)
            return false;
        GatewayGroupSummary other = (GatewayGroupSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public GatewayGroupSummary clone() {
        try {
            return (GatewayGroupSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.GatewayGroupSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
