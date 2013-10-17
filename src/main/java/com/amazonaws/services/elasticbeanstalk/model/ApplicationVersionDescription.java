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
 * Describes the properties of an application version.
 * </p>
 */
public class ApplicationVersionDescription implements Serializable {

    /**
     * The name of the application associated with this release.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The description of this application version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * A label uniquely identifying the version for the associated
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * The location where the source bundle is located for this version.
     */
    private S3Location sourceBundle;

    /**
     * The creation date of the application version.
     */
    private java.util.Date dateCreated;

    /**
     * The last modified date of the application version.
     */
    private java.util.Date dateUpdated;

    /**
     * Default constructor for a new ApplicationVersionDescription object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ApplicationVersionDescription() {}
    
    /**
     * The name of the application associated with this release.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application associated with this release.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application associated with this release.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application associated with this release.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application associated with this release.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application associated with this release.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ApplicationVersionDescription withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * The description of this application version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return The description of this application version.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of this application version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description The description of this application version.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of this application version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description The description of this application version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ApplicationVersionDescription withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * A label uniquely identifying the version for the associated
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return A label uniquely identifying the version for the associated
     *         application.
     */
    public String getVersionLabel() {
        return versionLabel;
    }
    
    /**
     * A label uniquely identifying the version for the associated
     * application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel A label uniquely identifying the version for the associated
     *         application.
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }
    
    /**
     * A label uniquely identifying the version for the associated
     * application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel A label uniquely identifying the version for the associated
     *         application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ApplicationVersionDescription withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }

    /**
     * The location where the source bundle is located for this version.
     *
     * @return The location where the source bundle is located for this version.
     */
    public S3Location getSourceBundle() {
        return sourceBundle;
    }
    
    /**
     * The location where the source bundle is located for this version.
     *
     * @param sourceBundle The location where the source bundle is located for this version.
     */
    public void setSourceBundle(S3Location sourceBundle) {
        this.sourceBundle = sourceBundle;
    }
    
    /**
     * The location where the source bundle is located for this version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceBundle The location where the source bundle is located for this version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ApplicationVersionDescription withSourceBundle(S3Location sourceBundle) {
        this.sourceBundle = sourceBundle;
        return this;
    }

    /**
     * The creation date of the application version.
     *
     * @return The creation date of the application version.
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    
    /**
     * The creation date of the application version.
     *
     * @param dateCreated The creation date of the application version.
     */
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    /**
     * The creation date of the application version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dateCreated The creation date of the application version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ApplicationVersionDescription withDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * The last modified date of the application version.
     *
     * @return The last modified date of the application version.
     */
    public java.util.Date getDateUpdated() {
        return dateUpdated;
    }
    
    /**
     * The last modified date of the application version.
     *
     * @param dateUpdated The last modified date of the application version.
     */
    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
    
    /**
     * The last modified date of the application version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dateUpdated The last modified date of the application version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ApplicationVersionDescription withDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
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
        if (getVersionLabel() != null) sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getSourceBundle() != null) sb.append("SourceBundle: " + getSourceBundle() + ",");
        if (getDateCreated() != null) sb.append("DateCreated: " + getDateCreated() + ",");
        if (getDateUpdated() != null) sb.append("DateUpdated: " + getDateUpdated() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode()); 
        hashCode = prime * hashCode + ((getSourceBundle() == null) ? 0 : getSourceBundle().hashCode()); 
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode()); 
        hashCode = prime * hashCode + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ApplicationVersionDescription == false) return false;
        ApplicationVersionDescription other = (ApplicationVersionDescription)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null) return false;
        if (other.getVersionLabel() != null && other.getVersionLabel().equals(this.getVersionLabel()) == false) return false; 
        if (other.getSourceBundle() == null ^ this.getSourceBundle() == null) return false;
        if (other.getSourceBundle() != null && other.getSourceBundle().equals(this.getSourceBundle()) == false) return false; 
        if (other.getDateCreated() == null ^ this.getDateCreated() == null) return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false) return false; 
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null) return false;
        if (other.getDateUpdated() != null && other.getDateUpdated().equals(this.getDateUpdated()) == false) return false; 
        return true;
    }
    
}
    