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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a rule for cross-Region snapshot copies.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/CrossRegionCopyRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrossRegionCopyRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target Region.
     * </p>
     */
    private String targetRegion;
    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using
     * this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by
     * default is not enabled.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this
     * parameter is not specified, your AWS managed CMK for EBS is used.
     * </p>
     */
    private String cmkArn;
    /**
     * <p>
     * Copy all user-defined tags from the source snapshot to the copied snapshot.
     * </p>
     */
    private Boolean copyTags;
    /**
     * <p>
     * The retention rule.
     * </p>
     */
    private CrossRegionCopyRetainRule retainRule;

    /**
     * <p>
     * The target Region.
     * </p>
     * 
     * @param targetRegion
     *        The target Region.
     */

    public void setTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
    }

    /**
     * <p>
     * The target Region.
     * </p>
     * 
     * @return The target Region.
     */

    public String getTargetRegion() {
        return this.targetRegion;
    }

    /**
     * <p>
     * The target Region.
     * </p>
     * 
     * @param targetRegion
     *        The target Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossRegionCopyRule withTargetRegion(String targetRegion) {
        setTargetRegion(targetRegion);
        return this;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using
     * this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by
     * default is not enabled.
     * </p>
     * 
     * @param encrypted
     *        To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption
     *        using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if
     *        encryption by default is not enabled.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using
     * this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by
     * default is not enabled.
     * </p>
     * 
     * @return To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption
     *         using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if
     *         encryption by default is not enabled.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using
     * this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by
     * default is not enabled.
     * </p>
     * 
     * @param encrypted
     *        To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption
     *        using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if
     *        encryption by default is not enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossRegionCopyRule withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using
     * this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by
     * default is not enabled.
     * </p>
     * 
     * @return To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption
     *         using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if
     *         encryption by default is not enabled.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this
     * parameter is not specified, your AWS managed CMK for EBS is used.
     * </p>
     * 
     * @param cmkArn
     *        The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this
     *        parameter is not specified, your AWS managed CMK for EBS is used.
     */

    public void setCmkArn(String cmkArn) {
        this.cmkArn = cmkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this
     * parameter is not specified, your AWS managed CMK for EBS is used.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If
     *         this parameter is not specified, your AWS managed CMK for EBS is used.
     */

    public String getCmkArn() {
        return this.cmkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this
     * parameter is not specified, your AWS managed CMK for EBS is used.
     * </p>
     * 
     * @param cmkArn
     *        The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this
     *        parameter is not specified, your AWS managed CMK for EBS is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossRegionCopyRule withCmkArn(String cmkArn) {
        setCmkArn(cmkArn);
        return this;
    }

    /**
     * <p>
     * Copy all user-defined tags from the source snapshot to the copied snapshot.
     * </p>
     * 
     * @param copyTags
     *        Copy all user-defined tags from the source snapshot to the copied snapshot.
     */

    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * Copy all user-defined tags from the source snapshot to the copied snapshot.
     * </p>
     * 
     * @return Copy all user-defined tags from the source snapshot to the copied snapshot.
     */

    public Boolean getCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * Copy all user-defined tags from the source snapshot to the copied snapshot.
     * </p>
     * 
     * @param copyTags
     *        Copy all user-defined tags from the source snapshot to the copied snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossRegionCopyRule withCopyTags(Boolean copyTags) {
        setCopyTags(copyTags);
        return this;
    }

    /**
     * <p>
     * Copy all user-defined tags from the source snapshot to the copied snapshot.
     * </p>
     * 
     * @return Copy all user-defined tags from the source snapshot to the copied snapshot.
     */

    public Boolean isCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * The retention rule.
     * </p>
     * 
     * @param retainRule
     *        The retention rule.
     */

    public void setRetainRule(CrossRegionCopyRetainRule retainRule) {
        this.retainRule = retainRule;
    }

    /**
     * <p>
     * The retention rule.
     * </p>
     * 
     * @return The retention rule.
     */

    public CrossRegionCopyRetainRule getRetainRule() {
        return this.retainRule;
    }

    /**
     * <p>
     * The retention rule.
     * </p>
     * 
     * @param retainRule
     *        The retention rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossRegionCopyRule withRetainRule(CrossRegionCopyRetainRule retainRule) {
        setRetainRule(retainRule);
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
        if (getTargetRegion() != null)
            sb.append("TargetRegion: ").append(getTargetRegion()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getCmkArn() != null)
            sb.append("CmkArn: ").append(getCmkArn()).append(",");
        if (getCopyTags() != null)
            sb.append("CopyTags: ").append(getCopyTags()).append(",");
        if (getRetainRule() != null)
            sb.append("RetainRule: ").append(getRetainRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrossRegionCopyRule == false)
            return false;
        CrossRegionCopyRule other = (CrossRegionCopyRule) obj;
        if (other.getTargetRegion() == null ^ this.getTargetRegion() == null)
            return false;
        if (other.getTargetRegion() != null && other.getTargetRegion().equals(this.getTargetRegion()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getCmkArn() == null ^ this.getCmkArn() == null)
            return false;
        if (other.getCmkArn() != null && other.getCmkArn().equals(this.getCmkArn()) == false)
            return false;
        if (other.getCopyTags() == null ^ this.getCopyTags() == null)
            return false;
        if (other.getCopyTags() != null && other.getCopyTags().equals(this.getCopyTags()) == false)
            return false;
        if (other.getRetainRule() == null ^ this.getRetainRule() == null)
            return false;
        if (other.getRetainRule() != null && other.getRetainRule().equals(this.getRetainRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetRegion() == null) ? 0 : getTargetRegion().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getCmkArn() == null) ? 0 : getCmkArn().hashCode());
        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        hashCode = prime * hashCode + ((getRetainRule() == null) ? 0 : getRetainRule().hashCode());
        return hashCode;
    }

    @Override
    public CrossRegionCopyRule clone() {
        try {
            return (CrossRegionCopyRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.CrossRegionCopyRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
