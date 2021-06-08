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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the response plan that are used when creating an incident.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ResponsePlanSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponsePlanSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the response plan.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The human readable name of the response plan. This can include spaces.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The name of the response plan. This can't include spaces.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the response plan.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the response plan.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the response plan.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the response plan.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the response plan.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the response plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponsePlanSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The human readable name of the response plan. This can include spaces.
     * </p>
     * 
     * @param displayName
     *        The human readable name of the response plan. This can include spaces.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The human readable name of the response plan. This can include spaces.
     * </p>
     * 
     * @return The human readable name of the response plan. This can include spaces.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The human readable name of the response plan. This can include spaces.
     * </p>
     * 
     * @param displayName
     *        The human readable name of the response plan. This can include spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponsePlanSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The name of the response plan. This can't include spaces.
     * </p>
     * 
     * @param name
     *        The name of the response plan. This can't include spaces.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the response plan. This can't include spaces.
     * </p>
     * 
     * @return The name of the response plan. This can't include spaces.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the response plan. This can't include spaces.
     * </p>
     * 
     * @param name
     *        The name of the response plan. This can't include spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponsePlanSummary withName(String name) {
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
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

        if (obj instanceof ResponsePlanSummary == false)
            return false;
        ResponsePlanSummary other = (ResponsePlanSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
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
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ResponsePlanSummary clone() {
        try {
            return (ResponsePlanSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.ResponsePlanSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
