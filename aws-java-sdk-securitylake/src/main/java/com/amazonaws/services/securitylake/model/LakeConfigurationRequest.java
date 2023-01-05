/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details of Amazon Security Lake configuration object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/LakeConfigurationRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LakeConfigurationRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of encryption key used by Amazon Security Lake to encrypt the Security Lake configuration object.
     * </p>
     */
    private String encryptionKey;
    /**
     * <p>
     * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. Amazon S3 buckets that
     * are configured for object replication can be owned by the same Amazon Web Services account or by different
     * accounts. You can replicate objects to a single destination bucket or to multiple destination buckets. The
     * destination buckets can be in different Amazon Web Services Regions or within the same Region as the source
     * bucket.
     * </p>
     * <p>
     * Set up one or more rollup Regions by providing the Region or Regions that should contribute to the central rollup
     * Region.
     * </p>
     */
    private java.util.List<String> replicationDestinationRegions;
    /**
     * <p>
     * Replication settings for the Amazon S3 buckets. This parameter uses the Identity and Access Management (IAM) role
     * you created that is managed by Security Lake, to ensure the replication setting is correct.
     * </p>
     */
    private String replicationRoleArn;
    /**
     * <p>
     * Retention settings for the destination Amazon S3 buckets.
     * </p>
     */
    private java.util.List<RetentionSetting> retentionSettings;
    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     */
    private java.util.Map<String, String> tagsMap;

    /**
     * <p>
     * The type of encryption key used by Amazon Security Lake to encrypt the Security Lake configuration object.
     * </p>
     * 
     * @param encryptionKey
     *        The type of encryption key used by Amazon Security Lake to encrypt the Security Lake configuration object.
     */

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The type of encryption key used by Amazon Security Lake to encrypt the Security Lake configuration object.
     * </p>
     * 
     * @return The type of encryption key used by Amazon Security Lake to encrypt the Security Lake configuration
     *         object.
     */

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The type of encryption key used by Amazon Security Lake to encrypt the Security Lake configuration object.
     * </p>
     * 
     * @param encryptionKey
     *        The type of encryption key used by Amazon Security Lake to encrypt the Security Lake configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeConfigurationRequest withEncryptionKey(String encryptionKey) {
        setEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * <p>
     * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. Amazon S3 buckets that
     * are configured for object replication can be owned by the same Amazon Web Services account or by different
     * accounts. You can replicate objects to a single destination bucket or to multiple destination buckets. The
     * destination buckets can be in different Amazon Web Services Regions or within the same Region as the source
     * bucket.
     * </p>
     * <p>
     * Set up one or more rollup Regions by providing the Region or Regions that should contribute to the central rollup
     * Region.
     * </p>
     * 
     * @return Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. Amazon S3
     *         buckets that are configured for object replication can be owned by the same Amazon Web Services account
     *         or by different accounts. You can replicate objects to a single destination bucket or to multiple
     *         destination buckets. The destination buckets can be in different Amazon Web Services Regions or within
     *         the same Region as the source bucket.</p>
     *         <p>
     *         Set up one or more rollup Regions by providing the Region or Regions that should contribute to the
     *         central rollup Region.
     * @see Region
     */

    public java.util.List<String> getReplicationDestinationRegions() {
        return replicationDestinationRegions;
    }

    /**
     * <p>
     * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. Amazon S3 buckets that
     * are configured for object replication can be owned by the same Amazon Web Services account or by different
     * accounts. You can replicate objects to a single destination bucket or to multiple destination buckets. The
     * destination buckets can be in different Amazon Web Services Regions or within the same Region as the source
     * bucket.
     * </p>
     * <p>
     * Set up one or more rollup Regions by providing the Region or Regions that should contribute to the central rollup
     * Region.
     * </p>
     * 
     * @param replicationDestinationRegions
     *        Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. Amazon S3 buckets
     *        that are configured for object replication can be owned by the same Amazon Web Services account or by
     *        different accounts. You can replicate objects to a single destination bucket or to multiple destination
     *        buckets. The destination buckets can be in different Amazon Web Services Regions or within the same Region
     *        as the source bucket.</p>
     *        <p>
     *        Set up one or more rollup Regions by providing the Region or Regions that should contribute to the central
     *        rollup Region.
     * @see Region
     */

    public void setReplicationDestinationRegions(java.util.Collection<String> replicationDestinationRegions) {
        if (replicationDestinationRegions == null) {
            this.replicationDestinationRegions = null;
            return;
        }

        this.replicationDestinationRegions = new java.util.ArrayList<String>(replicationDestinationRegions);
    }

    /**
     * <p>
     * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. Amazon S3 buckets that
     * are configured for object replication can be owned by the same Amazon Web Services account or by different
     * accounts. You can replicate objects to a single destination bucket or to multiple destination buckets. The
     * destination buckets can be in different Amazon Web Services Regions or within the same Region as the source
     * bucket.
     * </p>
     * <p>
     * Set up one or more rollup Regions by providing the Region or Regions that should contribute to the central rollup
     * Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationDestinationRegions(java.util.Collection)} or
     * {@link #withReplicationDestinationRegions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param replicationDestinationRegions
     *        Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. Amazon S3 buckets
     *        that are configured for object replication can be owned by the same Amazon Web Services account or by
     *        different accounts. You can replicate objects to a single destination bucket or to multiple destination
     *        buckets. The destination buckets can be in different Amazon Web Services Regions or within the same Region
     *        as the source bucket.</p>
     *        <p>
     *        Set up one or more rollup Regions by providing the Region or Regions that should contribute to the central
     *        rollup Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Region
     */

    public LakeConfigurationRequest withReplicationDestinationRegions(String... replicationDestinationRegions) {
        if (this.replicationDestinationRegions == null) {
            setReplicationDestinationRegions(new java.util.ArrayList<String>(replicationDestinationRegions.length));
        }
        for (String ele : replicationDestinationRegions) {
            this.replicationDestinationRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. Amazon S3 buckets that
     * are configured for object replication can be owned by the same Amazon Web Services account or by different
     * accounts. You can replicate objects to a single destination bucket or to multiple destination buckets. The
     * destination buckets can be in different Amazon Web Services Regions or within the same Region as the source
     * bucket.
     * </p>
     * <p>
     * Set up one or more rollup Regions by providing the Region or Regions that should contribute to the central rollup
     * Region.
     * </p>
     * 
     * @param replicationDestinationRegions
     *        Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. Amazon S3 buckets
     *        that are configured for object replication can be owned by the same Amazon Web Services account or by
     *        different accounts. You can replicate objects to a single destination bucket or to multiple destination
     *        buckets. The destination buckets can be in different Amazon Web Services Regions or within the same Region
     *        as the source bucket.</p>
     *        <p>
     *        Set up one or more rollup Regions by providing the Region or Regions that should contribute to the central
     *        rollup Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Region
     */

    public LakeConfigurationRequest withReplicationDestinationRegions(java.util.Collection<String> replicationDestinationRegions) {
        setReplicationDestinationRegions(replicationDestinationRegions);
        return this;
    }

    /**
     * <p>
     * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. Amazon S3 buckets that
     * are configured for object replication can be owned by the same Amazon Web Services account or by different
     * accounts. You can replicate objects to a single destination bucket or to multiple destination buckets. The
     * destination buckets can be in different Amazon Web Services Regions or within the same Region as the source
     * bucket.
     * </p>
     * <p>
     * Set up one or more rollup Regions by providing the Region or Regions that should contribute to the central rollup
     * Region.
     * </p>
     * 
     * @param replicationDestinationRegions
     *        Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. Amazon S3 buckets
     *        that are configured for object replication can be owned by the same Amazon Web Services account or by
     *        different accounts. You can replicate objects to a single destination bucket or to multiple destination
     *        buckets. The destination buckets can be in different Amazon Web Services Regions or within the same Region
     *        as the source bucket.</p>
     *        <p>
     *        Set up one or more rollup Regions by providing the Region or Regions that should contribute to the central
     *        rollup Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Region
     */

    public LakeConfigurationRequest withReplicationDestinationRegions(Region... replicationDestinationRegions) {
        java.util.ArrayList<String> replicationDestinationRegionsCopy = new java.util.ArrayList<String>(replicationDestinationRegions.length);
        for (Region value : replicationDestinationRegions) {
            replicationDestinationRegionsCopy.add(value.toString());
        }
        if (getReplicationDestinationRegions() == null) {
            setReplicationDestinationRegions(replicationDestinationRegionsCopy);
        } else {
            getReplicationDestinationRegions().addAll(replicationDestinationRegionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Replication settings for the Amazon S3 buckets. This parameter uses the Identity and Access Management (IAM) role
     * you created that is managed by Security Lake, to ensure the replication setting is correct.
     * </p>
     * 
     * @param replicationRoleArn
     *        Replication settings for the Amazon S3 buckets. This parameter uses the Identity and Access Management
     *        (IAM) role you created that is managed by Security Lake, to ensure the replication setting is correct.
     */

    public void setReplicationRoleArn(String replicationRoleArn) {
        this.replicationRoleArn = replicationRoleArn;
    }

    /**
     * <p>
     * Replication settings for the Amazon S3 buckets. This parameter uses the Identity and Access Management (IAM) role
     * you created that is managed by Security Lake, to ensure the replication setting is correct.
     * </p>
     * 
     * @return Replication settings for the Amazon S3 buckets. This parameter uses the Identity and Access Management
     *         (IAM) role you created that is managed by Security Lake, to ensure the replication setting is correct.
     */

    public String getReplicationRoleArn() {
        return this.replicationRoleArn;
    }

    /**
     * <p>
     * Replication settings for the Amazon S3 buckets. This parameter uses the Identity and Access Management (IAM) role
     * you created that is managed by Security Lake, to ensure the replication setting is correct.
     * </p>
     * 
     * @param replicationRoleArn
     *        Replication settings for the Amazon S3 buckets. This parameter uses the Identity and Access Management
     *        (IAM) role you created that is managed by Security Lake, to ensure the replication setting is correct.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeConfigurationRequest withReplicationRoleArn(String replicationRoleArn) {
        setReplicationRoleArn(replicationRoleArn);
        return this;
    }

    /**
     * <p>
     * Retention settings for the destination Amazon S3 buckets.
     * </p>
     * 
     * @return Retention settings for the destination Amazon S3 buckets.
     */

    public java.util.List<RetentionSetting> getRetentionSettings() {
        return retentionSettings;
    }

    /**
     * <p>
     * Retention settings for the destination Amazon S3 buckets.
     * </p>
     * 
     * @param retentionSettings
     *        Retention settings for the destination Amazon S3 buckets.
     */

    public void setRetentionSettings(java.util.Collection<RetentionSetting> retentionSettings) {
        if (retentionSettings == null) {
            this.retentionSettings = null;
            return;
        }

        this.retentionSettings = new java.util.ArrayList<RetentionSetting>(retentionSettings);
    }

    /**
     * <p>
     * Retention settings for the destination Amazon S3 buckets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRetentionSettings(java.util.Collection)} or {@link #withRetentionSettings(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param retentionSettings
     *        Retention settings for the destination Amazon S3 buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeConfigurationRequest withRetentionSettings(RetentionSetting... retentionSettings) {
        if (this.retentionSettings == null) {
            setRetentionSettings(new java.util.ArrayList<RetentionSetting>(retentionSettings.length));
        }
        for (RetentionSetting ele : retentionSettings) {
            this.retentionSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Retention settings for the destination Amazon S3 buckets.
     * </p>
     * 
     * @param retentionSettings
     *        Retention settings for the destination Amazon S3 buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeConfigurationRequest withRetentionSettings(java.util.Collection<RetentionSetting> retentionSettings) {
        setRetentionSettings(retentionSettings);
        return this;
    }

    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * 
     * @return A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *         optional value, both of which you define.
     */

    public java.util.Map<String, String> getTagsMap() {
        return tagsMap;
    }

    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * 
     * @param tagsMap
     *        A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *        optional value, both of which you define.
     */

    public void setTagsMap(java.util.Map<String, String> tagsMap) {
        this.tagsMap = tagsMap;
    }

    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * 
     * @param tagsMap
     *        A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *        optional value, both of which you define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeConfigurationRequest withTagsMap(java.util.Map<String, String> tagsMap) {
        setTagsMap(tagsMap);
        return this;
    }

    /**
     * Add a single TagsMap entry
     *
     * @see LakeConfigurationRequest#withTagsMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LakeConfigurationRequest addTagsMapEntry(String key, String value) {
        if (null == this.tagsMap) {
            this.tagsMap = new java.util.HashMap<String, String>();
        }
        if (this.tagsMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tagsMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TagsMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeConfigurationRequest clearTagsMapEntries() {
        this.tagsMap = null;
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
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey()).append(",");
        if (getReplicationDestinationRegions() != null)
            sb.append("ReplicationDestinationRegions: ").append(getReplicationDestinationRegions()).append(",");
        if (getReplicationRoleArn() != null)
            sb.append("ReplicationRoleArn: ").append(getReplicationRoleArn()).append(",");
        if (getRetentionSettings() != null)
            sb.append("RetentionSettings: ").append(getRetentionSettings()).append(",");
        if (getTagsMap() != null)
            sb.append("TagsMap: ").append(getTagsMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LakeConfigurationRequest == false)
            return false;
        LakeConfigurationRequest other = (LakeConfigurationRequest) obj;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getReplicationDestinationRegions() == null ^ this.getReplicationDestinationRegions() == null)
            return false;
        if (other.getReplicationDestinationRegions() != null
                && other.getReplicationDestinationRegions().equals(this.getReplicationDestinationRegions()) == false)
            return false;
        if (other.getReplicationRoleArn() == null ^ this.getReplicationRoleArn() == null)
            return false;
        if (other.getReplicationRoleArn() != null && other.getReplicationRoleArn().equals(this.getReplicationRoleArn()) == false)
            return false;
        if (other.getRetentionSettings() == null ^ this.getRetentionSettings() == null)
            return false;
        if (other.getRetentionSettings() != null && other.getRetentionSettings().equals(this.getRetentionSettings()) == false)
            return false;
        if (other.getTagsMap() == null ^ this.getTagsMap() == null)
            return false;
        if (other.getTagsMap() != null && other.getTagsMap().equals(this.getTagsMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getReplicationDestinationRegions() == null) ? 0 : getReplicationDestinationRegions().hashCode());
        hashCode = prime * hashCode + ((getReplicationRoleArn() == null) ? 0 : getReplicationRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRetentionSettings() == null) ? 0 : getRetentionSettings().hashCode());
        hashCode = prime * hashCode + ((getTagsMap() == null) ? 0 : getTagsMap().hashCode());
        return hashCode;
    }

    @Override
    public LakeConfigurationRequest clone() {
        try {
            return (LakeConfigurationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.LakeConfigurationRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
