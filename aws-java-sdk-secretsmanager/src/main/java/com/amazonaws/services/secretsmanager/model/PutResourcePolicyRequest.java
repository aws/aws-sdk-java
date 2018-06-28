/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/PutResourcePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the secret that you want to attach the resource-based policy to. You can specify either the ARN or the
     * friendly name of the secret.
     * </p>
     */
    private String secretId;
    /**
     * <p>
     * A JSON-formatted string that's constructed according to the grammar and syntax for an AWS resource-based policy.
     * The policy in the string identifies who can access or manage this secret and its versions. For information on how
     * to format a JSON parameter for the various command line tool environments, see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a> in the <i>AWS CLI User Guide</i>.
     * </p>
     */
    private String resourcePolicy;

    /**
     * <p>
     * Specifies the secret that you want to attach the resource-based policy to. You can specify either the ARN or the
     * friendly name of the secret.
     * </p>
     * 
     * @param secretId
     *        Specifies the secret that you want to attach the resource-based policy to. You can specify either the ARN
     *        or the friendly name of the secret.
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * Specifies the secret that you want to attach the resource-based policy to. You can specify either the ARN or the
     * friendly name of the secret.
     * </p>
     * 
     * @return Specifies the secret that you want to attach the resource-based policy to. You can specify either the ARN
     *         or the friendly name of the secret.
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * Specifies the secret that you want to attach the resource-based policy to. You can specify either the ARN or the
     * friendly name of the secret.
     * </p>
     * 
     * @param secretId
     *        Specifies the secret that you want to attach the resource-based policy to. You can specify either the ARN
     *        or the friendly name of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * A JSON-formatted string that's constructed according to the grammar and syntax for an AWS resource-based policy.
     * The policy in the string identifies who can access or manage this secret and its versions. For information on how
     * to format a JSON parameter for the various command line tool environments, see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a> in the <i>AWS CLI User Guide</i>.
     * </p>
     * 
     * @param resourcePolicy
     *        A JSON-formatted string that's constructed according to the grammar and syntax for an AWS resource-based
     *        policy. The policy in the string identifies who can access or manage this secret and its versions. For
     *        information on how to format a JSON parameter for the various command line tool environments, see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using
     *        JSON for Parameters</a> in the <i>AWS CLI User Guide</i>.
     */

    public void setResourcePolicy(String resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
    }

    /**
     * <p>
     * A JSON-formatted string that's constructed according to the grammar and syntax for an AWS resource-based policy.
     * The policy in the string identifies who can access or manage this secret and its versions. For information on how
     * to format a JSON parameter for the various command line tool environments, see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a> in the <i>AWS CLI User Guide</i>.
     * </p>
     * 
     * @return A JSON-formatted string that's constructed according to the grammar and syntax for an AWS resource-based
     *         policy. The policy in the string identifies who can access or manage this secret and its versions. For
     *         information on how to format a JSON parameter for the various command line tool environments, see <a
     *         href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using
     *         JSON for Parameters</a> in the <i>AWS CLI User Guide</i>.
     */

    public String getResourcePolicy() {
        return this.resourcePolicy;
    }

    /**
     * <p>
     * A JSON-formatted string that's constructed according to the grammar and syntax for an AWS resource-based policy.
     * The policy in the string identifies who can access or manage this secret and its versions. For information on how
     * to format a JSON parameter for the various command line tool environments, see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using JSON for
     * Parameters</a> in the <i>AWS CLI User Guide</i>.
     * </p>
     * 
     * @param resourcePolicy
     *        A JSON-formatted string that's constructed according to the grammar and syntax for an AWS resource-based
     *        policy. The policy in the string identifies who can access or manage this secret and its versions. For
     *        information on how to format a JSON parameter for the various command line tool environments, see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json">Using
     *        JSON for Parameters</a> in the <i>AWS CLI User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withResourcePolicy(String resourcePolicy) {
        setResourcePolicy(resourcePolicy);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSecretId() != null)
            sb.append("SecretId: ").append(getSecretId()).append(",");
        if (getResourcePolicy() != null)
            sb.append("ResourcePolicy: ").append(getResourcePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourcePolicyRequest == false)
            return false;
        PutResourcePolicyRequest other = (PutResourcePolicyRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getResourcePolicy() == null ^ this.getResourcePolicy() == null)
            return false;
        if (other.getResourcePolicy() != null && other.getResourcePolicy().equals(this.getResourcePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getResourcePolicy() == null) ? 0 : getResourcePolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutResourcePolicyRequest clone() {
        return (PutResourcePolicyRequest) super.clone();
    }

}
