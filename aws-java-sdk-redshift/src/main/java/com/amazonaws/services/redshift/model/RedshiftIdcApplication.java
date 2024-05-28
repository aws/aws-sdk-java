/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains properties for the Redshift IDC application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RedshiftIdcApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftIdcApplication implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN for the IAM Identity Center instance that Redshift integrates with.
     * </p>
     */
    private String idcInstanceArn;
    /**
     * <p>
     * The name of the Redshift application in IAM Identity Center.
     * </p>
     */
    private String redshiftIdcApplicationName;
    /**
     * <p>
     * The ARN for the Redshift application that integrates with IAM Identity Center.
     * </p>
     */
    private String redshiftIdcApplicationArn;
    /**
     * <p>
     * The identity namespace for the Amazon Redshift IAM Identity Center application. It determines which managed
     * application verifies the connection token.
     * </p>
     */
    private String identityNamespace;
    /**
     * <p>
     * The display name for the Amazon Redshift IAM Identity Center application. It appears on the console.
     * </p>
     */
    private String idcDisplayName;
    /**
     * <p>
     * The ARN for the Amazon Redshift IAM Identity Center application. It has the required permissions to be assumed
     * and invoke the IDC Identity Center API.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * The ARN for the Amazon Redshift IAM Identity Center application.
     * </p>
     */
    private String idcManagedApplicationArn;
    /**
     * <p>
     * The onboarding status for the Amazon Redshift IAM Identity Center application.
     * </p>
     */
    private String idcOnboardStatus;
    /**
     * <p>
     * The authorized token issuer list for the Amazon Redshift IAM Identity Center application.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AuthorizedTokenIssuer> authorizedTokenIssuerList;
    /**
     * <p>
     * A list of service integrations for the Redshift IAM Identity Center application.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ServiceIntegrationsUnion> serviceIntegrations;

    /**
     * <p>
     * The ARN for the IAM Identity Center instance that Redshift integrates with.
     * </p>
     * 
     * @param idcInstanceArn
     *        The ARN for the IAM Identity Center instance that Redshift integrates with.
     */

    public void setIdcInstanceArn(String idcInstanceArn) {
        this.idcInstanceArn = idcInstanceArn;
    }

    /**
     * <p>
     * The ARN for the IAM Identity Center instance that Redshift integrates with.
     * </p>
     * 
     * @return The ARN for the IAM Identity Center instance that Redshift integrates with.
     */

    public String getIdcInstanceArn() {
        return this.idcInstanceArn;
    }

    /**
     * <p>
     * The ARN for the IAM Identity Center instance that Redshift integrates with.
     * </p>
     * 
     * @param idcInstanceArn
     *        The ARN for the IAM Identity Center instance that Redshift integrates with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftIdcApplication withIdcInstanceArn(String idcInstanceArn) {
        setIdcInstanceArn(idcInstanceArn);
        return this;
    }

    /**
     * <p>
     * The name of the Redshift application in IAM Identity Center.
     * </p>
     * 
     * @param redshiftIdcApplicationName
     *        The name of the Redshift application in IAM Identity Center.
     */

    public void setRedshiftIdcApplicationName(String redshiftIdcApplicationName) {
        this.redshiftIdcApplicationName = redshiftIdcApplicationName;
    }

    /**
     * <p>
     * The name of the Redshift application in IAM Identity Center.
     * </p>
     * 
     * @return The name of the Redshift application in IAM Identity Center.
     */

    public String getRedshiftIdcApplicationName() {
        return this.redshiftIdcApplicationName;
    }

    /**
     * <p>
     * The name of the Redshift application in IAM Identity Center.
     * </p>
     * 
     * @param redshiftIdcApplicationName
     *        The name of the Redshift application in IAM Identity Center.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftIdcApplication withRedshiftIdcApplicationName(String redshiftIdcApplicationName) {
        setRedshiftIdcApplicationName(redshiftIdcApplicationName);
        return this;
    }

    /**
     * <p>
     * The ARN for the Redshift application that integrates with IAM Identity Center.
     * </p>
     * 
     * @param redshiftIdcApplicationArn
     *        The ARN for the Redshift application that integrates with IAM Identity Center.
     */

    public void setRedshiftIdcApplicationArn(String redshiftIdcApplicationArn) {
        this.redshiftIdcApplicationArn = redshiftIdcApplicationArn;
    }

    /**
     * <p>
     * The ARN for the Redshift application that integrates with IAM Identity Center.
     * </p>
     * 
     * @return The ARN for the Redshift application that integrates with IAM Identity Center.
     */

    public String getRedshiftIdcApplicationArn() {
        return this.redshiftIdcApplicationArn;
    }

    /**
     * <p>
     * The ARN for the Redshift application that integrates with IAM Identity Center.
     * </p>
     * 
     * @param redshiftIdcApplicationArn
     *        The ARN for the Redshift application that integrates with IAM Identity Center.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftIdcApplication withRedshiftIdcApplicationArn(String redshiftIdcApplicationArn) {
        setRedshiftIdcApplicationArn(redshiftIdcApplicationArn);
        return this;
    }

    /**
     * <p>
     * The identity namespace for the Amazon Redshift IAM Identity Center application. It determines which managed
     * application verifies the connection token.
     * </p>
     * 
     * @param identityNamespace
     *        The identity namespace for the Amazon Redshift IAM Identity Center application. It determines which
     *        managed application verifies the connection token.
     */

    public void setIdentityNamespace(String identityNamespace) {
        this.identityNamespace = identityNamespace;
    }

    /**
     * <p>
     * The identity namespace for the Amazon Redshift IAM Identity Center application. It determines which managed
     * application verifies the connection token.
     * </p>
     * 
     * @return The identity namespace for the Amazon Redshift IAM Identity Center application. It determines which
     *         managed application verifies the connection token.
     */

    public String getIdentityNamespace() {
        return this.identityNamespace;
    }

    /**
     * <p>
     * The identity namespace for the Amazon Redshift IAM Identity Center application. It determines which managed
     * application verifies the connection token.
     * </p>
     * 
     * @param identityNamespace
     *        The identity namespace for the Amazon Redshift IAM Identity Center application. It determines which
     *        managed application verifies the connection token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftIdcApplication withIdentityNamespace(String identityNamespace) {
        setIdentityNamespace(identityNamespace);
        return this;
    }

    /**
     * <p>
     * The display name for the Amazon Redshift IAM Identity Center application. It appears on the console.
     * </p>
     * 
     * @param idcDisplayName
     *        The display name for the Amazon Redshift IAM Identity Center application. It appears on the console.
     */

    public void setIdcDisplayName(String idcDisplayName) {
        this.idcDisplayName = idcDisplayName;
    }

    /**
     * <p>
     * The display name for the Amazon Redshift IAM Identity Center application. It appears on the console.
     * </p>
     * 
     * @return The display name for the Amazon Redshift IAM Identity Center application. It appears on the console.
     */

    public String getIdcDisplayName() {
        return this.idcDisplayName;
    }

    /**
     * <p>
     * The display name for the Amazon Redshift IAM Identity Center application. It appears on the console.
     * </p>
     * 
     * @param idcDisplayName
     *        The display name for the Amazon Redshift IAM Identity Center application. It appears on the console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftIdcApplication withIdcDisplayName(String idcDisplayName) {
        setIdcDisplayName(idcDisplayName);
        return this;
    }

    /**
     * <p>
     * The ARN for the Amazon Redshift IAM Identity Center application. It has the required permissions to be assumed
     * and invoke the IDC Identity Center API.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN for the Amazon Redshift IAM Identity Center application. It has the required permissions to be
     *        assumed and invoke the IDC Identity Center API.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The ARN for the Amazon Redshift IAM Identity Center application. It has the required permissions to be assumed
     * and invoke the IDC Identity Center API.
     * </p>
     * 
     * @return The ARN for the Amazon Redshift IAM Identity Center application. It has the required permissions to be
     *         assumed and invoke the IDC Identity Center API.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The ARN for the Amazon Redshift IAM Identity Center application. It has the required permissions to be assumed
     * and invoke the IDC Identity Center API.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN for the Amazon Redshift IAM Identity Center application. It has the required permissions to be
     *        assumed and invoke the IDC Identity Center API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftIdcApplication withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The ARN for the Amazon Redshift IAM Identity Center application.
     * </p>
     * 
     * @param idcManagedApplicationArn
     *        The ARN for the Amazon Redshift IAM Identity Center application.
     */

    public void setIdcManagedApplicationArn(String idcManagedApplicationArn) {
        this.idcManagedApplicationArn = idcManagedApplicationArn;
    }

    /**
     * <p>
     * The ARN for the Amazon Redshift IAM Identity Center application.
     * </p>
     * 
     * @return The ARN for the Amazon Redshift IAM Identity Center application.
     */

    public String getIdcManagedApplicationArn() {
        return this.idcManagedApplicationArn;
    }

    /**
     * <p>
     * The ARN for the Amazon Redshift IAM Identity Center application.
     * </p>
     * 
     * @param idcManagedApplicationArn
     *        The ARN for the Amazon Redshift IAM Identity Center application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftIdcApplication withIdcManagedApplicationArn(String idcManagedApplicationArn) {
        setIdcManagedApplicationArn(idcManagedApplicationArn);
        return this;
    }

    /**
     * <p>
     * The onboarding status for the Amazon Redshift IAM Identity Center application.
     * </p>
     * 
     * @param idcOnboardStatus
     *        The onboarding status for the Amazon Redshift IAM Identity Center application.
     */

    public void setIdcOnboardStatus(String idcOnboardStatus) {
        this.idcOnboardStatus = idcOnboardStatus;
    }

    /**
     * <p>
     * The onboarding status for the Amazon Redshift IAM Identity Center application.
     * </p>
     * 
     * @return The onboarding status for the Amazon Redshift IAM Identity Center application.
     */

    public String getIdcOnboardStatus() {
        return this.idcOnboardStatus;
    }

    /**
     * <p>
     * The onboarding status for the Amazon Redshift IAM Identity Center application.
     * </p>
     * 
     * @param idcOnboardStatus
     *        The onboarding status for the Amazon Redshift IAM Identity Center application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftIdcApplication withIdcOnboardStatus(String idcOnboardStatus) {
        setIdcOnboardStatus(idcOnboardStatus);
        return this;
    }

    /**
     * <p>
     * The authorized token issuer list for the Amazon Redshift IAM Identity Center application.
     * </p>
     * 
     * @return The authorized token issuer list for the Amazon Redshift IAM Identity Center application.
     */

    public java.util.List<AuthorizedTokenIssuer> getAuthorizedTokenIssuerList() {
        if (authorizedTokenIssuerList == null) {
            authorizedTokenIssuerList = new com.amazonaws.internal.SdkInternalList<AuthorizedTokenIssuer>();
        }
        return authorizedTokenIssuerList;
    }

    /**
     * <p>
     * The authorized token issuer list for the Amazon Redshift IAM Identity Center application.
     * </p>
     * 
     * @param authorizedTokenIssuerList
     *        The authorized token issuer list for the Amazon Redshift IAM Identity Center application.
     */

    public void setAuthorizedTokenIssuerList(java.util.Collection<AuthorizedTokenIssuer> authorizedTokenIssuerList) {
        if (authorizedTokenIssuerList == null) {
            this.authorizedTokenIssuerList = null;
            return;
        }

        this.authorizedTokenIssuerList = new com.amazonaws.internal.SdkInternalList<AuthorizedTokenIssuer>(authorizedTokenIssuerList);
    }

    /**
     * <p>
     * The authorized token issuer list for the Amazon Redshift IAM Identity Center application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizedTokenIssuerList(java.util.Collection)} or
     * {@link #withAuthorizedTokenIssuerList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param authorizedTokenIssuerList
     *        The authorized token issuer list for the Amazon Redshift IAM Identity Center application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftIdcApplication withAuthorizedTokenIssuerList(AuthorizedTokenIssuer... authorizedTokenIssuerList) {
        if (this.authorizedTokenIssuerList == null) {
            setAuthorizedTokenIssuerList(new com.amazonaws.internal.SdkInternalList<AuthorizedTokenIssuer>(authorizedTokenIssuerList.length));
        }
        for (AuthorizedTokenIssuer ele : authorizedTokenIssuerList) {
            this.authorizedTokenIssuerList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The authorized token issuer list for the Amazon Redshift IAM Identity Center application.
     * </p>
     * 
     * @param authorizedTokenIssuerList
     *        The authorized token issuer list for the Amazon Redshift IAM Identity Center application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftIdcApplication withAuthorizedTokenIssuerList(java.util.Collection<AuthorizedTokenIssuer> authorizedTokenIssuerList) {
        setAuthorizedTokenIssuerList(authorizedTokenIssuerList);
        return this;
    }

    /**
     * <p>
     * A list of service integrations for the Redshift IAM Identity Center application.
     * </p>
     * 
     * @return A list of service integrations for the Redshift IAM Identity Center application.
     */

    public java.util.List<ServiceIntegrationsUnion> getServiceIntegrations() {
        if (serviceIntegrations == null) {
            serviceIntegrations = new com.amazonaws.internal.SdkInternalList<ServiceIntegrationsUnion>();
        }
        return serviceIntegrations;
    }

    /**
     * <p>
     * A list of service integrations for the Redshift IAM Identity Center application.
     * </p>
     * 
     * @param serviceIntegrations
     *        A list of service integrations for the Redshift IAM Identity Center application.
     */

    public void setServiceIntegrations(java.util.Collection<ServiceIntegrationsUnion> serviceIntegrations) {
        if (serviceIntegrations == null) {
            this.serviceIntegrations = null;
            return;
        }

        this.serviceIntegrations = new com.amazonaws.internal.SdkInternalList<ServiceIntegrationsUnion>(serviceIntegrations);
    }

    /**
     * <p>
     * A list of service integrations for the Redshift IAM Identity Center application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceIntegrations(java.util.Collection)} or {@link #withServiceIntegrations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param serviceIntegrations
     *        A list of service integrations for the Redshift IAM Identity Center application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftIdcApplication withServiceIntegrations(ServiceIntegrationsUnion... serviceIntegrations) {
        if (this.serviceIntegrations == null) {
            setServiceIntegrations(new com.amazonaws.internal.SdkInternalList<ServiceIntegrationsUnion>(serviceIntegrations.length));
        }
        for (ServiceIntegrationsUnion ele : serviceIntegrations) {
            this.serviceIntegrations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of service integrations for the Redshift IAM Identity Center application.
     * </p>
     * 
     * @param serviceIntegrations
     *        A list of service integrations for the Redshift IAM Identity Center application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftIdcApplication withServiceIntegrations(java.util.Collection<ServiceIntegrationsUnion> serviceIntegrations) {
        setServiceIntegrations(serviceIntegrations);
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
        if (getIdcInstanceArn() != null)
            sb.append("IdcInstanceArn: ").append(getIdcInstanceArn()).append(",");
        if (getRedshiftIdcApplicationName() != null)
            sb.append("RedshiftIdcApplicationName: ").append(getRedshiftIdcApplicationName()).append(",");
        if (getRedshiftIdcApplicationArn() != null)
            sb.append("RedshiftIdcApplicationArn: ").append(getRedshiftIdcApplicationArn()).append(",");
        if (getIdentityNamespace() != null)
            sb.append("IdentityNamespace: ").append(getIdentityNamespace()).append(",");
        if (getIdcDisplayName() != null)
            sb.append("IdcDisplayName: ").append(getIdcDisplayName()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getIdcManagedApplicationArn() != null)
            sb.append("IdcManagedApplicationArn: ").append(getIdcManagedApplicationArn()).append(",");
        if (getIdcOnboardStatus() != null)
            sb.append("IdcOnboardStatus: ").append(getIdcOnboardStatus()).append(",");
        if (getAuthorizedTokenIssuerList() != null)
            sb.append("AuthorizedTokenIssuerList: ").append(getAuthorizedTokenIssuerList()).append(",");
        if (getServiceIntegrations() != null)
            sb.append("ServiceIntegrations: ").append(getServiceIntegrations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftIdcApplication == false)
            return false;
        RedshiftIdcApplication other = (RedshiftIdcApplication) obj;
        if (other.getIdcInstanceArn() == null ^ this.getIdcInstanceArn() == null)
            return false;
        if (other.getIdcInstanceArn() != null && other.getIdcInstanceArn().equals(this.getIdcInstanceArn()) == false)
            return false;
        if (other.getRedshiftIdcApplicationName() == null ^ this.getRedshiftIdcApplicationName() == null)
            return false;
        if (other.getRedshiftIdcApplicationName() != null && other.getRedshiftIdcApplicationName().equals(this.getRedshiftIdcApplicationName()) == false)
            return false;
        if (other.getRedshiftIdcApplicationArn() == null ^ this.getRedshiftIdcApplicationArn() == null)
            return false;
        if (other.getRedshiftIdcApplicationArn() != null && other.getRedshiftIdcApplicationArn().equals(this.getRedshiftIdcApplicationArn()) == false)
            return false;
        if (other.getIdentityNamespace() == null ^ this.getIdentityNamespace() == null)
            return false;
        if (other.getIdentityNamespace() != null && other.getIdentityNamespace().equals(this.getIdentityNamespace()) == false)
            return false;
        if (other.getIdcDisplayName() == null ^ this.getIdcDisplayName() == null)
            return false;
        if (other.getIdcDisplayName() != null && other.getIdcDisplayName().equals(this.getIdcDisplayName()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getIdcManagedApplicationArn() == null ^ this.getIdcManagedApplicationArn() == null)
            return false;
        if (other.getIdcManagedApplicationArn() != null && other.getIdcManagedApplicationArn().equals(this.getIdcManagedApplicationArn()) == false)
            return false;
        if (other.getIdcOnboardStatus() == null ^ this.getIdcOnboardStatus() == null)
            return false;
        if (other.getIdcOnboardStatus() != null && other.getIdcOnboardStatus().equals(this.getIdcOnboardStatus()) == false)
            return false;
        if (other.getAuthorizedTokenIssuerList() == null ^ this.getAuthorizedTokenIssuerList() == null)
            return false;
        if (other.getAuthorizedTokenIssuerList() != null && other.getAuthorizedTokenIssuerList().equals(this.getAuthorizedTokenIssuerList()) == false)
            return false;
        if (other.getServiceIntegrations() == null ^ this.getServiceIntegrations() == null)
            return false;
        if (other.getServiceIntegrations() != null && other.getServiceIntegrations().equals(this.getServiceIntegrations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdcInstanceArn() == null) ? 0 : getIdcInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getRedshiftIdcApplicationName() == null) ? 0 : getRedshiftIdcApplicationName().hashCode());
        hashCode = prime * hashCode + ((getRedshiftIdcApplicationArn() == null) ? 0 : getRedshiftIdcApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getIdentityNamespace() == null) ? 0 : getIdentityNamespace().hashCode());
        hashCode = prime * hashCode + ((getIdcDisplayName() == null) ? 0 : getIdcDisplayName().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getIdcManagedApplicationArn() == null) ? 0 : getIdcManagedApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getIdcOnboardStatus() == null) ? 0 : getIdcOnboardStatus().hashCode());
        hashCode = prime * hashCode + ((getAuthorizedTokenIssuerList() == null) ? 0 : getAuthorizedTokenIssuerList().hashCode());
        hashCode = prime * hashCode + ((getServiceIntegrations() == null) ? 0 : getServiceIntegrations().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftIdcApplication clone() {
        try {
            return (RedshiftIdcApplication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
