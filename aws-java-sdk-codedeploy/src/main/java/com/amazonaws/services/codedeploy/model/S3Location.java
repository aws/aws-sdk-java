/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the location of application artifacts that are
 * stored in Amazon S3.
 * </p>
 */
public class S3Location implements Serializable {

    /**
     * The name of the Amazon S3 bucket where the application revision is
     * stored.
     */
    private String bucket;

    /**
     * The name of the Amazon S3 object that represents the bundled artifacts
     * for the application revision.
     */
    private String key;

    /**
     * The file type of the application revision. Must be one of the
     * following: <ul> <li>tar: A tar archive file.</li> <li>tgz: A
     * compressed tar archive file.</li> <li>zip: A zip archive file.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tar, tgz, zip
     */
    private String bundleType;

    /**
     * A specific version of the Amazon S3 object that represents the bundled
     * artifacts for the application revision. <p>If the version is not
     * specified, the system will use the most recent version by default.
     */
    private String version;

    /**
     * The ETag of the Amazon S3 object that represents the bundled artifacts
     * for the application revision. <p>If the ETag is not specified as an
     * input parameter, ETag validation of the object will be skipped.
     */
    private String eTag;

    /**
     * The name of the Amazon S3 bucket where the application revision is
     * stored.
     *
     * @return The name of the Amazon S3 bucket where the application revision is
     *         stored.
     */
    public String getBucket() {
        return bucket;
    }
    
    /**
     * The name of the Amazon S3 bucket where the application revision is
     * stored.
     *
     * @param bucket The name of the Amazon S3 bucket where the application revision is
     *         stored.
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }
    
    /**
     * The name of the Amazon S3 bucket where the application revision is
     * stored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bucket The name of the Amazon S3 bucket where the application revision is
     *         stored.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public S3Location withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * The name of the Amazon S3 object that represents the bundled artifacts
     * for the application revision.
     *
     * @return The name of the Amazon S3 object that represents the bundled artifacts
     *         for the application revision.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The name of the Amazon S3 object that represents the bundled artifacts
     * for the application revision.
     *
     * @param key The name of the Amazon S3 object that represents the bundled artifacts
     *         for the application revision.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The name of the Amazon S3 object that represents the bundled artifacts
     * for the application revision.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key The name of the Amazon S3 object that represents the bundled artifacts
     *         for the application revision.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public S3Location withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * The file type of the application revision. Must be one of the
     * following: <ul> <li>tar: A tar archive file.</li> <li>tgz: A
     * compressed tar archive file.</li> <li>zip: A zip archive file.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tar, tgz, zip
     *
     * @return The file type of the application revision. Must be one of the
     *         following: <ul> <li>tar: A tar archive file.</li> <li>tgz: A
     *         compressed tar archive file.</li> <li>zip: A zip archive file.</li>
     *         </ul>
     *
     * @see BundleType
     */
    public String getBundleType() {
        return bundleType;
    }
    
    /**
     * The file type of the application revision. Must be one of the
     * following: <ul> <li>tar: A tar archive file.</li> <li>tgz: A
     * compressed tar archive file.</li> <li>zip: A zip archive file.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tar, tgz, zip
     *
     * @param bundleType The file type of the application revision. Must be one of the
     *         following: <ul> <li>tar: A tar archive file.</li> <li>tgz: A
     *         compressed tar archive file.</li> <li>zip: A zip archive file.</li>
     *         </ul>
     *
     * @see BundleType
     */
    public void setBundleType(String bundleType) {
        this.bundleType = bundleType;
    }
    
    /**
     * The file type of the application revision. Must be one of the
     * following: <ul> <li>tar: A tar archive file.</li> <li>tgz: A
     * compressed tar archive file.</li> <li>zip: A zip archive file.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tar, tgz, zip
     *
     * @param bundleType The file type of the application revision. Must be one of the
     *         following: <ul> <li>tar: A tar archive file.</li> <li>tgz: A
     *         compressed tar archive file.</li> <li>zip: A zip archive file.</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see BundleType
     */
    public S3Location withBundleType(String bundleType) {
        this.bundleType = bundleType;
        return this;
    }

