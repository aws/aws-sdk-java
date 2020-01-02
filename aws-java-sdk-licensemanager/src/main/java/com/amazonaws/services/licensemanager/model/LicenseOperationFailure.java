/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the failure of a license operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/LicenseOperationFailure"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LicenseOperationFailure implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Error message.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * Failure time.
     * </p>
     */
    private java.util.Date failureTime;
    /**
     * <p>
     * Name of the operation.
     * </p>
     */
    private String operationName;
    /**
     * <p>
     * ID of the AWS account that owns the resource.
     * </p>
     */
    private String resourceOwnerId;
    /**
     * <p>
     * The requester is "License Manager Automated Discovery".
     * </p>
     */
    private String operationRequestedBy;
    /**
     * <p>
     * Reserved.
     * </p>
     */
    private java.util.List<Metadata> metadataList;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param resourceArn
     *        Amazon Resource Name (ARN) of the resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param resourceArn
     *        Amazon Resource Name (ARN) of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseOperationFailure withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Resource type.
     * </p>
     * 
     * @param resourceType
     *        Resource type.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Resource type.
     * </p>
     * 
     * @return Resource type.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Resource type.
     * </p>
     * 
     * @param resourceType
     *        Resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LicenseOperationFailure withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Resource type.
     * </p>
     * 
     * @param resourceType
     *        Resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LicenseOperationFailure withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Error message.
     * </p>
     * 
     * @param errorMessage
     *        Error message.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Error message.
     * </p>
     * 
     * @return Error message.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Error message.
     * </p>
     * 
     * @param errorMessage
     *        Error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseOperationFailure withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * Failure time.
     * </p>
     * 
     * @param failureTime
     *        Failure time.
     */

    public void setFailureTime(java.util.Date failureTime) {
        this.failureTime = failureTime;
    }

    /**
     * <p>
     * Failure time.
     * </p>
     * 
     * @return Failure time.
     */

    public java.util.Date getFailureTime() {
        return this.failureTime;
    }

    /**
     * <p>
     * Failure time.
     * </p>
     * 
     * @param failureTime
     *        Failure time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseOperationFailure withFailureTime(java.util.Date failureTime) {
        setFailureTime(failureTime);
        return this;
    }

    /**
     * <p>
     * Name of the operation.
     * </p>
     * 
     * @param operationName
     *        Name of the operation.
     */

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * <p>
     * Name of the operation.
     * </p>
     * 
     * @return Name of the operation.
     */

    public String getOperationName() {
        return this.operationName;
    }

    /**
     * <p>
     * Name of the operation.
     * </p>
     * 
     * @param operationName
     *        Name of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseOperationFailure withOperationName(String operationName) {
        setOperationName(operationName);
        return this;
    }

    /**
     * <p>
     * ID of the AWS account that owns the resource.
     * </p>
     * 
     * @param resourceOwnerId
     *        ID of the AWS account that owns the resource.
     */

    public void setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
    }

    /**
     * <p>
     * ID of the AWS account that owns the resource.
     * </p>
     * 
     * @return ID of the AWS account that owns the resource.
     */

    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * <p>
     * ID of the AWS account that owns the resource.
     * </p>
     * 
     * @param resourceOwnerId
     *        ID of the AWS account that owns the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseOperationFailure withResourceOwnerId(String resourceOwnerId) {
        setResourceOwnerId(resourceOwnerId);
        return this;
    }

    /**
     * <p>
     * The requester is "License Manager Automated Discovery".
     * </p>
     * 
     * @param operationRequestedBy
     *        The requester is "License Manager Automated Discovery".
     */

    public void setOperationRequestedBy(String operationRequestedBy) {
        this.operationRequestedBy = operationRequestedBy;
    }

    /**
     * <p>
     * The requester is "License Manager Automated Discovery".
     * </p>
     * 
     * @return The requester is "License Manager Automated Discovery".
     */

    public String getOperationRequestedBy() {
        return this.operationRequestedBy;
    }

    /**
     * <p>
     * The requester is "License Manager Automated Discovery".
     * </p>
     * 
     * @param operationRequestedBy
     *        The requester is "License Manager Automated Discovery".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseOperationFailure withOperationRequestedBy(String operationRequestedBy) {
        setOperationRequestedBy(operationRequestedBy);
        return this;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @return Reserved.
     */

    public java.util.List<Metadata> getMetadataList() {
        return metadataList;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param metadataList
     *        Reserved.
     */

    public void setMetadataList(java.util.Collection<Metadata> metadataList) {
        if (metadataList == null) {
            this.metadataList = null;
            return;
        }

        this.metadataList = new java.util.ArrayList<Metadata>(metadataList);
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetadataList(java.util.Collection)} or {@link #withMetadataList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metadataList
     *        Reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseOperationFailure withMetadataList(Metadata... metadataList) {
        if (this.metadataList == null) {
            setMetadataList(new java.util.ArrayList<Metadata>(metadataList.length));
        }
        for (Metadata ele : metadataList) {
            this.metadataList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param metadataList
     *        Reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseOperationFailure withMetadataList(java.util.Collection<Metadata> metadataList) {
        setMetadataList(metadataList);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getFailureTime() != null)
            sb.append("FailureTime: ").append(getFailureTime()).append(",");
        if (getOperationName() != null)
            sb.append("OperationName: ").append(getOperationName()).append(",");
        if (getResourceOwnerId() != null)
            sb.append("ResourceOwnerId: ").append(getResourceOwnerId()).append(",");
        if (getOperationRequestedBy() != null)
            sb.append("OperationRequestedBy: ").append(getOperationRequestedBy()).append(",");
        if (getMetadataList() != null)
            sb.append("MetadataList: ").append(getMetadataList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LicenseOperationFailure == false)
            return false;
        LicenseOperationFailure other = (LicenseOperationFailure) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getFailureTime() == null ^ this.getFailureTime() == null)
            return false;
        if (other.getFailureTime() != null && other.getFailureTime().equals(this.getFailureTime()) == false)
            return false;
        if (other.getOperationName() == null ^ this.getOperationName() == null)
            return false;
        if (other.getOperationName() != null && other.getOperationName().equals(this.getOperationName()) == false)
            return false;
        if (other.getResourceOwnerId() == null ^ this.getResourceOwnerId() == null)
            return false;
        if (other.getResourceOwnerId() != null && other.getResourceOwnerId().equals(this.getResourceOwnerId()) == false)
            return false;
        if (other.getOperationRequestedBy() == null ^ this.getOperationRequestedBy() == null)
            return false;
        if (other.getOperationRequestedBy() != null && other.getOperationRequestedBy().equals(this.getOperationRequestedBy()) == false)
            return false;
        if (other.getMetadataList() == null ^ this.getMetadataList() == null)
            return false;
        if (other.getMetadataList() != null && other.getMetadataList().equals(this.getMetadataList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getFailureTime() == null) ? 0 : getFailureTime().hashCode());
        hashCode = prime * hashCode + ((getOperationName() == null) ? 0 : getOperationName().hashCode());
        hashCode = prime * hashCode + ((getResourceOwnerId() == null) ? 0 : getResourceOwnerId().hashCode());
        hashCode = prime * hashCode + ((getOperationRequestedBy() == null) ? 0 : getOperationRequestedBy().hashCode());
        hashCode = prime * hashCode + ((getMetadataList() == null) ? 0 : getMetadataList().hashCode());
        return hashCode;
    }

    @Override
    public LicenseOperationFailure clone() {
        try {
            return (LicenseOperationFailure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.LicenseOperationFailureMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
