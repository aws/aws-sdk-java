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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateLakeFormationIdentityCenterConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLakeFormationIdentityCenterConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, view definitions, and other control information to
     * manage your Lake Formation environment.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * A list of Amazon Web Services account IDs or Amazon Web Services organization/organizational unit ARNs that are
     * allowed to access to access data managed by Lake Formation.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> list includes valid values, then the resource share is updated with the
     * principals you want to have access to the resources.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> value is null, both the list of share recipients and the resource share
     * remain unchanged.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> value is an empty list, then the existing share recipients list will be
     * cleared, and the resource share will be deleted.
     * </p>
     */
    private java.util.List<DataLakePrincipal> shareRecipients;
    /**
     * <p>
     * Allows to enable or disable the IAM Identity Center connection.
     * </p>
     */
    private String applicationStatus;
    /**
     * <p>
     * A list of the account IDs of Amazon Web Services accounts of third-party applications that are allowed to access
     * data managed by Lake Formation.
     * </p>
     */
    private ExternalFilteringConfiguration externalFiltering;

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, view definitions, and other control information to
     * manage your Lake Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, view definitions, and other control
     *        information to manage your Lake Formation environment.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, view definitions, and other control information to
     * manage your Lake Formation environment.
     * </p>
     * 
     * @return The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *         metadata store. It contains database definitions, table definitions, view definitions, and other control
     *         information to manage your Lake Formation environment.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, view definitions, and other control information to
     * manage your Lake Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, view definitions, and other control
     *        information to manage your Lake Formation environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLakeFormationIdentityCenterConfigurationRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * A list of Amazon Web Services account IDs or Amazon Web Services organization/organizational unit ARNs that are
     * allowed to access to access data managed by Lake Formation.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> list includes valid values, then the resource share is updated with the
     * principals you want to have access to the resources.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> value is null, both the list of share recipients and the resource share
     * remain unchanged.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> value is an empty list, then the existing share recipients list will be
     * cleared, and the resource share will be deleted.
     * </p>
     * 
     * @return A list of Amazon Web Services account IDs or Amazon Web Services organization/organizational unit ARNs
     *         that are allowed to access to access data managed by Lake Formation. </p>
     *         <p>
     *         If the <code>ShareRecipients</code> list includes valid values, then the resource share is updated with
     *         the principals you want to have access to the resources.
     *         </p>
     *         <p>
     *         If the <code>ShareRecipients</code> value is null, both the list of share recipients and the resource
     *         share remain unchanged.
     *         </p>
     *         <p>
     *         If the <code>ShareRecipients</code> value is an empty list, then the existing share recipients list will
     *         be cleared, and the resource share will be deleted.
     */

    public java.util.List<DataLakePrincipal> getShareRecipients() {
        return shareRecipients;
    }

    /**
     * <p>
     * A list of Amazon Web Services account IDs or Amazon Web Services organization/organizational unit ARNs that are
     * allowed to access to access data managed by Lake Formation.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> list includes valid values, then the resource share is updated with the
     * principals you want to have access to the resources.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> value is null, both the list of share recipients and the resource share
     * remain unchanged.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> value is an empty list, then the existing share recipients list will be
     * cleared, and the resource share will be deleted.
     * </p>
     * 
     * @param shareRecipients
     *        A list of Amazon Web Services account IDs or Amazon Web Services organization/organizational unit ARNs
     *        that are allowed to access to access data managed by Lake Formation. </p>
     *        <p>
     *        If the <code>ShareRecipients</code> list includes valid values, then the resource share is updated with
     *        the principals you want to have access to the resources.
     *        </p>
     *        <p>
     *        If the <code>ShareRecipients</code> value is null, both the list of share recipients and the resource
     *        share remain unchanged.
     *        </p>
     *        <p>
     *        If the <code>ShareRecipients</code> value is an empty list, then the existing share recipients list will
     *        be cleared, and the resource share will be deleted.
     */

    public void setShareRecipients(java.util.Collection<DataLakePrincipal> shareRecipients) {
        if (shareRecipients == null) {
            this.shareRecipients = null;
            return;
        }

        this.shareRecipients = new java.util.ArrayList<DataLakePrincipal>(shareRecipients);
    }

    /**
     * <p>
     * A list of Amazon Web Services account IDs or Amazon Web Services organization/organizational unit ARNs that are
     * allowed to access to access data managed by Lake Formation.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> list includes valid values, then the resource share is updated with the
     * principals you want to have access to the resources.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> value is null, both the list of share recipients and the resource share
     * remain unchanged.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> value is an empty list, then the existing share recipients list will be
     * cleared, and the resource share will be deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setShareRecipients(java.util.Collection)} or {@link #withShareRecipients(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param shareRecipients
     *        A list of Amazon Web Services account IDs or Amazon Web Services organization/organizational unit ARNs
     *        that are allowed to access to access data managed by Lake Formation. </p>
     *        <p>
     *        If the <code>ShareRecipients</code> list includes valid values, then the resource share is updated with
     *        the principals you want to have access to the resources.
     *        </p>
     *        <p>
     *        If the <code>ShareRecipients</code> value is null, both the list of share recipients and the resource
     *        share remain unchanged.
     *        </p>
     *        <p>
     *        If the <code>ShareRecipients</code> value is an empty list, then the existing share recipients list will
     *        be cleared, and the resource share will be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLakeFormationIdentityCenterConfigurationRequest withShareRecipients(DataLakePrincipal... shareRecipients) {
        if (this.shareRecipients == null) {
            setShareRecipients(new java.util.ArrayList<DataLakePrincipal>(shareRecipients.length));
        }
        for (DataLakePrincipal ele : shareRecipients) {
            this.shareRecipients.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon Web Services account IDs or Amazon Web Services organization/organizational unit ARNs that are
     * allowed to access to access data managed by Lake Formation.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> list includes valid values, then the resource share is updated with the
     * principals you want to have access to the resources.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> value is null, both the list of share recipients and the resource share
     * remain unchanged.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> value is an empty list, then the existing share recipients list will be
     * cleared, and the resource share will be deleted.
     * </p>
     * 
     * @param shareRecipients
     *        A list of Amazon Web Services account IDs or Amazon Web Services organization/organizational unit ARNs
     *        that are allowed to access to access data managed by Lake Formation. </p>
     *        <p>
     *        If the <code>ShareRecipients</code> list includes valid values, then the resource share is updated with
     *        the principals you want to have access to the resources.
     *        </p>
     *        <p>
     *        If the <code>ShareRecipients</code> value is null, both the list of share recipients and the resource
     *        share remain unchanged.
     *        </p>
     *        <p>
     *        If the <code>ShareRecipients</code> value is an empty list, then the existing share recipients list will
     *        be cleared, and the resource share will be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLakeFormationIdentityCenterConfigurationRequest withShareRecipients(java.util.Collection<DataLakePrincipal> shareRecipients) {
        setShareRecipients(shareRecipients);
        return this;
    }

    /**
     * <p>
     * Allows to enable or disable the IAM Identity Center connection.
     * </p>
     * 
     * @param applicationStatus
     *        Allows to enable or disable the IAM Identity Center connection.
     * @see ApplicationStatus
     */

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    /**
     * <p>
     * Allows to enable or disable the IAM Identity Center connection.
     * </p>
     * 
     * @return Allows to enable or disable the IAM Identity Center connection.
     * @see ApplicationStatus
     */

    public String getApplicationStatus() {
        return this.applicationStatus;
    }

    /**
     * <p>
     * Allows to enable or disable the IAM Identity Center connection.
     * </p>
     * 
     * @param applicationStatus
     *        Allows to enable or disable the IAM Identity Center connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public UpdateLakeFormationIdentityCenterConfigurationRequest withApplicationStatus(String applicationStatus) {
        setApplicationStatus(applicationStatus);
        return this;
    }

    /**
     * <p>
     * Allows to enable or disable the IAM Identity Center connection.
     * </p>
     * 
     * @param applicationStatus
     *        Allows to enable or disable the IAM Identity Center connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public UpdateLakeFormationIdentityCenterConfigurationRequest withApplicationStatus(ApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus.toString();
        return this;
    }

    /**
     * <p>
     * A list of the account IDs of Amazon Web Services accounts of third-party applications that are allowed to access
     * data managed by Lake Formation.
     * </p>
     * 
     * @param externalFiltering
     *        A list of the account IDs of Amazon Web Services accounts of third-party applications that are allowed to
     *        access data managed by Lake Formation.
     */

    public void setExternalFiltering(ExternalFilteringConfiguration externalFiltering) {
        this.externalFiltering = externalFiltering;
    }

    /**
     * <p>
     * A list of the account IDs of Amazon Web Services accounts of third-party applications that are allowed to access
     * data managed by Lake Formation.
     * </p>
     * 
     * @return A list of the account IDs of Amazon Web Services accounts of third-party applications that are allowed to
     *         access data managed by Lake Formation.
     */

    public ExternalFilteringConfiguration getExternalFiltering() {
        return this.externalFiltering;
    }

    /**
     * <p>
     * A list of the account IDs of Amazon Web Services accounts of third-party applications that are allowed to access
     * data managed by Lake Formation.
     * </p>
     * 
     * @param externalFiltering
     *        A list of the account IDs of Amazon Web Services accounts of third-party applications that are allowed to
     *        access data managed by Lake Formation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLakeFormationIdentityCenterConfigurationRequest withExternalFiltering(ExternalFilteringConfiguration externalFiltering) {
        setExternalFiltering(externalFiltering);
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getShareRecipients() != null)
            sb.append("ShareRecipients: ").append(getShareRecipients()).append(",");
        if (getApplicationStatus() != null)
            sb.append("ApplicationStatus: ").append(getApplicationStatus()).append(",");
        if (getExternalFiltering() != null)
            sb.append("ExternalFiltering: ").append(getExternalFiltering());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLakeFormationIdentityCenterConfigurationRequest == false)
            return false;
        UpdateLakeFormationIdentityCenterConfigurationRequest other = (UpdateLakeFormationIdentityCenterConfigurationRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getShareRecipients() == null ^ this.getShareRecipients() == null)
            return false;
        if (other.getShareRecipients() != null && other.getShareRecipients().equals(this.getShareRecipients()) == false)
            return false;
        if (other.getApplicationStatus() == null ^ this.getApplicationStatus() == null)
            return false;
        if (other.getApplicationStatus() != null && other.getApplicationStatus().equals(this.getApplicationStatus()) == false)
            return false;
        if (other.getExternalFiltering() == null ^ this.getExternalFiltering() == null)
            return false;
        if (other.getExternalFiltering() != null && other.getExternalFiltering().equals(this.getExternalFiltering()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getShareRecipients() == null) ? 0 : getShareRecipients().hashCode());
        hashCode = prime * hashCode + ((getApplicationStatus() == null) ? 0 : getApplicationStatus().hashCode());
        hashCode = prime * hashCode + ((getExternalFiltering() == null) ? 0 : getExternalFiltering().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLakeFormationIdentityCenterConfigurationRequest clone() {
        return (UpdateLakeFormationIdentityCenterConfigurationRequest) super.clone();
    }

}
