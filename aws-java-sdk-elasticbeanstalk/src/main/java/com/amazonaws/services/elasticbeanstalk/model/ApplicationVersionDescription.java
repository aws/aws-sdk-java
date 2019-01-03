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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the properties of an application version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ApplicationVersionDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationVersionDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application version.
     * </p>
     */
    private String applicationVersionArn;
    /**
     * <p>
     * The name of the application to which the application version belongs.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The description of the application version.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A unique identifier for the application version.
     * </p>
     */
    private String versionLabel;
    /**
     * <p>
     * If the version's source code was retrieved from AWS CodeCommit, the location of the source code for the
     * application version.
     * </p>
     */
    private SourceBuildInformation sourceBuildInformation;
    /**
     * <p>
     * Reference to the artifact from the AWS CodeBuild build.
     * </p>
     */
    private String buildArn;
    /**
     * <p>
     * The storage location of the application version's source bundle in Amazon S3.
     * </p>
     */
    private S3Location sourceBundle;
    /**
     * <p>
     * The creation date of the application version.
     * </p>
     */
    private java.util.Date dateCreated;
    /**
     * <p>
     * The last modified date of the application version.
     * </p>
     */
    private java.util.Date dateUpdated;
    /**
     * <p>
     * The processing status of the application version. Reflects the state of the application version during its
     * creation. Many of the values are only applicable if you specified <code>True</code> for the <code>Process</code>
     * parameter of the <code>CreateApplicationVersion</code> action. The following list describes the possible values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unprocessed</code> – Application version wasn't pre-processed or validated. Elastic Beanstalk will validate
     * configuration files during deployment of the application version to an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processing</code> – Elastic Beanstalk is currently processing the application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Building</code> – Application version is currently undergoing an AWS CodeBuild build.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> – Elastic Beanstalk was successfully pre-processed and validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Either the AWS CodeBuild build failed or configuration files didn't pass validation. This
     * application version isn't usable.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application version.
     * </p>
     * 
     * @param applicationVersionArn
     *        The Amazon Resource Name (ARN) of the application version.
     */

    public void setApplicationVersionArn(String applicationVersionArn) {
        this.applicationVersionArn = applicationVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application version.
     */

    public String getApplicationVersionArn() {
        return this.applicationVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application version.
     * </p>
     * 
     * @param applicationVersionArn
     *        The Amazon Resource Name (ARN) of the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionDescription withApplicationVersionArn(String applicationVersionArn) {
        setApplicationVersionArn(applicationVersionArn);
        return this;
    }

    /**
     * <p>
     * The name of the application to which the application version belongs.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to which the application version belongs.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application to which the application version belongs.
     * </p>
     * 
     * @return The name of the application to which the application version belongs.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application to which the application version belongs.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to which the application version belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionDescription withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The description of the application version.
     * </p>
     * 
     * @param description
     *        The description of the application version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the application version.
     * </p>
     * 
     * @return The description of the application version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the application version.
     * </p>
     * 
     * @param description
     *        The description of the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionDescription withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the application version.
     * </p>
     * 
     * @param versionLabel
     *        A unique identifier for the application version.
     */

    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * A unique identifier for the application version.
     * </p>
     * 
     * @return A unique identifier for the application version.
     */

    public String getVersionLabel() {
        return this.versionLabel;
    }

    /**
     * <p>
     * A unique identifier for the application version.
     * </p>
     * 
     * @param versionLabel
     *        A unique identifier for the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionDescription withVersionLabel(String versionLabel) {
        setVersionLabel(versionLabel);
        return this;
    }

    /**
     * <p>
     * If the version's source code was retrieved from AWS CodeCommit, the location of the source code for the
     * application version.
     * </p>
     * 
     * @param sourceBuildInformation
     *        If the version's source code was retrieved from AWS CodeCommit, the location of the source code for the
     *        application version.
     */

    public void setSourceBuildInformation(SourceBuildInformation sourceBuildInformation) {
        this.sourceBuildInformation = sourceBuildInformation;
    }

    /**
     * <p>
     * If the version's source code was retrieved from AWS CodeCommit, the location of the source code for the
     * application version.
     * </p>
     * 
     * @return If the version's source code was retrieved from AWS CodeCommit, the location of the source code for the
     *         application version.
     */

    public SourceBuildInformation getSourceBuildInformation() {
        return this.sourceBuildInformation;
    }

    /**
     * <p>
     * If the version's source code was retrieved from AWS CodeCommit, the location of the source code for the
     * application version.
     * </p>
     * 
     * @param sourceBuildInformation
     *        If the version's source code was retrieved from AWS CodeCommit, the location of the source code for the
     *        application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionDescription withSourceBuildInformation(SourceBuildInformation sourceBuildInformation) {
        setSourceBuildInformation(sourceBuildInformation);
        return this;
    }

    /**
     * <p>
     * Reference to the artifact from the AWS CodeBuild build.
     * </p>
     * 
     * @param buildArn
     *        Reference to the artifact from the AWS CodeBuild build.
     */

    public void setBuildArn(String buildArn) {
        this.buildArn = buildArn;
    }

    /**
     * <p>
     * Reference to the artifact from the AWS CodeBuild build.
     * </p>
     * 
     * @return Reference to the artifact from the AWS CodeBuild build.
     */

    public String getBuildArn() {
        return this.buildArn;
    }

    /**
     * <p>
     * Reference to the artifact from the AWS CodeBuild build.
     * </p>
     * 
     * @param buildArn
     *        Reference to the artifact from the AWS CodeBuild build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionDescription withBuildArn(String buildArn) {
        setBuildArn(buildArn);
        return this;
    }

    /**
     * <p>
     * The storage location of the application version's source bundle in Amazon S3.
     * </p>
     * 
     * @param sourceBundle
     *        The storage location of the application version's source bundle in Amazon S3.
     */

    public void setSourceBundle(S3Location sourceBundle) {
        this.sourceBundle = sourceBundle;
    }

    /**
     * <p>
     * The storage location of the application version's source bundle in Amazon S3.
     * </p>
     * 
     * @return The storage location of the application version's source bundle in Amazon S3.
     */

    public S3Location getSourceBundle() {
        return this.sourceBundle;
    }

    /**
     * <p>
     * The storage location of the application version's source bundle in Amazon S3.
     * </p>
     * 
     * @param sourceBundle
     *        The storage location of the application version's source bundle in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionDescription withSourceBundle(S3Location sourceBundle) {
        setSourceBundle(sourceBundle);
        return this;
    }

    /**
     * <p>
     * The creation date of the application version.
     * </p>
     * 
     * @param dateCreated
     *        The creation date of the application version.
     */

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The creation date of the application version.
     * </p>
     * 
     * @return The creation date of the application version.
     */

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The creation date of the application version.
     * </p>
     * 
     * @param dateCreated
     *        The creation date of the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionDescription withDateCreated(java.util.Date dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The last modified date of the application version.
     * </p>
     * 
     * @param dateUpdated
     *        The last modified date of the application version.
     */

    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The last modified date of the application version.
     * </p>
     * 
     * @return The last modified date of the application version.
     */

    public java.util.Date getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * <p>
     * The last modified date of the application version.
     * </p>
     * 
     * @param dateUpdated
     *        The last modified date of the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationVersionDescription withDateUpdated(java.util.Date dateUpdated) {
        setDateUpdated(dateUpdated);
        return this;
    }

    /**
     * <p>
     * The processing status of the application version. Reflects the state of the application version during its
     * creation. Many of the values are only applicable if you specified <code>True</code> for the <code>Process</code>
     * parameter of the <code>CreateApplicationVersion</code> action. The following list describes the possible values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unprocessed</code> – Application version wasn't pre-processed or validated. Elastic Beanstalk will validate
     * configuration files during deployment of the application version to an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processing</code> – Elastic Beanstalk is currently processing the application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Building</code> – Application version is currently undergoing an AWS CodeBuild build.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> – Elastic Beanstalk was successfully pre-processed and validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Either the AWS CodeBuild build failed or configuration files didn't pass validation. This
     * application version isn't usable.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The processing status of the application version. Reflects the state of the application version during its
     *        creation. Many of the values are only applicable if you specified <code>True</code> for the
     *        <code>Process</code> parameter of the <code>CreateApplicationVersion</code> action. The following list
     *        describes the possible values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Unprocessed</code> – Application version wasn't pre-processed or validated. Elastic Beanstalk will
     *        validate configuration files during deployment of the application version to an environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Processing</code> – Elastic Beanstalk is currently processing the application version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Building</code> – Application version is currently undergoing an AWS CodeBuild build.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Processed</code> – Elastic Beanstalk was successfully pre-processed and validated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> – Either the AWS CodeBuild build failed or configuration files didn't pass validation.
     *        This application version isn't usable.
     *        </p>
     *        </li>
     * @see ApplicationVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The processing status of the application version. Reflects the state of the application version during its
     * creation. Many of the values are only applicable if you specified <code>True</code> for the <code>Process</code>
     * parameter of the <code>CreateApplicationVersion</code> action. The following list describes the possible values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unprocessed</code> – Application version wasn't pre-processed or validated. Elastic Beanstalk will validate
     * configuration files during deployment of the application version to an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processing</code> – Elastic Beanstalk is currently processing the application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Building</code> – Application version is currently undergoing an AWS CodeBuild build.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> – Elastic Beanstalk was successfully pre-processed and validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Either the AWS CodeBuild build failed or configuration files didn't pass validation. This
     * application version isn't usable.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The processing status of the application version. Reflects the state of the application version during
     *         its creation. Many of the values are only applicable if you specified <code>True</code> for the
     *         <code>Process</code> parameter of the <code>CreateApplicationVersion</code> action. The following list
     *         describes the possible values.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Unprocessed</code> – Application version wasn't pre-processed or validated. Elastic Beanstalk will
     *         validate configuration files during deployment of the application version to an environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Processing</code> – Elastic Beanstalk is currently processing the application version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Building</code> – Application version is currently undergoing an AWS CodeBuild build.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Processed</code> – Elastic Beanstalk was successfully pre-processed and validated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> – Either the AWS CodeBuild build failed or configuration files didn't pass
     *         validation. This application version isn't usable.
     *         </p>
     *         </li>
     * @see ApplicationVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The processing status of the application version. Reflects the state of the application version during its
     * creation. Many of the values are only applicable if you specified <code>True</code> for the <code>Process</code>
     * parameter of the <code>CreateApplicationVersion</code> action. The following list describes the possible values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unprocessed</code> – Application version wasn't pre-processed or validated. Elastic Beanstalk will validate
     * configuration files during deployment of the application version to an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processing</code> – Elastic Beanstalk is currently processing the application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Building</code> – Application version is currently undergoing an AWS CodeBuild build.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> – Elastic Beanstalk was successfully pre-processed and validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Either the AWS CodeBuild build failed or configuration files didn't pass validation. This
     * application version isn't usable.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The processing status of the application version. Reflects the state of the application version during its
     *        creation. Many of the values are only applicable if you specified <code>True</code> for the
     *        <code>Process</code> parameter of the <code>CreateApplicationVersion</code> action. The following list
     *        describes the possible values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Unprocessed</code> – Application version wasn't pre-processed or validated. Elastic Beanstalk will
     *        validate configuration files during deployment of the application version to an environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Processing</code> – Elastic Beanstalk is currently processing the application version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Building</code> – Application version is currently undergoing an AWS CodeBuild build.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Processed</code> – Elastic Beanstalk was successfully pre-processed and validated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> – Either the AWS CodeBuild build failed or configuration files didn't pass validation.
     *        This application version isn't usable.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationVersionStatus
     */

    public ApplicationVersionDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The processing status of the application version. Reflects the state of the application version during its
     * creation. Many of the values are only applicable if you specified <code>True</code> for the <code>Process</code>
     * parameter of the <code>CreateApplicationVersion</code> action. The following list describes the possible values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unprocessed</code> – Application version wasn't pre-processed or validated. Elastic Beanstalk will validate
     * configuration files during deployment of the application version to an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processing</code> – Elastic Beanstalk is currently processing the application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Building</code> – Application version is currently undergoing an AWS CodeBuild build.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> – Elastic Beanstalk was successfully pre-processed and validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Either the AWS CodeBuild build failed or configuration files didn't pass validation. This
     * application version isn't usable.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The processing status of the application version. Reflects the state of the application version during its
     *        creation. Many of the values are only applicable if you specified <code>True</code> for the
     *        <code>Process</code> parameter of the <code>CreateApplicationVersion</code> action. The following list
     *        describes the possible values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Unprocessed</code> – Application version wasn't pre-processed or validated. Elastic Beanstalk will
     *        validate configuration files during deployment of the application version to an environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Processing</code> – Elastic Beanstalk is currently processing the application version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Building</code> – Application version is currently undergoing an AWS CodeBuild build.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Processed</code> – Elastic Beanstalk was successfully pre-processed and validated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> – Either the AWS CodeBuild build failed or configuration files didn't pass validation.
     *        This application version isn't usable.
     *        </p>
     *        </li>
     * @see ApplicationVersionStatus
     */

    public void setStatus(ApplicationVersionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The processing status of the application version. Reflects the state of the application version during its
     * creation. Many of the values are only applicable if you specified <code>True</code> for the <code>Process</code>
     * parameter of the <code>CreateApplicationVersion</code> action. The following list describes the possible values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unprocessed</code> – Application version wasn't pre-processed or validated. Elastic Beanstalk will validate
     * configuration files during deployment of the application version to an environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processing</code> – Elastic Beanstalk is currently processing the application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Building</code> – Application version is currently undergoing an AWS CodeBuild build.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Processed</code> – Elastic Beanstalk was successfully pre-processed and validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> – Either the AWS CodeBuild build failed or configuration files didn't pass validation. This
     * application version isn't usable.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The processing status of the application version. Reflects the state of the application version during its
     *        creation. Many of the values are only applicable if you specified <code>True</code> for the
     *        <code>Process</code> parameter of the <code>CreateApplicationVersion</code> action. The following list
     *        describes the possible values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Unprocessed</code> – Application version wasn't pre-processed or validated. Elastic Beanstalk will
     *        validate configuration files during deployment of the application version to an environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Processing</code> – Elastic Beanstalk is currently processing the application version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Building</code> – Application version is currently undergoing an AWS CodeBuild build.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Processed</code> – Elastic Beanstalk was successfully pre-processed and validated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> – Either the AWS CodeBuild build failed or configuration files didn't pass validation.
     *        This application version isn't usable.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationVersionStatus
     */

    public ApplicationVersionDescription withStatus(ApplicationVersionStatus status) {
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
        if (getApplicationVersionArn() != null)
            sb.append("ApplicationVersionArn: ").append(getApplicationVersionArn()).append(",");
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getVersionLabel() != null)
            sb.append("VersionLabel: ").append(getVersionLabel()).append(",");
        if (getSourceBuildInformation() != null)
            sb.append("SourceBuildInformation: ").append(getSourceBuildInformation()).append(",");
        if (getBuildArn() != null)
            sb.append("BuildArn: ").append(getBuildArn()).append(",");
        if (getSourceBundle() != null)
            sb.append("SourceBundle: ").append(getSourceBundle()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getDateUpdated() != null)
            sb.append("DateUpdated: ").append(getDateUpdated()).append(",");
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

        if (obj instanceof ApplicationVersionDescription == false)
            return false;
        ApplicationVersionDescription other = (ApplicationVersionDescription) obj;
        if (other.getApplicationVersionArn() == null ^ this.getApplicationVersionArn() == null)
            return false;
        if (other.getApplicationVersionArn() != null && other.getApplicationVersionArn().equals(this.getApplicationVersionArn()) == false)
            return false;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        if (other.getSourceBuildInformation() == null ^ this.getSourceBuildInformation() == null)
            return false;
        if (other.getSourceBuildInformation() != null && other.getSourceBuildInformation().equals(this.getSourceBuildInformation()) == false)
            return false;
        if (other.getBuildArn() == null ^ this.getBuildArn() == null)
            return false;
        if (other.getBuildArn() != null && other.getBuildArn().equals(this.getBuildArn()) == false)
            return false;
        if (other.getSourceBundle() == null ^ this.getSourceBundle() == null)
            return false;
        if (other.getSourceBundle() != null && other.getSourceBundle().equals(this.getSourceBundle()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null)
            return false;
        if (other.getDateUpdated() != null && other.getDateUpdated().equals(this.getDateUpdated()) == false)
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

        hashCode = prime * hashCode + ((getApplicationVersionArn() == null) ? 0 : getApplicationVersionArn().hashCode());
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime * hashCode + ((getSourceBuildInformation() == null) ? 0 : getSourceBuildInformation().hashCode());
        hashCode = prime * hashCode + ((getBuildArn() == null) ? 0 : getBuildArn().hashCode());
        hashCode = prime * hashCode + ((getSourceBundle() == null) ? 0 : getSourceBundle().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationVersionDescription clone() {
        try {
            return (ApplicationVersionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
