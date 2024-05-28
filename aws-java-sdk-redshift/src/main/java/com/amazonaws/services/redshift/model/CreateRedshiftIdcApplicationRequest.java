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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateRedshiftIdcApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRedshiftIdcApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon resource name (ARN) of the IAM Identity Center instance where Amazon Redshift creates a new managed
     * application.
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
     * The namespace for the Amazon Redshift IAM Identity Center application instance. It determines which managed
     * application verifies the connection token.
     * </p>
     */
    private String identityNamespace;
    /**
     * <p>
     * The display name for the Amazon Redshift IAM Identity Center application instance. It appears in the console.
     * </p>
     */
    private String idcDisplayName;
    /**
     * <p>
     * The IAM role ARN for the Amazon Redshift IAM Identity Center application instance. It has the required
     * permissions to be assumed and invoke the IDC Identity Center API.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * The token issuer list for the Amazon Redshift IAM Identity Center application instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AuthorizedTokenIssuer> authorizedTokenIssuerList;
    /**
     * <p>
     * A collection of service integrations for the Redshift IAM Identity Center application.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ServiceIntegrationsUnion> serviceIntegrations;

    /**
     * <p>
     * The Amazon resource name (ARN) of the IAM Identity Center instance where Amazon Redshift creates a new managed
     * application.
     * </p>
     * 
     * @param idcInstanceArn
     *        The Amazon resource name (ARN) of the IAM Identity Center instance where Amazon Redshift creates a new
     *        managed application.
     */

    public void setIdcInstanceArn(String idcInstanceArn) {
        this.idcInstanceArn = idcInstanceArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the IAM Identity Center instance where Amazon Redshift creates a new managed
     * application.
     * </p>
     * 
     * @return The Amazon resource name (ARN) of the IAM Identity Center instance where Amazon Redshift creates a new
     *         managed application.
     */

    public String getIdcInstanceArn() {
        return this.idcInstanceArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of the IAM Identity Center instance where Amazon Redshift creates a new managed
     * application.
     * </p>
     * 
     * @param idcInstanceArn
     *        The Amazon resource name (ARN) of the IAM Identity Center instance where Amazon Redshift creates a new
     *        managed application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRedshiftIdcApplicationRequest withIdcInstanceArn(String idcInstanceArn) {
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

    public CreateRedshiftIdcApplicationRequest withRedshiftIdcApplicationName(String redshiftIdcApplicationName) {
        setRedshiftIdcApplicationName(redshiftIdcApplicationName);
        return this;
    }

    /**
     * <p>
     * The namespace for the Amazon Redshift IAM Identity Center application instance. It determines which managed
     * application verifies the connection token.
     * </p>
     * 
     * @param identityNamespace
     *        The namespace for the Amazon Redshift IAM Identity Center application instance. It determines which
     *        managed application verifies the connection token.
     */

    public void setIdentityNamespace(String identityNamespace) {
        this.identityNamespace = identityNamespace;
    }

    /**
     * <p>
     * The namespace for the Amazon Redshift IAM Identity Center application instance. It determines which managed
     * application verifies the connection token.
     * </p>
     * 
     * @return The namespace for the Amazon Redshift IAM Identity Center application instance. It determines which
     *         managed application verifies the connection token.
     */

    public String getIdentityNamespace() {
        return this.identityNamespace;
    }

    /**
     * <p>
     * The namespace for the Amazon Redshift IAM Identity Center application instance. It determines which managed
     * application verifies the connection token.
     * </p>
     * 
     * @param identityNamespace
     *        The namespace for the Amazon Redshift IAM Identity Center application instance. It determines which
     *        managed application verifies the connection token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRedshiftIdcApplicationRequest withIdentityNamespace(String identityNamespace) {
        setIdentityNamespace(identityNamespace);
        return this;
    }

    /**
     * <p>
     * The display name for the Amazon Redshift IAM Identity Center application instance. It appears in the console.
     * </p>
     * 
     * @param idcDisplayName
     *        The display name for the Amazon Redshift IAM Identity Center application instance. It appears in the
     *        console.
     */

    public void setIdcDisplayName(String idcDisplayName) {
        this.idcDisplayName = idcDisplayName;
    }

    /**
     * <p>
     * The display name for the Amazon Redshift IAM Identity Center application instance. It appears in the console.
     * </p>
     * 
     * @return The display name for the Amazon Redshift IAM Identity Center application instance. It appears in the
     *         console.
     */

    public String getIdcDisplayName() {
        return this.idcDisplayName;
    }

    /**
     * <p>
     * The display name for the Amazon Redshift IAM Identity Center application instance. It appears in the console.
     * </p>
     * 
     * @param idcDisplayName
     *        The display name for the Amazon Redshift IAM Identity Center application instance. It appears in the
     *        console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRedshiftIdcApplicationRequest withIdcDisplayName(String idcDisplayName) {
        setIdcDisplayName(idcDisplayName);
        return this;
    }

    /**
     * <p>
     * The IAM role ARN for the Amazon Redshift IAM Identity Center application instance. It has the required
     * permissions to be assumed and invoke the IDC Identity Center API.
     * </p>
     * 
     * @param iamRoleArn
     *        The IAM role ARN for the Amazon Redshift IAM Identity Center application instance. It has the required
     *        permissions to be assumed and invoke the IDC Identity Center API.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The IAM role ARN for the Amazon Redshift IAM Identity Center application instance. It has the required
     * permissions to be assumed and invoke the IDC Identity Center API.
     * </p>
     * 
     * @return The IAM role ARN for the Amazon Redshift IAM Identity Center application instance. It has the required
     *         permissions to be assumed and invoke the IDC Identity Center API.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The IAM role ARN for the Amazon Redshift IAM Identity Center application instance. It has the required
     * permissions to be assumed and invoke the IDC Identity Center API.
     * </p>
     * 
     * @param iamRoleArn
     *        The IAM role ARN for the Amazon Redshift IAM Identity Center application instance. It has the required
     *        permissions to be assumed and invoke the IDC Identity Center API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRedshiftIdcApplicationRequest withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The token issuer list for the Amazon Redshift IAM Identity Center application instance.
     * </p>
     * 
     * @return The token issuer list for the Amazon Redshift IAM Identity Center application instance.
     */

    public java.util.List<AuthorizedTokenIssuer> getAuthorizedTokenIssuerList() {
        if (authorizedTokenIssuerList == null) {
            authorizedTokenIssuerList = new com.amazonaws.internal.SdkInternalList<AuthorizedTokenIssuer>();
        }
        return authorizedTokenIssuerList;
    }

    /**
     * <p>
     * The token issuer list for the Amazon Redshift IAM Identity Center application instance.
     * </p>
     * 
     * @param authorizedTokenIssuerList
     *        The token issuer list for the Amazon Redshift IAM Identity Center application instance.
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
     * The token issuer list for the Amazon Redshift IAM Identity Center application instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizedTokenIssuerList(java.util.Collection)} or
     * {@link #withAuthorizedTokenIssuerList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param authorizedTokenIssuerList
     *        The token issuer list for the Amazon Redshift IAM Identity Center application instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRedshiftIdcApplicationRequest withAuthorizedTokenIssuerList(AuthorizedTokenIssuer... authorizedTokenIssuerList) {
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
     * The token issuer list for the Amazon Redshift IAM Identity Center application instance.
     * </p>
     * 
     * @param authorizedTokenIssuerList
     *        The token issuer list for the Amazon Redshift IAM Identity Center application instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRedshiftIdcApplicationRequest withAuthorizedTokenIssuerList(java.util.Collection<AuthorizedTokenIssuer> authorizedTokenIssuerList) {
        setAuthorizedTokenIssuerList(authorizedTokenIssuerList);
        return this;
    }

    /**
     * <p>
     * A collection of service integrations for the Redshift IAM Identity Center application.
     * </p>
     * 
     * @return A collection of service integrations for the Redshift IAM Identity Center application.
     */

    public java.util.List<ServiceIntegrationsUnion> getServiceIntegrations() {
        if (serviceIntegrations == null) {
            serviceIntegrations = new com.amazonaws.internal.SdkInternalList<ServiceIntegrationsUnion>();
        }
        return serviceIntegrations;
    }

    /**
     * <p>
     * A collection of service integrations for the Redshift IAM Identity Center application.
     * </p>
     * 
     * @param serviceIntegrations
     *        A collection of service integrations for the Redshift IAM Identity Center application.
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
     * A collection of service integrations for the Redshift IAM Identity Center application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceIntegrations(java.util.Collection)} or {@link #withServiceIntegrations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param serviceIntegrations
     *        A collection of service integrations for the Redshift IAM Identity Center application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRedshiftIdcApplicationRequest withServiceIntegrations(ServiceIntegrationsUnion... serviceIntegrations) {
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
     * A collection of service integrations for the Redshift IAM Identity Center application.
     * </p>
     * 
     * @param serviceIntegrations
     *        A collection of service integrations for the Redshift IAM Identity Center application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRedshiftIdcApplicationRequest withServiceIntegrations(java.util.Collection<ServiceIntegrationsUnion> serviceIntegrations) {
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
        if (getIdentityNamespace() != null)
            sb.append("IdentityNamespace: ").append(getIdentityNamespace()).append(",");
        if (getIdcDisplayName() != null)
            sb.append("IdcDisplayName: ").append(getIdcDisplayName()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
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

        if (obj instanceof CreateRedshiftIdcApplicationRequest == false)
            return false;
        CreateRedshiftIdcApplicationRequest other = (CreateRedshiftIdcApplicationRequest) obj;
        if (other.getIdcInstanceArn() == null ^ this.getIdcInstanceArn() == null)
            return false;
        if (other.getIdcInstanceArn() != null && other.getIdcInstanceArn().equals(this.getIdcInstanceArn()) == false)
            return false;
        if (other.getRedshiftIdcApplicationName() == null ^ this.getRedshiftIdcApplicationName() == null)
            return false;
        if (other.getRedshiftIdcApplicationName() != null && other.getRedshiftIdcApplicationName().equals(this.getRedshiftIdcApplicationName()) == false)
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
        hashCode = prime * hashCode + ((getIdentityNamespace() == null) ? 0 : getIdentityNamespace().hashCode());
        hashCode = prime * hashCode + ((getIdcDisplayName() == null) ? 0 : getIdcDisplayName().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getAuthorizedTokenIssuerList() == null) ? 0 : getAuthorizedTokenIssuerList().hashCode());
        hashCode = prime * hashCode + ((getServiceIntegrations() == null) ? 0 : getServiceIntegrations().hashCode());
        return hashCode;
    }

    @Override
    public CreateRedshiftIdcApplicationRequest clone() {
        return (CreateRedshiftIdcApplicationRequest) super.clone();
    }

}
