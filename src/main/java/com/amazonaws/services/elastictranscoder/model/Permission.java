/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;


/**
 * <p>
 * The <code>Permission</code> structure.
 * </p>
 */
public class Permission implements Serializable {

    /**
     * The type of value that appears in the Grantee object: <ul>
     * <li><code>Canonical</code>: Either the canonical user ID for an AWS
     * account or an origin access identity for an Amazon CloudFront
     * distribution. <important>A canonical user ID is not the same as an AWS
     * account number.</important></li> <li><code>Email</code>: The
     * registered email address of an AWS account.</li>
     * <li><code>Group</code>: One of the following predefined Amazon S3
     * groups: <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     * <code>LogDelivery</code>.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Canonical$)|(^Email$)|(^Group$)<br/>
     */
    private String granteeType;

    /**
     * The AWS user or group that you want to have access to transcoded files
     * and playlists. To identify the user or group, you can specify the
     * canonical user ID for an AWS account, an origin access identity for a
     * CloudFront distribution, the registered email address of an AWS
     * account, or a predefined Amazon S3 group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String grantee;

    /**
     * The permission that you want to give to the AWS user that is listed in
     * Grantee. Valid values include: <ul> <li><code>READ</code>: The grantee
     * can read the thumbnails and metadata for thumbnails that Elastic
     * Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     * WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds
     * to the Amazon S3 bucket.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> access;

    /**
     * The type of value that appears in the Grantee object: <ul>
     * <li><code>Canonical</code>: Either the canonical user ID for an AWS
     * account or an origin access identity for an Amazon CloudFront
     * distribution. <important>A canonical user ID is not the same as an AWS
     * account number.</important></li> <li><code>Email</code>: The
     * registered email address of an AWS account.</li>
     * <li><code>Group</code>: One of the following predefined Amazon S3
     * groups: <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     * <code>LogDelivery</code>.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Canonical$)|(^Email$)|(^Group$)<br/>
     *
     * @return The type of value that appears in the Grantee object: <ul>
     *         <li><code>Canonical</code>: Either the canonical user ID for an AWS
     *         account or an origin access identity for an Amazon CloudFront
     *         distribution. <important>A canonical user ID is not the same as an AWS
     *         account number.</important></li> <li><code>Email</code>: The
     *         registered email address of an AWS account.</li>
     *         <li><code>Group</code>: One of the following predefined Amazon S3
     *         groups: <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     *         <code>LogDelivery</code>.</li> </ul>
     */
    public String getGranteeType() {
        return granteeType;
    }
    
    /**
     * The type of value that appears in the Grantee object: <ul>
     * <li><code>Canonical</code>: Either the canonical user ID for an AWS
     * account or an origin access identity for an Amazon CloudFront
     * distribution. <important>A canonical user ID is not the same as an AWS
     * account number.</important></li> <li><code>Email</code>: The
     * registered email address of an AWS account.</li>
     * <li><code>Group</code>: One of the following predefined Amazon S3
     * groups: <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     * <code>LogDelivery</code>.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Canonical$)|(^Email$)|(^Group$)<br/>
     *
     * @param granteeType The type of value that appears in the Grantee object: <ul>
     *         <li><code>Canonical</code>: Either the canonical user ID for an AWS
     *         account or an origin access identity for an Amazon CloudFront
     *         distribution. <important>A canonical user ID is not the same as an AWS
     *         account number.</important></li> <li><code>Email</code>: The
     *         registered email address of an AWS account.</li>
     *         <li><code>Group</code>: One of the following predefined Amazon S3
     *         groups: <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     *         <code>LogDelivery</code>.</li> </ul>
     */
    public void setGranteeType(String granteeType) {
        this.granteeType = granteeType;
    }
    
    /**
     * The type of value that appears in the Grantee object: <ul>
     * <li><code>Canonical</code>: Either the canonical user ID for an AWS
     * account or an origin access identity for an Amazon CloudFront
     * distribution. <important>A canonical user ID is not the same as an AWS
     * account number.</important></li> <li><code>Email</code>: The
     * registered email address of an AWS account.</li>
     * <li><code>Group</code>: One of the following predefined Amazon S3
     * groups: <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     * <code>LogDelivery</code>.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Canonical$)|(^Email$)|(^Group$)<br/>
     *
     * @param granteeType The type of value that appears in the Grantee object: <ul>
     *         <li><code>Canonical</code>: Either the canonical user ID for an AWS
     *         account or an origin access identity for an Amazon CloudFront
     *         distribution. <important>A canonical user ID is not the same as an AWS
     *         account number.</important></li> <li><code>Email</code>: The
     *         registered email address of an AWS account.</li>
     *         <li><code>Group</code>: One of the following predefined Amazon S3
     *         groups: <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     *         <code>LogDelivery</code>.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Permission withGranteeType(String granteeType) {
        this.granteeType = granteeType;
        return this;
    }

    /**
     * The AWS user or group that you want to have access to transcoded files
     * and playlists. To identify the user or group, you can specify the
     * canonical user ID for an AWS account, an origin access identity for a
     * CloudFront distribution, the registered email address of an AWS
     * account, or a predefined Amazon S3 group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The AWS user or group that you want to have access to transcoded files
     *         and playlists. To identify the user or group, you can specify the
     *         canonical user ID for an AWS account, an origin access identity for a
     *         CloudFront distribution, the registered email address of an AWS
     *         account, or a predefined Amazon S3 group.
     */
    public String getGrantee() {
        return grantee;
    }
    
