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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an AWS CloudFormation stack used to create a monthly cost estimate for DevOps Guru to analyze AWS
 * resources. The maximum number of stacks you can specify for a cost estimate is one. The estimate created is for the
 * cost to analyze the AWS resources defined by the stack. For more information, see <a
 * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html">Stacks</a> in the <i>AWS
 * CloudFormation User Guide</i>.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/CloudFormationCostEstimationResourceCollectionFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudFormationCostEstimationResourceCollectionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of CloudFormation stack names. Its size is fixed at 1 item.
     * </p>
     */
    private java.util.List<String> stackNames;

    /**
     * <p>
     * An array of CloudFormation stack names. Its size is fixed at 1 item.
     * </p>
     * 
     * @return An array of CloudFormation stack names. Its size is fixed at 1 item.
     */

    public java.util.List<String> getStackNames() {
        return stackNames;
    }

    /**
     * <p>
     * An array of CloudFormation stack names. Its size is fixed at 1 item.
     * </p>
     * 
     * @param stackNames
     *        An array of CloudFormation stack names. Its size is fixed at 1 item.
     */

    public void setStackNames(java.util.Collection<String> stackNames) {
        if (stackNames == null) {
            this.stackNames = null;
            return;
        }

        this.stackNames = new java.util.ArrayList<String>(stackNames);
    }

    /**
     * <p>
     * An array of CloudFormation stack names. Its size is fixed at 1 item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStackNames(java.util.Collection)} or {@link #withStackNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stackNames
     *        An array of CloudFormation stack names. Its size is fixed at 1 item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationCostEstimationResourceCollectionFilter withStackNames(String... stackNames) {
        if (this.stackNames == null) {
            setStackNames(new java.util.ArrayList<String>(stackNames.length));
        }
        for (String ele : stackNames) {
            this.stackNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of CloudFormation stack names. Its size is fixed at 1 item.
     * </p>
     * 
     * @param stackNames
     *        An array of CloudFormation stack names. Its size is fixed at 1 item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationCostEstimationResourceCollectionFilter withStackNames(java.util.Collection<String> stackNames) {
        setStackNames(stackNames);
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
        if (getStackNames() != null)
            sb.append("StackNames: ").append(getStackNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudFormationCostEstimationResourceCollectionFilter == false)
            return false;
        CloudFormationCostEstimationResourceCollectionFilter other = (CloudFormationCostEstimationResourceCollectionFilter) obj;
        if (other.getStackNames() == null ^ this.getStackNames() == null)
            return false;
        if (other.getStackNames() != null && other.getStackNames().equals(this.getStackNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackNames() == null) ? 0 : getStackNames().hashCode());
        return hashCode;
    }

    @Override
    public CloudFormationCostEstimationResourceCollectionFilter clone() {
        try {
            return (CloudFormationCostEstimationResourceCollectionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.CloudFormationCostEstimationResourceCollectionFilterMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
