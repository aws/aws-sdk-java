/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes the properties of an environment.
 * </p>
 */
public class TerminateEnvironmentResult {

    /**
     * The name of this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     */
    private String environmentName;

    /**
     * The ID of this environment.
     */
    private String environmentId;

    /**
     * The name of the application associated with this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The application version deployed in this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * The name of the <code>SolutionStack</code> deployed with this
     * environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private String solutionStackName;

    /**
     * The name of the configuration template used to originally launch this
     * environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * Describes this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * The URL to the LoadBalancer for this environment.
     */
    private String endpointURL;

    /**
     * The URL to the CNAME for this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String cNAME;

    /**
     * The creation date for this environment.
     */
    private java.util.Date dateCreated;

    /**
     * The last modified date for this environment.
     */
    private java.util.Date dateUpdated;

    /**
     * The current operational status of the environment: <ul> <li>
     * <code>Launching</code>: Environment is in the process of initial
     * deployment. </li> <li> <code>Updating</code>: Environment is in the
     * process of updating its configuration settings or application version.
     * </li> <li> <code>Ready</code>: Environment is available to have an
     * action performed on it, such as update or terminate. </li> <li>
     * <code>Terminating</code>: Environment is in the shut-down process.
     * </li> <li> <code>Terminated</code>: Environment is not running. </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Launching, Updating, Ready, Terminating, Terminated
     */
    private String status;

    /**
     * Describes the health status of the environment. AWS Elastic Beanstalk
     * indicates the failure levels for a running environment: <enumValues>
     * <value name="Red"> <p> <code>Red</code> : Indicates the environment is
     * not working. </value> <value name="Yellow"> <p> <code>Yellow</code>:
     * Indicates that something is wrong, the application might not be
     * available, but the instances appear running. </value> <value
     * name="Green"> <p> <code>Green</code>: Indicates the environment is
     * healthy and fully functional. </value> </enumValues> <ul> <li>
     * <code>Red</code>: Indicates the environment is not responsive. Occurs
     * when three or more consecutive failures occur for an environment.
     * </li> <li> <code>Yellow</code>: Indicates that something is wrong.
     * Occurs when two consecutive failures occur for an environment. </li>
     * <li> <code>Green</code>: Indicates the environment is healthy and
     * fully functional. </li> <li> <code>Grey</code>: Default health for a
     * new environment. The environment is not fully launched and health
     * checks have not started or health checks are suspended during an
     * <code>UpdateEnvironment</code> or <code>RestartEnvironement</code>
     * request. </li> </ul> <p> Default: <code>Grey</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Green, Yellow, Red, Grey
     */
    private String health;

    /**
     * The description of the AWS resources used by this environment.
     */
    private EnvironmentResourcesDescription resources;

    /**
     * The name of this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @return The name of this environment.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    
    /**
     * The name of this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of this environment.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    /**
     * The name of this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateEnvironmentResult withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    
    
    /**
     * The ID of this environment.
     *
     * @return The ID of this environment.
     */
    public String getEnvironmentId() {
        return environmentId;
    }
    
    /**
     * The ID of this environment.
     *
     * @param environmentId The ID of this environment.
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }
    
    /**
     * The ID of this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environmentId The ID of this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateEnvironmentResult withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    
    
    /**
     * The name of the application associated with this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application associated with this environment.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application associated with this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application associated with this environment.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application associated with this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application associated with this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateEnvironmentResult withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    
    
    /**
     * The application version deployed in this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The application version deployed in this environment.
     */
    public String getVersionLabel() {
        return versionLabel;
    }
    
    /**
     * The application version deployed in this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel The application version deployed in this environment.
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }
    
    /**
     * The application version deployed in this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel The application version deployed in this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateEnvironmentResult withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }
    
    
    /**
     * The name of the <code>SolutionStack</code> deployed with this
     * environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return The name of the <code>SolutionStack</code> deployed with this
     *         environment.
     */
    public String getSolutionStackName() {
        return solutionStackName;
    }
    
