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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a Lambda function specified in a deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/LambdaFunctionInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaFunctionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a Lambda function.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * The alias of a Lambda function. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     */
    private String functionAlias;
    /**
     * <p>
     * The version of a Lambda function that production traffic points to.
     * </p>
     */
    private String currentVersion;
    /**
     * <p>
     * The version of a Lambda function that production traffic points to after the Lambda function is deployed.
     * </p>
     */
    private String targetVersion;
    /**
     * <p>
     * The percentage of production traffic that the target version of a Lambda function receives.
     * </p>
     */
    private Double targetVersionWeight;

    /**
     * <p>
     * The name of a Lambda function.
     * </p>
     * 
     * @param functionName
     *        The name of a Lambda function.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of a Lambda function.
     * </p>
     * 
     * @return The name of a Lambda function.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of a Lambda function.
     * </p>
     * 
     * @param functionName
     *        The name of a Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionInfo withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The alias of a Lambda function. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * 
     * @param functionAlias
     *        The alias of a Lambda function. For more information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda
     *        Aliases</a>.
     */

    public void setFunctionAlias(String functionAlias) {
        this.functionAlias = functionAlias;
    }

    /**
     * <p>
     * The alias of a Lambda function. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * 
     * @return The alias of a Lambda function. For more information, see <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda
     *         Aliases</a>.
     */

    public String getFunctionAlias() {
        return this.functionAlias;
    }

    /**
     * <p>
     * The alias of a Lambda function. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * 
     * @param functionAlias
     *        The alias of a Lambda function. For more information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda
     *        Aliases</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionInfo withFunctionAlias(String functionAlias) {
        setFunctionAlias(functionAlias);
        return this;
    }

    /**
     * <p>
     * The version of a Lambda function that production traffic points to.
     * </p>
     * 
     * @param currentVersion
     *        The version of a Lambda function that production traffic points to.
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The version of a Lambda function that production traffic points to.
     * </p>
     * 
     * @return The version of a Lambda function that production traffic points to.
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The version of a Lambda function that production traffic points to.
     * </p>
     * 
     * @param currentVersion
     *        The version of a Lambda function that production traffic points to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionInfo withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * <p>
     * The version of a Lambda function that production traffic points to after the Lambda function is deployed.
     * </p>
     * 
     * @param targetVersion
     *        The version of a Lambda function that production traffic points to after the Lambda function is deployed.
     */

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    /**
     * <p>
     * The version of a Lambda function that production traffic points to after the Lambda function is deployed.
     * </p>
     * 
     * @return The version of a Lambda function that production traffic points to after the Lambda function is deployed.
     */

    public String getTargetVersion() {
        return this.targetVersion;
    }

    /**
     * <p>
     * The version of a Lambda function that production traffic points to after the Lambda function is deployed.
     * </p>
     * 
     * @param targetVersion
     *        The version of a Lambda function that production traffic points to after the Lambda function is deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionInfo withTargetVersion(String targetVersion) {
        setTargetVersion(targetVersion);
        return this;
    }

    /**
     * <p>
     * The percentage of production traffic that the target version of a Lambda function receives.
     * </p>
     * 
     * @param targetVersionWeight
     *        The percentage of production traffic that the target version of a Lambda function receives.
     */

    public void setTargetVersionWeight(Double targetVersionWeight) {
        this.targetVersionWeight = targetVersionWeight;
    }

    /**
     * <p>
     * The percentage of production traffic that the target version of a Lambda function receives.
     * </p>
     * 
     * @return The percentage of production traffic that the target version of a Lambda function receives.
     */

    public Double getTargetVersionWeight() {
        return this.targetVersionWeight;
    }

    /**
     * <p>
     * The percentage of production traffic that the target version of a Lambda function receives.
     * </p>
     * 
     * @param targetVersionWeight
     *        The percentage of production traffic that the target version of a Lambda function receives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionInfo withTargetVersionWeight(Double targetVersionWeight) {
        setTargetVersionWeight(targetVersionWeight);
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
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getFunctionAlias() != null)
            sb.append("FunctionAlias: ").append(getFunctionAlias()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion()).append(",");
        if (getTargetVersion() != null)
            sb.append("TargetVersion: ").append(getTargetVersion()).append(",");
        if (getTargetVersionWeight() != null)
            sb.append("TargetVersionWeight: ").append(getTargetVersionWeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaFunctionInfo == false)
            return false;
        LambdaFunctionInfo other = (LambdaFunctionInfo) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getFunctionAlias() == null ^ this.getFunctionAlias() == null)
            return false;
        if (other.getFunctionAlias() != null && other.getFunctionAlias().equals(this.getFunctionAlias()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getTargetVersion() == null ^ this.getTargetVersion() == null)
            return false;
        if (other.getTargetVersion() != null && other.getTargetVersion().equals(this.getTargetVersion()) == false)
            return false;
        if (other.getTargetVersionWeight() == null ^ this.getTargetVersionWeight() == null)
            return false;
        if (other.getTargetVersionWeight() != null && other.getTargetVersionWeight().equals(this.getTargetVersionWeight()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getFunctionAlias() == null) ? 0 : getFunctionAlias().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getTargetVersion() == null) ? 0 : getTargetVersion().hashCode());
        hashCode = prime * hashCode + ((getTargetVersionWeight() == null) ? 0 : getTargetVersionWeight().hashCode());
        return hashCode;
    }

    @Override
    public LambdaFunctionInfo clone() {
        try {
            return (LambdaFunctionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.LambdaFunctionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
