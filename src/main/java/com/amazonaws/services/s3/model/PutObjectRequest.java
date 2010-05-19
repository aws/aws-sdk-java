/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.File;
import java.io.InputStream;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.AmazonS3;

/**
 * Uploads a new object along with optional object metadata to Amazon S3 under
 * the specified bucket and key name and optionally applies a canned access
 * control policy to the new object.
 * <p>
 * Amazon S3 never stores partial objects: if you don't receive an exception,
 * then you can be confident that the entire object was stored.
 * <p>
 * A checksum of the uploaded data is automatically computed on the client and
 * verified against another checksum calculated when the data reaches Amazon S3
 * to ensure that the data does not get corrupted over the network.
 * <p>
 * If a file is specified (instead of an InputStream), the filename will be used
 * to try and automatically determine the correct content type to use for the
 * object, unless the specified object metadata explicitly declares a content
 * type. Content disposition will also be automatically set when uploading
 * directly from a file.
 * <p>
 * If versioning is enabled for the specified bucket, this operation will never
 * overwrite an existing object at the same key, but instead will keep the
 * existing object around as an older version until that version is explicitly
 * deleted (see {@link AmazonS3#deleteVersion(DeleteVersionRequest)}).
 * <p>
 * If versioning is suspended or off, uploading an object to an existing key
 * will overwrite any existing object stored under that key because Amazon S3
 * stores the last write request. However, Amazon S3 is a distributed system. If
 * Amazon S3 receives multiple write requests for the same object nearly
 * simultaneously, all of the objects might be stored, even though only one wins
 * in the end. Amazon S3 does not provide object locking; if you need this, make
 * sure to build it into your application layer.
 * <p>
 * If you specify a location constraint when creating a bucket, all objects
 * added to the bucket are stored in the bucket's location. For example, if you
 * specify a region in Europe (EU) constraint for a bucket, all of that bucket's
 * objects are stored in EU.
 * <p>
 * The specified bucket must already exist and you must have
 * {@link Permission#Write} permission to the bucket to upload an object.
 */
public class PutObjectRequest extends AmazonWebServiceRequest {

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
    private InputStream inputStream;

    /**
     * Optional metadata instructing Amazon S3 how to handle the uploaded data
     * (ex: custom user metadata, hooks for specifying content type, etc.). If
     * you are uploading from an InputStream, you <bold>should always</bold>
     * specify metadata with the content size set, otherwise the contents of the
     * InputStream will have to be buffered in memory before they can be sent to
     * Amazon S3, which can have very negative performance impacts.
     */
    private ObjectMetadata metadata;

    /**
     * An optional pre-configured access control policy to use for the new
     * object.
     */
    private CannedAccessControlList cannedAcl;

    /**
     * The optional Amazon S3 storage class to use when storing the new object.
     * If not specified, the default, standard storage class will be used.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     */
    private String storageClass;


    /**
     * Constructs a new PutObjectRequest object to upload a file to the
     * specified bucket and key. After constructing the request, you can
     * optionally specify object metadata or a canned ACL as well.
     *
     * @param bucketName
     *            The name of an existing bucket to which the new object will be
     *            uploaded.
     * @param key
     *            The key under which to store the new object.
     * @param file
     *            The file to upload to Amazon S3.
     */
    public PutObjectRequest(String bucketName, String key, File file) {
        this.bucketName = bucketName;
        this.key = key;
        this.file = file;
    }

    /**
     * Constructs a new PutObjectRequest object to upload a stream of data to
     * the specified bucket and key. After constructing the request, you can
     * optionally specify a canned ACL as well.
     * <p>
     * Content length for the stream of data being uploaded <b>must</b> be
     * specified in the object metadata parameter, since Amazon S3 requires it
     * be passed in before the data is uploaded. Failure to specify a content
     * length will cause the entire contents of the input stream to be buffered
     * locally in memory so that the content length can be calculated, which can
     * result in negative performance problems.
     *
     * @param bucketName
     *            The name of an existing bucket to which the new object will be
     *            uploaded.
     * @param key
     *            The key under which to store the new object.
     * @param input
     *            The stream of data to upload to Amazon S3.
     * @param metadata
     *            The object metadata, which at minimum should specify the
     *            content length for the stream of data being uploaded.
     */
    public PutObjectRequest(String bucketName, String key, InputStream input, ObjectMetadata metadata) {
        this.bucketName = bucketName;
        this.key = key;
        this.inputStream = input;
        this.metadata = metadata;
    }

