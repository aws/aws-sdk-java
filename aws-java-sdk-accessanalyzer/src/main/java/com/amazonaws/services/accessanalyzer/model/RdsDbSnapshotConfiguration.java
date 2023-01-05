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
 * The proposed access control configuration for an Amazon RDS DB snapshot. You can propose a configuration for a new
 * Amazon RDS DB snapshot or an Amazon RDS DB snapshot that you own by specifying the
 * <code>RdsDbSnapshotAttributeValue</code> and optional KMS encryption key. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_ModifyDBSnapshotAttribute.html"
 * >ModifyDBSnapshotAttribute</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/RdsDbSnapshotConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsDbSnapshotConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The names and values of manual DB snapshot attributes. Manual DB snapshot attributes are used to authorize other
     * Amazon Web Services accounts to restore a manual DB snapshot. The only valid value for <code>attributeName</code>
     * for the attribute map is restore.
     * </p>
     */
    private java.util.Map<String, RdsDbSnapshotAttributeValue> attributes;
    /**
     * <p>
     * The KMS key identifier for an encrypted Amazon RDS DB snapshot. The KMS key identifier is the key ARN, key ID,
     * alias ARN, or alias name for the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon RDS DB snapshot and you do not specify the <code>kmsKeyId</code>,
     * or you specify an empty string, then the access preview uses the existing <code>kmsKeyId</code> of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the specify the <code>kmsKeyId</code>, then
     * the access preview considers the snapshot as unencrypted.
     * </p>
     * </li>
     * </ul>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The names and values of manual DB snapshot attributes. Manual DB snapshot attributes are used to authorize other
     * Amazon Web Services accounts to restore a manual DB snapshot. The only valid value for <code>attributeName</code>
     * for the attribute map is restore.
     * </p>
     * 
     * @return The names and values of manual DB snapshot attributes. Manual DB snapshot attributes are used to
     *         authorize other Amazon Web Services accounts to restore a manual DB snapshot. The only valid value for
     *         <code>attributeName</code> for the attribute map is restore.
     */

    public java.util.Map<String, RdsDbSnapshotAttributeValue> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The names and values of manual DB snapshot attributes. Manual DB snapshot attributes are used to authorize other
     * Amazon Web Services accounts to restore a manual DB snapshot. The only valid value for <code>attributeName</code>
     * for the attribute map is restore.
     * </p>
     * 
     * @param attributes
     *        The names and values of manual DB snapshot attributes. Manual DB snapshot attributes are used to authorize
     *        other Amazon Web Services accounts to restore a manual DB snapshot. The only valid value for
     *        <code>attributeName</code> for the attribute map is restore.
     */

    public void setAttributes(java.util.Map<String, RdsDbSnapshotAttributeValue> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The names and values of manual DB snapshot attributes. Manual DB snapshot attributes are used to authorize other
     * Amazon Web Services accounts to restore a manual DB snapshot. The only valid value for <code>attributeName</code>
     * for the attribute map is restore.
     * </p>
     * 
     * @param attributes
     *        The names and values of manual DB snapshot attributes. Manual DB snapshot attributes are used to authorize
     *        other Amazon Web Services accounts to restore a manual DB snapshot. The only valid value for
     *        <code>attributeName</code> for the attribute map is restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbSnapshotConfiguration withAttributes(java.util.Map<String, RdsDbSnapshotAttributeValue> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see RdsDbSnapshotConfiguration#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbSnapshotConfiguration addAttributesEntry(String key, RdsDbSnapshotAttributeValue value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, RdsDbSnapshotAttributeValue>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbSnapshotConfiguration clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The KMS key identifier for an encrypted Amazon RDS DB snapshot. The KMS key identifier is the key ARN, key ID,
     * alias ARN, or alias name for the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon RDS DB snapshot and you do not specify the <code>kmsKeyId</code>,
     * or you specify an empty string, then the access preview uses the existing <code>kmsKeyId</code> of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the specify the <code>kmsKeyId</code>, then
     * the access preview considers the snapshot as unencrypted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The KMS key identifier for an encrypted Amazon RDS DB snapshot. The KMS key identifier is the key ARN, key
     *        ID, alias ARN, or alias name for the KMS key.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the configuration is for an existing Amazon RDS DB snapshot and you do not specify the
     *        <code>kmsKeyId</code>, or you specify an empty string, then the access preview uses the existing
     *        <code>kmsKeyId</code> of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the access preview is for a new resource and you do not specify the specify the <code>kmsKeyId</code>,
     *        then the access preview considers the snapshot as unencrypted.
     *        </p>
     *        </li>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier for an encrypted Amazon RDS DB snapshot. The KMS key identifier is the key ARN, key ID,
     * alias ARN, or alias name for the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon RDS DB snapshot and you do not specify the <code>kmsKeyId</code>,
     * or you specify an empty string, then the access preview uses the existing <code>kmsKeyId</code> of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the specify the <code>kmsKeyId</code>, then
     * the access preview considers the snapshot as unencrypted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The KMS key identifier for an encrypted Amazon RDS DB snapshot. The KMS key identifier is the key ARN,
     *         key ID, alias ARN, or alias name for the KMS key.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the configuration is for an existing Amazon RDS DB snapshot and you do not specify the
     *         <code>kmsKeyId</code>, or you specify an empty string, then the access preview uses the existing
     *         <code>kmsKeyId</code> of the snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the access preview is for a new resource and you do not specify the specify the <code>kmsKeyId</code>,
     *         then the access preview considers the snapshot as unencrypted.
     *         </p>
     *         </li>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier for an encrypted Amazon RDS DB snapshot. The KMS key identifier is the key ARN, key ID,
     * alias ARN, or alias name for the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon RDS DB snapshot and you do not specify the <code>kmsKeyId</code>,
     * or you specify an empty string, then the access preview uses the existing <code>kmsKeyId</code> of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the specify the <code>kmsKeyId</code>, then
     * the access preview considers the snapshot as unencrypted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The KMS key identifier for an encrypted Amazon RDS DB snapshot. The KMS key identifier is the key ARN, key
     *        ID, alias ARN, or alias name for the KMS key.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the configuration is for an existing Amazon RDS DB snapshot and you do not specify the
     *        <code>kmsKeyId</code>, or you specify an empty string, then the access preview uses the existing
     *        <code>kmsKeyId</code> of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the access preview is for a new resource and you do not specify the specify the <code>kmsKeyId</code>,
     *        then the access preview considers the snapshot as unencrypted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbSnapshotConfiguration withKmsKeyId(String kmsKeyId) {
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
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

        if (obj instanceof RdsDbSnapshotConfiguration == false)
            return false;
        RdsDbSnapshotConfiguration other = (RdsDbSnapshotConfiguration) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
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

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public RdsDbSnapshotConfiguration clone() {
        try {
            return (RdsDbSnapshotConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.RdsDbSnapshotConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