    /**
     * The AWS user or group that you want to have access to transcoded files
     * and playlists. To identify the user or group, you can specify the
     * canonical user ID for an AWS account, an origin access identity for a
     * CloudFront distribution, the registered email address of an AWS
     * account, or a predefined Amazon S3 group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param grantee The AWS user or group that you want to have access to transcoded files
     *         and playlists. To identify the user or group, you can specify the
     *         canonical user ID for an AWS account, an origin access identity for a
     *         CloudFront distribution, the registered email address of an AWS
     *         account, or a predefined Amazon S3 group.
     */
    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }
    
    /**
     * The AWS user or group that you want to have access to transcoded files
     * and playlists. To identify the user or group, you can specify the
     * canonical user ID for an AWS account, an origin access identity for a
     * CloudFront distribution, the registered email address of an AWS
     * account, or a predefined Amazon S3 group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param grantee The AWS user or group that you want to have access to transcoded files
     *         and playlists. To identify the user or group, you can specify the
     *         canonical user ID for an AWS account, an origin access identity for a
     *         CloudFront distribution, the registered email address of an AWS
     *         account, or a predefined Amazon S3 group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Permission withGrantee(String grantee) {
        this.grantee = grantee;
        return this;
    }

    /**
     * The permission that you want to give to the AWS user that is listed in
     * Grantee. Valid values include: <ul> <li><code>READ</code>: The grantee
     * can read the thumbnails and metadata for thumbnails that Elastic
     * Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     * WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds
     * to the Amazon S3 bucket.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @return The permission that you want to give to the AWS user that is listed in
     *         Grantee. Valid values include: <ul> <li><code>READ</code>: The grantee
     *         can read the thumbnails and metadata for thumbnails that Elastic
     *         Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>READ_ACP</code>: The grantee can read the object ACL for
     *         thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *         thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     *         WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds
     *         to the Amazon S3 bucket.</li> </ul>
     */
    public java.util.List<String> getAccess() {
        if (access == null) {
              access = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              access.setAutoConstruct(true);
        }
        return access;
    }
    
    /**
     * The permission that you want to give to the AWS user that is listed in
     * Grantee. Valid values include: <ul> <li><code>READ</code>: The grantee
     * can read the thumbnails and metadata for thumbnails that Elastic
     * Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     * WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds
     * to the Amazon S3 bucket.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param access The permission that you want to give to the AWS user that is listed in
     *         Grantee. Valid values include: <ul> <li><code>READ</code>: The grantee
     *         can read the thumbnails and metadata for thumbnails that Elastic
     *         Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>READ_ACP</code>: The grantee can read the object ACL for
     *         thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *         thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     *         WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds
     *         to the Amazon S3 bucket.</li> </ul>
     */
    public void setAccess(java.util.Collection<String> access) {
        if (access == null) {
            this.access = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> accessCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(access.size());
        accessCopy.addAll(access);
        this.access = accessCopy;
    }
    
    /**
     * The permission that you want to give to the AWS user that is listed in
     * Grantee. Valid values include: <ul> <li><code>READ</code>: The grantee
     * can read the thumbnails and metadata for thumbnails that Elastic
     * Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     * WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds
     * to the Amazon S3 bucket.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param access The permission that you want to give to the AWS user that is listed in
     *         Grantee. Valid values include: <ul> <li><code>READ</code>: The grantee
     *         can read the thumbnails and metadata for thumbnails that Elastic
     *         Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>READ_ACP</code>: The grantee can read the object ACL for
     *         thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *         thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     *         WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds
     *         to the Amazon S3 bucket.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Permission withAccess(String... access) {
        if (getAccess() == null) setAccess(new java.util.ArrayList<String>(access.length));
        for (String value : access) {
            getAccess().add(value);
        }
        return this;
    }
    
    /**
     * The permission that you want to give to the AWS user that is listed in
     * Grantee. Valid values include: <ul> <li><code>READ</code>: The grantee
     * can read the thumbnails and metadata for thumbnails that Elastic
     * Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     * WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds
     * to the Amazon S3 bucket.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param access The permission that you want to give to the AWS user that is listed in
     *         Grantee. Valid values include: <ul> <li><code>READ</code>: The grantee
     *         can read the thumbnails and metadata for thumbnails that Elastic
     *         Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>READ_ACP</code>: The grantee can read the object ACL for
     *         thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *         thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     *         WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds
     *         to the Amazon S3 bucket.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Permission withAccess(java.util.Collection<String> access) {
        if (access == null) {
            this.access = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> accessCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(access.size());
            accessCopy.addAll(access);
            this.access = accessCopy;
        }

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
        if (getGranteeType() != null) sb.append("GranteeType: " + getGranteeType() + ",");
        if (getGrantee() != null) sb.append("Grantee: " + getGrantee() + ",");
        if (getAccess() != null) sb.append("Access: " + getAccess() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGranteeType() == null) ? 0 : getGranteeType().hashCode()); 
        hashCode = prime * hashCode + ((getGrantee() == null) ? 0 : getGrantee().hashCode()); 
        hashCode = prime * hashCode + ((getAccess() == null) ? 0 : getAccess().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Permission == false) return false;
        Permission other = (Permission)obj;
        
        if (other.getGranteeType() == null ^ this.getGranteeType() == null) return false;
        if (other.getGranteeType() != null && other.getGranteeType().equals(this.getGranteeType()) == false) return false; 
        if (other.getGrantee() == null ^ this.getGrantee() == null) return false;
        if (other.getGrantee() != null && other.getGrantee().equals(this.getGrantee()) == false) return false; 
        if (other.getAccess() == null ^ this.getAccess() == null) return false;
        if (other.getAccess() != null && other.getAccess().equals(this.getAccess()) == false) return false; 
        return true;
    }
    
}
    