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
package com.amazonaws.services.mediastoredata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.auth.SignerTypeAware;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/PutObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutObjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable, SignerTypeAware {

    /**
     * <p>
     * The bytes to be stored.
     * </p>
     */
    private java.io.InputStream body;
    /**
     * <p>
     * The path (including the file name) where the object is stored in the container. Format: &lt;folder
     * name&gt;/&lt;folder name&gt;/&lt;file name&gt;
     * </p>
     * <p>
     * For example, to upload the file <code>mlaw.avi</code> to the folder path <code>premium\canada</code> in the
     * container <code>movies</code>, enter the path <code>premium/canada/mlaw.avi</code>.
     * </p>
     * <p>
     * Do not include the container name in this path.
     * </p>
     * <p>
     * If the path includes any folders that don't exist yet, the service creates them. For example, suppose you have an
     * existing <code>premium/usa</code> subfolder. If you specify <code>premium/canada</code>, the service creates a
     * <code>canada</code> subfolder in the <code>premium</code> folder. You then have two subfolders, <code>usa</code>
     * and <code>canada</code>, in the <code>premium</code> folder.
     * </p>
     * <p>
     * There is no correlation between the path to the source and the path (folders) in the container in AWS Elemental
     * MediaStore.
     * </p>
     * <p>
     * For more information about folders and how they exist in a container, see the <a
     * href="http://docs.aws.amazon.com/mediastore/latest/ug/">AWS Elemental MediaStore User Guide</a>.
     * </p>
     * <p>
     * The file name is the name that is assigned to the file that you upload. The file can have the same name inside
     * and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include or omit an
     * extension.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The content type of the object.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * An optional <code>CacheControl</code> header that allows the caller to control the object's cache behavior.
     * Headers can be passed in as specified in the HTTP at <a
     * href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     * >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.
     * </p>
     * <p>
     * Headers with a custom user-defined value are also accepted.
     * </p>
     */
    private String cacheControl;
    /**
     * <p>
     * Indicates the storage class of a <code>Put</code> request. Defaults to high-performance temporal storage class,
     * and objects are persisted into durable storage shortly after being received.
     * </p>
     */
    private String storageClass;

    /**
     * <p>
     * The bytes to be stored.
     * </p>
     * 
     * @param body
     *        The bytes to be stored.
     */

    public void setBody(java.io.InputStream body) {
        this.body = body;
    }

    /**
     * <p>
     * The bytes to be stored.
     * </p>
     * 
     * @return The bytes to be stored.
     */

    public java.io.InputStream getBody() {
        return this.body;
    }

    /**
     * <p>
     * The bytes to be stored.
     * </p>
     * 
     * @param body
     *        The bytes to be stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutObjectRequest withBody(java.io.InputStream body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The path (including the file name) where the object is stored in the container. Format: &lt;folder
     * name&gt;/&lt;folder name&gt;/&lt;file name&gt;
     * </p>
     * <p>
     * For example, to upload the file <code>mlaw.avi</code> to the folder path <code>premium\canada</code> in the
     * container <code>movies</code>, enter the path <code>premium/canada/mlaw.avi</code>.
     * </p>
     * <p>
     * Do not include the container name in this path.
     * </p>
     * <p>
     * If the path includes any folders that don't exist yet, the service creates them. For example, suppose you have an
     * existing <code>premium/usa</code> subfolder. If you specify <code>premium/canada</code>, the service creates a
     * <code>canada</code> subfolder in the <code>premium</code> folder. You then have two subfolders, <code>usa</code>
     * and <code>canada</code>, in the <code>premium</code> folder.
     * </p>
     * <p>
     * There is no correlation between the path to the source and the path (folders) in the container in AWS Elemental
     * MediaStore.
     * </p>
     * <p>
     * For more information about folders and how they exist in a container, see the <a
     * href="http://docs.aws.amazon.com/mediastore/latest/ug/">AWS Elemental MediaStore User Guide</a>.
     * </p>
     * <p>
     * The file name is the name that is assigned to the file that you upload. The file can have the same name inside
     * and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include or omit an
     * extension.
     * </p>
     * 
     * @param path
     *        The path (including the file name) where the object is stored in the container. Format: &lt;folder
     *        name&gt;/&lt;folder name&gt;/&lt;file name&gt;</p>
     *        <p>
     *        For example, to upload the file <code>mlaw.avi</code> to the folder path <code>premium\canada</code> in
     *        the container <code>movies</code>, enter the path <code>premium/canada/mlaw.avi</code>.
     *        </p>
     *        <p>
     *        Do not include the container name in this path.
     *        </p>
     *        <p>
     *        If the path includes any folders that don't exist yet, the service creates them. For example, suppose you
     *        have an existing <code>premium/usa</code> subfolder. If you specify <code>premium/canada</code>, the
     *        service creates a <code>canada</code> subfolder in the <code>premium</code> folder. You then have two
     *        subfolders, <code>usa</code> and <code>canada</code>, in the <code>premium</code> folder.
     *        </p>
     *        <p>
     *        There is no correlation between the path to the source and the path (folders) in the container in AWS
     *        Elemental MediaStore.
     *        </p>
     *        <p>
     *        For more information about folders and how they exist in a container, see the <a
     *        href="http://docs.aws.amazon.com/mediastore/latest/ug/">AWS Elemental MediaStore User Guide</a>.
     *        </p>
     *        <p>
     *        The file name is the name that is assigned to the file that you upload. The file can have the same name
     *        inside and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include or
     *        omit an extension.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path (including the file name) where the object is stored in the container. Format: &lt;folder
     * name&gt;/&lt;folder name&gt;/&lt;file name&gt;
     * </p>
     * <p>
     * For example, to upload the file <code>mlaw.avi</code> to the folder path <code>premium\canada</code> in the
     * container <code>movies</code>, enter the path <code>premium/canada/mlaw.avi</code>.
     * </p>
     * <p>
     * Do not include the container name in this path.
     * </p>
     * <p>
     * If the path includes any folders that don't exist yet, the service creates them. For example, suppose you have an
     * existing <code>premium/usa</code> subfolder. If you specify <code>premium/canada</code>, the service creates a
     * <code>canada</code> subfolder in the <code>premium</code> folder. You then have two subfolders, <code>usa</code>
     * and <code>canada</code>, in the <code>premium</code> folder.
     * </p>
     * <p>
     * There is no correlation between the path to the source and the path (folders) in the container in AWS Elemental
     * MediaStore.
     * </p>
     * <p>
     * For more information about folders and how they exist in a container, see the <a
     * href="http://docs.aws.amazon.com/mediastore/latest/ug/">AWS Elemental MediaStore User Guide</a>.
     * </p>
     * <p>
     * The file name is the name that is assigned to the file that you upload. The file can have the same name inside
     * and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include or omit an
     * extension.
     * </p>
     * 
     * @return The path (including the file name) where the object is stored in the container. Format: &lt;folder
     *         name&gt;/&lt;folder name&gt;/&lt;file name&gt;</p>
     *         <p>
     *         For example, to upload the file <code>mlaw.avi</code> to the folder path <code>premium\canada</code> in
     *         the container <code>movies</code>, enter the path <code>premium/canada/mlaw.avi</code>.
     *         </p>
     *         <p>
     *         Do not include the container name in this path.
     *         </p>
     *         <p>
     *         If the path includes any folders that don't exist yet, the service creates them. For example, suppose you
     *         have an existing <code>premium/usa</code> subfolder. If you specify <code>premium/canada</code>, the
     *         service creates a <code>canada</code> subfolder in the <code>premium</code> folder. You then have two
     *         subfolders, <code>usa</code> and <code>canada</code>, in the <code>premium</code> folder.
     *         </p>
     *         <p>
     *         There is no correlation between the path to the source and the path (folders) in the container in AWS
     *         Elemental MediaStore.
     *         </p>
     *         <p>
     *         For more information about folders and how they exist in a container, see the <a
     *         href="http://docs.aws.amazon.com/mediastore/latest/ug/">AWS Elemental MediaStore User Guide</a>.
     *         </p>
     *         <p>
     *         The file name is the name that is assigned to the file that you upload. The file can have the same name
     *         inside and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include
     *         or omit an extension.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path (including the file name) where the object is stored in the container. Format: &lt;folder
     * name&gt;/&lt;folder name&gt;/&lt;file name&gt;
     * </p>
     * <p>
     * For example, to upload the file <code>mlaw.avi</code> to the folder path <code>premium\canada</code> in the
     * container <code>movies</code>, enter the path <code>premium/canada/mlaw.avi</code>.
     * </p>
     * <p>
     * Do not include the container name in this path.
     * </p>
     * <p>
     * If the path includes any folders that don't exist yet, the service creates them. For example, suppose you have an
     * existing <code>premium/usa</code> subfolder. If you specify <code>premium/canada</code>, the service creates a
     * <code>canada</code> subfolder in the <code>premium</code> folder. You then have two subfolders, <code>usa</code>
     * and <code>canada</code>, in the <code>premium</code> folder.
     * </p>
     * <p>
     * There is no correlation between the path to the source and the path (folders) in the container in AWS Elemental
     * MediaStore.
     * </p>
     * <p>
     * For more information about folders and how they exist in a container, see the <a
     * href="http://docs.aws.amazon.com/mediastore/latest/ug/">AWS Elemental MediaStore User Guide</a>.
     * </p>
     * <p>
     * The file name is the name that is assigned to the file that you upload. The file can have the same name inside
     * and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include or omit an
     * extension.
     * </p>
     * 
     * @param path
     *        The path (including the file name) where the object is stored in the container. Format: &lt;folder
     *        name&gt;/&lt;folder name&gt;/&lt;file name&gt;</p>
     *        <p>
     *        For example, to upload the file <code>mlaw.avi</code> to the folder path <code>premium\canada</code> in
     *        the container <code>movies</code>, enter the path <code>premium/canada/mlaw.avi</code>.
     *        </p>
     *        <p>
     *        Do not include the container name in this path.
     *        </p>
     *        <p>
     *        If the path includes any folders that don't exist yet, the service creates them. For example, suppose you
     *        have an existing <code>premium/usa</code> subfolder. If you specify <code>premium/canada</code>, the
     *        service creates a <code>canada</code> subfolder in the <code>premium</code> folder. You then have two
     *        subfolders, <code>usa</code> and <code>canada</code>, in the <code>premium</code> folder.
     *        </p>
     *        <p>
     *        There is no correlation between the path to the source and the path (folders) in the container in AWS
     *        Elemental MediaStore.
     *        </p>
     *        <p>
     *        For more information about folders and how they exist in a container, see the <a
     *        href="http://docs.aws.amazon.com/mediastore/latest/ug/">AWS Elemental MediaStore User Guide</a>.
     *        </p>
     *        <p>
     *        The file name is the name that is assigned to the file that you upload. The file can have the same name
     *        inside and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include or
     *        omit an extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutObjectRequest withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The content type of the object.
     * </p>
     * 
     * @param contentType
     *        The content type of the object.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the object.
     * </p>
     * 
     * @return The content type of the object.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type of the object.
     * </p>
     * 
     * @param contentType
     *        The content type of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutObjectRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * An optional <code>CacheControl</code> header that allows the caller to control the object's cache behavior.
     * Headers can be passed in as specified in the HTTP at <a
     * href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     * >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.
     * </p>
     * <p>
     * Headers with a custom user-defined value are also accepted.
     * </p>
     * 
     * @param cacheControl
     *        An optional <code>CacheControl</code> header that allows the caller to control the object's cache
     *        behavior. Headers can be passed in as specified in the HTTP at <a
     *        href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     *        >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.</p>
     *        <p>
     *        Headers with a custom user-defined value are also accepted.
     */

    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    /**
     * <p>
     * An optional <code>CacheControl</code> header that allows the caller to control the object's cache behavior.
     * Headers can be passed in as specified in the HTTP at <a
     * href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     * >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.
     * </p>
     * <p>
     * Headers with a custom user-defined value are also accepted.
     * </p>
     * 
     * @return An optional <code>CacheControl</code> header that allows the caller to control the object's cache
     *         behavior. Headers can be passed in as specified in the HTTP at <a
     *         href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     *         >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.</p>
     *         <p>
     *         Headers with a custom user-defined value are also accepted.
     */

    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * <p>
     * An optional <code>CacheControl</code> header that allows the caller to control the object's cache behavior.
     * Headers can be passed in as specified in the HTTP at <a
     * href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     * >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.
     * </p>
     * <p>
     * Headers with a custom user-defined value are also accepted.
     * </p>
     * 
     * @param cacheControl
     *        An optional <code>CacheControl</code> header that allows the caller to control the object's cache
     *        behavior. Headers can be passed in as specified in the HTTP at <a
     *        href="https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9"
     *        >https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9</a>.</p>
     *        <p>
     *        Headers with a custom user-defined value are also accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutObjectRequest withCacheControl(String cacheControl) {
        setCacheControl(cacheControl);
        return this;
    }

    /**
     * <p>
     * Indicates the storage class of a <code>Put</code> request. Defaults to high-performance temporal storage class,
     * and objects are persisted into durable storage shortly after being received.
     * </p>
     * 
     * @param storageClass
     *        Indicates the storage class of a <code>Put</code> request. Defaults to high-performance temporal storage
     *        class, and objects are persisted into durable storage shortly after being received.
     * @see StorageClass
     */

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * Indicates the storage class of a <code>Put</code> request. Defaults to high-performance temporal storage class,
     * and objects are persisted into durable storage shortly after being received.
     * </p>
     * 
     * @return Indicates the storage class of a <code>Put</code> request. Defaults to high-performance temporal storage
     *         class, and objects are persisted into durable storage shortly after being received.
     * @see StorageClass
     */

    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * <p>
     * Indicates the storage class of a <code>Put</code> request. Defaults to high-performance temporal storage class,
     * and objects are persisted into durable storage shortly after being received.
     * </p>
     * 
     * @param storageClass
     *        Indicates the storage class of a <code>Put</code> request. Defaults to high-performance temporal storage
     *        class, and objects are persisted into durable storage shortly after being received.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageClass
     */

    public PutObjectRequest withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * <p>
     * Indicates the storage class of a <code>Put</code> request. Defaults to high-performance temporal storage class,
     * and objects are persisted into durable storage shortly after being received.
     * </p>
     * 
     * @param storageClass
     *        Indicates the storage class of a <code>Put</code> request. Defaults to high-performance temporal storage
     *        class, and objects are persisted into durable storage shortly after being received.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageClass
     */

    public PutObjectRequest withStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
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
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getCacheControl() != null)
            sb.append("CacheControl: ").append(getCacheControl()).append(",");
        if (getStorageClass() != null)
            sb.append("StorageClass: ").append(getStorageClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutObjectRequest == false)
            return false;
        PutObjectRequest other = (PutObjectRequest) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getCacheControl() == null ^ this.getCacheControl() == null)
            return false;
        if (other.getCacheControl() != null && other.getCacheControl().equals(this.getCacheControl()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getCacheControl() == null) ? 0 : getCacheControl().hashCode());
        hashCode = prime * hashCode + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        return hashCode;
    }

    @Override
    public PutObjectRequest clone() {
        return (PutObjectRequest) super.clone();
    }

    @Override
    public String getSignerType() {
        return "AWS4UnsignedPayloadSignerType";
    }

}