    /**
     * The file type of the application revision. Must be one of the
     * following: <ul> <li>tar: A tar archive file.</li> <li>tgz: A
     * compressed tar archive file.</li> <li>zip: A zip archive file.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tar, tgz, zip
     *
     * @param bundleType The file type of the application revision. Must be one of the
     *         following: <ul> <li>tar: A tar archive file.</li> <li>tgz: A
     *         compressed tar archive file.</li> <li>zip: A zip archive file.</li>
     *         </ul>
     *
     * @see BundleType
     */
    public void setBundleType(BundleType bundleType) {
        this.bundleType = bundleType.toString();
    }
    
    /**
     * The file type of the application revision. Must be one of the
     * following: <ul> <li>tar: A tar archive file.</li> <li>tgz: A
     * compressed tar archive file.</li> <li>zip: A zip archive file.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tar, tgz, zip
     *
     * @param bundleType The file type of the application revision. Must be one of the
     *         following: <ul> <li>tar: A tar archive file.</li> <li>tgz: A
     *         compressed tar archive file.</li> <li>zip: A zip archive file.</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see BundleType
     */
    public S3Location withBundleType(BundleType bundleType) {
        this.bundleType = bundleType.toString();
        return this;
    }

    /**
     * A specific version of the Amazon S3 object that represents the bundled
     * artifacts for the application revision. <p>If the version is not
     * specified, the system will use the most recent version by default.
     *
     * @return A specific version of the Amazon S3 object that represents the bundled
     *         artifacts for the application revision. <p>If the version is not
     *         specified, the system will use the most recent version by default.
     */
    public String getVersion() {
        return version;
    }
    
    /**
     * A specific version of the Amazon S3 object that represents the bundled
     * artifacts for the application revision. <p>If the version is not
     * specified, the system will use the most recent version by default.
     *
     * @param version A specific version of the Amazon S3 object that represents the bundled
     *         artifacts for the application revision. <p>If the version is not
     *         specified, the system will use the most recent version by default.
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
    /**
     * A specific version of the Amazon S3 object that represents the bundled
     * artifacts for the application revision. <p>If the version is not
     * specified, the system will use the most recent version by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param version A specific version of the Amazon S3 object that represents the bundled
     *         artifacts for the application revision. <p>If the version is not
     *         specified, the system will use the most recent version by default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public S3Location withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * The ETag of the Amazon S3 object that represents the bundled artifacts
     * for the application revision. <p>If the ETag is not specified as an
     * input parameter, ETag validation of the object will be skipped.
     *
     * @return The ETag of the Amazon S3 object that represents the bundled artifacts
     *         for the application revision. <p>If the ETag is not specified as an
     *         input parameter, ETag validation of the object will be skipped.
     */
    public String getETag() {
        return eTag;
    }
    
    /**
     * The ETag of the Amazon S3 object that represents the bundled artifacts
     * for the application revision. <p>If the ETag is not specified as an
     * input parameter, ETag validation of the object will be skipped.
     *
     * @param eTag The ETag of the Amazon S3 object that represents the bundled artifacts
     *         for the application revision. <p>If the ETag is not specified as an
     *         input parameter, ETag validation of the object will be skipped.
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }
    
    /**
     * The ETag of the Amazon S3 object that represents the bundled artifacts
     * for the application revision. <p>If the ETag is not specified as an
     * input parameter, ETag validation of the object will be skipped.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eTag The ETag of the Amazon S3 object that represents the bundled artifacts
     *         for the application revision. <p>If the ETag is not specified as an
     *         input parameter, ETag validation of the object will be skipped.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public S3Location withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBucket() != null) sb.append("Bucket: " + getBucket() + ",");
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getBundleType() != null) sb.append("BundleType: " + getBundleType() + ",");
        if (getVersion() != null) sb.append("Version: " + getVersion() + ",");
        if (getETag() != null) sb.append("ETag: " + getETag() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode()); 
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getBundleType() == null) ? 0 : getBundleType().hashCode()); 
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode()); 
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3Location == false) return false;
        S3Location other = (S3Location)obj;
        
        if (other.getBucket() == null ^ this.getBucket() == null) return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false) return false; 
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getBundleType() == null ^ this.getBundleType() == null) return false;
        if (other.getBundleType() != null && other.getBundleType().equals(this.getBundleType()) == false) return false; 
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        if (other.getETag() == null ^ this.getETag() == null) return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false) return false; 
        return true;
    }
    
}
    