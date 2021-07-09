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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an authentication configuration for the private docker registry where your model image is hosted. Specify a
 * value for this property only if you specified <code>Vpc</code> as the value for the <code>RepositoryAccessMode</code>
 * field of the <code>ImageConfig</code> object that you passed to a call to <code>CreateModel</code> and the private
 * Docker registry where the model image is hosted requires authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RepositoryAuthConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryAuthConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Web Services Lambda function that provides credentials to
     * authenticate to the private Docker registry where your model image is hosted. For information about how to create
     * an Amazon Web Services Lambda function, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/getting-started-create-function.html">Create a Lambda function
     * with the console</a> in the <i>Amazon Web Services Lambda Developer Guide</i>.
     * </p>
     */
    private String repositoryCredentialsProviderArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Web Services Lambda function that provides credentials to
     * authenticate to the private Docker registry where your model image is hosted. For information about how to create
     * an Amazon Web Services Lambda function, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/getting-started-create-function.html">Create a Lambda function
     * with the console</a> in the <i>Amazon Web Services Lambda Developer Guide</i>.
     * </p>
     * 
     * @param repositoryCredentialsProviderArn
     *        The Amazon Resource Name (ARN) of an Amazon Web Services Lambda function that provides credentials to
     *        authenticate to the private Docker registry where your model image is hosted. For information about how to
     *        create an Amazon Web Services Lambda function, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/getting-started-create-function.html">Create a Lambda
     *        function with the console</a> in the <i>Amazon Web Services Lambda Developer Guide</i>.
     */

    public void setRepositoryCredentialsProviderArn(String repositoryCredentialsProviderArn) {
        this.repositoryCredentialsProviderArn = repositoryCredentialsProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Web Services Lambda function that provides credentials to
     * authenticate to the private Docker registry where your model image is hosted. For information about how to create
     * an Amazon Web Services Lambda function, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/getting-started-create-function.html">Create a Lambda function
     * with the console</a> in the <i>Amazon Web Services Lambda Developer Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Amazon Web Services Lambda function that provides credentials to
     *         authenticate to the private Docker registry where your model image is hosted. For information about how
     *         to create an Amazon Web Services Lambda function, see <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/getting-started-create-function.html">Create a Lambda
     *         function with the console</a> in the <i>Amazon Web Services Lambda Developer Guide</i>.
     */

    public String getRepositoryCredentialsProviderArn() {
        return this.repositoryCredentialsProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Web Services Lambda function that provides credentials to
     * authenticate to the private Docker registry where your model image is hosted. For information about how to create
     * an Amazon Web Services Lambda function, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/getting-started-create-function.html">Create a Lambda function
     * with the console</a> in the <i>Amazon Web Services Lambda Developer Guide</i>.
     * </p>
     * 
     * @param repositoryCredentialsProviderArn
     *        The Amazon Resource Name (ARN) of an Amazon Web Services Lambda function that provides credentials to
     *        authenticate to the private Docker registry where your model image is hosted. For information about how to
     *        create an Amazon Web Services Lambda function, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/getting-started-create-function.html">Create a Lambda
     *        function with the console</a> in the <i>Amazon Web Services Lambda Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAuthConfig withRepositoryCredentialsProviderArn(String repositoryCredentialsProviderArn) {
        setRepositoryCredentialsProviderArn(repositoryCredentialsProviderArn);
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
        if (getRepositoryCredentialsProviderArn() != null)
            sb.append("RepositoryCredentialsProviderArn: ").append(getRepositoryCredentialsProviderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryAuthConfig == false)
            return false;
        RepositoryAuthConfig other = (RepositoryAuthConfig) obj;
        if (other.getRepositoryCredentialsProviderArn() == null ^ this.getRepositoryCredentialsProviderArn() == null)
            return false;
        if (other.getRepositoryCredentialsProviderArn() != null
                && other.getRepositoryCredentialsProviderArn().equals(this.getRepositoryCredentialsProviderArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryCredentialsProviderArn() == null) ? 0 : getRepositoryCredentialsProviderArn().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryAuthConfig clone() {
        try {
            return (RepositoryAuthConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RepositoryAuthConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
