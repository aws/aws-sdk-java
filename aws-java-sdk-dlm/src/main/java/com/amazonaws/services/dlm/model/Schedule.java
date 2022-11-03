/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <b>[Snapshot and AMI policies only]</b> Specifies a schedule for a snapshot or AMI lifecycle policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/Schedule" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Schedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the schedule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
     * </p>
     */
    private Boolean copyTags;
    /**
     * <p>
     * The tags to apply to policy-created resources. These user-defined tags are in addition to the Amazon Web
     * Services-added lifecycle tags.
     * </p>
     */
    private java.util.List<Tag> tagsToAdd;
    /**
     * <p>
     * <b>[AMI policies and snapshot policies that target instances only]</b> A collection of key/value pairs with
     * values determined dynamically when the policy is executed. Keys may be any valid Amazon EC2 tag key. Values must
     * be in one of the two following formats: <code>$(instance-id)</code> or <code>$(timestamp)</code>. Variable tags
     * are only valid for EBS Snapshot Management – Instance policies.
     * </p>
     */
    private java.util.List<Tag> variableTags;
    /**
     * <p>
     * The creation rule.
     * </p>
     */
    private CreateRule createRule;
    /**
     * <p>
     * The retention rule for snapshots or AMIs created by the policy.
     * </p>
     */
    private RetainRule retainRule;
    /**
     * <p>
     * <b>[Snapshot policies only]</b> The rule for enabling fast snapshot restore.
     * </p>
     */
    private FastRestoreRule fastRestoreRule;
    /**
     * <p>
     * Specifies a rule for copying snapshots or AMIs across regions.
     * </p>
     * <note>
     * <p>
     * You can't specify cross-Region copy rules for policies that create snapshots on an Outpost. If the policy creates
     * snapshots in a Region, then snapshots can be copied to up to three Regions or Outposts.
     * </p>
     * </note>
     */
    private java.util.List<CrossRegionCopyRule> crossRegionCopyRules;
    /**
     * <p>
     * <b>[Snapshot policies only]</b> The rule for sharing snapshots with other Amazon Web Services accounts.
     * </p>
     */
    private java.util.List<ShareRule> shareRules;
    /**
     * <p>
     * <b>[AMI policies only]</b> The AMI deprecation rule for the schedule.
     * </p>
     */
    private DeprecateRule deprecateRule;
    /**
     * <p>
     * <b>[Snapshot policies that target volumes only]</b> The snapshot archiving rule for the schedule. When you
     * specify an archiving rule, snapshots are automatically moved from the standard tier to the archive tier once the
     * schedule's retention threshold is met. Snapshots are then retained in the archive tier for the archive retention
     * period that you specify.
     * </p>
     * <p>
     * For more information about using snapshot archiving, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive">Considerations
     * for snapshot lifecycle policies</a>.
     * </p>
     */
    private ArchiveRule archiveRule;

    /**
     * <p>
     * The name of the schedule.
     * </p>
     * 
     * @param name
     *        The name of the schedule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the schedule.
     * </p>
     * 
     * @return The name of the schedule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the schedule.
     * </p>
     * 
     * @param name
     *        The name of the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
     * </p>
     * 
     * @param copyTags
     *        Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
     */

    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
     * </p>
     * 
     * @return Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
     */

    public Boolean getCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
     * </p>
     * 
     * @param copyTags
     *        Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withCopyTags(Boolean copyTags) {
        setCopyTags(copyTags);
        return this;
    }

    /**
     * <p>
     * Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
     * </p>
     * 
     * @return Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
     */

    public Boolean isCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * The tags to apply to policy-created resources. These user-defined tags are in addition to the Amazon Web
     * Services-added lifecycle tags.
     * </p>
     * 
     * @return The tags to apply to policy-created resources. These user-defined tags are in addition to the Amazon Web
     *         Services-added lifecycle tags.
     */

    public java.util.List<Tag> getTagsToAdd() {
        return tagsToAdd;
    }

    /**
     * <p>
     * The tags to apply to policy-created resources. These user-defined tags are in addition to the Amazon Web
     * Services-added lifecycle tags.
     * </p>
     * 
     * @param tagsToAdd
     *        The tags to apply to policy-created resources. These user-defined tags are in addition to the Amazon Web
     *        Services-added lifecycle tags.
     */

    public void setTagsToAdd(java.util.Collection<Tag> tagsToAdd) {
        if (tagsToAdd == null) {
            this.tagsToAdd = null;
            return;
        }

        this.tagsToAdd = new java.util.ArrayList<Tag>(tagsToAdd);
    }

    /**
     * <p>
     * The tags to apply to policy-created resources. These user-defined tags are in addition to the Amazon Web
     * Services-added lifecycle tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagsToAdd(java.util.Collection)} or {@link #withTagsToAdd(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagsToAdd
     *        The tags to apply to policy-created resources. These user-defined tags are in addition to the Amazon Web
     *        Services-added lifecycle tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withTagsToAdd(Tag... tagsToAdd) {
        if (this.tagsToAdd == null) {
            setTagsToAdd(new java.util.ArrayList<Tag>(tagsToAdd.length));
        }
        for (Tag ele : tagsToAdd) {
            this.tagsToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to policy-created resources. These user-defined tags are in addition to the Amazon Web
     * Services-added lifecycle tags.
     * </p>
     * 
     * @param tagsToAdd
     *        The tags to apply to policy-created resources. These user-defined tags are in addition to the Amazon Web
     *        Services-added lifecycle tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withTagsToAdd(java.util.Collection<Tag> tagsToAdd) {
        setTagsToAdd(tagsToAdd);
        return this;
    }

    /**
     * <p>
     * <b>[AMI policies and snapshot policies that target instances only]</b> A collection of key/value pairs with
     * values determined dynamically when the policy is executed. Keys may be any valid Amazon EC2 tag key. Values must
     * be in one of the two following formats: <code>$(instance-id)</code> or <code>$(timestamp)</code>. Variable tags
     * are only valid for EBS Snapshot Management – Instance policies.
     * </p>
     * 
     * @return <b>[AMI policies and snapshot policies that target instances only]</b> A collection of key/value pairs
     *         with values determined dynamically when the policy is executed. Keys may be any valid Amazon EC2 tag key.
     *         Values must be in one of the two following formats: <code>$(instance-id)</code> or
     *         <code>$(timestamp)</code>. Variable tags are only valid for EBS Snapshot Management – Instance policies.
     */

    public java.util.List<Tag> getVariableTags() {
        return variableTags;
    }

    /**
     * <p>
     * <b>[AMI policies and snapshot policies that target instances only]</b> A collection of key/value pairs with
     * values determined dynamically when the policy is executed. Keys may be any valid Amazon EC2 tag key. Values must
     * be in one of the two following formats: <code>$(instance-id)</code> or <code>$(timestamp)</code>. Variable tags
     * are only valid for EBS Snapshot Management – Instance policies.
     * </p>
     * 
     * @param variableTags
     *        <b>[AMI policies and snapshot policies that target instances only]</b> A collection of key/value pairs
     *        with values determined dynamically when the policy is executed. Keys may be any valid Amazon EC2 tag key.
     *        Values must be in one of the two following formats: <code>$(instance-id)</code> or
     *        <code>$(timestamp)</code>. Variable tags are only valid for EBS Snapshot Management – Instance policies.
     */

    public void setVariableTags(java.util.Collection<Tag> variableTags) {
        if (variableTags == null) {
            this.variableTags = null;
            return;
        }

        this.variableTags = new java.util.ArrayList<Tag>(variableTags);
    }

    /**
     * <p>
     * <b>[AMI policies and snapshot policies that target instances only]</b> A collection of key/value pairs with
     * values determined dynamically when the policy is executed. Keys may be any valid Amazon EC2 tag key. Values must
     * be in one of the two following formats: <code>$(instance-id)</code> or <code>$(timestamp)</code>. Variable tags
     * are only valid for EBS Snapshot Management – Instance policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVariableTags(java.util.Collection)} or {@link #withVariableTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param variableTags
     *        <b>[AMI policies and snapshot policies that target instances only]</b> A collection of key/value pairs
     *        with values determined dynamically when the policy is executed. Keys may be any valid Amazon EC2 tag key.
     *        Values must be in one of the two following formats: <code>$(instance-id)</code> or
     *        <code>$(timestamp)</code>. Variable tags are only valid for EBS Snapshot Management – Instance policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withVariableTags(Tag... variableTags) {
        if (this.variableTags == null) {
            setVariableTags(new java.util.ArrayList<Tag>(variableTags.length));
        }
        for (Tag ele : variableTags) {
            this.variableTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * <b>[AMI policies and snapshot policies that target instances only]</b> A collection of key/value pairs with
     * values determined dynamically when the policy is executed. Keys may be any valid Amazon EC2 tag key. Values must
     * be in one of the two following formats: <code>$(instance-id)</code> or <code>$(timestamp)</code>. Variable tags
     * are only valid for EBS Snapshot Management – Instance policies.
     * </p>
     * 
     * @param variableTags
     *        <b>[AMI policies and snapshot policies that target instances only]</b> A collection of key/value pairs
     *        with values determined dynamically when the policy is executed. Keys may be any valid Amazon EC2 tag key.
     *        Values must be in one of the two following formats: <code>$(instance-id)</code> or
     *        <code>$(timestamp)</code>. Variable tags are only valid for EBS Snapshot Management – Instance policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withVariableTags(java.util.Collection<Tag> variableTags) {
        setVariableTags(variableTags);
        return this;
    }

    /**
     * <p>
     * The creation rule.
     * </p>
     * 
     * @param createRule
     *        The creation rule.
     */

    public void setCreateRule(CreateRule createRule) {
        this.createRule = createRule;
    }

    /**
     * <p>
     * The creation rule.
     * </p>
     * 
     * @return The creation rule.
     */

    public CreateRule getCreateRule() {
        return this.createRule;
    }

    /**
     * <p>
     * The creation rule.
     * </p>
     * 
     * @param createRule
     *        The creation rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withCreateRule(CreateRule createRule) {
        setCreateRule(createRule);
        return this;
    }

    /**
     * <p>
     * The retention rule for snapshots or AMIs created by the policy.
     * </p>
     * 
     * @param retainRule
     *        The retention rule for snapshots or AMIs created by the policy.
     */

    public void setRetainRule(RetainRule retainRule) {
        this.retainRule = retainRule;
    }

    /**
     * <p>
     * The retention rule for snapshots or AMIs created by the policy.
     * </p>
     * 
     * @return The retention rule for snapshots or AMIs created by the policy.
     */

    public RetainRule getRetainRule() {
        return this.retainRule;
    }

    /**
     * <p>
     * The retention rule for snapshots or AMIs created by the policy.
     * </p>
     * 
     * @param retainRule
     *        The retention rule for snapshots or AMIs created by the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withRetainRule(RetainRule retainRule) {
        setRetainRule(retainRule);
        return this;
    }

    /**
     * <p>
     * <b>[Snapshot policies only]</b> The rule for enabling fast snapshot restore.
     * </p>
     * 
     * @param fastRestoreRule
     *        <b>[Snapshot policies only]</b> The rule for enabling fast snapshot restore.
     */

    public void setFastRestoreRule(FastRestoreRule fastRestoreRule) {
        this.fastRestoreRule = fastRestoreRule;
    }

    /**
     * <p>
     * <b>[Snapshot policies only]</b> The rule for enabling fast snapshot restore.
     * </p>
     * 
     * @return <b>[Snapshot policies only]</b> The rule for enabling fast snapshot restore.
     */

    public FastRestoreRule getFastRestoreRule() {
        return this.fastRestoreRule;
    }

    /**
     * <p>
     * <b>[Snapshot policies only]</b> The rule for enabling fast snapshot restore.
     * </p>
     * 
     * @param fastRestoreRule
     *        <b>[Snapshot policies only]</b> The rule for enabling fast snapshot restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withFastRestoreRule(FastRestoreRule fastRestoreRule) {
        setFastRestoreRule(fastRestoreRule);
        return this;
    }

    /**
     * <p>
     * Specifies a rule for copying snapshots or AMIs across regions.
     * </p>
     * <note>
     * <p>
     * You can't specify cross-Region copy rules for policies that create snapshots on an Outpost. If the policy creates
     * snapshots in a Region, then snapshots can be copied to up to three Regions or Outposts.
     * </p>
     * </note>
     * 
     * @return Specifies a rule for copying snapshots or AMIs across regions.</p> <note>
     *         <p>
     *         You can't specify cross-Region copy rules for policies that create snapshots on an Outpost. If the policy
     *         creates snapshots in a Region, then snapshots can be copied to up to three Regions or Outposts.
     *         </p>
     */

    public java.util.List<CrossRegionCopyRule> getCrossRegionCopyRules() {
        return crossRegionCopyRules;
    }

    /**
     * <p>
     * Specifies a rule for copying snapshots or AMIs across regions.
     * </p>
     * <note>
     * <p>
     * You can't specify cross-Region copy rules for policies that create snapshots on an Outpost. If the policy creates
     * snapshots in a Region, then snapshots can be copied to up to three Regions or Outposts.
     * </p>
     * </note>
     * 
     * @param crossRegionCopyRules
     *        Specifies a rule for copying snapshots or AMIs across regions.</p> <note>
     *        <p>
     *        You can't specify cross-Region copy rules for policies that create snapshots on an Outpost. If the policy
     *        creates snapshots in a Region, then snapshots can be copied to up to three Regions or Outposts.
     *        </p>
     */

    public void setCrossRegionCopyRules(java.util.Collection<CrossRegionCopyRule> crossRegionCopyRules) {
        if (crossRegionCopyRules == null) {
            this.crossRegionCopyRules = null;
            return;
        }

        this.crossRegionCopyRules = new java.util.ArrayList<CrossRegionCopyRule>(crossRegionCopyRules);
    }

    /**
     * <p>
     * Specifies a rule for copying snapshots or AMIs across regions.
     * </p>
     * <note>
     * <p>
     * You can't specify cross-Region copy rules for policies that create snapshots on an Outpost. If the policy creates
     * snapshots in a Region, then snapshots can be copied to up to three Regions or Outposts.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCrossRegionCopyRules(java.util.Collection)} or {@link #withCrossRegionCopyRules(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param crossRegionCopyRules
     *        Specifies a rule for copying snapshots or AMIs across regions.</p> <note>
     *        <p>
     *        You can't specify cross-Region copy rules for policies that create snapshots on an Outpost. If the policy
     *        creates snapshots in a Region, then snapshots can be copied to up to three Regions or Outposts.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withCrossRegionCopyRules(CrossRegionCopyRule... crossRegionCopyRules) {
        if (this.crossRegionCopyRules == null) {
            setCrossRegionCopyRules(new java.util.ArrayList<CrossRegionCopyRule>(crossRegionCopyRules.length));
        }
        for (CrossRegionCopyRule ele : crossRegionCopyRules) {
            this.crossRegionCopyRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a rule for copying snapshots or AMIs across regions.
     * </p>
     * <note>
     * <p>
     * You can't specify cross-Region copy rules for policies that create snapshots on an Outpost. If the policy creates
     * snapshots in a Region, then snapshots can be copied to up to three Regions or Outposts.
     * </p>
     * </note>
     * 
     * @param crossRegionCopyRules
     *        Specifies a rule for copying snapshots or AMIs across regions.</p> <note>
     *        <p>
     *        You can't specify cross-Region copy rules for policies that create snapshots on an Outpost. If the policy
     *        creates snapshots in a Region, then snapshots can be copied to up to three Regions or Outposts.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withCrossRegionCopyRules(java.util.Collection<CrossRegionCopyRule> crossRegionCopyRules) {
        setCrossRegionCopyRules(crossRegionCopyRules);
        return this;
    }

    /**
     * <p>
     * <b>[Snapshot policies only]</b> The rule for sharing snapshots with other Amazon Web Services accounts.
     * </p>
     * 
     * @return <b>[Snapshot policies only]</b> The rule for sharing snapshots with other Amazon Web Services accounts.
     */

    public java.util.List<ShareRule> getShareRules() {
        return shareRules;
    }

    /**
     * <p>
     * <b>[Snapshot policies only]</b> The rule for sharing snapshots with other Amazon Web Services accounts.
     * </p>
     * 
     * @param shareRules
     *        <b>[Snapshot policies only]</b> The rule for sharing snapshots with other Amazon Web Services accounts.
     */

    public void setShareRules(java.util.Collection<ShareRule> shareRules) {
        if (shareRules == null) {
            this.shareRules = null;
            return;
        }

        this.shareRules = new java.util.ArrayList<ShareRule>(shareRules);
    }

    /**
     * <p>
     * <b>[Snapshot policies only]</b> The rule for sharing snapshots with other Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setShareRules(java.util.Collection)} or {@link #withShareRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param shareRules
     *        <b>[Snapshot policies only]</b> The rule for sharing snapshots with other Amazon Web Services accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withShareRules(ShareRule... shareRules) {
        if (this.shareRules == null) {
            setShareRules(new java.util.ArrayList<ShareRule>(shareRules.length));
        }
        for (ShareRule ele : shareRules) {
            this.shareRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * <b>[Snapshot policies only]</b> The rule for sharing snapshots with other Amazon Web Services accounts.
     * </p>
     * 
     * @param shareRules
     *        <b>[Snapshot policies only]</b> The rule for sharing snapshots with other Amazon Web Services accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withShareRules(java.util.Collection<ShareRule> shareRules) {
        setShareRules(shareRules);
        return this;
    }

    /**
     * <p>
     * <b>[AMI policies only]</b> The AMI deprecation rule for the schedule.
     * </p>
     * 
     * @param deprecateRule
     *        <b>[AMI policies only]</b> The AMI deprecation rule for the schedule.
     */

    public void setDeprecateRule(DeprecateRule deprecateRule) {
        this.deprecateRule = deprecateRule;
    }

    /**
     * <p>
     * <b>[AMI policies only]</b> The AMI deprecation rule for the schedule.
     * </p>
     * 
     * @return <b>[AMI policies only]</b> The AMI deprecation rule for the schedule.
     */

    public DeprecateRule getDeprecateRule() {
        return this.deprecateRule;
    }

    /**
     * <p>
     * <b>[AMI policies only]</b> The AMI deprecation rule for the schedule.
     * </p>
     * 
     * @param deprecateRule
     *        <b>[AMI policies only]</b> The AMI deprecation rule for the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withDeprecateRule(DeprecateRule deprecateRule) {
        setDeprecateRule(deprecateRule);
        return this;
    }

    /**
     * <p>
     * <b>[Snapshot policies that target volumes only]</b> The snapshot archiving rule for the schedule. When you
     * specify an archiving rule, snapshots are automatically moved from the standard tier to the archive tier once the
     * schedule's retention threshold is met. Snapshots are then retained in the archive tier for the archive retention
     * period that you specify.
     * </p>
     * <p>
     * For more information about using snapshot archiving, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive">Considerations
     * for snapshot lifecycle policies</a>.
     * </p>
     * 
     * @param archiveRule
     *        <b>[Snapshot policies that target volumes only]</b> The snapshot archiving rule for the schedule. When you
     *        specify an archiving rule, snapshots are automatically moved from the standard tier to the archive tier
     *        once the schedule's retention threshold is met. Snapshots are then retained in the archive tier for the
     *        archive retention period that you specify. </p>
     *        <p>
     *        For more information about using snapshot archiving, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive"
     *        >Considerations for snapshot lifecycle policies</a>.
     */

    public void setArchiveRule(ArchiveRule archiveRule) {
        this.archiveRule = archiveRule;
    }

    /**
     * <p>
     * <b>[Snapshot policies that target volumes only]</b> The snapshot archiving rule for the schedule. When you
     * specify an archiving rule, snapshots are automatically moved from the standard tier to the archive tier once the
     * schedule's retention threshold is met. Snapshots are then retained in the archive tier for the archive retention
     * period that you specify.
     * </p>
     * <p>
     * For more information about using snapshot archiving, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive">Considerations
     * for snapshot lifecycle policies</a>.
     * </p>
     * 
     * @return <b>[Snapshot policies that target volumes only]</b> The snapshot archiving rule for the schedule. When
     *         you specify an archiving rule, snapshots are automatically moved from the standard tier to the archive
     *         tier once the schedule's retention threshold is met. Snapshots are then retained in the archive tier for
     *         the archive retention period that you specify. </p>
     *         <p>
     *         For more information about using snapshot archiving, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive"
     *         >Considerations for snapshot lifecycle policies</a>.
     */

    public ArchiveRule getArchiveRule() {
        return this.archiveRule;
    }

    /**
     * <p>
     * <b>[Snapshot policies that target volumes only]</b> The snapshot archiving rule for the schedule. When you
     * specify an archiving rule, snapshots are automatically moved from the standard tier to the archive tier once the
     * schedule's retention threshold is met. Snapshots are then retained in the archive tier for the archive retention
     * period that you specify.
     * </p>
     * <p>
     * For more information about using snapshot archiving, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive">Considerations
     * for snapshot lifecycle policies</a>.
     * </p>
     * 
     * @param archiveRule
     *        <b>[Snapshot policies that target volumes only]</b> The snapshot archiving rule for the schedule. When you
     *        specify an archiving rule, snapshots are automatically moved from the standard tier to the archive tier
     *        once the schedule's retention threshold is met. Snapshots are then retained in the archive tier for the
     *        archive retention period that you specify. </p>
     *        <p>
     *        For more information about using snapshot archiving, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-ami-policy.html#dlm-archive"
     *        >Considerations for snapshot lifecycle policies</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withArchiveRule(ArchiveRule archiveRule) {
        setArchiveRule(archiveRule);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCopyTags() != null)
            sb.append("CopyTags: ").append(getCopyTags()).append(",");
        if (getTagsToAdd() != null)
            sb.append("TagsToAdd: ").append(getTagsToAdd()).append(",");
        if (getVariableTags() != null)
            sb.append("VariableTags: ").append(getVariableTags()).append(",");
        if (getCreateRule() != null)
            sb.append("CreateRule: ").append(getCreateRule()).append(",");
        if (getRetainRule() != null)
            sb.append("RetainRule: ").append(getRetainRule()).append(",");
        if (getFastRestoreRule() != null)
            sb.append("FastRestoreRule: ").append(getFastRestoreRule()).append(",");
        if (getCrossRegionCopyRules() != null)
            sb.append("CrossRegionCopyRules: ").append(getCrossRegionCopyRules()).append(",");
        if (getShareRules() != null)
            sb.append("ShareRules: ").append(getShareRules()).append(",");
        if (getDeprecateRule() != null)
            sb.append("DeprecateRule: ").append(getDeprecateRule()).append(",");
        if (getArchiveRule() != null)
            sb.append("ArchiveRule: ").append(getArchiveRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Schedule == false)
            return false;
        Schedule other = (Schedule) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCopyTags() == null ^ this.getCopyTags() == null)
            return false;
        if (other.getCopyTags() != null && other.getCopyTags().equals(this.getCopyTags()) == false)
            return false;
        if (other.getTagsToAdd() == null ^ this.getTagsToAdd() == null)
            return false;
        if (other.getTagsToAdd() != null && other.getTagsToAdd().equals(this.getTagsToAdd()) == false)
            return false;
        if (other.getVariableTags() == null ^ this.getVariableTags() == null)
            return false;
        if (other.getVariableTags() != null && other.getVariableTags().equals(this.getVariableTags()) == false)
            return false;
        if (other.getCreateRule() == null ^ this.getCreateRule() == null)
            return false;
        if (other.getCreateRule() != null && other.getCreateRule().equals(this.getCreateRule()) == false)
            return false;
        if (other.getRetainRule() == null ^ this.getRetainRule() == null)
            return false;
        if (other.getRetainRule() != null && other.getRetainRule().equals(this.getRetainRule()) == false)
            return false;
        if (other.getFastRestoreRule() == null ^ this.getFastRestoreRule() == null)
            return false;
        if (other.getFastRestoreRule() != null && other.getFastRestoreRule().equals(this.getFastRestoreRule()) == false)
            return false;
        if (other.getCrossRegionCopyRules() == null ^ this.getCrossRegionCopyRules() == null)
            return false;
        if (other.getCrossRegionCopyRules() != null && other.getCrossRegionCopyRules().equals(this.getCrossRegionCopyRules()) == false)
            return false;
        if (other.getShareRules() == null ^ this.getShareRules() == null)
            return false;
        if (other.getShareRules() != null && other.getShareRules().equals(this.getShareRules()) == false)
            return false;
        if (other.getDeprecateRule() == null ^ this.getDeprecateRule() == null)
            return false;
        if (other.getDeprecateRule() != null && other.getDeprecateRule().equals(this.getDeprecateRule()) == false)
            return false;
        if (other.getArchiveRule() == null ^ this.getArchiveRule() == null)
            return false;
        if (other.getArchiveRule() != null && other.getArchiveRule().equals(this.getArchiveRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        hashCode = prime * hashCode + ((getTagsToAdd() == null) ? 0 : getTagsToAdd().hashCode());
        hashCode = prime * hashCode + ((getVariableTags() == null) ? 0 : getVariableTags().hashCode());
        hashCode = prime * hashCode + ((getCreateRule() == null) ? 0 : getCreateRule().hashCode());
        hashCode = prime * hashCode + ((getRetainRule() == null) ? 0 : getRetainRule().hashCode());
        hashCode = prime * hashCode + ((getFastRestoreRule() == null) ? 0 : getFastRestoreRule().hashCode());
        hashCode = prime * hashCode + ((getCrossRegionCopyRules() == null) ? 0 : getCrossRegionCopyRules().hashCode());
        hashCode = prime * hashCode + ((getShareRules() == null) ? 0 : getShareRules().hashCode());
        hashCode = prime * hashCode + ((getDeprecateRule() == null) ? 0 : getDeprecateRule().hashCode());
        hashCode = prime * hashCode + ((getArchiveRule() == null) ? 0 : getArchiveRule().hashCode());
        return hashCode;
    }

    @Override
    public Schedule clone() {
        try {
            return (Schedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.ScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
