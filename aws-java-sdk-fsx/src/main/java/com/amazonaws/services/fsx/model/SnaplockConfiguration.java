/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the SnapLock configuration for an FSx for ONTAP SnapLock volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/SnaplockConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnaplockConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables or disables the audit log volume for an FSx for ONTAP SnapLock volume. The default value is
     * <code>false</code>. If you set <code>AuditLogVolume</code> to <code>true</code>, the SnapLock volume is created
     * as an audit log volume. The minimum retention period for an audit log volume is six months.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/how-snaplock-works.html#snaplock-audit-log-volume">
     * SnapLock audit log volumes</a>.
     * </p>
     */
    private Boolean auditLogVolume;
    /**
     * <p>
     * The configuration object for setting the autocommit period of files in an FSx for ONTAP SnapLock volume.
     * </p>
     */
    private AutocommitPeriod autocommitPeriod;
    /**
     * <p>
     * Enables, disables, or permanently disables privileged delete on an FSx for ONTAP SnapLock Enterprise volume.
     * Enabling privileged delete allows SnapLock administrators to delete write once, read many (WORM) files even if
     * they have active retention periods. <code>PERMANENTLY_DISABLED</code> is a terminal state. If privileged delete
     * is permanently disabled on a SnapLock volume, you can't re-enable it. The default value is <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html#privileged-delete">Privileged
     * delete</a>.
     * </p>
     */
    private String privilegedDelete;
    /**
     * <p>
     * Specifies the retention period of an FSx for ONTAP SnapLock volume.
     * </p>
     */
    private SnaplockRetentionPeriod retentionPeriod;
    /**
     * <p>
     * Specifies the retention mode of an FSx for ONTAP SnapLock volume. After it is set, it can't be changed. You can
     * choose one of the following retention modes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLIANCE</code>: Files transitioned to write once, read many (WORM) on a Compliance volume can't be
     * deleted until their retention periods expire. This retention mode is used to address government or
     * industry-specific mandates or to protect against ransomware attacks. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-compliance.html">SnapLock Compliance</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENTERPRISE</code>: Files transitioned to WORM on an Enterprise volume can be deleted by authorized users
     * before their retention periods expire using privileged delete. This retention mode is used to advance an
     * organization's data integrity and internal compliance or to test retention settings before using SnapLock
     * Compliance. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html">SnapLock Enterprise</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String snaplockType;
    /**
     * <p>
     * Enables or disables volume-append mode on an FSx for ONTAP SnapLock volume. Volume-append mode allows you to
     * create WORM-appendable files and write data to them incrementally. The default value is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/worm-state.html#worm-state-append">Volume-append
     * mode</a>.
     * </p>
     */
    private Boolean volumeAppendModeEnabled;

    /**
     * <p>
     * Enables or disables the audit log volume for an FSx for ONTAP SnapLock volume. The default value is
     * <code>false</code>. If you set <code>AuditLogVolume</code> to <code>true</code>, the SnapLock volume is created
     * as an audit log volume. The minimum retention period for an audit log volume is six months.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/how-snaplock-works.html#snaplock-audit-log-volume">
     * SnapLock audit log volumes</a>.
     * </p>
     * 
     * @param auditLogVolume
     *        Enables or disables the audit log volume for an FSx for ONTAP SnapLock volume. The default value is
     *        <code>false</code>. If you set <code>AuditLogVolume</code> to <code>true</code>, the SnapLock volume is
     *        created as an audit log volume. The minimum retention period for an audit log volume is six months. </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/how-snaplock-works.html#snaplock-audit-log-volume">
     *        SnapLock audit log volumes</a>.
     */

    public void setAuditLogVolume(Boolean auditLogVolume) {
        this.auditLogVolume = auditLogVolume;
    }

    /**
     * <p>
     * Enables or disables the audit log volume for an FSx for ONTAP SnapLock volume. The default value is
     * <code>false</code>. If you set <code>AuditLogVolume</code> to <code>true</code>, the SnapLock volume is created
     * as an audit log volume. The minimum retention period for an audit log volume is six months.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/how-snaplock-works.html#snaplock-audit-log-volume">
     * SnapLock audit log volumes</a>.
     * </p>
     * 
     * @return Enables or disables the audit log volume for an FSx for ONTAP SnapLock volume. The default value is
     *         <code>false</code>. If you set <code>AuditLogVolume</code> to <code>true</code>, the SnapLock volume is
     *         created as an audit log volume. The minimum retention period for an audit log volume is six months. </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/how-snaplock-works.html#snaplock-audit-log-volume">
     *         SnapLock audit log volumes</a>.
     */

    public Boolean getAuditLogVolume() {
        return this.auditLogVolume;
    }

    /**
     * <p>
     * Enables or disables the audit log volume for an FSx for ONTAP SnapLock volume. The default value is
     * <code>false</code>. If you set <code>AuditLogVolume</code> to <code>true</code>, the SnapLock volume is created
     * as an audit log volume. The minimum retention period for an audit log volume is six months.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/how-snaplock-works.html#snaplock-audit-log-volume">
     * SnapLock audit log volumes</a>.
     * </p>
     * 
     * @param auditLogVolume
     *        Enables or disables the audit log volume for an FSx for ONTAP SnapLock volume. The default value is
     *        <code>false</code>. If you set <code>AuditLogVolume</code> to <code>true</code>, the SnapLock volume is
     *        created as an audit log volume. The minimum retention period for an audit log volume is six months. </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/how-snaplock-works.html#snaplock-audit-log-volume">
     *        SnapLock audit log volumes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnaplockConfiguration withAuditLogVolume(Boolean auditLogVolume) {
        setAuditLogVolume(auditLogVolume);
        return this;
    }

    /**
     * <p>
     * Enables or disables the audit log volume for an FSx for ONTAP SnapLock volume. The default value is
     * <code>false</code>. If you set <code>AuditLogVolume</code> to <code>true</code>, the SnapLock volume is created
     * as an audit log volume. The minimum retention period for an audit log volume is six months.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/how-snaplock-works.html#snaplock-audit-log-volume">
     * SnapLock audit log volumes</a>.
     * </p>
     * 
     * @return Enables or disables the audit log volume for an FSx for ONTAP SnapLock volume. The default value is
     *         <code>false</code>. If you set <code>AuditLogVolume</code> to <code>true</code>, the SnapLock volume is
     *         created as an audit log volume. The minimum retention period for an audit log volume is six months. </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/how-snaplock-works.html#snaplock-audit-log-volume">
     *         SnapLock audit log volumes</a>.
     */

    public Boolean isAuditLogVolume() {
        return this.auditLogVolume;
    }

    /**
     * <p>
     * The configuration object for setting the autocommit period of files in an FSx for ONTAP SnapLock volume.
     * </p>
     * 
     * @param autocommitPeriod
     *        The configuration object for setting the autocommit period of files in an FSx for ONTAP SnapLock volume.
     */

    public void setAutocommitPeriod(AutocommitPeriod autocommitPeriod) {
        this.autocommitPeriod = autocommitPeriod;
    }

    /**
     * <p>
     * The configuration object for setting the autocommit period of files in an FSx for ONTAP SnapLock volume.
     * </p>
     * 
     * @return The configuration object for setting the autocommit period of files in an FSx for ONTAP SnapLock volume.
     */

    public AutocommitPeriod getAutocommitPeriod() {
        return this.autocommitPeriod;
    }

    /**
     * <p>
     * The configuration object for setting the autocommit period of files in an FSx for ONTAP SnapLock volume.
     * </p>
     * 
     * @param autocommitPeriod
     *        The configuration object for setting the autocommit period of files in an FSx for ONTAP SnapLock volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnaplockConfiguration withAutocommitPeriod(AutocommitPeriod autocommitPeriod) {
        setAutocommitPeriod(autocommitPeriod);
        return this;
    }

    /**
     * <p>
     * Enables, disables, or permanently disables privileged delete on an FSx for ONTAP SnapLock Enterprise volume.
     * Enabling privileged delete allows SnapLock administrators to delete write once, read many (WORM) files even if
     * they have active retention periods. <code>PERMANENTLY_DISABLED</code> is a terminal state. If privileged delete
     * is permanently disabled on a SnapLock volume, you can't re-enable it. The default value is <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html#privileged-delete">Privileged
     * delete</a>.
     * </p>
     * 
     * @param privilegedDelete
     *        Enables, disables, or permanently disables privileged delete on an FSx for ONTAP SnapLock Enterprise
     *        volume. Enabling privileged delete allows SnapLock administrators to delete write once, read many (WORM)
     *        files even if they have active retention periods. <code>PERMANENTLY_DISABLED</code> is a terminal state.
     *        If privileged delete is permanently disabled on a SnapLock volume, you can't re-enable it. The default
     *        value is <code>DISABLED</code>. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html#privileged-delete"
     *        >Privileged delete</a>.
     * @see PrivilegedDelete
     */

    public void setPrivilegedDelete(String privilegedDelete) {
        this.privilegedDelete = privilegedDelete;
    }

    /**
     * <p>
     * Enables, disables, or permanently disables privileged delete on an FSx for ONTAP SnapLock Enterprise volume.
     * Enabling privileged delete allows SnapLock administrators to delete write once, read many (WORM) files even if
     * they have active retention periods. <code>PERMANENTLY_DISABLED</code> is a terminal state. If privileged delete
     * is permanently disabled on a SnapLock volume, you can't re-enable it. The default value is <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html#privileged-delete">Privileged
     * delete</a>.
     * </p>
     * 
     * @return Enables, disables, or permanently disables privileged delete on an FSx for ONTAP SnapLock Enterprise
     *         volume. Enabling privileged delete allows SnapLock administrators to delete write once, read many (WORM)
     *         files even if they have active retention periods. <code>PERMANENTLY_DISABLED</code> is a terminal state.
     *         If privileged delete is permanently disabled on a SnapLock volume, you can't re-enable it. The default
     *         value is <code>DISABLED</code>. </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html#privileged-delete"
     *         >Privileged delete</a>.
     * @see PrivilegedDelete
     */

    public String getPrivilegedDelete() {
        return this.privilegedDelete;
    }

    /**
     * <p>
     * Enables, disables, or permanently disables privileged delete on an FSx for ONTAP SnapLock Enterprise volume.
     * Enabling privileged delete allows SnapLock administrators to delete write once, read many (WORM) files even if
     * they have active retention periods. <code>PERMANENTLY_DISABLED</code> is a terminal state. If privileged delete
     * is permanently disabled on a SnapLock volume, you can't re-enable it. The default value is <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html#privileged-delete">Privileged
     * delete</a>.
     * </p>
     * 
     * @param privilegedDelete
     *        Enables, disables, or permanently disables privileged delete on an FSx for ONTAP SnapLock Enterprise
     *        volume. Enabling privileged delete allows SnapLock administrators to delete write once, read many (WORM)
     *        files even if they have active retention periods. <code>PERMANENTLY_DISABLED</code> is a terminal state.
     *        If privileged delete is permanently disabled on a SnapLock volume, you can't re-enable it. The default
     *        value is <code>DISABLED</code>. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html#privileged-delete"
     *        >Privileged delete</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivilegedDelete
     */

    public SnaplockConfiguration withPrivilegedDelete(String privilegedDelete) {
        setPrivilegedDelete(privilegedDelete);
        return this;
    }

    /**
     * <p>
     * Enables, disables, or permanently disables privileged delete on an FSx for ONTAP SnapLock Enterprise volume.
     * Enabling privileged delete allows SnapLock administrators to delete write once, read many (WORM) files even if
     * they have active retention periods. <code>PERMANENTLY_DISABLED</code> is a terminal state. If privileged delete
     * is permanently disabled on a SnapLock volume, you can't re-enable it. The default value is <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html#privileged-delete">Privileged
     * delete</a>.
     * </p>
     * 
     * @param privilegedDelete
     *        Enables, disables, or permanently disables privileged delete on an FSx for ONTAP SnapLock Enterprise
     *        volume. Enabling privileged delete allows SnapLock administrators to delete write once, read many (WORM)
     *        files even if they have active retention periods. <code>PERMANENTLY_DISABLED</code> is a terminal state.
     *        If privileged delete is permanently disabled on a SnapLock volume, you can't re-enable it. The default
     *        value is <code>DISABLED</code>. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html#privileged-delete"
     *        >Privileged delete</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivilegedDelete
     */

    public SnaplockConfiguration withPrivilegedDelete(PrivilegedDelete privilegedDelete) {
        this.privilegedDelete = privilegedDelete.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the retention period of an FSx for ONTAP SnapLock volume.
     * </p>
     * 
     * @param retentionPeriod
     *        Specifies the retention period of an FSx for ONTAP SnapLock volume.
     */

    public void setRetentionPeriod(SnaplockRetentionPeriod retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * Specifies the retention period of an FSx for ONTAP SnapLock volume.
     * </p>
     * 
     * @return Specifies the retention period of an FSx for ONTAP SnapLock volume.
     */

    public SnaplockRetentionPeriod getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * Specifies the retention period of an FSx for ONTAP SnapLock volume.
     * </p>
     * 
     * @param retentionPeriod
     *        Specifies the retention period of an FSx for ONTAP SnapLock volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnaplockConfiguration withRetentionPeriod(SnaplockRetentionPeriod retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * Specifies the retention mode of an FSx for ONTAP SnapLock volume. After it is set, it can't be changed. You can
     * choose one of the following retention modes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLIANCE</code>: Files transitioned to write once, read many (WORM) on a Compliance volume can't be
     * deleted until their retention periods expire. This retention mode is used to address government or
     * industry-specific mandates or to protect against ransomware attacks. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-compliance.html">SnapLock Compliance</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENTERPRISE</code>: Files transitioned to WORM on an Enterprise volume can be deleted by authorized users
     * before their retention periods expire using privileged delete. This retention mode is used to advance an
     * organization's data integrity and internal compliance or to test retention settings before using SnapLock
     * Compliance. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html">SnapLock Enterprise</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param snaplockType
     *        Specifies the retention mode of an FSx for ONTAP SnapLock volume. After it is set, it can't be changed.
     *        You can choose one of the following retention modes: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLIANCE</code>: Files transitioned to write once, read many (WORM) on a Compliance volume can't
     *        be deleted until their retention periods expire. This retention mode is used to address government or
     *        industry-specific mandates or to protect against ransomware attacks. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-compliance.html">SnapLock Compliance</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENTERPRISE</code>: Files transitioned to WORM on an Enterprise volume can be deleted by authorized
     *        users before their retention periods expire using privileged delete. This retention mode is used to
     *        advance an organization's data integrity and internal compliance or to test retention settings before
     *        using SnapLock Compliance. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html">SnapLock Enterprise</a>.
     *        </p>
     *        </li>
     * @see SnaplockType
     */

    public void setSnaplockType(String snaplockType) {
        this.snaplockType = snaplockType;
    }

    /**
     * <p>
     * Specifies the retention mode of an FSx for ONTAP SnapLock volume. After it is set, it can't be changed. You can
     * choose one of the following retention modes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLIANCE</code>: Files transitioned to write once, read many (WORM) on a Compliance volume can't be
     * deleted until their retention periods expire. This retention mode is used to address government or
     * industry-specific mandates or to protect against ransomware attacks. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-compliance.html">SnapLock Compliance</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENTERPRISE</code>: Files transitioned to WORM on an Enterprise volume can be deleted by authorized users
     * before their retention periods expire using privileged delete. This retention mode is used to advance an
     * organization's data integrity and internal compliance or to test retention settings before using SnapLock
     * Compliance. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html">SnapLock Enterprise</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the retention mode of an FSx for ONTAP SnapLock volume. After it is set, it can't be changed.
     *         You can choose one of the following retention modes: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COMPLIANCE</code>: Files transitioned to write once, read many (WORM) on a Compliance volume can't
     *         be deleted until their retention periods expire. This retention mode is used to address government or
     *         industry-specific mandates or to protect against ransomware attacks. For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-compliance.html">SnapLock
     *         Compliance</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENTERPRISE</code>: Files transitioned to WORM on an Enterprise volume can be deleted by authorized
     *         users before their retention periods expire using privileged delete. This retention mode is used to
     *         advance an organization's data integrity and internal compliance or to test retention settings before
     *         using SnapLock Compliance. For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html">SnapLock
     *         Enterprise</a>.
     *         </p>
     *         </li>
     * @see SnaplockType
     */

    public String getSnaplockType() {
        return this.snaplockType;
    }

    /**
     * <p>
     * Specifies the retention mode of an FSx for ONTAP SnapLock volume. After it is set, it can't be changed. You can
     * choose one of the following retention modes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLIANCE</code>: Files transitioned to write once, read many (WORM) on a Compliance volume can't be
     * deleted until their retention periods expire. This retention mode is used to address government or
     * industry-specific mandates or to protect against ransomware attacks. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-compliance.html">SnapLock Compliance</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENTERPRISE</code>: Files transitioned to WORM on an Enterprise volume can be deleted by authorized users
     * before their retention periods expire using privileged delete. This retention mode is used to advance an
     * organization's data integrity and internal compliance or to test retention settings before using SnapLock
     * Compliance. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html">SnapLock Enterprise</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param snaplockType
     *        Specifies the retention mode of an FSx for ONTAP SnapLock volume. After it is set, it can't be changed.
     *        You can choose one of the following retention modes: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLIANCE</code>: Files transitioned to write once, read many (WORM) on a Compliance volume can't
     *        be deleted until their retention periods expire. This retention mode is used to address government or
     *        industry-specific mandates or to protect against ransomware attacks. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-compliance.html">SnapLock Compliance</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENTERPRISE</code>: Files transitioned to WORM on an Enterprise volume can be deleted by authorized
     *        users before their retention periods expire using privileged delete. This retention mode is used to
     *        advance an organization's data integrity and internal compliance or to test retention settings before
     *        using SnapLock Compliance. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html">SnapLock Enterprise</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnaplockType
     */

    public SnaplockConfiguration withSnaplockType(String snaplockType) {
        setSnaplockType(snaplockType);
        return this;
    }

    /**
     * <p>
     * Specifies the retention mode of an FSx for ONTAP SnapLock volume. After it is set, it can't be changed. You can
     * choose one of the following retention modes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLIANCE</code>: Files transitioned to write once, read many (WORM) on a Compliance volume can't be
     * deleted until their retention periods expire. This retention mode is used to address government or
     * industry-specific mandates or to protect against ransomware attacks. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-compliance.html">SnapLock Compliance</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENTERPRISE</code>: Files transitioned to WORM on an Enterprise volume can be deleted by authorized users
     * before their retention periods expire using privileged delete. This retention mode is used to advance an
     * organization's data integrity and internal compliance or to test retention settings before using SnapLock
     * Compliance. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html">SnapLock Enterprise</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param snaplockType
     *        Specifies the retention mode of an FSx for ONTAP SnapLock volume. After it is set, it can't be changed.
     *        You can choose one of the following retention modes: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLIANCE</code>: Files transitioned to write once, read many (WORM) on a Compliance volume can't
     *        be deleted until their retention periods expire. This retention mode is used to address government or
     *        industry-specific mandates or to protect against ransomware attacks. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-compliance.html">SnapLock Compliance</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENTERPRISE</code>: Files transitioned to WORM on an Enterprise volume can be deleted by authorized
     *        users before their retention periods expire using privileged delete. This retention mode is used to
     *        advance an organization's data integrity and internal compliance or to test retention settings before
     *        using SnapLock Compliance. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snaplock-enterprise.html">SnapLock Enterprise</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnaplockType
     */

    public SnaplockConfiguration withSnaplockType(SnaplockType snaplockType) {
        this.snaplockType = snaplockType.toString();
        return this;
    }

    /**
     * <p>
     * Enables or disables volume-append mode on an FSx for ONTAP SnapLock volume. Volume-append mode allows you to
     * create WORM-appendable files and write data to them incrementally. The default value is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/worm-state.html#worm-state-append">Volume-append
     * mode</a>.
     * </p>
     * 
     * @param volumeAppendModeEnabled
     *        Enables or disables volume-append mode on an FSx for ONTAP SnapLock volume. Volume-append mode allows you
     *        to create WORM-appendable files and write data to them incrementally. The default value is
     *        <code>false</code>. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/worm-state.html#worm-state-append">Volume-append
     *        mode</a>.
     */

    public void setVolumeAppendModeEnabled(Boolean volumeAppendModeEnabled) {
        this.volumeAppendModeEnabled = volumeAppendModeEnabled;
    }

    /**
     * <p>
     * Enables or disables volume-append mode on an FSx for ONTAP SnapLock volume. Volume-append mode allows you to
     * create WORM-appendable files and write data to them incrementally. The default value is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/worm-state.html#worm-state-append">Volume-append
     * mode</a>.
     * </p>
     * 
     * @return Enables or disables volume-append mode on an FSx for ONTAP SnapLock volume. Volume-append mode allows you
     *         to create WORM-appendable files and write data to them incrementally. The default value is
     *         <code>false</code>. </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/worm-state.html#worm-state-append">Volume-append
     *         mode</a>.
     */

    public Boolean getVolumeAppendModeEnabled() {
        return this.volumeAppendModeEnabled;
    }

    /**
     * <p>
     * Enables or disables volume-append mode on an FSx for ONTAP SnapLock volume. Volume-append mode allows you to
     * create WORM-appendable files and write data to them incrementally. The default value is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/worm-state.html#worm-state-append">Volume-append
     * mode</a>.
     * </p>
     * 
     * @param volumeAppendModeEnabled
     *        Enables or disables volume-append mode on an FSx for ONTAP SnapLock volume. Volume-append mode allows you
     *        to create WORM-appendable files and write data to them incrementally. The default value is
     *        <code>false</code>. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/worm-state.html#worm-state-append">Volume-append
     *        mode</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnaplockConfiguration withVolumeAppendModeEnabled(Boolean volumeAppendModeEnabled) {
        setVolumeAppendModeEnabled(volumeAppendModeEnabled);
        return this;
    }

    /**
     * <p>
     * Enables or disables volume-append mode on an FSx for ONTAP SnapLock volume. Volume-append mode allows you to
     * create WORM-appendable files and write data to them incrementally. The default value is <code>false</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/worm-state.html#worm-state-append">Volume-append
     * mode</a>.
     * </p>
     * 
     * @return Enables or disables volume-append mode on an FSx for ONTAP SnapLock volume. Volume-append mode allows you
     *         to create WORM-appendable files and write data to them incrementally. The default value is
     *         <code>false</code>. </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/worm-state.html#worm-state-append">Volume-append
     *         mode</a>.
     */

    public Boolean isVolumeAppendModeEnabled() {
        return this.volumeAppendModeEnabled;
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
        if (getAuditLogVolume() != null)
            sb.append("AuditLogVolume: ").append(getAuditLogVolume()).append(",");
        if (getAutocommitPeriod() != null)
            sb.append("AutocommitPeriod: ").append(getAutocommitPeriod()).append(",");
        if (getPrivilegedDelete() != null)
            sb.append("PrivilegedDelete: ").append(getPrivilegedDelete()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getSnaplockType() != null)
            sb.append("SnaplockType: ").append(getSnaplockType()).append(",");
        if (getVolumeAppendModeEnabled() != null)
            sb.append("VolumeAppendModeEnabled: ").append(getVolumeAppendModeEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnaplockConfiguration == false)
            return false;
        SnaplockConfiguration other = (SnaplockConfiguration) obj;
        if (other.getAuditLogVolume() == null ^ this.getAuditLogVolume() == null)
            return false;
        if (other.getAuditLogVolume() != null && other.getAuditLogVolume().equals(this.getAuditLogVolume()) == false)
            return false;
        if (other.getAutocommitPeriod() == null ^ this.getAutocommitPeriod() == null)
            return false;
        if (other.getAutocommitPeriod() != null && other.getAutocommitPeriod().equals(this.getAutocommitPeriod()) == false)
            return false;
        if (other.getPrivilegedDelete() == null ^ this.getPrivilegedDelete() == null)
            return false;
        if (other.getPrivilegedDelete() != null && other.getPrivilegedDelete().equals(this.getPrivilegedDelete()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getSnaplockType() == null ^ this.getSnaplockType() == null)
            return false;
        if (other.getSnaplockType() != null && other.getSnaplockType().equals(this.getSnaplockType()) == false)
            return false;
        if (other.getVolumeAppendModeEnabled() == null ^ this.getVolumeAppendModeEnabled() == null)
            return false;
        if (other.getVolumeAppendModeEnabled() != null && other.getVolumeAppendModeEnabled().equals(this.getVolumeAppendModeEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuditLogVolume() == null) ? 0 : getAuditLogVolume().hashCode());
        hashCode = prime * hashCode + ((getAutocommitPeriod() == null) ? 0 : getAutocommitPeriod().hashCode());
        hashCode = prime * hashCode + ((getPrivilegedDelete() == null) ? 0 : getPrivilegedDelete().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getSnaplockType() == null) ? 0 : getSnaplockType().hashCode());
        hashCode = prime * hashCode + ((getVolumeAppendModeEnabled() == null) ? 0 : getVolumeAppendModeEnabled().hashCode());
        return hashCode;
    }

    @Override
    public SnaplockConfiguration clone() {
        try {
            return (SnaplockConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.SnaplockConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
