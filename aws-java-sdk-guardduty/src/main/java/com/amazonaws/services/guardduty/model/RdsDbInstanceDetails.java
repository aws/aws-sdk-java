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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the resource type <code>RDSDBInstance</code> involved in a GuardDuty finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/RdsDbInstanceDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsDbInstanceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier associated to the database instance that was involved in the finding.
     * </p>
     */
    private String dbInstanceIdentifier;
    /**
     * <p>
     * The database engine of the database instance involved in the finding.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version of the database engine that was involved in the finding.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The identifier of the database cluster that contains the database instance ID involved in the finding.
     * </p>
     */
    private String dbClusterIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the database instance involved in the finding.
     * </p>
     */
    private String dbInstanceArn;
    /**
     * <p>
     * Instance tag key-value pairs associated with the database instance ID.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The identifier associated to the database instance that was involved in the finding.
     * </p>
     * 
     * @param dbInstanceIdentifier
     *        The identifier associated to the database instance that was involved in the finding.
     */

    public void setDbInstanceIdentifier(String dbInstanceIdentifier) {
        this.dbInstanceIdentifier = dbInstanceIdentifier;
    }

    /**
     * <p>
     * The identifier associated to the database instance that was involved in the finding.
     * </p>
     * 
     * @return The identifier associated to the database instance that was involved in the finding.
     */

    public String getDbInstanceIdentifier() {
        return this.dbInstanceIdentifier;
    }

    /**
     * <p>
     * The identifier associated to the database instance that was involved in the finding.
     * </p>
     * 
     * @param dbInstanceIdentifier
     *        The identifier associated to the database instance that was involved in the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstanceDetails withDbInstanceIdentifier(String dbInstanceIdentifier) {
        setDbInstanceIdentifier(dbInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The database engine of the database instance involved in the finding.
     * </p>
     * 
     * @param engine
     *        The database engine of the database instance involved in the finding.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database engine of the database instance involved in the finding.
     * </p>
     * 
     * @return The database engine of the database instance involved in the finding.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The database engine of the database instance involved in the finding.
     * </p>
     * 
     * @param engine
     *        The database engine of the database instance involved in the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstanceDetails withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version of the database engine that was involved in the finding.
     * </p>
     * 
     * @param engineVersion
     *        The version of the database engine that was involved in the finding.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the database engine that was involved in the finding.
     * </p>
     * 
     * @return The version of the database engine that was involved in the finding.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the database engine that was involved in the finding.
     * </p>
     * 
     * @param engineVersion
     *        The version of the database engine that was involved in the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstanceDetails withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the database cluster that contains the database instance ID involved in the finding.
     * </p>
     * 
     * @param dbClusterIdentifier
     *        The identifier of the database cluster that contains the database instance ID involved in the finding.
     */

    public void setDbClusterIdentifier(String dbClusterIdentifier) {
        this.dbClusterIdentifier = dbClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the database cluster that contains the database instance ID involved in the finding.
     * </p>
     * 
     * @return The identifier of the database cluster that contains the database instance ID involved in the finding.
     */

    public String getDbClusterIdentifier() {
        return this.dbClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the database cluster that contains the database instance ID involved in the finding.
     * </p>
     * 
     * @param dbClusterIdentifier
     *        The identifier of the database cluster that contains the database instance ID involved in the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstanceDetails withDbClusterIdentifier(String dbClusterIdentifier) {
        setDbClusterIdentifier(dbClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the database instance involved in the finding.
     * </p>
     * 
     * @param dbInstanceArn
     *        The Amazon Resource Name (ARN) that identifies the database instance involved in the finding.
     */

    public void setDbInstanceArn(String dbInstanceArn) {
        this.dbInstanceArn = dbInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the database instance involved in the finding.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the database instance involved in the finding.
     */

    public String getDbInstanceArn() {
        return this.dbInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the database instance involved in the finding.
     * </p>
     * 
     * @param dbInstanceArn
     *        The Amazon Resource Name (ARN) that identifies the database instance involved in the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstanceDetails withDbInstanceArn(String dbInstanceArn) {
        setDbInstanceArn(dbInstanceArn);
        return this;
    }

    /**
     * <p>
     * Instance tag key-value pairs associated with the database instance ID.
     * </p>
     * 
     * @return Instance tag key-value pairs associated with the database instance ID.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Instance tag key-value pairs associated with the database instance ID.
     * </p>
     * 
     * @param tags
     *        Instance tag key-value pairs associated with the database instance ID.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Instance tag key-value pairs associated with the database instance ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Instance tag key-value pairs associated with the database instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstanceDetails withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Instance tag key-value pairs associated with the database instance ID.
     * </p>
     * 
     * @param tags
     *        Instance tag key-value pairs associated with the database instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbInstanceDetails withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDbInstanceIdentifier() != null)
            sb.append("DbInstanceIdentifier: ").append(getDbInstanceIdentifier()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getDbClusterIdentifier() != null)
            sb.append("DbClusterIdentifier: ").append(getDbClusterIdentifier()).append(",");
        if (getDbInstanceArn() != null)
            sb.append("DbInstanceArn: ").append(getDbInstanceArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RdsDbInstanceDetails == false)
            return false;
        RdsDbInstanceDetails other = (RdsDbInstanceDetails) obj;
        if (other.getDbInstanceIdentifier() == null ^ this.getDbInstanceIdentifier() == null)
            return false;
        if (other.getDbInstanceIdentifier() != null && other.getDbInstanceIdentifier().equals(this.getDbInstanceIdentifier()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDbClusterIdentifier() == null ^ this.getDbClusterIdentifier() == null)
            return false;
        if (other.getDbClusterIdentifier() != null && other.getDbClusterIdentifier().equals(this.getDbClusterIdentifier()) == false)
            return false;
        if (other.getDbInstanceArn() == null ^ this.getDbInstanceArn() == null)
            return false;
        if (other.getDbInstanceArn() != null && other.getDbInstanceArn().equals(this.getDbInstanceArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDbInstanceIdentifier() == null) ? 0 : getDbInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getDbClusterIdentifier() == null) ? 0 : getDbClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDbInstanceArn() == null) ? 0 : getDbInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public RdsDbInstanceDetails clone() {
        try {
            return (RdsDbInstanceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.RdsDbInstanceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
