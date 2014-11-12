/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Information about an application revision's location.
 * </p>
 */
public class RevisionLocation implements Serializable {

    /**
     * The application revision's type: <ul> <li>S3: An application revision
     * stored in Amazon S3.</li> <li>GitHub: An application revision stored
     * in GitHub.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, GitHub
     */
    private String revisionType;

    /**
     * Information about the location of application artifacts that are
     * stored in Amazon S3.
     */
    private S3Location s3Location;

    /**
     * Information about the location of application artifacts that are
     * stored in GitHub.
     */
    private GitHubLocation gitHubLocation;

    /**
     * The application revision's type: <ul> <li>S3: An application revision
     * stored in Amazon S3.</li> <li>GitHub: An application revision stored
     * in GitHub.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, GitHub
     *
     * @return The application revision's type: <ul> <li>S3: An application revision
     *         stored in Amazon S3.</li> <li>GitHub: An application revision stored
     *         in GitHub.</li> </ul>
     *
     * @see RevisionLocationType
     */
    public String getRevisionType() {
        return revisionType;
    }
    
    /**
     * The application revision's type: <ul> <li>S3: An application revision
     * stored in Amazon S3.</li> <li>GitHub: An application revision stored
     * in GitHub.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, GitHub
     *
     * @param revisionType The application revision's type: <ul> <li>S3: An application revision
     *         stored in Amazon S3.</li> <li>GitHub: An application revision stored
     *         in GitHub.</li> </ul>
     *
     * @see RevisionLocationType
     */
    public void setRevisionType(String revisionType) {
        this.revisionType = revisionType;
    }
    
    /**
     * The application revision's type: <ul> <li>S3: An application revision
     * stored in Amazon S3.</li> <li>GitHub: An application revision stored
     * in GitHub.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, GitHub
     *
     * @param revisionType The application revision's type: <ul> <li>S3: An application revision
     *         stored in Amazon S3.</li> <li>GitHub: An application revision stored
     *         in GitHub.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RevisionLocationType
     */
    public RevisionLocation withRevisionType(String revisionType) {
        this.revisionType = revisionType;
        return this;
    }

    /**
     * The application revision's type: <ul> <li>S3: An application revision
     * stored in Amazon S3.</li> <li>GitHub: An application revision stored
     * in GitHub.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, GitHub
     *
     * @param revisionType The application revision's type: <ul> <li>S3: An application revision
     *         stored in Amazon S3.</li> <li>GitHub: An application revision stored
     *         in GitHub.</li> </ul>
     *
     * @see RevisionLocationType
     */
    public void setRevisionType(RevisionLocationType revisionType) {
        this.revisionType = revisionType.toString();
    }
    
    /**
     * The application revision's type: <ul> <li>S3: An application revision
     * stored in Amazon S3.</li> <li>GitHub: An application revision stored
     * in GitHub.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3, GitHub
     *
     * @param revisionType The application revision's type: <ul> <li>S3: An application revision
     *         stored in Amazon S3.</li> <li>GitHub: An application revision stored
     *         in GitHub.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RevisionLocationType
     */
    public RevisionLocation withRevisionType(RevisionLocationType revisionType) {
        this.revisionType = revisionType.toString();
        return this;
    }

    /**
     * Information about the location of application artifacts that are
     * stored in Amazon S3.
     *
     * @return Information about the location of application artifacts that are
     *         stored in Amazon S3.
     */
    public S3Location getS3Location() {
        return s3Location;
    }
    
    /**
     * Information about the location of application artifacts that are
     * stored in Amazon S3.
     *
     * @param s3Location Information about the location of application artifacts that are
     *         stored in Amazon S3.
     */
    public void setS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
    }
    
    /**
     * Information about the location of application artifacts that are
     * stored in Amazon S3.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3Location Information about the location of application artifacts that are
     *         stored in Amazon S3.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RevisionLocation withS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
        return this;
    }

    /**
     * Information about the location of application artifacts that are
     * stored in GitHub.
     *
     * @return Information about the location of application artifacts that are
     *         stored in GitHub.
     */
    public GitHubLocation getGitHubLocation() {
        return gitHubLocation;
    }
    
    /**
     * Information about the location of application artifacts that are
     * stored in GitHub.
     *
     * @param gitHubLocation Information about the location of application artifacts that are
     *         stored in GitHub.
     */
    public void setGitHubLocation(GitHubLocation gitHubLocation) {
        this.gitHubLocation = gitHubLocation;
    }
    
    /**
     * Information about the location of application artifacts that are
     * stored in GitHub.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param gitHubLocation Information about the location of application artifacts that are
     *         stored in GitHub.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RevisionLocation withGitHubLocation(GitHubLocation gitHubLocation) {
        this.gitHubLocation = gitHubLocation;
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
        if (getRevisionType() != null) sb.append("RevisionType: " + getRevisionType() + ",");
        if (getS3Location() != null) sb.append("S3Location: " + getS3Location() + ",");
        if (getGitHubLocation() != null) sb.append("GitHubLocation: " + getGitHubLocation() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRevisionType() == null) ? 0 : getRevisionType().hashCode()); 
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode()); 
        hashCode = prime * hashCode + ((getGitHubLocation() == null) ? 0 : getGitHubLocation().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RevisionLocation == false) return false;
        RevisionLocation other = (RevisionLocation)obj;
        
        if (other.getRevisionType() == null ^ this.getRevisionType() == null) return false;
        if (other.getRevisionType() != null && other.getRevisionType().equals(this.getRevisionType()) == false) return false; 
        if (other.getS3Location() == null ^ this.getS3Location() == null) return false;
        if (other.getS3Location() != null && other.getS3Location().equals(this.getS3Location()) == false) return false; 
        if (other.getGitHubLocation() == null ^ this.getGitHubLocation() == null) return false;
        if (other.getGitHubLocation() != null && other.getGitHubLocation().equals(this.getGitHubLocation()) == false) return false; 
        return true;
    }
    
}
    