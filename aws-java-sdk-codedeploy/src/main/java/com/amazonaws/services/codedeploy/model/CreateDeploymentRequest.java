/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a create deployment operation.
 * </p>
 */
public class CreateDeploymentRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of an existing AWS CodeDeploy application associated with the
     * applicable IAM user or AWS account.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The deployment group's name.
     * </p>
     */
    private String deploymentGroupName;
    /**
     * <p>
     * The type of revision to deploy, along with information about the
     * revision's location.
     * </p>
     */
    private RevisionLocation revision;
    /**
     * <p>
     * The name of an existing deployment configuration associated with the
     * applicable IAM user or AWS account.
     * </p>
     * <p>
     * If not specified, the value configured in the deployment group will be
     * used as the default. If the deployment group does not have a deployment
     * configuration associated with it, then CodeDeployDefault.OneAtATime will
     * be used by default.
     * </p>
     */
    private String deploymentConfigName;
    /**
     * <p>
     * A comment about the deployment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * If set to true, then if the deployment causes the ApplicationStop
     * deployment lifecycle event to fail to a specific instance, the deployment
     * will not be considered to have failed to that instance at that point and
     * will continue on to the BeforeInstall deployment lifecycle event.
     * </p>
     * <p>
     * If set to false or not specified, then if the deployment causes the
     * ApplicationStop deployment lifecycle event to fail to a specific
     * instance, the deployment will stop to that instance, and the deployment
     * to that instance will be considered to have failed.
     * </p>
     */
    private Boolean ignoreApplicationStopFailures;

    /**
     * <p>
     * The name of an existing AWS CodeDeploy application associated with the
     * applicable IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of an existing AWS CodeDeploy application associated with
     *        the applicable IAM user or AWS account.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of an existing AWS CodeDeploy application associated with the
     * applicable IAM user or AWS account.
     * </p>
     * 
     * @return The name of an existing AWS CodeDeploy application associated
     *         with the applicable IAM user or AWS account.
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of an existing AWS CodeDeploy application associated with the
     * applicable IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of an existing AWS CodeDeploy application associated with
     *        the applicable IAM user or AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The deployment group's name.
     * </p>
     * 
     * @param deploymentGroupName
     *        The deployment group's name.
     */
    public void setDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }

    /**
     * <p>
     * The deployment group's name.
     * </p>
     * 
     * @return The deployment group's name.
     */
    public String getDeploymentGroupName() {
        return this.deploymentGroupName;
    }

    /**
     * <p>
     * The deployment group's name.
     * </p>
     * 
     * @param deploymentGroupName
     *        The deployment group's name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withDeploymentGroupName(
            String deploymentGroupName) {
        setDeploymentGroupName(deploymentGroupName);
        return this;
    }

    /**
     * <p>
     * The type of revision to deploy, along with information about the
     * revision's location.
     * </p>
     * 
     * @param revision
     *        The type of revision to deploy, along with information about the
     *        revision's location.
     */
    public void setRevision(RevisionLocation revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The type of revision to deploy, along with information about the
     * revision's location.
     * </p>
     * 
     * @return The type of revision to deploy, along with information about the
     *         revision's location.
     */
    public RevisionLocation getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The type of revision to deploy, along with information about the
     * revision's location.
     * </p>
     * 
     * @param revision
     *        The type of revision to deploy, along with information about the
     *        revision's location.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withRevision(RevisionLocation revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * The name of an existing deployment configuration associated with the
     * applicable IAM user or AWS account.
     * </p>
     * <p>
     * If not specified, the value configured in the deployment group will be
     * used as the default. If the deployment group does not have a deployment
     * configuration associated with it, then CodeDeployDefault.OneAtATime will
     * be used by default.
     * </p>
     * 
     * @param deploymentConfigName
     *        The name of an existing deployment configuration associated with
     *        the applicable IAM user or AWS account.</p>
     *        <p>
     *        If not specified, the value configured in the deployment group
     *        will be used as the default. If the deployment group does not have
     *        a deployment configuration associated with it, then
     *        CodeDeployDefault.OneAtATime will be used by default.
     */
    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }

    /**
     * <p>
     * The name of an existing deployment configuration associated with the
     * applicable IAM user or AWS account.
     * </p>
     * <p>
     * If not specified, the value configured in the deployment group will be
     * used as the default. If the deployment group does not have a deployment
     * configuration associated with it, then CodeDeployDefault.OneAtATime will
     * be used by default.
     * </p>
     * 
     * @return The name of an existing deployment configuration associated with
     *         the applicable IAM user or AWS account.</p>
     *         <p>
     *         If not specified, the value configured in the deployment group
     *         will be used as the default. If the deployment group does not
     *         have a deployment configuration associated with it, then
     *         CodeDeployDefault.OneAtATime will be used by default.
     */
    public String getDeploymentConfigName() {
        return this.deploymentConfigName;
    }

    /**
     * <p>
     * The name of an existing deployment configuration associated with the
     * applicable IAM user or AWS account.
     * </p>
     * <p>
     * If not specified, the value configured in the deployment group will be
     * used as the default. If the deployment group does not have a deployment
     * configuration associated with it, then CodeDeployDefault.OneAtATime will
     * be used by default.
     * </p>
     * 
     * @param deploymentConfigName
     *        The name of an existing deployment configuration associated with
     *        the applicable IAM user or AWS account.</p>
     *        <p>
     *        If not specified, the value configured in the deployment group
     *        will be used as the default. If the deployment group does not have
     *        a deployment configuration associated with it, then
     *        CodeDeployDefault.OneAtATime will be used by default.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withDeploymentConfigName(
            String deploymentConfigName) {
        setDeploymentConfigName(deploymentConfigName);
        return this;
    }

    /**
     * <p>
     * A comment about the deployment.
     * </p>
     * 
     * @param description
     *        A comment about the deployment.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A comment about the deployment.
     * </p>
     * 
     * @return A comment about the deployment.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A comment about the deployment.
     * </p>
     * 
     * @param description
     *        A comment about the deployment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * If set to true, then if the deployment causes the ApplicationStop
     * deployment lifecycle event to fail to a specific instance, the deployment
     * will not be considered to have failed to that instance at that point and
     * will continue on to the BeforeInstall deployment lifecycle event.
     * </p>
     * <p>
     * If set to false or not specified, then if the deployment causes the
     * ApplicationStop deployment lifecycle event to fail to a specific
     * instance, the deployment will stop to that instance, and the deployment
     * to that instance will be considered to have failed.
     * </p>
     * 
     * @param ignoreApplicationStopFailures
     *        If set to true, then if the deployment causes the ApplicationStop
     *        deployment lifecycle event to fail to a specific instance, the
     *        deployment will not be considered to have failed to that instance
     *        at that point and will continue on to the BeforeInstall deployment
     *        lifecycle event.</p>
     *        <p>
     *        If set to false or not specified, then if the deployment causes
     *        the ApplicationStop deployment lifecycle event to fail to a
     *        specific instance, the deployment will stop to that instance, and
     *        the deployment to that instance will be considered to have failed.
     */
    public void setIgnoreApplicationStopFailures(
            Boolean ignoreApplicationStopFailures) {
        this.ignoreApplicationStopFailures = ignoreApplicationStopFailures;
    }

    /**
     * <p>
     * If set to true, then if the deployment causes the ApplicationStop
     * deployment lifecycle event to fail to a specific instance, the deployment
     * will not be considered to have failed to that instance at that point and
     * will continue on to the BeforeInstall deployment lifecycle event.
     * </p>
     * <p>
     * If set to false or not specified, then if the deployment causes the
     * ApplicationStop deployment lifecycle event to fail to a specific
     * instance, the deployment will stop to that instance, and the deployment
     * to that instance will be considered to have failed.
     * </p>
     * 
     * @return If set to true, then if the deployment causes the ApplicationStop
     *         deployment lifecycle event to fail to a specific instance, the
     *         deployment will not be considered to have failed to that instance
     *         at that point and will continue on to the BeforeInstall
     *         deployment lifecycle event.</p>
     *         <p>
     *         If set to false or not specified, then if the deployment causes
     *         the ApplicationStop deployment lifecycle event to fail to a
     *         specific instance, the deployment will stop to that instance, and
     *         the deployment to that instance will be considered to have
     *         failed.
     */
    public Boolean getIgnoreApplicationStopFailures() {
        return this.ignoreApplicationStopFailures;
    }

    /**
     * <p>
     * If set to true, then if the deployment causes the ApplicationStop
     * deployment lifecycle event to fail to a specific instance, the deployment
     * will not be considered to have failed to that instance at that point and
     * will continue on to the BeforeInstall deployment lifecycle event.
     * </p>
     * <p>
     * If set to false or not specified, then if the deployment causes the
     * ApplicationStop deployment lifecycle event to fail to a specific
     * instance, the deployment will stop to that instance, and the deployment
     * to that instance will be considered to have failed.
     * </p>
     * 
     * @param ignoreApplicationStopFailures
     *        If set to true, then if the deployment causes the ApplicationStop
     *        deployment lifecycle event to fail to a specific instance, the
     *        deployment will not be considered to have failed to that instance
     *        at that point and will continue on to the BeforeInstall deployment
     *        lifecycle event.</p>
     *        <p>
     *        If set to false or not specified, then if the deployment causes
     *        the ApplicationStop deployment lifecycle event to fail to a
     *        specific instance, the deployment will stop to that instance, and
     *        the deployment to that instance will be considered to have failed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withIgnoreApplicationStopFailures(
            Boolean ignoreApplicationStopFailures) {
        setIgnoreApplicationStopFailures(ignoreApplicationStopFailures);
        return this;
    }

    /**
     * <p>
     * If set to true, then if the deployment causes the ApplicationStop
     * deployment lifecycle event to fail to a specific instance, the deployment
     * will not be considered to have failed to that instance at that point and
     * will continue on to the BeforeInstall deployment lifecycle event.
     * </p>
     * <p>
     * If set to false or not specified, then if the deployment causes the
     * ApplicationStop deployment lifecycle event to fail to a specific
     * instance, the deployment will stop to that instance, and the deployment
     * to that instance will be considered to have failed.
     * </p>
     * 
     * @return If set to true, then if the deployment causes the ApplicationStop
     *         deployment lifecycle event to fail to a specific instance, the
     *         deployment will not be considered to have failed to that instance
     *         at that point and will continue on to the BeforeInstall
     *         deployment lifecycle event.</p>
     *         <p>
     *         If set to false or not specified, then if the deployment causes
     *         the ApplicationStop deployment lifecycle event to fail to a
     *         specific instance, the deployment will stop to that instance, and
     *         the deployment to that instance will be considered to have
     *         failed.
     */
    public Boolean isIgnoreApplicationStopFailures() {
        return this.ignoreApplicationStopFailures;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getDeploymentGroupName() != null)
            sb.append("DeploymentGroupName: " + getDeploymentGroupName() + ",");
        if (getRevision() != null)
            sb.append("Revision: " + getRevision() + ",");
        if (getDeploymentConfigName() != null)
            sb.append("DeploymentConfigName: " + getDeploymentConfigName()
                    + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getIgnoreApplicationStopFailures() != null)
            sb.append("IgnoreApplicationStopFailures: "
                    + getIgnoreApplicationStopFailures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentRequest == false)
            return false;
        CreateDeploymentRequest other = (CreateDeploymentRequest) obj;
        if (other.getApplicationName() == null
                ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDeploymentGroupName() == null
                ^ this.getDeploymentGroupName() == null)
            return false;
        if (other.getDeploymentGroupName() != null
                && other.getDeploymentGroupName().equals(
                        this.getDeploymentGroupName()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null
                && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getDeploymentConfigName() == null
                ^ this.getDeploymentConfigName() == null)
            return false;
        if (other.getDeploymentConfigName() != null
                && other.getDeploymentConfigName().equals(
                        this.getDeploymentConfigName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIgnoreApplicationStopFailures() == null
                ^ this.getIgnoreApplicationStopFailures() == null)
            return false;
        if (other.getIgnoreApplicationStopFailures() != null
                && other.getIgnoreApplicationStopFailures().equals(
                        this.getIgnoreApplicationStopFailures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDeploymentGroupName() == null) ? 0
                        : getDeploymentGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeploymentConfigName() == null) ? 0
                        : getDeploymentConfigName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getIgnoreApplicationStopFailures() == null) ? 0
                        : getIgnoreApplicationStopFailures().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentRequest clone() {
        return (CreateDeploymentRequest) super.clone();
    }
}