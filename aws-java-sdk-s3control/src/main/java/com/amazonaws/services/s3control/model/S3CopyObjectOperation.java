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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the configuration parameters for a PUT Copy object operation. Amazon S3 batch operations passes each value
 * through to the underlying PUT Copy object API. For more information about the parameters for this operation, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectCOPY.html">PUT Object - Copy</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/S3CopyObjectOperation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3CopyObjectOperation implements Serializable, Cloneable {

    /** <p/> */
    private String targetResource;
    /** <p/> */
    private String cannedAccessControlList;
    /** <p/> */
    private java.util.List<S3Grant> accessControlGrants;
    /** <p/> */
    private String metadataDirective;
    /** <p/> */
    private java.util.Date modifiedSinceConstraint;
    /** <p/> */
    private S3ObjectMetadata newObjectMetadata;
    /** <p/> */
    private java.util.List<S3Tag> newObjectTagging;
    /** <p/> */
    private String redirectLocation;
    /** <p/> */
    private Boolean requesterPays;
    /** <p/> */
    private String storageClass;
    /** <p/> */
    private java.util.Date unModifiedSinceConstraint;
    /** <p/> */
    private String sSEAwsKmsKeyId;
    /** <p/> */
    private String targetKeyPrefix;
    /** <p/> */
    private String objectLockLegalHoldStatus;
    /** <p/> */
    private String objectLockMode;
    /** <p/> */
    private java.util.Date objectLockRetainUntilDate;

    /**
     * <p/>
     * 
     * @param targetResource
     */

    public void setTargetResource(String targetResource) {
        this.targetResource = targetResource;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getTargetResource() {
        return this.targetResource;
    }

    /**
     * <p/>
     * 
     * @param targetResource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CopyObjectOperation withTargetResource(String targetResource) {
        setTargetResource(targetResource);
        return this;
    }

    /**
     * <p/>
     * 
     * @param cannedAccessControlList
     * @see S3CannedAccessControlList
     */

    public void setCannedAccessControlList(String cannedAccessControlList) {
        this.cannedAccessControlList = cannedAccessControlList;
    }

    /**
     * <p/>
     * 
     * @return
     * @see S3CannedAccessControlList
     */

    public String getCannedAccessControlList() {
        return this.cannedAccessControlList;
    }

    /**
     * <p/>
     * 
     * @param cannedAccessControlList
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3CannedAccessControlList
     */

    public S3CopyObjectOperation withCannedAccessControlList(String cannedAccessControlList) {
        setCannedAccessControlList(cannedAccessControlList);
        return this;
    }

    /**
     * <p/>
     * 
     * @param cannedAccessControlList
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3CannedAccessControlList
     */

    public S3CopyObjectOperation withCannedAccessControlList(S3CannedAccessControlList cannedAccessControlList) {
        this.cannedAccessControlList = cannedAccessControlList.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<S3Grant> getAccessControlGrants() {
        return accessControlGrants;
    }

    /**
     * <p/>
     * 
     * @param accessControlGrants
     */

    public void setAccessControlGrants(java.util.Collection<S3Grant> accessControlGrants) {
        if (accessControlGrants == null) {
            this.accessControlGrants = null;
            return;
        }

        this.accessControlGrants = new java.util.ArrayList<S3Grant>(accessControlGrants);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessControlGrants(java.util.Collection)} or {@link #withAccessControlGrants(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param accessControlGrants
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CopyObjectOperation withAccessControlGrants(S3Grant... accessControlGrants) {
        if (this.accessControlGrants == null) {
            setAccessControlGrants(new java.util.ArrayList<S3Grant>(accessControlGrants.length));
        }
        for (S3Grant ele : accessControlGrants) {
            this.accessControlGrants.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param accessControlGrants
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CopyObjectOperation withAccessControlGrants(java.util.Collection<S3Grant> accessControlGrants) {
        setAccessControlGrants(accessControlGrants);
        return this;
    }

    /**
     * <p/>
     * 
     * @param metadataDirective
     * @see S3MetadataDirective
     */

    public void setMetadataDirective(String metadataDirective) {
        this.metadataDirective = metadataDirective;
    }

    /**
     * <p/>
     * 
     * @return
     * @see S3MetadataDirective
     */

    public String getMetadataDirective() {
        return this.metadataDirective;
    }

    /**
     * <p/>
     * 
     * @param metadataDirective
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3MetadataDirective
     */

    public S3CopyObjectOperation withMetadataDirective(String metadataDirective) {
        setMetadataDirective(metadataDirective);
        return this;
    }

    /**
     * <p/>
     * 
     * @param metadataDirective
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3MetadataDirective
     */

    public S3CopyObjectOperation withMetadataDirective(S3MetadataDirective metadataDirective) {
        this.metadataDirective = metadataDirective.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param modifiedSinceConstraint
     */

    public void setModifiedSinceConstraint(java.util.Date modifiedSinceConstraint) {
        this.modifiedSinceConstraint = modifiedSinceConstraint;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Date getModifiedSinceConstraint() {
        return this.modifiedSinceConstraint;
    }

    /**
     * <p/>
     * 
     * @param modifiedSinceConstraint
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CopyObjectOperation withModifiedSinceConstraint(java.util.Date modifiedSinceConstraint) {
        setModifiedSinceConstraint(modifiedSinceConstraint);
        return this;
    }

    /**
     * <p/>
     * 
     * @param newObjectMetadata
     */

    public void setNewObjectMetadata(S3ObjectMetadata newObjectMetadata) {
        this.newObjectMetadata = newObjectMetadata;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public S3ObjectMetadata getNewObjectMetadata() {
        return this.newObjectMetadata;
    }

    /**
     * <p/>
     * 
     * @param newObjectMetadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CopyObjectOperation withNewObjectMetadata(S3ObjectMetadata newObjectMetadata) {
        setNewObjectMetadata(newObjectMetadata);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<S3Tag> getNewObjectTagging() {
        return newObjectTagging;
    }

    /**
     * <p/>
     * 
     * @param newObjectTagging
     */

    public void setNewObjectTagging(java.util.Collection<S3Tag> newObjectTagging) {
        if (newObjectTagging == null) {
            this.newObjectTagging = null;
            return;
        }

        this.newObjectTagging = new java.util.ArrayList<S3Tag>(newObjectTagging);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNewObjectTagging(java.util.Collection)} or {@link #withNewObjectTagging(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param newObjectTagging
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CopyObjectOperation withNewObjectTagging(S3Tag... newObjectTagging) {
        if (this.newObjectTagging == null) {
            setNewObjectTagging(new java.util.ArrayList<S3Tag>(newObjectTagging.length));
        }
        for (S3Tag ele : newObjectTagging) {
            this.newObjectTagging.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param newObjectTagging
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CopyObjectOperation withNewObjectTagging(java.util.Collection<S3Tag> newObjectTagging) {
        setNewObjectTagging(newObjectTagging);
        return this;
    }

    /**
     * <p/>
     * 
     * @param redirectLocation
     */

    public void setRedirectLocation(String redirectLocation) {
        this.redirectLocation = redirectLocation;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getRedirectLocation() {
        return this.redirectLocation;
    }

    /**
     * <p/>
     * 
     * @param redirectLocation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CopyObjectOperation withRedirectLocation(String redirectLocation) {
        setRedirectLocation(redirectLocation);
        return this;
    }

    /**
     * <p/>
     * 
     * @param requesterPays
     */

    public void setRequesterPays(Boolean requesterPays) {
        this.requesterPays = requesterPays;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean getRequesterPays() {
        return this.requesterPays;
    }

    /**
     * <p/>
     * 
     * @param requesterPays
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CopyObjectOperation withRequesterPays(Boolean requesterPays) {
        setRequesterPays(requesterPays);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean isRequesterPays() {
        return this.requesterPays;
    }

    /**
     * <p/>
     * 
     * @param storageClass
     * @see S3StorageClass
     */

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p/>
     * 
     * @return
     * @see S3StorageClass
     */

    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * <p/>
     * 
     * @param storageClass
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3StorageClass
     */

    public S3CopyObjectOperation withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * <p/>
     * 
     * @param storageClass
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3StorageClass
     */

    public S3CopyObjectOperation withStorageClass(S3StorageClass storageClass) {
        this.storageClass = storageClass.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param unModifiedSinceConstraint
     */

    public void setUnModifiedSinceConstraint(java.util.Date unModifiedSinceConstraint) {
        this.unModifiedSinceConstraint = unModifiedSinceConstraint;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Date getUnModifiedSinceConstraint() {
        return this.unModifiedSinceConstraint;
    }

    /**
     * <p/>
     * 
     * @param unModifiedSinceConstraint
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CopyObjectOperation withUnModifiedSinceConstraint(java.util.Date unModifiedSinceConstraint) {
        setUnModifiedSinceConstraint(unModifiedSinceConstraint);
        return this;
    }

    /**
     * <p/>
     * 
     * @param sSEAwsKmsKeyId
     */

    public void setSSEAwsKmsKeyId(String sSEAwsKmsKeyId) {
        this.sSEAwsKmsKeyId = sSEAwsKmsKeyId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getSSEAwsKmsKeyId() {
        return this.sSEAwsKmsKeyId;
    }

    /**
     * <p/>
     * 
     * @param sSEAwsKmsKeyId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CopyObjectOperation withSSEAwsKmsKeyId(String sSEAwsKmsKeyId) {
        setSSEAwsKmsKeyId(sSEAwsKmsKeyId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param targetKeyPrefix
     */

    public void setTargetKeyPrefix(String targetKeyPrefix) {
        this.targetKeyPrefix = targetKeyPrefix;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getTargetKeyPrefix() {
        return this.targetKeyPrefix;
    }

    /**
     * <p/>
     * 
     * @param targetKeyPrefix
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CopyObjectOperation withTargetKeyPrefix(String targetKeyPrefix) {
        setTargetKeyPrefix(targetKeyPrefix);
        return this;
    }

    /**
     * <p/>
     * 
     * @param objectLockLegalHoldStatus
     * @see S3ObjectLockLegalHoldStatus
     */

    public void setObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
    }

    /**
     * <p/>
     * 
     * @return
     * @see S3ObjectLockLegalHoldStatus
     */

    public String getObjectLockLegalHoldStatus() {
        return this.objectLockLegalHoldStatus;
    }

    /**
     * <p/>
     * 
     * @param objectLockLegalHoldStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3ObjectLockLegalHoldStatus
     */

    public S3CopyObjectOperation withObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        setObjectLockLegalHoldStatus(objectLockLegalHoldStatus);
        return this;
    }

    /**
     * <p/>
     * 
     * @param objectLockLegalHoldStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3ObjectLockLegalHoldStatus
     */

    public S3CopyObjectOperation withObjectLockLegalHoldStatus(S3ObjectLockLegalHoldStatus objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param objectLockMode
     * @see S3ObjectLockMode
     */

    public void setObjectLockMode(String objectLockMode) {
        this.objectLockMode = objectLockMode;
    }

    /**
     * <p/>
     * 
     * @return
     * @see S3ObjectLockMode
     */

    public String getObjectLockMode() {
        return this.objectLockMode;
    }

    /**
     * <p/>
     * 
     * @param objectLockMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3ObjectLockMode
     */

    public S3CopyObjectOperation withObjectLockMode(String objectLockMode) {
        setObjectLockMode(objectLockMode);
        return this;
    }

    /**
     * <p/>
     * 
     * @param objectLockMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3ObjectLockMode
     */

    public S3CopyObjectOperation withObjectLockMode(S3ObjectLockMode objectLockMode) {
        this.objectLockMode = objectLockMode.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param objectLockRetainUntilDate
     */

    public void setObjectLockRetainUntilDate(java.util.Date objectLockRetainUntilDate) {
        this.objectLockRetainUntilDate = objectLockRetainUntilDate;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Date getObjectLockRetainUntilDate() {
        return this.objectLockRetainUntilDate;
    }

    /**
     * <p/>
     * 
     * @param objectLockRetainUntilDate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CopyObjectOperation withObjectLockRetainUntilDate(java.util.Date objectLockRetainUntilDate) {
        setObjectLockRetainUntilDate(objectLockRetainUntilDate);
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
        if (getTargetResource() != null)
            sb.append("TargetResource: ").append(getTargetResource()).append(",");
        if (getCannedAccessControlList() != null)
            sb.append("CannedAccessControlList: ").append(getCannedAccessControlList()).append(",");
        if (getAccessControlGrants() != null)
            sb.append("AccessControlGrants: ").append(getAccessControlGrants()).append(",");
        if (getMetadataDirective() != null)
            sb.append("MetadataDirective: ").append(getMetadataDirective()).append(",");
        if (getModifiedSinceConstraint() != null)
            sb.append("ModifiedSinceConstraint: ").append(getModifiedSinceConstraint()).append(",");
        if (getNewObjectMetadata() != null)
            sb.append("NewObjectMetadata: ").append(getNewObjectMetadata()).append(",");
        if (getNewObjectTagging() != null)
            sb.append("NewObjectTagging: ").append(getNewObjectTagging()).append(",");
        if (getRedirectLocation() != null)
            sb.append("RedirectLocation: ").append(getRedirectLocation()).append(",");
        if (getRequesterPays() != null)
            sb.append("RequesterPays: ").append(getRequesterPays()).append(",");
        if (getStorageClass() != null)
            sb.append("StorageClass: ").append(getStorageClass()).append(",");
        if (getUnModifiedSinceConstraint() != null)
            sb.append("UnModifiedSinceConstraint: ").append(getUnModifiedSinceConstraint()).append(",");
        if (getSSEAwsKmsKeyId() != null)
            sb.append("SSEAwsKmsKeyId: ").append(getSSEAwsKmsKeyId()).append(",");
        if (getTargetKeyPrefix() != null)
            sb.append("TargetKeyPrefix: ").append(getTargetKeyPrefix()).append(",");
        if (getObjectLockLegalHoldStatus() != null)
            sb.append("ObjectLockLegalHoldStatus: ").append(getObjectLockLegalHoldStatus()).append(",");
        if (getObjectLockMode() != null)
            sb.append("ObjectLockMode: ").append(getObjectLockMode()).append(",");
        if (getObjectLockRetainUntilDate() != null)
            sb.append("ObjectLockRetainUntilDate: ").append(getObjectLockRetainUntilDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3CopyObjectOperation == false)
            return false;
        S3CopyObjectOperation other = (S3CopyObjectOperation) obj;
        if (other.getTargetResource() == null ^ this.getTargetResource() == null)
            return false;
        if (other.getTargetResource() != null && other.getTargetResource().equals(this.getTargetResource()) == false)
            return false;
        if (other.getCannedAccessControlList() == null ^ this.getCannedAccessControlList() == null)
            return false;
        if (other.getCannedAccessControlList() != null && other.getCannedAccessControlList().equals(this.getCannedAccessControlList()) == false)
            return false;
        if (other.getAccessControlGrants() == null ^ this.getAccessControlGrants() == null)
            return false;
        if (other.getAccessControlGrants() != null && other.getAccessControlGrants().equals(this.getAccessControlGrants()) == false)
            return false;
        if (other.getMetadataDirective() == null ^ this.getMetadataDirective() == null)
            return false;
        if (other.getMetadataDirective() != null && other.getMetadataDirective().equals(this.getMetadataDirective()) == false)
            return false;
        if (other.getModifiedSinceConstraint() == null ^ this.getModifiedSinceConstraint() == null)
            return false;
        if (other.getModifiedSinceConstraint() != null && other.getModifiedSinceConstraint().equals(this.getModifiedSinceConstraint()) == false)
            return false;
        if (other.getNewObjectMetadata() == null ^ this.getNewObjectMetadata() == null)
            return false;
        if (other.getNewObjectMetadata() != null && other.getNewObjectMetadata().equals(this.getNewObjectMetadata()) == false)
            return false;
        if (other.getNewObjectTagging() == null ^ this.getNewObjectTagging() == null)
            return false;
        if (other.getNewObjectTagging() != null && other.getNewObjectTagging().equals(this.getNewObjectTagging()) == false)
            return false;
        if (other.getRedirectLocation() == null ^ this.getRedirectLocation() == null)
            return false;
        if (other.getRedirectLocation() != null && other.getRedirectLocation().equals(this.getRedirectLocation()) == false)
            return false;
        if (other.getRequesterPays() == null ^ this.getRequesterPays() == null)
            return false;
        if (other.getRequesterPays() != null && other.getRequesterPays().equals(this.getRequesterPays()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        if (other.getUnModifiedSinceConstraint() == null ^ this.getUnModifiedSinceConstraint() == null)
            return false;
        if (other.getUnModifiedSinceConstraint() != null && other.getUnModifiedSinceConstraint().equals(this.getUnModifiedSinceConstraint()) == false)
            return false;
        if (other.getSSEAwsKmsKeyId() == null ^ this.getSSEAwsKmsKeyId() == null)
            return false;
        if (other.getSSEAwsKmsKeyId() != null && other.getSSEAwsKmsKeyId().equals(this.getSSEAwsKmsKeyId()) == false)
            return false;
        if (other.getTargetKeyPrefix() == null ^ this.getTargetKeyPrefix() == null)
            return false;
        if (other.getTargetKeyPrefix() != null && other.getTargetKeyPrefix().equals(this.getTargetKeyPrefix()) == false)
            return false;
        if (other.getObjectLockLegalHoldStatus() == null ^ this.getObjectLockLegalHoldStatus() == null)
            return false;
        if (other.getObjectLockLegalHoldStatus() != null && other.getObjectLockLegalHoldStatus().equals(this.getObjectLockLegalHoldStatus()) == false)
            return false;
        if (other.getObjectLockMode() == null ^ this.getObjectLockMode() == null)
            return false;
        if (other.getObjectLockMode() != null && other.getObjectLockMode().equals(this.getObjectLockMode()) == false)
            return false;
        if (other.getObjectLockRetainUntilDate() == null ^ this.getObjectLockRetainUntilDate() == null)
            return false;
        if (other.getObjectLockRetainUntilDate() != null && other.getObjectLockRetainUntilDate().equals(this.getObjectLockRetainUntilDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetResource() == null) ? 0 : getTargetResource().hashCode());
        hashCode = prime * hashCode + ((getCannedAccessControlList() == null) ? 0 : getCannedAccessControlList().hashCode());
        hashCode = prime * hashCode + ((getAccessControlGrants() == null) ? 0 : getAccessControlGrants().hashCode());
        hashCode = prime * hashCode + ((getMetadataDirective() == null) ? 0 : getMetadataDirective().hashCode());
        hashCode = prime * hashCode + ((getModifiedSinceConstraint() == null) ? 0 : getModifiedSinceConstraint().hashCode());
        hashCode = prime * hashCode + ((getNewObjectMetadata() == null) ? 0 : getNewObjectMetadata().hashCode());
        hashCode = prime * hashCode + ((getNewObjectTagging() == null) ? 0 : getNewObjectTagging().hashCode());
        hashCode = prime * hashCode + ((getRedirectLocation() == null) ? 0 : getRedirectLocation().hashCode());
        hashCode = prime * hashCode + ((getRequesterPays() == null) ? 0 : getRequesterPays().hashCode());
        hashCode = prime * hashCode + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        hashCode = prime * hashCode + ((getUnModifiedSinceConstraint() == null) ? 0 : getUnModifiedSinceConstraint().hashCode());
        hashCode = prime * hashCode + ((getSSEAwsKmsKeyId() == null) ? 0 : getSSEAwsKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTargetKeyPrefix() == null) ? 0 : getTargetKeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getObjectLockLegalHoldStatus() == null) ? 0 : getObjectLockLegalHoldStatus().hashCode());
        hashCode = prime * hashCode + ((getObjectLockMode() == null) ? 0 : getObjectLockMode().hashCode());
        hashCode = prime * hashCode + ((getObjectLockRetainUntilDate() == null) ? 0 : getObjectLockRetainUntilDate().hashCode());
        return hashCode;
    }

    @Override
    public S3CopyObjectOperation clone() {
        try {
            return (S3CopyObjectOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