    /**
     * Returns the name of an existing bucket, to which this request will upload
     * a new object. You must have {@link Permission#Write} permission granted
     * to you in order to upload new objects to a bucket.
     *
     * @return The name of an existing bucket, to which this request will upload
     *         a new object.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the name of the bucket, to which this request will upload a new
     * object. You must have {@link Permission#Write} permission granted to you
     * in order to upload new objects to a bucket.
     *
     * @param bucketName
     *            The name of an existing bucket, to which this request will
     *            upload a new object. You must have {@link Permission#Write}
     *            permission granted to you in order to upload new objects to a
     *            bucket.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Sets the name of the bucket, to which this request will upload a new
     * object, and returns this object so that additional method calls may be
     * chained together.
     * <p>
     * You must have {@link Permission#Write} permission granted to you in order
     * to upload new objects to a bucket.
     *
     * @param bucketName
     *            The name of an existing bucket, to which this request will
     *            upload a new object. You must have {@link Permission#Write}
     *            permission granted to you in order to upload new objects to a
     *            bucket.
     *
     * @return This PutObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public PutObjectRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * Returns the key under which to store the new object.
     *
     * @return The key under which to store the new object.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key under which to store the new object.
     *
     * @param key
     *            The key under which to store the new object.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets the key under which to store the new object, and returns this object
     * so that additional method calls may be chained together.
     *
     * @param key
     *            The key under which to store the new object.
     *
     * @return This PutObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public PutObjectRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * Gets the optional Amazon S3 storage class to use when storing the new
     * object. If not specified, the default, standard storage class will be
     * used.
     * <p>
     * For more information on available Amazon S3 storage classes, see the
     * {@link StorageClass} enumeration.
     *
     * @return The Amazon S3 storage class to use when storing the newly copied
     *         object.
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * Sets the optional Amazon S3 storage class to use when storing the new
     * object. If not specified, the default, standard storage class will be
     * used.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     *
     * @return The Amazon S3 storage class to use when storing the newly copied
     *         object.
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * Sets the optional Amazon S3 storage class to use when storing the new
     * object, and returns this PutObjectRequest so that additional method
     * calls can be chained together. If not specified, the default, standard
     * storage class will be used.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     *
     * @return This PutObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public PutObjectRequest withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * Sets the optional Amazon S3 storage class to use when storing the new
     * object. If not specified, the default, standard storage class will be
     * used.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     *
     * @return The Amazon S3 storage class to use when storing the newly copied
     *         object.
     */
    public void setStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
    }

    /**
     * Sets the optional Amazon S3 storage class to use when storing the new
     * object, and returns this PutObjectRequest so that additional method
     * calls can be chained together. If not specified, the default, standard
     * storage class will be used.
     * <p>
     * For more information on Amazon S3 storage classes and available values,
     * see the {@link StorageClass} enumeration.
     *
     * @return This PutObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public PutObjectRequest withStorageClass(StorageClass storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * Returns the file containing the data to be uploaded to Amazon S3. You
     * must either specify a file or an InputStream containing the data to be
     * uploaded to Amazon S3.  You cannot specify both.
     *
     * @return The file containing the data to be uploaded to Amazon S3.
     */
    public File getFile() {
        return file;
    }

    /**
     * Sets the file containing the data to be uploaded to Amazon S3. You must
     * either specify a file or an InputStream containing the data to be
     * uploaded to Amazon S3. You cannot specify both.
     *
     * @param file
     *            The file containing the data to be uploaded to Amazon S3.
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * Sets the file containing the data to be uploaded to Amazon S3, and
     * returns this object so that additional method calls may be chained
     * together.
     * <p>
     * You must either specify a file or an InputStream containing the data to
     * be uploaded to Amazon S3.  You cannot specify both.
     *
     * @param file
     *            The file containing the data to be uploaded to Amazon S3.
     *
     * @return This PutObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public PutObjectRequest withFile(File file) {
        setFile(file);
        return this;
    }

    /**
     * Returns the optional metadata instructing Amazon S3 how to handle the
     * uploaded data (ex: custom user metadata, hooks for specifying content
     * type, etc.). If you are uploading from an InputStream, you <bold>should
     * always</bold> specify metadata with the content size set, otherwise the
     * contents of the InputStream will have to be buffered in memory before
     * they can be sent to Amazon S3, which can have very negative performance
     * impacts.
     *
     * @return the optional metadata instructing Amazon S3 how to handle the
     *         uploaded data (ex: custom user metadata, hooks for specifying
     *         content type, etc.).
     */
    public ObjectMetadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the optional metadata instructing Amazon S3 how to handle the
     * uploaded data (ex: custom user metadata, hooks for specifying content
     * type, etc.). If you are uploading from an InputStream, you <bold>should
     * always</bold> specify metadata with the content size set, otherwise the
     * contents of the InputStream will have to be buffered in memory before
     * they can be sent to Amazon S3, which can have very negative performance
     * impacts.
     *
     * @param metadata
     *            The optional metadata instructing Amazon S3 how to handle the
     *            uploaded data (ex: custom user metadata, hooks for specifying
     *            content type, etc.).
     */
    public void setMetadata(ObjectMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Sets the optional metadata instructing Amazon S3 how to handle the
     * uploaded data (ex: custom user metadata, hooks for specifying content
     * type, etc.), and returns this object so that additional method calls may
     * be chained together.
     * <p>
     * If you are uploading from an InputStream, you <bold>should always</bold>
     * specify metadata with the content size set, otherwise the contents of the
     * InputStream will have to be buffered in memory before they can be sent to
     * Amazon S3, which can have very negative performance impacts.
     *
     * @param metadata
     *            The optional metadata instructing Amazon S3 how to handle the
     *            uploaded data (ex: custom user metadata, hooks for specifying
     *            content type, etc.).
     *
     * @return This PutObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public PutObjectRequest withMetadata(ObjectMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Returns the optional pre-configured access control policy to use for the
     * new object.
     *
     * @return The optional pre-configured access control policy to use for the
     *         new object.
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
     */
    public void setCannedAcl(CannedAccessControlList cannedAcl) {
        this.cannedAcl = cannedAcl;
    }

    /**
     * Sets the optional pre-configured access control policy to use for the new
     * object, and returns this object so that additional method calls may be
     * chained together.
     *
     * @param cannedAcl
     *            The optional pre-configured access control policy to use for
     *            the new object.
     *
     * @return This PutObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public PutObjectRequest withCannedAcl(CannedAccessControlList cannedAcl) {
        setCannedAcl(cannedAcl);
        return this;
    }

    /**
     * Returns the InputStream containing the data to be uploaded to Amazon S3.
     * You must either specify a file or an InputStream containing the data to
     * be uploaded to Amazon S3.  You cannot specify both.
     *
     * @return The InputStream containing the data to be uploaded to Amazon S3.
     *         You must either specify a file or an InputStream containing the
     *         data to be uploaded to Amazon S3.
     */
    public InputStream getInputStream() {
        return inputStream;
    }

    /**
     * Sets the InputStream containing the data to be uploaded to Amazon S3. You
     * must either specify a file or an InputStream containing the data to be
     * uploaded to Amazon S3.  You cannot specify both.
     *
     * @param inputStream
     *            The InputStream containing the data to be uploaded to Amazon
     *            S3. You must either specify a file or an InputStream
     *            containing the data to be uploaded to Amazon S3.
     */
    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    /**
     * Sets the InputStream containing the data to be uploaded to Amazon S3, and
     * returns this object so that additional method calls may be chained
     * together.
     * <p>
     * You must either specify a file or an InputStream containing the data to
     * be uploaded to Amazon S3.  You cannot specify both.
     *
     * @param inputStream
     *            The InputStream containing the data to be uploaded to Amazon
     *            S3.
     *
     * @return This PutObjectRequest, so that additional method calls can be
     *         chained together.
     */
    public PutObjectRequest withInputStream(InputStream inputStream) {
        setInputStream(inputStream);
        return this;
    }

}
