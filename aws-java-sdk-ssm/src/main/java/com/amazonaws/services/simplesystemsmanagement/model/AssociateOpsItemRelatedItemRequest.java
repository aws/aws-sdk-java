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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AssociateOpsItemRelatedItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateOpsItemRelatedItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the OpsItem to which you want to associate a resource as a related item.
     * </p>
     */
    private String opsItemId;
    /**
     * <p>
     * The type of association that you want to create between an OpsItem and a resource. OpsCenter supports
     * <code>IsParentOf</code> and <code>RelatesTo</code> association types.
     * </p>
     */
    private String associationType;
    /**
     * <p>
     * The type of resource that you want to associate with an OpsItem. OpsCenter supports the following types:
     * </p>
     * <p>
     * <code>AWS::SSMIncidents::IncidentRecord</code>: an Incident Manager incident. Incident Manager is a capability of
     * Amazon Web Services Systems Manager.
     * </p>
     * <p>
     * <code>AWS::SSM::Document</code>: a Systems Manager (SSM) document.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services resource that you want to associate with the OpsItem.
     * </p>
     */
    private String resourceUri;

    /**
     * <p>
     * The ID of the OpsItem to which you want to associate a resource as a related item.
     * </p>
     * 
     * @param opsItemId
     *        The ID of the OpsItem to which you want to associate a resource as a related item.
     */

    public void setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem to which you want to associate a resource as a related item.
     * </p>
     * 
     * @return The ID of the OpsItem to which you want to associate a resource as a related item.
     */

    public String getOpsItemId() {
        return this.opsItemId;
    }

    /**
     * <p>
     * The ID of the OpsItem to which you want to associate a resource as a related item.
     * </p>
     * 
     * @param opsItemId
     *        The ID of the OpsItem to which you want to associate a resource as a related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateOpsItemRelatedItemRequest withOpsItemId(String opsItemId) {
        setOpsItemId(opsItemId);
        return this;
    }

    /**
     * <p>
     * The type of association that you want to create between an OpsItem and a resource. OpsCenter supports
     * <code>IsParentOf</code> and <code>RelatesTo</code> association types.
     * </p>
     * 
     * @param associationType
     *        The type of association that you want to create between an OpsItem and a resource. OpsCenter supports
     *        <code>IsParentOf</code> and <code>RelatesTo</code> association types.
     */

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    /**
     * <p>
     * The type of association that you want to create between an OpsItem and a resource. OpsCenter supports
     * <code>IsParentOf</code> and <code>RelatesTo</code> association types.
     * </p>
     * 
     * @return The type of association that you want to create between an OpsItem and a resource. OpsCenter supports
     *         <code>IsParentOf</code> and <code>RelatesTo</code> association types.
     */

    public String getAssociationType() {
        return this.associationType;
    }

    /**
     * <p>
     * The type of association that you want to create between an OpsItem and a resource. OpsCenter supports
     * <code>IsParentOf</code> and <code>RelatesTo</code> association types.
     * </p>
     * 
     * @param associationType
     *        The type of association that you want to create between an OpsItem and a resource. OpsCenter supports
     *        <code>IsParentOf</code> and <code>RelatesTo</code> association types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateOpsItemRelatedItemRequest withAssociationType(String associationType) {
        setAssociationType(associationType);
        return this;
    }

    /**
     * <p>
     * The type of resource that you want to associate with an OpsItem. OpsCenter supports the following types:
     * </p>
     * <p>
     * <code>AWS::SSMIncidents::IncidentRecord</code>: an Incident Manager incident. Incident Manager is a capability of
     * Amazon Web Services Systems Manager.
     * </p>
     * <p>
     * <code>AWS::SSM::Document</code>: a Systems Manager (SSM) document.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that you want to associate with an OpsItem. OpsCenter supports the following
     *        types:</p>
     *        <p>
     *        <code>AWS::SSMIncidents::IncidentRecord</code>: an Incident Manager incident. Incident Manager is a
     *        capability of Amazon Web Services Systems Manager.
     *        </p>
     *        <p>
     *        <code>AWS::SSM::Document</code>: a Systems Manager (SSM) document.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource that you want to associate with an OpsItem. OpsCenter supports the following types:
     * </p>
     * <p>
     * <code>AWS::SSMIncidents::IncidentRecord</code>: an Incident Manager incident. Incident Manager is a capability of
     * Amazon Web Services Systems Manager.
     * </p>
     * <p>
     * <code>AWS::SSM::Document</code>: a Systems Manager (SSM) document.
     * </p>
     * 
     * @return The type of resource that you want to associate with an OpsItem. OpsCenter supports the following
     *         types:</p>
     *         <p>
     *         <code>AWS::SSMIncidents::IncidentRecord</code>: an Incident Manager incident. Incident Manager is a
     *         capability of Amazon Web Services Systems Manager.
     *         </p>
     *         <p>
     *         <code>AWS::SSM::Document</code>: a Systems Manager (SSM) document.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource that you want to associate with an OpsItem. OpsCenter supports the following types:
     * </p>
     * <p>
     * <code>AWS::SSMIncidents::IncidentRecord</code>: an Incident Manager incident. Incident Manager is a capability of
     * Amazon Web Services Systems Manager.
     * </p>
     * <p>
     * <code>AWS::SSM::Document</code>: a Systems Manager (SSM) document.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that you want to associate with an OpsItem. OpsCenter supports the following
     *        types:</p>
     *        <p>
     *        <code>AWS::SSMIncidents::IncidentRecord</code>: an Incident Manager incident. Incident Manager is a
     *        capability of Amazon Web Services Systems Manager.
     *        </p>
     *        <p>
     *        <code>AWS::SSM::Document</code>: a Systems Manager (SSM) document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateOpsItemRelatedItemRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services resource that you want to associate with the OpsItem.
     * </p>
     * 
     * @param resourceUri
     *        The Amazon Resource Name (ARN) of the Amazon Web Services resource that you want to associate with the
     *        OpsItem.
     */

    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services resource that you want to associate with the OpsItem.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Web Services resource that you want to associate with the
     *         OpsItem.
     */

    public String getResourceUri() {
        return this.resourceUri;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services resource that you want to associate with the OpsItem.
     * </p>
     * 
     * @param resourceUri
     *        The Amazon Resource Name (ARN) of the Amazon Web Services resource that you want to associate with the
     *        OpsItem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateOpsItemRelatedItemRequest withResourceUri(String resourceUri) {
        setResourceUri(resourceUri);
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
        if (getOpsItemId() != null)
            sb.append("OpsItemId: ").append(getOpsItemId()).append(",");
        if (getAssociationType() != null)
            sb.append("AssociationType: ").append(getAssociationType()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceUri() != null)
            sb.append("ResourceUri: ").append(getResourceUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateOpsItemRelatedItemRequest == false)
            return false;
        AssociateOpsItemRelatedItemRequest other = (AssociateOpsItemRelatedItemRequest) obj;
        if (other.getOpsItemId() == null ^ this.getOpsItemId() == null)
            return false;
        if (other.getOpsItemId() != null && other.getOpsItemId().equals(this.getOpsItemId()) == false)
            return false;
        if (other.getAssociationType() == null ^ this.getAssociationType() == null)
            return false;
        if (other.getAssociationType() != null && other.getAssociationType().equals(this.getAssociationType()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceUri() == null ^ this.getResourceUri() == null)
            return false;
        if (other.getResourceUri() != null && other.getResourceUri().equals(this.getResourceUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpsItemId() == null) ? 0 : getOpsItemId().hashCode());
        hashCode = prime * hashCode + ((getAssociationType() == null) ? 0 : getAssociationType().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceUri() == null) ? 0 : getResourceUri().hashCode());
        return hashCode;
    }

    @Override
    public AssociateOpsItemRelatedItemRequest clone() {
        return (AssociateOpsItemRelatedItemRequest) super.clone();
    }

}
