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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RegisterPublisher" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterPublisherRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Whether you accept the terms and conditions for publishing extensions in the CloudFormation registry. You must
     * accept the terms and conditions in order to register to publish public extensions to the CloudFormation registry.
     * </p>
     * <p>
     * The default is <code>false</code>.
     * </p>
     */
    private Boolean acceptTermsAndConditions;
    /**
     * <p>
     * If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource Name (ARN) for your
     * connection to that account.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs"
     * >Registering your account to publish CloudFormation extensions</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     */
    private String connectionArn;

    /**
     * <p>
     * Whether you accept the terms and conditions for publishing extensions in the CloudFormation registry. You must
     * accept the terms and conditions in order to register to publish public extensions to the CloudFormation registry.
     * </p>
     * <p>
     * The default is <code>false</code>.
     * </p>
     * 
     * @param acceptTermsAndConditions
     *        Whether you accept the terms and conditions for publishing extensions in the CloudFormation registry. You
     *        must accept the terms and conditions in order to register to publish public extensions to the
     *        CloudFormation registry.</p>
     *        <p>
     *        The default is <code>false</code>.
     */

    public void setAcceptTermsAndConditions(Boolean acceptTermsAndConditions) {
        this.acceptTermsAndConditions = acceptTermsAndConditions;
    }

    /**
     * <p>
     * Whether you accept the terms and conditions for publishing extensions in the CloudFormation registry. You must
     * accept the terms and conditions in order to register to publish public extensions to the CloudFormation registry.
     * </p>
     * <p>
     * The default is <code>false</code>.
     * </p>
     * 
     * @return Whether you accept the terms and conditions for publishing extensions in the CloudFormation registry. You
     *         must accept the terms and conditions in order to register to publish public extensions to the
     *         CloudFormation registry.</p>
     *         <p>
     *         The default is <code>false</code>.
     */

    public Boolean getAcceptTermsAndConditions() {
        return this.acceptTermsAndConditions;
    }

    /**
     * <p>
     * Whether you accept the terms and conditions for publishing extensions in the CloudFormation registry. You must
     * accept the terms and conditions in order to register to publish public extensions to the CloudFormation registry.
     * </p>
     * <p>
     * The default is <code>false</code>.
     * </p>
     * 
     * @param acceptTermsAndConditions
     *        Whether you accept the terms and conditions for publishing extensions in the CloudFormation registry. You
     *        must accept the terms and conditions in order to register to publish public extensions to the
     *        CloudFormation registry.</p>
     *        <p>
     *        The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterPublisherRequest withAcceptTermsAndConditions(Boolean acceptTermsAndConditions) {
        setAcceptTermsAndConditions(acceptTermsAndConditions);
        return this;
    }

    /**
     * <p>
     * Whether you accept the terms and conditions for publishing extensions in the CloudFormation registry. You must
     * accept the terms and conditions in order to register to publish public extensions to the CloudFormation registry.
     * </p>
     * <p>
     * The default is <code>false</code>.
     * </p>
     * 
     * @return Whether you accept the terms and conditions for publishing extensions in the CloudFormation registry. You
     *         must accept the terms and conditions in order to register to publish public extensions to the
     *         CloudFormation registry.</p>
     *         <p>
     *         The default is <code>false</code>.
     */

    public Boolean isAcceptTermsAndConditions() {
        return this.acceptTermsAndConditions;
    }

    /**
     * <p>
     * If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource Name (ARN) for your
     * connection to that account.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs"
     * >Registering your account to publish CloudFormation extensions</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * 
     * @param connectionArn
     *        If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource Name (ARN)
     *        for your connection to that account.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs"
     *        >Registering your account to publish CloudFormation extensions</a> in the <i>CloudFormation CLI User
     *        Guide</i>.
     */

    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>
     * If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource Name (ARN) for your
     * connection to that account.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs"
     * >Registering your account to publish CloudFormation extensions</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * 
     * @return If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource Name (ARN)
     *         for your connection to that account.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs"
     *         >Registering your account to publish CloudFormation extensions</a> in the <i>CloudFormation CLI User
     *         Guide</i>.
     */

    public String getConnectionArn() {
        return this.connectionArn;
    }

    /**
     * <p>
     * If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource Name (ARN) for your
     * connection to that account.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs"
     * >Registering your account to publish CloudFormation extensions</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * 
     * @param connectionArn
     *        If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource Name (ARN)
     *        for your connection to that account.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs"
     *        >Registering your account to publish CloudFormation extensions</a> in the <i>CloudFormation CLI User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterPublisherRequest withConnectionArn(String connectionArn) {
        setConnectionArn(connectionArn);
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
        if (getAcceptTermsAndConditions() != null)
            sb.append("AcceptTermsAndConditions: ").append(getAcceptTermsAndConditions()).append(",");
        if (getConnectionArn() != null)
            sb.append("ConnectionArn: ").append(getConnectionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterPublisherRequest == false)
            return false;
        RegisterPublisherRequest other = (RegisterPublisherRequest) obj;
        if (other.getAcceptTermsAndConditions() == null ^ this.getAcceptTermsAndConditions() == null)
            return false;
        if (other.getAcceptTermsAndConditions() != null && other.getAcceptTermsAndConditions().equals(this.getAcceptTermsAndConditions()) == false)
            return false;
        if (other.getConnectionArn() == null ^ this.getConnectionArn() == null)
            return false;
        if (other.getConnectionArn() != null && other.getConnectionArn().equals(this.getConnectionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptTermsAndConditions() == null) ? 0 : getAcceptTermsAndConditions().hashCode());
        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        return hashCode;
    }

    @Override
    public RegisterPublisherRequest clone() {
        return (RegisterPublisherRequest) super.clone();
    }

}
