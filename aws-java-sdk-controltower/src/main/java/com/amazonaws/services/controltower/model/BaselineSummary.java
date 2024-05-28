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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns a summary of information about a <code>Baseline</code> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/BaselineSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BaselineSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The full ARN of a Baseline.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A summary description of a Baseline.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The human-readable name of a Baseline.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The full ARN of a Baseline.
     * </p>
     * 
     * @param arn
     *        The full ARN of a Baseline.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The full ARN of a Baseline.
     * </p>
     * 
     * @return The full ARN of a Baseline.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The full ARN of a Baseline.
     * </p>
     * 
     * @param arn
     *        The full ARN of a Baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaselineSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A summary description of a Baseline.
     * </p>
     * 
     * @param description
     *        A summary description of a Baseline.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A summary description of a Baseline.
     * </p>
     * 
     * @return A summary description of a Baseline.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A summary description of a Baseline.
     * </p>
     * 
     * @param description
     *        A summary description of a Baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaselineSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The human-readable name of a Baseline.
     * </p>
     * 
     * @param name
     *        The human-readable name of a Baseline.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The human-readable name of a Baseline.
     * </p>
     * 
     * @return The human-readable name of a Baseline.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The human-readable name of a Baseline.
     * </p>
     * 
     * @param name
     *        The human-readable name of a Baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaselineSummary withName(String name) {
        setName(name);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BaselineSummary == false)
            return false;
        BaselineSummary other = (BaselineSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public BaselineSummary clone() {
        try {
            return (BaselineSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controltower.model.transform.BaselineSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
