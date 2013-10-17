/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#createApplicationVersion(CreateApplicationVersionRequest) CreateApplicationVersion operation}.
 * <p>
 * Creates an application version for the specified application.
 * </p>
 * <p>
 * <b>NOTE:</b>Once you create an application version with a specified Amazon S3 bucket and key location, you cannot change that Amazon S3 location. If
 * you change the Amazon S3 location, you receive an exception when you attempt to launch an environment from the application version.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#createApplicationVersion(CreateApplicationVersionRequest)
 */
public class CreateApplicationVersionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the application. If no application is found with this
     * name, and <code>AutoCreateApplication</code> is <code>false</code>,
     * returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * A label identifying this version. <p>Constraint: Must be unique per
     * application. If an application version already exists with this label
     * for the specified application, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * Describes this version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * The Amazon S3 bucket and key that identify the location of the source
     * bundle for this version. <p> If data found at the Amazon S3 location
     * exceeds the maximum allowed source bundle size, AWS Elastic Beanstalk
     * returns an <code>InvalidParameterValue</code> error. <p>Default: If
     * not specified, AWS Elastic Beanstalk uses a sample application. If
     * only partially specified (for example, a bucket is provided but not
     * the key) or if no data is found at the Amazon S3 location, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterCombination</code> error.
     */
    private S3Location sourceBundle;

    /**
     * Determines how the system behaves if the specified application for
     * this version does not already exist: <enumValues> <value name="true">
     * <p> <code>true</code>: Automatically creates the specified application
     * for this version if it does not already exist. </value> <value
     * name="false"> <p> <code>false</code>: Returns an
     * <code>InvalidParameterValue</code> if the specified application for
     * this version does not already exist. </value> </enumValues> <ul> <li>
     * <code>true</code> : Automatically creates the specified application
     * for this release if it does not already exist. </li> <li>
     * <code>false</code> : Throws an <code>InvalidParameterValue</code> if
     * the specified application for this release does not already exist.
     * </li> </ul> <p> Default: <code>false</code> <p> Valid Values:
     * <code>true</code> | <code>false</code>
     */
    private Boolean autoCreateApplication;

    /**
     * Default constructor for a new CreateApplicationVersionRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateApplicationVersionRequest() {}
    
    /**
     * Constructs a new CreateApplicationVersionRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param applicationName The name of the application. If no application
     * is found with this name, and <code>AutoCreateApplication</code> is
     * <code>false</code>, returns an <code>InvalidParameterValue</code>
     * error.
     * @param versionLabel A label identifying this version. <p>Constraint:
     * Must be unique per application. If an application version already
     * exists with this label for the specified application, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterValue</code> error.
     */
    public CreateApplicationVersionRequest(String applicationName, String versionLabel) {
        setApplicationName(applicationName);
        setVersionLabel(versionLabel);
    }

    /**
     * The name of the application. If no application is found with this
     * name, and <code>AutoCreateApplication</code> is <code>false</code>,
     * returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application. If no application is found with this
     *         name, and <code>AutoCreateApplication</code> is <code>false</code>,
     *         returns an <code>InvalidParameterValue</code> error.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application. If no application is found with this
     * name, and <code>AutoCreateApplication</code> is <code>false</code>,
     * returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application. If no application is found with this
     *         name, and <code>AutoCreateApplication</code> is <code>false</code>,
     *         returns an <code>InvalidParameterValue</code> error.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application. If no application is found with this
     * name, and <code>AutoCreateApplication</code> is <code>false</code>,
     * returns an <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application. If no application is found with this
     *         name, and <code>AutoCreateApplication</code> is <code>false</code>,
     *         returns an <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateApplicationVersionRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * A label identifying this version. <p>Constraint: Must be unique per
     * application. If an application version already exists with this label
     * for the specified application, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return A label identifying this version. <p>Constraint: Must be unique per
     *         application. If an application version already exists with this label
     *         for the specified application, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public String getVersionLabel() {
        return versionLabel;
    }
    
    /**
     * A label identifying this version. <p>Constraint: Must be unique per
     * application. If an application version already exists with this label
     * for the specified application, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel A label identifying this version. <p>Constraint: Must be unique per
     *         application. If an application version already exists with this label
     *         for the specified application, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }
    
    /**
     * A label identifying this version. <p>Constraint: Must be unique per
     * application. If an application version already exists with this label
     * for the specified application, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel A label identifying this version. <p>Constraint: Must be unique per
     *         application. If an application version already exists with this label
     *         for the specified application, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateApplicationVersionRequest withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }

    /**
     * Describes this version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return Describes this version.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Describes this version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description Describes this version.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Describes this version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description Describes this version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateApplicationVersionRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The Amazon S3 bucket and key that identify the location of the source
     * bundle for this version. <p> If data found at the Amazon S3 location
     * exceeds the maximum allowed source bundle size, AWS Elastic Beanstalk
     * returns an <code>InvalidParameterValue</code> error. <p>Default: If
     * not specified, AWS Elastic Beanstalk uses a sample application. If
     * only partially specified (for example, a bucket is provided but not
     * the key) or if no data is found at the Amazon S3 location, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterCombination</code> error.
     *
     * @return The Amazon S3 bucket and key that identify the location of the source
     *         bundle for this version. <p> If data found at the Amazon S3 location
     *         exceeds the maximum allowed source bundle size, AWS Elastic Beanstalk
     *         returns an <code>InvalidParameterValue</code> error. <p>Default: If
     *         not specified, AWS Elastic Beanstalk uses a sample application. If
     *         only partially specified (for example, a bucket is provided but not
     *         the key) or if no data is found at the Amazon S3 location, AWS Elastic
     *         Beanstalk returns an <code>InvalidParameterCombination</code> error.
     */
    public S3Location getSourceBundle() {
        return sourceBundle;
    }
    
    /**
     * The Amazon S3 bucket and key that identify the location of the source
     * bundle for this version. <p> If data found at the Amazon S3 location
     * exceeds the maximum allowed source bundle size, AWS Elastic Beanstalk
     * returns an <code>InvalidParameterValue</code> error. <p>Default: If
     * not specified, AWS Elastic Beanstalk uses a sample application. If
     * only partially specified (for example, a bucket is provided but not
     * the key) or if no data is found at the Amazon S3 location, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterCombination</code> error.
     *
     * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
     *         bundle for this version. <p> If data found at the Amazon S3 location
     *         exceeds the maximum allowed source bundle size, AWS Elastic Beanstalk
     *         returns an <code>InvalidParameterValue</code> error. <p>Default: If
     *         not specified, AWS Elastic Beanstalk uses a sample application. If
     *         only partially specified (for example, a bucket is provided but not
     *         the key) or if no data is found at the Amazon S3 location, AWS Elastic
     *         Beanstalk returns an <code>InvalidParameterCombination</code> error.
     */
    public void setSourceBundle(S3Location sourceBundle) {
        this.sourceBundle = sourceBundle;
    }
    
    /**
     * The Amazon S3 bucket and key that identify the location of the source
     * bundle for this version. <p> If data found at the Amazon S3 location
     * exceeds the maximum allowed source bundle size, AWS Elastic Beanstalk
     * returns an <code>InvalidParameterValue</code> error. <p>Default: If
     * not specified, AWS Elastic Beanstalk uses a sample application. If
     * only partially specified (for example, a bucket is provided but not
     * the key) or if no data is found at the Amazon S3 location, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterCombination</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceBundle The Amazon S3 bucket and key that identify the location of the source
     *         bundle for this version. <p> If data found at the Amazon S3 location
     *         exceeds the maximum allowed source bundle size, AWS Elastic Beanstalk
     *         returns an <code>InvalidParameterValue</code> error. <p>Default: If
     *         not specified, AWS Elastic Beanstalk uses a sample application. If
     *         only partially specified (for example, a bucket is provided but not
     *         the key) or if no data is found at the Amazon S3 location, AWS Elastic
     *         Beanstalk returns an <code>InvalidParameterCombination</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateApplicationVersionRequest withSourceBundle(S3Location sourceBundle) {
        this.sourceBundle = sourceBundle;
        return this;
    }

    /**
     * Determines how the system behaves if the specified application for
     * this version does not already exist: <enumValues> <value name="true">
     * <p> <code>true</code>: Automatically creates the specified application
     * for this version if it does not already exist. </value> <value
     * name="false"> <p> <code>false</code>: Returns an
     * <code>InvalidParameterValue</code> if the specified application for
     * this version does not already exist. </value> </enumValues> <ul> <li>
     * <code>true</code> : Automatically creates the specified application
     * for this release if it does not already exist. </li> <li>
     * <code>false</code> : Throws an <code>InvalidParameterValue</code> if
     * the specified application for this release does not already exist.
     * </li> </ul> <p> Default: <code>false</code> <p> Valid Values:
     * <code>true</code> | <code>false</code>
     *
     * @return Determines how the system behaves if the specified application for
     *         this version does not already exist: <enumValues> <value name="true">
     *         <p> <code>true</code>: Automatically creates the specified application
     *         for this version if it does not already exist. </value> <value
     *         name="false"> <p> <code>false</code>: Returns an
     *         <code>InvalidParameterValue</code> if the specified application for
     *         this version does not already exist. </value> </enumValues> <ul> <li>
     *         <code>true</code> : Automatically creates the specified application
     *         for this release if it does not already exist. </li> <li>
     *         <code>false</code> : Throws an <code>InvalidParameterValue</code> if
     *         the specified application for this release does not already exist.
     *         </li> </ul> <p> Default: <code>false</code> <p> Valid Values:
     *         <code>true</code> | <code>false</code>
     */
    public Boolean isAutoCreateApplication() {
        return autoCreateApplication;
    }
    
    /**
     * Determines how the system behaves if the specified application for
     * this version does not already exist: <enumValues> <value name="true">
     * <p> <code>true</code>: Automatically creates the specified application
     * for this version if it does not already exist. </value> <value
     * name="false"> <p> <code>false</code>: Returns an
     * <code>InvalidParameterValue</code> if the specified application for
     * this version does not already exist. </value> </enumValues> <ul> <li>
     * <code>true</code> : Automatically creates the specified application
     * for this release if it does not already exist. </li> <li>
     * <code>false</code> : Throws an <code>InvalidParameterValue</code> if
     * the specified application for this release does not already exist.
     * </li> </ul> <p> Default: <code>false</code> <p> Valid Values:
     * <code>true</code> | <code>false</code>
     *
     * @param autoCreateApplication Determines how the system behaves if the specified application for
     *         this version does not already exist: <enumValues> <value name="true">
     *         <p> <code>true</code>: Automatically creates the specified application
     *         for this version if it does not already exist. </value> <value
     *         name="false"> <p> <code>false</code>: Returns an
     *         <code>InvalidParameterValue</code> if the specified application for
     *         this version does not already exist. </value> </enumValues> <ul> <li>
     *         <code>true</code> : Automatically creates the specified application
     *         for this release if it does not already exist. </li> <li>
     *         <code>false</code> : Throws an <code>InvalidParameterValue</code> if
     *         the specified application for this release does not already exist.
     *         </li> </ul> <p> Default: <code>false</code> <p> Valid Values:
     *         <code>true</code> | <code>false</code>
     */
    public void setAutoCreateApplication(Boolean autoCreateApplication) {
        this.autoCreateApplication = autoCreateApplication;
    }
    
    /**
     * Determines how the system behaves if the specified application for
     * this version does not already exist: <enumValues> <value name="true">
     * <p> <code>true</code>: Automatically creates the specified application
     * for this version if it does not already exist. </value> <value
     * name="false"> <p> <code>false</code>: Returns an
     * <code>InvalidParameterValue</code> if the specified application for
     * this version does not already exist. </value> </enumValues> <ul> <li>
     * <code>true</code> : Automatically creates the specified application
     * for this release if it does not already exist. </li> <li>
     * <code>false</code> : Throws an <code>InvalidParameterValue</code> if
     * the specified application for this release does not already exist.
     * </li> </ul> <p> Default: <code>false</code> <p> Valid Values:
     * <code>true</code> | <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoCreateApplication Determines how the system behaves if the specified application for
     *         this version does not already exist: <enumValues> <value name="true">
     *         <p> <code>true</code>: Automatically creates the specified application
     *         for this version if it does not already exist. </value> <value
     *         name="false"> <p> <code>false</code>: Returns an
     *         <code>InvalidParameterValue</code> if the specified application for
     *         this version does not already exist. </value> </enumValues> <ul> <li>
     *         <code>true</code> : Automatically creates the specified application
     *         for this release if it does not already exist. </li> <li>
     *         <code>false</code> : Throws an <code>InvalidParameterValue</code> if
     *         the specified application for this release does not already exist.
     *         </li> </ul> <p> Default: <code>false</code> <p> Valid Values:
     *         <code>true</code> | <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateApplicationVersionRequest withAutoCreateApplication(Boolean autoCreateApplication) {
        this.autoCreateApplication = autoCreateApplication;
        return this;
    }

    /**
     * Determines how the system behaves if the specified application for
     * this version does not already exist: <enumValues> <value name="true">
     * <p> <code>true</code>: Automatically creates the specified application
     * for this version if it does not already exist. </value> <value
     * name="false"> <p> <code>false</code>: Returns an
     * <code>InvalidParameterValue</code> if the specified application for
     * this version does not already exist. </value> </enumValues> <ul> <li>
     * <code>true</code> : Automatically creates the specified application
     * for this release if it does not already exist. </li> <li>
     * <code>false</code> : Throws an <code>InvalidParameterValue</code> if
     * the specified application for this release does not already exist.
     * </li> </ul> <p> Default: <code>false</code> <p> Valid Values:
     * <code>true</code> | <code>false</code>
     *
     * @return Determines how the system behaves if the specified application for
     *         this version does not already exist: <enumValues> <value name="true">
     *         <p> <code>true</code>: Automatically creates the specified application
     *         for this version if it does not already exist. </value> <value
     *         name="false"> <p> <code>false</code>: Returns an
     *         <code>InvalidParameterValue</code> if the specified application for
     *         this version does not already exist. </value> </enumValues> <ul> <li>
     *         <code>true</code> : Automatically creates the specified application
     *         for this release if it does not already exist. </li> <li>
     *         <code>false</code> : Throws an <code>InvalidParameterValue</code> if
     *         the specified application for this release does not already exist.
     *         </li> </ul> <p> Default: <code>false</code> <p> Valid Values:
     *         <code>true</code> | <code>false</code>
     */
    public Boolean getAutoCreateApplication() {
        return autoCreateApplication;
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
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getVersionLabel() != null) sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getSourceBundle() != null) sb.append("SourceBundle: " + getSourceBundle() + ",");
        if (isAutoCreateApplication() != null) sb.append("AutoCreateApplication: " + isAutoCreateApplication() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getSourceBundle() == null) ? 0 : getSourceBundle().hashCode()); 
        hashCode = prime * hashCode + ((isAutoCreateApplication() == null) ? 0 : isAutoCreateApplication().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateApplicationVersionRequest == false) return false;
        CreateApplicationVersionRequest other = (CreateApplicationVersionRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null) return false;
        if (other.getVersionLabel() != null && other.getVersionLabel().equals(this.getVersionLabel()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getSourceBundle() == null ^ this.getSourceBundle() == null) return false;
        if (other.getSourceBundle() != null && other.getSourceBundle().equals(this.getSourceBundle()) == false) return false; 
        if (other.isAutoCreateApplication() == null ^ this.isAutoCreateApplication() == null) return false;
        if (other.isAutoCreateApplication() != null && other.isAutoCreateApplication().equals(this.isAutoCreateApplication()) == false) return false; 
        return true;
    }
    
}
    