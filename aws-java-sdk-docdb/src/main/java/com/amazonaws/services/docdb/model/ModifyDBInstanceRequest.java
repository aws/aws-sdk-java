/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input to <a>ModifyDBInstance</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyDBInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB instance identifier. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing <code>DBInstance</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The new compute and memory capacity of the DB instance; for example, <code>db.m4.large</code>. Not all DB
     * instance classes are available in all AWS Regions.
     * </p>
     * <p>
     * If you modify the DB instance class, an outage occurs during the change. The change is applied during the next
     * maintenance window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB instance.
     * </p>
     * <p>
     * If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     * maintenance window. Some parameter changes can cause an outage and are applied on the next reboot.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean applyImmediately;
    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     * Changing this parameter doesn't result in an outage except in the following situation, and the change is
     * asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance
     * window is changed to include the current time, changing this parameter causes a reboot of the DB instance. If you
     * are moving this window to the current time, there must be at least 30 minutes between the current time and end of
     * the window to ensure that pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance window.
     * Changing this parameter doesn't result in an outage except in the following case, and the change is
     * asynchronously applied as soon as possible. An outage results if this parameter is set to <code>true</code>
     * during the maintenance window, and a newer minor version is available, and Amazon DocumentDB has enabled
     * automatic patching for that engine version.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance
     * identifier, an instance reboot occurs immediately if you set <code>Apply Immediately</code> to <code>true</code>.
     * It occurs during the next maintenance window if you set <code>Apply Immediately</code> to <code>false</code>.
     * This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     */
    private String newDBInstanceIdentifier;
    /**
     * <p>
     * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after
     * a failure of the existing primary instance.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid values: 0-15
     * </p>
     */
    private Integer promotionTier;

    /**
     * <p>
     * The DB instance identifier. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing <code>DBInstance</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing <code>DBInstance</code>.
     *        </p>
     *        </li>
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing <code>DBInstance</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The DB instance identifier. This value is stored as a lowercase string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing <code>DBInstance</code>.
     *         </p>
     *         </li>
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing <code>DBInstance</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing <code>DBInstance</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The new compute and memory capacity of the DB instance; for example, <code>db.m4.large</code>. Not all DB
     * instance classes are available in all AWS Regions.
     * </p>
     * <p>
     * If you modify the DB instance class, an outage occurs during the change. The change is applied during the next
     * maintenance window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * 
     * @param dBInstanceClass
     *        The new compute and memory capacity of the DB instance; for example, <code>db.m4.large</code>. Not all DB
     *        instance classes are available in all AWS Regions. </p>
     *        <p>
     *        If you modify the DB instance class, an outage occurs during the change. The change is applied during the
     *        next maintenance window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this
     *        request.
     *        </p>
     *        <p>
     *        Default: Uses existing setting.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The new compute and memory capacity of the DB instance; for example, <code>db.m4.large</code>. Not all DB
     * instance classes are available in all AWS Regions.
     * </p>
     * <p>
     * If you modify the DB instance class, an outage occurs during the change. The change is applied during the next
     * maintenance window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * 
     * @return The new compute and memory capacity of the DB instance; for example, <code>db.m4.large</code>. Not all DB
     *         instance classes are available in all AWS Regions. </p>
     *         <p>
     *         If you modify the DB instance class, an outage occurs during the change. The change is applied during the
     *         next maintenance window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this
     *         request.
     *         </p>
     *         <p>
     *         Default: Uses existing setting.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The new compute and memory capacity of the DB instance; for example, <code>db.m4.large</code>. Not all DB
     * instance classes are available in all AWS Regions.
     * </p>
     * <p>
     * If you modify the DB instance class, an outage occurs during the change. The change is applied during the next
     * maintenance window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * 
     * @param dBInstanceClass
     *        The new compute and memory capacity of the DB instance; for example, <code>db.m4.large</code>. Not all DB
     *        instance classes are available in all AWS Regions. </p>
     *        <p>
     *        If you modify the DB instance class, an outage occurs during the change. The change is applied during the
     *        next maintenance window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this
     *        request.
     *        </p>
     *        <p>
     *        Default: Uses existing setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB instance.
     * </p>
     * <p>
     * If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     * maintenance window. Some parameter changes can cause an outage and are applied on the next reboot.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param applyImmediately
     *        Specifies whether the modifications in this request and any pending modifications are asynchronously
     *        applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     *        instance. </p>
     *        <p>
     *        If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     *        maintenance window. Some parameter changes can cause an outage and are applied on the next reboot.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB instance.
     * </p>
     * <p>
     * If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     * maintenance window. Some parameter changes can cause an outage and are applied on the next reboot.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Specifies whether the modifications in this request and any pending modifications are asynchronously
     *         applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     *         instance. </p>
     *         <p>
     *         If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     *         maintenance window. Some parameter changes can cause an outage and are applied on the next reboot.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB instance.
     * </p>
     * <p>
     * If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     * maintenance window. Some parameter changes can cause an outage and are applied on the next reboot.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param applyImmediately
     *        Specifies whether the modifications in this request and any pending modifications are asynchronously
     *        applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     *        instance. </p>
     *        <p>
     *        If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     *        maintenance window. Some parameter changes can cause an outage and are applied on the next reboot.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB instance.
     * </p>
     * <p>
     * If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     * maintenance window. Some parameter changes can cause an outage and are applied on the next reboot.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Specifies whether the modifications in this request and any pending modifications are asynchronously
     *         applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     *         instance. </p>
     *         <p>
     *         If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     *         maintenance window. Some parameter changes can cause an outage and are applied on the next reboot.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     * Changing this parameter doesn't result in an outage except in the following situation, and the change is
     * asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance
     * window is changed to include the current time, changing this parameter causes a reboot of the DB instance. If you
     * are moving this window to the current time, there must be at least 30 minutes between the current time and end of
     * the window to ensure that pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     *        Changing this parameter doesn't result in an outage except in the following situation, and the change is
     *        asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the
     *        maintenance window is changed to include the current time, changing this parameter causes a reboot of the
     *        DB instance. If you are moving this window to the current time, there must be at least 30 minutes between
     *        the current time and end of the window to ensure that pending changes are applied.</p>
     *        <p>
     *        Default: Uses existing setting.
     *        </p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *        </p>
     *        <p>
     *        Constraints: Must be at least 30 minutes.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     * Changing this parameter doesn't result in an outage except in the following situation, and the change is
     * asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance
     * window is changed to include the current time, changing this parameter causes a reboot of the DB instance. If you
     * are moving this window to the current time, there must be at least 30 minutes between the current time and end of
     * the window to ensure that pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes.
     * </p>
     * 
     * @return The weekly time range (in UTC) during which system maintenance can occur, which might result in an
     *         outage. Changing this parameter doesn't result in an outage except in the following situation, and the
     *         change is asynchronously applied as soon as possible. If there are pending actions that cause a reboot,
     *         and the maintenance window is changed to include the current time, changing this parameter causes a
     *         reboot of the DB instance. If you are moving this window to the current time, there must be at least 30
     *         minutes between the current time and end of the window to ensure that pending changes are applied.</p>
     *         <p>
     *         Default: Uses existing setting.
     *         </p>
     *         <p>
     *         Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *         </p>
     *         <p>
     *         Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         </p>
     *         <p>
     *         Constraints: Must be at least 30 minutes.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     * Changing this parameter doesn't result in an outage except in the following situation, and the change is
     * asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance
     * window is changed to include the current time, changing this parameter causes a reboot of the DB instance. If you
     * are moving this window to the current time, there must be at least 30 minutes between the current time and end of
     * the window to ensure that pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     *        Changing this parameter doesn't result in an outage except in the following situation, and the change is
     *        asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the
     *        maintenance window is changed to include the current time, changing this parameter causes a reboot of the
     *        DB instance. If you are moving this window to the current time, there must be at least 30 minutes between
     *        the current time and end of the window to ensure that pending changes are applied.</p>
     *        <p>
     *        Default: Uses existing setting.
     *        </p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *        </p>
     *        <p>
     *        Constraints: Must be at least 30 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance window.
     * Changing this parameter doesn't result in an outage except in the following case, and the change is
     * asynchronously applied as soon as possible. An outage results if this parameter is set to <code>true</code>
     * during the maintenance window, and a newer minor version is available, and Amazon DocumentDB has enabled
     * automatic patching for that engine version.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance
     *        window. Changing this parameter doesn't result in an outage except in the following case, and the change
     *        is asynchronously applied as soon as possible. An outage results if this parameter is set to
     *        <code>true</code> during the maintenance window, and a newer minor version is available, and Amazon
     *        DocumentDB has enabled automatic patching for that engine version.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance window.
     * Changing this parameter doesn't result in an outage except in the following case, and the change is
     * asynchronously applied as soon as possible. An outage results if this parameter is set to <code>true</code>
     * during the maintenance window, and a newer minor version is available, and Amazon DocumentDB has enabled
     * automatic patching for that engine version.
     * </p>
     * 
     * @return Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance
     *         window. Changing this parameter doesn't result in an outage except in the following case, and the change
     *         is asynchronously applied as soon as possible. An outage results if this parameter is set to
     *         <code>true</code> during the maintenance window, and a newer minor version is available, and Amazon
     *         DocumentDB has enabled automatic patching for that engine version.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance window.
     * Changing this parameter doesn't result in an outage except in the following case, and the change is
     * asynchronously applied as soon as possible. An outage results if this parameter is set to <code>true</code>
     * during the maintenance window, and a newer minor version is available, and Amazon DocumentDB has enabled
     * automatic patching for that engine version.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance
     *        window. Changing this parameter doesn't result in an outage except in the following case, and the change
     *        is asynchronously applied as soon as possible. An outage results if this parameter is set to
     *        <code>true</code> during the maintenance window, and a newer minor version is available, and Amazon
     *        DocumentDB has enabled automatic patching for that engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance window.
     * Changing this parameter doesn't result in an outage except in the following case, and the change is
     * asynchronously applied as soon as possible. An outage results if this parameter is set to <code>true</code>
     * during the maintenance window, and a newer minor version is available, and Amazon DocumentDB has enabled
     * automatic patching for that engine version.
     * </p>
     * 
     * @return Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance
     *         window. Changing this parameter doesn't result in an outage except in the following case, and the change
     *         is asynchronously applied as soon as possible. An outage results if this parameter is set to
     *         <code>true</code> during the maintenance window, and a newer minor version is available, and Amazon
     *         DocumentDB has enabled automatic patching for that engine version.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance
     * identifier, an instance reboot occurs immediately if you set <code>Apply Immediately</code> to <code>true</code>.
     * It occurs during the next maintenance window if you set <code>Apply Immediately</code> to <code>false</code>.
     * This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     * 
     * @param newDBInstanceIdentifier
     *        The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB
     *        instance identifier, an instance reboot occurs immediately if you set <code>Apply Immediately</code> to
     *        <code>true</code>. It occurs during the next maintenance window if you set <code>Apply Immediately</code>
     *        to <code>false</code>. This value is stored as a lowercase string. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mydbinstance</code>
     */

    public void setNewDBInstanceIdentifier(String newDBInstanceIdentifier) {
        this.newDBInstanceIdentifier = newDBInstanceIdentifier;
    }

    /**
     * <p>
     * The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance
     * identifier, an instance reboot occurs immediately if you set <code>Apply Immediately</code> to <code>true</code>.
     * It occurs during the next maintenance window if you set <code>Apply Immediately</code> to <code>false</code>.
     * This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     * 
     * @return The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB
     *         instance identifier, an instance reboot occurs immediately if you set <code>Apply Immediately</code> to
     *         <code>true</code>. It occurs during the next maintenance window if you set <code>Apply Immediately</code>
     *         to <code>false</code>. This value is stored as a lowercase string. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>mydbinstance</code>
     */

    public String getNewDBInstanceIdentifier() {
        return this.newDBInstanceIdentifier;
    }

    /**
     * <p>
     * The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance
     * identifier, an instance reboot occurs immediately if you set <code>Apply Immediately</code> to <code>true</code>.
     * It occurs during the next maintenance window if you set <code>Apply Immediately</code> to <code>false</code>.
     * This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     * 
     * @param newDBInstanceIdentifier
     *        The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB
     *        instance identifier, an instance reboot occurs immediately if you set <code>Apply Immediately</code> to
     *        <code>true</code>. It occurs during the next maintenance window if you set <code>Apply Immediately</code>
     *        to <code>false</code>. This value is stored as a lowercase string. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mydbinstance</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withNewDBInstanceIdentifier(String newDBInstanceIdentifier) {
        setNewDBInstanceIdentifier(newDBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after
     * a failure of the existing primary instance.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid values: 0-15
     * </p>
     * 
     * @param promotionTier
     *        A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance
     *        after a failure of the existing primary instance.</p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Valid values: 0-15
     */

    public void setPromotionTier(Integer promotionTier) {
        this.promotionTier = promotionTier;
    }

    /**
     * <p>
     * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after
     * a failure of the existing primary instance.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid values: 0-15
     * </p>
     * 
     * @return A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary
     *         instance after a failure of the existing primary instance.</p>
     *         <p>
     *         Default: 1
     *         </p>
     *         <p>
     *         Valid values: 0-15
     */

    public Integer getPromotionTier() {
        return this.promotionTier;
    }

    /**
     * <p>
     * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after
     * a failure of the existing primary instance.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid values: 0-15
     * </p>
     * 
     * @param promotionTier
     *        A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance
     *        after a failure of the existing primary instance.</p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Valid values: 0-15
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withPromotionTier(Integer promotionTier) {
        setPromotionTier(promotionTier);
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: ").append(getApplyImmediately()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getNewDBInstanceIdentifier() != null)
            sb.append("NewDBInstanceIdentifier: ").append(getNewDBInstanceIdentifier()).append(",");
        if (getPromotionTier() != null)
            sb.append("PromotionTier: ").append(getPromotionTier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBInstanceRequest == false)
            return false;
        ModifyDBInstanceRequest other = (ModifyDBInstanceRequest) obj;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getNewDBInstanceIdentifier() == null ^ this.getNewDBInstanceIdentifier() == null)
            return false;
        if (other.getNewDBInstanceIdentifier() != null && other.getNewDBInstanceIdentifier().equals(this.getNewDBInstanceIdentifier()) == false)
            return false;
        if (other.getPromotionTier() == null ^ this.getPromotionTier() == null)
            return false;
        if (other.getPromotionTier() != null && other.getPromotionTier().equals(this.getPromotionTier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getNewDBInstanceIdentifier() == null) ? 0 : getNewDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPromotionTier() == null) ? 0 : getPromotionTier().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBInstanceRequest clone() {
        return (ModifyDBInstanceRequest) super.clone();
    }

}
