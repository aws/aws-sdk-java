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

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DescribeLakeFormationIdentityCenterConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLakeFormationIdentityCenterConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your Lake
     * Formation environment.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lake Formation application integrated with IAM Identity Center.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * Indicates if external filtering is enabled.
     * </p>
     */
    private ExternalFilteringConfiguration externalFiltering;
    /**
     * <p>
     * A list of Amazon Web Services account IDs or Amazon Web Services organization/organizational unit ARNs that are
     * allowed to access data managed by Lake Formation.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> list includes valid values, a resource share is created with the principals
     * you want to have access to the resources as the <code>ShareRecipients</code>.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> value is null or the list is empty, no resource share is created.
     * </p>
     */
    private java.util.List<DataLakePrincipal> shareRecipients;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RAM share.
     * </p>
     */
    private String resourceShare;

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your Lake
     * Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your Lake Formation environment.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your Lake
     * Formation environment.
     * </p>
     * 
     * @return The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *         metadata store. It contains database definitions, table definitions, and other control information to
     *         manage your Lake Formation environment.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your Lake
     * Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your Lake Formation environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLakeFormationIdentityCenterConfigurationResult withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection.
     * </p>
     * 
     * @param instanceArn
     *        The Amazon Resource Name (ARN) of the connection.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the connection.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connection.
     * </p>
     * 
     * @param instanceArn
     *        The Amazon Resource Name (ARN) of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLakeFormationIdentityCenterConfigurationResult withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lake Formation application integrated with IAM Identity Center.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of the Lake Formation application integrated with IAM Identity Center.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lake Formation application integrated with IAM Identity Center.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lake Formation application integrated with IAM Identity Center.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lake Formation application integrated with IAM Identity Center.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of the Lake Formation application integrated with IAM Identity Center.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLakeFormationIdentityCenterConfigurationResult withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * Indicates if external filtering is enabled.
     * </p>
     * 
     * @param externalFiltering
     *        Indicates if external filtering is enabled.
     */

    public void setExternalFiltering(ExternalFilteringConfiguration externalFiltering) {
        this.externalFiltering = externalFiltering;
    }

    /**
     * <p>
     * Indicates if external filtering is enabled.
     * </p>
     * 
     * @return Indicates if external filtering is enabled.
     */

    public ExternalFilteringConfiguration getExternalFiltering() {
        return this.externalFiltering;
    }

    /**
     * <p>
     * Indicates if external filtering is enabled.
     * </p>
     * 
     * @param externalFiltering
     *        Indicates if external filtering is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLakeFormationIdentityCenterConfigurationResult withExternalFiltering(ExternalFilteringConfiguration externalFiltering) {
        setExternalFiltering(externalFiltering);
        return this;
    }

    /**
     * <p>
     * A list of Amazon Web Services account IDs or Amazon Web Services organization/organizational unit ARNs that are
     * allowed to access data managed by Lake Formation.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> list includes valid values, a resource share is created with the principals
     * you want to have access to the resources as the <code>ShareRecipients</code>.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> value is null or the list is empty, no resource share is created.
     * </p>
     * 
     * @return A list of Amazon Web Services account IDs or Amazon Web Services organization/organizational unit ARNs
     *         that are allowed to access data managed by Lake Formation. </p>
     *         <p>
     *         If the <code>ShareRecipients</code> list includes valid values, a resource share is created with the
     *         principals you want to have access to the resources as the <code>ShareRecipients</code>.
     *         </p>
     *         <p>
     *         If the <code>ShareRecipients</code> value is null or the list is empty, no resource share is created.
     */

    public java.util.List<DataLakePrincipal> getShareRecipients() {
        return shareRecipients;
    }

    /**
     * <p>
     * A list of Amazon Web Services account IDs or Amazon Web Services organization/organizational unit ARNs that are
     * allowed to access data managed by Lake Formation.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> list includes valid values, a resource share is created with the principals
     * you want to have access to the resources as the <code>ShareRecipients</code>.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> value is null or the list is empty, no resource share is created.
     * </p>
     * 
     * @param shareRecipients
     *        A list of Amazon Web Services account IDs or Amazon Web Services organization/organizational unit ARNs
     *        that are allowed to access data managed by Lake Formation. </p>
     *        <p>
     *        If the <code>ShareRecipients</code> list includes valid values, a resource share is created with the
     *        principals you want to have access to the resources as the <code>ShareRecipients</code>.
     *        </p>
     *        <p>
     *        If the <code>ShareRecipients</code> value is null or the list is empty, no resource share is created.
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
     * allowed to access data managed by Lake Formation.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> list includes valid values, a resource share is created with the principals
     * you want to have access to the resources as the <code>ShareRecipients</code>.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> value is null or the list is empty, no resource share is created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setShareRecipients(java.util.Collection)} or {@link #withShareRecipients(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param shareRecipients
     *        A list of Amazon Web Services account IDs or Amazon Web Services organization/organizational unit ARNs
     *        that are allowed to access data managed by Lake Formation. </p>
     *        <p>
     *        If the <code>ShareRecipients</code> list includes valid values, a resource share is created with the
     *        principals you want to have access to the resources as the <code>ShareRecipients</code>.
     *        </p>
     *        <p>
     *        If the <code>ShareRecipients</code> value is null or the list is empty, no resource share is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLakeFormationIdentityCenterConfigurationResult withShareRecipients(DataLakePrincipal... shareRecipients) {
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
     * allowed to access data managed by Lake Formation.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> list includes valid values, a resource share is created with the principals
     * you want to have access to the resources as the <code>ShareRecipients</code>.
     * </p>
     * <p>
     * If the <code>ShareRecipients</code> value is null or the list is empty, no resource share is created.
     * </p>
     * 
     * @param shareRecipients
     *        A list of Amazon Web Services account IDs or Amazon Web Services organization/organizational unit ARNs
     *        that are allowed to access data managed by Lake Formation. </p>
     *        <p>
     *        If the <code>ShareRecipients</code> list includes valid values, a resource share is created with the
     *        principals you want to have access to the resources as the <code>ShareRecipients</code>.
     *        </p>
     *        <p>
     *        If the <code>ShareRecipients</code> value is null or the list is empty, no resource share is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLakeFormationIdentityCenterConfigurationResult withShareRecipients(java.util.Collection<DataLakePrincipal> shareRecipients) {
        setShareRecipients(shareRecipients);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RAM share.
     * </p>
     * 
     * @param resourceShare
     *        The Amazon Resource Name (ARN) of the RAM share.
     */

    public void setResourceShare(String resourceShare) {
        this.resourceShare = resourceShare;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RAM share.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the RAM share.
     */

    public String getResourceShare() {
        return this.resourceShare;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RAM share.
     * </p>
     * 
     * @param resourceShare
     *        The Amazon Resource Name (ARN) of the RAM share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLakeFormationIdentityCenterConfigurationResult withResourceShare(String resourceShare) {
        setResourceShare(resourceShare);
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
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getExternalFiltering() != null)
            sb.append("ExternalFiltering: ").append(getExternalFiltering()).append(",");
        if (getShareRecipients() != null)
            sb.append("ShareRecipients: ").append(getShareRecipients()).append(",");
        if (getResourceShare() != null)
            sb.append("ResourceShare: ").append(getResourceShare());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLakeFormationIdentityCenterConfigurationResult == false)
            return false;
        DescribeLakeFormationIdentityCenterConfigurationResult other = (DescribeLakeFormationIdentityCenterConfigurationResult) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getExternalFiltering() == null ^ this.getExternalFiltering() == null)
            return false;
        if (other.getExternalFiltering() != null && other.getExternalFiltering().equals(this.getExternalFiltering()) == false)
            return false;
        if (other.getShareRecipients() == null ^ this.getShareRecipients() == null)
            return false;
        if (other.getShareRecipients() != null && other.getShareRecipients().equals(this.getShareRecipients()) == false)
            return false;
        if (other.getResourceShare() == null ^ this.getResourceShare() == null)
            return false;
        if (other.getResourceShare() != null && other.getResourceShare().equals(this.getResourceShare()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getExternalFiltering() == null) ? 0 : getExternalFiltering().hashCode());
        hashCode = prime * hashCode + ((getShareRecipients() == null) ? 0 : getShareRecipients().hashCode());
        hashCode = prime * hashCode + ((getResourceShare() == null) ? 0 : getResourceShare().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLakeFormationIdentityCenterConfigurationResult clone() {
        try {
            return (DescribeLakeFormationIdentityCenterConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
