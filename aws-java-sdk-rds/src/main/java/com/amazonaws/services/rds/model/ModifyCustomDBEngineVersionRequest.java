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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyCustomDBEngineVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyCustomDBEngineVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB engine. The only supported value is <code>custom-oracle-ee</code>.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The custom engine version (CEV) that you want to modify. This option is required for RDS Custom for Oracle, but
     * optional for Amazon RDS. The combination of <code>Engine</code> and <code>EngineVersion</code> is unique per
     * customer per Amazon Web Services Region.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * An optional description of your CEV.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The availability status to be assigned to the CEV. Valid values are as follows:
     * </p>
     * <dl>
     * <dt>available</dt>
     * <dd>
     * <p>
     * You can use this CEV to create a new RDS Custom DB instance.
     * </p>
     * </dd>
     * <dt>inactive</dt>
     * <dd>
     * <p>
     * You can create a new RDS Custom instance by restoring a DB snapshot with this CEV. You can't patch or create new
     * instances with this CEV.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * You can change any status to any status. A typical reason to change status is to prevent the accidental use of a
     * CEV, or to make a deprecated CEV eligible for use again. For example, you might change the status of your CEV
     * from <code>available</code> to <code>inactive</code>, and from <code>inactive</code> back to
     * <code>available</code>. To change the availability status of the CEV, it must not currently be in use by an RDS
     * Custom instance, snapshot, or automated backup.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The DB engine. The only supported value is <code>custom-oracle-ee</code>.
     * </p>
     * 
     * @param engine
     *        The DB engine. The only supported value is <code>custom-oracle-ee</code>.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The DB engine. The only supported value is <code>custom-oracle-ee</code>.
     * </p>
     * 
     * @return The DB engine. The only supported value is <code>custom-oracle-ee</code>.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The DB engine. The only supported value is <code>custom-oracle-ee</code>.
     * </p>
     * 
     * @param engine
     *        The DB engine. The only supported value is <code>custom-oracle-ee</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The custom engine version (CEV) that you want to modify. This option is required for RDS Custom for Oracle, but
     * optional for Amazon RDS. The combination of <code>Engine</code> and <code>EngineVersion</code> is unique per
     * customer per Amazon Web Services Region.
     * </p>
     * 
     * @param engineVersion
     *        The custom engine version (CEV) that you want to modify. This option is required for RDS Custom for
     *        Oracle, but optional for Amazon RDS. The combination of <code>Engine</code> and <code>EngineVersion</code>
     *        is unique per customer per Amazon Web Services Region.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The custom engine version (CEV) that you want to modify. This option is required for RDS Custom for Oracle, but
     * optional for Amazon RDS. The combination of <code>Engine</code> and <code>EngineVersion</code> is unique per
     * customer per Amazon Web Services Region.
     * </p>
     * 
     * @return The custom engine version (CEV) that you want to modify. This option is required for RDS Custom for
     *         Oracle, but optional for Amazon RDS. The combination of <code>Engine</code> and
     *         <code>EngineVersion</code> is unique per customer per Amazon Web Services Region.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The custom engine version (CEV) that you want to modify. This option is required for RDS Custom for Oracle, but
     * optional for Amazon RDS. The combination of <code>Engine</code> and <code>EngineVersion</code> is unique per
     * customer per Amazon Web Services Region.
     * </p>
     * 
     * @param engineVersion
     *        The custom engine version (CEV) that you want to modify. This option is required for RDS Custom for
     *        Oracle, but optional for Amazon RDS. The combination of <code>Engine</code> and <code>EngineVersion</code>
     *        is unique per customer per Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * An optional description of your CEV.
     * </p>
     * 
     * @param description
     *        An optional description of your CEV.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of your CEV.
     * </p>
     * 
     * @return An optional description of your CEV.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description of your CEV.
     * </p>
     * 
     * @param description
     *        An optional description of your CEV.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyCustomDBEngineVersionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The availability status to be assigned to the CEV. Valid values are as follows:
     * </p>
     * <dl>
     * <dt>available</dt>
     * <dd>
     * <p>
     * You can use this CEV to create a new RDS Custom DB instance.
     * </p>
     * </dd>
     * <dt>inactive</dt>
     * <dd>
     * <p>
     * You can create a new RDS Custom instance by restoring a DB snapshot with this CEV. You can't patch or create new
     * instances with this CEV.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * You can change any status to any status. A typical reason to change status is to prevent the accidental use of a
     * CEV, or to make a deprecated CEV eligible for use again. For example, you might change the status of your CEV
     * from <code>available</code> to <code>inactive</code>, and from <code>inactive</code> back to
     * <code>available</code>. To change the availability status of the CEV, it must not currently be in use by an RDS
     * Custom instance, snapshot, or automated backup.
     * </p>
     * 
     * @param status
     *        The availability status to be assigned to the CEV. Valid values are as follows:</p>
     *        <dl>
     *        <dt>available</dt>
     *        <dd>
     *        <p>
     *        You can use this CEV to create a new RDS Custom DB instance.
     *        </p>
     *        </dd>
     *        <dt>inactive</dt>
     *        <dd>
     *        <p>
     *        You can create a new RDS Custom instance by restoring a DB snapshot with this CEV. You can't patch or
     *        create new instances with this CEV.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        You can change any status to any status. A typical reason to change status is to prevent the accidental
     *        use of a CEV, or to make a deprecated CEV eligible for use again. For example, you might change the status
     *        of your CEV from <code>available</code> to <code>inactive</code>, and from <code>inactive</code> back to
     *        <code>available</code>. To change the availability status of the CEV, it must not currently be in use by
     *        an RDS Custom instance, snapshot, or automated backup.
     * @see CustomEngineVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The availability status to be assigned to the CEV. Valid values are as follows:
     * </p>
     * <dl>
     * <dt>available</dt>
     * <dd>
     * <p>
     * You can use this CEV to create a new RDS Custom DB instance.
     * </p>
     * </dd>
     * <dt>inactive</dt>
     * <dd>
     * <p>
     * You can create a new RDS Custom instance by restoring a DB snapshot with this CEV. You can't patch or create new
     * instances with this CEV.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * You can change any status to any status. A typical reason to change status is to prevent the accidental use of a
     * CEV, or to make a deprecated CEV eligible for use again. For example, you might change the status of your CEV
     * from <code>available</code> to <code>inactive</code>, and from <code>inactive</code> back to
     * <code>available</code>. To change the availability status of the CEV, it must not currently be in use by an RDS
     * Custom instance, snapshot, or automated backup.
     * </p>
     * 
     * @return The availability status to be assigned to the CEV. Valid values are as follows:</p>
     *         <dl>
     *         <dt>available</dt>
     *         <dd>
     *         <p>
     *         You can use this CEV to create a new RDS Custom DB instance.
     *         </p>
     *         </dd>
     *         <dt>inactive</dt>
     *         <dd>
     *         <p>
     *         You can create a new RDS Custom instance by restoring a DB snapshot with this CEV. You can't patch or
     *         create new instances with this CEV.
     *         </p>
     *         </dd>
     *         </dl>
     *         <p>
     *         You can change any status to any status. A typical reason to change status is to prevent the accidental
     *         use of a CEV, or to make a deprecated CEV eligible for use again. For example, you might change the
     *         status of your CEV from <code>available</code> to <code>inactive</code>, and from <code>inactive</code>
     *         back to <code>available</code>. To change the availability status of the CEV, it must not currently be in
     *         use by an RDS Custom instance, snapshot, or automated backup.
     * @see CustomEngineVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The availability status to be assigned to the CEV. Valid values are as follows:
     * </p>
     * <dl>
     * <dt>available</dt>
     * <dd>
     * <p>
     * You can use this CEV to create a new RDS Custom DB instance.
     * </p>
     * </dd>
     * <dt>inactive</dt>
     * <dd>
     * <p>
     * You can create a new RDS Custom instance by restoring a DB snapshot with this CEV. You can't patch or create new
     * instances with this CEV.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * You can change any status to any status. A typical reason to change status is to prevent the accidental use of a
     * CEV, or to make a deprecated CEV eligible for use again. For example, you might change the status of your CEV
     * from <code>available</code> to <code>inactive</code>, and from <code>inactive</code> back to
     * <code>available</code>. To change the availability status of the CEV, it must not currently be in use by an RDS
     * Custom instance, snapshot, or automated backup.
     * </p>
     * 
     * @param status
     *        The availability status to be assigned to the CEV. Valid values are as follows:</p>
     *        <dl>
     *        <dt>available</dt>
     *        <dd>
     *        <p>
     *        You can use this CEV to create a new RDS Custom DB instance.
     *        </p>
     *        </dd>
     *        <dt>inactive</dt>
     *        <dd>
     *        <p>
     *        You can create a new RDS Custom instance by restoring a DB snapshot with this CEV. You can't patch or
     *        create new instances with this CEV.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        You can change any status to any status. A typical reason to change status is to prevent the accidental
     *        use of a CEV, or to make a deprecated CEV eligible for use again. For example, you might change the status
     *        of your CEV from <code>available</code> to <code>inactive</code>, and from <code>inactive</code> back to
     *        <code>available</code>. To change the availability status of the CEV, it must not currently be in use by
     *        an RDS Custom instance, snapshot, or automated backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomEngineVersionStatus
     */

    public ModifyCustomDBEngineVersionRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The availability status to be assigned to the CEV. Valid values are as follows:
     * </p>
     * <dl>
     * <dt>available</dt>
     * <dd>
     * <p>
     * You can use this CEV to create a new RDS Custom DB instance.
     * </p>
     * </dd>
     * <dt>inactive</dt>
     * <dd>
     * <p>
     * You can create a new RDS Custom instance by restoring a DB snapshot with this CEV. You can't patch or create new
     * instances with this CEV.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * You can change any status to any status. A typical reason to change status is to prevent the accidental use of a
     * CEV, or to make a deprecated CEV eligible for use again. For example, you might change the status of your CEV
     * from <code>available</code> to <code>inactive</code>, and from <code>inactive</code> back to
     * <code>available</code>. To change the availability status of the CEV, it must not currently be in use by an RDS
     * Custom instance, snapshot, or automated backup.
     * </p>
     * 
     * @param status
     *        The availability status to be assigned to the CEV. Valid values are as follows:</p>
     *        <dl>
     *        <dt>available</dt>
     *        <dd>
     *        <p>
     *        You can use this CEV to create a new RDS Custom DB instance.
     *        </p>
     *        </dd>
     *        <dt>inactive</dt>
     *        <dd>
     *        <p>
     *        You can create a new RDS Custom instance by restoring a DB snapshot with this CEV. You can't patch or
     *        create new instances with this CEV.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        You can change any status to any status. A typical reason to change status is to prevent the accidental
     *        use of a CEV, or to make a deprecated CEV eligible for use again. For example, you might change the status
     *        of your CEV from <code>available</code> to <code>inactive</code>, and from <code>inactive</code> back to
     *        <code>available</code>. To change the availability status of the CEV, it must not currently be in use by
     *        an RDS Custom instance, snapshot, or automated backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomEngineVersionStatus
     */

    public ModifyCustomDBEngineVersionRequest withStatus(CustomEngineVersionStatus status) {
        this.status = status.toString();
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
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyCustomDBEngineVersionRequest == false)
            return false;
        ModifyCustomDBEngineVersionRequest other = (ModifyCustomDBEngineVersionRequest) obj;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ModifyCustomDBEngineVersionRequest clone() {
        return (ModifyCustomDBEngineVersionRequest) super.clone();
    }

}
