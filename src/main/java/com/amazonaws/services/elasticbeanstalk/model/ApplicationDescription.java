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


/**
 * <p>
 * Describes the properties of an application.
 * </p>
 */
public class ApplicationDescription implements Serializable {

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
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> versions;

    /**
     * The names of the configuration templates associated with this
     * application.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> configurationTemplates;

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
              versions = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              versions.setAutoConstruct(true);
        }
        return versions;
    }
    
    /**
     * The names of the versions for this application.
     *
     * @param versions The names of the versions for this application.
     */
    public void setVersions(java.util.Collection<String> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> versionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(versions.size());
        versionsCopy.addAll(versions);
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
        if (getVersions() == null) setVersions(new java.util.ArrayList<String>(versions.length));
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
        if (versions == null) {
            this.versions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> versionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(versions.size());
            versionsCopy.addAll(versions);
            this.versions = versionsCopy;
        }

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
              configurationTemplates = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              configurationTemplates.setAutoConstruct(true);
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
        if (configurationTemplates == null) {
            this.configurationTemplates = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> configurationTemplatesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(configurationTemplates.size());
        configurationTemplatesCopy.addAll(configurationTemplates);
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
        if (getConfigurationTemplates() == null) setConfigurationTemplates(new java.util.ArrayList<String>(configurationTemplates.length));
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
        if (configurationTemplates == null) {
            this.configurationTemplates = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> configurationTemplatesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(configurationTemplates.size());
            configurationTemplatesCopy.addAll(configurationTemplates);
            this.configurationTemplates = configurationTemplatesCopy;
        }

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
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getDateCreated() != null) sb.append("DateCreated: " + getDateCreated() + ",");
        if (getDateUpdated() != null) sb.append("DateUpdated: " + getDateUpdated() + ",");
        if (getVersions() != null) sb.append("Versions: " + getVersions() + ",");
        if (getConfigurationTemplates() != null) sb.append("ConfigurationTemplates: " + getConfigurationTemplates() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode()); 
        hashCode = prime * hashCode + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode()); 
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode()); 
        hashCode = prime * hashCode + ((getConfigurationTemplates() == null) ? 0 : getConfigurationTemplates().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ApplicationDescription == false) return false;
        ApplicationDescription other = (ApplicationDescription)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getDateCreated() == null ^ this.getDateCreated() == null) return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false) return false; 
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null) return false;
        if (other.getDateUpdated() != null && other.getDateUpdated().equals(this.getDateUpdated()) == false) return false; 
        if (other.getVersions() == null ^ this.getVersions() == null) return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false) return false; 
        if (other.getConfigurationTemplates() == null ^ this.getConfigurationTemplates() == null) return false;
        if (other.getConfigurationTemplates() != null && other.getConfigurationTemplates().equals(this.getConfigurationTemplates()) == false) return false; 
        return true;
    }
    
}
    