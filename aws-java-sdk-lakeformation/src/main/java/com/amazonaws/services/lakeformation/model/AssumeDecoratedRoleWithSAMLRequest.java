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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/AssumeDecoratedRoleWithSAML"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssumeDecoratedRoleWithSAMLRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A SAML assertion consisting of an assertion statement for the user who needs temporary credentials. This must
     * match the SAML assertion that was issued to IAM. This must be Base64 encoded.
     * </p>
     */
    private String sAMLAssertion;
    /**
     * <p>
     * The role that represents an IAM principal whose scope down policy allows it to call credential vending APIs such
     * as <code>GetTemporaryTableCredentials</code>. The caller must also have iam:PassRole permission on this role.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
     * </p>
     */
    private String principalArn;
    /**
     * <p>
     * The time period, between 900 and 43,200 seconds, for the timeout of the temporary credentials.
     * </p>
     */
    private Integer durationSeconds;

    /**
     * <p>
     * A SAML assertion consisting of an assertion statement for the user who needs temporary credentials. This must
     * match the SAML assertion that was issued to IAM. This must be Base64 encoded.
     * </p>
     * 
     * @param sAMLAssertion
     *        A SAML assertion consisting of an assertion statement for the user who needs temporary credentials. This
     *        must match the SAML assertion that was issued to IAM. This must be Base64 encoded.
     */

    public void setSAMLAssertion(String sAMLAssertion) {
        this.sAMLAssertion = sAMLAssertion;
    }

    /**
     * <p>
     * A SAML assertion consisting of an assertion statement for the user who needs temporary credentials. This must
     * match the SAML assertion that was issued to IAM. This must be Base64 encoded.
     * </p>
     * 
     * @return A SAML assertion consisting of an assertion statement for the user who needs temporary credentials. This
     *         must match the SAML assertion that was issued to IAM. This must be Base64 encoded.
     */

    public String getSAMLAssertion() {
        return this.sAMLAssertion;
    }

    /**
     * <p>
     * A SAML assertion consisting of an assertion statement for the user who needs temporary credentials. This must
     * match the SAML assertion that was issued to IAM. This must be Base64 encoded.
     * </p>
     * 
     * @param sAMLAssertion
     *        A SAML assertion consisting of an assertion statement for the user who needs temporary credentials. This
     *        must match the SAML assertion that was issued to IAM. This must be Base64 encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeDecoratedRoleWithSAMLRequest withSAMLAssertion(String sAMLAssertion) {
        setSAMLAssertion(sAMLAssertion);
        return this;
    }

    /**
     * <p>
     * The role that represents an IAM principal whose scope down policy allows it to call credential vending APIs such
     * as <code>GetTemporaryTableCredentials</code>. The caller must also have iam:PassRole permission on this role.
     * </p>
     * 
     * @param roleArn
     *        The role that represents an IAM principal whose scope down policy allows it to call credential vending
     *        APIs such as <code>GetTemporaryTableCredentials</code>. The caller must also have iam:PassRole permission
     *        on this role.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The role that represents an IAM principal whose scope down policy allows it to call credential vending APIs such
     * as <code>GetTemporaryTableCredentials</code>. The caller must also have iam:PassRole permission on this role.
     * </p>
     * 
     * @return The role that represents an IAM principal whose scope down policy allows it to call credential vending
     *         APIs such as <code>GetTemporaryTableCredentials</code>. The caller must also have iam:PassRole permission
     *         on this role.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The role that represents an IAM principal whose scope down policy allows it to call credential vending APIs such
     * as <code>GetTemporaryTableCredentials</code>. The caller must also have iam:PassRole permission on this role.
     * </p>
     * 
     * @param roleArn
     *        The role that represents an IAM principal whose scope down policy allows it to call credential vending
     *        APIs such as <code>GetTemporaryTableCredentials</code>. The caller must also have iam:PassRole permission
     *        on this role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeDecoratedRoleWithSAMLRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
     * </p>
     * 
     * @param principalArn
     *        The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
     * </p>
     * 
     * @param principalArn
     *        The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeDecoratedRoleWithSAMLRequest withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
        return this;
    }

    /**
     * <p>
     * The time period, between 900 and 43,200 seconds, for the timeout of the temporary credentials.
     * </p>
     * 
     * @param durationSeconds
     *        The time period, between 900 and 43,200 seconds, for the timeout of the temporary credentials.
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The time period, between 900 and 43,200 seconds, for the timeout of the temporary credentials.
     * </p>
     * 
     * @return The time period, between 900 and 43,200 seconds, for the timeout of the temporary credentials.
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The time period, between 900 and 43,200 seconds, for the timeout of the temporary credentials.
     * </p>
     * 
     * @param durationSeconds
     *        The time period, between 900 and 43,200 seconds, for the timeout of the temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeDecoratedRoleWithSAMLRequest withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
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
        if (getSAMLAssertion() != null)
            sb.append("SAMLAssertion: ").append(getSAMLAssertion()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: ").append(getPrincipalArn()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssumeDecoratedRoleWithSAMLRequest == false)
            return false;
        AssumeDecoratedRoleWithSAMLRequest other = (AssumeDecoratedRoleWithSAMLRequest) obj;
        if (other.getSAMLAssertion() == null ^ this.getSAMLAssertion() == null)
            return false;
        if (other.getSAMLAssertion() != null && other.getSAMLAssertion().equals(this.getSAMLAssertion()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSAMLAssertion() == null) ? 0 : getSAMLAssertion().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        return hashCode;
    }

    @Override
    public AssumeDecoratedRoleWithSAMLRequest clone() {
        return (AssumeDecoratedRoleWithSAMLRequest) super.clone();
    }

}
