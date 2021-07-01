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
 * A single private workforce, which is automatically created when you create your first private work team. You can
 * create one private work force in each Amazon Web Services Region. By default, any workforce-related API operation
 * used in a specific region will apply to the workforce created in that region. To learn how to create a private
 * workforce, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-create-private.html">Create a
 * Private Workforce</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Workforce" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Workforce implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the private workforce.
     * </p>
     */
    private String workforceName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the private workforce.
     * </p>
     */
    private String workforceArn;
    /**
     * <p>
     * The most recent date that was used to successfully add one or more IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) to a private workforce's
     * allow list.
     * </p>
     */
    private java.util.Date lastUpdatedDate;
    /**
     * <p>
     * A list of one to ten IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) to be added to the workforce
     * allow list. By default, a workforce isn't restricted to specific IP addresses.
     * </p>
     */
    private SourceIpConfig sourceIpConfig;
    /**
     * <p>
     * The subdomain for your OIDC Identity Provider.
     * </p>
     */
    private String subDomain;
    /**
     * <p>
     * The configuration of an Amazon Cognito workforce. A single Cognito workforce is created using and corresponds to
     * a single <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">
     * Amazon Cognito user pool</a>.
     * </p>
     */
    private CognitoConfig cognitoConfig;
    /**
     * <p>
     * The configuration of an OIDC Identity Provider (IdP) private workforce.
     * </p>
     */
    private OidcConfigForResponse oidcConfig;
    /**
     * <p>
     * The date that the workforce is created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The name of the private workforce.
     * </p>
     * 
     * @param workforceName
     *        The name of the private workforce.
     */

    public void setWorkforceName(String workforceName) {
        this.workforceName = workforceName;
    }

    /**
     * <p>
     * The name of the private workforce.
     * </p>
     * 
     * @return The name of the private workforce.
     */

    public String getWorkforceName() {
        return this.workforceName;
    }

    /**
     * <p>
     * The name of the private workforce.
     * </p>
     * 
     * @param workforceName
     *        The name of the private workforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workforce withWorkforceName(String workforceName) {
        setWorkforceName(workforceName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the private workforce.
     * </p>
     * 
     * @param workforceArn
     *        The Amazon Resource Name (ARN) of the private workforce.
     */

    public void setWorkforceArn(String workforceArn) {
        this.workforceArn = workforceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the private workforce.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the private workforce.
     */

    public String getWorkforceArn() {
        return this.workforceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the private workforce.
     * </p>
     * 
     * @param workforceArn
     *        The Amazon Resource Name (ARN) of the private workforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workforce withWorkforceArn(String workforceArn) {
        setWorkforceArn(workforceArn);
        return this;
    }

    /**
     * <p>
     * The most recent date that was used to successfully add one or more IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) to a private workforce's
     * allow list.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The most recent date that was used to successfully add one or more IP address ranges (<a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) to a private
     *        workforce's allow list.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The most recent date that was used to successfully add one or more IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) to a private workforce's
     * allow list.
     * </p>
     * 
     * @return The most recent date that was used to successfully add one or more IP address ranges (<a
     *         href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) to a private
     *         workforce's allow list.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The most recent date that was used to successfully add one or more IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) to a private workforce's
     * allow list.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The most recent date that was used to successfully add one or more IP address ranges (<a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) to a private
     *        workforce's allow list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workforce withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
        return this;
    }

    /**
     * <p>
     * A list of one to ten IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) to be added to the workforce
     * allow list. By default, a workforce isn't restricted to specific IP addresses.
     * </p>
     * 
     * @param sourceIpConfig
     *        A list of one to ten IP address ranges (<a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) to be added to the
     *        workforce allow list. By default, a workforce isn't restricted to specific IP addresses.
     */

    public void setSourceIpConfig(SourceIpConfig sourceIpConfig) {
        this.sourceIpConfig = sourceIpConfig;
    }

    /**
     * <p>
     * A list of one to ten IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) to be added to the workforce
     * allow list. By default, a workforce isn't restricted to specific IP addresses.
     * </p>
     * 
     * @return A list of one to ten IP address ranges (<a
     *         href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) to be added to the
     *         workforce allow list. By default, a workforce isn't restricted to specific IP addresses.
     */

    public SourceIpConfig getSourceIpConfig() {
        return this.sourceIpConfig;
    }

    /**
     * <p>
     * A list of one to ten IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) to be added to the workforce
     * allow list. By default, a workforce isn't restricted to specific IP addresses.
     * </p>
     * 
     * @param sourceIpConfig
     *        A list of one to ten IP address ranges (<a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>) to be added to the
     *        workforce allow list. By default, a workforce isn't restricted to specific IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workforce withSourceIpConfig(SourceIpConfig sourceIpConfig) {
        setSourceIpConfig(sourceIpConfig);
        return this;
    }

    /**
     * <p>
     * The subdomain for your OIDC Identity Provider.
     * </p>
     * 
     * @param subDomain
     *        The subdomain for your OIDC Identity Provider.
     */

    public void setSubDomain(String subDomain) {
        this.subDomain = subDomain;
    }

    /**
     * <p>
     * The subdomain for your OIDC Identity Provider.
     * </p>
     * 
     * @return The subdomain for your OIDC Identity Provider.
     */

    public String getSubDomain() {
        return this.subDomain;
    }

    /**
     * <p>
     * The subdomain for your OIDC Identity Provider.
     * </p>
     * 
     * @param subDomain
     *        The subdomain for your OIDC Identity Provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workforce withSubDomain(String subDomain) {
        setSubDomain(subDomain);
        return this;
    }

    /**
     * <p>
     * The configuration of an Amazon Cognito workforce. A single Cognito workforce is created using and corresponds to
     * a single <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">
     * Amazon Cognito user pool</a>.
     * </p>
     * 
     * @param cognitoConfig
     *        The configuration of an Amazon Cognito workforce. A single Cognito workforce is created using and
     *        corresponds to a single <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"> Amazon
     *        Cognito user pool</a>.
     */

    public void setCognitoConfig(CognitoConfig cognitoConfig) {
        this.cognitoConfig = cognitoConfig;
    }

    /**
     * <p>
     * The configuration of an Amazon Cognito workforce. A single Cognito workforce is created using and corresponds to
     * a single <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">
     * Amazon Cognito user pool</a>.
     * </p>
     * 
     * @return The configuration of an Amazon Cognito workforce. A single Cognito workforce is created using and
     *         corresponds to a single <a
     *         href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"> Amazon
     *         Cognito user pool</a>.
     */

    public CognitoConfig getCognitoConfig() {
        return this.cognitoConfig;
    }

    /**
     * <p>
     * The configuration of an Amazon Cognito workforce. A single Cognito workforce is created using and corresponds to
     * a single <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">
     * Amazon Cognito user pool</a>.
     * </p>
     * 
     * @param cognitoConfig
     *        The configuration of an Amazon Cognito workforce. A single Cognito workforce is created using and
     *        corresponds to a single <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"> Amazon
     *        Cognito user pool</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workforce withCognitoConfig(CognitoConfig cognitoConfig) {
        setCognitoConfig(cognitoConfig);
        return this;
    }

    /**
     * <p>
     * The configuration of an OIDC Identity Provider (IdP) private workforce.
     * </p>
     * 
     * @param oidcConfig
     *        The configuration of an OIDC Identity Provider (IdP) private workforce.
     */

    public void setOidcConfig(OidcConfigForResponse oidcConfig) {
        this.oidcConfig = oidcConfig;
    }

    /**
     * <p>
     * The configuration of an OIDC Identity Provider (IdP) private workforce.
     * </p>
     * 
     * @return The configuration of an OIDC Identity Provider (IdP) private workforce.
     */

    public OidcConfigForResponse getOidcConfig() {
        return this.oidcConfig;
    }

    /**
     * <p>
     * The configuration of an OIDC Identity Provider (IdP) private workforce.
     * </p>
     * 
     * @param oidcConfig
     *        The configuration of an OIDC Identity Provider (IdP) private workforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workforce withOidcConfig(OidcConfigForResponse oidcConfig) {
        setOidcConfig(oidcConfig);
        return this;
    }

    /**
     * <p>
     * The date that the workforce is created.
     * </p>
     * 
     * @param createDate
     *        The date that the workforce is created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date that the workforce is created.
     * </p>
     * 
     * @return The date that the workforce is created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date that the workforce is created.
     * </p>
     * 
     * @param createDate
     *        The date that the workforce is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workforce withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
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
        if (getWorkforceName() != null)
            sb.append("WorkforceName: ").append(getWorkforceName()).append(",");
        if (getWorkforceArn() != null)
            sb.append("WorkforceArn: ").append(getWorkforceArn()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate()).append(",");
        if (getSourceIpConfig() != null)
            sb.append("SourceIpConfig: ").append(getSourceIpConfig()).append(",");
        if (getSubDomain() != null)
            sb.append("SubDomain: ").append(getSubDomain()).append(",");
        if (getCognitoConfig() != null)
            sb.append("CognitoConfig: ").append(getCognitoConfig()).append(",");
        if (getOidcConfig() != null)
            sb.append("OidcConfig: ").append(getOidcConfig()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Workforce == false)
            return false;
        Workforce other = (Workforce) obj;
        if (other.getWorkforceName() == null ^ this.getWorkforceName() == null)
            return false;
        if (other.getWorkforceName() != null && other.getWorkforceName().equals(this.getWorkforceName()) == false)
            return false;
        if (other.getWorkforceArn() == null ^ this.getWorkforceArn() == null)
            return false;
        if (other.getWorkforceArn() != null && other.getWorkforceArn().equals(this.getWorkforceArn()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getSourceIpConfig() == null ^ this.getSourceIpConfig() == null)
            return false;
        if (other.getSourceIpConfig() != null && other.getSourceIpConfig().equals(this.getSourceIpConfig()) == false)
            return false;
        if (other.getSubDomain() == null ^ this.getSubDomain() == null)
            return false;
        if (other.getSubDomain() != null && other.getSubDomain().equals(this.getSubDomain()) == false)
            return false;
        if (other.getCognitoConfig() == null ^ this.getCognitoConfig() == null)
            return false;
        if (other.getCognitoConfig() != null && other.getCognitoConfig().equals(this.getCognitoConfig()) == false)
            return false;
        if (other.getOidcConfig() == null ^ this.getOidcConfig() == null)
            return false;
        if (other.getOidcConfig() != null && other.getOidcConfig().equals(this.getOidcConfig()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkforceName() == null) ? 0 : getWorkforceName().hashCode());
        hashCode = prime * hashCode + ((getWorkforceArn() == null) ? 0 : getWorkforceArn().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getSourceIpConfig() == null) ? 0 : getSourceIpConfig().hashCode());
        hashCode = prime * hashCode + ((getSubDomain() == null) ? 0 : getSubDomain().hashCode());
        hashCode = prime * hashCode + ((getCognitoConfig() == null) ? 0 : getCognitoConfig().hashCode());
        hashCode = prime * hashCode + ((getOidcConfig() == null) ? 0 : getOidcConfig().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return hashCode;
    }

    @Override
    public Workforce clone() {
        try {
            return (Workforce) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.WorkforceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
