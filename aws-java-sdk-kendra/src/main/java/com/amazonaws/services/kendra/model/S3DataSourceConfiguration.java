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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides configuration information for a data source to index documents in an Amazon S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/S3DataSourceConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DataSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the bucket that contains the documents.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * A list of S3 prefixes for the documents that should be included in the index.
     * </p>
     */
    private java.util.List<String> inclusionPrefixes;
    /**
     * <p>
     * A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion prefix
     * also matches an exclusion pattern, the document is not indexed.
     * </p>
     * <p>
     * For more information about glob patterns, see <a href="http://wikipedia.org/wiki/Glob_%28programming%29">glob
     * (programming)</a> in <i>Wikipedia</i>.
     * </p>
     */
    private java.util.List<String> exclusionPatterns;

    private DocumentsMetadataConfiguration documentsMetadataConfiguration;
    /**
     * <p>
     * Provides the path to the S3 bucket that contains the user context filtering files for the data source.
     * </p>
     */
    private AccessControlListConfiguration accessControlListConfiguration;

    /**
     * <p>
     * The name of the bucket that contains the documents.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket that contains the documents.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the bucket that contains the documents.
     * </p>
     * 
     * @return The name of the bucket that contains the documents.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the bucket that contains the documents.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket that contains the documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataSourceConfiguration withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * A list of S3 prefixes for the documents that should be included in the index.
     * </p>
     * 
     * @return A list of S3 prefixes for the documents that should be included in the index.
     */

    public java.util.List<String> getInclusionPrefixes() {
        return inclusionPrefixes;
    }

    /**
     * <p>
     * A list of S3 prefixes for the documents that should be included in the index.
     * </p>
     * 
     * @param inclusionPrefixes
     *        A list of S3 prefixes for the documents that should be included in the index.
     */

    public void setInclusionPrefixes(java.util.Collection<String> inclusionPrefixes) {
        if (inclusionPrefixes == null) {
            this.inclusionPrefixes = null;
            return;
        }

        this.inclusionPrefixes = new java.util.ArrayList<String>(inclusionPrefixes);
    }

    /**
     * <p>
     * A list of S3 prefixes for the documents that should be included in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionPrefixes(java.util.Collection)} or {@link #withInclusionPrefixes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inclusionPrefixes
     *        A list of S3 prefixes for the documents that should be included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataSourceConfiguration withInclusionPrefixes(String... inclusionPrefixes) {
        if (this.inclusionPrefixes == null) {
            setInclusionPrefixes(new java.util.ArrayList<String>(inclusionPrefixes.length));
        }
        for (String ele : inclusionPrefixes) {
            this.inclusionPrefixes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of S3 prefixes for the documents that should be included in the index.
     * </p>
     * 
     * @param inclusionPrefixes
     *        A list of S3 prefixes for the documents that should be included in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataSourceConfiguration withInclusionPrefixes(java.util.Collection<String> inclusionPrefixes) {
        setInclusionPrefixes(inclusionPrefixes);
        return this;
    }

    /**
     * <p>
     * A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion prefix
     * also matches an exclusion pattern, the document is not indexed.
     * </p>
     * <p>
     * For more information about glob patterns, see <a href="http://wikipedia.org/wiki/Glob_%28programming%29">glob
     * (programming)</a> in <i>Wikipedia</i>.
     * </p>
     * 
     * @return A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion
     *         prefix also matches an exclusion pattern, the document is not indexed.</p>
     *         <p>
     *         For more information about glob patterns, see <a
     *         href="http://wikipedia.org/wiki/Glob_%28programming%29">glob (programming)</a> in <i>Wikipedia</i>.
     */

    public java.util.List<String> getExclusionPatterns() {
        return exclusionPatterns;
    }

    /**
     * <p>
     * A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion prefix
     * also matches an exclusion pattern, the document is not indexed.
     * </p>
     * <p>
     * For more information about glob patterns, see <a href="http://wikipedia.org/wiki/Glob_%28programming%29">glob
     * (programming)</a> in <i>Wikipedia</i>.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion
     *        prefix also matches an exclusion pattern, the document is not indexed.</p>
     *        <p>
     *        For more information about glob patterns, see <a
     *        href="http://wikipedia.org/wiki/Glob_%28programming%29">glob (programming)</a> in <i>Wikipedia</i>.
     */

    public void setExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        if (exclusionPatterns == null) {
            this.exclusionPatterns = null;
            return;
        }

        this.exclusionPatterns = new java.util.ArrayList<String>(exclusionPatterns);
    }

    /**
     * <p>
     * A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion prefix
     * also matches an exclusion pattern, the document is not indexed.
     * </p>
     * <p>
     * For more information about glob patterns, see <a href="http://wikipedia.org/wiki/Glob_%28programming%29">glob
     * (programming)</a> in <i>Wikipedia</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusionPatterns(java.util.Collection)} or {@link #withExclusionPatterns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion
     *        prefix also matches an exclusion pattern, the document is not indexed.</p>
     *        <p>
     *        For more information about glob patterns, see <a
     *        href="http://wikipedia.org/wiki/Glob_%28programming%29">glob (programming)</a> in <i>Wikipedia</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataSourceConfiguration withExclusionPatterns(String... exclusionPatterns) {
        if (this.exclusionPatterns == null) {
            setExclusionPatterns(new java.util.ArrayList<String>(exclusionPatterns.length));
        }
        for (String ele : exclusionPatterns) {
            this.exclusionPatterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion prefix
     * also matches an exclusion pattern, the document is not indexed.
     * </p>
     * <p>
     * For more information about glob patterns, see <a href="http://wikipedia.org/wiki/Glob_%28programming%29">glob
     * (programming)</a> in <i>Wikipedia</i>.
     * </p>
     * 
     * @param exclusionPatterns
     *        A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion
     *        prefix also matches an exclusion pattern, the document is not indexed.</p>
     *        <p>
     *        For more information about glob patterns, see <a
     *        href="http://wikipedia.org/wiki/Glob_%28programming%29">glob (programming)</a> in <i>Wikipedia</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataSourceConfiguration withExclusionPatterns(java.util.Collection<String> exclusionPatterns) {
        setExclusionPatterns(exclusionPatterns);
        return this;
    }

    /**
     * @param documentsMetadataConfiguration
     */

    public void setDocumentsMetadataConfiguration(DocumentsMetadataConfiguration documentsMetadataConfiguration) {
        this.documentsMetadataConfiguration = documentsMetadataConfiguration;
    }

    /**
     * @return
     */

    public DocumentsMetadataConfiguration getDocumentsMetadataConfiguration() {
        return this.documentsMetadataConfiguration;
    }

    /**
     * @param documentsMetadataConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataSourceConfiguration withDocumentsMetadataConfiguration(DocumentsMetadataConfiguration documentsMetadataConfiguration) {
        setDocumentsMetadataConfiguration(documentsMetadataConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides the path to the S3 bucket that contains the user context filtering files for the data source.
     * </p>
     * 
     * @param accessControlListConfiguration
     *        Provides the path to the S3 bucket that contains the user context filtering files for the data source.
     */

    public void setAccessControlListConfiguration(AccessControlListConfiguration accessControlListConfiguration) {
        this.accessControlListConfiguration = accessControlListConfiguration;
    }

    /**
     * <p>
     * Provides the path to the S3 bucket that contains the user context filtering files for the data source.
     * </p>
     * 
     * @return Provides the path to the S3 bucket that contains the user context filtering files for the data source.
     */

    public AccessControlListConfiguration getAccessControlListConfiguration() {
        return this.accessControlListConfiguration;
    }

    /**
     * <p>
     * Provides the path to the S3 bucket that contains the user context filtering files for the data source.
     * </p>
     * 
     * @param accessControlListConfiguration
     *        Provides the path to the S3 bucket that contains the user context filtering files for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataSourceConfiguration withAccessControlListConfiguration(AccessControlListConfiguration accessControlListConfiguration) {
        setAccessControlListConfiguration(accessControlListConfiguration);
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getInclusionPrefixes() != null)
            sb.append("InclusionPrefixes: ").append(getInclusionPrefixes()).append(",");
        if (getExclusionPatterns() != null)
            sb.append("ExclusionPatterns: ").append(getExclusionPatterns()).append(",");
        if (getDocumentsMetadataConfiguration() != null)
            sb.append("DocumentsMetadataConfiguration: ").append(getDocumentsMetadataConfiguration()).append(",");
        if (getAccessControlListConfiguration() != null)
            sb.append("AccessControlListConfiguration: ").append(getAccessControlListConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DataSourceConfiguration == false)
            return false;
        S3DataSourceConfiguration other = (S3DataSourceConfiguration) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getInclusionPrefixes() == null ^ this.getInclusionPrefixes() == null)
            return false;
        if (other.getInclusionPrefixes() != null && other.getInclusionPrefixes().equals(this.getInclusionPrefixes()) == false)
            return false;
        if (other.getExclusionPatterns() == null ^ this.getExclusionPatterns() == null)
            return false;
        if (other.getExclusionPatterns() != null && other.getExclusionPatterns().equals(this.getExclusionPatterns()) == false)
            return false;
        if (other.getDocumentsMetadataConfiguration() == null ^ this.getDocumentsMetadataConfiguration() == null)
            return false;
        if (other.getDocumentsMetadataConfiguration() != null
                && other.getDocumentsMetadataConfiguration().equals(this.getDocumentsMetadataConfiguration()) == false)
            return false;
        if (other.getAccessControlListConfiguration() == null ^ this.getAccessControlListConfiguration() == null)
            return false;
        if (other.getAccessControlListConfiguration() != null
                && other.getAccessControlListConfiguration().equals(this.getAccessControlListConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getInclusionPrefixes() == null) ? 0 : getInclusionPrefixes().hashCode());
        hashCode = prime * hashCode + ((getExclusionPatterns() == null) ? 0 : getExclusionPatterns().hashCode());
        hashCode = prime * hashCode + ((getDocumentsMetadataConfiguration() == null) ? 0 : getDocumentsMetadataConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAccessControlListConfiguration() == null) ? 0 : getAccessControlListConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public S3DataSourceConfiguration clone() {
        try {
            return (S3DataSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.S3DataSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
