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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateBlueGreenDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBlueGreenDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the blue/green deployment.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be the same as an existing blue/green deployment name in the same account and Amazon Web Services Region.
     * </p>
     * </li>
     * </ul>
     */
    private String blueGreenDeploymentName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source production database.
     * </p>
     * <p>
     * Specify the database that you want to clone. The blue/green deployment creates this database in the green
     * environment. You can make updates to the database in the green environment, such as an engine version upgrade.
     * When you are ready, you can switch the database in the green environment to be the production database.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The engine version of the database in the green environment.
     * </p>
     * <p>
     * Specify the engine version to upgrade to in the green environment.
     * </p>
     */
    private String targetEngineVersion;
    /**
     * <p>
     * The DB parameter group associated with the DB instance in the green environment.
     * </p>
     * <p>
     * To test parameter changes, specify a DB parameter group that is different from the one associated with the source
     * DB instance.
     * </p>
     */
    private String targetDBParameterGroupName;
    /**
     * <p>
     * The DB cluster parameter group associated with the Aurora DB cluster in the green environment.
     * </p>
     * <p>
     * To test parameter changes, specify a DB cluster parameter group that is different from the one associated with
     * the source DB cluster.
     * </p>
     */
    private String targetDBClusterParameterGroupName;
    /**
     * <p>
     * Tags to assign to the blue/green deployment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the blue/green deployment.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be the same as an existing blue/green deployment name in the same account and Amazon Web Services Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @param blueGreenDeploymentName
     *        The name of the blue/green deployment.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be the same as an existing blue/green deployment name in the same account and Amazon Web Services
     *        Region.
     *        </p>
     *        </li>
     */

    public void setBlueGreenDeploymentName(String blueGreenDeploymentName) {
        this.blueGreenDeploymentName = blueGreenDeploymentName;
    }

    /**
     * <p>
     * The name of the blue/green deployment.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be the same as an existing blue/green deployment name in the same account and Amazon Web Services Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the blue/green deployment.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be the same as an existing blue/green deployment name in the same account and Amazon Web Services
     *         Region.
     *         </p>
     *         </li>
     */

    public String getBlueGreenDeploymentName() {
        return this.blueGreenDeploymentName;
    }

    /**
     * <p>
     * The name of the blue/green deployment.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be the same as an existing blue/green deployment name in the same account and Amazon Web Services Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @param blueGreenDeploymentName
     *        The name of the blue/green deployment.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be the same as an existing blue/green deployment name in the same account and Amazon Web Services
     *        Region.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBlueGreenDeploymentRequest withBlueGreenDeploymentName(String blueGreenDeploymentName) {
        setBlueGreenDeploymentName(blueGreenDeploymentName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source production database.
     * </p>
     * <p>
     * Specify the database that you want to clone. The blue/green deployment creates this database in the green
     * environment. You can make updates to the database in the green environment, such as an engine version upgrade.
     * When you are ready, you can switch the database in the green environment to be the production database.
     * </p>
     * 
     * @param source
     *        The Amazon Resource Name (ARN) of the source production database.</p>
     *        <p>
     *        Specify the database that you want to clone. The blue/green deployment creates this database in the green
     *        environment. You can make updates to the database in the green environment, such as an engine version
     *        upgrade. When you are ready, you can switch the database in the green environment to be the production
     *        database.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source production database.
     * </p>
     * <p>
     * Specify the database that you want to clone. The blue/green deployment creates this database in the green
     * environment. You can make updates to the database in the green environment, such as an engine version upgrade.
     * When you are ready, you can switch the database in the green environment to be the production database.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source production database.</p>
     *         <p>
     *         Specify the database that you want to clone. The blue/green deployment creates this database in the green
     *         environment. You can make updates to the database in the green environment, such as an engine version
     *         upgrade. When you are ready, you can switch the database in the green environment to be the production
     *         database.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source production database.
     * </p>
     * <p>
     * Specify the database that you want to clone. The blue/green deployment creates this database in the green
     * environment. You can make updates to the database in the green environment, such as an engine version upgrade.
     * When you are ready, you can switch the database in the green environment to be the production database.
     * </p>
     * 
     * @param source
     *        The Amazon Resource Name (ARN) of the source production database.</p>
     *        <p>
     *        Specify the database that you want to clone. The blue/green deployment creates this database in the green
     *        environment. You can make updates to the database in the green environment, such as an engine version
     *        upgrade. When you are ready, you can switch the database in the green environment to be the production
     *        database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBlueGreenDeploymentRequest withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The engine version of the database in the green environment.
     * </p>
     * <p>
     * Specify the engine version to upgrade to in the green environment.
     * </p>
     * 
     * @param targetEngineVersion
     *        The engine version of the database in the green environment.</p>
     *        <p>
     *        Specify the engine version to upgrade to in the green environment.
     */

    public void setTargetEngineVersion(String targetEngineVersion) {
        this.targetEngineVersion = targetEngineVersion;
    }

    /**
     * <p>
     * The engine version of the database in the green environment.
     * </p>
     * <p>
     * Specify the engine version to upgrade to in the green environment.
     * </p>
     * 
     * @return The engine version of the database in the green environment.</p>
     *         <p>
     *         Specify the engine version to upgrade to in the green environment.
     */

    public String getTargetEngineVersion() {
        return this.targetEngineVersion;
    }

    /**
     * <p>
     * The engine version of the database in the green environment.
     * </p>
     * <p>
     * Specify the engine version to upgrade to in the green environment.
     * </p>
     * 
     * @param targetEngineVersion
     *        The engine version of the database in the green environment.</p>
     *        <p>
     *        Specify the engine version to upgrade to in the green environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBlueGreenDeploymentRequest withTargetEngineVersion(String targetEngineVersion) {
        setTargetEngineVersion(targetEngineVersion);
        return this;
    }

    /**
     * <p>
     * The DB parameter group associated with the DB instance in the green environment.
     * </p>
     * <p>
     * To test parameter changes, specify a DB parameter group that is different from the one associated with the source
     * DB instance.
     * </p>
     * 
     * @param targetDBParameterGroupName
     *        The DB parameter group associated with the DB instance in the green environment.</p>
     *        <p>
     *        To test parameter changes, specify a DB parameter group that is different from the one associated with the
     *        source DB instance.
     */

    public void setTargetDBParameterGroupName(String targetDBParameterGroupName) {
        this.targetDBParameterGroupName = targetDBParameterGroupName;
    }

    /**
     * <p>
     * The DB parameter group associated with the DB instance in the green environment.
     * </p>
     * <p>
     * To test parameter changes, specify a DB parameter group that is different from the one associated with the source
     * DB instance.
     * </p>
     * 
     * @return The DB parameter group associated with the DB instance in the green environment.</p>
     *         <p>
     *         To test parameter changes, specify a DB parameter group that is different from the one associated with
     *         the source DB instance.
     */

    public String getTargetDBParameterGroupName() {
        return this.targetDBParameterGroupName;
    }

    /**
     * <p>
     * The DB parameter group associated with the DB instance in the green environment.
     * </p>
     * <p>
     * To test parameter changes, specify a DB parameter group that is different from the one associated with the source
     * DB instance.
     * </p>
     * 
     * @param targetDBParameterGroupName
     *        The DB parameter group associated with the DB instance in the green environment.</p>
     *        <p>
     *        To test parameter changes, specify a DB parameter group that is different from the one associated with the
     *        source DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBlueGreenDeploymentRequest withTargetDBParameterGroupName(String targetDBParameterGroupName) {
        setTargetDBParameterGroupName(targetDBParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The DB cluster parameter group associated with the Aurora DB cluster in the green environment.
     * </p>
     * <p>
     * To test parameter changes, specify a DB cluster parameter group that is different from the one associated with
     * the source DB cluster.
     * </p>
     * 
     * @param targetDBClusterParameterGroupName
     *        The DB cluster parameter group associated with the Aurora DB cluster in the green environment.</p>
     *        <p>
     *        To test parameter changes, specify a DB cluster parameter group that is different from the one associated
     *        with the source DB cluster.
     */

    public void setTargetDBClusterParameterGroupName(String targetDBClusterParameterGroupName) {
        this.targetDBClusterParameterGroupName = targetDBClusterParameterGroupName;
    }

    /**
     * <p>
     * The DB cluster parameter group associated with the Aurora DB cluster in the green environment.
     * </p>
     * <p>
     * To test parameter changes, specify a DB cluster parameter group that is different from the one associated with
     * the source DB cluster.
     * </p>
     * 
     * @return The DB cluster parameter group associated with the Aurora DB cluster in the green environment.</p>
     *         <p>
     *         To test parameter changes, specify a DB cluster parameter group that is different from the one associated
     *         with the source DB cluster.
     */

    public String getTargetDBClusterParameterGroupName() {
        return this.targetDBClusterParameterGroupName;
    }

    /**
     * <p>
     * The DB cluster parameter group associated with the Aurora DB cluster in the green environment.
     * </p>
     * <p>
     * To test parameter changes, specify a DB cluster parameter group that is different from the one associated with
     * the source DB cluster.
     * </p>
     * 
     * @param targetDBClusterParameterGroupName
     *        The DB cluster parameter group associated with the Aurora DB cluster in the green environment.</p>
     *        <p>
     *        To test parameter changes, specify a DB cluster parameter group that is different from the one associated
     *        with the source DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBlueGreenDeploymentRequest withTargetDBClusterParameterGroupName(String targetDBClusterParameterGroupName) {
        setTargetDBClusterParameterGroupName(targetDBClusterParameterGroupName);
        return this;
    }

    /**
     * <p>
     * Tags to assign to the blue/green deployment.
     * </p>
     * 
     * @return Tags to assign to the blue/green deployment.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Tags to assign to the blue/green deployment.
     * </p>
     * 
     * @param tags
     *        Tags to assign to the blue/green deployment.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Tags to assign to the blue/green deployment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags to assign to the blue/green deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBlueGreenDeploymentRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags to assign to the blue/green deployment.
     * </p>
     * 
     * @param tags
     *        Tags to assign to the blue/green deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBlueGreenDeploymentRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getBlueGreenDeploymentName() != null)
            sb.append("BlueGreenDeploymentName: ").append(getBlueGreenDeploymentName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getTargetEngineVersion() != null)
            sb.append("TargetEngineVersion: ").append(getTargetEngineVersion()).append(",");
        if (getTargetDBParameterGroupName() != null)
            sb.append("TargetDBParameterGroupName: ").append(getTargetDBParameterGroupName()).append(",");
        if (getTargetDBClusterParameterGroupName() != null)
            sb.append("TargetDBClusterParameterGroupName: ").append(getTargetDBClusterParameterGroupName()).append(",");
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

        if (obj instanceof CreateBlueGreenDeploymentRequest == false)
            return false;
        CreateBlueGreenDeploymentRequest other = (CreateBlueGreenDeploymentRequest) obj;
        if (other.getBlueGreenDeploymentName() == null ^ this.getBlueGreenDeploymentName() == null)
            return false;
        if (other.getBlueGreenDeploymentName() != null && other.getBlueGreenDeploymentName().equals(this.getBlueGreenDeploymentName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTargetEngineVersion() == null ^ this.getTargetEngineVersion() == null)
            return false;
        if (other.getTargetEngineVersion() != null && other.getTargetEngineVersion().equals(this.getTargetEngineVersion()) == false)
            return false;
        if (other.getTargetDBParameterGroupName() == null ^ this.getTargetDBParameterGroupName() == null)
            return false;
        if (other.getTargetDBParameterGroupName() != null && other.getTargetDBParameterGroupName().equals(this.getTargetDBParameterGroupName()) == false)
            return false;
        if (other.getTargetDBClusterParameterGroupName() == null ^ this.getTargetDBClusterParameterGroupName() == null)
            return false;
        if (other.getTargetDBClusterParameterGroupName() != null
                && other.getTargetDBClusterParameterGroupName().equals(this.getTargetDBClusterParameterGroupName()) == false)
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

        hashCode = prime * hashCode + ((getBlueGreenDeploymentName() == null) ? 0 : getBlueGreenDeploymentName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTargetEngineVersion() == null) ? 0 : getTargetEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getTargetDBParameterGroupName() == null) ? 0 : getTargetDBParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getTargetDBClusterParameterGroupName() == null) ? 0 : getTargetDBClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateBlueGreenDeploymentRequest clone() {
        return (CreateBlueGreenDeploymentRequest) super.clone();
    }

}
