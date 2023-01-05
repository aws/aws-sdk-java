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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an <code>ApiAssociation</code> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ApiAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApiAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The domain name.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The API ID.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * Identifies the status of an association.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PROCESSING</b>: The API association is being created. You cannot modify association requests during
     * processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The API association was successful. You can modify associations after success.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED</b>: The API association has failed. You can modify associations after failure.
     * </p>
     * </li>
     * </ul>
     */
    private String associationStatus;
    /**
     * <p>
     * Details about the last deployment status.
     * </p>
     */
    private String deploymentDetail;

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @param domainName
     *        The domain name.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @return The domain name.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @param domainName
     *        The domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiAssociation withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @param apiId
     *        The API ID.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @return The API ID.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @param apiId
     *        The API ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiAssociation withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * Identifies the status of an association.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PROCESSING</b>: The API association is being created. You cannot modify association requests during
     * processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The API association was successful. You can modify associations after success.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED</b>: The API association has failed. You can modify associations after failure.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associationStatus
     *        Identifies the status of an association.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PROCESSING</b>: The API association is being created. You cannot modify association requests during
     *        processing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SUCCESS</b>: The API association was successful. You can modify associations after success.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAILED</b>: The API association has failed. You can modify associations after failure.
     *        </p>
     *        </li>
     * @see AssociationStatus
     */

    public void setAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
    }

    /**
     * <p>
     * Identifies the status of an association.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PROCESSING</b>: The API association is being created. You cannot modify association requests during
     * processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The API association was successful. You can modify associations after success.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED</b>: The API association has failed. You can modify associations after failure.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Identifies the status of an association.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>PROCESSING</b>: The API association is being created. You cannot modify association requests during
     *         processing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SUCCESS</b>: The API association was successful. You can modify associations after success.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FAILED</b>: The API association has failed. You can modify associations after failure.
     *         </p>
     *         </li>
     * @see AssociationStatus
     */

    public String getAssociationStatus() {
        return this.associationStatus;
    }

    /**
     * <p>
     * Identifies the status of an association.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PROCESSING</b>: The API association is being created. You cannot modify association requests during
     * processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The API association was successful. You can modify associations after success.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED</b>: The API association has failed. You can modify associations after failure.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associationStatus
     *        Identifies the status of an association.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PROCESSING</b>: The API association is being created. You cannot modify association requests during
     *        processing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SUCCESS</b>: The API association was successful. You can modify associations after success.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAILED</b>: The API association has failed. You can modify associations after failure.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationStatus
     */

    public ApiAssociation withAssociationStatus(String associationStatus) {
        setAssociationStatus(associationStatus);
        return this;
    }

    /**
     * <p>
     * Identifies the status of an association.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PROCESSING</b>: The API association is being created. You cannot modify association requests during
     * processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The API association was successful. You can modify associations after success.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED</b>: The API association has failed. You can modify associations after failure.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associationStatus
     *        Identifies the status of an association.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PROCESSING</b>: The API association is being created. You cannot modify association requests during
     *        processing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SUCCESS</b>: The API association was successful. You can modify associations after success.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAILED</b>: The API association has failed. You can modify associations after failure.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationStatus
     */

    public ApiAssociation withAssociationStatus(AssociationStatus associationStatus) {
        this.associationStatus = associationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Details about the last deployment status.
     * </p>
     * 
     * @param deploymentDetail
     *        Details about the last deployment status.
     */

    public void setDeploymentDetail(String deploymentDetail) {
        this.deploymentDetail = deploymentDetail;
    }

    /**
     * <p>
     * Details about the last deployment status.
     * </p>
     * 
     * @return Details about the last deployment status.
     */

    public String getDeploymentDetail() {
        return this.deploymentDetail;
    }

    /**
     * <p>
     * Details about the last deployment status.
     * </p>
     * 
     * @param deploymentDetail
     *        Details about the last deployment status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiAssociation withDeploymentDetail(String deploymentDetail) {
        setDeploymentDetail(deploymentDetail);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getAssociationStatus() != null)
            sb.append("AssociationStatus: ").append(getAssociationStatus()).append(",");
        if (getDeploymentDetail() != null)
            sb.append("DeploymentDetail: ").append(getDeploymentDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApiAssociation == false)
            return false;
        ApiAssociation other = (ApiAssociation) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getAssociationStatus() == null ^ this.getAssociationStatus() == null)
            return false;
        if (other.getAssociationStatus() != null && other.getAssociationStatus().equals(this.getAssociationStatus()) == false)
            return false;
        if (other.getDeploymentDetail() == null ^ this.getDeploymentDetail() == null)
            return false;
        if (other.getDeploymentDetail() != null && other.getDeploymentDetail().equals(this.getDeploymentDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getAssociationStatus() == null) ? 0 : getAssociationStatus().hashCode());
        hashCode = prime * hashCode + ((getDeploymentDetail() == null) ? 0 : getDeploymentDetail().hashCode());
        return hashCode;
    }

    @Override
    public ApiAssociation clone() {
        try {
            return (ApiAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.ApiAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
