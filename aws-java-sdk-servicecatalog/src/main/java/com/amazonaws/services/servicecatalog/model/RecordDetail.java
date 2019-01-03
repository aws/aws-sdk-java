/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/RecordDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the record.
     * </p>
     */
    private String recordId;
    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     */
    private String provisionedProductName;
    /**
     * <p>
     * The status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The request was created but the operation has not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The requested operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is under change but the requested operation failed
     * and some remediation is occurring. For example, a rollback.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The requested operation has successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The requested operation has unsuccessfully completed. Investigate using the error messages
     * returned.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The time when the record was last updated.
     * </p>
     */
    private java.util.Date updatedTime;
    /**
     * <p>
     * The type of provisioned product. The supported values are <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     * </p>
     */
    private String provisionedProductType;
    /**
     * <p>
     * The record type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISION_PRODUCT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_PROVISIONED_PRODUCT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATE_PROVISIONED_PRODUCT</code>
     * </p>
     * </li>
     * </ul>
     */
    private String recordType;
    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     */
    private String provisionedProductId;
    /**
     * <p>
     * The product identifier.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     */
    private String provisioningArtifactId;
    /**
     * <p>
     * The path identifier.
     * </p>
     */
    private String pathId;
    /**
     * <p>
     * The errors that occurred.
     * </p>
     */
    private java.util.List<RecordError> recordErrors;
    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.List<RecordTag> recordTags;

    /**
     * <p>
     * The identifier of the record.
     * </p>
     * 
     * @param recordId
     *        The identifier of the record.
     */

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    /**
     * <p>
     * The identifier of the record.
     * </p>
     * 
     * @return The identifier of the record.
     */

    public String getRecordId() {
        return this.recordId;
    }

    /**
     * <p>
     * The identifier of the record.
     * </p>
     * 
     * @param recordId
     *        The identifier of the record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withRecordId(String recordId) {
        setRecordId(recordId);
        return this;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * 
     * @param provisionedProductName
     *        The user-friendly name of the provisioned product.
     */

    public void setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * 
     * @return The user-friendly name of the provisioned product.
     */

    public String getProvisionedProductName() {
        return this.provisionedProductName;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * 
     * @param provisionedProductName
     *        The user-friendly name of the provisioned product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withProvisionedProductName(String provisionedProductName) {
        setProvisionedProductName(provisionedProductName);
        return this;
    }

    /**
     * <p>
     * The status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The request was created but the operation has not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The requested operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is under change but the requested operation failed
     * and some remediation is occurring. For example, a rollback.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The requested operation has successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The requested operation has unsuccessfully completed. Investigate using the error messages
     * returned.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the provisioned product.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - The request was created but the operation has not started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - The requested operation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is under change but the requested operation
     *        failed and some remediation is occurring. For example, a rollback.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - The requested operation has successfully completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The requested operation has unsuccessfully completed. Investigate using the error
     *        messages returned.
     *        </p>
     *        </li>
     * @see RecordStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The request was created but the operation has not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The requested operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is under change but the requested operation failed
     * and some remediation is occurring. For example, a rollback.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The requested operation has successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The requested operation has unsuccessfully completed. Investigate using the error messages
     * returned.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the provisioned product.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATED</code> - The request was created but the operation has not started.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code> - The requested operation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is under change but the requested operation
     *         failed and some remediation is occurring. For example, a rollback.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code> - The requested operation has successfully completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - The requested operation has unsuccessfully completed. Investigate using the error
     *         messages returned.
     *         </p>
     *         </li>
     * @see RecordStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The request was created but the operation has not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The requested operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is under change but the requested operation failed
     * and some remediation is occurring. For example, a rollback.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The requested operation has successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The requested operation has unsuccessfully completed. Investigate using the error messages
     * returned.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the provisioned product.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - The request was created but the operation has not started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - The requested operation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is under change but the requested operation
     *        failed and some remediation is occurring. For example, a rollback.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - The requested operation has successfully completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The requested operation has unsuccessfully completed. Investigate using the error
     *        messages returned.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordStatus
     */

    public RecordDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The request was created but the operation has not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The requested operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is under change but the requested operation failed
     * and some remediation is occurring. For example, a rollback.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The requested operation has successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The requested operation has unsuccessfully completed. Investigate using the error messages
     * returned.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the provisioned product.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - The request was created but the operation has not started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - The requested operation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is under change but the requested operation
     *        failed and some remediation is occurring. For example, a rollback.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - The requested operation has successfully completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The requested operation has unsuccessfully completed. Investigate using the error
     *        messages returned.
     *        </p>
     *        </li>
     * @see RecordStatus
     */

    public void setStatus(RecordStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The request was created but the operation has not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The requested operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is under change but the requested operation failed
     * and some remediation is occurring. For example, a rollback.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The requested operation has successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The requested operation has unsuccessfully completed. Investigate using the error messages
     * returned.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the provisioned product.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - The request was created but the operation has not started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - The requested operation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is under change but the requested operation
     *        failed and some remediation is occurring. For example, a rollback.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - The requested operation has successfully completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The requested operation has unsuccessfully completed. Investigate using the error
     *        messages returned.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordStatus
     */

    public RecordDetail withStatus(RecordStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC time stamp of the creation time.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * 
     * @return The UTC time stamp of the creation time.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC time stamp of the creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The time when the record was last updated.
     * </p>
     * 
     * @param updatedTime
     *        The time when the record was last updated.
     */

    public void setUpdatedTime(java.util.Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * <p>
     * The time when the record was last updated.
     * </p>
     * 
     * @return The time when the record was last updated.
     */

    public java.util.Date getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * <p>
     * The time when the record was last updated.
     * </p>
     * 
     * @param updatedTime
     *        The time when the record was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withUpdatedTime(java.util.Date updatedTime) {
        setUpdatedTime(updatedTime);
        return this;
    }

    /**
     * <p>
     * The type of provisioned product. The supported values are <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     * </p>
     * 
     * @param provisionedProductType
     *        The type of provisioned product. The supported values are <code>CFN_STACK</code> and
     *        <code>CFN_STACKSET</code>.
     */

    public void setProvisionedProductType(String provisionedProductType) {
        this.provisionedProductType = provisionedProductType;
    }

    /**
     * <p>
     * The type of provisioned product. The supported values are <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     * </p>
     * 
     * @return The type of provisioned product. The supported values are <code>CFN_STACK</code> and
     *         <code>CFN_STACKSET</code>.
     */

    public String getProvisionedProductType() {
        return this.provisionedProductType;
    }

    /**
     * <p>
     * The type of provisioned product. The supported values are <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     * </p>
     * 
     * @param provisionedProductType
     *        The type of provisioned product. The supported values are <code>CFN_STACK</code> and
     *        <code>CFN_STACKSET</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withProvisionedProductType(String provisionedProductType) {
        setProvisionedProductType(provisionedProductType);
        return this;
    }

    /**
     * <p>
     * The record type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISION_PRODUCT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_PROVISIONED_PRODUCT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATE_PROVISIONED_PRODUCT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param recordType
     *        The record type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROVISION_PRODUCT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_PROVISIONED_PRODUCT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TERMINATE_PROVISIONED_PRODUCT</code>
     *        </p>
     *        </li>
     */

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    /**
     * <p>
     * The record type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISION_PRODUCT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_PROVISIONED_PRODUCT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATE_PROVISIONED_PRODUCT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The record type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PROVISION_PRODUCT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_PROVISIONED_PRODUCT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TERMINATE_PROVISIONED_PRODUCT</code>
     *         </p>
     *         </li>
     */

    public String getRecordType() {
        return this.recordType;
    }

    /**
     * <p>
     * The record type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISION_PRODUCT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_PROVISIONED_PRODUCT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATE_PROVISIONED_PRODUCT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param recordType
     *        The record type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROVISION_PRODUCT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_PROVISIONED_PRODUCT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TERMINATE_PROVISIONED_PRODUCT</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withRecordType(String recordType) {
        setRecordType(recordType);
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     * 
     * @param provisionedProductId
     *        The identifier of the provisioned product.
     */

    public void setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     * 
     * @return The identifier of the provisioned product.
     */

    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     * 
     * @param provisionedProductId
     *        The identifier of the provisioned product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withProvisionedProductId(String provisionedProductId) {
        setProvisionedProductId(provisionedProductId);
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @return The product identifier.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact.
     */

    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @return The identifier of the provisioning artifact.
     */

    public String getProvisioningArtifactId() {
        return this.provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The identifier of the provisioning artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withProvisioningArtifactId(String provisioningArtifactId) {
        setProvisioningArtifactId(provisioningArtifactId);
        return this;
    }

    /**
     * <p>
     * The path identifier.
     * </p>
     * 
     * @param pathId
     *        The path identifier.
     */

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    /**
     * <p>
     * The path identifier.
     * </p>
     * 
     * @return The path identifier.
     */

    public String getPathId() {
        return this.pathId;
    }

    /**
     * <p>
     * The path identifier.
     * </p>
     * 
     * @param pathId
     *        The path identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withPathId(String pathId) {
        setPathId(pathId);
        return this;
    }

    /**
     * <p>
     * The errors that occurred.
     * </p>
     * 
     * @return The errors that occurred.
     */

    public java.util.List<RecordError> getRecordErrors() {
        return recordErrors;
    }

    /**
     * <p>
     * The errors that occurred.
     * </p>
     * 
     * @param recordErrors
     *        The errors that occurred.
     */

    public void setRecordErrors(java.util.Collection<RecordError> recordErrors) {
        if (recordErrors == null) {
            this.recordErrors = null;
            return;
        }

        this.recordErrors = new java.util.ArrayList<RecordError>(recordErrors);
    }

    /**
     * <p>
     * The errors that occurred.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecordErrors(java.util.Collection)} or {@link #withRecordErrors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param recordErrors
     *        The errors that occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withRecordErrors(RecordError... recordErrors) {
        if (this.recordErrors == null) {
            setRecordErrors(new java.util.ArrayList<RecordError>(recordErrors.length));
        }
        for (RecordError ele : recordErrors) {
            this.recordErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The errors that occurred.
     * </p>
     * 
     * @param recordErrors
     *        The errors that occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withRecordErrors(java.util.Collection<RecordError> recordErrors) {
        setRecordErrors(recordErrors);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @return One or more tags.
     */

    public java.util.List<RecordTag> getRecordTags() {
        return recordTags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param recordTags
     *        One or more tags.
     */

    public void setRecordTags(java.util.Collection<RecordTag> recordTags) {
        if (recordTags == null) {
            this.recordTags = null;
            return;
        }

        this.recordTags = new java.util.ArrayList<RecordTag>(recordTags);
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecordTags(java.util.Collection)} or {@link #withRecordTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param recordTags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withRecordTags(RecordTag... recordTags) {
        if (this.recordTags == null) {
            setRecordTags(new java.util.ArrayList<RecordTag>(recordTags.length));
        }
        for (RecordTag ele : recordTags) {
            this.recordTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param recordTags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withRecordTags(java.util.Collection<RecordTag> recordTags) {
        setRecordTags(recordTags);
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
        if (getRecordId() != null)
            sb.append("RecordId: ").append(getRecordId()).append(",");
        if (getProvisionedProductName() != null)
            sb.append("ProvisionedProductName: ").append(getProvisionedProductName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getUpdatedTime() != null)
            sb.append("UpdatedTime: ").append(getUpdatedTime()).append(",");
        if (getProvisionedProductType() != null)
            sb.append("ProvisionedProductType: ").append(getProvisionedProductType()).append(",");
        if (getRecordType() != null)
            sb.append("RecordType: ").append(getRecordType()).append(",");
        if (getProvisionedProductId() != null)
            sb.append("ProvisionedProductId: ").append(getProvisionedProductId()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: ").append(getProvisioningArtifactId()).append(",");
        if (getPathId() != null)
            sb.append("PathId: ").append(getPathId()).append(",");
        if (getRecordErrors() != null)
            sb.append("RecordErrors: ").append(getRecordErrors()).append(",");
        if (getRecordTags() != null)
            sb.append("RecordTags: ").append(getRecordTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordDetail == false)
            return false;
        RecordDetail other = (RecordDetail) obj;
        if (other.getRecordId() == null ^ this.getRecordId() == null)
            return false;
        if (other.getRecordId() != null && other.getRecordId().equals(this.getRecordId()) == false)
            return false;
        if (other.getProvisionedProductName() == null ^ this.getProvisionedProductName() == null)
            return false;
        if (other.getProvisionedProductName() != null && other.getProvisionedProductName().equals(this.getProvisionedProductName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getUpdatedTime() == null ^ this.getUpdatedTime() == null)
            return false;
        if (other.getUpdatedTime() != null && other.getUpdatedTime().equals(this.getUpdatedTime()) == false)
            return false;
        if (other.getProvisionedProductType() == null ^ this.getProvisionedProductType() == null)
            return false;
        if (other.getProvisionedProductType() != null && other.getProvisionedProductType().equals(this.getProvisionedProductType()) == false)
            return false;
        if (other.getRecordType() == null ^ this.getRecordType() == null)
            return false;
        if (other.getRecordType() != null && other.getRecordType().equals(this.getRecordType()) == false)
            return false;
        if (other.getProvisionedProductId() == null ^ this.getProvisionedProductId() == null)
            return false;
        if (other.getProvisionedProductId() != null && other.getProvisionedProductId().equals(this.getProvisionedProductId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getPathId() == null ^ this.getPathId() == null)
            return false;
        if (other.getPathId() != null && other.getPathId().equals(this.getPathId()) == false)
            return false;
        if (other.getRecordErrors() == null ^ this.getRecordErrors() == null)
            return false;
        if (other.getRecordErrors() != null && other.getRecordErrors().equals(this.getRecordErrors()) == false)
            return false;
        if (other.getRecordTags() == null ^ this.getRecordTags() == null)
            return false;
        if (other.getRecordTags() != null && other.getRecordTags().equals(this.getRecordTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductName() == null) ? 0 : getProvisionedProductName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductType() == null) ? 0 : getProvisionedProductType().hashCode());
        hashCode = prime * hashCode + ((getRecordType() == null) ? 0 : getRecordType().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductId() == null) ? 0 : getProvisionedProductId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId().hashCode());
        hashCode = prime * hashCode + ((getPathId() == null) ? 0 : getPathId().hashCode());
        hashCode = prime * hashCode + ((getRecordErrors() == null) ? 0 : getRecordErrors().hashCode());
        hashCode = prime * hashCode + ((getRecordTags() == null) ? 0 : getRecordTags().hashCode());
        return hashCode;
    }

    @Override
    public RecordDetail clone() {
        try {
            return (RecordDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.RecordDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
