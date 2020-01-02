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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CopySnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopySnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the source manual snapshot to copy.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define this parameter only when copying a manual snapshot as another manual snapshot.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceSnapshotName;
    /**
     * <p>
     * The name of the source instance or disk from which the source automatic snapshot was created.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the
     * <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots">
     * Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceResourceName;
    /**
     * <p>
     * The date of the source automatic snapshot to copy. Use the <code>get auto snapshots</code> operation to identify
     * the dates of the available automatic snapshots.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be specified in <code>YYYY-MM-DD</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>use latest restorable auto snapshot</code> parameter.
     * The <code>restore date</code> and <code>use latest restorable auto snapshot</code> parameters are mutually
     * exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the
     * <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots">
     * Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String restoreDate;
    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic snapshot of the specified source
     * instance or disk.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the
     * <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots">
     * Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean useLatestRestorableAutoSnapshot;
    /**
     * <p>
     * The name of the new manual snapshot to be created as a copy.
     * </p>
     */
    private String targetSnapshotName;
    /**
     * <p>
     * The AWS Region where the source manual or automatic snapshot is located.
     * </p>
     */
    private String sourceRegion;

    /**
     * <p>
     * The name of the source manual snapshot to copy.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define this parameter only when copying a manual snapshot as another manual snapshot.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceSnapshotName
     *        The name of the source manual snapshot to copy.</p>
     *        <p>
     *        Constraint:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Define this parameter only when copying a manual snapshot as another manual snapshot.
     *        </p>
     *        </li>
     */

    public void setSourceSnapshotName(String sourceSnapshotName) {
        this.sourceSnapshotName = sourceSnapshotName;
    }

    /**
     * <p>
     * The name of the source manual snapshot to copy.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define this parameter only when copying a manual snapshot as another manual snapshot.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the source manual snapshot to copy.</p>
     *         <p>
     *         Constraint:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Define this parameter only when copying a manual snapshot as another manual snapshot.
     *         </p>
     *         </li>
     */

    public String getSourceSnapshotName() {
        return this.sourceSnapshotName;
    }

    /**
     * <p>
     * The name of the source manual snapshot to copy.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define this parameter only when copying a manual snapshot as another manual snapshot.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceSnapshotName
     *        The name of the source manual snapshot to copy.</p>
     *        <p>
     *        Constraint:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Define this parameter only when copying a manual snapshot as another manual snapshot.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withSourceSnapshotName(String sourceSnapshotName) {
        setSourceSnapshotName(sourceSnapshotName);
        return this;
    }

    /**
     * <p>
     * The name of the source instance or disk from which the source automatic snapshot was created.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the
     * <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots">
     * Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceResourceName
     *        The name of the source instance or disk from which the source automatic snapshot was created.</p>
     *        <p>
     *        Constraint:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information,
     *        see the <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *        >Lightsail Dev Guide</a>.
     *        </p>
     *        </li>
     */

    public void setSourceResourceName(String sourceResourceName) {
        this.sourceResourceName = sourceResourceName;
    }

    /**
     * <p>
     * The name of the source instance or disk from which the source automatic snapshot was created.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the
     * <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots">
     * Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the source instance or disk from which the source automatic snapshot was created.</p>
     *         <p>
     *         Constraint:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information,
     *         see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     *         </li>
     */

    public String getSourceResourceName() {
        return this.sourceResourceName;
    }

    /**
     * <p>
     * The name of the source instance or disk from which the source automatic snapshot was created.
     * </p>
     * <p>
     * Constraint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the
     * <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots">
     * Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceResourceName
     *        The name of the source instance or disk from which the source automatic snapshot was created.</p>
     *        <p>
     *        Constraint:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information,
     *        see the <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *        >Lightsail Dev Guide</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withSourceResourceName(String sourceResourceName) {
        setSourceResourceName(sourceResourceName);
        return this;
    }

    /**
     * <p>
     * The date of the source automatic snapshot to copy. Use the <code>get auto snapshots</code> operation to identify
     * the dates of the available automatic snapshots.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be specified in <code>YYYY-MM-DD</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>use latest restorable auto snapshot</code> parameter.
     * The <code>restore date</code> and <code>use latest restorable auto snapshot</code> parameters are mutually
     * exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the
     * <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots">
     * Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreDate
     *        The date of the source automatic snapshot to copy. Use the <code>get auto snapshots</code> operation to
     *        identify the dates of the available automatic snapshots.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be specified in <code>YYYY-MM-DD</code> format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This parameter cannot be defined together with the <code>use latest restorable auto snapshot</code>
     *        parameter. The <code>restore date</code> and <code>use latest restorable auto snapshot</code> parameters
     *        are mutually exclusive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information,
     *        see the <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *        >Lightsail Dev Guide</a>.
     *        </p>
     *        </li>
     */

    public void setRestoreDate(String restoreDate) {
        this.restoreDate = restoreDate;
    }

    /**
     * <p>
     * The date of the source automatic snapshot to copy. Use the <code>get auto snapshots</code> operation to identify
     * the dates of the available automatic snapshots.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be specified in <code>YYYY-MM-DD</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>use latest restorable auto snapshot</code> parameter.
     * The <code>restore date</code> and <code>use latest restorable auto snapshot</code> parameters are mutually
     * exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the
     * <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots">
     * Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The date of the source automatic snapshot to copy. Use the <code>get auto snapshots</code> operation to
     *         identify the dates of the available automatic snapshots.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be specified in <code>YYYY-MM-DD</code> format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         This parameter cannot be defined together with the <code>use latest restorable auto snapshot</code>
     *         parameter. The <code>restore date</code> and <code>use latest restorable auto snapshot</code> parameters
     *         are mutually exclusive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information,
     *         see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     *         </li>
     */

    public String getRestoreDate() {
        return this.restoreDate;
    }

    /**
     * <p>
     * The date of the source automatic snapshot to copy. Use the <code>get auto snapshots</code> operation to identify
     * the dates of the available automatic snapshots.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be specified in <code>YYYY-MM-DD</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>use latest restorable auto snapshot</code> parameter.
     * The <code>restore date</code> and <code>use latest restorable auto snapshot</code> parameters are mutually
     * exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the
     * <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots">
     * Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreDate
     *        The date of the source automatic snapshot to copy. Use the <code>get auto snapshots</code> operation to
     *        identify the dates of the available automatic snapshots.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be specified in <code>YYYY-MM-DD</code> format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        This parameter cannot be defined together with the <code>use latest restorable auto snapshot</code>
     *        parameter. The <code>restore date</code> and <code>use latest restorable auto snapshot</code> parameters
     *        are mutually exclusive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information,
     *        see the <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *        >Lightsail Dev Guide</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withRestoreDate(String restoreDate) {
        setRestoreDate(restoreDate);
        return this;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic snapshot of the specified source
     * instance or disk.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the
     * <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots">
     * Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param useLatestRestorableAutoSnapshot
     *        A Boolean value to indicate whether to use the latest available automatic snapshot of the specified source
     *        instance or disk.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        This parameter cannot be defined together with the <code>restore date</code> parameter. The
     *        <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually
     *        exclusive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information,
     *        see the <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *        >Lightsail Dev Guide</a>.
     *        </p>
     *        </li>
     */

    public void setUseLatestRestorableAutoSnapshot(Boolean useLatestRestorableAutoSnapshot) {
        this.useLatestRestorableAutoSnapshot = useLatestRestorableAutoSnapshot;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic snapshot of the specified source
     * instance or disk.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the
     * <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots">
     * Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A Boolean value to indicate whether to use the latest available automatic snapshot of the specified
     *         source instance or disk.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This parameter cannot be defined together with the <code>restore date</code> parameter. The
     *         <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually
     *         exclusive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information,
     *         see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     *         </li>
     */

    public Boolean getUseLatestRestorableAutoSnapshot() {
        return this.useLatestRestorableAutoSnapshot;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic snapshot of the specified source
     * instance or disk.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the
     * <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots">
     * Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param useLatestRestorableAutoSnapshot
     *        A Boolean value to indicate whether to use the latest available automatic snapshot of the specified source
     *        instance or disk.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        This parameter cannot be defined together with the <code>restore date</code> parameter. The
     *        <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually
     *        exclusive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information,
     *        see the <a href=
     *        "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *        >Lightsail Dev Guide</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withUseLatestRestorableAutoSnapshot(Boolean useLatestRestorableAutoSnapshot) {
        setUseLatestRestorableAutoSnapshot(useLatestRestorableAutoSnapshot);
        return this;
    }

    /**
     * <p>
     * A Boolean value to indicate whether to use the latest available automatic snapshot of the specified source
     * instance or disk.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This parameter cannot be defined together with the <code>restore date</code> parameter. The
     * <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually exclusive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information, see the
     * <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots">
     * Lightsail Dev Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A Boolean value to indicate whether to use the latest available automatic snapshot of the specified
     *         source instance or disk.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This parameter cannot be defined together with the <code>restore date</code> parameter. The
     *         <code>use latest restorable auto snapshot</code> and <code>restore date</code> parameters are mutually
     *         exclusive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Define this parameter only when copying an automatic snapshot as a manual snapshot. For more information,
     *         see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-keeping-automatic-snapshots"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     *         </li>
     */

    public Boolean isUseLatestRestorableAutoSnapshot() {
        return this.useLatestRestorableAutoSnapshot;
    }

    /**
     * <p>
     * The name of the new manual snapshot to be created as a copy.
     * </p>
     * 
     * @param targetSnapshotName
     *        The name of the new manual snapshot to be created as a copy.
     */

    public void setTargetSnapshotName(String targetSnapshotName) {
        this.targetSnapshotName = targetSnapshotName;
    }

    /**
     * <p>
     * The name of the new manual snapshot to be created as a copy.
     * </p>
     * 
     * @return The name of the new manual snapshot to be created as a copy.
     */

    public String getTargetSnapshotName() {
        return this.targetSnapshotName;
    }

    /**
     * <p>
     * The name of the new manual snapshot to be created as a copy.
     * </p>
     * 
     * @param targetSnapshotName
     *        The name of the new manual snapshot to be created as a copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopySnapshotRequest withTargetSnapshotName(String targetSnapshotName) {
        setTargetSnapshotName(targetSnapshotName);
        return this;
    }

    /**
     * <p>
     * The AWS Region where the source manual or automatic snapshot is located.
     * </p>
     * 
     * @param sourceRegion
     *        The AWS Region where the source manual or automatic snapshot is located.
     * @see RegionName
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The AWS Region where the source manual or automatic snapshot is located.
     * </p>
     * 
     * @return The AWS Region where the source manual or automatic snapshot is located.
     * @see RegionName
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * The AWS Region where the source manual or automatic snapshot is located.
     * </p>
     * 
     * @param sourceRegion
     *        The AWS Region where the source manual or automatic snapshot is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionName
     */

    public CopySnapshotRequest withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * <p>
     * The AWS Region where the source manual or automatic snapshot is located.
     * </p>
     * 
     * @param sourceRegion
     *        The AWS Region where the source manual or automatic snapshot is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionName
     */

    public CopySnapshotRequest withSourceRegion(RegionName sourceRegion) {
        this.sourceRegion = sourceRegion.toString();
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
        if (getSourceSnapshotName() != null)
            sb.append("SourceSnapshotName: ").append(getSourceSnapshotName()).append(",");
        if (getSourceResourceName() != null)
            sb.append("SourceResourceName: ").append(getSourceResourceName()).append(",");
        if (getRestoreDate() != null)
            sb.append("RestoreDate: ").append(getRestoreDate()).append(",");
        if (getUseLatestRestorableAutoSnapshot() != null)
            sb.append("UseLatestRestorableAutoSnapshot: ").append(getUseLatestRestorableAutoSnapshot()).append(",");
        if (getTargetSnapshotName() != null)
            sb.append("TargetSnapshotName: ").append(getTargetSnapshotName()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopySnapshotRequest == false)
            return false;
        CopySnapshotRequest other = (CopySnapshotRequest) obj;
        if (other.getSourceSnapshotName() == null ^ this.getSourceSnapshotName() == null)
            return false;
        if (other.getSourceSnapshotName() != null && other.getSourceSnapshotName().equals(this.getSourceSnapshotName()) == false)
            return false;
        if (other.getSourceResourceName() == null ^ this.getSourceResourceName() == null)
            return false;
        if (other.getSourceResourceName() != null && other.getSourceResourceName().equals(this.getSourceResourceName()) == false)
            return false;
        if (other.getRestoreDate() == null ^ this.getRestoreDate() == null)
            return false;
        if (other.getRestoreDate() != null && other.getRestoreDate().equals(this.getRestoreDate()) == false)
            return false;
        if (other.getUseLatestRestorableAutoSnapshot() == null ^ this.getUseLatestRestorableAutoSnapshot() == null)
            return false;
        if (other.getUseLatestRestorableAutoSnapshot() != null
                && other.getUseLatestRestorableAutoSnapshot().equals(this.getUseLatestRestorableAutoSnapshot()) == false)
            return false;
        if (other.getTargetSnapshotName() == null ^ this.getTargetSnapshotName() == null)
            return false;
        if (other.getTargetSnapshotName() != null && other.getTargetSnapshotName().equals(this.getTargetSnapshotName()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceSnapshotName() == null) ? 0 : getSourceSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getSourceResourceName() == null) ? 0 : getSourceResourceName().hashCode());
        hashCode = prime * hashCode + ((getRestoreDate() == null) ? 0 : getRestoreDate().hashCode());
        hashCode = prime * hashCode + ((getUseLatestRestorableAutoSnapshot() == null) ? 0 : getUseLatestRestorableAutoSnapshot().hashCode());
        hashCode = prime * hashCode + ((getTargetSnapshotName() == null) ? 0 : getTargetSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        return hashCode;
    }

    @Override
    public CopySnapshotRequest clone() {
        return (CopySnapshotRequest) super.clone();
    }

}
