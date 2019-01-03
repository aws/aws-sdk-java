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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the DB snapshot to modify.
     * </p>
     */
    private String dBSnapshotIdentifier;
    /**
     * <p>
     * The engine version to upgrade the DB snapshot to.
     * </p>
     * <p>
     * The following are the database engines and engine versions that are available when you upgrade a DB snapshot.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>5.5.46</code> (supported for 5.1 DB snapshots)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>12.1.0.2.v8</code> (supported for 12.1.0.1 DB snapshots)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v12</code> (supported for 11.2.0.2 DB snapshots)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v11</code> (supported for 11.2.0.3 DB snapshots)
     * </p>
     * </li>
     * </ul>
     */
    private String engineVersion;
    /**
     * <p>
     * The option group to identify with the upgraded DB snapshot.
     * </p>
     * <p>
     * You can specify this parameter when you upgrade an Oracle DB snapshot. The same option group considerations apply
     * when upgrading a DB snapshot as when upgrading a DB instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Oracle.html#USER_UpgradeDBInstance.Oracle.OGPG.OG"
     * >Option Group Considerations</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private String optionGroupName;

    /**
     * <p>
     * The identifier of the DB snapshot to modify.
     * </p>
     * 
     * @param dBSnapshotIdentifier
     *        The identifier of the DB snapshot to modify.
     */

    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB snapshot to modify.
     * </p>
     * 
     * @return The identifier of the DB snapshot to modify.
     */

    public String getDBSnapshotIdentifier() {
        return this.dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB snapshot to modify.
     * </p>
     * 
     * @param dBSnapshotIdentifier
     *        The identifier of the DB snapshot to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBSnapshotRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        setDBSnapshotIdentifier(dBSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The engine version to upgrade the DB snapshot to.
     * </p>
     * <p>
     * The following are the database engines and engine versions that are available when you upgrade a DB snapshot.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>5.5.46</code> (supported for 5.1 DB snapshots)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>12.1.0.2.v8</code> (supported for 12.1.0.1 DB snapshots)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v12</code> (supported for 11.2.0.2 DB snapshots)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v11</code> (supported for 11.2.0.3 DB snapshots)
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineVersion
     *        The engine version to upgrade the DB snapshot to. </p>
     *        <p>
     *        The following are the database engines and engine versions that are available when you upgrade a DB
     *        snapshot.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>5.5.46</code> (supported for 5.1 DB snapshots)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v8</code> (supported for 12.1.0.1 DB snapshots)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v12</code> (supported for 11.2.0.2 DB snapshots)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v11</code> (supported for 11.2.0.3 DB snapshots)
     *        </p>
     *        </li>
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version to upgrade the DB snapshot to.
     * </p>
     * <p>
     * The following are the database engines and engine versions that are available when you upgrade a DB snapshot.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>5.5.46</code> (supported for 5.1 DB snapshots)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>12.1.0.2.v8</code> (supported for 12.1.0.1 DB snapshots)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v12</code> (supported for 11.2.0.2 DB snapshots)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v11</code> (supported for 11.2.0.3 DB snapshots)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The engine version to upgrade the DB snapshot to. </p>
     *         <p>
     *         The following are the database engines and engine versions that are available when you upgrade a DB
     *         snapshot.
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>5.5.46</code> (supported for 5.1 DB snapshots)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>12.1.0.2.v8</code> (supported for 12.1.0.1 DB snapshots)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>11.2.0.4.v12</code> (supported for 11.2.0.2 DB snapshots)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>11.2.0.4.v11</code> (supported for 11.2.0.3 DB snapshots)
     *         </p>
     *         </li>
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version to upgrade the DB snapshot to.
     * </p>
     * <p>
     * The following are the database engines and engine versions that are available when you upgrade a DB snapshot.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>5.5.46</code> (supported for 5.1 DB snapshots)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>12.1.0.2.v8</code> (supported for 12.1.0.1 DB snapshots)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v12</code> (supported for 11.2.0.2 DB snapshots)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v11</code> (supported for 11.2.0.3 DB snapshots)
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineVersion
     *        The engine version to upgrade the DB snapshot to. </p>
     *        <p>
     *        The following are the database engines and engine versions that are available when you upgrade a DB
     *        snapshot.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>5.5.46</code> (supported for 5.1 DB snapshots)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v8</code> (supported for 12.1.0.1 DB snapshots)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v12</code> (supported for 11.2.0.2 DB snapshots)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v11</code> (supported for 11.2.0.3 DB snapshots)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBSnapshotRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The option group to identify with the upgraded DB snapshot.
     * </p>
     * <p>
     * You can specify this parameter when you upgrade an Oracle DB snapshot. The same option group considerations apply
     * when upgrading a DB snapshot as when upgrading a DB instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Oracle.html#USER_UpgradeDBInstance.Oracle.OGPG.OG"
     * >Option Group Considerations</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param optionGroupName
     *        The option group to identify with the upgraded DB snapshot. </p>
     *        <p>
     *        You can specify this parameter when you upgrade an Oracle DB snapshot. The same option group
     *        considerations apply when upgrading a DB snapshot as when upgrading a DB instance. For more information,
     *        see <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Oracle.html#USER_UpgradeDBInstance.Oracle.OGPG.OG"
     *        >Option Group Considerations</a> in the <i>Amazon RDS User Guide.</i>
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The option group to identify with the upgraded DB snapshot.
     * </p>
     * <p>
     * You can specify this parameter when you upgrade an Oracle DB snapshot. The same option group considerations apply
     * when upgrading a DB snapshot as when upgrading a DB instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Oracle.html#USER_UpgradeDBInstance.Oracle.OGPG.OG"
     * >Option Group Considerations</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @return The option group to identify with the upgraded DB snapshot. </p>
     *         <p>
     *         You can specify this parameter when you upgrade an Oracle DB snapshot. The same option group
     *         considerations apply when upgrading a DB snapshot as when upgrading a DB instance. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Oracle.html#USER_UpgradeDBInstance.Oracle.OGPG.OG"
     *         >Option Group Considerations</a> in the <i>Amazon RDS User Guide.</i>
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * The option group to identify with the upgraded DB snapshot.
     * </p>
     * <p>
     * You can specify this parameter when you upgrade an Oracle DB snapshot. The same option group considerations apply
     * when upgrading a DB snapshot as when upgrading a DB instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Oracle.html#USER_UpgradeDBInstance.Oracle.OGPG.OG"
     * >Option Group Considerations</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param optionGroupName
     *        The option group to identify with the upgraded DB snapshot. </p>
     *        <p>
     *        You can specify this parameter when you upgrade an Oracle DB snapshot. The same option group
     *        considerations apply when upgrading a DB snapshot as when upgrading a DB instance. For more information,
     *        see <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Oracle.html#USER_UpgradeDBInstance.Oracle.OGPG.OG"
     *        >Option Group Considerations</a> in the <i>Amazon RDS User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBSnapshotRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
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
        if (getDBSnapshotIdentifier() != null)
            sb.append("DBSnapshotIdentifier: ").append(getDBSnapshotIdentifier()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBSnapshotRequest == false)
            return false;
        ModifyDBSnapshotRequest other = (ModifyDBSnapshotRequest) obj;
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null)
            return false;
        if (other.getDBSnapshotIdentifier() != null && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBSnapshotRequest clone() {
        return (ModifyDBSnapshotRequest) super.clone();
    }

}
