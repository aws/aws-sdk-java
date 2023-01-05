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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <b>[Snapshot and AMI policies only]</b> Specifies a cross-Region copy rule for snapshot and AMI policies.
 * </p>
 * <note>
 * <p>
 * To specify a cross-Region copy action for event-based polices, use <a>CrossRegionCopyAction</a>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/CrossRegionCopyRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrossRegionCopyRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <note>
     * <p>
     * Avoid using this parameter when creating new policies. Instead, use <b>Target</b> to specify a target Region or a
     * target Outpost for snapshot copies.
     * </p>
     * <p>
     * For policies created before the <b>Target</b> parameter was introduced, this parameter indicates the target
     * Region for snapshot copies.
     * </p>
     * </note>
     */
    private String targetRegion;
    /**
     * <p>
     * The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.
     * </p>
     * <p>
     * Use this parameter instead of <b>TargetRegion</b>. Do not specify both.
     * </p>
     */
    private String target;
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
     * The Amazon Resource Name (ARN) of the KMS key to use for EBS encryption. If this parameter is not specified, the
     * default KMS key for the account is used.
     * </p>
     */
    private String cmkArn;
    /**
     * <p>
     * Indicates whether to copy all user-defined tags from the source snapshot or AMI to the cross-Region copy.
     * </p>
     */
    private Boolean copyTags;
    /**
     * <p>
     * The retention rule that indicates how long the cross-Region snapshot or AMI copies are to be retained in the
     * destination Region.
     * </p>
     */
    private CrossRegionCopyRetainRule retainRule;
    /**
     * <p>
     * <b>[AMI policies only]</b> The AMI deprecation rule for cross-Region AMI copies created by the rule.
     * </p>
     */
    private CrossRegionCopyDeprecateRule deprecateRule;

    /**
     * <note>
     * <p>
     * Avoid using this parameter when creating new policies. Instead, use <b>Target</b> to specify a target Region or a
     * target Outpost for snapshot copies.
     * </p>
     * <p>
     * For policies created before the <b>Target</b> parameter was introduced, this parameter indicates the target
     * Region for snapshot copies.
     * </p>
     * </note>
     * 
     * @param targetRegion
     *        <p>
     *        Avoid using this parameter when creating new policies. Instead, use <b>Target</b> to specify a target
     *        Region or a target Outpost for snapshot copies.
     *        </p>
     *        <p>
     *        For policies created before the <b>Target</b> parameter was introduced, this parameter indicates the
     *        target Region for snapshot copies.
     *        </p>
     */

    public void setTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
    }

    /**
     * <note>
     * <p>
     * Avoid using this parameter when creating new policies. Instead, use <b>Target</b> to specify a target Region or a
     * target Outpost for snapshot copies.
     * </p>
     * <p>
     * For policies created before the <b>Target</b> parameter was introduced, this parameter indicates the target
     * Region for snapshot copies.
     * </p>
     * </note>
     * 
     * @return <p>
     *         Avoid using this parameter when creating new policies. Instead, use <b>Target</b> to specify a target
     *         Region or a target Outpost for snapshot copies.
     *         </p>
     *         <p>
     *         For policies created before the <b>Target</b> parameter was introduced, this parameter indicates the
     *         target Region for snapshot copies.
     *         </p>
     */

    public String getTargetRegion() {
        return this.targetRegion;
    }

    /**
     * <note>
     * <p>
     * Avoid using this parameter when creating new policies. Instead, use <b>Target</b> to specify a target Region or a
     * target Outpost for snapshot copies.
     * </p>
     * <p>
     * For policies created before the <b>Target</b> parameter was introduced, this parameter indicates the target
     * Region for snapshot copies.
     * </p>
     * </note>
     * 
     * @param targetRegion
     *        <p>
     *        Avoid using this parameter when creating new policies. Instead, use <b>Target</b> to specify a target
     *        Region or a target Outpost for snapshot copies.
     *        </p>
     *        <p>
     *        For policies created before the <b>Target</b> parameter was introduced, this parameter indicates the
     *        target Region for snapshot copies.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossRegionCopyRule withTargetRegion(String targetRegion) {
        setTargetRegion(targetRegion);
        return this;
    }

    /**
     * <p>
     * The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.
     * </p>
     * <p>
     * Use this parameter instead of <b>TargetRegion</b>. Do not specify both.
     * </p>
     * 
     * @param target
     *        The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.</p>
     *        <p>
     *        Use this parameter instead of <b>TargetRegion</b>. Do not specify both.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.
     * </p>
     * <p>
     * Use this parameter instead of <b>TargetRegion</b>. Do not specify both.
     * </p>
     * 
     * @return The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.</p>
     *         <p>
     *         Use this parameter instead of <b>TargetRegion</b>. Do not specify both.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.
     * </p>
     * <p>
     * Use this parameter instead of <b>TargetRegion</b>. Do not specify both.
     * </p>
     * 
     * @param target
     *        The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.</p>
     *        <p>
     *        Use this parameter instead of <b>TargetRegion</b>. Do not specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossRegionCopyRule withTarget(String target) {
        setTarget(target);
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
     * The Amazon Resource Name (ARN) of the KMS key to use for EBS encryption. If this parameter is not specified, the
     * default KMS key for the account is used.
     * </p>
     * 
     * @param cmkArn
     *        The Amazon Resource Name (ARN) of the KMS key to use for EBS encryption. If this parameter is not
     *        specified, the default KMS key for the account is used.
     */

    public void setCmkArn(String cmkArn) {
        this.cmkArn = cmkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to use for EBS encryption. If this parameter is not specified, the
     * default KMS key for the account is used.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS key to use for EBS encryption. If this parameter is not
     *         specified, the default KMS key for the account is used.
     */

    public String getCmkArn() {
        return this.cmkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key to use for EBS encryption. If this parameter is not specified, the
     * default KMS key for the account is used.
     * </p>
     * 
     * @param cmkArn
     *        The Amazon Resource Name (ARN) of the KMS key to use for EBS encryption. If this parameter is not
     *        specified, the default KMS key for the account is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossRegionCopyRule withCmkArn(String cmkArn) {
        setCmkArn(cmkArn);
        return this;
    }

    /**
     * <p>
     * Indicates whether to copy all user-defined tags from the source snapshot or AMI to the cross-Region copy.
     * </p>
     * 
     * @param copyTags
     *        Indicates whether to copy all user-defined tags from the source snapshot or AMI to the cross-Region copy.
     */

    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * Indicates whether to copy all user-defined tags from the source snapshot or AMI to the cross-Region copy.
     * </p>
     * 
     * @return Indicates whether to copy all user-defined tags from the source snapshot or AMI to the cross-Region copy.
     */

    public Boolean getCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * Indicates whether to copy all user-defined tags from the source snapshot or AMI to the cross-Region copy.
     * </p>
     * 
     * @param copyTags
     *        Indicates whether to copy all user-defined tags from the source snapshot or AMI to the cross-Region copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossRegionCopyRule withCopyTags(Boolean copyTags) {
        setCopyTags(copyTags);
        return this;
    }

    /**
     * <p>
     * Indicates whether to copy all user-defined tags from the source snapshot or AMI to the cross-Region copy.
     * </p>
     * 
     * @return Indicates whether to copy all user-defined tags from the source snapshot or AMI to the cross-Region copy.
     */

    public Boolean isCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * The retention rule that indicates how long the cross-Region snapshot or AMI copies are to be retained in the
     * destination Region.
     * </p>
     * 
     * @param retainRule
     *        The retention rule that indicates how long the cross-Region snapshot or AMI copies are to be retained in
     *        the destination Region.
     */

    public void setRetainRule(CrossRegionCopyRetainRule retainRule) {
        this.retainRule = retainRule;
    }

    /**
     * <p>
     * The retention rule that indicates how long the cross-Region snapshot or AMI copies are to be retained in the
     * destination Region.
     * </p>
     * 
     * @return The retention rule that indicates how long the cross-Region snapshot or AMI copies are to be retained in
     *         the destination Region.
     */

    public CrossRegionCopyRetainRule getRetainRule() {
        return this.retainRule;
    }

    /**
     * <p>
     * The retention rule that indicates how long the cross-Region snapshot or AMI copies are to be retained in the
     * destination Region.
     * </p>
     * 
     * @param retainRule
     *        The retention rule that indicates how long the cross-Region snapshot or AMI copies are to be retained in
     *        the destination Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossRegionCopyRule withRetainRule(CrossRegionCopyRetainRule retainRule) {
        setRetainRule(retainRule);
        return this;
    }

    /**
     * <p>
     * <b>[AMI policies only]</b> The AMI deprecation rule for cross-Region AMI copies created by the rule.
     * </p>
     * 
     * @param deprecateRule
     *        <b>[AMI policies only]</b> The AMI deprecation rule for cross-Region AMI copies created by the rule.
     */

    public void setDeprecateRule(CrossRegionCopyDeprecateRule deprecateRule) {
        this.deprecateRule = deprecateRule;
    }

    /**
     * <p>
     * <b>[AMI policies only]</b> The AMI deprecation rule for cross-Region AMI copies created by the rule.
     * </p>
     * 
     * @return <b>[AMI policies only]</b> The AMI deprecation rule for cross-Region AMI copies created by the rule.
     */

    public CrossRegionCopyDeprecateRule getDeprecateRule() {
        return this.deprecateRule;
    }

    /**
     * <p>
     * <b>[AMI policies only]</b> The AMI deprecation rule for cross-Region AMI copies created by the rule.
     * </p>
     * 
     * @param deprecateRule
     *        <b>[AMI policies only]</b> The AMI deprecation rule for cross-Region AMI copies created by the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossRegionCopyRule withDeprecateRule(CrossRegionCopyDeprecateRule deprecateRule) {
        setDeprecateRule(deprecateRule);
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
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getCmkArn() != null)
            sb.append("CmkArn: ").append(getCmkArn()).append(",");
        if (getCopyTags() != null)
            sb.append("CopyTags: ").append(getCopyTags()).append(",");
        if (getRetainRule() != null)
            sb.append("RetainRule: ").append(getRetainRule()).append(",");
        if (getDeprecateRule() != null)
            sb.append("DeprecateRule: ").append(getDeprecateRule());
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
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
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
        if (other.getDeprecateRule() == null ^ this.getDeprecateRule() == null)
            return false;
        if (other.getDeprecateRule() != null && other.getDeprecateRule().equals(this.getDeprecateRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetRegion() == null) ? 0 : getTargetRegion().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getCmkArn() == null) ? 0 : getCmkArn().hashCode());
        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        hashCode = prime * hashCode + ((getRetainRule() == null) ? 0 : getRetainRule().hashCode());
        hashCode = prime * hashCode + ((getDeprecateRule() == null) ? 0 : getDeprecateRule().hashCode());
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
