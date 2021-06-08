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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an Amazon AppFlow flow datasource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/AppFlowConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppFlowConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An IAM role that gives Amazon Lookout for Metrics permission to access the flow.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * name of the flow.
     * </p>
     */
    private String flowName;

    /**
     * <p>
     * An IAM role that gives Amazon Lookout for Metrics permission to access the flow.
     * </p>
     * 
     * @param roleArn
     *        An IAM role that gives Amazon Lookout for Metrics permission to access the flow.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * An IAM role that gives Amazon Lookout for Metrics permission to access the flow.
     * </p>
     * 
     * @return An IAM role that gives Amazon Lookout for Metrics permission to access the flow.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * An IAM role that gives Amazon Lookout for Metrics permission to access the flow.
     * </p>
     * 
     * @param roleArn
     *        An IAM role that gives Amazon Lookout for Metrics permission to access the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppFlowConfig withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * name of the flow.
     * </p>
     * 
     * @param flowName
     *        name of the flow.
     */

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    /**
     * <p>
     * name of the flow.
     * </p>
     * 
     * @return name of the flow.
     */

    public String getFlowName() {
        return this.flowName;
    }

    /**
     * <p>
     * name of the flow.
     * </p>
     * 
     * @param flowName
     *        name of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppFlowConfig withFlowName(String flowName) {
        setFlowName(flowName);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getFlowName() != null)
            sb.append("FlowName: ").append(getFlowName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppFlowConfig == false)
            return false;
        AppFlowConfig other = (AppFlowConfig) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getFlowName() == null ^ this.getFlowName() == null)
            return false;
        if (other.getFlowName() != null && other.getFlowName().equals(this.getFlowName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getFlowName() == null) ? 0 : getFlowName().hashCode());
        return hashCode;
    }

    @Override
    public AppFlowConfig clone() {
        try {
            return (AppFlowConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.AppFlowConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
