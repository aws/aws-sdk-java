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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.event.ProgressListener;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * Abstract base class for a put object or put object like request.
 */
public abstract class AbstractPutObjectRequest extends AmazonWebServiceRequest implements
        Cloneable, SSECustomerKeyProvider, SSEAwsKeyManagementParamsProvider, S3DataSource, Serializable {
    /**
     * The name of an existing bucket, to which this request will upload a new
     * object. You must have {@link Permission#Write} permission granted to you
     * in order to upload new objects to a bucket.
     */
    private String bucketName;

    /**
     * The key under which to store the new object.
     */
    private String key;

    /**
     * The file containing the data to be uploaded to Amazon S3. You must either
     * specify a file or an InputStream containing the data to be uploaded to
     * Amazon S3.
     */
    private File file;

    /**
     * The InputStream containing the data to be uploaded to Amazon S3. You must
     * either specify a file or an InputStream containing the data to be
     * uploaded to Amazon S3.
     */
    private transient InputStream inputStream;

    /**
     * Optional metadata instructing Amazon S3 how to handle the uploaded data
     * (e.g. custom user metadata, hooks for specifying content type, etc.). If
     * you are uploading from an InputStream, you <bold>should always</bold>
     * specify metadata with the content size set, otherwise the contents of the
     * InputStream will have to be buffered in memory before they can be sent to
     * Amazon S3, which can have very negative performance impacts.
     */
    private ObjectMetadata metadata;

    /**
     * An optional pre-configured access control policy to use for the new
     * object.  Ignored in favor of accessControlList, if present.
     */
    private CannedAccessControlList cannedAcl;

    /**
     * An optional access control list to apply to the new object. If specified,
     * cannedAcl will be ignored.
     */
    private AccessControlList accessControlList;

    /**
     * The optional Amazon S3 storage class to use when storing the new object.
     * If not specified, the default, standard storage class will be used.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     */
    private String storageClass;

    /** The optional redirect location about an object */
    private String redirectLocation;

    /**
     * The optional customer-provided server-side encryption key to use to
     * encrypt the uploaded object.
     */
    private SSECustomerKey sseCustomerKey;

    /**
     * The optional AWS Key Management system parameters to be used to encrypt
     * the the object on the server side.
     */
    private SSEAwsKeyManagementParams sseAwsKeyManagementParams;

    private ObjectTagging tagging;

    private String objectLockMode;

    private Date objectLockRetainUntilDate;

    private String objectLockLegalHoldStatus;

    /**
     * Constructs a new
     * {@link AbstractPutObjectRequest} object to upload a file to the
     * specified bucket and key. After constructing the request,
     * users may optionally specify object metadata or a canned ACL as well.
     *
     * @param bucketName
     *            The name of an existing bucket to which the new object will be
     *            uploaded.
     * @param key
     *            The key under which to store the new object.
     * @param file
     *            The path of the file to upload to Amazon S3.
     */
    public AbstractPutObjectRequest(String bucketName, String key, File file) {
        this.bucketName = bucketName;
        this.key = key;
        this.file = file;
    }

    /**
     * Constructs a new {@link AbstractPutObjectRequest} object with redirect location.
     * After constructing the request, users may optionally specify object
     * metadata or a canned ACL as well.
     *
     * @param bucketName
     *            The name of an existing bucket to which the new object will be
     *            uploaded.
     * @param key
     *            The key under which to store the new object.
     * @param redirectLocation
     *            The redirect location of this new object.
     */
    public AbstractPutObjectRequest(String bucketName, String key,
            String redirectLocation) {
        this.bucketName = bucketName;
        this.key = key;
        this.redirectLocation = redirectLocation;
    }

    /**
     * Constructs a new
     * {@link AbstractPutObjectRequest} object to upload a stream of data to
     * the specified bucket and key. After constructing the request,
     * users may optionally specify object metadata or a canned ACL as well.
     * <p>
     * Content length for the data stream <b>must</b> be
     * specified in the object metadata parameter; Amazon S3 requires it
     * be passed in before the data is uploaded. Failure to specify a content
     * length will cause the entire contents of the input stream to be buffered
     * locally in memory so that the content length can be calculated, which can
     * result in negative performance problems.
     * </p>
     *
     * @param bucketName
     *            The name of an existing bucket to which the new object will be
     *            uploaded.
     * @param key
     *            The key under which to store the new object.
     * @param input
     *            The stream of data to upload to Amazon S3.
     * @param metadata
     *            The object metadata. At minimum this specifies the
     *            content length for the stream of data being uploaded.
     */
    protected AbstractPutObjectRequest(String bucketName, String key,
            InputStream input, ObjectMetadata metadata) {
        this.bucketName = bucketName;
        this.key = key;
        this.inputStream = input;
        this.metadata = metadata;
    }

    /**
     * Gets the name of the existing bucket where this request will
     * upload a new object to.
     * In order to upload the object,
     * users must have {@link Permission#Write} permission granted.
     *
     * @return The name of an existing bucket where this request will
     * upload a new object to.
     *
     * @see AbstractPutObjectRequest#setBucketName(String)
     * @see AbstractPutObjectRequest#withBucketName(String)
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of an existing bucket where this request will
     * upload a new object to. In order to upload the object,
     * users must have {@link Permission#Write} permission granted.
     *
     * @param bucketName
     *            The name of an existing bucket where this request will
     *            upload a new object to.
     *            In order to upload the object,
     *            users must have {@link Permission#Write} permission granted.
     *
     * @see AbstractPutObjectRequest#getBucketName()
     * @see AbstractPutObjectRequest#withBucketName(String)
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket where this request will upload a new
     * object to. Returns this object, enabling additional method calls to be
     * chained together.
     * <p>
     * In order to upload the object,
     * users must have {@link Permission#Write} permission granted.
     *
     * @param bucketName
     *            The name of an existing bucket where this request will
     *            upload a new object to.
     *            In order to upload the object,
     *            users must have {@link Permission#Write} permission granted.
     *
     * @return This {@link AbstractPutObjectRequest}, enabling additional method calls to be
     *         chained together.
     *
     * @see AbstractPutObjectRequest#getBucketName()
     * @see AbstractPutObjectRequest#setBucketName(String)
     */
    public <T extends AbstractPutObjectRequest> T withBucketName(
            String bucketName) {
        setBucketName(bucketName);
        @SuppressWarnings("unchecked") T t = (T)this;
        return t;
    }

    /**
     * Gets the key under which to store the new object.
     *
     * @return The key under which to store the new object.
     *
     * @see AbstractPutObjectRequest#setKey(String)
     * @see AbstractPutObjectRequest#withKey(String)
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key under which to store the new object.
     *
     * @param key
     *            The key under which to store the new object.
     *
     * @see AbstractPutObjectRequest#getKey()
     * @see AbstractPutObjectRequest#withKey(String)
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets the key under which to store the new object. Returns this object,
     * enabling additional method calls to be chained together.
     *
     * @param key
     *            The key under which to store the new object.
     *
     * @return This {@link AbstractPutObjectRequest}, enabling additional method calls to be
     *         chained together.
     *
     * @see AbstractPutObjectRequest#getKey()
     * @see AbstractPutObjectRequest#setKey(String)
     */
    public <T extends AbstractPutObjectRequest> T withKey(String key) {
        setKey(key);
        @SuppressWarnings("unchecked") T t = (T)this;
        return t;
    }

    /**
     * Gets the optional Amazon S3 storage class to use when storing the new
     * object. If not specified, the default standard storage class is
     * used when storing the object.
     * <p>
     * For more information on available Amazon S3 storage classes, see the
     * {@link StorageClass} enumeration.
     * </p>
     *
     * @return The Amazon S3 storage class to use when storing the newly copied
     *         object.
     *
     * @see AbstractPutObjectRequest#setStorageClass(String)
     * @see AbstractPutObjectRequest#setStorageClass(StorageClass)
     * @see AbstractPutObjectRequest#withStorageClass(StorageClass)
     * @see AbstractPutObjectRequest#withStorageClass(String)
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * Sets the optional Amazon S3 storage class to use when storing the new
     * object. If not specified, the default standard storage class will be
     * used when storing the new object.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     * </p>
     *
     * @param storageClass
     *         The storage class to use when storing the new object.
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
     * object. Returns this {@link AbstractPutObjectRequest}, enabling additional method
     * calls to be chained together. If not specified, the default standard
     * storage class will be used when storing the object.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     * </p>
     *
     * @param storageClass
     *         The storage class to use when storing the new object.
     *
     * @return This {@link AbstractPutObjectRequest}, enabling additional method calls to be
     *         chained together.
     *
     * @see AbstractPutObjectRequest#getStorageClass()
     * @see AbstractPutObjectRequest#setStorageClass(StorageClass)
     * @see AbstractPutObjectRequest#setStorageClass(String)
     * @see AbstractPutObjectRequest#withStorageClass(StorageClass)
     */
    public <T extends AbstractPutObjectRequest> T withStorageClass(
            String storageClass) {
        setStorageClass(storageClass);
        @SuppressWarnings("unchecked") T t = (T)this;
        return t;
    }

    /**
     * Sets the optional Amazon S3 storage class to use when storing the new
     * object. If not specified, the default standard storage class will be
     * used when storing the object.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     * </p>
     *
     * @param storageClass
     *         The storage class to use when storing the new object.
     *
     * @see #getStorageClass()
     * @see #setStorageClass(String)
     */
    public void setStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
    }

    /**
     * Sets the optional Amazon S3 storage class to use when storing the new
     * object. Returns this {@link AbstractPutObjectRequest}, enabling additional method
     * calls to be chained together. If not specified, the default standard
     * storage class will be used when storing the object.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     * </p>
     *
     * @param storageClass
     *         The storage class to use when storing the new object.
     *
     * @return This {@link AbstractPutObjectRequest}, enabling additional method calls to be
     *         chained together.
     *
     * @see AbstractPutObjectRequest#getStorageClass()
     * @see AbstractPutObjectRequest#setStorageClass(StorageClass)
     * @see AbstractPutObjectRequest#setStorageClass(String)
     * @see AbstractPutObjectRequest#withStorageClass(String)
     */
    public <T extends AbstractPutObjectRequest> T withStorageClass(
            StorageClass storageClass) {
        setStorageClass(storageClass);
        @SuppressWarnings("unchecked") T t = (T)this;
        return t;
    }

    /**
     * Gets the path and name of the file
     * containing the data to be uploaded to Amazon S3.
     * Either specify a file or an input stream containing the data to be
     * uploaded to Amazon S3; both cannot be specified.
     *
     * @return The path and name of the file
     *         containing the data to be uploaded to Amazon S3.
     *
     * @see AbstractPutObjectRequest#setFile(File)
     * @see AbstractPutObjectRequest#withFile(File)
     * @see AbstractPutObjectRequest#setInputStream(InputStream)
     * @see AbstractPutObjectRequest#withInputStream(InputStream)
     */
    @Override
    public File getFile() {
        return file;
    }

    /**
     * Sets the path and name of the file
     * containing the data to be uploaded to Amazon S3.
     * Either specify a file or an input stream containing the data to be
     * uploaded to Amazon S3; both cannot be specified.
     *
     * @param file
     *            The path and name of the
     *            file containing the data to be uploaded to Amazon S3.
     *
     * @see AbstractPutObjectRequest#getFile()
     * @see AbstractPutObjectRequest#withFile(File)
     * @see AbstractPutObjectRequest#getInputStream()
     * @see AbstractPutObjectRequest#withInputStream(InputStream)
     */
    @Override
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * Sets the file containing the data to be uploaded to Amazon S3.
     * Returns this {@link AbstractPutObjectRequest}, enabling additional method
     * calls to be chained together.
     * <p>
     * Either specify a file or an input stream containing the data to
     * be uploaded to Amazon S3; both cannot be specified.
     *
     * @param file
     *            The file containing the data to be uploaded to Amazon S3.
     *
     * @return This {@link AbstractPutObjectRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see AbstractPutObjectRequest#getFile()
     * @see AbstractPutObjectRequest#setFile(File)
     * @see AbstractPutObjectRequest#getInputStream()
     * @see AbstractPutObjectRequest#setInputStream(InputStream)
     */
    public <T extends AbstractPutObjectRequest> T withFile(File file) {
        setFile(file);
        @SuppressWarnings("unchecked") T t = (T)this;
        return t;
    }

    /**
     * Gets the optional metadata instructing Amazon S3 how to handle the
     * uploaded data (e.g. custom user metadata, hooks for specifying content
     * type, etc.).
     * <p>
     * If uploading from an input stream,
     * <b>always</b> specify metadata with the content size set. Otherwise the
     * contents of the input stream have to be buffered in memory before
     * being sent to Amazon S3. This can cause very negative performance
     * impacts.
     * </p>
     *
     * @return The optional metadata instructing Amazon S3 how to handle the
     *         uploaded data (e.g. custom user metadata, hooks for specifying
     *         content type, etc.).
     *
     * @see AbstractPutObjectRequest#setMetadata(ObjectMetadata)
     * @see AbstractPutObjectRequest#withMetadata(ObjectMetadata)
     */
    public ObjectMetadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the optional metadata instructing Amazon S3 how to handle the
     * uploaded data (e.g. custom user metadata, hooks for specifying content
     * type, etc.).
     * <p>
     * If uploading from an input stream,
     * <b>always</b> specify metadata with the content size set. Otherwise the
     * contents of the input stream have to be buffered in memory before
     * being sent to Amazon S3. This can cause very negative performance
     * impacts.
     * </p>
     *
     * @param metadata
     *            The optional metadata instructing Amazon S3 how to handle the
     *            uploaded data (e.g. custom user metadata, hooks for specifying
     *            content type, etc.).
     *
     * @see AbstractPutObjectRequest#getMetadata()
     * @see AbstractPutObjectRequest#withMetadata(ObjectMetadata)
     */
    public void setMetadata(ObjectMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Sets the optional metadata instructing Amazon S3 how to handle the
     * uploaded data (e.g. custom user metadata, hooks for specifying content
     * type, etc.). Returns this {@link AbstractPutObjectRequest}, enabling additional method
     * calls to be chained together.
     * <p>
     * If uploading from an input stream,
     * <b>always</b> specify metadata with the content size set. Otherwise the
     * contents of the input stream have to be buffered in memory before
     * being sent to Amazon S3. This can cause very negative performance
     * impacts.
     * </p>
     *
     * @param metadata
     *            The optional metadata instructing Amazon S3 how to handle the
     *            uploaded data (e.g. custom user metadata, hooks for specifying
     *            content type, etc.).
     *
     * @return This {@link AbstractPutObjectRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see AbstractPutObjectRequest#getMetadata()
     * @see AbstractPutObjectRequest#setMetadata(ObjectMetadata)
     */
    public <T extends AbstractPutObjectRequest> T withMetadata(
            ObjectMetadata metadata) {
        setMetadata(metadata);
        @SuppressWarnings("unchecked") T t = (T)this;
        return t;
    }

    /**
     * Gets the optional pre-configured access control policy to use for the
     * new object.
     *
     * @return The optional pre-configured access control policy to use for the
     *         new object.
     *
     * @see AbstractPutObjectRequest#setCannedAcl(CannedAccessControlList)
     * @see AbstractPutObjectRequest#withCannedAcl(CannedAccessControlList)
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
     * @see AbstractPutObjectRequest#getCannedAcl()
     * @see AbstractPutObjectRequest#withCannedAcl(CannedAccessControlList)
     */
    public void setCannedAcl(CannedAccessControlList cannedAcl) {
        this.cannedAcl = cannedAcl;
    }

    /**
     * Sets the optional pre-configured access control policy to use for the new
     * object. Returns this {@link AbstractPutObjectRequest}, enabling additional method
     * calls to be chained together.
     *
     * @param cannedAcl
     *            The optional pre-configured access control policy to use for
     *            the new object.
     *
     * @return This {@link AbstractPutObjectRequest}, enabling additional method
     *         calls to be chained together.
     *
     * @see AbstractPutObjectRequest#getCannedAcl()
     * @see AbstractPutObjectRequest#setCannedAcl(CannedAccessControlList)
     */
    public <T extends AbstractPutObjectRequest> T withCannedAcl(
            CannedAccessControlList cannedAcl) {
        setCannedAcl(cannedAcl);
        @SuppressWarnings("unchecked") T t = (T) this;
        return t;
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
     * cannedAcl will be ignored. Returns this {@link AbstractPutObjectRequest},
     * enabling additional method calls to be chained together.
     *
     * @param accessControlList
     *            The access control list for the new object.
     */
    public <T extends AbstractPutObjectRequest> T withAccessControlList(
            AccessControlList accessControlList) {
        setAccessControlList(accessControlList);
        @SuppressWarnings("unchecked") T t = (T)this;
        return t;
    }

    /**
     * Gets the input stream containing the data to be uploaded to Amazon S3.
     * The user of this request
     * must either specify a file or an input stream containing the data to be
     * uploaded to Amazon S3; both cannot be specified.
     *
     * @return The input stream containing the data to be uploaded to Amazon S3.
     *         Either specify a file or an input stream containing the
     *         data to be uploaded to Amazon S3, not both.
     *
     * @see AbstractPutObjectRequest#setInputStream(InputStream)
     * @see AbstractPutObjectRequest#withInputStream(InputStream)
     * @see AbstractPutObjectRequest#setFile(File)
     * @see AbstractPutObjectRequest#withFile(File)
     */
    @Override
    public InputStream getInputStream() {
        return inputStream;
    }

    /**
     * Sets the input stream containing the data to be uploaded to Amazon S3.
     * Either specify a file or an input stream containing the data to be
     * uploaded to Amazon S3; both cannot be specified.
     *
     * @param inputStream
     *            The input stream containing the data to be uploaded to Amazon
     *            S3. Either specify a file or an input stream containing the
     *            data to be uploaded to Amazon S3, not both.
     *
     * @see AbstractPutObjectRequest#getInputStream()
     * @see AbstractPutObjectRequest#withInputStream(InputStream)
     * @see AbstractPutObjectRequest#getFile()
     * @see AbstractPutObjectRequest#withFile(File)
     */
    @Override
    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    /**
     * Sets the input stream containing the data to be uploaded to Amazon S3.
     * Returns this {@link AbstractPutObjectRequest}, enabling additional method
     * calls to be chained together.
     * <p>
     * Either specify a file or an input stream containing the data to be
     * uploaded to Amazon S3; both cannot be specified.
     * </p>
     *
     * @param inputStream
     *            The InputStream containing the data to be uploaded to Amazon
     *            S3.
     *
     * @return This PutObjectRequest, so that additional method calls can be
     *         chained together.
     *
     * @see AbstractPutObjectRequest#getInputStream()
     * @see AbstractPutObjectRequest#setInputStream(InputStream)
     * @see AbstractPutObjectRequest#getFile()
     * @see AbstractPutObjectRequest#setFile(File)
     */
    public <T extends AbstractPutObjectRequest> T withInputStream(
            InputStream inputStream) {
        setInputStream(inputStream);
        @SuppressWarnings("unchecked") T t = (T)this;
        return t;
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
     * Gets the optional redirect location for the new object.
     */
    public String getRedirectLocation() {
        return this.redirectLocation;
    }

    /**
     * Sets the optional redirect location for the new object.Returns this
     * {@link AbstractPutObjectRequest}, enabling additional method calls to be chained
     * together.
     * @param redirectLocation
     *            The redirect location for the new object.
     */
    public <T extends AbstractPutObjectRequest> T withRedirectLocation(
            String redirectLocation) {
        this.redirectLocation = redirectLocation;
        @SuppressWarnings("unchecked") T t = (T)this;
        return t;
    }

    @Override
    public SSECustomerKey getSSECustomerKey() {
        return sseCustomerKey;
    }

    /**
     * Sets the optional customer-provided server-side encryption key to use to
     * encrypt the uploaded object.
     *
     * @param sseKey
     *            The optional customer-provided server-side encryption key to
     *            use to encrypt the uploaded object.
     */
    public void setSSECustomerKey(SSECustomerKey sseKey) {
        if (sseKey != null && this.sseAwsKeyManagementParams != null) {
            throw new IllegalArgumentException(
                "Either SSECustomerKey or SSEAwsKeyManagementParams must not be set at the same time.");
        }
        this.sseCustomerKey = sseKey;
    }

    /**
     * Sets the optional customer-provided server-side encryption key to use to
     * encrypt the uploaded object, and returns the updated request object so
     * that additional method calls can be chained together.
     *
     * @param sseKey
     *            The optional customer-provided server-side encryption key to
     *            use to encrypt the uploaded object.
     *
     * @return This updated request object so that additional method calls can
     *         be chained together.
     */
    public <T extends AbstractPutObjectRequest> T withSSECustomerKey(
            SSECustomerKey sseKey) {
        setSSECustomerKey(sseKey);
        @SuppressWarnings("unchecked") T t = (T)this;
        return t;
    }

    public ObjectTagging getTagging() {
        return tagging;
    }

    public void setTagging(ObjectTagging tagging) {
        this.tagging = tagging;
    }

    public <T extends PutObjectRequest> T withTagging(ObjectTagging tagSet) {
        setTagging(tagSet);
        T t = (T)this;
        return t;
    }

    /**
     * The Object Lock mode that you want to apply to this object.
     */
    public String getObjectLockMode() {
        return objectLockMode;
    }

    /**
     * The Object Lock mode that you want to apply to this object.
     */
    public <T extends PutObjectRequest> T withObjectLockMode(String objectLockMode) {
        this.objectLockMode = objectLockMode;
        return (T) this;
    }

    /**
     * The Object Lock mode that you want to apply to this object.
     */
    public <T extends PutObjectRequest> T withObjectLockMode(ObjectLockMode objectLockMode) {
        return withObjectLockMode(objectLockMode.toString());
    }

    /**
     * The Object Lock mode that you want to apply to this object.
     */
    public void setObjectLockMode(String objectLockMode) {
        withObjectLockMode(objectLockMode);
    }

    /**
     * The Object Lock mode that you want to apply to this object.
     */
    public void setObjectLockMode(ObjectLockMode objectLockMode) {
        setObjectLockMode(objectLockMode.toString());
    }

    /**
     * The date and time when you want this object's Object Lock to expire.
     */
    public Date getObjectLockRetainUntilDate() {
        return objectLockRetainUntilDate;
    }

    /**
     * The date and time when you want this object's Object Lock to expire.
     */
    public <T extends PutObjectRequest> T withObjectLockRetainUntilDate(Date objectLockRetainUntilDate) {
        this.objectLockRetainUntilDate = objectLockRetainUntilDate;
        return (T) this;
    }

    /**
     * The date and time when you want this object's Object Lock to expire.
     */
    public void setObjectLockRetainUntilDate(Date objectLockRetainUntilDate) {
        withObjectLockRetainUntilDate(objectLockRetainUntilDate);
    }

    /**
     * The Legal Hold status that you want to apply to the specified object.
     */
    public String getObjectLockLegalHoldStatus() {
        return objectLockLegalHoldStatus;
    }

    /**
     * The Legal Hold status that you want to apply to the specified object.
     */
    public <T extends PutObjectRequest> T withObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        this.objectLockLegalHoldStatus = objectLockLegalHoldStatus;
        return (T) this;
    }

    /**
     * The Legal Hold status that you want to apply to the specified object.
     */
    public <T extends PutObjectRequest> T withObjectLockLegalHoldStatus(ObjectLockLegalHoldStatus objectLockLegalHoldStatus) {
        return withObjectLockLegalHoldStatus(objectLockLegalHoldStatus.toString());
    }

    /**
     * The Legal Hold status that you want to apply to the specified object.
     */
    public void setObjectLockLegalHoldStatus(String objectLockLegalHoldStatus) {
        withObjectLockLegalHoldStatus(objectLockLegalHoldStatus);
    }

    /**
     * The Legal Hold status that you want to apply to the specified object.
     */
    public void setObjectLockLegalHoldStatus(ObjectLockLegalHoldStatus objectLockLegalHoldStatus) {
        setObjectLockLegalHoldStatus(objectLockLegalHoldStatus.toString());
    }

    /**
     * Sets the optional progress listener for receiving updates for object
     * upload status.
     *
     * @param progressListener
     *            The legacy progress listener that is used exclusively for Amazon S3 client.
     *
     * @deprecated use {@link #setGeneralProgressListener(ProgressListener)} instead.
     */
    @Deprecated
    public void setProgressListener(com.amazonaws.services.s3.model.ProgressListener progressListener) {
        setGeneralProgressListener(new LegacyS3ProgressListener(progressListener));
    }

    /**
     * Returns the optional progress listener for receiving updates about object
     * upload status.
     *
     * @return the optional progress listener for receiving updates about object
     *         upload status.
     *
     * @deprecated use {@link #getGeneralProgressListener()} instead.
     */
    @Deprecated
    public com.amazonaws.services.s3.model.ProgressListener getProgressListener() {
        ProgressListener generalProgressListener = getGeneralProgressListener();
        if (generalProgressListener instanceof LegacyS3ProgressListener) {
            return ((LegacyS3ProgressListener)generalProgressListener).unwrap();
        } else {
             return null;
        }
    }

    /**
     * Sets the optional progress listener for receiving updates about object
     * upload status, and returns this updated object so that additional method
     * calls can be chained together.
     *
     * @param progressListener
     *            The legacy progress listener that is used exclusively for Amazon S3 client.
     *
     * @return This updated PutObjectRequest object.
     *
     * @deprecated use {@link #withGeneralProgressListener(ProgressListener)} instead.
     */
    @Deprecated
    public <T extends AbstractPutObjectRequest> T withProgressListener(
            com.amazonaws.services.s3.model.ProgressListener progressListener) {
        setProgressListener(progressListener);
        @SuppressWarnings("unchecked") T t = (T)this;
        return t;
    }

    /**
     * Returns the AWS Key Management System parameters used to encrypt the
     * object on server side.
     */
    @Override
    public SSEAwsKeyManagementParams getSSEAwsKeyManagementParams() {
        return sseAwsKeyManagementParams;
    }

    /**
     * Sets the AWS Key Management System parameters used to encrypt the object
     * on server side.
     */
    public void setSSEAwsKeyManagementParams(SSEAwsKeyManagementParams params) {
        if (params != null && this.sseCustomerKey != null) {
            throw new IllegalArgumentException(
                "Either SSECustomerKey or SSEAwsKeyManagementParams must not be set at the same time.");
        }
        this.sseAwsKeyManagementParams = params;
    }

    /**
     * Sets the AWS Key Management System parameters used to encrypt the object
     * on server side.
     *
     * @return returns the update PutObjectRequest
     */
    public <T extends AbstractPutObjectRequest> T withSSEAwsKeyManagementParams(
            SSEAwsKeyManagementParams sseAwsKeyManagementParams) {
        setSSEAwsKeyManagementParams(sseAwsKeyManagementParams);
        @SuppressWarnings("unchecked") T t = (T)this;
        return t;
    }

    @Override
    public AbstractPutObjectRequest clone() {
        return (AbstractPutObjectRequest) super.clone();
    }

    protected final <T extends AbstractPutObjectRequest> T copyPutObjectBaseTo(
            T target) {
        copyBaseTo(target);
        final ObjectMetadata metadata = getMetadata();
        return target.withAccessControlList(getAccessControlList())
            .withCannedAcl(getCannedAcl())
            .withInputStream(getInputStream())
            .withMetadata(metadata == null ? null : metadata.clone())
            .withRedirectLocation(getRedirectLocation())
            .withStorageClass(getStorageClass())
            .withSSEAwsKeyManagementParams(getSSEAwsKeyManagementParams())
            .withSSECustomerKey(getSSECustomerKey())
            ;
    }
}
