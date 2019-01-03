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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Identifiers for the federated user that is associated with the credentials.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/FederatedUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FederatedUser implements Serializable, Cloneable {

    /**
     * <p>
     * The string that identifies the federated user associated with the credentials, similar to the unique ID of an IAM
     * user.
     * </p>
     */
    private String federatedUserId;
    /**
     * <p>
     * The ARN that specifies the federated user that is associated with the credentials. For more information about
     * ARNs and how to use them in policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in <i>Using
     * IAM</i>.
     * </p>
     */
    private String arn;

    /**
     * Default constructor for FederatedUser object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public FederatedUser() {
    }

    /**
     * Constructs a new FederatedUser object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param federatedUserId
     *        The string that identifies the federated user associated with the credentials, similar to the unique ID of
     *        an IAM user.
     * @param arn
     *        The ARN that specifies the federated user that is associated with the credentials. For more information
     *        about ARNs and how to use them in policies, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in
     *        <i>Using IAM</i>.
     */
    public FederatedUser(String federatedUserId, String arn) {
        setFederatedUserId(federatedUserId);
        setArn(arn);
    }

    /**
     * <p>
     * The string that identifies the federated user associated with the credentials, similar to the unique ID of an IAM
     * user.
     * </p>
     * 
     * @param federatedUserId
     *        The string that identifies the federated user associated with the credentials, similar to the unique ID of
     *        an IAM user.
     */

    public void setFederatedUserId(String federatedUserId) {
        this.federatedUserId = federatedUserId;
    }

    /**
     * <p>
     * The string that identifies the federated user associated with the credentials, similar to the unique ID of an IAM
     * user.
     * </p>
     * 
     * @return The string that identifies the federated user associated with the credentials, similar to the unique ID
     *         of an IAM user.
     */

    public String getFederatedUserId() {
        return this.federatedUserId;
    }

    /**
     * <p>
     * The string that identifies the federated user associated with the credentials, similar to the unique ID of an IAM
     * user.
     * </p>
     * 
     * @param federatedUserId
     *        The string that identifies the federated user associated with the credentials, similar to the unique ID of
     *        an IAM user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederatedUser withFederatedUserId(String federatedUserId) {
        setFederatedUserId(federatedUserId);
        return this;
    }

    /**
     * <p>
     * The ARN that specifies the federated user that is associated with the credentials. For more information about
     * ARNs and how to use them in policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in <i>Using
     * IAM</i>.
     * </p>
     * 
     * @param arn
     *        The ARN that specifies the federated user that is associated with the credentials. For more information
     *        about ARNs and how to use them in policies, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in
     *        <i>Using IAM</i>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN that specifies the federated user that is associated with the credentials. For more information about
     * ARNs and how to use them in policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in <i>Using
     * IAM</i>.
     * </p>
     * 
     * @return The ARN that specifies the federated user that is associated with the credentials. For more information
     *         about ARNs and how to use them in policies, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in
     *         <i>Using IAM</i>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN that specifies the federated user that is associated with the credentials. For more information about
     * ARNs and how to use them in policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in <i>Using
     * IAM</i>.
     * </p>
     * 
     * @param arn
     *        The ARN that specifies the federated user that is associated with the credentials. For more information
     *        about ARNs and how to use them in policies, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in
     *        <i>Using IAM</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederatedUser withArn(String arn) {
        setArn(arn);
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
        if (getFederatedUserId() != null)
            sb.append("FederatedUserId: ").append(getFederatedUserId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FederatedUser == false)
            return false;
        FederatedUser other = (FederatedUser) obj;
        if (other.getFederatedUserId() == null ^ this.getFederatedUserId() == null)
            return false;
        if (other.getFederatedUserId() != null && other.getFederatedUserId().equals(this.getFederatedUserId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFederatedUserId() == null) ? 0 : getFederatedUserId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public FederatedUser clone() {
        try {
            return (FederatedUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
