/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Used to create a new instruction file, typically used to share an encrypted
 * S3 object with partners via re-encrypting the CEK of the specified S3 object
 * with a partner-specific public key.
 */
public final class PutInstructionFileRequest extends AmazonWebServiceRequest
        implements MaterialsDescriptionProvider, EncryptionMaterialsFactory {
    /**
     * The S3 object id of the respective S3 object to which this instruction
     * file is used.
     */
    private final S3ObjectId s3ObjectId;
    /**
     * Material to be used in the instruction file.
     */
    private final EncryptionMaterials encryptionMaterials;
    /**
     * Material description to be stored in the instruction file; applicable
     * only if {@link #encryptionMaterials} is not specified.
     */
    private final Map<String, String> matDesc;
    /**
     * Suffix to be used for the instruction file. If suffix is null, the
     * default suffix will be used.
     */
    private final String suffix;
    /**
     * An optional pre-configured access control policy to use for the new
     * object. Ignored in favor of accessControlList, if present.
     */
    private CannedAccessControlList cannedAcl;
    /**
     * An optional access control list to apply to the new object. If specified,
     * cannedAcl will be ignored.
     */
    private AccessControlList accessControlList;
    /** The optional redirect location about an object */
    private String redirectLocation;
    /**
     * The optional Amazon S3 storage class to use when storing the new object.
     * If not specified, the default, standard storage class will be used.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     */
    private String storageClass;

    /**
     * @param s3ObjectId
     *            id of the corresponding s3 object.
     * @param matDesc
     *            material description of the instruction file
     * @param suffix
     *            suffix of the instruction file to be put
     */
    public PutInstructionFileRequest(S3ObjectId s3ObjectId,
            Map<String, String> matDesc, String suffix) {
        if (s3ObjectId == null || s3ObjectId instanceof InstructionFileId)
            throw new IllegalArgumentException("Invalid s3 object id");
        if (suffix == null || suffix.trim().isEmpty())
            throw new IllegalArgumentException("suffix must be specified");
        this.s3ObjectId = s3ObjectId;
        @SuppressWarnings("unchecked")
         Map<String,String> md = matDesc == null
             ? Collections.EMPTY_MAP
             : Collections.unmodifiableMap(new HashMap<String, String>(matDesc));
        this.matDesc = md;
        this.suffix = suffix;
        this.encryptionMaterials = null;
    }

    /**
     * @param s3ObjectId
     *            id of the corresponding s3 object.
     * @param encryptionMaterials
     *            encryption materials to be used for the instruction file
     * @param suffix
     *            suffix of the instruction file to be put
     */
    public PutInstructionFileRequest(S3ObjectId s3ObjectId,
            EncryptionMaterials encryptionMaterials, String suffix) {
        if (s3ObjectId == null || s3ObjectId instanceof InstructionFileId)
            throw new IllegalArgumentException("Invalid s3 object id");
        if (suffix == null || suffix.trim().isEmpty())
            throw new IllegalArgumentException("suffix must be specified");
        if (encryptionMaterials == null)
            throw new IllegalArgumentException("encryption materials must be specified");
        this.s3ObjectId = s3ObjectId;
        this.suffix = suffix;
        this.encryptionMaterials = encryptionMaterials;
        this.matDesc = null;
    }

    /**
     * Returns the S3 object id for which the new instruction file will be
     * created.  This is not the instruction file id.
     */
    public S3ObjectId getS3ObjectId() {
        return s3ObjectId;
    }

    /**
     * Returns the material description for the new instruction file.
     */
    @Override
    public Map<String, String> getMaterialsDescription() {
        return matDesc == null
             ? encryptionMaterials.getMaterialsDescription()
             : matDesc
             ;
    }

    /**
     * Returns the encryption materials if specified; or null if not.
     */
    @Override
    public EncryptionMaterials getEncryptionMaterials() {
        return encryptionMaterials;
    }
    /**
     * Returns the suffix for the new instruction file.
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Gets the optional pre-configured access control policy to use for the new
     * object.
     * 
     * @return The optional pre-configured access control policy to use for the
     *         new object.
     * 
     * @see PutObjectRequest#setCannedAcl(CannedAccessControlList)
     * @see PutObjectRequest#withCannedAcl(CannedAccessControlList)
     */
    public CannedAccessControlList getCannedAcl() {
        return cannedAcl;
    }

    /**
     * Sets the optional pre-configured access control policy to use for the new
     * object.
     * 
     * @param cannedAcl
     *            The optional pre-configured access control policy to use for
     *            the new object.
     * 
     * @see PutObjectRequest#getCannedAcl()
     * @see PutObjectRequest#withCannedAcl(CannedAccessControlList)
     */
    public void setCannedAcl(CannedAccessControlList cannedAcl) {
        this.cannedAcl = cannedAcl;
    }

    /**
     * Sets the optional pre-configured access control policy to use for the new
     * object. Returns this {@link PutObjectRequest}, enabling additional method
     * calls to be chained together.
     * 
     * @param cannedAcl
     *            The optional pre-configured access control policy to use for
     *            the new object.
     * 
     * @return This {@link PutObjectRequest}, enabling additional method calls
     *         to be chained together.
     * 
     * @see PutObjectRequest#getCannedAcl()
     * @see PutObjectRequest#setCannedAcl(CannedAccessControlList)
     */
    public PutInstructionFileRequest withCannedAcl(
            CannedAccessControlList cannedAcl) {
        setCannedAcl(cannedAcl);
        return this;
    }

    /**
     * Returns the optional access control list for the new object. If
     * specified, cannedAcl will be ignored.
     */
    public AccessControlList getAccessControlList() {
        return accessControlList;
    }

    /**
     * Sets the optional access control list for the new object. If specified,
     * cannedAcl will be ignored.
     * 
     * @param accessControlList
     *            The access control list for the new object.
     */
    public void setAccessControlList(AccessControlList accessControlList) {
        this.accessControlList = accessControlList;
    }

    /**
     * Sets the optional access control list for the new object. If specified,
     * cannedAcl will be ignored. Returns this {@link PutObjectRequest},
     * enabling additional method calls to be chained together.
     * 
     * @param accessControlList
     *            The access control list for the new object.
     */
    public PutInstructionFileRequest withAccessControlList(
            AccessControlList accessControlList) {
        setAccessControlList(accessControlList);
        return this;
    }

    /**
     * Gets the optional redirect location for the new object.
     */
    public String getRedirectLocation() {
        return this.redirectLocation;
    }

    /**
     * Sets the optional redirect location for the new object.
     * 
     * @param redirectLocation
     *            The redirect location for the new object.
     */
    public void setRedirectLocation(String redirectLocation) {
        this.redirectLocation = redirectLocation;
    }

    /**
     * Sets the optional redirect location for the new object.Returns this
     * {@link PutObjectRequest}, enabling additional method calls to be chained
     * together.
     * 
     * @param redirectLocation
     *            The redirect location for the new object.
     */
    public PutInstructionFileRequest withRedirectLocation(
            String redirectLocation) {
        this.redirectLocation = redirectLocation;
        return this;
    }

    /**
     * Gets the optional Amazon S3 storage class to use when storing the new
     * object. If not specified, the default standard storage class is used when
     * storing the object.
     * <p>
     * For more information on available Amazon S3 storage classes, see the
     * {@link StorageClass} enumeration.
     * </p>
     * 
     * @return The Amazon S3 storage class to use when storing the newly copied
     *         object.
     * 
     * @see #setStorageClass(String)
     * @see #setStorageClass(StorageClass)
     * @see #withStorageClass(StorageClass)
     * @see #withStorageClass(String)
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * Sets the optional Amazon S3 storage class to use when storing the new
     * object. If not specified, the default standard storage class will be used
     * when storing the new object.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     * </p>
     * 
     * @param storageClass
     *            The storage class to use when storing the new object.
     * 
     * @see #getStorageClass()
     * @see #setStorageClass(String)
     * @see #withStorageClass(StorageClass)
     * @see #withStorageClass(String)
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * Sets the optional Amazon S3 storage class to use when storing the new
     * object. Returns this {@link PutObjectRequest}, enabling additional method
     * calls to be chained together. If not specified, the default standard
     * storage class will be used when storing the object.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     * </p>
     * 
     * @param storageClass
     *            The storage class to use when storing the new object.
     * 
     * @return This {@link PutObjectRequest}, enabling additional method calls
     *         to be chained together.
     * 
     * @see #getStorageClass()
     * @see #setStorageClass(StorageClass)
     * @see #setStorageClass(String)
     * @see #withStorageClass(StorageClass)
     */
    public PutInstructionFileRequest withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * Sets the optional Amazon S3 storage class to use when storing the new
     * object. If not specified, the default standard storage class will be used
     * when storing the object.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     * </p>
     * 
     * @param storageClass
     *            The storage class to use when storing the new object.
     * 
     * @see #getStorageClass()
     * @see #setStorageClass(String)
     */
    public void setStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
    }

    /**
     * Sets the optional Amazon S3 storage class to use when storing the new
     * object. Returns this {@link PutObjectRequest}, enabling additional method
     * calls to be chained together. If not specified, the default standard
     * storage class will be used when storing the object.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     * </p>
     * 
     * @param storageClass
     *            The storage class to use when storing the new object.
     * 
     * @return This {@link PutObjectRequest}, enabling additional method calls
     *         to be chained together.
     * 
     * @see #getStorageClass()
     * @see #setStorageClass(StorageClass)
     * @see #setStorageClass(String)
     * @see #withStorageClass(String)
     */
    public PutInstructionFileRequest withStorageClass(StorageClass storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * Creates and returns a {@link PutObjectRequest} for the instruction file
     * with the specified suffix.
     */
    public PutObjectRequest createPutObjectRequest(S3Object s3Object) {
        if (!s3Object.getBucketName().equals(s3ObjectId.getBucket())
        ||  !s3Object.getKey().equals(s3ObjectId.getKey())) {
            throw new IllegalArgumentException("s3Object passed inconsistent with the instruction file being created");
        }
        InstructionFileId ifid= s3ObjectId.instructionFileId(suffix);
//        ObjectMetadata metadata = s3Object.getObjectMetadata();
        return new PutObjectRequest(ifid.getBucket(), ifid.getKey(), redirectLocation)
            .withAccessControlList(accessControlList)
            .withCannedAcl(cannedAcl)
//            .withFile(file)
//            .withInputStream(inputStream)
// don't want the metadata for the new instruction file
//            .withMetadata(metadata == null ? null : metadata.clone())
            .withStorageClass(storageClass)
            .withGeneralProgressListener(getGeneralProgressListener())
            .withRequestMetricCollector(getRequestMetricCollector())
            ;
    }
}
