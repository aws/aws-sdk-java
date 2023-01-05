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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The proposed access control configuration for an Amazon EBS volume snapshot. You can propose a configuration for a
 * new Amazon EBS volume snapshot or an Amazon EBS volume snapshot that you own by specifying the user IDs, groups, and
 * optional KMS encryption key. For more information, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifySnapshotAttribute.html"
 * >ModifySnapshotAttribute</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/EbsSnapshotConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsSnapshotConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IDs of the Amazon Web Services accounts that have access to the Amazon EBS volume snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     * <code>userIds</code>, then the access preview uses the existing shared <code>userIds</code> for the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the <code>userIds</code>, then the access
     * preview considers the snapshot without any <code>userIds</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     * <code>userIds</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> userIds;
    /**
     * <p>
     * The groups that have access to the Amazon EBS volume snapshot. If the value <code>all</code> is specified, then
     * the Amazon EBS volume snapshot is public.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the <code>groups</code>
     * , then the access preview uses the existing shared <code>groups</code> for the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the <code>groups</code>, then the access
     * preview considers the snapshot without any <code>groups</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To propose deletion of existing shared <code>groups</code>, you can specify an empty list for <code>groups</code>
     * .
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> groups;
    /**
     * <p>
     * The KMS key identifier for an encrypted Amazon EBS volume snapshot. The KMS key identifier is the key ARN, key
     * ID, alias ARN, or alias name for the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     * <code>kmsKeyId</code>, or you specify an empty string, then the access preview uses the existing
     * <code>kmsKeyId</code> of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the <code>kmsKeyId</code>, the access preview
     * considers the snapshot as unencrypted.
     * </p>
     * </li>
     * </ul>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The IDs of the Amazon Web Services accounts that have access to the Amazon EBS volume snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     * <code>userIds</code>, then the access preview uses the existing shared <code>userIds</code> for the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the <code>userIds</code>, then the access
     * preview considers the snapshot without any <code>userIds</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     * <code>userIds</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The IDs of the Amazon Web Services accounts that have access to the Amazon EBS volume snapshot.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     *         <code>userIds</code>, then the access preview uses the existing shared <code>userIds</code> for the
     *         snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the access preview is for a new resource and you do not specify the <code>userIds</code>, then the
     *         access preview considers the snapshot without any <code>userIds</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     *         <code>userIds</code>.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getUserIds() {
        return userIds;
    }

    /**
     * <p>
     * The IDs of the Amazon Web Services accounts that have access to the Amazon EBS volume snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     * <code>userIds</code>, then the access preview uses the existing shared <code>userIds</code> for the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the <code>userIds</code>, then the access
     * preview considers the snapshot without any <code>userIds</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     * <code>userIds</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userIds
     *        The IDs of the Amazon Web Services accounts that have access to the Amazon EBS volume snapshot.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     *        <code>userIds</code>, then the access preview uses the existing shared <code>userIds</code> for the
     *        snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the access preview is for a new resource and you do not specify the <code>userIds</code>, then the
     *        access preview considers the snapshot without any <code>userIds</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     *        <code>userIds</code>.
     *        </p>
     *        </li>
     */

    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }

        this.userIds = new java.util.ArrayList<String>(userIds);
    }

    /**
     * <p>
     * The IDs of the Amazon Web Services accounts that have access to the Amazon EBS volume snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     * <code>userIds</code>, then the access preview uses the existing shared <code>userIds</code> for the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the <code>userIds</code>, then the access
     * preview considers the snapshot without any <code>userIds</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     * <code>userIds</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserIds(java.util.Collection)} or {@link #withUserIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param userIds
     *        The IDs of the Amazon Web Services accounts that have access to the Amazon EBS volume snapshot.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     *        <code>userIds</code>, then the access preview uses the existing shared <code>userIds</code> for the
     *        snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the access preview is for a new resource and you do not specify the <code>userIds</code>, then the
     *        access preview considers the snapshot without any <code>userIds</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     *        <code>userIds</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsSnapshotConfiguration withUserIds(String... userIds) {
        if (this.userIds == null) {
            setUserIds(new java.util.ArrayList<String>(userIds.length));
        }
        for (String ele : userIds) {
            this.userIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Amazon Web Services accounts that have access to the Amazon EBS volume snapshot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     * <code>userIds</code>, then the access preview uses the existing shared <code>userIds</code> for the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the <code>userIds</code>, then the access
     * preview considers the snapshot without any <code>userIds</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     * <code>userIds</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userIds
     *        The IDs of the Amazon Web Services accounts that have access to the Amazon EBS volume snapshot.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     *        <code>userIds</code>, then the access preview uses the existing shared <code>userIds</code> for the
     *        snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the access preview is for a new resource and you do not specify the <code>userIds</code>, then the
     *        access preview considers the snapshot without any <code>userIds</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     *        <code>userIds</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsSnapshotConfiguration withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
        return this;
    }

    /**
     * <p>
     * The groups that have access to the Amazon EBS volume snapshot. If the value <code>all</code> is specified, then
     * the Amazon EBS volume snapshot is public.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the <code>groups</code>
     * , then the access preview uses the existing shared <code>groups</code> for the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the <code>groups</code>, then the access
     * preview considers the snapshot without any <code>groups</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To propose deletion of existing shared <code>groups</code>, you can specify an empty list for <code>groups</code>
     * .
     * </p>
     * </li>
     * </ul>
     * 
     * @return The groups that have access to the Amazon EBS volume snapshot. If the value <code>all</code> is
     *         specified, then the Amazon EBS volume snapshot is public.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     *         <code>groups</code>, then the access preview uses the existing shared <code>groups</code> for the
     *         snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the access preview is for a new resource and you do not specify the <code>groups</code>, then the
     *         access preview considers the snapshot without any <code>groups</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To propose deletion of existing shared <code>groups</code>, you can specify an empty list for
     *         <code>groups</code>.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The groups that have access to the Amazon EBS volume snapshot. If the value <code>all</code> is specified, then
     * the Amazon EBS volume snapshot is public.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the <code>groups</code>
     * , then the access preview uses the existing shared <code>groups</code> for the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the <code>groups</code>, then the access
     * preview considers the snapshot without any <code>groups</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To propose deletion of existing shared <code>groups</code>, you can specify an empty list for <code>groups</code>
     * .
     * </p>
     * </li>
     * </ul>
     * 
     * @param groups
     *        The groups that have access to the Amazon EBS volume snapshot. If the value <code>all</code> is specified,
     *        then the Amazon EBS volume snapshot is public.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     *        <code>groups</code>, then the access preview uses the existing shared <code>groups</code> for the
     *        snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the access preview is for a new resource and you do not specify the <code>groups</code>, then the
     *        access preview considers the snapshot without any <code>groups</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To propose deletion of existing shared <code>groups</code>, you can specify an empty list for
     *        <code>groups</code>.
     *        </p>
     *        </li>
     */

    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<String>(groups);
    }

    /**
     * <p>
     * The groups that have access to the Amazon EBS volume snapshot. If the value <code>all</code> is specified, then
     * the Amazon EBS volume snapshot is public.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the <code>groups</code>
     * , then the access preview uses the existing shared <code>groups</code> for the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the <code>groups</code>, then the access
     * preview considers the snapshot without any <code>groups</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To propose deletion of existing shared <code>groups</code>, you can specify an empty list for <code>groups</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The groups that have access to the Amazon EBS volume snapshot. If the value <code>all</code> is specified,
     *        then the Amazon EBS volume snapshot is public.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     *        <code>groups</code>, then the access preview uses the existing shared <code>groups</code> for the
     *        snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the access preview is for a new resource and you do not specify the <code>groups</code>, then the
     *        access preview considers the snapshot without any <code>groups</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To propose deletion of existing shared <code>groups</code>, you can specify an empty list for
     *        <code>groups</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsSnapshotConfiguration withGroups(String... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<String>(groups.length));
        }
        for (String ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The groups that have access to the Amazon EBS volume snapshot. If the value <code>all</code> is specified, then
     * the Amazon EBS volume snapshot is public.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the <code>groups</code>
     * , then the access preview uses the existing shared <code>groups</code> for the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the <code>groups</code>, then the access
     * preview considers the snapshot without any <code>groups</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To propose deletion of existing shared <code>groups</code>, you can specify an empty list for <code>groups</code>
     * .
     * </p>
     * </li>
     * </ul>
     * 
     * @param groups
     *        The groups that have access to the Amazon EBS volume snapshot. If the value <code>all</code> is specified,
     *        then the Amazon EBS volume snapshot is public.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     *        <code>groups</code>, then the access preview uses the existing shared <code>groups</code> for the
     *        snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the access preview is for a new resource and you do not specify the <code>groups</code>, then the
     *        access preview considers the snapshot without any <code>groups</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To propose deletion of existing shared <code>groups</code>, you can specify an empty list for
     *        <code>groups</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsSnapshotConfiguration withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The KMS key identifier for an encrypted Amazon EBS volume snapshot. The KMS key identifier is the key ARN, key
     * ID, alias ARN, or alias name for the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     * <code>kmsKeyId</code>, or you specify an empty string, then the access preview uses the existing
     * <code>kmsKeyId</code> of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the <code>kmsKeyId</code>, the access preview
     * considers the snapshot as unencrypted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The KMS key identifier for an encrypted Amazon EBS volume snapshot. The KMS key identifier is the key ARN,
     *        key ID, alias ARN, or alias name for the KMS key.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     *        <code>kmsKeyId</code>, or you specify an empty string, then the access preview uses the existing
     *        <code>kmsKeyId</code> of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the access preview is for a new resource and you do not specify the <code>kmsKeyId</code>, the access
     *        preview considers the snapshot as unencrypted.
     *        </p>
     *        </li>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier for an encrypted Amazon EBS volume snapshot. The KMS key identifier is the key ARN, key
     * ID, alias ARN, or alias name for the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     * <code>kmsKeyId</code>, or you specify an empty string, then the access preview uses the existing
     * <code>kmsKeyId</code> of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the <code>kmsKeyId</code>, the access preview
     * considers the snapshot as unencrypted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The KMS key identifier for an encrypted Amazon EBS volume snapshot. The KMS key identifier is the key
     *         ARN, key ID, alias ARN, or alias name for the KMS key.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     *         <code>kmsKeyId</code>, or you specify an empty string, then the access preview uses the existing
     *         <code>kmsKeyId</code> of the snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the access preview is for a new resource and you do not specify the <code>kmsKeyId</code>, the access
     *         preview considers the snapshot as unencrypted.
     *         </p>
     *         </li>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier for an encrypted Amazon EBS volume snapshot. The KMS key identifier is the key ARN, key
     * ID, alias ARN, or alias name for the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     * <code>kmsKeyId</code>, or you specify an empty string, then the access preview uses the existing
     * <code>kmsKeyId</code> of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the <code>kmsKeyId</code>, the access preview
     * considers the snapshot as unencrypted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The KMS key identifier for an encrypted Amazon EBS volume snapshot. The KMS key identifier is the key ARN,
     *        key ID, alias ARN, or alias name for the KMS key.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the configuration is for an existing Amazon EBS volume snapshot and you do not specify the
     *        <code>kmsKeyId</code>, or you specify an empty string, then the access preview uses the existing
     *        <code>kmsKeyId</code> of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the access preview is for a new resource and you do not specify the <code>kmsKeyId</code>, the access
     *        preview considers the snapshot as unencrypted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsSnapshotConfiguration withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getUserIds() != null)
            sb.append("UserIds: ").append(getUserIds()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsSnapshotConfiguration == false)
            return false;
        EbsSnapshotConfiguration other = (EbsSnapshotConfiguration) obj;
        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public EbsSnapshotConfiguration clone() {
        try {
            return (EbsSnapshotConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.EbsSnapshotConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
