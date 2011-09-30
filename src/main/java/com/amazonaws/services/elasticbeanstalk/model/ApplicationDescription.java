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
 * Describes the properties of an application.
 * </p>
 */
public class ApplicationDescription {

    /**
     * The name of the application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * User-defined description of the application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * The date when the application was created.
     */
    private java.util.Date dateCreated;

    /**
     * The date when the application was last modified.
     */
    private java.util.Date dateUpdated;

    /**
     * The names of the versions for this application.
     */
    private java.util.List<String> versions;

    /**
     * The names of the configuration templates associated with this
     * application.
     */
    private java.util.List<String> configurationTemplates;

    /**
     * Default constructor for a new ApplicationDescription object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ApplicationDescription() {}
    
    /**
     * The name of the application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplicationDescription withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    
    
    /**
     * User-defined description of the application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return User-defined description of the application.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * User-defined description of the application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description User-defined description of the application.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * User-defined description of the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description User-defined description of the application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplicationDescription withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * The date when the application was created.
     *
     * @return The date when the application was created.
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    
    /**
     * The date when the application was created.
     *
     * @param dateCreated The date when the application was created.
     */
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    /**
     * The date when the application was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dateCreated The date when the application was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplicationDescription withDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }
    
    
    /**
     * The date when the application was last modified.
     *
     * @return The date when the application was last modified.
     */
    public java.util.Date getDateUpdated() {
        return dateUpdated;
    }
    
    /**
     * The date when the application was last modified.
     *
     * @param dateUpdated The date when the application was last modified.
     */
    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
    
    /**
     * The date when the application was last modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dateUpdated The date when the application was last modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplicationDescription withDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }
    
    
    /**
     * The names of the versions for this application.
     *
     * @return The names of the versions for this application.
     */
    public java.util.List<String> getVersions() {
        
        if (versions == null) {
            versions = new java.util.ArrayList<String>();
        }
        return versions;
    }
    
    /**
     * The names of the versions for this application.
     *
     * @param versions The names of the versions for this application.
     */
    public void setVersions(java.util.Collection<String> versions) {
        java.util.List<String> versionsCopy = new java.util.ArrayList<String>();
        if (versions != null) {
            versionsCopy.addAll(versions);
        }
        this.versions = versionsCopy;
    }
    
    /**
     * The names of the versions for this application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versions The names of the versions for this application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplicationDescription withVersions(String... versions) {
        if (getVersions() == null) setVersions(new java.util.ArrayList<String>());
        for (String value : versions) {
            getVersions().add(value);
        }
        return this;
    }
    
    /**
     * The names of the versions for this application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versions The names of the versions for this application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplicationDescription withVersions(java.util.Collection<String> versions) {
        java.util.List<String> versionsCopy = new java.util.ArrayList<String>();
        if (versions != null) {
            versionsCopy.addAll(versions);
        }
        this.versions = versionsCopy;

        return this;
    }
    
    /**
     * The names of the configuration templates associated with this
     * application.
     *
     * @return The names of the configuration templates associated with this
     *         application.
     */
    public java.util.List<String> getConfigurationTemplates() {
        
        if (configurationTemplates == null) {
            configurationTemplates = new java.util.ArrayList<String>();
        }
        return configurationTemplates;
    }
    
    /**
     * The names of the configuration templates associated with this
     * application.
     *
     * @param configurationTemplates The names of the configuration templates associated with this
     *         application.
     */
    public void setConfigurationTemplates(java.util.Collection<String> configurationTemplates) {
        java.util.List<String> configurationTemplatesCopy = new java.util.ArrayList<String>();
        if (configurationTemplates != null) {
            configurationTemplatesCopy.addAll(configurationTemplates);
        }
        this.configurationTemplates = configurationTemplatesCopy;
    }
    
    /**
     * The names of the configuration templates associated with this
     * application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationTemplates The names of the configuration templates associated with this
     *         application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplicationDescription withConfigurationTemplates(String... configurationTemplates) {
        if (getConfigurationTemplates() == null) setConfigurationTemplates(new java.util.ArrayList<String>());
        for (String value : configurationTemplates) {
            getConfigurationTemplates().add(value);
        }
        return this;
    }
    
    /**
     * The names of the configuration templates associated with this
     * application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationTemplates The names of the configuration templates associated with this
     *         application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ApplicationDescription withConfigurationTemplates(java.util.Collection<String> configurationTemplates) {
        java.util.List<String> configurationTemplatesCopy = new java.util.ArrayList<String>();
        if (configurationTemplates != null) {
            configurationTemplatesCopy.addAll(configurationTemplates);
        }
        this.configurationTemplates = configurationTemplatesCopy;

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
        sb.append("ApplicationName: " + applicationName + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("DateCreated: " + dateCreated + ", ");
        sb.append("DateUpdated: " + dateUpdated + ", ");
        sb.append("Versions: " + versions + ", ");
        sb.append("ConfigurationTemplates: " + configurationTemplates + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    