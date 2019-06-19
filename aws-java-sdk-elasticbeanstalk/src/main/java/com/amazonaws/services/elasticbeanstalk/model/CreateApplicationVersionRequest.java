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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreateApplicationVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application. If no application is found with this name, and <code>AutoCreateApplication</code> is
     * <code>false</code>, returns an <code>InvalidParameterValue</code> error.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * A label identifying this version.
     * </p>
     * <p>
     * Constraint: Must be unique per application. If an application version already exists with this label for the
     * specified application, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     */
    private String versionLabel;
    /**
     * <p>
     * Describes this version.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specify a commit in an AWS CodeCommit Git repository to use as the source code for the application version.
     * </p>
     */
    private SourceBuildInformation sourceBuildInformation;
    /**
     * <p>
     * The Amazon S3 bucket and key that identify the location of the source bundle for this version.
     * </p>
     * <note>
     * <p>
     * The Amazon S3 bucket must be in the same region as the environment.
     * </p>
     * </note>
     * <p>
     * Specify a source bundle in S3 or a commit in an AWS CodeCommit repository (with
     * <code>SourceBuildInformation</code>), but not both. If neither <code>SourceBundle</code> nor
     * <code>SourceBuildInformation</code> are provided, Elastic Beanstalk uses a sample application.
     * </p>
     */
    private S3Location sourceBundle;
    /**
     * <p>
     * Settings for an AWS CodeBuild build.
     * </p>
     */
    private BuildConfiguration buildConfiguration;
    /**
     * <p>
     * Set to <code>true</code> to create an application with the specified name if it doesn't already exist.
     * </p>
     */
    private Boolean autoCreateApplication;
    /**
     * <p>
     * Pre-processes and validates the environment manifest (<code>env.yaml</code>) and configuration files (
     * <code>*.config</code> files in the <code>.ebextensions</code> folder) in the source bundle. Validating
     * configuration files can identify issues prior to deploying the application version to an environment.
     * </p>
     * <p>
     * You must turn processing on for application versions that you create using AWS CodeBuild or AWS CodeCommit. For
     * application versions built from a source bundle in Amazon S3, processing is optional.
     * </p>
     * <note>
     * <p>
     * The <code>Process</code> option validates Elastic Beanstalk configuration files. It doesn't validate your
     * application's configuration files, like proxy server or Docker configuration.
     * </p>
     * </note>
     */
    private Boolean process;
    /**
     * <p>
     * Specifies the tags applied to the application version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application version. Environments that use the application
     * version don't inherit the tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * Default constructor for CreateApplicationVersionRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CreateApplicationVersionRequest() {
    }

    /**
     * Constructs a new CreateApplicationVersionRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param applicationName
     *        The name of the application. If no application is found with this name, and
     *        <code>AutoCreateApplication</code> is <code>false</code>, returns an <code>InvalidParameterValue</code>
     *        error.
     * @param versionLabel
     *        A label identifying this version.</p>
     *        <p>
     *        Constraint: Must be unique per application. If an application version already exists with this label for
     *        the specified application, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     */
    public CreateApplicationVersionRequest(String applicationName, String versionLabel) {
        setApplicationName(applicationName);
        setVersionLabel(versionLabel);
    }

    /**
     * <p>
     * The name of the application. If no application is found with this name, and <code>AutoCreateApplication</code> is
     * <code>false</code>, returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param applicationName
     *        The name of the application. If no application is found with this name, and
     *        <code>AutoCreateApplication</code> is <code>false</code>, returns an <code>InvalidParameterValue</code>
     *        error.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application. If no application is found with this name, and <code>AutoCreateApplication</code> is
     * <code>false</code>, returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @return The name of the application. If no application is found with this name, and
     *         <code>AutoCreateApplication</code> is <code>false</code>, returns an <code>InvalidParameterValue</code>
     *         error.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application. If no application is found with this name, and <code>AutoCreateApplication</code> is
     * <code>false</code>, returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param applicationName
     *        The name of the application. If no application is found with this name, and
     *        <code>AutoCreateApplication</code> is <code>false</code>, returns an <code>InvalidParameterValue</code>
     *        error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * A label identifying this version.
     * </p>
     * <p>
     * Constraint: Must be unique per application. If an application version already exists with this label for the
     * specified application, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param versionLabel
     *        A label identifying this version.</p>
     *        <p>
     *        Constraint: Must be unique per application. If an application version already exists with this label for
     *        the specified application, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     */

    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * A label identifying this version.
     * </p>
     * <p>
     * Constraint: Must be unique per application. If an application version already exists with this label for the
     * specified application, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @return A label identifying this version.</p>
     *         <p>
     *         Constraint: Must be unique per application. If an application version already exists with this label for
     *         the specified application, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     */

    public String getVersionLabel() {
        return this.versionLabel;
    }

    /**
     * <p>
     * A label identifying this version.
     * </p>
     * <p>
     * Constraint: Must be unique per application. If an application version already exists with this label for the
     * specified application, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param versionLabel
     *        A label identifying this version.</p>
     *        <p>
     *        Constraint: Must be unique per application. If an application version already exists with this label for
     *        the specified application, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withVersionLabel(String versionLabel) {
        setVersionLabel(versionLabel);
        return this;
    }

    /**
     * <p>
     * Describes this version.
     * </p>
     * 
     * @param description
     *        Describes this version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Describes this version.
     * </p>
     * 
     * @return Describes this version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Describes this version.
     * </p>
     * 
     * @param description
     *        Describes this version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specify a commit in an AWS CodeCommit Git repository to use as the source code for the application version.
     * </p>
     * 
     * @param sourceBuildInformation
     *        Specify a commit in an AWS CodeCommit Git repository to use as the source code for the application
     *        version.
     */

    public void setSourceBuildInformation(SourceBuildInformation sourceBuildInformation) {
        this.sourceBuildInformation = sourceBuildInformation;
    }

    /**
     * <p>
     * Specify a commit in an AWS CodeCommit Git repository to use as the source code for the application version.
     * </p>
     * 
     * @return Specify a commit in an AWS CodeCommit Git repository to use as the source code for the application
     *         version.
     */

    public SourceBuildInformation getSourceBuildInformation() {
        return this.sourceBuildInformation;
    }

    /**
     * <p>
     * Specify a commit in an AWS CodeCommit Git repository to use as the source code for the application version.
     * </p>
     * 
     * @param sourceBuildInformation
     *        Specify a commit in an AWS CodeCommit Git repository to use as the source code for the application
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withSourceBuildInformation(SourceBuildInformation sourceBuildInformation) {
        setSourceBuildInformation(sourceBuildInformation);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket and key that identify the location of the source bundle for this version.
     * </p>
     * <note>
     * <p>
     * The Amazon S3 bucket must be in the same region as the environment.
     * </p>
     * </note>
     * <p>
     * Specify a source bundle in S3 or a commit in an AWS CodeCommit repository (with
     * <code>SourceBuildInformation</code>), but not both. If neither <code>SourceBundle</code> nor
     * <code>SourceBuildInformation</code> are provided, Elastic Beanstalk uses a sample application.
     * </p>
     * 
     * @param sourceBundle
     *        The Amazon S3 bucket and key that identify the location of the source bundle for this version.</p> <note>
     *        <p>
     *        The Amazon S3 bucket must be in the same region as the environment.
     *        </p>
     *        </note>
     *        <p>
     *        Specify a source bundle in S3 or a commit in an AWS CodeCommit repository (with
     *        <code>SourceBuildInformation</code>), but not both. If neither <code>SourceBundle</code> nor
     *        <code>SourceBuildInformation</code> are provided, Elastic Beanstalk uses a sample application.
     */

    public void setSourceBundle(S3Location sourceBundle) {
        this.sourceBundle = sourceBundle;
    }

    /**
     * <p>
     * The Amazon S3 bucket and key that identify the location of the source bundle for this version.
     * </p>
     * <note>
     * <p>
     * The Amazon S3 bucket must be in the same region as the environment.
     * </p>
     * </note>
     * <p>
     * Specify a source bundle in S3 or a commit in an AWS CodeCommit repository (with
     * <code>SourceBuildInformation</code>), but not both. If neither <code>SourceBundle</code> nor
     * <code>SourceBuildInformation</code> are provided, Elastic Beanstalk uses a sample application.
     * </p>
     * 
     * @return The Amazon S3 bucket and key that identify the location of the source bundle for this version.</p> <note>
     *         <p>
     *         The Amazon S3 bucket must be in the same region as the environment.
     *         </p>
     *         </note>
     *         <p>
     *         Specify a source bundle in S3 or a commit in an AWS CodeCommit repository (with
     *         <code>SourceBuildInformation</code>), but not both. If neither <code>SourceBundle</code> nor
     *         <code>SourceBuildInformation</code> are provided, Elastic Beanstalk uses a sample application.
     */

    public S3Location getSourceBundle() {
        return this.sourceBundle;
    }

    /**
     * <p>
     * The Amazon S3 bucket and key that identify the location of the source bundle for this version.
     * </p>
     * <note>
     * <p>
     * The Amazon S3 bucket must be in the same region as the environment.
     * </p>
     * </note>
     * <p>
     * Specify a source bundle in S3 or a commit in an AWS CodeCommit repository (with
     * <code>SourceBuildInformation</code>), but not both. If neither <code>SourceBundle</code> nor
     * <code>SourceBuildInformation</code> are provided, Elastic Beanstalk uses a sample application.
     * </p>
     * 
     * @param sourceBundle
     *        The Amazon S3 bucket and key that identify the location of the source bundle for this version.</p> <note>
     *        <p>
     *        The Amazon S3 bucket must be in the same region as the environment.
     *        </p>
     *        </note>
     *        <p>
     *        Specify a source bundle in S3 or a commit in an AWS CodeCommit repository (with
     *        <code>SourceBuildInformation</code>), but not both. If neither <code>SourceBundle</code> nor
     *        <code>SourceBuildInformation</code> are provided, Elastic Beanstalk uses a sample application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withSourceBundle(S3Location sourceBundle) {
        setSourceBundle(sourceBundle);
        return this;
    }

    /**
     * <p>
     * Settings for an AWS CodeBuild build.
     * </p>
     * 
     * @param buildConfiguration
     *        Settings for an AWS CodeBuild build.
     */

    public void setBuildConfiguration(BuildConfiguration buildConfiguration) {
        this.buildConfiguration = buildConfiguration;
    }

    /**
     * <p>
     * Settings for an AWS CodeBuild build.
     * </p>
     * 
     * @return Settings for an AWS CodeBuild build.
     */

    public BuildConfiguration getBuildConfiguration() {
        return this.buildConfiguration;
    }

    /**
     * <p>
     * Settings for an AWS CodeBuild build.
     * </p>
     * 
     * @param buildConfiguration
     *        Settings for an AWS CodeBuild build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withBuildConfiguration(BuildConfiguration buildConfiguration) {
        setBuildConfiguration(buildConfiguration);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to create an application with the specified name if it doesn't already exist.
     * </p>
     * 
     * @param autoCreateApplication
     *        Set to <code>true</code> to create an application with the specified name if it doesn't already exist.
     */

    public void setAutoCreateApplication(Boolean autoCreateApplication) {
        this.autoCreateApplication = autoCreateApplication;
    }

    /**
     * <p>
     * Set to <code>true</code> to create an application with the specified name if it doesn't already exist.
     * </p>
     * 
     * @return Set to <code>true</code> to create an application with the specified name if it doesn't already exist.
     */

    public Boolean getAutoCreateApplication() {
        return this.autoCreateApplication;
    }

    /**
     * <p>
     * Set to <code>true</code> to create an application with the specified name if it doesn't already exist.
     * </p>
     * 
     * @param autoCreateApplication
     *        Set to <code>true</code> to create an application with the specified name if it doesn't already exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withAutoCreateApplication(Boolean autoCreateApplication) {
        setAutoCreateApplication(autoCreateApplication);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to create an application with the specified name if it doesn't already exist.
     * </p>
     * 
     * @return Set to <code>true</code> to create an application with the specified name if it doesn't already exist.
     */

    public Boolean isAutoCreateApplication() {
        return this.autoCreateApplication;
    }

    /**
     * <p>
     * Pre-processes and validates the environment manifest (<code>env.yaml</code>) and configuration files (
     * <code>*.config</code> files in the <code>.ebextensions</code> folder) in the source bundle. Validating
     * configuration files can identify issues prior to deploying the application version to an environment.
     * </p>
     * <p>
     * You must turn processing on for application versions that you create using AWS CodeBuild or AWS CodeCommit. For
     * application versions built from a source bundle in Amazon S3, processing is optional.
     * </p>
     * <note>
     * <p>
     * The <code>Process</code> option validates Elastic Beanstalk configuration files. It doesn't validate your
     * application's configuration files, like proxy server or Docker configuration.
     * </p>
     * </note>
     * 
     * @param process
     *        Pre-processes and validates the environment manifest (<code>env.yaml</code>) and configuration files (
     *        <code>*.config</code> files in the <code>.ebextensions</code> folder) in the source bundle. Validating
     *        configuration files can identify issues prior to deploying the application version to an environment.</p>
     *        <p>
     *        You must turn processing on for application versions that you create using AWS CodeBuild or AWS
     *        CodeCommit. For application versions built from a source bundle in Amazon S3, processing is optional.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>Process</code> option validates Elastic Beanstalk configuration files. It doesn't validate your
     *        application's configuration files, like proxy server or Docker configuration.
     *        </p>
     */

    public void setProcess(Boolean process) {
        this.process = process;
    }

    /**
     * <p>
     * Pre-processes and validates the environment manifest (<code>env.yaml</code>) and configuration files (
     * <code>*.config</code> files in the <code>.ebextensions</code> folder) in the source bundle. Validating
     * configuration files can identify issues prior to deploying the application version to an environment.
     * </p>
     * <p>
     * You must turn processing on for application versions that you create using AWS CodeBuild or AWS CodeCommit. For
     * application versions built from a source bundle in Amazon S3, processing is optional.
     * </p>
     * <note>
     * <p>
     * The <code>Process</code> option validates Elastic Beanstalk configuration files. It doesn't validate your
     * application's configuration files, like proxy server or Docker configuration.
     * </p>
     * </note>
     * 
     * @return Pre-processes and validates the environment manifest (<code>env.yaml</code>) and configuration files (
     *         <code>*.config</code> files in the <code>.ebextensions</code> folder) in the source bundle. Validating
     *         configuration files can identify issues prior to deploying the application version to an environment.</p>
     *         <p>
     *         You must turn processing on for application versions that you create using AWS CodeBuild or AWS
     *         CodeCommit. For application versions built from a source bundle in Amazon S3, processing is optional.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>Process</code> option validates Elastic Beanstalk configuration files. It doesn't validate your
     *         application's configuration files, like proxy server or Docker configuration.
     *         </p>
     */

    public Boolean getProcess() {
        return this.process;
    }

    /**
     * <p>
     * Pre-processes and validates the environment manifest (<code>env.yaml</code>) and configuration files (
     * <code>*.config</code> files in the <code>.ebextensions</code> folder) in the source bundle. Validating
     * configuration files can identify issues prior to deploying the application version to an environment.
     * </p>
     * <p>
     * You must turn processing on for application versions that you create using AWS CodeBuild or AWS CodeCommit. For
     * application versions built from a source bundle in Amazon S3, processing is optional.
     * </p>
     * <note>
     * <p>
     * The <code>Process</code> option validates Elastic Beanstalk configuration files. It doesn't validate your
     * application's configuration files, like proxy server or Docker configuration.
     * </p>
     * </note>
     * 
     * @param process
     *        Pre-processes and validates the environment manifest (<code>env.yaml</code>) and configuration files (
     *        <code>*.config</code> files in the <code>.ebextensions</code> folder) in the source bundle. Validating
     *        configuration files can identify issues prior to deploying the application version to an environment.</p>
     *        <p>
     *        You must turn processing on for application versions that you create using AWS CodeBuild or AWS
     *        CodeCommit. For application versions built from a source bundle in Amazon S3, processing is optional.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>Process</code> option validates Elastic Beanstalk configuration files. It doesn't validate your
     *        application's configuration files, like proxy server or Docker configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withProcess(Boolean process) {
        setProcess(process);
        return this;
    }

    /**
     * <p>
     * Pre-processes and validates the environment manifest (<code>env.yaml</code>) and configuration files (
     * <code>*.config</code> files in the <code>.ebextensions</code> folder) in the source bundle. Validating
     * configuration files can identify issues prior to deploying the application version to an environment.
     * </p>
     * <p>
     * You must turn processing on for application versions that you create using AWS CodeBuild or AWS CodeCommit. For
     * application versions built from a source bundle in Amazon S3, processing is optional.
     * </p>
     * <note>
     * <p>
     * The <code>Process</code> option validates Elastic Beanstalk configuration files. It doesn't validate your
     * application's configuration files, like proxy server or Docker configuration.
     * </p>
     * </note>
     * 
     * @return Pre-processes and validates the environment manifest (<code>env.yaml</code>) and configuration files (
     *         <code>*.config</code> files in the <code>.ebextensions</code> folder) in the source bundle. Validating
     *         configuration files can identify issues prior to deploying the application version to an environment.</p>
     *         <p>
     *         You must turn processing on for application versions that you create using AWS CodeBuild or AWS
     *         CodeCommit. For application versions built from a source bundle in Amazon S3, processing is optional.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>Process</code> option validates Elastic Beanstalk configuration files. It doesn't validate your
     *         application's configuration files, like proxy server or Docker configuration.
     *         </p>
     */

    public Boolean isProcess() {
        return this.process;
    }

    /**
     * <p>
     * Specifies the tags applied to the application version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application version. Environments that use the application
     * version don't inherit the tags.
     * </p>
     * 
     * @return Specifies the tags applied to the application version.</p>
     *         <p>
     *         Elastic Beanstalk applies these tags only to the application version. Environments that use the
     *         application version don't inherit the tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Specifies the tags applied to the application version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application version. Environments that use the application
     * version don't inherit the tags.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to the application version.</p>
     *        <p>
     *        Elastic Beanstalk applies these tags only to the application version. Environments that use the
     *        application version don't inherit the tags.
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
     * Specifies the tags applied to the application version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application version. Environments that use the application
     * version don't inherit the tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to the application version.</p>
     *        <p>
     *        Elastic Beanstalk applies these tags only to the application version. Environments that use the
     *        application version don't inherit the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withTags(Tag... tags) {
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
     * Specifies the tags applied to the application version.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application version. Environments that use the application
     * version don't inherit the tags.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to the application version.</p>
     *        <p>
     *        Elastic Beanstalk applies these tags only to the application version. Environments that use the
     *        application version don't inherit the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getVersionLabel() != null)
            sb.append("VersionLabel: ").append(getVersionLabel()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSourceBuildInformation() != null)
            sb.append("SourceBuildInformation: ").append(getSourceBuildInformation()).append(",");
        if (getSourceBundle() != null)
            sb.append("SourceBundle: ").append(getSourceBundle()).append(",");
        if (getBuildConfiguration() != null)
            sb.append("BuildConfiguration: ").append(getBuildConfiguration()).append(",");
        if (getAutoCreateApplication() != null)
            sb.append("AutoCreateApplication: ").append(getAutoCreateApplication()).append(",");
        if (getProcess() != null)
            sb.append("Process: ").append(getProcess()).append(",");
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

        if (obj instanceof CreateApplicationVersionRequest == false)
            return false;
        CreateApplicationVersionRequest other = (CreateApplicationVersionRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSourceBuildInformation() == null ^ this.getSourceBuildInformation() == null)
            return false;
        if (other.getSourceBuildInformation() != null && other.getSourceBuildInformation().equals(this.getSourceBuildInformation()) == false)
            return false;
        if (other.getSourceBundle() == null ^ this.getSourceBundle() == null)
            return false;
        if (other.getSourceBundle() != null && other.getSourceBundle().equals(this.getSourceBundle()) == false)
            return false;
        if (other.getBuildConfiguration() == null ^ this.getBuildConfiguration() == null)
            return false;
        if (other.getBuildConfiguration() != null && other.getBuildConfiguration().equals(this.getBuildConfiguration()) == false)
            return false;
        if (other.getAutoCreateApplication() == null ^ this.getAutoCreateApplication() == null)
            return false;
        if (other.getAutoCreateApplication() != null && other.getAutoCreateApplication().equals(this.getAutoCreateApplication()) == false)
            return false;
        if (other.getProcess() == null ^ this.getProcess() == null)
            return false;
        if (other.getProcess() != null && other.getProcess().equals(this.getProcess()) == false)
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

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSourceBuildInformation() == null) ? 0 : getSourceBuildInformation().hashCode());
        hashCode = prime * hashCode + ((getSourceBundle() == null) ? 0 : getSourceBundle().hashCode());
        hashCode = prime * hashCode + ((getBuildConfiguration() == null) ? 0 : getBuildConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAutoCreateApplication() == null) ? 0 : getAutoCreateApplication().hashCode());
        hashCode = prime * hashCode + ((getProcess() == null) ? 0 : getProcess().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationVersionRequest clone() {
        return (CreateApplicationVersionRequest) super.clone();
    }

}
