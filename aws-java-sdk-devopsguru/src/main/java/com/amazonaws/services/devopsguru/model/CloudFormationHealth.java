/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about the health of Amazon Web Services resources in your account that are specified by an Amazon Web
 * Services CloudFormation stack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/CloudFormationHealth" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudFormationHealth implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the CloudFormation stack.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * Information about the health of the Amazon Web Services resources in your account that are specified by an Amazon
     * Web Services CloudFormation stack, including the number of open proactive, open reactive insights, and the Mean
     * Time to Recover (MTTR) of closed insights.
     * </p>
     */
    private InsightHealth insight;
    /**
     * <p>
     * Number of resources that DevOps Guru is monitoring in your account that are specified by an Amazon Web Services
     * CloudFormation stack.
     * </p>
     */
    private Long analyzedResourceCount;

    /**
     * <p>
     * The name of the CloudFormation stack.
     * </p>
     * 
     * @param stackName
     *        The name of the CloudFormation stack.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name of the CloudFormation stack.
     * </p>
     * 
     * @return The name of the CloudFormation stack.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name of the CloudFormation stack.
     * </p>
     * 
     * @param stackName
     *        The name of the CloudFormation stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationHealth withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * Information about the health of the Amazon Web Services resources in your account that are specified by an Amazon
     * Web Services CloudFormation stack, including the number of open proactive, open reactive insights, and the Mean
     * Time to Recover (MTTR) of closed insights.
     * </p>
     * 
     * @param insight
     *        Information about the health of the Amazon Web Services resources in your account that are specified by an
     *        Amazon Web Services CloudFormation stack, including the number of open proactive, open reactive insights,
     *        and the Mean Time to Recover (MTTR) of closed insights.
     */

    public void setInsight(InsightHealth insight) {
        this.insight = insight;
    }

    /**
     * <p>
     * Information about the health of the Amazon Web Services resources in your account that are specified by an Amazon
     * Web Services CloudFormation stack, including the number of open proactive, open reactive insights, and the Mean
     * Time to Recover (MTTR) of closed insights.
     * </p>
     * 
     * @return Information about the health of the Amazon Web Services resources in your account that are specified by
     *         an Amazon Web Services CloudFormation stack, including the number of open proactive, open reactive
     *         insights, and the Mean Time to Recover (MTTR) of closed insights.
     */

    public InsightHealth getInsight() {
        return this.insight;
    }

    /**
     * <p>
     * Information about the health of the Amazon Web Services resources in your account that are specified by an Amazon
     * Web Services CloudFormation stack, including the number of open proactive, open reactive insights, and the Mean
     * Time to Recover (MTTR) of closed insights.
     * </p>
     * 
     * @param insight
     *        Information about the health of the Amazon Web Services resources in your account that are specified by an
     *        Amazon Web Services CloudFormation stack, including the number of open proactive, open reactive insights,
     *        and the Mean Time to Recover (MTTR) of closed insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationHealth withInsight(InsightHealth insight) {
        setInsight(insight);
        return this;
    }

    /**
     * <p>
     * Number of resources that DevOps Guru is monitoring in your account that are specified by an Amazon Web Services
     * CloudFormation stack.
     * </p>
     * 
     * @param analyzedResourceCount
     *        Number of resources that DevOps Guru is monitoring in your account that are specified by an Amazon Web
     *        Services CloudFormation stack.
     */

    public void setAnalyzedResourceCount(Long analyzedResourceCount) {
        this.analyzedResourceCount = analyzedResourceCount;
    }

    /**
     * <p>
     * Number of resources that DevOps Guru is monitoring in your account that are specified by an Amazon Web Services
     * CloudFormation stack.
     * </p>
     * 
     * @return Number of resources that DevOps Guru is monitoring in your account that are specified by an Amazon Web
     *         Services CloudFormation stack.
     */

    public Long getAnalyzedResourceCount() {
        return this.analyzedResourceCount;
    }

    /**
     * <p>
     * Number of resources that DevOps Guru is monitoring in your account that are specified by an Amazon Web Services
     * CloudFormation stack.
     * </p>
     * 
     * @param analyzedResourceCount
     *        Number of resources that DevOps Guru is monitoring in your account that are specified by an Amazon Web
     *        Services CloudFormation stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationHealth withAnalyzedResourceCount(Long analyzedResourceCount) {
        setAnalyzedResourceCount(analyzedResourceCount);
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
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getInsight() != null)
            sb.append("Insight: ").append(getInsight()).append(",");
        if (getAnalyzedResourceCount() != null)
            sb.append("AnalyzedResourceCount: ").append(getAnalyzedResourceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudFormationHealth == false)
            return false;
        CloudFormationHealth other = (CloudFormationHealth) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getInsight() == null ^ this.getInsight() == null)
            return false;
        if (other.getInsight() != null && other.getInsight().equals(this.getInsight()) == false)
            return false;
        if (other.getAnalyzedResourceCount() == null ^ this.getAnalyzedResourceCount() == null)
            return false;
        if (other.getAnalyzedResourceCount() != null && other.getAnalyzedResourceCount().equals(this.getAnalyzedResourceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getInsight() == null) ? 0 : getInsight().hashCode());
        hashCode = prime * hashCode + ((getAnalyzedResourceCount() == null) ? 0 : getAnalyzedResourceCount().hashCode());
        return hashCode;
    }

    @Override
    public CloudFormationHealth clone() {
        try {
            return (CloudFormationHealth) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.CloudFormationHealthMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
