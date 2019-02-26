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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A revision for an AWS Lambda or Amazon ECS deployment that is a YAML-formatted or JSON-formatted string. For AWS
 * Lambda and Amazon ECS deployments, the revision is the same as the AppSpec file. This method replaces the deprecated
 * <code>RawString</code> data type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/AppSpecContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppSpecContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The YAML-formatted or JSON-formatted revision string.
     * </p>
     * <p>
     * For an AWS Lambda deployment, the content includes a Lambda function name, the alias for its original version,
     * and the alias for its replacement version. The deployment shifts traffic from the original version of the Lambda
     * function to the replacement version.
     * </p>
     * <p>
     * For an Amazon ECS deployment, the content includes the task name, information about the load balancer that serves
     * traffic to the container, and more.
     * </p>
     * <p>
     * For both types of deployments, the content can specify Lambda functions that run at specified hooks, such as
     * <code>BeforeInstall</code>, during a deployment.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The SHA256 hash value of the revision content.
     * </p>
     */
    private String sha256;

    /**
     * <p>
     * The YAML-formatted or JSON-formatted revision string.
     * </p>
     * <p>
     * For an AWS Lambda deployment, the content includes a Lambda function name, the alias for its original version,
     * and the alias for its replacement version. The deployment shifts traffic from the original version of the Lambda
     * function to the replacement version.
     * </p>
     * <p>
     * For an Amazon ECS deployment, the content includes the task name, information about the load balancer that serves
     * traffic to the container, and more.
     * </p>
     * <p>
     * For both types of deployments, the content can specify Lambda functions that run at specified hooks, such as
     * <code>BeforeInstall</code>, during a deployment.
     * </p>
     * 
     * @param content
     *        The YAML-formatted or JSON-formatted revision string. </p>
     *        <p>
     *        For an AWS Lambda deployment, the content includes a Lambda function name, the alias for its original
     *        version, and the alias for its replacement version. The deployment shifts traffic from the original
     *        version of the Lambda function to the replacement version.
     *        </p>
     *        <p>
     *        For an Amazon ECS deployment, the content includes the task name, information about the load balancer that
     *        serves traffic to the container, and more.
     *        </p>
     *        <p>
     *        For both types of deployments, the content can specify Lambda functions that run at specified hooks, such
     *        as <code>BeforeInstall</code>, during a deployment.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The YAML-formatted or JSON-formatted revision string.
     * </p>
     * <p>
     * For an AWS Lambda deployment, the content includes a Lambda function name, the alias for its original version,
     * and the alias for its replacement version. The deployment shifts traffic from the original version of the Lambda
     * function to the replacement version.
     * </p>
     * <p>
     * For an Amazon ECS deployment, the content includes the task name, information about the load balancer that serves
     * traffic to the container, and more.
     * </p>
     * <p>
     * For both types of deployments, the content can specify Lambda functions that run at specified hooks, such as
     * <code>BeforeInstall</code>, during a deployment.
     * </p>
     * 
     * @return The YAML-formatted or JSON-formatted revision string. </p>
     *         <p>
     *         For an AWS Lambda deployment, the content includes a Lambda function name, the alias for its original
     *         version, and the alias for its replacement version. The deployment shifts traffic from the original
     *         version of the Lambda function to the replacement version.
     *         </p>
     *         <p>
     *         For an Amazon ECS deployment, the content includes the task name, information about the load balancer
     *         that serves traffic to the container, and more.
     *         </p>
     *         <p>
     *         For both types of deployments, the content can specify Lambda functions that run at specified hooks, such
     *         as <code>BeforeInstall</code>, during a deployment.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The YAML-formatted or JSON-formatted revision string.
     * </p>
     * <p>
     * For an AWS Lambda deployment, the content includes a Lambda function name, the alias for its original version,
     * and the alias for its replacement version. The deployment shifts traffic from the original version of the Lambda
     * function to the replacement version.
     * </p>
     * <p>
     * For an Amazon ECS deployment, the content includes the task name, information about the load balancer that serves
     * traffic to the container, and more.
     * </p>
     * <p>
     * For both types of deployments, the content can specify Lambda functions that run at specified hooks, such as
     * <code>BeforeInstall</code>, during a deployment.
     * </p>
     * 
     * @param content
     *        The YAML-formatted or JSON-formatted revision string. </p>
     *        <p>
     *        For an AWS Lambda deployment, the content includes a Lambda function name, the alias for its original
     *        version, and the alias for its replacement version. The deployment shifts traffic from the original
     *        version of the Lambda function to the replacement version.
     *        </p>
     *        <p>
     *        For an Amazon ECS deployment, the content includes the task name, information about the load balancer that
     *        serves traffic to the container, and more.
     *        </p>
     *        <p>
     *        For both types of deployments, the content can specify Lambda functions that run at specified hooks, such
     *        as <code>BeforeInstall</code>, during a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSpecContent withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The SHA256 hash value of the revision content.
     * </p>
     * 
     * @param sha256
     *        The SHA256 hash value of the revision content.
     */

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    /**
     * <p>
     * The SHA256 hash value of the revision content.
     * </p>
     * 
     * @return The SHA256 hash value of the revision content.
     */

    public String getSha256() {
        return this.sha256;
    }

    /**
     * <p>
     * The SHA256 hash value of the revision content.
     * </p>
     * 
     * @param sha256
     *        The SHA256 hash value of the revision content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSpecContent withSha256(String sha256) {
        setSha256(sha256);
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getSha256() != null)
            sb.append("Sha256: ").append(getSha256());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppSpecContent == false)
            return false;
        AppSpecContent other = (AppSpecContent) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getSha256() == null ^ this.getSha256() == null)
            return false;
        if (other.getSha256() != null && other.getSha256().equals(this.getSha256()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getSha256() == null) ? 0 : getSha256().hashCode());
        return hashCode;
    }

    @Override
    public AppSpecContent clone() {
        try {
            return (AppSpecContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.AppSpecContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