    /**
     * The name of the <code>SolutionStack</code> deployed with this
     * environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param solutionStackName The name of the <code>SolutionStack</code> deployed with this
     *         environment.
     */
    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }
    
    /**
     * The name of the <code>SolutionStack</code> deployed with this
     * environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param solutionStackName The name of the <code>SolutionStack</code> deployed with this
     *         environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateEnvironmentResult withSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
        return this;
    }
    
    
    /**
     * The name of the configuration template used to originally launch this
     * environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the configuration template used to originally launch this
     *         environment.
     */
    public String getTemplateName() {
        return templateName;
    }
    
    /**
     * The name of the configuration template used to originally launch this
     * environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration template used to originally launch this
     *         environment.
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    
    /**
     * The name of the configuration template used to originally launch this
     * environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration template used to originally launch this
     *         environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateEnvironmentResult withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    
    
    /**
     * Describes this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return Describes this environment.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Describes this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description Describes this environment.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Describes this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description Describes this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateEnvironmentResult withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * The URL to the LoadBalancer for this environment.
     *
     * @return The URL to the LoadBalancer for this environment.
     */
    public String getEndpointURL() {
        return endpointURL;
    }
    
    /**
     * The URL to the LoadBalancer for this environment.
     *
     * @param endpointURL The URL to the LoadBalancer for this environment.
     */
    public void setEndpointURL(String endpointURL) {
        this.endpointURL = endpointURL;
    }
    
    /**
     * The URL to the LoadBalancer for this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endpointURL The URL to the LoadBalancer for this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateEnvironmentResult withEndpointURL(String endpointURL) {
        this.endpointURL = endpointURL;
        return this;
    }
    
    
    /**
     * The URL to the CNAME for this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The URL to the CNAME for this environment.
     */
    public String getCNAME() {
        return cNAME;
    }
    
    /**
     * The URL to the CNAME for this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param cNAME The URL to the CNAME for this environment.
     */
    public void setCNAME(String cNAME) {
        this.cNAME = cNAME;
    }
    
    /**
     * The URL to the CNAME for this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param cNAME The URL to the CNAME for this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateEnvironmentResult withCNAME(String cNAME) {
        this.cNAME = cNAME;
        return this;
    }
    
    
    /**
     * The creation date for this environment.
     *
     * @return The creation date for this environment.
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    
    /**
     * The creation date for this environment.
     *
     * @param dateCreated The creation date for this environment.
     */
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    /**
     * The creation date for this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dateCreated The creation date for this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateEnvironmentResult withDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }
    
    
    /**
     * The last modified date for this environment.
     *
     * @return The last modified date for this environment.
     */
    public java.util.Date getDateUpdated() {
        return dateUpdated;
    }
    
    /**
     * The last modified date for this environment.
     *
     * @param dateUpdated The last modified date for this environment.
     */
    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
    
    /**
     * The last modified date for this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dateUpdated The last modified date for this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateEnvironmentResult withDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }
    
    
    /**
     * The current operational status of the environment: <ul> <li>
     * <code>Launching</code>: Environment is in the process of initial
     * deployment. </li> <li> <code>Updating</code>: Environment is in the
     * process of updating its configuration settings or application version.
     * </li> <li> <code>Ready</code>: Environment is available to have an
     * action performed on it, such as update or terminate. </li> <li>
     * <code>Terminating</code>: Environment is in the shut-down process.
     * </li> <li> <code>Terminated</code>: Environment is not running. </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Launching, Updating, Ready, Terminating, Terminated
     *
     * @return The current operational status of the environment: <ul> <li>
     *         <code>Launching</code>: Environment is in the process of initial
     *         deployment. </li> <li> <code>Updating</code>: Environment is in the
     *         process of updating its configuration settings or application version.
     *         </li> <li> <code>Ready</code>: Environment is available to have an
     *         action performed on it, such as update or terminate. </li> <li>
     *         <code>Terminating</code>: Environment is in the shut-down process.
     *         </li> <li> <code>Terminated</code>: Environment is not running. </li>
     *         </ul>
     *
     * @see EnvironmentStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The current operational status of the environment: <ul> <li>
     * <code>Launching</code>: Environment is in the process of initial
     * deployment. </li> <li> <code>Updating</code>: Environment is in the
     * process of updating its configuration settings or application version.
     * </li> <li> <code>Ready</code>: Environment is available to have an
     * action performed on it, such as update or terminate. </li> <li>
     * <code>Terminating</code>: Environment is in the shut-down process.
     * </li> <li> <code>Terminated</code>: Environment is not running. </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Launching, Updating, Ready, Terminating, Terminated
     *
     * @param status The current operational status of the environment: <ul> <li>
     *         <code>Launching</code>: Environment is in the process of initial
     *         deployment. </li> <li> <code>Updating</code>: Environment is in the
     *         process of updating its configuration settings or application version.
     *         </li> <li> <code>Ready</code>: Environment is available to have an
     *         action performed on it, such as update or terminate. </li> <li>
     *         <code>Terminating</code>: Environment is in the shut-down process.
     *         </li> <li> <code>Terminated</code>: Environment is not running. </li>
     *         </ul>
     *
     * @see EnvironmentStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The current operational status of the environment: <ul> <li>
     * <code>Launching</code>: Environment is in the process of initial
     * deployment. </li> <li> <code>Updating</code>: Environment is in the
     * process of updating its configuration settings or application version.
     * </li> <li> <code>Ready</code>: Environment is available to have an
     * action performed on it, such as update or terminate. </li> <li>
     * <code>Terminating</code>: Environment is in the shut-down process.
     * </li> <li> <code>Terminated</code>: Environment is not running. </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Launching, Updating, Ready, Terminating, Terminated
     *
     * @param status The current operational status of the environment: <ul> <li>
     *         <code>Launching</code>: Environment is in the process of initial
     *         deployment. </li> <li> <code>Updating</code>: Environment is in the
     *         process of updating its configuration settings or application version.
     *         </li> <li> <code>Ready</code>: Environment is available to have an
     *         action performed on it, such as update or terminate. </li> <li>
     *         <code>Terminating</code>: Environment is in the shut-down process.
     *         </li> <li> <code>Terminated</code>: Environment is not running. </li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see EnvironmentStatus
     */
    public TerminateEnvironmentResult withStatus(String status) {
        this.status = status;
        return this;
    }
    
    
    /**
     * Describes the health status of the environment. AWS Elastic Beanstalk
     * indicates the failure levels for a running environment: <enumValues>
     * <value name="Red"> <p> <code>Red</code> : Indicates the environment is
     * not working. </value> <value name="Yellow"> <p> <code>Yellow</code>:
     * Indicates that something is wrong, the application might not be
     * available, but the instances appear running. </value> <value
     * name="Green"> <p> <code>Green</code>: Indicates the environment is
     * healthy and fully functional. </value> </enumValues> <ul> <li>
     * <code>Red</code>: Indicates the environment is not responsive. Occurs
     * when three or more consecutive failures occur for an environment.
     * </li> <li> <code>Yellow</code>: Indicates that something is wrong.
     * Occurs when two consecutive failures occur for an environment. </li>
     * <li> <code>Green</code>: Indicates the environment is healthy and
     * fully functional. </li> <li> <code>Grey</code>: Default health for a
     * new environment. The environment is not fully launched and health
     * checks have not started or health checks are suspended during an
     * <code>UpdateEnvironment</code> or <code>RestartEnvironement</code>
     * request. </li> </ul> <p> Default: <code>Grey</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Green, Yellow, Red, Grey
     *
     * @return Describes the health status of the environment. AWS Elastic Beanstalk
     *         indicates the failure levels for a running environment: <enumValues>
     *         <value name="Red"> <p> <code>Red</code> : Indicates the environment is
     *         not working. </value> <value name="Yellow"> <p> <code>Yellow</code>:
     *         Indicates that something is wrong, the application might not be
     *         available, but the instances appear running. </value> <value
     *         name="Green"> <p> <code>Green</code>: Indicates the environment is
     *         healthy and fully functional. </value> </enumValues> <ul> <li>
     *         <code>Red</code>: Indicates the environment is not responsive. Occurs
     *         when three or more consecutive failures occur for an environment.
     *         </li> <li> <code>Yellow</code>: Indicates that something is wrong.
     *         Occurs when two consecutive failures occur for an environment. </li>
     *         <li> <code>Green</code>: Indicates the environment is healthy and
     *         fully functional. </li> <li> <code>Grey</code>: Default health for a
     *         new environment. The environment is not fully launched and health
     *         checks have not started or health checks are suspended during an
     *         <code>UpdateEnvironment</code> or <code>RestartEnvironement</code>
     *         request. </li> </ul> <p> Default: <code>Grey</code>
     *
     * @see EnvironmentHealth
     */
    public String getHealth() {
        return health;
    }
    
    /**
     * Describes the health status of the environment. AWS Elastic Beanstalk
     * indicates the failure levels for a running environment: <enumValues>
     * <value name="Red"> <p> <code>Red</code> : Indicates the environment is
     * not working. </value> <value name="Yellow"> <p> <code>Yellow</code>:
     * Indicates that something is wrong, the application might not be
     * available, but the instances appear running. </value> <value
     * name="Green"> <p> <code>Green</code>: Indicates the environment is
     * healthy and fully functional. </value> </enumValues> <ul> <li>
     * <code>Red</code>: Indicates the environment is not responsive. Occurs
     * when three or more consecutive failures occur for an environment.
     * </li> <li> <code>Yellow</code>: Indicates that something is wrong.
     * Occurs when two consecutive failures occur for an environment. </li>
     * <li> <code>Green</code>: Indicates the environment is healthy and
     * fully functional. </li> <li> <code>Grey</code>: Default health for a
     * new environment. The environment is not fully launched and health
     * checks have not started or health checks are suspended during an
     * <code>UpdateEnvironment</code> or <code>RestartEnvironement</code>
     * request. </li> </ul> <p> Default: <code>Grey</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Green, Yellow, Red, Grey
     *
     * @param health Describes the health status of the environment. AWS Elastic Beanstalk
     *         indicates the failure levels for a running environment: <enumValues>
     *         <value name="Red"> <p> <code>Red</code> : Indicates the environment is
     *         not working. </value> <value name="Yellow"> <p> <code>Yellow</code>:
     *         Indicates that something is wrong, the application might not be
     *         available, but the instances appear running. </value> <value
     *         name="Green"> <p> <code>Green</code>: Indicates the environment is
     *         healthy and fully functional. </value> </enumValues> <ul> <li>
     *         <code>Red</code>: Indicates the environment is not responsive. Occurs
     *         when three or more consecutive failures occur for an environment.
     *         </li> <li> <code>Yellow</code>: Indicates that something is wrong.
     *         Occurs when two consecutive failures occur for an environment. </li>
     *         <li> <code>Green</code>: Indicates the environment is healthy and
     *         fully functional. </li> <li> <code>Grey</code>: Default health for a
     *         new environment. The environment is not fully launched and health
     *         checks have not started or health checks are suspended during an
     *         <code>UpdateEnvironment</code> or <code>RestartEnvironement</code>
     *         request. </li> </ul> <p> Default: <code>Grey</code>
     *
     * @see EnvironmentHealth
     */
    public void setHealth(String health) {
        this.health = health;
    }
    
    /**
     * Describes the health status of the environment. AWS Elastic Beanstalk
     * indicates the failure levels for a running environment: <enumValues>
     * <value name="Red"> <p> <code>Red</code> : Indicates the environment is
     * not working. </value> <value name="Yellow"> <p> <code>Yellow</code>:
     * Indicates that something is wrong, the application might not be
     * available, but the instances appear running. </value> <value
     * name="Green"> <p> <code>Green</code>: Indicates the environment is
     * healthy and fully functional. </value> </enumValues> <ul> <li>
     * <code>Red</code>: Indicates the environment is not responsive. Occurs
     * when three or more consecutive failures occur for an environment.
     * </li> <li> <code>Yellow</code>: Indicates that something is wrong.
     * Occurs when two consecutive failures occur for an environment. </li>
     * <li> <code>Green</code>: Indicates the environment is healthy and
     * fully functional. </li> <li> <code>Grey</code>: Default health for a
     * new environment. The environment is not fully launched and health
     * checks have not started or health checks are suspended during an
     * <code>UpdateEnvironment</code> or <code>RestartEnvironement</code>
     * request. </li> </ul> <p> Default: <code>Grey</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Green, Yellow, Red, Grey
     *
     * @param health Describes the health status of the environment. AWS Elastic Beanstalk
     *         indicates the failure levels for a running environment: <enumValues>
     *         <value name="Red"> <p> <code>Red</code> : Indicates the environment is
     *         not working. </value> <value name="Yellow"> <p> <code>Yellow</code>:
     *         Indicates that something is wrong, the application might not be
     *         available, but the instances appear running. </value> <value
     *         name="Green"> <p> <code>Green</code>: Indicates the environment is
     *         healthy and fully functional. </value> </enumValues> <ul> <li>
     *         <code>Red</code>: Indicates the environment is not responsive. Occurs
     *         when three or more consecutive failures occur for an environment.
     *         </li> <li> <code>Yellow</code>: Indicates that something is wrong.
     *         Occurs when two consecutive failures occur for an environment. </li>
     *         <li> <code>Green</code>: Indicates the environment is healthy and
     *         fully functional. </li> <li> <code>Grey</code>: Default health for a
     *         new environment. The environment is not fully launched and health
     *         checks have not started or health checks are suspended during an
     *         <code>UpdateEnvironment</code> or <code>RestartEnvironement</code>
     *         request. </li> </ul> <p> Default: <code>Grey</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see EnvironmentHealth
     */
    public TerminateEnvironmentResult withHealth(String health) {
        this.health = health;
        return this;
    }
    
    
    /**
     * The description of the AWS resources used by this environment.
     *
     * @return The description of the AWS resources used by this environment.
     */
    public EnvironmentResourcesDescription getResources() {
        return resources;
    }
    
    /**
     * The description of the AWS resources used by this environment.
     *
     * @param resources The description of the AWS resources used by this environment.
     */
    public void setResources(EnvironmentResourcesDescription resources) {
        this.resources = resources;
    }
    
    /**
     * The description of the AWS resources used by this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resources The description of the AWS resources used by this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateEnvironmentResult withResources(EnvironmentResourcesDescription resources) {
        this.resources = resources;
        return this;
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
        sb.append("EnvironmentName: " + environmentName + ", ");
        sb.append("EnvironmentId: " + environmentId + ", ");
        sb.append("ApplicationName: " + applicationName + ", ");
        sb.append("VersionLabel: " + versionLabel + ", ");
        sb.append("SolutionStackName: " + solutionStackName + ", ");
        sb.append("TemplateName: " + templateName + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("EndpointURL: " + endpointURL + ", ");
        sb.append("CNAME: " + cNAME + ", ");
        sb.append("DateCreated: " + dateCreated + ", ");
        sb.append("DateUpdated: " + dateUpdated + ", ");
        sb.append("Status: " + status + ", ");
        sb.append("Health: " + health + ", ");
        sb.append("Resources: " + resources + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    