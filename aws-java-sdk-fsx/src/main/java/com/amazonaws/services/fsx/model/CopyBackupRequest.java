/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CopyBackup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyBackupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String clientRequestToken;
    /**
     * <p>
     * The ID of the source backup. Specifies the ID of the backup that is being copied.
     * </p>
     */
    private String sourceBackupId;
    /**
     * <p>
     * The source AWS Region of the backup. Specifies the AWS Region from which the backup is being copied. The source
     * and destination Regions must be in the same AWS partition. If you don't specify a Region, it defaults to the
     * Region where the request is sent from (in-Region copy).
     * </p>
     */
    private String sourceRegion;

    private String kmsKeyId;
    /**
     * <p>
     * A boolean flag indicating whether tags from the source backup should be copied to the backup copy. This value
     * defaults to false.
     * </p>
     * <p>
     * If you set <code>CopyTags</code> to true and the source backup has existing tags, you can use the
     * <code>Tags</code> parameter to create new tags, provided that the sum of the source backup tags and the new tags
     * doesn't exceed 50. Both sets of tags are merged. If there are tag conflicts (for example, two tags with the same
     * key but different values), the tags created with the <code>Tags</code> parameter take precedence.
     * </p>
     */
    private Boolean copyTags;

    private java.util.List<Tag> tags;

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyBackupRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The ID of the source backup. Specifies the ID of the backup that is being copied.
     * </p>
     * 
     * @param sourceBackupId
     *        The ID of the source backup. Specifies the ID of the backup that is being copied.
     */

    public void setSourceBackupId(String sourceBackupId) {
        this.sourceBackupId = sourceBackupId;
    }

    /**
     * <p>
     * The ID of the source backup. Specifies the ID of the backup that is being copied.
     * </p>
     * 
     * @return The ID of the source backup. Specifies the ID of the backup that is being copied.
     */

    public String getSourceBackupId() {
        return this.sourceBackupId;
    }

    /**
     * <p>
     * The ID of the source backup. Specifies the ID of the backup that is being copied.
     * </p>
     * 
     * @param sourceBackupId
     *        The ID of the source backup. Specifies the ID of the backup that is being copied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyBackupRequest withSourceBackupId(String sourceBackupId) {
        setSourceBackupId(sourceBackupId);
        return this;
    }

    /**
     * <p>
     * The source AWS Region of the backup. Specifies the AWS Region from which the backup is being copied. The source
     * and destination Regions must be in the same AWS partition. If you don't specify a Region, it defaults to the
     * Region where the request is sent from (in-Region copy).
     * </p>
     * 
     * @param sourceRegion
     *        The source AWS Region of the backup. Specifies the AWS Region from which the backup is being copied. The
     *        source and destination Regions must be in the same AWS partition. If you don't specify a Region, it
     *        defaults to the Region where the request is sent from (in-Region copy).
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The source AWS Region of the backup. Specifies the AWS Region from which the backup is being copied. The source
     * and destination Regions must be in the same AWS partition. If you don't specify a Region, it defaults to the
     * Region where the request is sent from (in-Region copy).
     * </p>
     * 
     * @return The source AWS Region of the backup. Specifies the AWS Region from which the backup is being copied. The
     *         source and destination Regions must be in the same AWS partition. If you don't specify a Region, it
     *         defaults to the Region where the request is sent from (in-Region copy).
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * The source AWS Region of the backup. Specifies the AWS Region from which the backup is being copied. The source
     * and destination Regions must be in the same AWS partition. If you don't specify a Region, it defaults to the
     * Region where the request is sent from (in-Region copy).
     * </p>
     * 
     * @param sourceRegion
     *        The source AWS Region of the backup. Specifies the AWS Region from which the backup is being copied. The
     *        source and destination Regions must be in the same AWS partition. If you don't specify a Region, it
     *        defaults to the Region where the request is sent from (in-Region copy).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyBackupRequest withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * @param kmsKeyId
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * @return
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * @param kmsKeyId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyBackupRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags from the source backup should be copied to the backup copy. This value
     * defaults to false.
     * </p>
     * <p>
     * If you set <code>CopyTags</code> to true and the source backup has existing tags, you can use the
     * <code>Tags</code> parameter to create new tags, provided that the sum of the source backup tags and the new tags
     * doesn't exceed 50. Both sets of tags are merged. If there are tag conflicts (for example, two tags with the same
     * key but different values), the tags created with the <code>Tags</code> parameter take precedence.
     * </p>
     * 
     * @param copyTags
     *        A boolean flag indicating whether tags from the source backup should be copied to the backup copy. This
     *        value defaults to false.</p>
     *        <p>
     *        If you set <code>CopyTags</code> to true and the source backup has existing tags, you can use the
     *        <code>Tags</code> parameter to create new tags, provided that the sum of the source backup tags and the
     *        new tags doesn't exceed 50. Both sets of tags are merged. If there are tag conflicts (for example, two
     *        tags with the same key but different values), the tags created with the <code>Tags</code> parameter take
     *        precedence.
     */

    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags from the source backup should be copied to the backup copy. This value
     * defaults to false.
     * </p>
     * <p>
     * If you set <code>CopyTags</code> to true and the source backup has existing tags, you can use the
     * <code>Tags</code> parameter to create new tags, provided that the sum of the source backup tags and the new tags
     * doesn't exceed 50. Both sets of tags are merged. If there are tag conflicts (for example, two tags with the same
     * key but different values), the tags created with the <code>Tags</code> parameter take precedence.
     * </p>
     * 
     * @return A boolean flag indicating whether tags from the source backup should be copied to the backup copy. This
     *         value defaults to false.</p>
     *         <p>
     *         If you set <code>CopyTags</code> to true and the source backup has existing tags, you can use the
     *         <code>Tags</code> parameter to create new tags, provided that the sum of the source backup tags and the
     *         new tags doesn't exceed 50. Both sets of tags are merged. If there are tag conflicts (for example, two
     *         tags with the same key but different values), the tags created with the <code>Tags</code> parameter take
     *         precedence.
     */

    public Boolean getCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags from the source backup should be copied to the backup copy. This value
     * defaults to false.
     * </p>
     * <p>
     * If you set <code>CopyTags</code> to true and the source backup has existing tags, you can use the
     * <code>Tags</code> parameter to create new tags, provided that the sum of the source backup tags and the new tags
     * doesn't exceed 50. Both sets of tags are merged. If there are tag conflicts (for example, two tags with the same
     * key but different values), the tags created with the <code>Tags</code> parameter take precedence.
     * </p>
     * 
     * @param copyTags
     *        A boolean flag indicating whether tags from the source backup should be copied to the backup copy. This
     *        value defaults to false.</p>
     *        <p>
     *        If you set <code>CopyTags</code> to true and the source backup has existing tags, you can use the
     *        <code>Tags</code> parameter to create new tags, provided that the sum of the source backup tags and the
     *        new tags doesn't exceed 50. Both sets of tags are merged. If there are tag conflicts (for example, two
     *        tags with the same key but different values), the tags created with the <code>Tags</code> parameter take
     *        precedence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyBackupRequest withCopyTags(Boolean copyTags) {
        setCopyTags(copyTags);
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags from the source backup should be copied to the backup copy. This value
     * defaults to false.
     * </p>
     * <p>
     * If you set <code>CopyTags</code> to true and the source backup has existing tags, you can use the
     * <code>Tags</code> parameter to create new tags, provided that the sum of the source backup tags and the new tags
     * doesn't exceed 50. Both sets of tags are merged. If there are tag conflicts (for example, two tags with the same
     * key but different values), the tags created with the <code>Tags</code> parameter take precedence.
     * </p>
     * 
     * @return A boolean flag indicating whether tags from the source backup should be copied to the backup copy. This
     *         value defaults to false.</p>
     *         <p>
     *         If you set <code>CopyTags</code> to true and the source backup has existing tags, you can use the
     *         <code>Tags</code> parameter to create new tags, provided that the sum of the source backup tags and the
     *         new tags doesn't exceed 50. Both sets of tags are merged. If there are tag conflicts (for example, two
     *         tags with the same key but different values), the tags created with the <code>Tags</code> parameter take
     *         precedence.
     */

    public Boolean isCopyTags() {
        return this.copyTags;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyBackupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyBackupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getSourceBackupId() != null)
            sb.append("SourceBackupId: ").append(getSourceBackupId()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getCopyTags() != null)
            sb.append("CopyTags: ").append(getCopyTags()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyBackupRequest == false)
            return false;
        CopyBackupRequest other = (CopyBackupRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getSourceBackupId() == null ^ this.getSourceBackupId() == null)
            return false;
        if (other.getSourceBackupId() != null && other.getSourceBackupId().equals(this.getSourceBackupId()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getCopyTags() == null ^ this.getCopyTags() == null)
            return false;
        if (other.getCopyTags() != null && other.getCopyTags().equals(this.getCopyTags()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getSourceBackupId() == null) ? 0 : getSourceBackupId().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CopyBackupRequest clone() {
        return (CopyBackupRequest) super.clone();
    }

}
