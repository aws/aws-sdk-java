/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
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

    private SourceBuildInformation sourceBuildInformation;
    /**
     * <p>
     * The Amazon S3 bucket and key that identify the location of the source bundle for this version.
     * </p>
     * <p>
     * If data found at the Amazon S3 location exceeds the maximum allowed source bundle size, AWS Elastic Beanstalk
     * returns an <code>InvalidParameterValue</code> error. The maximum size allowed is 512 MB.
     * </p>
     * <p>
     * Default: If not specified, AWS Elastic Beanstalk uses a sample application. If only partially specified (for
     * example, a bucket is provided but not the key) or if no data is found at the Amazon S3 location, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterCombination</code> error.
     * </p>
     */
    private S3Location sourceBundle;
    /**
     * <p>
     * Determines how the system behaves if the specified application for this version does not already exist:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> : Automatically creates the specified application for this release if it does not already
     * exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> : Throws an <code>InvalidParameterValue</code> if the specified application for this release
     * does not already exist.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean autoCreateApplication;
    /**
     * <p>
     * Preprocesses and validates the environment manifest and configuration files in the source bundle. Validating
     * configuration files can identify issues prior to deploying the application version to an environment.
     * </p>
     */
    private Boolean process;

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
     * @param sourceBuildInformation
     */

    public void setSourceBuildInformation(SourceBuildInformation sourceBuildInformation) {
        this.sourceBuildInformation = sourceBuildInformation;
    }

    /**
     * @return
     */

    public SourceBuildInformation getSourceBuildInformation() {
        return this.sourceBuildInformation;
    }

    /**
     * @param sourceBuildInformation
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
     * <p>
     * If data found at the Amazon S3 location exceeds the maximum allowed source bundle size, AWS Elastic Beanstalk
     * returns an <code>InvalidParameterValue</code> error. The maximum size allowed is 512 MB.
     * </p>
     * <p>
     * Default: If not specified, AWS Elastic Beanstalk uses a sample application. If only partially specified (for
     * example, a bucket is provided but not the key) or if no data is found at the Amazon S3 location, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterCombination</code> error.
     * </p>
     * 
     * @param sourceBundle
     *        The Amazon S3 bucket and key that identify the location of the source bundle for this version.</p>
     *        <p>
     *        If data found at the Amazon S3 location exceeds the maximum allowed source bundle size, AWS Elastic
     *        Beanstalk returns an <code>InvalidParameterValue</code> error. The maximum size allowed is 512 MB.
     *        </p>
     *        <p>
     *        Default: If not specified, AWS Elastic Beanstalk uses a sample application. If only partially specified
     *        (for example, a bucket is provided but not the key) or if no data is found at the Amazon S3 location, AWS
     *        Elastic Beanstalk returns an <code>InvalidParameterCombination</code> error.
     */

    public void setSourceBundle(S3Location sourceBundle) {
        this.sourceBundle = sourceBundle;
    }

    /**
     * <p>
     * The Amazon S3 bucket and key that identify the location of the source bundle for this version.
     * </p>
     * <p>
     * If data found at the Amazon S3 location exceeds the maximum allowed source bundle size, AWS Elastic Beanstalk
     * returns an <code>InvalidParameterValue</code> error. The maximum size allowed is 512 MB.
     * </p>
     * <p>
     * Default: If not specified, AWS Elastic Beanstalk uses a sample application. If only partially specified (for
     * example, a bucket is provided but not the key) or if no data is found at the Amazon S3 location, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterCombination</code> error.
     * </p>
     * 
     * @return The Amazon S3 bucket and key that identify the location of the source bundle for this version.</p>
     *         <p>
     *         If data found at the Amazon S3 location exceeds the maximum allowed source bundle size, AWS Elastic
     *         Beanstalk returns an <code>InvalidParameterValue</code> error. The maximum size allowed is 512 MB.
     *         </p>
     *         <p>
     *         Default: If not specified, AWS Elastic Beanstalk uses a sample application. If only partially specified
     *         (for example, a bucket is provided but not the key) or if no data is found at the Amazon S3 location, AWS
     *         Elastic Beanstalk returns an <code>InvalidParameterCombination</code> error.
     */

    public S3Location getSourceBundle() {
        return this.sourceBundle;
    }

    /**
     * <p>
     * The Amazon S3 bucket and key that identify the location of the source bundle for this version.
     * </p>
     * <p>
     * If data found at the Amazon S3 location exceeds the maximum allowed source bundle size, AWS Elastic Beanstalk
     * returns an <code>InvalidParameterValue</code> error. The maximum size allowed is 512 MB.
     * </p>
     * <p>
     * Default: If not specified, AWS Elastic Beanstalk uses a sample application. If only partially specified (for
     * example, a bucket is provided but not the key) or if no data is found at the Amazon S3 location, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterCombination</code> error.
     * </p>
     * 
     * @param sourceBundle
     *        The Amazon S3 bucket and key that identify the location of the source bundle for this version.</p>
     *        <p>
     *        If data found at the Amazon S3 location exceeds the maximum allowed source bundle size, AWS Elastic
     *        Beanstalk returns an <code>InvalidParameterValue</code> error. The maximum size allowed is 512 MB.
     *        </p>
     *        <p>
     *        Default: If not specified, AWS Elastic Beanstalk uses a sample application. If only partially specified
     *        (for example, a bucket is provided but not the key) or if no data is found at the Amazon S3 location, AWS
     *        Elastic Beanstalk returns an <code>InvalidParameterCombination</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withSourceBundle(S3Location sourceBundle) {
        setSourceBundle(sourceBundle);
        return this;
    }

    /**
     * <p>
     * Determines how the system behaves if the specified application for this version does not already exist:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> : Automatically creates the specified application for this release if it does not already
     * exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> : Throws an <code>InvalidParameterValue</code> if the specified application for this release
     * does not already exist.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param autoCreateApplication
     *        Determines how the system behaves if the specified application for this version does not already
     *        exist:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code> : Automatically creates the specified application for this release if it does not
     *        already exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code> : Throws an <code>InvalidParameterValue</code> if the specified application for this
     *        release does not already exist.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>false</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     */

    public void setAutoCreateApplication(Boolean autoCreateApplication) {
        this.autoCreateApplication = autoCreateApplication;
    }

    /**
     * <p>
     * Determines how the system behaves if the specified application for this version does not already exist:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> : Automatically creates the specified application for this release if it does not already
     * exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> : Throws an <code>InvalidParameterValue</code> if the specified application for this release
     * does not already exist.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return Determines how the system behaves if the specified application for this version does not already
     *         exist:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code> : Automatically creates the specified application for this release if it does not
     *         already exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code> : Throws an <code>InvalidParameterValue</code> if the specified application for this
     *         release does not already exist.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean getAutoCreateApplication() {
        return this.autoCreateApplication;
    }

    /**
     * <p>
     * Determines how the system behaves if the specified application for this version does not already exist:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> : Automatically creates the specified application for this release if it does not already
     * exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> : Throws an <code>InvalidParameterValue</code> if the specified application for this release
     * does not already exist.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param autoCreateApplication
     *        Determines how the system behaves if the specified application for this version does not already
     *        exist:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code> : Automatically creates the specified application for this release if it does not
     *        already exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code> : Throws an <code>InvalidParameterValue</code> if the specified application for this
     *        release does not already exist.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>false</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withAutoCreateApplication(Boolean autoCreateApplication) {
        setAutoCreateApplication(autoCreateApplication);
        return this;
    }

    /**
     * <p>
     * Determines how the system behaves if the specified application for this version does not already exist:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code> : Automatically creates the specified application for this release if it does not already
     * exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code> : Throws an <code>InvalidParameterValue</code> if the specified application for this release
     * does not already exist.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return Determines how the system behaves if the specified application for this version does not already
     *         exist:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code> : Automatically creates the specified application for this release if it does not
     *         already exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code> : Throws an <code>InvalidParameterValue</code> if the specified application for this
     *         release does not already exist.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean isAutoCreateApplication() {
        return this.autoCreateApplication;
    }

    /**
     * <p>
     * Preprocesses and validates the environment manifest and configuration files in the source bundle. Validating
     * configuration files can identify issues prior to deploying the application version to an environment.
     * </p>
     * 
     * @param process
     *        Preprocesses and validates the environment manifest and configuration files in the source bundle.
     *        Validating configuration files can identify issues prior to deploying the application version to an
     *        environment.
     */

    public void setProcess(Boolean process) {
        this.process = process;
    }

    /**
     * <p>
     * Preprocesses and validates the environment manifest and configuration files in the source bundle. Validating
     * configuration files can identify issues prior to deploying the application version to an environment.
     * </p>
     * 
     * @return Preprocesses and validates the environment manifest and configuration files in the source bundle.
     *         Validating configuration files can identify issues prior to deploying the application version to an
     *         environment.
     */

    public Boolean getProcess() {
        return this.process;
    }

    /**
     * <p>
     * Preprocesses and validates the environment manifest and configuration files in the source bundle. Validating
     * configuration files can identify issues prior to deploying the application version to an environment.
     * </p>
     * 
     * @param process
     *        Preprocesses and validates the environment manifest and configuration files in the source bundle.
     *        Validating configuration files can identify issues prior to deploying the application version to an
     *        environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withProcess(Boolean process) {
        setProcess(process);
        return this;
    }

    /**
     * <p>
     * Preprocesses and validates the environment manifest and configuration files in the source bundle. Validating
     * configuration files can identify issues prior to deploying the application version to an environment.
     * </p>
     * 
     * @return Preprocesses and validates the environment manifest and configuration files in the source bundle.
     *         Validating configuration files can identify issues prior to deploying the application version to an
     *         environment.
     */

    public Boolean isProcess() {
        return this.process;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getVersionLabel() != null)
            sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSourceBuildInformation() != null)
            sb.append("SourceBuildInformation: " + getSourceBuildInformation() + ",");
        if (getSourceBundle() != null)
            sb.append("SourceBundle: " + getSourceBundle() + ",");
        if (getAutoCreateApplication() != null)
            sb.append("AutoCreateApplication: " + getAutoCreateApplication() + ",");
        if (getProcess() != null)
            sb.append("Process: " + getProcess());
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
        if (other.getAutoCreateApplication() == null ^ this.getAutoCreateApplication() == null)
            return false;
        if (other.getAutoCreateApplication() != null && other.getAutoCreateApplication().equals(this.getAutoCreateApplication()) == false)
            return false;
        if (other.getProcess() == null ^ this.getProcess() == null)
            return false;
        if (other.getProcess() != null && other.getProcess().equals(this.getProcess()) == false)
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
        hashCode = prime * hashCode + ((getAutoCreateApplication() == null) ? 0 : getAutoCreateApplication().hashCode());
        hashCode = prime * hashCode + ((getProcess() == null) ? 0 : getProcess().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationVersionRequest clone() {
        return (CreateApplicationVersionRequest) super.clone();
    }
}
