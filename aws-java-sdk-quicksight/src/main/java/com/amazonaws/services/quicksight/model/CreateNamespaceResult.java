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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateNamespace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNamespaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the QuickSight namespace you created.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the new namespace that you created.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The AWS Region that you want to use for the free SPICE capacity for the new namespace. This is set to the region
     * that you run CreateNamespace in.
     * </p>
     */
    private String capacityRegion;
    /**
     * <p>
     * The status of the creation of the namespace. This is an asynchronous process. A status of <code>CREATED</code>
     * means that your namespace is ready to use. If an error occurs, it indicates if the process is
     * <code>retryable</code> or <code>non-retryable</code>. In the case of a non-retryable error, refer to the error
     * message for follow-up actions.
     * </p>
     */
    private String creationStatus;
    /**
     * <p>
     * Specifies the type of your user identity directory. Currently, this supports users with an identity type of
     * <code>QUICKSIGHT</code>.
     * </p>
     */
    private String identityStore;
    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The ARN of the QuickSight namespace you created.
     * </p>
     * 
     * @param arn
     *        The ARN of the QuickSight namespace you created.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the QuickSight namespace you created.
     * </p>
     * 
     * @return The ARN of the QuickSight namespace you created.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the QuickSight namespace you created.
     * </p>
     * 
     * @param arn
     *        The ARN of the QuickSight namespace you created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNamespaceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the new namespace that you created.
     * </p>
     * 
     * @param name
     *        The name of the new namespace that you created.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new namespace that you created.
     * </p>
     * 
     * @return The name of the new namespace that you created.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new namespace that you created.
     * </p>
     * 
     * @param name
     *        The name of the new namespace that you created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNamespaceResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The AWS Region that you want to use for the free SPICE capacity for the new namespace. This is set to the region
     * that you run CreateNamespace in.
     * </p>
     * 
     * @param capacityRegion
     *        The AWS Region that you want to use for the free SPICE capacity for the new namespace. This is set to the
     *        region that you run CreateNamespace in.
     */

    public void setCapacityRegion(String capacityRegion) {
        this.capacityRegion = capacityRegion;
    }

    /**
     * <p>
     * The AWS Region that you want to use for the free SPICE capacity for the new namespace. This is set to the region
     * that you run CreateNamespace in.
     * </p>
     * 
     * @return The AWS Region that you want to use for the free SPICE capacity for the new namespace. This is set to the
     *         region that you run CreateNamespace in.
     */

    public String getCapacityRegion() {
        return this.capacityRegion;
    }

    /**
     * <p>
     * The AWS Region that you want to use for the free SPICE capacity for the new namespace. This is set to the region
     * that you run CreateNamespace in.
     * </p>
     * 
     * @param capacityRegion
     *        The AWS Region that you want to use for the free SPICE capacity for the new namespace. This is set to the
     *        region that you run CreateNamespace in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNamespaceResult withCapacityRegion(String capacityRegion) {
        setCapacityRegion(capacityRegion);
        return this;
    }

    /**
     * <p>
     * The status of the creation of the namespace. This is an asynchronous process. A status of <code>CREATED</code>
     * means that your namespace is ready to use. If an error occurs, it indicates if the process is
     * <code>retryable</code> or <code>non-retryable</code>. In the case of a non-retryable error, refer to the error
     * message for follow-up actions.
     * </p>
     * 
     * @param creationStatus
     *        The status of the creation of the namespace. This is an asynchronous process. A status of
     *        <code>CREATED</code> means that your namespace is ready to use. If an error occurs, it indicates if the
     *        process is <code>retryable</code> or <code>non-retryable</code>. In the case of a non-retryable error,
     *        refer to the error message for follow-up actions.
     * @see NamespaceStatus
     */

    public void setCreationStatus(String creationStatus) {
        this.creationStatus = creationStatus;
    }

    /**
     * <p>
     * The status of the creation of the namespace. This is an asynchronous process. A status of <code>CREATED</code>
     * means that your namespace is ready to use. If an error occurs, it indicates if the process is
     * <code>retryable</code> or <code>non-retryable</code>. In the case of a non-retryable error, refer to the error
     * message for follow-up actions.
     * </p>
     * 
     * @return The status of the creation of the namespace. This is an asynchronous process. A status of
     *         <code>CREATED</code> means that your namespace is ready to use. If an error occurs, it indicates if the
     *         process is <code>retryable</code> or <code>non-retryable</code>. In the case of a non-retryable error,
     *         refer to the error message for follow-up actions.
     * @see NamespaceStatus
     */

    public String getCreationStatus() {
        return this.creationStatus;
    }

    /**
     * <p>
     * The status of the creation of the namespace. This is an asynchronous process. A status of <code>CREATED</code>
     * means that your namespace is ready to use. If an error occurs, it indicates if the process is
     * <code>retryable</code> or <code>non-retryable</code>. In the case of a non-retryable error, refer to the error
     * message for follow-up actions.
     * </p>
     * 
     * @param creationStatus
     *        The status of the creation of the namespace. This is an asynchronous process. A status of
     *        <code>CREATED</code> means that your namespace is ready to use. If an error occurs, it indicates if the
     *        process is <code>retryable</code> or <code>non-retryable</code>. In the case of a non-retryable error,
     *        refer to the error message for follow-up actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamespaceStatus
     */

    public CreateNamespaceResult withCreationStatus(String creationStatus) {
        setCreationStatus(creationStatus);
        return this;
    }

    /**
     * <p>
     * The status of the creation of the namespace. This is an asynchronous process. A status of <code>CREATED</code>
     * means that your namespace is ready to use. If an error occurs, it indicates if the process is
     * <code>retryable</code> or <code>non-retryable</code>. In the case of a non-retryable error, refer to the error
     * message for follow-up actions.
     * </p>
     * 
     * @param creationStatus
     *        The status of the creation of the namespace. This is an asynchronous process. A status of
     *        <code>CREATED</code> means that your namespace is ready to use. If an error occurs, it indicates if the
     *        process is <code>retryable</code> or <code>non-retryable</code>. In the case of a non-retryable error,
     *        refer to the error message for follow-up actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamespaceStatus
     */

    public CreateNamespaceResult withCreationStatus(NamespaceStatus creationStatus) {
        this.creationStatus = creationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of your user identity directory. Currently, this supports users with an identity type of
     * <code>QUICKSIGHT</code>.
     * </p>
     * 
     * @param identityStore
     *        Specifies the type of your user identity directory. Currently, this supports users with an identity type
     *        of <code>QUICKSIGHT</code>.
     * @see IdentityStore
     */

    public void setIdentityStore(String identityStore) {
        this.identityStore = identityStore;
    }

    /**
     * <p>
     * Specifies the type of your user identity directory. Currently, this supports users with an identity type of
     * <code>QUICKSIGHT</code>.
     * </p>
     * 
     * @return Specifies the type of your user identity directory. Currently, this supports users with an identity type
     *         of <code>QUICKSIGHT</code>.
     * @see IdentityStore
     */

    public String getIdentityStore() {
        return this.identityStore;
    }

    /**
     * <p>
     * Specifies the type of your user identity directory. Currently, this supports users with an identity type of
     * <code>QUICKSIGHT</code>.
     * </p>
     * 
     * @param identityStore
     *        Specifies the type of your user identity directory. Currently, this supports users with an identity type
     *        of <code>QUICKSIGHT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityStore
     */

    public CreateNamespaceResult withIdentityStore(String identityStore) {
        setIdentityStore(identityStore);
        return this;
    }

    /**
     * <p>
     * Specifies the type of your user identity directory. Currently, this supports users with an identity type of
     * <code>QUICKSIGHT</code>.
     * </p>
     * 
     * @param identityStore
     *        Specifies the type of your user identity directory. Currently, this supports users with an identity type
     *        of <code>QUICKSIGHT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityStore
     */

    public CreateNamespaceResult withIdentityStore(IdentityStore identityStore) {
        this.identityStore = identityStore.toString();
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @return The AWS request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNamespaceResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNamespaceResult withStatus(Integer status) {
        setStatus(status);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCapacityRegion() != null)
            sb.append("CapacityRegion: ").append(getCapacityRegion()).append(",");
        if (getCreationStatus() != null)
            sb.append("CreationStatus: ").append(getCreationStatus()).append(",");
        if (getIdentityStore() != null)
            sb.append("IdentityStore: ").append(getIdentityStore()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNamespaceResult == false)
            return false;
        CreateNamespaceResult other = (CreateNamespaceResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCapacityRegion() == null ^ this.getCapacityRegion() == null)
            return false;
        if (other.getCapacityRegion() != null && other.getCapacityRegion().equals(this.getCapacityRegion()) == false)
            return false;
        if (other.getCreationStatus() == null ^ this.getCreationStatus() == null)
            return false;
        if (other.getCreationStatus() != null && other.getCreationStatus().equals(this.getCreationStatus()) == false)
            return false;
        if (other.getIdentityStore() == null ^ this.getIdentityStore() == null)
            return false;
        if (other.getIdentityStore() != null && other.getIdentityStore().equals(this.getIdentityStore()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCapacityRegion() == null) ? 0 : getCapacityRegion().hashCode());
        hashCode = prime * hashCode + ((getCreationStatus() == null) ? 0 : getCreationStatus().hashCode());
        hashCode = prime * hashCode + ((getIdentityStore() == null) ? 0 : getIdentityStore().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateNamespaceResult clone() {
        try {
            return (CreateNamespaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
